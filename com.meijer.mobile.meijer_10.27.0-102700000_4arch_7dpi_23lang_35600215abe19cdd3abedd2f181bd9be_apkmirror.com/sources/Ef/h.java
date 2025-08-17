package Ef;

import Ef.h;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, Bf.c<?>> f8966a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Bf.e<?>> f8967b;

    /* renamed from: c, reason: collision with root package name */
    private final Bf.c<Object> f8968c;

    public static final class a implements Cf.b<a> {

        /* renamed from: d, reason: collision with root package name */
        private static final Bf.c<Object> f8969d = new Bf.c() { // from class: Ef.g
            @Override // Bf.c
            public final void a(Object obj, Object obj2) {
                h.a.b(obj, (Bf.d) obj2);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, Bf.c<?>> f8970a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final Map<Class<?>, Bf.e<?>> f8971b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        private Bf.c<Object> f8972c = f8969d;

        public static /* synthetic */ void b(Object obj, Bf.d dVar) {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f8970a), new HashMap(this.f8971b), this.f8972c);
        }

        @Override // Cf.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public <U> a a(Class<U> cls, Bf.c<? super U> cVar) {
            this.f8970a.put(cls, cVar);
            this.f8971b.remove(cls);
            return this;
        }

        public a d(Cf.a aVar) {
            aVar.a(this);
            return this;
        }
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) throws IOException {
        new f(outputStream, this.f8966a, this.f8967b, this.f8968c).t(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    h(Map<Class<?>, Bf.c<?>> map, Map<Class<?>, Bf.e<?>> map2, Bf.c<Object> cVar) {
        this.f8966a = map;
        this.f8967b = map2;
        this.f8968c = cVar;
    }
}
