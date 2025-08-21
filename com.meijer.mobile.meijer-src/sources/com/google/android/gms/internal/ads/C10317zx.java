package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.zx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10317zx implements InterfaceC7194Pi {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C6700Ax f81398a;

    C10317zx(C6700Ax c6700Ax) {
        this.f81398a = c6700Ax;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final void a(Object obj, Map map) {
        if (C6700Ax.g(this.f81398a, map)) {
            this.f81398a.f66210c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.yx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f81154a.f81398a.f66211d.s();
                }
            });
        }
    }
}
