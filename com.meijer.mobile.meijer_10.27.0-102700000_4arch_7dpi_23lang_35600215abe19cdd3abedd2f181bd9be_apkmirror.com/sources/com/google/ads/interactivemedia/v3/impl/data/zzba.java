package com.google.ads.interactivemedia.v3.impl.data;

import android.view.View;

/* loaded from: classes4.dex */
public abstract class zzba {
    public abstract zzbb build();

    public abstract zzba height(int i10);

    public abstract zzba left(int i10);

    public zzba locationOnScreenOfView(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return left(iArr[0]).top(iArr[1]).height(view.getHeight()).width(view.getWidth());
    }

    public abstract zzba top(int i10);

    public abstract zzba width(int i10);
}
