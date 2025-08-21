package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.wx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9996wx implements InterfaceC7194Pi {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C6700Ax f80460a;

    C9996wx(C6700Ax c6700Ax) {
        this.f80460a = c6700Ax;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final void a(Object obj, Map map) {
        if (C6700Ax.g(this.f80460a, map)) {
            this.f80460a.f66210c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.vx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f80226a.f80460a.f66211d.a();
                }
            });
        }
    }
}
