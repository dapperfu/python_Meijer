package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.internal.ads.uc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9616uc0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9400sb0 f78882a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicLong f78883b = new AtomicLong();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque f78884c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private final PriorityQueue f78885d = new PriorityQueue();

    /* renamed from: e, reason: collision with root package name */
    private int f78886e = -1;

    public final int a() {
        return this.f78886e;
    }

    public final void c() {
        e(0);
    }

    private final void e(int i10) {
        while (this.f78885d.size() > i10) {
            C7192Tb0 c7192Tb0 = (C7192Tb0) this.f78885d.poll();
            int i11 = OV.f69091a;
            this.f78882a.a(c7192Tb0.f70417b, c7192Tb0.f70416a);
            this.f78884c.push(c7192Tb0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r9 < r0.f70417b) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r9, com.google.android.gms.internal.ads.GQ r11) {
        /*
            r8 = this;
            int r0 = r8.f78886e
            if (r0 == 0) goto L23
            r1 = -1
            if (r0 == r1) goto L26
            java.util.PriorityQueue r0 = r8.f78885d
            int r0 = r0.size()
            int r2 = r8.f78886e
            if (r0 < r2) goto L26
            java.util.PriorityQueue r0 = r8.f78885d
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.Tb0 r0 = (com.google.android.gms.internal.ads.C7192Tb0) r0
            int r2 = com.google.android.gms.internal.ads.OV.f69091a
            long r2 = com.google.android.gms.internal.ads.C7192Tb0.a(r0)
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 >= 0) goto L26
        L23:
            r3 = r9
            r7 = r11
            goto L56
        L26:
            java.util.ArrayDeque r0 = r8.f78884c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L35
            com.google.android.gms.internal.ads.Tb0 r0 = new com.google.android.gms.internal.ads.Tb0
            r0.<init>()
        L33:
            r2 = r0
            goto L3e
        L35:
            java.util.ArrayDeque r0 = r8.f78884c
            java.lang.Object r0 = r0.poll()
            com.google.android.gms.internal.ads.Tb0 r0 = (com.google.android.gms.internal.ads.C7192Tb0) r0
            goto L33
        L3e:
            java.util.concurrent.atomic.AtomicLong r0 = r8.f78883b
            long r5 = r0.getAndIncrement()
            r3 = r9
            r7 = r11
            r2.e(r3, r5, r7)
            java.util.PriorityQueue r9 = r8.f78885d
            r9.add(r2)
            int r9 = r8.f78886e
            if (r9 == r1) goto L55
            r8.e(r9)
        L55:
            return
        L56:
            com.google.android.gms.internal.ads.sb0 r9 = r8.f78882a
            r9.a(r3, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9616uc0.b(long, com.google.android.gms.internal.ads.GQ):void");
    }

    public final void d(int i10) {
        C8086gC.f(i10 >= 0);
        this.f78886e = i10;
        e(i10);
    }

    public C9616uc0(InterfaceC9400sb0 interfaceC9400sb0) {
        this.f78882a = interfaceC9400sb0;
    }
}
