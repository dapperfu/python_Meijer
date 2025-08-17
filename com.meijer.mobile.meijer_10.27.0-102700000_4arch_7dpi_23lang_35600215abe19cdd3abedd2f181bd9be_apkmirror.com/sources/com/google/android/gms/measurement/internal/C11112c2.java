package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.c2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11112c2 {

    /* renamed from: g, reason: collision with root package name */
    private static final Object f85376g = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final String f85377a;

    /* renamed from: b, reason: collision with root package name */
    private final N f85378b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f85379c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f85380d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f85381e = null;

    /* renamed from: f, reason: collision with root package name */
    private volatile Object f85382f = null;

    /* synthetic */ C11112c2(String str, Object obj, Object obj2, N n10, byte[] bArr) {
        this.f85377a = str;
        this.f85379c = obj;
        this.f85378b = n10;
    }

    public final String a() {
        return this.f85377a;
    }

    public final Object b(Object obj) {
        synchronized (this.f85380d) {
        }
        if (obj != null) {
            return obj;
        }
        if (W1.f85262a == null) {
            return this.f85379c;
        }
        synchronized (f85376g) {
            try {
                if (C11133f.a()) {
                    return this.f85382f == null ? this.f85379c : this.f85382f;
                }
                try {
                    for (C11112c2 c11112c2 : C11120d2.f85450a) {
                        if (C11133f.a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objZza = null;
                        try {
                            N n10 = c11112c2.f85378b;
                            if (n10 != null) {
                                objZza = n10.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f85376g) {
                            c11112c2.f85382f = objZza;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                N n11 = this.f85378b;
                if (n11 != null) {
                    try {
                        return n11.zza();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.f85379c;
            } finally {
            }
        }
    }
}
