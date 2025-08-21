package b2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.fullstory.FS;
import com.medallia.digital.mobilesdk.l3;
import h2.C14442a;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: b2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6322c {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f59911a = new ThreadLocal<>();

    private static int g(int i10, float f10, float f11) {
        boolean z10 = f11 >= 0.0f && f11 <= 100.0f;
        if (f10 == 1.0f && !z10) {
            return i10;
        }
        int iB = C14442a.b((int) ((Color.alpha(i10) * f10) + 0.5f), 0, l3.f93323c);
        if (z10) {
            C6320a c6320aC = C6320a.c(i10);
            i10 = C6320a.m(c6320aC.j(), c6320aC.i(), f11);
        }
        return (i10 & 16777215) | (iB << 24);
    }

    private static TypedValue c() {
        ThreadLocal<TypedValue> threadLocal = f59911a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        Resources resources2 = resources;
        int i10 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArrA = new int[20];
        int i11 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i10 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayH = h(resources2, theme, attributeSet, Y1.g.f42855b);
                int resourceId = typedArrayH.getResourceId(Y1.g.f42856c, -1);
                if (resourceId == -1 || f(resources2, resourceId)) {
                    color = typedArrayH.getColor(Y1.g.f42856c, -65281);
                } else {
                    try {
                        color = a(resources2, resources2.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = typedArrayH.getColor(Y1.g.f42856c, -65281);
                    }
                }
                float f10 = 1.0f;
                if (typedArrayH.hasValue(Y1.g.f42857d)) {
                    f10 = typedArrayH.getFloat(Y1.g.f42857d, 1.0f);
                } else if (typedArrayH.hasValue(Y1.g.f42859f)) {
                    f10 = typedArrayH.getFloat(Y1.g.f42859f, 1.0f);
                }
                float f11 = (Build.VERSION.SDK_INT < 31 || !typedArrayH.hasValue(Y1.g.f42858e)) ? typedArrayH.getFloat(Y1.g.f42860g, -1.0f) : typedArrayH.getFloat(Y1.g.f42858e, -1.0f);
                typedArrayH.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i12 = 0;
                for (int i13 = 0; i13 < attributeCount; i13++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i13);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != Y1.a.f42774a && attributeNameResource != Y1.a.f42775b) {
                        int i14 = i12 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i13, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i12] = attributeNameResource;
                        i12 = i14;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i12);
                iArrA = C6326g.a(iArrA, i11, g(color, f10, f11));
                iArr = (int[][]) C6326g.b(iArr, i11, iArrTrimStateSet);
                i11++;
            }
            i10 = 1;
            resources2 = resources;
        }
        int[] iArr3 = new int[i11];
        int[][] iArr4 = new int[i11][];
        System.arraycopy(iArrA, 0, iArr3, 0, i11);
        System.arraycopy(iArr, 0, iArr4, 0, i11);
        return new ColorStateList(iArr4, iArr3);
    }

    private static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    public static ColorStateList d(Resources resources, int i10, Resources.Theme theme) {
        try {
            return a(resources, resources.getXml(i10), theme);
        } catch (Exception e10) {
            FS.log_e("CSLCompat", "Failed to inflate ColorStateList.", e10);
            return null;
        }
    }

    private static boolean f(Resources resources, int i10) throws Resources.NotFoundException {
        TypedValue typedValueC = c();
        resources.getValue(i10, typedValueC, true);
        int i11 = typedValueC.type;
        if (i11 >= 28 && i11 <= 31) {
            return true;
        }
        return false;
    }
}
