/**
 * generated by Xtext 2.25.0
 */
package rest.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import metamodelREST.Answer;
import metamodelREST.Operation;
import metamodelREST.Request;
import metamodelREST.RestSystem;
import metamodelREST.Route;
import metamodelREST.Segment;
import metamodelREST.Struct;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import rest.services.RestGrammarAccess;

@SuppressWarnings("all")
public class RestFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private RestGrammarAccess _restGrammarAccess;
  
  protected void _format(final RestSystem restSystem, @Extension final IFormattableDocument document) {
    EList<Request> _request = restSystem.getRequest();
    for (final Request request : _request) {
      document.<Request>format(request);
    }
    EList<Struct> _struct = restSystem.getStruct();
    for (final Struct struct : _struct) {
      document.<Struct>format(struct);
    }
    EList<Operation> _operation = restSystem.getOperation();
    for (final Operation operation : _operation) {
      document.<Operation>format(operation);
    }
    EList<Answer> _answer = restSystem.getAnswer();
    for (final Answer answer : _answer) {
      document.<Answer>format(answer);
    }
  }
  
  protected void _format(final Route route, @Extension final IFormattableDocument document) {
    EList<Segment> _segment = route.getSegment();
    for (final Segment segment : _segment) {
      document.<Segment>format(segment);
    }
  }
  
  public void format(final Object restSystem, final IFormattableDocument document) {
    if (restSystem instanceof XtextResource) {
      _format((XtextResource)restSystem, document);
      return;
    } else if (restSystem instanceof RestSystem) {
      _format((RestSystem)restSystem, document);
      return;
    } else if (restSystem instanceof Route) {
      _format((Route)restSystem, document);
      return;
    } else if (restSystem instanceof EObject) {
      _format((EObject)restSystem, document);
      return;
    } else if (restSystem == null) {
      _format((Void)null, document);
      return;
    } else if (restSystem != null) {
      _format(restSystem, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(restSystem, document).toString());
    }
  }
}
