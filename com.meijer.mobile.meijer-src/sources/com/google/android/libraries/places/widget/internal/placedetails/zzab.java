package com.google.android.libraries.places.widget.internal.placedetails;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
final class zzab {
    public static final zzab zza;
    public static final zzab zzb;
    public static final zzab zzc;
    public static final zzab zzd;
    public static final zzab zze;
    public static final zzab zzf;
    private static final /* synthetic */ zzab[] zzg;

    static {
        zzab zzabVar = new zzab("UNKNOWN", 0);
        zza = zzabVar;
        zzab zzabVar2 = new zzab("OPEN_NOW", 1);
        zzb = zzabVar2;
        zzab zzabVar3 = new zzab("OPEN_24_HOURS", 2);
        zzc = zzabVar3;
        zzab zzabVar4 = new zzab("CLOSED", 3);
        zzd = zzabVar4;
        zzab zzabVar5 = new zzab("TEMPORARILY_CLOSED", 4);
        zze = zzabVar5;
        zzab zzabVar6 = new zzab("PERMANENTLY_CLOSED", 5);
        zzf = zzabVar6;
        zzab[] zzabVarArr = {zzabVar, zzabVar2, zzabVar3, zzabVar4, zzabVar5, zzabVar6};
        zzg = zzabVarArr;
        EnumEntriesKt.a(zzabVarArr);
    }

    public static zzab valueOf(String str) {
        return (zzab) Enum.valueOf(zzab.class, str);
    }

    public static zzab[] values() {
        return (zzab[]) zzg.clone();
    }

    private zzab(String str, int i10) {
    }
}
