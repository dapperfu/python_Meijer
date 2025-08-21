package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.Xml;
import com.fullstory.FS;
import com.medallia.digital.mobilesdk.q2;
import io.constructor.data.local.PreferencesHelper;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f53367a;

    /* renamed from: b, reason: collision with root package name */
    int f53368b = -1;

    /* renamed from: c, reason: collision with root package name */
    int f53369c = -1;

    /* renamed from: d, reason: collision with root package name */
    private SparseArray<a> f53370d = new SparseArray<>();

    /* renamed from: e, reason: collision with root package name */
    private SparseArray<c> f53371e = new SparseArray<>();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f53372a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList<C1103b> f53373b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        int f53374c;

        /* renamed from: d, reason: collision with root package name */
        c f53375d;

        void a(C1103b c1103b) {
            this.f53373b.add(c1103b);
        }

        public a(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f53374c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), f.f53674d5);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.f53681e5) {
                    this.f53372a = typedArrayObtainStyledAttributes.getResourceId(index, this.f53372a);
                } else if (index == f.f53688f5) {
                    this.f53374c = typedArrayObtainStyledAttributes.getResourceId(index, this.f53374c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f53374c);
                    context.getResources().getResourceName(this.f53374c);
                    if ("layout".equals(resourceTypeName)) {
                        c cVar = new c();
                        this.f53375d = cVar;
                        cVar.f(context, this.f53374c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void c(d dVar) {
    }

    /* renamed from: androidx.constraintlayout.widget.b$b, reason: collision with other inner class name */
    static class C1103b {

        /* renamed from: a, reason: collision with root package name */
        float f53376a;

        /* renamed from: b, reason: collision with root package name */
        float f53377b;

        /* renamed from: c, reason: collision with root package name */
        float f53378c;

        /* renamed from: d, reason: collision with root package name */
        float f53379d;

        /* renamed from: e, reason: collision with root package name */
        int f53380e;

        /* renamed from: f, reason: collision with root package name */
        c f53381f;

        public C1103b(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f53376a = Float.NaN;
            this.f53377b = Float.NaN;
            this.f53378c = Float.NaN;
            this.f53379d = Float.NaN;
            this.f53380e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), f.f53828z5);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.f53489A5) {
                    this.f53380e = typedArrayObtainStyledAttributes.getResourceId(index, this.f53380e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f53380e);
                    context.getResources().getResourceName(this.f53380e);
                    if ("layout".equals(resourceTypeName)) {
                        c cVar = new c();
                        this.f53381f = cVar;
                        cVar.f(context, this.f53380e);
                    }
                } else if (index == f.f53496B5) {
                    this.f53379d = typedArrayObtainStyledAttributes.getDimension(index, this.f53379d);
                } else if (index == f.f53503C5) {
                    this.f53377b = typedArrayObtainStyledAttributes.getDimension(index, this.f53377b);
                } else if (index == f.f53510D5) {
                    this.f53378c = typedArrayObtainStyledAttributes.getDimension(index, this.f53378c);
                } else if (index == f.f53517E5) {
                    this.f53376a = typedArrayObtainStyledAttributes.getDimension(index, this.f53376a);
                } else {
                    FS.log_v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void b(Context context, XmlPullParser xmlPullParser) throws NumberFormatException {
        c cVar = new c();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (PreferencesHelper.PREF_ID.equals(xmlPullParser.getAttributeName(i10))) {
                String attributeValue = xmlPullParser.getAttributeValue(i10);
                int identifier = attributeValue.contains(q2.f93563c) ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), PreferencesHelper.PREF_ID, context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        FS.log_e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                cVar.s(context, xmlPullParser);
                this.f53371e.put(identifier, cVar);
                return;
            }
        }
    }

    b(Context context, ConstraintLayout constraintLayout, int i10) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        this.f53367a = constraintLayout;
        a(context, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(android.content.Context r8, int r9) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException, java.lang.NumberFormatException {
        /*
            r7 = this;
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.XmlResourceParser r9 = r0.getXml(r9)
            int r0 = r9.getEventType()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            r1 = 0
        Ld:
            r2 = 1
            if (r0 == r2) goto Lab
            if (r0 == 0) goto L9b
            r3 = 2
            if (r0 == r3) goto L17
            goto L9e
        L17:
            java.lang.String r0 = r9.getName()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            int r4 = r0.hashCode()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            r5 = 4
            r6 = 3
            switch(r4) {
                case -1349929691: goto L53;
                case 80204913: goto L49;
                case 1382829617: goto L3f;
                case 1657696882: goto L35;
                case 1901439077: goto L25;
                default: goto L24;
            }     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
        L24:
            goto L5d
        L25:
            java.lang.String r4 = "Variant"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            if (r4 == 0) goto L5d
            r4 = r6
            goto L5e
        L2f:
            r8 = move-exception
            goto La4
        L32:
            r8 = move-exception
            goto La8
        L35:
            java.lang.String r4 = "layoutDescription"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            if (r4 == 0) goto L5d
            r4 = 0
            goto L5e
        L3f:
            java.lang.String r4 = "StateSet"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            if (r4 == 0) goto L5d
            r4 = r2
            goto L5e
        L49:
            java.lang.String r4 = "State"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            if (r4 == 0) goto L5d
            r4 = r3
            goto L5e
        L53:
            java.lang.String r4 = "ConstraintSet"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            if (r4 == 0) goto L5d
            r4 = r5
            goto L5e
        L5d:
            r4 = -1
        L5e:
            if (r4 == 0) goto L9e
            if (r4 == r2) goto L9e
            if (r4 == r3) goto L8e
            if (r4 == r6) goto L83
            if (r4 == r5) goto L7f
            java.lang.String r2 = "ConstraintLayoutStates"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            r3.<init>()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            java.lang.String r4 = "unknown tag "
            r3.append(r4)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            r3.append(r0)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            java.lang.String r0 = r3.toString()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            com.fullstory.FS.log_v(r2, r0)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            goto L9e
        L7f:
            r7.b(r8, r9)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            goto L9e
        L83:
            androidx.constraintlayout.widget.b$b r0 = new androidx.constraintlayout.widget.b$b     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            r0.<init>(r8, r9)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            if (r1 == 0) goto L9e
            r1.a(r0)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            goto L9e
        L8e:
            androidx.constraintlayout.widget.b$a r1 = new androidx.constraintlayout.widget.b$a     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            r1.<init>(r8, r9)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            android.util.SparseArray<androidx.constraintlayout.widget.b$a> r0 = r7.f53370d     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            int r2 = r1.f53372a     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            r0.put(r2, r1)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            goto L9e
        L9b:
            r9.getName()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
        L9e:
            int r0 = r9.next()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            goto Ld
        La4:
            r8.printStackTrace()
            goto Lab
        La8:
            r8.printStackTrace()
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.b.a(android.content.Context, int):void");
    }
}
