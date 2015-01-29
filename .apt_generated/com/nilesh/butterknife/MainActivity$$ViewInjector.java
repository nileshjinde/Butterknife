// Generated code from Butter Knife. Do not modify!
package com.nilesh.butterknife;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MainActivity$$ViewInjector {
  public static void inject(Finder finder, final com.nilesh.butterknife.MainActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230722, "field 'hello' and method 'submit'");
    target.hello = (android.widget.Button) view;
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.submit();
        }
      });
    view = finder.findRequiredView(source, 2131230720, "field 'title'");
    target.title = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131230723, "field 'footer'");
    target.footer = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131230721, "field 'subtitle'");
    target.subtitle = (android.widget.TextView) view;
  }

  public static void reset(com.nilesh.butterknife.MainActivity target) {
    target.hello = null;
    target.title = null;
    target.footer = null;
    target.subtitle = null;
  }
}
