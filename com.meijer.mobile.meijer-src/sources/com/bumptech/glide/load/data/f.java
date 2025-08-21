package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static final e.a<?> f64609b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, e.a<?>> f64610a = new HashMap();

    class a implements e.a<Object> {
        @Override // com.bumptech.glide.load.data.e.a
        public Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.e.a
        public e<Object> b(Object obj) {
            return new b(obj);
        }

        a() {
        }
    }

    private static final class b implements e<Object> {

        /* renamed from: a, reason: collision with root package name */
        private final Object f64611a;

        @Override // com.bumptech.glide.load.data.e
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.e
        public Object a() {
            return this.f64611a;
        }

        b(Object obj) {
            this.f64611a = obj;
        }
    }

    public synchronized <T> e<T> a(T t10) {
        e.a<?> aVar;
        try {
            r7.k.d(t10);
            aVar = this.f64610a.get(t10.getClass());
            if (aVar == null) {
                Iterator<e.a<?>> it = this.f64610a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e.a<?> next = it.next();
                    if (next.a().isAssignableFrom(t10.getClass())) {
                        aVar = next;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = f64609b;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (e<T>) aVar.b(t10);
    }

    public synchronized void b(e.a<?> aVar) {
        this.f64610a.put(aVar.a(), aVar);
    }
}
