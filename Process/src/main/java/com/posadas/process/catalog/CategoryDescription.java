package com.posadas.process.catalog;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CategoryDescription implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "id")
   private java.lang.String id;
   @org.kie.api.definition.type.Label(value = "name")
   private java.lang.String name;
   @org.kie.api.definition.type.Label(value = "isDefault")
   private java.lang.Boolean isDefault;
   @org.kie.api.definition.type.Label(value = "image")
   private java.lang.String image;
   @org.kie.api.definition.type.Label(value = "idSubCategory01")
   private java.lang.String idSubCategory01;
   @org.kie.api.definition.type.Label(value = "idSubCategory02")
   private java.lang.String idSubCategory02;
   @org.kie.api.definition.type.Label(value = "idSubCategory03")
   private java.lang.String idSubCategory03;
   @org.kie.api.definition.type.Label(value = "idSubCategory04")
   private java.lang.String idSubCategory04;
   @org.kie.api.definition.type.Label(value = "idSubCategory05")
   private java.lang.String idSubCategory05;
   @org.kie.api.definition.type.Label(value = "idSubCategory06")
   private java.lang.String idSubCategory06;
   @org.kie.api.definition.type.Label(value = "program")
   private java.lang.String program;

   public CategoryDescription()
   {
   }

   public java.lang.String getId()
   {
      return this.id;
   }

   public void setId(java.lang.String id)
   {
      this.id = id;
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.Boolean getIsDefault()
   {
      return this.isDefault;
   }

   public void setIsDefault(java.lang.Boolean isDefault)
   {
      this.isDefault = isDefault;
   }

   public java.lang.String getImage()
   {
      return this.image;
   }

   public void setImage(java.lang.String image)
   {
      this.image = image;
   }

   public java.lang.String getIdSubCategory01()
   {
      return this.idSubCategory01;
   }

   public void setIdSubCategory01(java.lang.String idSubCategory01)
   {
      this.idSubCategory01 = idSubCategory01;
   }

   public java.lang.String getIdSubCategory02()
   {
      return this.idSubCategory02;
   }

   public void setIdSubCategory02(java.lang.String idSubCategory02)
   {
      this.idSubCategory02 = idSubCategory02;
   }

   public java.lang.String getIdSubCategory03()
   {
      return this.idSubCategory03;
   }

   public void setIdSubCategory03(java.lang.String idSubCategory03)
   {
      this.idSubCategory03 = idSubCategory03;
   }

   public java.lang.String getIdSubCategory04()
   {
      return this.idSubCategory04;
   }

   public void setIdSubCategory04(java.lang.String idSubCategory04)
   {
      this.idSubCategory04 = idSubCategory04;
   }

   public java.lang.String getIdSubCategory05()
   {
      return this.idSubCategory05;
   }

   public void setIdSubCategory05(java.lang.String idSubCategory05)
   {
      this.idSubCategory05 = idSubCategory05;
   }

   public java.lang.String getIdSubCategory06()
   {
      return this.idSubCategory06;
   }

   public void setIdSubCategory06(java.lang.String idSubCategory06)
   {
      this.idSubCategory06 = idSubCategory06;
   }

   public java.lang.String getProgram()
   {
      return this.program;
   }

   public void setProgram(java.lang.String program)
   {
      this.program = program;
   }

   public CategoryDescription(java.lang.String id, java.lang.String name,
         java.lang.Boolean isDefault, java.lang.String image,
         java.lang.String idSubCategory01, java.lang.String idSubCategory02,
         java.lang.String idSubCategory03, java.lang.String idSubCategory04,
         java.lang.String idSubCategory05, java.lang.String idSubCategory06,
         java.lang.String program)
   {
      this.id = id;
      this.name = name;
      this.isDefault = isDefault;
      this.image = image;
      this.idSubCategory01 = idSubCategory01;
      this.idSubCategory02 = idSubCategory02;
      this.idSubCategory03 = idSubCategory03;
      this.idSubCategory04 = idSubCategory04;
      this.idSubCategory05 = idSubCategory05;
      this.idSubCategory06 = idSubCategory06;
      this.program = program;
   }

}