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
public class C6324e {

    /* renamed from: b2.e$b */
    public interface b {
    }

    /* renamed from: b2.e$c */
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final d[] f59915a;

        public d[] a() {
            return this.f59915a;
        }

        public c(d[] dVarArr) {
            this.f59915a = dVarArr;
        }
    }

    /* renamed from: b2.e$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f59916a;

        /* renamed from: b, reason: collision with root package name */
        private final int f59917b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f59918c;

        /* renamed from: d, reason: collision with root package name */
        private final String f59919d;

        /* renamed from: e, reason: collision with root package name */
        private final int f59920e;

        /* renamed from: f, reason: collision with root package name */
        private final int f59921f;

        public String a() {
            return this.f59916a;
        }

        public int b() {
            return this.f59921f;
        }

        public int c() {
            return this.f59920e;
        }

        public String d() {
            return this.f59919d;
        }

        public int e() {
            return this.f59917b;
        }

        public boolean f() {
            return this.f59918c;
        }

        public d(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f59916a = str;
            this.f59917b = i10;
            this.f59918c = z10;
            this.f59919d = str2;
            this.f59920e = i11;
            this.f59921f = i12;
        }
    }

    /* renamed from: b2.e$e, reason: collision with other inner class name */
    public static final class C1188e implements b {

        /* renamed from: a, reason: collision with root package name */
        private final k2.e f59922a;

        /* renamed from: b, reason: collision with root package name */
        private final k2.e f59923b;

        /* renamed from: c, reason: collision with root package name */
        private final int f59924c;

        /* renamed from: d, reason: collision with root package name */
        private final int f59925d;

        /* renamed from: e, reason: collision with root package name */
        private final String f59926e;

        public k2.e a() {
            return this.f59923b;
        }

        public int b() {
            return this.f59925d;
        }

        public k2.e c() {
            return this.f59922a;
        }

        public String d() {
            return this.f59926e;
        }

        public int e() {
            return this.f59924c;
        }

        public C1188e(k2.e eVar, k2.e eVar2, int i10, int i11, String str) {
            this.f59922a = eVar;
            this.f59923b = eVar2;
            this.f59925d = i10;
            this.f59924c = i11;
            this.f59926e = str;
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
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), Y1.g.f42861h);
        String string = typedArrayObtainAttributes.getString(Y1.g.f42862i);
        String string2 = typedArrayObtainAttributes.getString(Y1.g.f42867n);
        String string3 = typedArrayObtainAttributes.getString(Y1.g.f42868o);
        String string4 = typedArrayObtainAttributes.getString(Y1.g.f42864k);
        int resourceId = typedArrayObtainAttributes.getResourceId(Y1.g.f42863j, 0);
        int integer = typedArrayObtainAttributes.getInteger(Y1.g.f42865l, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(Y1.g.f42866m, HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR);
        String string5 = typedArrayObtainAttributes.getString(Y1.g.f42869p);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            List<List<byte[]>> listC = c(resources, resourceId);
            return new C1188e(new k2.e(string, string2, string3, listC), string4 != null ? new k2.e(string, string2, string4, listC) : null, integer, integer2, string5);
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
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), Y1.g.f42870q);
        if (typedArrayObtainAttributes.hasValue(Y1.g.f42879z)) {
            i10 = Y1.g.f42879z;
        } else {
            i10 = Y1.g.f42872s;
        }
        int i15 = typedArrayObtainAttributes.getInt(i10, HttpResponseStatus.ERROR_BAD_REQUEST);
        if (typedArrayObtainAttributes.hasValue(Y1.g.f42877x)) {
            i11 = Y1.g.f42877x;
        } else {
            i11 = Y1.g.f42873t;
        }
        if (1 == typedArrayObtainAttributes.getInt(i11, 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (typedArrayObtainAttributes.hasValue(Y1.g.f42837A)) {
            i12 = Y1.g.f42837A;
        } else {
            i12 = Y1.g.f42874u;
        }
        if (typedArrayObtainAttributes.hasValue(Y1.g.f42878y)) {
            i13 = Y1.g.f42878y;
        } else {
            i13 = Y1.g.f42875v;
        }
        String string = typedArrayObtainAttributes.getString(i13);
        int i16 = typedArrayObtainAttributes.getInt(i12, 0);
        if (typedArrayObtainAttributes.hasValue(Y1.g.f42876w)) {
            i14 = Y1.g.f42876w;
        } else {
            i14 = Y1.g.f42871r;
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
