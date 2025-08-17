package b1;

import H1.h;
import V0.AbstractC5324i0;
import V0.C5306c0;
import V0.C5327j0;
import V0.C5346q0;
import V0.C5349s0;
import V0.F1;
import V0.G1;
import V0.SolidColor;
import V0.s1;
import a1.d;
import a1.j;
import a1.o;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import b2.C6183d;
import b2.C6190k;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(d1 = {"\u0000T\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a$\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aC\u0010\u0016\u001a\u00020\u0000*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0018\u001a\u00020\b*\u00020\bH\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a1\u0010\u001a\u001a\u00020\u0013*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a9\u0010\u001d\u001a\u00020\u001c*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0019\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#\u001a9\u0010$\u001a\u00020\u001c*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b$\u0010\u001e\u001a9\u0010%\u001a\u00020\u001c*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b%\u0010\u001e\"\u0014\u0010'\u001a\u00020\u00008\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"", PreferencesHelper.PREF_ID, "LV0/F1;", "defValue", "b", "(II)I", "LV0/G1;", "c", "Lorg/xmlpull/v1/XmlPullParser;", "", "d", "(Lorg/xmlpull/v1/XmlPullParser;)Z", "Lb1/a;", "Landroid/content/res/Resources;", "res", "Landroid/util/AttributeSet;", "attrs", "Landroid/content/res/Resources$Theme;", "theme", "La1/d$a;", "builder", "nestedGroups", "g", "(Lb1/a;Landroid/content/res/Resources;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;La1/d$a;I)I", "j", "(Lorg/xmlpull/v1/XmlPullParser;)Lorg/xmlpull/v1/XmlPullParser;", "a", "(Lb1/a;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;)La1/d$a;", "", "i", "(Lb1/a;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;La1/d$a;)V", "Lb2/d;", "complexColor", "LV0/i0;", "e", "(Lb2/d;)LV0/i0;", "f", "h", "I", "FILL_TYPE_WINDING", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: b1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6179c {

    /* renamed from: a, reason: collision with root package name */
    private static final int f59690a = 0;

    public static final d.a a(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet) {
        long j10;
        int iZ;
        ColorStateList colorStateListE;
        C6178b c6178b = C6178b.f59664a;
        TypedArray typedArrayK = androidVectorParser.k(resources, theme, attributeSet, c6178b.F());
        boolean zD = androidVectorParser.d(typedArrayK, "autoMirrored", c6178b.a(), false);
        float fG = androidVectorParser.g(typedArrayK, "viewportWidth", c6178b.H(), 0.0f);
        float fG2 = androidVectorParser.g(typedArrayK, "viewportHeight", c6178b.G(), 0.0f);
        if (fG <= 0.0f) {
            throw new XmlPullParserException(typedArrayK.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if (fG2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayK.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        float fA = androidVectorParser.a(typedArrayK, c6178b.I(), 0.0f);
        float fA2 = androidVectorParser.a(typedArrayK, c6178b.n(), 0.0f);
        if (typedArrayK.hasValue(c6178b.D())) {
            TypedValue typedValue = new TypedValue();
            typedArrayK.getValue(c6178b.D(), typedValue);
            j10 = (typedValue.type == 2 || (colorStateListE = androidVectorParser.e(typedArrayK, theme, "tint", c6178b.D())) == null) ? C5346q0.INSTANCE.j() : C5349s0.b(colorStateListE.getDefaultColor());
        } else {
            j10 = C5346q0.INSTANCE.j();
        }
        long j11 = j10;
        int iC = androidVectorParser.c(typedArrayK, c6178b.E(), -1);
        if (iC == -1) {
            iZ = C5306c0.INSTANCE.z();
        } else if (iC == 3) {
            iZ = C5306c0.INSTANCE.B();
        } else if (iC == 5) {
            iZ = C5306c0.INSTANCE.z();
        } else if (iC != 9) {
            switch (iC) {
                case 14:
                    iZ = C5306c0.INSTANCE.q();
                    break;
                case 15:
                    iZ = C5306c0.INSTANCE.v();
                    break;
                case 16:
                    iZ = C5306c0.INSTANCE.t();
                    break;
                default:
                    iZ = C5306c0.INSTANCE.z();
                    break;
            }
        } else {
            iZ = C5306c0.INSTANCE.y();
        }
        int i10 = iZ;
        float fP = h.p(fA / resources.getDisplayMetrics().density);
        float fP2 = h.p(fA2 / resources.getDisplayMetrics().density);
        typedArrayK.recycle();
        return new d.a(null, fP, fP2, fG, fG2, j11, i10, zD, 1, null);
    }

    private static final int b(int i10, int i11) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i11 : F1.INSTANCE.c() : F1.INSTANCE.b() : F1.INSTANCE.a();
    }

    private static final int c(int i10, int i11) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i11 : G1.INSTANCE.a() : G1.INSTANCE.c() : G1.INSTANCE.b();
    }

    public static final void f(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, d.a aVar) {
        C6178b c6178b = C6178b.f59664a;
        TypedArray typedArrayK = androidVectorParser.k(resources, theme, attributeSet, c6178b.b());
        String strI = androidVectorParser.i(typedArrayK, c6178b.c());
        if (strI == null) {
            strI = "";
        }
        String str = strI;
        String strI2 = androidVectorParser.i(typedArrayK, c6178b.d());
        List listD = strI2 == null ? o.d() : j.b(androidVectorParser.pathParser, strI2, null, 2, null);
        typedArrayK.recycle();
        d.a.b(aVar, str, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, listD, 254, null);
    }

    public static final void h(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, d.a aVar) {
        C6178b c6178b = C6178b.f59664a;
        TypedArray typedArrayK = androidVectorParser.k(resources, theme, attributeSet, c6178b.e());
        float fG = androidVectorParser.g(typedArrayK, "rotation", c6178b.i(), 0.0f);
        float fB = androidVectorParser.b(typedArrayK, c6178b.g(), 0.0f);
        float fB2 = androidVectorParser.b(typedArrayK, c6178b.h(), 0.0f);
        float fG2 = androidVectorParser.g(typedArrayK, "scaleX", c6178b.j(), 1.0f);
        float fG3 = androidVectorParser.g(typedArrayK, "scaleY", c6178b.k(), 1.0f);
        float fG4 = androidVectorParser.g(typedArrayK, "translateX", c6178b.l(), 0.0f);
        float fG5 = androidVectorParser.g(typedArrayK, "translateY", c6178b.m(), 0.0f);
        String strI = androidVectorParser.i(typedArrayK, c6178b.f());
        if (strI == null) {
            strI = "";
        }
        typedArrayK.recycle();
        aVar.a(strI, fG, fB, fB2, fG2, fG3, fG4, fG5, o.d());
    }

    public static final void i(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, d.a aVar) throws IllegalArgumentException {
        C6178b c6178b = C6178b.f59664a;
        TypedArray typedArrayK = androidVectorParser.k(resources, theme, attributeSet, c6178b.o());
        if (!C6190k.p(androidVectorParser.getXmlParser(), "pathData")) {
            throw new IllegalArgumentException("No path data available");
        }
        String strI = androidVectorParser.i(typedArrayK, c6178b.r());
        if (strI == null) {
            strI = "";
        }
        String str = strI;
        String strI2 = androidVectorParser.i(typedArrayK, c6178b.s());
        List<? extends a1.h> listD = strI2 == null ? o.d() : j.b(androidVectorParser.pathParser, strI2, null, 2, null);
        C6183d c6183dF = androidVectorParser.f(typedArrayK, theme, "fillColor", c6178b.q(), 0);
        float fG = androidVectorParser.g(typedArrayK, "fillAlpha", c6178b.p(), 1.0f);
        int iB = b(androidVectorParser.h(typedArrayK, "strokeLineCap", c6178b.v(), -1), F1.INSTANCE.a());
        int iC = c(androidVectorParser.h(typedArrayK, "strokeLineJoin", c6178b.w(), -1), G1.INSTANCE.a());
        float fG2 = androidVectorParser.g(typedArrayK, "strokeMiterLimit", c6178b.x(), 1.0f);
        C6183d c6183dF2 = androidVectorParser.f(typedArrayK, theme, "strokeColor", c6178b.u(), 0);
        float fG3 = androidVectorParser.g(typedArrayK, "strokeAlpha", c6178b.t(), 1.0f);
        float fG4 = androidVectorParser.g(typedArrayK, "strokeWidth", c6178b.y(), 1.0f);
        float fG5 = androidVectorParser.g(typedArrayK, "trimPathEnd", c6178b.z(), 1.0f);
        float fG6 = androidVectorParser.g(typedArrayK, "trimPathOffset", c6178b.B(), 0.0f);
        float fG7 = androidVectorParser.g(typedArrayK, "trimPathStart", c6178b.C(), 0.0f);
        int iH = androidVectorParser.h(typedArrayK, "fillType", c6178b.A(), f59690a);
        typedArrayK.recycle();
        aVar.c(listD, iH == 0 ? s1.INSTANCE.b() : s1.INSTANCE.a(), str, e(c6183dF), fG, e(c6183dF2), fG3, fG4, iB, iC, fG2, fG7, fG5, fG6);
    }

    public static final boolean d(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 1 || (xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3)) {
            return true;
        }
        return false;
    }

    private static final AbstractC5324i0 e(C6183d c6183d) {
        if (!c6183d.l()) {
            return null;
        }
        Shader shaderF = c6183d.f();
        if (shaderF != null) {
            return C5327j0.a(shaderF);
        }
        return new SolidColor(C5349s0.b(c6183d.e()), null);
    }

    public static final int g(AndroidVectorParser androidVectorParser, Resources resources, AttributeSet attributeSet, Resources.Theme theme, d.a aVar, int i10) {
        int eventType = androidVectorParser.getXmlParser().getEventType();
        if (eventType != 2) {
            if (eventType == 3 && Intrinsics.e("group", androidVectorParser.getXmlParser().getName())) {
                int i11 = i10 + 1;
                for (int i12 = 0; i12 < i11; i12++) {
                    aVar.g();
                }
                return 0;
            }
            return i10;
        }
        String name = androidVectorParser.getXmlParser().getName();
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1649314686) {
                if (iHashCode != 3433509) {
                    if (iHashCode == 98629247 && name.equals("group")) {
                        h(androidVectorParser, resources, theme, attributeSet, aVar);
                        return i10;
                    }
                    return i10;
                }
                if (name.equals("path")) {
                    i(androidVectorParser, resources, theme, attributeSet, aVar);
                    return i10;
                }
                return i10;
            }
            if (name.equals("clip-path")) {
                f(androidVectorParser, resources, theme, attributeSet, aVar);
                return i10 + 1;
            }
            return i10;
        }
        return i10;
    }

    public static final XmlPullParser j(XmlPullParser xmlPullParser) throws XmlPullParserException {
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}
