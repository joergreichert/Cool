package edu.stanford.compilers.scoping

import edu.stanford.compilers.cool.Class_
import edu.stanford.compilers.cool.CoolFactory
import edu.stanford.compilers.cool.Type
import java.util.List

class BuiltInTypes {
	private static Class_ objectClass = null;
	private static Class_ stringClass = null;
	private static Class_ intClass = null;
	private static Class_ boolClass = null;
	private static Class_ ioClass = null;

	//class Object {
	//	abort()  :  Object { new Object };
	//	type_name()  :  String { "" };
	//	copy()  :  SELF_TYPE { self };	
	//};	
	def static Type getObject() {
		if(objectClass === null) {
			objectClass = CoolFactory.eINSTANCE.createClass_
			objectClass => [
				name = "Object"
				features += CoolFactory.eINSTANCE.createMethod => [
					name = "abort"
					return_type = getString(objectClass)
					expr = CoolFactory.eINSTANCE.createNewExpression => [
						type_name = object
					]
				]
				features += CoolFactory.eINSTANCE.createMethod => [
					name = "type_name"
					return_type = getString(objectClass)
					expr = CoolFactory.eINSTANCE.createStringLiteral => [ value = "" ]
				]
				features += CoolFactory.eINSTANCE.createMethod => [
					name = "copy"
					return_type = getSelfType
					expr = CoolFactory.eINSTANCE.createSelfTypeLiteral
				]
			]
		}
		objectClass
	}

	def static Type getString() {
		getString(null)
	}

	//class String inherits Object {
	//
	//	length()  :  Int { 0 };
	//	concat(s  :  String)  :  String { "" };
	//	substr(i  :  Int,  l  :  Int)  :  String { "" };	
	//};
	def private static Type getString(Class_ objectClass) {
		if(stringClass === null) {
			stringClass = CoolFactory.eINSTANCE.createClass_
			stringClass => [
				name = "String"
				parent = if(objectClass !== null) objectClass else getObject
				features += CoolFactory.eINSTANCE.createMethod => [
					name = "length"
					return_type = getInt
					expr = CoolFactory.eINSTANCE.createNumberLiteral => [ value = 0 ]
				]
				features += CoolFactory.eINSTANCE.createMethod => [
					name = "concat"
					formals += CoolFactory.eINSTANCE.createFormal => [
						name = "s"
						type_decl = stringClass
					]
					return_type = stringClass
					expr = CoolFactory.eINSTANCE.createStringLiteral => [ value = "" ]
				]
				features += CoolFactory.eINSTANCE.createMethod => [
					name = "copy"
					formals += CoolFactory.eINSTANCE.createFormal => [
						name = "i"
						type_decl = getInt
					]
					formals += CoolFactory.eINSTANCE.createFormal => [
						name = "l"
						type_decl = getInt
					]
					return_type = stringClass
					expr = CoolFactory.eINSTANCE.createStringLiteral => [ value = "" ]
				]
			]
		}
		stringClass
	}

	//class Int {};	
	def static Type getInt() {
		if(intClass === null) {
			intClass = CoolFactory.eINSTANCE.createClass_ => [  name = "Int";  parent = getObject  ]
		}
		intClass
	}

	//class Bool {};	
	def static Type getBool() {
		if(boolClass === null) {
			boolClass = CoolFactory.eINSTANCE.createClass_ => [  name = "Bool";  parent = getObject  ]
		}
		boolClass
	}

	def static Type getSelfType() {
		CoolFactory.eINSTANCE.createClass_ => [
			name = "SELF_TYPE"
		]
	}

//	class IO inherits Object {
//		out_string(x  :  String)  :  SELF_TYPE { self };
//		out_int(x  :  Int)  :  SELF_TYPE { self };
//		in_string()  :  String { "" };
//		in_int()  :  Int { 0 };
//	};
	def static Type getIO() {
		if(ioClass === null) {
			ioClass = CoolFactory.eINSTANCE.createClass_
			ioClass => [
				name = "IO"
				parent = getObject
				features += CoolFactory.eINSTANCE.createMethod => [
					name = "out_string"
					formals += CoolFactory.eINSTANCE.createFormal => [
						name = "x"
						type_decl = getString
					]
					return_type = getSelfType
					expr = CoolFactory.eINSTANCE.createSelfTypeLiteral
				]
				features += CoolFactory.eINSTANCE.createMethod => [
					name = "out_int"
					formals += CoolFactory.eINSTANCE.createFormal => [
						name = "x"
						type_decl = getInt
					]
					return_type = getSelfType
					expr = CoolFactory.eINSTANCE.createSelfTypeLiteral
				]
				features += CoolFactory.eINSTANCE.createMethod => [
					name = "in_string"
					return_type = getString
					expr = CoolFactory.eINSTANCE.createStringLiteral => [ value = "" ]
				]
				features += CoolFactory.eINSTANCE.createMethod => [
					name = "in_int"
					return_type = getInt
					expr = CoolFactory.eINSTANCE.createNumberLiteral => [ value = 0 ]
				]
			]
		}
		ioClass
	}
	
	def static List<Type> getBuiltInTypes() {
		val list = <Type>newArrayList
		list += getObject
		list += getString
		list += getInt
		list += getBool
		list += getIO
		list
	}
}