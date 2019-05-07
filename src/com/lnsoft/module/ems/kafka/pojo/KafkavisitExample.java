package com.lnsoft.module.ems.kafka.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class KafkavisitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KafkavisitExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andRequestpathIsNull() {
            addCriterion("REQUESTPATH is null");
            return (Criteria) this;
        }

        public Criteria andRequestpathIsNotNull() {
            addCriterion("REQUESTPATH is not null");
            return (Criteria) this;
        }

        public Criteria andRequestpathEqualTo(String value) {
            addCriterion("REQUESTPATH =", value, "requestpath");
            return (Criteria) this;
        }

        public Criteria andRequestpathNotEqualTo(String value) {
            addCriterion("REQUESTPATH <>", value, "requestpath");
            return (Criteria) this;
        }

        public Criteria andRequestpathGreaterThan(String value) {
            addCriterion("REQUESTPATH >", value, "requestpath");
            return (Criteria) this;
        }

        public Criteria andRequestpathGreaterThanOrEqualTo(String value) {
            addCriterion("REQUESTPATH >=", value, "requestpath");
            return (Criteria) this;
        }

        public Criteria andRequestpathLessThan(String value) {
            addCriterion("REQUESTPATH <", value, "requestpath");
            return (Criteria) this;
        }

        public Criteria andRequestpathLessThanOrEqualTo(String value) {
            addCriterion("REQUESTPATH <=", value, "requestpath");
            return (Criteria) this;
        }

        public Criteria andRequestpathLike(String value) {
            addCriterion("REQUESTPATH like", value, "requestpath");
            return (Criteria) this;
        }

        public Criteria andRequestpathNotLike(String value) {
            addCriterion("REQUESTPATH not like", value, "requestpath");
            return (Criteria) this;
        }

        public Criteria andRequestpathIn(List<String> values) {
            addCriterion("REQUESTPATH in", values, "requestpath");
            return (Criteria) this;
        }

        public Criteria andRequestpathNotIn(List<String> values) {
            addCriterion("REQUESTPATH not in", values, "requestpath");
            return (Criteria) this;
        }

        public Criteria andRequestpathBetween(String value1, String value2) {
            addCriterion("REQUESTPATH between", value1, value2, "requestpath");
            return (Criteria) this;
        }

        public Criteria andRequestpathNotBetween(String value1, String value2) {
            addCriterion("REQUESTPATH not between", value1, value2, "requestpath");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("STARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("STARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterionForJDBCDate("STARTTIME =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("STARTTIME <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("STARTTIME >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STARTTIME >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterionForJDBCDate("STARTTIME <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STARTTIME <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterionForJDBCDate("STARTTIME in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("STARTTIME not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STARTTIME between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STARTTIME not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andIphostIsNull() {
            addCriterion("IPHOST is null");
            return (Criteria) this;
        }

        public Criteria andIphostIsNotNull() {
            addCriterion("IPHOST is not null");
            return (Criteria) this;
        }

        public Criteria andIphostEqualTo(String value) {
            addCriterion("IPHOST =", value, "iphost");
            return (Criteria) this;
        }

        public Criteria andIphostNotEqualTo(String value) {
            addCriterion("IPHOST <>", value, "iphost");
            return (Criteria) this;
        }

        public Criteria andIphostGreaterThan(String value) {
            addCriterion("IPHOST >", value, "iphost");
            return (Criteria) this;
        }

        public Criteria andIphostGreaterThanOrEqualTo(String value) {
            addCriterion("IPHOST >=", value, "iphost");
            return (Criteria) this;
        }

        public Criteria andIphostLessThan(String value) {
            addCriterion("IPHOST <", value, "iphost");
            return (Criteria) this;
        }

        public Criteria andIphostLessThanOrEqualTo(String value) {
            addCriterion("IPHOST <=", value, "iphost");
            return (Criteria) this;
        }

        public Criteria andIphostLike(String value) {
            addCriterion("IPHOST like", value, "iphost");
            return (Criteria) this;
        }

        public Criteria andIphostNotLike(String value) {
            addCriterion("IPHOST not like", value, "iphost");
            return (Criteria) this;
        }

        public Criteria andIphostIn(List<String> values) {
            addCriterion("IPHOST in", values, "iphost");
            return (Criteria) this;
        }

        public Criteria andIphostNotIn(List<String> values) {
            addCriterion("IPHOST not in", values, "iphost");
            return (Criteria) this;
        }

        public Criteria andIphostBetween(String value1, String value2) {
            addCriterion("IPHOST between", value1, value2, "iphost");
            return (Criteria) this;
        }

        public Criteria andIphostNotBetween(String value1, String value2) {
            addCriterion("IPHOST not between", value1, value2, "iphost");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("ENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("ENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterionForJDBCDate("ENDTIME =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ENDTIME <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ENDTIME >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENDTIME >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterionForJDBCDate("ENDTIME <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENDTIME <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterionForJDBCDate("ENDTIME in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ENDTIME not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENDTIME between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENDTIME not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andRequestcountIsNull() {
            addCriterion("REQUESTCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRequestcountIsNotNull() {
            addCriterion("REQUESTCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRequestcountEqualTo(BigDecimal value) {
            addCriterion("REQUESTCOUNT =", value, "requestcount");
            return (Criteria) this;
        }

        public Criteria andRequestcountNotEqualTo(BigDecimal value) {
            addCriterion("REQUESTCOUNT <>", value, "requestcount");
            return (Criteria) this;
        }

        public Criteria andRequestcountGreaterThan(BigDecimal value) {
            addCriterion("REQUESTCOUNT >", value, "requestcount");
            return (Criteria) this;
        }

        public Criteria andRequestcountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REQUESTCOUNT >=", value, "requestcount");
            return (Criteria) this;
        }

        public Criteria andRequestcountLessThan(BigDecimal value) {
            addCriterion("REQUESTCOUNT <", value, "requestcount");
            return (Criteria) this;
        }

        public Criteria andRequestcountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REQUESTCOUNT <=", value, "requestcount");
            return (Criteria) this;
        }

        public Criteria andRequestcountIn(List<BigDecimal> values) {
            addCriterion("REQUESTCOUNT in", values, "requestcount");
            return (Criteria) this;
        }

        public Criteria andRequestcountNotIn(List<BigDecimal> values) {
            addCriterion("REQUESTCOUNT not in", values, "requestcount");
            return (Criteria) this;
        }

        public Criteria andRequestcountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REQUESTCOUNT between", value1, value2, "requestcount");
            return (Criteria) this;
        }

        public Criteria andRequestcountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REQUESTCOUNT not between", value1, value2, "requestcount");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(BigDecimal value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(BigDecimal value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(BigDecimal value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(BigDecimal value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<BigDecimal> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<BigDecimal> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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