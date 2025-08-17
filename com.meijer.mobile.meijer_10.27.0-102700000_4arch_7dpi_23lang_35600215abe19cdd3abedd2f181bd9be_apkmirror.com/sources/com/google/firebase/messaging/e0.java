package com.google.firebase.messaging;

import Td.AbstractC5232j;
import Td.C5233k;
import Td.C5235m;
import Z.C5503a;
import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes7.dex */
class e0 {

    /* renamed from: i, reason: collision with root package name */
    private static final long f88913i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a, reason: collision with root package name */
    private final Context f88914a;

    /* renamed from: b, reason: collision with root package name */
    private final I f88915b;

    /* renamed from: c, reason: collision with root package name */
    private final D f88916c;

    /* renamed from: d, reason: collision with root package name */
    private final FirebaseMessaging f88917d;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f88919f;

    /* renamed from: h, reason: collision with root package name */
    private final c0 f88921h;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, ArrayDeque<C5233k<Void>>> f88918e = new C5503a();

    /* renamed from: g, reason: collision with root package name */
    private boolean f88920g = false;

    synchronized boolean h() {
        return this.f88920g;
    }

    synchronized void l(boolean z10) {
        this.f88920g = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (g() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
    
        com.fullstory.FS.log_d("FirebaseMessaging", "topic sync succeeded");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean o() throws java.io.IOException {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            com.google.firebase.messaging.c0 r0 = r2.f88921h     // Catch: java.lang.Throwable -> L17
            com.google.firebase.messaging.b0 r0 = r0.b()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1c
            boolean r0 = g()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            com.fullstory.FS.log_d(r0, r1)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r0 = move-exception
            goto L2e
        L19:
            r0 = 1
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            return r0
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            boolean r1 = r2.j(r0)
            if (r1 != 0) goto L25
            r0 = 0
            return r0
        L25:
            com.google.firebase.messaging.c0 r1 = r2.f88921h
            r1.d(r0)
            r2.i(r0)
            goto L0
        L2e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.e0.o():boolean");
    }

    private static <T> void b(AbstractC5232j<T> abstractC5232j) throws IOException {
        try {
            C5235m.b(abstractC5232j, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e10) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e10);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e11);
            }
            throw ((RuntimeException) cause);
        }
    }

    private void c(String str) throws IOException {
        b(this.f88916c.l(this.f88917d.k(), str));
    }

    private void d(String str) throws IOException {
        b(this.f88916c.m(this.f88917d.k(), str));
    }

    static AbstractC5232j<e0> e(final FirebaseMessaging firebaseMessaging, final I i10, final D d10, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return C5235m.c(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.d0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return e0.a(context, scheduledExecutorService, firebaseMessaging, i10, d10);
            }
        });
    }

    static boolean g() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    private void i(b0 b0Var) {
        synchronized (this.f88918e) {
            try {
                String strE = b0Var.e();
                if (this.f88918e.containsKey(strE)) {
                    ArrayDeque<C5233k<Void>> arrayDeque = this.f88918e.get(strE);
                    C5233k<Void> c5233kPoll = arrayDeque.poll();
                    if (c5233kPoll != null) {
                        c5233kPoll.c(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f88918e.remove(strE);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean f() {
        return this.f88921h.b() != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean j(com.google.firebase.messaging.b0 r7) throws java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 0
            java.lang.String r2 = r7.b()     // Catch: java.io.IOException -> L1f
            int r3 = r2.hashCode()     // Catch: java.io.IOException -> L1f
            r4 = 83
            r5 = 1
            if (r3 == r4) goto L22
            r4 = 85
            if (r3 == r4) goto L15
            goto L2c
        L15:
            java.lang.String r3 = "U"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto L2c
            r2 = r5
            goto L2d
        L1f:
            r7 = move-exception
            goto La5
        L22:
            java.lang.String r3 = "S"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto L2c
            r2 = r1
            goto L2d
        L2c:
            r2 = -1
        L2d:
            java.lang.String r3 = " succeeded."
            if (r2 == 0) goto L7c
            if (r2 == r5) goto L53
            boolean r2 = g()     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto La4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1f
            r2.<init>()     // Catch: java.io.IOException -> L1f
            java.lang.String r3 = "Unknown topic operation"
            r2.append(r3)     // Catch: java.io.IOException -> L1f
            r2.append(r7)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = "."
            r2.append(r7)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> L1f
            com.fullstory.FS.log_d(r0, r7)     // Catch: java.io.IOException -> L1f
            goto La4
        L53:
            java.lang.String r2 = r7.c()     // Catch: java.io.IOException -> L1f
            r6.d(r2)     // Catch: java.io.IOException -> L1f
            boolean r2 = g()     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto La4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1f
            r2.<init>()     // Catch: java.io.IOException -> L1f
            java.lang.String r4 = "Unsubscribe from topic: "
            r2.append(r4)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r7.c()     // Catch: java.io.IOException -> L1f
            r2.append(r7)     // Catch: java.io.IOException -> L1f
            r2.append(r3)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> L1f
            com.fullstory.FS.log_d(r0, r7)     // Catch: java.io.IOException -> L1f
            goto La4
        L7c:
            java.lang.String r2 = r7.c()     // Catch: java.io.IOException -> L1f
            r6.c(r2)     // Catch: java.io.IOException -> L1f
            boolean r2 = g()     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto La4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1f
            r2.<init>()     // Catch: java.io.IOException -> L1f
            java.lang.String r4 = "Subscribe to topic: "
            r2.append(r4)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r7.c()     // Catch: java.io.IOException -> L1f
            r2.append(r7)     // Catch: java.io.IOException -> L1f
            r2.append(r3)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> L1f
            com.fullstory.FS.log_d(r0, r7)     // Catch: java.io.IOException -> L1f
        La4:
            return r5
        La5:
            java.lang.String r2 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Ld7
            java.lang.String r2 = "INTERNAL_SERVER_ERROR"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Ld7
            java.lang.String r2 = "TOO_MANY_SUBSCRIBERS"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lca
            goto Ld7
        Lca:
            java.lang.String r2 = r7.getMessage()
            if (r2 != 0) goto Ld6
            java.lang.String r7 = "Topic operation failed without exception message. Will retry Topic operation."
            com.fullstory.FS.log_e(r0, r7)
            return r1
        Ld6:
            throw r7
        Ld7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Topic operation failed: "
            r2.append(r3)
            java.lang.String r7 = r7.getMessage()
            r2.append(r7)
            java.lang.String r7 = ". Will retry Topic operation."
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            com.fullstory.FS.log_e(r0, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.e0.j(com.google.firebase.messaging.b0):boolean");
    }

    void k(Runnable runnable, long j10) {
        this.f88919f.schedule(runnable, j10, TimeUnit.SECONDS);
    }

    void p(long j10) {
        k(new f0(this, this.f88914a, this.f88915b, Math.min(Math.max(30L, 2 * j10), f88913i)), j10);
        l(true);
    }

    private e0(FirebaseMessaging firebaseMessaging, I i10, c0 c0Var, D d10, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f88917d = firebaseMessaging;
        this.f88915b = i10;
        this.f88921h = c0Var;
        this.f88916c = d10;
        this.f88914a = context;
        this.f88919f = scheduledExecutorService;
    }

    public static /* synthetic */ e0 a(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, I i10, D d10) {
        return new e0(firebaseMessaging, i10, c0.a(context, scheduledExecutorService), d10, context, scheduledExecutorService);
    }

    private void m() {
        if (!h()) {
            p(0L);
        }
    }

    void n() {
        if (f()) {
            m();
        }
    }
}
