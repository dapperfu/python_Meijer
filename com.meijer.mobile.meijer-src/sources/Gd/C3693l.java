package Gd;

import Df.b;
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

/* renamed from: Gd.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3693l implements Df.d {

    /* renamed from: f, reason: collision with root package name */
    private static final Charset f12109f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    private static final Df.b f12110g;

    /* renamed from: h, reason: collision with root package name */
    private static final Df.b f12111h;

    /* renamed from: i, reason: collision with root package name */
    private static final Df.c f12112i;

    /* renamed from: a, reason: collision with root package name */
    private OutputStream f12113a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f12114b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f12115c;

    /* renamed from: d, reason: collision with root package name */
    private final Df.c f12116d;

    /* renamed from: e, reason: collision with root package name */
    private final C3721p f12117e = new C3721p(this);

    @Override // Df.d
    public final Df.d a(Df.b bVar, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        h(bVar, obj, true);
        return this;
    }

    @Override // Df.d
    public final /* synthetic */ Df.d c(Df.b bVar, boolean z10) throws IOException {
        i(bVar, z10 ? 1 : 0, true);
        return this;
    }

    @Override // Df.d
    public final /* synthetic */ Df.d d(Df.b bVar, long j10) throws IOException {
        j(bVar, j10, true);
        return this;
    }

    @Override // Df.d
    public final /* synthetic */ Df.d e(Df.b bVar, int i10) throws IOException {
        i(bVar, i10, true);
        return this;
    }

    @Override // Df.d
    public final Df.d f(Df.b bVar, double d10) throws IOException {
        b(bVar, d10, true);
        return this;
    }

    static {
        b.C0116b c0116bA = Df.b.a("key");
        C3651f c3651f = new C3651f();
        c3651f.a(1);
        f12110g = c0116bA.b(c3651f.b()).a();
        b.C0116b c0116bA2 = Df.b.a("value");
        C3651f c3651f2 = new C3651f();
        c3651f2.a(2);
        f12111h = c0116bA2.b(c3651f2.b()).a();
        f12112i = new Df.c() { // from class: Gd.k
            @Override // Df.c
            public final void a(Object obj, Object obj2) throws IOException {
                C3693l.l((Map.Entry) obj, (Df.d) obj2);
            }
        };
    }

    static /* synthetic */ void l(Map.Entry entry, Df.d dVar) throws IOException {
        dVar.a(f12110g, entry.getKey());
        dVar.a(f12111h, entry.getValue());
    }

    private static int m(Df.b bVar) {
        InterfaceC3679j interfaceC3679j = (InterfaceC3679j) bVar.c(InterfaceC3679j.class);
        if (interfaceC3679j != null) {
            return interfaceC3679j.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final long n(Df.c cVar, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        C3658g c3658g = new C3658g();
        try {
            OutputStream outputStream = this.f12113a;
            this.f12113a = c3658g;
            try {
                cVar.a(obj, this);
                this.f12113a = outputStream;
                long jA = c3658g.a();
                c3658g.close();
                return jA;
            } catch (Throwable th2) {
                this.f12113a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                c3658g.close();
            } catch (Throwable th4) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                } catch (Exception unused) {
                }
            }
            throw th3;
        }
    }

    private static InterfaceC3679j o(Df.b bVar) {
        InterfaceC3679j interfaceC3679j = (InterfaceC3679j) bVar.c(InterfaceC3679j.class);
        if (interfaceC3679j != null) {
            return interfaceC3679j;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final C3693l q(Df.e eVar, Df.b bVar, Object obj, boolean z10) throws IOException {
        this.f12117e.a(bVar, z10);
        eVar.a(obj, this.f12117e);
        return this;
    }

    private final void s(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f12113a.write((i10 & com.medallia.digital.mobilesdk.l3.f93324d) | 128);
            i10 >>>= 7;
        }
        this.f12113a.write(i10 & com.medallia.digital.mobilesdk.l3.f93324d);
    }

    private final void t(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f12113a.write((((int) j10) & com.medallia.digital.mobilesdk.l3.f93324d) | 128);
            j10 >>>= 7;
        }
        this.f12113a.write(((int) j10) & com.medallia.digital.mobilesdk.l3.f93324d);
    }

    final Df.d b(Df.b bVar, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        s((m(bVar) << 3) | 1);
        this.f12113a.write(r(8).putDouble(d10).array());
        return this;
    }

    final Df.d g(Df.b bVar, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        s((m(bVar) << 3) | 5);
        this.f12113a.write(r(4).putFloat(f10).array());
        return this;
    }

    final Df.d h(Df.b bVar, Object obj, boolean z10) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    s((m(bVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f12109f);
                    s(bytes.length);
                    this.f12113a.write(bytes);
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
                    p(f12112i, bVar, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    b(bVar, ((Double) obj).doubleValue(), z10);
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
                    Df.c cVar = (Df.c) this.f12114b.get(obj.getClass());
                    if (cVar != null) {
                        p(cVar, bVar, obj, z10);
                        return this;
                    }
                    Df.e eVar = (Df.e) this.f12115c.get(obj.getClass());
                    if (eVar != null) {
                        q(eVar, bVar, obj, z10);
                        return this;
                    }
                    if (obj instanceof InterfaceC3665h) {
                        i(bVar, ((InterfaceC3665h) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        i(bVar, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    p(this.f12116d, bVar, obj, z10);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z10 || bArr.length != 0) {
                    s((m(bVar) << 3) | 2);
                    s(bArr.length);
                    this.f12113a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    final C3693l i(Df.b bVar, int i10, boolean z10) throws IOException {
        if (!z10 || i10 != 0) {
            InterfaceC3679j interfaceC3679jO = o(bVar);
            EnumC3672i enumC3672i = EnumC3672i.DEFAULT;
            int iOrdinal = interfaceC3679jO.zzb().ordinal();
            if (iOrdinal == 0) {
                s(interfaceC3679jO.zza() << 3);
                s(i10);
                return this;
            }
            if (iOrdinal == 1) {
                s(interfaceC3679jO.zza() << 3);
                s((i10 + i10) ^ (i10 >> 31));
                return this;
            }
            if (iOrdinal == 2) {
                s((interfaceC3679jO.zza() << 3) | 5);
                this.f12113a.write(r(4).putInt(i10).array());
                return this;
            }
        }
        return this;
    }

    final C3693l j(Df.b bVar, long j10, boolean z10) throws IOException {
        if (!z10 || j10 != 0) {
            InterfaceC3679j interfaceC3679jO = o(bVar);
            EnumC3672i enumC3672i = EnumC3672i.DEFAULT;
            int iOrdinal = interfaceC3679jO.zzb().ordinal();
            if (iOrdinal == 0) {
                s(interfaceC3679jO.zza() << 3);
                t(j10);
                return this;
            }
            if (iOrdinal == 1) {
                s(interfaceC3679jO.zza() << 3);
                t((j10 >> 63) ^ (j10 + j10));
                return this;
            }
            if (iOrdinal == 2) {
                s((interfaceC3679jO.zza() << 3) | 1);
                this.f12113a.write(r(8).putLong(j10).array());
                return this;
            }
        }
        return this;
    }

    final C3693l k(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        Df.c cVar = (Df.c) this.f12114b.get(obj.getClass());
        if (cVar == null) {
            throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        cVar.a(obj, this);
        return this;
    }

    C3693l(OutputStream outputStream, Map map, Map map2, Df.c cVar) {
        this.f12113a = outputStream;
        this.f12114b = map;
        this.f12115c = map2;
        this.f12116d = cVar;
    }

    private final C3693l p(Df.c cVar, Df.b bVar, Object obj, boolean z10) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
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
