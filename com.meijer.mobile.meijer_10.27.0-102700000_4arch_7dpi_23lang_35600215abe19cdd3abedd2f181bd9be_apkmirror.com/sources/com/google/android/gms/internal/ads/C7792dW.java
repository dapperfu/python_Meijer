package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.dW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7792dW implements Lc.g {

    /* renamed from: a, reason: collision with root package name */
    private final XB f73421a;

    /* renamed from: b, reason: collision with root package name */
    private final C9367sC f73422b;

    /* renamed from: c, reason: collision with root package name */
    private final C8413jG f73423c;

    /* renamed from: d, reason: collision with root package name */
    private final C7561bG f73424d;

    /* renamed from: e, reason: collision with root package name */
    private final C6745Fx f73425e;

    /* renamed from: f, reason: collision with root package name */
    final AtomicBoolean f73426f = new AtomicBoolean(false);

    @Override // Lc.g
    public final synchronized void zza(View view) {
        if (this.f73426f.compareAndSet(false, true)) {
            this.f73425e.zzr();
            this.f73424d.R0(view);
        }
    }

    @Override // Lc.g
    public final void zzb() {
        if (this.f73426f.get()) {
            this.f73421a.v();
        }
    }

    @Override // Lc.g
    public final void zzc() {
        if (this.f73426f.get()) {
            this.f73422b.zza();
            this.f73423c.zza();
        }
    }

    C7792dW(XB xb2, C9367sC c9367sC, C8413jG c8413jG, C7561bG c7561bG, C6745Fx c6745Fx) {
        this.f73421a = xb2;
        this.f73422b = c9367sC;
        this.f73423c = c8413jG;
        this.f73424d = c7561bG;
        this.f73425e = c6745Fx;
    }
}
