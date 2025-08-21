package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import com.fullstory.FS;

/* loaded from: classes6.dex */
final class V3 implements S3 {

    /* renamed from: d, reason: collision with root package name */
    private static V3 f82857d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f82858a;

    /* renamed from: b, reason: collision with root package name */
    private final ContentObserver f82859b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f82860c;

    private V3() {
        this.f82860c = false;
        this.f82858a = null;
        this.f82859b = null;
    }

    private V3(Context context) {
        this.f82860c = false;
        this.f82858a = context;
        this.f82859b = new T3(this, null);
    }

    static V3 c(Context context) {
        V3 v32;
        synchronized (V3.class) {
            try {
                if (f82857d == null) {
                    f82857d = Z1.e.c(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new V3(context) : new V3();
                }
                V3 v33 = f82857d;
                if (v33 != null && v33.f82859b != null && !v33.f82860c) {
                    try {
                        context.getContentResolver().registerContentObserver(E3.f82593a, true, f82857d.f82859b);
                        ((V3) De.p.q(f82857d)).f82860c = true;
                    } catch (SecurityException e10) {
                        FS.log_e("GservicesLoader", "Unable to register Gservices content observer", e10);
                    }
                }
                v32 = (V3) De.p.q(f82857d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return v32;
    }

    static synchronized void e() {
        Context context;
        try {
            V3 v32 = f82857d;
            if (v32 != null && (context = v32.f82858a) != null && v32.f82859b != null && v32.f82860c) {
                context.getContentResolver().unregisterContentObserver(f82857d.f82859b);
            }
            f82857d = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.S3
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final String a(final String str) {
        Context context = this.f82858a;
        if (context != null && !J3.b(context)) {
            try {
                return (String) S3.b(new R3() { // from class: com.google.android.gms.internal.measurement.U3
                    @Override // com.google.android.gms.internal.measurement.R3
                    public final /* synthetic */ Object zza() {
                        return this.f82842a.f(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e10) {
                FS.log_e("GservicesLoader", "Unable to read GServices for: ".concat(str), e10);
            }
        }
        return null;
    }

    final /* synthetic */ String f(String str) {
        return D3.a(((Context) De.p.q(this.f82858a)).getContentResolver(), str, null);
    }
}
