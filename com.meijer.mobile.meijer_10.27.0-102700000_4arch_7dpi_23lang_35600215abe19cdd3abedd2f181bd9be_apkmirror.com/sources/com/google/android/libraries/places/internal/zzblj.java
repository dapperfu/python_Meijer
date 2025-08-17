package com.google.android.libraries.places.internal;

import Be.p;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
final class zzblj {
    static final Logger zza = Logger.getLogger(zzbfg.class.getName());
    private final Object zzb = new Object();
    private final zzbhf zzc;

    final zzbhf zzd() {
        return this.zzc;
    }

    static void zzc(zzbhf zzbhfVar, Level level, String str) {
        Logger logger = zza;
        if (logger.isLoggable(level)) {
            String strValueOf = String.valueOf(zzbhfVar);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 3 + String.valueOf(str).length());
            sb2.append("[");
            sb2.append(strValueOf);
            sb2.append("] ");
            sb2.append(str);
            LogRecord logRecord = new LogRecord(level, sb2.toString());
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    final void zza(zzbgw zzbgwVar) {
        int iOrdinal = zzbgwVar.zzb.ordinal();
        Level level = iOrdinal != 2 ? iOrdinal != 3 ? Level.FINEST : Level.FINE : Level.FINER;
        synchronized (this.zzb) {
        }
        zzc(this.zzc, level, zzbgwVar.zza);
    }

    final boolean zzb() {
        synchronized (this.zzb) {
        }
        return false;
    }

    zzblj(zzbhf zzbhfVar, int i10, long j10, String str) {
        p.r(str, "description");
        this.zzc = (zzbhf) p.r(zzbhfVar, "logId");
        zzbgu zzbguVar = new zzbgu();
        zzbguVar.zza(str.concat(" created"));
        zzbguVar.zzc(zzbgv.CT_INFO);
        zzbguVar.zzb(j10);
        zza(zzbguVar.zze());
    }
}
