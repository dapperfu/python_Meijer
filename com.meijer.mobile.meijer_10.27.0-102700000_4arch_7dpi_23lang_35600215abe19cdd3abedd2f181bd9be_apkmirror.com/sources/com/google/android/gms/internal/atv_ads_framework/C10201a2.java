package com.google.android.gms.internal.atv_ads_framework;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.medallia.digital.mobilesdk.l3;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.a2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10201a2 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f80957a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f80958b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f80959c;

    /* renamed from: d, reason: collision with root package name */
    private static final Z1 f80960d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f80961e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f80962f;

    /* renamed from: g, reason: collision with root package name */
    static final long f80963g;

    /* renamed from: h, reason: collision with root package name */
    static final boolean f80964h;

    private C10201a2() {
    }

    static boolean C() {
        return f80962f;
    }

    static boolean D() {
        return f80961e;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    static {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.atv_ads_framework.C10201a2.<clinit>():void");
    }

    static boolean A(Class cls) {
        int i10 = C10216f0.f80977a;
        try {
            Class cls2 = f80958b;
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
        return f80960d.g(obj, j10);
    }

    private static int E(Class cls) {
        if (f80962f) {
            return f80960d.f80944a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int a(Class cls) {
        if (f80962f) {
            return f80960d.f80944a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field b() {
        int i10 = C10216f0.f80977a;
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
        Z1 z12 = f80960d;
        long j11 = (-4) & j10;
        int i10 = z12.f80944a.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        z12.f80944a.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(l3.f92484c << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j10, byte b10) {
        Z1 z12 = f80960d;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        z12.f80944a.putInt(obj, j11, ((255 & b10) << i10) | (z12.f80944a.getInt(obj, j11) & (~(l3.f92484c << i10))));
    }

    static double f(Object obj, long j10) {
        return f80960d.a(obj, j10);
    }

    static float g(Object obj, long j10) {
        return f80960d.b(obj, j10);
    }

    static int h(Object obj, long j10) {
        return f80960d.f80944a.getInt(obj, j10);
    }

    static long i(Object obj, long j10) {
        return f80960d.f80944a.getLong(obj, j10);
    }

    static Object j(Class cls) {
        try {
            return f80957a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    static Object k(Object obj, long j10) {
        return f80960d.f80944a.getObject(obj, j10);
    }

    static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new W1());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void m(Throwable th2) {
        Logger.getLogger(C10201a2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    static void r(Object obj, long j10, boolean z10) {
        f80960d.c(obj, j10, z10);
    }

    static void s(byte[] bArr, long j10, byte b10) {
        f80960d.d(bArr, f80963g + j10, b10);
    }

    static void t(Object obj, long j10, double d10) {
        f80960d.e(obj, j10, d10);
    }

    static void u(Object obj, long j10, float f10) {
        f80960d.f(obj, j10, f10);
    }

    static void v(Object obj, long j10, int i10) {
        f80960d.f80944a.putInt(obj, j10, i10);
    }

    static void w(Object obj, long j10, long j11) {
        f80960d.f80944a.putLong(obj, j10, j11);
    }

    static void x(Object obj, long j10, Object obj2) {
        f80960d.f80944a.putObject(obj, j10, obj2);
    }

    static /* bridge */ /* synthetic */ boolean y(Object obj, long j10) {
        return ((byte) ((f80960d.f80944a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & l3.f92484c)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean z(Object obj, long j10) {
        return ((byte) ((f80960d.f80944a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & l3.f92484c)) != 0;
    }

    private static Field c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
