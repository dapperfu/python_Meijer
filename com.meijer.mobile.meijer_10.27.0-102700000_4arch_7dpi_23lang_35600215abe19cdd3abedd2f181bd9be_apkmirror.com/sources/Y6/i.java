package Y6;

import android.util.Log;
import com.fullstory.FS;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public final class i implements Y6.b {

    /* renamed from: a, reason: collision with root package name */
    private final g<a, Object> f40144a = new g<>();

    /* renamed from: b, reason: collision with root package name */
    private final b f40145b = new b();

    /* renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f40146c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, Y6.a<?>> f40147d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final int f40148e;

    /* renamed from: f, reason: collision with root package name */
    private int f40149f;

    private static final class a implements l {

        /* renamed from: a, reason: collision with root package name */
        private final b f40150a;

        /* renamed from: b, reason: collision with root package name */
        int f40151b;

        /* renamed from: c, reason: collision with root package name */
        private Class<?> f40152c;

        @Override // Y6.l
        public void a() {
            this.f40150a.c(this);
        }

        void b(int i10, Class<?> cls) {
            this.f40151b = i10;
            this.f40152c = cls;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f40151b == aVar.f40151b && this.f40152c == aVar.f40152c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f40151b * 31;
            Class<?> cls = this.f40152c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f40151b + "array=" + this.f40152c + '}';
        }

        a(b bVar) {
            this.f40150a = bVar;
        }
    }

    private static final class b extends c<a> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Y6.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        b() {
        }

        a e(int i10, Class<?> cls) {
            a aVarB = b();
            aVarB.b(i10, cls);
            return aVarB;
        }
    }

    @Override // Y6.b
    public synchronized void a(int i10) {
        try {
            if (i10 >= 40) {
                b();
            } else if (i10 >= 20 || i10 == 15) {
                g(this.f40148e / 2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // Y6.b
    public synchronized void b() {
        g(0);
    }

    @Override // Y6.b
    public synchronized <T> T c(int i10, Class<T> cls) {
        Integer numCeilingKey;
        try {
            numCeilingKey = l(cls).ceilingKey(Integer.valueOf(i10));
        } catch (Throwable th2) {
            throw th2;
        }
        return (T) k(o(i10, numCeilingKey) ? this.f40145b.e(numCeilingKey.intValue(), cls) : this.f40145b.e(i10, cls), cls);
    }

    @Override // Y6.b
    public synchronized <T> T d(int i10, Class<T> cls) {
        return (T) k(this.f40145b.e(i10, cls), cls);
    }

    @Override // Y6.b
    public synchronized <T> void put(T t10) {
        Class<?> cls = t10.getClass();
        Y6.a<T> aVarI = i(cls);
        int iC = aVarI.c(t10);
        int iB = aVarI.b() * iC;
        if (n(iB)) {
            a aVarE = this.f40145b.e(iC, cls);
            this.f40144a.d(aVarE, t10);
            NavigableMap<Integer, Integer> navigableMapL = l(cls);
            Integer num = navigableMapL.get(Integer.valueOf(aVarE.f40151b));
            Integer numValueOf = Integer.valueOf(aVarE.f40151b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapL.put(numValueOf, Integer.valueOf(iIntValue));
            this.f40149f += iB;
            f();
        }
    }

    private void f() {
        g(this.f40148e);
    }

    private void g(int i10) {
        while (this.f40149f > i10) {
            Object objF = this.f40144a.f();
            p7.k.d(objF);
            Y6.a aVarH = h(objF);
            this.f40149f -= aVarH.c(objF) * aVarH.b();
            e(aVarH.c(objF), objF.getClass());
            if (Log.isLoggable(aVarH.a(), 2)) {
                FS.log_v(aVarH.a(), "evicted: " + aVarH.c(objF));
            }
        }
    }

    private <T> Y6.a<T> i(Class<T> cls) {
        Y6.a<T> fVar;
        Y6.a<T> aVar = (Y6.a) this.f40147d.get(cls);
        if (aVar != null) {
            return aVar;
        }
        if (cls.equals(int[].class)) {
            fVar = new h();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            fVar = new f();
        }
        this.f40147d.put(cls, fVar);
        return fVar;
    }

    private <T> T j(a aVar) {
        return (T) this.f40144a.a(aVar);
    }

    private NavigableMap<Integer, Integer> l(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f40146c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f40146c.put(cls, treeMap);
        return treeMap;
    }

    private boolean m() {
        int i10 = this.f40149f;
        return i10 == 0 || this.f40148e / i10 >= 2;
    }

    private boolean n(int i10) {
        return i10 <= this.f40148e / 2;
    }

    private boolean o(int i10, Integer num) {
        if (num != null) {
            return m() || num.intValue() <= i10 * 8;
        }
        return false;
    }

    public i(int i10) {
        this.f40148e = i10;
    }

    private void e(int i10, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapL = l(cls);
        Integer num = navigableMapL.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapL.remove(Integer.valueOf(i10));
                return;
            } else {
                navigableMapL.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    private <T> Y6.a<T> h(T t10) {
        return i(t10.getClass());
    }

    private <T> T k(a aVar, Class<T> cls) {
        Y6.a<T> aVarI = i(cls);
        T t10 = (T) j(aVar);
        if (t10 != null) {
            this.f40149f -= aVarI.c(t10) * aVarI.b();
            e(aVarI.c(t10), cls);
        }
        if (t10 == null) {
            if (Log.isLoggable(aVarI.a(), 2)) {
                FS.log_v(aVarI.a(), "Allocated " + aVar.f40151b + " bytes");
            }
            return aVarI.newArray(aVar.f40151b);
        }
        return t10;
    }
}
