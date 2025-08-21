package com.google.android.libraries.places.internal;

import android.os.Build;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
final class zzte extends zzsx {
    static final boolean zza;
    static final boolean zzb;
    static final boolean zzc;
    private static final AtomicReference zzd;
    private static final AtomicLong zzf;
    private static final ConcurrentLinkedQueue zzg;
    private volatile zzsh zze;

    static {
        String str = Build.FINGERPRINT;
        zza = str == null || "robolectric".equals(str);
        String str2 = Build.HARDWARE;
        zzb = "goldfish".equals(str2) || "ranchu".equals(str2);
        String str3 = Build.TYPE;
        zzc = "eng".equals(str3) || "userdebug".equals(str3);
        zzd = new AtomicReference();
        zzf = new AtomicLong();
        zzg = new ConcurrentLinkedQueue();
    }

    public static zzsh zzb(String str) {
        AtomicReference atomicReference = zzd;
        if (atomicReference.get() != null) {
            return ((zzsz) atomicReference.get()).zza(str);
        }
        int length = str.length();
        while (true) {
            length--;
            if (length >= 0) {
                char cCharAt = str.charAt(length);
                if (cCharAt != '$') {
                    if (cCharAt == '.') {
                        break;
                    }
                } else {
                    str = str.replace('$', '.');
                    break;
                }
            } else {
                break;
            }
        }
        zzte zzteVar = new zzte(str);
        ConcurrentLinkedQueue concurrentLinkedQueue = zztc.zza;
        concurrentLinkedQueue.offer(zzteVar);
        if (atomicReference.get() != null) {
            while (true) {
                zzte zzteVar2 = (zzte) concurrentLinkedQueue.poll();
                if (zzteVar2 == null) {
                    break;
                }
                zzteVar2.zze = ((zzsz) atomicReference.get()).zza(zzteVar2.zza());
            }
            if (((zztd) zzg.poll()) != null) {
                zzf.getAndDecrement();
                throw null;
            }
        }
        return zzteVar;
    }

    private zzte(String str) {
        super(str);
        if (!zza && !zzb) {
            if (zzc) {
                this.zze = zzti.zzb().zzb(false).zza(zza());
                return;
            } else {
                this.zze = null;
                return;
            }
        }
        this.zze = new zzsy().zza(zza());
    }
}
