package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Pd0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7060Pd0 {

    /* renamed from: b, reason: collision with root package name */
    private static C7060Pd0 f69392b;

    /* renamed from: a, reason: collision with root package name */
    final C7094Qd0 f69393a;

    public static final C7060Pd0 a(Context context) {
        C7060Pd0 c7060Pd0;
        synchronized (C7060Pd0.class) {
            try {
                if (f69392b == null) {
                    f69392b = new C7060Pd0(context);
                }
                c7060Pd0 = f69392b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c7060Pd0;
    }

    public final void b(boolean z10) throws IOException {
        synchronized (C7060Pd0.class) {
            this.f69393a.d("paidv2_user_option", Boolean.valueOf(z10));
        }
    }

    public final void c(boolean z10) throws IOException {
        synchronized (C7060Pd0.class) {
            try {
                this.f69393a.d("paidv2_publisher_option", Boolean.valueOf(z10));
                if (!z10) {
                    this.f69393a.e("paidv2_creation_time");
                    this.f69393a.e("paidv2_id");
                    this.f69393a.e("vendor_scoped_gpid_v2_id");
                    this.f69393a.e("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean d() {
        boolean zF;
        synchronized (C7060Pd0.class) {
            zF = this.f69393a.f("paidv2_publisher_option", true);
        }
        return zF;
    }

    public final boolean e() {
        boolean zF;
        synchronized (C7060Pd0.class) {
            zF = this.f69393a.f("paidv2_user_option", true);
        }
        return zF;
    }

    private C7060Pd0(Context context) {
        this.f69393a = C7094Qd0.b(context);
    }
}
