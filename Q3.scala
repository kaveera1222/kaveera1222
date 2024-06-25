object Q3 {
	def main(args : Array[String]) {
	 
		println("weekly Salary : " + weeklySalary(40,30))
		println("Monthly Salary : " + monthlySalary(40,30))
		
		}
	def Company_XYZ(normal : Double,ot : Double) : Double = normal*250 + ot*85

	def weeklySalary(normal:Double,ot:Double) : Double = Company_XYZ(normal:Double,ot:Double) - Company_XYZ(normal:Double,ot:Double)*0.12
	
	def monthlySalary(normal:Double,ot:Double) : Double = weeklySalary(normal:Double,ot:Double)*4
	
		
}