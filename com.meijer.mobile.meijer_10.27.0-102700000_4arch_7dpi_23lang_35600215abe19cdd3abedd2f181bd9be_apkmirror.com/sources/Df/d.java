package Df;

import com.google.firebase.encoders.EncodingException;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes7.dex */
public final class d implements Cf.b<d> {

    /* renamed from: e, reason: collision with root package name */
    private static final Bf.c<Object> f6405e = new Bf.c() { // from class: Df.a
        @Override // Bf.c
        public final void a(Object obj, Object obj2) {
            d.c(obj, (Bf.d) obj2);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private static final Bf.e<String> f6406f = new Bf.e() { // from class: Df.b
        @Override // Bf.e
        public final void a(Object obj, Object obj2) throws IOException {
            ((Bf.f) obj2).a((String) obj);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private static final Bf.e<Boolean> f6407g = new Bf.e() { // from class: Df.c
        @Override // Bf.e
        public final void a(Object obj, Object obj2) throws IOException {
            ((Bf.f) obj2).g(((Boolean) obj).booleanValue());
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private static final b f6408h = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, Bf.c<?>> f6409a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Bf.e<?>> f6410b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private Bf.c<Object> f6411c = f6405e;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6412d = false;

    class a implements Bf.a {
        a() {
        }

        @Override // Bf.a
        public void a(Object obj, Writer writer) throws IOException {
            e eVar = new e(writer, d.this.f6409a, d.this.f6410b, d.this.f6411c, d.this.f6412d);
            eVar.k(obj, false);
            eVar.u();
        }

        @Override // Bf.a
        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    private static final class b implements Bf.e<Date> {

        /* renamed from: a, reason: collision with root package name */
        private static final DateFormat f6414a;

        private b() {
        }

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f6414a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // Bf.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, Bf.f fVar) throws IOException {
            fVar.a(f6414a.format(date));
        }
    }

    public static /* synthetic */ void c(Object obj, Bf.d dVar) {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public Bf.a i() {
        return new a();
    }

    public d k(boolean z10) {
        this.f6412d = z10;
        return this;
    }

    @Override // Cf.b
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public <T> d a(Class<T> cls, Bf.c<? super T> cVar) {
        this.f6409a.put(cls, cVar);
        this.f6410b.remove(cls);
        return this;
    }

    public <T> d m(Class<T> cls, Bf.e<? super T> eVar) {
        this.f6410b.put(cls, eVar);
        this.f6409a.remove(cls);
        return this;
    }

    public d() {
        m(String.class, f6406f);
        m(Boolean.class, f6407g);
        m(Date.class, f6408h);
    }

    public d j(Cf.a aVar) {
        aVar.a(this);
        return this;
    }
}
