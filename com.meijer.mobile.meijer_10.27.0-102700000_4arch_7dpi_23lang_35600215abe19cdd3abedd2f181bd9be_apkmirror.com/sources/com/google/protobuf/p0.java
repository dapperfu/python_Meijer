package com.google.protobuf;

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

/* loaded from: classes7.dex */
final class p0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f90592a = D();

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f90593b = C11518d.b();

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f90594c = o(Long.TYPE);

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f90595d = o(Integer.TYPE);

    /* renamed from: e, reason: collision with root package name */
    private static final e f90596e = B();

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f90597f = T();

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f90598g = S();

    /* renamed from: h, reason: collision with root package name */
    static final long f90599h;

    /* renamed from: i, reason: collision with root package name */
    private static final long f90600i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f90601j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f90602k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f90603l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f90604m;

    /* renamed from: n, reason: collision with root package name */
    private static final long f90605n;

    /* renamed from: o, reason: collision with root package name */
    private static final long f90606o;

    /* renamed from: p, reason: collision with root package name */
    private static final long f90607p;

    /* renamed from: q, reason: collision with root package name */
    private static final long f90608q;

    /* renamed from: r, reason: collision with root package name */
    private static final long f90609r;

    /* renamed from: s, reason: collision with root package name */
    private static final long f90610s;

    /* renamed from: t, reason: collision with root package name */
    private static final long f90611t;

    /* renamed from: u, reason: collision with root package name */
    private static final long f90612u;

    /* renamed from: v, reason: collision with root package name */
    private static final int f90613v;

    /* renamed from: w, reason: collision with root package name */
    static final boolean f90614w;

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
        @Override // com.google.protobuf.p0.e
        public boolean s() {
            return false;
        }

        @Override // com.google.protobuf.p0.e
        public boolean c(Object obj, long j10) {
            return p0.f90614w ? p0.s(obj, j10) : p0.t(obj, j10);
        }

        @Override // com.google.protobuf.p0.e
        public byte d(Object obj, long j10) {
            return p0.f90614w ? p0.v(obj, j10) : p0.w(obj, j10);
        }

        @Override // com.google.protobuf.p0.e
        public void k(Object obj, long j10, boolean z10) {
            if (p0.f90614w) {
                p0.I(obj, j10, z10);
            } else {
                p0.J(obj, j10, z10);
            }
        }

        @Override // com.google.protobuf.p0.e
        public void l(Object obj, long j10, byte b10) {
            if (p0.f90614w) {
                p0.L(obj, j10, b10);
            } else {
                p0.M(obj, j10, b10);
            }
        }

        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.p0.e
        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        @Override // com.google.protobuf.p0.e
        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        @Override // com.google.protobuf.p0.e
        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.protobuf.p0.e
        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }
    }

    private static final class c extends e {
        @Override // com.google.protobuf.p0.e
        public boolean s() {
            return false;
        }

        @Override // com.google.protobuf.p0.e
        public boolean c(Object obj, long j10) {
            return p0.f90614w ? p0.s(obj, j10) : p0.t(obj, j10);
        }

        @Override // com.google.protobuf.p0.e
        public byte d(Object obj, long j10) {
            return p0.f90614w ? p0.v(obj, j10) : p0.w(obj, j10);
        }

        @Override // com.google.protobuf.p0.e
        public void k(Object obj, long j10, boolean z10) {
            if (p0.f90614w) {
                p0.I(obj, j10, z10);
            } else {
                p0.J(obj, j10, z10);
            }
        }

        @Override // com.google.protobuf.p0.e
        public void l(Object obj, long j10, byte b10) {
            if (p0.f90614w) {
                p0.L(obj, j10, b10);
            } else {
                p0.M(obj, j10, b10);
            }
        }

        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.p0.e
        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        @Override // com.google.protobuf.p0.e
        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        @Override // com.google.protobuf.p0.e
        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.protobuf.p0.e
        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }
    }

    private static final class d extends e {
        @Override // com.google.protobuf.p0.e
        public boolean c(Object obj, long j10) {
            return this.f90615a.getBoolean(obj, j10);
        }

        @Override // com.google.protobuf.p0.e
        public byte d(Object obj, long j10) {
            return this.f90615a.getByte(obj, j10);
        }

        @Override // com.google.protobuf.p0.e
        public double e(Object obj, long j10) {
            return this.f90615a.getDouble(obj, j10);
        }

        @Override // com.google.protobuf.p0.e
        public float f(Object obj, long j10) {
            return this.f90615a.getFloat(obj, j10);
        }

        @Override // com.google.protobuf.p0.e
        public void k(Object obj, long j10, boolean z10) {
            this.f90615a.putBoolean(obj, j10, z10);
        }

        @Override // com.google.protobuf.p0.e
        public void l(Object obj, long j10, byte b10) {
            this.f90615a.putByte(obj, j10, b10);
        }

        @Override // com.google.protobuf.p0.e
        public void m(Object obj, long j10, double d10) {
            this.f90615a.putDouble(obj, j10, d10);
        }

        @Override // com.google.protobuf.p0.e
        public void n(Object obj, long j10, float f10) {
            this.f90615a.putFloat(obj, j10, f10);
        }

        @Override // com.google.protobuf.p0.e
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f90615a.getClass();
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
                p0.G(th2);
                return false;
            }
        }

        @Override // com.google.protobuf.p0.e
        public boolean s() {
            if (!super.s()) {
                return false;
            }
            try {
                Class<?> cls = this.f90615a.getClass();
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
                p0.G(th2);
                return false;
            }
        }

        d(Unsafe unsafe) {
            super(unsafe);
        }
    }

    private static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        Unsafe f90615a;

        public abstract boolean c(Object obj, long j10);

        public abstract byte d(Object obj, long j10);

        public abstract double e(Object obj, long j10);

        public abstract float f(Object obj, long j10);

        public abstract void k(Object obj, long j10, boolean z10);

        public abstract void l(Object obj, long j10, byte b10);

        public abstract void m(Object obj, long j10, double d10);

        public abstract void n(Object obj, long j10, float f10);

        public final int a(Class<?> cls) {
            return this.f90615a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f90615a.arrayIndexScale(cls);
        }

        public final int g(Object obj, long j10) {
            return this.f90615a.getInt(obj, j10);
        }

        public final long h(Object obj, long j10) {
            return this.f90615a.getLong(obj, j10);
        }

        public final Object i(Object obj, long j10) {
            return this.f90615a.getObject(obj, j10);
        }

        public final long j(Field field) {
            return this.f90615a.objectFieldOffset(field);
        }

        public final void o(Object obj, long j10, int i10) {
            this.f90615a.putInt(obj, j10, i10);
        }

        public final void p(Object obj, long j10, long j11) {
            this.f90615a.putLong(obj, j10, j11);
        }

        public final void q(Object obj, long j10, Object obj2) {
            this.f90615a.putObject(obj, j10, obj2);
        }

        public boolean r() {
            Unsafe unsafe = this.f90615a;
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
                p0.G(th2);
                return false;
            }
        }

        public boolean s() {
            Unsafe unsafe = this.f90615a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return p0.n() != null;
            } catch (Throwable th2) {
                p0.G(th2);
                return false;
            }
        }

        e(Unsafe unsafe) {
            this.f90615a = unsafe;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(Object obj, long j10, boolean z10) {
        L(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(Object obj, long j10, boolean z10) {
        M(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    static long A(Object obj, long j10) {
        return f90596e.h(obj, j10);
    }

    private static e B() {
        Unsafe unsafe = f90592a;
        if (unsafe == null) {
            return null;
        }
        if (!C11518d.c()) {
            return new d(unsafe);
        }
        if (f90594c) {
            return new c(unsafe);
        }
        if (f90595d) {
            return new b(unsafe);
        }
        return null;
    }

    static Object C(Object obj, long j10) {
        return f90596e.i(obj, j10);
    }

    static Unsafe D() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean E() {
        return f90598g;
    }

    static boolean F() {
        return f90597f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Throwable th2) {
        Logger.getLogger(p0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    static void H(Object obj, long j10, boolean z10) {
        f90596e.k(obj, j10, z10);
    }

    static void K(byte[] bArr, long j10, byte b10) {
        f90596e.l(bArr, f90599h + j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void L(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iZ = z(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        P(obj, j11, ((255 & b10) << i10) | (iZ & (~(l3.f92484c << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void M(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        P(obj, j11, ((255 & b10) << i10) | (z(obj, j11) & (~(l3.f92484c << i10))));
    }

    static void N(Object obj, long j10, double d10) {
        f90596e.m(obj, j10, d10);
    }

    static void O(Object obj, long j10, float f10) {
        f90596e.n(obj, j10, f10);
    }

    static void P(Object obj, long j10, int i10) {
        f90596e.o(obj, j10, i10);
    }

    static void Q(Object obj, long j10, long j11) {
        f90596e.p(obj, j10, j11);
    }

    static void R(Object obj, long j10, Object obj2) {
        f90596e.q(obj, j10, obj2);
    }

    private static boolean S() {
        e eVar = f90596e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    private static boolean T() {
        e eVar = f90596e;
        if (eVar == null) {
            return false;
        }
        return eVar.s();
    }

    static <T> T k(Class<T> cls) {
        try {
            return (T) f90592a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int l(Class<?> cls) {
        if (f90598g) {
            return f90596e.a(cls);
        }
        return -1;
    }

    private static int m(Class<?> cls) {
        if (f90598g) {
            return f90596e.b(cls);
        }
        return -1;
    }

    static boolean o(Class<?> cls) {
        if (!C11518d.c()) {
            return false;
        }
        try {
            Class<?> cls2 = f90593b;
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

    private static long q(Field field) {
        e eVar;
        if (field == null || (eVar = f90596e) == null) {
            return -1L;
        }
        return eVar.j(field);
    }

    static boolean r(Object obj, long j10) {
        return f90596e.c(obj, j10);
    }

    static byte u(byte[] bArr, long j10) {
        return f90596e.d(bArr, f90599h + j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte v(Object obj, long j10) {
        return (byte) ((z(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & l3.f92484c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte w(Object obj, long j10) {
        return (byte) ((z(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & l3.f92484c);
    }

    static double x(Object obj, long j10) {
        return f90596e.e(obj, j10);
    }

    static float y(Object obj, long j10) {
        return f90596e.f(obj, j10);
    }

    static int z(Object obj, long j10) {
        return f90596e.g(obj, j10);
    }

    static {
        boolean z10;
        long jL = l(byte[].class);
        f90599h = jL;
        f90600i = l(boolean[].class);
        f90601j = m(boolean[].class);
        f90602k = l(int[].class);
        f90603l = m(int[].class);
        f90604m = l(long[].class);
        f90605n = m(long[].class);
        f90606o = l(float[].class);
        f90607p = m(float[].class);
        f90608q = l(double[].class);
        f90609r = m(double[].class);
        f90610s = l(Object[].class);
        f90611t = m(Object[].class);
        f90612u = q(n());
        f90613v = (int) (jL & 7);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z10 = true;
        } else {
            z10 = false;
        }
        f90614w = z10;
    }

    private p0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field n() {
        Field fieldP;
        if (C11518d.c() && (fieldP = p(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldP;
        }
        Field fieldP2 = p(Buffer.class, PlaceTypes.ADDRESS);
        if (fieldP2 != null && fieldP2.getType() == Long.TYPE) {
            return fieldP2;
        }
        return null;
    }

    private static Field p(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean s(Object obj, long j10) {
        if (v(obj, j10) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean t(Object obj, long j10) {
        if (w(obj, j10) != 0) {
            return true;
        }
        return false;
    }
}
