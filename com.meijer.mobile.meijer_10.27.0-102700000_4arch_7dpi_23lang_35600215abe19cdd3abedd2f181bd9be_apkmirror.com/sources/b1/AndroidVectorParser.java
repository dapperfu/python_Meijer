package b1;

import a1.j;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import b2.C6183d;
import b2.C6190k;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0018\u00010\u000eR\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J/\u0010\"\u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020!¢\u0006\u0004\b\"\u0010#J%\u0010%\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001e¢\u0006\u0004\b%\u0010&J%\u0010'\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0004¢\u0006\u0004\b)\u0010*J%\u0010,\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u001e¢\u0006\u0004\b,\u0010&J?\u0010.\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u00142\f\u0010\u000f\u001a\b\u0018\u00010\u000eR\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u00042\b\b\u0001\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b.\u0010/J7\u00101\u001a\u0004\u0018\u0001002\u0006\u0010\u0017\u001a\u00020\u00142\f\u0010\u000f\u001a\b\u0018\u00010\u000eR\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b5\u00106J\u001a\u00108\u001a\u00020!2\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010:\u001a\u0004\b;\u0010<R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010=\u001a\u0004\b>\u00106\"\u0004\b?\u0010\u000bR\u0014\u0010B\u001a\u00020@8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b'\u0010A¨\u0006C"}, d2 = {"Lb1/a;", "", "Lorg/xmlpull/v1/XmlPullParser;", "xmlParser", "", "config", "<init>", "(Lorg/xmlpull/v1/XmlPullParser;I)V", "resConfig", "", "l", "(I)V", "Landroid/content/res/Resources;", "res", "Landroid/content/res/Resources$Theme;", "theme", "Landroid/util/AttributeSet;", "set", "", "attrs", "Landroid/content/res/TypedArray;", "k", "(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;", "typedArray", "", "attrName", "resId", "defaultValue", "h", "(Landroid/content/res/TypedArray;Ljava/lang/String;II)I", "", "g", "(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F", "", "d", "(Landroid/content/res/TypedArray;Ljava/lang/String;IZ)Z", "index", "b", "(Landroid/content/res/TypedArray;IF)F", "c", "(Landroid/content/res/TypedArray;II)I", "i", "(Landroid/content/res/TypedArray;I)Ljava/lang/String;", "defValue", "a", "Lb2/d;", "f", "(Landroid/content/res/TypedArray;Landroid/content/res/Resources$Theme;Ljava/lang/String;II)Lb2/d;", "Landroid/content/res/ColorStateList;", "e", "(Landroid/content/res/TypedArray;Landroid/content/res/Resources$Theme;Ljava/lang/String;I)Landroid/content/res/ColorStateList;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lorg/xmlpull/v1/XmlPullParser;", "j", "()Lorg/xmlpull/v1/XmlPullParser;", "I", "getConfig", "setConfig", "La1/j;", "La1/j;", "pathParser", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: b1.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final /* data */ class AndroidVectorParser {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final XmlPullParser xmlParser;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private int config;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final j pathParser;

    public AndroidVectorParser(XmlPullParser xmlPullParser, int i10) {
        this.xmlParser = xmlPullParser;
        this.config = i10;
        this.pathParser = new j();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidVectorParser)) {
            return false;
        }
        AndroidVectorParser androidVectorParser = (AndroidVectorParser) other;
        return Intrinsics.e(this.xmlParser, androidVectorParser.xmlParser) && this.config == androidVectorParser.config;
    }

    private final void l(int resConfig) {
        this.config = resConfig | this.config;
    }

    public final boolean d(TypedArray typedArray, String attrName, int resId, boolean defaultValue) {
        boolean zE = C6190k.e(typedArray, this.xmlParser, attrName, resId, defaultValue);
        l(typedArray.getChangingConfigurations());
        return zE;
    }

    public final ColorStateList e(TypedArray typedArray, Resources.Theme theme, String attrName, int resId) {
        ColorStateList colorStateListG = C6190k.g(typedArray, this.xmlParser, theme, attrName, resId);
        l(typedArray.getChangingConfigurations());
        return colorStateListG;
    }

    public final C6183d f(TypedArray typedArray, Resources.Theme theme, String attrName, int resId, int defaultValue) {
        C6183d c6183dI = C6190k.i(typedArray, this.xmlParser, theme, attrName, resId, defaultValue);
        l(typedArray.getChangingConfigurations());
        return c6183dI;
    }

    public final float g(TypedArray typedArray, String attrName, int resId, float defaultValue) {
        float fJ = C6190k.j(typedArray, this.xmlParser, attrName, resId, defaultValue);
        l(typedArray.getChangingConfigurations());
        return fJ;
    }

    public final int h(TypedArray typedArray, String attrName, int resId, int defaultValue) {
        int iK = C6190k.k(typedArray, this.xmlParser, attrName, resId, defaultValue);
        l(typedArray.getChangingConfigurations());
        return iK;
    }

    public int hashCode() {
        return (this.xmlParser.hashCode() * 31) + Integer.hashCode(this.config);
    }

    /* renamed from: j, reason: from getter */
    public final XmlPullParser getXmlParser() {
        return this.xmlParser;
    }

    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.xmlParser + ", config=" + this.config + ')';
    }

    public /* synthetic */ AndroidVectorParser(XmlPullParser xmlPullParser, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(xmlPullParser, (i11 & 2) != 0 ? 0 : i10);
    }

    public final float a(TypedArray typedArray, int index, float defValue) {
        float dimension = typedArray.getDimension(index, defValue);
        l(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float b(TypedArray typedArray, int index, float defaultValue) {
        float f10 = typedArray.getFloat(index, defaultValue);
        l(typedArray.getChangingConfigurations());
        return f10;
    }

    public final int c(TypedArray typedArray, int index, int defaultValue) {
        int i10 = typedArray.getInt(index, defaultValue);
        l(typedArray.getChangingConfigurations());
        return i10;
    }

    public final String i(TypedArray typedArray, int index) {
        String string = typedArray.getString(index);
        l(typedArray.getChangingConfigurations());
        return string;
    }

    public final TypedArray k(Resources res, Resources.Theme theme, AttributeSet set, int[] attrs) {
        TypedArray typedArrayQ = C6190k.q(res, theme, set, attrs);
        l(typedArrayQ.getChangingConfigurations());
        return typedArrayQ;
    }
}
