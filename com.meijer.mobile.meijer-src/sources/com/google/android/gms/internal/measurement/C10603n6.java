package com.google.android.gms.internal.measurement;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.n6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10603n6 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f83138a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f83139b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f83140c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC10594m6 f83141d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f83142e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f83143f;

    /* renamed from: g, reason: collision with root package name */
    static final long f83144g;

    /* renamed from: h, reason: collision with root package name */
    static final boolean f83145h;

    private C10603n6() {
    }

    static boolean f() {
        return f83143f;
    }

    static boolean g() {
        return f83142e;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    static {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C10603n6.<clinit>():void");
    }

    static /* synthetic */ boolean A(Object obj, long j10) {
        return ((byte) ((f83141d.f83115a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & com.medallia.digital.mobilesdk.l3.f93323c)) != 0;
    }

    static /* synthetic */ void D(Throwable th2) {
        Logger.getLogger(C10603n6.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    private static int E(Class cls) {
        if (f83143f) {
            return f83141d.f83115a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int a(Class cls) {
        if (f83143f) {
            return f83141d.f83115a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field b() {
        int i10 = C10654t4.f83258a;
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
        Unsafe unsafe = f83141d.f83115a;
        long j11 = (-4) & j10;
        int i10 = unsafe.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(com.medallia.digital.mobilesdk.l3.f93323c << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j10, byte b10) {
        Unsafe unsafe = f83141d.f83115a;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i10) | (unsafe.getInt(obj, j11) & (~(com.medallia.digital.mobilesdk.l3.f93323c << i10))));
    }

    static Object h(Class cls) {
        try {
            return f83138a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    static int i(Object obj, long j10) {
        return f83141d.f83115a.getInt(obj, j10);
    }

    static void j(Object obj, long j10, int i10) {
        f83141d.f83115a.putInt(obj, j10, i10);
    }

    static long k(Object obj, long j10) {
        return f83141d.f83115a.getLong(obj, j10);
    }

    static void l(Object obj, long j10, long j11) {
        f83141d.f83115a.putLong(obj, j10, j11);
    }

    static boolean m(Object obj, long j10) {
        return f83141d.b(obj, j10);
    }

    static void n(Object obj, long j10, boolean z10) {
        f83141d.c(obj, j10, z10);
    }

    static float o(Object obj, long j10) {
        return f83141d.d(obj, j10);
    }

    static void p(Object obj, long j10, float f10) {
        f83141d.e(obj, j10, f10);
    }

    static double q(Object obj, long j10) {
        return f83141d.f(obj, j10);
    }

    static void r(Object obj, long j10, double d10) {
        f83141d.g(obj, j10, d10);
    }

    static Object s(Object obj, long j10) {
        return f83141d.f83115a.getObject(obj, j10);
    }

    static void t(Object obj, long j10, Object obj2) {
        f83141d.f83115a.putObject(obj, j10, obj2);
    }

    static void u(byte[] bArr, long j10, byte b10) {
        f83141d.a(bArr, f83144g + j10, b10);
    }

    static Unsafe v() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C10567j6());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean w(Class cls) {
        int i10 = C10654t4.f83258a;
        try {
            Class cls2 = f83139b;
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

    static /* synthetic */ boolean z(Object obj, long j10) {
        return ((byte) ((f83141d.f83115a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & com.medallia.digital.mobilesdk.l3.f93323c)) != 0;
    }

    private static Field c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
