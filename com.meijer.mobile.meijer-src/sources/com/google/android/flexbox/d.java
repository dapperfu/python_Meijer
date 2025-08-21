package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p2.C16381t;

/* loaded from: classes4.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.flexbox.a f65375a;

    /* renamed from: b, reason: collision with root package name */
    private boolean[] f65376b;

    /* renamed from: c, reason: collision with root package name */
    int[] f65377c;

    /* renamed from: d, reason: collision with root package name */
    long[] f65378d;

    /* renamed from: e, reason: collision with root package name */
    private long[] f65379e;

    private static class c implements Comparable<c> {

        /* renamed from: a, reason: collision with root package name */
        int f65382a;

        /* renamed from: b, reason: collision with root package name */
        int f65383b;

        private c() {
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int i10 = this.f65383b;
            int i11 = cVar.f65383b;
            return i10 != i11 ? i10 - i11 : this.f65382a - cVar.f65382a;
        }

        public String toString() {
            return "Order{order=" + this.f65383b + ", index=" + this.f65382a + '}';
        }
    }

    private boolean N(int i10, int i11, com.google.android.flexbox.c cVar) {
        return i10 == i11 - 1 && cVar.c() != 0;
    }

    private List<com.google.android.flexbox.c> k(List<com.google.android.flexbox.c> list, int i10, int i11) {
        int i12 = (i10 - i11) / 2;
        ArrayList arrayList = new ArrayList();
        com.google.android.flexbox.c cVar = new com.google.android.flexbox.c();
        cVar.f65363g = i12;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (i13 == 0) {
                arrayList.add(cVar);
            }
            arrayList.add(list.get(i13));
            if (i13 == list.size() - 1) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    long S(int i10, int i11) {
        return (i10 & 4294967295L) | (i11 << 32);
    }

    void X() {
        Y(0);
    }

    void c(b bVar, int i10, int i11) {
        b(bVar, i10, i11, a.e.API_PRIORITY_OTHER, 0, -1, null);
    }

    void d(b bVar, int i10, int i11, int i12, int i13, List<com.google.android.flexbox.c> list) {
        b(bVar, i10, i11, i12, i13, -1, list);
    }

    void e(b bVar, int i10, int i11, int i12, int i13, List<com.google.android.flexbox.c> list) {
        b(bVar, i10, i11, i12, 0, i13, list);
    }

    void f(b bVar, int i10, int i11) {
        b(bVar, i11, i10, a.e.API_PRIORITY_OTHER, 0, -1, null);
    }

    void g(b bVar, int i10, int i11, int i12, int i13, List<com.google.android.flexbox.c> list) {
        b(bVar, i11, i10, i12, i13, -1, list);
    }

    void h(b bVar, int i10, int i11, int i12, int i13, List<com.google.android.flexbox.c> list) {
        b(bVar, i11, i10, i12, 0, i13, list);
    }

    void p(int i10, int i11) {
        q(i10, i11, 0);
    }

    int x(long j10) {
        return (int) (j10 >> 32);
    }

    int y(long j10) {
        return (int) j10;
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        List<com.google.android.flexbox.c> f65380a;

        /* renamed from: b, reason: collision with root package name */
        int f65381b;

        void a() {
            this.f65380a = null;
            this.f65381b = 0;
        }

        b() {
        }
    }

    private int A(int i10, com.google.android.flexbox.b bVar, int i11) {
        com.google.android.flexbox.a aVar = this.f65375a;
        int iG = aVar.g(i10, aVar.getPaddingLeft() + this.f65375a.getPaddingRight() + bVar.A2() + bVar.t3() + i11, bVar.getWidth());
        int size = View.MeasureSpec.getSize(iG);
        return size > bVar.K1() ? View.MeasureSpec.makeMeasureSpec(bVar.K1(), View.MeasureSpec.getMode(iG)) : size < bVar.s0() ? View.MeasureSpec.makeMeasureSpec(bVar.s0(), View.MeasureSpec.getMode(iG)) : iG;
    }

    private int B(com.google.android.flexbox.b bVar, boolean z10) {
        return z10 ? bVar.w2() : bVar.t3();
    }

    private int C(com.google.android.flexbox.b bVar, boolean z10) {
        return z10 ? bVar.t3() : bVar.w2();
    }

    private int D(com.google.android.flexbox.b bVar, boolean z10) {
        return z10 ? bVar.J0() : bVar.A2();
    }

    private int E(com.google.android.flexbox.b bVar, boolean z10) {
        return z10 ? bVar.A2() : bVar.J0();
    }

    private int F(com.google.android.flexbox.b bVar, boolean z10) {
        return z10 ? bVar.getHeight() : bVar.getWidth();
    }

    private int G(com.google.android.flexbox.b bVar, boolean z10) {
        return z10 ? bVar.getWidth() : bVar.getHeight();
    }

    private int H(boolean z10) {
        return z10 ? this.f65375a.getPaddingBottom() : this.f65375a.getPaddingEnd();
    }

    private int I(boolean z10) {
        return z10 ? this.f65375a.getPaddingEnd() : this.f65375a.getPaddingBottom();
    }

    private int J(boolean z10) {
        return z10 ? this.f65375a.getPaddingTop() : this.f65375a.getPaddingStart();
    }

    private int K(boolean z10) {
        return z10 ? this.f65375a.getPaddingStart() : this.f65375a.getPaddingTop();
    }

    private int L(View view, boolean z10) {
        return z10 ? view.getMeasuredHeight() : view.getMeasuredWidth();
    }

    private int M(View view, boolean z10) {
        return z10 ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    private boolean P(View view, int i10, int i11, int i12, int i13, com.google.android.flexbox.b bVar, int i14, int i15, int i16) {
        if (this.f65375a.getFlexWrap() == 0) {
            return false;
        }
        if (bVar.r1()) {
            return true;
        }
        if (i10 == 0) {
            return false;
        }
        int maxLine = this.f65375a.getMaxLine();
        if (maxLine != -1 && maxLine <= i16 + 1) {
            return false;
        }
        int iP = this.f65375a.p(view, i14, i15);
        if (iP > 0) {
            i13 += iP;
        }
        return i11 < i12 + i13;
    }

    private void T(int i10, int i11, com.google.android.flexbox.c cVar, int i12, int i13, boolean z10) {
        float f10;
        float f11;
        int iMax;
        int iS0;
        int i14 = cVar.f65361e;
        float f12 = cVar.f65367k;
        float f13 = 0.0f;
        if (f12 <= 0.0f || i12 > i14) {
            return;
        }
        float f14 = (i14 - i12) / f12;
        cVar.f65361e = i13 + cVar.f65362f;
        if (!z10) {
            cVar.f65363g = Integer.MIN_VALUE;
        }
        int i15 = 0;
        boolean z11 = false;
        int i16 = 0;
        float f15 = 0.0f;
        while (i15 < cVar.f65364h) {
            int i17 = cVar.f65371o + i15;
            View viewN = this.f65375a.n(i17);
            if (viewN == null || viewN.getVisibility() == 8) {
                f10 = f13;
                f11 = f14;
            } else {
                com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) viewN.getLayoutParams();
                int flexDirection = this.f65375a.getFlexDirection();
                f10 = f13;
                if (flexDirection == 0 || flexDirection == 1) {
                    int measuredWidth = viewN.getMeasuredWidth();
                    long[] jArr = this.f65379e;
                    if (jArr != null) {
                        measuredWidth = y(jArr[i17]);
                    }
                    int measuredHeight = viewN.getMeasuredHeight();
                    long[] jArr2 = this.f65379e;
                    f11 = f14;
                    if (jArr2 != null) {
                        measuredHeight = x(jArr2[i17]);
                    }
                    if (!this.f65376b[i17] && bVar.m0() > f10) {
                        float fM0 = measuredWidth - (f11 * bVar.m0());
                        if (i15 == cVar.f65364h - 1) {
                            fM0 += f15;
                            f15 = f10;
                        }
                        int iRound = Math.round(fM0);
                        if (iRound < bVar.s0()) {
                            iS0 = bVar.s0();
                            this.f65376b[i17] = true;
                            cVar.f65367k -= bVar.m0();
                            z11 = true;
                        } else {
                            f15 += fM0 - iRound;
                            double d10 = f15;
                            if (d10 > 1.0d) {
                                iS0 = iRound + 1;
                                f15 -= 1.0f;
                            } else if (d10 < -1.0d) {
                                iS0 = iRound - 1;
                                f15 += 1.0f;
                            } else {
                                iS0 = iRound;
                            }
                        }
                        int iZ = z(i11, bVar, cVar.f65369m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iS0, 1073741824);
                        viewN.measure(iMakeMeasureSpec, iZ);
                        int measuredWidth2 = viewN.getMeasuredWidth();
                        int measuredHeight2 = viewN.getMeasuredHeight();
                        Z(i17, iMakeMeasureSpec, iZ, viewN);
                        this.f65375a.o(i17, viewN);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i16, measuredHeight + bVar.J0() + bVar.w2() + this.f65375a.l(viewN));
                    cVar.f65361e += measuredWidth + bVar.A2() + bVar.t3();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewN.getMeasuredHeight();
                    long[] jArr3 = this.f65379e;
                    if (jArr3 != null) {
                        measuredHeight3 = x(jArr3[i17]);
                    }
                    int measuredWidth3 = viewN.getMeasuredWidth();
                    long[] jArr4 = this.f65379e;
                    if (jArr4 != null) {
                        measuredWidth3 = y(jArr4[i17]);
                    }
                    if (!this.f65376b[i17] && bVar.m0() > f10) {
                        float fM02 = measuredHeight3 - (bVar.m0() * f14);
                        if (i15 == cVar.f65364h - 1) {
                            fM02 += f15;
                            f15 = f10;
                        }
                        int iRound2 = Math.round(fM02);
                        if (iRound2 < bVar.v3()) {
                            iRound2 = bVar.v3();
                            this.f65376b[i17] = true;
                            cVar.f65367k -= bVar.m0();
                            z11 = true;
                        } else {
                            f15 += fM02 - iRound2;
                            double d11 = f15;
                            if (d11 > 1.0d) {
                                iRound2++;
                                f15 -= 1.0f;
                            } else if (d11 < -1.0d) {
                                iRound2--;
                                f15 += 1.0f;
                            }
                        }
                        int iA = A(i10, bVar, cVar.f65369m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewN.measure(iA, iMakeMeasureSpec2);
                        int measuredWidth4 = viewN.getMeasuredWidth();
                        int measuredHeight4 = viewN.getMeasuredHeight();
                        Z(i17, iA, iMakeMeasureSpec2, viewN);
                        this.f65375a.o(i17, viewN);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i16, measuredWidth3 + bVar.A2() + bVar.t3() + this.f65375a.l(viewN));
                    cVar.f65361e += measuredHeight3 + bVar.J0() + bVar.w2();
                    f11 = f14;
                }
                cVar.f65363g = Math.max(cVar.f65363g, iMax);
                i16 = iMax;
            }
            i15++;
            f14 = f11;
            f13 = f10;
        }
        if (!z11 || i14 == cVar.f65361e) {
            return;
        }
        T(i10, i11, cVar, i12, i13, true);
    }

    private void Z(int i10, int i11, int i12, View view) {
        long[] jArr = this.f65378d;
        if (jArr != null) {
            jArr[i10] = S(i11, i12);
        }
        long[] jArr2 = this.f65379e;
        if (jArr2 != null) {
            jArr2[i10] = S(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    private void a(List<com.google.android.flexbox.c> list, com.google.android.flexbox.c cVar, int i10, int i11) {
        cVar.f65369m = i11;
        this.f65375a.m(cVar);
        cVar.f65372p = i10;
        list.add(cVar);
    }

    private List<c> l(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) this.f65375a.i(i11).getLayoutParams();
            c cVar = new c();
            cVar.f65383b = bVar.getOrder();
            cVar.f65382a = i11;
            arrayList.add(cVar);
        }
        return arrayList;
    }

    private void r(int i10) {
        boolean[] zArr = this.f65376b;
        if (zArr == null) {
            this.f65376b = new boolean[Math.max(i10, 10)];
        } else if (zArr.length < i10) {
            this.f65376b = new boolean[Math.max(zArr.length * 2, i10)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    private void w(int i10, int i11, com.google.android.flexbox.c cVar, int i12, int i13, boolean z10) {
        int i14;
        float f10;
        float f11;
        int iMax;
        double d10;
        double d11;
        float f12 = cVar.f65366j;
        float f13 = 0.0f;
        if (f12 <= 0.0f || i12 < (i14 = cVar.f65361e)) {
            return;
        }
        float f14 = (i12 - i14) / f12;
        cVar.f65361e = i13 + cVar.f65362f;
        if (!z10) {
            cVar.f65363g = Integer.MIN_VALUE;
        }
        int i15 = 0;
        boolean z11 = false;
        int i16 = 0;
        float f15 = 0.0f;
        while (i15 < cVar.f65364h) {
            int i17 = cVar.f65371o + i15;
            View viewN = this.f65375a.n(i17);
            if (viewN == null || viewN.getVisibility() == 8) {
                f10 = f13;
                f11 = f14;
                z11 = z11;
            } else {
                com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) viewN.getLayoutParams();
                int flexDirection = this.f65375a.getFlexDirection();
                f10 = f13;
                if (flexDirection == 0 || flexDirection == 1) {
                    f11 = f14;
                    boolean z12 = z11;
                    int measuredWidth = viewN.getMeasuredWidth();
                    long[] jArr = this.f65379e;
                    if (jArr != null) {
                        measuredWidth = y(jArr[i17]);
                    }
                    int measuredHeight = viewN.getMeasuredHeight();
                    long[] jArr2 = this.f65379e;
                    if (jArr2 != null) {
                        measuredHeight = x(jArr2[i17]);
                    }
                    if (this.f65376b[i17] || bVar.T0() <= f10) {
                        z11 = z12;
                    } else {
                        float fT0 = measuredWidth + (bVar.T0() * f11);
                        if (i15 == cVar.f65364h - 1) {
                            fT0 += f15;
                            f15 = f10;
                        }
                        int iRound = Math.round(fT0);
                        if (iRound > bVar.K1()) {
                            iRound = bVar.K1();
                            this.f65376b[i17] = true;
                            cVar.f65366j -= bVar.T0();
                            z11 = true;
                        } else {
                            f15 += fT0 - iRound;
                            double d12 = f15;
                            if (d12 > 1.0d) {
                                iRound++;
                                d10 = d12 - 1.0d;
                            } else {
                                if (d12 < -1.0d) {
                                    iRound--;
                                    d10 = d12 + 1.0d;
                                }
                                z11 = z12;
                            }
                            f15 = (float) d10;
                            z11 = z12;
                        }
                        int iZ = z(i11, bVar, cVar.f65369m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewN.measure(iMakeMeasureSpec, iZ);
                        int measuredWidth2 = viewN.getMeasuredWidth();
                        int measuredHeight2 = viewN.getMeasuredHeight();
                        Z(i17, iMakeMeasureSpec, iZ, viewN);
                        this.f65375a.o(i17, viewN);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i16, measuredHeight + bVar.J0() + bVar.w2() + this.f65375a.l(viewN));
                    cVar.f65361e += measuredWidth + bVar.A2() + bVar.t3();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewN.getMeasuredHeight();
                    long[] jArr3 = this.f65379e;
                    if (jArr3 != null) {
                        measuredHeight3 = x(jArr3[i17]);
                    }
                    int measuredWidth3 = viewN.getMeasuredWidth();
                    long[] jArr4 = this.f65379e;
                    f11 = f14;
                    boolean z13 = z11;
                    if (jArr4 != null) {
                        measuredWidth3 = y(jArr4[i17]);
                    }
                    if (this.f65376b[i17] || bVar.T0() <= f10) {
                        z11 = z13;
                    } else {
                        float fT02 = measuredHeight3 + (bVar.T0() * f11);
                        if (i15 == cVar.f65364h - 1) {
                            fT02 += f15;
                            f15 = f10;
                        }
                        int iRound2 = Math.round(fT02);
                        if (iRound2 > bVar.G3()) {
                            iRound2 = bVar.G3();
                            this.f65376b[i17] = true;
                            cVar.f65366j -= bVar.T0();
                            z11 = true;
                        } else {
                            f15 += fT02 - iRound2;
                            double d13 = f15;
                            if (d13 > 1.0d) {
                                iRound2++;
                                d11 = d13 - 1.0d;
                            } else {
                                if (d13 < -1.0d) {
                                    iRound2--;
                                    d11 = d13 + 1.0d;
                                }
                                z11 = z13;
                            }
                            f15 = (float) d11;
                            z11 = z13;
                        }
                        int iA = A(i10, bVar, cVar.f65369m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewN.measure(iA, iMakeMeasureSpec2);
                        int measuredWidth4 = viewN.getMeasuredWidth();
                        int measuredHeight4 = viewN.getMeasuredHeight();
                        Z(i17, iA, iMakeMeasureSpec2, viewN);
                        this.f65375a.o(i17, viewN);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i16, measuredWidth3 + bVar.A2() + bVar.t3() + this.f65375a.l(viewN));
                    cVar.f65361e += measuredHeight3 + bVar.J0() + bVar.w2();
                }
                cVar.f65363g = Math.max(cVar.f65363g, iMax);
                i16 = iMax;
            }
            i15++;
            f14 = f11;
            f13 = f10;
        }
        if (!z11 || i14 == cVar.f65361e) {
            return;
        }
        w(i10, i11, cVar, i12, i13, true);
    }

    private int z(int i10, com.google.android.flexbox.b bVar, int i11) {
        com.google.android.flexbox.a aVar = this.f65375a;
        int iK = aVar.k(i10, aVar.getPaddingTop() + this.f65375a.getPaddingBottom() + bVar.J0() + bVar.w2() + i11, bVar.getHeight());
        int size = View.MeasureSpec.getSize(iK);
        return size > bVar.G3() ? View.MeasureSpec.makeMeasureSpec(bVar.G3(), View.MeasureSpec.getMode(iK)) : size < bVar.v3() ? View.MeasureSpec.makeMeasureSpec(bVar.v3(), View.MeasureSpec.getMode(iK)) : iK;
    }

    boolean O(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f65375a.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i10 = 0; i10 < flexItemCount; i10++) {
            View viewI = this.f65375a.i(i10);
            if (viewI != null && ((com.google.android.flexbox.b) viewI.getLayoutParams()).getOrder() != sparseIntArray.get(i10)) {
                return true;
            }
        }
        return false;
    }

    void Y(int i10) {
        View viewN;
        if (i10 >= this.f65375a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f65375a.getFlexDirection();
        if (this.f65375a.getAlignItems() != 4) {
            for (com.google.android.flexbox.c cVar : this.f65375a.getFlexLinesInternal()) {
                for (Integer num : cVar.f65370n) {
                    View viewN2 = this.f65375a.n(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        W(viewN2, cVar.f65363g, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                        }
                        V(viewN2, cVar.f65363g, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.f65377c;
        List<com.google.android.flexbox.c> flexLinesInternal = this.f65375a.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i11 = iArr != null ? iArr[i10] : 0; i11 < size; i11++) {
            com.google.android.flexbox.c cVar2 = flexLinesInternal.get(i11);
            int i12 = cVar2.f65364h;
            for (int i13 = 0; i13 < i12; i13++) {
                int i14 = cVar2.f65371o + i13;
                if (i13 < this.f65375a.getFlexItemCount() && (viewN = this.f65375a.n(i14)) != null && viewN.getVisibility() != 8) {
                    com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) viewN.getLayoutParams();
                    if (bVar.j0() == -1 || bVar.j0() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            W(viewN, cVar2.f65363g, i14);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                            }
                            V(viewN, cVar2.f65363g, i14);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void b(b bVar, int i10, int i11, int i12, int i13, int i14, List<com.google.android.flexbox.c> list) {
        int i15;
        b bVar2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int iG;
        int i21;
        int i22;
        int i23;
        com.google.android.flexbox.c cVar;
        int i24;
        int i25;
        boolean z10;
        int i26;
        boolean z11;
        int i27;
        int i28 = i10;
        boolean zQ = this.f65375a.q();
        int mode = View.MeasureSpec.getMode(i28);
        int size = View.MeasureSpec.getSize(i28);
        List<com.google.android.flexbox.c> arrayList = list == null ? new ArrayList() : list;
        bVar.f65380a = arrayList;
        boolean z12 = i14 == -1;
        int iK = K(zQ);
        int I10 = I(zQ);
        int iJ = J(zQ);
        int iH = H(zQ);
        com.google.android.flexbox.c cVar2 = new com.google.android.flexbox.c();
        int i29 = i13;
        cVar2.f65371o = i29;
        int i30 = iK + I10;
        cVar2.f65361e = i30;
        int flexItemCount = this.f65375a.getFlexItemCount();
        boolean z13 = z12;
        com.google.android.flexbox.c cVar3 = cVar2;
        int i31 = Integer.MIN_VALUE;
        int i32 = 0;
        int iCombineMeasuredStates = 0;
        int i33 = 0;
        while (true) {
            if (i29 >= flexItemCount) {
                i15 = iCombineMeasuredStates;
                bVar2 = bVar;
                break;
            }
            View viewN = this.f65375a.n(i29);
            if (viewN == null) {
                if (N(i29, flexItemCount, cVar3)) {
                    a(arrayList, cVar3, i29, i32);
                }
                i16 = i30;
            } else {
                i16 = i30;
                if (viewN.getVisibility() == 8) {
                    cVar3.f65365i++;
                    cVar3.f65364h++;
                    if (N(i29, flexItemCount, cVar3)) {
                        a(arrayList, cVar3, i29, i32);
                    }
                } else {
                    if (viewN instanceof CompoundButton) {
                        v((CompoundButton) viewN);
                    }
                    com.google.android.flexbox.b bVar3 = (com.google.android.flexbox.b) viewN.getLayoutParams();
                    int i34 = flexItemCount;
                    if (bVar3.j0() == 4) {
                        cVar3.f65370n.add(Integer.valueOf(i29));
                    }
                    int iG2 = G(bVar3, zQ);
                    if (bVar3.e1() != -1.0f && mode == 1073741824) {
                        iG2 = Math.round(size * bVar3.e1());
                    }
                    if (zQ) {
                        i18 = mode;
                        iG = this.f65375a.g(i28, i16 + E(bVar3, true) + C(bVar3, true), iG2);
                        i17 = size;
                        i19 = i32;
                        int iK2 = this.f65375a.k(i11, iJ + iH + D(bVar3, true) + B(bVar3, true) + i32, F(bVar3, true));
                        viewN.measure(iG, iK2);
                        Z(i29, iG, iK2, viewN);
                        i20 = 0;
                    } else {
                        i17 = size;
                        i18 = mode;
                        i19 = i32;
                        i20 = 0;
                        int iG3 = this.f65375a.g(i11, iJ + iH + D(bVar3, false) + B(bVar3, false) + i19, F(bVar3, false));
                        int iK3 = this.f65375a.k(i28, i16 + E(bVar3, false) + C(bVar3, false), iG2);
                        viewN.measure(iG3, iK3);
                        Z(i29, iG3, iK3, viewN);
                        iG = iK3;
                    }
                    this.f65375a.o(i29, viewN);
                    i(viewN, i29);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewN.getMeasuredState());
                    int i35 = i20;
                    i21 = i29;
                    int i36 = iG;
                    com.google.android.flexbox.c cVar4 = cVar3;
                    int i37 = i33;
                    i22 = i16;
                    i23 = i19;
                    boolean z14 = zQ;
                    size = i17;
                    if (P(viewN, i18, size, cVar3.f65361e, M(viewN, zQ) + E(bVar3, zQ) + C(bVar3, zQ), bVar3, i21, i37, arrayList.size())) {
                        if (cVar4.c() > 0) {
                            a(arrayList, cVar4, i21 > 0 ? i21 - 1 : i35, i23);
                            i27 = i23 + cVar4.f65363g;
                        } else {
                            i27 = i23;
                        }
                        if (z14) {
                            if (bVar3.getHeight() == -1) {
                                com.google.android.flexbox.a aVar = this.f65375a;
                                viewN.measure(i36, aVar.k(i11, aVar.getPaddingTop() + this.f65375a.getPaddingBottom() + bVar3.J0() + bVar3.w2() + i27, bVar3.getHeight()));
                                i(viewN, i21);
                            }
                        } else if (bVar3.getWidth() == -1) {
                            com.google.android.flexbox.a aVar2 = this.f65375a;
                            viewN.measure(aVar2.g(i11, aVar2.getPaddingLeft() + this.f65375a.getPaddingRight() + bVar3.A2() + bVar3.t3() + i27, bVar3.getWidth()), i36);
                            i(viewN, i21);
                        }
                        com.google.android.flexbox.c cVar5 = new com.google.android.flexbox.c();
                        cVar5.f65364h = 1;
                        cVar5.f65361e = i22;
                        cVar5.f65371o = i21;
                        i23 = i27;
                        i24 = i35;
                        cVar = cVar5;
                        i25 = Integer.MIN_VALUE;
                    } else {
                        cVar = cVar4;
                        cVar.f65364h++;
                        i24 = i37 + 1;
                        i25 = i31;
                    }
                    cVar.f65373q = (cVar.f65373q ? 1 : 0) | (bVar3.T0() != 0.0f ? 1 : i35);
                    cVar.f65374r = (cVar.f65374r ? 1 : 0) | (bVar3.m0() != 0.0f ? 1 : i35);
                    int[] iArr = this.f65377c;
                    if (iArr != null) {
                        iArr[i21] = arrayList.size();
                    }
                    z10 = z14;
                    cVar.f65361e += M(viewN, z10) + E(bVar3, z10) + C(bVar3, z10);
                    cVar.f65366j += bVar3.T0();
                    cVar.f65367k += bVar3.m0();
                    this.f65375a.f(viewN, i21, i24, cVar);
                    int iMax = Math.max(i25, L(viewN, z10) + D(bVar3, z10) + B(bVar3, z10) + this.f65375a.l(viewN));
                    cVar.f65363g = Math.max(cVar.f65363g, iMax);
                    if (z10) {
                        if (this.f65375a.getFlexWrap() != 2) {
                            cVar.f65368l = Math.max(cVar.f65368l, viewN.getBaseline() + bVar3.J0());
                        } else {
                            cVar.f65368l = Math.max(cVar.f65368l, (viewN.getMeasuredHeight() - viewN.getBaseline()) + bVar3.w2());
                        }
                    }
                    i26 = i34;
                    if (N(i21, i26, cVar)) {
                        a(arrayList, cVar, i21, i23);
                        i23 += cVar.f65363g;
                    }
                    if (i14 != -1 && arrayList.size() > 0) {
                        if (arrayList.get(arrayList.size() - 1).f65372p >= i14 && i21 >= i14 && !z13) {
                            i23 = -cVar.a();
                            z11 = true;
                        }
                        if (i23 <= i12 && z11) {
                            bVar2 = bVar;
                            i15 = iCombineMeasuredStates;
                            break;
                        }
                        i31 = iMax;
                        z13 = z11;
                        i33 = i24;
                        int i38 = i21 + 1;
                        zQ = z10;
                        cVar3 = cVar;
                        i30 = i22;
                        i32 = i23;
                        i28 = i10;
                        flexItemCount = i26;
                        i29 = i38;
                        mode = i18;
                    }
                    z11 = z13;
                    if (i23 <= i12) {
                    }
                    i31 = iMax;
                    z13 = z11;
                    i33 = i24;
                    int i382 = i21 + 1;
                    zQ = z10;
                    cVar3 = cVar;
                    i30 = i22;
                    i32 = i23;
                    i28 = i10;
                    flexItemCount = i26;
                    i29 = i382;
                    mode = i18;
                }
            }
            i21 = i29;
            i18 = mode;
            i26 = flexItemCount;
            i23 = i32;
            z10 = zQ;
            i22 = i16;
            cVar = cVar3;
            int i3822 = i21 + 1;
            zQ = z10;
            cVar3 = cVar;
            i30 = i22;
            i32 = i23;
            i28 = i10;
            flexItemCount = i26;
            i29 = i3822;
            mode = i18;
        }
        bVar2.f65381b = i15;
    }

    void j(List<com.google.android.flexbox.c> list, int i10) {
        int i11 = this.f65377c[i10];
        if (i11 == -1) {
            i11 = 0;
        }
        if (list.size() > i11) {
            list.subList(i11, list.size()).clear();
        }
        int[] iArr = this.f65377c;
        int length = iArr.length - 1;
        if (i10 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i10, length, -1);
        }
        long[] jArr = this.f65378d;
        int length2 = jArr.length - 1;
        if (i10 > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i10, length2, 0L);
        }
    }

    int[] m(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f65375a.getFlexItemCount();
        return U(flexItemCount, l(flexItemCount), sparseIntArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    int[] n(View view, int i10, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.f65375a.getFlexItemCount();
        List<c> listL = l(flexItemCount);
        c cVar = new c();
        if (view == null || !(layoutParams instanceof com.google.android.flexbox.b)) {
            cVar.f65383b = 1;
        } else {
            cVar.f65383b = ((com.google.android.flexbox.b) layoutParams).getOrder();
        }
        if (i10 == -1 || i10 == flexItemCount || i10 >= this.f65375a.getFlexItemCount()) {
            cVar.f65382a = flexItemCount;
        } else {
            cVar.f65382a = i10;
            while (i10 < flexItemCount) {
                listL.get(i10).f65382a++;
                i10++;
            }
        }
        listL.add(cVar);
        return U(flexItemCount + 1, listL, sparseIntArray);
    }

    void o(int i10, int i11, int i12) {
        int mode;
        int size;
        int flexDirection = this.f65375a.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode2 = View.MeasureSpec.getMode(i11);
            int size2 = View.MeasureSpec.getSize(i11);
            mode = mode2;
            size = size2;
        } else {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            mode = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
        }
        List<com.google.android.flexbox.c> flexLinesInternal = this.f65375a.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.f65375a.getSumOfCrossSize() + i12;
            int i13 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).f65363g = size - i12;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.f65375a.getAlignContent();
                if (alignContent == 1) {
                    int i14 = size - sumOfCrossSize;
                    com.google.android.flexbox.c cVar = new com.google.android.flexbox.c();
                    cVar.f65363g = i14;
                    flexLinesInternal.add(0, cVar);
                    return;
                }
                if (alignContent == 2) {
                    this.f65375a.setFlexLines(k(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size4 = flexLinesInternal.size();
                    float f10 = 0.0f;
                    while (i13 < size4) {
                        arrayList.add(flexLinesInternal.get(i13));
                        if (i13 != flexLinesInternal.size() - 1) {
                            com.google.android.flexbox.c cVar2 = new com.google.android.flexbox.c();
                            if (i13 == flexLinesInternal.size() - 2) {
                                cVar2.f65363g = Math.round(f10 + size3);
                                f10 = 0.0f;
                            } else {
                                cVar2.f65363g = Math.round(size3);
                            }
                            int i15 = cVar2.f65363g;
                            f10 += size3 - i15;
                            if (f10 > 1.0f) {
                                cVar2.f65363g = i15 + 1;
                                f10 -= 1.0f;
                            } else if (f10 < -1.0f) {
                                cVar2.f65363g = i15 - 1;
                                f10 += 1.0f;
                            }
                            arrayList.add(cVar2);
                        }
                        i13++;
                    }
                    this.f65375a.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.f65375a.setFlexLines(k(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    com.google.android.flexbox.c cVar3 = new com.google.android.flexbox.c();
                    cVar3.f65363g = size5;
                    for (com.google.android.flexbox.c cVar4 : flexLinesInternal) {
                        arrayList2.add(cVar3);
                        arrayList2.add(cVar4);
                        arrayList2.add(cVar3);
                    }
                    this.f65375a.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f11 = 0.0f;
                    while (i13 < size7) {
                        com.google.android.flexbox.c cVar5 = flexLinesInternal.get(i13);
                        float f12 = cVar5.f65363g + size6;
                        if (i13 == flexLinesInternal.size() - 1) {
                            f12 += f11;
                            f11 = 0.0f;
                        }
                        int iRound = Math.round(f12);
                        f11 += f12 - iRound;
                        if (f11 > 1.0f) {
                            iRound++;
                            f11 -= 1.0f;
                        } else if (f11 < -1.0f) {
                            iRound--;
                            f11 += 1.0f;
                        }
                        cVar5.f65363g = iRound;
                        i13++;
                    }
                }
            }
        }
    }

    void q(int i10, int i11, int i12) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i13;
        int i14;
        r(this.f65375a.getFlexItemCount());
        if (i12 >= this.f65375a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f65375a.getFlexDirection();
        int flexDirection2 = this.f65375a.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
            int largestMainSize = this.f65375a.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.f65375a.getPaddingLeft();
            paddingRight = this.f65375a.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
            if (mode2 != 1073741824) {
                size = this.f65375a.getLargestMainSize();
            }
            paddingLeft = this.f65375a.getPaddingTop();
            paddingRight = this.f65375a.getPaddingBottom();
        }
        int i15 = paddingLeft + paddingRight;
        int i16 = size;
        int[] iArr = this.f65377c;
        int i17 = iArr != null ? iArr[i12] : 0;
        List<com.google.android.flexbox.c> flexLinesInternal = this.f65375a.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i17 < size2) {
            com.google.android.flexbox.c cVar = flexLinesInternal.get(i17);
            int i18 = cVar.f65361e;
            if (i18 >= i16 || !cVar.f65373q) {
                i13 = i10;
                i14 = i11;
                if (i18 > i16 && cVar.f65374r) {
                    T(i13, i14, cVar, i16, i15, false);
                }
            } else {
                i13 = i10;
                i14 = i11;
                w(i13, i14, cVar, i16, i15, false);
            }
            i17++;
            i10 = i13;
            i11 = i14;
        }
    }

    void s(int i10) {
        int[] iArr = this.f65377c;
        if (iArr == null) {
            this.f65377c = new int[Math.max(i10, 10)];
        } else if (iArr.length < i10) {
            this.f65377c = Arrays.copyOf(this.f65377c, Math.max(iArr.length * 2, i10));
        }
    }

    void t(int i10) {
        long[] jArr = this.f65378d;
        if (jArr == null) {
            this.f65378d = new long[Math.max(i10, 10)];
        } else if (jArr.length < i10) {
            this.f65378d = Arrays.copyOf(this.f65378d, Math.max(jArr.length * 2, i10));
        }
    }

    void u(int i10) {
        long[] jArr = this.f65379e;
        if (jArr == null) {
            this.f65379e = new long[Math.max(i10, 10)];
        } else if (jArr.length < i10) {
            this.f65379e = Arrays.copyOf(this.f65379e, Math.max(jArr.length * 2, i10));
        }
    }

    d(com.google.android.flexbox.a aVar) {
        this.f65375a = aVar;
    }

    private int[] U(int i10, List<c> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i10];
        int i11 = 0;
        for (c cVar : list) {
            int i12 = cVar.f65382a;
            iArr[i11] = i12;
            sparseIntArray.append(i12, cVar.f65383b);
            i11++;
        }
        return iArr;
    }

    private void V(View view, int i10, int i11) {
        int measuredHeight;
        com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i10 - bVar.A2()) - bVar.t3()) - this.f65375a.l(view), bVar.s0()), bVar.K1());
        long[] jArr = this.f65379e;
        if (jArr != null) {
            measuredHeight = x(jArr[i11]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        Z(i11, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        this.f65375a.o(i11, view);
    }

    private void W(View view, int i10, int i11) {
        int measuredWidth;
        com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i10 - bVar.J0()) - bVar.w2()) - this.f65375a.l(view), bVar.v3()), bVar.G3());
        long[] jArr = this.f65379e;
        if (jArr != null) {
            measuredWidth = y(jArr[i11]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        Z(i11, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        this.f65375a.o(i11, view);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.google.android.flexbox.b r0 = (com.google.android.flexbox.b) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.s0()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.s0()
        L19:
            r3 = r4
            goto L27
        L1b:
            int r3 = r0.K1()
            if (r1 <= r3) goto L26
            int r1 = r0.K1()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.v3()
            if (r2 >= r5) goto L32
            int r2 = r0.v3()
            goto L3e
        L32:
            int r5 = r0.G3()
            if (r2 <= r5) goto L3d
            int r2 = r0.G3()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L55
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.Z(r8, r1, r0, r7)
            com.google.android.flexbox.a r0 = r6.f65375a
            r0.o(r8, r7)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.d.i(android.view.View, int):void");
    }

    private void v(CompoundButton compoundButton) {
        int minimumWidth;
        com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) compoundButton.getLayoutParams();
        int iS0 = bVar.s0();
        int iV3 = bVar.v3();
        Drawable drawableA = androidx.core.widget.c.a(compoundButton);
        int minimumHeight = 0;
        if (drawableA == null) {
            minimumWidth = 0;
        } else {
            minimumWidth = drawableA.getMinimumWidth();
        }
        if (drawableA != null) {
            minimumHeight = drawableA.getMinimumHeight();
        }
        if (iS0 == -1) {
            iS0 = minimumWidth;
        }
        bVar.v2(iS0);
        if (iV3 == -1) {
            iV3 = minimumHeight;
        }
        bVar.P0(iV3);
    }

    void Q(View view, com.google.android.flexbox.c cVar, int i10, int i11, int i12, int i13) {
        com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) view.getLayoutParams();
        int alignItems = this.f65375a.getAlignItems();
        if (bVar.j0() != -1) {
            alignItems = bVar.j0();
        }
        int i14 = cVar.f65363g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems != 2) {
                    if (alignItems != 3) {
                        if (alignItems != 4) {
                            return;
                        }
                    } else if (this.f65375a.getFlexWrap() != 2) {
                        int iMax = Math.max(cVar.f65368l - view.getBaseline(), bVar.J0());
                        view.layout(i10, i11 + iMax, i12, i13 + iMax);
                        return;
                    } else {
                        int iMax2 = Math.max((cVar.f65368l - view.getMeasuredHeight()) + view.getBaseline(), bVar.w2());
                        view.layout(i10, i11 - iMax2, i12, i13 - iMax2);
                        return;
                    }
                } else {
                    int measuredHeight = (((i14 - view.getMeasuredHeight()) + bVar.J0()) - bVar.w2()) / 2;
                    if (this.f65375a.getFlexWrap() != 2) {
                        int i15 = i11 + measuredHeight;
                        view.layout(i10, i15, i12, view.getMeasuredHeight() + i15);
                        return;
                    } else {
                        int i16 = i11 - measuredHeight;
                        view.layout(i10, i16, i12, view.getMeasuredHeight() + i16);
                        return;
                    }
                }
            } else if (this.f65375a.getFlexWrap() != 2) {
                int i17 = i11 + i14;
                view.layout(i10, (i17 - view.getMeasuredHeight()) - bVar.w2(), i12, i17 - bVar.w2());
                return;
            } else {
                view.layout(i10, (i11 - i14) + view.getMeasuredHeight() + bVar.J0(), i12, (i13 - i14) + view.getMeasuredHeight() + bVar.J0());
                return;
            }
        }
        if (this.f65375a.getFlexWrap() != 2) {
            view.layout(i10, i11 + bVar.J0(), i12, i13 + bVar.J0());
        } else {
            view.layout(i10, i11 - bVar.w2(), i12, i13 - bVar.w2());
        }
    }

    void R(View view, com.google.android.flexbox.c cVar, boolean z10, int i10, int i11, int i12, int i13) {
        com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) view.getLayoutParams();
        int alignItems = this.f65375a.getAlignItems();
        if (bVar.j0() != -1) {
            alignItems = bVar.j0();
        }
        int i14 = cVar.f65363g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems != 2) {
                    if (alignItems != 3 && alignItems != 4) {
                        return;
                    }
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int measuredWidth = (((i14 - view.getMeasuredWidth()) + C16381t.b(marginLayoutParams)) - C16381t.a(marginLayoutParams)) / 2;
                    if (!z10) {
                        view.layout(i10 + measuredWidth, i11, i12 + measuredWidth, i13);
                        return;
                    } else {
                        view.layout(i10 - measuredWidth, i11, i12 - measuredWidth, i13);
                        return;
                    }
                }
            } else if (!z10) {
                view.layout(((i10 + i14) - view.getMeasuredWidth()) - bVar.t3(), i11, ((i12 + i14) - view.getMeasuredWidth()) - bVar.t3(), i13);
                return;
            } else {
                view.layout((i10 - i14) + view.getMeasuredWidth() + bVar.A2(), i11, (i12 - i14) + view.getMeasuredWidth() + bVar.A2(), i13);
                return;
            }
        }
        if (!z10) {
            view.layout(i10 + bVar.A2(), i11, i12 + bVar.A2(), i13);
        } else {
            view.layout(i10 - bVar.t3(), i11, i12 - bVar.t3(), i13);
        }
    }
}
