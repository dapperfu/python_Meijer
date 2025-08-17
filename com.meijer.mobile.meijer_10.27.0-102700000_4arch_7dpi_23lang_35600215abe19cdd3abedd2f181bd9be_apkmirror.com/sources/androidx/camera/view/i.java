package androidx.camera.view;

import C.o0;
import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
abstract class i {

    /* renamed from: a, reason: collision with root package name */
    Size f47646a;

    /* renamed from: b, reason: collision with root package name */
    FrameLayout f47647b;

    /* renamed from: c, reason: collision with root package name */
    private final e f47648c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f47649d = false;

    interface a {
        void a();
    }

    abstract View b();

    abstract Bitmap c();

    abstract void d();

    abstract void e();

    void f() {
        this.f47649d = true;
        h();
    }

    abstract void g(o0 o0Var, a aVar);

    abstract com.google.common.util.concurrent.q<Void> i();

    i(FrameLayout frameLayout, e eVar) {
        this.f47647b = frameLayout;
        this.f47648c = eVar;
    }

    Bitmap a() {
        Bitmap bitmapC = c();
        if (bitmapC == null) {
            return null;
        }
        return this.f47648c.a(bitmapC, new Size(this.f47647b.getWidth(), this.f47647b.getHeight()), this.f47647b.getLayoutDirection());
    }

    void h() {
        View viewB = b();
        if (viewB != null && this.f47649d) {
            this.f47648c.s(new Size(this.f47647b.getWidth(), this.f47647b.getHeight()), this.f47647b.getLayoutDirection(), viewB);
        }
    }
}
