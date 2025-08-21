package hf;

import gf.AbstractC14355b;
import gf.C14359f;
import hf.s.h;
import hf.s.m;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import kf.C15122a;

/* loaded from: classes8.dex */
class s<K, V, E extends h<K, V, E>, S extends m<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {

    /* renamed from: j, reason: collision with root package name */
    static final z<Object, Object, d> f135380j = new C14519a();

    /* renamed from: a, reason: collision with root package name */
    final transient int f135381a;

    /* renamed from: b, reason: collision with root package name */
    final transient int f135382b;

    /* renamed from: c, reason: collision with root package name */
    final transient m<K, V, E, S>[] f135383c;

    /* renamed from: d, reason: collision with root package name */
    final int f135384d;

    /* renamed from: e, reason: collision with root package name */
    final AbstractC14355b<Object> f135385e;

    /* renamed from: f, reason: collision with root package name */
    final transient i<K, V, E, S> f135386f;

    /* renamed from: g, reason: collision with root package name */
    transient Set<K> f135387g;

    /* renamed from: h, reason: collision with root package name */
    transient Collection<V> f135388h;

    /* renamed from: i, reason: collision with root package name */
    transient Set<Map.Entry<K, V>> f135389i;

    static final class A<K, V, E extends h<K, V, E>> extends WeakReference<V> implements z<K, V, E> {

        /* renamed from: a, reason: collision with root package name */
        final E f135390a;

        @Override // hf.s.z
        public E a() {
            return this.f135390a;
        }

        @Override // hf.s.z
        public z<K, V, E> b(ReferenceQueue<V> referenceQueue, E e10) {
            return new A(referenceQueue, get(), e10);
        }

        A(ReferenceQueue<V> referenceQueue, V v10, E e10) {
            super(v10, referenceQueue);
            this.f135390a = e10;
        }
    }

    final class B extends AbstractC14516b<K, V> {

        /* renamed from: a, reason: collision with root package name */
        final K f135391a;

        /* renamed from: b, reason: collision with root package name */
        V f135392b;

        B(K k10, V v10) {
            this.f135391a = k10;
            this.f135392b = v10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (this.f135391a.equals(entry.getKey()) && this.f135392b.equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // hf.AbstractC14516b, java.util.Map.Entry
        public K getKey() {
            return this.f135391a;
        }

        @Override // hf.AbstractC14516b, java.util.Map.Entry
        public V getValue() {
            return this.f135392b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f135391a.hashCode() ^ this.f135392b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = (V) s.this.put(this.f135391a, v10);
            this.f135392b = v10;
            return v11;
        }
    }

    /* renamed from: hf.s$b, reason: case insensitive filesystem */
    static abstract class AbstractC14520b<K, V, E extends h<K, V, E>> implements h<K, V, E> {

        /* renamed from: a, reason: collision with root package name */
        final K f135394a;

        /* renamed from: b, reason: collision with root package name */
        final int f135395b;

        /* renamed from: c, reason: collision with root package name */
        final E f135396c;

        @Override // hf.s.h
        public E a() {
            return this.f135396c;
        }

        @Override // hf.s.h
        public int c() {
            return this.f135395b;
        }

        @Override // hf.s.h
        public K getKey() {
            return this.f135394a;
        }

        AbstractC14520b(K k10, int i10, E e10) {
            this.f135394a = k10;
            this.f135395b = i10;
            this.f135396c = e10;
        }
    }

    static abstract class c<K, V, E extends h<K, V, E>> extends WeakReference<K> implements h<K, V, E> {

        /* renamed from: a, reason: collision with root package name */
        final int f135397a;

        /* renamed from: b, reason: collision with root package name */
        final E f135398b;

        @Override // hf.s.h
        public E a() {
            return this.f135398b;
        }

        @Override // hf.s.h
        public int c() {
            return this.f135397a;
        }

        c(ReferenceQueue<K> referenceQueue, K k10, int i10, E e10) {
            super(k10, referenceQueue);
            this.f135397a = i10;
            this.f135398b = e10;
        }

        @Override // hf.s.h
        public K getKey() {
            return get();
        }
    }

    static final class d implements h<Object, Object, d> {
        @Override // hf.s.h
        public int c() {
            throw new AssertionError();
        }

        @Override // hf.s.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public d a() {
            throw new AssertionError();
        }

        @Override // hf.s.h
        public Object getKey() {
            throw new AssertionError();
        }

        @Override // hf.s.h
        public Object getValue() {
            throw new AssertionError();
        }

        private d() {
            throw new AssertionError();
        }
    }

    final class e extends s<K, V, E, S>.g<Map.Entry<K, V>> {
        e() {
            super();
        }

        @Override // java.util.Iterator
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return d();
        }
    }

    final class f extends l<Map.Entry<K, V>> {
        f() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            s.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = s.this.get(key)) != null && s.this.r().d(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return s.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && s.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return s.this.size();
        }
    }

    abstract class g<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        int f135401a;

        /* renamed from: b, reason: collision with root package name */
        int f135402b = -1;

        /* renamed from: c, reason: collision with root package name */
        m<K, V, E, S> f135403c;

        /* renamed from: d, reason: collision with root package name */
        AtomicReferenceArray<E> f135404d;

        /* renamed from: e, reason: collision with root package name */
        E f135405e;

        /* renamed from: f, reason: collision with root package name */
        s<K, V, E, S>.B f135406f;

        /* renamed from: g, reason: collision with root package name */
        s<K, V, E, S>.B f135407g;

        final void a() {
            this.f135406f = null;
            if (e() || f()) {
                return;
            }
            while (true) {
                int i10 = this.f135401a;
                if (i10 < 0) {
                    return;
                }
                m<K, V, E, S>[] mVarArr = s.this.f135383c;
                this.f135401a = i10 - 1;
                m<K, V, E, S> mVar = mVarArr[i10];
                this.f135403c = mVar;
                if (mVar.f135412b != 0) {
                    this.f135404d = this.f135403c.f135415e;
                    this.f135402b = r0.length() - 1;
                    if (f()) {
                        return;
                    }
                }
            }
        }

        g() {
            this.f135401a = s.this.f135383c.length - 1;
            a();
        }

        s<K, V, E, S>.B d() {
            s<K, V, E, S>.B b10 = this.f135406f;
            if (b10 == null) {
                throw new NoSuchElementException();
            }
            this.f135407g = b10;
            a();
            return this.f135407g;
        }

        boolean e() {
            E e10 = this.f135405e;
            if (e10 == null) {
                return false;
            }
            while (true) {
                this.f135405e = (E) e10.a();
                E e11 = this.f135405e;
                if (e11 == null) {
                    return false;
                }
                if (c(e11)) {
                    return true;
                }
                e10 = this.f135405e;
            }
        }

        boolean f() {
            while (true) {
                int i10 = this.f135402b;
                if (i10 < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f135404d;
                this.f135402b = i10 - 1;
                E e10 = atomicReferenceArray.get(i10);
                this.f135405e = e10;
                if (e10 != null && (c(e10) || e())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f135406f != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            C14517c.b(this.f135407g != null);
            s.this.remove(this.f135407g.getKey());
            this.f135407g = null;
        }

        boolean c(E e10) {
            try {
                Object key = e10.getKey();
                Object objD = s.this.d(e10);
                if (objD != null) {
                    this.f135406f = new B(key, objD);
                    this.f135403c.r();
                    return true;
                }
                this.f135403c.r();
                return false;
            } catch (Throwable th2) {
                this.f135403c.r();
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

    interface i<K, V, E extends h<K, V, E>, S extends m<K, V, E, S>> {
        n a();

        E b(S s10, E e10, E e11);

        void c(S s10, E e10, V v10);

        E d(S s10, K k10, int i10, E e10);

        S e(s<K, V, E, S> sVar, int i10, int i11);
    }

    final class j extends s<K, V, E, S>.g<K> {
        j() {
            super();
        }

        @Override // java.util.Iterator
        public K next() {
            return d().getKey();
        }
    }

    final class k extends l<K> {
        k() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            s.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return s.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return s.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return s.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return s.this.size();
        }
    }

    private static abstract class l<E> extends AbstractSet<E> {
        private l() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return s.n(this).toArray();
        }

        /* synthetic */ l(C14519a c14519a) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) s.n(this).toArray(tArr);
        }
    }

    static abstract class m<K, V, E extends h<K, V, E>, S extends m<K, V, E, S>> extends ReentrantLock {

        /* renamed from: a, reason: collision with root package name */
        final s<K, V, E, S> f135411a;

        /* renamed from: b, reason: collision with root package name */
        volatile int f135412b;

        /* renamed from: c, reason: collision with root package name */
        int f135413c;

        /* renamed from: d, reason: collision with root package name */
        int f135414d;

        /* renamed from: e, reason: collision with root package name */
        volatile AtomicReferenceArray<E> f135415e;

        /* renamed from: f, reason: collision with root package name */
        final int f135416f;

        /* renamed from: g, reason: collision with root package name */
        final AtomicInteger f135417g = new AtomicInteger();

        abstract S E();

        void e(ReferenceQueue<K> referenceQueue) {
            int i10 = 0;
            do {
                Reference<? extends K> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.f135411a.h((h) referencePoll);
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
                this.f135411a.i((z) referencePoll);
                i10++;
            } while (i10 != 16);
        }

        void o() {
        }

        void p() {
        }

        void F(E e10, V v10) {
            this.f135411a.f135386f.c(E(), e10, v10);
        }

        void a() {
            if (this.f135412b != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f135415e;
                    for (int i10 = 0; i10 < atomicReferenceArray.length(); i10++) {
                        atomicReferenceArray.set(i10, null);
                    }
                    o();
                    this.f135417g.set(0);
                    this.f135413c++;
                    this.f135412b = 0;
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
                if (this.f135412b == 0) {
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
            return (E) this.f135411a.f135386f.b(E(), e10, e11);
        }

        void g() {
            AtomicReferenceArray<E> atomicReferenceArray = this.f135415e;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i10 = this.f135412b;
            AtomicReferenceArray<E> atomicReferenceArrayQ = q(length << 1);
            this.f135414d = (atomicReferenceArrayQ.length() * 3) / 4;
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
            this.f135415e = atomicReferenceArrayQ;
            this.f135412b = i10;
        }

        E i(Object obj, int i10) {
            if (this.f135412b == 0) {
                return null;
            }
            for (E e10 = (E) j(i10); e10 != null; e10 = (E) e10.a()) {
                if (e10.c() == i10) {
                    Object key = e10.getKey();
                    if (key == null) {
                        G();
                    } else if (this.f135411a.f135385e.d(obj, key)) {
                        return e10;
                    }
                }
            }
            return null;
        }

        E j(int i10) {
            return this.f135415e.get(i10 & (r0.length() - 1));
        }

        AtomicReferenceArray<E> q(int i10) {
            return new AtomicReferenceArray<>(i10);
        }

        void r() {
            if ((this.f135417g.incrementAndGet() & 63) == 0) {
                C();
            }
        }

        E z(E e10, E e11) {
            int i10 = this.f135412b;
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
            this.f135412b = i10;
            return e12;
        }

        m(s<K, V, E, S> sVar, int i10, int i11) {
            this.f135411a = sVar;
            this.f135416f = i11;
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
                AtomicReferenceArray<E> atomicReferenceArray = this.f135415e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                h hVar = (h) atomicReferenceArray.get(length);
                for (h hVarA = hVar; hVarA != null; hVarA = hVarA.a()) {
                    Object key = hVarA.getKey();
                    if (hVarA.c() == i10 && key != null && this.f135411a.f135385e.d(k10, key)) {
                        V v11 = (V) hVarA.getValue();
                        if (v11 == null) {
                            if (n(hVarA)) {
                                this.f135413c++;
                                h hVarZ = z(hVar, hVarA);
                                int i11 = this.f135412b - 1;
                                atomicReferenceArray.set(length, hVarZ);
                                this.f135412b = i11;
                            }
                            return null;
                        }
                        this.f135413c++;
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
                AtomicReferenceArray<E> atomicReferenceArray = this.f135415e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                h hVar = (h) atomicReferenceArray.get(length);
                for (h hVarA = hVar; hVarA != null; hVarA = hVarA.a()) {
                    Object key = hVarA.getKey();
                    if (hVarA.c() == i10 && key != null && this.f135411a.f135385e.d(k10, key)) {
                        Object value = hVarA.getValue();
                        if (value == null) {
                            if (n(hVarA)) {
                                this.f135413c++;
                                h hVarZ = z(hVar, hVarA);
                                int i11 = this.f135412b - 1;
                                atomicReferenceArray.set(length, hVarZ);
                                this.f135412b = i11;
                            }
                            return false;
                        }
                        if (!this.f135411a.r().d(v10, value)) {
                            return false;
                        }
                        this.f135413c++;
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
                    this.f135417g.set(0);
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
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.f135414d = length;
            if (length == this.f135416f) {
                this.f135414d = length + 1;
            }
            this.f135415e = atomicReferenceArray;
        }

        void s() {
            D();
        }

        V t(K k10, int i10, V v10, boolean z10) {
            lock();
            try {
                s();
                int i11 = this.f135412b + 1;
                if (i11 > this.f135414d) {
                    g();
                    i11 = this.f135412b + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f135415e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                h hVar = (h) atomicReferenceArray.get(length);
                for (h hVarA = hVar; hVarA != null; hVarA = hVarA.a()) {
                    Object key = hVarA.getKey();
                    if (hVarA.c() == i10 && key != null && this.f135411a.f135385e.d(k10, key)) {
                        V v11 = (V) hVarA.getValue();
                        if (v11 == null) {
                            this.f135413c++;
                            F(hVarA, v10);
                            this.f135412b = this.f135412b;
                            unlock();
                            return null;
                        }
                        if (z10) {
                            unlock();
                            return v11;
                        }
                        this.f135413c++;
                        F(hVarA, v10);
                        unlock();
                        return v11;
                    }
                }
                this.f135413c++;
                h hVarD = this.f135411a.f135386f.d(E(), k10, i10, hVar);
                F(hVarD, v10);
                atomicReferenceArray.set(length, hVarD);
                this.f135412b = i11;
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
                AtomicReferenceArray<E> atomicReferenceArray = this.f135415e;
                int length = i10 & (atomicReferenceArray.length() - 1);
                h hVar = (h) atomicReferenceArray.get(length);
                for (h hVarA = hVar; hVarA != null; hVarA = hVarA.a()) {
                    if (hVarA == e10) {
                        this.f135413c++;
                        h hVarZ = z(hVar, hVarA);
                        int i11 = this.f135412b - 1;
                        atomicReferenceArray.set(length, hVarZ);
                        this.f135412b = i11;
                        return true;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        boolean v(K k10, int i10, z<K, V, E> zVar) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f135415e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                h hVar = (h) atomicReferenceArray.get(length);
                for (h hVarA = hVar; hVarA != null; hVarA = hVarA.a()) {
                    Object key = hVarA.getKey();
                    if (hVarA.c() == i10 && key != null && this.f135411a.f135385e.d(k10, key)) {
                        if (((y) hVarA).b() != zVar) {
                            return false;
                        }
                        this.f135413c++;
                        h hVarZ = z(hVar, hVarA);
                        int i11 = this.f135412b - 1;
                        atomicReferenceArray.set(length, hVarZ);
                        this.f135412b = i11;
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
                AtomicReferenceArray<E> atomicReferenceArray = this.f135415e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                h hVar = (h) atomicReferenceArray.get(length);
                for (h hVarA = hVar; hVarA != null; hVarA = hVarA.a()) {
                    Object key = hVarA.getKey();
                    if (hVarA.c() == i10 && key != null && this.f135411a.f135385e.d(obj, key)) {
                        V v10 = (V) hVarA.getValue();
                        if (v10 == null && !n(hVarA)) {
                            return null;
                        }
                        this.f135413c++;
                        h hVarZ = z(hVar, hVarA);
                        int i11 = this.f135412b - 1;
                        atomicReferenceArray.set(length, hVarZ);
                        this.f135412b = i11;
                        return v10;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
        
            if (r8.f135411a.r().d(r11, r4.getValue()) == false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        
            r5 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        
            if (n(r4) == false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        
            r8.f135413c++;
            r9 = z(r3, r4);
            r10 = r8.f135412b - 1;
            r0.set(r1, r9);
            r8.f135412b = r10;
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
                java.util.concurrent.atomic.AtomicReferenceArray<E extends hf.s$h<K, V, E>> r0 = r8.f135415e     // Catch: java.lang.Throwable -> L5c
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L5c
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r10
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L5c
                hf.s$h r3 = (hf.s.h) r3     // Catch: java.lang.Throwable -> L5c
                r4 = r3
            L16:
                r5 = 0
                if (r4 == 0) goto L67
                java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Throwable -> L5c
                int r7 = r4.c()     // Catch: java.lang.Throwable -> L5c
                if (r7 != r10) goto L62
                if (r6 == 0) goto L62
                hf.s<K, V, E extends hf.s$h<K, V, E>, S extends hf.s$m<K, V, E, S>> r7 = r8.f135411a     // Catch: java.lang.Throwable -> L5c
                gf.b<java.lang.Object> r7 = r7.f135385e     // Catch: java.lang.Throwable -> L5c
                boolean r6 = r7.d(r9, r6)     // Catch: java.lang.Throwable -> L5c
                if (r6 == 0) goto L62
                java.lang.Object r9 = r4.getValue()     // Catch: java.lang.Throwable -> L5c
                hf.s<K, V, E extends hf.s$h<K, V, E>, S extends hf.s$m<K, V, E, S>> r10 = r8.f135411a     // Catch: java.lang.Throwable -> L5c
                gf.b r10 = r10.r()     // Catch: java.lang.Throwable -> L5c
                boolean r9 = r10.d(r11, r9)     // Catch: java.lang.Throwable -> L5c
                if (r9 == 0) goto L41
                r5 = r2
                goto L47
            L41:
                boolean r9 = n(r4)     // Catch: java.lang.Throwable -> L5c
                if (r9 == 0) goto L5e
            L47:
                int r9 = r8.f135413c     // Catch: java.lang.Throwable -> L5c
                int r9 = r9 + r2
                r8.f135413c = r9     // Catch: java.lang.Throwable -> L5c
                hf.s$h r9 = r8.z(r3, r4)     // Catch: java.lang.Throwable -> L5c
                int r10 = r8.f135412b     // Catch: java.lang.Throwable -> L5c
                int r10 = r10 - r2
                r0.set(r1, r9)     // Catch: java.lang.Throwable -> L5c
                r8.f135412b = r10     // Catch: java.lang.Throwable -> L5c
                r8.unlock()
                return r5
            L5c:
                r9 = move-exception
                goto L6b
            L5e:
                r8.unlock()
                return r5
            L62:
                hf.s$h r4 = r4.a()     // Catch: java.lang.Throwable -> L5c
                goto L16
            L67:
                r8.unlock()
                return r5
            L6b:
                r8.unlock()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: hf.s.m.y(java.lang.Object, int, java.lang.Object):boolean");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static abstract class n {

        /* renamed from: a, reason: collision with root package name */
        public static final n f135418a;

        /* renamed from: b, reason: collision with root package name */
        public static final n f135419b;

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ n[] f135420c;

        private n(String str, int i10) {
        }

        abstract AbstractC14355b<Object> a();

        enum a extends n {
            a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // hf.s.n
            AbstractC14355b<Object> a() {
                return AbstractC14355b.c();
            }
        }

        enum b extends n {
            b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // hf.s.n
            AbstractC14355b<Object> a() {
                return AbstractC14355b.f();
            }
        }

        static {
            a aVar = new a("STRONG", 0);
            f135418a = aVar;
            b bVar = new b("WEAK", 1);
            f135419b = bVar;
            f135420c = new n[]{aVar, bVar};
        }

        /* synthetic */ n(String str, int i10, C14519a c14519a) {
            this(str, i10);
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) f135420c.clone();
        }
    }

    static final class o<K, V> extends AbstractC14520b<K, V, o<K, V>> implements h {

        /* renamed from: d, reason: collision with root package name */
        private volatile V f135421d;

        static final class a<K, V> implements i<K, V, o<K, V>, p<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f135422a = new a<>();

            static <K, V> a<K, V> g() {
                return (a<K, V>) f135422a;
            }

            @Override // hf.s.i
            public n a() {
                return n.f135418a;
            }

            @Override // hf.s.i
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public o<K, V> d(p<K, V> pVar, K k10, int i10, o<K, V> oVar) {
                return new o<>(k10, i10, oVar);
            }

            @Override // hf.s.i
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public p<K, V> e(s<K, V, o<K, V>, p<K, V>> sVar, int i10, int i11) {
                return new p<>(sVar, i10, i11);
            }

            a() {
            }

            @Override // hf.s.i
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public o<K, V> b(p<K, V> pVar, o<K, V> oVar, o<K, V> oVar2) {
                return oVar.d(oVar2);
            }

            @Override // hf.s.i
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public void c(p<K, V> pVar, o<K, V> oVar, V v10) {
                oVar.e(v10);
            }
        }

        o<K, V> d(o<K, V> oVar) {
            o<K, V> oVar2 = new o<>(this.f135394a, this.f135395b, oVar);
            oVar2.f135421d = this.f135421d;
            return oVar2;
        }

        void e(V v10) {
            this.f135421d = v10;
        }

        @Override // hf.s.h
        public V getValue() {
            return this.f135421d;
        }

        o(K k10, int i10, o<K, V> oVar) {
            super(k10, i10, oVar);
            this.f135421d = null;
        }
    }

    static final class q<K, V> extends AbstractC14520b<K, V, q<K, V>> implements y<K, V, q<K, V>> {

        /* renamed from: d, reason: collision with root package name */
        private volatile z<K, V, q<K, V>> f135423d;

        static final class a<K, V> implements i<K, V, q<K, V>, r<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f135424a = new a<>();

            static <K, V> a<K, V> g() {
                return (a<K, V>) f135424a;
            }

            @Override // hf.s.i
            public n a() {
                return n.f135419b;
            }

            @Override // hf.s.i
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public q<K, V> d(r<K, V> rVar, K k10, int i10, q<K, V> qVar) {
                return new q<>(k10, i10, qVar);
            }

            @Override // hf.s.i
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public r<K, V> e(s<K, V, q<K, V>, r<K, V>> sVar, int i10, int i11) {
                return new r<>(sVar, i10, i11);
            }

            a() {
            }

            @Override // hf.s.i
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public q<K, V> b(r<K, V> rVar, q<K, V> qVar, q<K, V> qVar2) {
                if (m.n(qVar)) {
                    return null;
                }
                return qVar.d(((r) rVar).f135425h, qVar2);
            }

            @Override // hf.s.i
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public void c(r<K, V> rVar, q<K, V> qVar, V v10) {
                qVar.e(v10, ((r) rVar).f135425h);
            }
        }

        @Override // hf.s.y
        public z<K, V, q<K, V>> b() {
            return this.f135423d;
        }

        q<K, V> d(ReferenceQueue<V> referenceQueue, q<K, V> qVar) {
            q<K, V> qVar2 = new q<>(this.f135394a, this.f135395b, qVar);
            qVar2.f135423d = this.f135423d.b(referenceQueue, qVar2);
            return qVar2;
        }

        void e(V v10, ReferenceQueue<V> referenceQueue) {
            z<K, V, q<K, V>> zVar = this.f135423d;
            this.f135423d = new A(referenceQueue, v10, this);
            zVar.clear();
        }

        @Override // hf.s.h
        public V getValue() {
            return this.f135423d.get();
        }

        q(K k10, int i10, q<K, V> qVar) {
            super(k10, i10, qVar);
            this.f135423d = s.q();
        }
    }

    static final class r<K, V> extends m<K, V, q<K, V>, r<K, V>> {

        /* renamed from: h, reason: collision with root package name */
        private final ReferenceQueue<V> f135425h;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // hf.s.m
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public r<K, V> E() {
            return this;
        }

        @Override // hf.s.m
        void o() {
            b(this.f135425h);
        }

        @Override // hf.s.m
        void p() {
            f(this.f135425h);
        }

        r(s<K, V, q<K, V>, r<K, V>> sVar, int i10, int i11) {
            super(sVar, i10, i11);
            this.f135425h = new ReferenceQueue<>();
        }
    }

    /* renamed from: hf.s$s, reason: collision with other inner class name */
    final class C2137s extends s<K, V, E, S>.g<V> {
        C2137s() {
            super();
        }

        @Override // java.util.Iterator
        public V next() {
            return d().getValue();
        }
    }

    final class t extends AbstractCollection<V> {
        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return s.n(this).toArray();
        }

        t() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            s.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return s.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return s.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new C2137s();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return s.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) s.n(this).toArray(tArr);
        }
    }

    static final class u<K, V> extends c<K, V, u<K, V>> implements h {

        /* renamed from: c, reason: collision with root package name */
        private volatile V f135428c;

        static final class a<K, V> implements i<K, V, u<K, V>, v<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f135429a = new a<>();

            static <K, V> a<K, V> g() {
                return (a<K, V>) f135429a;
            }

            @Override // hf.s.i
            public n a() {
                return n.f135418a;
            }

            @Override // hf.s.i
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public u<K, V> d(v<K, V> vVar, K k10, int i10, u<K, V> uVar) {
                return new u<>(((v) vVar).f135430h, k10, i10, uVar);
            }

            @Override // hf.s.i
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public v<K, V> e(s<K, V, u<K, V>, v<K, V>> sVar, int i10, int i11) {
                return new v<>(sVar, i10, i11);
            }

            a() {
            }

            @Override // hf.s.i
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public u<K, V> b(v<K, V> vVar, u<K, V> uVar, u<K, V> uVar2) {
                if (uVar.getKey() == null) {
                    return null;
                }
                return uVar.d(((v) vVar).f135430h, uVar2);
            }

            @Override // hf.s.i
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public void c(v<K, V> vVar, u<K, V> uVar, V v10) {
                uVar.e(v10);
            }
        }

        u<K, V> d(ReferenceQueue<K> referenceQueue, u<K, V> uVar) {
            u<K, V> uVar2 = new u<>(referenceQueue, getKey(), this.f135397a, uVar);
            uVar2.e(this.f135428c);
            return uVar2;
        }

        void e(V v10) {
            this.f135428c = v10;
        }

        @Override // hf.s.h
        public V getValue() {
            return this.f135428c;
        }

        u(ReferenceQueue<K> referenceQueue, K k10, int i10, u<K, V> uVar) {
            super(referenceQueue, k10, i10, uVar);
            this.f135428c = null;
        }
    }

    static final class v<K, V> extends m<K, V, u<K, V>, v<K, V>> {

        /* renamed from: h, reason: collision with root package name */
        private final ReferenceQueue<K> f135430h;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // hf.s.m
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public v<K, V> E() {
            return this;
        }

        @Override // hf.s.m
        void o() {
            b(this.f135430h);
        }

        @Override // hf.s.m
        void p() {
            e(this.f135430h);
        }

        v(s<K, V, u<K, V>, v<K, V>> sVar, int i10, int i11) {
            super(sVar, i10, i11);
            this.f135430h = new ReferenceQueue<>();
        }
    }

    static final class w<K, V> extends c<K, V, w<K, V>> implements y<K, V, w<K, V>> {

        /* renamed from: c, reason: collision with root package name */
        private volatile z<K, V, w<K, V>> f135431c;

        static final class a<K, V> implements i<K, V, w<K, V>, x<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f135432a = new a<>();

            static <K, V> a<K, V> g() {
                return (a<K, V>) f135432a;
            }

            @Override // hf.s.i
            public n a() {
                return n.f135419b;
            }

            @Override // hf.s.i
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public w<K, V> d(x<K, V> xVar, K k10, int i10, w<K, V> wVar) {
                return new w<>(((x) xVar).f135433h, k10, i10, wVar);
            }

            @Override // hf.s.i
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public x<K, V> e(s<K, V, w<K, V>, x<K, V>> sVar, int i10, int i11) {
                return new x<>(sVar, i10, i11);
            }

            a() {
            }

            @Override // hf.s.i
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public w<K, V> b(x<K, V> xVar, w<K, V> wVar, w<K, V> wVar2) {
                if (wVar.getKey() == null || m.n(wVar)) {
                    return null;
                }
                return wVar.d(((x) xVar).f135433h, ((x) xVar).f135434i, wVar2);
            }

            @Override // hf.s.i
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public void c(x<K, V> xVar, w<K, V> wVar, V v10) {
                wVar.e(v10, ((x) xVar).f135434i);
            }
        }

        @Override // hf.s.y
        public z<K, V, w<K, V>> b() {
            return this.f135431c;
        }

        w<K, V> d(ReferenceQueue<K> referenceQueue, ReferenceQueue<V> referenceQueue2, w<K, V> wVar) {
            w<K, V> wVar2 = new w<>(referenceQueue, getKey(), this.f135397a, wVar);
            wVar2.f135431c = this.f135431c.b(referenceQueue2, wVar2);
            return wVar2;
        }

        void e(V v10, ReferenceQueue<V> referenceQueue) {
            z<K, V, w<K, V>> zVar = this.f135431c;
            this.f135431c = new A(referenceQueue, v10, this);
            zVar.clear();
        }

        @Override // hf.s.h
        public V getValue() {
            return this.f135431c.get();
        }

        w(ReferenceQueue<K> referenceQueue, K k10, int i10, w<K, V> wVar) {
            super(referenceQueue, k10, i10, wVar);
            this.f135431c = s.q();
        }
    }

    static final class x<K, V> extends m<K, V, w<K, V>, x<K, V>> {

        /* renamed from: h, reason: collision with root package name */
        private final ReferenceQueue<K> f135433h;

        /* renamed from: i, reason: collision with root package name */
        private final ReferenceQueue<V> f135434i;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // hf.s.m
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public x<K, V> E() {
            return this;
        }

        @Override // hf.s.m
        void o() {
            b(this.f135433h);
        }

        @Override // hf.s.m
        void p() {
            e(this.f135433h);
            f(this.f135434i);
        }

        x(s<K, V, w<K, V>, x<K, V>> sVar, int i10, int i11) {
            super(sVar, i10, i11);
            this.f135433h = new ReferenceQueue<>();
            this.f135434i = new ReferenceQueue<>();
        }
    }

    interface y<K, V, E extends h<K, V, E>> extends h<K, V, E> {
        z<K, V, E> b();
    }

    interface z<K, V, E extends h<K, V, E>> {
        E a();

        z<K, V, E> b(ReferenceQueue<V> referenceQueue, E e10);

        void clear();

        V get();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iF = f(obj);
        return k(iF).x(obj, iF);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k10, V v10, V v11) {
        C14359f.h(k10);
        C14359f.h(v11);
        if (v10 == null) {
            return false;
        }
        int iF = f(k10);
        return k(iF).B(k10, iF, v10, v11);
    }

    /* renamed from: hf.s$a, reason: case insensitive filesystem */
    static class C14519a implements z<Object, Object, d> {
        @Override // hf.s.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public z<Object, Object, d> b(ReferenceQueue<Object> referenceQueue, d dVar) {
            return this;
        }

        @Override // hf.s.z
        public void clear() {
        }

        @Override // hf.s.z
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public d a() {
            return null;
        }

        @Override // hf.s.z
        public Object get() {
            return null;
        }

        C14519a() {
        }
    }

    static final class p<K, V> extends m<K, V, o<K, V>, p<K, V>> {
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // hf.s.m
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public p<K, V> E() {
            return this;
        }

        p(s<K, V, o<K, V>, p<K, V>> sVar, int i10, int i11) {
            super(sVar, i10, i11);
        }
    }

    static int j(int i10) {
        int i11 = i10 + ((i10 << 15) ^ (-12931));
        int i12 = i11 ^ (i11 >>> 10);
        int i13 = i12 + (i12 << 3);
        int i14 = i13 ^ (i13 >>> 6);
        int i15 = i14 + (i14 << 2) + (i14 << 14);
        return i15 ^ (i15 >>> 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> ArrayList<E> n(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        hf.o.a(arrayList, collection.iterator());
        return arrayList;
    }

    static <K, V, E extends h<K, V, E>> z<K, V, E> q() {
        return (z<K, V, E>) f135380j;
    }

    m<K, V, E, S> c(int i10, int i11) {
        return this.f135386f.e(this, i10, i11);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (m<K, V, E, S> mVar : this.f135383c) {
            mVar.a();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int iF = f(obj);
        return k(iF).c(obj, iF);
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
        m<K, V, E, S>[] mVarArr = this.f135383c;
        long j10 = -1;
        int i10 = 0;
        while (i10 < 3) {
            int length = mVarArr.length;
            long j11 = 0;
            for (?? r10 = z10; r10 < length; r10++) {
                m<K, V, E, S> mVar = mVarArr[r10];
                int i11 = mVar.f135412b;
                AtomicReferenceArray<E> atomicReferenceArray = mVar.f135415e;
                for (?? r13 = z10; r13 < atomicReferenceArray.length(); r13++) {
                    E eA = atomicReferenceArray.get(r13);
                    while (eA != null) {
                        V vL = mVar.l(eA);
                        boolean z11 = z10;
                        if (vL != null && r().d(obj, vL)) {
                            return true;
                        }
                        eA = eA.a();
                        z10 = z11;
                    }
                }
                j11 += mVar.f135413c;
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

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f135389i;
        if (set != null) {
            return set;
        }
        f fVar = new f();
        this.f135389i = fVar;
        return fVar;
    }

    int f(Object obj) {
        return j(this.f135385e.e(obj));
    }

    final m<K, V, E, S>[] g(int i10) {
        return new m[i10];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iF = f(obj);
        return k(iF).h(obj, iF);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        m<K, V, E, S>[] mVarArr = this.f135383c;
        long j10 = 0;
        for (int i10 = 0; i10 < mVarArr.length; i10++) {
            if (mVarArr[i10].f135412b != 0) {
                return false;
            }
            j10 += mVarArr[i10].f135413c;
        }
        if (j10 == 0) {
            return true;
        }
        for (int i11 = 0; i11 < mVarArr.length; i11++) {
            if (mVarArr[i11].f135412b != 0) {
                return false;
            }
            j10 -= mVarArr[i11].f135413c;
        }
        return j10 == 0;
    }

    m<K, V, E, S> k(int i10) {
        return this.f135383c[(i10 >>> this.f135382b) & this.f135381a];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f135387g;
        if (set != null) {
            return set;
        }
        k kVar = new k();
        this.f135387g = kVar;
        return kVar;
    }

    AbstractC14355b<Object> r() {
        return this.f135386f.a().a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j10 = 0;
        for (int i10 = 0; i10 < this.f135383c.length; i10++) {
            j10 += r0[i10].f135412b;
        }
        return C15122a.a(j10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f135388h;
        if (collection != null) {
            return collection;
        }
        t tVar = new t();
        this.f135388h = tVar;
        return tVar;
    }

    private s(hf.r rVar, i<K, V, E, S> iVar) {
        this.f135384d = Math.min(rVar.a(), 65536);
        this.f135385e = rVar.c();
        this.f135386f = iVar;
        int iMin = Math.min(rVar.b(), 1073741824);
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        int i13 = 1;
        while (i13 < this.f135384d) {
            i12++;
            i13 <<= 1;
        }
        this.f135382b = 32 - i12;
        this.f135381a = i13 - 1;
        this.f135383c = g(i13);
        int i14 = iMin / i13;
        while (i11 < (i13 * i14 < iMin ? i14 + 1 : i14)) {
            i11 <<= 1;
        }
        while (true) {
            m<K, V, E, S>[] mVarArr = this.f135383c;
            if (i10 < mVarArr.length) {
                mVarArr[i10] = c(i11, -1);
                i10++;
            } else {
                return;
            }
        }
    }

    static <K, V> s<K, V, ? extends h<K, V, ?>, ?> b(hf.r rVar) {
        n nVarD = rVar.d();
        n nVar = n.f135418a;
        if (nVarD == nVar && rVar.e() == nVar) {
            return new s<>(rVar, o.a.g());
        }
        if (rVar.d() == nVar && rVar.e() == n.f135419b) {
            return new s<>(rVar, q.a.g());
        }
        n nVarD2 = rVar.d();
        n nVar2 = n.f135419b;
        if (nVarD2 == nVar2 && rVar.e() == nVar) {
            return new s<>(rVar, u.a.g());
        }
        if (rVar.d() == nVar2 && rVar.e() == nVar2) {
            return new s<>(rVar, w.a.g());
        }
        throw new AssertionError();
    }

    V d(E e10) {
        V v10;
        if (e10.getKey() == null || (v10 = (V) e10.getValue()) == null) {
            return null;
        }
        return v10;
    }

    void h(E e10) {
        int iC = e10.c();
        k(iC).u(e10, iC);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void i(z<K, V, E> zVar) {
        h hVarA = zVar.a();
        int iC = hVarA.c();
        k(iC).v(hVarA.getKey(), iC, zVar);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        C14359f.h(k10);
        C14359f.h(v10);
        int iF = f(k10);
        return k(iF).t(k10, iF, v10, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k10, V v10) {
        C14359f.h(k10);
        C14359f.h(v10);
        int iF = f(k10);
        return k(iF).t(k10, iF, v10, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int iF = f(obj);
        return k(iF).y(obj, iF, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k10, V v10) {
        C14359f.h(k10);
        C14359f.h(v10);
        int iF = f(k10);
        return k(iF).A(k10, iF, v10);
    }
}
