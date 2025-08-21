package Ta;

import android.text.TextUtils;
import com.flipp.sfml.views.CollapsibleLinearLayout;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: Ta.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5327a extends r {

    /* renamed from: l, reason: collision with root package name */
    private String f35968l;

    /* renamed from: m, reason: collision with root package name */
    private String f35969m;

    /* renamed from: n, reason: collision with root package name */
    private CollapsibleLinearLayout.d f35970n;

    /* renamed from: o, reason: collision with root package name */
    private int f35971o;

    /* renamed from: p, reason: collision with root package name */
    private String f35972p;

    public C5327a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this(xmlPullParser, "collapsible-layout");
    }

    public C5327a(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        super(xmlPullParser, str);
    }

    private void u(XmlPullParser xmlPullParser) {
        this.f35971o = ((Sa.f) Sa.c.c(Sa.f.class)).a(a(xmlPullParser, BarcodePickDeserializer.FIELD_ICON), -1);
        this.f35972p = a(xmlPullParser, "icon-url");
    }

    private void x(XmlPullParser xmlPullParser) {
        CollapsibleLinearLayout.d dVarA = CollapsibleLinearLayout.d.a(a(xmlPullParser, "collapse-type"));
        this.f35970n = dVarA;
        if (dVarA == null) {
            this.f35970n = CollapsibleLinearLayout.d.EXPOSE;
        }
    }

    private void y(XmlPullParser xmlPullParser) {
        String strA = a(xmlPullParser, "title");
        this.f35968l = strA;
        if (TextUtils.isEmpty(strA)) {
            throw new IllegalArgumentException("collapsible layout must have a title");
        }
        this.f35969m = a(xmlPullParser, "exposed-title");
    }

    public String A() {
        return this.f35969m;
    }

    public int B() {
        return this.f35971o;
    }

    public String C() {
        return this.f35972p;
    }

    public String D() {
        return this.f35968l;
    }

    public CollapsibleLinearLayout.d z() {
        return this.f35970n;
    }

    @Override // Ta.l, com.flipp.sfml.SFTag
    protected void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, NumberFormatException {
        super.b(xmlPullParser);
        y(xmlPullParser);
        x(xmlPullParser);
        u(xmlPullParser);
        if (p() != -3) {
            if (m() == -2) {
                return;
            } else {
                throw new IllegalArgumentException("height must be wrap content");
            }
        }
        throw new IllegalArgumentException("Width can not be preserve aspect or that will restrict the height");
    }
}
