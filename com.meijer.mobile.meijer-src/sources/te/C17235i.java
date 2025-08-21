package te;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.x;

/* renamed from: te.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17235i {
    static C17230d a(int i10) {
        return i10 != 0 ? i10 != 1 ? b() : new C17231e() : new C17238l();
    }

    static C17230d b() {
        return new C17238l();
    }

    static C17232f c() {
        return new C17232f();
    }

    public static void d(View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof C17234h) {
            ((C17234h) background).a0(f10);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C17234h) {
            f(view, (C17234h) background);
        }
    }

    public static void f(View view, C17234h c17234h) {
        if (c17234h.S()) {
            c17234h.e0(x.j(view));
        }
    }
}
