package com.google.android.libraries.places.internal;

import De.p;
import java.util.EnumMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
final class zzbxw {
    private final Logger zza;
    private final Level zzb;

    private final boolean zzl() {
        return this.zza.isLoggable(this.zzb);
    }

    zzbxw(Level level, Class cls) {
        Logger logger = Logger.getLogger(cls.getName());
        this.zzb = (Level) p.r(level, "level");
        this.zza = (Logger) p.r(logger, "logger");
    }

    private static String zzk(zzcbj zzcbjVar) {
        if (zzcbjVar.zzb() <= 64) {
            return zzcbjVar.zzF().zzg();
        }
        return String.valueOf(zzcbjVar.zzG((int) Math.min(zzcbjVar.zzb(), 64L)).zzg()).concat("...");
    }

    final void zza(int i10, int i11, zzcbj zzcbjVar, int i12, boolean z10) {
        if (zzl()) {
            Logger logger = this.zza;
            Level level = this.zzb;
            String strZza = zzbxu.zza(i10);
            String strZzk = zzk(zzcbjVar);
            String strValueOf = String.valueOf(i11);
            StringBuilder sb2 = new StringBuilder(strZza.length() + 16 + strValueOf.length() + 11 + String.valueOf(z10).length() + 8 + String.valueOf(i12).length() + 7 + String.valueOf(strZzk).length());
            sb2.append(strZza);
            sb2.append(" DATA: streamId=");
            sb2.append(i11);
            sb2.append(" endStream=");
            sb2.append(z10);
            sb2.append(" length=");
            sb2.append(i12);
            sb2.append(" bytes=");
            sb2.append(strZzk);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logData", sb2.toString());
        }
    }

    final void zzb(int i10, int i11, List list, boolean z10) {
        if (zzl()) {
            Logger logger = this.zza;
            Level level = this.zzb;
            String string = list.toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 35 + string.length() + 11 + String.valueOf(z10).length());
            sb2.append("INBOUND HEADERS: streamId=");
            sb2.append(i11);
            sb2.append(" headers=");
            sb2.append(string);
            sb2.append(" endStream=");
            sb2.append(z10);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logHeaders", sb2.toString());
        }
    }

    final void zzc(int i10, int i11, zzbyz zzbyzVar) {
        if (zzl()) {
            Logger logger = this.zza;
            Level level = this.zzb;
            String strZza = zzbxu.zza(i10);
            String strValueOf = String.valueOf(zzbyzVar);
            StringBuilder sb2 = new StringBuilder(strZza.length() + 22 + String.valueOf(i11).length() + 11 + strValueOf.length());
            sb2.append(strZza);
            sb2.append(" RST_STREAM: streamId=");
            sb2.append(i11);
            sb2.append(" errorCode=");
            sb2.append(strValueOf);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logRstStream", sb2.toString());
        }
    }

    final void zzd(int i10) {
        if (zzl()) {
            this.zza.logp(this.zzb, "io.grpc.okhttp.OkHttpFrameLogger", "logSettingsAck", zzbxu.zza(2).concat(" SETTINGS: ack=true"));
        }
    }

    final void zze(int i10, zzbzo zzbzoVar) {
        if (zzl()) {
            Logger logger = this.zza;
            Level level = this.zzb;
            String strZza = zzbxu.zza(i10);
            EnumMap enumMap = new EnumMap(zzbxv.class);
            for (zzbxv zzbxvVar : zzbxv.values()) {
                if (zzbzoVar.zzb(zzbxvVar.zza())) {
                    enumMap.put((EnumMap) zzbxvVar, (zzbxv) Integer.valueOf(zzbzoVar.zzc(zzbxvVar.zza())));
                }
            }
            String string = enumMap.toString();
            StringBuilder sb2 = new StringBuilder(strZza.length() + 30 + String.valueOf(string).length());
            sb2.append(strZza);
            sb2.append(" SETTINGS: ack=false settings=");
            sb2.append(string);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logSettings", sb2.toString());
        }
    }

    final void zzf(int i10, long j10) {
        if (zzl()) {
            Logger logger = this.zza;
            Level level = this.zzb;
            String strZza = zzbxu.zza(i10);
            StringBuilder sb2 = new StringBuilder(strZza.length() + 23 + String.valueOf(j10).length());
            sb2.append(strZza);
            sb2.append(" PING: ack=false bytes=");
            sb2.append(j10);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logPing", sb2.toString());
        }
    }

    final void zzg(int i10, long j10) {
        if (zzl()) {
            Logger logger = this.zza;
            Level level = this.zzb;
            String strValueOf = String.valueOf(j10);
            String strZza = zzbxu.zza(2);
            StringBuilder sb2 = new StringBuilder(strZza.length() + 22 + strValueOf.length());
            sb2.append(strZza);
            sb2.append(" PING: ack=true bytes=");
            sb2.append(j10);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logPingAck", sb2.toString());
        }
    }

    final void zzh(int i10, int i11, int i12, List list) {
        if (zzl()) {
            Logger logger = this.zza;
            Level level = this.zzb;
            String string = list.toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 49 + String.valueOf(i12).length() + 9 + string.length());
            sb2.append("INBOUND PUSH_PROMISE: streamId=");
            sb2.append(i11);
            sb2.append(" promisedStreamId=");
            sb2.append(i12);
            sb2.append(" headers=");
            sb2.append(string);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logPushPromise", sb2.toString());
        }
    }

    final void zzi(int i10, int i11, zzbyz zzbyzVar, zzcbn zzcbnVar) {
        if (zzl()) {
            Logger logger = this.zza;
            Level level = this.zzb;
            String strZza = zzbxu.zza(i10);
            String strValueOf = String.valueOf(zzbyzVar);
            int iZzj = zzcbnVar.zzj();
            zzcbj zzcbjVar = new zzcbj();
            zzcbjVar.zzu(zzcbnVar);
            String strZzk = zzk(zzcbjVar);
            StringBuilder sb2 = new StringBuilder(strZza.length() + 23 + String.valueOf(i11).length() + 11 + strValueOf.length() + 8 + String.valueOf(iZzj).length() + 7 + String.valueOf(strZzk).length());
            sb2.append(strZza);
            sb2.append(" GO_AWAY: lastStreamId=");
            sb2.append(i11);
            sb2.append(" errorCode=");
            sb2.append(strValueOf);
            sb2.append(" length=");
            sb2.append(iZzj);
            sb2.append(" bytes=");
            sb2.append(strZzk);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logGoAway", sb2.toString());
        }
    }

    final void zzj(int i10, int i11, long j10) {
        if (zzl()) {
            Logger logger = this.zza;
            Level level = this.zzb;
            String strZza = zzbxu.zza(i10);
            String strValueOf = String.valueOf(i11);
            StringBuilder sb2 = new StringBuilder(strZza.length() + 25 + strValueOf.length() + 21 + String.valueOf(j10).length());
            sb2.append(strZza);
            sb2.append(" WINDOW_UPDATE: streamId=");
            sb2.append(i11);
            sb2.append(" windowSizeIncrement=");
            sb2.append(j10);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logWindowsUpdate", sb2.toString());
        }
    }
}
