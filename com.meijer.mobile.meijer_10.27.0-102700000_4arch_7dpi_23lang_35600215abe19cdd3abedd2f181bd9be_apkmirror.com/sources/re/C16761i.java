package re;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.x;

/* renamed from: re.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16761i {
    static C16756d a(int i10) {
        return i10 != 0 ? i10 != 1 ? b() : new C16757e() : new C16764l();
    }

    static C16756d b() {
        return new C16764l();
    }

    static C16758f c() {
        return new C16758f();
    }

    public static void d(View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof C16760h) {
            ((C16760h) background).a0(f10);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C16760h) {
            f(view, (C16760h) background);
        }
    }

    public static void f(View view, C16760h c16760h) {
        if (c16760h.S()) {
            c16760h.e0(x.j(view));
        }
    }
}
