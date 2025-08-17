package androidx.camera.core;

import C.I;
import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes.dex */
public final class r extends e {

    /* renamed from: d, reason: collision with root package name */
    private final Object f47566d;

    /* renamed from: e, reason: collision with root package name */
    private final I f47567e;

    /* renamed from: f, reason: collision with root package name */
    private Rect f47568f;

    /* renamed from: g, reason: collision with root package name */
    private final int f47569g;

    /* renamed from: h, reason: collision with root package name */
    private final int f47570h;

    r(n nVar, I i10) {
        this(nVar, null, i10);
    }

    public r(n nVar, Size size, I i10) {
        super(nVar);
        this.f47566d = new Object();
        if (size == null) {
            this.f47569g = super.getWidth();
            this.f47570h = super.getHeight();
        } else {
            this.f47569g = size.getWidth();
            this.f47570h = size.getHeight();
        }
        this.f47567e = i10;
    }

    @Override // androidx.camera.core.e, androidx.camera.core.n
    public I S2() {
        return this.f47567e;
    }

    @Override // androidx.camera.core.e, androidx.camera.core.n
    public void T0(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, getWidth(), getHeight())) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        synchronized (this.f47566d) {
            this.f47568f = rect;
        }
    }

    @Override // androidx.camera.core.e, androidx.camera.core.n
    public int getHeight() {
        return this.f47570h;
    }

    @Override // androidx.camera.core.e, androidx.camera.core.n
    public int getWidth() {
        return this.f47569g;
    }
}
