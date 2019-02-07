package com.payroll;

	public abstract class Vehicle implements IPrintable{

		private String make;
		private String color;
		private String plate;

		public Vehicle(String make, String color,  String plate) {
			this.make = make;
			this.color = color;
			this.plate = plate;

		}

		public String getMake() {
			return make;
		}

		public void setMake(String make) {
			this.make = make;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getPlate() {
			return plate;
		}

		public void setPlate(String plate) {
			this.plate = plate;
		}
		@Override
	    public String printMyData() {
	        StringBuilder stringBuilder= new StringBuilder();
	        stringBuilder.append("Color:").append(getColor()).append("\n");
	        stringBuilder.append("make:").append(getMake()).append("\n");
	        stringBuilder.append("plate:").append(getPlate()).append("\n");
	       
	        return String.valueOf(stringBuilder);
	    }

	}
