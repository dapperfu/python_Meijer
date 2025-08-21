package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Pd0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7185Pd0 {

    /* renamed from: b, reason: collision with root package name */
    private static C7185Pd0 f70232b;

    /* renamed from: a, reason: collision with root package name */
    final C7219Qd0 f70233a;

    public static final C7185Pd0 a(Context context) {
        C7185Pd0 c7185Pd0;
        synchronized (C7185Pd0.class) {
            try {
                if (f70232b == null) {
                    f70232b = new C7185Pd0(context);
                }
                c7185Pd0 = f70232b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c7185Pd0;
    }

    public final void b(boolean z10) throws IOException {
        synchronized (C7185Pd0.class) {
            this.f70233a.d("paidv2_user_option", Boolean.valueOf(z10));
        }
    }

    public final void c(boolean z10) throws IOException {
        synchronized (C7185Pd0.class) {
            try {
                this.f70233a.d("paidv2_publisher_option", Boolean.valueOf(z10));
                if (!z10) {
                    this.f70233a.e("paidv2_creation_time");
                    this.f70233a.e("paidv2_id");
                    this.f70233a.e("vendor_scoped_gpid_v2_id");
                    this.f70233a.e("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean d() {
        boolean zF;
        synchronized (C7185Pd0.class) {
            zF = this.f70233a.f("paidv2_publisher_option", true);
        }
        return zF;
    }

    public final boolean e() {
        boolean zF;
        synchronized (C7185Pd0.class) {
            zF = this.f70233a.f("paidv2_user_option", true);
        }
        return zF;
    }

    private C7185Pd0(Context context) {
        this.f70233a = C7219Qd0.b(context);
    }
}
