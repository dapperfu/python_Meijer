package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzmw {
    public static zzaks zza(zzmp zzmpVar, zzmo zzmoVar) {
        return zzb(zzmpVar, zzmoVar == zzmo.AUTOCOMPLETE_WIDGET ? 2 : 3, zzmoVar, com.google.android.libraries.places.api.auth.zzb.zza);
    }

    public static zzaks zzb(zzmp zzmpVar, int i10, zzmo zzmoVar, com.google.android.libraries.places.api.auth.zzb zzbVar) {
        int i11;
        zzmo zzmoVar2 = zzmo.PROGRAMMATIC_KOTLIN_API;
        int iOrdinal = zzmpVar.zzc().ordinal();
        if (iOrdinal != 0) {
            i11 = 4;
            if (iOrdinal != 1) {
                i11 = iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? 1 : 8 : 7 : 5;
            }
        } else {
            i11 = 2;
        }
        int i12 = zzmoVar == zzmoVar2 ? 2 : 3;
        zzaks zzaksVarZza = zzakz.zza();
        zzul zzulVarZza = zzuq.zza();
        zzulVarZza.zza(zzmpVar.zza());
        zzulVarZza.zzb(zzmpVar.zzb());
        zzaksVarZza.zza((zzuq) zzulVarZza.zzG());
        zzaksVarZza.zzg(i10 == 2);
        zzaksVarZza.zzr(i10);
        zzaksVarZza.zzq(i11);
        zzaksVarZza.zzs(i12);
        zzaksVarZza.zzi("4.4.1");
        zzaksVarZza.zzm(zzbVar.zza());
        String strZzc = zzbVar.zzc();
        if (strZzc != null) {
            zzahk zzahkVarZza = zzahl.zza();
            zzahkVarZza.zza(strZzc);
            zzaksVarZza.zzl(zzahkVarZza);
        }
        return zzaksVarZza;
    }
}
