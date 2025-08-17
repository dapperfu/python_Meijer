package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes4.dex */
public interface c {
    void H();

    void a(Activity activity, Bundle bundle, Bundle bundle2);

    View b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    void k(Bundle bundle);

    void n(Bundle bundle);

    void onDestroy();

    void onLowMemory();

    void onPause();

    void onResume();

    void onStart();

    void onStop();
}
