package Ta;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private long f35973a;

    /* renamed from: b, reason: collision with root package name */
    private c f35974b;

    /* renamed from: c, reason: collision with root package name */
    private long f35975c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, String> f35976d;

    public b(long j10, c cVar, long j11, Map<String, String> map) {
        this.f35973a = j10;
        this.f35974b = cVar;
        this.f35975c = j11;
        if (map == null) {
            this.f35976d = new HashMap();
        } else {
            this.f35976d = map;
        }
    }

    private long a(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "item-id");
        if (TextUtils.isEmpty(attributeValue)) {
            throw new IllegalArgumentException("item-id is empty");
        }
        return Long.parseLong(attributeValue);
    }

    private c b(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "item-source");
        c cVarA = c.a(attributeValue);
        if (cVarA != null) {
            return cVarA;
        }
        throw new IllegalArgumentException("item-source is invalid: [" + attributeValue + "] resulted in enum of " + cVarA);
    }

    private long c(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "target-anchor-id");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1L;
        }
        return Long.parseLong(attributeValue);
    }

    private Map<String, String> d(XmlPullParser xmlPullParser) {
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            if (attributeName.startsWith("payload-")) {
                map.put(attributeName.substring(8), xmlPullParser.getAttributeValue(i10));
            }
        }
        return map;
    }

    public long e() {
        return this.f35973a;
    }

    public b(XmlPullParser xmlPullParser) {
        this.f35975c = -1L;
        this.f35973a = a(xmlPullParser);
        this.f35974b = b(xmlPullParser);
        this.f35975c = c(xmlPullParser);
        this.f35976d = d(xmlPullParser);
    }
}
