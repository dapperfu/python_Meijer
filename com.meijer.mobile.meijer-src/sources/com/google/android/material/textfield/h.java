package com.google.android.material.textfield;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import te.C17234h;
import te.C17239m;

/* loaded from: classes4.dex */
class h extends C17234h {

    /* renamed from: z, reason: collision with root package name */
    b f88688z;

    private static final class b extends C17234h.c {

        /* renamed from: w, reason: collision with root package name */
        private final RectF f88689w;

        private b(C17239m c17239m, RectF rectF) {
            super(c17239m, null);
            this.f88689w = rectF;
        }

        @Override // te.C17234h.c, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h hVarQ0 = h.q0(this);
            hVarQ0.invalidateSelf();
            return hVarQ0;
        }

        private b(b bVar) {
            super(bVar);
            this.f88689w = bVar.f88689w;
        }
    }

    @TargetApi(18)
    private static class c extends h {
        c(b bVar) {
            super(bVar);
        }

        @Override // te.C17234h
        protected void r(Canvas canvas) {
            if (this.f88688z.f88689w.isEmpty()) {
                super.r(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.f88688z.f88689w);
            } else {
                canvas.clipRect(this.f88688z.f88689w, Region.Op.DIFFERENCE);
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
        this.f88688z = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h q0(b bVar) {
        return new c(bVar);
    }

    static h r0(C17239m c17239m) {
        if (c17239m == null) {
            c17239m = new C17239m();
        }
        return q0(new b(c17239m, new RectF()));
    }

    @Override // te.C17234h, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f88688z = new b(this.f88688z);
        return this;
    }

    boolean s0() {
        return !this.f88688z.f88689w.isEmpty();
    }

    void u0(float f10, float f11, float f12, float f13) {
        if (f10 == this.f88688z.f88689w.left && f11 == this.f88688z.f88689w.top && f12 == this.f88688z.f88689w.right && f13 == this.f88688z.f88689w.bottom) {
            return;
        }
        this.f88688z.f88689w.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    void v0(RectF rectF) {
        u0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
