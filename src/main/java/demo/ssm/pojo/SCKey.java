package demo.ssm.pojo;

public class SCKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sc.s_no
     *
     * @mbggenerated Sat Nov 26 00:22:11 CST 2022
     */
    private String sNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sc.c_id
     *
     * @mbggenerated Sat Nov 26 00:22:11 CST 2022
     */
    private String cId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sc.s_no
     *
     * @return the value of sc.s_no
     *
     * @mbggenerated Sat Nov 26 00:22:11 CST 2022
     */
    public String getsNo() {
        return sNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sc.s_no
     *
     * @param sNo the value for sc.s_no
     *
     * @mbggenerated Sat Nov 26 00:22:11 CST 2022
     */
    public void setsNo(String sNo) {
        this.sNo = sNo == null ? null : sNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sc.c_id
     *
     * @return the value of sc.c_id
     *
     * @mbggenerated Sat Nov 26 00:22:11 CST 2022
     */
    public String getcId() {
        return cId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sc.c_id
     *
     * @param cId the value for sc.c_id
     *
     * @mbggenerated Sat Nov 26 00:22:11 CST 2022
     */
    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }
}