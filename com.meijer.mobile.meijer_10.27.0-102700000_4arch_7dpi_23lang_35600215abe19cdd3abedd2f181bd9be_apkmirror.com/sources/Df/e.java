package Df;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
final class e implements Bf.d, Bf.f {

    /* renamed from: a, reason: collision with root package name */
    private e f6415a = null;

    /* renamed from: b, reason: collision with root package name */
    private boolean f6416b = true;

    /* renamed from: c, reason: collision with root package name */
    private final JsonWriter f6417c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, Bf.c<?>> f6418d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<Class<?>, Bf.e<?>> f6419e;

    /* renamed from: f, reason: collision with root package name */
    private final Bf.c<Object> f6420f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f6421g;

    private boolean t(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e x(String str, Object obj) throws EncodingException, IOException {
        if (obj == null) {
            return this;
        }
        y();
        this.f6417c.name(str);
        return k(obj, false);
    }

    private void y() throws IOException {
        if (!this.f6416b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.f6415a;
        if (eVar != null) {
            eVar.y();
            this.f6415a.f6416b = false;
            this.f6415a = null;
            this.f6417c.endObject();
        }
    }

    e k(Object obj, boolean z10) throws IOException {
        if (z10 && t(obj)) {
            throw new EncodingException(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f6417c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f6417c.value((Number) obj);
            return this;
        }
        int i10 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f6417c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    k(it.next(), false);
                }
                this.f6417c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f6417c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        p((String) key, entry.getValue());
                    } catch (ClassCastException e10) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                this.f6417c.endObject();
                return this;
            }
            Bf.c<?> cVar = this.f6418d.get(obj.getClass());
            if (cVar != null) {
                return v(cVar, obj, z10);
            }
            Bf.e<?> eVar = this.f6419e.get(obj.getClass());
            if (eVar != null) {
                eVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return v(this.f6420f, obj, z10);
            }
            if (obj instanceof f) {
                i(((f) obj).g());
                return this;
            }
            a(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return s((byte[]) obj);
        }
        this.f6417c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i10 < length) {
                this.f6417c.value(r6[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                j(jArr[i10]);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                this.f6417c.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                this.f6417c.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                k(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                k(obj2, false);
            }
        }
        this.f6417c.endArray();
        return this;
    }

    public e p(String str, Object obj) throws IOException {
        return this.f6421g ? x(str, obj) : w(str, obj);
    }

    e v(Bf.c<Object> cVar, Object obj, boolean z10) throws IOException {
        if (!z10) {
            this.f6417c.beginObject();
        }
        cVar.a(obj, this);
        if (!z10) {
            this.f6417c.endObject();
        }
        return this;
    }

    e(Writer writer, Map<Class<?>, Bf.c<?>> map, Map<Class<?>, Bf.e<?>> map2, Bf.c<Object> cVar, boolean z10) {
        this.f6417c = new JsonWriter(writer);
        this.f6418d = map;
        this.f6419e = map2;
        this.f6420f = cVar;
        this.f6421g = z10;
    }

    private e w(String str, Object obj) throws EncodingException, IOException {
        y();
        this.f6417c.name(str);
        if (obj == null) {
            this.f6417c.nullValue();
            return this;
        }
        return k(obj, false);
    }

    @Override // Bf.d
    public Bf.d b(Bf.b bVar, boolean z10) throws IOException {
        return q(bVar.b(), z10);
    }

    @Override // Bf.d
    public Bf.d c(Bf.b bVar, double d10) throws IOException {
        return m(bVar.b(), d10);
    }

    @Override // Bf.d
    public Bf.d d(Bf.b bVar, long j10) throws IOException {
        return o(bVar.b(), j10);
    }

    @Override // Bf.d
    public Bf.d e(Bf.b bVar, int i10) throws IOException {
        return n(bVar.b(), i10);
    }

    @Override // Bf.d
    public Bf.d f(Bf.b bVar, Object obj) throws IOException {
        return p(bVar.b(), obj);
    }

    public e h(double d10) throws IOException {
        y();
        this.f6417c.value(d10);
        return this;
    }

    public e i(int i10) throws IOException {
        y();
        this.f6417c.value(i10);
        return this;
    }

    public e j(long j10) throws IOException {
        y();
        this.f6417c.value(j10);
        return this;
    }

    @Override // Bf.f
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public e a(String str) throws IOException {
        y();
        this.f6417c.value(str);
        return this;
    }

    public e m(String str, double d10) throws IOException {
        y();
        this.f6417c.name(str);
        return h(d10);
    }

    public e n(String str, int i10) throws IOException {
        y();
        this.f6417c.name(str);
        return i(i10);
    }

    public e o(String str, long j10) throws IOException {
        y();
        this.f6417c.name(str);
        return j(j10);
    }

    public e q(String str, boolean z10) throws IOException {
        y();
        this.f6417c.name(str);
        return g(z10);
    }

    @Override // Bf.f
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public e g(boolean z10) throws IOException {
        y();
        this.f6417c.value(z10);
        return this;
    }

    public e s(byte[] bArr) throws IOException {
        y();
        if (bArr == null) {
            this.f6417c.nullValue();
            return this;
        }
        this.f6417c.value(Base64.encodeToString(bArr, 2));
        return this;
    }

    void u() throws IOException {
        y();
        this.f6417c.flush();
    }
}
