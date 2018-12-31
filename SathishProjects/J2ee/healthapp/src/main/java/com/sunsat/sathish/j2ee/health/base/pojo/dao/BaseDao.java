package com.sunsat.sathish.j2ee.health.base.pojo.dao;

import com.sunsat.sathish.j2ee.health.base.pojo.business.BaseBusiness;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by sathishkumar_su on 2/24/2018.
 */
public interface BaseDao<BB extends BaseBusiness> extends Serializable,Cloneable {

    public Class<BaseDao> getType();

    public Long getPrimarykeyId();
    public void setPrimarykeyId(Long primarykeyId);

    public Long getCreatedById();
    public void setCreatedById(Long createdById);

    public Long getModifiedById();
    public void setModifiedById(Long modifiedById);

    public Date getCreatedByDate();
    public void setCreatedByDate(Date createdByDate);

    public Date getModifiedByDate();
    public void setModifiedByDate(Date modifiedByDate);

    public boolean isDeleted();
    public void setIsDeleted(Boolean deleted);

    public String getMessage();
    public void setMessage(String message);

    public BB getBusinessValue();
    public void setBusinessValue(BB businessValue);

}