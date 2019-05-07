package com.lnsoft.module.sbdzxjc.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CmstTransfdeviceExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CMST_TRANSFDEVICE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CMST_TRANSFDEVICE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CMST_TRANSFDEVICE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_TRANSFDEVICE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    public CmstTransfdeviceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_TRANSFDEVICE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_TRANSFDEVICE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_TRANSFDEVICE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_TRANSFDEVICE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_TRANSFDEVICE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_TRANSFDEVICE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_TRANSFDEVICE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_TRANSFDEVICE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_TRANSFDEVICE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_TRANSFDEVICE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table CMST_TRANSFDEVICE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andObjIdIsNull() {
            addCriterion("OBJ_ID is null");
            return (Criteria) this;
        }

        public Criteria andObjIdIsNotNull() {
            addCriterion("OBJ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andObjIdEqualTo(String value) {
            addCriterion("OBJ_ID =", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdNotEqualTo(String value) {
            addCriterion("OBJ_ID <>", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdGreaterThan(String value) {
            addCriterion("OBJ_ID >", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdGreaterThanOrEqualTo(String value) {
            addCriterion("OBJ_ID >=", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdLessThan(String value) {
            addCriterion("OBJ_ID <", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdLessThanOrEqualTo(String value) {
            addCriterion("OBJ_ID <=", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdLike(String value) {
            addCriterion("OBJ_ID like", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdNotLike(String value) {
            addCriterion("OBJ_ID not like", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdIn(List<String> values) {
            addCriterion("OBJ_ID in", values, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdNotIn(List<String> values) {
            addCriterion("OBJ_ID not in", values, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdBetween(String value1, String value2) {
            addCriterion("OBJ_ID between", value1, value2, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdNotBetween(String value1, String value2) {
            addCriterion("OBJ_ID not between", value1, value2, "objId");
            return (Criteria) this;
        }

        public Criteria andObjDispidxIsNull() {
            addCriterion("OBJ_DISPIDX is null");
            return (Criteria) this;
        }

        public Criteria andObjDispidxIsNotNull() {
            addCriterion("OBJ_DISPIDX is not null");
            return (Criteria) this;
        }

        public Criteria andObjDispidxEqualTo(BigDecimal value) {
            addCriterion("OBJ_DISPIDX =", value, "objDispidx");
            return (Criteria) this;
        }

        public Criteria andObjDispidxNotEqualTo(BigDecimal value) {
            addCriterion("OBJ_DISPIDX <>", value, "objDispidx");
            return (Criteria) this;
        }

        public Criteria andObjDispidxGreaterThan(BigDecimal value) {
            addCriterion("OBJ_DISPIDX >", value, "objDispidx");
            return (Criteria) this;
        }

        public Criteria andObjDispidxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OBJ_DISPIDX >=", value, "objDispidx");
            return (Criteria) this;
        }

        public Criteria andObjDispidxLessThan(BigDecimal value) {
            addCriterion("OBJ_DISPIDX <", value, "objDispidx");
            return (Criteria) this;
        }

        public Criteria andObjDispidxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OBJ_DISPIDX <=", value, "objDispidx");
            return (Criteria) this;
        }

        public Criteria andObjDispidxIn(List<BigDecimal> values) {
            addCriterion("OBJ_DISPIDX in", values, "objDispidx");
            return (Criteria) this;
        }

        public Criteria andObjDispidxNotIn(List<BigDecimal> values) {
            addCriterion("OBJ_DISPIDX not in", values, "objDispidx");
            return (Criteria) this;
        }

        public Criteria andObjDispidxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OBJ_DISPIDX between", value1, value2, "objDispidx");
            return (Criteria) this;
        }

        public Criteria andObjDispidxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OBJ_DISPIDX not between", value1, value2, "objDispidx");
            return (Criteria) this;
        }

        public Criteria andPhaseIsNull() {
            addCriterion("PHASE is null");
            return (Criteria) this;
        }

        public Criteria andPhaseIsNotNull() {
            addCriterion("PHASE is not null");
            return (Criteria) this;
        }

        public Criteria andPhaseEqualTo(String value) {
            addCriterion("PHASE =", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseNotEqualTo(String value) {
            addCriterion("PHASE <>", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseGreaterThan(String value) {
            addCriterion("PHASE >", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseGreaterThanOrEqualTo(String value) {
            addCriterion("PHASE >=", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseLessThan(String value) {
            addCriterion("PHASE <", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseLessThanOrEqualTo(String value) {
            addCriterion("PHASE <=", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseLike(String value) {
            addCriterion("PHASE like", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseNotLike(String value) {
            addCriterion("PHASE not like", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseIn(List<String> values) {
            addCriterion("PHASE in", values, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseNotIn(List<String> values) {
            addCriterion("PHASE not in", values, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseBetween(String value1, String value2) {
            addCriterion("PHASE between", value1, value2, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseNotBetween(String value1, String value2) {
            addCriterion("PHASE not between", value1, value2, "phase");
            return (Criteria) this;
        }

        public Criteria andDevicecodeIsNull() {
            addCriterion("DEVICECODE is null");
            return (Criteria) this;
        }

        public Criteria andDevicecodeIsNotNull() {
            addCriterion("DEVICECODE is not null");
            return (Criteria) this;
        }

        public Criteria andDevicecodeEqualTo(String value) {
            addCriterion("DEVICECODE =", value, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeNotEqualTo(String value) {
            addCriterion("DEVICECODE <>", value, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeGreaterThan(String value) {
            addCriterion("DEVICECODE >", value, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICECODE >=", value, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeLessThan(String value) {
            addCriterion("DEVICECODE <", value, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeLessThanOrEqualTo(String value) {
            addCriterion("DEVICECODE <=", value, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeLike(String value) {
            addCriterion("DEVICECODE like", value, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeNotLike(String value) {
            addCriterion("DEVICECODE not like", value, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeIn(List<String> values) {
            addCriterion("DEVICECODE in", values, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeNotIn(List<String> values) {
            addCriterion("DEVICECODE not in", values, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeBetween(String value1, String value2) {
            addCriterion("DEVICECODE between", value1, value2, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeNotBetween(String value1, String value2) {
            addCriterion("DEVICECODE not between", value1, value2, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicenameIsNull() {
            addCriterion("DEVICENAME is null");
            return (Criteria) this;
        }

        public Criteria andDevicenameIsNotNull() {
            addCriterion("DEVICENAME is not null");
            return (Criteria) this;
        }

        public Criteria andDevicenameEqualTo(String value) {
            addCriterion("DEVICENAME =", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameNotEqualTo(String value) {
            addCriterion("DEVICENAME <>", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameGreaterThan(String value) {
            addCriterion("DEVICENAME >", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICENAME >=", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameLessThan(String value) {
            addCriterion("DEVICENAME <", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameLessThanOrEqualTo(String value) {
            addCriterion("DEVICENAME <=", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameLike(String value) {
            addCriterion("DEVICENAME like", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameNotLike(String value) {
            addCriterion("DEVICENAME not like", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameIn(List<String> values) {
            addCriterion("DEVICENAME in", values, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameNotIn(List<String> values) {
            addCriterion("DEVICENAME not in", values, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameBetween(String value1, String value2) {
            addCriterion("DEVICENAME between", value1, value2, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameNotBetween(String value1, String value2) {
            addCriterion("DEVICENAME not between", value1, value2, "devicename");
            return (Criteria) this;
        }

        public Criteria andMainidIsNull() {
            addCriterion("MAINID is null");
            return (Criteria) this;
        }

        public Criteria andMainidIsNotNull() {
            addCriterion("MAINID is not null");
            return (Criteria) this;
        }

        public Criteria andMainidEqualTo(String value) {
            addCriterion("MAINID =", value, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidNotEqualTo(String value) {
            addCriterion("MAINID <>", value, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidGreaterThan(String value) {
            addCriterion("MAINID >", value, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidGreaterThanOrEqualTo(String value) {
            addCriterion("MAINID >=", value, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidLessThan(String value) {
            addCriterion("MAINID <", value, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidLessThanOrEqualTo(String value) {
            addCriterion("MAINID <=", value, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidLike(String value) {
            addCriterion("MAINID like", value, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidNotLike(String value) {
            addCriterion("MAINID not like", value, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidIn(List<String> values) {
            addCriterion("MAINID in", values, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidNotIn(List<String> values) {
            addCriterion("MAINID not in", values, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidBetween(String value1, String value2) {
            addCriterion("MAINID between", value1, value2, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidNotBetween(String value1, String value2) {
            addCriterion("MAINID not between", value1, value2, "mainid");
            return (Criteria) this;
        }

        public Criteria andIsactivatedIsNull() {
            addCriterion("ISACTIVATED is null");
            return (Criteria) this;
        }

        public Criteria andIsactivatedIsNotNull() {
            addCriterion("ISACTIVATED is not null");
            return (Criteria) this;
        }

        public Criteria andIsactivatedEqualTo(String value) {
            addCriterion("ISACTIVATED =", value, "isactivated");
            return (Criteria) this;
        }

        public Criteria andIsactivatedNotEqualTo(String value) {
            addCriterion("ISACTIVATED <>", value, "isactivated");
            return (Criteria) this;
        }

        public Criteria andIsactivatedGreaterThan(String value) {
            addCriterion("ISACTIVATED >", value, "isactivated");
            return (Criteria) this;
        }

        public Criteria andIsactivatedGreaterThanOrEqualTo(String value) {
            addCriterion("ISACTIVATED >=", value, "isactivated");
            return (Criteria) this;
        }

        public Criteria andIsactivatedLessThan(String value) {
            addCriterion("ISACTIVATED <", value, "isactivated");
            return (Criteria) this;
        }

        public Criteria andIsactivatedLessThanOrEqualTo(String value) {
            addCriterion("ISACTIVATED <=", value, "isactivated");
            return (Criteria) this;
        }

        public Criteria andIsactivatedLike(String value) {
            addCriterion("ISACTIVATED like", value, "isactivated");
            return (Criteria) this;
        }

        public Criteria andIsactivatedNotLike(String value) {
            addCriterion("ISACTIVATED not like", value, "isactivated");
            return (Criteria) this;
        }

        public Criteria andIsactivatedIn(List<String> values) {
            addCriterion("ISACTIVATED in", values, "isactivated");
            return (Criteria) this;
        }

        public Criteria andIsactivatedNotIn(List<String> values) {
            addCriterion("ISACTIVATED not in", values, "isactivated");
            return (Criteria) this;
        }

        public Criteria andIsactivatedBetween(String value1, String value2) {
            addCriterion("ISACTIVATED between", value1, value2, "isactivated");
            return (Criteria) this;
        }

        public Criteria andIsactivatedNotBetween(String value1, String value2) {
            addCriterion("ISACTIVATED not between", value1, value2, "isactivated");
            return (Criteria) this;
        }

        public Criteria andMonitoringtypesIsNull() {
            addCriterion("MONITORINGTYPES is null");
            return (Criteria) this;
        }

        public Criteria andMonitoringtypesIsNotNull() {
            addCriterion("MONITORINGTYPES is not null");
            return (Criteria) this;
        }

        public Criteria andMonitoringtypesEqualTo(String value) {
            addCriterion("MONITORINGTYPES =", value, "monitoringtypes");
            return (Criteria) this;
        }

        public Criteria andMonitoringtypesNotEqualTo(String value) {
            addCriterion("MONITORINGTYPES <>", value, "monitoringtypes");
            return (Criteria) this;
        }

        public Criteria andMonitoringtypesGreaterThan(String value) {
            addCriterion("MONITORINGTYPES >", value, "monitoringtypes");
            return (Criteria) this;
        }

        public Criteria andMonitoringtypesGreaterThanOrEqualTo(String value) {
            addCriterion("MONITORINGTYPES >=", value, "monitoringtypes");
            return (Criteria) this;
        }

        public Criteria andMonitoringtypesLessThan(String value) {
            addCriterion("MONITORINGTYPES <", value, "monitoringtypes");
            return (Criteria) this;
        }

        public Criteria andMonitoringtypesLessThanOrEqualTo(String value) {
            addCriterion("MONITORINGTYPES <=", value, "monitoringtypes");
            return (Criteria) this;
        }

        public Criteria andMonitoringtypesLike(String value) {
            addCriterion("MONITORINGTYPES like", value, "monitoringtypes");
            return (Criteria) this;
        }

        public Criteria andMonitoringtypesNotLike(String value) {
            addCriterion("MONITORINGTYPES not like", value, "monitoringtypes");
            return (Criteria) this;
        }

        public Criteria andMonitoringtypesIn(List<String> values) {
            addCriterion("MONITORINGTYPES in", values, "monitoringtypes");
            return (Criteria) this;
        }

        public Criteria andMonitoringtypesNotIn(List<String> values) {
            addCriterion("MONITORINGTYPES not in", values, "monitoringtypes");
            return (Criteria) this;
        }

        public Criteria andMonitoringtypesBetween(String value1, String value2) {
            addCriterion("MONITORINGTYPES between", value1, value2, "monitoringtypes");
            return (Criteria) this;
        }

        public Criteria andMonitoringtypesNotBetween(String value1, String value2) {
            addCriterion("MONITORINGTYPES not between", value1, value2, "monitoringtypes");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("REMARKS =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("REMARKS <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("REMARKS >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("REMARKS <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("REMARKS <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("REMARKS like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("REMARKS not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("REMARKS in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("REMARKS not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("REMARKS between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("REMARKS not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andDevicetypeIsNull() {
            addCriterion("DEVICETYPE is null");
            return (Criteria) this;
        }

        public Criteria andDevicetypeIsNotNull() {
            addCriterion("DEVICETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDevicetypeEqualTo(String value) {
            addCriterion("DEVICETYPE =", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNotEqualTo(String value) {
            addCriterion("DEVICETYPE <>", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeGreaterThan(String value) {
            addCriterion("DEVICETYPE >", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICETYPE >=", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeLessThan(String value) {
            addCriterion("DEVICETYPE <", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeLessThanOrEqualTo(String value) {
            addCriterion("DEVICETYPE <=", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeLike(String value) {
            addCriterion("DEVICETYPE like", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNotLike(String value) {
            addCriterion("DEVICETYPE not like", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeIn(List<String> values) {
            addCriterion("DEVICETYPE in", values, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNotIn(List<String> values) {
            addCriterion("DEVICETYPE not in", values, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeBetween(String value1, String value2) {
            addCriterion("DEVICETYPE between", value1, value2, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNotBetween(String value1, String value2) {
            addCriterion("DEVICETYPE not between", value1, value2, "devicetype");
            return (Criteria) this;
        }

        public Criteria andPhysicdeviceIsNull() {
            addCriterion("PHYSICDEVICE is null");
            return (Criteria) this;
        }

        public Criteria andPhysicdeviceIsNotNull() {
            addCriterion("PHYSICDEVICE is not null");
            return (Criteria) this;
        }

        public Criteria andPhysicdeviceEqualTo(String value) {
            addCriterion("PHYSICDEVICE =", value, "physicdevice");
            return (Criteria) this;
        }

        public Criteria andPhysicdeviceNotEqualTo(String value) {
            addCriterion("PHYSICDEVICE <>", value, "physicdevice");
            return (Criteria) this;
        }

        public Criteria andPhysicdeviceGreaterThan(String value) {
            addCriterion("PHYSICDEVICE >", value, "physicdevice");
            return (Criteria) this;
        }

        public Criteria andPhysicdeviceGreaterThanOrEqualTo(String value) {
            addCriterion("PHYSICDEVICE >=", value, "physicdevice");
            return (Criteria) this;
        }

        public Criteria andPhysicdeviceLessThan(String value) {
            addCriterion("PHYSICDEVICE <", value, "physicdevice");
            return (Criteria) this;
        }

        public Criteria andPhysicdeviceLessThanOrEqualTo(String value) {
            addCriterion("PHYSICDEVICE <=", value, "physicdevice");
            return (Criteria) this;
        }

        public Criteria andPhysicdeviceLike(String value) {
            addCriterion("PHYSICDEVICE like", value, "physicdevice");
            return (Criteria) this;
        }

        public Criteria andPhysicdeviceNotLike(String value) {
            addCriterion("PHYSICDEVICE not like", value, "physicdevice");
            return (Criteria) this;
        }

        public Criteria andPhysicdeviceIn(List<String> values) {
            addCriterion("PHYSICDEVICE in", values, "physicdevice");
            return (Criteria) this;
        }

        public Criteria andPhysicdeviceNotIn(List<String> values) {
            addCriterion("PHYSICDEVICE not in", values, "physicdevice");
            return (Criteria) this;
        }

        public Criteria andPhysicdeviceBetween(String value1, String value2) {
            addCriterion("PHYSICDEVICE between", value1, value2, "physicdevice");
            return (Criteria) this;
        }

        public Criteria andPhysicdeviceNotBetween(String value1, String value2) {
            addCriterion("PHYSICDEVICE not between", value1, value2, "physicdevice");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table CMST_TRANSFDEVICE
     *
     * @mbggenerated do_not_delete_during_merge Fri Nov 16 16:17:43 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table CMST_TRANSFDEVICE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}