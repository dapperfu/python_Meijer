package com.google.android.libraries.places.internal;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import com.medallia.digital.mobilesdk.l3;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
final class zzbzk implements zzbzc {
    private final zzcbk zza;
    private final zzcbj zzb;
    private final zzbzf zzc;
    private int zzd;
    private boolean zze;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.zze = true;
        this.zza.close();
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final synchronized void zza(zzbzo zzbzoVar) throws IOException {
        if (this.zze) {
            throw new IOException("closed");
        }
        this.zzd = zzbzoVar.zzf(this.zzd);
        zzl(0, 0, (byte) 4, (byte) 1);
        this.zza.flush();
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final synchronized void zzb(int i10, zzbyz zzbyzVar) throws IOException {
        if (this.zze) {
            throw new IOException("closed");
        }
        int i11 = zzbyzVar.zzs;
        if (i11 == -1) {
            throw new IllegalArgumentException();
        }
        zzl(i10, 4, (byte) 3, (byte) 0);
        zzcbk zzcbkVar = this.zza;
        zzcbkVar.zzL(i11);
        zzcbkVar.flush();
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final synchronized void zzc(boolean z10, int i10, int i11) throws IOException {
        if (this.zze) {
            throw new IOException("closed");
        }
        zzl(0, 8, (byte) 6, z10 ? (byte) 1 : (byte) 0);
        zzcbk zzcbkVar = this.zza;
        zzcbkVar.zzL(i10);
        zzcbkVar.zzL(i11);
        zzcbkVar.flush();
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final synchronized void zzd() throws IOException {
        try {
            if (this.zze) {
                throw new IOException("closed");
            }
            Logger logger = zzbzl.zza;
            Level level = Level.FINE;
            if (logger.isLoggable(level)) {
                zzbzl.zza.logp(level, "io.grpc.okhttp.internal.framed.Http2$Writer", "connectionPreface", String.format(">> CONNECTION %s", zzbzl.zzb.zzg()));
            }
            zzcbk zzcbkVar = this.zza;
            zzcbkVar.zzI(zzbzl.zzb.zzk());
            zzcbkVar.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final synchronized void zze() throws IOException {
        if (this.zze) {
            throw new IOException("closed");
        }
        this.zza.flush();
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final synchronized void zzf(boolean z10, boolean z11, int i10, int i11, List list) throws IOException {
        if (this.zze) {
            throw new IOException("closed");
        }
        this.zzc.zza(list);
        zzcbj zzcbjVar = this.zzb;
        long jZzb = zzcbjVar.zzb();
        int iMin = (int) Math.min(this.zzd, jZzb);
        long j10 = iMin;
        zzl(i10, iMin, (byte) 1, jZzb == j10 ? (byte) 4 : (byte) 0);
        zzcbk zzcbkVar = this.zza;
        zzcbkVar.zzc(zzcbjVar, j10);
        if (jZzb > j10) {
            long j11 = jZzb - j10;
            while (j11 > 0) {
                int iMin2 = (int) Math.min(this.zzd, j11);
                long j12 = iMin2;
                j11 -= j12;
                zzl(i10, iMin2, (byte) 9, j11 == 0 ? (byte) 4 : (byte) 0);
                zzcbkVar.zzc(zzcbjVar, j12);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final int zzg() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final synchronized void zzh(boolean z10, int i10, zzcbj zzcbjVar, int i11) throws IOException {
        if (this.zze) {
            throw new IOException("closed");
        }
        zzl(i10, i11, (byte) 0, z10 ? (byte) 1 : (byte) 0);
        if (i11 > 0) {
            this.zza.zzc(zzcbjVar, i11);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final synchronized void zzi(zzbzo zzbzoVar) throws IOException {
        int i10;
        try {
            if (this.zze) {
                throw new IOException("closed");
            }
            int i11 = 0;
            zzl(0, zzbzoVar.zzd() * 6, (byte) 4, (byte) 0);
            while (i11 < 10) {
                if (zzbzoVar.zzb(i11)) {
                    if (i11 == 4) {
                        int i12 = i11;
                        i11 = 3;
                        i10 = i12;
                    } else {
                        i10 = 7;
                        if (i11 == 7) {
                            i11 = 4;
                        } else {
                            i10 = i11;
                        }
                    }
                    zzcbk zzcbkVar = this.zza;
                    zzcbkVar.zzK(i11);
                    zzcbkVar.zzL(zzbzoVar.zzc(i10));
                    i11 = i10;
                }
                i11++;
            }
            this.zza.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final synchronized void zzj(int i10, zzbyz zzbyzVar, byte[] bArr) throws IOException {
        if (this.zze) {
            throw new IOException("closed");
        }
        int i11 = zzbyzVar.zzs;
        if (i11 == -1) {
            throw zzbzl.zzc("errorCode.httpCode == -1", new Object[0]);
        }
        zzl(0, 8, (byte) 7, (byte) 0);
        zzcbk zzcbkVar = this.zza;
        zzcbkVar.zzL(0);
        zzcbkVar.zzL(i11);
        zzcbkVar.flush();
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final synchronized void zzk(int i10, long j10) throws IOException {
        if (this.zze) {
            throw new IOException("closed");
        }
        if (j10 == 0) {
            throw zzbzl.zzc("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[]{0L});
        }
        zzl(i10, 4, (byte) 8, (byte) 0);
        zzcbk zzcbkVar = this.zza;
        zzcbkVar.zzL((int) j10);
        zzcbkVar.flush();
    }

    zzbzk(zzcbk zzcbkVar, boolean z10) {
        this.zza = zzcbkVar;
        zzcbj zzcbjVar = new zzcbj();
        this.zzb = zzcbjVar;
        this.zzc = new zzbzf(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, false, zzcbjVar);
        this.zzd = 16384;
    }

    final void zzl(int i10, int i11, byte b10, byte b11) throws IOException {
        Logger logger = zzbzl.zza;
        Level level = Level.FINE;
        if (logger.isLoggable(level)) {
            zzbzl.zza.logp(level, "io.grpc.okhttp.internal.framed.Http2$Writer", "frameHeader", zzbzi.zza(false, i10, i11, b10, b11));
        }
        int i12 = this.zzd;
        if (i11 <= i12) {
            if ((Integer.MIN_VALUE & i10) == 0) {
                zzcbk zzcbkVar = this.zza;
                zzcbkVar.zzJ((i11 >>> 16) & l3.f93323c);
                zzcbkVar.zzJ((i11 >>> 8) & l3.f93323c);
                zzcbkVar.zzJ(i11 & l3.f93323c);
                zzcbkVar.zzJ(b10);
                zzcbkVar.zzJ(b11);
                zzcbkVar.zzL(i10 & a.e.API_PRIORITY_OTHER);
                return;
            }
            throw zzbzl.zzc("reserved bit set: %s", new Object[]{Integer.valueOf(i10)});
        }
        throw zzbzl.zzc("FRAME_SIZE_ERROR length > %d: %d", new Object[]{Integer.valueOf(i12), Integer.valueOf(i11)});
    }
}
