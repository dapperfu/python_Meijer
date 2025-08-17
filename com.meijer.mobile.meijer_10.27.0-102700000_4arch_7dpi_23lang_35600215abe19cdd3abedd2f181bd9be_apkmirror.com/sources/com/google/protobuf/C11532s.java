package com.google.protobuf;

import com.google.protobuf.B;
import com.google.protobuf.C11532s.b;
import com.google.protobuf.C11538y;
import com.google.protobuf.P;
import com.google.protobuf.r0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C11532s<T extends b<T>> {

    /* renamed from: d, reason: collision with root package name */
    private static final C11532s f90655d = new C11532s(true);

    /* renamed from: a, reason: collision with root package name */
    private final i0<T, Object> f90656a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f90657b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f90658c;

    /* renamed from: com.google.protobuf.s$b */
    public interface b<T extends b<T>> extends Comparable<T> {
        P.a c(P.a aVar, P p10);

        int g();

        boolean h();

        r0.b i();

        r0.c j();

        boolean k();
    }

    private C11532s() {
        this.f90656a = i0.x(16);
    }

    public int j() {
        int iK = 0;
        for (int i10 = 0; i10 < this.f90656a.n(); i10++) {
            iK += k(this.f90656a.k(i10));
        }
        Iterator it = this.f90656a.r().iterator();
        while (it.hasNext()) {
            iK += k((Map.Entry) it.next());
        }
        return iK;
    }

    public int l() {
        int iF = 0;
        for (int i10 = 0; i10 < this.f90656a.n(); i10++) {
            Map.Entry<K, Object> entryK = this.f90656a.k(i10);
            iF += f((b) entryK.getKey(), entryK.getValue());
        }
        Iterator it = this.f90656a.r().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iF += f((b) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    public boolean p() {
        for (int i10 = 0; i10 < this.f90656a.n(); i10++) {
            if (!q(this.f90656a.k(i10))) {
                return false;
            }
        }
        Iterator it = this.f90656a.r().iterator();
        while (it.hasNext()) {
            if (!q((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public void v(C11532s<T> c11532s) {
        for (int i10 = 0; i10 < c11532s.f90656a.n(); i10++) {
            w(c11532s.f90656a.k(i10));
        }
        Iterator it = c11532s.f90656a.r().iterator();
        while (it.hasNext()) {
            w((Map.Entry) it.next());
        }
    }

    /* renamed from: com.google.protobuf.s$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f90659a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f90660b;

        static {
            int[] iArr = new int[r0.b.values().length];
            f90660b = iArr;
            try {
                iArr[r0.b.f90623c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90660b[r0.b.f90624d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f90660b[r0.b.f90625e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f90660b[r0.b.f90626f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f90660b[r0.b.f90627g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f90660b[r0.b.f90628h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f90660b[r0.b.f90629i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f90660b[r0.b.f90630j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f90660b[r0.b.f90632l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f90660b[r0.b.f90633m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f90660b[r0.b.f90631k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f90660b[r0.b.f90634n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f90660b[r0.b.f90635o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f90660b[r0.b.f90637q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f90660b[r0.b.f90638r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f90660b[r0.b.f90639s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f90660b[r0.b.f90640t.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f90660b[r0.b.f90636p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[r0.c.values().length];
            f90659a = iArr2;
            try {
                iArr2[r0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f90659a[r0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f90659a[r0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f90659a[r0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f90659a[r0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f90659a[r0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f90659a[r0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f90659a[r0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f90659a[r0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    static void A(CodedOutputStream codedOutputStream, r0.b bVar, int i10, Object obj) throws IOException {
        if (bVar == r0.b.f90632l) {
            codedOutputStream.w0(i10, (P) obj);
        } else {
            codedOutputStream.S0(i10, m(bVar, false));
            B(codedOutputStream, bVar, obj);
        }
    }

    static void B(CodedOutputStream codedOutputStream, r0.b bVar, Object obj) throws IOException {
        switch (a.f90660b[bVar.ordinal()]) {
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
                if (!(obj instanceof AbstractC11521g)) {
                    codedOutputStream.R0((String) obj);
                    break;
                } else {
                    codedOutputStream.l0((AbstractC11521g) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof AbstractC11521g)) {
                    codedOutputStream.i0((byte[]) obj);
                    break;
                } else {
                    codedOutputStream.l0((AbstractC11521g) obj);
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
                if (!(obj instanceof C11538y.c)) {
                    codedOutputStream.p0(((Integer) obj).intValue());
                    break;
                } else {
                    codedOutputStream.p0(((C11538y.c) obj).g());
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
        switch (a.f90660b[bVar.ordinal()]) {
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
                return obj instanceof AbstractC11521g ? CodedOutputStream.h((AbstractC11521g) obj) : CodedOutputStream.S((String) obj);
            case 12:
                return obj instanceof AbstractC11521g ? CodedOutputStream.h((AbstractC11521g) obj) : CodedOutputStream.f((byte[]) obj);
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
                return obj instanceof C11538y.c ? CodedOutputStream.l(((C11538y.c) obj).g()) : CodedOutputStream.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static <T extends b<T>> C11532s<T> h() {
        return f90655d;
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

    public static <T extends b<T>> C11532s<T> x() {
        return new C11532s<>();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11532s) {
            return this.f90656a.equals(((C11532s) obj).f90656a);
        }
        return false;
    }

    Iterator<Map.Entry<T, Object>> g() {
        return this.f90658c ? new B.c(this.f90656a.i().iterator()) : this.f90656a.i().iterator();
    }

    public int hashCode() {
        return this.f90656a.hashCode();
    }

    public Object i(T t10) {
        Object obj = this.f90656a.get(t10);
        return obj instanceof B ? ((B) obj).f() : obj;
    }

    boolean n() {
        return this.f90656a.isEmpty();
    }

    public boolean o() {
        return this.f90657b;
    }

    public Iterator<Map.Entry<T, Object>> t() {
        return this.f90658c ? new B.c(this.f90656a.entrySet().iterator()) : this.f90656a.entrySet().iterator();
    }

    public void u() {
        if (this.f90657b) {
            return;
        }
        for (int i10 = 0; i10 < this.f90656a.n(); i10++) {
            Map.Entry<K, Object> entryK = this.f90656a.k(i10);
            if (entryK.getValue() instanceof AbstractC11536w) {
                ((AbstractC11536w) entryK.getValue()).O();
            }
        }
        this.f90656a.w();
        this.f90657b = true;
    }

    private C11532s(boolean z10) {
        this(i0.x(0));
        u();
    }

    static int d(r0.b bVar, int i10, Object obj) {
        int iT = CodedOutputStream.T(i10);
        if (bVar == r0.b.f90632l) {
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
        C11538y.a(obj);
        switch (a.f90659a[bVar.a().ordinal()]) {
            case 7:
                if ((obj instanceof AbstractC11521g) || (obj instanceof byte[])) {
                }
                break;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof C11538y.c)) {
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
            this.f90656a.put(key, objI);
            return;
        }
        if (key.j() == r0.c.MESSAGE) {
            Object objI2 = i(key);
            if (objI2 == null) {
                this.f90656a.put(key, c(value));
                return;
            } else {
                this.f90656a.put(key, key.c(((P) objI2).b(), (P) value).build());
                return;
            }
        }
        this.f90656a.put(key, c(value));
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
                this.f90656a.put(t10, arrayList);
            } else {
                arrayList = (List) objI;
            }
            arrayList.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C11532s<T> clone() {
        C11532s<T> c11532sX = x();
        for (int i10 = 0; i10 < this.f90656a.n(); i10++) {
            Map.Entry<K, Object> entryK = this.f90656a.k(i10);
            c11532sX.y((b) entryK.getKey(), entryK.getValue());
        }
        Iterator it = this.f90656a.r().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c11532sX.y((b) entry.getKey(), entry.getValue());
        }
        c11532sX.f90658c = this.f90658c;
        return c11532sX;
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
            this.f90658c = true;
        }
        this.f90656a.put(t10, obj);
    }

    private C11532s(i0<T, Object> i0Var) {
        this.f90656a = i0Var;
        u();
    }
}
