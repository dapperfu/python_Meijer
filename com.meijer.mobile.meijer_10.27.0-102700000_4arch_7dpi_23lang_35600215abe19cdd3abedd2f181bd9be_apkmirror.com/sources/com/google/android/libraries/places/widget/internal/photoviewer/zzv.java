package com.google.android.libraries.places.widget.internal.photoviewer;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.google.android.libraries.places.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class zzv {
    private final Context zza;
    private final int zzb;

    public zzv(Context context, int i10) {
        Intrinsics.j(context, "context");
        this.zza = context;
        this.zzb = i10;
    }

    private final float zzc(int i10, int i11) throws Resources.NotFoundException {
        int[] PlacesMaterialThemeAttrs = R.styleable.PlacesMaterialThemeAttrs;
        Intrinsics.i(PlacesMaterialThemeAttrs, "PlacesMaterialThemeAttrs");
        TypedArray typedArrayObtainStyledAttributes = this.zza.obtainStyledAttributes(this.zzb, PlacesMaterialThemeAttrs);
        float dimension = typedArrayObtainStyledAttributes.getDimension(i10, r1.getResources().getDimensionPixelSize(i11));
        typedArrayObtainStyledAttributes.recycle();
        return dimension;
    }

    public final float zza() {
        return zzc(R.styleable.PlacesMaterialThemeAttrs_placesSpacingMedium, R.dimen.gmp_sys_measurement_spacing_medium);
    }

    public final float zzb() {
        return zzc(R.styleable.PlacesMaterialThemeAttrs_placesSpacingLarge, R.dimen.gmp_sys_measurement_spacing_large);
    }
}
