package com.google.android.gms.internal.vision;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.medallia.digital.mobilesdk.l3;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes6.dex */
final class l2 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f85409a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f85410b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f85411c;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f85412d;

    /* renamed from: e, reason: collision with root package name */
    private static final d f85413e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f85414f;

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f85415g;

    /* renamed from: h, reason: collision with root package name */
    private static final long f85416h;

    /* renamed from: i, reason: collision with root package name */
    private static final long f85417i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f85418j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f85419k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f85420l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f85421m;

    /* renamed from: n, reason: collision with root package name */
    private static final long f85422n;

    /* renamed from: o, reason: collision with root package name */
    private static final long f85423o;

    /* renamed from: p, reason: collision with root package name */
    private static final long f85424p;

    /* renamed from: q, reason: collision with root package name */
    private static final long f85425q;

    /* renamed from: r, reason: collision with root package name */
    private static final long f85426r;

    /* renamed from: s, reason: collision with root package name */
    private static final long f85427s;

    /* renamed from: t, reason: collision with root package name */
    private static final long f85428t;

    /* renamed from: u, reason: collision with root package name */
    private static final long f85429u;

    /* renamed from: v, reason: collision with root package name */
    private static final int f85430v;

    /* renamed from: w, reason: collision with root package name */
    static final boolean f85431w;

    private static final class a extends d {
        @Override // com.google.android.gms.internal.vision.l2.d
        public final byte a(Object obj, long j10) {
            return l2.f85431w ? l2.L(obj, j10) : l2.M(obj, j10);
        }

        @Override // com.google.android.gms.internal.vision.l2.d
        public final void b(Object obj, long j10, byte b10) {
            if (l2.f85431w) {
                l2.u(obj, j10, b10);
            } else {
                l2.y(obj, j10, b10);
            }
        }

        @Override // com.google.android.gms.internal.vision.l2.d
        public final void g(Object obj, long j10, boolean z10) {
            if (l2.f85431w) {
                l2.z(obj, j10, z10);
            } else {
                l2.D(obj, j10, z10);
            }
        }

        @Override // com.google.android.gms.internal.vision.l2.d
        public final boolean h(Object obj, long j10) {
            return l2.f85431w ? l2.N(obj, j10) : l2.O(obj, j10);
        }

        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.vision.l2.d
        public final void c(Object obj, long j10, double d10) {
            f(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.android.gms.internal.vision.l2.d
        public final void d(Object obj, long j10, float f10) {
            e(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.android.gms.internal.vision.l2.d
        public final float i(Object obj, long j10) {
            return Float.intBitsToFloat(k(obj, j10));
        }

        @Override // com.google.android.gms.internal.vision.l2.d
        public final double j(Object obj, long j10) {
            return Double.longBitsToDouble(l(obj, j10));
        }
    }

    private static final class b extends d {
        @Override // com.google.android.gms.internal.vision.l2.d
        public final byte a(Object obj, long j10) {
            return this.f85432a.getByte(obj, j10);
        }

        @Override // com.google.android.gms.internal.vision.l2.d
        public final void b(Object obj, long j10, byte b10) {
            this.f85432a.putByte(obj, j10, b10);
        }

        @Override // com.google.android.gms.internal.vision.l2.d
        public final void c(Object obj, long j10, double d10) {
            this.f85432a.putDouble(obj, j10, d10);
        }

        @Override // com.google.android.gms.internal.vision.l2.d
        public final void d(Object obj, long j10, float f10) {
            this.f85432a.putFloat(obj, j10, f10);
        }

        @Override // com.google.android.gms.internal.vision.l2.d
        public final void g(Object obj, long j10, boolean z10) {
            this.f85432a.putBoolean(obj, j10, z10);
        }

        @Override // com.google.android.gms.internal.vision.l2.d
        public final boolean h(Object obj, long j10) {
            return this.f85432a.getBoolean(obj, j10);
        }

        @Override // com.google.android.gms.internal.vision.l2.d
        public final float i(Object obj, long j10) {
            return this.f85432a.getFloat(obj, j10);
        }

        @Override // com.google.android.gms.internal.vision.l2.d
        public final double j(Object obj, long j10) {
            return this.f85432a.getDouble(obj, j10);
        }

        b(Unsafe unsafe) {
            super(unsafe);
        }
    }

    private static final class c extends d {
        @Override // com.google.android.gms.internal.vision.l2.d
        public final byte a(Object obj, long j10) {
            return l2.f85431w ? l2.L(obj, j10) : l2.M(obj, j10);
        }

        @Override // com.google.android.gms.internal.vision.l2.d
        public final void b(Object obj, long j10, byte b10) {
            if (l2.f85431w) {
                l2.u(obj, j10, b10);
            } else {
                l2.y(obj, j10, b10);
            }
        }

        @Override // com.google.android.gms.internal.vision.l2.d
        public final void g(Object obj, long j10, boolean z10) {
            if (l2.f85431w) {
                l2.z(obj, j10, z10);
            } else {
                l2.D(obj, j10, z10);
            }
        }

        @Override // com.google.android.gms.internal.vision.l2.d
        public final boolean h(Object obj, long j10) {
            return l2.f85431w ? l2.N(obj, j10) : l2.O(obj, j10);
        }

        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.vision.l2.d
        public final void c(Object obj, long j10, double d10) {
            f(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.android.gms.internal.vision.l2.d
        public final void d(Object obj, long j10, float f10) {
            e(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.android.gms.internal.vision.l2.d
        public final float i(Object obj, long j10) {
            return Float.intBitsToFloat(k(obj, j10));
        }

        @Override // com.google.android.gms.internal.vision.l2.d
        public final double j(Object obj, long j10) {
            return Double.longBitsToDouble(l(obj, j10));
        }
    }

    private static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        Unsafe f85432a;

        public abstract byte a(Object obj, long j10);

        public abstract void b(Object obj, long j10, byte b10);

        public abstract void c(Object obj, long j10, double d10);

        public abstract void d(Object obj, long j10, float f10);

        public abstract void g(Object obj, long j10, boolean z10);

        public abstract boolean h(Object obj, long j10);

        public abstract float i(Object obj, long j10);

        public abstract double j(Object obj, long j10);

        public final void e(Object obj, long j10, int i10) {
            this.f85432a.putInt(obj, j10, i10);
        }

        public final void f(Object obj, long j10, long j11) {
            this.f85432a.putLong(obj, j10, j11);
        }

        public final int k(Object obj, long j10) {
            return this.f85432a.getInt(obj, j10);
        }

        public final long l(Object obj, long j10) {
            return this.f85432a.getLong(obj, j10);
        }

        d(Unsafe unsafe) {
            this.f85432a = unsafe;
        }
    }

    private l2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void D(Object obj, long j10, boolean z10) {
        y(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void z(Object obj, long j10, boolean z10) {
        u(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    private static boolean A() {
        Unsafe unsafe = f85409a;
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
            if (Z.b()) {
                return true;
            }
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
            Logger logger = Logger.getLogger(l2.class.getName());
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th2);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 71);
            sb2.append("platform method missing - proto runtime falling back to safer methods: ");
            sb2.append(strValueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb2.toString());
            return false;
        }
    }

    private static boolean B(Class<?> cls) {
        if (!Z.b()) {
            return false;
        }
        try {
            Class<?> cls2 = f85410b;
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

    static double C(Object obj, long j10) {
        return f85413e.j(obj, j10);
    }

    private static boolean E() {
        Unsafe unsafe = f85409a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (G() == null) {
                return false;
            }
            if (Z.b()) {
                return true;
            }
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
            Logger logger = Logger.getLogger(l2.class.getName());
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th2);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 71);
            sb2.append("platform method missing - proto runtime falling back to safer methods: ");
            sb2.append(strValueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb2.toString());
            return false;
        }
    }

    static Object F(Object obj, long j10) {
        return f85413e.f85432a.getObject(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte L(Object obj, long j10) {
        return (byte) (b(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte M(Object obj, long j10) {
        return (byte) (b(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3)));
    }

    static byte a(byte[] bArr, long j10) {
        return f85413e.a(bArr, f85416h + j10);
    }

    static int b(Object obj, long j10) {
        return f85413e.k(obj, j10);
    }

    static <T> T c(Class<T> cls) {
        try {
            return (T) f85409a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    static void f(Object obj, long j10, double d10) {
        f85413e.c(obj, j10, d10);
    }

    static void g(Object obj, long j10, float f10) {
        f85413e.d(obj, j10, f10);
    }

    static void h(Object obj, long j10, int i10) {
        f85413e.e(obj, j10, i10);
    }

    static void i(Object obj, long j10, long j11) {
        f85413e.f(obj, j10, j11);
    }

    static void j(Object obj, long j10, Object obj2) {
        f85413e.f85432a.putObject(obj, j10, obj2);
    }

    static void k(Object obj, long j10, boolean z10) {
        f85413e.g(obj, j10, z10);
    }

    static void l(byte[] bArr, long j10, byte b10) {
        f85413e.b(bArr, f85416h + j10, b10);
    }

    static boolean m() {
        return f85415g;
    }

    private static int n(Class<?> cls) {
        if (f85415g) {
            return f85413e.f85432a.arrayBaseOffset(cls);
        }
        return -1;
    }

    static long o(Object obj, long j10) {
        return f85413e.l(obj, j10);
    }

    static boolean r() {
        return f85414f;
    }

    private static int s(Class<?> cls) {
        if (f85415g) {
            return f85413e.f85432a.arrayIndexScale(cls);
        }
        return -1;
    }

    static Unsafe t() {
        try {
            return (Unsafe) AccessController.doPrivileged(new n2());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iB = b(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        h(obj, j11, ((255 & b10) << i10) | (iB & (~(l3.f93323c << i10))));
    }

    static boolean w(Object obj, long j10) {
        return f85413e.h(obj, j10);
    }

    static float x(Object obj, long j10) {
        return f85413e.i(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        h(obj, j11, ((255 & b10) << i10) | (b(obj, j11) & (~(l3.f93323c << i10))));
    }

    static {
        long jObjectFieldOffset;
        boolean z10;
        Unsafe unsafeT = t();
        f85409a = unsafeT;
        f85410b = Z.c();
        boolean zB = B(Long.TYPE);
        f85411c = zB;
        boolean zB2 = B(Integer.TYPE);
        f85412d = zB2;
        d bVar = null;
        if (unsafeT != null) {
            if (Z.b()) {
                if (zB) {
                    bVar = new c(unsafeT);
                } else if (zB2) {
                    bVar = new a(unsafeT);
                }
            } else {
                bVar = new b(unsafeT);
            }
        }
        f85413e = bVar;
        f85414f = E();
        f85415g = A();
        long jN = n(byte[].class);
        f85416h = jN;
        f85417i = n(boolean[].class);
        f85418j = s(boolean[].class);
        f85419k = n(int[].class);
        f85420l = s(int[].class);
        f85421m = n(long[].class);
        f85422n = s(long[].class);
        f85423o = n(float[].class);
        f85424p = s(float[].class);
        f85425q = n(double[].class);
        f85426r = s(double[].class);
        f85427s = n(Object[].class);
        f85428t = s(Object[].class);
        Field fieldG = G();
        if (fieldG != null && bVar != null) {
            jObjectFieldOffset = bVar.f85432a.objectFieldOffset(fieldG);
        } else {
            jObjectFieldOffset = -1;
        }
        f85429u = jObjectFieldOffset;
        f85430v = (int) (jN & 7);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z10 = true;
        } else {
            z10 = false;
        }
        f85431w = z10;
    }

    private static Field G() {
        Field fieldD;
        if (Z.b() && (fieldD = d(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldD;
        }
        Field fieldD2 = d(Buffer.class, PlaceTypes.ADDRESS);
        if (fieldD2 != null && fieldD2.getType() == Long.TYPE) {
            return fieldD2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean N(Object obj, long j10) {
        if (L(obj, j10) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean O(Object obj, long j10) {
        if (M(obj, j10) != 0) {
            return true;
        }
        return false;
    }

    private static Field d(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
