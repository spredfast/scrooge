package com.twitter.scrooge.android_generator

import com.twitter.scrooge.ast._
import com.twitter.scrooge.java_generator.{FieldTypeController => JavaFieldTypeController}

class FieldTypeController(fieldType: FunctionType, generator: AndroidGenerator) extends JavaFieldTypeController(fieldType, generator){
  val left_element_type_name_in_container = generator.leftElementTypeName(fieldType)
  val right_element_type_name_in_container = generator.rightElementTypeName(fieldType)

  val left_element_type_name_in_container_skip_generic = generator.leftElementTypeName(fieldType, skipGeneric = true)
  val right_element_type_name_in_container_skip_generic = generator.rightElementTypeName(fieldType, skipGeneric = true)
}
