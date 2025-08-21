package qe;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.M;
import com.fullstory.FS;
import j.C14879a;

/* renamed from: qe.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16634c {
    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(TypedArray typedArray, int i10) {
        return typedArray instanceof Context ? FS.Resources_getDrawable((Context) typedArray, i10) : typedArray instanceof Resources ? FS.Resources_getDrawable((Resources) typedArray, i10) : typedArray.getDrawable(i10);
    }

    public static int c(Context context, TypedArray typedArray, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i10, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i10, i11);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i11);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static ColorStateList a(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        ColorStateList colorStateListA;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (colorStateListA = C14879a.a(context, resourceId)) != null) {
            return colorStateListA;
        }
        return typedArray.getColorStateList(i10);
    }

    public static ColorStateList b(Context context, M m10, int i10) {
        int iN;
        ColorStateList colorStateListA;
        if (m10.s(i10) && (iN = m10.n(i10, 0)) != 0 && (colorStateListA = C14879a.a(context, iN)) != null) {
            return colorStateListA;
        }
        return m10.c(i10);
    }

    public static Drawable d(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        Drawable drawableB;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (drawableB = C14879a.b(context, resourceId)) != null) {
            return drawableB;
        }
        return __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArray, i10);
    }

    public static float e(Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    static int f(TypedArray typedArray, int i10, int i11) {
        if (typedArray.hasValue(i10)) {
            return i10;
        }
        return i11;
    }

    public static C16635d g(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0) {
            return new C16635d(context, resourceId);
        }
        return null;
    }

    public static boolean h(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    public static boolean i(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 2.0f) {
            return true;
        }
        return false;
    }
}
