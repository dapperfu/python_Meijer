package fsimpl;

import android.view.View;
import android.view.ViewGroup;
import com.fullstory.util.Log;

/* renamed from: fsimpl.cu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C14148cu {

    /* renamed from: a, reason: collision with root package name */
    static final Class f133253a;

    static {
        if (C14233fz.f133545e == null) {
            Log.e("Unable to find PopupDecorView class instance");
        }
        Class clsA = fT.a("android.widget.Editor$SelectionHandleView");
        f133253a = clsA;
        if (clsA == null) {
            Log.e("Unable to find SelectionHandleView class instance");
        }
    }

    static boolean a(View view) {
        if (!(view instanceof ViewGroup) || !C14149cv.a(view.getClass(), C14233fz.f133545e, "android.widget.PopupWindow$PopupDecorView")) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (C14149cv.a(viewGroup.getChildAt(i10).getClass(), f133253a, "android.widget.Editor$SelectionHandleView")) {
                return true;
            }
        }
        return false;
    }
}
