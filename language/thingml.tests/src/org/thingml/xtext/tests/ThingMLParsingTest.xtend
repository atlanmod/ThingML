/*
 * generated by Xtext 2.10.0
 */
package org.thingml.xtext.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.thingml.xtext.thingML.ThingMLModel

@RunWith(XtextRunner)
@InjectWith(ThingMLInjectorProvider)
class ThingMLParsingTest{

	@Inject
	ParseHelper<ThingMLModel> parseHelper

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			thing Xtext{}
		''')
		Assert.assertNotNull(result)
	}

}