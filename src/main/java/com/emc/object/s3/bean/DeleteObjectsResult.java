/*
 * Copyright (c) 2015 EMC Corporation
 * All Rights Reserved
 */
package com.emc.object.s3.bean;

import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "DeleteResult")
public class DeleteObjectsResult {
    private List<AbstractDeleteResult> results = new ArrayList<>();

    @XmlElementRefs({@XmlElementRef(type = DeleteSuccess.class), @XmlElementRef(type = DeleteError.class)})
    public List<AbstractDeleteResult> getResults() {
        return results;
    }

    public void setResults(List<AbstractDeleteResult> results) {
        this.results = results;
    }
}
