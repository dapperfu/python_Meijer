package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.wx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9871wx implements InterfaceC7069Pi {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C6575Ax f79620a;

    C9871wx(C6575Ax c6575Ax) {
        this.f79620a = c6575Ax;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final void a(Object obj, Map map) {
        if (C6575Ax.g(this.f79620a, map)) {
            this.f79620a.f65370c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.vx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79386a.f79620a.f65371d.a();
                }
            });
        }
    }
}
