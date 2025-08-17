package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
final class zzqm extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        zzqy zzqyVar = new zzqy(zzqb.zza(Thread.currentThread()));
        Thread threadCurrentThread = Thread.currentThread();
        synchronized (zzqj.zzd) {
            zzqj.zzd.put(threadCurrentThread, zzqyVar);
        }
        return zzqyVar;
    }

    zzqm() {
    }
}
