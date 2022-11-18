# SpringSecurityWithMysqlDB


here we are implementing spring security on mysql db .
first we added student controller to post data into database(we are added mysql db)


	public void createStudentDetailsData(StudentDTO studentDTO) {
		Student stdobj = new Student();
		stdobj.setEmail(studentDTO.getEmail());
		stdobj.setIsActive(studentDTO.getIsActive());
		String pwd = studentDTO.getPassword();
    
    		stdobj.setPassword(passwordencoder.encode(pwd));
   we added Bycryptpassword encoder to store password in encrypted format(hash functionor hashed format) in database.
   ![image](https://user-images.githubusercontent.com/115841974/202605894-bb126db7-1521-4920-8b86-cedff04f1f4b.png)

![image](https://user-images.githubusercontent.com/115841974/202605975-28f07754-7f35-437b-be80-6a4bb5c8eaf1.png)

once data has been added successfuly in DB 
next we need to test the userdetails using spring security 
we are testing the code  using security 
![image](https://user-images.githubusercontent.com/115841974/202606301-90ec926e-cc00-4a23-bdb2-226f7f50808d.png)



Userdetails provide daoauthenthication provider to validate the login user details 
![image](https://user-images.githubusercontent.com/115841974/202607675-8d39a3ca-c88c-466b-b844-d4f002394aa5.png)

![image](https://user-images.githubusercontent.com/115841974/202607744-aeaffd3b-10e3-42b6-93e0-8a4e50080d1b.png)

![image](https://user-images.githubusercontent.com/115841974/202607790-e3b43598-4bec-4b5c-86be-6af6cb6728ef.png)
by giving user data details in login page spring security will authenthicate the details by daoauthenthicationprovider

![image](https://user-images.githubusercontent.com/115841974/202608088-af5385ed-3919-4306-8b42-663d1b35469e.png)

