package b2;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: b2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6184e {

    /* renamed from: b2.e$b */
    public interface b {
    }

    /* renamed from: b2.e$c */
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final d[] f59708a;

        public d[] a() {
            return this.f59708a;
        }

        public c(d[] dVarArr) {
            this.f59708a = dVarArr;
        }
    }

    /* renamed from: b2.e$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f59709a;

        /* renamed from: b, reason: collision with root package name */
        private final int f59710b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f59711c;

        /* renamed from: d, reason: collision with root package name */
        private final String f59712d;

        /* renamed from: e, reason: collision with root package name */
        private final int f59713e;

        /* renamed from: f, reason: collision with root package name */
        private final int f59714f;

        public String a() {
            return this.f59709a;
        }

        public int b() {
            return this.f59714f;
        }

        public int c() {
            return this.f59713e;
        }

        public String d() {
            return this.f59712d;
        }

        public int e() {
            return this.f59710b;
        }

        public boolean f() {
            return this.f59711c;
        }

        public d(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f59709a = str;
            this.f59710b = i10;
            this.f59711c = z10;
            this.f59712d = str2;
            this.f59713e = i11;
            this.f59714f = i12;
        }
    }

    /* renamed from: b2.e$e, reason: collision with other inner class name */
    public static final class C1175e implements b {

        /* renamed from: a, reason: collision with root package name */
        private final k2.e f59715a;

        /* renamed from: b, reason: collision with root package name */
        private final k2.e f59716b;

        /* renamed from: c, reason: collision with root package name */
        private final int f59717c;

        /* renamed from: d, reason: collision with root package name */
        private final int f59718d;

        /* renamed from: e, reason: collision with root package name */
        private final String f59719e;

        public k2.e a() {
            return this.f59716b;
        }

        public int b() {
            return this.f59718d;
        }

        public k2.e c() {
            return this.f59715a;
        }

        public String d() {
            return this.f59719e;
        }

        public int e() {
            return this.f59717c;
        }

        public C1175e(k2.e eVar, k2.e eVar2, int i10, int i11, String str) {
            this.f59715a = eVar;
            this.f59716b = eVar2;
            this.f59718d = i10;
            this.f59717c = i11;
            this.f59719e = str;
        }
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    /* renamed from: b2.e$a */
    static class a {
        static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    public static List<List<byte[]>> c(Resources resources, int i10) throws Resources.NotFoundException {
        if (i10 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < typedArrayObtainTypedArray.length(); i11++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, Resources.NotFoundException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), Y1.g.f40048h);
        String string = typedArrayObtainAttributes.getString(Y1.g.f40049i);
        String string2 = typedArrayObtainAttributes.getString(Y1.g.f40054n);
        String string3 = typedArrayObtainAttributes.getString(Y1.g.f40055o);
        String string4 = typedArrayObtainAttributes.getString(Y1.g.f40051k);
        int resourceId = typedArrayObtainAttributes.getResourceId(Y1.g.f40050j, 0);
        int integer = typedArrayObtainAttributes.getInteger(Y1.g.f40052l, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(Y1.g.f40053m, HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR);
        String string5 = typedArrayObtainAttributes.getString(Y1.g.f40056p);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            List<List<byte[]>> listC = c(resources, resourceId);
            return new C1175e(new k2.e(string, string2, string3, listC), string4 != null ? new k2.e(string, string2, string4, listC) : null, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    private static int a(TypedArray typedArray, int i10) {
        return a.a(typedArray, i10);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    private static d f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), Y1.g.f40057q);
        if (typedArrayObtainAttributes.hasValue(Y1.g.f40066z)) {
            i10 = Y1.g.f40066z;
        } else {
            i10 = Y1.g.f40059s;
        }
        int i15 = typedArrayObtainAttributes.getInt(i10, HttpResponseStatus.ERROR_BAD_REQUEST);
        if (typedArrayObtainAttributes.hasValue(Y1.g.f40064x)) {
            i11 = Y1.g.f40064x;
        } else {
            i11 = Y1.g.f40060t;
        }
        if (1 == typedArrayObtainAttributes.getInt(i11, 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (typedArrayObtainAttributes.hasValue(Y1.g.f40024A)) {
            i12 = Y1.g.f40024A;
        } else {
            i12 = Y1.g.f40061u;
        }
        if (typedArrayObtainAttributes.hasValue(Y1.g.f40065y)) {
            i13 = Y1.g.f40065y;
        } else {
            i13 = Y1.g.f40062v;
        }
        String string = typedArrayObtainAttributes.getString(i13);
        int i16 = typedArrayObtainAttributes.getInt(i12, 0);
        if (typedArrayObtainAttributes.hasValue(Y1.g.f40063w)) {
            i14 = Y1.g.f40063w;
        } else {
            i14 = Y1.g.f40058r;
        }
        int resourceId = typedArrayObtainAttributes.getResourceId(i14, 0);
        String string2 = typedArrayObtainAttributes.getString(i14);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i15, z10, string, i16, resourceId);
    }
}
