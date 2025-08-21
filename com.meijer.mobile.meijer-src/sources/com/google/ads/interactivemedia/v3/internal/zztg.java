package com.google.ads.interactivemedia.v3.internal;

import com.google.maps.android.BuildConfig;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public abstract class zztg<V> extends zzvi implements zzuu<V> {
    private static final zza zza;
    static final boolean zzb;
    private static final Object zzba;
    static final zzut zzc;
    private volatile zzd listeners;
    private volatile Object value;
    private volatile zzk waiters;

    abstract class zza {
        /* synthetic */ zza(zztf zztfVar) {
        }

        abstract zzd zza(zztg zztgVar, zzd zzdVar);

        abstract zzk zzb(zztg zztgVar, zzk zzkVar);

        abstract void zzc(zzk zzkVar, zzk zzkVar2);

        abstract void zzd(zzk zzkVar, Thread thread);

        abstract boolean zze(zztg zztgVar, zzd zzdVar, zzd zzdVar2);

        abstract boolean zzf(zztg zztgVar, Object obj, Object obj2);

        abstract boolean zzg(zztg zztgVar, zzk zzkVar, zzk zzkVar2);
    }

    final class zzb {
        static final zzb zza;
        static final zzb zzb;
        final boolean zzc;
        final Throwable zzd;

        zzb(boolean z10, Throwable th2) {
            this.zzc = z10;
            this.zzd = th2;
        }

        static {
            if (zztg.zzb) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zzb(false, null);
                zza = new zzb(true, null);
            }
        }
    }

    final class zzd {
        static final zzd zza = new zzd();
        zzd next;
        final Runnable zzb;
        final Executor zzc;

        zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    final class zze extends zza {
        final AtomicReferenceFieldUpdater<zzk, Thread> zza;
        final AtomicReferenceFieldUpdater<zzk, zzk> zzb;
        final AtomicReferenceFieldUpdater<? super zztg<?>, zzk> zzc;
        final AtomicReferenceFieldUpdater<? super zztg<?>, zzd> zzd;
        final AtomicReferenceFieldUpdater<? super zztg<?>, Object> zze;

        zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super(null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zztg.zza
        final zzd zza(zztg zztgVar, zzd zzdVar) {
            return this.zzd.getAndSet(zztgVar, zzdVar);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zztg.zza
        final zzk zzb(zztg zztgVar, zzk zzkVar) {
            return this.zzc.getAndSet(zztgVar, zzkVar);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zztg.zza
        final void zzc(zzk zzkVar, zzk zzkVar2) {
            this.zzb.lazySet(zzkVar, zzkVar2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zztg.zza
        final void zzd(zzk zzkVar, Thread thread) {
            this.zza.lazySet(zzkVar, thread);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zztg.zza
        final boolean zze(zztg zztgVar, zzd zzdVar, zzd zzdVar2) {
            return zzth.zza(this.zzd, zztgVar, zzdVar, zzdVar2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zztg.zza
        final boolean zzf(zztg zztgVar, Object obj, Object obj2) {
            return zzth.zza(this.zze, zztgVar, obj, obj2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zztg.zza
        final boolean zzg(zztg zztgVar, zzk zzkVar, zzk zzkVar2) {
            return zzth.zza(this.zzc, zztgVar, zzkVar, zzkVar2);
        }
    }

    final class zzf<V> implements Runnable {
        final zztg<V> zza;
        final zzuu<? extends V> zzb;

        zzf(zztg zztgVar, zzuu zzuuVar) {
            this.zza = zztgVar;
            this.zzb = zzuuVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((zztg) this.zza).value != this) {
                return;
            }
            zzuu<? extends V> zzuuVar = this.zzb;
            if (zztg.zza.zzf(this.zza, this, zztg.zzs(zzuuVar))) {
                zztg.zzx(this.zza, false);
            }
        }
    }

    final class zzg extends zza {
        private zzg() {
            throw null;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zztg.zza
        final zzd zza(zztg zztgVar, zzd zzdVar) {
            zzd zzdVar2;
            synchronized (zztgVar) {
                try {
                    zzdVar2 = zztgVar.listeners;
                    if (zzdVar2 != zzdVar) {
                        zztgVar.listeners = zzdVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zztg.zza
        final zzk zzb(zztg zztgVar, zzk zzkVar) {
            zzk zzkVar2;
            synchronized (zztgVar) {
                try {
                    zzkVar2 = zztgVar.waiters;
                    if (zzkVar2 != zzkVar) {
                        zztgVar.waiters = zzkVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zzkVar2;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zztg.zza
        final void zzc(zzk zzkVar, zzk zzkVar2) {
            zzkVar.next = zzkVar2;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zztg.zza
        final void zzd(zzk zzkVar, Thread thread) {
            zzkVar.thread = thread;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zztg.zza
        final boolean zze(zztg zztgVar, zzd zzdVar, zzd zzdVar2) {
            synchronized (zztgVar) {
                try {
                    if (zztgVar.listeners != zzdVar) {
                        return false;
                    }
                    zztgVar.listeners = zzdVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zztg.zza
        final boolean zzf(zztg zztgVar, Object obj, Object obj2) {
            synchronized (zztgVar) {
                try {
                    if (zztgVar.value != obj) {
                        return false;
                    }
                    zztgVar.value = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zztg.zza
        final boolean zzg(zztg zztgVar, zzk zzkVar, zzk zzkVar2) {
            synchronized (zztgVar) {
                try {
                    if (zztgVar.waiters != zzkVar) {
                        return false;
                    }
                    zztgVar.waiters = zzkVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* synthetic */ zzg(zzti zztiVar) {
            super(null);
        }
    }

    interface zzh<V> extends zzuu<V> {
    }

    abstract class zzi<V> extends zztg<V> implements zzh<V> {
        zzi() {
        }
    }

    final class zzj extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;

        private zzj() {
            throw null;
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e10) {
                    throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.ads.interactivemedia.v3.internal.zztg.zzj.1
                    @Override // java.security.PrivilegedExceptionAction
                    public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            }
            try {
                zzc = unsafe.objectFieldOffset(zztg.class.getDeclaredField("waiters"));
                zzb = unsafe.objectFieldOffset(zztg.class.getDeclaredField("listeners"));
                zzd = unsafe.objectFieldOffset(zztg.class.getDeclaredField("value"));
                zze = unsafe.objectFieldOffset(zzk.class.getDeclaredField("thread"));
                zzf = unsafe.objectFieldOffset(zzk.class.getDeclaredField("next"));
                zza = unsafe;
            } catch (NoSuchFieldException e11) {
                throw new RuntimeException(e11);
            }
        }

        /* synthetic */ zzj(zztk zztkVar) {
            super(null);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zztg.zza
        final void zzc(zzk zzkVar, zzk zzkVar2) {
            zza.putObject(zzkVar, zzf, zzkVar2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zztg.zza
        final void zzd(zzk zzkVar, Thread thread) {
            zza.putObject(zzkVar, zze, thread);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zztg.zza
        final boolean zze(zztg zztgVar, zzd zzdVar, zzd zzdVar2) {
            return zztj.zza(zza, zztgVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zztg.zza
        final boolean zzf(zztg zztgVar, Object obj, Object obj2) {
            return zztj.zza(zza, zztgVar, zzd, obj, obj2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zztg.zza
        final boolean zzg(zztg zztgVar, zzk zzkVar, zzk zzkVar2) {
            return zztj.zza(zza, zztgVar, zzc, zzkVar, zzkVar2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zztg.zza
        final zzd zza(zztg zztgVar, zzd zzdVar) {
            zzd zzdVar2;
            do {
                zzdVar2 = zztgVar.listeners;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zze(zztgVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zztg.zza
        final zzk zzb(zztg zztgVar, zzk zzkVar) {
            zzk zzkVar2;
            do {
                zzkVar2 = zztgVar.waiters;
                if (zzkVar == zzkVar2) {
                    break;
                }
            } while (!zzg(zztgVar, zzkVar2, zzkVar));
            return zzkVar2;
        }
    }

    final class zzk {
        static final zzk zza = new zzk(false);
        volatile zzk next;
        volatile Thread thread;

        zzk(boolean z10) {
        }

        zzk() {
            zztg.zza.zzd(this, Thread.currentThread());
        }
    }

    protected zztg() {
    }

    private static Object zzt(Future future) throws ExecutionException {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzx(zztg zztgVar, boolean z10) {
        zzd zzdVar = null;
        while (true) {
            for (zzk zzkVarZzb = zza.zzb(zztgVar, zzk.zza); zzkVarZzb != null; zzkVarZzb = zzkVarZzb.next) {
                Thread thread = zzkVarZzb.thread;
                if (thread != null) {
                    zzkVarZzb.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z10) {
                zztgVar.zzp();
            }
            zztgVar.zzb();
            zzd zzdVar2 = zzdVar;
            zzd zzdVarZza = zza.zza(zztgVar, zzd.zza);
            zzd zzdVar3 = zzdVar2;
            while (zzdVarZza != null) {
                zzd zzdVar4 = zzdVarZza.next;
                zzdVarZza.next = zzdVar3;
                zzdVar3 = zzdVarZza;
                zzdVarZza = zzdVar4;
            }
            while (zzdVar3 != null) {
                zzdVar = zzdVar3.next;
                Runnable runnable = zzdVar3.zzb;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof zzf) {
                    zzf zzfVar = (zzf) runnable2;
                    zztgVar = zzfVar.zza;
                    if (zztgVar.value == zzfVar) {
                        if (zza.zzf(zztgVar, zzfVar, zzs(zzfVar.zzb))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zzdVar3.zzc;
                    Objects.requireNonNull(executor);
                    zzy(runnable2, executor);
                }
                zzdVar3 = zzdVar;
            }
            return;
            z10 = false;
        }
    }

    private final void zzz(zzk zzkVar) {
        zzkVar.thread = null;
        while (true) {
            zzk zzkVar2 = this.waiters;
            if (zzkVar2 != zzk.zza) {
                zzk zzkVar3 = null;
                while (zzkVar2 != null) {
                    zzk zzkVar4 = zzkVar2.next;
                    if (zzkVar2.thread != null) {
                        zzkVar3 = zzkVar2;
                    } else if (zzkVar3 != null) {
                        zzkVar3.next = zzkVar4;
                        if (zzkVar3.thread == null) {
                            break;
                        }
                    } else if (!zza.zzg(this, zzkVar2, zzkVar4)) {
                        break;
                    }
                    zzkVar2 = zzkVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof zzf))) {
            return zzA(obj2);
        }
        zzk zzkVar = this.waiters;
        if (zzkVar != zzk.zza) {
            zzk zzkVar2 = new zzk();
            do {
                zza zzaVar = zza;
                zzaVar.zzc(zzkVar2, zzkVar);
                if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zzz(zzkVar2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof zzf))));
                    return zzA(obj);
                }
                zzkVar = this.waiters;
            } while (zzkVar != zzk.zza);
        }
        Object obj3 = this.value;
        Objects.requireNonNull(obj3);
        return zzA(obj3);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof zzb;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.value != null) & (!(r0 instanceof zzf));
    }

    protected void zzb() {
    }

    protected void zzp() {
    }

    final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.ads.interactivemedia.v3.internal.zztg.zzc.1
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }

            {
                super("Failure occurred while trying to finish a future.");
            }
        });
        final Throwable zzb;

        zzc(Throwable th2) {
            th2.getClass();
            this.zzb = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z10;
        Throwable th2;
        zza zzgVar;
        Throwable th3;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        zzb = z10;
        zzc = new zzut(zztg.class);
        Object[] objArr = 0;
        try {
            zzgVar = new zzj(null);
            th2 = null;
            th3 = null;
        } catch (Error | Exception e10) {
            try {
                th2 = null;
                th3 = e10;
                zzgVar = new zze(AtomicReferenceFieldUpdater.newUpdater(zzk.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzk.class, zzk.class, "next"), AtomicReferenceFieldUpdater.newUpdater(zztg.class, zzk.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zztg.class, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zztg.class, Object.class, "value"));
            } catch (Error | Exception e11) {
                th2 = e11;
                zzgVar = new zzg(objArr == true ? 1 : 0);
                th3 = e10;
            }
        }
        zza = zzgVar;
        if (th2 != null) {
            zzut zzutVar = zzc;
            Logger loggerZza = zzutVar.zza();
            Level level = Level.SEVERE;
            loggerZza.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th3);
            zzutVar.zza().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        zzba = new Object();
    }

    private static final Object zzA(Object obj) throws ExecutionException {
        if (obj instanceof zzb) {
            Throwable th2 = ((zzb) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        }
        if (obj == zzba) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object zzs(zzuu zzuuVar) {
        Throwable thZzj;
        if (zzuuVar instanceof zzh) {
            Object zzbVar = ((zztg) zzuuVar).value;
            if (zzbVar instanceof zzb) {
                zzb zzbVar2 = (zzb) zzbVar;
                if (zzbVar2.zzc) {
                    Throwable th2 = zzbVar2.zzd;
                    zzbVar = th2 != null ? new zzb(false, th2) : zzb.zzb;
                }
            }
            Objects.requireNonNull(zzbVar);
            return zzbVar;
        }
        if ((zzuuVar instanceof zzvi) && (thZzj = ((zzvi) zzuuVar).zzj()) != null) {
            return new zzc(thZzj);
        }
        boolean zIsCancelled = zzuuVar.isCancelled();
        if ((!zzb) && zIsCancelled) {
            zzb zzbVar3 = zzb.zzb;
            Objects.requireNonNull(zzbVar3);
            return zzbVar3;
        }
        try {
            Object objZzt = zzt(zzuuVar);
            if (!zIsCancelled) {
                return objZzt == null ? zzba : objZzt;
            }
            return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(zzuuVar)));
        } catch (Error | Exception e10) {
            return new zzc(e10);
        } catch (CancellationException e11) {
            return !zIsCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(zzuuVar)), e11)) : new zzb(false, e11);
        } catch (ExecutionException e12) {
            return zIsCancelled ? new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzuuVar)), e12)) : new zzc(e12.getCause());
        }
    }

    private final void zzu(StringBuilder sb2) {
        try {
            Object objZzt = zzt(this);
            sb2.append("SUCCESS, result=[");
            if (objZzt == null) {
                sb2.append(BuildConfig.TRAVIS);
            } else if (objZzt == this) {
                sb2.append("this future");
            } else {
                sb2.append(objZzt.getClass().getName());
                sb2.append("@");
                sb2.append(Integer.toHexString(System.identityHashCode(objZzt)));
            }
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        } catch (Exception e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    private final void zzw(StringBuilder sb2, Object obj) {
        try {
            if (obj == this) {
                sb2.append("this future");
            } else {
                sb2.append(obj);
            }
        } catch (Exception e10) {
            e = e10;
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e.getClass());
        } catch (StackOverflowError e11) {
            e = e11;
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e.getClass());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.value
            boolean r1 = r0 instanceof com.google.ads.interactivemedia.v3.internal.zztg.zzf
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5f
            boolean r1 = com.google.ads.interactivemedia.v3.internal.zztg.zzb
            if (r1 == 0) goto L1f
            com.google.ads.interactivemedia.v3.internal.zztg$zzb r1 = new com.google.ads.interactivemedia.v3.internal.zztg$zzb
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.google.ads.interactivemedia.v3.internal.zztg$zzb r1 = com.google.ads.interactivemedia.v3.internal.zztg.zzb.zza
            goto L26
        L24:
            com.google.ads.interactivemedia.v3.internal.zztg$zzb r1 = com.google.ads.interactivemedia.v3.internal.zztg.zzb.zzb
        L26:
            java.util.Objects.requireNonNull(r1)
        L29:
            r4 = r7
            r5 = r2
        L2b:
            com.google.ads.interactivemedia.v3.internal.zztg$zza r6 = com.google.ads.interactivemedia.v3.internal.zztg.zza
            boolean r6 = r6.zzf(r4, r0, r1)
            if (r6 == 0) goto L58
            zzx(r4, r8)
            boolean r4 = r0 instanceof com.google.ads.interactivemedia.v3.internal.zztg.zzf
            if (r4 == 0) goto L57
            com.google.ads.interactivemedia.v3.internal.zztg$zzf r0 = (com.google.ads.interactivemedia.v3.internal.zztg.zzf) r0
            com.google.ads.interactivemedia.v3.internal.zzuu<? extends V> r0 = r0.zzb
            boolean r4 = r0 instanceof com.google.ads.interactivemedia.v3.internal.zztg.zzh
            if (r4 == 0) goto L54
            r4 = r0
            com.google.ads.interactivemedia.v3.internal.zztg r4 = (com.google.ads.interactivemedia.v3.internal.zztg) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L4b
            r5 = r3
            goto L4c
        L4b:
            r5 = r2
        L4c:
            boolean r6 = r0 instanceof com.google.ads.interactivemedia.v3.internal.zztg.zzf
            r5 = r5 | r6
            if (r5 == 0) goto L53
            r5 = r3
            goto L2b
        L53:
            return r3
        L54:
            r0.cancel(r8)
        L57:
            return r3
        L58:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof com.google.ads.interactivemedia.v3.internal.zztg.zzf
            if (r6 != 0) goto L2b
            return r5
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zztg.cancel(boolean):boolean");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (this.value instanceof zzb) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            zzu(sb2);
        } else {
            zzv(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String zza() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean zzc(Object obj) {
        if (obj == null) {
            obj = zzba;
        }
        if (!zza.zzf(this, null, obj)) {
            return false;
        }
        zzx(this, false);
        return true;
    }

    protected boolean zzd(Throwable th2) {
        th2.getClass();
        if (!zza.zzf(this, null, new zzc(th2))) {
            return false;
        }
        zzx(this, false);
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzvi
    protected final Throwable zzj() {
        if (!(this instanceof zzh)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzuu
    public final void zzo(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzqh.zzc(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listeners) != zzd.zza) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zza.zze(this, zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.listeners;
                }
            } while (zzdVar != zzd.zza);
        }
        zzy(runnable, executor);
    }

    protected final boolean zzr() {
        Object obj = this.value;
        return (obj instanceof zzb) && ((zzb) obj).zzc;
    }

    private final void zzv(StringBuilder sb2) {
        String strConcat;
        int length = sb2.length();
        sb2.append("PENDING");
        Object obj = this.value;
        if (obj instanceof zzf) {
            sb2.append(", setFuture=[");
            zzw(sb2, ((zzf) obj).zzb);
            sb2.append("]");
        } else {
            try {
                strConcat = zzqm.zza(zza());
            } catch (Exception | StackOverflowError e10) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e10.getClass()));
            }
            if (strConcat != null) {
                sb2.append(", info=[");
                sb2.append(strConcat);
                sb2.append("]");
            }
        }
        if (isDone()) {
            sb2.delete(length, sb2.length());
            zzu(sb2);
        }
    }

    private static void zzy(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            zzc.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e10);
        }
    }

    protected final boolean zzq(zzuu zzuuVar) {
        zzc zzcVar;
        zzuuVar.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (zzuuVar.isDone()) {
                if (!zza.zzf(this, null, zzs(zzuuVar))) {
                    return false;
                }
                zzx(this, false);
                return true;
            }
            zzf zzfVar = new zzf(this, zzuuVar);
            if (zza.zzf(this, null, zzfVar)) {
                try {
                    zzuuVar.zzo(zzfVar, zzua.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        zzcVar = new zzc(th2);
                    } catch (Error | Exception unused) {
                        zzcVar = zzc.zza;
                    }
                    zza.zzf(this, zzfVar, zzcVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof zzb) {
            zzuuVar.cancel(((zzb) obj).zzc);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z10 = true;
            if ((obj != null) & (!(obj instanceof zzf))) {
                return zzA(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                zzk zzkVar = this.waiters;
                if (zzkVar != zzk.zza) {
                    zzk zzkVar2 = new zzk();
                    do {
                        zza zzaVar = zza;
                        zzaVar.zzc(zzkVar2, zzkVar);
                        if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) & (!(obj2 instanceof zzf))) {
                                        return zzA(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    zzz(zzkVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            zzz(zzkVar2);
                        } else {
                            zzkVar = this.waiters;
                        }
                    } while (zzkVar != zzk.zza);
                }
                Object obj3 = this.value;
                Objects.requireNonNull(obj3);
                return zzA(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.value;
                if ((obj4 != null) & (!(obj4 instanceof zzf))) {
                    return zzA(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String string2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = string2.toLowerCase(locale);
            String strConcat = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j11 = -nanos;
                long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
                long nanos2 = j11 - timeUnit.toNanos(jConvert);
                if (jConvert != 0 && nanos2 <= 1000) {
                    z10 = false;
                }
                if (jConvert > 0) {
                    String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                    if (z10) {
                        strConcat3 = strConcat3.concat(",");
                    }
                    strConcat2 = strConcat3.concat(" ");
                }
                if (z10) {
                    strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                }
                strConcat = strConcat2.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(strConcat + " for " + string);
        }
        throw new InterruptedException();
    }
}
