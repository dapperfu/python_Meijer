package com.google.protobuf;

import com.google.protobuf.B;
import com.google.protobuf.C11657s.b;
import com.google.protobuf.C11663y;
import com.google.protobuf.P;
import com.google.protobuf.r0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C11657s<T extends b<T>> {

    /* renamed from: d, reason: collision with root package name */
    private static final C11657s f91494d = new C11657s(true);

    /* renamed from: a, reason: collision with root package name */
    private final i0<T, Object> f91495a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f91496b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f91497c;

    /* renamed from: com.google.protobuf.s$b */
    public interface b<T extends b<T>> extends Comparable<T> {
        P.a c(P.a aVar, P p10);

        int g();

        boolean h();

        r0.b i();

        r0.c j();

        boolean k();
    }

    private C11657s() {
        this.f91495a = i0.w(16);
    }

    public int j() {
        int iK = 0;
        for (int i10 = 0; i10 < this.f91495a.n(); i10++) {
            iK += k(this.f91495a.k(i10));
        }
        Iterator it = this.f91495a.r().iterator();
        while (it.hasNext()) {
            iK += k((Map.Entry) it.next());
        }
        return iK;
    }

    public int l() {
        int iF = 0;
        for (int i10 = 0; i10 < this.f91495a.n(); i10++) {
            Map.Entry<K, Object> entryK = this.f91495a.k(i10);
            iF += f((b) entryK.getKey(), entryK.getValue());
        }
        Iterator it = this.f91495a.r().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iF += f((b) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    public boolean p() {
        for (int i10 = 0; i10 < this.f91495a.n(); i10++) {
            if (!q(this.f91495a.k(i10))) {
                return false;
            }
        }
        Iterator it = this.f91495a.r().iterator();
        while (it.hasNext()) {
            if (!q((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public void v(C11657s<T> c11657s) {
        for (int i10 = 0; i10 < c11657s.f91495a.n(); i10++) {
            w(c11657s.f91495a.k(i10));
        }
        Iterator it = c11657s.f91495a.r().iterator();
        while (it.hasNext()) {
            w((Map.Entry) it.next());
        }
    }

    /* renamed from: com.google.protobuf.s$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f91498a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f91499b;

        static {
            int[] iArr = new int[r0.b.values().length];
            f91499b = iArr;
            try {
                iArr[r0.b.f91462c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f91499b[r0.b.f91463d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f91499b[r0.b.f91464e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f91499b[r0.b.f91465f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f91499b[r0.b.f91466g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f91499b[r0.b.f91467h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f91499b[r0.b.f91468i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f91499b[r0.b.f91469j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f91499b[r0.b.f91471l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f91499b[r0.b.f91472m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f91499b[r0.b.f91470k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f91499b[r0.b.f91473n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f91499b[r0.b.f91474o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f91499b[r0.b.f91476q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f91499b[r0.b.f91477r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f91499b[r0.b.f91478s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f91499b[r0.b.f91479t.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f91499b[r0.b.f91475p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[r0.c.values().length];
            f91498a = iArr2;
            try {
                iArr2[r0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f91498a[r0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f91498a[r0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f91498a[r0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f91498a[r0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f91498a[r0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f91498a[r0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f91498a[r0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f91498a[r0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    static void A(CodedOutputStream codedOutputStream, r0.b bVar, int i10, Object obj) throws IOException {
        if (bVar == r0.b.f91471l) {
            codedOutputStream.w0(i10, (P) obj);
        } else {
            codedOutputStream.S0(i10, m(bVar, false));
            B(codedOutputStream, bVar, obj);
        }
    }

    static void B(CodedOutputStream codedOutputStream, r0.b bVar, Object obj) throws IOException {
        switch (a.f91499b[bVar.ordinal()]) {
            case 1:
                codedOutputStream.n0(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.v0(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.D0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.W0(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.B0(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.t0(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.r0(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.h0(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.y0((P) obj);
                break;
            case 10:
                codedOutputStream.F0((P) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC11646g)) {
                    codedOutputStream.R0((String) obj);
                    break;
                } else {
                    codedOutputStream.l0((AbstractC11646g) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof AbstractC11646g)) {
                    codedOutputStream.i0((byte[]) obj);
                    break;
                } else {
                    codedOutputStream.l0((AbstractC11646g) obj);
                    break;
                }
            case 13:
                codedOutputStream.U0(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.J0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.L0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.N0(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.P0(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof C11663y.c)) {
                    codedOutputStream.p0(((Integer) obj).intValue());
                    break;
                } else {
                    codedOutputStream.p0(((C11663y.c) obj).g());
                    break;
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

    static int e(r0.b bVar, Object obj) {
        switch (a.f91499b[bVar.ordinal()]) {
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
                return CodedOutputStream.t((P) obj);
            case 10:
                return obj instanceof B ? CodedOutputStream.B((B) obj) : CodedOutputStream.G((P) obj);
            case 11:
                return obj instanceof AbstractC11646g ? CodedOutputStream.h((AbstractC11646g) obj) : CodedOutputStream.S((String) obj);
            case 12:
                return obj instanceof AbstractC11646g ? CodedOutputStream.h((AbstractC11646g) obj) : CodedOutputStream.f((byte[]) obj);
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
                return obj instanceof C11663y.c ? CodedOutputStream.l(((C11663y.c) obj).g()) : CodedOutputStream.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static <T extends b<T>> C11657s<T> h() {
        return f91494d;
    }

    static int m(r0.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.b();
    }

    private static boolean r(Object obj) {
        if (obj instanceof Q) {
            return ((Q) obj).a();
        }
        if (obj instanceof B) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static <T extends b<T>> C11657s<T> x() {
        return new C11657s<>();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11657s) {
            return this.f91495a.equals(((C11657s) obj).f91495a);
        }
        return false;
    }

    Iterator<Map.Entry<T, Object>> g() {
        return this.f91497c ? new B.c(this.f91495a.i().iterator()) : this.f91495a.i().iterator();
    }

    public int hashCode() {
        return this.f91495a.hashCode();
    }

    public Object i(T t10) {
        Object obj = this.f91495a.get(t10);
        return obj instanceof B ? ((B) obj).f() : obj;
    }

    boolean n() {
        return this.f91495a.isEmpty();
    }

    public boolean o() {
        return this.f91496b;
    }

    public Iterator<Map.Entry<T, Object>> t() {
        return this.f91497c ? new B.c(this.f91495a.entrySet().iterator()) : this.f91495a.entrySet().iterator();
    }

    public void u() {
        if (this.f91496b) {
            return;
        }
        for (int i10 = 0; i10 < this.f91495a.n(); i10++) {
            Map.Entry<K, Object> entryK = this.f91495a.k(i10);
            if (entryK.getValue() instanceof AbstractC11661w) {
                ((AbstractC11661w) entryK.getValue()).O();
            }
        }
        this.f91495a.v();
        this.f91496b = true;
    }

    private C11657s(boolean z10) {
        this(i0.w(0));
        u();
    }

    static int d(r0.b bVar, int i10, Object obj) {
        int iT = CodedOutputStream.T(i10);
        if (bVar == r0.b.f91471l) {
            iT *= 2;
        }
        return iT + e(bVar, obj);
    }

    public static int f(b<?> bVar, Object obj) {
        r0.b bVarI = bVar.i();
        int iG = bVar.g();
        if (bVar.h()) {
            List list = (List) obj;
            int iD = 0;
            if (bVar.k()) {
                if (list.isEmpty()) {
                    return 0;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    iD += e(bVarI, it.next());
                }
                return CodedOutputStream.T(iG) + iD + CodedOutputStream.V(iD);
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                iD += d(bVarI, iG, it2.next());
            }
            return iD;
        }
        return d(bVarI, iG, obj);
    }

    private int k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.j() == r0.c.MESSAGE && !key.h() && !key.k()) {
            if (value instanceof B) {
                return CodedOutputStream.z(entry.getKey().g(), (B) value);
            }
            return CodedOutputStream.D(entry.getKey().g(), (P) value);
        }
        return f(key, value);
    }

    private static <T extends b<T>> boolean q(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.j() == r0.c.MESSAGE) {
            if (key.h()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!r(it.next())) {
                        return false;
                    }
                }
                return true;
            }
            return r(entry.getValue());
        }
        return true;
    }

    private static boolean s(r0.b bVar, Object obj) {
        C11663y.a(obj);
        switch (a.f91498a[bVar.a().ordinal()]) {
            case 7:
                if ((obj instanceof AbstractC11646g) || (obj instanceof byte[])) {
                }
                break;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof C11663y.c)) {
                }
                break;
            case 9:
                if ((obj instanceof P) || (obj instanceof B)) {
                }
                break;
        }
        return false;
    }

    private void w(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof B) {
            value = ((B) value).f();
        }
        if (key.h()) {
            Object objI = i(key);
            if (objI == null) {
                objI = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objI).add(c(it.next()));
            }
            this.f91495a.put(key, objI);
            return;
        }
        if (key.j() == r0.c.MESSAGE) {
            Object objI2 = i(key);
            if (objI2 == null) {
                this.f91495a.put(key, c(value));
                return;
            } else {
                this.f91495a.put(key, key.c(((P) objI2).b(), (P) value).build());
                return;
            }
        }
        this.f91495a.put(key, c(value));
    }

    private void z(T t10, Object obj) {
        if (s(t10.i(), obj)) {
        } else {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t10.g()), t10.i().a(), obj.getClass().getName()));
        }
    }

    public void a(T t10, Object obj) {
        List arrayList;
        if (t10.h()) {
            z(t10, obj);
            Object objI = i(t10);
            if (objI == null) {
                arrayList = new ArrayList();
                this.f91495a.put(t10, arrayList);
            } else {
                arrayList = (List) objI;
            }
            arrayList.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C11657s<T> clone() {
        C11657s<T> c11657sX = x();
        for (int i10 = 0; i10 < this.f91495a.n(); i10++) {
            Map.Entry<K, Object> entryK = this.f91495a.k(i10);
            c11657sX.y((b) entryK.getKey(), entryK.getValue());
        }
        Iterator it = this.f91495a.r().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c11657sX.y((b) entry.getKey(), entry.getValue());
        }
        c11657sX.f91497c = this.f91497c;
        return c11657sX;
    }

    public void y(T t10, Object obj) {
        if (t10.h()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    z(t10, it.next());
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            z(t10, obj);
        }
        if (obj instanceof B) {
            this.f91497c = true;
        }
        this.f91495a.put(t10, obj);
    }

    private C11657s(i0<T, Object> i0Var) {
        this.f91495a = i0Var;
        u();
    }
}
