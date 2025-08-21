package com.squareup.moshi;

import gw.C14416e;
import gw.C14419h;
import gw.InterfaceC14418g;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes12.dex */
public abstract class k implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    int f127299a;

    /* renamed from: b, reason: collision with root package name */
    int[] f127300b;

    /* renamed from: c, reason: collision with root package name */
    String[] f127301c;

    /* renamed from: d, reason: collision with root package name */
    int[] f127302d;

    /* renamed from: e, reason: collision with root package name */
    boolean f127303e;

    /* renamed from: f, reason: collision with root package name */
    boolean f127304f;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final String[] f127306a;

        /* renamed from: b, reason: collision with root package name */
        final gw.z f127307b;

        public static b a(String... strArr) {
            try {
                C14419h[] c14419hArr = new C14419h[strArr.length];
                C14416e c14416e = new C14416e();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    n.k0(c14416e, strArr[i10]);
                    c14416e.readByte();
                    c14419hArr[i10] = c14416e.P2();
                }
                return new b((String[]) strArr.clone(), gw.z.s(c14419hArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        public List<String> b() {
            return Collections.unmodifiableList(Arrays.asList(this.f127306a));
        }

        private b(String[] strArr, gw.z zVar) {
            this.f127306a = strArr;
            this.f127307b = zVar;
        }
    }

    public enum c {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    k() {
        this.f127300b = new int[32];
        this.f127301c = new String[32];
        this.f127302d = new int[32];
    }

    public abstract int A(b bVar) throws IOException;

    public abstract void H() throws IOException;

    public abstract void a() throws IOException;

    public abstract void b() throws IOException;

    public abstract void c() throws IOException;

    public abstract void d() throws IOException;

    public abstract boolean hasNext() throws IOException;

    public abstract <T> T i() throws IOException;

    public abstract c l() throws IOException;

    public abstract k m();

    public abstract boolean nextBoolean() throws IOException;

    public abstract double nextDouble() throws IOException;

    public abstract int nextInt() throws IOException;

    public abstract long nextLong() throws IOException;

    public abstract String nextName() throws IOException;

    public abstract String nextString() throws IOException;

    public abstract void p() throws IOException;

    public abstract void skipValue() throws IOException;

    public abstract int z(b bVar) throws IOException;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f127305a;

        static {
            int[] iArr = new int[c.values().length];
            f127305a = iArr;
            try {
                iArr[c.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f127305a[c.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f127305a[c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f127305a[c.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f127305a[c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f127305a[c.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static k j(InterfaceC14418g interfaceC14418g) {
        return new m(interfaceC14418g);
    }

    public final void B(boolean z10) {
        this.f127304f = z10;
    }

    public final void D(boolean z10) {
        this.f127303e = z10;
    }

    final JsonEncodingException J(String str) throws JsonEncodingException {
        throw new JsonEncodingException(str + " at path " + getPath());
    }

    final JsonDataException K(Object obj, Object obj2) {
        if (obj == null) {
            return new JsonDataException("Expected " + obj2 + " but was null at path " + getPath());
        }
        return new JsonDataException("Expected " + obj2 + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + getPath());
    }

    public final boolean g() {
        return this.f127304f;
    }

    public final String getPath() {
        return l.a(this.f127299a, this.f127300b, this.f127301c, this.f127302d);
    }

    public final boolean h() {
        return this.f127303e;
    }

    final void u(int i10) {
        int i11 = this.f127299a;
        int[] iArr = this.f127300b;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new JsonDataException("Nesting too deep at " + getPath());
            }
            this.f127300b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f127301c;
            this.f127301c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f127302d;
            this.f127302d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f127300b;
        int i12 = this.f127299a;
        this.f127299a = i12 + 1;
        iArr3[i12] = i10;
    }

    public final Object w() throws IOException {
        switch (a.f127305a[l().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                a();
                while (hasNext()) {
                    arrayList.add(w());
                }
                c();
                return arrayList;
            case 2:
                r rVar = new r();
                b();
                while (hasNext()) {
                    String strNextName = nextName();
                    Object objW = w();
                    Object objPut = rVar.put(strNextName, objW);
                    if (objPut != null) {
                        throw new JsonDataException("Map key '" + strNextName + "' has multiple values at path " + getPath() + ": " + objPut + " and " + objW);
                    }
                }
                d();
                return rVar;
            case 3:
                return nextString();
            case 4:
                return Double.valueOf(nextDouble());
            case 5:
                return Boolean.valueOf(nextBoolean());
            case 6:
                return i();
            default:
                throw new IllegalStateException("Expected a value but was " + l() + " at path " + getPath());
        }
    }

    k(k kVar) {
        this.f127299a = kVar.f127299a;
        this.f127300b = (int[]) kVar.f127300b.clone();
        this.f127301c = (String[]) kVar.f127301c.clone();
        this.f127302d = (int[]) kVar.f127302d.clone();
        this.f127303e = kVar.f127303e;
        this.f127304f = kVar.f127304f;
    }
}
