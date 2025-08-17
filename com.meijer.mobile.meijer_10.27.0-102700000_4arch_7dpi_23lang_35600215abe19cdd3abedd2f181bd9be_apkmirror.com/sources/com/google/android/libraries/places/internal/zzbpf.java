package com.google.android.libraries.places.internal;

import Be.p;
import Be.t;
import Be.v;
import Be.w;
import com.google.common.util.concurrent.A;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public final class zzbpf {
    public static final zzbil zza;
    public static final zzbil zzb;
    public static final zzbil zzc;
    public static final zzbil zzd;
    public static final zzbil zze;
    static final zzbil zzf;
    public static final zzbil zzg;
    public static final zzbil zzh;
    public static final zzbil zzi;
    public static final long zzj;
    public static final zzbjn zzk;
    public static final zzbfc zzl;
    public static final zzbwd zzm;
    public static final zzbwd zzn;
    public static final w zzo;
    private static final Logger zzp = Logger.getLogger(zzbpf.class.getName());
    private static final Set zzq = Collections.unmodifiableSet(EnumSet.of(zzbjs.OK, zzbjs.INVALID_ARGUMENT, zzbjs.NOT_FOUND, zzbjs.ALREADY_EXISTS, zzbjs.FAILED_PRECONDITION, zzbjs.ABORTED, zzbjs.OUT_OF_RANGE, zzbjs.DATA_LOSS));
    private static final zzbfp zzr;

    private zzbpf() {
    }

    static {
        Charset.forName("US-ASCII");
        zza = zzbil.zzc("grpc-timeout", new zzbpe());
        zzbik zzbikVar = zzbip.zza;
        zzb = zzbil.zzc("grpc-encoding", zzbikVar);
        zzc = zzbhh.zza("grpc-accept-encoding", new zzbpc(null));
        zzd = zzbil.zzc("content-encoding", zzbikVar);
        zze = zzbhh.zza("accept-encoding", new zzbpc(null));
        zzf = zzbil.zzc("content-length", zzbikVar);
        zzg = zzbil.zzc("content-type", zzbikVar);
        zzh = zzbil.zzc("te", zzbikVar);
        zzi = zzbil.zzc("user-agent", zzbikVar);
        t.e(',').j();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        zzj = timeUnit.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        timeUnit.toNanos(20L);
        zzk = new zzbtt();
        zzl = zzbfc.zza("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        zzr = new zzboy();
        zzm = new zzboz();
        zzn = new zzbpa();
        zzo = new zzbpb();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.libraries.places.internal.zzbjv zza(int r3) {
        /*
            r0 = 100
            if (r3 < r0) goto Lb
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 >= r0) goto Lb
            com.google.android.libraries.places.internal.zzbjs r0 = com.google.android.libraries.places.internal.zzbjs.INTERNAL
            goto L37
        Lb:
            r0 = 400(0x190, float:5.6E-43)
            if (r3 == r0) goto L35
            r0 = 401(0x191, float:5.62E-43)
            if (r3 == r0) goto L32
            r0 = 403(0x193, float:5.65E-43)
            if (r3 == r0) goto L2f
            r0 = 404(0x194, float:5.66E-43)
            if (r3 == r0) goto L2c
            r0 = 429(0x1ad, float:6.01E-43)
            if (r3 == r0) goto L29
            r0 = 431(0x1af, float:6.04E-43)
            if (r3 == r0) goto L35
            switch(r3) {
                case 502: goto L29;
                case 503: goto L29;
                case 504: goto L29;
                default: goto L26;
            }
        L26:
            com.google.android.libraries.places.internal.zzbjs r0 = com.google.android.libraries.places.internal.zzbjs.UNKNOWN
            goto L37
        L29:
            com.google.android.libraries.places.internal.zzbjs r0 = com.google.android.libraries.places.internal.zzbjs.UNAVAILABLE
            goto L37
        L2c:
            com.google.android.libraries.places.internal.zzbjs r0 = com.google.android.libraries.places.internal.zzbjs.UNIMPLEMENTED
            goto L37
        L2f:
            com.google.android.libraries.places.internal.zzbjs r0 = com.google.android.libraries.places.internal.zzbjs.PERMISSION_DENIED
            goto L37
        L32:
            com.google.android.libraries.places.internal.zzbjs r0 = com.google.android.libraries.places.internal.zzbjs.UNAUTHENTICATED
            goto L37
        L35:
            com.google.android.libraries.places.internal.zzbjs r0 = com.google.android.libraries.places.internal.zzbjs.INTERNAL
        L37:
            com.google.android.libraries.places.internal.zzbjv r0 = r0.zzb()
            java.lang.String r1 = java.lang.String.valueOf(r3)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 17
            r2.<init>(r1)
            java.lang.String r1 = "HTTP status code "
            r2.append(r1)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            com.google.android.libraries.places.internal.zzbjv r3 = r0.zze(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbpf.zza(int):com.google.android.libraries.places.internal.zzbjv");
    }

    public static URI zzb(String str) {
        String str2;
        p.r(str, "authority");
        try {
            str2 = str;
            try {
                return new URI(null, str2, null, null, null);
            } catch (URISyntaxException e10) {
                e = e10;
                throw new IllegalArgumentException("Invalid authority: ".concat(String.valueOf(str2)), e);
            }
        } catch (URISyntaxException e11) {
            e = e11;
            str2 = str;
        }
    }

    public static String zzc(String str, int i10) {
        String str2;
        try {
            str2 = str;
            try {
                return new URI(null, null, str2, 443, null, null, null).getAuthority();
            } catch (URISyntaxException e10) {
                e = e10;
                URISyntaxException uRISyntaxException = e;
                StringBuilder sb2 = new StringBuilder(str2.length() + 26);
                sb2.append("Invalid host or port: ");
                sb2.append(str2);
                sb2.append(" 443");
                throw new IllegalArgumentException(sb2.toString(), uRISyntaxException);
            }
        } catch (URISyntaxException e11) {
            e = e11;
            str2 = str;
        }
    }

    public static ThreadFactory zzd(String str, boolean z10) {
        return new A().e(true).f(str).b();
    }

    public static zzbjv zzi(zzbjv zzbjvVar) {
        p.d(zzbjvVar != null);
        if (!zzq.contains(zzbjvVar.zzg())) {
            return zzbjvVar;
        }
        zzbjv zzbjvVar2 = zzbjv.zzh;
        String strValueOf = String.valueOf(zzbjvVar.zzg());
        String strZzh = zzbjvVar.zzh();
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 47 + String.valueOf(strZzh).length());
        sb2.append("Inappropriate status code from control plane: ");
        sb2.append(strValueOf);
        sb2.append(" ");
        sb2.append(strZzh);
        return zzbjvVar2.zze(sb2.toString()).zzd(zzbjvVar.zzi());
    }

    static zzblu zze(zzbht zzbhtVar, boolean z10) {
        zzblu zzbluVarZza;
        zzbhx zzbhxVarZze = zzbhtVar.zze();
        if (zzbhxVarZze != null) {
            zzbluVarZza = ((zzbwm) zzbhxVarZze.zze()).zza();
        } else {
            zzbluVarZza = null;
        }
        if (zzbluVarZza != null) {
            return zzbluVarZza;
        }
        if (!zzbhtVar.zzf().zzj()) {
            if (zzbhtVar.zzg()) {
                return new zzbop(zzi(zzbhtVar.zzf()), zzbls.DROPPED);
            }
            if (!z10) {
                return new zzbop(zzi(zzbhtVar.zzf()), zzbls.PROCESSED);
            }
        }
        return null;
    }

    public static zzbfp[] zzf(zzbfd zzbfdVar, zzbip zzbipVar, int i10, boolean z10) {
        List listZzg = zzbfdVar.zzg();
        int size = listZzg.size();
        zzbfp[] zzbfpVarArr = new zzbfp[size + 1];
        zzbfn zzbfnVarZza = zzbfo.zza();
        zzbfnVarZza.zza(zzbfdVar);
        zzbfnVarZza.zzb(i10);
        zzbfnVarZza.zzc(z10);
        zzbfo zzbfoVarZzd = zzbfnVarZza.zzd();
        for (int i11 = 0; i11 < listZzg.size(); i11++) {
            zzbfpVarArr[i11] = ((zzbfm) listZzg.get(i11)).zza(zzbfoVarZzd, zzbipVar);
        }
        zzbfpVarArr[size] = zzr;
        return zzbfpVarArr;
    }

    static void zzg(zzbwi zzbwiVar) throws IOException {
        while (true) {
            InputStream inputStreamZza = zzbwiVar.zza();
            if (inputStreamZza != null) {
                zzh(inputStreamZza);
            } else {
                return;
            }
        }
    }

    public static void zzh(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (IOException e10) {
            zzp.logp(Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", (Throwable) e10);
        }
    }

    public static boolean zzj(String str, boolean z10) {
        String strTrim = System.getenv(str);
        if (strTrim == null) {
            strTrim = System.getProperty(str);
        }
        if (strTrim != null) {
            strTrim = strTrim.trim();
        }
        if (z10) {
            if (v.b(strTrim) || Boolean.parseBoolean(strTrim)) {
                return true;
            }
            return false;
        }
        if (!v.b(strTrim) && Boolean.parseBoolean(strTrim)) {
            return true;
        }
        return false;
    }
}
