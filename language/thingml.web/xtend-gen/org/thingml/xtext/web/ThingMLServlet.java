/**
 * generated by Xtext 2.10.0
 */
package org.thingml.xtext.web;

import com.google.inject.Injector;
import javax.servlet.annotation.WebServlet;
import org.eclipse.xtext.util.DisposableRegistry;
import org.eclipse.xtext.web.servlet.XtextServlet;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.thingml.xtext.web.ThingMLWebSetup;

/**
 * Deploy this class into a servlet container to enable DSL-specific services.
 */
@WebServlet(name = "XtextServices", urlPatterns = "/xtext-service/*")
@SuppressWarnings("all")
public class ThingMLServlet extends XtextServlet {
  private DisposableRegistry disposableRegistry;
  
  @Override
  public void init() {
    try {
      super.init();
      final Injector injector = new ThingMLWebSetup().createInjectorAndDoEMFRegistration();
      this.disposableRegistry = injector.<DisposableRegistry>getInstance(DisposableRegistry.class);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public void destroy() {
    if ((this.disposableRegistry != null)) {
      this.disposableRegistry.dispose();
      this.disposableRegistry = null;
    }
    super.destroy();
  }
}
