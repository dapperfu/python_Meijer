package com.squareup.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kw.C15328e;
import kw.C15331h;
import kw.InterfaceC15330g;

/* loaded from: classes11.dex */
public abstract class k implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    int f126347a;

    /* renamed from: b, reason: collision with root package name */
    int[] f126348b;

    /* renamed from: c, reason: collision with root package name */
    String[] f126349c;

    /* renamed from: d, reason: collision with root package name */
    int[] f126350d;

    /* renamed from: e, reason: collision with root package name */
    boolean f126351e;

    /* renamed from: f, reason: collision with root package name */
    boolean f126352f;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final String[] f126354a;

        /* renamed from: b, reason: collision with root package name */
        final kw.z f126355b;

        public static b a(String... strArr) {
            try {
                C15331h[] c15331hArr = new C15331h[strArr.length];
                C15328e c15328e = new C15328e();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    n.j0(c15328e, strArr[i10]);
                    c15328e.readByte();
                    c15331hArr[i10] = c15328e.Q2();
                }
                return new b((String[]) strArr.clone(), kw.z.s(c15331hArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        public List<String> b() {
            return Collections.unmodifiableList(Arrays.asList(this.f126354a));
        }

        private b(String[] strArr, kw.z zVar) {
            this.f126354a = strArr;
            this.f126355b = zVar;
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
        this.f126348b = new int[32];
        this.f126349c = new String[32];
        this.f126350d = new int[32];
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
        static final /* synthetic */ int[] f126353a;

        static {
            int[] iArr = new int[c.values().length];
            f126353a = iArr;
            try {
                iArr[c.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126353a[c.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126353a[c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126353a[c.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126353a[c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126353a[c.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static k j(InterfaceC15330g interfaceC15330g) {
        return new m(interfaceC15330g);
    }

    public final void B(boolean z10) {
        this.f126352f = z10;
    }

    public final void D(boolean z10) {
        this.f126351e = z10;
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
        return this.f126352f;
    }

    public final String getPath() {
        return l.a(this.f126347a, this.f126348b, this.f126349c, this.f126350d);
    }

    public final boolean h() {
        return this.f126351e;
    }

    final void u(int i10) {
        int i11 = this.f126347a;
        int[] iArr = this.f126348b;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new JsonDataException("Nesting too deep at " + getPath());
            }
            this.f126348b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f126349c;
            this.f126349c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f126350d;
            this.f126350d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f126348b;
        int i12 = this.f126347a;
        this.f126347a = i12 + 1;
        iArr3[i12] = i10;
    }

    public final Object w() throws IOException {
        switch (a.f126353a[l().ordinal()]) {
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
        this.f126347a = kVar.f126347a;
        this.f126348b = (int[]) kVar.f126348b.clone();
        this.f126349c = (String[]) kVar.f126349c.clone();
        this.f126350d = (int[]) kVar.f126350d.clone();
        this.f126351e = kVar.f126351e;
        this.f126352f = kVar.f126352f;
    }
}
