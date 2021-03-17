package pl.edu.wszib.warehouse.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;
import pl.edu.wszib.warehouse.dao.ITransferDAO;
import pl.edu.wszib.warehouse.model.Report;

import java.util.ArrayList;
import java.util.List;

@Component
public class TransferDAOImpl implements ITransferDAO {

    private List<Report> productsList = new ArrayList<>();

    private static SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public TransferDAOImpl() {

    }

    @Override
    public List<Report> getReports() {
        Session session = factory.openSession();
        List reports = session
                .createQuery("FROM pl.edu.wszib.warehouse.model.Report")
                .list();
        session.close();
        return reports;
    }
}
