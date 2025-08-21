package com.google.android.gms.internal.ads;

import com.google.maps.android.BuildConfig;
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

/* renamed from: com.google.android.gms.internal.ads.aj0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7620aj0<V> extends AbstractC9330qk0 implements com.google.common.util.concurrent.q<V> {

    /* renamed from: d, reason: collision with root package name */
    static final boolean f73317d;

    /* renamed from: e, reason: collision with root package name */
    static final Vj0 f73318e;

    /* renamed from: f, reason: collision with root package name */
    private static final Pi0 f73319f;

    /* renamed from: g, reason: collision with root package name */
    private static final Object f73320g;

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f73321a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Si0 f73322b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Zi0 f73323c;

    protected AbstractC7620aj0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void A(AbstractC7620aj0 abstractC7620aj0, boolean z10) {
        Si0 si0 = null;
        while (true) {
            for (Zi0 zi0B = f73319f.b(abstractC7620aj0, Zi0.f73073c); zi0B != null; zi0B = zi0B.f73075b) {
                Thread thread = zi0B.f73074a;
                if (thread != null) {
                    zi0B.f73074a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z10) {
                abstractC7620aj0.t();
            }
            abstractC7620aj0.f();
            Si0 si02 = si0;
            Si0 si0A = f73319f.a(abstractC7620aj0, Si0.f70985d);
            Si0 si03 = si02;
            while (si0A != null) {
                Si0 si04 = si0A.f70988c;
                si0A.f70988c = si03;
                si03 = si0A;
                si0A = si04;
            }
            while (si03 != null) {
                si0 = si03.f70988c;
                Runnable runnable = si03.f70986a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof Ui0) {
                    Ui0 ui0 = (Ui0) runnable2;
                    abstractC7620aj0 = ui0.f71523a;
                    if (abstractC7620aj0.f73321a == ui0) {
                        if (f73319f.f(abstractC7620aj0, ui0, i(ui0.f71524b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = si03.f70987b;
                    Objects.requireNonNull(executor);
                    B(runnable2, executor);
                }
                si03 = si0;
            }
            return;
            z10 = false;
        }
    }

    private final void C(Zi0 zi0) {
        zi0.f73074a = null;
        while (true) {
            Zi0 zi02 = this.f73323c;
            if (zi02 != Zi0.f73073c) {
                Zi0 zi03 = null;
                while (zi02 != null) {
                    Zi0 zi04 = zi02.f73075b;
                    if (zi02.f73074a != null) {
                        zi03 = zi02;
                    } else if (zi03 != null) {
                        zi03.f73075b = zi04;
                        if (zi03.f73074a == null) {
                            break;
                        }
                    } else if (!f73319f.g(this, zi02, zi04)) {
                        break;
                    }
                    zi02 = zi04;
                }
                return;
            }
            return;
        }
    }

    private static Object j(Future future) throws ExecutionException {
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

    protected void f() {
    }

    public Object get() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f73321a;
        if ((obj2 != null) && (!(obj2 instanceof Ui0))) {
            return b(obj2);
        }
        Zi0 zi0 = this.f73323c;
        if (zi0 != Zi0.f73073c) {
            Zi0 zi02 = new Zi0();
            do {
                Pi0 pi0 = f73319f;
                pi0.c(zi02, zi0);
                if (pi0.g(this, zi0, zi02)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            C(zi02);
                            throw new InterruptedException();
                        }
                        obj = this.f73321a;
                    } while (!((obj != null) & (!(obj instanceof Ui0))));
                    return b(obj);
                }
                zi0 = this.f73323c;
            } while (zi0 != Zi0.f73073c);
        }
        Object obj3 = this.f73321a;
        Objects.requireNonNull(obj3);
        return b(obj3);
    }

    public boolean isCancelled() {
        return this.f73321a instanceof Qi0;
    }

    public boolean isDone() {
        return (this.f73321a != null) & (!(r0 instanceof Ui0));
    }

    protected void t() {
    }

    static {
        boolean z10;
        Throwable th2;
        Throwable th3;
        Pi0 vi0;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f73317d = z10;
        f73318e = new Vj0(AbstractC7620aj0.class);
        C8046ej0 c8046ej0 = null;
        try {
            vi0 = new Yi0(c8046ej0);
            th3 = null;
            th2 = null;
        } catch (Error | Exception e10) {
            try {
                th2 = e10;
                vi0 = new Ti0(AtomicReferenceFieldUpdater.newUpdater(Zi0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(Zi0.class, Zi0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC7620aj0.class, Zi0.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC7620aj0.class, Si0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC7620aj0.class, Object.class, "a"));
                th3 = null;
            } catch (Error | Exception e11) {
                th2 = e10;
                th3 = e11;
                vi0 = new Vi0(c8046ej0);
            }
        }
        f73319f = vi0;
        if (th3 != null) {
            Vj0 vj0 = f73318e;
            Logger loggerA = vj0.a();
            Level level = Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            vj0.a().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
        f73320g = new Object();
    }

    private static final Object b(Object obj) throws ExecutionException {
        if (obj instanceof Qi0) {
            Throwable th2 = ((Qi0) obj).f70470b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof Ri0) {
            throw new ExecutionException(((Ri0) obj).f70765a);
        }
        if (obj == f73320g) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object i(com.google.common.util.concurrent.q qVar) {
        Throwable thA;
        if (qVar instanceof Wi0) {
            Object qi0 = ((AbstractC7620aj0) qVar).f73321a;
            if (qi0 instanceof Qi0) {
                Qi0 qi02 = (Qi0) qi0;
                if (qi02.f70469a) {
                    Throwable th2 = qi02.f70470b;
                    qi0 = th2 != null ? new Qi0(false, th2) : Qi0.f70468d;
                }
            }
            Objects.requireNonNull(qi0);
            return qi0;
        }
        if ((qVar instanceof AbstractC9330qk0) && (thA = ((AbstractC9330qk0) qVar).a()) != null) {
            return new Ri0(thA);
        }
        boolean zIsCancelled = qVar.isCancelled();
        if ((!f73317d) && zIsCancelled) {
            Qi0 qi03 = Qi0.f70468d;
            Objects.requireNonNull(qi03);
            return qi03;
        }
        try {
            Object objJ = j(qVar);
            if (!zIsCancelled) {
                return objJ == null ? f73320g : objJ;
            }
            return new Qi0(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(qVar)));
        } catch (Error | Exception e10) {
            return new Ri0(e10);
        } catch (CancellationException e11) {
            return !zIsCancelled ? new Ri0(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(qVar)), e11)) : new Qi0(false, e11);
        } catch (ExecutionException e12) {
            return zIsCancelled ? new Qi0(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(qVar)), e12)) : new Ri0(e12.getCause());
        }
    }

    private final void x(StringBuilder sb2) {
        try {
            Object objJ = j(this);
            sb2.append("SUCCESS, result=[");
            if (objJ == null) {
                sb2.append(BuildConfig.TRAVIS);
            } else if (objJ == this) {
                sb2.append("this future");
            } else {
                sb2.append(objJ.getClass().getName());
                sb2.append("@");
                sb2.append(Integer.toHexString(System.identityHashCode(objJ)));
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

    private final void z(StringBuilder sb2, Object obj) {
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

    @Override // com.google.android.gms.internal.ads.AbstractC9330qk0
    protected final Throwable a() {
        if (!(this instanceof Wi0)) {
            return null;
        }
        Object obj = this.f73321a;
        if (obj instanceof Ri0) {
            return ((Ri0) obj).f70765a;
        }
        return null;
    }

    public void addListener(Runnable runnable, Executor executor) {
        Si0 si0;
        C6782Df0.c(runnable, "Runnable was null.");
        C6782Df0.c(executor, "Executor was null.");
        if (!isDone() && (si0 = this.f73322b) != Si0.f70985d) {
            Si0 si02 = new Si0(runnable, executor);
            do {
                si02.f70988c = si0;
                if (f73319f.e(this, si0, si02)) {
                    return;
                } else {
                    si0 = this.f73322b;
                }
            } while (si0 != Si0.f70985d);
        }
        B(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f73321a
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.Ui0
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
            boolean r1 = com.google.android.gms.internal.ads.AbstractC7620aj0.f73317d
            if (r1 == 0) goto L1f
            com.google.android.gms.internal.ads.Qi0 r1 = new com.google.android.gms.internal.ads.Qi0
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.google.android.gms.internal.ads.Qi0 r1 = com.google.android.gms.internal.ads.Qi0.f70467c
            goto L26
        L24:
            com.google.android.gms.internal.ads.Qi0 r1 = com.google.android.gms.internal.ads.Qi0.f70468d
        L26:
            java.util.Objects.requireNonNull(r1)
        L29:
            r4 = r7
            r5 = r2
        L2b:
            com.google.android.gms.internal.ads.Pi0 r6 = com.google.android.gms.internal.ads.AbstractC7620aj0.f73319f
            boolean r6 = r6.f(r4, r0, r1)
            if (r6 == 0) goto L58
            A(r4, r8)
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.Ui0
            if (r4 == 0) goto L57
            com.google.android.gms.internal.ads.Ui0 r0 = (com.google.android.gms.internal.ads.Ui0) r0
            com.google.common.util.concurrent.q<? extends V> r0 = r0.f71524b
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.Wi0
            if (r4 == 0) goto L54
            r4 = r0
            com.google.android.gms.internal.ads.aj0 r4 = (com.google.android.gms.internal.ads.AbstractC7620aj0) r4
            java.lang.Object r0 = r4.f73321a
            if (r0 != 0) goto L4b
            r5 = r3
            goto L4c
        L4b:
            r5 = r2
        L4c:
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.Ui0
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
            java.lang.Object r0 = r4.f73321a
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.Ui0
            if (r6 != 0) goto L2b
            return r5
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC7620aj0.cancel(boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String e() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean g(Object obj) {
        if (obj == null) {
            obj = f73320g;
        }
        if (!f73319f.f(this, null, obj)) {
            return false;
        }
        A(this, false);
        return true;
    }

    protected boolean h(Throwable th2) {
        th2.getClass();
        if (!f73319f.f(this, null, new Ri0(th2))) {
            return false;
        }
        A(this, false);
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
            x(sb2);
        } else {
            y(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    final void u(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(w());
        }
    }

    protected final boolean w() {
        Object obj = this.f73321a;
        return (obj instanceof Qi0) && ((Qi0) obj).f70469a;
    }

    private static void B(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f73318e.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e10);
        }
    }

    private final void y(StringBuilder sb2) {
        String strConcat;
        int length = sb2.length();
        sb2.append("PENDING");
        Object obj = this.f73321a;
        if (obj instanceof Ui0) {
            sb2.append(", setFuture=[");
            z(sb2, ((Ui0) obj).f71524b);
            sb2.append("]");
        } else {
            try {
                strConcat = C7392Vf0.a(e());
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
            x(sb2);
        }
    }

    protected final boolean v(com.google.common.util.concurrent.q qVar) {
        Ri0 ri0;
        qVar.getClass();
        Object obj = this.f73321a;
        if (obj == null) {
            if (qVar.isDone()) {
                if (!f73319f.f(this, null, i(qVar))) {
                    return false;
                }
                A(this, false);
                return true;
            }
            Ui0 ui0 = new Ui0(this, qVar);
            if (f73319f.f(this, null, ui0)) {
                try {
                    qVar.addListener(ui0, EnumC10290zj0.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        ri0 = new Ri0(th2);
                    } catch (Error | Exception unused) {
                        ri0 = Ri0.f70764b;
                    }
                    f73319f.f(this, ui0, ri0);
                }
                return true;
            }
            obj = this.f73321a;
        }
        if (obj instanceof Qi0) {
            qVar.cancel(((Qi0) obj).f70469a);
        }
        return false;
    }

    public Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f73321a;
            boolean z10 = true;
            if ((obj != null) & (!(obj instanceof Ui0))) {
                return b(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                Zi0 zi0 = this.f73323c;
                if (zi0 != Zi0.f73073c) {
                    Zi0 zi02 = new Zi0();
                    do {
                        Pi0 pi0 = f73319f;
                        pi0.c(zi02, zi0);
                        if (pi0.g(this, zi0, zi02)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f73321a;
                                    if ((obj2 != null) & (!(obj2 instanceof Ui0))) {
                                        return b(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    C(zi02);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            C(zi02);
                        } else {
                            zi0 = this.f73323c;
                        }
                    } while (zi0 != Zi0.f73073c);
                }
                Object obj3 = this.f73321a;
                Objects.requireNonNull(obj3);
                return b(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.f73321a;
                if ((obj4 != null) & (!(obj4 instanceof Ui0))) {
                    return b(obj4);
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
