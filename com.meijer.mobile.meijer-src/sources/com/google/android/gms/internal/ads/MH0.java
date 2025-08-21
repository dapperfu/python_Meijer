package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: classes6.dex */
public final class MH0 extends Surface {

    /* renamed from: d, reason: collision with root package name */
    private static int f69458d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f69459e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f69460a;

    /* renamed from: b, reason: collision with root package name */
    private final KH0 f69461b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f69462c;

    public static MH0 a(Context context, boolean z10) {
        boolean z11 = true;
        if (z10 && !b(context)) {
            z11 = false;
        }
        C8211gC.f(z11);
        return new KH0().a(z10 ? f69458d : 0);
    }

    public static synchronized boolean b(Context context) {
        try {
            if (!f69459e) {
                f69458d = PG.b(context) ? PG.c() ? 1 : 2 : 0;
                f69459e = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f69458d != 0;
    }

    /* synthetic */ MH0(KH0 kh0, SurfaceTexture surfaceTexture, boolean z10, LH0 lh0) {
        super(surfaceTexture);
        this.f69461b = kh0;
        this.f69460a = z10;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f69461b) {
            try {
                if (!this.f69462c) {
                    this.f69461b.b();
                    this.f69462c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
