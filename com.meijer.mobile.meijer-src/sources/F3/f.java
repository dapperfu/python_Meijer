package F3;

import Ee.L;
import F3.c;
import androidx.media3.common.ParserException;
import d3.Q;
import d3.r;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f9024a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f9025b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f9026c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    private static L<c.a> c(XmlPullParser xmlPullParser) throws NumberFormatException {
        for (String str : f9026c) {
            String strA = Q.a(xmlPullParser, str);
            if (strA != null) {
                return L.z(new c.a("image/jpeg", "Primary", 0L, 0L), new c.a("video/mp4", "MotionPhoto", Long.parseLong(strA), 0L));
            }
        }
        return L.x();
    }

    private static boolean d(XmlPullParser xmlPullParser) {
        for (String str : f9024a) {
            String strA = Q.a(xmlPullParser, str);
            if (strA != null) {
                return Integer.parseInt(strA) == 1;
            }
        }
        return false;
    }

    private static long e(XmlPullParser xmlPullParser) throws NumberFormatException {
        for (String str : f9025b) {
            String strA = Q.a(xmlPullParser, str);
            if (strA != null) {
                long j10 = Long.parseLong(strA);
                if (j10 == -1) {
                    return -9223372036854775807L;
                }
                return j10;
            }
        }
        return -9223372036854775807L;
    }

    public static c a(String str) throws IOException {
        try {
            return b(str);
        } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
            r.i("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static c b(String str) throws XmlPullParserException, IOException, NumberFormatException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (Q.e(xmlPullParserNewPullParser, "x:xmpmeta")) {
            L<c.a> lX = L.x();
            long jE = -9223372036854775807L;
            do {
                xmlPullParserNewPullParser.next();
                if (Q.e(xmlPullParserNewPullParser, "rdf:Description")) {
                    if (!d(xmlPullParserNewPullParser)) {
                        return null;
                    }
                    jE = e(xmlPullParserNewPullParser);
                    lX = c(xmlPullParserNewPullParser);
                } else if (Q.e(xmlPullParserNewPullParser, "Container:Directory")) {
                    lX = f(xmlPullParserNewPullParser, "Container", "Item");
                } else if (Q.e(xmlPullParserNewPullParser, "GContainer:Directory")) {
                    lX = f(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
                }
            } while (!Q.c(xmlPullParserNewPullParser, "x:xmpmeta"));
            if (lX.isEmpty()) {
                return null;
            }
            return new c(jE, lX);
        }
        throw ParserException.a("Couldn't find xmp metadata", null);
    }

    private static L<c.a> f(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException, NumberFormatException {
        long j10;
        L.a aVarP = L.p();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (Q.e(xmlPullParser, str3)) {
                String strA = Q.a(xmlPullParser, str2 + ":Mime");
                String strA2 = Q.a(xmlPullParser, str2 + ":Semantic");
                String strA3 = Q.a(xmlPullParser, str2 + ":Length");
                String strA4 = Q.a(xmlPullParser, str2 + ":Padding");
                if (strA != null && strA2 != null) {
                    long j11 = 0;
                    if (strA3 != null) {
                        j10 = Long.parseLong(strA3);
                    } else {
                        j10 = 0;
                    }
                    if (strA4 != null) {
                        j11 = Long.parseLong(strA4);
                    }
                    aVarP.a(new c.a(strA, strA2, j10, j11));
                } else {
                    return L.x();
                }
            }
        } while (!Q.c(xmlPullParser, str4));
        return aVarP.k();
    }
}
