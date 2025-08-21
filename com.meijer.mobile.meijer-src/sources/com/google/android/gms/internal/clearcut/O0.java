package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class O0<T> implements InterfaceC10404a1<T> {

    /* renamed from: a, reason: collision with root package name */
    private final J0 f82022a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC10454r1<?, ?> f82023b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f82024c;

    /* renamed from: d, reason: collision with root package name */
    private final S<?> f82025d;

    private O0(AbstractC10454r1<?, ?> abstractC10454r1, S<?> s10, J0 j02) {
        this.f82023b = abstractC10454r1;
        this.f82024c = s10.g(j02);
        this.f82025d = s10;
        this.f82022a = j02;
    }

    static <T> O0<T> i(AbstractC10454r1<?, ?> abstractC10454r1, S<?> s10, J0 j02) {
        return new O0<>(abstractC10454r1, s10, j02);
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC10404a1
    public final void a(T t10, M1 m12) throws IOException {
        Iterator itE = this.f82025d.b(t10).e();
        while (itE.hasNext()) {
            Map.Entry entry = (Map.Entry) itE.next();
            Z z10 = (Z) entry.getKey();
            if (z10.q() != L1.MESSAGE || z10.s() || z10.zzax()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            m12.h(z10.zzc(), entry instanceof C10445o0 ? ((C10445o0) entry).a().d() : entry.getValue());
        }
        AbstractC10454r1<?, ?> abstractC10454r1 = this.f82023b;
        abstractC10454r1.e(abstractC10454r1.k(t10), m12);
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC10404a1
    public final int b(T t10) {
        int iHashCode = this.f82023b.k(t10).hashCode();
        return this.f82024c ? (iHashCode * 53) + this.f82025d.b(t10).hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC10404a1
    public final boolean c(T t10, T t11) {
        if (!this.f82023b.k(t10).equals(this.f82023b.k(t11))) {
            return false;
        }
        if (this.f82024c) {
            return this.f82025d.b(t10).equals(this.f82025d.b(t11));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC10404a1
    public final T d() {
        return (T) this.f82022a.l().I0();
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC10404a1
    public final boolean e(T t10) {
        return this.f82025d.b(t10).d();
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC10404a1
    public final void f(T t10, T t11) {
        C10410c1.i(this.f82023b, t10, t11);
        if (this.f82024c) {
            C10410c1.g(this.f82025d, t10, t11);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC10404a1
    public final int g(T t10) {
        AbstractC10454r1<?, ?> abstractC10454r1 = this.f82023b;
        int iL = abstractC10454r1.l(abstractC10454r1.k(t10));
        return this.f82024c ? iL + this.f82025d.b(t10).m() : iL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0064 A[EDGE_INSN: B:51:0x0064->B:28:0x0064 BREAK  A[LOOP:1: B:14:0x0034->B:54:0x0034], SYNTHETIC] */
    @Override // com.google.android.gms.internal.clearcut.InterfaceC10404a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(T r8, byte[] r9, int r10, int r11, com.google.android.gms.internal.clearcut.C10467w r12) throws java.io.IOException {
        /*
            r7 = this;
            com.google.android.gms.internal.clearcut.f0 r8 = (com.google.android.gms.internal.clearcut.AbstractC10418f0) r8
            com.google.android.gms.internal.clearcut.s1 r0 = r8.zzjp
            com.google.android.gms.internal.clearcut.s1 r1 = com.google.android.gms.internal.clearcut.C10457s1.h()
            if (r0 != r1) goto L10
            com.google.android.gms.internal.clearcut.s1 r0 = com.google.android.gms.internal.clearcut.C10457s1.i()
            r8.zzjp = r0
        L10:
            r4 = r0
        L11:
            if (r10 >= r11) goto L71
            int r2 = com.google.android.gms.internal.clearcut.C10464v.e(r9, r10, r12)
            int r0 = r12.f82434a
            r8 = 11
            r10 = 2
            if (r0 == r8) goto L2f
            r8 = r0 & 7
            r1 = r9
            r3 = r11
            r5 = r12
            if (r8 != r10) goto L2a
            int r10 = com.google.android.gms.internal.clearcut.C10464v.c(r0, r1, r2, r3, r4, r5)
            goto L11
        L2a:
            int r10 = com.google.android.gms.internal.clearcut.C10464v.a(r0, r1, r2, r3, r5)
            goto L11
        L2f:
            r1 = r9
            r3 = r11
            r5 = r12
            r8 = 0
            r9 = 0
        L34:
            if (r2 >= r3) goto L63
            int r11 = com.google.android.gms.internal.clearcut.C10464v.e(r1, r2, r5)
            int r12 = r5.f82434a
            int r0 = r12 >>> 3
            r2 = r12 & 7
            if (r0 == r10) goto L51
            r6 = 3
            if (r0 == r6) goto L46
            goto L5a
        L46:
            if (r2 != r10) goto L5a
            int r2 = com.google.android.gms.internal.clearcut.C10464v.m(r1, r11, r5)
            java.lang.Object r9 = r5.f82436c
            com.google.android.gms.internal.clearcut.A r9 = (com.google.android.gms.internal.clearcut.A) r9
            goto L34
        L51:
            if (r2 != 0) goto L5a
            int r2 = com.google.android.gms.internal.clearcut.C10464v.e(r1, r11, r5)
            int r8 = r5.f82434a
            goto L34
        L5a:
            r0 = 12
            if (r12 == r0) goto L64
            int r2 = com.google.android.gms.internal.clearcut.C10464v.a(r12, r1, r11, r3, r5)
            goto L34
        L63:
            r11 = r2
        L64:
            if (r9 == 0) goto L6c
            int r8 = r8 << 3
            r8 = r8 | r10
            r4.e(r8, r9)
        L6c:
            r10 = r11
            r9 = r1
            r11 = r3
            r12 = r5
            goto L11
        L71:
            r3 = r11
            if (r10 != r3) goto L75
            return
        L75:
            com.google.android.gms.internal.clearcut.zzco r8 = com.google.android.gms.internal.clearcut.zzco.d()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.O0.h(java.lang.Object, byte[], int, int, com.google.android.gms.internal.clearcut.w):void");
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC10404a1
    public final void zzc(T t10) {
        this.f82023b.d(t10);
        this.f82025d.f(t10);
    }
}
