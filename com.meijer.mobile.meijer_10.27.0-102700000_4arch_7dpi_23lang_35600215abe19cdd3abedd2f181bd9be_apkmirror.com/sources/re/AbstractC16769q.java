package re;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import ee.C13649a;

/* renamed from: re.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC16769q {

    /* renamed from: c, reason: collision with root package name */
    C16765m f158138c;

    /* renamed from: a, reason: collision with root package name */
    boolean f158136a = false;

    /* renamed from: b, reason: collision with root package name */
    boolean f158137b = false;

    /* renamed from: d, reason: collision with root package name */
    RectF f158139d = new RectF();

    /* renamed from: e, reason: collision with root package name */
    final Path f158140e = new Path();

    abstract void b(View view);

    abstract boolean i();

    public static AbstractC16769q a(View view) {
        return Build.VERSION.SDK_INT >= 33 ? new C16771s(view) : new C16770r(view);
    }

    private boolean c() {
        RectF rectF = this.f158139d;
        return rectF.left <= rectF.right && rectF.top <= rectF.bottom;
    }

    public void e(View view, RectF rectF) {
        this.f158139d = rectF;
        j();
        b(view);
    }

    public void f(View view, C16765m c16765m) {
        this.f158138c = c16765m;
        j();
        b(view);
    }

    public void g(View view, boolean z10) {
        if (z10 != this.f158136a) {
            this.f158136a = z10;
            b(view);
        }
    }

    public void h(View view, boolean z10) {
        this.f158137b = z10;
        b(view);
    }

    private void j() {
        if (c() && this.f158138c != null) {
            C16766n.k().d(this.f158138c, 1.0f, this.f158139d, this.f158140e);
        }
    }

    public void d(Canvas canvas, C13649a.InterfaceC2023a interfaceC2023a) {
        if (i() && !this.f158140e.isEmpty()) {
            canvas.save();
            canvas.clipPath(this.f158140e);
            interfaceC2023a.a(canvas);
            canvas.restore();
            return;
        }
        interfaceC2023a.a(canvas);
    }
}
