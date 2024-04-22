package org.hiringapp.main;

import org.hiringapp.dao.ApplicationDao;
import org.hiringapp.dao.CompanyDao;
import org.hiringapp.dao.JobPostingDao;
import org.hiringapp.util.HiringDatabase;

import java.sql.Connection;

public class MyReferenceClass {
    Connection connection = HiringDatabase.openconnection();
//        UserDao userDao = new UserDao(connection);
//        User user = new User("Steeve","Steeve@23","Steeve@gmail.com","Senior Manager");
//        userDao.addUser(user);
//
//        System.out.println(userDao.getUserByUsername("Steeve"));
//
//        userDao.updateUser(1,"Steeve@2301","Steeve23@gmail.com");
//
//        userDao.deleteUSer(1);

    CompanyDao companyDao = new CompanyDao(connection);
//        Company company = new Company("Voya Finance", "Finance", "USA", "www.voyafinance.com", "voyafinance@gmail.com");
//        companyDao.addCompany(company);

//        System.out.println(companyDao.getComapnyById(1));

//        companyDao.updateCompany("Retirement","Ireland","www.voyafinance.com","voyafinance@gmail.com",1);
//        companyDao.deleteCompany(1);


    JobPostingDao jobPostingDao = new JobPostingDao(connection);
//        JobPosting jobPosting = new JobPosting(2, "Software Developer", "Good Knowledge in Application Development", 4, "France", 1000000, new Date());
//        jobPostingDao.addJobPosting(jobPosting);

//        System.out.println(jobPostingDao.getAllJobs());

//        System.out.println(jobPostingDao.getJobPostingByCompanyId(2));

//        jobPostingDao.deleteJobPosting(1);

    //int jobId, int userID, String resume, String coverLetter, String status, Date applicationDate
    ApplicationDao applicationDao = new ApplicationDao(connection);
//        Application application = new Application(2, 2, "c/resume/SteeveResume.pdf", "c/resume/cover.pdf", "Applied", new Date());
//        applicationDao.addApplication(application);

//        System.out.println(applicationDao.getAllApplication());


//        System.out.println(applicationDao.getApplicationsByUserId(2));

//        applicationDao.updateApplicationStatus("On Process",1);


}
