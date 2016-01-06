package com.spring.boot.example.main.model;

/**
 * Created by bangae1 on 2016-01-06.
 */
import javax.persistence.*;

public class Table {
    private String tname;
    private String tabtype;
    private String clusterid;

    public Table() {
    }

    public Table(String tname, String tabtype, String clusterid) {
        this.tname = tname;
        this.tabtype = tabtype;
        this.clusterid = clusterid;
    }

    public String getTname() {

        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTabtype() {
        return tabtype;
    }

    public void setTabtype(String tabtype) {
        this.tabtype = tabtype;
    }

    public String getClusterid() {
        return clusterid;
    }

    public void setClusterid(String clusterid) {
        this.clusterid = clusterid;
    }
}