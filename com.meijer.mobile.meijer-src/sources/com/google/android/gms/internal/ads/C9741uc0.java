package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.internal.ads.uc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9741uc0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9525sb0 f79722a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicLong f79723b = new AtomicLong();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque f79724c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private final PriorityQueue f79725d = new PriorityQueue();

    /* renamed from: e, reason: collision with root package name */
    private int f79726e = -1;

    public final int a() {
        return this.f79726e;
    }

    public final void c() {
        e(0);
    }

    private final void e(int i10) {
        while (this.f79725d.size() > i10) {
            C7317Tb0 c7317Tb0 = (C7317Tb0) this.f79725d.poll();
            int i11 = OV.f69931a;
            this.f79722a.a(c7317Tb0.f71257b, c7317Tb0.f71256a);
            this.f79724c.push(c7317Tb0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r9 < r0.f71257b) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r9, com.google.android.gms.internal.ads.GQ r11) {
        /*
            r8 = this;
            int r0 = r8.f79726e
            if (r0 == 0) goto L23
            r1 = -1
            if (r0 == r1) goto L26
            java.util.PriorityQueue r0 = r8.f79725d
            int r0 = r0.size()
            int r2 = r8.f79726e
            if (r0 < r2) goto L26
            java.util.PriorityQueue r0 = r8.f79725d
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.Tb0 r0 = (com.google.android.gms.internal.ads.C7317Tb0) r0
            int r2 = com.google.android.gms.internal.ads.OV.f69931a
            long r2 = com.google.android.gms.internal.ads.C7317Tb0.a(r0)
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 >= 0) goto L26
        L23:
            r3 = r9
            r7 = r11
            goto L56
        L26:
            java.util.ArrayDeque r0 = r8.f79724c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L35
            com.google.android.gms.internal.ads.Tb0 r0 = new com.google.android.gms.internal.ads.Tb0
            r0.<init>()
        L33:
            r2 = r0
            goto L3e
        L35:
            java.util.ArrayDeque r0 = r8.f79724c
            java.lang.Object r0 = r0.poll()
            com.google.android.gms.internal.ads.Tb0 r0 = (com.google.android.gms.internal.ads.C7317Tb0) r0
            goto L33
        L3e:
            java.util.concurrent.atomic.AtomicLong r0 = r8.f79723b
            long r5 = r0.getAndIncrement()
            r3 = r9
            r7 = r11
            r2.e(r3, r5, r7)
            java.util.PriorityQueue r9 = r8.f79725d
            r9.add(r2)
            int r9 = r8.f79726e
            if (r9 == r1) goto L55
            r8.e(r9)
        L55:
            return
        L56:
            com.google.android.gms.internal.ads.sb0 r9 = r8.f79722a
            r9.a(r3, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9741uc0.b(long, com.google.android.gms.internal.ads.GQ):void");
    }

    public final void d(int i10) {
        C8211gC.f(i10 >= 0);
        this.f79726e = i10;
        e(i10);
    }

    public C9741uc0(InterfaceC9525sb0 interfaceC9525sb0) {
        this.f79722a = interfaceC9525sb0;
    }
}
