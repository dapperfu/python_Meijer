package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import com.fullstory.FS;
import i.C14584j;

/* loaded from: classes.dex */
public class H {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f46668a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    static final int[] f46669b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    static final int[] f46670c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    static final int[] f46671d = {R.attr.state_activated};

    /* renamed from: e, reason: collision with root package name */
    static final int[] f46672e = {R.attr.state_pressed};

    /* renamed from: f, reason: collision with root package name */
    static final int[] f46673f = {R.attr.state_checked};

    /* renamed from: g, reason: collision with root package name */
    static final int[] f46674g = {R.attr.state_selected};

    /* renamed from: h, reason: collision with root package name */
    static final int[] f46675h = {-16842919, -16842908};

    /* renamed from: i, reason: collision with root package name */
    static final int[] f46676i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f46677j = new int[1];

    public static void a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C14584j.f136920y0);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(C14584j.f136702D0)) {
                FS.log_e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int c(Context context, int i10) {
        int[] iArr = f46677j;
        iArr[0] = i10;
        M mU = M.u(context, null, iArr);
        try {
            return mU.b(0, 0);
        } finally {
            mU.x();
        }
    }

    public static ColorStateList e(Context context, int i10) {
        int[] iArr = f46677j;
        iArr[0] = i10;
        M mU = M.u(context, null, iArr);
        try {
            return mU.c(0);
        } finally {
            mU.x();
        }
    }

    private static TypedValue f() {
        ThreadLocal<TypedValue> threadLocal = f46668a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static int b(Context context, int i10) {
        ColorStateList colorStateListE = e(context, i10);
        if (colorStateListE != null && colorStateListE.isStateful()) {
            return colorStateListE.getColorForState(f46669b, colorStateListE.getDefaultColor());
        }
        TypedValue typedValueF = f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueF, true);
        return d(context, i10, typedValueF.getFloat());
    }

    static int d(Context context, int i10, float f10) {
        return c2.c.k(c(context, i10), Math.round(Color.alpha(r0) * f10));
    }
}
