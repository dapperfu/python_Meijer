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
public final class C6183d {

    /* renamed from: a, reason: collision with root package name */
    private final Shader f59705a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f59706b;

    /* renamed from: c, reason: collision with root package name */
    private int f59707c;

    static C6183d b(int i10) {
        return new C6183d(null, null, i10);
    }

    static C6183d c(ColorStateList colorStateList) {
        return new C6183d(null, colorStateList, colorStateList.getDefaultColor());
    }

    static C6183d d(Shader shader) {
        return new C6183d(shader, null, 0);
    }

    public int e() {
        return this.f59707c;
    }

    public Shader f() {
        return this.f59705a;
    }

    public boolean h() {
        return this.f59705a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.f59705a == null && (colorStateList = this.f59706b) != null && colorStateList.isStateful();
    }

    public void k(int i10) {
        this.f59707c = i10;
    }

    private C6183d(Shader shader, ColorStateList colorStateList, int i10) {
        this.f59705a = shader;
        this.f59706b = colorStateList;
        this.f59707c = i10;
    }

    private static C6183d a(Resources resources, int i10, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
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
                    return c(C6182c.b(resources, xml, attributeSetAsAttributeSet, theme));
                }
                throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
            }
            return d(C6185f.b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static C6183d g(Resources resources, int i10, Resources.Theme theme) {
        try {
            return a(resources, i10, theme);
        } catch (Exception e10) {
            FS.log_e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
            return null;
        }
    }

    public boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = this.f59706b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f59707c) {
                this.f59707c = colorForState;
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean l() {
        if (!h() && this.f59707c == 0) {
            return false;
        }
        return true;
    }
}
