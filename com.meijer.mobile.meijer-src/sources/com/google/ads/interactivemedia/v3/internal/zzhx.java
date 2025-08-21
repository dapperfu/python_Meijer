package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public final class zzhx implements zzia {
    private static zzhx zzb;
    private final Context zzc;
    private final zzow zzd;
    private final zzpd zze;
    private final zzpf zzf;
    private final zzjd zzg;
    private final zznt zzh;
    private final Executor zzi;
    private final zzpc zzj;
    private final zzjs zzl;
    private final zzjk zzm;
    private volatile boolean zzo;
    private volatile boolean zzp;
    private final int zzq;
    volatile long zza = 0;
    private final Object zzn = new Object();
    private final CountDownLatch zzk = new CountDownLatch(1);

    @Override // com.google.ads.interactivemedia.v3.internal.zzia
    public final String zzg(Context context, byte[] bArr) {
        throw null;
    }

    final synchronized void zzm() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzov zzovVarZzu = zzu(1);
        if (zzovVarZzu == null) {
            this.zzh.zzd(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.zzf.zzc(zzovVarZzu)) {
            this.zzp = true;
            this.zzk.countDown();
        }
    }

    public final synchronized boolean zzr() {
        return this.zzp;
    }

    public static synchronized zzhx zza(String str, Context context, boolean z10, boolean z11) {
        return zzb(str, context, Executors.newCachedThreadPool(), z10, z11);
    }

    @Deprecated
    public static synchronized zzhx zzb(String str, Context context, Executor executor, boolean z10, boolean z11) {
        try {
            if (zzb == null) {
                zznu zznuVarZzc = zznv.zzc();
                zznuVarZzc.zza(str);
                zznuVarZzc.zzg(z10);
                zznv zznvVarZzh = zznuVarZzc.zzh();
                zznt zzntVarZza = zznt.zza(context, executor, z11);
                zzim zzimVarZzc = ((Boolean) zzls.zzc().zza(zzmj.zzx)).booleanValue() ? zzim.zzc(context) : null;
                zzjs zzjsVarZzd = ((Boolean) zzls.zzc().zza(zzmj.zzy)).booleanValue() ? zzjs.zzd(context, executor) : null;
                zzjk zzjkVar = ((Boolean) zzls.zzc().zza(zzmj.zzp)).booleanValue() ? new zzjk() : null;
                zzjb zzjbVar = ((Boolean) zzls.zzc().zza(zzmj.zzs)).booleanValue() ? new zzjb() : null;
                zzok zzokVarZze = zzok.zze(context, executor, zzntVarZza, zznvVarZzh);
                zzjc zzjcVar = new zzjc(context);
                zzjk zzjkVar2 = zzjkVar;
                zzjd zzjdVar = new zzjd(zznvVarZzh, zzokVarZze, new zzjq(context, zzjcVar), zzjcVar, zzimVarZzc, zzjsVarZzd, zzjkVar2, zzjbVar);
                int iZzb = zzol.zzb(context, zzntVarZza);
                zzno zznoVar = new zzno();
                zzhx zzhxVar = new zzhx(context, zzntVarZza, new zzow(context, iZzb), new zzpd(context, iZzb, new zzhu(zzntVarZza), ((Boolean) zzls.zzc().zza(zzmj.zzb)).booleanValue()), new zzpf(context, zzjdVar, zzntVarZza, zznoVar), zzjdVar, executor, zznoVar, iZzb, zzjsVarZzd, zzjkVar2, zzjbVar);
                zzb = zzhxVar;
                zzhxVar.zzm();
                zzb.zzo();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zzb;
    }

    private final void zzt() {
        zzjs zzjsVar = this.zzl;
        if (zzjsVar != null) {
            zzjsVar.zzh();
        }
    }

    private final zzov zzu(int i10) {
        if (zzol.zza(this.zzq)) {
            return ((Boolean) zzls.zzc().zza(zzmj.zza)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzc(1);
        }
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzia
    public final String zze(Context context, String str, View view, Activity activity) {
        zzt();
        if (((Boolean) zzls.zzc().zza(zzmj.zzp)).booleanValue()) {
            this.zzm.zzi();
        }
        zzo();
        zznw zznwVarZza = this.zzf.zza();
        if (zznwVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZza = zznwVarZza.zza(context, null, str, view, activity);
        this.zzh.zzf(5000, System.currentTimeMillis() - jCurrentTimeMillis, strZza, null);
        return strZza;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzia
    public final void zzk(MotionEvent motionEvent) {
        zznw zznwVarZza = this.zzf.zza();
        if (zznwVarZza != null) {
            try {
                zznwVarZza.zzd(null, motionEvent);
            } catch (zzpe e10) {
                this.zzh.zzc(e10.zza(), -1L, e10);
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzia
    public final void zzl(int i10, int i11, int i12) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) zzls.zzc().zza(zzmj.zzC)).booleanValue() || (displayMetrics = this.zzc.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f10 = i10;
        float f11 = displayMetrics.density;
        float f12 = i11;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f10 * f11, f12 * f11, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain);
        motionEventObtain.recycle();
        float f13 = displayMetrics.density;
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f10 * f13, f12 * f13, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain2);
        motionEventObtain2.recycle();
        float f14 = displayMetrics.density;
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i12, 1, f10 * f14, f12 * f14, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzia
    public final void zzn(View view) {
        this.zzg.zzd(view);
    }

    public final void zzo() {
        if (this.zzo) {
            return;
        }
        synchronized (this.zzn) {
            try {
                if (!this.zzo) {
                    if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                        return;
                    }
                    zzov zzovVarZzb = this.zzf.zzb();
                    if ((zzovVarZzb == null || zzovVarZzb.zzd(3600L)) && zzol.zza(this.zzq)) {
                        this.zzi.execute(new zzhw(this));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzia
    public final boolean zzs() throws InterruptedException {
        try {
            this.zzk.await();
        } catch (InterruptedException unused) {
        }
        return zzr();
    }

    zzhx(Context context, zznt zzntVar, zzow zzowVar, zzpd zzpdVar, zzpf zzpfVar, zzjd zzjdVar, Executor executor, zzno zznoVar, int i10, zzjs zzjsVar, zzjk zzjkVar, zzjb zzjbVar) {
        this.zzp = false;
        this.zzc = context;
        this.zzh = zzntVar;
        this.zzd = zzowVar;
        this.zze = zzpdVar;
        this.zzf = zzpfVar;
        this.zzg = zzjdVar;
        this.zzi = executor;
        this.zzq = i10;
        this.zzl = zzjsVar;
        this.zzm = zzjkVar;
        this.zzp = false;
        this.zzj = new zzhv(this, zznoVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc A[Catch: all -> 0x009d, zzaeg -> 0x00a0, TryCatch #0 {zzaeg -> 0x00a0, blocks: (B:6:0x0021, B:8:0x0032, B:12:0x0038, B:13:0x0044, B:15:0x0052, B:17:0x0060, B:20:0x006d, B:32:0x00a3, B:36:0x00bc, B:42:0x00d5, B:43:0x00e2, B:45:0x00e8, B:47:0x00f0, B:48:0x00f2, B:39:0x00c6, B:40:0x00cd, B:23:0x0074, B:25:0x008a, B:49:0x00fc, B:50:0x0109, B:51:0x0116), top: B:58:0x0021, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* bridge */ /* synthetic */ void zzj(com.google.ads.interactivemedia.v3.internal.zzhx r12) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzhx.zzj(com.google.ads.interactivemedia.v3.internal.zzhx):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzia
    public final String zzf(Context context) {
        zzt();
        if (((Boolean) zzls.zzc().zza(zzmj.zzp)).booleanValue()) {
            this.zzm.zzj();
        }
        zzo();
        zznw zznwVarZza = this.zzf.zza();
        if (zznwVarZza != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strZzc = zznwVarZza.zzc(context, null);
            this.zzh.zzf(5001, System.currentTimeMillis() - jCurrentTimeMillis, strZzc, null);
            return strZzc;
        }
        return "";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzia
    public final String zzh(Context context, View view, Activity activity) {
        zzt();
        if (((Boolean) zzls.zzc().zza(zzmj.zzp)).booleanValue()) {
            this.zzm.zzk(context, view);
        }
        zzo();
        zznw zznwVarZza = this.zzf.zza();
        if (zznwVarZza != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strZzb = zznwVarZza.zzb(context, null, view, activity);
            this.zzh.zzf(5002, System.currentTimeMillis() - jCurrentTimeMillis, strZzb, null);
            return strZzb;
        }
        return "";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzia
    public final boolean zzq() {
        return zzr();
    }
}
