package dao;

import entity.ContractCount;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ContractCountDao {
    //在index界面显示所有合同信息
    public List<ContractCount> findAllContract();

    //在index界面编辑合同信息
    public void updateContract( @Param(value = "zheKou") Integer zheKou,
                                @Param(value = "salesman") String salesman,
            @Param(value ="louCeng")String louCeng,
                                @Param(value = "zhuGuan")String zhuGuan,@Param(value = "keHu")String keHu,@Param(value = "partyA")String partyA,
                                @Param(value = "xueYuan")String xueYuan,@Param(value = "zhuangTai")String zhuangTai,@Param(value = "cpuXingHao")String cpuXingHao,
                                @Param(value = "cpuKeShu") String cpuKeShu,@Param(value = "teShuPeiJian")String teShuPeiJian,@Param(value = "fangAnJia") String fangAnJia,
                                @Param(value = "contractCost") double contractCost,@Param(value = "xiaDanTime")String xiaDanTime,@Param(value = "xiaDanZhouQi")String xiaDanZhouQi,

                                @Param(value = "id") Integer id);

     //在主界面根据id删除合同信息
    void deleteById(@Param(value = "id") Integer id);

    //在主界面根据时间段检索合同信息
    List<ContractCount> findContractByTime(@Param(value = "startTime")String startName,@Param(value = "endTime")String endTime);

    void addContract(@Param(value = "contractId")String contractId,@Param(value = "contractName")String contractName,@Param(value = "createTime")String createTime,@Param(value = "contractTypeId")Integer contractTypeId,
                     @Param(value = "userId")Integer userId,@Param(value = "zheKou")Integer zheKou,@Param(value = "partyA")String partyA,@Param(value = "contractCost")double contractCost,@Param(value = "contractModelId")Integer contractModelId,
                     @Param(value = "cityId")Integer cityId,@Param(value = "salesman")String salesman,@Param(value = "checkState")Enum checkState,@Param(value = "louCeng")String louCeng,
                     @Param(value = "zhuGuan")String zhuGuan,@Param(value = "keHu")String keHu,@Param(value = "xueYuan")String xueYuan,@Param(value = "zhuangTai")String zhuangTai,@Param(value = "cpuXingHao")String cpuXingHao,@Param(value = "cpuKeShu")String cpuKeShu,@Param(value = "teShuPeiJian")String teShuPeiJian,
                     @Param(value = "fangAnJia")String fangAnJia,@Param(value = "xiaDanTime")String xiaDanTime,@Param(value = "xiaDanZhouQi")String xiaDanZhouQi,@Param(value = "costChn")String costChn);


}
