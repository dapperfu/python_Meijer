package Ee;

import Ee.W.h;
import Ee.W.l;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes6.dex */
class W<K, V, E extends h<K, V, E>, S extends l<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {

    /* renamed from: j, reason: collision with root package name */
    static final y<Object, Object, d> f7267j = new C3211a();

    /* renamed from: a, reason: collision with root package name */
    final transient int f7268a;

    /* renamed from: b, reason: collision with root package name */
    final transient int f7269b;

    /* renamed from: c, reason: collision with root package name */
    final transient l<K, V, E, S>[] f7270c;

    /* renamed from: d, reason: collision with root package name */
    final int f7271d;

    /* renamed from: e, reason: collision with root package name */
    final De.e<Object> f7272e;

    /* renamed from: f, reason: collision with root package name */
    final transient i<K, V, E, S> f7273f;

    /* renamed from: g, reason: collision with root package name */
    transient Set<K> f7274g;

    /* renamed from: h, reason: collision with root package name */
    transient Collection<V> f7275h;

    /* renamed from: i, reason: collision with root package name */
    transient Set<Map.Entry<K, V>> f7276i;

    final class A extends AbstractC3216e<K, V> {

        /* renamed from: a, reason: collision with root package name */
        final K f7277a;

        /* renamed from: b, reason: collision with root package name */
        V f7278b;

        A(K k10, V v10) {
            this.f7277a = k10;
            this.f7278b = v10;
        }

        @Override // Ee.AbstractC3216e, java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (this.f7277a.equals(entry.getKey()) && this.f7278b.equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // Ee.AbstractC3216e, java.util.Map.Entry
        public K getKey() {
            return this.f7277a;
        }

        @Override // Ee.AbstractC3216e, java.util.Map.Entry
        public V getValue() {
            return this.f7278b;
        }

        @Override // Ee.AbstractC3216e, java.util.Map.Entry
        public int hashCode() {
            return this.f7277a.hashCode() ^ this.f7278b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = (V) W.this.put(this.f7277a, v10);
            this.f7278b = v10;
            return v11;
        }
    }

    static abstract class b<K, V, E extends h<K, V, E>> implements h<K, V, E> {

        /* renamed from: a, reason: collision with root package name */
        final K f7280a;

        /* renamed from: b, reason: collision with root package name */
        final int f7281b;

        @Override // Ee.W.h
        public E a() {
            return null;
        }

        @Override // Ee.W.h
        public final int c() {
            return this.f7281b;
        }

        @Override // Ee.W.h
        public final K getKey() {
            return this.f7280a;
        }

        b(K k10, int i10) {
            this.f7280a = k10;
            this.f7281b = i10;
        }
    }

    static abstract class c<K, V, E extends h<K, V, E>> extends WeakReference<K> implements h<K, V, E> {

        /* renamed from: a, reason: collision with root package name */
        final int f7282a;

        @Override // Ee.W.h
        public E a() {
            return null;
        }

        @Override // Ee.W.h
        public final int c() {
            return this.f7282a;
        }

        c(ReferenceQueue<K> referenceQueue, K k10, int i10) {
            super(k10, referenceQueue);
            this.f7282a = i10;
        }

        @Override // Ee.W.h
        public final K getKey() {
            return get();
        }
    }

    static final class d implements h<Object, Object, d> {
        @Override // Ee.W.h
        public int c() {
            throw new AssertionError();
        }

        @Override // Ee.W.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public d a() {
            throw new AssertionError();
        }

        @Override // Ee.W.h
        public Object getKey() {
            throw new AssertionError();
        }

        @Override // Ee.W.h
        public Object getValue() {
            throw new AssertionError();
        }

        private d() {
            throw new AssertionError();
        }
    }

    final class e extends W<K, V, E, S>.g<Map.Entry<K, V>> {
        e() {
            super();
        }

        @Override // java.util.Iterator
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return d();
        }
    }

    final class f extends AbstractSet<Map.Entry<K, V>> {
        f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            W.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = W.this.get(key)) != null && W.this.n().d(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return W.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && W.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return W.this.size();
        }
    }

    abstract class g<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        int f7285a;

        /* renamed from: b, reason: collision with root package name */
        int f7286b = -1;

        /* renamed from: c, reason: collision with root package name */
        l<K, V, E, S> f7287c;

        /* renamed from: d, reason: collision with root package name */
        AtomicReferenceArray<E> f7288d;

        /* renamed from: e, reason: collision with root package name */
        E f7289e;

        /* renamed from: f, reason: collision with root package name */
        W<K, V, E, S>.A f7290f;

        /* renamed from: g, reason: collision with root package name */
        W<K, V, E, S>.A f7291g;

        final void a() {
            this.f7290f = null;
            if (e() || f()) {
                return;
            }
            while (true) {
                int i10 = this.f7285a;
                if (i10 < 0) {
                    return;
                }
                l<K, V, E, S>[] lVarArr = W.this.f7270c;
                this.f7285a = i10 - 1;
                l<K, V, E, S> lVar = lVarArr[i10];
                this.f7287c = lVar;
                if (lVar.f7296b != 0) {
                    this.f7288d = this.f7287c.f7299e;
                    this.f7286b = r0.length() - 1;
                    if (f()) {
                        return;
                    }
                }
            }
        }

        g() {
            this.f7285a = W.this.f7270c.length - 1;
            a();
        }

        W<K, V, E, S>.A d() {
            W<K, V, E, S>.A a10 = this.f7290f;
            if (a10 == null) {
                throw new NoSuchElementException();
            }
            this.f7291g = a10;
            a();
            return this.f7291g;
        }

        boolean e() {
            E e10 = this.f7289e;
            if (e10 == null) {
                return false;
            }
            while (true) {
                this.f7289e = (E) e10.a();
                E e11 = this.f7289e;
                if (e11 == null) {
                    return false;
                }
                if (c(e11)) {
                    return true;
                }
                e10 = this.f7289e;
            }
        }

        boolean f() {
            while (true) {
                int i10 = this.f7286b;
                if (i10 < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f7288d;
                this.f7286b = i10 - 1;
                E e10 = atomicReferenceArray.get(i10);
                this.f7289e = e10;
                if (e10 != null && (c(e10) || e())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7290f != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            C3233w.c(this.f7291g != null);
            W.this.remove(this.f7291g.getKey());
            this.f7291g = null;
        }

        boolean c(E e10) {
            try {
                Object key = e10.getKey();
                Object objC = W.this.c(e10);
                if (objC != null) {
                    this.f7290f = new A(key, objC);
                    this.f7287c.r();
                    return true;
                }
                this.f7287c.r();
                return false;
            } catch (Throwable th2) {
                this.f7287c.r();
                throw th2;
            }
        }
    }

    interface h<K, V, E extends h<K, V, E>> {
        E a();

        int c();

        K getKey();

        V getValue();
    }

    interface i<K, V, E extends h<K, V, E>, S extends l<K, V, E, S>> {
        m a();

        E b(S s10, K k10, int i10, E e10);

        S c(W<K, V, E, S> w10, int i10);

        void d(S s10, E e10, V v10);

        E e(S s10, E e10, E e11);
    }

    final class j extends W<K, V, E, S>.g<K> {
        j() {
            super();
        }

        @Override // java.util.Iterator
        public K next() {
            return d().getKey();
        }
    }

    final class k extends AbstractSet<K> {
        k() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            W.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return W.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return W.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return W.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return W.this.size();
        }
    }

    static abstract class l<K, V, E extends h<K, V, E>, S extends l<K, V, E, S>> extends ReentrantLock {

        /* renamed from: a, reason: collision with root package name */
        final W<K, V, E, S> f7295a;

        /* renamed from: b, reason: collision with root package name */
        volatile int f7296b;

        /* renamed from: c, reason: collision with root package name */
        int f7297c;

        /* renamed from: d, reason: collision with root package name */
        int f7298d;

        /* renamed from: e, reason: collision with root package name */
        volatile AtomicReferenceArray<E> f7299e;

        /* renamed from: f, reason: collision with root package name */
        final AtomicInteger f7300f = new AtomicInteger();

        abstract S E();

        void e(ReferenceQueue<K> referenceQueue) {
            int i10 = 0;
            do {
                Reference<? extends K> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.f7295a.g((h) referencePoll);
                i10++;
            } while (i10 != 16);
        }

        void f(ReferenceQueue<V> referenceQueue) {
            int i10 = 0;
            do {
                Reference<? extends V> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.f7295a.h((y) referencePoll);
                i10++;
            } while (i10 != 16);
        }

        void o() {
        }

        void p() {
        }

        void F(E e10, V v10) {
            this.f7295a.f7273f.d(E(), e10, v10);
        }

        void a() {
            if (this.f7296b != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f7299e;
                    for (int i10 = 0; i10 < atomicReferenceArray.length(); i10++) {
                        atomicReferenceArray.set(i10, null);
                    }
                    o();
                    this.f7300f.set(0);
                    this.f7297c++;
                    this.f7296b = 0;
                    unlock();
                } catch (Throwable th2) {
                    unlock();
                    throw th2;
                }
            }
        }

        boolean c(Object obj, int i10) {
            try {
                boolean z10 = false;
                if (this.f7296b == 0) {
                    return false;
                }
                h hVarK = k(obj, i10);
                if (hVarK != null) {
                    if (hVarK.getValue() != null) {
                        z10 = true;
                    }
                }
                return z10;
            } finally {
                r();
            }
        }

        E d(E e10, E e11) {
            return (E) this.f7295a.f7273f.e(E(), e10, e11);
        }

        void g() {
            AtomicReferenceArray<E> atomicReferenceArray = this.f7299e;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i10 = this.f7296b;
            AtomicReferenceArray<E> atomicReferenceArrayQ = q(length << 1);
            this.f7298d = (atomicReferenceArrayQ.length() * 3) / 4;
            int length2 = atomicReferenceArrayQ.length() - 1;
            for (int i11 = 0; i11 < length; i11++) {
                E eA = atomicReferenceArray.get(i11);
                if (eA != null) {
                    h hVarA = eA.a();
                    int iC = eA.c() & length2;
                    if (hVarA == null) {
                        atomicReferenceArrayQ.set(iC, eA);
                    } else {
                        h hVar = eA;
                        while (hVarA != null) {
                            int iC2 = hVarA.c() & length2;
                            if (iC2 != iC) {
                                hVar = hVarA;
                                iC = iC2;
                            }
                            hVarA = hVarA.a();
                        }
                        atomicReferenceArrayQ.set(iC, hVar);
                        while (eA != hVar) {
                            int iC3 = eA.c() & length2;
                            h hVarD = d(eA, (h) atomicReferenceArrayQ.get(iC3));
                            if (hVarD != null) {
                                atomicReferenceArrayQ.set(iC3, hVarD);
                            } else {
                                i10--;
                            }
                            eA = eA.a();
                        }
                    }
                }
            }
            this.f7299e = atomicReferenceArrayQ;
            this.f7296b = i10;
        }

        E i(Object obj, int i10) {
            if (this.f7296b == 0) {
                return null;
            }
            for (E e10 = (E) j(i10); e10 != null; e10 = (E) e10.a()) {
                if (e10.c() == i10) {
                    Object key = e10.getKey();
                    if (key == null) {
                        G();
                    } else if (this.f7295a.f7272e.d(obj, key)) {
                        return e10;
                    }
                }
            }
            return null;
        }

        E j(int i10) {
            return this.f7299e.get(i10 & (r0.length() - 1));
        }

        AtomicReferenceArray<E> q(int i10) {
            return new AtomicReferenceArray<>(i10);
        }

        void r() {
            if ((this.f7300f.incrementAndGet() & 63) == 0) {
                C();
            }
        }

        E z(E e10, E e11) {
            int i10 = this.f7296b;
            E e12 = (E) e11.a();
            while (e10 != e11) {
                h hVarD = d(e10, e12);
                if (hVarD != null) {
                    e12 = (E) hVarD;
                } else {
                    i10--;
                }
                e10 = (E) e10.a();
            }
            this.f7296b = i10;
            return e12;
        }

        l(W<K, V, E, S> w10, int i10) {
            this.f7295a = w10;
            m(q(i10));
        }

        static <K, V, E extends h<K, V, E>> boolean n(E e10) {
            if (e10.getValue() == null) {
                return true;
            }
            return false;
        }

        V A(K k10, int i10, V v10) {
            lock();
            try {
                s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f7299e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                h hVar = (h) atomicReferenceArray.get(length);
                for (h hVarA = hVar; hVarA != null; hVarA = hVarA.a()) {
                    Object key = hVarA.getKey();
                    if (hVarA.c() == i10 && key != null && this.f7295a.f7272e.d(k10, key)) {
                        V v11 = (V) hVarA.getValue();
                        if (v11 == null) {
                            if (n(hVarA)) {
                                this.f7297c++;
                                h hVarZ = z(hVar, hVarA);
                                int i11 = this.f7296b - 1;
                                atomicReferenceArray.set(length, hVarZ);
                                this.f7296b = i11;
                            }
                            return null;
                        }
                        this.f7297c++;
                        F(hVarA, v10);
                        return v11;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        boolean B(K k10, int i10, V v10, V v11) {
            lock();
            try {
                s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f7299e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                h hVar = (h) atomicReferenceArray.get(length);
                for (h hVarA = hVar; hVarA != null; hVarA = hVarA.a()) {
                    Object key = hVarA.getKey();
                    if (hVarA.c() == i10 && key != null && this.f7295a.f7272e.d(k10, key)) {
                        Object value = hVarA.getValue();
                        if (value == null) {
                            if (n(hVarA)) {
                                this.f7297c++;
                                h hVarZ = z(hVar, hVarA);
                                int i11 = this.f7296b - 1;
                                atomicReferenceArray.set(length, hVarZ);
                                this.f7296b = i11;
                            }
                            return false;
                        }
                        if (!this.f7295a.n().d(v10, value)) {
                            return false;
                        }
                        this.f7297c++;
                        F(hVarA, v11);
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        void C() {
            D();
        }

        void D() {
            if (tryLock()) {
                try {
                    p();
                    this.f7300f.set(0);
                } finally {
                    unlock();
                }
            }
        }

        void G() {
            if (tryLock()) {
                try {
                    p();
                } finally {
                    unlock();
                }
            }
        }

        <T> void b(ReferenceQueue<T> referenceQueue) {
            while (referenceQueue.poll() != null) {
            }
        }

        V h(Object obj, int i10) {
            try {
                h hVarK = k(obj, i10);
                if (hVarK == null) {
                    r();
                    return null;
                }
                V v10 = (V) hVarK.getValue();
                if (v10 == null) {
                    G();
                }
                return v10;
            } finally {
                r();
            }
        }

        E k(Object obj, int i10) {
            return (E) i(obj, i10);
        }

        V l(E e10) {
            if (e10.getKey() == null) {
                G();
                return null;
            }
            V v10 = (V) e10.getValue();
            if (v10 == null) {
                G();
                return null;
            }
            return v10;
        }

        void m(AtomicReferenceArray<E> atomicReferenceArray) {
            this.f7298d = (atomicReferenceArray.length() * 3) / 4;
            this.f7299e = atomicReferenceArray;
        }

        void s() {
            D();
        }

        V t(K k10, int i10, V v10, boolean z10) {
            lock();
            try {
                s();
                int i11 = this.f7296b + 1;
                if (i11 > this.f7298d) {
                    g();
                    i11 = this.f7296b + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f7299e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                h hVar = (h) atomicReferenceArray.get(length);
                for (h hVarA = hVar; hVarA != null; hVarA = hVarA.a()) {
                    Object key = hVarA.getKey();
                    if (hVarA.c() == i10 && key != null && this.f7295a.f7272e.d(k10, key)) {
                        V v11 = (V) hVarA.getValue();
                        if (v11 == null) {
                            this.f7297c++;
                            F(hVarA, v10);
                            this.f7296b = this.f7296b;
                            unlock();
                            return null;
                        }
                        if (z10) {
                            unlock();
                            return v11;
                        }
                        this.f7297c++;
                        F(hVarA, v10);
                        unlock();
                        return v11;
                    }
                }
                this.f7297c++;
                h hVarB = this.f7295a.f7273f.b(E(), k10, i10, hVar);
                F(hVarB, v10);
                atomicReferenceArray.set(length, hVarB);
                this.f7296b = i11;
                unlock();
                return null;
            } catch (Throwable th2) {
                unlock();
                throw th2;
            }
        }

        boolean u(E e10, int i10) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f7299e;
                int length = i10 & (atomicReferenceArray.length() - 1);
                h hVar = (h) atomicReferenceArray.get(length);
                for (h hVarA = hVar; hVarA != null; hVarA = hVarA.a()) {
                    if (hVarA == e10) {
                        this.f7297c++;
                        h hVarZ = z(hVar, hVarA);
                        int i11 = this.f7296b - 1;
                        atomicReferenceArray.set(length, hVarZ);
                        this.f7296b = i11;
                        return true;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        boolean v(K k10, int i10, y<K, V, E> yVar) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f7299e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                h hVar = (h) atomicReferenceArray.get(length);
                for (h hVarA = hVar; hVarA != null; hVarA = hVarA.a()) {
                    Object key = hVarA.getKey();
                    if (hVarA.c() == i10 && key != null && this.f7295a.f7272e.d(k10, key)) {
                        if (((x) hVarA).b() != yVar) {
                            return false;
                        }
                        this.f7297c++;
                        h hVarZ = z(hVar, hVarA);
                        int i11 = this.f7296b - 1;
                        atomicReferenceArray.set(length, hVarZ);
                        this.f7296b = i11;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        V x(Object obj, int i10) {
            lock();
            try {
                s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f7299e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                h hVar = (h) atomicReferenceArray.get(length);
                for (h hVarA = hVar; hVarA != null; hVarA = hVarA.a()) {
                    Object key = hVarA.getKey();
                    if (hVarA.c() == i10 && key != null && this.f7295a.f7272e.d(obj, key)) {
                        V v10 = (V) hVarA.getValue();
                        if (v10 == null && !n(hVarA)) {
                            return null;
                        }
                        this.f7297c++;
                        h hVarZ = z(hVar, hVarA);
                        int i11 = this.f7296b - 1;
                        atomicReferenceArray.set(length, hVarZ);
                        this.f7296b = i11;
                        return v10;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
        
            if (r8.f7295a.n().d(r11, r4.getValue()) == false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        
            r5 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        
            if (n(r4) == false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        
            r8.f7297c++;
            r9 = z(r3, r4);
            r10 = r8.f7296b - 1;
            r0.set(r1, r9);
            r8.f7296b = r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
        
            return false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        boolean y(java.lang.Object r9, int r10, java.lang.Object r11) {
            /*
                r8 = this;
                r8.lock()
                r8.s()     // Catch: java.lang.Throwable -> L5c
                java.util.concurrent.atomic.AtomicReferenceArray<E extends Ee.W$h<K, V, E>> r0 = r8.f7299e     // Catch: java.lang.Throwable -> L5c
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L5c
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r10
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L5c
                Ee.W$h r3 = (Ee.W.h) r3     // Catch: java.lang.Throwable -> L5c
                r4 = r3
            L16:
                r5 = 0
                if (r4 == 0) goto L67
                java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Throwable -> L5c
                int r7 = r4.c()     // Catch: java.lang.Throwable -> L5c
                if (r7 != r10) goto L62
                if (r6 == 0) goto L62
                Ee.W<K, V, E extends Ee.W$h<K, V, E>, S extends Ee.W$l<K, V, E, S>> r7 = r8.f7295a     // Catch: java.lang.Throwable -> L5c
                De.e<java.lang.Object> r7 = r7.f7272e     // Catch: java.lang.Throwable -> L5c
                boolean r6 = r7.d(r9, r6)     // Catch: java.lang.Throwable -> L5c
                if (r6 == 0) goto L62
                java.lang.Object r9 = r4.getValue()     // Catch: java.lang.Throwable -> L5c
                Ee.W<K, V, E extends Ee.W$h<K, V, E>, S extends Ee.W$l<K, V, E, S>> r10 = r8.f7295a     // Catch: java.lang.Throwable -> L5c
                De.e r10 = r10.n()     // Catch: java.lang.Throwable -> L5c
                boolean r9 = r10.d(r11, r9)     // Catch: java.lang.Throwable -> L5c
                if (r9 == 0) goto L41
                r5 = r2
                goto L47
            L41:
                boolean r9 = n(r4)     // Catch: java.lang.Throwable -> L5c
                if (r9 == 0) goto L5e
            L47:
                int r9 = r8.f7297c     // Catch: java.lang.Throwable -> L5c
                int r9 = r9 + r2
                r8.f7297c = r9     // Catch: java.lang.Throwable -> L5c
                Ee.W$h r9 = r8.z(r3, r4)     // Catch: java.lang.Throwable -> L5c
                int r10 = r8.f7296b     // Catch: java.lang.Throwable -> L5c
                int r10 = r10 - r2
                r0.set(r1, r9)     // Catch: java.lang.Throwable -> L5c
                r8.f7296b = r10     // Catch: java.lang.Throwable -> L5c
                r8.unlock()
                return r5
            L5c:
                r9 = move-exception
                goto L6b
            L5e:
                r8.unlock()
                return r5
            L62:
                Ee.W$h r4 = r4.a()     // Catch: java.lang.Throwable -> L5c
                goto L16
            L67:
                r8.unlock()
                return r5
            L6b:
                r8.unlock()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: Ee.W.l.y(java.lang.Object, int, java.lang.Object):boolean");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static abstract class m {

        /* renamed from: a, reason: collision with root package name */
        public static final m f7301a = new a("STRONG", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final m f7302b = new b("WEAK", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ m[] f7303c = a();

        private m(String str, int i10) {
        }

        abstract De.e<Object> b();

        enum a extends m {
            a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // Ee.W.m
            De.e<Object> b() {
                return De.e.c();
            }
        }

        enum b extends m {
            b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // Ee.W.m
            De.e<Object> b() {
                return De.e.f();
            }
        }

        /* synthetic */ m(String str, int i10, C3211a c3211a) {
            this(str, i10);
        }

        private static /* synthetic */ m[] a() {
            return new m[]{f7301a, f7302b};
        }

        public static m valueOf(String str) {
            return (m) Enum.valueOf(m.class, str);
        }

        public static m[] values() {
            return (m[]) f7303c.clone();
        }
    }

    static class n<K, V> extends b<K, V, n<K, V>> implements h {

        /* renamed from: c, reason: collision with root package name */
        private volatile V f7304c;

        static final class a<K, V> implements i<K, V, n<K, V>, o<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f7305a = new a<>();

            static <K, V> a<K, V> g() {
                return (a<K, V>) f7305a;
            }

            @Override // Ee.W.i
            public m a() {
                return m.f7301a;
            }

            @Override // Ee.W.i
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public n<K, V> e(o<K, V> oVar, n<K, V> nVar, n<K, V> nVar2) {
                n<K, V> nVarB = b(oVar, nVar.f7280a, nVar.f7281b, nVar2);
                ((n) nVarB).f7304c = ((n) nVar).f7304c;
                return nVarB;
            }

            @Override // Ee.W.i
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public n<K, V> b(o<K, V> oVar, K k10, int i10, n<K, V> nVar) {
                return nVar == null ? new n<>(k10, i10, null) : new b(k10, i10, nVar);
            }

            @Override // Ee.W.i
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public o<K, V> c(W<K, V, n<K, V>, o<K, V>> w10, int i10) {
                return new o<>(w10, i10);
            }

            a() {
            }

            @Override // Ee.W.i
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public void d(o<K, V> oVar, n<K, V> nVar, V v10) {
                ((n) nVar).f7304c = v10;
            }
        }

        private static final class b<K, V> extends n<K, V> {

            /* renamed from: d, reason: collision with root package name */
            private final n<K, V> f7306d;

            b(K k10, int i10, n<K, V> nVar) {
                super(k10, i10, null);
                this.f7306d = nVar;
            }

            @Override // Ee.W.b, Ee.W.h
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public n<K, V> a() {
                return this.f7306d;
            }
        }

        /* synthetic */ n(Object obj, int i10, C3211a c3211a) {
            this(obj, i10);
        }

        private n(K k10, int i10) {
            super(k10, i10);
            this.f7304c = null;
        }

        @Override // Ee.W.h
        public final V getValue() {
            return this.f7304c;
        }
    }

    static class p<K, V> extends b<K, V, p<K, V>> implements x<K, V, p<K, V>> {

        /* renamed from: c, reason: collision with root package name */
        private volatile y<K, V, p<K, V>> f7307c;

        static final class a<K, V> implements i<K, V, p<K, V>, q<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f7308a = new a<>();

            static <K, V> a<K, V> g() {
                return (a<K, V>) f7308a;
            }

            @Override // Ee.W.i
            public m a() {
                return m.f7302b;
            }

            @Override // Ee.W.i
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public p<K, V> b(q<K, V> qVar, K k10, int i10, p<K, V> pVar) {
                return pVar == null ? new p<>(k10, i10, null) : new b(k10, i10, pVar);
            }

            @Override // Ee.W.i
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public q<K, V> c(W<K, V, p<K, V>, q<K, V>> w10, int i10) {
                return new q<>(w10, i10);
            }

            a() {
            }

            @Override // Ee.W.i
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public p<K, V> e(q<K, V> qVar, p<K, V> pVar, p<K, V> pVar2) {
                if (l.n(pVar)) {
                    return null;
                }
                p<K, V> pVarB = b(qVar, pVar.f7280a, pVar.f7281b, pVar2);
                ((p) pVarB).f7307c = ((p) pVar).f7307c.b(((q) qVar).f7310g, pVarB);
                return pVarB;
            }

            @Override // Ee.W.i
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public void d(q<K, V> qVar, p<K, V> pVar, V v10) {
                y yVar = ((p) pVar).f7307c;
                ((p) pVar).f7307c = new z(((q) qVar).f7310g, v10, pVar);
                yVar.clear();
            }
        }

        private static final class b<K, V> extends p<K, V> {

            /* renamed from: d, reason: collision with root package name */
            private final p<K, V> f7309d;

            b(K k10, int i10, p<K, V> pVar) {
                super(k10, i10, null);
                this.f7309d = pVar;
            }

            @Override // Ee.W.b, Ee.W.h
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public p<K, V> a() {
                return this.f7309d;
            }
        }

        /* synthetic */ p(Object obj, int i10, C3211a c3211a) {
            this(obj, i10);
        }

        private p(K k10, int i10) {
            super(k10, i10);
            this.f7307c = W.k();
        }

        @Override // Ee.W.x
        public final y<K, V, p<K, V>> b() {
            return this.f7307c;
        }

        @Override // Ee.W.h
        public final V getValue() {
            return this.f7307c.get();
        }
    }

    static final class q<K, V> extends l<K, V, p<K, V>, q<K, V>> {

        /* renamed from: g, reason: collision with root package name */
        private final ReferenceQueue<V> f7310g;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // Ee.W.l
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public q<K, V> E() {
            return this;
        }

        @Override // Ee.W.l
        void o() {
            b(this.f7310g);
        }

        @Override // Ee.W.l
        void p() {
            f(this.f7310g);
        }

        q(W<K, V, p<K, V>, q<K, V>> w10, int i10) {
            super(w10, i10);
            this.f7310g = new ReferenceQueue<>();
        }
    }

    final class r extends W<K, V, E, S>.g<V> {
        r() {
            super();
        }

        @Override // java.util.Iterator
        public V next() {
            return d().getValue();
        }
    }

    final class s extends AbstractCollection<V> {
        s() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            W.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return W.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return W.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new r();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return W.this.size();
        }
    }

    static class t<K, V> extends c<K, V, t<K, V>> implements h {

        /* renamed from: b, reason: collision with root package name */
        private volatile V f7313b;

        static final class a<K, V> implements i<K, V, t<K, V>, u<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f7314a = new a<>();

            static <K, V> a<K, V> g() {
                return (a<K, V>) f7314a;
            }

            @Override // Ee.W.i
            public m a() {
                return m.f7301a;
            }

            @Override // Ee.W.i
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public t<K, V> b(u<K, V> uVar, K k10, int i10, t<K, V> tVar) {
                return tVar == null ? new t<>(((u) uVar).f7316g, k10, i10, null) : new b(((u) uVar).f7316g, k10, i10, tVar, null);
            }

            @Override // Ee.W.i
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public u<K, V> c(W<K, V, t<K, V>, u<K, V>> w10, int i10) {
                return new u<>(w10, i10);
            }

            a() {
            }

            @Override // Ee.W.i
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public t<K, V> e(u<K, V> uVar, t<K, V> tVar, t<K, V> tVar2) {
                K key = tVar.getKey();
                if (key == null) {
                    return null;
                }
                t<K, V> tVarB = b(uVar, key, tVar.f7282a, tVar2);
                ((t) tVarB).f7313b = ((t) tVar).f7313b;
                return tVarB;
            }

            @Override // Ee.W.i
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public void d(u<K, V> uVar, t<K, V> tVar, V v10) {
                ((t) tVar).f7313b = v10;
            }
        }

        private static final class b<K, V> extends t<K, V> {

            /* renamed from: c, reason: collision with root package name */
            private final t<K, V> f7315c;

            /* synthetic */ b(ReferenceQueue referenceQueue, Object obj, int i10, t tVar, C3211a c3211a) {
                this(referenceQueue, obj, i10, tVar);
            }

            private b(ReferenceQueue<K> referenceQueue, K k10, int i10, t<K, V> tVar) {
                super(referenceQueue, k10, i10, null);
                this.f7315c = tVar;
            }

            @Override // Ee.W.c, Ee.W.h
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public t<K, V> a() {
                return this.f7315c;
            }
        }

        /* synthetic */ t(ReferenceQueue referenceQueue, Object obj, int i10, C3211a c3211a) {
            this(referenceQueue, obj, i10);
        }

        private t(ReferenceQueue<K> referenceQueue, K k10, int i10) {
            super(referenceQueue, k10, i10);
            this.f7313b = null;
        }

        @Override // Ee.W.h
        public final V getValue() {
            return this.f7313b;
        }
    }

    static final class u<K, V> extends l<K, V, t<K, V>, u<K, V>> {

        /* renamed from: g, reason: collision with root package name */
        private final ReferenceQueue<K> f7316g;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // Ee.W.l
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public u<K, V> E() {
            return this;
        }

        @Override // Ee.W.l
        void o() {
            b(this.f7316g);
        }

        @Override // Ee.W.l
        void p() {
            e(this.f7316g);
        }

        u(W<K, V, t<K, V>, u<K, V>> w10, int i10) {
            super(w10, i10);
            this.f7316g = new ReferenceQueue<>();
        }
    }

    static class v<K, V> extends c<K, V, v<K, V>> implements x<K, V, v<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        private volatile y<K, V, v<K, V>> f7317b;

        static final class a<K, V> implements i<K, V, v<K, V>, w<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f7318a = new a<>();

            static <K, V> a<K, V> g() {
                return (a<K, V>) f7318a;
            }

            @Override // Ee.W.i
            public m a() {
                return m.f7302b;
            }

            @Override // Ee.W.i
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public v<K, V> b(w<K, V> wVar, K k10, int i10, v<K, V> vVar) {
                return vVar == null ? new v<>(((w) wVar).f7320g, k10, i10) : new b(((w) wVar).f7320g, k10, i10, vVar);
            }

            @Override // Ee.W.i
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public w<K, V> c(W<K, V, v<K, V>, w<K, V>> w10, int i10) {
                return new w<>(w10, i10);
            }

            a() {
            }

            @Override // Ee.W.i
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public v<K, V> e(w<K, V> wVar, v<K, V> vVar, v<K, V> vVar2) {
                K key = vVar.getKey();
                if (key == null || l.n(vVar)) {
                    return null;
                }
                v<K, V> vVarB = b(wVar, key, vVar.f7282a, vVar2);
                ((v) vVarB).f7317b = ((v) vVar).f7317b.b(((w) wVar).f7321h, vVarB);
                return vVarB;
            }

            @Override // Ee.W.i
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public void d(w<K, V> wVar, v<K, V> vVar, V v10) {
                y yVar = ((v) vVar).f7317b;
                ((v) vVar).f7317b = new z(((w) wVar).f7321h, v10, vVar);
                yVar.clear();
            }
        }

        private static final class b<K, V> extends v<K, V> {

            /* renamed from: c, reason: collision with root package name */
            private final v<K, V> f7319c;

            @Override // Ee.W.c, Ee.W.h
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public v<K, V> a() {
                return this.f7319c;
            }

            b(ReferenceQueue<K> referenceQueue, K k10, int i10, v<K, V> vVar) {
                super(referenceQueue, k10, i10);
                this.f7319c = vVar;
            }
        }

        @Override // Ee.W.x
        public final y<K, V, v<K, V>> b() {
            return this.f7317b;
        }

        @Override // Ee.W.h
        public final V getValue() {
            return this.f7317b.get();
        }

        v(ReferenceQueue<K> referenceQueue, K k10, int i10) {
            super(referenceQueue, k10, i10);
            this.f7317b = W.k();
        }
    }

    static final class w<K, V> extends l<K, V, v<K, V>, w<K, V>> {

        /* renamed from: g, reason: collision with root package name */
        private final ReferenceQueue<K> f7320g;

        /* renamed from: h, reason: collision with root package name */
        private final ReferenceQueue<V> f7321h;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // Ee.W.l
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public w<K, V> E() {
            return this;
        }

        @Override // Ee.W.l
        void o() {
            b(this.f7320g);
        }

        @Override // Ee.W.l
        void p() {
            e(this.f7320g);
            f(this.f7321h);
        }

        w(W<K, V, v<K, V>, w<K, V>> w10, int i10) {
            super(w10, i10);
            this.f7320g = new ReferenceQueue<>();
            this.f7321h = new ReferenceQueue<>();
        }
    }

    interface x<K, V, E extends h<K, V, E>> extends h<K, V, E> {
        y<K, V, E> b();
    }

    interface y<K, V, E extends h<K, V, E>> {
        E a();

        y<K, V, E> b(ReferenceQueue<V> referenceQueue, E e10);

        void clear();

        V get();
    }

    static final class z<K, V, E extends h<K, V, E>> extends WeakReference<V> implements y<K, V, E> {

        /* renamed from: a, reason: collision with root package name */
        final E f7322a;

        @Override // Ee.W.y
        public E a() {
            return this.f7322a;
        }

        @Override // Ee.W.y
        public y<K, V, E> b(ReferenceQueue<V> referenceQueue, E e10) {
            return new z(referenceQueue, get(), e10);
        }

        z(ReferenceQueue<V> referenceQueue, V v10, E e10) {
            super(v10, referenceQueue);
            this.f7322a = e10;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iD = d(obj);
        return j(iD).x(obj, iD);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k10, V v10, V v11) {
        De.p.q(k10);
        De.p.q(v11);
        if (v10 == null) {
            return false;
        }
        int iD = d(k10);
        return j(iD).B(k10, iD, v10, v11);
    }

    /* renamed from: Ee.W$a, reason: case insensitive filesystem */
    class C3211a implements y<Object, Object, d> {
        @Override // Ee.W.y
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public y<Object, Object, d> b(ReferenceQueue<Object> referenceQueue, d dVar) {
            return this;
        }

        @Override // Ee.W.y
        public void clear() {
        }

        @Override // Ee.W.y
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public d a() {
            return null;
        }

        @Override // Ee.W.y
        public Object get() {
            return null;
        }

        C3211a() {
        }
    }

    static final class o<K, V> extends l<K, V, n<K, V>, o<K, V>> {
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // Ee.W.l
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public o<K, V> E() {
            return this;
        }

        o(W<K, V, n<K, V>, o<K, V>> w10, int i10) {
            super(w10, i10);
        }
    }

    static int i(int i10) {
        int i11 = i10 + ((i10 << 15) ^ (-12931));
        int i12 = i11 ^ (i11 >>> 10);
        int i13 = i12 + (i12 << 3);
        int i14 = i13 ^ (i13 >>> 6);
        int i15 = i14 + (i14 << 2) + (i14 << 14);
        return i15 ^ (i15 >>> 16);
    }

    static <K, V, E extends h<K, V, E>> y<K, V, E> k() {
        return (y<K, V, E>) f7267j;
    }

    l<K, V, E, S> b(int i10) {
        return this.f7273f.c(this, i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (l<K, V, E, S> lVar : this.f7270c) {
            lVar.a();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int iD = d(obj);
        return j(iD).c(obj, iD);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        boolean z10 = false;
        if (obj == null) {
            return false;
        }
        l<K, V, E, S>[] lVarArr = this.f7270c;
        long j10 = -1;
        int i10 = 0;
        while (i10 < 3) {
            int length = lVarArr.length;
            long j11 = 0;
            for (?? r10 = z10; r10 < length; r10++) {
                l<K, V, E, S> lVar = lVarArr[r10];
                int i11 = lVar.f7296b;
                AtomicReferenceArray<E> atomicReferenceArray = lVar.f7299e;
                for (?? r13 = z10; r13 < atomicReferenceArray.length(); r13++) {
                    E eA = atomicReferenceArray.get(r13);
                    while (eA != null) {
                        V vL = lVar.l(eA);
                        boolean z11 = z10;
                        if (vL != null && n().d(obj, vL)) {
                            return true;
                        }
                        eA = eA.a();
                        z10 = z11;
                    }
                }
                j11 += lVar.f7297c;
                z10 = z10;
            }
            boolean z12 = z10;
            if (j11 == j10) {
                return z12;
            }
            i10++;
            j10 = j11;
            z10 = z12;
        }
        return z10;
    }

    int d(Object obj) {
        return i(this.f7272e.e(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f7276i;
        if (set != null) {
            return set;
        }
        f fVar = new f();
        this.f7276i = fVar;
        return fVar;
    }

    final l<K, V, E, S>[] f(int i10) {
        return new l[i10];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iD = d(obj);
        return j(iD).h(obj, iD);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        l<K, V, E, S>[] lVarArr = this.f7270c;
        long j10 = 0;
        for (int i10 = 0; i10 < lVarArr.length; i10++) {
            if (lVarArr[i10].f7296b != 0) {
                return false;
            }
            j10 += lVarArr[i10].f7297c;
        }
        if (j10 == 0) {
            return true;
        }
        for (int i11 = 0; i11 < lVarArr.length; i11++) {
            if (lVarArr[i11].f7296b != 0) {
                return false;
            }
            j10 -= lVarArr[i11].f7297c;
        }
        return j10 == 0;
    }

    l<K, V, E, S> j(int i10) {
        return this.f7270c[(i10 >>> this.f7269b) & this.f7268a];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f7274g;
        if (set != null) {
            return set;
        }
        k kVar = new k();
        this.f7274g = kVar;
        return kVar;
    }

    De.e<Object> n() {
        return this.f7273f.a().b();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j10 = 0;
        for (int i10 = 0; i10 < this.f7270c.length; i10++) {
            j10 += r0[i10].f7296b;
        }
        return Je.f.k(j10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f7275h;
        if (collection != null) {
            return collection;
        }
        s sVar = new s();
        this.f7275h = sVar;
        return sVar;
    }

    private W(V v10, i<K, V, E, S> iVar) {
        this.f7271d = Math.min(v10.a(), 65536);
        this.f7272e = v10.c();
        this.f7273f = iVar;
        int iMin = Math.min(v10.b(), 1073741824);
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        int i13 = 1;
        while (i13 < this.f7271d) {
            i12++;
            i13 <<= 1;
        }
        this.f7269b = 32 - i12;
        this.f7268a = i13 - 1;
        this.f7270c = f(i13);
        int i14 = iMin / i13;
        while (i11 < (i13 * i14 < iMin ? i14 + 1 : i14)) {
            i11 <<= 1;
        }
        while (true) {
            l<K, V, E, S>[] lVarArr = this.f7270c;
            if (i10 < lVarArr.length) {
                lVarArr[i10] = b(i11);
                i10++;
            } else {
                return;
            }
        }
    }

    static <K, V> W<K, V, ? extends h<K, V, ?>, ?> a(V v10) {
        m mVarD = v10.d();
        m mVar = m.f7301a;
        if (mVarD == mVar && v10.e() == mVar) {
            return new W<>(v10, n.a.g());
        }
        if (v10.d() == mVar && v10.e() == m.f7302b) {
            return new W<>(v10, p.a.g());
        }
        m mVarD2 = v10.d();
        m mVar2 = m.f7302b;
        if (mVarD2 == mVar2 && v10.e() == mVar) {
            return new W<>(v10, t.a.g());
        }
        if (v10.d() == mVar2 && v10.e() == mVar2) {
            return new W<>(v10, v.a.g());
        }
        throw new AssertionError();
    }

    V c(E e10) {
        if (e10.getKey() == null) {
            return null;
        }
        return (V) e10.getValue();
    }

    void g(E e10) {
        int iC = e10.c();
        j(iC).u(e10, iC);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void h(y<K, V, E> yVar) {
        h hVarA = yVar.a();
        int iC = hVarA.c();
        j(iC).v(hVarA.getKey(), iC, yVar);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        De.p.q(k10);
        De.p.q(v10);
        int iD = d(k10);
        return j(iD).t(k10, iD, v10, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k10, V v10) {
        De.p.q(k10);
        De.p.q(v10);
        int iD = d(k10);
        return j(iD).t(k10, iD, v10, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int iD = d(obj);
        return j(iD).y(obj, iD, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k10, V v10) {
        De.p.q(k10);
        De.p.q(v10);
        int iD = d(k10);
        return j(iD).A(k10, iD, v10);
    }
}
