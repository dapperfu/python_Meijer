package Qa;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes4.dex */
public class g extends d {
    public View a(View view, Object obj, int i10) {
        if (obj == null || view == null) {
            return null;
        }
        if (obj.equals(view.getTag(i10))) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                View viewA = a(viewGroup.getChildAt(i11), obj, i10);
                if (viewA != null) {
                    return viewA;
                }
            }
        }
        return null;
    }
}
