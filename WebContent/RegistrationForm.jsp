<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Form</title>
</head>
<body>
	<div style="background:#8fd0f7 ">
			<form action="registrationForm" method="get">
				<table>
					<tr>
						<td>First name</td>
						<td><input type="text" name="firstname">(max 30 characters a-z and A-Z)</td>
						<td></td>
					</tr>
					<tr>
						<td>Last name</td>
						<td><input type="text" name="lastname">(max 30 characters a-z and A-Z)</td>
					</tr>
					<tr>
						<td></td>
						<td>
							<select name="day">
								<option> Day:</option>
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
								<option value="6">6</option>
								<option value="7">7</option>
								<option value="8">8</option>
								<option value="9">9</option>
								<option value="10">10</option>
								<option value="11">11</option>
								<option value="12">12</option>
								<option value="13">13</option>
								<option value="14">14</option>
								<option value="15">15</option>
								<option value="16">16</option>
								<option value="17">17</option>
								<option value="18">18</option>
								<option value="19">19</option>
								<option value="20">20</option>
								<option value="21">21</option>
								<option value="22">22</option>
								<option value="23">23</option>
								<option value="24">24</option>
								<option value="25">25</option>
								<option value="26">26</option>
								<option value="27">27</option>
								<option value="28">28</option>
								<option value="29">29</option>
								<option value="30">30</option>
								<option value="31">31</option>
							</select>
							<select name="month">
								<option>Month:</option>
								<option value="01">January</option>
								<option value="02">February</option>
								<option value="03">March</option>
								<option value="04">April</option>
								<option value="05">May</option>
								<option value="06">June</option>
								<option value="07">July</option>
								<option value="08">August</option>
								<option value="09">September</option>
								<option value="10">October</option>
								<option value="11">November</option>
								<option value="12">December</option>
							</select>
							<select name="year">
								<option>Year:</option>
								<option value="2020">2020</option>
								<option value="2019">2019</option>
								<option value="2018">2018</option>
								<option value="2017">2017</option>
								<option value="2016">2016</option>
								<option value="2015">2015</option>
								<option value="2014">2014</option>
								<option value="2013">2013</option>
								<option value="2012">2012</option>
								<option value="2011">2011</option>
								<option value="2010">2010</option>
								<option value="2009">2009</option>
								<option value="2008">2008</option>
								<option value="2007">2007</option>
								<option value="2006">2006</option>
								<option value="2005">2005</option>
								<option value="2004">2004</option>
								<option value="2003">2003</option>
								<option value="2002">2002</option>
								<option value="2001">2001</option>
								<option value="2000">2000</option>
								<option value="1999">1999</option>
								<option value="1998">1998</option>
								<option value="1997">1997</option>
								<option value="1996">1996</option>
								<option value="1995">1995</option>
								<option value="1994">1994</option>
								<option value="1993">1993</option>
								<option value="1992">1992</option>
								<option value="1991">1991</option>
								<option value="1990">1990</option>
								<option value="1989">1989</option>
								<option value="1988">1988</option>
								<option value="1987">1987</option>
								<option value="1986">1986</option>
								<option value="1985">1985</option>
								<option value="1984">1984</option>
								<option value="1983">1983</option>
								<option value="1982">1982</option>
								<option value="1981">1981</option>
								<option value="1980">1980</option>
							</select>
						</td>
					</tr>
					<tr>
						<td>Email</td>
						<td><input type="text" name="email"></td>
					</tr>
					<tr>
						<td>Mobile number</td>
						<td><input type="text" name="mobile">(10 digit number)</td>
					</tr>
					<tr>
						<td>Gender</td>
						<td>Male<input type="radio" name="gender" value="Nam"> Female
						<input type="radio" name="gender" value="Nữ"></td>
					</tr>
					<tr>
						<td>Address</td>
						<td><textarea name="address" rows="5" cols="30"></textarea></td>
					</tr>
					<tr>
						<td>City</td>
						<td><input type="text" name="city">(max 30 characters a-z and A-Z)</td>
					</tr>
					<tr>
						<td>Pin code</td>
						<td><input type="text" name="pincode">(10 digit number)</td>
						<td></td>
					</tr>
					<tr>
						<td>State</td>
						<td><input type="text" name="state">(max 30 characters a-z and A-Z)</td>
					</tr>
					<tr>
						<td>Country</td>
						<td><input type="text" name="country"></td>
					</tr>
					<tr>
						<td>Hobbies</td>
						<td>
							Drawing <input type="checkbox" name="hobbies" value="Drawing">
							Singing <input type="checkbox" name="hobbies"value="Singing">
							Dancing <input type="checkbox" name="hobbies"value="Dancing">
							Sketching <input type="checkbox" name="hobbies"value="Sketching">
							Others <input type="checkbox" name="hobbies"value="Others">
							<input type="text" name="hobbies">
						</td>
					</tr>
					<tr>
						<td>Qualification</td>
						<td>
							<table>
								<tr style="text-align: center;">
									<td>SI.No.</td>
									<td>Examination</td>
									<td>Board</td>
									<td>Percentage</td>
									<td>Year of Passing</td>
								</tr>
								<tr>
									<td>1</td>
									<td>Class X</td>
									<td><input type="text" name="qualification"></td>
									<td><input type="text" name="qualification"></td>
									<td><input type="text" name="qualification"></td>
								</tr>
								<tr>
									<td>2</td>
									<td>Class XII</td>
									<td><input type="text" name="qualification"></td>
									<td><input type="text" name="qualification"></td>
									<td><input type="text" name="qualification"></td>
								</tr>
								<tr>
									<td>3</td>
									<td>Graduation</td>
									<td><input type="text" name="qualification"></td>
									<td><input type="text" name="qualification"></td>
									<td><input type="text" name="qualification"></td>
								</tr>
								<tr>
									<td>4</td>
									<td>Masters</td>
									<td><input type="text" name="qualification"></td>
									<td><input type="text" name="qualification"></td>
									<td><input type="text" name="qualification"></td>
								</tr>
								<tr>
									<td></td>
									<td></td>
									<td>(10 char max)</td>
									<td>upto 2 decimal</td>
									<td></td>
								</tr>
							</table>
						</td>
					</tr>
					<tr>
						<td>Course applies for</td>
						<td>
							BCA<input type="radio" name="courseappl" value="BCA">
							C.Com<input type="radio" name="courseappl" value="C.Com">
							B.Sc<input type="radio" name="courseappl" value="B.Sc">
							B.A<input type="radio" name="courseappl" value="B.A">
						</td>
					</tr>
				</table>
				<center>
					<input type="submit" name="submit" value="Submit">
					<input type="reset" name="reset" value="Reset">
				</center>
			</form>
		</div>
</body>
</html>