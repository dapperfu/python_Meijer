package Dd;

import Bf.b;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class S0 implements Bf.d {

    /* renamed from: f, reason: collision with root package name */
    private static final Charset f5504f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    private static final Bf.b f5505g;

    /* renamed from: h, reason: collision with root package name */
    private static final Bf.b f5506h;

    /* renamed from: i, reason: collision with root package name */
    private static final Bf.c f5507i;

    /* renamed from: a, reason: collision with root package name */
    private OutputStream f5508a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f5509b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f5510c;

    /* renamed from: d, reason: collision with root package name */
    private final Bf.c f5511d;

    /* renamed from: e, reason: collision with root package name */
    private final W0 f5512e = new W0(this);

    @Override // Bf.d
    public final /* synthetic */ Bf.d b(Bf.b bVar, boolean z10) throws IOException {
        i(bVar, z10 ? 1 : 0, true);
        return this;
    }

    @Override // Bf.d
    public final Bf.d c(Bf.b bVar, double d10) throws IOException {
        a(bVar, d10, true);
        return this;
    }

    @Override // Bf.d
    public final /* synthetic */ Bf.d d(Bf.b bVar, long j10) throws IOException {
        j(bVar, j10, true);
        return this;
    }

    @Override // Bf.d
    public final /* synthetic */ Bf.d e(Bf.b bVar, int i10) throws IOException {
        i(bVar, i10, true);
        return this;
    }

    @Override // Bf.d
    public final Bf.d f(Bf.b bVar, Object obj) throws IOException {
        h(bVar, obj, true);
        return this;
    }

    static {
        b.C0047b c0047bA = Bf.b.a("key");
        M0 m02 = new M0();
        m02.a(1);
        f5505g = c0047bA.b(m02.b()).a();
        b.C0047b c0047bA2 = Bf.b.a("value");
        M0 m03 = new M0();
        m03.a(2);
        f5506h = c0047bA2.b(m03.b()).a();
        f5507i = new Bf.c() { // from class: Dd.R0
            @Override // Bf.c
            public final void a(Object obj, Object obj2) throws IOException {
                S0.l((Map.Entry) obj, (Bf.d) obj2);
            }
        };
    }

    static /* synthetic */ void l(Map.Entry entry, Bf.d dVar) throws IOException {
        dVar.f(f5505g, entry.getKey());
        dVar.f(f5506h, entry.getValue());
    }

    private static int m(Bf.b bVar) {
        Q0 q02 = (Q0) bVar.c(Q0.class);
        if (q02 != null) {
            return q02.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final long n(Bf.c cVar, Object obj) throws IOException {
        N0 n02 = new N0();
        try {
            OutputStream outputStream = this.f5508a;
            this.f5508a = n02;
            try {
                cVar.a(obj, this);
                this.f5508a = outputStream;
                long jA = n02.a();
                n02.close();
                return jA;
            } catch (Throwable th2) {
                this.f5508a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                n02.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    private static Q0 o(Bf.b bVar) {
        Q0 q02 = (Q0) bVar.c(Q0.class);
        if (q02 != null) {
            return q02;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final S0 q(Bf.e eVar, Bf.b bVar, Object obj, boolean z10) throws IOException {
        this.f5512e.b(bVar, z10);
        eVar.a(obj, this.f5512e);
        return this;
    }

    private final void s(int i10) throws IOException {
        while (true) {
            long j10 = i10 & (-128);
            int i11 = i10 & com.medallia.digital.mobilesdk.l3.f92485d;
            if (j10 == 0) {
                this.f5508a.write(i11);
                return;
            } else {
                this.f5508a.write(i11 | 128);
                i10 >>>= 7;
            }
        }
    }

    private final void t(long j10) throws IOException {
        while (true) {
            long j11 = (-128) & j10;
            int i10 = ((int) j10) & com.medallia.digital.mobilesdk.l3.f92485d;
            if (j11 == 0) {
                this.f5508a.write(i10);
                return;
            } else {
                this.f5508a.write(i10 | 128);
                j10 >>>= 7;
            }
        }
    }

    final Bf.d a(Bf.b bVar, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        s((m(bVar) << 3) | 1);
        this.f5508a.write(r(8).putDouble(d10).array());
        return this;
    }

    final Bf.d g(Bf.b bVar, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        s((m(bVar) << 3) | 5);
        this.f5508a.write(r(4).putFloat(f10).array());
        return this;
    }

    final Bf.d h(Bf.b bVar, Object obj, boolean z10) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    s((m(bVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f5504f);
                    s(bytes.length);
                    this.f5508a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    h(bVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    p(f5507i, bVar, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    a(bVar, ((Double) obj).doubleValue(), z10);
                    return this;
                }
                if (obj instanceof Float) {
                    g(bVar, ((Float) obj).floatValue(), z10);
                    return this;
                }
                if (obj instanceof Number) {
                    j(bVar, ((Number) obj).longValue(), z10);
                    return this;
                }
                if (obj instanceof Boolean) {
                    i(bVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
                    return this;
                }
                if (!(obj instanceof byte[])) {
                    Bf.c cVar = (Bf.c) this.f5509b.get(obj.getClass());
                    if (cVar != null) {
                        p(cVar, bVar, obj, z10);
                        return this;
                    }
                    Bf.e eVar = (Bf.e) this.f5510c.get(obj.getClass());
                    if (eVar != null) {
                        q(eVar, bVar, obj, z10);
                        return this;
                    }
                    if (obj instanceof O0) {
                        i(bVar, ((O0) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        i(bVar, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    p(this.f5511d, bVar, obj, z10);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z10 || bArr.length != 0) {
                    s((m(bVar) << 3) | 2);
                    s(bArr.length);
                    this.f5508a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    final S0 i(Bf.b bVar, int i10, boolean z10) throws IOException {
        if (!z10 || i10 != 0) {
            Q0 q0O = o(bVar);
            int iOrdinal = q0O.zzb().ordinal();
            if (iOrdinal == 0) {
                s(q0O.zza() << 3);
                s(i10);
                return this;
            }
            if (iOrdinal == 1) {
                s(q0O.zza() << 3);
                s((i10 + i10) ^ (i10 >> 31));
                return this;
            }
            if (iOrdinal == 2) {
                s((q0O.zza() << 3) | 5);
                this.f5508a.write(r(4).putInt(i10).array());
                return this;
            }
        }
        return this;
    }

    final S0 j(Bf.b bVar, long j10, boolean z10) throws IOException {
        if (!z10 || j10 != 0) {
            Q0 q0O = o(bVar);
            int iOrdinal = q0O.zzb().ordinal();
            if (iOrdinal == 0) {
                s(q0O.zza() << 3);
                t(j10);
                return this;
            }
            if (iOrdinal == 1) {
                s(q0O.zza() << 3);
                t((j10 >> 63) ^ (j10 + j10));
                return this;
            }
            if (iOrdinal == 2) {
                s((q0O.zza() << 3) | 1);
                this.f5508a.write(r(8).putLong(j10).array());
                return this;
            }
        }
        return this;
    }

    final S0 k(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        Bf.c cVar = (Bf.c) this.f5509b.get(obj.getClass());
        if (cVar == null) {
            throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        cVar.a(obj, this);
        return this;
    }

    S0(OutputStream outputStream, Map map, Map map2, Bf.c cVar) {
        this.f5508a = outputStream;
        this.f5509b = map;
        this.f5510c = map2;
        this.f5511d = cVar;
    }

    private final S0 p(Bf.c cVar, Bf.b bVar, Object obj, boolean z10) throws IOException {
        long jN = n(cVar, obj);
        if (z10 && jN == 0) {
            return this;
        }
        s((m(bVar) << 3) | 2);
        t(jN);
        cVar.a(obj, this);
        return this;
    }

    private static ByteBuffer r(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }
}
