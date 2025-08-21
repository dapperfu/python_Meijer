package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.logging.Level;

/* loaded from: classes6.dex */
final class zzbxr implements Runnable, zzbza {
    final zzbzb zza;
    boolean zzb;
    final /* synthetic */ zzbxt zzc;
    private final zzbxw zzd;

    @Override // com.google.android.libraries.places.internal.zzbza
    public final void zzd(boolean z10, int i10, int i11) {
        zzbpj zzbpjVar;
        long j10 = (i10 << 32) | (i11 & 4294967295L);
        this.zzd.zzf(1, j10);
        if (!z10) {
            zzbxt zzbxtVar = this.zzc;
            synchronized (zzbxtVar.zzG()) {
                zzbxtVar.zzE().zzc(true, i10, i11);
            }
            return;
        }
        zzbxt zzbxtVar2 = this.zzc;
        synchronized (zzbxtVar2.zzG()) {
            try {
                zzbpjVar = null;
                if (zzbxtVar2.zzQ() == null) {
                    zzbxt.zzf.logp(Level.WARNING, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "ping", "Received unexpected ping ack. No ping outstanding");
                } else if (zzbxtVar2.zzQ().zza() == j10) {
                    zzbpj zzbpjVarZzQ = zzbxtVar2.zzQ();
                    zzbxtVar2.zzR(null);
                    zzbpjVar = zzbpjVarZzQ;
                } else {
                    zzbxt.zzf.logp(Level.WARNING, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "ping", String.format(Locale.US, "Received unexpected ping ack. Expecting %d, got %d", Long.valueOf(zzbxtVar2.zzQ().zza()), Long.valueOf(j10)));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zzbpjVar != null) {
            zzbpjVar.zzb();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbza
    public final void zza(boolean z10, int i10, zzcbl zzcblVar, int i11, int i12) throws IOException {
        this.zzd.zza(1, i10, zzcblVar.zze(), i11, z10);
        zzbxt zzbxtVar = this.zzc;
        zzbxk zzbxkVarZzp = zzbxtVar.zzp(i10);
        if (zzbxkVarZzp != null) {
            long j10 = i11;
            zzcblVar.zzg(j10);
            zzcbj zzcbjVar = new zzcbj();
            zzcbjVar.zzc(zzcblVar.zze(), j10);
            zzbxkVarZzp.zzy().zzI();
            int i13 = zzcba.zza;
            synchronized (this.zzc.zzG()) {
                zzbxkVarZzp.zzy().zzH(zzcbjVar, z10, i12 - i11);
            }
        } else {
            if (!zzbxtVar.zzo(i10)) {
                zzbxt zzbxtVar2 = this.zzc;
                zzbyz zzbyzVar = zzbyz.PROTOCOL_ERROR;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 34);
                sb2.append("Received data for unknown stream: ");
                sb2.append(i10);
                zzbxtVar2.zzt(zzbyzVar, sb2.toString());
                return;
            }
            synchronized (zzbxtVar.zzG()) {
                zzbxtVar.zzE().zzb(i10, zzbyz.STREAM_CLOSED);
            }
            zzcblVar.zzt(i11);
        }
        zzbxt zzbxtVar3 = this.zzc;
        zzbxtVar3.zzK(zzbxtVar3.zzJ() + i12);
        if (zzbxtVar3.zzJ() >= zzbxtVar3.zzB() * 0.5f) {
            synchronized (zzbxtVar3.zzG()) {
                zzbxtVar3.zzE().zzk(0, zzbxtVar3.zzJ());
            }
            this.zzc.zzK(0);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbza
    public final void zzb(int i10, zzbyz zzbyzVar) {
        boolean z10 = true;
        this.zzd.zzc(1, i10, zzbyzVar);
        zzbjv zzbjvVarZzf = zzbxt.zzq(zzbyzVar).zzf("Rst Stream");
        if (zzbjvVarZzf.zzg() != zzbjs.CANCELLED && zzbjvVarZzf.zzg() != zzbjs.DEADLINE_EXCEEDED) {
            z10 = false;
        }
        boolean z11 = z10;
        zzbxt zzbxtVar = this.zzc;
        synchronized (zzbxtVar.zzG()) {
            try {
                zzbxk zzbxkVar = (zzbxk) zzbxtVar.zzH().get(Integer.valueOf(i10));
                if (zzbxkVar != null) {
                    zzbxkVar.zzy().zzI();
                    int i11 = zzcba.zza;
                    zzbxtVar.zzn(i10, zzbjvVarZzf, zzbyzVar == zzbyz.REFUSED_STREAM ? zzbls.REFUSED : zzbls.PROCESSED, z11, null, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbza
    public final void zzc(boolean z10, zzbzo zzbzoVar) {
        boolean zZza;
        this.zzd.zze(1, zzbzoVar);
        zzbxt zzbxtVar = this.zzc;
        synchronized (zzbxtVar.zzG()) {
            try {
                if (zzbzoVar.zzb(4)) {
                    zzbxtVar.zzW(zzbzoVar.zzc(4));
                }
                if (zzbzoVar.zzb(7)) {
                    zZza = zzbxtVar.zzF().zza(zzbzoVar.zzc(7));
                } else {
                    zZza = false;
                }
                if (this.zzb) {
                    zzbsi zzbsiVarZzD = zzbxtVar.zzD();
                    zzbez zzbezVarZzN = zzbxtVar.zzN();
                    zzbsiVarZzD.zza(zzbezVarZzN);
                    zzbxtVar.zzO(zzbezVarZzN);
                    zzbxtVar.zzD().zzb();
                    this.zzb = false;
                }
                zzbxtVar.zzE().zza(zzbzoVar);
                if (zZza) {
                    zzbxtVar.zzF().zzf();
                }
                zzbxtVar.zzr();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbza
    public final void zze(int i10, zzbyz zzbyzVar, zzcbn zzcbnVar) {
        this.zzd.zzi(1, i10, zzbyzVar, zzcbnVar);
        if (zzbyzVar == zzbyz.ENHANCE_YOUR_CALM) {
            String strZze = zzcbnVar.zze();
            int i11 = zzbxt.zzd;
            zzbxt.zzf.logp(Level.WARNING, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "goAway", String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", this, strZze));
            if ("too_many_pings".equals(strZze)) {
                this.zzc.zzZ().run();
            }
        }
        zzbjv zzbjvVarZzf = zzbpd.zza(zzbyzVar.zzs).zzf("Received Goaway");
        if (zzcbnVar.zzj() > 0) {
            zzbjvVarZzf = zzbjvVarZzf.zzf(zzcbnVar.zze());
        }
        this.zzc.zzu(i10, null, zzbjvVarZzf);
    }

    @Override // com.google.android.libraries.places.internal.zzbza
    public final void zzf(int i10, int i11, List list) throws IOException {
        this.zzd.zzh(1, i10, i11, list);
        zzbxt zzbxtVar = this.zzc;
        synchronized (zzbxtVar.zzG()) {
            zzbxtVar.zzE().zzb(i10, zzbyz.PROTOCOL_ERROR);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.libraries.places.internal.zzbza
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzg(int r6, long r7) {
        /*
            r5 = this;
            com.google.android.libraries.places.internal.zzbxw r0 = r5.zzd
            r1 = 1
            r0.zzj(r1, r6, r7)
            com.google.android.libraries.places.internal.zzbxt r0 = r5.zzc
            java.lang.Object r2 = r0.zzG()
            monitor-enter(r2)
            if (r6 != 0) goto L1c
            com.google.android.libraries.places.internal.zzbyh r6 = r0.zzF()     // Catch: java.lang.Throwable -> L1a
            r0 = 0
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L1a
            r6.zzb(r0, r7)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r6 = move-exception
            goto L6b
        L1c:
            java.util.Map r3 = r0.zzH()     // Catch: java.lang.Throwable -> L1a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L1a
            com.google.android.libraries.places.internal.zzbxk r3 = (com.google.android.libraries.places.internal.zzbxk) r3     // Catch: java.lang.Throwable -> L1a
            r4 = 0
            if (r3 == 0) goto L3f
            com.google.android.libraries.places.internal.zzbyh r0 = r0.zzF()     // Catch: java.lang.Throwable -> L1a
            com.google.android.libraries.places.internal.zzbxj r1 = r3.zzy()     // Catch: java.lang.Throwable -> L1a
            com.google.android.libraries.places.internal.zzbye r1 = r1.zzK()     // Catch: java.lang.Throwable -> L1a
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L1a
            r0.zzb(r1, r7)     // Catch: java.lang.Throwable -> L1a
        L3d:
            r1 = r4
            goto L45
        L3f:
            boolean r7 = r0.zzo(r6)     // Catch: java.lang.Throwable -> L1a
            if (r7 != 0) goto L3d
        L45:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L6a
            com.google.android.libraries.places.internal.zzbxt r7 = r5.zzc
            com.google.android.libraries.places.internal.zzbyz r8 = com.google.android.libraries.places.internal.zzbyz.PROTOCOL_ERROR
            java.lang.String r0 = java.lang.String.valueOf(r6)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 43
            r1.<init>(r0)
            java.lang.String r0 = "Received window_update for unknown stream: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r7.zzt(r8, r6)
        L6a:
            return
        L6b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbxr.zzg(int, long):void");
    }

    @Override // com.google.android.libraries.places.internal.zzbza
    public final void zzh(boolean z10, boolean z11, int i10, int i11, List list, int i12) {
        boolean z12 = true;
        this.zzd.zzb(1, i10, list, z11);
        zzbxt zzbxtVar = this.zzc;
        zzbjv zzbjvVarZze = null;
        if (zzbxtVar.zzaa() != Integer.MAX_VALUE) {
            long jZzj = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                zzbzd zzbzdVar = (zzbzd) list.get(i13);
                jZzj += zzbzdVar.zzf.zzj() + 32 + zzbzdVar.zzg.zzj();
            }
            int iMin = (int) Math.min(jZzj, 2147483647L);
            if (iMin > zzbxtVar.zzaa()) {
                zzbjvVarZze = zzbjv.zzf.zze(String.format(Locale.US, "Response %s metadata larger than %d: %d", true != z11 ? "header" : "trailer", Integer.valueOf(zzbxtVar.zzaa()), Integer.valueOf(iMin)));
            }
        }
        synchronized (zzbxtVar.zzG()) {
            try {
                zzbxk zzbxkVar = (zzbxk) zzbxtVar.zzH().get(Integer.valueOf(i10));
                if (zzbxkVar == null) {
                    if (zzbxtVar.zzo(i10)) {
                        zzbxtVar.zzE().zzb(i10, zzbyz.STREAM_CLOSED);
                    }
                } else if (zzbjvVarZze == null) {
                    zzbxkVar.zzy().zzI();
                    int i14 = zzcba.zza;
                    zzbxkVar.zzy().zzG(list, z11);
                } else {
                    if (!z11) {
                        zzbxtVar.zzE().zzb(i10, zzbyz.CANCEL);
                    }
                    zzbxkVar.zzy().zzg(zzbjvVarZze, zzbls.PROCESSED, false, new zzbip());
                }
                z12 = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z12) {
            zzbxt zzbxtVar2 = this.zzc;
            zzbyz zzbyzVar = zzbyz.PROTOCOL_ERROR;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 36);
            sb2.append("Received header for unknown stream: ");
            sb2.append(i10);
            zzbxtVar2.zzt(zzbyzVar, sb2.toString());
        }
    }

    zzbxr(zzbxt zzbxtVar, zzbzb zzbzbVar) {
        Objects.requireNonNull(zzbxtVar);
        this.zzc = zzbxtVar;
        this.zzd = new zzbxw(Level.FINE, zzbxt.class);
        this.zzb = true;
        this.zza = zzbzbVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        zzbjv zzbjvVarZzP;
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName("OkHttpClientTransport");
        while (this.zza.zza(this)) {
            try {
                zzbxt zzbxtVar = this.zzc;
                if (zzbxtVar.zzY() != null) {
                    zzbxtVar.zzY().zza();
                }
            } catch (Throwable th2) {
                try {
                    this.zzc.zzu(0, zzbyz.PROTOCOL_ERROR, zzbjv.zzh.zze("error in frame handler").zzd(th2));
                } catch (Throwable th3) {
                    try {
                        this.zza.close();
                    } catch (IOException e10) {
                        zzbxt.zzf.logp(Level.INFO, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "run", "Exception closing frame reader", (Throwable) e10);
                    } catch (RuntimeException e11) {
                        if (!"bio == null".equals(e11.getMessage())) {
                            throw e11;
                        }
                    }
                    this.zzc.zzD().zze();
                    Thread.currentThread().setName(name);
                    throw th3;
                }
            }
        }
        zzbxt zzbxtVar2 = this.zzc;
        synchronized (zzbxtVar2.zzG()) {
            zzbjvVarZzP = zzbxtVar2.zzP();
        }
        if (zzbjvVarZzP == null) {
            zzbjvVarZzP = zzbjv.zzi.zze("End of stream or IOException");
        }
        this.zzc.zzu(0, zzbyz.INTERNAL_ERROR, zzbjvVarZzP);
        try {
            this.zza.close();
        } catch (IOException e12) {
            zzbxt.zzf.logp(Level.INFO, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "run", "Exception closing frame reader", (Throwable) e12);
        } catch (RuntimeException e13) {
            if (!"bio == null".equals(e13.getMessage())) {
                throw e13;
            }
        }
        this.zzc.zzD().zze();
        Thread.currentThread().setName(name);
    }
}
