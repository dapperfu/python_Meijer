package ce;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: ce.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6388c {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f61754a = false;

    public static void a(C6386a c6386a, View view) {
        b(c6386a, view, null);
    }

    public static void c(C6386a c6386a, View view) {
        if (c6386a == null) {
            return;
        }
        if (f61754a || c6386a.j() != null) {
            c6386a.j().setForeground(null);
        } else {
            view.getOverlay().remove(c6386a);
        }
    }

    public static void d(C6386a c6386a, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        c6386a.setBounds(rect);
        c6386a.Y(view, frameLayout);
    }

    public static void e(Rect rect, float f10, float f11, float f12, float f13) {
        rect.set((int) (f10 - f12), (int) (f11 - f13), (int) (f10 + f12), (int) (f11 + f13));
    }

    public static void b(C6386a c6386a, View view, FrameLayout frameLayout) {
        d(c6386a, view, frameLayout);
        if (c6386a.j() != null) {
            c6386a.j().setForeground(c6386a);
        } else {
            if (!f61754a) {
                view.getOverlay().add(c6386a);
                return;
            }
            throw new IllegalArgumentException("Trying to reference null customBadgeParent");
        }
    }
}
