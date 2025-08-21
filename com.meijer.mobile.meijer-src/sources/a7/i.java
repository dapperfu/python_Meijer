package a7;

import android.util.Log;
import com.fullstory.FS;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public final class i implements InterfaceC5665b {

    /* renamed from: a, reason: collision with root package name */
    private final g<a, Object> f45276a = new g<>();

    /* renamed from: b, reason: collision with root package name */
    private final b f45277b = new b();

    /* renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f45278c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, InterfaceC5664a<?>> f45279d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final int f45280e;

    /* renamed from: f, reason: collision with root package name */
    private int f45281f;

    private static final class a implements l {

        /* renamed from: a, reason: collision with root package name */
        private final b f45282a;

        /* renamed from: b, reason: collision with root package name */
        int f45283b;

        /* renamed from: c, reason: collision with root package name */
        private Class<?> f45284c;

        @Override // a7.l
        public void a() {
            this.f45282a.c(this);
        }

        void b(int i10, Class<?> cls) {
            this.f45283b = i10;
            this.f45284c = cls;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f45283b == aVar.f45283b && this.f45284c == aVar.f45284c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f45283b * 31;
            Class<?> cls = this.f45284c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f45283b + "array=" + this.f45284c + '}';
        }

        a(b bVar) {
            this.f45282a = bVar;
        }
    }

    private static final class b extends AbstractC5666c<a> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // a7.AbstractC5666c
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

    @Override // a7.InterfaceC5665b
    public synchronized void a(int i10) {
        try {
            if (i10 >= 40) {
                b();
            } else if (i10 >= 20 || i10 == 15) {
                g(this.f45280e / 2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // a7.InterfaceC5665b
    public synchronized void b() {
        g(0);
    }

    @Override // a7.InterfaceC5665b
    public synchronized <T> T c(int i10, Class<T> cls) {
        Integer numCeilingKey;
        try {
            numCeilingKey = l(cls).ceilingKey(Integer.valueOf(i10));
        } catch (Throwable th2) {
            throw th2;
        }
        return (T) k(o(i10, numCeilingKey) ? this.f45277b.e(numCeilingKey.intValue(), cls) : this.f45277b.e(i10, cls), cls);
    }

    @Override // a7.InterfaceC5665b
    public synchronized <T> T d(int i10, Class<T> cls) {
        return (T) k(this.f45277b.e(i10, cls), cls);
    }

    @Override // a7.InterfaceC5665b
    public synchronized <T> void put(T t10) {
        Class<?> cls = t10.getClass();
        InterfaceC5664a<T> interfaceC5664aI = i(cls);
        int iC = interfaceC5664aI.c(t10);
        int iB = interfaceC5664aI.b() * iC;
        if (n(iB)) {
            a aVarE = this.f45277b.e(iC, cls);
            this.f45276a.d(aVarE, t10);
            NavigableMap<Integer, Integer> navigableMapL = l(cls);
            Integer num = navigableMapL.get(Integer.valueOf(aVarE.f45283b));
            Integer numValueOf = Integer.valueOf(aVarE.f45283b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapL.put(numValueOf, Integer.valueOf(iIntValue));
            this.f45281f += iB;
            f();
        }
    }

    private void f() {
        g(this.f45280e);
    }

    private void g(int i10) {
        while (this.f45281f > i10) {
            Object objF = this.f45276a.f();
            r7.k.d(objF);
            InterfaceC5664a interfaceC5664aH = h(objF);
            this.f45281f -= interfaceC5664aH.c(objF) * interfaceC5664aH.b();
            e(interfaceC5664aH.c(objF), objF.getClass());
            if (Log.isLoggable(interfaceC5664aH.a(), 2)) {
                FS.log_v(interfaceC5664aH.a(), "evicted: " + interfaceC5664aH.c(objF));
            }
        }
    }

    private <T> InterfaceC5664a<T> i(Class<T> cls) {
        InterfaceC5664a<T> fVar;
        InterfaceC5664a<T> interfaceC5664a = (InterfaceC5664a) this.f45279d.get(cls);
        if (interfaceC5664a != null) {
            return interfaceC5664a;
        }
        if (cls.equals(int[].class)) {
            fVar = new h();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            fVar = new f();
        }
        this.f45279d.put(cls, fVar);
        return fVar;
    }

    private <T> T j(a aVar) {
        return (T) this.f45276a.a(aVar);
    }

    private NavigableMap<Integer, Integer> l(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f45278c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f45278c.put(cls, treeMap);
        return treeMap;
    }

    private boolean m() {
        int i10 = this.f45281f;
        return i10 == 0 || this.f45280e / i10 >= 2;
    }

    private boolean n(int i10) {
        return i10 <= this.f45280e / 2;
    }

    private boolean o(int i10, Integer num) {
        if (num != null) {
            return m() || num.intValue() <= i10 * 8;
        }
        return false;
    }

    public i(int i10) {
        this.f45280e = i10;
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

    private <T> InterfaceC5664a<T> h(T t10) {
        return i(t10.getClass());
    }

    private <T> T k(a aVar, Class<T> cls) {
        InterfaceC5664a<T> interfaceC5664aI = i(cls);
        T t10 = (T) j(aVar);
        if (t10 != null) {
            this.f45281f -= interfaceC5664aI.c(t10) * interfaceC5664aI.b();
            e(interfaceC5664aI.c(t10), cls);
        }
        if (t10 == null) {
            if (Log.isLoggable(interfaceC5664aI.a(), 2)) {
                FS.log_v(interfaceC5664aI.a(), "Allocated " + aVar.f45283b + " bytes");
            }
            return interfaceC5664aI.newArray(aVar.f45283b);
        }
        return t10;
    }
}
