package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.wu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9990wu implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final C9562su f80400a;

    public C9990wu(C9562su c9562su) {
        this.f80400a = c9562su;
    }

    public final Context a() {
        return b(this.f80400a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* synthetic */ Object zzb() {
        return b(this.f80400a);
    }

    public static Context b(C9562su c9562su) {
        Context contextB = c9562su.b();
        C9358qy0.b(contextB);
        return contextB;
    }
}
