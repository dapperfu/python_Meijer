package com.flipp.sfml;

import android.graphics.RectF;
import android.text.TextUtils;
import io.constructor.data.local.PreferencesHelper;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public class SFTag {

    /* renamed from: a, reason: collision with root package name */
    private boolean f65047a;

    /* renamed from: b, reason: collision with root package name */
    private String f65048b;

    protected String a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue(null, str);
    }

    protected void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f65047a = true;
    }

    protected void c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f65047a = true;
    }

    public static final class SuperNotCalledException extends RuntimeException {
        public SuperNotCalledException(String str) {
            super(str);
        }
    }

    public SFTag(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, "http://schemas.flipp.com/sfml/0.1", str);
        this.f65048b = a(xmlPullParser, PreferencesHelper.PREF_ID);
        this.f65047a = false;
        b(xmlPullParser);
        if (this.f65047a) {
            this.f65047a = false;
            c(xmlPullParser);
            if (this.f65047a) {
                return;
            } else {
                throw new SuperNotCalledException("All extensions of SFTag must call the super.parseChildren()");
            }
        }
        throw new SuperNotCalledException("All extensions of SFTag must call the super.parseAttribute()");
    }

    protected RectF d(XmlPullParser xmlPullParser, String str, boolean z10) throws NumberFormatException {
        String strA = a(xmlPullParser, str);
        if (TextUtils.isEmpty(strA)) {
            if (!z10) {
                return null;
            }
            throw new IllegalArgumentException(str + " is empty");
        }
        String[] strArrSplit = strA.split(" ");
        if (strArrSplit.length == 4) {
            return new RectF(Float.parseFloat(strArrSplit[0]), Float.parseFloat(strArrSplit[1]), Float.parseFloat(strArrSplit[2]), Float.parseFloat(strArrSplit[3]));
        }
        throw new IllegalArgumentException(str + " has the wrong format. It should consist of space separated numbers [" + strA + "]");
    }

    protected String e(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.next() == 4) {
            String text = xmlPullParser.getText();
            xmlPullParser.nextTag();
            return text;
        }
        return "";
    }

    public void f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() == 2) {
            int i10 = 1;
            while (i10 != 0) {
                int next = xmlPullParser.next();
                if (next != 2) {
                    if (next == 3) {
                        i10--;
                    }
                } else {
                    i10++;
                }
            }
            return;
        }
        throw new IllegalStateException();
    }
}
