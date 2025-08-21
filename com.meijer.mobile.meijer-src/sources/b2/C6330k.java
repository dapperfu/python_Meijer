package b2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.fullstory.FS;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: b2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6330k {
    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(TypedArray typedArray, int i10) {
        return typedArray instanceof Context ? FS.Resources_getDrawable((Context) typedArray, i10) : typedArray instanceof Resources ? FS.Resources_getDrawable((Resources) typedArray, i10) : typedArray.getDrawable(i10);
    }

    public static int a(Context context, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId != 0 ? i10 : i11;
    }

    private static ColorStateList h(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static boolean p(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray q(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static boolean b(TypedArray typedArray, int i10, int i11, boolean z10) {
        return typedArray.getBoolean(i10, typedArray.getBoolean(i11, z10));
    }

    public static Drawable c(TypedArray typedArray, int i10, int i11) {
        Drawable drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160 = __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArray, i10);
        if (drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160 == null) {
            return __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArray, i11);
        }
        return drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160;
    }

    public static int d(TypedArray typedArray, int i10, int i11, int i12) {
        return typedArray.getInt(i10, typedArray.getInt(i11, i12));
    }

    public static boolean e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, boolean z10) {
        if (!p(xmlPullParser, str)) {
            return z10;
        }
        return typedArray.getBoolean(i10, z10);
    }

    public static int f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        if (!p(xmlPullParser, str)) {
            return i11;
        }
        return typedArray.getColor(i10, i11);
    }

    public static ColorStateList g(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10) {
        if (p(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i11 = typedValue.type;
            if (i11 != 2) {
                if (i11 >= 28 && i11 <= 31) {
                    return h(typedValue);
                }
                return C6322c.d(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            }
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i10 + ": " + typedValue);
        }
        return null;
    }

    public static C6323d i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10, int i11) {
        if (p(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i12 = typedValue.type;
            if (i12 >= 28 && i12 <= 31) {
                return C6323d.b(typedValue.data);
            }
            C6323d c6323dG = C6323d.g(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            if (c6323dG != null) {
                return c6323dG;
            }
        }
        return C6323d.b(i11);
    }

    public static float j(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, float f10) {
        if (!p(xmlPullParser, str)) {
            return f10;
        }
        return typedArray.getFloat(i10, f10);
    }

    public static int k(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        if (!p(xmlPullParser, str)) {
            return i11;
        }
        return typedArray.getInt(i10, i11);
    }

    public static int l(TypedArray typedArray, int i10, int i11, int i12) {
        return typedArray.getResourceId(i10, typedArray.getResourceId(i11, i12));
    }

    public static String m(TypedArray typedArray, int i10, int i11) {
        String string = typedArray.getString(i10);
        if (string == null) {
            return typedArray.getString(i11);
        }
        return string;
    }

    public static CharSequence n(TypedArray typedArray, int i10, int i11) {
        CharSequence text = typedArray.getText(i10);
        if (text == null) {
            return typedArray.getText(i11);
        }
        return text;
    }

    public static CharSequence[] o(TypedArray typedArray, int i10, int i11) {
        CharSequence[] textArray = typedArray.getTextArray(i10);
        if (textArray == null) {
            return typedArray.getTextArray(i11);
        }
        return textArray;
    }
}
