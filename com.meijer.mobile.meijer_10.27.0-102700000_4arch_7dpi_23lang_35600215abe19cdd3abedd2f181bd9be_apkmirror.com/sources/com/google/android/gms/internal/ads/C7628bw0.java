package com.google.android.gms.internal.ads;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.bw0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7628bw0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f73020a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f73021b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f73022c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC7521aw0 f73023d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f73024e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f73025f;

    /* renamed from: g, reason: collision with root package name */
    static final long f73026g;

    /* renamed from: h, reason: collision with root package name */
    private static final long f73027h;

    /* renamed from: i, reason: collision with root package name */
    static final boolean f73028i;

    private C7628bw0() {
    }

    static boolean a() {
        return f73025f;
    }

    static boolean b() {
        return f73024e;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    static {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7628bw0.<clinit>():void");
    }

    static void A(Object obj, long j10, float f10) {
        f73023d.h(obj, j10, f10);
    }

    static void B(Object obj, long j10, int i10) {
        f73023d.f72687a.putInt(obj, j10, i10);
    }

    static void C(Object obj, long j10, long j11) {
        f73023d.f72687a.putLong(obj, j10, j11);
    }

    static void D(Object obj, long j10, Object obj2) {
        f73023d.f72687a.putObject(obj, j10, obj2);
    }

    static /* bridge */ /* synthetic */ boolean E(Object obj, long j10) {
        return ((byte) ((f73023d.f72687a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & com.medallia.digital.mobilesdk.l3.f92484c)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean F(Object obj, long j10) {
        return ((byte) ((f73023d.f72687a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & com.medallia.digital.mobilesdk.l3.f92484c)) != 0;
    }

    static boolean G(Class cls) {
        int i10 = Lt0.f68450a;
        try {
            Class cls2 = f73021b;
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

    static boolean H(Object obj, long j10) {
        return f73023d.i(obj, j10);
    }

    private static int c(Class cls) {
        if (f73025f) {
            return f73023d.f72687a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int d(Class cls) {
        if (f73025f) {
            return f73023d.f72687a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field e() {
        int i10 = Lt0.f68450a;
        Field fieldF = f(Buffer.class, "effectiveDirectAddress");
        if (fieldF != null) {
            return fieldF;
        }
        Field fieldF2 = f(Buffer.class, PlaceTypes.ADDRESS);
        if (fieldF2 == null || fieldF2.getType() != Long.TYPE) {
            return null;
        }
        return fieldF2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(Object obj, long j10, byte b10) {
        AbstractC7521aw0 abstractC7521aw0 = f73023d;
        long j11 = (-4) & j10;
        int i10 = abstractC7521aw0.f72687a.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        abstractC7521aw0.f72687a.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(com.medallia.digital.mobilesdk.l3.f92484c << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(Object obj, long j10, byte b10) {
        AbstractC7521aw0 abstractC7521aw0 = f73023d;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        abstractC7521aw0.f72687a.putInt(obj, j11, ((255 & b10) << i10) | (abstractC7521aw0.f72687a.getInt(obj, j11) & (~(com.medallia.digital.mobilesdk.l3.f92484c << i10))));
    }

    static byte i(long j10) {
        return f73023d.a(j10);
    }

    static double j(Object obj, long j10) {
        return f73023d.b(obj, j10);
    }

    static float k(Object obj, long j10) {
        return f73023d.c(obj, j10);
    }

    static int l(Object obj, long j10) {
        return f73023d.f72687a.getInt(obj, j10);
    }

    static long m(ByteBuffer byteBuffer) {
        AbstractC7521aw0 abstractC7521aw0 = f73023d;
        return abstractC7521aw0.f72687a.getLong(byteBuffer, f73027h);
    }

    static long n(Object obj, long j10) {
        return f73023d.f72687a.getLong(obj, j10);
    }

    static Object o(Class cls) {
        try {
            return f73020a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    static Object p(Object obj, long j10) {
        return f73023d.f72687a.getObject(obj, j10);
    }

    static Unsafe q() {
        try {
            return (Unsafe) AccessController.doPrivileged(new Xv0());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void r(Throwable th2) {
        Logger.getLogger(C7628bw0.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    static void w(long j10, byte[] bArr, long j11, long j12) {
        f73023d.d(j10, bArr, j11, j12);
    }

    static void x(Object obj, long j10, boolean z10) {
        f73023d.e(obj, j10, z10);
    }

    static void y(byte[] bArr, long j10, byte b10) {
        f73023d.f(bArr, f73026g + j10, b10);
    }

    static void z(Object obj, long j10, double d10) {
        f73023d.g(obj, j10, d10);
    }

    private static Field f(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
