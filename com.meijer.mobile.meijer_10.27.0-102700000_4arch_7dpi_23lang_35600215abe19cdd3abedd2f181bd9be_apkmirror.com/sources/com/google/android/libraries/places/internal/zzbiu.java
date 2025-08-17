package com.google.android.libraries.places.internal;

import Be.j;
import Be.p;
import com.medallia.digital.mobilesdk.q2;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes6.dex */
public final class zzbiu {
    private final zzbis zza;
    private final String zzb;
    private final String zzc;
    private final zzbir zzd;
    private final zzbir zze;
    private final boolean zzf;

    public final zzbis zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final zzbir zzf() {
        return this.zzd;
    }

    public final zzbir zzg() {
        return this.zze;
    }

    public static String zzh(String str, String str2) {
        String str3 = (String) p.r(str, "fullServiceName");
        String str4 = (String) p.r(str2, "methodName");
        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
        sb2.append(str3);
        sb2.append(q2.f92724c);
        sb2.append(str4);
        return sb2.toString();
    }

    public static zzbiq zzi(zzbir zzbirVar, zzbir zzbirVar2) {
        zzbiq zzbiqVar = new zzbiq(null);
        zzbiqVar.zza(null);
        zzbiqVar.zzb(null);
        return zzbiqVar;
    }

    public final Object zzd(InputStream inputStream) {
        return this.zze.zzb(inputStream);
    }

    public final InputStream zze(Object obj) {
        return this.zzd.zza(obj);
    }

    /* synthetic */ zzbiu(zzbis zzbisVar, String str, zzbir zzbirVar, zzbir zzbirVar2, Object obj, boolean z10, boolean z11, boolean z12, byte[] bArr) {
        String strSubstring;
        new AtomicReferenceArray(2);
        this.zza = (zzbis) p.r(zzbisVar, "type");
        this.zzb = (String) p.r(str, "fullMethodName");
        int iLastIndexOf = ((String) p.r(str, "fullMethodName")).lastIndexOf(47);
        if (iLastIndexOf == -1) {
            strSubstring = null;
        } else {
            strSubstring = str.substring(0, iLastIndexOf);
        }
        this.zzc = strSubstring;
        this.zzd = (zzbir) p.r(zzbirVar, "requestMarshaller");
        this.zze = (zzbir) p.r(zzbirVar2, "responseMarshaller");
        this.zzf = z12;
    }

    public final String toString() {
        return j.c(this).d("fullMethodName", this.zzb).d("type", this.zza).e("idempotent", false).e("safe", false).e("sampledToLocalTracing", this.zzf).d("requestMarshaller", this.zzd).d("responseMarshaller", this.zze).d("schemaDescriptor", null).m().toString();
    }
}
