package com.google.android.material.carousel;

import android.content.Context;
import com.google.android.material.carousel.f;

/* loaded from: classes4.dex */
final class e {
    static float b(float f10, float f11, int i10) {
        return i10 > 0 ? f10 + (f11 / 2.0f) : f10;
    }

    static f d(Context context, float f10, float f11, a aVar, int i10) {
        return i10 == 1 ? c(context, f10, f11, aVar) : e(context, f10, f11, aVar);
    }

    static int i(int[] iArr) {
        int i10 = Integer.MIN_VALUE;
        for (int i11 : iArr) {
            if (i11 > i10) {
                i10 = i11;
            }
        }
        return i10;
    }

    static float j(float f10, float f11, float f12, int i10) {
        return i10 > 0 ? f11 + (f12 / 2.0f) : f10;
    }

    static float a(float f10, float f11, int i10) {
        return f10 + (Math.max(0, i10 - 1) * f11);
    }

    static f c(Context context, float f10, float f11, a aVar) {
        float f12;
        float f13;
        float fMin = Math.min(f(context) + f10, aVar.f87450f);
        float f14 = fMin / 2.0f;
        float f15 = 0.0f - f14;
        float fB = b(0.0f, aVar.f87446b, aVar.f87447c);
        float fJ = j(0.0f, a(fB, aVar.f87446b, (int) Math.floor(aVar.f87447c / 2.0f)), aVar.f87446b, aVar.f87447c);
        float fB2 = b(fJ, aVar.f87449e, aVar.f87448d);
        float fJ2 = j(fJ, a(fB2, aVar.f87449e, (int) Math.floor(aVar.f87448d / 2.0f)), aVar.f87449e, aVar.f87448d);
        float fB3 = b(fJ2, aVar.f87450f, aVar.f87451g);
        float fJ3 = j(fJ2, a(fB3, aVar.f87450f, aVar.f87451g), aVar.f87450f, aVar.f87451g);
        float fB4 = b(fJ3, aVar.f87449e, aVar.f87448d);
        float fB5 = b(j(fJ3, a(fB4, aVar.f87449e, (int) Math.ceil(aVar.f87448d / 2.0f)), aVar.f87449e, aVar.f87448d), aVar.f87446b, aVar.f87447c);
        float f16 = f14 + f11;
        float fB6 = d.b(fMin, aVar.f87450f, f10);
        float fB7 = d.b(aVar.f87446b, aVar.f87450f, f10);
        float fB8 = d.b(aVar.f87449e, aVar.f87450f, f10);
        f.b bVarA = new f.b(aVar.f87450f, f11).a(f15, fB6, fMin);
        if (aVar.f87447c > 0) {
            f12 = 2.0f;
            f13 = f16;
            bVarA.g(fB, fB7, aVar.f87446b, (int) Math.floor(r7 / 2.0f));
        } else {
            f12 = 2.0f;
            f13 = f16;
        }
        if (aVar.f87448d > 0) {
            bVarA.g(fB2, fB8, aVar.f87449e, (int) Math.floor(r4 / f12));
        }
        bVarA.h(fB3, 0.0f, aVar.f87450f, aVar.f87451g, true);
        if (aVar.f87448d > 0) {
            bVarA.g(fB4, fB8, aVar.f87449e, (int) Math.ceil(r4 / f12));
        }
        if (aVar.f87447c > 0) {
            bVarA.g(fB5, fB7, aVar.f87446b, (int) Math.ceil(r0 / f12));
        }
        bVarA.a(f13, fB6, fMin);
        return bVarA.i();
    }

    static f e(Context context, float f10, float f11, a aVar) {
        float fMin = Math.min(f(context) + f10, aVar.f87450f);
        float f12 = fMin / 2.0f;
        float f13 = 0.0f - f12;
        float fB = b(0.0f, aVar.f87450f, aVar.f87451g);
        float fJ = j(0.0f, a(fB, aVar.f87450f, aVar.f87451g), aVar.f87450f, aVar.f87451g);
        float fB2 = b(fJ, aVar.f87449e, aVar.f87448d);
        float fB3 = b(j(fJ, fB2, aVar.f87449e, aVar.f87448d), aVar.f87446b, aVar.f87447c);
        float f14 = f12 + f11;
        float fB4 = d.b(fMin, aVar.f87450f, f10);
        float fB5 = d.b(aVar.f87446b, aVar.f87450f, f10);
        float fB6 = d.b(aVar.f87449e, aVar.f87450f, f10);
        f.b bVarH = new f.b(aVar.f87450f, f11).a(f13, fB4, fMin).h(fB, 0.0f, aVar.f87450f, aVar.f87451g, true);
        if (aVar.f87448d > 0) {
            bVarH.b(fB2, fB6, aVar.f87449e);
        }
        int i10 = aVar.f87447c;
        if (i10 > 0) {
            bVarH.g(fB3, fB5, aVar.f87446b, i10);
        }
        bVarH.a(f14, fB4, fMin);
        return bVarH.i();
    }

    static float f(Context context) {
        return context.getResources().getDimension(ce.d.f61648v);
    }

    static float g(Context context) {
        return context.getResources().getDimension(ce.d.f61650w);
    }

    static float h(Context context) {
        return context.getResources().getDimension(ce.d.f61652x);
    }
}
