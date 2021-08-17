package com.enroutesystems.modifiers.paquete;

public class PublicClassDifferentPackage {
		
		public String publicVariable = "yes";
		
		public String getPublicVariable() {
			return "Yes ";
		}
		
		public String getSource() {
			return this.getClass().getName();
		}
		
}
