/*
 * generated by Xtext 2.25.0
 */
package rest.formatting2

import com.google.inject.Inject
import metamodelREST.RestSystem
import metamodelREST.Route
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import rest.services.RestGrammarAccess

class RestFormatter extends AbstractFormatter2 {
	
	@Inject extension RestGrammarAccess

	def dispatch void format(RestSystem restSystem, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (request : restSystem.request) {
			request.format
		}
		for (struct : restSystem.struct) {
			struct.format
		}
		for (operation : restSystem.operation) {
			operation.format
		}
		for (answer : restSystem.answer) {
			answer.format
		}
	}

	def dispatch void format(Route route, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (segment : route.segment) {
			segment.format
		}
	}
	
	// TODO: implement for ReGet, RePost, RePut, ReDelete, OpCreate, OpRead, OpUpdate
}