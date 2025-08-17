package fsimpl;

import android.view.View;
import android.view.ViewGroup;
import com.fullstory.util.Log;

/* renamed from: fsimpl.cu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C14023cu {

    /* renamed from: a, reason: collision with root package name */
    static final Class f132003a;

    static {
        if (C14108fz.f132295e == null) {
            Log.e("Unable to find PopupDecorView class instance");
        }
        Class clsA = fT.a("android.widget.Editor$SelectionHandleView");
        f132003a = clsA;
        if (clsA == null) {
            Log.e("Unable to find SelectionHandleView class instance");
        }
    }

    static boolean a(View view) {
        if (!(view instanceof ViewGroup) || !C14024cv.a(view.getClass(), C14108fz.f132295e, "android.widget.PopupWindow$PopupDecorView")) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (C14024cv.a(viewGroup.getChildAt(i10).getClass(), f132003a, "android.widget.Editor$SelectionHandleView")) {
                return true;
            }
        }
        return false;
    }
}
