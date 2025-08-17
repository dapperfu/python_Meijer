package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;

/* loaded from: classes4.dex */
public interface d<S> extends Parcelable {
    View E2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, a aVar, n<S> nVar);

    S K();

    void M3(long j10);

    String T1(Context context);

    String U0(Context context);

    Collection<o2.d<Long, Long>> W1();

    int X0(Context context);

    boolean d3();

    Collection<Long> o3();
}
