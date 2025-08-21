package com.google.android.libraries.places.internal;

import De.p;
import De.v;
import com.google.common.util.concurrent.q;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public final class zzcaj {
    static final zzbfc zza;
    private static final Logger zzb = Logger.getLogger(zzcaj.class.getName());

    private zzcaj() {
    }

    private static RuntimeException zzc(zzbfi zzbfiVar, Throwable th2) {
        try {
            zzbfiVar.zze(null, th2);
        } catch (Error | RuntimeException e10) {
            zzb.logp(Level.SEVERE, "io.grpc.stub.ClientCalls", "cancelThrow", "RuntimeException encountered while closing call", e10);
        }
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
        throw new AssertionError(th2);
    }

    static {
        if (!v.b(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        }
        zza = zzbfc.zza("internal-stub-type");
    }

    public static void zza(zzbfi zzbfiVar, Object obj, zzcan zzcanVar) {
        p.r(zzcanVar, "responseObserver");
        zzd(zzbfiVar, obj, new zzcag(zzcanVar, new zzcad(zzbfiVar, false)));
    }

    public static q zzb(zzbfi zzbfiVar, Object obj) {
        zzcae zzcaeVar = new zzcae(zzbfiVar);
        zzd(zzbfiVar, obj, new zzcai(zzcaeVar));
        return zzcaeVar;
    }

    private static void zzd(zzbfi zzbfiVar, Object obj, zzcaf zzcafVar) {
        zzbfiVar.zza(zzcafVar, new zzbip());
        zzcafVar.zze();
        try {
            zzbfiVar.zzb(obj);
            zzbfiVar.zzd();
        } catch (Error | RuntimeException e10) {
            throw zzc(zzbfiVar, e10);
        }
    }
}
