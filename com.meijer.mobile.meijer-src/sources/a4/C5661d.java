package a4;

import De.C3106c;
import U3.i;
import U3.k;
import U3.r;
import android.text.Layout;
import androidx.media3.extractor.text.SubtitleDecoderException;
import d3.C13599a;
import d3.InterfaceC13610l;
import d3.P;
import d3.Q;
import io.constructor.data.local.PreferencesHelper;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: a4.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5661d implements r {

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f45104b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f45105c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f45106d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: e, reason: collision with root package name */
    static final Pattern f45107e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: f, reason: collision with root package name */
    static final Pattern f45108f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f45109g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f45110h = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: i, reason: collision with root package name */
    private static final a f45111i = new a(30.0f, 1, 1);

    /* renamed from: a, reason: collision with root package name */
    private final XmlPullParserFactory f45112a;

    @Override // U3.r
    public int c() {
        return 1;
    }

    /* renamed from: a4.d$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final float f45113a;

        /* renamed from: b, reason: collision with root package name */
        final int f45114b;

        /* renamed from: c, reason: collision with root package name */
        final int f45115c;

        a(float f10, int i10, int i11) {
            this.f45113a = f10;
            this.f45114b = i10;
            this.f45115c = i11;
        }
    }

    /* renamed from: a4.d$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f45116a;

        /* renamed from: b, reason: collision with root package name */
        final int f45117b;

        b(int i10, int i11) {
            this.f45116a = i10;
            this.f45117b = i11;
        }
    }

    private static g d(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    private static boolean e(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    private static int g(XmlPullParser xmlPullParser, int i10) throws NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return i10;
        }
        Matcher matcher = f45110h.matcher(attributeValue);
        if (!matcher.matches()) {
            d3.r.i("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i10;
        }
        boolean z10 = true;
        try {
            int i11 = Integer.parseInt((String) C13599a.e(matcher.group(1)));
            int i12 = Integer.parseInt((String) C13599a.e(matcher.group(2)));
            if (i11 == 0 || i12 == 0) {
                z10 = false;
            }
            C13599a.b(z10, "Invalid cell resolution " + i11 + " " + i12);
            return i12;
        } catch (NumberFormatException unused) {
            d3.r.i("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i10;
        }
    }

    private static void h(String str, g gVar) throws SubtitleDecoderException {
        Matcher matcher;
        String str2;
        String[] strArrC1 = P.c1(str, "\\s+");
        if (strArrC1.length == 1) {
            matcher = f45106d.matcher(str);
        } else {
            if (strArrC1.length != 2) {
                throw new SubtitleDecoderException("Invalid number of entries for fontSize: " + strArrC1.length + ".");
            }
            matcher = f45106d.matcher(strArrC1[1]);
            d3.r.i("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException("Invalid expression for fontSize: '" + str + "'.");
        }
        str2 = (String) C13599a.e(matcher.group(3));
        str2.getClass();
        switch (str2) {
            case "%":
                gVar.C(3);
                break;
            case "em":
                gVar.C(2);
                break;
            case "px":
                gVar.C(1);
                break;
            default:
                throw new SubtitleDecoderException("Invalid unit for fontSize: '" + str2 + "'.");
        }
        gVar.B(Float.parseFloat((String) C13599a.e(matcher.group(1))));
    }

    private static a i(XmlPullParser xmlPullParser) throws NumberFormatException {
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            C13599a.b(P.c1(attributeValue2, " ").length == 2, "frameRateMultiplier doesn't have 2 parts");
            f10 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f10 = 1.0f;
        }
        a aVar = f45111i;
        int i11 = aVar.f45114b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = aVar.f45115c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new a(i10 * f10, i11, i12);
    }

    private static C5660c l(XmlPullParser xmlPullParser, C5660c c5660c, Map<String, e> map, a aVar) throws SubtitleDecoderException, NumberFormatException {
        String attributeValue;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int attributeCount = xmlPullParser2.getAttributeCount();
        String strSubstring = null;
        g gVarO = o(xmlPullParser2, null);
        long jQ = -9223372036854775807L;
        long jQ2 = -9223372036854775807L;
        long jQ3 = -9223372036854775807L;
        String[] strArr = null;
        String str = "";
        int i10 = 0;
        while (i10 < attributeCount) {
            String attributeName = xmlPullParser2.getAttributeName(i10);
            int i11 = attributeCount;
            attributeValue = xmlPullParser2.getAttributeValue(i10);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    i10++;
                    xmlPullParser2 = xmlPullParser;
                    attributeCount = i11;
                case "dur":
                    jQ3 = q(attributeValue, aVar);
                    break;
                case "end":
                    jQ2 = q(attributeValue, aVar);
                    break;
                case "begin":
                    jQ = q(attributeValue, aVar);
                    break;
                case "style":
                    String[] strArrP = p(attributeValue);
                    if (strArrP.length > 0) {
                        strArr = strArrP;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
            i10++;
            xmlPullParser2 = xmlPullParser;
            attributeCount = i11;
        }
        if (c5660c != null) {
            long j10 = c5660c.f45094d;
            if (j10 != -9223372036854775807L) {
                if (jQ != -9223372036854775807L) {
                    jQ += j10;
                }
                if (jQ2 != -9223372036854775807L) {
                    jQ2 += j10;
                }
            }
        }
        long j11 = jQ;
        if (jQ2 == -9223372036854775807L) {
            if (jQ3 != -9223372036854775807L) {
                jQ2 = j11 + jQ3;
            } else if (c5660c != null) {
                long j12 = c5660c.f45095e;
                if (j12 != -9223372036854775807L) {
                    jQ2 = j12;
                }
            }
        }
        return C5660c.c(xmlPullParser.getName(), j11, jQ2, gVarO, strArr, str, strSubstring, c5660c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x023d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static a4.e m(org.xmlpull.v1.XmlPullParser r17, int r18, a4.C5661d.b r19, java.util.Map<java.lang.String, a4.g> r20) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.C5661d.m(org.xmlpull.v1.XmlPullParser, int, a4.d$b, java.util.Map):a4.e");
    }

    private static float n(String str) {
        Matcher matcher = f45107e.matcher(str);
        if (!matcher.matches()) {
            d3.r.i("TtmlParser", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) C13599a.e(matcher.group(1)))));
        } catch (NumberFormatException e10) {
            d3.r.j("TtmlParser", "Failed to parse shear: " + str, e10);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long q(java.lang.String r13, a4.C5661d.a r14) throws androidx.media3.extractor.text.SubtitleDecoderException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.C5661d.q(java.lang.String, a4.d$a):long");
    }

    private static b r(XmlPullParser xmlPullParser) {
        String strA = Q.a(xmlPullParser, "extent");
        if (strA == null) {
            return null;
        }
        Matcher matcher = f45109g.matcher(strA);
        if (!matcher.matches()) {
            d3.r.i("TtmlParser", "Ignoring non-pixel tts extent: " + strA);
            return null;
        }
        try {
            return new b(Integer.parseInt((String) C13599a.e(matcher.group(1))), Integer.parseInt((String) C13599a.e(matcher.group(2))));
        } catch (NumberFormatException unused) {
            d3.r.i("TtmlParser", "Ignoring malformed tts extent: " + strA);
            return null;
        }
    }

    @Override // U3.r
    public k b(byte[] bArr, int i10, int i11) throws XmlPullParserException, NumberFormatException, IOException {
        char c10;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f45112a.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new e(""));
            h hVar = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i10, i11), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int i12 = 0;
            int iG = 15;
            a aVarI = f45111i;
            b bVarR = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                C5660c c5660c = (C5660c) arrayDeque.peek();
                if (i12 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            aVarI = i(xmlPullParserNewPullParser);
                            c10 = 15;
                            iG = g(xmlPullParserNewPullParser, 15);
                            bVarR = r(xmlPullParserNewPullParser);
                        } else {
                            c10 = 15;
                        }
                        a aVar = aVarI;
                        b bVar = bVarR;
                        int i13 = iG;
                        if (e(name)) {
                            if ("head".equals(name)) {
                                j(xmlPullParserNewPullParser, map, i13, bVar, map2, map3);
                            } else {
                                try {
                                    C5660c c5660cL = l(xmlPullParserNewPullParser, c5660c, map2, aVar);
                                    arrayDeque.push(c5660cL);
                                    if (c5660c != null) {
                                        c5660c.a(c5660cL);
                                    }
                                } catch (SubtitleDecoderException e10) {
                                    d3.r.j("TtmlParser", "Suppressing parser error", e10);
                                }
                            }
                            iG = i13;
                            bVarR = bVar;
                            aVarI = aVar;
                        } else {
                            d3.r.g("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        i12++;
                        iG = i13;
                        bVarR = bVar;
                        aVarI = aVar;
                    } else {
                        c10 = 15;
                        if (eventType == 4) {
                            ((C5660c) C13599a.e(c5660c)).a(C5660c.d(xmlPullParserNewPullParser.getText()));
                        } else if (eventType == 3) {
                            if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                hVar = new h((C5660c) C13599a.e((C5660c) arrayDeque.peek()), map, map2, map3);
                            }
                            arrayDeque.pop();
                        }
                    }
                } else if (eventType == 2) {
                    i12++;
                } else if (eventType == 3) {
                    i12--;
                }
                xmlPullParserNewPullParser.next();
            }
            return (k) C13599a.e(hVar);
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new IllegalStateException("Unable to decode source", e12);
        }
    }

    public C5661d() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f45112a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    private static Layout.Alignment f(String str) {
        String strE = C3106c.e(str);
        strE.getClass();
        switch (strE) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    private static Map<String, g> j(XmlPullParser xmlPullParser, Map<String, g> map, int i10, b bVar, Map<String, e> map2, Map<String, String> map3) throws XmlPullParserException, IOException, NumberFormatException {
        do {
            xmlPullParser.next();
            if (Q.e(xmlPullParser, "style")) {
                String strA = Q.a(xmlPullParser, "style");
                g gVarO = o(xmlPullParser, new g());
                if (strA != null) {
                    for (String str : p(strA)) {
                        gVarO.a(map.get(str));
                    }
                }
                String strH = gVarO.h();
                if (strH != null) {
                    map.put(strH, gVarO);
                }
            } else if (Q.e(xmlPullParser, "region")) {
                e eVarM = m(xmlPullParser, i10, bVar, map);
                if (eVarM != null) {
                    map2.put(eVarM.f45118a, eVarM);
                }
            } else if (Q.e(xmlPullParser, "metadata")) {
                k(xmlPullParser, map3);
            }
        } while (!Q.c(xmlPullParser, "head"));
        return map;
    }

    private static void k(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        String strA;
        do {
            xmlPullParser.next();
            if (Q.e(xmlPullParser, "image") && (strA = Q.a(xmlPullParser, PreferencesHelper.PREF_ID)) != null) {
                map.put(strA, xmlPullParser.nextText());
            }
        } while (!Q.c(xmlPullParser, "metadata"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static a4.g o(org.xmlpull.v1.XmlPullParser r12, a4.g r13) {
        /*
            Method dump skipped, instructions count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.C5661d.o(org.xmlpull.v1.XmlPullParser, a4.g):a4.g");
    }

    private static String[] p(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new String[0];
        }
        return P.c1(strTrim, "\\s+");
    }

    @Override // U3.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, InterfaceC13610l<U3.e> interfaceC13610l) {
        i.c(b(bArr, i10, i11), bVar, interfaceC13610l);
    }
}
