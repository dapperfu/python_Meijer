package com.google.firebase.messaging;

import Vd.AbstractC5516j;
import Vd.C5517k;
import Vd.C5519m;
import Z.C5603a;
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

/* loaded from: classes8.dex */
class g0 {

    /* renamed from: i, reason: collision with root package name */
    private static final long f89763i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a, reason: collision with root package name */
    private final Context f89764a;

    /* renamed from: b, reason: collision with root package name */
    private final K f89765b;

    /* renamed from: c, reason: collision with root package name */
    private final F f89766c;

    /* renamed from: d, reason: collision with root package name */
    private final FirebaseMessaging f89767d;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f89769f;

    /* renamed from: h, reason: collision with root package name */
    private final e0 f89771h;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, ArrayDeque<C5517k<Void>>> f89768e = new C5603a();

    /* renamed from: g, reason: collision with root package name */
    private boolean f89770g = false;

    synchronized boolean i() {
        return this.f89770g;
    }

    synchronized void n(boolean z10) {
        this.f89770g = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (h() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
    
        com.fullstory.FS.log_d("FirebaseMessaging", "topic sync succeeded");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean r() throws java.io.IOException {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            com.google.firebase.messaging.e0 r0 = r2.f89771h     // Catch: java.lang.Throwable -> L17
            com.google.firebase.messaging.d0 r0 = r0.c()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1c
            boolean r0 = h()     // Catch: java.lang.Throwable -> L17
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
            boolean r1 = r2.k(r0)
            if (r1 != 0) goto L25
            r0 = 0
            return r0
        L25:
            com.google.firebase.messaging.e0 r1 = r2.f89771h
            r1.e(r0)
            r2.j(r0)
            goto L0
        L2e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.g0.r():boolean");
    }

    private void b(d0 d0Var, C5517k<Void> c5517k) {
        ArrayDeque<C5517k<Void>> arrayDeque;
        synchronized (this.f89768e) {
            try {
                String strE = d0Var.e();
                if (this.f89768e.containsKey(strE)) {
                    arrayDeque = this.f89768e.get(strE);
                } else {
                    ArrayDeque<C5517k<Void>> arrayDeque2 = new ArrayDeque<>();
                    this.f89768e.put(strE, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(c5517k);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static <T> void c(AbstractC5516j<T> abstractC5516j) throws IOException {
        try {
            C5519m.b(abstractC5516j, 30L, TimeUnit.SECONDS);
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

    private void d(String str) throws IOException {
        c(this.f89766c.l(this.f89767d.m(), str));
    }

    private void e(String str) throws IOException {
        c(this.f89766c.m(this.f89767d.m(), str));
    }

    static AbstractC5516j<g0> f(final FirebaseMessaging firebaseMessaging, final K k10, final F f10, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return C5519m.c(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.f0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return g0.a(context, scheduledExecutorService, firebaseMessaging, k10, f10);
            }
        });
    }

    static boolean h() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    private void j(d0 d0Var) {
        synchronized (this.f89768e) {
            try {
                String strE = d0Var.e();
                if (this.f89768e.containsKey(strE)) {
                    ArrayDeque<C5517k<Void>> arrayDeque = this.f89768e.get(strE);
                    C5517k<Void> c5517kPoll = arrayDeque.poll();
                    if (c5517kPoll != null) {
                        c5517kPoll.c(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f89768e.remove(strE);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean g() {
        return this.f89771h.c() != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean k(com.google.firebase.messaging.d0 r7) throws java.io.IOException {
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
            boolean r2 = h()     // Catch: java.io.IOException -> L1f
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
            r6.e(r2)     // Catch: java.io.IOException -> L1f
            boolean r2 = h()     // Catch: java.io.IOException -> L1f
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
            r6.d(r2)     // Catch: java.io.IOException -> L1f
            boolean r2 = h()     // Catch: java.io.IOException -> L1f
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.g0.k(com.google.firebase.messaging.d0):boolean");
    }

    void l(Runnable runnable, long j10) {
        this.f89769f.schedule(runnable, j10, TimeUnit.SECONDS);
    }

    AbstractC5516j<Void> m(d0 d0Var) {
        this.f89771h.a(d0Var);
        C5517k<Void> c5517k = new C5517k<>();
        b(d0Var, c5517k);
        return c5517k.a();
    }

    void s(long j10) {
        l(new h0(this, this.f89764a, this.f89765b, Math.min(Math.max(30L, 2 * j10), f89763i)), j10);
        n(true);
    }

    private g0(FirebaseMessaging firebaseMessaging, K k10, e0 e0Var, F f10, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f89767d = firebaseMessaging;
        this.f89765b = k10;
        this.f89771h = e0Var;
        this.f89766c = f10;
        this.f89764a = context;
        this.f89769f = scheduledExecutorService;
    }

    public static /* synthetic */ g0 a(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, K k10, F f10) {
        return new g0(firebaseMessaging, k10, e0.b(context, scheduledExecutorService), f10, context, scheduledExecutorService);
    }

    private void o() {
        if (!i()) {
            s(0L);
        }
    }

    void p() {
        if (g()) {
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC5516j<Void> q(String str) {
        AbstractC5516j<Void> abstractC5516jM = m(d0.f(str));
        p();
        return abstractC5516jM;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC5516j<Void> t(String str) {
        AbstractC5516j<Void> abstractC5516jM = m(d0.g(str));
        p();
        return abstractC5516jM;
    }
}
