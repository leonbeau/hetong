package service;

import entity.ContractCount;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface ContractCountService {
    List<ContractCount> findAllContract();

    void updateContract(Integer zheKou,String salesman,String louCeng,String zhuGuan,String keHu,String partyA,
                        String xueYuan,String zhuangTai,String cpuXingHao,String cpuKeShu,String teShuPeiJian,String fangAnJia,
                        double contractCost,String xiaDanTime,String xiaDanZhouQi,Integer id);

    void deleteById(Integer id);

    List<ContractCount> findContractByTime(String startTime,String endTime);

    void addContract(@Param(value = "contractId")String contractId, @Param(value = "contractName")String contractName, @Param(value = "createTime")String createTime, @Param(value = "contractTypeId")Integer contractTypeId,
                     @Param(value = "userId")Integer userId, @Param(value = "zheKou")Integer zheKou, @Param(value = "partyA")String partyA, @Param(value = "contractCost")double contractCost, @Param(value = "contractModelId")Integer contractModelId,
                     @Param(value = "cityId")Integer cityId, @Param(value = "salesman")String salesman, @Param(value = "checkState")Enum checkState, @Param(value = "louCeng")String louCeng,
                     @Param(value = "zhuGuan")String zhuGuan, @Param(value = "keHu")String keHu, @Param(value = "xueYuan")String xueYuan, @Param(value = "zhuangTai")String zhuangTai, @Param(value = "cpuXingHao")String cpuXingHao, @Param(value = "cpuKeShu")String cpuKeShu, @Param(value = "teShuPeiJian")String teShuPeiJian,
                     @Param(value = "fangAnJia")String fangAnJia, @Param(value = "xiaDanTime")String xiaDanTime, @Param(value = "xiaDanZhouQi")String xiaDanZhouQi, @Param(value = "costChn")String costChn);
}


