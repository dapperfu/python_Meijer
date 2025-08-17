package com.google.android.libraries.places.internal;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class zzon {
    public static final zzon zza;
    public static final zzon zzb;
    public static final zzon zzc;
    private static final /* synthetic */ zzon[] zzd;

    static {
        zzon zzonVar = new zzon("REVIEWS_ARENT_VERIFIED", 0);
        zza = zzonVar;
        zzon zzonVar2 = new zzon("ABOUT_RESULTS", 1);
        zzb = zzonVar2;
        zzon zzonVar3 = new zzon("REVIEW_ORDERING", 2);
        zzc = zzonVar3;
        zzon[] zzonVarArr = {zzonVar, zzonVar2, zzonVar3};
        zzd = zzonVarArr;
        EnumEntriesKt.a(zzonVarArr);
    }

    public static zzon valueOf(String str) {
        return (zzon) Enum.valueOf(zzon.class, str);
    }

    public static zzon[] values() {
        return (zzon[]) zzd.clone();
    }

    private zzon(String str, int i10) {
    }
}
