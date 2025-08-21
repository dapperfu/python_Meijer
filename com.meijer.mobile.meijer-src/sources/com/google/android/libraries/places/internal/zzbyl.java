package com.google.android.libraries.places.internal;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes6.dex */
public final class zzbyl {
    public static final zzbyl zza;
    private static final zzbyj[] zzd;
    final boolean zzb;
    final boolean zzc;
    private final String[] zze;
    private final String[] zzf;

    private zzbyl(zzbyk zzbykVar) {
        this.zzb = true;
        this.zze = zzbykVar.zzg();
        this.zzf = zzbykVar.zzh();
        this.zzc = zzbykVar.zzi();
    }

    public final boolean zza() {
        return this.zzc;
    }

    final /* synthetic */ String[] zzc() {
        return this.zze;
    }

    final /* synthetic */ String[] zzd() {
        return this.zzf;
    }

    static {
        zzbyj[] zzbyjVarArr = {zzbyj.TLS_AES_128_GCM_SHA256, zzbyj.TLS_AES_256_GCM_SHA384, zzbyj.TLS_CHACHA20_POLY1305_SHA256, zzbyj.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, zzbyj.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, zzbyj.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, zzbyj.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, zzbyj.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, zzbyj.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, zzbyj.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, zzbyj.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, zzbyj.TLS_RSA_WITH_AES_128_GCM_SHA256, zzbyj.TLS_RSA_WITH_AES_256_GCM_SHA384, zzbyj.TLS_RSA_WITH_AES_128_CBC_SHA, zzbyj.TLS_RSA_WITH_AES_256_CBC_SHA, zzbyj.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        zzd = zzbyjVarArr;
        zzbyk zzbykVar = new zzbyk(true);
        zzbykVar.zza(zzbyjVarArr);
        zzbyx zzbyxVar = zzbyx.TLS_1_3;
        zzbyx zzbyxVar2 = zzbyx.TLS_1_2;
        zzbykVar.zzc(zzbyxVar, zzbyxVar2);
        zzbykVar.zze(true);
        zzbyl zzbylVar = new zzbyl(zzbykVar);
        zza = zzbylVar;
        zzbyk zzbykVar2 = new zzbyk(zzbylVar);
        zzbykVar2.zzc(zzbyxVar, zzbyxVar2, zzbyx.TLS_1_1, zzbyx.TLS_1_0);
        zzbykVar2.zze(true);
    }

    /* synthetic */ zzbyl(zzbyk zzbykVar, byte[] bArr) {
        this(zzbykVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbyl)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzbyl zzbylVar = (zzbyl) obj;
        boolean z10 = zzbylVar.zzb;
        return Arrays.equals(this.zze, zzbylVar.zze) && Arrays.equals(this.zzf, zzbylVar.zzf) && this.zzc == zzbylVar.zzc;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.zze) + 527) * 31) + Arrays.hashCode(this.zzf)) * 31) + (!this.zzc ? 1 : 0);
    }

    public final String toString() {
        List listZza;
        zzbyx zzbyxVar;
        String[] strArr = this.zze;
        if (strArr == null) {
            listZza = null;
        } else {
            zzbyj[] zzbyjVarArr = new zzbyj[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                String str = strArr[i10];
                zzbyj zzbyjVar = zzbyj.TLS_RSA_WITH_NULL_MD5;
                zzbyjVarArr[i10] = str.startsWith("SSL_") ? zzbyj.zza("TLS_".concat(String.valueOf(str.substring(4)))) : zzbyj.zza(str);
            }
            listZza = zzbyy.zza(zzbyjVarArr);
        }
        String string = listZza == null ? "[use default]" : listZza.toString();
        String[] strArr2 = this.zzf;
        zzbyx[] zzbyxVarArr = new zzbyx[strArr2.length];
        for (int i11 = 0; i11 < strArr2.length; i11++) {
            String str2 = strArr2[i11];
            zzbyx zzbyxVar2 = zzbyx.TLS_1_3;
            if ("TLSv1.3".equals(str2)) {
                zzbyxVar = zzbyx.TLS_1_3;
            } else if ("TLSv1.2".equals(str2)) {
                zzbyxVar = zzbyx.TLS_1_2;
            } else if ("TLSv1.1".equals(str2)) {
                zzbyxVar = zzbyx.TLS_1_1;
            } else if ("TLSv1".equals(str2)) {
                zzbyxVar = zzbyx.TLS_1_0;
            } else {
                if (!"SSLv3".equals(str2)) {
                    throw new IllegalArgumentException("Unexpected TLS version: ".concat(String.valueOf(str2)));
                }
                zzbyxVar = zzbyx.SSL_3_0;
            }
            zzbyxVarArr[i11] = zzbyxVar;
        }
        String strValueOf = String.valueOf(zzbyy.zza(zzbyxVarArr));
        boolean z10 = this.zzc;
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 42 + strValueOf.length() + 24 + String.valueOf(z10).length() + 1);
        sb2.append("ConnectionSpec(cipherSuites=");
        sb2.append(string);
        sb2.append(", tlsVersions=");
        sb2.append(strValueOf);
        sb2.append(", supportsTlsExtensions=");
        sb2.append(z10);
        sb2.append(")");
        return sb2.toString();
    }

    public final void zzb(SSLSocket sSLSocket, boolean z10) {
        String[] strArr = this.zze;
        String[] strArr2 = strArr != null ? (String[]) zzbyy.zzb(String.class, strArr, sSLSocket.getEnabledCipherSuites()) : null;
        String[] strArr3 = (String[]) zzbyy.zzb(String.class, this.zzf, sSLSocket.getEnabledProtocols());
        zzbyk zzbykVar = new zzbyk(this);
        zzbykVar.zzb(strArr2);
        zzbykVar.zzd(strArr3);
        zzbyl zzbylVar = new zzbyl(zzbykVar);
        sSLSocket.setEnabledProtocols(zzbylVar.zzf);
        String[] strArr4 = zzbylVar.zze;
        if (strArr4 != null) {
            sSLSocket.setEnabledCipherSuites(strArr4);
        }
    }
}
