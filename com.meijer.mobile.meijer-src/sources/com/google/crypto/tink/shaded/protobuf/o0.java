package com.google.crypto.tink.shaded.protobuf;

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
final class o0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f89266a = D();

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f89267b = C11433d.b();

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f89268c = o(Long.TYPE);

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f89269d = o(Integer.TYPE);

    /* renamed from: e, reason: collision with root package name */
    private static final e f89270e = B();

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f89271f = T();

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f89272g = S();

    /* renamed from: h, reason: collision with root package name */
    static final long f89273h;

    /* renamed from: i, reason: collision with root package name */
    private static final long f89274i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f89275j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f89276k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f89277l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f89278m;

    /* renamed from: n, reason: collision with root package name */
    private static final long f89279n;

    /* renamed from: o, reason: collision with root package name */
    private static final long f89280o;

    /* renamed from: p, reason: collision with root package name */
    private static final long f89281p;

    /* renamed from: q, reason: collision with root package name */
    private static final long f89282q;

    /* renamed from: r, reason: collision with root package name */
    private static final long f89283r;

    /* renamed from: s, reason: collision with root package name */
    private static final long f89284s;

    /* renamed from: t, reason: collision with root package name */
    private static final long f89285t;

    /* renamed from: u, reason: collision with root package name */
    private static final long f89286u;

    /* renamed from: v, reason: collision with root package name */
    private static final int f89287v;

    /* renamed from: w, reason: collision with root package name */
    static final boolean f89288w;

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
        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public boolean s() {
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public boolean c(Object obj, long j10) {
            return o0.f89288w ? o0.s(obj, j10) : o0.t(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public byte d(Object obj, long j10) {
            return o0.f89288w ? o0.v(obj, j10) : o0.w(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void k(Object obj, long j10, boolean z10) {
            if (o0.f89288w) {
                o0.I(obj, j10, z10);
            } else {
                o0.J(obj, j10, z10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void l(Object obj, long j10, byte b10) {
            if (o0.f89288w) {
                o0.L(obj, j10, b10);
            } else {
                o0.M(obj, j10, b10);
            }
        }

        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }
    }

    private static final class c extends e {
        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public boolean s() {
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public boolean c(Object obj, long j10) {
            return o0.f89288w ? o0.s(obj, j10) : o0.t(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public byte d(Object obj, long j10) {
            return o0.f89288w ? o0.v(obj, j10) : o0.w(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void k(Object obj, long j10, boolean z10) {
            if (o0.f89288w) {
                o0.I(obj, j10, z10);
            } else {
                o0.J(obj, j10, z10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void l(Object obj, long j10, byte b10) {
            if (o0.f89288w) {
                o0.L(obj, j10, b10);
            } else {
                o0.M(obj, j10, b10);
            }
        }

        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }
    }

    private static final class d extends e {
        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public boolean c(Object obj, long j10) {
            return this.f89289a.getBoolean(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public byte d(Object obj, long j10) {
            return this.f89289a.getByte(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public double e(Object obj, long j10) {
            return this.f89289a.getDouble(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public float f(Object obj, long j10) {
            return this.f89289a.getFloat(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void k(Object obj, long j10, boolean z10) {
            this.f89289a.putBoolean(obj, j10, z10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void l(Object obj, long j10, byte b10) {
            this.f89289a.putByte(obj, j10, b10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void m(Object obj, long j10, double d10) {
            this.f89289a.putDouble(obj, j10, d10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void n(Object obj, long j10, float f10) {
            this.f89289a.putFloat(obj, j10, f10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f89289a.getClass();
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
                o0.G(th2);
                return false;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public boolean s() {
            if (!super.s()) {
                return false;
            }
            try {
                Class<?> cls = this.f89289a.getClass();
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
                o0.G(th2);
                return false;
            }
        }

        d(Unsafe unsafe) {
            super(unsafe);
        }
    }

    private static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        Unsafe f89289a;

        public abstract boolean c(Object obj, long j10);

        public abstract byte d(Object obj, long j10);

        public abstract double e(Object obj, long j10);

        public abstract float f(Object obj, long j10);

        public abstract void k(Object obj, long j10, boolean z10);

        public abstract void l(Object obj, long j10, byte b10);

        public abstract void m(Object obj, long j10, double d10);

        public abstract void n(Object obj, long j10, float f10);

        public final int a(Class<?> cls) {
            return this.f89289a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f89289a.arrayIndexScale(cls);
        }

        public final int g(Object obj, long j10) {
            return this.f89289a.getInt(obj, j10);
        }

        public final long h(Object obj, long j10) {
            return this.f89289a.getLong(obj, j10);
        }

        public final Object i(Object obj, long j10) {
            return this.f89289a.getObject(obj, j10);
        }

        public final long j(Field field) {
            return this.f89289a.objectFieldOffset(field);
        }

        public final void o(Object obj, long j10, int i10) {
            this.f89289a.putInt(obj, j10, i10);
        }

        public final void p(Object obj, long j10, long j11) {
            this.f89289a.putLong(obj, j10, j11);
        }

        public final void q(Object obj, long j10, Object obj2) {
            this.f89289a.putObject(obj, j10, obj2);
        }

        public boolean r() {
            Unsafe unsafe = this.f89289a;
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
                o0.G(th2);
                return false;
            }
        }

        public boolean s() {
            Unsafe unsafe = this.f89289a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return o0.n() != null;
            } catch (Throwable th2) {
                o0.G(th2);
                return false;
            }
        }

        e(Unsafe unsafe) {
            this.f89289a = unsafe;
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
        return f89270e.h(obj, j10);
    }

    private static e B() {
        Unsafe unsafe = f89266a;
        if (unsafe == null) {
            return null;
        }
        if (!C11433d.c()) {
            return new d(unsafe);
        }
        if (f89268c) {
            return new c(unsafe);
        }
        if (f89269d) {
            return new b(unsafe);
        }
        return null;
    }

    static Object C(Object obj, long j10) {
        return f89270e.i(obj, j10);
    }

    static Unsafe D() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean E() {
        return f89272g;
    }

    static boolean F() {
        return f89271f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Throwable th2) {
        Logger.getLogger(o0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    static void H(Object obj, long j10, boolean z10) {
        f89270e.k(obj, j10, z10);
    }

    static void K(byte[] bArr, long j10, byte b10) {
        f89270e.l(bArr, f89273h + j10, b10);
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
        f89270e.m(obj, j10, d10);
    }

    static void O(Object obj, long j10, float f10) {
        f89270e.n(obj, j10, f10);
    }

    static void P(Object obj, long j10, int i10) {
        f89270e.o(obj, j10, i10);
    }

    static void Q(Object obj, long j10, long j11) {
        f89270e.p(obj, j10, j11);
    }

    static void R(Object obj, long j10, Object obj2) {
        f89270e.q(obj, j10, obj2);
    }

    private static boolean S() {
        e eVar = f89270e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    private static boolean T() {
        e eVar = f89270e;
        if (eVar == null) {
            return false;
        }
        return eVar.s();
    }

    static <T> T k(Class<T> cls) {
        try {
            return (T) f89266a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int l(Class<?> cls) {
        if (f89272g) {
            return f89270e.a(cls);
        }
        return -1;
    }

    private static int m(Class<?> cls) {
        if (f89272g) {
            return f89270e.b(cls);
        }
        return -1;
    }

    static boolean o(Class<?> cls) {
        if (!C11433d.c()) {
            return false;
        }
        try {
            Class<?> cls2 = f89267b;
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
        if (field == null || (eVar = f89270e) == null) {
            return -1L;
        }
        return eVar.j(field);
    }

    static boolean r(Object obj, long j10) {
        return f89270e.c(obj, j10);
    }

    static byte u(byte[] bArr, long j10) {
        return f89270e.d(bArr, f89273h + j10);
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
        return f89270e.e(obj, j10);
    }

    static float y(Object obj, long j10) {
        return f89270e.f(obj, j10);
    }

    static int z(Object obj, long j10) {
        return f89270e.g(obj, j10);
    }

    static {
        boolean z10;
        long jL = l(byte[].class);
        f89273h = jL;
        f89274i = l(boolean[].class);
        f89275j = m(boolean[].class);
        f89276k = l(int[].class);
        f89277l = m(int[].class);
        f89278m = l(long[].class);
        f89279n = m(long[].class);
        f89280o = l(float[].class);
        f89281p = m(float[].class);
        f89282q = l(double[].class);
        f89283r = m(double[].class);
        f89284s = l(Object[].class);
        f89285t = m(Object[].class);
        f89286u = q(n());
        f89287v = (int) (jL & 7);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z10 = true;
        } else {
            z10 = false;
        }
        f89288w = z10;
    }

    private o0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field n() {
        Field fieldP;
        if (C11433d.c() && (fieldP = p(Buffer.class, "effectiveDirectAddress")) != null) {
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
