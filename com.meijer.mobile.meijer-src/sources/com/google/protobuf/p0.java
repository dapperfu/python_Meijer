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

/* loaded from: classes8.dex */
final class p0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f91431a = D();

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f91432b = C11643d.b();

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f91433c = o(Long.TYPE);

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f91434d = o(Integer.TYPE);

    /* renamed from: e, reason: collision with root package name */
    private static final e f91435e = B();

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f91436f = T();

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f91437g = S();

    /* renamed from: h, reason: collision with root package name */
    static final long f91438h;

    /* renamed from: i, reason: collision with root package name */
    private static final long f91439i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f91440j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f91441k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f91442l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f91443m;

    /* renamed from: n, reason: collision with root package name */
    private static final long f91444n;

    /* renamed from: o, reason: collision with root package name */
    private static final long f91445o;

    /* renamed from: p, reason: collision with root package name */
    private static final long f91446p;

    /* renamed from: q, reason: collision with root package name */
    private static final long f91447q;

    /* renamed from: r, reason: collision with root package name */
    private static final long f91448r;

    /* renamed from: s, reason: collision with root package name */
    private static final long f91449s;

    /* renamed from: t, reason: collision with root package name */
    private static final long f91450t;

    /* renamed from: u, reason: collision with root package name */
    private static final long f91451u;

    /* renamed from: v, reason: collision with root package name */
    private static final int f91452v;

    /* renamed from: w, reason: collision with root package name */
    static final boolean f91453w;

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
            return p0.f91453w ? p0.s(obj, j10) : p0.t(obj, j10);
        }

        @Override // com.google.protobuf.p0.e
        public byte d(Object obj, long j10) {
            return p0.f91453w ? p0.v(obj, j10) : p0.w(obj, j10);
        }

        @Override // com.google.protobuf.p0.e
        public void k(Object obj, long j10, boolean z10) {
            if (p0.f91453w) {
                p0.I(obj, j10, z10);
            } else {
                p0.J(obj, j10, z10);
            }
        }

        @Override // com.google.protobuf.p0.e
        public void l(Object obj, long j10, byte b10) {
            if (p0.f91453w) {
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
            return p0.f91453w ? p0.s(obj, j10) : p0.t(obj, j10);
        }

        @Override // com.google.protobuf.p0.e
        public byte d(Object obj, long j10) {
            return p0.f91453w ? p0.v(obj, j10) : p0.w(obj, j10);
        }

        @Override // com.google.protobuf.p0.e
        public void k(Object obj, long j10, boolean z10) {
            if (p0.f91453w) {
                p0.I(obj, j10, z10);
            } else {
                p0.J(obj, j10, z10);
            }
        }

        @Override // com.google.protobuf.p0.e
        public void l(Object obj, long j10, byte b10) {
            if (p0.f91453w) {
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
            return this.f91454a.getBoolean(obj, j10);
        }

        @Override // com.google.protobuf.p0.e
        public byte d(Object obj, long j10) {
            return this.f91454a.getByte(obj, j10);
        }

        @Override // com.google.protobuf.p0.e
        public double e(Object obj, long j10) {
            return this.f91454a.getDouble(obj, j10);
        }

        @Override // com.google.protobuf.p0.e
        public float f(Object obj, long j10) {
            return this.f91454a.getFloat(obj, j10);
        }

        @Override // com.google.protobuf.p0.e
        public void k(Object obj, long j10, boolean z10) {
            this.f91454a.putBoolean(obj, j10, z10);
        }

        @Override // com.google.protobuf.p0.e
        public void l(Object obj, long j10, byte b10) {
            this.f91454a.putByte(obj, j10, b10);
        }

        @Override // com.google.protobuf.p0.e
        public void m(Object obj, long j10, double d10) {
            this.f91454a.putDouble(obj, j10, d10);
        }

        @Override // com.google.protobuf.p0.e
        public void n(Object obj, long j10, float f10) {
            this.f91454a.putFloat(obj, j10, f10);
        }

        @Override // com.google.protobuf.p0.e
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f91454a.getClass();
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
                Class<?> cls = this.f91454a.getClass();
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
        Unsafe f91454a;

        public abstract boolean c(Object obj, long j10);

        public abstract byte d(Object obj, long j10);

        public abstract double e(Object obj, long j10);

        public abstract float f(Object obj, long j10);

        public abstract void k(Object obj, long j10, boolean z10);

        public abstract void l(Object obj, long j10, byte b10);

        public abstract void m(Object obj, long j10, double d10);

        public abstract void n(Object obj, long j10, float f10);

        public final int a(Class<?> cls) {
            return this.f91454a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f91454a.arrayIndexScale(cls);
        }

        public final int g(Object obj, long j10) {
            return this.f91454a.getInt(obj, j10);
        }

        public final long h(Object obj, long j10) {
            return this.f91454a.getLong(obj, j10);
        }

        public final Object i(Object obj, long j10) {
            return this.f91454a.getObject(obj, j10);
        }

        public final long j(Field field) {
            return this.f91454a.objectFieldOffset(field);
        }

        public final void o(Object obj, long j10, int i10) {
            this.f91454a.putInt(obj, j10, i10);
        }

        public final void p(Object obj, long j10, long j11) {
            this.f91454a.putLong(obj, j10, j11);
        }

        public final void q(Object obj, long j10, Object obj2) {
            this.f91454a.putObject(obj, j10, obj2);
        }

        public boolean r() {
            Unsafe unsafe = this.f91454a;
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
            Unsafe unsafe = this.f91454a;
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
            this.f91454a = unsafe;
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
        return f91435e.h(obj, j10);
    }

    private static e B() {
        Unsafe unsafe = f91431a;
        if (unsafe == null) {
            return null;
        }
        if (!C11643d.c()) {
            return new d(unsafe);
        }
        if (f91433c) {
            return new c(unsafe);
        }
        if (f91434d) {
            return new b(unsafe);
        }
        return null;
    }

    static Object C(Object obj, long j10) {
        return f91435e.i(obj, j10);
    }

    static Unsafe D() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean E() {
        return f91437g;
    }

    static boolean F() {
        return f91436f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Throwable th2) {
        Logger.getLogger(p0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    static void H(Object obj, long j10, boolean z10) {
        f91435e.k(obj, j10, z10);
    }

    static void K(byte[] bArr, long j10, byte b10) {
        f91435e.l(bArr, f91438h + j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void L(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iZ = z(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        P(obj, j11, ((255 & b10) << i10) | (iZ & (~(l3.f93323c << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void M(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        P(obj, j11, ((255 & b10) << i10) | (z(obj, j11) & (~(l3.f93323c << i10))));
    }

    static void N(Object obj, long j10, double d10) {
        f91435e.m(obj, j10, d10);
    }

    static void O(Object obj, long j10, float f10) {
        f91435e.n(obj, j10, f10);
    }

    static void P(Object obj, long j10, int i10) {
        f91435e.o(obj, j10, i10);
    }

    static void Q(Object obj, long j10, long j11) {
        f91435e.p(obj, j10, j11);
    }

    static void R(Object obj, long j10, Object obj2) {
        f91435e.q(obj, j10, obj2);
    }

    private static boolean S() {
        e eVar = f91435e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    private static boolean T() {
        e eVar = f91435e;
        if (eVar == null) {
            return false;
        }
        return eVar.s();
    }

    static <T> T k(Class<T> cls) {
        try {
            return (T) f91431a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int l(Class<?> cls) {
        if (f91437g) {
            return f91435e.a(cls);
        }
        return -1;
    }

    private static int m(Class<?> cls) {
        if (f91437g) {
            return f91435e.b(cls);
        }
        return -1;
    }

    static boolean o(Class<?> cls) {
        if (!C11643d.c()) {
            return false;
        }
        try {
            Class<?> cls2 = f91432b;
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
        if (field == null || (eVar = f91435e) == null) {
            return -1L;
        }
        return eVar.j(field);
    }

    static boolean r(Object obj, long j10) {
        return f91435e.c(obj, j10);
    }

    static byte u(byte[] bArr, long j10) {
        return f91435e.d(bArr, f91438h + j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte v(Object obj, long j10) {
        return (byte) ((z(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & l3.f93323c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte w(Object obj, long j10) {
        return (byte) ((z(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & l3.f93323c);
    }

    static double x(Object obj, long j10) {
        return f91435e.e(obj, j10);
    }

    static float y(Object obj, long j10) {
        return f91435e.f(obj, j10);
    }

    static int z(Object obj, long j10) {
        return f91435e.g(obj, j10);
    }

    static {
        boolean z10;
        long jL = l(byte[].class);
        f91438h = jL;
        f91439i = l(boolean[].class);
        f91440j = m(boolean[].class);
        f91441k = l(int[].class);
        f91442l = m(int[].class);
        f91443m = l(long[].class);
        f91444n = m(long[].class);
        f91445o = l(float[].class);
        f91446p = m(float[].class);
        f91447q = l(double[].class);
        f91448r = m(double[].class);
        f91449s = l(Object[].class);
        f91450t = m(Object[].class);
        f91451u = q(n());
        f91452v = (int) (jL & 7);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z10 = true;
        } else {
            z10 = false;
        }
        f91453w = z10;
    }

    private p0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field n() {
        Field fieldP;
        if (C11643d.c() && (fieldP = p(Buffer.class, "effectiveDirectAddress")) != null) {
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
