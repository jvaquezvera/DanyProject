package com.posadas.process.profileupdate;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CountryByProgram implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "program")
   private java.lang.String program;
   @org.kie.api.definition.type.Label(value = "country01")
   private java.lang.String country01;
   @org.kie.api.definition.type.Label(value = "country02")
   private java.lang.String country02;

   public CountryByProgram()
   {
   }

   public java.lang.String getProgram()
   {
      return this.program;
   }

   public void setProgram(java.lang.String program)
   {
      this.program = program;
   }

   public java.lang.String getCountry01()
   {
      return this.country01;
   }

   public void setCountry01(java.lang.String country01)
   {
      this.country01 = country01;
   }

   public java.lang.String getCountry02()
   {
      return this.country02;
   }

   public void setCountry02(java.lang.String country02)
   {
      this.country02 = country02;
   }

   public CountryByProgram(java.lang.String program,
         java.lang.String country01, java.lang.String country02)
   {
      this.program = program;
      this.country01 = country01;
      this.country02 = country02;
   }

}