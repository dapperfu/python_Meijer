package ee;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: ee.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C13792c {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f130136a = false;

    public static void a(C13790a c13790a, View view) {
        b(c13790a, view, null);
    }

    public static void c(C13790a c13790a, View view) {
        if (c13790a == null) {
            return;
        }
        if (f130136a || c13790a.j() != null) {
            c13790a.j().setForeground(null);
        } else {
            view.getOverlay().remove(c13790a);
        }
    }

    public static void d(C13790a c13790a, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        c13790a.setBounds(rect);
        c13790a.Y(view, frameLayout);
    }

    public static void e(Rect rect, float f10, float f11, float f12, float f13) {
        rect.set((int) (f10 - f12), (int) (f11 - f13), (int) (f10 + f12), (int) (f11 + f13));
    }

    public static void b(C13790a c13790a, View view, FrameLayout frameLayout) {
        d(c13790a, view, frameLayout);
        if (c13790a.j() != null) {
            c13790a.j().setForeground(c13790a);
        } else {
            if (!f130136a) {
                view.getOverlay().add(c13790a);
                return;
            }
            throw new IllegalArgumentException("Trying to reference null customBadgeParent");
        }
    }
}
