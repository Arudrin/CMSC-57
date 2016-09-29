/* Written by Aldrin Manus  **/

public class Date{
	


		private int year;
		private int day;
		private int month;

		private boolean errorYear;
		private boolean errorMonthDay;
		private boolean errorMonth;
		private boolean errorDay;



		Date(){

			this.day = 1;
			this.month = 1;
			this.year = 1000;
			this.errorYear = false;
			this.errorMonth = false;
			this.errorMonthDay = false;
			this.errorDay = false;
		}

		Date( int x, int y, int z){

			this.year = x;
			this.month = y;
			this.day= z;
		}


		private void errorPrinter( boolean errorYear, boolean errorMonthDay, boolean errorDay, boolean errorMonth ){

			if(errorYear == true && errorMonth == true && errorDay == true )
			{
				throw new IllegalArgumentException(" Invalid Year, Month, and Day ");
			}
			else if(errorYear == true && errorMonth == false && errorDay == true )
			{
				throw new IllegalArgumentException(" Invalid Year and Day ");
			}
			else if(errorYear == true && errorMonth == false && errorDay == false )
			{
				throw new IllegalArgumentException(" Invalid Year ");
			}
			else if(errorYear == true && errorMonth == true && errorDay == false )
			{
				throw new IllegalArgumentException(" Invalid Year and Month  ");
			}
			else if(errorYear == false && errorMonth == true && errorDay == false )
			{
				throw new IllegalArgumentException(" Invalid Month  ");
			}
			else if(errorYear == false && errorMonth == true && errorDay == true )
			{
				throw new IllegalArgumentException(" Invalid Day and Month  ");
			}
			else if(errorYear == false && errorMonth == false && errorDay == true )
			{
				throw new IllegalArgumentException(" Invalid Day  ");
			}
			else
			{
				if(errorMonthDay == true)
				{
					throw new IllegalArgumentException(" Invalid combination of Day and Month  ");
				}
			}

		}

		public int getYear(){

			return this.year;

		}

		public int getMonth(){

			return this.month;

		}

		public int getDay(){

			return this.day;

		}

		public void setYear( int year ){

			if( year >= 1000 || year <= 9999){

				this.year = year;

			}
			else
			{
				throw new IllegalArgumentException(" Invalid Year ");
			}

			

		}

		public void setMonth( int month ){

			if( month >= 1 && month <= 12)
			{

				if( month == 2 )
				{
					if( this.day > 28 )
					{
						throw new IllegalArgumentException(" Invalid Month for the the Day ");
			
					}
					else
					{
						this.month = month;
					}
				}
				else if( month == 4 || month == 6 || month == 9 || month == 11 )
				{
					if( this.day > 30 )
					{
						throw new IllegalArgumentException(" Invalid Month for the Day ");
					}
					else
					{
						this.month = month;
					}

				}
				else
				{
					this.month = month;
				}

			}
			else
			{
				throw new IllegalArgumentException(" Invalid Month ");
			}

		}

		public void setDay( int day ){

			if( day >= 1 && day <= 31){

				if( day == 31 )
				{
					if( this.month == 2 || this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11)
					{
						throw new IllegalArgumentException(" Invalid Day for the Month ");
			
					}
					else
					{
						this.day = day;
					}
				}
				else if( day == 30 || day == 29 )
				{
					if( this.month == 2 )
					{
						throw new IllegalArgumentException(" Invalid Day for the Month ");
					}
					else
					{
						this.day = day;
					}

				}
				else
				{
					this.day = day;
				}

			}
			else
			{
				throw new IllegalArgumentException(" Invalid Day ");
			}

		}

		public String toString(){
			if(day < 10 && month < 10 ){
				String formation = String.format("0%d/0%d/%d",day,month,year);
				return formation;
			}
			else if(day >= 10 && month < 10){
				String formation = String.format("%d/0%d/%d",day,month,year);
				return formation;
			}
			else if(day < 10 && month >= 10){
				String formation = String.format("0%d/%d/%d",day,month,year);
				return formation;
			}
			else
			{
				String formation = String.format("%d/%d/%d",day,month,year);
				return formation;
			}

		}

		public void setDate( int year, int month, int day ){

			if( year >= 1000 && year <= 9999){ // Error checking for year

				this.year = year;

			}
			else
			{
				this.errorYear = true;
			}

			if( month >= 1 && month <= 12) //Error checking for month
			{

				this.month = month;
			}
			else
			{
				this.errorMonth = true;
			}

			if( day >= 1 && day <= 31)
			{ // day check

				if( day == 31 )
				{
					if( this.month == 2 || this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11)
					{
						this.errorMonthDay = true;
					}
					else
					{
						this.day = day;
					}
				}
				else if( day == 30 || day == 29 )
				{
					if( this.month == 2 )
					{
						this.errorMonthDay = true;
					}
					else
					{
						this.day = day;
					}

				}
				else
				{
					this.day = day;
				}
			}
			else
			{
				this.errorDay = true;
			}

		errorPrinter(this.errorYear, this.errorMonthDay, this.errorMonth, this.errorDay);

		}

		

		
}
