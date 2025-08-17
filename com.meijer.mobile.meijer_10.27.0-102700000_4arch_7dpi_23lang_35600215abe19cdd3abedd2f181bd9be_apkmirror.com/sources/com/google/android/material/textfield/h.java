package com.google.android.material.textfield;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import re.C16760h;
import re.C16765m;

/* loaded from: classes4.dex */
class h extends C16760h {

    /* renamed from: z, reason: collision with root package name */
    b f87848z;

    private static final class b extends C16760h.c {

        /* renamed from: w, reason: collision with root package name */
        private final RectF f87849w;

        private b(C16765m c16765m, RectF rectF) {
            super(c16765m, null);
            this.f87849w = rectF;
        }

        @Override // re.C16760h.c, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h hVarQ0 = h.q0(this);
            hVarQ0.invalidateSelf();
            return hVarQ0;
        }

        private b(b bVar) {
            super(bVar);
            this.f87849w = bVar.f87849w;
        }
    }

    @TargetApi(18)
    private static class c extends h {
        c(b bVar) {
            super(bVar);
        }

        @Override // re.C16760h
        protected void r(Canvas canvas) {
            if (this.f87848z.f87849w.isEmpty()) {
                super.r(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.f87848z.f87849w);
            } else {
                canvas.clipRect(this.f87848z.f87849w, Region.Op.DIFFERENCE);
            }
            super.r(canvas);
            canvas.restore();
        }
    }

    void t0() {
        u0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    private h(b bVar) {
        super(bVar);
        this.f87848z = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h q0(b bVar) {
        return new c(bVar);
    }

    static h r0(C16765m c16765m) {
        if (c16765m == null) {
            c16765m = new C16765m();
        }
        return q0(new b(c16765m, new RectF()));
    }

    @Override // re.C16760h, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f87848z = new b(this.f87848z);
        return this;
    }

    boolean s0() {
        return !this.f87848z.f87849w.isEmpty();
    }

    void u0(float f10, float f11, float f12, float f13) {
        if (f10 == this.f87848z.f87849w.left && f11 == this.f87848z.f87849w.top && f12 == this.f87848z.f87849w.right && f13 == this.f87848z.f87849w.bottom) {
            return;
        }
        this.f87848z.f87849w.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    void v0(RectF rectF) {
        u0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
