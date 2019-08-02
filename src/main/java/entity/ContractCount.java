package entity;

import java.io.Serializable;

public class ContractCount  implements Serializable {
    private int id;//外键参照ContractModel
    private String contractId;//合同编号
    private String contractName;//合同名称
    private String createTime;//创建时间
    private int contractTypeId;//合同类型
    private int userId;//用户账号
    private int zheKou;//折扣
    private String partyA;//甲方
    private double contractCost;//合同金额
    private int contractModelId;//合同模板ID
    private int cityId;
    private String salesman;//业务员
    private String checkState;//审核情况
    private String louCeng;//审核情况
    private String zhuGuan;//审核情况
    private String keHu;//审核情况
    private String xueYuan;//审核情况
    private String zhuangTai;//审核情况
    private String cpuXingHao;//审核情况
    private String cpuKeShu;//审核情况
    private String teShuPeiJian;//审核情况
    private String fangAnJia;//审核情况
    private String xiaDanTime;//审核情况
    private String xiaDanZhouQi;//审核情况

    public ContractCount() {
        super();
    }

    public ContractCount(int id, String contractId, String contractName, String createTime, int contractTypeId,
                         int userId, int zheKou, String partyA, double contractCost, int contractModelId, int cityId,
                         String salesman, String checkState, String louCeng, String zhuGuan, String keHu, String xueYuan,
                         String zhuangTai, String cpuXingHao, String cpuKeShu, String teShuPeiJian, String fangAnJia,
                         String xiaDanTime, String xiaDanZhouQi) {
        super();


        this.id = id;
        this.contractId = contractId;
        this.contractName = contractName;
        this.createTime = createTime;
        this.contractTypeId = contractTypeId;
        this.userId = userId;
        this.zheKou = zheKou;
        this.partyA = partyA;
        this.contractCost = contractCost;
        this.contractModelId = contractModelId;
        this.cityId = cityId;
        this.salesman = salesman;
        this.checkState = checkState;
        this.louCeng = louCeng;
        this.zhuGuan = zhuGuan;
        this.keHu = keHu;
        this.xueYuan = xueYuan;
        this.zhuangTai = zhuangTai;
        this.cpuXingHao = cpuXingHao;
        this.cpuKeShu = cpuKeShu;
        this.teShuPeiJian = teShuPeiJian;
        this.fangAnJia = fangAnJia;
        this.xiaDanTime = xiaDanTime;
        this.xiaDanZhouQi = xiaDanZhouQi;
    }

    public ContractCount(String contractId, String contractName, String createTime, int contractTypeId, int userId,
                         int zheKou, String partyA, double contractCost, int contractModelId, int cityId, String salesman,
                         String checkState, String louCeng, String zhuGuan, String keHu, String xueYuan, String zhuangTai,
                         String cpuXingHao, String cpuKeShu, String teShuPeiJian, String fangAnJia, String xiaDanTime,
                         String xiaDanZhouQi) {
        super();
        this.contractId = contractId;
        this.contractName = contractName;
        this.createTime = createTime;
        this.contractTypeId = contractTypeId;
        this.userId = userId;
        this.zheKou = zheKou;
        this.partyA = partyA;
        this.contractCost = contractCost;
        this.contractModelId = contractModelId;
        this.cityId = cityId;
        this.salesman = salesman;
        this.checkState = checkState;
        this.louCeng = louCeng;
        this.zhuGuan = zhuGuan;
        this.keHu = keHu;
        this.xueYuan = xueYuan;
        this.zhuangTai = zhuangTai;
        this.cpuXingHao = cpuXingHao;
        this.cpuKeShu = cpuKeShu;
        this.teShuPeiJian = teShuPeiJian;
        this.fangAnJia = fangAnJia;
        this.xiaDanTime = xiaDanTime;
        this.xiaDanZhouQi = xiaDanZhouQi;
    }

    public String getLouCeng() {
        return louCeng;
    }

    public void setLouCeng(String louCeng) {
        this.louCeng = louCeng;
    }

    public String getZhuGuan() {
        return zhuGuan;
    }

    public void setZhuGuan(String zhuGuan) {
        this.zhuGuan = zhuGuan;
    }

    public String getKeHu() {
        return keHu;
    }

    public void setKeHu(String keHu) {
        this.keHu = keHu;
    }

    public String getXueYuan() {
        return xueYuan;
    }

    public void setXueYuan(String xueYuan) {
        this.xueYuan = xueYuan;
    }

    public String getZhuangTai() {
        return zhuangTai;
    }

    public void setZhuangTai(String zhuangTai) {
        this.zhuangTai = zhuangTai;
    }

    public String getCpuXingHao() {
        return cpuXingHao;
    }

    public void setCpuXingHao(String cpuXingHao) {
        this.cpuXingHao = cpuXingHao;
    }

    public String getCpuKeShu() {
        return cpuKeShu;
    }

    public void setCpuKeShu(String cpuKeShu) {
        this.cpuKeShu = cpuKeShu;
    }

    public String getTeShuPeiJian() {
        return teShuPeiJian;
    }

    public void setTeShuPeiJian(String teShuPeiJian) {
        this.teShuPeiJian = teShuPeiJian;
    }

    public String getFangAnJia() {
        return fangAnJia;
    }

    public void setFangAnJia(String fangAnJia) {
        this.fangAnJia = fangAnJia;
    }

    public String getXiaDanTime() {
        return xiaDanTime;
    }

    public void setXiaDanTime(String xiaDanTime) {
        this.xiaDanTime = xiaDanTime;
    }

    public String getXiaDanZhouQi() {
        return xiaDanZhouQi;
    }

    public void setXiaDanZhouQi(String xiaDanZhouQi) {
        this.xiaDanZhouQi = xiaDanZhouQi;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getContractId() {
        return contractId;
    }
    public void setContractId(String contractId) {
        this.contractId = contractId;
    }
    public String getContractName() {
        return contractName;
    }
    public void setContractName(String contractName) {
        this.contractName = contractName;
    }
    public String getCreateTime() {
        return createTime;
    }
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    public int getContractTypeId() {
        return contractTypeId;
    }
    public void setContractTypeId(int contractTypeId) {
        this.contractTypeId = contractTypeId;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getZheKou() {
        return zheKou;
    }

    public void setZheKou(int zheKou) {
        this.zheKou = zheKou;
    }

    public String getPartyA() {
        return partyA;
    }

    public void setPartyA(String partyA) {
        this.partyA = partyA;
    }

    public double getContractCost() {
        return contractCost;
    }

    public void setContractCost(double contractCost) {
        this.contractCost = contractCost;
    }


    public int getContractModelId() {
        return contractModelId;
    }

    public void setContractModelId(int contractModelId) {
        this.contractModelId = contractModelId;
    }


    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getSalesman() {
        return salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman;
    }

    public String getCheckState() {
        return checkState;
    }

    public void setCheckState(String checkState) {
        this.checkState = checkState;
    }

    @Override
    public String toString() {
        return "ContractCount [id=" + id + ", contractId=" + contractId + ", contractName=" + contractName
                + ", createTime=" + createTime + ", contractTypeId=" + contractTypeId + ", userId=" + userId
                + ", zheKou=" + zheKou + ", partyA=" + partyA + ", contractCost=" + contractCost + ", contractModelId="
                + contractModelId + ", cityId=" + cityId + ", salesman=" + salesman + ", checkState=" + checkState
                + ", louCeng=" + louCeng + ", zhuGuan=" + zhuGuan + ", keHu=" + keHu + ", xueYuan=" + xueYuan
                + ", zhuangTai=" + zhuangTai + ", cpuXingHao=" + cpuXingHao + ", cpuKeShu=" + cpuKeShu
                + ", teShuPeiJian=" + teShuPeiJian + ", fangAnJia=" + fangAnJia + ", xiaDanTime=" + xiaDanTime
                + ", xiaDanZhouQi=" + xiaDanZhouQi + "]";
    }



}
