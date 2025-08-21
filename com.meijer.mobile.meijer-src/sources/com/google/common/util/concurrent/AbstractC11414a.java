package com.google.common.util.concurrent;

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

/* renamed from: com.google.common.util.concurrent.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC11414a<V> extends com.google.common.util.concurrent.internal.a implements q<V> {
    private static final b ATOMIC_HELPER;
    static final boolean GENERATE_CANCELLATION_CAUSES;
    private static final Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    static final p log;
    private volatile e listeners;
    private volatile Object value;
    private volatile l waiters;

    /* renamed from: com.google.common.util.concurrent.a$b */
    private static abstract class b {
        private b() {
        }

        abstract boolean a(AbstractC11414a<?> abstractC11414a, e eVar, e eVar2);

        abstract boolean b(AbstractC11414a<?> abstractC11414a, Object obj, Object obj2);

        abstract boolean c(AbstractC11414a<?> abstractC11414a, l lVar, l lVar2);

        abstract e d(AbstractC11414a<?> abstractC11414a, e eVar);

        abstract l e(AbstractC11414a<?> abstractC11414a, l lVar);

        abstract void f(l lVar, l lVar2);

        abstract void g(l lVar, Thread thread);
    }

    /* renamed from: com.google.common.util.concurrent.a$c */
    private static final class c {

        /* renamed from: c, reason: collision with root package name */
        static final c f88904c;

        /* renamed from: d, reason: collision with root package name */
        static final c f88905d;

        /* renamed from: a, reason: collision with root package name */
        final boolean f88906a;

        /* renamed from: b, reason: collision with root package name */
        final Throwable f88907b;

        static {
            if (AbstractC11414a.GENERATE_CANCELLATION_CAUSES) {
                f88905d = null;
                f88904c = null;
            } else {
                f88905d = new c(false, null);
                f88904c = new c(true, null);
            }
        }

        c(boolean z10, Throwable th2) {
            this.f88906a = z10;
            this.f88907b = th2;
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$d */
    private static final class d {

        /* renamed from: b, reason: collision with root package name */
        static final d f88908b = new d(new C1286a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        final Throwable f88909a;

        /* renamed from: com.google.common.util.concurrent.a$d$a, reason: collision with other inner class name */
        class C1286a extends Throwable {
            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }

            C1286a(String str) {
                super(str);
            }
        }

        d(Throwable th2) {
            this.f88909a = (Throwable) De.p.q(th2);
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$f */
    private static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<l, Thread> f88914a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<l, l> f88915b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<? super AbstractC11414a<?>, l> f88916c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<? super AbstractC11414a<?>, e> f88917d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<? super AbstractC11414a<?>, Object> f88918e;

        f(AtomicReferenceFieldUpdater<l, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<l, l> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<? super AbstractC11414a<?>, l> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<? super AbstractC11414a<?>, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<? super AbstractC11414a<?>, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f88914a = atomicReferenceFieldUpdater;
            this.f88915b = atomicReferenceFieldUpdater2;
            this.f88916c = atomicReferenceFieldUpdater3;
            this.f88917d = atomicReferenceFieldUpdater4;
            this.f88918e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.AbstractC11414a.b
        boolean a(AbstractC11414a<?> abstractC11414a, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f88917d, abstractC11414a, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC11414a.b
        boolean b(AbstractC11414a<?> abstractC11414a, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f88918e, abstractC11414a, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractC11414a.b
        boolean c(AbstractC11414a<?> abstractC11414a, l lVar, l lVar2) {
            return androidx.concurrent.futures.b.a(this.f88916c, abstractC11414a, lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC11414a.b
        e d(AbstractC11414a<?> abstractC11414a, e eVar) {
            return this.f88917d.getAndSet(abstractC11414a, eVar);
        }

        @Override // com.google.common.util.concurrent.AbstractC11414a.b
        l e(AbstractC11414a<?> abstractC11414a, l lVar) {
            return this.f88916c.getAndSet(abstractC11414a, lVar);
        }

        @Override // com.google.common.util.concurrent.AbstractC11414a.b
        void f(l lVar, l lVar2) {
            this.f88915b.lazySet(lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC11414a.b
        void g(l lVar, Thread thread) {
            this.f88914a.lazySet(lVar, thread);
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$g */
    private static final class g<V> implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final AbstractC11414a<V> f88919a;

        /* renamed from: b, reason: collision with root package name */
        final q<? extends V> f88920b;

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractC11414a) this.f88919a).value != this) {
                return;
            }
            if (AbstractC11414a.ATOMIC_HELPER.b(this.f88919a, this, AbstractC11414a.getFutureValue(this.f88920b))) {
                AbstractC11414a.complete(this.f88919a, false);
            }
        }

        g(AbstractC11414a<V> abstractC11414a, q<? extends V> qVar) {
            this.f88919a = abstractC11414a;
            this.f88920b = qVar;
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$h */
    private static final class h extends b {
        private h() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractC11414a.b
        boolean a(AbstractC11414a<?> abstractC11414a, e eVar, e eVar2) {
            synchronized (abstractC11414a) {
                try {
                    if (((AbstractC11414a) abstractC11414a).listeners != eVar) {
                        return false;
                    }
                    ((AbstractC11414a) abstractC11414a).listeners = eVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractC11414a.b
        boolean b(AbstractC11414a<?> abstractC11414a, Object obj, Object obj2) {
            synchronized (abstractC11414a) {
                try {
                    if (((AbstractC11414a) abstractC11414a).value != obj) {
                        return false;
                    }
                    ((AbstractC11414a) abstractC11414a).value = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractC11414a.b
        boolean c(AbstractC11414a<?> abstractC11414a, l lVar, l lVar2) {
            synchronized (abstractC11414a) {
                try {
                    if (((AbstractC11414a) abstractC11414a).waiters != lVar) {
                        return false;
                    }
                    ((AbstractC11414a) abstractC11414a).waiters = lVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractC11414a.b
        e d(AbstractC11414a<?> abstractC11414a, e eVar) {
            e eVar2;
            synchronized (abstractC11414a) {
                try {
                    eVar2 = ((AbstractC11414a) abstractC11414a).listeners;
                    if (eVar2 != eVar) {
                        ((AbstractC11414a) abstractC11414a).listeners = eVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return eVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractC11414a.b
        l e(AbstractC11414a<?> abstractC11414a, l lVar) {
            l lVar2;
            synchronized (abstractC11414a) {
                try {
                    lVar2 = ((AbstractC11414a) abstractC11414a).waiters;
                    if (lVar2 != lVar) {
                        ((AbstractC11414a) abstractC11414a).waiters = lVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return lVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractC11414a.b
        void f(l lVar, l lVar2) {
            lVar.f88929b = lVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractC11414a.b
        void g(l lVar, Thread thread) {
            lVar.f88928a = thread;
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$i */
    interface i<V> extends q<V> {
    }

    /* renamed from: com.google.common.util.concurrent.a$j */
    static abstract class j<V> extends AbstractC11414a<V> implements i<V> {
        @Override // com.google.common.util.concurrent.AbstractC11414a, java.util.concurrent.Future
        public final V get() throws ExecutionException, InterruptedException {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.AbstractC11414a, java.util.concurrent.Future
        public final V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) super.get(j10, timeUnit);
        }

        j() {
        }

        @Override // com.google.common.util.concurrent.AbstractC11414a, com.google.common.util.concurrent.q
        public final void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.AbstractC11414a, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        @Override // com.google.common.util.concurrent.AbstractC11414a, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.AbstractC11414a, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$k */
    private static final class k extends b {

        /* renamed from: a, reason: collision with root package name */
        static final Unsafe f88921a;

        /* renamed from: b, reason: collision with root package name */
        static final long f88922b;

        /* renamed from: c, reason: collision with root package name */
        static final long f88923c;

        /* renamed from: d, reason: collision with root package name */
        static final long f88924d;

        /* renamed from: e, reason: collision with root package name */
        static final long f88925e;

        /* renamed from: f, reason: collision with root package name */
        static final long f88926f;

        /* renamed from: com.google.common.util.concurrent.a$k$a, reason: collision with other inner class name */
        class C1287a implements PrivilegedExceptionAction<Unsafe> {
            @Override // java.security.PrivilegedExceptionAction
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Unsafe run() throws Exception {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }

            C1287a() {
            }
        }

        private k() {
            super();
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
                unsafe = (Unsafe) AccessController.doPrivileged(new C1287a());
            }
            try {
                f88923c = unsafe.objectFieldOffset(AbstractC11414a.class.getDeclaredField("waiters"));
                f88922b = unsafe.objectFieldOffset(AbstractC11414a.class.getDeclaredField("listeners"));
                f88924d = unsafe.objectFieldOffset(AbstractC11414a.class.getDeclaredField("value"));
                f88925e = unsafe.objectFieldOffset(l.class.getDeclaredField("a"));
                f88926f = unsafe.objectFieldOffset(l.class.getDeclaredField("b"));
                f88921a = unsafe;
            } catch (NoSuchFieldException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractC11414a.b
        boolean a(AbstractC11414a<?> abstractC11414a, e eVar, e eVar2) {
            return com.google.ads.interactivemedia.v3.internal.f.a(f88921a, abstractC11414a, f88922b, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC11414a.b
        boolean b(AbstractC11414a<?> abstractC11414a, Object obj, Object obj2) {
            return com.google.ads.interactivemedia.v3.internal.f.a(f88921a, abstractC11414a, f88924d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractC11414a.b
        boolean c(AbstractC11414a<?> abstractC11414a, l lVar, l lVar2) {
            return com.google.ads.interactivemedia.v3.internal.f.a(f88921a, abstractC11414a, f88923c, lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC11414a.b
        void f(l lVar, l lVar2) {
            f88921a.putObject(lVar, f88926f, lVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC11414a.b
        void g(l lVar, Thread thread) {
            f88921a.putObject(lVar, f88925e, thread);
        }

        @Override // com.google.common.util.concurrent.AbstractC11414a.b
        e d(AbstractC11414a<?> abstractC11414a, e eVar) {
            e eVar2;
            do {
                eVar2 = ((AbstractC11414a) abstractC11414a).listeners;
                if (eVar == eVar2) {
                    break;
                }
            } while (!a(abstractC11414a, eVar2, eVar));
            return eVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractC11414a.b
        l e(AbstractC11414a<?> abstractC11414a, l lVar) {
            l lVar2;
            do {
                lVar2 = ((AbstractC11414a) abstractC11414a).waiters;
                if (lVar == lVar2) {
                    break;
                }
            } while (!c(abstractC11414a, lVar2, lVar));
            return lVar2;
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$l */
    private static final class l {

        /* renamed from: c, reason: collision with root package name */
        static final l f88927c = new l(false);

        /* renamed from: a, reason: collision with root package name */
        volatile Thread f88928a;

        /* renamed from: b, reason: collision with root package name */
        volatile l f88929b;

        l(boolean z10) {
        }

        l() {
            AbstractC11414a.ATOMIC_HELPER.g(this, Thread.currentThread());
        }

        void b() {
            Thread thread = this.f88928a;
            if (thread != null) {
                this.f88928a = null;
                LockSupport.unpark(thread);
            }
        }

        void a(l lVar) {
            AbstractC11414a.ATOMIC_HELPER.f(this, lVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void complete(AbstractC11414a<?> abstractC11414a, boolean z10) {
        e eVar = null;
        while (true) {
            abstractC11414a.releaseWaiters();
            if (z10) {
                abstractC11414a.interruptTask();
                z10 = false;
            }
            abstractC11414a.afterDone();
            e eVarClearListeners = abstractC11414a.clearListeners(eVar);
            while (eVarClearListeners != null) {
                eVar = eVarClearListeners.f88913c;
                Runnable runnable = eVarClearListeners.f88911a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof g) {
                    g gVar = (g) runnable2;
                    abstractC11414a = gVar.f88919a;
                    if (((AbstractC11414a) abstractC11414a).value == gVar) {
                        if (ATOMIC_HELPER.b(abstractC11414a, gVar, getFutureValue(gVar.f88920b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = eVarClearListeners.f88912b;
                    Objects.requireNonNull(executor);
                    executeListener(runnable2, executor);
                }
                eVarClearListeners = eVar;
            }
            return;
        }
    }

    private static <V> V getUninterruptibly(Future<V> future) throws ExecutionException {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
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
        return v10;
    }

    private void removeWaiter(l lVar) {
        lVar.f88928a = null;
        while (true) {
            l lVar2 = this.waiters;
            if (lVar2 == l.f88927c) {
                return;
            }
            l lVar3 = null;
            while (lVar2 != null) {
                l lVar4 = lVar2.f88929b;
                if (lVar2.f88928a != null) {
                    lVar3 = lVar2;
                } else if (lVar3 != null) {
                    lVar3.f88929b = lVar4;
                    if (lVar3.f88928a == null) {
                        break;
                    }
                } else if (!ATOMIC_HELPER.c(this, lVar2, lVar4)) {
                    break;
                }
                lVar2 = lVar4;
            }
            return;
        }
    }

    protected void afterDone() {
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) && (!(obj instanceof g))) {
            return getDoneValue(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            l lVar = this.waiters;
            if (lVar != l.f88927c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (ATOMIC_HELPER.c(this, lVar, lVar2)) {
                        do {
                            w.a(this, nanos);
                            if (Thread.interrupted()) {
                                removeWaiter(lVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return getDoneValue(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        removeWaiter(lVar2);
                    } else {
                        lVar = this.waiters;
                    }
                } while (lVar != l.f88927c);
            }
            Object obj3 = this.value;
            Objects.requireNonNull(obj3);
            return getDoneValue(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.value;
            if ((obj4 != null) && (!(obj4 instanceof g))) {
                return getDoneValue(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z10) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z10) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    protected void interruptTask() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.common.util.concurrent.a$a] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v3 */
    static {
        boolean z10;
        Throwable th2;
        b fVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        GENERATE_CANCELLATION_CAUSES = z10;
        log = new p(AbstractC11414a.class);
        ?? r32 = 0;
        r32 = 0;
        try {
            fVar = new k();
            th2 = null;
        } catch (Error | Exception e10) {
            th2 = e10;
            try {
                fVar = new f(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC11414a.class, l.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(AbstractC11414a.class, e.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(AbstractC11414a.class, Object.class, "value"));
            } catch (Error | Exception e11) {
                h hVar = new h();
                r32 = e11;
                fVar = hVar;
            }
        }
        ATOMIC_HELPER = fVar;
        if (r32 != 0) {
            p pVar = log;
            Logger loggerA = pVar.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th2);
            pVar.a().log(level, "SafeAtomicHelper is broken!", r32);
        }
        NULL = new Object();
    }

    private void addDoneString(StringBuilder sb2) {
        try {
            Object uninterruptibly = getUninterruptibly(this);
            sb2.append("SUCCESS, result=[");
            appendResultObject(sb2, uninterruptibly);
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

    private void appendResultObject(StringBuilder sb2, Object obj) {
        if (obj == null) {
            sb2.append(BuildConfig.TRAVIS);
        } else {
            if (obj == this) {
                sb2.append("this future");
                return;
            }
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    private void appendUserObject(StringBuilder sb2, Object obj) {
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

    private static CancellationException cancellationExceptionWithCause(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    private e clearListeners(e eVar) {
        e eVar2 = eVar;
        e eVarD = ATOMIC_HELPER.d(this, e.f88910d);
        while (eVarD != null) {
            e eVar3 = eVarD.f88913c;
            eVarD.f88913c = eVar2;
            eVar2 = eVarD;
            eVarD = eVar3;
        }
        return eVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V getDoneValue(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw cancellationExceptionWithCause("Task was cancelled.", ((c) obj).f88907b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f88909a);
        }
        return obj == NULL ? (V) v.b() : obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object getFutureValue(q<?> qVar) {
        Throwable thA;
        if (qVar instanceof i) {
            Object cVar = ((AbstractC11414a) qVar).value;
            if (cVar instanceof c) {
                c cVar2 = (c) cVar;
                if (cVar2.f88906a) {
                    cVar = cVar2.f88907b != null ? new c(false, cVar2.f88907b) : c.f88905d;
                }
            }
            Objects.requireNonNull(cVar);
            return cVar;
        }
        if ((qVar instanceof com.google.common.util.concurrent.internal.a) && (thA = com.google.common.util.concurrent.internal.b.a((com.google.common.util.concurrent.internal.a) qVar)) != null) {
            return new d(thA);
        }
        boolean zIsCancelled = qVar.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) && zIsCancelled) {
            c cVar3 = c.f88905d;
            Objects.requireNonNull(cVar3);
            return cVar3;
        }
        try {
            Object uninterruptibly = getUninterruptibly(qVar);
            if (!zIsCancelled) {
                return uninterruptibly == null ? NULL : uninterruptibly;
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + qVar));
        } catch (Error | Exception e10) {
            return new d(e10);
        } catch (CancellationException e11) {
            if (zIsCancelled) {
                return new c(false, e11);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + qVar, e11));
        } catch (ExecutionException e12) {
            if (!zIsCancelled) {
                return new d(e12.getCause());
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + qVar, e12));
        }
    }

    private void releaseWaiters() {
        for (l lVarE = ATOMIC_HELPER.e(this, l.f88927c); lVarE != null; lVarE = lVarE.f88929b) {
            lVarE.b();
        }
    }

    @Override // com.google.common.util.concurrent.q
    public void addListener(Runnable runnable, Executor executor) {
        e eVar;
        De.p.r(runnable, "Runnable was null.");
        De.p.r(executor, "Executor was null.");
        if (!isDone() && (eVar = this.listeners) != e.f88910d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f88913c = eVar;
                if (ATOMIC_HELPER.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.listeners;
                }
            } while (eVar != e.f88910d);
        }
        executeListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (GENERATE_CANCELLATION_CAUSES) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z10 ? c.f88904c : c.f88905d;
            Objects.requireNonNull(cVar);
        }
        AbstractC11414a<V> abstractC11414a = this;
        boolean z11 = false;
        while (true) {
            if (ATOMIC_HELPER.b(abstractC11414a, obj, cVar)) {
                complete(abstractC11414a, z10);
                if (!(obj instanceof g)) {
                    break;
                }
                q<? extends V> qVar = ((g) obj).f88920b;
                if (!(qVar instanceof i)) {
                    qVar.cancel(z10);
                    break;
                }
                abstractC11414a = (AbstractC11414a) qVar;
                obj = abstractC11414a.value;
                if (!(obj == null) && !(obj instanceof g)) {
                    break;
                }
                z11 = true;
            } else {
                obj = abstractC11414a.value;
                if (!(obj instanceof g)) {
                    return z11;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof g)) & (this.value != null);
    }

    final void maybePropagateCancellationTo(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String pendingToString() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean set(V v10) {
        if (v10 == null) {
            v10 = (V) NULL;
        }
        if (!ATOMIC_HELPER.b(this, null, v10)) {
            return false;
        }
        complete(this, false);
        return true;
    }

    protected boolean setException(Throwable th2) {
        if (!ATOMIC_HELPER.b(this, null, new d((Throwable) De.p.q(th2)))) {
            return false;
        }
        complete(this, false);
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            addDoneString(sb2);
        } else {
            addPendingString(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // com.google.common.util.concurrent.internal.a
    protected final Throwable tryInternalFastPathGetFailure() {
        if (!(this instanceof i)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof d) {
            return ((d) obj).f88909a;
        }
        return null;
    }

    protected final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof c) && ((c) obj).f88906a;
    }

    /* renamed from: com.google.common.util.concurrent.a$e */
    private static final class e {

        /* renamed from: d, reason: collision with root package name */
        static final e f88910d = new e();

        /* renamed from: a, reason: collision with root package name */
        final Runnable f88911a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f88912b;

        /* renamed from: c, reason: collision with root package name */
        e f88913c;

        e(Runnable runnable, Executor executor) {
            this.f88911a = runnable;
            this.f88912b = executor;
        }

        e() {
            this.f88911a = null;
            this.f88912b = null;
        }
    }

    protected AbstractC11414a() {
    }

    private void addPendingString(StringBuilder sb2) {
        String strA;
        int length = sb2.length();
        sb2.append("PENDING");
        Object obj = this.value;
        if (obj instanceof g) {
            sb2.append(", setFuture=[");
            appendUserObject(sb2, ((g) obj).f88920b);
            sb2.append("]");
        } else {
            try {
                strA = De.v.a(pendingToString());
            } catch (Exception | StackOverflowError e10) {
                strA = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strA != null) {
                sb2.append(", info=[");
                sb2.append(strA);
                sb2.append("]");
            }
        }
        if (isDone()) {
            sb2.delete(length, sb2.length());
            addDoneString(sb2);
        }
    }

    private static void executeListener(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            log.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    protected boolean setFuture(q<? extends V> qVar) {
        d dVar;
        De.p.q(qVar);
        Object obj = this.value;
        if (obj == null) {
            if (qVar.isDone()) {
                if (!ATOMIC_HELPER.b(this, null, getFutureValue(qVar))) {
                    return false;
                }
                complete(this, false);
                return true;
            }
            g gVar = new g(this, qVar);
            if (ATOMIC_HELPER.b(this, null, gVar)) {
                try {
                    qVar.addListener(gVar, com.google.common.util.concurrent.e.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        dVar = new d(th2);
                    } catch (Error | Exception unused) {
                        dVar = d.f88908b;
                    }
                    ATOMIC_HELPER.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof c) {
            qVar.cancel(((c) obj).f88906a);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return getDoneValue(obj2);
            }
            l lVar = this.waiters;
            if (lVar != l.f88927c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (ATOMIC_HELPER.c(this, lVar, lVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                removeWaiter(lVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return getDoneValue(obj);
                    }
                    lVar = this.waiters;
                } while (lVar != l.f88927c);
            }
            Object obj3 = this.value;
            Objects.requireNonNull(obj3);
            return getDoneValue(obj3);
        }
        throw new InterruptedException();
    }
}
