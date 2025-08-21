package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Td0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7321Td0 extends C7253Rd0 {

    /* renamed from: i, reason: collision with root package name */
    private static C7321Td0 f71267i;

    private C7321Td0(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final C7321Td0 j(Context context) {
        C7321Td0 c7321Td0;
        synchronized (C7321Td0.class) {
            try {
                if (f71267i == null) {
                    f71267i = new C7321Td0(context);
                }
                c7321Td0 = f71267i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c7321Td0;
    }

    public final C7151Od0 i(long j10, boolean z10) throws IOException {
        synchronized (C7321Td0.class) {
            try {
                if (this.f70750g.d()) {
                    return b(null, null, j10, z10);
                }
                return new C7151Od0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k() throws IOException {
        synchronized (C7321Td0.class) {
            try {
                if (g(false)) {
                    f(false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
