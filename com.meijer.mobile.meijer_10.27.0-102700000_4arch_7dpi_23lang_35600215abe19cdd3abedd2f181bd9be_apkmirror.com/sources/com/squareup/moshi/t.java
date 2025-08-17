package com.squareup.moshi;

import com.squareup.moshi.h;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes11.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    static final List<h.e> f126432e;

    /* renamed from: a, reason: collision with root package name */
    private final List<h.e> f126433a;

    /* renamed from: b, reason: collision with root package name */
    private final int f126434b;

    /* renamed from: c, reason: collision with root package name */
    private final ThreadLocal<c> f126435c = new ThreadLocal<>();

    /* renamed from: d, reason: collision with root package name */
    private final Map<Object, h<?>> f126436d = new LinkedHashMap();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final List<h.e> f126437a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        int f126438b = 0;

        public a a(h.e eVar) {
            if (eVar == null) {
                throw new IllegalArgumentException("factory == null");
            }
            List<h.e> list = this.f126437a;
            int i10 = this.f126438b;
            this.f126438b = i10 + 1;
            list.add(i10, eVar);
            return this;
        }

        public a b(Object obj) {
            if (obj != null) {
                return a(com.squareup.moshi.a.d(obj));
            }
            throw new IllegalArgumentException("adapter == null");
        }

        public a c(h.e eVar) {
            if (eVar == null) {
                throw new IllegalArgumentException("factory == null");
            }
            this.f126437a.add(eVar);
            return this;
        }

        public t d() {
            return new t(this);
        }
    }

    static final class b<T> extends h<T> {

        /* renamed from: a, reason: collision with root package name */
        final Type f126439a;

        /* renamed from: b, reason: collision with root package name */
        final String f126440b;

        /* renamed from: c, reason: collision with root package name */
        final Object f126441c;

        /* renamed from: d, reason: collision with root package name */
        h<T> f126442d;

        @Override // com.squareup.moshi.h
        public T fromJson(k kVar) throws IOException {
            h<T> hVar = this.f126442d;
            if (hVar != null) {
                return hVar.fromJson(kVar);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        @Override // com.squareup.moshi.h
        public void toJson(q qVar, T t10) throws IOException {
            h<T> hVar = this.f126442d;
            if (hVar == null) {
                throw new IllegalStateException("JsonAdapter isn't ready");
            }
            hVar.toJson(qVar, (q) t10);
        }

        public String toString() {
            h<T> hVar = this.f126442d;
            return hVar != null ? hVar.toString() : super.toString();
        }

        b(Type type, String str, Object obj) {
            this.f126439a = type;
            this.f126440b = str;
            this.f126441c = obj;
        }
    }

    final class c {

        /* renamed from: a, reason: collision with root package name */
        final List<b<?>> f126443a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        final Deque<b<?>> f126444b = new ArrayDeque();

        /* renamed from: c, reason: collision with root package name */
        boolean f126445c;

        c() {
        }

        <T> void a(h<T> hVar) {
            this.f126444b.getLast().f126442d = hVar;
        }

        IllegalArgumentException b(IllegalArgumentException illegalArgumentException) {
            if (!this.f126445c) {
                this.f126445c = true;
                if (this.f126444b.size() != 1 || this.f126444b.getFirst().f126440b != null) {
                    StringBuilder sb2 = new StringBuilder(illegalArgumentException.getMessage());
                    Iterator<b<?>> itDescendingIterator = this.f126444b.descendingIterator();
                    while (itDescendingIterator.hasNext()) {
                        b<?> next = itDescendingIterator.next();
                        sb2.append("\nfor ");
                        sb2.append(next.f126439a);
                        if (next.f126440b != null) {
                            sb2.append(' ');
                            sb2.append(next.f126440b);
                        }
                    }
                    return new IllegalArgumentException(sb2.toString(), illegalArgumentException);
                }
            }
            return illegalArgumentException;
        }

        void c(boolean z10) {
            this.f126444b.removeLast();
            if (this.f126444b.isEmpty()) {
                t.this.f126435c.remove();
                if (z10) {
                    synchronized (t.this.f126436d) {
                        try {
                            int size = this.f126443a.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                b<?> bVar = this.f126443a.get(i10);
                                h<T> hVar = (h) t.this.f126436d.put(bVar.f126441c, bVar.f126442d);
                                if (hVar != 0) {
                                    bVar.f126442d = hVar;
                                    t.this.f126436d.put(bVar.f126441c, hVar);
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }

        <T> h<T> d(Type type, String str, Object obj) {
            int size = this.f126443a.size();
            for (int i10 = 0; i10 < size; i10++) {
                b<?> bVar = this.f126443a.get(i10);
                if (bVar.f126441c.equals(obj)) {
                    this.f126444b.add(bVar);
                    h<T> hVar = (h<T>) bVar.f126442d;
                    return hVar != null ? hVar : bVar;
                }
            }
            b<?> bVar2 = new b<>(type, str, obj);
            this.f126443a.add(bVar2);
            this.f126444b.add(bVar2);
            return null;
        }
    }

    public <T> h<T> e(Type type, Set<? extends Annotation> set) {
        return f(type, set, null);
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        f126432e = arrayList;
        arrayList.add(v.f126448a);
        arrayList.add(e.f126336b);
        arrayList.add(s.f126429c);
        arrayList.add(com.squareup.moshi.b.f126316c);
        arrayList.add(u.f126447a);
        arrayList.add(d.f126329d);
    }

    public <T> h<T> c(Class<T> cls) {
        return e(cls, gu.c.f134097a);
    }

    public <T> h<T> d(Type type) {
        return e(type, gu.c.f134097a);
    }

    public <T> h<T> f(Type type, Set<? extends Annotation> set, String str) {
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeP = gu.c.p(gu.c.a(type));
        Object objG = g(typeP, set);
        synchronized (this.f126436d) {
            try {
                h<T> hVar = (h) this.f126436d.get(objG);
                if (hVar != null) {
                    return hVar;
                }
                c cVar = this.f126435c.get();
                if (cVar == null) {
                    cVar = new c();
                    this.f126435c.set(cVar);
                }
                h<T> hVarD = cVar.d(typeP, str, objG);
                try {
                    if (hVarD != null) {
                        return hVarD;
                    }
                    try {
                        int size = this.f126433a.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            h<T> hVar2 = (h<T>) this.f126433a.get(i10).a(typeP, set, this);
                            if (hVar2 != null) {
                                cVar.a(hVar2);
                                cVar.c(true);
                                return hVar2;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + gu.c.u(typeP, set));
                    } catch (IllegalArgumentException e10) {
                        throw cVar.b(e10);
                    }
                } finally {
                    cVar.c(false);
                }
            } finally {
            }
        }
    }

    public a h() {
        a aVar = new a();
        int i10 = this.f126434b;
        for (int i11 = 0; i11 < i10; i11++) {
            aVar.a(this.f126433a.get(i11));
        }
        int size = this.f126433a.size() - f126432e.size();
        for (int i12 = this.f126434b; i12 < size; i12++) {
            aVar.c(this.f126433a.get(i12));
        }
        return aVar;
    }

    public <T> h<T> i(h.e eVar, Type type, Set<? extends Annotation> set) {
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeP = gu.c.p(gu.c.a(type));
        int iIndexOf = this.f126433a.indexOf(eVar);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Unable to skip past unknown factory " + eVar);
        }
        int size = this.f126433a.size();
        for (int i10 = iIndexOf + 1; i10 < size; i10++) {
            h<T> hVar = (h<T>) this.f126433a.get(i10).a(typeP, set, this);
            if (hVar != null) {
                return hVar;
            }
        }
        throw new IllegalArgumentException("No next JsonAdapter for " + gu.c.u(typeP, set));
    }

    t(a aVar) {
        int size = aVar.f126437a.size();
        List<h.e> list = f126432e;
        ArrayList arrayList = new ArrayList(size + list.size());
        arrayList.addAll(aVar.f126437a);
        arrayList.addAll(list);
        this.f126433a = Collections.unmodifiableList(arrayList);
        this.f126434b = aVar.f126438b;
    }

    private Object g(Type type, Set<? extends Annotation> set) {
        if (set.isEmpty()) {
            return type;
        }
        return Arrays.asList(type, set);
    }
}
