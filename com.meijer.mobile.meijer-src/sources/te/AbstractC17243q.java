package te;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import ge.C14353a;

/* renamed from: te.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC17243q {

    /* renamed from: c, reason: collision with root package name */
    C17239m f162628c;

    /* renamed from: a, reason: collision with root package name */
    boolean f162626a = false;

    /* renamed from: b, reason: collision with root package name */
    boolean f162627b = false;

    /* renamed from: d, reason: collision with root package name */
    RectF f162629d = new RectF();

    /* renamed from: e, reason: collision with root package name */
    final Path f162630e = new Path();

    abstract void b(View view);

    abstract boolean i();

    public static AbstractC17243q a(View view) {
        return Build.VERSION.SDK_INT >= 33 ? new C17245s(view) : new C17244r(view);
    }

    private boolean c() {
        RectF rectF = this.f162629d;
        return rectF.left <= rectF.right && rectF.top <= rectF.bottom;
    }

    public void e(View view, RectF rectF) {
        this.f162629d = rectF;
        j();
        b(view);
    }

    public void f(View view, C17239m c17239m) {
        this.f162628c = c17239m;
        j();
        b(view);
    }

    public void g(View view, boolean z10) {
        if (z10 != this.f162626a) {
            this.f162626a = z10;
            b(view);
        }
    }

    public void h(View view, boolean z10) {
        this.f162627b = z10;
        b(view);
    }

    private void j() {
        if (c() && this.f162628c != null) {
            C17240n.k().d(this.f162628c, 1.0f, this.f162629d, this.f162630e);
        }
    }

    public void d(Canvas canvas, C14353a.InterfaceC2121a interfaceC2121a) {
        if (i() && !this.f162630e.isEmpty()) {
            canvas.save();
            canvas.clipPath(this.f162630e);
            interfaceC2121a.a(canvas);
            canvas.restore();
            return;
        }
        interfaceC2121a.a(canvas);
    }
}
