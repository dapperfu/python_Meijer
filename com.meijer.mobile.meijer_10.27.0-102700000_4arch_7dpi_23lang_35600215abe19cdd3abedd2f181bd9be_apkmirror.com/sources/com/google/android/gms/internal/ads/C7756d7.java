package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.d7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7756d7 {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f73367c = C7862e7.f73772b;

    /* renamed from: a, reason: collision with root package name */
    private final List f73368a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private boolean f73369b = false;

    public final synchronized void a(String str, long j10) {
        if (this.f73369b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f73368a.add(new C7649c7(str, j10, SystemClock.elapsedRealtime()));
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    public final synchronized void b(java.lang.String r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = 1
            r8.f73369b = r0     // Catch: java.lang.Throwable -> L75
            java.util.List r0 = r8.f73368a     // Catch: java.lang.Throwable -> L75
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L75
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L11
            r6 = r2
            goto L2c
        L11:
            java.util.List r0 = r8.f73368a     // Catch: java.lang.Throwable -> L75
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.internal.ads.c7 r0 = (com.google.android.gms.internal.ads.C7649c7) r0     // Catch: java.lang.Throwable -> L75
            long r4 = r0.f73124c     // Catch: java.lang.Throwable -> L75
            java.util.List r0 = r8.f73368a     // Catch: java.lang.Throwable -> L75
            int r6 = r0.size()     // Catch: java.lang.Throwable -> L75
            int r6 = r6 + (-1)
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.internal.ads.c7 r0 = (com.google.android.gms.internal.ads.C7649c7) r0     // Catch: java.lang.Throwable -> L75
            long r6 = r0.f73124c     // Catch: java.lang.Throwable -> L75
            long r6 = r6 - r4
        L2c:
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 > 0) goto L31
            goto L77
        L31:
            java.util.List r0 = r8.f73368a     // Catch: java.lang.Throwable -> L75
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.internal.ads.c7 r0 = (com.google.android.gms.internal.ads.C7649c7) r0     // Catch: java.lang.Throwable -> L75
            long r0 = r0.f73124c     // Catch: java.lang.Throwable -> L75
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L75
            java.lang.Object[] r9 = new java.lang.Object[]{r2, r9}     // Catch: java.lang.Throwable -> L75
            java.lang.String r2 = "(%-4d ms) %s"
            com.google.android.gms.internal.ads.C7862e7.a(r2, r9)     // Catch: java.lang.Throwable -> L75
            java.util.List r9 = r8.f73368a     // Catch: java.lang.Throwable -> L75
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L75
        L4e:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L75
            if (r2 == 0) goto L77
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.internal.ads.c7 r2 = (com.google.android.gms.internal.ads.C7649c7) r2     // Catch: java.lang.Throwable -> L75
            long r3 = r2.f73124c     // Catch: java.lang.Throwable -> L75
            long r0 = r3 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L75
            long r5 = r2.f73123b     // Catch: java.lang.Throwable -> L75
            java.lang.Long r1 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L75
            java.lang.String r2 = r2.f73122a     // Catch: java.lang.Throwable -> L75
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2}     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = "(+%-4d) [%2d] %s"
            com.google.android.gms.internal.ads.C7862e7.a(r1, r0)     // Catch: java.lang.Throwable -> L75
            r0 = r3
            goto L4e
        L75:
            r9 = move-exception
            goto L79
        L77:
            monitor-exit(r8)
            return
        L79:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L75
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7756d7.b(java.lang.String):void");
    }

    protected final void finalize() throws Throwable {
        if (this.f73369b) {
            return;
        }
        b("Request on the loose");
        C7862e7.b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    C7756d7() {
    }
}
