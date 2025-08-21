package Ff;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
final class e implements Df.d, Df.f {

    /* renamed from: a, reason: collision with root package name */
    private e f10448a = null;

    /* renamed from: b, reason: collision with root package name */
    private boolean f10449b = true;

    /* renamed from: c, reason: collision with root package name */
    private final JsonWriter f10450c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, Df.c<?>> f10451d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<Class<?>, Df.e<?>> f10452e;

    /* renamed from: f, reason: collision with root package name */
    private final Df.c<Object> f10453f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f10454g;

    private boolean t(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e x(String str, Object obj) throws EncodingException, IOException {
        if (obj == null) {
            return this;
        }
        y();
        this.f10450c.name(str);
        return k(obj, false);
    }

    private void y() throws IOException {
        if (!this.f10449b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.f10448a;
        if (eVar != null) {
            eVar.y();
            this.f10448a.f10449b = false;
            this.f10448a = null;
            this.f10450c.endObject();
        }
    }

    e k(Object obj, boolean z10) throws IOException {
        if (z10 && t(obj)) {
            throw new EncodingException(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f10450c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f10450c.value((Number) obj);
            return this;
        }
        int i10 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f10450c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    k(it.next(), false);
                }
                this.f10450c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f10450c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        p((String) key, entry.getValue());
                    } catch (ClassCastException e10) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                this.f10450c.endObject();
                return this;
            }
            Df.c<?> cVar = this.f10451d.get(obj.getClass());
            if (cVar != null) {
                return v(cVar, obj, z10);
            }
            Df.e<?> eVar = this.f10452e.get(obj.getClass());
            if (eVar != null) {
                eVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return v(this.f10453f, obj, z10);
            }
            if (obj instanceof f) {
                i(((f) obj).g());
                return this;
            }
            b(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return s((byte[]) obj);
        }
        this.f10450c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i10 < length) {
                this.f10450c.value(r6[i10]);
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
                this.f10450c.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                this.f10450c.value(zArr[i10]);
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
        this.f10450c.endArray();
        return this;
    }

    public e p(String str, Object obj) throws IOException {
        return this.f10454g ? x(str, obj) : w(str, obj);
    }

    e v(Df.c<Object> cVar, Object obj, boolean z10) throws IOException {
        if (!z10) {
            this.f10450c.beginObject();
        }
        cVar.a(obj, this);
        if (!z10) {
            this.f10450c.endObject();
        }
        return this;
    }

    e(Writer writer, Map<Class<?>, Df.c<?>> map, Map<Class<?>, Df.e<?>> map2, Df.c<Object> cVar, boolean z10) {
        this.f10450c = new JsonWriter(writer);
        this.f10451d = map;
        this.f10452e = map2;
        this.f10453f = cVar;
        this.f10454g = z10;
    }

    private e w(String str, Object obj) throws EncodingException, IOException {
        y();
        this.f10450c.name(str);
        if (obj == null) {
            this.f10450c.nullValue();
            return this;
        }
        return k(obj, false);
    }

    @Override // Df.d
    public Df.d a(Df.b bVar, Object obj) throws IOException {
        return p(bVar.b(), obj);
    }

    @Override // Df.d
    public Df.d c(Df.b bVar, boolean z10) throws IOException {
        return q(bVar.b(), z10);
    }

    @Override // Df.d
    public Df.d d(Df.b bVar, long j10) throws IOException {
        return o(bVar.b(), j10);
    }

    @Override // Df.d
    public Df.d e(Df.b bVar, int i10) throws IOException {
        return n(bVar.b(), i10);
    }

    @Override // Df.d
    public Df.d f(Df.b bVar, double d10) throws IOException {
        return m(bVar.b(), d10);
    }

    public e h(double d10) throws IOException {
        y();
        this.f10450c.value(d10);
        return this;
    }

    public e i(int i10) throws IOException {
        y();
        this.f10450c.value(i10);
        return this;
    }

    public e j(long j10) throws IOException {
        y();
        this.f10450c.value(j10);
        return this;
    }

    @Override // Df.f
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public e b(String str) throws IOException {
        y();
        this.f10450c.value(str);
        return this;
    }

    public e m(String str, double d10) throws IOException {
        y();
        this.f10450c.name(str);
        return h(d10);
    }

    public e n(String str, int i10) throws IOException {
        y();
        this.f10450c.name(str);
        return i(i10);
    }

    public e o(String str, long j10) throws IOException {
        y();
        this.f10450c.name(str);
        return j(j10);
    }

    public e q(String str, boolean z10) throws IOException {
        y();
        this.f10450c.name(str);
        return g(z10);
    }

    @Override // Df.f
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public e g(boolean z10) throws IOException {
        y();
        this.f10450c.value(z10);
        return this;
    }

    public e s(byte[] bArr) throws IOException {
        y();
        if (bArr == null) {
            this.f10450c.nullValue();
            return this;
        }
        this.f10450c.value(Base64.encodeToString(bArr, 2));
        return this;
    }

    void u() throws IOException {
        y();
        this.f10450c.flush();
    }
}
