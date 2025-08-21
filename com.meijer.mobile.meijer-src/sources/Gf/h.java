package Gf;

import Gf.h;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, Df.c<?>> f12518a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Df.e<?>> f12519b;

    /* renamed from: c, reason: collision with root package name */
    private final Df.c<Object> f12520c;

    public static final class a implements Ef.b<a> {

        /* renamed from: d, reason: collision with root package name */
        private static final Df.c<Object> f12521d = new Df.c() { // from class: Gf.g
            @Override // Df.c
            public final void a(Object obj, Object obj2) {
                h.a.b(obj, (Df.d) obj2);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, Df.c<?>> f12522a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final Map<Class<?>, Df.e<?>> f12523b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        private Df.c<Object> f12524c = f12521d;

        public static /* synthetic */ void b(Object obj, Df.d dVar) {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f12522a), new HashMap(this.f12523b), this.f12524c);
        }

        @Override // Ef.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public <U> a a(Class<U> cls, Df.c<? super U> cVar) {
            this.f12522a.put(cls, cVar);
            this.f12523b.remove(cls);
            return this;
        }

        public a d(Ef.a aVar) {
            aVar.a(this);
            return this;
        }
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) throws IOException {
        new f(outputStream, this.f12518a, this.f12519b, this.f12520c).t(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    h(Map<Class<?>, Df.c<?>> map, Map<Class<?>, Df.e<?>> map2, Df.c<Object> cVar) {
        this.f12518a = map;
        this.f12519b = map2;
        this.f12520c = cVar;
    }
}
