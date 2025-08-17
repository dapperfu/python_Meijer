package com.google.android.gms.internal.pal;

import com.google.android.gms.internal.pal.U6;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.pal.e7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10663e7 extends V6 {

    /* renamed from: a, reason: collision with root package name */
    static final Unsafe f83100a;

    /* renamed from: b, reason: collision with root package name */
    static final long f83101b;

    /* renamed from: c, reason: collision with root package name */
    static final long f83102c;

    /* renamed from: d, reason: collision with root package name */
    static final long f83103d;

    /* renamed from: e, reason: collision with root package name */
    static final long f83104e;

    /* renamed from: f, reason: collision with root package name */
    static final long f83105f;

    /* renamed from: com.google.android.gms.internal.pal.e7$a */
    class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        public static final Unsafe a() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
            return a();
        }
    }

    /* synthetic */ C10663e7(U6.a aVar) {
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
            f83102c = unsafe.objectFieldOffset(U6.class.getDeclaredField("c"));
            f83101b = unsafe.objectFieldOffset(U6.class.getDeclaredField("b"));
            f83103d = unsafe.objectFieldOffset(U6.class.getDeclaredField("a"));
            f83104e = unsafe.objectFieldOffset(C10680f7.class.getDeclaredField("a"));
            f83105f = unsafe.objectFieldOffset(C10680f7.class.getDeclaredField("b"));
            f83100a = unsafe;
        } catch (NoSuchFieldException e11) {
            throw new RuntimeException(e11);
        } catch (RuntimeException e12) {
            throw e12;
        }
    }

    @Override // com.google.android.gms.internal.pal.V6
    final void c(C10680f7 c10680f7, C10680f7 c10680f72) {
        f83100a.putObject(c10680f7, f83105f, c10680f72);
    }

    @Override // com.google.android.gms.internal.pal.V6
    final void d(C10680f7 c10680f7, Thread thread) {
        f83100a.putObject(c10680f7, f83104e, thread);
    }

    @Override // com.google.android.gms.internal.pal.V6
    final boolean e(U6 u62, Object obj, Object obj2) {
        return C10712h7.a(f83100a, u62, f83103d, obj, obj2);
    }

    @Override // com.google.android.gms.internal.pal.V6
    final boolean f(U6 u62, C10680f7 c10680f7, C10680f7 c10680f72) {
        return C10712h7.a(f83100a, u62, f83102c, c10680f7, c10680f72);
    }

    @Override // com.google.android.gms.internal.pal.V6
    final Y6 a(U6 u62, Y6 y62) {
        Y6 y63;
        while (true) {
            y63 = u62.f82908b;
            if (y62 == y63) {
                break;
            }
            U6 u63 = u62;
            Y6 y64 = y62;
            if (C10712h7.a(f83100a, u63, f83101b, y63, y64)) {
                break;
            }
            u62 = u63;
            y62 = y64;
        }
        return y63;
    }

    @Override // com.google.android.gms.internal.pal.V6
    final C10680f7 b(U6 u62, C10680f7 c10680f7) {
        C10680f7 c10680f72;
        do {
            c10680f72 = u62.f82909c;
            if (c10680f7 == c10680f72) {
                break;
            }
        } while (!f(u62, c10680f72, c10680f7));
        return c10680f72;
    }
}
