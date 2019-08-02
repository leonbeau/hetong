package service.impl;

import dao.ContractCountDao;
import entity.ContractCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ContractCountService;

import java.util.List;

@Service("ContractCountService")
public class ContractCountServiceImpl implements ContractCountService {

    @Autowired
    private ContractCountDao contractCountDao;

    public List<ContractCount> findAllContract() {
        return contractCountDao.findAllContract();
    }

    public void updateContract(Integer zheKou,String salesman,String louCeng,String zhuGuan,String keHu,String partyA,
                               String xueYuan,String zhuangTai,String cpuXingHao,String cpuKeShu,String teShuPeiJian,String fangAnJia,
                               double contractCost,String xiaDanTime,String xiaDanZhouQi,Integer id) {
        contractCountDao.updateContract(zheKou,salesman,louCeng,zhuGuan,keHu,partyA,xueYuan,zhuangTai,cpuXingHao,cpuKeShu,teShuPeiJian,fangAnJia,contractCost,xiaDanTime,xiaDanZhouQi,id);
        System.out.println(zheKou+"**"+salesman+"**"+id+"**"+louCeng+" "+zhuGuan+" "+keHu+" "+partyA+" "+xueYuan+" "+zhuangTai);
    }

    public void deleteById(Integer id) {
        contractCountDao.deleteById(id);

    }

    public List<ContractCount> findContractByTime(String startTime, String endTime) {
        return contractCountDao.findContractByTime(startTime,endTime);
    }

    public void addContract(String contractId, String contractName, String createTime, Integer contractTypeId, Integer userId, Integer zheKou, String partyA, double contractCost, Integer contractModelId, Integer cityId, String salesman, Enum checkState, String louCeng, String zhuGuan, String keHu, String xueYuan, String zhuangTai, String cpuXingHao, String cpuKeShu, String teShuPeiJian, String fangAnJia, String xiaDanTime, String xiaDanZhouQi, String costChn) {

    }
}






