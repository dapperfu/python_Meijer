package Ed;

import Bf.b;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: Ed.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3501l implements Bf.d {

    /* renamed from: f, reason: collision with root package name */
    private static final Charset f8557f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    private static final Bf.b f8558g;

    /* renamed from: h, reason: collision with root package name */
    private static final Bf.b f8559h;

    /* renamed from: i, reason: collision with root package name */
    private static final Bf.c f8560i;

    /* renamed from: a, reason: collision with root package name */
    private OutputStream f8561a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f8562b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f8563c;

    /* renamed from: d, reason: collision with root package name */
    private final Bf.c f8564d;

    /* renamed from: e, reason: collision with root package name */
    private final C3529p f8565e = new C3529p(this);

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
    public final Bf.d f(Bf.b bVar, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        h(bVar, obj, true);
        return this;
    }

    static {
        b.C0047b c0047bA = Bf.b.a("key");
        C3459f c3459f = new C3459f();
        c3459f.a(1);
        f8558g = c0047bA.b(c3459f.b()).a();
        b.C0047b c0047bA2 = Bf.b.a("value");
        C3459f c3459f2 = new C3459f();
        c3459f2.a(2);
        f8559h = c0047bA2.b(c3459f2.b()).a();
        f8560i = new Bf.c() { // from class: Ed.k
            @Override // Bf.c
            public final void a(Object obj, Object obj2) throws IOException {
                C3501l.l((Map.Entry) obj, (Bf.d) obj2);
            }
        };
    }

    static /* synthetic */ void l(Map.Entry entry, Bf.d dVar) throws IOException {
        dVar.f(f8558g, entry.getKey());
        dVar.f(f8559h, entry.getValue());
    }

    private static int m(Bf.b bVar) {
        InterfaceC3487j interfaceC3487j = (InterfaceC3487j) bVar.c(InterfaceC3487j.class);
        if (interfaceC3487j != null) {
            return interfaceC3487j.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final long n(Bf.c cVar, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        C3466g c3466g = new C3466g();
        try {
            OutputStream outputStream = this.f8561a;
            this.f8561a = c3466g;
            try {
                cVar.a(obj, this);
                this.f8561a = outputStream;
                long jA = c3466g.a();
                c3466g.close();
                return jA;
            } catch (Throwable th2) {
                this.f8561a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                c3466g.close();
            } catch (Throwable th4) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                } catch (Exception unused) {
                }
            }
            throw th3;
        }
    }

    private static InterfaceC3487j o(Bf.b bVar) {
        InterfaceC3487j interfaceC3487j = (InterfaceC3487j) bVar.c(InterfaceC3487j.class);
        if (interfaceC3487j != null) {
            return interfaceC3487j;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final C3501l q(Bf.e eVar, Bf.b bVar, Object obj, boolean z10) throws IOException {
        this.f8565e.b(bVar, z10);
        eVar.a(obj, this.f8565e);
        return this;
    }

    private final void s(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f8561a.write((i10 & com.medallia.digital.mobilesdk.l3.f92485d) | 128);
            i10 >>>= 7;
        }
        this.f8561a.write(i10 & com.medallia.digital.mobilesdk.l3.f92485d);
    }

    private final void t(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f8561a.write((((int) j10) & com.medallia.digital.mobilesdk.l3.f92485d) | 128);
            j10 >>>= 7;
        }
        this.f8561a.write(((int) j10) & com.medallia.digital.mobilesdk.l3.f92485d);
    }

    final Bf.d a(Bf.b bVar, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        s((m(bVar) << 3) | 1);
        this.f8561a.write(r(8).putDouble(d10).array());
        return this;
    }

    final Bf.d g(Bf.b bVar, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        s((m(bVar) << 3) | 5);
        this.f8561a.write(r(4).putFloat(f10).array());
        return this;
    }

    final Bf.d h(Bf.b bVar, Object obj, boolean z10) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    s((m(bVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f8557f);
                    s(bytes.length);
                    this.f8561a.write(bytes);
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
                    p(f8560i, bVar, (Map.Entry) it2.next(), false);
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
                    Bf.c cVar = (Bf.c) this.f8562b.get(obj.getClass());
                    if (cVar != null) {
                        p(cVar, bVar, obj, z10);
                        return this;
                    }
                    Bf.e eVar = (Bf.e) this.f8563c.get(obj.getClass());
                    if (eVar != null) {
                        q(eVar, bVar, obj, z10);
                        return this;
                    }
                    if (obj instanceof InterfaceC3473h) {
                        i(bVar, ((InterfaceC3473h) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        i(bVar, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    p(this.f8564d, bVar, obj, z10);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z10 || bArr.length != 0) {
                    s((m(bVar) << 3) | 2);
                    s(bArr.length);
                    this.f8561a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    final C3501l i(Bf.b bVar, int i10, boolean z10) throws IOException {
        if (!z10 || i10 != 0) {
            InterfaceC3487j interfaceC3487jO = o(bVar);
            EnumC3480i enumC3480i = EnumC3480i.DEFAULT;
            int iOrdinal = interfaceC3487jO.zzb().ordinal();
            if (iOrdinal == 0) {
                s(interfaceC3487jO.zza() << 3);
                s(i10);
                return this;
            }
            if (iOrdinal == 1) {
                s(interfaceC3487jO.zza() << 3);
                s((i10 + i10) ^ (i10 >> 31));
                return this;
            }
            if (iOrdinal == 2) {
                s((interfaceC3487jO.zza() << 3) | 5);
                this.f8561a.write(r(4).putInt(i10).array());
                return this;
            }
        }
        return this;
    }

    final C3501l j(Bf.b bVar, long j10, boolean z10) throws IOException {
        if (!z10 || j10 != 0) {
            InterfaceC3487j interfaceC3487jO = o(bVar);
            EnumC3480i enumC3480i = EnumC3480i.DEFAULT;
            int iOrdinal = interfaceC3487jO.zzb().ordinal();
            if (iOrdinal == 0) {
                s(interfaceC3487jO.zza() << 3);
                t(j10);
                return this;
            }
            if (iOrdinal == 1) {
                s(interfaceC3487jO.zza() << 3);
                t((j10 >> 63) ^ (j10 + j10));
                return this;
            }
            if (iOrdinal == 2) {
                s((interfaceC3487jO.zza() << 3) | 1);
                this.f8561a.write(r(8).putLong(j10).array());
                return this;
            }
        }
        return this;
    }

    final C3501l k(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        Bf.c cVar = (Bf.c) this.f8562b.get(obj.getClass());
        if (cVar == null) {
            throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        cVar.a(obj, this);
        return this;
    }

    C3501l(OutputStream outputStream, Map map, Map map2, Bf.c cVar) {
        this.f8561a = outputStream;
        this.f8562b = map;
        this.f8563c = map2;
        this.f8564d = cVar;
    }

    private final C3501l p(Bf.c cVar, Bf.b bVar, Object obj, boolean z10) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
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
