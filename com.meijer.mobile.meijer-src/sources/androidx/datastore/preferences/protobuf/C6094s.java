package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.C6094s.b;
import androidx.datastore.preferences.protobuf.C6100y;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.q0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6094s<T extends b<T>> {

    /* renamed from: d, reason: collision with root package name */
    private static final C6094s<?> f54608d = new C6094s<>(true);

    /* renamed from: a, reason: collision with root package name */
    private final i0<T, Object> f54609a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f54610b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f54611c;

    /* renamed from: androidx.datastore.preferences.protobuf.s$b */
    public interface b<T extends b<T>> extends Comparable<T> {
        int g();

        boolean h();

        q0.b i();

        q0.c j();

        boolean k();

        P.a r(P.a aVar, P p10);
    }

    private C6094s() {
        this.f54609a = i0.w();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.s$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f54612a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f54613b;

        static {
            int[] iArr = new int[q0.b.values().length];
            f54613b = iArr;
            try {
                iArr[q0.b.f54573c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54613b[q0.b.f54574d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54613b[q0.b.f54575e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54613b[q0.b.f54576f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f54613b[q0.b.f54577g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f54613b[q0.b.f54578h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f54613b[q0.b.f54579i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f54613b[q0.b.f54580j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f54613b[q0.b.f54582l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f54613b[q0.b.f54583m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f54613b[q0.b.f54581k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f54613b[q0.b.f54584n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f54613b[q0.b.f54585o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f54613b[q0.b.f54587q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f54613b[q0.b.f54588r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f54613b[q0.b.f54589s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f54613b[q0.b.f54590t.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f54613b[q0.b.f54586p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[q0.c.values().length];
            f54612a = iArr2;
            try {
                iArr2[q0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f54612a[q0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f54612a[q0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f54612a[q0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f54612a[q0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f54612a[q0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f54612a[q0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f54612a[q0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f54612a[q0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    static void A(CodedOutputStream codedOutputStream, q0.b bVar, int i10, Object obj) throws IOException {
        if (bVar == q0.b.f54582l) {
            codedOutputStream.z0(i10, (P) obj);
        } else {
            codedOutputStream.V0(i10, m(bVar, false));
            B(codedOutputStream, bVar, obj);
        }
    }

    static void B(CodedOutputStream codedOutputStream, q0.b bVar, Object obj) throws IOException {
        switch (a.f54613b[bVar.ordinal()]) {
            case 1:
                codedOutputStream.q0(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.y0(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.G0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.Z0(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.E0(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.w0(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.u0(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.k0(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.B0((P) obj);
                break;
            case 10:
                codedOutputStream.I0((P) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC6083g)) {
                    codedOutputStream.U0((String) obj);
                    break;
                } else {
                    codedOutputStream.o0((AbstractC6083g) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof AbstractC6083g)) {
                    codedOutputStream.l0((byte[]) obj);
                    break;
                } else {
                    codedOutputStream.o0((AbstractC6083g) obj);
                    break;
                }
            case 13:
                codedOutputStream.X0(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.M0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.O0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.Q0(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.S0(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof C6100y.c)) {
                    codedOutputStream.s0(((Integer) obj).intValue());
                    break;
                } else {
                    codedOutputStream.s0(((C6100y.c) obj).g());
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

    static int e(q0.b bVar, Object obj) {
        switch (a.f54613b[bVar.ordinal()]) {
            case 1:
                return CodedOutputStream.j(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.r(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.y(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.Y(((Long) obj).longValue());
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
                return obj instanceof A ? CodedOutputStream.B((A) obj) : CodedOutputStream.G((P) obj);
            case 11:
                return obj instanceof AbstractC6083g ? CodedOutputStream.h((AbstractC6083g) obj) : CodedOutputStream.T((String) obj);
            case 12:
                return obj instanceof AbstractC6083g ? CodedOutputStream.h((AbstractC6083g) obj) : CodedOutputStream.f((byte[]) obj);
            case 13:
                return CodedOutputStream.W(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.L(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.N(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.P(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.R(((Long) obj).longValue());
            case 18:
                return obj instanceof C6100y.c ? CodedOutputStream.l(((C6100y.c) obj).g()) : CodedOutputStream.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static <T extends b<T>> C6094s<T> h() {
        return (C6094s<T>) f54608d;
    }

    static int m(q0.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.b();
    }

    private static boolean r(Object obj) {
        if (obj instanceof Q) {
            return ((Q) obj).a();
        }
        if (obj instanceof A) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static <T extends b<T>> C6094s<T> x() {
        return new C6094s<>();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6094s) {
            return this.f54609a.equals(((C6094s) obj).f54609a);
        }
        return false;
    }

    public int hashCode() {
        return this.f54609a.hashCode();
    }

    public Object i(T t10) {
        Object obj = this.f54609a.get(t10);
        return obj instanceof A ? ((A) obj).f() : obj;
    }

    public int j() {
        int iN = this.f54609a.n();
        int iK = 0;
        for (int i10 = 0; i10 < iN; i10++) {
            iK += k(this.f54609a.k(i10));
        }
        Iterator it = this.f54609a.r().iterator();
        while (it.hasNext()) {
            iK += k((Map.Entry) it.next());
        }
        return iK;
    }

    public int l() {
        int iN = this.f54609a.n();
        int iF = 0;
        for (int i10 = 0; i10 < iN; i10++) {
            Map.Entry<K, Object> entryK = this.f54609a.k(i10);
            iF += f((b) entryK.getKey(), entryK.getValue());
        }
        Iterator it = this.f54609a.r().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iF += f((b) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    boolean n() {
        return this.f54609a.isEmpty();
    }

    public boolean o() {
        return this.f54610b;
    }

    public boolean p() {
        int iN = this.f54609a.n();
        for (int i10 = 0; i10 < iN; i10++) {
            if (!q(this.f54609a.k(i10))) {
                return false;
            }
        }
        Iterator it = this.f54609a.r().iterator();
        while (it.hasNext()) {
            if (!q((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public void u() {
        if (this.f54610b) {
            return;
        }
        int iN = this.f54609a.n();
        for (int i10 = 0; i10 < iN; i10++) {
            Map.Entry<K, Object> entryK = this.f54609a.k(i10);
            if (entryK.getValue() instanceof AbstractC6098w) {
                ((AbstractC6098w) entryK.getValue()).I();
            }
        }
        this.f54609a.v();
        this.f54610b = true;
    }

    public void v(C6094s<T> c6094s) {
        int iN = c6094s.f54609a.n();
        for (int i10 = 0; i10 < iN; i10++) {
            w(c6094s.f54609a.k(i10));
        }
        Iterator it = c6094s.f54609a.r().iterator();
        while (it.hasNext()) {
            w((Map.Entry) it.next());
        }
    }

    private C6094s(boolean z10) {
        this(i0.w());
        u();
    }

    static int d(q0.b bVar, int i10, Object obj) {
        int iU = CodedOutputStream.U(i10);
        if (bVar == q0.b.f54582l) {
            iU *= 2;
        }
        return iU + e(bVar, obj);
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
                return CodedOutputStream.U(iG) + iE + CodedOutputStream.W(iE);
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
            if (value instanceof A) {
                return CodedOutputStream.z(entry.getKey().g(), (A) value);
            }
            return CodedOutputStream.D(entry.getKey().g(), (P) value);
        }
        return f(key, value);
    }

    private static <T extends b<T>> boolean q(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.j() == q0.c.MESSAGE) {
            if (key.h()) {
                List list = (List) entry.getValue();
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (!r(list.get(i10))) {
                        return false;
                    }
                }
                return true;
            }
            return r(entry.getValue());
        }
        return true;
    }

    private static boolean s(q0.b bVar, Object obj) {
        C6100y.a(obj);
        switch (a.f54612a[bVar.a().ordinal()]) {
            case 7:
                if ((obj instanceof AbstractC6083g) || (obj instanceof byte[])) {
                }
                break;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof C6100y.c)) {
                }
                break;
            case 9:
                if ((obj instanceof P) || (obj instanceof A)) {
                }
                break;
        }
        return false;
    }

    private void w(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof A;
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
                this.f54609a.put(key, objI);
                return;
            }
            throw new IllegalStateException("Lazy fields can not be repeated");
        }
        if (key.j() == q0.c.MESSAGE) {
            Object objI2 = i(key);
            if (objI2 == null) {
                this.f54609a.put(key, c(value));
                if (z10) {
                    this.f54611c = true;
                    return;
                }
                return;
            }
            if (z10) {
                value = ((A) value).f();
            }
            this.f54609a.put(key, key.r(((P) objI2).b(), (P) value).build());
            return;
        }
        if (!z10) {
            this.f54609a.put(key, c(value));
            return;
        }
        throw new IllegalStateException("Lazy fields must be message-valued");
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
                this.f54609a.put(t10, arrayList);
            } else {
                arrayList = (List) objI;
            }
            arrayList.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6094s<T> clone() {
        C6094s<T> c6094sX = x();
        int iN = this.f54609a.n();
        for (int i10 = 0; i10 < iN; i10++) {
            Map.Entry<K, Object> entryK = this.f54609a.k(i10);
            c6094sX.y((b) entryK.getKey(), entryK.getValue());
        }
        Iterator it = this.f54609a.r().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c6094sX.y((b) entry.getKey(), entry.getValue());
        }
        c6094sX.f54611c = this.f54611c;
        return c6094sX;
    }

    Iterator<Map.Entry<T, Object>> g() {
        if (n()) {
            return Collections.emptyIterator();
        }
        if (this.f54611c) {
            return new A.c(this.f54609a.i().iterator());
        }
        return this.f54609a.i().iterator();
    }

    public Iterator<Map.Entry<T, Object>> t() {
        if (n()) {
            return Collections.emptyIterator();
        }
        if (this.f54611c) {
            return new A.c(this.f54609a.entrySet().iterator());
        }
        return this.f54609a.entrySet().iterator();
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
        if (obj instanceof A) {
            this.f54611c = true;
        }
        this.f54609a.put(t10, obj);
    }

    private C6094s(i0<T, Object> i0Var) {
        this.f54609a = i0Var;
        u();
    }
}
