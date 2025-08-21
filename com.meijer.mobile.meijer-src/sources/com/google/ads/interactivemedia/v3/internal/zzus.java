package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes4.dex */
abstract class zzus extends AtomicReference implements Runnable {
    private static final Runnable zza = new zzur(null);
    private static final Runnable zzb = new zzur(null);

    abstract Object zza() throws Exception;

    abstract String zzb();

    abstract void zzd(Throwable th2);

    abstract void zze(Object obj);

    abstract boolean zzg();

    zzus() {
    }

    private final void zzc(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzup zzupVar = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (!(runnable instanceof zzup)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzupVar = (zzup) runnable;
            }
            i10++;
            if (i10 > 1000) {
                Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    if (Thread.interrupted() || z10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    LockSupport.park(zzupVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objZza = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zZzg = zzg();
            if (!zZzg) {
                try {
                    objZza = zza();
                } catch (Throwable th2) {
                    try {
                        zzvc.zza(th2);
                        if (!compareAndSet(threadCurrentThread, zza)) {
                            zzc(threadCurrentThread);
                        }
                        zzd(th2);
                        return;
                    } catch (Throwable th3) {
                        if (!compareAndSet(threadCurrentThread, zza)) {
                            zzc(threadCurrentThread);
                        }
                        zze(null);
                        throw th3;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, zza)) {
                zzc(threadCurrentThread);
            }
            if (!zZzg) {
                zze(objZza);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == zza) {
            str = "running=[DONE]";
        } else if (runnable instanceof zzup) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + zzb();
    }

    final void zzh() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzup zzupVar = new zzup(this, null);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, zzupVar)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th2) {
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th2;
                }
            }
        }
    }
}
