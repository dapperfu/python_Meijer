package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Ud0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7355Ud0 {

    /* renamed from: b, reason: collision with root package name */
    private static C7355Ud0 f71482b;

    /* renamed from: a, reason: collision with root package name */
    final C7219Qd0 f71483a;

    public static final C7355Ud0 a(Context context) {
        C7355Ud0 c7355Ud0;
        synchronized (C7355Ud0.class) {
            try {
                if (f71482b == null) {
                    f71482b = new C7355Ud0(context);
                }
                c7355Ud0 = f71482b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c7355Ud0;
    }

    public final void b(C7151Od0 c7151Od0) throws IOException {
        synchronized (C7355Ud0.class) {
            this.f71483a.e("vendor_scoped_gpid_v2_id");
            this.f71483a.e("vendor_scoped_gpid_v2_creation_time");
        }
    }

    private C7355Ud0(Context context) {
        this.f71483a = C7219Qd0.b(context);
        C7185Pd0.a(context);
    }
}
