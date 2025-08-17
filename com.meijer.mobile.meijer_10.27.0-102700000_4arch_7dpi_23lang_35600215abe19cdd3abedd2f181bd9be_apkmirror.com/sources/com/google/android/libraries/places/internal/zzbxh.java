package com.google.android.libraries.places.internal;

import Be.p;
import com.google.android.gms.common.api.a;
import java.security.GeneralSecurityException;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes6.dex */
public final class zzbxh extends zzbgm {
    static final zzbyl zza;
    static final zzbsu zzb;
    public static final /* synthetic */ int zzc = 0;
    private static final zzbwd zzf;
    private final zzbsc zzd;
    private SSLSocketFactory zzi;
    private final zzbwn zze = zzbwp.zze();
    private final zzbsu zzg = zzb;
    private final zzbsu zzh = zzbwf.zzc(zzbpf.zzn);
    private final zzbyl zzj = zza;
    private int zzl = 1;
    private final long zzk = zzbpf.zzj;

    @Override // com.google.android.libraries.places.internal.zzbgm
    protected final zzbih zza() {
        return this.zzd;
    }

    static {
        Logger.getLogger(zzbxh.class.getName());
        zzbyk zzbykVar = new zzbyk(zzbyl.zza);
        zzbykVar.zza(zzbyj.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, zzbyj.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, zzbyj.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, zzbyj.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, zzbyj.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, zzbyj.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        zzbykVar.zzc(zzbyx.TLS_1_2);
        zzbykVar.zze(true);
        zza = zzbykVar.zzf();
        TimeUnit.DAYS.toNanos(1000L);
        zzbxc zzbxcVar = new zzbxc();
        zzf = zzbxcVar;
        zzb = zzbwf.zzc(zzbxcVar);
        EnumSet.of(zzbkf.MTLS, zzbkf.CUSTOM_MANAGERS);
    }

    public static zzbxh zze(String str, int i10) {
        return new zzbxh(zzbpf.zzc(str, 443));
    }

    public final zzbxh zzf() {
        p.x(true, "Cannot change security when using ChannelCredentials");
        this.zzl = 1;
        return this;
    }

    final zzbxg zzg() {
        long j10 = this.zzk;
        zzbyl zzbylVar = this.zzj;
        zzbwn zzbwnVar = this.zze;
        return new zzbxg(this.zzg, this.zzh, null, zzi(), null, zzbylVar, 4194304, false, Long.MAX_VALUE, j10, 65535, false, a.e.API_PRIORITY_OTHER, zzbwnVar, false, null, null);
    }

    final int zzh() {
        int i10 = this.zzl;
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        if (i11 == 0) {
            return 443;
        }
        throw new AssertionError("TLS not handled");
    }

    final SSLSocketFactory zzi() {
        int i10 = this.zzl;
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        if (i11 != 0) {
            throw new RuntimeException("Unknown negotiation type: TLS");
        }
        try {
            if (this.zzi == null) {
                this.zzi = SSLContext.getInstance("Default", zzbyv.zze().zzf()).getSocketFactory();
            }
            return this.zzi;
        } catch (GeneralSecurityException e10) {
            throw new RuntimeException("TLS Provider failure", e10);
        }
    }

    private zzbxh(String str) {
        this.zzd = new zzbsc(str, null, null, new zzbxe(this, null), new zzbxd(this, null));
    }
}
