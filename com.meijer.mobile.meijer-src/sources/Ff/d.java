package Ff;

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

/* loaded from: classes8.dex */
public final class d implements Ef.b<d> {

    /* renamed from: e, reason: collision with root package name */
    private static final Df.c<Object> f10438e = new Df.c() { // from class: Ff.a
        @Override // Df.c
        public final void a(Object obj, Object obj2) {
            d.c(obj, (Df.d) obj2);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private static final Df.e<String> f10439f = new Df.e() { // from class: Ff.b
        @Override // Df.e
        public final void a(Object obj, Object obj2) throws IOException {
            ((Df.f) obj2).b((String) obj);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private static final Df.e<Boolean> f10440g = new Df.e() { // from class: Ff.c
        @Override // Df.e
        public final void a(Object obj, Object obj2) throws IOException {
            ((Df.f) obj2).g(((Boolean) obj).booleanValue());
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private static final b f10441h = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, Df.c<?>> f10442a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Df.e<?>> f10443b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private Df.c<Object> f10444c = f10438e;

    /* renamed from: d, reason: collision with root package name */
    private boolean f10445d = false;

    class a implements Df.a {
        a() {
        }

        @Override // Df.a
        public void a(Object obj, Writer writer) throws IOException {
            e eVar = new e(writer, d.this.f10442a, d.this.f10443b, d.this.f10444c, d.this.f10445d);
            eVar.k(obj, false);
            eVar.u();
        }

        @Override // Df.a
        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    private static final class b implements Df.e<Date> {

        /* renamed from: a, reason: collision with root package name */
        private static final DateFormat f10447a;

        private b() {
        }

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f10447a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // Df.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, Df.f fVar) throws IOException {
            fVar.b(f10447a.format(date));
        }
    }

    public static /* synthetic */ void c(Object obj, Df.d dVar) {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public Df.a i() {
        return new a();
    }

    public d k(boolean z10) {
        this.f10445d = z10;
        return this;
    }

    @Override // Ef.b
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public <T> d a(Class<T> cls, Df.c<? super T> cVar) {
        this.f10442a.put(cls, cVar);
        this.f10443b.remove(cls);
        return this;
    }

    public <T> d m(Class<T> cls, Df.e<? super T> eVar) {
        this.f10443b.put(cls, eVar);
        this.f10442a.remove(cls);
        return this;
    }

    public d() {
        m(String.class, f10439f);
        m(Boolean.class, f10440g);
        m(Date.class, f10441h);
    }

    public d j(Ef.a aVar) {
        aVar.a(this);
        return this;
    }
}
