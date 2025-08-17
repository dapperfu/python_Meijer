package com.google.android.gms.internal.clearcut;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.medallia.digital.mobilesdk.l3;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.clearcut.y1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10350y1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f81610a = Logger.getLogger(C10350y1.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final Unsafe f81611b;

    /* renamed from: c, reason: collision with root package name */
    private static final Class<?> f81612c;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f81613d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f81614e;

    /* renamed from: f, reason: collision with root package name */
    private static final d f81615f;

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f81616g;

    /* renamed from: h, reason: collision with root package name */
    private static final boolean f81617h;

    /* renamed from: i, reason: collision with root package name */
    private static final long f81618i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f81619j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f81620k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f81621l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f81622m;

    /* renamed from: n, reason: collision with root package name */
    private static final long f81623n;

    /* renamed from: o, reason: collision with root package name */
    private static final long f81624o;

    /* renamed from: p, reason: collision with root package name */
    private static final long f81625p;

    /* renamed from: q, reason: collision with root package name */
    private static final long f81626q;

    /* renamed from: r, reason: collision with root package name */
    private static final long f81627r;

    /* renamed from: s, reason: collision with root package name */
    private static final long f81628s;

    /* renamed from: t, reason: collision with root package name */
    private static final long f81629t;

    /* renamed from: u, reason: collision with root package name */
    private static final long f81630u;

    /* renamed from: v, reason: collision with root package name */
    private static final long f81631v;

    /* renamed from: w, reason: collision with root package name */
    private static final long f81632w;

    /* renamed from: x, reason: collision with root package name */
    private static final boolean f81633x;

    /* renamed from: com.google.android.gms.internal.clearcut.y1$a */
    static final class a extends d {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.clearcut.C10350y1.d
        public final void b(long j10, byte b10) {
            Memory.pokeByte((int) j10, b10);
        }

        @Override // com.google.android.gms.internal.clearcut.C10350y1.d
        public final void c(Object obj, long j10, double d10) {
            f(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.android.gms.internal.clearcut.C10350y1.d
        public final void d(Object obj, long j10, float f10) {
            e(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.android.gms.internal.clearcut.C10350y1.d
        public final void g(Object obj, long j10, boolean z10) {
            if (C10350y1.f81633x) {
                C10350y1.r(obj, j10, z10);
            } else {
                C10350y1.t(obj, j10, z10);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.C10350y1.d
        public final void h(byte[] bArr, long j10, long j11, long j12) {
            Memory.pokeByteArray((int) j11, bArr, (int) j10, (int) j12);
        }

        @Override // com.google.android.gms.internal.clearcut.C10350y1.d
        public final void i(Object obj, long j10, byte b10) {
            if (C10350y1.f81633x) {
                C10350y1.d(obj, j10, b10);
            } else {
                C10350y1.q(obj, j10, b10);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.C10350y1.d
        public final boolean l(Object obj, long j10) {
            return C10350y1.f81633x ? C10350y1.P(obj, j10) : C10350y1.Q(obj, j10);
        }

        @Override // com.google.android.gms.internal.clearcut.C10350y1.d
        public final float m(Object obj, long j10) {
            return Float.intBitsToFloat(j(obj, j10));
        }

        @Override // com.google.android.gms.internal.clearcut.C10350y1.d
        public final double n(Object obj, long j10) {
            return Double.longBitsToDouble(k(obj, j10));
        }

        @Override // com.google.android.gms.internal.clearcut.C10350y1.d
        public final byte o(Object obj, long j10) {
            return C10350y1.f81633x ? C10350y1.N(obj, j10) : C10350y1.O(obj, j10);
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.y1$b */
    static final class b extends d {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.clearcut.C10350y1.d
        public final void b(long j10, byte b10) {
            Memory.pokeByte(j10, b10);
        }

        @Override // com.google.android.gms.internal.clearcut.C10350y1.d
        public final void c(Object obj, long j10, double d10) {
            f(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.android.gms.internal.clearcut.C10350y1.d
        public final void d(Object obj, long j10, float f10) {
            e(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.android.gms.internal.clearcut.C10350y1.d
        public final void g(Object obj, long j10, boolean z10) {
            if (C10350y1.f81633x) {
                C10350y1.r(obj, j10, z10);
            } else {
                C10350y1.t(obj, j10, z10);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.C10350y1.d
        public final void h(byte[] bArr, long j10, long j11, long j12) {
            Memory.pokeByteArray(j11, bArr, (int) j10, (int) j12);
        }

        @Override // com.google.android.gms.internal.clearcut.C10350y1.d
        public final void i(Object obj, long j10, byte b10) {
            if (C10350y1.f81633x) {
                C10350y1.d(obj, j10, b10);
            } else {
                C10350y1.q(obj, j10, b10);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.C10350y1.d
        public final boolean l(Object obj, long j10) {
            return C10350y1.f81633x ? C10350y1.P(obj, j10) : C10350y1.Q(obj, j10);
        }

        @Override // com.google.android.gms.internal.clearcut.C10350y1.d
        public final float m(Object obj, long j10) {
            return Float.intBitsToFloat(j(obj, j10));
        }

        @Override // com.google.android.gms.internal.clearcut.C10350y1.d
        public final double n(Object obj, long j10) {
            return Double.longBitsToDouble(k(obj, j10));
        }

        @Override // com.google.android.gms.internal.clearcut.C10350y1.d
        public final byte o(Object obj, long j10) {
            return C10350y1.f81633x ? C10350y1.N(obj, j10) : C10350y1.O(obj, j10);
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.y1$c */
    static final class c extends d {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.clearcut.C10350y1.d
        public final void b(long j10, byte b10) {
            this.f81634a.putByte(j10, b10);
        }

        @Override // com.google.android.gms.internal.clearcut.C10350y1.d
        public final void c(Object obj, long j10, double d10) {
            this.f81634a.putDouble(obj, j10, d10);
        }

        @Override // com.google.android.gms.internal.clearcut.C10350y1.d
        public final void d(Object obj, long j10, float f10) {
            this.f81634a.putFloat(obj, j10, f10);
        }

        @Override // com.google.android.gms.internal.clearcut.C10350y1.d
        public final void g(Object obj, long j10, boolean z10) {
            this.f81634a.putBoolean(obj, j10, z10);
        }

        @Override // com.google.android.gms.internal.clearcut.C10350y1.d
        public final void h(byte[] bArr, long j10, long j11, long j12) {
            this.f81634a.copyMemory(bArr, C10350y1.f81618i + j10, (Object) null, j11, j12);
        }

        @Override // com.google.android.gms.internal.clearcut.C10350y1.d
        public final void i(Object obj, long j10, byte b10) {
            this.f81634a.putByte(obj, j10, b10);
        }

        @Override // com.google.android.gms.internal.clearcut.C10350y1.d
        public final boolean l(Object obj, long j10) {
            return this.f81634a.getBoolean(obj, j10);
        }

        @Override // com.google.android.gms.internal.clearcut.C10350y1.d
        public final float m(Object obj, long j10) {
            return this.f81634a.getFloat(obj, j10);
        }

        @Override // com.google.android.gms.internal.clearcut.C10350y1.d
        public final double n(Object obj, long j10) {
            return this.f81634a.getDouble(obj, j10);
        }

        @Override // com.google.android.gms.internal.clearcut.C10350y1.d
        public final byte o(Object obj, long j10) {
            return this.f81634a.getByte(obj, j10);
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.y1$d */
    static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        Unsafe f81634a;

        d(Unsafe unsafe) {
            this.f81634a = unsafe;
        }

        public final long a(Field field) {
            return this.f81634a.objectFieldOffset(field);
        }

        public abstract void b(long j10, byte b10);

        public abstract void c(Object obj, long j10, double d10);

        public abstract void d(Object obj, long j10, float f10);

        public final void e(Object obj, long j10, int i10) {
            this.f81634a.putInt(obj, j10, i10);
        }

        public final void f(Object obj, long j10, long j11) {
            this.f81634a.putLong(obj, j10, j11);
        }

        public abstract void g(Object obj, long j10, boolean z10);

        public abstract void h(byte[] bArr, long j10, long j11, long j12);

        public abstract void i(Object obj, long j10, byte b10);

        public final int j(Object obj, long j10) {
            return this.f81634a.getInt(obj, j10);
        }

        public final long k(Object obj, long j10) {
            return this.f81634a.getLong(obj, j10);
        }

        public abstract boolean l(Object obj, long j10);

        public abstract float m(Object obj, long j10);

        public abstract double n(Object obj, long j10);

        public abstract byte o(Object obj, long j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x002b  */
    static {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C10350y1.<clinit>():void");
    }

    private C10350y1() {
    }

    private static boolean A() {
        Unsafe unsafe = f81611b;
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
            if (C10336u.b()) {
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
            Logger logger = f81610a;
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th2);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 71);
            sb2.append("platform method missing - proto runtime falling back to safer methods: ");
            sb2.append(strValueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb2.toString());
            return false;
        }
    }

    private static boolean B() {
        Unsafe unsafe = f81611b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (C() == null) {
                return false;
            }
            if (C10336u.b()) {
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
            Logger logger = f81610a;
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th2);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 71);
            sb2.append("platform method missing - proto runtime falling back to safer methods: ");
            sb2.append(strValueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb2.toString());
            return false;
        }
    }

    private static Field C() {
        Field fieldP;
        if (C10336u.b() && (fieldP = p(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldP;
        }
        Field fieldP2 = p(Buffer.class, PlaceTypes.ADDRESS);
        if (fieldP2 == null || fieldP2.getType() != Long.TYPE) {
            return null;
        }
        return fieldP2;
    }

    private static int E(Class<?> cls) {
        if (f81617h) {
            return f81615f.f81634a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int F(Class<?> cls) {
        if (f81617h) {
            return f81615f.f81634a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static boolean G(Class<?> cls) {
        if (!C10336u.b()) {
            return false;
        }
        try {
            Class<?> cls2 = f81612c;
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

    static int H(Object obj, long j10) {
        return f81615f.j(obj, j10);
    }

    static long I(Object obj, long j10) {
        return f81615f.k(obj, j10);
    }

    static boolean J(Object obj, long j10) {
        return f81615f.l(obj, j10);
    }

    static float K(Object obj, long j10) {
        return f81615f.m(obj, j10);
    }

    static double L(Object obj, long j10) {
        return f81615f.n(obj, j10);
    }

    static Object M(Object obj, long j10) {
        return f81615f.f81634a.getObject(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte N(Object obj, long j10) {
        return (byte) (H(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte O(Object obj, long j10) {
        return (byte) (H(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean P(Object obj, long j10) {
        return N(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean Q(Object obj, long j10) {
        return O(obj, j10) != 0;
    }

    static byte a(byte[] bArr, long j10) {
        return f81615f.o(bArr, f81618i + j10);
    }

    static long b(Field field) {
        return f81615f.a(field);
    }

    static void c(long j10, byte b10) {
        f81615f.b(j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iH = H(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        g(obj, j11, ((255 & b10) << i10) | (iH & (~(l3.f92484c << i10))));
    }

    static void e(Object obj, long j10, double d10) {
        f81615f.c(obj, j10, d10);
    }

    static void f(Object obj, long j10, float f10) {
        f81615f.d(obj, j10, f10);
    }

    static void g(Object obj, long j10, int i10) {
        f81615f.e(obj, j10, i10);
    }

    static void h(Object obj, long j10, long j11) {
        f81615f.f(obj, j10, j11);
    }

    static void i(Object obj, long j10, Object obj2) {
        f81615f.f81634a.putObject(obj, j10, obj2);
    }

    static void j(Object obj, long j10, boolean z10) {
        f81615f.g(obj, j10, z10);
    }

    static void k(byte[] bArr, long j10, byte b10) {
        f81615f.i(bArr, f81618i + j10, b10);
    }

    static void l(byte[] bArr, long j10, long j11, long j12) {
        f81615f.h(bArr, j10, j11, j12);
    }

    private static long n(Field field) {
        d dVar;
        if (field == null || (dVar = f81615f) == null) {
            return -1L;
        }
        return dVar.a(field);
    }

    static long o(ByteBuffer byteBuffer) {
        return f81615f.k(byteBuffer, f81631v);
    }

    private static Field p(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        g(obj, j11, ((255 & b10) << i10) | (H(obj, j11) & (~(l3.f92484c << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(Object obj, long j10, boolean z10) {
        d(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void t(Object obj, long j10, boolean z10) {
        q(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    static boolean x() {
        return f81617h;
    }

    static boolean y() {
        return f81616g;
    }

    static Unsafe z() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C10353z1());
        } catch (Throwable unused) {
            return null;
        }
    }
}
