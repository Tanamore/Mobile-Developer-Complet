// Generated by view binder compiler. Do not edit!
package com.bangkit.tanamoretest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bangkit.tanamoretest.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySplashScreen2Binding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final MaterialButton btnNext;

  @NonNull
  public final FrameLayout main;

  private ActivitySplashScreen2Binding(@NonNull FrameLayout rootView,
      @NonNull MaterialButton btnNext, @NonNull FrameLayout main) {
    this.rootView = rootView;
    this.btnNext = btnNext;
    this.main = main;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySplashScreen2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySplashScreen2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_splash_screen2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySplashScreen2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_next;
      MaterialButton btnNext = ViewBindings.findChildViewById(rootView, id);
      if (btnNext == null) {
        break missingId;
      }

      FrameLayout main = (FrameLayout) rootView;

      return new ActivitySplashScreen2Binding((FrameLayout) rootView, btnNext, main);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
