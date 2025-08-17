package oe;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* renamed from: oe.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16025b {
    public static TypedValue a(Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(Context context, int i10, boolean z10) {
        TypedValue typedValueA = a(context, i10);
        if (typedValueA != null && typedValueA.type == 18) {
            if (typedValueA.data != 0) {
                return true;
            }
            return false;
        }
        return z10;
    }

    public static int c(Context context, int i10, int i11) {
        TypedValue typedValueA = a(context, i10);
        if (typedValueA != null && typedValueA.type == 16) {
            return typedValueA.data;
        }
        return i11;
    }

    public static int d(Context context, int i10, String str) {
        return e(context, i10, str).data;
    }

    public static TypedValue e(Context context, int i10, String str) {
        TypedValue typedValueA = a(context, i10);
        if (typedValueA != null) {
            return typedValueA;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i10)));
    }

    public static TypedValue f(View view, int i10) {
        return e(view.getContext(), i10, view.getClass().getCanonicalName());
    }
}
