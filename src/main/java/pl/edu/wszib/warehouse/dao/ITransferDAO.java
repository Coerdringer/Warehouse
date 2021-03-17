package pl.edu.wszib.warehouse.dao;
import pl.edu.wszib.warehouse.model.Report;
import java.util.List;

public interface ITransferDAO {
    List<Report> getReports();
}
