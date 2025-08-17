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
public abstract class AbstractC11289a<V> extends com.google.common.util.concurrent.internal.a implements q<V> {
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

        abstract boolean a(AbstractC11289a<?> abstractC11289a, e eVar, e eVar2);

        abstract boolean b(AbstractC11289a<?> abstractC11289a, Object obj, Object obj2);

        abstract boolean c(AbstractC11289a<?> abstractC11289a, l lVar, l lVar2);

        abstract e d(AbstractC11289a<?> abstractC11289a, e eVar);

        abstract l e(AbstractC11289a<?> abstractC11289a, l lVar);

        abstract void f(l lVar, l lVar2);

        abstract void g(l lVar, Thread thread);
    }

    /* renamed from: com.google.common.util.concurrent.a$c */
    private static final class c {

        /* renamed from: c, reason: collision with root package name */
        static final c f88064c;

        /* renamed from: d, reason: collision with root package name */
        static final c f88065d;

        /* renamed from: a, reason: collision with root package name */
        final boolean f88066a;

        /* renamed from: b, reason: collision with root package name */
        final Throwable f88067b;

        static {
            if (AbstractC11289a.GENERATE_CANCELLATION_CAUSES) {
                f88065d = null;
                f88064c = null;
            } else {
                f88065d = new c(false, null);
                f88064c = new c(true, null);
            }
        }

        c(boolean z10, Throwable th2) {
            this.f88066a = z10;
            this.f88067b = th2;
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$d */
    private static final class d {

        /* renamed from: b, reason: collision with root package name */
        static final d f88068b = new d(new C1277a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        final Throwable f88069a;

        /* renamed from: com.google.common.util.concurrent.a$d$a, reason: collision with other inner class name */
        class C1277a extends Throwable {
            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }

            C1277a(String str) {
                super(str);
            }
        }

        d(Throwable th2) {
            this.f88069a = (Throwable) Be.p.q(th2);
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$f */
    private static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<l, Thread> f88074a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<l, l> f88075b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<? super AbstractC11289a<?>, l> f88076c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<? super AbstractC11289a<?>, e> f88077d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<? super AbstractC11289a<?>, Object> f88078e;

        f(AtomicReferenceFieldUpdater<l, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<l, l> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<? super AbstractC11289a<?>, l> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<? super AbstractC11289a<?>, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<? super AbstractC11289a<?>, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f88074a = atomicReferenceFieldUpdater;
            this.f88075b = atomicReferenceFieldUpdater2;
            this.f88076c = atomicReferenceFieldUpdater3;
            this.f88077d = atomicReferenceFieldUpdater4;
            this.f88078e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.AbstractC11289a.b
        boolean a(AbstractC11289a<?> abstractC11289a, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f88077d, abstractC11289a, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC11289a.b
        boolean b(AbstractC11289a<?> abstractC11289a, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f88078e, abstractC11289a, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractC11289a.b
        boolean c(AbstractC11289a<?> abstractC11289a, l lVar, l lVar2) {
            return androidx.concurrent.futures.b.a(this.f88076c, abstractC11289a, lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC11289a.b
        e d(AbstractC11289a<?> abstractC11289a, e eVar) {
            return this.f88077d.getAndSet(abstractC11289a, eVar);
        }

        @Override // com.google.common.util.concurrent.AbstractC11289a.b
        l e(AbstractC11289a<?> abstractC11289a, l lVar) {
            return this.f88076c.getAndSet(abstractC11289a, lVar);
        }

        @Override // com.google.common.util.concurrent.AbstractC11289a.b
        void f(l lVar, l lVar2) {
            this.f88075b.lazySet(lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC11289a.b
        void g(l lVar, Thread thread) {
            this.f88074a.lazySet(lVar, thread);
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$g */
    private static final class g<V> implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final AbstractC11289a<V> f88079a;

        /* renamed from: b, reason: collision with root package name */
        final q<? extends V> f88080b;

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractC11289a) this.f88079a).value != this) {
                return;
            }
            if (AbstractC11289a.ATOMIC_HELPER.b(this.f88079a, this, AbstractC11289a.getFutureValue(this.f88080b))) {
                AbstractC11289a.complete(this.f88079a, false);
            }
        }

        g(AbstractC11289a<V> abstractC11289a, q<? extends V> qVar) {
            this.f88079a = abstractC11289a;
            this.f88080b = qVar;
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$h */
    private static final class h extends b {
        private h() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractC11289a.b
        boolean a(AbstractC11289a<?> abstractC11289a, e eVar, e eVar2) {
            synchronized (abstractC11289a) {
                try {
                    if (((AbstractC11289a) abstractC11289a).listeners != eVar) {
                        return false;
                    }
                    ((AbstractC11289a) abstractC11289a).listeners = eVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractC11289a.b
        boolean b(AbstractC11289a<?> abstractC11289a, Object obj, Object obj2) {
            synchronized (abstractC11289a) {
                try {
                    if (((AbstractC11289a) abstractC11289a).value != obj) {
                        return false;
                    }
                    ((AbstractC11289a) abstractC11289a).value = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractC11289a.b
        boolean c(AbstractC11289a<?> abstractC11289a, l lVar, l lVar2) {
            synchronized (abstractC11289a) {
                try {
                    if (((AbstractC11289a) abstractC11289a).waiters != lVar) {
                        return false;
                    }
                    ((AbstractC11289a) abstractC11289a).waiters = lVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractC11289a.b
        e d(AbstractC11289a<?> abstractC11289a, e eVar) {
            e eVar2;
            synchronized (abstractC11289a) {
                try {
                    eVar2 = ((AbstractC11289a) abstractC11289a).listeners;
                    if (eVar2 != eVar) {
                        ((AbstractC11289a) abstractC11289a).listeners = eVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return eVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractC11289a.b
        l e(AbstractC11289a<?> abstractC11289a, l lVar) {
            l lVar2;
            synchronized (abstractC11289a) {
                try {
                    lVar2 = ((AbstractC11289a) abstractC11289a).waiters;
                    if (lVar2 != lVar) {
                        ((AbstractC11289a) abstractC11289a).waiters = lVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return lVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractC11289a.b
        void f(l lVar, l lVar2) {
            lVar.f88089b = lVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractC11289a.b
        void g(l lVar, Thread thread) {
            lVar.f88088a = thread;
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$i */
    interface i<V> extends q<V> {
    }

    /* renamed from: com.google.common.util.concurrent.a$j */
    static abstract class j<V> extends AbstractC11289a<V> implements i<V> {
        @Override // com.google.common.util.concurrent.AbstractC11289a, java.util.concurrent.Future
        public final V get() throws ExecutionException, InterruptedException {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.AbstractC11289a, java.util.concurrent.Future
        public final V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) super.get(j10, timeUnit);
        }

        j() {
        }

        @Override // com.google.common.util.concurrent.AbstractC11289a, com.google.common.util.concurrent.q
        public final void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.AbstractC11289a, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        @Override // com.google.common.util.concurrent.AbstractC11289a, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.AbstractC11289a, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$k */
    private static final class k extends b {

        /* renamed from: a, reason: collision with root package name */
        static final Unsafe f88081a;

        /* renamed from: b, reason: collision with root package name */
        static final long f88082b;

        /* renamed from: c, reason: collision with root package name */
        static final long f88083c;

        /* renamed from: d, reason: collision with root package name */
        static final long f88084d;

        /* renamed from: e, reason: collision with root package name */
        static final long f88085e;

        /* renamed from: f, reason: collision with root package name */
        static final long f88086f;

        /* renamed from: com.google.common.util.concurrent.a$k$a, reason: collision with other inner class name */
        class C1278a implements PrivilegedExceptionAction<Unsafe> {
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

            C1278a() {
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
                unsafe = (Unsafe) AccessController.doPrivileged(new C1278a());
            }
            try {
                f88083c = unsafe.objectFieldOffset(AbstractC11289a.class.getDeclaredField("waiters"));
                f88082b = unsafe.objectFieldOffset(AbstractC11289a.class.getDeclaredField("listeners"));
                f88084d = unsafe.objectFieldOffset(AbstractC11289a.class.getDeclaredField("value"));
                f88085e = unsafe.objectFieldOffset(l.class.getDeclaredField("a"));
                f88086f = unsafe.objectFieldOffset(l.class.getDeclaredField("b"));
                f88081a = unsafe;
            } catch (NoSuchFieldException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractC11289a.b
        boolean a(AbstractC11289a<?> abstractC11289a, e eVar, e eVar2) {
            return com.google.ads.interactivemedia.v3.internal.f.a(f88081a, abstractC11289a, f88082b, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC11289a.b
        boolean b(AbstractC11289a<?> abstractC11289a, Object obj, Object obj2) {
            return com.google.ads.interactivemedia.v3.internal.f.a(f88081a, abstractC11289a, f88084d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractC11289a.b
        boolean c(AbstractC11289a<?> abstractC11289a, l lVar, l lVar2) {
            return com.google.ads.interactivemedia.v3.internal.f.a(f88081a, abstractC11289a, f88083c, lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC11289a.b
        void f(l lVar, l lVar2) {
            f88081a.putObject(lVar, f88086f, lVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC11289a.b
        void g(l lVar, Thread thread) {
            f88081a.putObject(lVar, f88085e, thread);
        }

        @Override // com.google.common.util.concurrent.AbstractC11289a.b
        e d(AbstractC11289a<?> abstractC11289a, e eVar) {
            e eVar2;
            do {
                eVar2 = ((AbstractC11289a) abstractC11289a).listeners;
                if (eVar == eVar2) {
                    break;
                }
            } while (!a(abstractC11289a, eVar2, eVar));
            return eVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractC11289a.b
        l e(AbstractC11289a<?> abstractC11289a, l lVar) {
            l lVar2;
            do {
                lVar2 = ((AbstractC11289a) abstractC11289a).waiters;
                if (lVar == lVar2) {
                    break;
                }
            } while (!c(abstractC11289a, lVar2, lVar));
            return lVar2;
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$l */
    private static final class l {

        /* renamed from: c, reason: collision with root package name */
        static final l f88087c = new l(false);

        /* renamed from: a, reason: collision with root package name */
        volatile Thread f88088a;

        /* renamed from: b, reason: collision with root package name */
        volatile l f88089b;

        l(boolean z10) {
        }

        l() {
            AbstractC11289a.ATOMIC_HELPER.g(this, Thread.currentThread());
        }

        void b() {
            Thread thread = this.f88088a;
            if (thread != null) {
                this.f88088a = null;
                LockSupport.unpark(thread);
            }
        }

        void a(l lVar) {
            AbstractC11289a.ATOMIC_HELPER.f(this, lVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void complete(AbstractC11289a<?> abstractC11289a, boolean z10) {
        e eVar = null;
        while (true) {
            abstractC11289a.releaseWaiters();
            if (z10) {
                abstractC11289a.interruptTask();
                z10 = false;
            }
            abstractC11289a.afterDone();
            e eVarClearListeners = abstractC11289a.clearListeners(eVar);
            while (eVarClearListeners != null) {
                eVar = eVarClearListeners.f88073c;
                Runnable runnable = eVarClearListeners.f88071a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof g) {
                    g gVar = (g) runnable2;
                    abstractC11289a = gVar.f88079a;
                    if (((AbstractC11289a) abstractC11289a).value == gVar) {
                        if (ATOMIC_HELPER.b(abstractC11289a, gVar, getFutureValue(gVar.f88080b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = eVarClearListeners.f88072b;
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
        lVar.f88088a = null;
        while (true) {
            l lVar2 = this.waiters;
            if (lVar2 == l.f88087c) {
                return;
            }
            l lVar3 = null;
            while (lVar2 != null) {
                l lVar4 = lVar2.f88089b;
                if (lVar2.f88088a != null) {
                    lVar3 = lVar2;
                } else if (lVar3 != null) {
                    lVar3.f88089b = lVar4;
                    if (lVar3.f88088a == null) {
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
            if (lVar != l.f88087c) {
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
                } while (lVar != l.f88087c);
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
        log = new p(AbstractC11289a.class);
        ?? r32 = 0;
        r32 = 0;
        try {
            fVar = new k();
            th2 = null;
        } catch (Error | Exception e10) {
            th2 = e10;
            try {
                fVar = new f(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC11289a.class, l.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(AbstractC11289a.class, e.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(AbstractC11289a.class, Object.class, "value"));
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
        e eVarD = ATOMIC_HELPER.d(this, e.f88070d);
        while (eVarD != null) {
            e eVar3 = eVarD.f88073c;
            eVarD.f88073c = eVar2;
            eVar2 = eVarD;
            eVarD = eVar3;
        }
        return eVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V getDoneValue(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw cancellationExceptionWithCause("Task was cancelled.", ((c) obj).f88067b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f88069a);
        }
        return obj == NULL ? (V) v.b() : obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object getFutureValue(q<?> qVar) {
        Throwable thA;
        if (qVar instanceof i) {
            Object cVar = ((AbstractC11289a) qVar).value;
            if (cVar instanceof c) {
                c cVar2 = (c) cVar;
                if (cVar2.f88066a) {
                    cVar = cVar2.f88067b != null ? new c(false, cVar2.f88067b) : c.f88065d;
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
            c cVar3 = c.f88065d;
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
        for (l lVarE = ATOMIC_HELPER.e(this, l.f88087c); lVarE != null; lVarE = lVarE.f88089b) {
            lVarE.b();
        }
    }

    @Override // com.google.common.util.concurrent.q
    public void addListener(Runnable runnable, Executor executor) {
        e eVar;
        Be.p.r(runnable, "Runnable was null.");
        Be.p.r(executor, "Executor was null.");
        if (!isDone() && (eVar = this.listeners) != e.f88070d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f88073c = eVar;
                if (ATOMIC_HELPER.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.listeners;
                }
            } while (eVar != e.f88070d);
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
            cVar = z10 ? c.f88064c : c.f88065d;
            Objects.requireNonNull(cVar);
        }
        AbstractC11289a<V> abstractC11289a = this;
        boolean z11 = false;
        while (true) {
            if (ATOMIC_HELPER.b(abstractC11289a, obj, cVar)) {
                complete(abstractC11289a, z10);
                if (!(obj instanceof g)) {
                    break;
                }
                q<? extends V> qVar = ((g) obj).f88080b;
                if (!(qVar instanceof i)) {
                    qVar.cancel(z10);
                    break;
                }
                abstractC11289a = (AbstractC11289a) qVar;
                obj = abstractC11289a.value;
                if (!(obj == null) && !(obj instanceof g)) {
                    break;
                }
                z11 = true;
            } else {
                obj = abstractC11289a.value;
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
        if (!ATOMIC_HELPER.b(this, null, new d((Throwable) Be.p.q(th2)))) {
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
            return ((d) obj).f88069a;
        }
        return null;
    }

    protected final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof c) && ((c) obj).f88066a;
    }

    /* renamed from: com.google.common.util.concurrent.a$e */
    private static final class e {

        /* renamed from: d, reason: collision with root package name */
        static final e f88070d = new e();

        /* renamed from: a, reason: collision with root package name */
        final Runnable f88071a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f88072b;

        /* renamed from: c, reason: collision with root package name */
        e f88073c;

        e(Runnable runnable, Executor executor) {
            this.f88071a = runnable;
            this.f88072b = executor;
        }

        e() {
            this.f88071a = null;
            this.f88072b = null;
        }
    }

    protected AbstractC11289a() {
    }

    private void addPendingString(StringBuilder sb2) {
        String strA;
        int length = sb2.length();
        sb2.append("PENDING");
        Object obj = this.value;
        if (obj instanceof g) {
            sb2.append(", setFuture=[");
            appendUserObject(sb2, ((g) obj).f88080b);
            sb2.append("]");
        } else {
            try {
                strA = Be.v.a(pendingToString());
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
        Be.p.q(qVar);
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
                        dVar = d.f88068b;
                    }
                    ATOMIC_HELPER.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof c) {
            qVar.cancel(((c) obj).f88066a);
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
            if (lVar != l.f88087c) {
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
                } while (lVar != l.f88087c);
            }
            Object obj3 = this.value;
            Objects.requireNonNull(obj3);
            return getDoneValue(obj3);
        }
        throw new InterruptedException();
    }
}
