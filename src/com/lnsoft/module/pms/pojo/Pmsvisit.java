package com.lnsoft.module.pms.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Pmsvisit {
    private String requestpath;

    private Date starttime;

    private String iphost;

    private Date endtime;

    private BigDecimal requestcount;

    private BigDecimal status;

    private String executetime;

    public String getRequestpath() {
        return requestpath;
    }

    public void setRequestpath(String requestpath) {
        this.requestpath = requestpath == null ? null : requestpath.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public String getIphost() {
        return iphost;
    }

    public void setIphost(String iphost) {
        this.iphost = iphost == null ? null : iphost.trim();
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public BigDecimal getRequestcount() {
        return requestcount;
    }

    public void setRequestcount(BigDecimal requestcount) {
        this.requestcount = requestcount;
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public String getExecutetime() {
        return executetime;
    }

    public void setExecutetime(String executetime) {
        this.executetime = executetime == null ? null : executetime.trim();
    }
}