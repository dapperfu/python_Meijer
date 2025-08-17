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
    private static final Unsafe f54317a = A();

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f54318b = C5938d.b();

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f54319c = m(Long.TYPE);

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f54320d = m(Integer.TYPE);

    /* renamed from: e, reason: collision with root package name */
    private static final e f54321e = y();

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f54322f = Q();

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f54323g = P();

    /* renamed from: h, reason: collision with root package name */
    static final long f54324h;

    /* renamed from: i, reason: collision with root package name */
    private static final long f54325i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f54326j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f54327k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f54328l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f54329m;

    /* renamed from: n, reason: collision with root package name */
    private static final long f54330n;

    /* renamed from: o, reason: collision with root package name */
    private static final long f54331o;

    /* renamed from: p, reason: collision with root package name */
    private static final long f54332p;

    /* renamed from: q, reason: collision with root package name */
    private static final long f54333q;

    /* renamed from: r, reason: collision with root package name */
    private static final long f54334r;

    /* renamed from: s, reason: collision with root package name */
    private static final long f54335s;

    /* renamed from: t, reason: collision with root package name */
    private static final long f54336t;

    /* renamed from: u, reason: collision with root package name */
    private static final long f54337u;

    /* renamed from: v, reason: collision with root package name */
    private static final int f54338v;

    /* renamed from: w, reason: collision with root package name */
    static final boolean f54339w;

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
            return o0.f54339w ? o0.q(obj, j10) : o0.r(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public void j(Object obj, long j10, boolean z10) {
            if (o0.f54339w) {
                o0.F(obj, j10, z10);
            } else {
                o0.G(obj, j10, z10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public void k(Object obj, long j10, byte b10) {
            if (o0.f54339w) {
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
            return o0.f54339w ? o0.q(obj, j10) : o0.r(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public void j(Object obj, long j10, boolean z10) {
            if (o0.f54339w) {
                o0.F(obj, j10, z10);
            } else {
                o0.G(obj, j10, z10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public void k(Object obj, long j10, byte b10) {
            if (o0.f54339w) {
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
            return this.f54340a.getBoolean(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public double d(Object obj, long j10) {
            return this.f54340a.getDouble(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public float e(Object obj, long j10) {
            return this.f54340a.getFloat(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public void j(Object obj, long j10, boolean z10) {
            this.f54340a.putBoolean(obj, j10, z10);
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public void k(Object obj, long j10, byte b10) {
            this.f54340a.putByte(obj, j10, b10);
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public void l(Object obj, long j10, double d10) {
            this.f54340a.putDouble(obj, j10, d10);
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public void m(Object obj, long j10, float f10) {
            this.f54340a.putFloat(obj, j10, f10);
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public boolean q() {
            if (!super.q()) {
                return false;
            }
            try {
                Class<?> cls = this.f54340a.getClass();
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
                Class<?> cls = this.f54340a.getClass();
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
        Unsafe f54340a;

        public abstract boolean c(Object obj, long j10);

        public abstract double d(Object obj, long j10);

        public abstract float e(Object obj, long j10);

        public abstract void j(Object obj, long j10, boolean z10);

        public abstract void k(Object obj, long j10, byte b10);

        public abstract void l(Object obj, long j10, double d10);

        public abstract void m(Object obj, long j10, float f10);

        public final int a(Class<?> cls) {
            return this.f54340a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f54340a.arrayIndexScale(cls);
        }

        public final int f(Object obj, long j10) {
            return this.f54340a.getInt(obj, j10);
        }

        public final long g(Object obj, long j10) {
            return this.f54340a.getLong(obj, j10);
        }

        public final Object h(Object obj, long j10) {
            return this.f54340a.getObject(obj, j10);
        }

        public final long i(Field field) {
            return this.f54340a.objectFieldOffset(field);
        }

        public final void n(Object obj, long j10, int i10) {
            this.f54340a.putInt(obj, j10, i10);
        }

        public final void o(Object obj, long j10, long j11) {
            this.f54340a.putLong(obj, j10, j11);
        }

        public final void p(Object obj, long j10, Object obj2) {
            this.f54340a.putObject(obj, j10, obj2);
        }

        public boolean q() {
            Unsafe unsafe = this.f54340a;
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
            Unsafe unsafe = this.f54340a;
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
            this.f54340a = unsafe;
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
        return f54323g;
    }

    static boolean C() {
        return f54322f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void D(Throwable th2) {
        Logger.getLogger(o0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    static void E(Object obj, long j10, boolean z10) {
        f54321e.j(obj, j10, z10);
    }

    static void H(byte[] bArr, long j10, byte b10) {
        f54321e.k(bArr, f54324h + j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iW = w(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (iW & (~(l3.f92484c << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (w(obj, j11) & (~(l3.f92484c << i10))));
    }

    static void K(Object obj, long j10, double d10) {
        f54321e.l(obj, j10, d10);
    }

    static void L(Object obj, long j10, float f10) {
        f54321e.m(obj, j10, f10);
    }

    static void M(Object obj, long j10, int i10) {
        f54321e.n(obj, j10, i10);
    }

    static void N(Object obj, long j10, long j11) {
        f54321e.o(obj, j10, j11);
    }

    static void O(Object obj, long j10, Object obj2) {
        f54321e.p(obj, j10, obj2);
    }

    private static boolean P() {
        e eVar = f54321e;
        if (eVar == null) {
            return false;
        }
        return eVar.q();
    }

    private static boolean Q() {
        e eVar = f54321e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    static <T> T i(Class<T> cls) {
        try {
            return (T) f54317a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int j(Class<?> cls) {
        if (f54323g) {
            return f54321e.a(cls);
        }
        return -1;
    }

    private static int k(Class<?> cls) {
        if (f54323g) {
            return f54321e.b(cls);
        }
        return -1;
    }

    static boolean m(Class<?> cls) {
        if (!C5938d.c()) {
            return false;
        }
        try {
            Class<?> cls2 = f54318b;
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
        if (field == null || (eVar = f54321e) == null) {
            return -1L;
        }
        return eVar.i(field);
    }

    static boolean p(Object obj, long j10) {
        return f54321e.c(obj, j10);
    }

    private static byte s(Object obj, long j10) {
        return (byte) ((w(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & l3.f92484c);
    }

    private static byte t(Object obj, long j10) {
        return (byte) ((w(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & l3.f92484c);
    }

    static double u(Object obj, long j10) {
        return f54321e.d(obj, j10);
    }

    static float v(Object obj, long j10) {
        return f54321e.e(obj, j10);
    }

    static int w(Object obj, long j10) {
        return f54321e.f(obj, j10);
    }

    static long x(Object obj, long j10) {
        return f54321e.g(obj, j10);
    }

    private static e y() {
        Unsafe unsafe = f54317a;
        if (unsafe == null) {
            return null;
        }
        if (!C5938d.c()) {
            return new d(unsafe);
        }
        if (f54319c) {
            return new c(unsafe);
        }
        if (f54320d) {
            return new b(unsafe);
        }
        return null;
    }

    static Object z(Object obj, long j10) {
        return f54321e.h(obj, j10);
    }

    static {
        boolean z10;
        long j10 = j(byte[].class);
        f54324h = j10;
        f54325i = j(boolean[].class);
        f54326j = k(boolean[].class);
        f54327k = j(int[].class);
        f54328l = k(int[].class);
        f54329m = j(long[].class);
        f54330n = k(long[].class);
        f54331o = j(float[].class);
        f54332p = k(float[].class);
        f54333q = j(double[].class);
        f54334r = k(double[].class);
        f54335s = j(Object[].class);
        f54336t = k(Object[].class);
        f54337u = o(l());
        f54338v = (int) (j10 & 7);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z10 = true;
        } else {
            z10 = false;
        }
        f54339w = z10;
    }

    private o0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field l() {
        Field fieldN;
        if (C5938d.c() && (fieldN = n(Buffer.class, "effectiveDirectAddress")) != null) {
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
