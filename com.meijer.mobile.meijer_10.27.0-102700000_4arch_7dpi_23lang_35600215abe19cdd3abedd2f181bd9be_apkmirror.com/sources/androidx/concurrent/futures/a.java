package androidx.concurrent.futures;

import com.google.common.util.concurrent.q;
import java.util.Locale;
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

/* loaded from: classes.dex */
public abstract class a<V> implements q<V> {

    /* renamed from: d, reason: collision with root package name */
    static final boolean f52954d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    private static final Logger f52955e = Logger.getLogger(a.class.getName());

    /* renamed from: f, reason: collision with root package name */
    static final b f52956f;

    /* renamed from: g, reason: collision with root package name */
    private static final Object f52957g;

    /* renamed from: a, reason: collision with root package name */
    volatile Object f52958a;

    /* renamed from: b, reason: collision with root package name */
    volatile e f52959b;

    /* renamed from: c, reason: collision with root package name */
    volatile i f52960c;

    private static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> aVar, e eVar, e eVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    private static final class c {

        /* renamed from: c, reason: collision with root package name */
        static final c f52961c;

        /* renamed from: d, reason: collision with root package name */
        static final c f52962d;

        /* renamed from: a, reason: collision with root package name */
        final boolean f52963a;

        /* renamed from: b, reason: collision with root package name */
        final Throwable f52964b;

        static {
            if (a.f52954d) {
                f52962d = null;
                f52961c = null;
            } else {
                f52962d = new c(false, null);
                f52961c = new c(true, null);
            }
        }

        c(boolean z10, Throwable th2) {
            this.f52963a = z10;
            this.f52964b = th2;
        }
    }

    private static final class d {

        /* renamed from: b, reason: collision with root package name */
        static final d f52965b = new d(new C1087a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        final Throwable f52966a;

        /* renamed from: androidx.concurrent.futures.a$d$a, reason: collision with other inner class name */
        class C1087a extends Throwable {
            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }

            C1087a(String str) {
                super(str);
            }
        }

        d(Throwable th2) {
            this.f52966a = (Throwable) a.l(th2);
        }
    }

    private static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f52971a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f52972b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f52973c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f52974d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f52975e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f52971a = atomicReferenceFieldUpdater;
            this.f52972b = atomicReferenceFieldUpdater2;
            this.f52973c = atomicReferenceFieldUpdater3;
            this.f52974d = atomicReferenceFieldUpdater4;
            this.f52975e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f52974d, aVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f52975e, aVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f52973c, aVar, iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            this.f52972b.lazySet(iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            this.f52971a.lazySet(iVar, thread);
        }
    }

    private static final class g<V> implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final a<V> f52976a;

        /* renamed from: b, reason: collision with root package name */
        final q<? extends V> f52977b;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f52976a.f52958a != this) {
                return;
            }
            if (a.f52956f.b(this.f52976a, this, a.u(this.f52977b))) {
                a.o(this.f52976a);
            }
        }
    }

    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f52959b != eVar) {
                        return false;
                    }
                    aVar.f52959b = eVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f52958a != obj) {
                        return false;
                    }
                    aVar.f52958a = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f52960c != iVar) {
                        return false;
                    }
                    aVar.f52960c = iVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f52980b = iVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f52979a = thread;
        }
    }

    private static final class i {

        /* renamed from: c, reason: collision with root package name */
        static final i f52978c = new i(false);

        /* renamed from: a, reason: collision with root package name */
        volatile Thread f52979a;

        /* renamed from: b, reason: collision with root package name */
        volatile i f52980b;

        i(boolean z10) {
        }

        i() {
            a.f52956f.e(this, Thread.currentThread());
        }

        void a(i iVar) {
            a.f52956f.d(this, iVar);
        }

        void b() {
            Thread thread = this.f52979a;
            if (thread != null) {
                this.f52979a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    private void D(i iVar) {
        iVar.f52979a = null;
        while (true) {
            i iVar2 = this.f52960c;
            if (iVar2 == i.f52978c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f52980b;
                if (iVar2.f52979a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f52980b = iVar4;
                    if (iVar3.f52979a == null) {
                        break;
                    }
                } else if (!f52956f.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    static void o(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.C();
            aVar.b();
            e eVarM = aVar.m(eVar);
            while (eVarM != null) {
                eVar = eVarM.f52970c;
                Runnable runnable = eVarM.f52968a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f52976a;
                    if (aVar.f52958a == gVar) {
                        if (f52956f.b(aVar, gVar, u(gVar.f52977b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    p(runnable, eVarM.f52969b);
                }
                eVarM = eVar;
            }
            return;
        }
    }

    static <V> V w(Future<V> future) throws ExecutionException {
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

    protected void b() {
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f52958a;
        if ((obj != null) && (!(obj instanceof g))) {
            return t(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f52960c;
            if (iVar != i.f52978c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f52956f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                D(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f52958a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return t(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        D(iVar2);
                    } else {
                        iVar = this.f52960c;
                    }
                } while (iVar != i.f52978c);
            }
            return t(this.f52958a);
        }
        while (nanos > 0) {
            Object obj3 = this.f52958a;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return t(obj3);
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

    protected void z() {
    }

    private static final class e {

        /* renamed from: d, reason: collision with root package name */
        static final e f52967d = new e(null, null);

        /* renamed from: a, reason: collision with root package name */
        final Runnable f52968a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f52969b;

        /* renamed from: c, reason: collision with root package name */
        e f52970c;

        e(Runnable runnable, Executor executor) {
            this.f52968a = runnable;
            this.f52969b = executor;
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            hVar = new h();
        }
        f52956f = hVar;
        if (th != null) {
            f52955e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f52957g = new Object();
    }

    private void C() {
        i iVar;
        do {
            iVar = this.f52960c;
        } while (!f52956f.c(this, iVar, i.f52978c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f52980b;
        }
    }

    private String G(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private void a(StringBuilder sb2) {
        try {
            Object objW = w(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(G(objW));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    private static CancellationException e(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    private e m(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f52959b;
        } while (!f52956f.a(this, eVar2, e.f52967d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f52970c;
            eVar4.f52970c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V t(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw e("Task was cancelled.", ((c) obj).f52964b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f52966a);
        }
        if (obj == f52957g) {
            return null;
        }
        return obj;
    }

    static Object u(q<?> qVar) {
        if (qVar instanceof a) {
            Object obj = ((a) qVar).f52958a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f52963a ? cVar.f52964b != null ? new c(false, cVar.f52964b) : c.f52962d : obj;
        }
        boolean zIsCancelled = qVar.isCancelled();
        if ((!f52954d) && zIsCancelled) {
            return c.f52962d;
        }
        try {
            Object objW = w(qVar);
            return objW == null ? f52957g : objW;
        } catch (CancellationException e10) {
            if (zIsCancelled) {
                return new c(false, e10);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + qVar, e10));
        } catch (ExecutionException e11) {
            return new d(e11.getCause());
        } catch (Throwable th2) {
            return new d(th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String B() {
        Object obj = this.f52958a;
        if (obj instanceof g) {
            return "setFuture=[" + G(((g) obj).f52977b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean E(V v10) {
        if (v10 == null) {
            v10 = (V) f52957g;
        }
        if (!f52956f.b(this, null, v10)) {
            return false;
        }
        o(this);
        return true;
    }

    protected boolean F(Throwable th2) {
        if (!f52956f.b(this, null, new d((Throwable) l(th2)))) {
            return false;
        }
        o(this);
        return true;
    }

    protected final boolean H() {
        Object obj = this.f52958a;
        return (obj instanceof c) && ((c) obj).f52963a;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f52958a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f52954d ? new c(z10, new CancellationException("Future.cancel() was called.")) : z10 ? c.f52961c : c.f52962d;
        a<V> aVar = this;
        boolean z11 = false;
        while (true) {
            if (f52956f.b(aVar, obj, cVar)) {
                if (z10) {
                    aVar.z();
                }
                o(aVar);
                if (!(obj instanceof g)) {
                    break;
                }
                q<? extends V> qVar = ((g) obj).f52977b;
                if (!(qVar instanceof a)) {
                    qVar.cancel(z10);
                    break;
                }
                aVar = (a) qVar;
                obj = aVar.f52958a;
                if (!(obj == null) && !(obj instanceof g)) {
                    break;
                }
                z11 = true;
            } else {
                obj = aVar.f52958a;
                if (!(obj instanceof g)) {
                    return z11;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f52958a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f52958a != null);
    }

    public String toString() {
        String strB;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                strB = B();
            } catch (RuntimeException e10) {
                strB = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strB != null && !strB.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strB);
                sb2.append("]");
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    protected a() {
    }

    static <T> T l(T t10) {
        t10.getClass();
        return t10;
    }

    private static void p(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f52955e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    @Override // com.google.common.util.concurrent.q
    public final void addListener(Runnable runnable, Executor executor) {
        l(runnable);
        l(executor);
        e eVar = this.f52959b;
        if (eVar != e.f52967d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f52970c = eVar;
                if (f52956f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f52959b;
                }
            } while (eVar != e.f52967d);
        }
        p(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f52958a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return t(obj2);
            }
            i iVar = this.f52960c;
            if (iVar != i.f52978c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f52956f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f52958a;
                            } else {
                                D(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return t(obj);
                    }
                    iVar = this.f52960c;
                } while (iVar != i.f52978c);
            }
            return t(this.f52958a);
        }
        throw new InterruptedException();
    }
}
