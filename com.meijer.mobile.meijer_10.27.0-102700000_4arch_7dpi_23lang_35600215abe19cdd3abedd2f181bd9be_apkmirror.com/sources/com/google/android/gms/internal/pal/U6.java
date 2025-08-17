package com.google.android.gms.internal.pal;

import com.google.maps.android.BuildConfig;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public abstract class U6<V> extends AbstractC10760k7 implements InterfaceFutureC10728i7<V> {

    /* renamed from: d, reason: collision with root package name */
    static final boolean f82903d;

    /* renamed from: e, reason: collision with root package name */
    private static final Logger f82904e;

    /* renamed from: f, reason: collision with root package name */
    private static final V6 f82905f;

    /* renamed from: g, reason: collision with root package name */
    private static final Object f82906g;

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f82907a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Y6 f82908b;

    /* renamed from: c, reason: collision with root package name */
    private volatile C10680f7 f82909c;

    protected U6() {
    }

    private static Object k(Future future) throws ExecutionException {
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

    private static void o(U6 u62) {
        Y6 y62;
        Y6 y63 = null;
        while (true) {
            for (C10680f7 c10680f7B = f82905f.b(u62, C10680f7.f83123c); c10680f7B != null; c10680f7B = c10680f7B.f83125b) {
                Thread thread = c10680f7B.f83124a;
                if (thread != null) {
                    c10680f7B.f83124a = null;
                    LockSupport.unpark(thread);
                }
            }
            Y6 y64 = y63;
            Y6 y6A = f82905f.a(u62, Y6.f82971d);
            Y6 y65 = y64;
            while (y6A != null) {
                Y6 y66 = y6A.f82974c;
                y6A.f82974c = y65;
                y65 = y6A;
                y6A = y66;
            }
            while (y65 != null) {
                y62 = y65.f82974c;
                Runnable runnable = y65.f82972a;
                runnable.getClass();
                if (runnable instanceof RunnableC10595a7) {
                    RunnableC10595a7 runnableC10595a7 = (RunnableC10595a7) runnable;
                    u62 = runnableC10595a7.f83048a;
                    if (u62.f82907a == runnableC10595a7) {
                        if (f82905f.e(u62, runnableC10595a7, j(runnableC10595a7.f83049b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = y65.f82973b;
                    executor.getClass();
                    try {
                        executor.execute(runnable);
                    } catch (RuntimeException e10) {
                        f82904e.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
                    }
                }
                y65 = y62;
            }
            return;
            y63 = y62;
        }
    }

    private final void p(C10680f7 c10680f7) {
        c10680f7.f83124a = null;
        while (true) {
            C10680f7 c10680f72 = this.f82909c;
            if (c10680f72 != C10680f7.f83123c) {
                C10680f7 c10680f73 = null;
                while (c10680f72 != null) {
                    C10680f7 c10680f74 = c10680f72.f83125b;
                    if (c10680f72.f83124a != null) {
                        c10680f73 = c10680f72;
                    } else if (c10680f73 != null) {
                        c10680f73.f83125b = c10680f74;
                        if (c10680f73.f83124a == null) {
                            break;
                        }
                    } else if (!f82905f.f(this, c10680f72, c10680f74)) {
                        break;
                    }
                    c10680f72 = c10680f74;
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
        Object obj2 = this.f82907a;
        if ((obj2 != null) && (!(obj2 instanceof RunnableC10595a7))) {
            return q(obj2);
        }
        C10680f7 c10680f7 = this.f82909c;
        if (c10680f7 != C10680f7.f83123c) {
            C10680f7 c10680f72 = new C10680f7();
            do {
                V6 v62 = f82905f;
                v62.c(c10680f72, c10680f7);
                if (v62.f(this, c10680f7, c10680f72)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            p(c10680f72);
                            throw new InterruptedException();
                        }
                        obj = this.f82907a;
                    } while (!((obj != null) & (!(obj instanceof RunnableC10595a7))));
                    return q(obj);
                }
                c10680f7 = this.f82909c;
            } while (c10680f7 != C10680f7.f83123c);
        }
        Object obj3 = this.f82907a;
        obj3.getClass();
        return q(obj3);
    }

    static {
        boolean z10;
        Throwable th2;
        Throwable th3;
        V6 c10612b7;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f82903d = z10;
        f82904e = Logger.getLogger(U6.class.getName());
        a aVar = null;
        try {
            c10612b7 = new C10663e7(aVar);
            th3 = null;
            th2 = null;
        } catch (Error | RuntimeException e10) {
            try {
                th2 = e10;
                c10612b7 = new Z6(AtomicReferenceFieldUpdater.newUpdater(C10680f7.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C10680f7.class, C10680f7.class, "b"), AtomicReferenceFieldUpdater.newUpdater(U6.class, C10680f7.class, "c"), AtomicReferenceFieldUpdater.newUpdater(U6.class, Y6.class, "b"), AtomicReferenceFieldUpdater.newUpdater(U6.class, Object.class, "a"));
                th3 = null;
            } catch (Error | RuntimeException e11) {
                th2 = e10;
                th3 = e11;
                c10612b7 = new C10612b7(aVar);
            }
        }
        f82905f = c10612b7;
        if (th3 != null) {
            Logger logger = f82904e;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
        f82906g = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Object j(InterfaceFutureC10728i7 interfaceFutureC10728i7) {
        Throwable thA;
        if (interfaceFutureC10728i7 instanceof InterfaceC10629c7) {
            Object w62 = ((U6) interfaceFutureC10728i7).f82907a;
            if (w62 instanceof W6) {
                W6 w63 = (W6) w62;
                if (w63.f82935a) {
                    Throwable th2 = w63.f82936b;
                    w62 = th2 != null ? new W6(false, th2) : W6.f82934d;
                }
            }
            w62.getClass();
            return w62;
        }
        if ((interfaceFutureC10728i7 instanceof AbstractC10760k7) && (thA = ((AbstractC10760k7) interfaceFutureC10728i7).a()) != null) {
            return new X6(thA);
        }
        boolean zIsCancelled = interfaceFutureC10728i7.isCancelled();
        if ((!f82903d) && zIsCancelled) {
            W6 w64 = W6.f82934d;
            w64.getClass();
            return w64;
        }
        try {
            Object objK = k(interfaceFutureC10728i7);
            if (!zIsCancelled) {
                return objK == null ? f82906g : objK;
            }
            return new W6(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + interfaceFutureC10728i7));
        } catch (Error | RuntimeException e10) {
            return new X6(e10);
        } catch (CancellationException e11) {
            if (zIsCancelled) {
                return new W6(false, e11);
            }
            interfaceFutureC10728i7.toString();
            return new X6(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(interfaceFutureC10728i7)), e11));
        } catch (ExecutionException e12) {
            if (!zIsCancelled) {
                return new X6(e12.getCause());
            }
            interfaceFutureC10728i7.toString();
            return new W6(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(interfaceFutureC10728i7)), e12));
        }
    }

    private final void l(StringBuilder sb2) {
        try {
            Object objK = k(this);
            sb2.append("SUCCESS, result=[");
            if (objK == null) {
                sb2.append(BuildConfig.TRAVIS);
            } else if (objK == this) {
                sb2.append("this future");
            } else {
                sb2.append(objK.getClass().getName());
                sb2.append("@");
                sb2.append(Integer.toHexString(System.identityHashCode(objK)));
            }
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

    private final void n(StringBuilder sb2, Object obj) {
        try {
            if (obj == this) {
                sb2.append("this future");
            } else {
                sb2.append(obj);
            }
        } catch (RuntimeException e10) {
            e = e10;
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e.getClass());
        } catch (StackOverflowError e11) {
            e = e11;
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e.getClass());
        }
    }

    private static final Object q(Object obj) throws ExecutionException {
        if (obj instanceof W6) {
            Throwable th2 = ((W6) obj).f82936b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof X6) {
            throw new ExecutionException(((X6) obj).f82961a);
        }
        if (obj == f82906g) {
            return null;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10760k7
    protected final Throwable a() {
        if (!(this instanceof InterfaceC10629c7)) {
            return null;
        }
        Object obj = this.f82907a;
        if (obj instanceof X6) {
            return ((X6) obj).f82961a;
        }
        return null;
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
            java.lang.Object r0 = r7.f82907a
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L8
            r3 = r2
            goto L9
        L8:
            r3 = r1
        L9:
            boolean r4 = r0 instanceof com.google.android.gms.internal.pal.RunnableC10595a7
            r3 = r3 | r4
            if (r3 == 0) goto L5f
            boolean r3 = com.google.android.gms.internal.pal.U6.f82903d
            if (r3 == 0) goto L1f
            com.google.android.gms.internal.pal.W6 r3 = new com.google.android.gms.internal.pal.W6
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.google.android.gms.internal.pal.W6 r3 = com.google.android.gms.internal.pal.W6.f82933c
            goto L26
        L24:
            com.google.android.gms.internal.pal.W6 r3 = com.google.android.gms.internal.pal.W6.f82934d
        L26:
            r3.getClass()
        L29:
            r4 = r7
            r5 = r1
        L2b:
            com.google.android.gms.internal.pal.V6 r6 = com.google.android.gms.internal.pal.U6.f82905f
            boolean r6 = r6.e(r4, r0, r3)
            if (r6 == 0) goto L58
            o(r4)
            boolean r4 = r0 instanceof com.google.android.gms.internal.pal.RunnableC10595a7
            if (r4 == 0) goto L57
            com.google.android.gms.internal.pal.a7 r0 = (com.google.android.gms.internal.pal.RunnableC10595a7) r0
            com.google.android.gms.internal.pal.i7<? extends V> r0 = r0.f83049b
            boolean r4 = r0 instanceof com.google.android.gms.internal.pal.InterfaceC10629c7
            if (r4 == 0) goto L54
            r4 = r0
            com.google.android.gms.internal.pal.U6 r4 = (com.google.android.gms.internal.pal.U6) r4
            java.lang.Object r0 = r4.f82907a
            if (r0 != 0) goto L4b
            r5 = r2
            goto L4c
        L4b:
            r5 = r1
        L4c:
            boolean r6 = r0 instanceof com.google.android.gms.internal.pal.RunnableC10595a7
            r5 = r5 | r6
            if (r5 == 0) goto L53
            r5 = r2
            goto L2b
        L53:
            return r2
        L54:
            r0.cancel(r8)
        L57:
            return r2
        L58:
            java.lang.Object r0 = r4.f82907a
            boolean r6 = r0 instanceof com.google.android.gms.internal.pal.RunnableC10595a7
            if (r6 != 0) goto L2b
            return r5
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pal.U6.cancel(boolean):boolean");
    }

    protected boolean i(Object obj) {
        if (obj == null) {
            obj = f82906g;
        }
        if (!f82905f.e(this, null, obj)) {
            return false;
        }
        o(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f82907a instanceof W6;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof RunnableC10595a7)) & (this.f82907a != null);
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
        if (this.f82907a instanceof W6) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            l(sb2);
        } else {
            m(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m(java.lang.StringBuilder r7) {
        /*
            r6 = this;
            int r0 = r7.length()
            java.lang.String r1 = "PENDING"
            r7.append(r1)
            java.lang.Object r1 = r6.f82907a
            boolean r2 = r1 instanceof com.google.android.gms.internal.pal.RunnableC10595a7
            java.lang.String r3 = "]"
            if (r2 == 0) goto L21
            java.lang.String r2 = ", setFuture=["
            r7.append(r2)
            com.google.android.gms.internal.pal.a7 r1 = (com.google.android.gms.internal.pal.RunnableC10595a7) r1
            com.google.android.gms.internal.pal.i7<? extends V> r1 = r1.f83049b
            r6.n(r7, r1)
            r7.append(r3)
            goto L6d
        L21:
            boolean r1 = r6 instanceof java.util.concurrent.ScheduledFuture     // Catch: java.lang.StackOverflowError -> L45 java.lang.RuntimeException -> L47
            if (r1 == 0) goto L49
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.StackOverflowError -> L45 java.lang.RuntimeException -> L47
            r1.<init>()     // Catch: java.lang.StackOverflowError -> L45 java.lang.RuntimeException -> L47
            java.lang.String r2 = "remaining delay=["
            r1.append(r2)     // Catch: java.lang.StackOverflowError -> L45 java.lang.RuntimeException -> L47
            r2 = r6
            java.util.concurrent.ScheduledFuture r2 = (java.util.concurrent.ScheduledFuture) r2     // Catch: java.lang.StackOverflowError -> L45 java.lang.RuntimeException -> L47
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.StackOverflowError -> L45 java.lang.RuntimeException -> L47
            long r4 = r2.getDelay(r4)     // Catch: java.lang.StackOverflowError -> L45 java.lang.RuntimeException -> L47
            r1.append(r4)     // Catch: java.lang.StackOverflowError -> L45 java.lang.RuntimeException -> L47
            java.lang.String r2 = " ms]"
            r1.append(r2)     // Catch: java.lang.StackOverflowError -> L45 java.lang.RuntimeException -> L47
            java.lang.String r1 = r1.toString()     // Catch: java.lang.StackOverflowError -> L45 java.lang.RuntimeException -> L47
            goto L4a
        L45:
            r1 = move-exception
            goto L4f
        L47:
            r1 = move-exception
            goto L4f
        L49:
            r1 = 0
        L4a:
            java.lang.String r1 = com.google.android.gms.internal.pal.C10966x6.a(r1)     // Catch: java.lang.StackOverflowError -> L45 java.lang.RuntimeException -> L47
            goto L60
        L4f:
            java.lang.Class r1 = r1.getClass()
            r1.toString()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Exception thrown from implementation: "
            java.lang.String r1 = r2.concat(r1)
        L60:
            if (r1 == 0) goto L6d
            java.lang.String r2 = ", info=["
            r7.append(r2)
            r7.append(r1)
            r7.append(r3)
        L6d:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L7d
            int r1 = r7.length()
            r7.delete(r0, r1)
            r6.l(r7)
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pal.U6.m(java.lang.StringBuilder):void");
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f82907a;
            boolean z10 = true;
            if ((obj != null) & (!(obj instanceof RunnableC10595a7))) {
                return q(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C10680f7 c10680f7 = this.f82909c;
                if (c10680f7 != C10680f7.f83123c) {
                    C10680f7 c10680f72 = new C10680f7();
                    do {
                        V6 v62 = f82905f;
                        v62.c(c10680f72, c10680f7);
                        if (v62.f(this, c10680f7, c10680f72)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f82907a;
                                    if ((obj2 != null) & (!(obj2 instanceof RunnableC10595a7))) {
                                        return q(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    p(c10680f72);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            p(c10680f72);
                        } else {
                            c10680f7 = this.f82909c;
                        }
                    } while (c10680f7 != C10680f7.f83123c);
                }
                Object obj3 = this.f82907a;
                obj3.getClass();
                return q(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.f82907a;
                if ((obj4 != null) & (!(obj4 instanceof RunnableC10595a7))) {
                    return q(obj4);
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
