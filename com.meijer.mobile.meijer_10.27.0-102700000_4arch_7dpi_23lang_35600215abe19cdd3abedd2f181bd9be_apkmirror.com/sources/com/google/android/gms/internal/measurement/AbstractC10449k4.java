package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.k4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10449k4 {

    /* renamed from: g, reason: collision with root package name */
    private static final Object f82248g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private static volatile AbstractC10404f4 f82249h;

    /* renamed from: i, reason: collision with root package name */
    private static final AtomicInteger f82250i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f82251j = 0;

    /* renamed from: a, reason: collision with root package name */
    final C10395e4 f82252a;

    /* renamed from: b, reason: collision with root package name */
    final String f82253b;

    /* renamed from: c, reason: collision with root package name */
    private Object f82254c;

    /* renamed from: d, reason: collision with root package name */
    private volatile int f82255d = -1;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f82256e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f82257f;

    abstract Object a(Object obj);

    static {
        new AtomicReference();
        Be.p.r(C10431i4.f82213a, "BuildInfo must be non-null");
        f82250i = new AtomicInteger();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(final android.content.Context r3) {
        /*
            com.google.android.gms.internal.measurement.f4 r0 = com.google.android.gms.internal.measurement.AbstractC10449k4.f82249h
            if (r0 != 0) goto L4d
            if (r3 != 0) goto L7
            goto L4d
        L7:
            java.lang.Object r0 = com.google.android.gms.internal.measurement.AbstractC10449k4.f82248g
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.f4 r1 = com.google.android.gms.internal.measurement.AbstractC10449k4.f82249h     // Catch: java.lang.Throwable -> L47
            if (r1 != 0) goto L49
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.f4 r1 = com.google.android.gms.internal.measurement.AbstractC10449k4.f82249h     // Catch: java.lang.Throwable -> L21
            android.content.Context r2 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L18
            r3 = r2
        L18:
            if (r1 == 0) goto L23
            android.content.Context r2 = r1.a()     // Catch: java.lang.Throwable -> L21
            if (r2 == r3) goto L43
            goto L23
        L21:
            r3 = move-exception
            goto L45
        L23:
            if (r1 == 0) goto L2e
            com.google.android.gms.internal.measurement.O3.f()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.C10467m4.d()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.V3.e()     // Catch: java.lang.Throwable -> L21
        L2e:
            com.google.android.gms.internal.measurement.j4 r1 = new com.google.android.gms.internal.measurement.j4     // Catch: java.lang.Throwable -> L21
            r1.<init>()     // Catch: java.lang.Throwable -> L21
            Be.w r1 = Be.x.a(r1)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.K3 r2 = new com.google.android.gms.internal.measurement.K3     // Catch: java.lang.Throwable -> L21
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.AbstractC10449k4.f82249h = r2     // Catch: java.lang.Throwable -> L21
            java.util.concurrent.atomic.AtomicInteger r3 = com.google.android.gms.internal.measurement.AbstractC10449k4.f82250i     // Catch: java.lang.Throwable -> L21
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L21
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            goto L49
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r3     // Catch: java.lang.Throwable -> L47
        L47:
            r3 = move-exception
            goto L4b
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            return
        L4b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            throw r3
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC10449k4.b(android.content.Context):void");
    }

    public static void c() {
        f82250i.incrementAndGet();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a A[PHI: r2
      0x004a: PHI (r2v1 Be.m) = (r2v0 Be.m), (r2v0 Be.m), (r2v7 Be.m) binds: [B:8:0x0016, B:10:0x001c, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:20:0x0050, B:22:0x005b, B:24:0x0065, B:28:0x0088, B:30:0x0090, B:42:0x00b7, B:45:0x00bf, B:46:0x00c2, B:47:0x00c6, B:34:0x0099, B:36:0x009d, B:38:0x00ad, B:40:0x00b3, B:26:0x0076, B:48:0x00ca), top: B:54:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:20:0x0050, B:22:0x005b, B:24:0x0065, B:28:0x0088, B:30:0x0090, B:42:0x00b7, B:45:0x00bf, B:46:0x00c2, B:47:0x00c6, B:34:0x0099, B:36:0x009d, B:38:0x00ad, B:40:0x00b3, B:26:0x0076, B:48:0x00ca), top: B:54:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:20:0x0050, B:22:0x005b, B:24:0x0065, B:28:0x0088, B:30:0x0090, B:42:0x00b7, B:45:0x00bf, B:46:0x00c2, B:47:0x00c6, B:34:0x0099, B:36:0x009d, B:38:0x00ad, B:40:0x00b3, B:26:0x0076, B:48:0x00ca), top: B:54:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.measurement.AbstractC10449k4.f82250i
            int r0 = r0.get()
            int r1 = r9.f82255d
            if (r1 >= r0) goto Lce
            monitor-enter(r9)
            int r1 = r9.f82255d     // Catch: java.lang.Throwable -> L47
            if (r1 >= r0) goto Lca
            com.google.android.gms.internal.measurement.f4 r1 = com.google.android.gms.internal.measurement.AbstractC10449k4.f82249h     // Catch: java.lang.Throwable -> L47
            Be.m r2 = Be.m.a()     // Catch: java.lang.Throwable -> L47
            r3 = 0
            if (r1 == 0) goto L4a
            Be.w r4 = r1.b()     // Catch: java.lang.Throwable -> L47
            if (r4 == 0) goto L4a
            Be.w r2 = r1.b()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r2 = Be.p.q(r2)     // Catch: java.lang.Throwable -> L47
            Be.w r2 = (Be.w) r2     // Catch: java.lang.Throwable -> L47
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L47
            Be.m r2 = (Be.m) r2     // Catch: java.lang.Throwable -> L47
            boolean r4 = r2.c()     // Catch: java.lang.Throwable -> L47
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r2.b()     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.Q3 r4 = (com.google.android.gms.internal.measurement.Q3) r4     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.e4 r5 = r9.f82252a     // Catch: java.lang.Throwable -> L47
            android.net.Uri r6 = r5.f82169a     // Catch: java.lang.Throwable -> L47
            java.lang.String r5 = r5.f82171c     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = r9.f82253b     // Catch: java.lang.Throwable -> L47
            java.lang.String r4 = r4.a(r6, r3, r5, r7)     // Catch: java.lang.Throwable -> L47
            goto L4b
        L47:
            r0 = move-exception
            goto Lcc
        L4a:
            r4 = r3
        L4b:
            if (r1 == 0) goto L4f
            r5 = 1
            goto L50
        L4f:
            r5 = 0
        L50:
            java.lang.String r6 = "Must call PhenotypeFlagInitializer.maybeInit() first"
            Be.p.x(r5, r6)     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.e4 r5 = r9.f82252a     // Catch: java.lang.Throwable -> L47
            android.net.Uri r6 = r5.f82169a     // Catch: java.lang.Throwable -> L47
            if (r6 == 0) goto L76
            android.content.Context r7 = r1.a()     // Catch: java.lang.Throwable -> L47
            boolean r7 = com.google.android.gms.internal.measurement.Y3.a(r7, r6)     // Catch: java.lang.Throwable -> L47
            if (r7 == 0) goto L74
            android.content.Context r7 = r1.a()     // Catch: java.lang.Throwable -> L47
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.h4 r8 = com.google.android.gms.internal.measurement.RunnableC10422h4.f82202a     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.O3 r6 = com.google.android.gms.internal.measurement.O3.c(r7, r6, r8)     // Catch: java.lang.Throwable -> L47
            goto L86
        L74:
            r6 = r3
            goto L86
        L76:
            android.content.Context r6 = r1.a()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r7 = Be.p.q(r3)     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.g4 r8 = com.google.android.gms.internal.measurement.RunnableC10413g4.f82191a     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.m4 r6 = com.google.android.gms.internal.measurement.C10467m4.c(r6, r7, r8)     // Catch: java.lang.Throwable -> L47
        L86:
            if (r6 == 0) goto L95
            java.lang.String r7 = r9.f82253b     // Catch: java.lang.Throwable -> L47
            java.lang.Object r6 = r6.a(r7)     // Catch: java.lang.Throwable -> L47
            if (r6 == 0) goto L95
            java.lang.Object r6 = r9.a(r6)     // Catch: java.lang.Throwable -> L47
            goto L96
        L95:
            r6 = r3
        L96:
            if (r6 == 0) goto L99
            goto Lb7
        L99:
            boolean r5 = r5.f82172d     // Catch: java.lang.Throwable -> L47
            if (r5 != 0) goto Lb1
            android.content.Context r1 = r1.a()     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.V3 r1 = com.google.android.gms.internal.measurement.V3.c(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.String r5 = r9.f82253b     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = r1.a(r5)     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto Lb1
            java.lang.Object r3 = r9.a(r1)     // Catch: java.lang.Throwable -> L47
        Lb1:
            if (r3 != 0) goto Lb6
            java.lang.Object r6 = r9.f82254c     // Catch: java.lang.Throwable -> L47
            goto Lb7
        Lb6:
            r6 = r3
        Lb7:
            boolean r1 = r2.c()     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto Lc6
            if (r4 != 0) goto Lc2
            java.lang.Object r6 = r9.f82254c     // Catch: java.lang.Throwable -> L47
            goto Lc6
        Lc2:
            java.lang.Object r6 = r9.a(r4)     // Catch: java.lang.Throwable -> L47
        Lc6:
            r9.f82256e = r6     // Catch: java.lang.Throwable -> L47
            r9.f82255d = r0     // Catch: java.lang.Throwable -> L47
        Lca:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L47
            goto Lce
        Lcc:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L47
            throw r0
        Lce:
            java.lang.Object r0 = r9.f82256e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC10449k4.d():java.lang.Object");
    }

    /* synthetic */ AbstractC10449k4(C10395e4 c10395e4, String str, Object obj, boolean z10, byte[] bArr) {
        if (c10395e4.f82169a != null) {
            this.f82252a = c10395e4;
            this.f82253b = str;
            this.f82254c = obj;
            this.f82257f = false;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }
}
