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
public final class C7518Zc0 {

    /* renamed from: g, reason: collision with root package name */
    private static final HashMap f73050g = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Context f73051a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7608ad0 f73052b;

    /* renamed from: c, reason: collision with root package name */
    private final C7819cc0 f73053c;

    /* renamed from: d, reason: collision with root package name */
    private final C7450Xb0 f73054d;

    /* renamed from: e, reason: collision with root package name */
    private C7183Pc0 f73055e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f73056f = new Object();

    public C7518Zc0(Context context, InterfaceC7608ad0 interfaceC7608ad0, C7819cc0 c7819cc0, C7450Xb0 c7450Xb0) {
        this.f73051a = context;
        this.f73052b = interfaceC7608ad0;
        this.f73053c = c7819cc0;
        this.f73054d = c7450Xb0;
    }

    private final synchronized Class d(C7217Qc0 c7217Qc0) throws zzfpf {
        try {
            String strK0 = c7217Qc0.a().k0();
            HashMap map = f73050g;
            Class cls = (Class) map.get(strK0);
            if (cls != null) {
                return cls;
            }
            try {
                if (!this.f73054d.a(c7217Qc0.c())) {
                    throw new zzfpf(2026, "VM did not pass signature verification");
                }
                try {
                    File fileB = c7217Qc0.b();
                    if (!fileB.exists()) {
                        fileB.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(c7217Qc0.c().getAbsolutePath(), fileB.getAbsolutePath(), null, this.f73051a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
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

    public final InterfaceC8139fc0 a() {
        C7183Pc0 c7183Pc0;
        synchronized (this.f73056f) {
            c7183Pc0 = this.f73055e;
        }
        return c7183Pc0;
    }

    public final C7217Qc0 b() {
        synchronized (this.f73056f) {
            try {
                C7183Pc0 c7183Pc0 = this.f73055e;
                if (c7183Pc0 == null) {
                    return null;
                }
                return c7183Pc0.b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c(C7217Qc0 c7217Qc0) throws IllegalAccessException, InstantiationException, IllegalArgumentException, zzfpf, InvocationTargetException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                C7183Pc0 c7183Pc0 = new C7183Pc0(d(c7217Qc0).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f73051a, "msa-r", c7217Qc0.e(), null, new Bundle(), 2), c7217Qc0, this.f73052b, this.f73053c);
                if (c7183Pc0.d()) {
                    int iA = c7183Pc0.a();
                    if (iA == 0) {
                        synchronized (this.f73056f) {
                            C7183Pc0 c7183Pc02 = this.f73055e;
                            if (c7183Pc02 != null) {
                                try {
                                    c7183Pc02.c();
                                } catch (zzfpf e10) {
                                    this.f73053c.c(e10.a(), -1L, e10);
                                }
                                this.f73055e = c7183Pc0;
                            } else {
                                this.f73055e = c7183Pc0;
                            }
                        }
                        this.f73053c.d(3000, System.currentTimeMillis() - jCurrentTimeMillis);
                        return true;
                    }
                    throw new zzfpf(4001, "ci: " + iA);
                }
                throw new zzfpf(4000, "init failed");
            } catch (Exception e11) {
                throw new zzfpf(2004, e11);
            }
        } catch (zzfpf e12) {
            this.f73053c.c(e12.a(), System.currentTimeMillis() - jCurrentTimeMillis, e12);
            return false;
        } catch (Exception e13) {
            this.f73053c.c(4010, System.currentTimeMillis() - jCurrentTimeMillis, e13);
            return false;
        }
    }
}
