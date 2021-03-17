package pl.edu.wszib.warehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.edu.wszib.warehouse.dao.ITransferDAO;

@Controller
public class TransferController {

    @Autowired
    ITransferDAO transferDAO;

    @RequestMapping(value = "/transferPage", method = RequestMethod.GET)
    public String getReportList(Model report) {

        report.addAttribute("reportList", this.transferDAO.getReports());

        return "transferPage";
    }
}
