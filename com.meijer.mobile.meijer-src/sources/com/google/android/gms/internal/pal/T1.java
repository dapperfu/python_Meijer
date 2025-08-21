package com.google.android.gms.internal.pal;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes6.dex */
final class T1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f83717a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f83718b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f83719c;

    /* renamed from: d, reason: collision with root package name */
    private static final S1 f83720d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f83721e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f83722f;

    /* renamed from: g, reason: collision with root package name */
    static final long f83723g;

    /* renamed from: h, reason: collision with root package name */
    static final boolean f83724h;

    private T1() {
    }

    static boolean C() {
        return f83722f;
    }

    static boolean D() {
        return f83721e;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    static {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pal.T1.<clinit>():void");
    }

    static boolean A(Class cls) {
        int i10 = M.f83595a;
        try {
            Class cls2 = f83718b;
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

    static boolean B(Object obj, long j10) {
        return f83720d.g(obj, j10);
    }

    private static int E(Class cls) {
        if (f83722f) {
            return f83720d.h(cls);
        }
        return -1;
    }

    private static int a(Class cls) {
        if (f83722f) {
            return f83720d.i(cls);
        }
        return -1;
    }

    private static Field b() {
        int i10 = M.f83595a;
        Field fieldC = c(Buffer.class, "effectiveDirectAddress");
        if (fieldC != null) {
            return fieldC;
        }
        Field fieldC2 = c(Buffer.class, PlaceTypes.ADDRESS);
        if (fieldC2 == null || fieldC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldC2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        S1 s12 = f83720d;
        int iJ = s12.j(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        s12.n(obj, j11, ((255 & b10) << i10) | (iJ & (~(com.medallia.digital.mobilesdk.l3.f93323c << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        S1 s12 = f83720d;
        int i10 = (((int) j10) & 3) << 3;
        s12.n(obj, j11, ((255 & b10) << i10) | (s12.j(obj, j11) & (~(com.medallia.digital.mobilesdk.l3.f93323c << i10))));
    }

    static double f(Object obj, long j10) {
        return f83720d.a(obj, j10);
    }

    static float g(Object obj, long j10) {
        return f83720d.b(obj, j10);
    }

    static int h(Object obj, long j10) {
        return f83720d.j(obj, j10);
    }

    static long i(Object obj, long j10) {
        return f83720d.k(obj, j10);
    }

    static Object j(Class cls) {
        try {
            return f83717a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    static Object k(Object obj, long j10) {
        return f83720d.m(obj, j10);
    }

    static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new P1());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void m(Throwable th2) {
        Logger.getLogger(T1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    static void r(Object obj, long j10, boolean z10) {
        f83720d.c(obj, j10, z10);
    }

    static void s(byte[] bArr, long j10, byte b10) {
        f83720d.d(bArr, f83723g + j10, b10);
    }

    static void t(Object obj, long j10, double d10) {
        f83720d.e(obj, j10, d10);
    }

    static void u(Object obj, long j10, float f10) {
        f83720d.f(obj, j10, f10);
    }

    static void v(Object obj, long j10, int i10) {
        f83720d.n(obj, j10, i10);
    }

    static void w(Object obj, long j10, long j11) {
        f83720d.o(obj, j10, j11);
    }

    static void x(Object obj, long j10, Object obj2) {
        f83720d.p(obj, j10, obj2);
    }

    static /* bridge */ /* synthetic */ boolean y(Object obj, long j10) {
        return ((byte) ((f83720d.j(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & com.medallia.digital.mobilesdk.l3.f93323c)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean z(Object obj, long j10) {
        return ((byte) ((f83720d.j(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & com.medallia.digital.mobilesdk.l3.f93323c)) != 0;
    }

    private static Field c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
