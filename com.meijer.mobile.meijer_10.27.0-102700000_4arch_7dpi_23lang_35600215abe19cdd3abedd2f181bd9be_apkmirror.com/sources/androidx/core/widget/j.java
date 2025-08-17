package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class j {

    static class a {
        static void a(PopupWindow popupWindow, boolean z10) {
            popupWindow.setOverlapAnchor(z10);
        }

        static void b(PopupWindow popupWindow, int i10) {
            popupWindow.setWindowLayoutType(i10);
        }
    }

    public static void a(PopupWindow popupWindow, boolean z10) {
        a.a(popupWindow, z10);
    }

    public static void b(PopupWindow popupWindow, int i10) {
        a.b(popupWindow, i10);
    }

    @Deprecated
    public static void c(PopupWindow popupWindow, View view, int i10, int i11, int i12) {
        popupWindow.showAsDropDown(view, i10, i11, i12);
    }
}
