package com.posadas.process.profileupdate;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class PackagesByProgram implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "program")
   private java.lang.String program;
   @org.kie.api.definition.type.Label(value = "customerData")
   private java.lang.Boolean customerData;
   @org.kie.api.definition.type.Label(value = "address")
   private java.lang.Boolean address;
   @org.kie.api.definition.type.Label(value = "bankData")
   private java.lang.Boolean bankData;
   @org.kie.api.definition.type.Label(value = "telephone")
   private java.lang.Boolean telephone;

   public PackagesByProgram()
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

   public java.lang.Boolean getCustomerData()
   {
      return this.customerData;
   }

   public void setCustomerData(java.lang.Boolean customerData)
   {
      this.customerData = customerData;
   }

   public java.lang.Boolean getAddress()
   {
      return this.address;
   }

   public void setAddress(java.lang.Boolean address)
   {
      this.address = address;
   }

   public java.lang.Boolean getBankData()
   {
      return this.bankData;
   }

   public void setBankData(java.lang.Boolean bankData)
   {
      this.bankData = bankData;
   }

   public java.lang.Boolean getTelephone()
   {
      return this.telephone;
   }

   public void setTelephone(java.lang.Boolean telephone)
   {
      this.telephone = telephone;
   }

   public PackagesByProgram(java.lang.String program,
         java.lang.Boolean customerData, java.lang.Boolean address,
         java.lang.Boolean bankData, java.lang.Boolean telephone)
   {
      this.program = program;
      this.customerData = customerData;
      this.address = address;
      this.bankData = bankData;
      this.telephone = telephone;
   }

}