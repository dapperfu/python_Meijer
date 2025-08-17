package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: classes6.dex */
public final class MH0 extends Surface {

    /* renamed from: d, reason: collision with root package name */
    private static int f68618d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f68619e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f68620a;

    /* renamed from: b, reason: collision with root package name */
    private final KH0 f68621b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f68622c;

    public static MH0 a(Context context, boolean z10) {
        boolean z11 = true;
        if (z10 && !b(context)) {
            z11 = false;
        }
        C8086gC.f(z11);
        return new KH0().a(z10 ? f68618d : 0);
    }

    public static synchronized boolean b(Context context) {
        try {
            if (!f68619e) {
                f68618d = PG.b(context) ? PG.c() ? 1 : 2 : 0;
                f68619e = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f68618d != 0;
    }

    /* synthetic */ MH0(KH0 kh0, SurfaceTexture surfaceTexture, boolean z10, LH0 lh0) {
        super(surfaceTexture);
        this.f68621b = kh0;
        this.f68620a = z10;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f68621b) {
            try {
                if (!this.f68622c) {
                    this.f68621b.b();
                    this.f68622c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
