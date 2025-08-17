package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Zc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7393Zc0 {

    /* renamed from: g, reason: collision with root package name */
    private static final HashMap f72210g = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Context f72211a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7483ad0 f72212b;

    /* renamed from: c, reason: collision with root package name */
    private final C7694cc0 f72213c;

    /* renamed from: d, reason: collision with root package name */
    private final C7325Xb0 f72214d;

    /* renamed from: e, reason: collision with root package name */
    private C7058Pc0 f72215e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f72216f = new Object();

    public C7393Zc0(Context context, InterfaceC7483ad0 interfaceC7483ad0, C7694cc0 c7694cc0, C7325Xb0 c7325Xb0) {
        this.f72211a = context;
        this.f72212b = interfaceC7483ad0;
        this.f72213c = c7694cc0;
        this.f72214d = c7325Xb0;
    }

    private final synchronized Class d(C7092Qc0 c7092Qc0) throws zzfpf {
        try {
            String strK0 = c7092Qc0.a().k0();
            HashMap map = f72210g;
            Class cls = (Class) map.get(strK0);
            if (cls != null) {
                return cls;
            }
            try {
                if (!this.f72214d.a(c7092Qc0.c())) {
                    throw new zzfpf(2026, "VM did not pass signature verification");
                }
                try {
                    File fileB = c7092Qc0.b();
                    if (!fileB.exists()) {
                        fileB.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(c7092Qc0.c().getAbsolutePath(), fileB.getAbsolutePath(), null, this.f72211a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strK0, clsLoadClass);
                    return clsLoadClass;
                } catch (ClassNotFoundException e10) {
                    e = e10;
                    throw new zzfpf(2008, e);
                } catch (IllegalArgumentException e11) {
                    e = e11;
                    throw new zzfpf(2008, e);
                } catch (SecurityException e12) {
                    e = e12;
                    throw new zzfpf(2008, e);
                }
            } catch (GeneralSecurityException e13) {
                throw new zzfpf(2026, e13);
            }
        } finally {
        }
    }

    public final InterfaceC8014fc0 a() {
        C7058Pc0 c7058Pc0;
        synchronized (this.f72216f) {
            c7058Pc0 = this.f72215e;
        }
        return c7058Pc0;
    }

    public final C7092Qc0 b() {
        synchronized (this.f72216f) {
            try {
                C7058Pc0 c7058Pc0 = this.f72215e;
                if (c7058Pc0 == null) {
                    return null;
                }
                return c7058Pc0.b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c(C7092Qc0 c7092Qc0) throws IllegalAccessException, InstantiationException, IllegalArgumentException, zzfpf, InvocationTargetException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                C7058Pc0 c7058Pc0 = new C7058Pc0(d(c7092Qc0).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f72211a, "msa-r", c7092Qc0.e(), null, new Bundle(), 2), c7092Qc0, this.f72212b, this.f72213c);
                if (c7058Pc0.d()) {
                    int iA = c7058Pc0.a();
                    if (iA == 0) {
                        synchronized (this.f72216f) {
                            C7058Pc0 c7058Pc02 = this.f72215e;
                            if (c7058Pc02 != null) {
                                try {
                                    c7058Pc02.c();
                                } catch (zzfpf e10) {
                                    this.f72213c.c(e10.a(), -1L, e10);
                                }
                                this.f72215e = c7058Pc0;
                            } else {
                                this.f72215e = c7058Pc0;
                            }
                        }
                        this.f72213c.d(3000, System.currentTimeMillis() - jCurrentTimeMillis);
                        return true;
                    }
                    throw new zzfpf(4001, "ci: " + iA);
                }
                throw new zzfpf(4000, "init failed");
            } catch (Exception e11) {
                throw new zzfpf(2004, e11);
            }
        } catch (zzfpf e12) {
            this.f72213c.c(e12.a(), System.currentTimeMillis() - jCurrentTimeMillis, e12);
            return false;
        } catch (Exception e13) {
            this.f72213c.c(4010, System.currentTimeMillis() - jCurrentTimeMillis, e13);
            return false;
        }
    }
}
