package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.R;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class zzoe {
    public static final zzoe zza;
    public static final zzoe zzb;
    public static final zzoe zzc;
    private static final /* synthetic */ zzoe[] zzf;
    private final int zzd;
    private final int zze;

    public final int zza() {
        return this.zzd;
    }

    public final int zzb() {
        return this.zze;
    }

    static {
        zzoe zzoeVar = new zzoe("WHITE", 0, 0, R.color.place_details_attribution_color_white);
        zza = zzoeVar;
        zzoe zzoeVar2 = new zzoe("GRAY", 1, 1, R.color.place_details_attribution_color_gray);
        zzb = zzoeVar2;
        zzoe zzoeVar3 = new zzoe("BLACK", 2, 2, R.color.place_details_attribution_color_black);
        zzc = zzoeVar3;
        zzoe[] zzoeVarArr = {zzoeVar, zzoeVar2, zzoeVar3};
        zzf = zzoeVarArr;
        EnumEntriesKt.a(zzoeVarArr);
    }

    public static zzoe valueOf(String str) {
        return (zzoe) Enum.valueOf(zzoe.class, str);
    }

    public static zzoe[] values() {
        return (zzoe[]) zzf.clone();
    }

    private zzoe(String str, int i10, int i11, int i12) {
        this.zzd = i11;
        this.zze = i12;
    }
}
