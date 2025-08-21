package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.c2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11237c2 {

    /* renamed from: g, reason: collision with root package name */
    private static final Object f86216g = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final String f86217a;

    /* renamed from: b, reason: collision with root package name */
    private final N f86218b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f86219c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f86220d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f86221e = null;

    /* renamed from: f, reason: collision with root package name */
    private volatile Object f86222f = null;

    /* synthetic */ C11237c2(String str, Object obj, Object obj2, N n10, byte[] bArr) {
        this.f86217a = str;
        this.f86219c = obj;
        this.f86218b = n10;
    }

    public final String a() {
        return this.f86217a;
    }

    public final Object b(Object obj) {
        synchronized (this.f86220d) {
        }
        if (obj != null) {
            return obj;
        }
        if (W1.f86102a == null) {
            return this.f86219c;
        }
        synchronized (f86216g) {
            try {
                if (C11258f.a()) {
                    return this.f86222f == null ? this.f86219c : this.f86222f;
                }
                try {
                    for (C11237c2 c11237c2 : C11245d2.f86290a) {
                        if (C11258f.a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objZza = null;
                        try {
                            N n10 = c11237c2.f86218b;
                            if (n10 != null) {
                                objZza = n10.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f86216g) {
                            c11237c2.f86222f = objZza;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                N n11 = this.f86218b;
                if (n11 != null) {
                    try {
                        return n11.zza();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.f86219c;
            } finally {
            }
        }
    }
}
