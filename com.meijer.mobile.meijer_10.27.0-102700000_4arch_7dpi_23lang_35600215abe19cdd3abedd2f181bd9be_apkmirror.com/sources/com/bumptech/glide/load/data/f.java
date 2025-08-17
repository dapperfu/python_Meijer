package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static final e.a<?> f63769b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, e.a<?>> f63770a = new HashMap();

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
        private final Object f63771a;

        @Override // com.bumptech.glide.load.data.e
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.e
        public Object a() {
            return this.f63771a;
        }

        b(Object obj) {
            this.f63771a = obj;
        }
    }

    public synchronized <T> e<T> a(T t10) {
        e.a<?> aVar;
        try {
            p7.k.d(t10);
            aVar = this.f63770a.get(t10.getClass());
            if (aVar == null) {
                Iterator<e.a<?>> it = this.f63770a.values().iterator();
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
                aVar = f63769b;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (e<T>) aVar.b(t10);
    }

    public synchronized void b(e.a<?> aVar) {
        this.f63770a.put(aVar.a(), aVar);
    }
}
