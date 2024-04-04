/******************************************************************************
Programmer: Zoe Cope 
Date: 08/30/2023
Lab 1
Instructor: Dr. Rafael Azuaje
College: San Antonio College or other from Alamo Colleges District

*******************************************************************************/
public interface Displayable {
    default String getDisplayText(){
      return toString();
    }
}
