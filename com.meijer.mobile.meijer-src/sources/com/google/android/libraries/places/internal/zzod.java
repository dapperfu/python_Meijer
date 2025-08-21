package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.google.android.libraries.places.R;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzod {
    @JvmStatic
    public static final int zza(Context context, int i10) throws Resources.NotFoundException {
        Intrinsics.j(context, "context");
        zzoe zzoeVar = zzoe.zza;
        int[] PlacesMaterialThemeAttrs = R.styleable.PlacesMaterialThemeAttrs;
        Intrinsics.i(PlacesMaterialThemeAttrs, "PlacesMaterialThemeAttrs");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, PlacesMaterialThemeAttrs);
        int i11 = typedArrayObtainStyledAttributes.getInt((typedArrayObtainStyledAttributes.getResources().getConfiguration().uiMode & 48) == 32 ? R.styleable.PlacesMaterialThemeAttrs_placesColorAttributionDarkTheme : R.styleable.PlacesMaterialThemeAttrs_placesColorAttributionLightTheme, -1);
        zzoe zzoeVar2 = zzoe.zza;
        if (i11 != zzoeVar2.zza()) {
            zzoeVar2 = zzoe.zzb;
            if (i11 != zzoeVar2.zza()) {
                zzoe zzoeVar3 = zzoe.zzc;
                if (i11 == zzoeVar3.zza()) {
                    zzoeVar2 = zzoeVar3;
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return context.getColor(zzoeVar2.zzb());
    }
}
