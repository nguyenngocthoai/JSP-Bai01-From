package com.haru.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haru.entities.Student;

@WebServlet("/registrationForm")
public class RegistrationForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegistrationForm() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String day = request.getParameter("day");
		String month = request.getParameter("month");
		String year = request.getParameter("year");
		String email = request.getParameter("email");
		String mobileNumber = request.getParameter("mobile");
		String gender = request.getParameter("gender");
		if (gender.equals("Nam")) {
			gender = "Nam";
		} else if (gender.equals("Nữ")) {
			gender = "Nữ";
		}
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String pincode = request.getParameter("pincode");
		String state = request.getParameter("state");
		String country = request.getParameter("country");
		String hobbiles = request.getParameter("hobbies");
		String qualification = request.getParameter("qualification");
		String courseApplies = request.getParameter("courseappl");
		String birthday = day + "/" + month + "/" + year;
		
		Student st = new Student();
		st.setFirstname(firstname);
		st.setLastname(lastname);
		st.setBirthday(birthday);
		st.setEmail(email);
		st.setMobileNumber(mobileNumber);
		st.setGender(gender);
		st.setAddress(address);
		st.setCity(city);
		st.setPincode(pincode);
		st.setState(state);
		st.setCountry(country);
		st.setHobbiles(hobbiles);
		st.setQualification(qualification);
		st.setCourseApplies(courseApplies);
		request.setAttribute("student", st);
		RequestDispatcher rd = request.getRequestDispatcher("ResultForm.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
