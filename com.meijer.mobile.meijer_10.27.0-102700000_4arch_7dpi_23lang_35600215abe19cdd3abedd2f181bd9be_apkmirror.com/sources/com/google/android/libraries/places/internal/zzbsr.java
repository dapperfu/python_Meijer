package com.google.android.libraries.places.internal;

import Be.p;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class zzbsr implements zzbow {
    private final zzbsq zza;
    private zzbwq zzc;
    private int zzd;
    private final zzbwr zzh;
    private final zzbwg zzi;
    private boolean zzj;
    private int zzk;
    private long zzm;
    private int zzb = -1;
    private zzbfu zze = zzbfs.zza;
    private final zzbsp zzf = new zzbsp(this, null);
    private final ByteBuffer zzg = ByteBuffer.allocate(5);
    private int zzl = -1;

    @Override // com.google.android.libraries.places.internal.zzbow
    public final boolean zzc() {
        return this.zzj;
    }

    final /* synthetic */ zzbwr zzh() {
        return this.zzh;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int zzj(InputStream inputStream, OutputStream outputStream) throws IOException {
        return ((zzbgk) inputStream).zza(outputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final void zzg(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            zzbwq zzbwqVar = this.zzc;
            if (zzbwqVar != null && zzbwqVar.zzc() == 0) {
                zzl(false, false);
            }
            if (this.zzc == null) {
                p.x(this.zzd > 0, "knownLengthPendingAllocation reached 0");
                zzbwq zzbwqVarZza = this.zzh.zza(this.zzd);
                this.zzc = zzbwqVarZza;
                int i12 = this.zzd;
                this.zzd = i12 - Math.min(i12, zzbwqVarZza.zzc());
            }
            int iMin = Math.min(i11, this.zzc.zzc());
            this.zzc.zza(bArr, i10, iMin);
            i10 += iMin;
            i11 -= iMin;
        }
    }

    private final void zzl(boolean z10, boolean z11) {
        zzbwq zzbwqVar = this.zzc;
        this.zzc = null;
        this.zza.zzj(zzbwqVar, z10, z11, this.zzk);
        this.zzk = 0;
    }

    @Override // com.google.android.libraries.places.internal.zzbow
    public final void zza(InputStream inputStream) throws IOException {
        int iZzj;
        if (this.zzj) {
            throw new IllegalStateException("Framer already closed");
        }
        this.zzk++;
        int i10 = this.zzl + 1;
        this.zzl = i10;
        this.zzm = 0L;
        this.zzi.zzf(i10);
        zzbfu zzbfuVar = this.zze;
        zzbft zzbftVar = zzbfs.zza;
        try {
            int iAvailable = inputStream.available();
            if (iAvailable != 0 && zzbfuVar != zzbftVar) {
                zzbso zzbsoVar = new zzbso(this, null);
                OutputStream outputStreamZzb = this.zze.zzb(zzbsoVar);
                try {
                    iZzj = zzj(inputStream, outputStreamZzb);
                    outputStreamZzb.close();
                    int i11 = this.zzb;
                    if (i11 >= 0 && iZzj > i11) {
                        throw new zzbjy(zzbjv.zzf.zze(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iZzj), Integer.valueOf(this.zzb))), null);
                    }
                    zzi(zzbsoVar, true);
                } catch (Throwable th2) {
                    outputStreamZzb.close();
                    throw th2;
                }
            } else if (iAvailable != -1) {
                this.zzm = iAvailable;
                int i12 = this.zzb;
                if (i12 >= 0 && iAvailable > i12) {
                    throw new zzbjy(zzbjv.zzf.zze(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iAvailable), Integer.valueOf(this.zzb))), null);
                }
                ByteBuffer byteBuffer = this.zzg;
                byteBuffer.clear();
                byteBuffer.put((byte) 0).putInt(iAvailable);
                this.zzd = iAvailable + 5;
                zzg(byteBuffer.array(), 0, byteBuffer.position());
                iZzj = zzj(inputStream, this.zzf);
            } else {
                zzbso zzbsoVar2 = new zzbso(this, null);
                iZzj = zzj(inputStream, zzbsoVar2);
                zzi(zzbsoVar2, false);
            }
            if (iAvailable != -1 && iZzj != iAvailable) {
                throw new zzbjy(zzbjv.zzh.zze(String.format("Message length inaccurate %s != %s", Integer.valueOf(iZzj), Integer.valueOf(iAvailable))), null);
            }
            zzbwg zzbwgVar = this.zzi;
            long j10 = iZzj;
            zzbwgVar.zzj(j10);
            zzbwgVar.zzk(this.zzm);
            zzbwgVar.zzh(this.zzl, this.zzm, j10);
        } catch (zzbjy e10) {
            throw e10;
        } catch (IOException e11) {
            throw new zzbjy(zzbjv.zzh.zze("Failed to frame message").zzd(e11), null);
        } catch (RuntimeException e12) {
            throw new zzbjy(zzbjv.zzh.zze("Failed to frame message").zzd(e12), null);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbow
    public final void zzb() {
        zzbwq zzbwqVar = this.zzc;
        if (zzbwqVar == null || zzbwqVar.zzd() <= 0) {
            return;
        }
        zzl(false, true);
    }

    @Override // com.google.android.libraries.places.internal.zzbow
    public final void zzd() {
        if (this.zzj) {
            return;
        }
        this.zzj = true;
        zzbwq zzbwqVar = this.zzc;
        if (zzbwqVar != null && zzbwqVar.zzd() == 0) {
            this.zzc = null;
        }
        zzl(true, true);
    }

    @Override // com.google.android.libraries.places.internal.zzbow
    public final /* bridge */ /* synthetic */ zzbow zze(zzbfu zzbfuVar) {
        this.zze = (zzbfu) p.r(zzbfuVar, "Can't pass an empty compressor");
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzbow
    public final void zzf(int i10) {
        p.x(this.zzb == -1, "max size already set");
        this.zzb = i10;
    }

    public zzbsr(zzbsq zzbsqVar, zzbwr zzbwrVar, zzbwg zzbwgVar) {
        this.zza = (zzbsq) p.r(zzbsqVar, "sink");
        this.zzh = (zzbwr) p.r(zzbwrVar, "bufferAllocator");
        this.zzi = (zzbwg) p.r(zzbwgVar, "statsTraceCtx");
    }

    private final void zzi(zzbso zzbsoVar, boolean z10) {
        int iZza = zzbsoVar.zza();
        int i10 = this.zzb;
        if (i10 >= 0 && iZza > i10) {
            throw new zzbjy(zzbjv.zzf.zze(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iZza), Integer.valueOf(this.zzb))), null);
        }
        ByteBuffer byteBuffer = this.zzg;
        byteBuffer.clear();
        byteBuffer.put(z10 ? (byte) 1 : (byte) 0).putInt(iZza);
        zzbwq zzbwqVarZza = this.zzh.zza(5);
        zzbwqVarZza.zza(byteBuffer.array(), 0, byteBuffer.position());
        if (iZza == 0) {
            this.zzc = zzbwqVarZza;
            return;
        }
        zzbsq zzbsqVar = this.zza;
        zzbsqVar.zzj(zzbwqVarZza, false, false, this.zzk - 1);
        this.zzk = 1;
        List listZzb = zzbsoVar.zzb();
        for (int i11 = 0; i11 < listZzb.size() - 1; i11++) {
            zzbsqVar.zzj((zzbwq) listZzb.get(i11), false, false, 0);
        }
        this.zzc = (zzbwq) listZzb.get(listZzb.size() - 1);
        this.zzm = iZza;
    }
}
