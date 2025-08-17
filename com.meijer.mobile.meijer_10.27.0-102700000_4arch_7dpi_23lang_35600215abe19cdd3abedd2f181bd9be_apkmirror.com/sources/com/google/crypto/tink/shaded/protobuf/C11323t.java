package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.B;
import com.google.crypto.tink.shaded.protobuf.C11323t.b;
import com.google.crypto.tink.shaded.protobuf.C11329z;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C11323t<T extends b<T>> {

    /* renamed from: d, reason: collision with root package name */
    private static final C11323t<?> f88493d = new C11323t<>(true);

    /* renamed from: a, reason: collision with root package name */
    private final i0<T, Object> f88494a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f88495b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f88496c;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.t$b */
    public interface b<T extends b<T>> extends Comparable<T> {
        Q.a f(Q.a aVar, Q q10);

        int g();

        boolean h();

        q0.b i();

        q0.c j();

        boolean k();
    }

    private C11323t() {
        this.f88494a = i0.x();
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.t$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88497a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f88498b;

        static {
            int[] iArr = new int[q0.b.values().length];
            f88498b = iArr;
            try {
                iArr[q0.b.f88456c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88498b[q0.b.f88457d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88498b[q0.b.f88458e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f88498b[q0.b.f88459f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f88498b[q0.b.f88460g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f88498b[q0.b.f88461h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f88498b[q0.b.f88462i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f88498b[q0.b.f88463j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f88498b[q0.b.f88465l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f88498b[q0.b.f88466m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f88498b[q0.b.f88464k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f88498b[q0.b.f88467n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f88498b[q0.b.f88468o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f88498b[q0.b.f88470q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f88498b[q0.b.f88471r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f88498b[q0.b.f88472s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f88498b[q0.b.f88473t.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f88498b[q0.b.f88469p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[q0.c.values().length];
            f88497a = iArr2;
            try {
                iArr2[q0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f88497a[q0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f88497a[q0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f88497a[q0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f88497a[q0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f88497a[q0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f88497a[q0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f88497a[q0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f88497a[q0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    private static Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static int e(q0.b bVar, Object obj) {
        switch (a.f88498b[bVar.ordinal()]) {
            case 1:
                return CodedOutputStream.j(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.r(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.y(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.X(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.w(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.p(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.n(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.e(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.t((Q) obj);
            case 10:
                return obj instanceof B ? CodedOutputStream.B((B) obj) : CodedOutputStream.G((Q) obj);
            case 11:
                return obj instanceof AbstractC11312h ? CodedOutputStream.h((AbstractC11312h) obj) : CodedOutputStream.S((String) obj);
            case 12:
                return obj instanceof AbstractC11312h ? CodedOutputStream.h((AbstractC11312h) obj) : CodedOutputStream.f((byte[]) obj);
            case 13:
                return CodedOutputStream.V(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.K(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.M(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.O(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.Q(((Long) obj).longValue());
            case 18:
                return obj instanceof C11329z.c ? CodedOutputStream.l(((C11329z.c) obj).g()) : CodedOutputStream.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static <T extends b<T>> C11323t<T> h() {
        return (C11323t<T>) f88493d;
    }

    private static boolean q(Object obj) {
        if (obj instanceof S) {
            return ((S) obj).a();
        }
        if (obj instanceof B) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static <T extends b<T>> C11323t<T> w() {
        return new C11323t<>();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11323t) {
            return this.f88494a.equals(((C11323t) obj).f88494a);
        }
        return false;
    }

    public int hashCode() {
        return this.f88494a.hashCode();
    }

    public Object i(T t10) {
        Object obj = this.f88494a.get(t10);
        return obj instanceof B ? ((B) obj).f() : obj;
    }

    public int j() {
        int iN = this.f88494a.n();
        int iK = 0;
        for (int i10 = 0; i10 < iN; i10++) {
            iK += k(this.f88494a.k(i10));
        }
        Iterator it = this.f88494a.r().iterator();
        while (it.hasNext()) {
            iK += k((Map.Entry) it.next());
        }
        return iK;
    }

    public int l() {
        int iN = this.f88494a.n();
        int iF = 0;
        for (int i10 = 0; i10 < iN; i10++) {
            Map.Entry<K, Object> entryK = this.f88494a.k(i10);
            iF += f((b) entryK.getKey(), entryK.getValue());
        }
        Iterator it = this.f88494a.r().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iF += f((b) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    boolean m() {
        return this.f88494a.isEmpty();
    }

    public boolean n() {
        return this.f88495b;
    }

    public boolean o() {
        int iN = this.f88494a.n();
        for (int i10 = 0; i10 < iN; i10++) {
            if (!p(this.f88494a.k(i10))) {
                return false;
            }
        }
        Iterator it = this.f88494a.r().iterator();
        while (it.hasNext()) {
            if (!p((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public void t() {
        if (this.f88495b) {
            return;
        }
        int iN = this.f88494a.n();
        for (int i10 = 0; i10 < iN; i10++) {
            Map.Entry<K, Object> entryK = this.f88494a.k(i10);
            if (entryK.getValue() instanceof AbstractC11327x) {
                ((AbstractC11327x) entryK.getValue()).I();
            }
        }
        this.f88494a.w();
        this.f88495b = true;
    }

    public void u(C11323t<T> c11323t) {
        int iN = c11323t.f88494a.n();
        for (int i10 = 0; i10 < iN; i10++) {
            v(c11323t.f88494a.k(i10));
        }
        Iterator it = c11323t.f88494a.r().iterator();
        while (it.hasNext()) {
            v((Map.Entry) it.next());
        }
    }

    private C11323t(boolean z10) {
        this(i0.x());
        t();
    }

    static int d(q0.b bVar, int i10, Object obj) {
        int iT = CodedOutputStream.T(i10);
        if (bVar == q0.b.f88465l) {
            iT *= 2;
        }
        return iT + e(bVar, obj);
    }

    public static int f(b<?> bVar, Object obj) {
        q0.b bVarI = bVar.i();
        int iG = bVar.g();
        if (bVar.h()) {
            List list = (List) obj;
            int size = list.size();
            int i10 = 0;
            if (bVar.k()) {
                if (list.isEmpty()) {
                    return 0;
                }
                int iE = 0;
                while (i10 < size) {
                    iE += e(bVarI, list.get(i10));
                    i10++;
                }
                return CodedOutputStream.T(iG) + iE + CodedOutputStream.V(iE);
            }
            int iD = 0;
            while (i10 < size) {
                iD += d(bVarI, iG, list.get(i10));
                i10++;
            }
            return iD;
        }
        return d(bVarI, iG, obj);
    }

    private int k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.j() == q0.c.MESSAGE && !key.h() && !key.k()) {
            if (value instanceof B) {
                return CodedOutputStream.z(entry.getKey().g(), (B) value);
            }
            return CodedOutputStream.D(entry.getKey().g(), (Q) value);
        }
        return f(key, value);
    }

    private static <T extends b<T>> boolean p(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.j() == q0.c.MESSAGE) {
            if (key.h()) {
                List list = (List) entry.getValue();
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (!q(list.get(i10))) {
                        return false;
                    }
                }
                return true;
            }
            return q(entry.getValue());
        }
        return true;
    }

    private static boolean r(q0.b bVar, Object obj) {
        C11329z.a(obj);
        switch (a.f88497a[bVar.a().ordinal()]) {
            case 7:
                if ((obj instanceof AbstractC11312h) || (obj instanceof byte[])) {
                }
                break;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof C11329z.c)) {
                }
                break;
            case 9:
                if ((obj instanceof Q) || (obj instanceof B)) {
                }
                break;
        }
        return false;
    }

    private void v(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof B;
        if (key.h()) {
            if (!z10) {
                Object objI = i(key);
                if (objI == null) {
                    objI = new ArrayList();
                }
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    ((List) objI).add(c(it.next()));
                }
                this.f88494a.put(key, objI);
                return;
            }
            throw new IllegalStateException("Lazy fields can not be repeated");
        }
        if (key.j() == q0.c.MESSAGE) {
            Object objI2 = i(key);
            if (objI2 == null) {
                this.f88494a.put(key, c(value));
                if (z10) {
                    this.f88496c = true;
                    return;
                }
                return;
            }
            if (z10) {
                value = ((B) value).f();
            }
            this.f88494a.put(key, key.f(((Q) objI2).b(), (Q) value).build());
            return;
        }
        if (!z10) {
            this.f88494a.put(key, c(value));
            return;
        }
        throw new IllegalStateException("Lazy fields must be message-valued");
    }

    private void y(T t10, Object obj) {
        if (r(t10.i(), obj)) {
        } else {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t10.g()), t10.i().a(), obj.getClass().getName()));
        }
    }

    public void a(T t10, Object obj) {
        List arrayList;
        if (t10.h()) {
            y(t10, obj);
            Object objI = i(t10);
            if (objI == null) {
                arrayList = new ArrayList();
                this.f88494a.put(t10, arrayList);
            } else {
                arrayList = (List) objI;
            }
            arrayList.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C11323t<T> clone() {
        C11323t<T> c11323tW = w();
        int iN = this.f88494a.n();
        for (int i10 = 0; i10 < iN; i10++) {
            Map.Entry<K, Object> entryK = this.f88494a.k(i10);
            c11323tW.x((b) entryK.getKey(), entryK.getValue());
        }
        Iterator it = this.f88494a.r().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c11323tW.x((b) entry.getKey(), entry.getValue());
        }
        c11323tW.f88496c = this.f88496c;
        return c11323tW;
    }

    Iterator<Map.Entry<T, Object>> g() {
        if (m()) {
            return Collections.emptyIterator();
        }
        if (this.f88496c) {
            return new B.c(this.f88494a.i().iterator());
        }
        return this.f88494a.i().iterator();
    }

    public Iterator<Map.Entry<T, Object>> s() {
        if (m()) {
            return Collections.emptyIterator();
        }
        if (this.f88496c) {
            return new B.c(this.f88494a.entrySet().iterator());
        }
        return this.f88494a.entrySet().iterator();
    }

    public void x(T t10, Object obj) {
        if (t10.h()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    y(t10, it.next());
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            y(t10, obj);
        }
        if (obj instanceof B) {
            this.f88496c = true;
        }
        this.f88494a.put(t10, obj);
    }

    private C11323t(i0<T, Object> i0Var) {
        this.f88494a = i0Var;
        t();
    }
}
