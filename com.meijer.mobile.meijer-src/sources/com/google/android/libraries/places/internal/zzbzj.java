package com.google.android.libraries.places.internal;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
final class zzbzj implements zzbzb {
    final zzbze zza;
    private final zzcbl zzb;
    private final zzbzh zzc;

    private final List zzb(int i10, short s10, byte b10, int i11) throws IOException {
        zzbzh zzbzhVar = this.zzc;
        zzbzhVar.zzd = i10;
        zzbzhVar.zza = i10;
        zzbzhVar.zze = s10;
        zzbzhVar.zzb = b10;
        zzbzhVar.zzc = i11;
        zzbze zzbzeVar = this.zza;
        zzbzeVar.zzb();
        return zzbzeVar.zzc();
    }

    private final void zzc(zzbza zzbzaVar, int i10) throws IOException {
        zzcbl zzcblVar = this.zzb;
        zzcblVar.zzm();
        zzcblVar.zzj();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zzb.close();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.libraries.places.internal.zzbzb
    public final boolean zza(zzbza zzbzaVar) throws IOException {
        try {
            this.zzb.zzg(9L);
            zzcbl zzcblVar = this.zzb;
            int iZzf = zzbzl.zzf(zzcblVar);
            if (iZzf > 16384) {
                throw zzbzl.zzi("FRAME_SIZE_ERROR: %s", Integer.valueOf(iZzf));
            }
            byte bZzj = (byte) (zzcblVar.zzj() & 255);
            byte bZzj2 = (byte) (zzcblVar.zzj() & 255);
            int iZzm = zzcblVar.zzm() & a.e.API_PRIORITY_OTHER;
            Logger logger = zzbzl.zza;
            Level level = Level.FINE;
            if (logger.isLoggable(level)) {
                zzbzl.zza.logp(level, "io.grpc.okhttp.internal.framed.Http2$Reader", "nextFrame", zzbzi.zza(true, iZzm, iZzf, bZzj, bZzj2));
            }
            switch (bZzj) {
                case 0:
                    boolean z10 = bZzj2 & 1;
                    if ((bZzj2 & 32) != 0) {
                        throw zzbzl.zzi("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                    }
                    int iZzj = (bZzj2 & 8) != 0 ? zzcblVar.zzj() & 255 : 0;
                    zzbzaVar.zza(1 == z10, iZzm, zzcblVar, zzbzl.zze(iZzf, bZzj2, (short) iZzj), iZzf);
                    zzcblVar.zzt(iZzj);
                    return true;
                case 1:
                    if (iZzm == 0) {
                        throw zzbzl.zzi("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                    }
                    boolean z11 = bZzj2 & 32;
                    boolean z12 = bZzj2 & 1;
                    int iZzj2 = (bZzj2 & 8) != 0 ? zzcblVar.zzj() & 255 : 0;
                    if (z11 != 0) {
                        zzc(zzbzaVar, iZzm);
                        iZzf -= 5;
                    }
                    short s10 = (short) iZzj2;
                    zzbzaVar.zzh(false, 1 == z12, iZzm, -1, zzb(zzbzl.zze(iZzf, bZzj2, s10), s10, bZzj2, iZzm), 4);
                    return true;
                case 2:
                    if (iZzf != 5) {
                        throw zzbzl.zzi("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iZzf));
                    }
                    if (iZzm == 0) {
                        throw zzbzl.zzi("TYPE_PRIORITY streamId == 0", new Object[0]);
                    }
                    zzc(zzbzaVar, iZzm);
                    return true;
                case 3:
                    if (iZzf != 4) {
                        throw zzbzl.zzi("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(iZzf));
                    }
                    if (iZzm == 0) {
                        throw zzbzl.zzi("TYPE_RST_STREAM streamId == 0", new Object[0]);
                    }
                    int iZzm2 = zzcblVar.zzm();
                    zzbyz zzbyzVarZza = zzbyz.zza(iZzm2);
                    if (zzbyzVarZza == null) {
                        throw zzbzl.zzi("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(iZzm2));
                    }
                    zzbzaVar.zzb(iZzm, zzbyzVarZza);
                    return true;
                case 4:
                    if (iZzm != 0) {
                        throw zzbzl.zzi("TYPE_SETTINGS streamId != 0", new Object[0]);
                    }
                    if ((bZzj2 & 1) == 0) {
                        if (iZzf % 6 != 0) {
                            throw zzbzl.zzi("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(iZzf));
                        }
                        zzbzo zzbzoVar = new zzbzo();
                        for (int i10 = 0; i10 < iZzf; i10 += 6) {
                            short sZzl = zzcblVar.zzl();
                            int iZzm3 = zzcblVar.zzm();
                            switch (sZzl) {
                                case 1:
                                case 6:
                                    zzbzoVar.zza(sZzl, 0, iZzm3);
                                case 2:
                                    if (iZzm3 != 0 && iZzm3 != 1) {
                                        throw zzbzl.zzi("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                    }
                                    zzbzoVar.zza(sZzl, 0, iZzm3);
                                case 3:
                                    sZzl = 4;
                                    zzbzoVar.zza(sZzl, 0, iZzm3);
                                case 4:
                                    if (iZzm3 < 0) {
                                        throw zzbzl.zzi("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                    }
                                    sZzl = 7;
                                    zzbzoVar.zza(sZzl, 0, iZzm3);
                                case 5:
                                    if (iZzm3 < 16384 || iZzm3 > 16777215) {
                                        throw zzbzl.zzi("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(iZzm3));
                                    }
                                    zzbzoVar.zza(sZzl, 0, iZzm3);
                                    break;
                                default:
                            }
                        }
                        zzbzaVar.zzc(false, zzbzoVar);
                        if (zzbzoVar.zze() >= 0) {
                            this.zza.zza(zzbzoVar.zze());
                        }
                    } else if (iZzf != 0) {
                        throw zzbzl.zzi("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                    }
                    return true;
                case 5:
                    if (iZzm == 0) {
                        throw zzbzl.zzi("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                    }
                    short sZzj = (short) ((bZzj2 & 8) != 0 ? zzcblVar.zzj() & 255 : 0);
                    zzbzaVar.zzf(iZzm, zzcblVar.zzm() & a.e.API_PRIORITY_OTHER, zzb(zzbzl.zze(iZzf - 4, bZzj2, sZzj), sZzj, bZzj2, iZzm));
                    return true;
                case 6:
                    if (iZzf != 8) {
                        throw zzbzl.zzi("TYPE_PING length != 8: %s", Integer.valueOf(iZzf));
                    }
                    if (iZzm != 0) {
                        throw zzbzl.zzi("TYPE_PING streamId != 0", new Object[0]);
                    }
                    zzbzaVar.zzd(1 == (bZzj2 & 1), zzcblVar.zzm(), zzcblVar.zzm());
                    return true;
                case 7:
                    if (iZzf < 8) {
                        throw zzbzl.zzi("TYPE_GOAWAY length < 8: %s", Integer.valueOf(iZzf));
                    }
                    if (iZzm != 0) {
                        throw zzbzl.zzi("TYPE_GOAWAY streamId != 0", new Object[0]);
                    }
                    int i11 = iZzf - 8;
                    int iZzm4 = zzcblVar.zzm();
                    int iZzm5 = zzcblVar.zzm();
                    zzbyz zzbyzVarZza2 = zzbyz.zza(iZzm5);
                    if (zzbyzVarZza2 == null) {
                        throw zzbzl.zzi("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(iZzm5));
                    }
                    zzcbn zzcbnVarZzn = zzcbn.zza;
                    if (i11 > 0) {
                        zzcbnVarZzn = zzcblVar.zzn(i11);
                    }
                    zzbzaVar.zze(iZzm4, zzbyzVarZza2, zzcbnVarZzn);
                    return true;
                case 8:
                    if (iZzf != 4) {
                        throw zzbzl.zzi("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iZzf));
                    }
                    long jZzm = zzcblVar.zzm() & 2147483647L;
                    if (jZzm == 0) {
                        throw zzbzl.zzi("windowSizeIncrement was 0", new Object[0]);
                    }
                    zzbzaVar.zzg(iZzm, jZzm);
                    return true;
                default:
                    zzcblVar.zzt(iZzf);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    zzbzj(zzcbl zzcblVar, int i10, boolean z10) {
        this.zzb = zzcblVar;
        zzbzh zzbzhVar = new zzbzh(zzcblVar);
        this.zzc = zzbzhVar;
        this.zza = new zzbze(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, zzbzhVar);
    }
}
