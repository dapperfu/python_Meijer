package com.squareup.moshi;

import com.squareup.moshi.h;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes11.dex */
abstract class e<C extends Collection<T>, T> extends h<C> {

    /* renamed from: b, reason: collision with root package name */
    public static final h.e f126336b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final h<T> f126337a;

    class b extends e<Collection<T>, T> {
        b(h hVar) {
            super(hVar, null);
        }

        @Override // com.squareup.moshi.e
        Collection<T> c() {
            return new ArrayList();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.squareup.moshi.h
        public /* bridge */ /* synthetic */ void toJson(q qVar, Object obj) throws IOException {
            super.e(qVar, (Collection) obj);
        }

        @Override // com.squareup.moshi.h
        public /* bridge */ /* synthetic */ Object fromJson(k kVar) throws IOException {
            return super.a(kVar);
        }
    }

    class c extends e<Set<T>, T> {
        c(h hVar) {
            super(hVar, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.squareup.moshi.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Set<T> c() {
            return new LinkedHashSet();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.squareup.moshi.h
        public /* bridge */ /* synthetic */ void toJson(q qVar, Object obj) throws IOException {
            super.e(qVar, (Collection) obj);
        }

        @Override // com.squareup.moshi.h
        public /* bridge */ /* synthetic */ Object fromJson(k kVar) throws IOException {
            return super.a(kVar);
        }
    }

    /* synthetic */ e(h hVar, a aVar) {
        this(hVar);
    }

    abstract C c();

    class a implements h.e {
        a() {
        }

        @Override // com.squareup.moshi.h.e
        public h<?> a(Type type, Set<? extends Annotation> set, t tVar) {
            Class<?> clsG = x.g(type);
            if (!set.isEmpty()) {
                return null;
            }
            if (clsG != List.class && clsG != Collection.class) {
                if (clsG != Set.class) {
                    return null;
                }
                return e.d(type, tVar).nullSafe();
            }
            return e.b(type, tVar).nullSafe();
        }
    }

    private e(h<T> hVar) {
        this.f126337a = hVar;
    }

    static <T> h<Collection<T>> b(Type type, t tVar) {
        return new b(tVar.d(x.c(type, Collection.class)));
    }

    static <T> h<Set<T>> d(Type type, t tVar) {
        return new c(tVar.d(x.c(type, Collection.class)));
    }

    public String toString() {
        return this.f126337a + ".collection()";
    }

    public C a(k kVar) throws IOException {
        C c10 = (C) c();
        kVar.a();
        while (kVar.hasNext()) {
            c10.add(this.f126337a.fromJson(kVar));
        }
        kVar.c();
        return c10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(q qVar, C c10) throws IOException {
        qVar.a();
        Iterator it = c10.iterator();
        while (it.hasNext()) {
            this.f126337a.toJson(qVar, (q) it.next());
        }
        qVar.d();
    }
}
