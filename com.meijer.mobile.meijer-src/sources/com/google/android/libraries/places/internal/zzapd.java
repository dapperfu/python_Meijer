package com.google.android.libraries.places.internal;

import Ee.L;

/* loaded from: classes6.dex */
public final class zzapd {
    public static zzbfj zza(final zzcbd zzcbdVar) {
        return new zzapc(new zzcbd() { // from class: com.google.android.libraries.places.internal.zzapb
            @Override // com.google.android.libraries.places.internal.zzcbd
            public final /* synthetic */ Object zzb() {
                return L.y(((zzew) zzcbdVar).zzb());
            }
        }, 2, zzbbl.class, zzbbl.class);
    }

    static /* synthetic */ void zzb(zzbiu zzbiuVar, Class cls, boolean z10) throws zzbjw {
        Class clsZzc;
        boolean z11;
        try {
            clsZzc = ((zzbit) (z10 ? zzbiuVar.zzf() : zzbiuVar.zzg())).zzc();
            z11 = false;
        } catch (ClassCastException unused) {
            clsZzc = Object.class;
            z11 = true;
        }
        if (cls.isAssignableFrom(clsZzc)) {
            return;
        }
        String str = true != z10 ? "response" : "request";
        zzbjv zzbjvVar = zzbjv.zzh;
        String strZzb = zzbiuVar.zzb();
        String name = clsZzc.getName();
        String str2 = true != z11 ? "" : ", assumed because method doesn't use ReflectableMarshaller";
        String string = cls.toString();
        StringBuilder sb2 = new StringBuilder(str.length() + 52 + String.valueOf(strZzb).length() + 2 + name.length() + str2.length() + 24 + string.length());
        sb2.append("AsyncClientInterceptor: The ");
        sb2.append(str);
        sb2.append(" message type of method ");
        sb2.append(strZzb);
        sb2.append(" (");
        sb2.append(name);
        sb2.append(str2);
        sb2.append(") must be a subclass of ");
        sb2.append(string);
        throw new zzbjw(zzbjvVar.zze(sb2.toString()), null);
    }
}
