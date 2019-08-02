package controller;

import entity.ContractCount;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.ContractCountService;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("ContractCount")
public class ContractCountController {
    @Autowired
    private ContractCountService contractCountService;

    //查询所有合同信息
    @RequestMapping("/findAll")
    public List<ContractCount> findAll(){
        return contractCountService.findAllContract();
    }

    //根据id修改合同信息
    @RequestMapping(value = "/updateContract/{zheKou}/{salesman}/{louCeng}/{zhuGuan}/{keHu}/{partyA}/{xueYuan}/{zhuangTai}/{cpuXingHao}/{cpuKeShu}/{teShuPeiJian}/{fangAnJia}/{contractCost}/{xiaDanTime}/{xiaDanZhouQi}/{id}",method = RequestMethod.PUT)
    public String updateById(@PathVariable Integer zheKou, @PathVariable String salesman,@PathVariable String louCeng,@PathVariable String zhuGuan,@PathVariable String keHu,@PathVariable String partyA,
                            @PathVariable String xueYuan,@PathVariable String zhuangTai,@PathVariable String cpuXingHao,@PathVariable String cpuKeShu,@PathVariable String teShuPeiJian, @PathVariable String fangAnJia,
                            @PathVariable double contractCost,@PathVariable String xiaDanTime,@PathVariable String xiaDanZhouQi,
 @PathVariable Integer id){
        contractCountService.updateContract(zheKou,salesman,louCeng,zhuGuan,keHu,partyA,xueYuan,zhuangTai,cpuXingHao,cpuKeShu,teShuPeiJian,fangAnJia,contractCost,xiaDanTime,xiaDanZhouQi,id);
        return "success";
    }

    @RequestMapping(value = "deleteById/{id}",method = RequestMethod.DELETE)
    public String deleteById(@PathVariable Integer id){
        contractCountService.deleteById(id);
        return "success";
    }

  @RequestMapping(value = "/findContractBytime/{startTime}/{endTime}")
    public HttpStatus findByTime(@PathVariable String startTime, @PathVariable String endTime, HttpServletRequest request){
         startTime=request.getParameter("date_start");
        contractCountService.findContractByTime(startTime,endTime);
        return HttpStatus.OK;
  }
  @RequestMapping(value = "/OfficeAdd")
    public List<ContractCount> findContractByName(HttpServletRequest request){
        String startTime=request.getParameter("date_start");
        String endTime=request.getParameter("date_end");

      return contractCountService.findContractByTime(startTime,endTime);
  }



}



