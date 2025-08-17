package com.google.android.libraries.places.internal;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzof {
    public static final Parcelable zza(Bundle bundle, String key, Class clazz) {
        Intrinsics.j(bundle, "<this>");
        Intrinsics.j(key, "key");
        Intrinsics.j(clazz, "clazz");
        Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable(key, clazz) : bundle.getParcelable(key);
        if (parcelable != null) {
            return parcelable;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
