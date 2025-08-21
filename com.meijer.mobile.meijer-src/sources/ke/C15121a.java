package ke;

import Z1.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import c2.c;
import com.medallia.digital.mobilesdk.l3;
import qe.C16633b;

/* renamed from: ke.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15121a {
    public static boolean h(int i10) {
        return i10 != 0 && c.d(i10) > 0.5d;
    }

    private static int l(Context context, TypedValue typedValue) {
        int i10 = typedValue.resourceId;
        return i10 != 0 ? b.c(context, i10) : typedValue.data;
    }

    public static int a(int i10, int i11) {
        return c.k(i10, (Color.alpha(i10) * i11) / l3.f93323c);
    }

    public static int b(Context context, int i10, int i11) {
        Integer numF = f(context, i10);
        if (numF != null) {
            return numF.intValue();
        }
        return i11;
    }

    public static int c(Context context, int i10, String str) {
        return l(context, C16633b.e(context, i10, str));
    }

    public static int d(View view, int i10) {
        return l(view.getContext(), C16633b.f(view, i10));
    }

    public static int e(View view, int i10, int i11) {
        return b(view.getContext(), i10, i11);
    }

    public static Integer f(Context context, int i10) {
        TypedValue typedValueA = C16633b.a(context, i10);
        if (typedValueA != null) {
            return Integer.valueOf(l(context, typedValueA));
        }
        return null;
    }

    public static ColorStateList g(Context context, int i10) {
        TypedValue typedValueA = C16633b.a(context, i10);
        if (typedValueA == null) {
            return null;
        }
        int i11 = typedValueA.resourceId;
        if (i11 != 0) {
            return b.d(context, i11);
        }
        int i12 = typedValueA.data;
        if (i12 == 0) {
            return null;
        }
        return ColorStateList.valueOf(i12);
    }

    public static int i(int i10, int i11) {
        return c.g(i11, i10);
    }

    public static int j(int i10, int i11, float f10) {
        return i(i10, c.k(i11, Math.round(Color.alpha(i11) * f10)));
    }

    public static int k(View view, int i10, int i11, float f10) {
        return j(d(view, i10), d(view, i11), f10);
    }
}
