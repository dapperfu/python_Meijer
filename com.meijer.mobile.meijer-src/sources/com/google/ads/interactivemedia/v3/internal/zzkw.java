package com.google.ads.interactivemedia.v3.internal;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class zzkw {
    private final zzjj zza;
    private final String zzb;
    private final String zzc;
    private final Class[] zze;
    private volatile Method zzd = null;
    private final CountDownLatch zzf = new CountDownLatch(1);

    static /* bridge */ /* synthetic */ void zzb(zzkw zzkwVar) {
        try {
            zzjj zzjjVar = zzkwVar.zza;
            Class<?> clsLoadClass = zzjjVar.zzi().loadClass(zzkwVar.zzc(zzjjVar.zzu(), zzkwVar.zzb));
            if (clsLoadClass != null) {
                zzkwVar.zzd = clsLoadClass.getMethod(zzkwVar.zzc(zzkwVar.zza.zzu(), zzkwVar.zzc), zzkwVar.zze);
            }
        } catch (zzin | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th2) {
            zzkwVar.zzf.countDown();
            throw th2;
        }
        zzkwVar.zzf.countDown();
    }

    private final String zzc(byte[] bArr, String str) throws zzin, UnsupportedEncodingException {
        return new String(this.zza.zze().zzb(bArr, str), "UTF-8");
    }

    public final Method zza() {
        if (this.zzd != null) {
            return this.zzd;
        }
        try {
            if (this.zzf.await(2L, TimeUnit.SECONDS)) {
                return this.zzd;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public zzkw(zzjj zzjjVar, String str, String str2, Class... clsArr) {
        this.zza = zzjjVar;
        this.zzb = str;
        this.zzc = str2;
        this.zze = clsArr;
        zzjjVar.zzk().submit(new zzkv(this));
    }
}
