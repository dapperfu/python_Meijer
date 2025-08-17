package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Td0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7196Td0 extends C7128Rd0 {

    /* renamed from: i, reason: collision with root package name */
    private static C7196Td0 f70427i;

    private C7196Td0(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final C7196Td0 j(Context context) {
        C7196Td0 c7196Td0;
        synchronized (C7196Td0.class) {
            try {
                if (f70427i == null) {
                    f70427i = new C7196Td0(context);
                }
                c7196Td0 = f70427i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c7196Td0;
    }

    public final C7026Od0 i(long j10, boolean z10) throws IOException {
        synchronized (C7196Td0.class) {
            try {
                if (this.f69910g.d()) {
                    return b(null, null, j10, z10);
                }
                return new C7026Od0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k() throws IOException {
        synchronized (C7196Td0.class) {
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
