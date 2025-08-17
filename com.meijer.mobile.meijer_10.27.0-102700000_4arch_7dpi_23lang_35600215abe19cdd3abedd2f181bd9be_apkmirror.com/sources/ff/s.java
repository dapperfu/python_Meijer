package ff;

import ef.AbstractC13651b;
import ef.C13655f;
import ff.s.h;
import ff.s.m;
import hf.C14426a;
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

/* loaded from: classes7.dex */
class s<K, V, E extends h<K, V, E>, S extends m<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {

    /* renamed from: j, reason: collision with root package name */
    static final z<Object, Object, d> f131034j = new C13889a();

    /* renamed from: a, reason: collision with root package name */
    final transient int f131035a;

    /* renamed from: b, reason: collision with root package name */
    final transient int f131036b;

    /* renamed from: c, reason: collision with root package name */
    final transient m<K, V, E, S>[] f131037c;

    /* renamed from: d, reason: collision with root package name */
    final int f131038d;

    /* renamed from: e, reason: collision with root package name */
    final AbstractC13651b<Object> f131039e;

    /* renamed from: f, reason: collision with root package name */
    final transient i<K, V, E, S> f131040f;

    /* renamed from: g, reason: collision with root package name */
    transient Set<K> f131041g;

    /* renamed from: h, reason: collision with root package name */
    transient Collection<V> f131042h;

    /* renamed from: i, reason: collision with root package name */
    transient Set<Map.Entry<K, V>> f131043i;

    static final class A<K, V, E extends h<K, V, E>> extends WeakReference<V> implements z<K, V, E> {

        /* renamed from: a, reason: collision with root package name */
        final E f131044a;

        @Override // ff.s.z
        public E a() {
            return this.f131044a;
        }

        @Override // ff.s.z
        public z<K, V, E> b(ReferenceQueue<V> referenceQueue, E e10) {
            return new A(referenceQueue, get(), e10);
        }

        A(ReferenceQueue<V> referenceQueue, V v10, E e10) {
            super(v10, referenceQueue);
            this.f131044a = e10;
        }
    }

    final class B extends AbstractC13886b<K, V> {

        /* renamed from: a, reason: collision with root package name */
        final K f131045a;

        /* renamed from: b, reason: collision with root package name */
        V f131046b;

        B(K k10, V v10) {
            this.f131045a = k10;
            this.f131046b = v10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (this.f131045a.equals(entry.getKey()) && this.f131046b.equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // ff.AbstractC13886b, java.util.Map.Entry
        public K getKey() {
            return this.f131045a;
        }

        @Override // ff.AbstractC13886b, java.util.Map.Entry
        public V getValue() {
            return this.f131046b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f131045a.hashCode() ^ this.f131046b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = (V) s.this.put(this.f131045a, v10);
            this.f131046b = v10;
            return v11;
        }
    }

    /* renamed from: ff.s$b, reason: case insensitive filesystem */
    static abstract class AbstractC13890b<K, V, E extends h<K, V, E>> implements h<K, V, E> {

        /* renamed from: a, reason: collision with root package name */
        final K f131048a;

        /* renamed from: b, reason: collision with root package name */
        final int f131049b;

        /* renamed from: c, reason: collision with root package name */
        final E f131050c;

        @Override // ff.s.h
        public E a() {
            return this.f131050c;
        }

        @Override // ff.s.h
        public int c() {
            return this.f131049b;
        }

        @Override // ff.s.h
        public K getKey() {
            return this.f131048a;
        }

        AbstractC13890b(K k10, int i10, E e10) {
            this.f131048a = k10;
            this.f131049b = i10;
            this.f131050c = e10;
        }
    }

    static abstract class c<K, V, E extends h<K, V, E>> extends WeakReference<K> implements h<K, V, E> {

        /* renamed from: a, reason: collision with root package name */
        final int f131051a;

        /* renamed from: b, reason: collision with root package name */
        final E f131052b;

        @Override // ff.s.h
        public E a() {
            return this.f131052b;
        }

        @Override // ff.s.h
        public int c() {
            return this.f131051a;
        }

        c(ReferenceQueue<K> referenceQueue, K k10, int i10, E e10) {
            super(k10, referenceQueue);
            this.f131051a = i10;
            this.f131052b = e10;
        }

        @Override // ff.s.h
        public K getKey() {
            return get();
        }
    }

    static final class d implements h<Object, Object, d> {
        @Override // ff.s.h
        public int c() {
            throw new AssertionError();
        }

        @Override // ff.s.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public d a() {
            throw new AssertionError();
        }

        @Override // ff.s.h
        public Object getKey() {
            throw new AssertionError();
        }

        @Override // ff.s.h
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
        int f131055a;

        /* renamed from: b, reason: collision with root package name */
        int f131056b = -1;

        /* renamed from: c, reason: collision with root package name */
        m<K, V, E, S> f131057c;

        /* renamed from: d, reason: collision with root package name */
        AtomicReferenceArray<E> f131058d;

        /* renamed from: e, reason: collision with root package name */
        E f131059e;

        /* renamed from: f, reason: collision with root package name */
        s<K, V, E, S>.B f131060f;

        /* renamed from: g, reason: collision with root package name */
        s<K, V, E, S>.B f131061g;

        final void a() {
            this.f131060f = null;
            if (e() || f()) {
                return;
            }
            while (true) {
                int i10 = this.f131055a;
                if (i10 < 0) {
                    return;
                }
                m<K, V, E, S>[] mVarArr = s.this.f131037c;
                this.f131055a = i10 - 1;
                m<K, V, E, S> mVar = mVarArr[i10];
                this.f131057c = mVar;
                if (mVar.f131066b != 0) {
                    this.f131058d = this.f131057c.f131069e;
                    this.f131056b = r0.length() - 1;
                    if (f()) {
                        return;
                    }
                }
            }
        }

        g() {
            this.f131055a = s.this.f131037c.length - 1;
            a();
        }

        s<K, V, E, S>.B d() {
            s<K, V, E, S>.B b10 = this.f131060f;
            if (b10 == null) {
                throw new NoSuchElementException();
            }
            this.f131061g = b10;
            a();
            return this.f131061g;
        }

        boolean e() {
            E e10 = this.f131059e;
            if (e10 == null) {
                return false;
            }
            while (true) {
                this.f131059e = (E) e10.a();
                E e11 = this.f131059e;
                if (e11 == null) {
                    return false;
                }
                if (c(e11)) {
                    return true;
                }
                e10 = this.f131059e;
            }
        }

        boolean f() {
            while (true) {
                int i10 = this.f131056b;
                if (i10 < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f131058d;
                this.f131056b = i10 - 1;
                E e10 = atomicReferenceArray.get(i10);
                this.f131059e = e10;
                if (e10 != null && (c(e10) || e())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f131060f != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            C13887c.b(this.f131061g != null);
            s.this.remove(this.f131061g.getKey());
            this.f131061g = null;
        }

        boolean c(E e10) {
            try {
                Object key = e10.getKey();
                Object objD = s.this.d(e10);
                if (objD != null) {
                    this.f131060f = new B(key, objD);
                    this.f131057c.r();
                    return true;
                }
                this.f131057c.r();
                return false;
            } catch (Throwable th2) {
                this.f131057c.r();
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

        void b(S s10, E e10, V v10);

        S c(s<K, V, E, S> sVar, int i10, int i11);

        E d(S s10, E e10, E e11);

        E e(S s10, K k10, int i10, E e10);
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

        /* synthetic */ l(C13889a c13889a) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) s.n(this).toArray(tArr);
        }
    }

    static abstract class m<K, V, E extends h<K, V, E>, S extends m<K, V, E, S>> extends ReentrantLock {

        /* renamed from: a, reason: collision with root package name */
        final s<K, V, E, S> f131065a;

        /* renamed from: b, reason: collision with root package name */
        volatile int f131066b;

        /* renamed from: c, reason: collision with root package name */
        int f131067c;

        /* renamed from: d, reason: collision with root package name */
        int f131068d;

        /* renamed from: e, reason: collision with root package name */
        volatile AtomicReferenceArray<E> f131069e;

        /* renamed from: f, reason: collision with root package name */
        final int f131070f;

        /* renamed from: g, reason: collision with root package name */
        final AtomicInteger f131071g = new AtomicInteger();

        abstract S E();

        void e(ReferenceQueue<K> referenceQueue) {
            int i10 = 0;
            do {
                Reference<? extends K> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.f131065a.h((h) referencePoll);
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
                this.f131065a.i((z) referencePoll);
                i10++;
            } while (i10 != 16);
        }

        void o() {
        }

        void p() {
        }

        void F(E e10, V v10) {
            this.f131065a.f131040f.b(E(), e10, v10);
        }

        void a() {
            if (this.f131066b != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f131069e;
                    for (int i10 = 0; i10 < atomicReferenceArray.length(); i10++) {
                        atomicReferenceArray.set(i10, null);
                    }
                    o();
                    this.f131071g.set(0);
                    this.f131067c++;
                    this.f131066b = 0;
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
                if (this.f131066b == 0) {
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
            return (E) this.f131065a.f131040f.d(E(), e10, e11);
        }

        void g() {
            AtomicReferenceArray<E> atomicReferenceArray = this.f131069e;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i10 = this.f131066b;
            AtomicReferenceArray<E> atomicReferenceArrayQ = q(length << 1);
            this.f131068d = (atomicReferenceArrayQ.length() * 3) / 4;
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
            this.f131069e = atomicReferenceArrayQ;
            this.f131066b = i10;
        }

        E i(Object obj, int i10) {
            if (this.f131066b == 0) {
                return null;
            }
            for (E e10 = (E) j(i10); e10 != null; e10 = (E) e10.a()) {
                if (e10.c() == i10) {
                    Object key = e10.getKey();
                    if (key == null) {
                        G();
                    } else if (this.f131065a.f131039e.d(obj, key)) {
                        return e10;
                    }
                }
            }
            return null;
        }

        E j(int i10) {
            return this.f131069e.get(i10 & (r0.length() - 1));
        }

        AtomicReferenceArray<E> q(int i10) {
            return new AtomicReferenceArray<>(i10);
        }

        void r() {
            if ((this.f131071g.incrementAndGet() & 63) == 0) {
                C();
            }
        }

        E z(E e10, E e11) {
            int i10 = this.f131066b;
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
            this.f131066b = i10;
            return e12;
        }

        m(s<K, V, E, S> sVar, int i10, int i11) {
            this.f131065a = sVar;
            this.f131070f = i11;
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
                AtomicReferenceArray<E> atomicReferenceArray = this.f131069e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                h hVar = (h) atomicReferenceArray.get(length);
                for (h hVarA = hVar; hVarA != null; hVarA = hVarA.a()) {
                    Object key = hVarA.getKey();
                    if (hVarA.c() == i10 && key != null && this.f131065a.f131039e.d(k10, key)) {
                        V v11 = (V) hVarA.getValue();
                        if (v11 == null) {
                            if (n(hVarA)) {
                                this.f131067c++;
                                h hVarZ = z(hVar, hVarA);
                                int i11 = this.f131066b - 1;
                                atomicReferenceArray.set(length, hVarZ);
                                this.f131066b = i11;
                            }
                            return null;
                        }
                        this.f131067c++;
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
                AtomicReferenceArray<E> atomicReferenceArray = this.f131069e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                h hVar = (h) atomicReferenceArray.get(length);
                for (h hVarA = hVar; hVarA != null; hVarA = hVarA.a()) {
                    Object key = hVarA.getKey();
                    if (hVarA.c() == i10 && key != null && this.f131065a.f131039e.d(k10, key)) {
                        Object value = hVarA.getValue();
                        if (value == null) {
                            if (n(hVarA)) {
                                this.f131067c++;
                                h hVarZ = z(hVar, hVarA);
                                int i11 = this.f131066b - 1;
                                atomicReferenceArray.set(length, hVarZ);
                                this.f131066b = i11;
                            }
                            return false;
                        }
                        if (!this.f131065a.r().d(v10, value)) {
                            return false;
                        }
                        this.f131067c++;
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
                    this.f131071g.set(0);
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
            this.f131068d = length;
            if (length == this.f131070f) {
                this.f131068d = length + 1;
            }
            this.f131069e = atomicReferenceArray;
        }

        void s() {
            D();
        }

        V t(K k10, int i10, V v10, boolean z10) {
            lock();
            try {
                s();
                int i11 = this.f131066b + 1;
                if (i11 > this.f131068d) {
                    g();
                    i11 = this.f131066b + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f131069e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                h hVar = (h) atomicReferenceArray.get(length);
                for (h hVarA = hVar; hVarA != null; hVarA = hVarA.a()) {
                    Object key = hVarA.getKey();
                    if (hVarA.c() == i10 && key != null && this.f131065a.f131039e.d(k10, key)) {
                        V v11 = (V) hVarA.getValue();
                        if (v11 == null) {
                            this.f131067c++;
                            F(hVarA, v10);
                            this.f131066b = this.f131066b;
                            unlock();
                            return null;
                        }
                        if (z10) {
                            unlock();
                            return v11;
                        }
                        this.f131067c++;
                        F(hVarA, v10);
                        unlock();
                        return v11;
                    }
                }
                this.f131067c++;
                h hVarE = this.f131065a.f131040f.e(E(), k10, i10, hVar);
                F(hVarE, v10);
                atomicReferenceArray.set(length, hVarE);
                this.f131066b = i11;
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
                AtomicReferenceArray<E> atomicReferenceArray = this.f131069e;
                int length = i10 & (atomicReferenceArray.length() - 1);
                h hVar = (h) atomicReferenceArray.get(length);
                for (h hVarA = hVar; hVarA != null; hVarA = hVarA.a()) {
                    if (hVarA == e10) {
                        this.f131067c++;
                        h hVarZ = z(hVar, hVarA);
                        int i11 = this.f131066b - 1;
                        atomicReferenceArray.set(length, hVarZ);
                        this.f131066b = i11;
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
                AtomicReferenceArray<E> atomicReferenceArray = this.f131069e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                h hVar = (h) atomicReferenceArray.get(length);
                for (h hVarA = hVar; hVarA != null; hVarA = hVarA.a()) {
                    Object key = hVarA.getKey();
                    if (hVarA.c() == i10 && key != null && this.f131065a.f131039e.d(k10, key)) {
                        if (((y) hVarA).b() != zVar) {
                            return false;
                        }
                        this.f131067c++;
                        h hVarZ = z(hVar, hVarA);
                        int i11 = this.f131066b - 1;
                        atomicReferenceArray.set(length, hVarZ);
                        this.f131066b = i11;
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
                AtomicReferenceArray<E> atomicReferenceArray = this.f131069e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                h hVar = (h) atomicReferenceArray.get(length);
                for (h hVarA = hVar; hVarA != null; hVarA = hVarA.a()) {
                    Object key = hVarA.getKey();
                    if (hVarA.c() == i10 && key != null && this.f131065a.f131039e.d(obj, key)) {
                        V v10 = (V) hVarA.getValue();
                        if (v10 == null && !n(hVarA)) {
                            return null;
                        }
                        this.f131067c++;
                        h hVarZ = z(hVar, hVarA);
                        int i11 = this.f131066b - 1;
                        atomicReferenceArray.set(length, hVarZ);
                        this.f131066b = i11;
                        return v10;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
        
            if (r8.f131065a.r().d(r11, r4.getValue()) == false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        
            r5 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        
            if (n(r4) == false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        
            r8.f131067c++;
            r9 = z(r3, r4);
            r10 = r8.f131066b - 1;
            r0.set(r1, r9);
            r8.f131066b = r10;
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
                java.util.concurrent.atomic.AtomicReferenceArray<E extends ff.s$h<K, V, E>> r0 = r8.f131069e     // Catch: java.lang.Throwable -> L5c
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L5c
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r10
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L5c
                ff.s$h r3 = (ff.s.h) r3     // Catch: java.lang.Throwable -> L5c
                r4 = r3
            L16:
                r5 = 0
                if (r4 == 0) goto L67
                java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Throwable -> L5c
                int r7 = r4.c()     // Catch: java.lang.Throwable -> L5c
                if (r7 != r10) goto L62
                if (r6 == 0) goto L62
                ff.s<K, V, E extends ff.s$h<K, V, E>, S extends ff.s$m<K, V, E, S>> r7 = r8.f131065a     // Catch: java.lang.Throwable -> L5c
                ef.b<java.lang.Object> r7 = r7.f131039e     // Catch: java.lang.Throwable -> L5c
                boolean r6 = r7.d(r9, r6)     // Catch: java.lang.Throwable -> L5c
                if (r6 == 0) goto L62
                java.lang.Object r9 = r4.getValue()     // Catch: java.lang.Throwable -> L5c
                ff.s<K, V, E extends ff.s$h<K, V, E>, S extends ff.s$m<K, V, E, S>> r10 = r8.f131065a     // Catch: java.lang.Throwable -> L5c
                ef.b r10 = r10.r()     // Catch: java.lang.Throwable -> L5c
                boolean r9 = r10.d(r11, r9)     // Catch: java.lang.Throwable -> L5c
                if (r9 == 0) goto L41
                r5 = r2
                goto L47
            L41:
                boolean r9 = n(r4)     // Catch: java.lang.Throwable -> L5c
                if (r9 == 0) goto L5e
            L47:
                int r9 = r8.f131067c     // Catch: java.lang.Throwable -> L5c
                int r9 = r9 + r2
                r8.f131067c = r9     // Catch: java.lang.Throwable -> L5c
                ff.s$h r9 = r8.z(r3, r4)     // Catch: java.lang.Throwable -> L5c
                int r10 = r8.f131066b     // Catch: java.lang.Throwable -> L5c
                int r10 = r10 - r2
                r0.set(r1, r9)     // Catch: java.lang.Throwable -> L5c
                r8.f131066b = r10     // Catch: java.lang.Throwable -> L5c
                r8.unlock()
                return r5
            L5c:
                r9 = move-exception
                goto L6b
            L5e:
                r8.unlock()
                return r5
            L62:
                ff.s$h r4 = r4.a()     // Catch: java.lang.Throwable -> L5c
                goto L16
            L67:
                r8.unlock()
                return r5
            L6b:
                r8.unlock()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: ff.s.m.y(java.lang.Object, int, java.lang.Object):boolean");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static abstract class n {

        /* renamed from: a, reason: collision with root package name */
        public static final n f131072a;

        /* renamed from: b, reason: collision with root package name */
        public static final n f131073b;

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ n[] f131074c;

        private n(String str, int i10) {
        }

        abstract AbstractC13651b<Object> a();

        enum a extends n {
            a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // ff.s.n
            AbstractC13651b<Object> a() {
                return AbstractC13651b.c();
            }
        }

        enum b extends n {
            b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // ff.s.n
            AbstractC13651b<Object> a() {
                return AbstractC13651b.f();
            }
        }

        static {
            a aVar = new a("STRONG", 0);
            f131072a = aVar;
            b bVar = new b("WEAK", 1);
            f131073b = bVar;
            f131074c = new n[]{aVar, bVar};
        }

        /* synthetic */ n(String str, int i10, C13889a c13889a) {
            this(str, i10);
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) f131074c.clone();
        }
    }

    static final class o<K, V> extends AbstractC13890b<K, V, o<K, V>> implements h {

        /* renamed from: d, reason: collision with root package name */
        private volatile V f131075d;

        static final class a<K, V> implements i<K, V, o<K, V>, p<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f131076a = new a<>();

            static <K, V> a<K, V> g() {
                return (a<K, V>) f131076a;
            }

            @Override // ff.s.i
            public n a() {
                return n.f131072a;
            }

            @Override // ff.s.i
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public o<K, V> e(p<K, V> pVar, K k10, int i10, o<K, V> oVar) {
                return new o<>(k10, i10, oVar);
            }

            @Override // ff.s.i
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public p<K, V> c(s<K, V, o<K, V>, p<K, V>> sVar, int i10, int i11) {
                return new p<>(sVar, i10, i11);
            }

            a() {
            }

            @Override // ff.s.i
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public o<K, V> d(p<K, V> pVar, o<K, V> oVar, o<K, V> oVar2) {
                return oVar.d(oVar2);
            }

            @Override // ff.s.i
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public void b(p<K, V> pVar, o<K, V> oVar, V v10) {
                oVar.e(v10);
            }
        }

        o<K, V> d(o<K, V> oVar) {
            o<K, V> oVar2 = new o<>(this.f131048a, this.f131049b, oVar);
            oVar2.f131075d = this.f131075d;
            return oVar2;
        }

        void e(V v10) {
            this.f131075d = v10;
        }

        @Override // ff.s.h
        public V getValue() {
            return this.f131075d;
        }

        o(K k10, int i10, o<K, V> oVar) {
            super(k10, i10, oVar);
            this.f131075d = null;
        }
    }

    static final class q<K, V> extends AbstractC13890b<K, V, q<K, V>> implements y<K, V, q<K, V>> {

        /* renamed from: d, reason: collision with root package name */
        private volatile z<K, V, q<K, V>> f131077d;

        static final class a<K, V> implements i<K, V, q<K, V>, r<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f131078a = new a<>();

            static <K, V> a<K, V> g() {
                return (a<K, V>) f131078a;
            }

            @Override // ff.s.i
            public n a() {
                return n.f131073b;
            }

            @Override // ff.s.i
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public q<K, V> e(r<K, V> rVar, K k10, int i10, q<K, V> qVar) {
                return new q<>(k10, i10, qVar);
            }

            @Override // ff.s.i
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public r<K, V> c(s<K, V, q<K, V>, r<K, V>> sVar, int i10, int i11) {
                return new r<>(sVar, i10, i11);
            }

            a() {
            }

            @Override // ff.s.i
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public q<K, V> d(r<K, V> rVar, q<K, V> qVar, q<K, V> qVar2) {
                if (m.n(qVar)) {
                    return null;
                }
                return qVar.d(((r) rVar).f131079h, qVar2);
            }

            @Override // ff.s.i
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public void b(r<K, V> rVar, q<K, V> qVar, V v10) {
                qVar.e(v10, ((r) rVar).f131079h);
            }
        }

        @Override // ff.s.y
        public z<K, V, q<K, V>> b() {
            return this.f131077d;
        }

        q<K, V> d(ReferenceQueue<V> referenceQueue, q<K, V> qVar) {
            q<K, V> qVar2 = new q<>(this.f131048a, this.f131049b, qVar);
            qVar2.f131077d = this.f131077d.b(referenceQueue, qVar2);
            return qVar2;
        }

        void e(V v10, ReferenceQueue<V> referenceQueue) {
            z<K, V, q<K, V>> zVar = this.f131077d;
            this.f131077d = new A(referenceQueue, v10, this);
            zVar.clear();
        }

        @Override // ff.s.h
        public V getValue() {
            return this.f131077d.get();
        }

        q(K k10, int i10, q<K, V> qVar) {
            super(k10, i10, qVar);
            this.f131077d = s.q();
        }
    }

    static final class r<K, V> extends m<K, V, q<K, V>, r<K, V>> {

        /* renamed from: h, reason: collision with root package name */
        private final ReferenceQueue<V> f131079h;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ff.s.m
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public r<K, V> E() {
            return this;
        }

        @Override // ff.s.m
        void o() {
            b(this.f131079h);
        }

        @Override // ff.s.m
        void p() {
            f(this.f131079h);
        }

        r(s<K, V, q<K, V>, r<K, V>> sVar, int i10, int i11) {
            super(sVar, i10, i11);
            this.f131079h = new ReferenceQueue<>();
        }
    }

    /* renamed from: ff.s$s, reason: collision with other inner class name */
    final class C2080s extends s<K, V, E, S>.g<V> {
        C2080s() {
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
            return new C2080s();
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
        private volatile V f131082c;

        static final class a<K, V> implements i<K, V, u<K, V>, v<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f131083a = new a<>();

            static <K, V> a<K, V> g() {
                return (a<K, V>) f131083a;
            }

            @Override // ff.s.i
            public n a() {
                return n.f131072a;
            }

            @Override // ff.s.i
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public u<K, V> e(v<K, V> vVar, K k10, int i10, u<K, V> uVar) {
                return new u<>(((v) vVar).f131084h, k10, i10, uVar);
            }

            @Override // ff.s.i
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public v<K, V> c(s<K, V, u<K, V>, v<K, V>> sVar, int i10, int i11) {
                return new v<>(sVar, i10, i11);
            }

            a() {
            }

            @Override // ff.s.i
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public u<K, V> d(v<K, V> vVar, u<K, V> uVar, u<K, V> uVar2) {
                if (uVar.getKey() == null) {
                    return null;
                }
                return uVar.d(((v) vVar).f131084h, uVar2);
            }

            @Override // ff.s.i
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public void b(v<K, V> vVar, u<K, V> uVar, V v10) {
                uVar.e(v10);
            }
        }

        u<K, V> d(ReferenceQueue<K> referenceQueue, u<K, V> uVar) {
            u<K, V> uVar2 = new u<>(referenceQueue, getKey(), this.f131051a, uVar);
            uVar2.e(this.f131082c);
            return uVar2;
        }

        void e(V v10) {
            this.f131082c = v10;
        }

        @Override // ff.s.h
        public V getValue() {
            return this.f131082c;
        }

        u(ReferenceQueue<K> referenceQueue, K k10, int i10, u<K, V> uVar) {
            super(referenceQueue, k10, i10, uVar);
            this.f131082c = null;
        }
    }

    static final class v<K, V> extends m<K, V, u<K, V>, v<K, V>> {

        /* renamed from: h, reason: collision with root package name */
        private final ReferenceQueue<K> f131084h;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ff.s.m
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public v<K, V> E() {
            return this;
        }

        @Override // ff.s.m
        void o() {
            b(this.f131084h);
        }

        @Override // ff.s.m
        void p() {
            e(this.f131084h);
        }

        v(s<K, V, u<K, V>, v<K, V>> sVar, int i10, int i11) {
            super(sVar, i10, i11);
            this.f131084h = new ReferenceQueue<>();
        }
    }

    static final class w<K, V> extends c<K, V, w<K, V>> implements y<K, V, w<K, V>> {

        /* renamed from: c, reason: collision with root package name */
        private volatile z<K, V, w<K, V>> f131085c;

        static final class a<K, V> implements i<K, V, w<K, V>, x<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f131086a = new a<>();

            static <K, V> a<K, V> g() {
                return (a<K, V>) f131086a;
            }

            @Override // ff.s.i
            public n a() {
                return n.f131073b;
            }

            @Override // ff.s.i
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public w<K, V> e(x<K, V> xVar, K k10, int i10, w<K, V> wVar) {
                return new w<>(((x) xVar).f131087h, k10, i10, wVar);
            }

            @Override // ff.s.i
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public x<K, V> c(s<K, V, w<K, V>, x<K, V>> sVar, int i10, int i11) {
                return new x<>(sVar, i10, i11);
            }

            a() {
            }

            @Override // ff.s.i
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public w<K, V> d(x<K, V> xVar, w<K, V> wVar, w<K, V> wVar2) {
                if (wVar.getKey() == null || m.n(wVar)) {
                    return null;
                }
                return wVar.d(((x) xVar).f131087h, ((x) xVar).f131088i, wVar2);
            }

            @Override // ff.s.i
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public void b(x<K, V> xVar, w<K, V> wVar, V v10) {
                wVar.e(v10, ((x) xVar).f131088i);
            }
        }

        @Override // ff.s.y
        public z<K, V, w<K, V>> b() {
            return this.f131085c;
        }

        w<K, V> d(ReferenceQueue<K> referenceQueue, ReferenceQueue<V> referenceQueue2, w<K, V> wVar) {
            w<K, V> wVar2 = new w<>(referenceQueue, getKey(), this.f131051a, wVar);
            wVar2.f131085c = this.f131085c.b(referenceQueue2, wVar2);
            return wVar2;
        }

        void e(V v10, ReferenceQueue<V> referenceQueue) {
            z<K, V, w<K, V>> zVar = this.f131085c;
            this.f131085c = new A(referenceQueue, v10, this);
            zVar.clear();
        }

        @Override // ff.s.h
        public V getValue() {
            return this.f131085c.get();
        }

        w(ReferenceQueue<K> referenceQueue, K k10, int i10, w<K, V> wVar) {
            super(referenceQueue, k10, i10, wVar);
            this.f131085c = s.q();
        }
    }

    static final class x<K, V> extends m<K, V, w<K, V>, x<K, V>> {

        /* renamed from: h, reason: collision with root package name */
        private final ReferenceQueue<K> f131087h;

        /* renamed from: i, reason: collision with root package name */
        private final ReferenceQueue<V> f131088i;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ff.s.m
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public x<K, V> E() {
            return this;
        }

        @Override // ff.s.m
        void o() {
            b(this.f131087h);
        }

        @Override // ff.s.m
        void p() {
            e(this.f131087h);
            f(this.f131088i);
        }

        x(s<K, V, w<K, V>, x<K, V>> sVar, int i10, int i11) {
            super(sVar, i10, i11);
            this.f131087h = new ReferenceQueue<>();
            this.f131088i = new ReferenceQueue<>();
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
        C13655f.h(k10);
        C13655f.h(v11);
        if (v10 == null) {
            return false;
        }
        int iF = f(k10);
        return k(iF).B(k10, iF, v10, v11);
    }

    /* renamed from: ff.s$a, reason: case insensitive filesystem */
    static class C13889a implements z<Object, Object, d> {
        @Override // ff.s.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public z<Object, Object, d> b(ReferenceQueue<Object> referenceQueue, d dVar) {
            return this;
        }

        @Override // ff.s.z
        public void clear() {
        }

        @Override // ff.s.z
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public d a() {
            return null;
        }

        @Override // ff.s.z
        public Object get() {
            return null;
        }

        C13889a() {
        }
    }

    static final class p<K, V> extends m<K, V, o<K, V>, p<K, V>> {
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ff.s.m
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
        ff.o.a(arrayList, collection.iterator());
        return arrayList;
    }

    static <K, V, E extends h<K, V, E>> z<K, V, E> q() {
        return (z<K, V, E>) f131034j;
    }

    m<K, V, E, S> c(int i10, int i11) {
        return this.f131040f.c(this, i10, i11);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (m<K, V, E, S> mVar : this.f131037c) {
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
        m<K, V, E, S>[] mVarArr = this.f131037c;
        long j10 = -1;
        int i10 = 0;
        while (i10 < 3) {
            int length = mVarArr.length;
            long j11 = 0;
            for (?? r10 = z10; r10 < length; r10++) {
                m<K, V, E, S> mVar = mVarArr[r10];
                int i11 = mVar.f131066b;
                AtomicReferenceArray<E> atomicReferenceArray = mVar.f131069e;
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
                j11 += mVar.f131067c;
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
        Set<Map.Entry<K, V>> set = this.f131043i;
        if (set != null) {
            return set;
        }
        f fVar = new f();
        this.f131043i = fVar;
        return fVar;
    }

    int f(Object obj) {
        return j(this.f131039e.e(obj));
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
        m<K, V, E, S>[] mVarArr = this.f131037c;
        long j10 = 0;
        for (int i10 = 0; i10 < mVarArr.length; i10++) {
            if (mVarArr[i10].f131066b != 0) {
                return false;
            }
            j10 += mVarArr[i10].f131067c;
        }
        if (j10 == 0) {
            return true;
        }
        for (int i11 = 0; i11 < mVarArr.length; i11++) {
            if (mVarArr[i11].f131066b != 0) {
                return false;
            }
            j10 -= mVarArr[i11].f131067c;
        }
        return j10 == 0;
    }

    m<K, V, E, S> k(int i10) {
        return this.f131037c[(i10 >>> this.f131036b) & this.f131035a];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f131041g;
        if (set != null) {
            return set;
        }
        k kVar = new k();
        this.f131041g = kVar;
        return kVar;
    }

    AbstractC13651b<Object> r() {
        return this.f131040f.a().a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j10 = 0;
        for (int i10 = 0; i10 < this.f131037c.length; i10++) {
            j10 += r0[i10].f131066b;
        }
        return C14426a.a(j10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f131042h;
        if (collection != null) {
            return collection;
        }
        t tVar = new t();
        this.f131042h = tVar;
        return tVar;
    }

    private s(ff.r rVar, i<K, V, E, S> iVar) {
        this.f131038d = Math.min(rVar.a(), 65536);
        this.f131039e = rVar.c();
        this.f131040f = iVar;
        int iMin = Math.min(rVar.b(), 1073741824);
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        int i13 = 1;
        while (i13 < this.f131038d) {
            i12++;
            i13 <<= 1;
        }
        this.f131036b = 32 - i12;
        this.f131035a = i13 - 1;
        this.f131037c = g(i13);
        int i14 = iMin / i13;
        while (i11 < (i13 * i14 < iMin ? i14 + 1 : i14)) {
            i11 <<= 1;
        }
        while (true) {
            m<K, V, E, S>[] mVarArr = this.f131037c;
            if (i10 < mVarArr.length) {
                mVarArr[i10] = c(i11, -1);
                i10++;
            } else {
                return;
            }
        }
    }

    static <K, V> s<K, V, ? extends h<K, V, ?>, ?> b(ff.r rVar) {
        n nVarD = rVar.d();
        n nVar = n.f131072a;
        if (nVarD == nVar && rVar.e() == nVar) {
            return new s<>(rVar, o.a.g());
        }
        if (rVar.d() == nVar && rVar.e() == n.f131073b) {
            return new s<>(rVar, q.a.g());
        }
        n nVarD2 = rVar.d();
        n nVar2 = n.f131073b;
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
        C13655f.h(k10);
        C13655f.h(v10);
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
        C13655f.h(k10);
        C13655f.h(v10);
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
        C13655f.h(k10);
        C13655f.h(v10);
        int iF = f(k10);
        return k(iF).A(k10, iF, v10);
    }
}
