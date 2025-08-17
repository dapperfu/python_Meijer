package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes6.dex */
final class M1 {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f68481a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f68482b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f68483c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        r7 = -9223372036854775807L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.I1 a(java.lang.String r22) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.M1.a(java.lang.String):com.google.android.gms.internal.ads.I1");
    }

    private static AbstractC7917eh0 b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        C7598bh0 c7598bh0 = new C7598bh0();
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (C9073pW.c(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strA = C9073pW.a(xmlPullParser, strConcat2);
                String strA2 = C9073pW.a(xmlPullParser, strConcat3);
                String strA3 = C9073pW.a(xmlPullParser, strConcat4);
                String strA4 = C9073pW.a(xmlPullParser, strConcat5);
                if (strA == null || strA2 == null) {
                    return AbstractC7917eh0.t();
                }
                c7598bh0.g(new H1(strA, strA2, strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L));
            }
        } while (!C9073pW.b(xmlPullParser, str.concat(":Directory")));
        return c7598bh0.j();
    }
}
