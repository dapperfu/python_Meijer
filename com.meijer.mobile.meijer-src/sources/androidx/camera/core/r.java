package androidx.camera.core;

import C.I;
import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes.dex */
public final class r extends e {

    /* renamed from: d, reason: collision with root package name */
    private final Object f47790d;

    /* renamed from: e, reason: collision with root package name */
    private final I f47791e;

    /* renamed from: f, reason: collision with root package name */
    private Rect f47792f;

    /* renamed from: g, reason: collision with root package name */
    private final int f47793g;

    /* renamed from: h, reason: collision with root package name */
    private final int f47794h;

    r(n nVar, I i10) {
        this(nVar, null, i10);
    }

    public r(n nVar, Size size, I i10) {
        super(nVar);
        this.f47790d = new Object();
        if (size == null) {
            this.f47793g = super.getWidth();
            this.f47794h = super.getHeight();
        } else {
            this.f47793g = size.getWidth();
            this.f47794h = size.getHeight();
        }
        this.f47791e = i10;
    }

    @Override // androidx.camera.core.e, androidx.camera.core.n
    public void R0(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, getWidth(), getHeight())) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        synchronized (this.f47790d) {
            this.f47792f = rect;
        }
    }

    @Override // androidx.camera.core.e, androidx.camera.core.n
    public I S2() {
        return this.f47791e;
    }

    @Override // androidx.camera.core.e, androidx.camera.core.n
    public int getHeight() {
        return this.f47794h;
    }

    @Override // androidx.camera.core.e, androidx.camera.core.n
    public int getWidth() {
        return this.f47793g;
    }
}
