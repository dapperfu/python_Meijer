package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Sd0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7162Sd0 extends C7128Rd0 {

    /* renamed from: i, reason: collision with root package name */
    private static C7162Sd0 f70133i;

    private C7162Sd0(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final C7162Sd0 k(Context context) {
        C7162Sd0 c7162Sd0;
        synchronized (C7162Sd0.class) {
            try {
                if (f70133i == null) {
                    f70133i = new C7162Sd0(context);
                }
                c7162Sd0 = f70133i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c7162Sd0;
    }

    public final C7026Od0 i(long j10, boolean z10) throws IOException {
        C7026Od0 c7026Od0B;
        synchronized (C7162Sd0.class) {
            c7026Od0B = b(null, null, j10, z10);
        }
        return c7026Od0B;
    }

    public final C7026Od0 j(String str, String str2, long j10, boolean z10) throws IOException {
        C7026Od0 c7026Od0B;
        synchronized (C7162Sd0.class) {
            c7026Od0B = b(str, str2, j10, z10);
        }
        return c7026Od0B;
    }

    public final void l() throws IOException {
        synchronized (C7162Sd0.class) {
            f(false);
        }
    }

    public final void m() throws IOException {
        synchronized (C7162Sd0.class) {
            f(true);
        }
    }
}
