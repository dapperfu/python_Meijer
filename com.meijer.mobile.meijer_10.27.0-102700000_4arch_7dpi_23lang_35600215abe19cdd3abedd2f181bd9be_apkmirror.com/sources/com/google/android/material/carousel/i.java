package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import h2.C14329a;

/* loaded from: classes4.dex */
public final class i extends d {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f86646d = {1};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f86647e = {1, 0};

    /* renamed from: c, reason: collision with root package name */
    private int f86648c = 0;

    @Override // com.google.android.material.carousel.d
    f g(b bVar, View view) {
        float fD = bVar.d();
        if (bVar.b()) {
            fD = bVar.c();
        }
        float f10 = fD;
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        float f11 = ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (bVar.b()) {
            f11 = ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f12 = f11;
        float fD2 = d() + f12;
        float fMax = Math.max(c() + f12, fD2);
        float fMin = Math.min(measuredHeight + f12, f10);
        float fA = C14329a.a((measuredHeight / 3.0f) + f12, fD2 + f12, fMax + f12);
        float f13 = (fMin + fA) / 2.0f;
        int[] iArrA = f86646d;
        if (f10 < 2.0f * fD2) {
            iArrA = new int[]{0};
        }
        int[] iArrA2 = f86647e;
        if (bVar.j() == 1) {
            iArrA = d.a(iArrA);
            iArrA2 = d.a(iArrA2);
        }
        int[] iArr = iArrA2;
        int[] iArr2 = iArrA;
        int iMax = (int) Math.max(1.0d, Math.floor(((f10 - (e.i(iArr) * f13)) - (e.i(iArr2) * fMax)) / fMin));
        int iCeil = (int) Math.ceil(f10 / fMin);
        int i10 = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr3[i11] = iCeil - i11;
        }
        a aVarC = a.c(f10, fA, fD2, fMax, iArr2, f13, iArr, fMin, iArr3);
        this.f86648c = aVarC.e();
        if (i(aVarC, bVar.a())) {
            aVarC = a.c(f10, fA, fD2, fMax, new int[]{aVarC.f86607c}, f13, new int[]{aVarC.f86608d}, fMin, new int[]{aVarC.f86611g});
        }
        return e.d(view.getContext(), f12, f10, aVarC, bVar.j());
    }

    @Override // com.google.android.material.carousel.d
    boolean h(b bVar, int i10) {
        if (i10 >= this.f86648c || bVar.a() < this.f86648c) {
            return i10 >= this.f86648c && bVar.a() < this.f86648c;
        }
        return true;
    }

    boolean i(a aVar, int i10) {
        boolean z10;
        int iE = aVar.e() - i10;
        if (iE > 0 && (aVar.f86607c > 0 || aVar.f86608d > 1)) {
            z10 = true;
        } else {
            z10 = false;
        }
        while (iE > 0) {
            int i11 = aVar.f86607c;
            if (i11 > 0) {
                aVar.f86607c = i11 - 1;
            } else {
                int i12 = aVar.f86608d;
                if (i12 > 1) {
                    aVar.f86608d = i12 - 1;
                }
            }
            iE--;
        }
        return z10;
    }
}
