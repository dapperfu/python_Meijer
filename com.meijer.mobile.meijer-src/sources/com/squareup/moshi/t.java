package com.squareup.moshi;

import com.squareup.moshi.h;
import gu.C14410c;
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

/* loaded from: classes12.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    static final List<h.e> f127384e;

    /* renamed from: a, reason: collision with root package name */
    private final List<h.e> f127385a;

    /* renamed from: b, reason: collision with root package name */
    private final int f127386b;

    /* renamed from: c, reason: collision with root package name */
    private final ThreadLocal<c> f127387c = new ThreadLocal<>();

    /* renamed from: d, reason: collision with root package name */
    private final Map<Object, h<?>> f127388d = new LinkedHashMap();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final List<h.e> f127389a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        int f127390b = 0;

        public a a(h.e eVar) {
            if (eVar == null) {
                throw new IllegalArgumentException("factory == null");
            }
            List<h.e> list = this.f127389a;
            int i10 = this.f127390b;
            this.f127390b = i10 + 1;
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
            this.f127389a.add(eVar);
            return this;
        }

        public t d() {
            return new t(this);
        }
    }

    static final class b<T> extends h<T> {

        /* renamed from: a, reason: collision with root package name */
        final Type f127391a;

        /* renamed from: b, reason: collision with root package name */
        final String f127392b;

        /* renamed from: c, reason: collision with root package name */
        final Object f127393c;

        /* renamed from: d, reason: collision with root package name */
        h<T> f127394d;

        @Override // com.squareup.moshi.h
        public T fromJson(k kVar) throws IOException {
            h<T> hVar = this.f127394d;
            if (hVar != null) {
                return hVar.fromJson(kVar);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        @Override // com.squareup.moshi.h
        public void toJson(q qVar, T t10) throws IOException {
            h<T> hVar = this.f127394d;
            if (hVar == null) {
                throw new IllegalStateException("JsonAdapter isn't ready");
            }
            hVar.toJson(qVar, (q) t10);
        }

        public String toString() {
            h<T> hVar = this.f127394d;
            return hVar != null ? hVar.toString() : super.toString();
        }

        b(Type type, String str, Object obj) {
            this.f127391a = type;
            this.f127392b = str;
            this.f127393c = obj;
        }
    }

    final class c {

        /* renamed from: a, reason: collision with root package name */
        final List<b<?>> f127395a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        final Deque<b<?>> f127396b = new ArrayDeque();

        /* renamed from: c, reason: collision with root package name */
        boolean f127397c;

        c() {
        }

        <T> void a(h<T> hVar) {
            this.f127396b.getLast().f127394d = hVar;
        }

        IllegalArgumentException b(IllegalArgumentException illegalArgumentException) {
            if (!this.f127397c) {
                this.f127397c = true;
                if (this.f127396b.size() != 1 || this.f127396b.getFirst().f127392b != null) {
                    StringBuilder sb2 = new StringBuilder(illegalArgumentException.getMessage());
                    Iterator<b<?>> itDescendingIterator = this.f127396b.descendingIterator();
                    while (itDescendingIterator.hasNext()) {
                        b<?> next = itDescendingIterator.next();
                        sb2.append("\nfor ");
                        sb2.append(next.f127391a);
                        if (next.f127392b != null) {
                            sb2.append(' ');
                            sb2.append(next.f127392b);
                        }
                    }
                    return new IllegalArgumentException(sb2.toString(), illegalArgumentException);
                }
            }
            return illegalArgumentException;
        }

        void c(boolean z10) {
            this.f127396b.removeLast();
            if (this.f127396b.isEmpty()) {
                t.this.f127387c.remove();
                if (z10) {
                    synchronized (t.this.f127388d) {
                        try {
                            int size = this.f127395a.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                b<?> bVar = this.f127395a.get(i10);
                                h<T> hVar = (h) t.this.f127388d.put(bVar.f127393c, bVar.f127394d);
                                if (hVar != 0) {
                                    bVar.f127394d = hVar;
                                    t.this.f127388d.put(bVar.f127393c, hVar);
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
            int size = this.f127395a.size();
            for (int i10 = 0; i10 < size; i10++) {
                b<?> bVar = this.f127395a.get(i10);
                if (bVar.f127393c.equals(obj)) {
                    this.f127396b.add(bVar);
                    h<T> hVar = (h<T>) bVar.f127394d;
                    return hVar != null ? hVar : bVar;
                }
            }
            b<?> bVar2 = new b<>(type, str, obj);
            this.f127395a.add(bVar2);
            this.f127396b.add(bVar2);
            return null;
        }
    }

    public <T> h<T> e(Type type, Set<? extends Annotation> set) {
        return f(type, set, null);
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        f127384e = arrayList;
        arrayList.add(v.f127400a);
        arrayList.add(e.f127288b);
        arrayList.add(s.f127381c);
        arrayList.add(com.squareup.moshi.b.f127268c);
        arrayList.add(u.f127399a);
        arrayList.add(d.f127281d);
    }

    public <T> h<T> c(Class<T> cls) {
        return e(cls, C14410c.f134470a);
    }

    public <T> h<T> d(Type type) {
        return e(type, C14410c.f134470a);
    }

    public <T> h<T> f(Type type, Set<? extends Annotation> set, String str) {
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeP = C14410c.p(C14410c.a(type));
        Object objG = g(typeP, set);
        synchronized (this.f127388d) {
            try {
                h<T> hVar = (h) this.f127388d.get(objG);
                if (hVar != null) {
                    return hVar;
                }
                c cVar = this.f127387c.get();
                if (cVar == null) {
                    cVar = new c();
                    this.f127387c.set(cVar);
                }
                h<T> hVarD = cVar.d(typeP, str, objG);
                try {
                    if (hVarD != null) {
                        return hVarD;
                    }
                    try {
                        int size = this.f127385a.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            h<T> hVar2 = (h<T>) this.f127385a.get(i10).a(typeP, set, this);
                            if (hVar2 != null) {
                                cVar.a(hVar2);
                                cVar.c(true);
                                return hVar2;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + C14410c.u(typeP, set));
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
        int i10 = this.f127386b;
        for (int i11 = 0; i11 < i10; i11++) {
            aVar.a(this.f127385a.get(i11));
        }
        int size = this.f127385a.size() - f127384e.size();
        for (int i12 = this.f127386b; i12 < size; i12++) {
            aVar.c(this.f127385a.get(i12));
        }
        return aVar;
    }

    public <T> h<T> i(h.e eVar, Type type, Set<? extends Annotation> set) {
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeP = C14410c.p(C14410c.a(type));
        int iIndexOf = this.f127385a.indexOf(eVar);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Unable to skip past unknown factory " + eVar);
        }
        int size = this.f127385a.size();
        for (int i10 = iIndexOf + 1; i10 < size; i10++) {
            h<T> hVar = (h<T>) this.f127385a.get(i10).a(typeP, set, this);
            if (hVar != null) {
                return hVar;
            }
        }
        throw new IllegalArgumentException("No next JsonAdapter for " + C14410c.u(typeP, set));
    }

    t(a aVar) {
        int size = aVar.f127389a.size();
        List<h.e> list = f127384e;
        ArrayList arrayList = new ArrayList(size + list.size());
        arrayList.addAll(aVar.f127389a);
        arrayList.addAll(list);
        this.f127385a = Collections.unmodifiableList(arrayList);
        this.f127386b = aVar.f127390b;
    }

    private Object g(Type type, Set<? extends Annotation> set) {
        if (set.isEmpty()) {
            return type;
        }
        return Arrays.asList(type, set);
    }
}
