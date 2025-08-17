package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import com.fullstory.FS;

/* loaded from: classes6.dex */
final class V3 implements S3 {

    /* renamed from: d, reason: collision with root package name */
    private static V3 f82017d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f82018a;

    /* renamed from: b, reason: collision with root package name */
    private final ContentObserver f82019b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f82020c;

    private V3() {
        this.f82020c = false;
        this.f82018a = null;
        this.f82019b = null;
    }

    private V3(Context context) {
        this.f82020c = false;
        this.f82018a = context;
        this.f82019b = new T3(this, null);
    }

    static V3 c(Context context) {
        V3 v32;
        synchronized (V3.class) {
            try {
                if (f82017d == null) {
                    f82017d = Z1.e.c(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new V3(context) : new V3();
                }
                V3 v33 = f82017d;
                if (v33 != null && v33.f82019b != null && !v33.f82020c) {
                    try {
                        context.getContentResolver().registerContentObserver(E3.f81753a, true, f82017d.f82019b);
                        ((V3) Be.p.q(f82017d)).f82020c = true;
                    } catch (SecurityException e10) {
                        FS.log_e("GservicesLoader", "Unable to register Gservices content observer", e10);
                    }
                }
                v32 = (V3) Be.p.q(f82017d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return v32;
    }

    static synchronized void e() {
        Context context;
        try {
            V3 v32 = f82017d;
            if (v32 != null && (context = v32.f82018a) != null && v32.f82019b != null && v32.f82020c) {
                context.getContentResolver().unregisterContentObserver(f82017d.f82019b);
            }
            f82017d = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.S3
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final String a(final String str) {
        Context context = this.f82018a;
        if (context != null && !J3.b(context)) {
            try {
                return (String) S3.b(new R3() { // from class: com.google.android.gms.internal.measurement.U3
                    @Override // com.google.android.gms.internal.measurement.R3
                    public final /* synthetic */ Object zza() {
                        return this.f82002a.f(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e10) {
                FS.log_e("GservicesLoader", "Unable to read GServices for: ".concat(str), e10);
            }
        }
        return null;
    }

    final /* synthetic */ String f(String str) {
        return D3.a(((Context) Be.p.q(this.f82018a)).getContentResolver(), str, null);
    }
}
