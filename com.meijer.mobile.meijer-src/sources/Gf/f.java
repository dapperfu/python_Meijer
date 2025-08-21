package Gf;

import Gf.d;
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

/* loaded from: classes8.dex */
final class f implements Df.d {

    /* renamed from: f, reason: collision with root package name */
    private static final Charset f12508f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    private static final Df.b f12509g = Df.b.a("key").b(Gf.a.b().c(1).a()).a();

    /* renamed from: h, reason: collision with root package name */
    private static final Df.b f12510h = Df.b.a("value").b(Gf.a.b().c(2).a()).a();

    /* renamed from: i, reason: collision with root package name */
    private static final Df.c<Map.Entry<Object, Object>> f12511i = new Df.c() { // from class: Gf.e
        @Override // Df.c
        public final void a(Object obj, Object obj2) throws IOException {
            f.b((Map.Entry) obj, (Df.d) obj2);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private OutputStream f12512a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Df.c<?>> f12513b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, Df.e<?>> f12514c;

    /* renamed from: d, reason: collision with root package name */
    private final Df.c<Object> f12515d;

    /* renamed from: e, reason: collision with root package name */
    private final i f12516e = new i(this);

    @Override // Df.d
    public Df.d a(Df.b bVar, Object obj) throws IOException {
        return i(bVar, obj, true);
    }

    @Override // Df.d
    public Df.d f(Df.b bVar, double d10) throws IOException {
        return g(bVar, d10, true);
    }

    @Override // Df.d
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public f e(Df.b bVar, int i10) throws IOException {
        return k(bVar, i10, true);
    }

    @Override // Df.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public f d(Df.b bVar, long j10) throws IOException {
        return m(bVar, j10, true);
    }

    @Override // Df.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public f c(Df.b bVar, boolean z10) throws IOException {
        return o(bVar, z10, true);
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12517a;

        static {
            int[] iArr = new int[d.a.values().length];
            f12517a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12517a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12517a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static /* synthetic */ void b(Map.Entry entry, Df.d dVar) throws IOException {
        dVar.a(f12509g, entry.getKey());
        dVar.a(f12510h, entry.getValue());
    }

    private <T> long q(Df.c<T> cVar, T t10) throws IOException {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f12512a;
            this.f12512a = bVar;
            try {
                cVar.a(t10, this);
                this.f12512a = outputStream;
                long jA = bVar.a();
                bVar.close();
                return jA;
            } catch (Throwable th2) {
                this.f12512a = outputStream;
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

    private <T> f s(Df.e<T> eVar, Df.b bVar, T t10, boolean z10) throws IOException {
        this.f12516e.c(bVar, z10);
        eVar.a(t10, this.f12516e);
        return this;
    }

    private static d u(Df.b bVar) {
        d dVar = (d) bVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private static int v(Df.b bVar) {
        d dVar = (d) bVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private void w(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f12512a.write((i10 & l3.f93324d) | 128);
            i10 >>>= 7;
        }
        this.f12512a.write(i10 & l3.f93324d);
    }

    private void x(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f12512a.write((((int) j10) & l3.f93324d) | 128);
            j10 >>>= 7;
        }
        this.f12512a.write(((int) j10) & l3.f93324d);
    }

    Df.d g(Df.b bVar, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        w((v(bVar) << 3) | 1);
        this.f12512a.write(p(8).putDouble(d10).array());
        return this;
    }

    Df.d h(Df.b bVar, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        w((v(bVar) << 3) | 5);
        this.f12512a.write(p(4).putFloat(f10).array());
        return this;
    }

    Df.d i(Df.b bVar, Object obj, boolean z10) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    w((v(bVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f12508f);
                    w(bytes.length);
                    this.f12512a.write(bytes);
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
                    r(f12511i, bVar, (Map.Entry) it2.next(), false);
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
                    Df.c<?> cVar = this.f12513b.get(obj.getClass());
                    if (cVar != null) {
                        return r(cVar, bVar, obj, z10);
                    }
                    Df.e<?> eVar = this.f12514c.get(obj.getClass());
                    return eVar != null ? s(eVar, bVar, obj, z10) : obj instanceof c ? e(bVar, ((c) obj).g()) : obj instanceof Enum ? e(bVar, ((Enum) obj).ordinal()) : r(this.f12515d, bVar, obj, z10);
                }
                byte[] bArr = (byte[]) obj;
                if (!z10 || bArr.length != 0) {
                    w((v(bVar) << 3) | 2);
                    w(bArr.length);
                    this.f12512a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    f k(Df.b bVar, int i10, boolean z10) throws IOException {
        if (!z10 || i10 != 0) {
            d dVarU = u(bVar);
            int i11 = a.f12517a[dVarU.intEncoding().ordinal()];
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
                this.f12512a.write(p(4).putInt(i10).array());
                return this;
            }
        }
        return this;
    }

    f m(Df.b bVar, long j10, boolean z10) throws IOException {
        if (!z10 || j10 != 0) {
            d dVarU = u(bVar);
            int i10 = a.f12517a[dVarU.intEncoding().ordinal()];
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
                this.f12512a.write(p(8).putLong(j10).array());
                return this;
            }
        }
        return this;
    }

    f t(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        Df.c<?> cVar = this.f12513b.get(obj.getClass());
        if (cVar != null) {
            cVar.a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }

    f(OutputStream outputStream, Map<Class<?>, Df.c<?>> map, Map<Class<?>, Df.e<?>> map2, Df.c<Object> cVar) {
        this.f12512a = outputStream;
        this.f12513b = map;
        this.f12514c = map2;
        this.f12515d = cVar;
    }

    private static ByteBuffer p(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private <T> f r(Df.c<T> cVar, Df.b bVar, T t10, boolean z10) throws IOException {
        long jQ = q(cVar, t10);
        if (z10 && jQ == 0) {
            return this;
        }
        w((v(bVar) << 3) | 2);
        x(jQ);
        cVar.a(t10, this);
        return this;
    }

    f o(Df.b bVar, boolean z10, boolean z11) throws IOException {
        return k(bVar, z10 ? 1 : 0, z11);
    }
}
