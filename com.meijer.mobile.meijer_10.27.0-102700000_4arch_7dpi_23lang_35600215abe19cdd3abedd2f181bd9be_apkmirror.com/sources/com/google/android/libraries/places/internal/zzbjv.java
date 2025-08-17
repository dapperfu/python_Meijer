package com.google.android.libraries.places.internal;

import Be.j;
import Be.l;
import Be.p;
import Be.z;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* loaded from: classes6.dex */
public final class zzbjv {
    public static final zzbjv zza;
    public static final zzbjv zzb;
    public static final zzbjv zzc;
    public static final zzbjv zzd;
    public static final zzbjv zze;
    public static final zzbjv zzf;
    public static final zzbjv zzg;
    public static final zzbjv zzh;
    public static final zzbjv zzi;
    static final zzbil zzj;
    static final zzbil zzk;
    private static final List zzl;
    private static final zzbio zzm;
    private final zzbjs zzn;
    private final String zzo;
    private final Throwable zzp;

    static /* synthetic */ zzbjv zzk(byte[] bArr) {
        int i10;
        byte b10;
        int length = bArr.length;
        char c10 = 0;
        if (length == 1) {
            if (bArr[0] == 48) {
                return zza;
            }
            length = 1;
        }
        if (length != 1) {
            if (length == 2 && (b10 = bArr[0]) >= 48 && b10 <= 57) {
                i10 = (b10 - 48) * 10;
                c10 = 1;
            }
            return zzc.zze("Unknown code ".concat(new String(bArr, StandardCharsets.US_ASCII)));
        }
        i10 = 0;
        byte b11 = bArr[c10];
        if (b11 >= 48 && b11 <= 57) {
            int i11 = i10 + (b11 - 48);
            List list = zzl;
            if (i11 < list.size()) {
                return (zzbjv) list.get(i11);
            }
        }
        return zzc.zze("Unknown code ".concat(new String(bArr, StandardCharsets.US_ASCII)));
    }

    public final zzbjs zzg() {
        return this.zzn;
    }

    public final String zzh() {
        return this.zzo;
    }

    public final Throwable zzi() {
        return this.zzp;
    }

    static {
        TreeMap treeMap = new TreeMap();
        zzbjs[] zzbjsVarArrValues = zzbjs.values();
        int length = zzbjsVarArrValues.length;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            byte[] bArr = null;
            if (i10 >= length) {
                zzl = Collections.unmodifiableList(new ArrayList(treeMap.values()));
                zza = zzbjs.OK.zzb();
                zzb = zzbjs.CANCELLED.zzb();
                zzc = zzbjs.UNKNOWN.zzb();
                zzbjs.INVALID_ARGUMENT.zzb();
                zzd = zzbjs.DEADLINE_EXCEEDED.zzb();
                zzbjs.NOT_FOUND.zzb();
                zzbjs.ALREADY_EXISTS.zzb();
                zze = zzbjs.PERMISSION_DENIED.zzb();
                zzbjs.UNAUTHENTICATED.zzb();
                zzf = zzbjs.RESOURCE_EXHAUSTED.zzb();
                zzg = zzbjs.FAILED_PRECONDITION.zzb();
                zzbjs.ABORTED.zzb();
                zzbjs.OUT_OF_RANGE.zzb();
                zzbjs.UNIMPLEMENTED.zzb();
                zzh = zzbjs.INTERNAL.zzb();
                zzi = zzbjs.UNAVAILABLE.zzb();
                zzbjs.DATA_LOSS.zzb();
                zzbjt zzbjtVar = new zzbjt(bArr);
                int i11 = zzbil.zza;
                zzj = new zzbin("grpc-status", z10, zzbjtVar, bArr);
                zzbju zzbjuVar = new zzbju(null);
                zzm = zzbjuVar;
                zzk = new zzbin("grpc-message", z10, zzbjuVar, bArr);
                return;
            }
            zzbjs zzbjsVar = zzbjsVarArrValues[i10];
            zzbjv zzbjvVar = (zzbjv) treeMap.put(Integer.valueOf(zzbjsVar.zza()), new zzbjv(zzbjsVar, null, null));
            if (zzbjvVar != null) {
                String strName = zzbjvVar.zzn.name();
                String strName2 = zzbjsVar.name();
                StringBuilder sb2 = new StringBuilder(String.valueOf(strName).length() + 34 + String.valueOf(strName2).length());
                sb2.append("Code value duplication between ");
                sb2.append(strName);
                sb2.append(" & ");
                sb2.append(strName2);
                throw new IllegalStateException(sb2.toString());
            }
            i10++;
        }
    }

    public static zzbjv zza(int i10) {
        if (i10 >= 0) {
            List list = zzl;
            if (i10 < list.size()) {
                return (zzbjv) list.get(i10);
            }
        }
        zzbjv zzbjvVar = zzc;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 13);
        sb2.append("Unknown code ");
        sb2.append(i10);
        return zzbjvVar.zze(sb2.toString());
    }

    public static zzbjv zzb(Throwable th2) {
        for (Throwable cause = (Throwable) p.r(th2, "t"); cause != null; cause = cause.getCause()) {
            if (cause instanceof zzbjw) {
                return ((zzbjw) cause).zza();
            }
            if (cause instanceof zzbjy) {
                return ((zzbjy) cause).zza();
            }
        }
        return zzc.zzd(th2);
    }

    static String zzc(zzbjv zzbjvVar) {
        String str = zzbjvVar.zzo;
        zzbjs zzbjsVar = zzbjvVar.zzn;
        if (str == null) {
            return zzbjsVar.toString();
        }
        String strValueOf = String.valueOf(zzbjsVar);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 2 + str.length());
        sb2.append(strValueOf);
        sb2.append(": ");
        sb2.append(str);
        return sb2.toString();
    }

    public final zzbjv zzd(Throwable th2) {
        return l.a(this.zzp, th2) ? this : new zzbjv(this.zzn, this.zzo, th2);
    }

    public final zzbjv zze(String str) {
        return l.a(this.zzo, str) ? this : new zzbjv(this.zzn, str, this.zzp);
    }

    public final zzbjv zzf(String str) {
        String str2 = this.zzo;
        if (str2 == null) {
            return new zzbjv(this.zzn, str, this.zzp);
        }
        zzbjs zzbjsVar = this.zzn;
        StringBuilder sb2 = new StringBuilder(str2.length() + 1 + str.length());
        sb2.append(str2);
        sb2.append("\n");
        sb2.append(str);
        return new zzbjv(zzbjsVar, sb2.toString(), this.zzp);
    }

    public final boolean zzj() {
        return zzbjs.OK == this.zzn;
    }

    private zzbjv(zzbjs zzbjsVar, String str, Throwable th2) {
        this.zzn = (zzbjs) p.r(zzbjsVar, "code");
        this.zzo = str;
        this.zzp = th2;
    }

    public final String toString() {
        j.b bVarD = j.c(this).d("code", this.zzn.name()).d("description", this.zzo);
        Throwable th2 = this.zzp;
        Object objE = th2;
        if (th2 != null) {
            objE = z.e(th2);
        }
        return bVarD.d("cause", objE).toString();
    }
}
