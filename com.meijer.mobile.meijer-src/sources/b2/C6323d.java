package b2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import com.fullstory.FS;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: b2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6323d {

    /* renamed from: a, reason: collision with root package name */
    private final Shader f59912a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f59913b;

    /* renamed from: c, reason: collision with root package name */
    private int f59914c;

    static C6323d b(int i10) {
        return new C6323d(null, null, i10);
    }

    static C6323d c(ColorStateList colorStateList) {
        return new C6323d(null, colorStateList, colorStateList.getDefaultColor());
    }

    static C6323d d(Shader shader) {
        return new C6323d(shader, null, 0);
    }

    public int e() {
        return this.f59914c;
    }

    public Shader f() {
        return this.f59912a;
    }

    public boolean h() {
        return this.f59912a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.f59912a == null && (colorStateList = this.f59913b) != null && colorStateList.isStateful();
    }

    public void k(int i10) {
        this.f59914c = i10;
    }

    private C6323d(Shader shader, ColorStateList colorStateList, int i10) {
        this.f59912a = shader;
        this.f59913b = colorStateList;
        this.f59914c = i10;
    }

    private static C6323d a(Resources resources, int i10, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i10);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.getClass();
            if (!name.equals("gradient")) {
                if (name.equals("selector")) {
                    return c(C6322c.b(resources, xml, attributeSetAsAttributeSet, theme));
                }
                throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
            }
            return d(C6325f.b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static C6323d g(Resources resources, int i10, Resources.Theme theme) {
        try {
            return a(resources, i10, theme);
        } catch (Exception e10) {
            FS.log_e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
            return null;
        }
    }

    public boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = this.f59913b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f59914c) {
                this.f59914c = colorForState;
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean l() {
        if (!h() && this.f59914c == 0) {
            return false;
        }
        return true;
    }
}
