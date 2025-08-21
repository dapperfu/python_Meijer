package com.google.android.libraries.places.api.model;

import De.p;
import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes6.dex */
public abstract class EncodedPolyline implements Polyline {
    @RecentlyNonNull
    public abstract String getEncodedPolyline();

    @RecentlyNonNull
    @SuppressLint({"AmbiguousGranuleClass"})
    public static EncodedPolyline newInstance(@RecentlyNonNull String str) {
        p.e(!TextUtils.isEmpty(str), "Encoded polyline must not contain empty values.");
        return new zzcm(str);
    }
}
