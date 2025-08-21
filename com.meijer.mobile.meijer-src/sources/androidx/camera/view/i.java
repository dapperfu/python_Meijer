package androidx.camera.view;

import C.o0;
import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
abstract class i {

    /* renamed from: a, reason: collision with root package name */
    Size f47870a;

    /* renamed from: b, reason: collision with root package name */
    FrameLayout f47871b;

    /* renamed from: c, reason: collision with root package name */
    private final e f47872c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f47873d = false;

    interface a {
        void a();
    }

    abstract View b();

    abstract Bitmap c();

    abstract void d();

    abstract void e();

    void f() {
        this.f47873d = true;
        h();
    }

    abstract void g(o0 o0Var, a aVar);

    abstract com.google.common.util.concurrent.q<Void> i();

    i(FrameLayout frameLayout, e eVar) {
        this.f47871b = frameLayout;
        this.f47872c = eVar;
    }

    Bitmap a() {
        Bitmap bitmapC = c();
        if (bitmapC == null) {
            return null;
        }
        return this.f47872c.a(bitmapC, new Size(this.f47871b.getWidth(), this.f47871b.getHeight()), this.f47871b.getLayoutDirection());
    }

    void h() {
        View viewB = b();
        if (viewB != null && this.f47873d) {
            this.f47872c.s(new Size(this.f47871b.getWidth(), this.f47871b.getHeight()), this.f47871b.getLayoutDirection(), viewB);
        }
    }
}
