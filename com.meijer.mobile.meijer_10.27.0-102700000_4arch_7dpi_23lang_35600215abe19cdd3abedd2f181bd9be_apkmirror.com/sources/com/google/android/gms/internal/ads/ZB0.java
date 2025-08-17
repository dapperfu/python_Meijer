package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes6.dex */
public final class ZB0 implements InterfaceC7767dC0 {

    /* renamed from: h, reason: collision with root package name */
    public static final InterfaceC7300Wf0 f72093h = new InterfaceC7300Wf0() { // from class: com.google.android.gms.internal.ads.WB0
        @Override // com.google.android.gms.internal.ads.InterfaceC7300Wf0
        public final Object zza() {
            return ZB0.m();
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private static final Random f72094i = new Random();

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC7660cC0 f72098d;

    /* renamed from: f, reason: collision with root package name */
    private String f72100f;

    /* renamed from: a, reason: collision with root package name */
    private final C9954xl f72095a = new C9954xl();

    /* renamed from: b, reason: collision with root package name */
    private final C7306Wk f72096b = new C7306Wk();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f72097c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private AbstractC7307Wl f72099e = AbstractC7307Wl.f71155a;

    /* renamed from: g, reason: collision with root package name */
    private long f72101g = -1;

    @Override // com.google.android.gms.internal.ads.InterfaceC7767dC0
    public final synchronized String a(AbstractC7307Wl abstractC7307Wl, C7453aF0 c7453aF0) {
        return l(abstractC7307Wl.n(c7453aF0.f72382a, this.f72096b).f71150c, c7453aF0).f71270a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7767dC0
    public final synchronized void b(QA0 qa0, int i10) {
        try {
            if (this.f72098d == null) {
                throw null;
            }
            Iterator it = this.f72097c.values().iterator();
            while (it.hasNext()) {
                XB0 xb0 = (XB0) it.next();
                if (xb0.k(qa0)) {
                    it.remove();
                    if (xb0.f71274e) {
                        boolean zEquals = xb0.f71270a.equals(this.f72100f);
                        boolean z10 = false;
                        if (i10 == 0 && zEquals && xb0.f71275f) {
                            z10 = true;
                        }
                        if (zEquals) {
                            n(xb0);
                        }
                        this.f72098d.l(qa0, xb0.f71270a, z10);
                    }
                }
            }
            o(qa0);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7767dC0
    public final void c(InterfaceC7660cC0 interfaceC7660cC0) {
        this.f72098d = interfaceC7660cC0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003f, B:23:0x004b, B:24:0x0051, B:26:0x0056, B:28:0x005c, B:30:0x0073, B:31:0x009b, B:33:0x00a1, B:34:0x00a7, B:36:0x00b3, B:38:0x00b9, B:44:0x00ca), top: B:47:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC7767dC0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void d(com.google.android.gms.internal.ads.QA0 r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.cC0 r0 = r9.f72098d     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto Lc9
            com.google.android.gms.internal.ads.Wl r0 = r10.f69533b     // Catch: java.lang.Throwable -> L3c
            boolean r0 = r0.o()     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto Lf
            goto Lc7
        Lf:
            com.google.android.gms.internal.ads.aF0 r0 = r10.f69535d     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L3f
            long r1 = r9.k()     // Catch: java.lang.Throwable -> L3c
            long r3 = r0.f72385d     // Catch: java.lang.Throwable -> L3c
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto Lc7
            java.util.HashMap r0 = r9.f72097c     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = r9.f72100f     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.XB0 r0 = (com.google.android.gms.internal.ads.XB0) r0     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L3f
            long r1 = com.google.android.gms.internal.ads.XB0.b(r0)     // Catch: java.lang.Throwable -> L3c
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L3f
            int r0 = com.google.android.gms.internal.ads.XB0.a(r0)     // Catch: java.lang.Throwable -> L3c
            int r1 = r10.f69534c     // Catch: java.lang.Throwable -> L3c
            if (r0 != r1) goto Lc7
            goto L3f
        L3c:
            r10 = move-exception
            goto Lcb
        L3f:
            int r0 = r10.f69534c     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.aF0 r1 = r10.f69535d     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.XB0 r0 = r9.l(r0, r1)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = r9.f72100f     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L51
            java.lang.String r1 = com.google.android.gms.internal.ads.XB0.d(r0)     // Catch: java.lang.Throwable -> L3c
            r9.f72100f = r1     // Catch: java.lang.Throwable -> L3c
        L51:
            com.google.android.gms.internal.ads.aF0 r1 = r10.f69535d     // Catch: java.lang.Throwable -> L3c
            r2 = 1
            if (r1 == 0) goto L9b
            boolean r3 = r1.b()     // Catch: java.lang.Throwable -> L3c
            if (r3 == 0) goto L9b
            java.lang.Object r3 = r1.f72382a     // Catch: java.lang.Throwable -> L3c
            long r4 = r1.f72385d     // Catch: java.lang.Throwable -> L3c
            int r1 = r1.f72383b     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.aF0 r6 = new com.google.android.gms.internal.ads.aF0     // Catch: java.lang.Throwable -> L3c
            r6.<init>(r3, r4, r1)     // Catch: java.lang.Throwable -> L3c
            int r1 = r10.f69534c     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.XB0 r1 = r9.l(r1, r6)     // Catch: java.lang.Throwable -> L3c
            boolean r3 = com.google.android.gms.internal.ads.XB0.i(r1)     // Catch: java.lang.Throwable -> L3c
            if (r3 != 0) goto L9b
            com.google.android.gms.internal.ads.XB0.f(r1, r2)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.Wl r3 = r10.f69533b     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.aF0 r4 = r10.f69535d     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.Wk r5 = r9.f72096b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r4 = r4.f72382a     // Catch: java.lang.Throwable -> L3c
            r3.n(r4, r5)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.Wk r3 = r9.f72096b     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.aF0 r4 = r10.f69535d     // Catch: java.lang.Throwable -> L3c
            int r4 = r4.f72383b     // Catch: java.lang.Throwable -> L3c
            r3.g(r4)     // Catch: java.lang.Throwable -> L3c
            r3 = 0
            long r5 = com.google.android.gms.internal.ads.OV.N(r3)     // Catch: java.lang.Throwable -> L3c
            long r7 = com.google.android.gms.internal.ads.OV.N(r3)     // Catch: java.lang.Throwable -> L3c
            long r5 = r5 + r7
            java.lang.Math.max(r3, r5)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.XB0.d(r1)     // Catch: java.lang.Throwable -> L3c
        L9b:
            boolean r1 = com.google.android.gms.internal.ads.XB0.i(r0)     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto La7
            com.google.android.gms.internal.ads.XB0.f(r0, r2)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.XB0.d(r0)     // Catch: java.lang.Throwable -> L3c
        La7:
            java.lang.String r1 = com.google.android.gms.internal.ads.XB0.d(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = r9.f72100f     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto Lc7
            boolean r1 = com.google.android.gms.internal.ads.XB0.h(r0)     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto Lc7
            com.google.android.gms.internal.ads.XB0.e(r0, r2)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.cC0 r1 = r9.f72098d     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = com.google.android.gms.internal.ads.XB0.d(r0)     // Catch: java.lang.Throwable -> L3c
            r1.c(r10, r0)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r9)
            return
        Lc7:
            monitor-exit(r9)
            return
        Lc9:
            r10 = 0
            throw r10     // Catch: java.lang.Throwable -> L3c
        Lcb:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L3c
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ZB0.d(com.google.android.gms.internal.ads.QA0):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7767dC0
    public final synchronized void e(QA0 qa0) {
        try {
            if (this.f72098d == null) {
                throw null;
            }
            AbstractC7307Wl abstractC7307Wl = this.f72099e;
            this.f72099e = qa0.f69533b;
            Iterator it = this.f72097c.values().iterator();
            while (it.hasNext()) {
                XB0 xb0 = (XB0) it.next();
                if (!xb0.l(abstractC7307Wl, this.f72099e) || xb0.k(qa0)) {
                    it.remove();
                    if (xb0.f71274e) {
                        if (xb0.f71270a.equals(this.f72100f)) {
                            n(xb0);
                        }
                        this.f72098d.l(qa0, xb0.f71270a, false);
                    }
                }
            }
            o(qa0);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7767dC0
    public final synchronized void f(QA0 qa0) {
        InterfaceC7660cC0 interfaceC7660cC0;
        try {
            String str = this.f72100f;
            if (str != null) {
                XB0 xb0 = (XB0) this.f72097c.get(str);
                if (xb0 == null) {
                    throw null;
                }
                n(xb0);
            }
            Iterator it = this.f72097c.values().iterator();
            while (it.hasNext()) {
                XB0 xb02 = (XB0) it.next();
                it.remove();
                if (xb02.f71274e && (interfaceC7660cC0 = this.f72098d) != null) {
                    interfaceC7660cC0.l(qa0, xb02.f71270a, false);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7767dC0
    public final synchronized String zze() {
        return this.f72100f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long k() {
        XB0 xb0 = (XB0) this.f72097c.get(this.f72100f);
        return (xb0 == null || xb0.f71272c == -1) ? this.f72101g + 1 : xb0.f71272c;
    }

    private final XB0 l(int i10, C7453aF0 c7453aF0) {
        long j10 = Long.MAX_VALUE;
        XB0 xb0 = null;
        for (XB0 xb02 : this.f72097c.values()) {
            xb02.g(i10, c7453aF0);
            if (xb02.j(i10, c7453aF0)) {
                long j11 = xb02.f71272c;
                if (j11 == -1 || j11 < j10) {
                    xb0 = xb02;
                    j10 = j11;
                } else if (j11 == j10) {
                    int i11 = OV.f69091a;
                    if (xb0.f71273d != null && xb02.f71273d != null) {
                        xb0 = xb02;
                    }
                }
            }
        }
        if (xb0 != null) {
            return xb0;
        }
        String strM = m();
        XB0 xb03 = new XB0(this, strM, i10, c7453aF0);
        this.f72097c.put(strM, xb03);
        return xb03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String m() {
        byte[] bArr = new byte[12];
        f72094i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void o(QA0 qa0) {
        if (qa0.f69533b.o()) {
            String str = this.f72100f;
            if (str != null) {
                XB0 xb0 = (XB0) this.f72097c.get(str);
                xb0.getClass();
                n(xb0);
                return;
            }
            return;
        }
        XB0 xb02 = (XB0) this.f72097c.get(this.f72100f);
        XB0 xb0L = l(qa0.f69534c, qa0.f69535d);
        this.f72100f = xb0L.f71270a;
        d(qa0);
        C7453aF0 c7453aF0 = qa0.f69535d;
        if (c7453aF0 == null || !c7453aF0.b()) {
            return;
        }
        if (xb02 != null) {
            if (xb02.f71272c == c7453aF0.f72385d && xb02.f71273d != null && xb02.f71273d.f72383b == qa0.f69535d.f72383b && xb02.f71273d.f72384c == qa0.f69535d.f72384c) {
                return;
            }
        }
        C7453aF0 c7453aF02 = qa0.f69535d;
        String unused = l(qa0.f69534c, new C7453aF0(c7453aF02.f72382a, c7453aF02.f72385d)).f71270a;
        String unused2 = xb0L.f71270a;
    }

    public ZB0(InterfaceC7300Wf0 interfaceC7300Wf0) {
    }

    private final void n(XB0 xb0) {
        if (xb0.f71272c != -1) {
            this.f72101g = xb0.f71272c;
        }
        this.f72100f = null;
    }
}
