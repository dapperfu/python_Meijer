package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Ud0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7230Ud0 {

    /* renamed from: b, reason: collision with root package name */
    private static C7230Ud0 f70642b;

    /* renamed from: a, reason: collision with root package name */
    final C7094Qd0 f70643a;

    public static final C7230Ud0 a(Context context) {
        C7230Ud0 c7230Ud0;
        synchronized (C7230Ud0.class) {
            try {
                if (f70642b == null) {
                    f70642b = new C7230Ud0(context);
                }
                c7230Ud0 = f70642b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c7230Ud0;
    }

    public final void b(C7026Od0 c7026Od0) throws IOException {
        synchronized (C7230Ud0.class) {
            this.f70643a.e("vendor_scoped_gpid_v2_id");
            this.f70643a.e("vendor_scoped_gpid_v2_creation_time");
        }
    }

    private C7230Ud0(Context context) {
        this.f70643a = C7094Qd0.b(context);
        C7060Pd0.a(context);
    }
}
