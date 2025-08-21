package androidx.datastore.preferences.protobuf;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.medallia.digital.mobilesdk.l3;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class o0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f54541a = A();

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f54542b = C6080d.b();

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f54543c = m(Long.TYPE);

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f54544d = m(Integer.TYPE);

    /* renamed from: e, reason: collision with root package name */
    private static final e f54545e = y();

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f54546f = Q();

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f54547g = P();

    /* renamed from: h, reason: collision with root package name */
    static final long f54548h;

    /* renamed from: i, reason: collision with root package name */
    private static final long f54549i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f54550j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f54551k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f54552l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f54553m;

    /* renamed from: n, reason: collision with root package name */
    private static final long f54554n;

    /* renamed from: o, reason: collision with root package name */
    private static final long f54555o;

    /* renamed from: p, reason: collision with root package name */
    private static final long f54556p;

    /* renamed from: q, reason: collision with root package name */
    private static final long f54557q;

    /* renamed from: r, reason: collision with root package name */
    private static final long f54558r;

    /* renamed from: s, reason: collision with root package name */
    private static final long f54559s;

    /* renamed from: t, reason: collision with root package name */
    private static final long f54560t;

    /* renamed from: u, reason: collision with root package name */
    private static final long f54561u;

    /* renamed from: v, reason: collision with root package name */
    private static final int f54562v;

    /* renamed from: w, reason: collision with root package name */
    static final boolean f54563w;

    class a implements PrivilegedExceptionAction<Unsafe> {
        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }

        a() {
        }
    }

    private static final class b extends e {
        @Override // androidx.datastore.preferences.protobuf.o0.e
        public boolean r() {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public boolean c(Object obj, long j10) {
            return o0.f54563w ? o0.q(obj, j10) : o0.r(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public void j(Object obj, long j10, boolean z10) {
            if (o0.f54563w) {
                o0.F(obj, j10, z10);
            } else {
                o0.G(obj, j10, z10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public void k(Object obj, long j10, byte b10) {
            if (o0.f54563w) {
                o0.I(obj, j10, b10);
            } else {
                o0.J(obj, j10, b10);
            }
        }

        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public double d(Object obj, long j10) {
            return Double.longBitsToDouble(g(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public float e(Object obj, long j10) {
            return Float.intBitsToFloat(f(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public void l(Object obj, long j10, double d10) {
            o(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public void m(Object obj, long j10, float f10) {
            n(obj, j10, Float.floatToIntBits(f10));
        }
    }

    private static final class c extends e {
        @Override // androidx.datastore.preferences.protobuf.o0.e
        public boolean r() {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public boolean c(Object obj, long j10) {
            return o0.f54563w ? o0.q(obj, j10) : o0.r(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public void j(Object obj, long j10, boolean z10) {
            if (o0.f54563w) {
                o0.F(obj, j10, z10);
            } else {
                o0.G(obj, j10, z10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public void k(Object obj, long j10, byte b10) {
            if (o0.f54563w) {
                o0.I(obj, j10, b10);
            } else {
                o0.J(obj, j10, b10);
            }
        }

        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public double d(Object obj, long j10) {
            return Double.longBitsToDouble(g(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public float e(Object obj, long j10) {
            return Float.intBitsToFloat(f(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public void l(Object obj, long j10, double d10) {
            o(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public void m(Object obj, long j10, float f10) {
            n(obj, j10, Float.floatToIntBits(f10));
        }
    }

    private static final class d extends e {
        @Override // androidx.datastore.preferences.protobuf.o0.e
        public boolean c(Object obj, long j10) {
            return this.f54564a.getBoolean(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public double d(Object obj, long j10) {
            return this.f54564a.getDouble(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public float e(Object obj, long j10) {
            return this.f54564a.getFloat(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public void j(Object obj, long j10, boolean z10) {
            this.f54564a.putBoolean(obj, j10, z10);
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public void k(Object obj, long j10, byte b10) {
            this.f54564a.putByte(obj, j10, b10);
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public void l(Object obj, long j10, double d10) {
            this.f54564a.putDouble(obj, j10, d10);
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public void m(Object obj, long j10, float f10) {
            this.f54564a.putFloat(obj, j10, f10);
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public boolean q() {
            if (!super.q()) {
                return false;
            }
            try {
                Class<?> cls = this.f54564a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th2) {
                o0.D(th2);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f54564a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th2) {
                o0.D(th2);
                return false;
            }
        }

        d(Unsafe unsafe) {
            super(unsafe);
        }
    }

    private static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        Unsafe f54564a;

        public abstract boolean c(Object obj, long j10);

        public abstract double d(Object obj, long j10);

        public abstract float e(Object obj, long j10);

        public abstract void j(Object obj, long j10, boolean z10);

        public abstract void k(Object obj, long j10, byte b10);

        public abstract void l(Object obj, long j10, double d10);

        public abstract void m(Object obj, long j10, float f10);

        public final int a(Class<?> cls) {
            return this.f54564a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f54564a.arrayIndexScale(cls);
        }

        public final int f(Object obj, long j10) {
            return this.f54564a.getInt(obj, j10);
        }

        public final long g(Object obj, long j10) {
            return this.f54564a.getLong(obj, j10);
        }

        public final Object h(Object obj, long j10) {
            return this.f54564a.getObject(obj, j10);
        }

        public final long i(Field field) {
            return this.f54564a.objectFieldOffset(field);
        }

        public final void n(Object obj, long j10, int i10) {
            this.f54564a.putInt(obj, j10, i10);
        }

        public final void o(Object obj, long j10, long j11) {
            this.f54564a.putLong(obj, j10, j11);
        }

        public final void p(Object obj, long j10, Object obj2) {
            this.f54564a.putObject(obj, j10, obj2);
        }

        public boolean q() {
            Unsafe unsafe = this.f54564a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th2) {
                o0.D(th2);
                return false;
            }
        }

        public boolean r() {
            Unsafe unsafe = this.f54564a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return o0.l() != null;
            } catch (Throwable th2) {
                o0.D(th2);
                return false;
            }
        }

        e(Unsafe unsafe) {
            this.f54564a = unsafe;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(Object obj, long j10, boolean z10) {
        I(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Object obj, long j10, boolean z10) {
        J(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    static Unsafe A() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean B() {
        return f54547g;
    }

    static boolean C() {
        return f54546f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void D(Throwable th2) {
        Logger.getLogger(o0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    static void E(Object obj, long j10, boolean z10) {
        f54545e.j(obj, j10, z10);
    }

    static void H(byte[] bArr, long j10, byte b10) {
        f54545e.k(bArr, f54548h + j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iW = w(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (iW & (~(l3.f93323c << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (w(obj, j11) & (~(l3.f93323c << i10))));
    }

    static void K(Object obj, long j10, double d10) {
        f54545e.l(obj, j10, d10);
    }

    static void L(Object obj, long j10, float f10) {
        f54545e.m(obj, j10, f10);
    }

    static void M(Object obj, long j10, int i10) {
        f54545e.n(obj, j10, i10);
    }

    static void N(Object obj, long j10, long j11) {
        f54545e.o(obj, j10, j11);
    }

    static void O(Object obj, long j10, Object obj2) {
        f54545e.p(obj, j10, obj2);
    }

    private static boolean P() {
        e eVar = f54545e;
        if (eVar == null) {
            return false;
        }
        return eVar.q();
    }

    private static boolean Q() {
        e eVar = f54545e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    static <T> T i(Class<T> cls) {
        try {
            return (T) f54541a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int j(Class<?> cls) {
        if (f54547g) {
            return f54545e.a(cls);
        }
        return -1;
    }

    private static int k(Class<?> cls) {
        if (f54547g) {
            return f54545e.b(cls);
        }
        return -1;
    }

    static boolean m(Class<?> cls) {
        if (!C6080d.c()) {
            return false;
        }
        try {
            Class<?> cls2 = f54542b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f54545e) == null) {
            return -1L;
        }
        return eVar.i(field);
    }

    static boolean p(Object obj, long j10) {
        return f54545e.c(obj, j10);
    }

    private static byte s(Object obj, long j10) {
        return (byte) ((w(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & l3.f93323c);
    }

    private static byte t(Object obj, long j10) {
        return (byte) ((w(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & l3.f93323c);
    }

    static double u(Object obj, long j10) {
        return f54545e.d(obj, j10);
    }

    static float v(Object obj, long j10) {
        return f54545e.e(obj, j10);
    }

    static int w(Object obj, long j10) {
        return f54545e.f(obj, j10);
    }

    static long x(Object obj, long j10) {
        return f54545e.g(obj, j10);
    }

    private static e y() {
        Unsafe unsafe = f54541a;
        if (unsafe == null) {
            return null;
        }
        if (!C6080d.c()) {
            return new d(unsafe);
        }
        if (f54543c) {
            return new c(unsafe);
        }
        if (f54544d) {
            return new b(unsafe);
        }
        return null;
    }

    static Object z(Object obj, long j10) {
        return f54545e.h(obj, j10);
    }

    static {
        boolean z10;
        long j10 = j(byte[].class);
        f54548h = j10;
        f54549i = j(boolean[].class);
        f54550j = k(boolean[].class);
        f54551k = j(int[].class);
        f54552l = k(int[].class);
        f54553m = j(long[].class);
        f54554n = k(long[].class);
        f54555o = j(float[].class);
        f54556p = k(float[].class);
        f54557q = j(double[].class);
        f54558r = k(double[].class);
        f54559s = j(Object[].class);
        f54560t = k(Object[].class);
        f54561u = o(l());
        f54562v = (int) (j10 & 7);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z10 = true;
        } else {
            z10 = false;
        }
        f54563w = z10;
    }

    private o0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field l() {
        Field fieldN;
        if (C6080d.c() && (fieldN = n(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldN;
        }
        Field fieldN2 = n(Buffer.class, PlaceTypes.ADDRESS);
        if (fieldN2 != null && fieldN2.getType() == Long.TYPE) {
            return fieldN2;
        }
        return null;
    }

    private static Field n(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean q(Object obj, long j10) {
        if (s(obj, j10) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean r(Object obj, long j10) {
        if (t(obj, j10) != 0) {
            return true;
        }
        return false;
    }
}
