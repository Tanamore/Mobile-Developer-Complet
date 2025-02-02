// Generated by view binder compiler. Do not edit!
package com.bangkit.tanamoretest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bangkit.tanamoretest.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentEnsiklopediaBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton btnSearch;

  @NonNull
  public final EditText etSearch;

  @NonNull
  public final LinearLayout headerLayout;

  @NonNull
  public final ImageView icCamera;

  @NonNull
  public final BottomNavigationView navView;

  @NonNull
  public final TextView pageTitle;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RecyclerView rvPlantList;

  @NonNull
  public final ConstraintLayout searchBar;

  private FragmentEnsiklopediaBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageButton btnSearch, @NonNull EditText etSearch,
      @NonNull LinearLayout headerLayout, @NonNull ImageView icCamera,
      @NonNull BottomNavigationView navView, @NonNull TextView pageTitle,
      @NonNull ProgressBar progressBar, @NonNull RecyclerView rvPlantList,
      @NonNull ConstraintLayout searchBar) {
    this.rootView = rootView;
    this.btnSearch = btnSearch;
    this.etSearch = etSearch;
    this.headerLayout = headerLayout;
    this.icCamera = icCamera;
    this.navView = navView;
    this.pageTitle = pageTitle;
    this.progressBar = progressBar;
    this.rvPlantList = rvPlantList;
    this.searchBar = searchBar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentEnsiklopediaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentEnsiklopediaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_ensiklopedia, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentEnsiklopediaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_search;
      ImageButton btnSearch = ViewBindings.findChildViewById(rootView, id);
      if (btnSearch == null) {
        break missingId;
      }

      id = R.id.etSearch;
      EditText etSearch = ViewBindings.findChildViewById(rootView, id);
      if (etSearch == null) {
        break missingId;
      }

      id = R.id.headerLayout;
      LinearLayout headerLayout = ViewBindings.findChildViewById(rootView, id);
      if (headerLayout == null) {
        break missingId;
      }

      id = R.id.ic_camera;
      ImageView icCamera = ViewBindings.findChildViewById(rootView, id);
      if (icCamera == null) {
        break missingId;
      }

      id = R.id.nav_view;
      BottomNavigationView navView = ViewBindings.findChildViewById(rootView, id);
      if (navView == null) {
        break missingId;
      }

      id = R.id.pageTitle;
      TextView pageTitle = ViewBindings.findChildViewById(rootView, id);
      if (pageTitle == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.rvPlantList;
      RecyclerView rvPlantList = ViewBindings.findChildViewById(rootView, id);
      if (rvPlantList == null) {
        break missingId;
      }

      id = R.id.searchBar;
      ConstraintLayout searchBar = ViewBindings.findChildViewById(rootView, id);
      if (searchBar == null) {
        break missingId;
      }

      return new FragmentEnsiklopediaBinding((ConstraintLayout) rootView, btnSearch, etSearch,
          headerLayout, icCamera, navView, pageTitle, progressBar, rvPlantList, searchBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
