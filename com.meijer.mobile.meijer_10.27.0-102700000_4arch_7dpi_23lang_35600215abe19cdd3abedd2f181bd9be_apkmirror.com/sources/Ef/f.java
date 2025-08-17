package Ef;

import Ef.d;
import com.google.firebase.encoders.EncodingException;
import com.medallia.digital.mobilesdk.l3;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
final class f implements Bf.d {

    /* renamed from: f, reason: collision with root package name */
    private static final Charset f8956f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    private static final Bf.b f8957g = Bf.b.a("key").b(Ef.a.b().c(1).a()).a();

    /* renamed from: h, reason: collision with root package name */
    private static final Bf.b f8958h = Bf.b.a("value").b(Ef.a.b().c(2).a()).a();

    /* renamed from: i, reason: collision with root package name */
    private static final Bf.c<Map.Entry<Object, Object>> f8959i = new Bf.c() { // from class: Ef.e
        @Override // Bf.c
        public final void a(Object obj, Object obj2) throws IOException {
            f.a((Map.Entry) obj, (Bf.d) obj2);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private OutputStream f8960a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Bf.c<?>> f8961b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, Bf.e<?>> f8962c;

    /* renamed from: d, reason: collision with root package name */
    private final Bf.c<Object> f8963d;

    /* renamed from: e, reason: collision with root package name */
    private final i f8964e = new i(this);

    @Override // Bf.d
    public Bf.d c(Bf.b bVar, double d10) throws IOException {
        return g(bVar, d10, true);
    }

    @Override // Bf.d
    public Bf.d f(Bf.b bVar, Object obj) throws IOException {
        return i(bVar, obj, true);
    }

    @Override // Bf.d
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public f e(Bf.b bVar, int i10) throws IOException {
        return k(bVar, i10, true);
    }

    @Override // Bf.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public f d(Bf.b bVar, long j10) throws IOException {
        return m(bVar, j10, true);
    }

    @Override // Bf.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public f b(Bf.b bVar, boolean z10) throws IOException {
        return o(bVar, z10, true);
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8965a;

        static {
            int[] iArr = new int[d.a.values().length];
            f8965a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8965a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8965a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static /* synthetic */ void a(Map.Entry entry, Bf.d dVar) throws IOException {
        dVar.f(f8957g, entry.getKey());
        dVar.f(f8958h, entry.getValue());
    }

    private <T> long q(Bf.c<T> cVar, T t10) throws IOException {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f8960a;
            this.f8960a = bVar;
            try {
                cVar.a(t10, this);
                this.f8960a = outputStream;
                long jA = bVar.a();
                bVar.close();
                return jA;
            } catch (Throwable th2) {
                this.f8960a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                bVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    private <T> f s(Bf.e<T> eVar, Bf.b bVar, T t10, boolean z10) throws IOException {
        this.f8964e.c(bVar, z10);
        eVar.a(t10, this.f8964e);
        return this;
    }

    private static d u(Bf.b bVar) {
        d dVar = (d) bVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private static int v(Bf.b bVar) {
        d dVar = (d) bVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private void w(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f8960a.write((i10 & l3.f92485d) | 128);
            i10 >>>= 7;
        }
        this.f8960a.write(i10 & l3.f92485d);
    }

    private void x(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f8960a.write((((int) j10) & l3.f92485d) | 128);
            j10 >>>= 7;
        }
        this.f8960a.write(((int) j10) & l3.f92485d);
    }

    Bf.d g(Bf.b bVar, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        w((v(bVar) << 3) | 1);
        this.f8960a.write(p(8).putDouble(d10).array());
        return this;
    }

    Bf.d h(Bf.b bVar, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        w((v(bVar) << 3) | 5);
        this.f8960a.write(p(4).putFloat(f10).array());
        return this;
    }

    Bf.d i(Bf.b bVar, Object obj, boolean z10) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    w((v(bVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f8956f);
                    w(bytes.length);
                    this.f8960a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    i(bVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    r(f8959i, bVar, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    return g(bVar, ((Double) obj).doubleValue(), z10);
                }
                if (obj instanceof Float) {
                    return h(bVar, ((Float) obj).floatValue(), z10);
                }
                if (obj instanceof Number) {
                    return m(bVar, ((Number) obj).longValue(), z10);
                }
                if (obj instanceof Boolean) {
                    return o(bVar, ((Boolean) obj).booleanValue(), z10);
                }
                if (!(obj instanceof byte[])) {
                    Bf.c<?> cVar = this.f8961b.get(obj.getClass());
                    if (cVar != null) {
                        return r(cVar, bVar, obj, z10);
                    }
                    Bf.e<?> eVar = this.f8962c.get(obj.getClass());
                    return eVar != null ? s(eVar, bVar, obj, z10) : obj instanceof c ? e(bVar, ((c) obj).g()) : obj instanceof Enum ? e(bVar, ((Enum) obj).ordinal()) : r(this.f8963d, bVar, obj, z10);
                }
                byte[] bArr = (byte[]) obj;
                if (!z10 || bArr.length != 0) {
                    w((v(bVar) << 3) | 2);
                    w(bArr.length);
                    this.f8960a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    f k(Bf.b bVar, int i10, boolean z10) throws IOException {
        if (!z10 || i10 != 0) {
            d dVarU = u(bVar);
            int i11 = a.f8965a[dVarU.intEncoding().ordinal()];
            if (i11 == 1) {
                w(dVarU.tag() << 3);
                w(i10);
                return this;
            }
            if (i11 == 2) {
                w(dVarU.tag() << 3);
                w((i10 << 1) ^ (i10 >> 31));
                return this;
            }
            if (i11 == 3) {
                w((dVarU.tag() << 3) | 5);
                this.f8960a.write(p(4).putInt(i10).array());
                return this;
            }
        }
        return this;
    }

    f m(Bf.b bVar, long j10, boolean z10) throws IOException {
        if (!z10 || j10 != 0) {
            d dVarU = u(bVar);
            int i10 = a.f8965a[dVarU.intEncoding().ordinal()];
            if (i10 == 1) {
                w(dVarU.tag() << 3);
                x(j10);
                return this;
            }
            if (i10 == 2) {
                w(dVarU.tag() << 3);
                x((j10 >> 63) ^ (j10 << 1));
                return this;
            }
            if (i10 == 3) {
                w((dVarU.tag() << 3) | 1);
                this.f8960a.write(p(8).putLong(j10).array());
                return this;
            }
        }
        return this;
    }

    f t(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        Bf.c<?> cVar = this.f8961b.get(obj.getClass());
        if (cVar != null) {
            cVar.a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }

    f(OutputStream outputStream, Map<Class<?>, Bf.c<?>> map, Map<Class<?>, Bf.e<?>> map2, Bf.c<Object> cVar) {
        this.f8960a = outputStream;
        this.f8961b = map;
        this.f8962c = map2;
        this.f8963d = cVar;
    }

    private static ByteBuffer p(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private <T> f r(Bf.c<T> cVar, Bf.b bVar, T t10, boolean z10) throws IOException {
        long jQ = q(cVar, t10);
        if (z10 && jQ == 0) {
            return this;
        }
        w((v(bVar) << 3) | 2);
        x(jQ);
        cVar.a(t10, this);
        return this;
    }

    f o(Bf.b bVar, boolean z10, boolean z11) throws IOException {
        return k(bVar, z10 ? 1 : 0, z11);
    }
}
