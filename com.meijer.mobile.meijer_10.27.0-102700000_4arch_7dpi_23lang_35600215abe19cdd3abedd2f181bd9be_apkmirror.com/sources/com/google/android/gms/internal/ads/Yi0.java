package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: classes6.dex */
final class Yi0 extends Pi0 {

    /* renamed from: a, reason: collision with root package name */
    static final Unsafe f71600a;

    /* renamed from: b, reason: collision with root package name */
    static final long f71601b;

    /* renamed from: c, reason: collision with root package name */
    static final long f71602c;

    /* renamed from: d, reason: collision with root package name */
    static final long f71603d;

    /* renamed from: e, reason: collision with root package name */
    static final long f71604e;

    /* renamed from: f, reason: collision with root package name */
    static final long f71605f;

    class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }
    }

    /* synthetic */ Yi0(C7921ej0 c7921ej0) {
        super(null);
    }

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e10) {
                throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new a());
        }
        try {
            f71602c = unsafe.objectFieldOffset(AbstractC7495aj0.class.getDeclaredField("c"));
            f71601b = unsafe.objectFieldOffset(AbstractC7495aj0.class.getDeclaredField("b"));
            f71603d = unsafe.objectFieldOffset(AbstractC7495aj0.class.getDeclaredField("a"));
            f71604e = unsafe.objectFieldOffset(Zi0.class.getDeclaredField("a"));
            f71605f = unsafe.objectFieldOffset(Zi0.class.getDeclaredField("b"));
            f71600a = unsafe;
        } catch (NoSuchFieldException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final void c(Zi0 zi0, Zi0 zi02) {
        f71600a.putObject(zi0, f71605f, zi02);
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final void d(Zi0 zi0, Thread thread) {
        f71600a.putObject(zi0, f71604e, thread);
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final boolean e(AbstractC7495aj0 abstractC7495aj0, Si0 si0, Si0 si02) {
        return C7708cj0.a(f71600a, abstractC7495aj0, f71601b, si0, si02);
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final boolean f(AbstractC7495aj0 abstractC7495aj0, Object obj, Object obj2) {
        return C7708cj0.a(f71600a, abstractC7495aj0, f71603d, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final boolean g(AbstractC7495aj0 abstractC7495aj0, Zi0 zi0, Zi0 zi02) {
        return C7708cj0.a(f71600a, abstractC7495aj0, f71602c, zi0, zi02);
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final Si0 a(AbstractC7495aj0 abstractC7495aj0, Si0 si0) {
        Si0 si02;
        do {
            si02 = abstractC7495aj0.f72482b;
            if (si0 == si02) {
                break;
            }
        } while (!e(abstractC7495aj0, si02, si0));
        return si02;
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final Zi0 b(AbstractC7495aj0 abstractC7495aj0, Zi0 zi0) {
        Zi0 zi02;
        do {
            zi02 = abstractC7495aj0.f72483c;
            if (zi0 == zi02) {
                break;
            }
        } while (!g(abstractC7495aj0, zi02, zi0));
        return zi02;
    }
}
