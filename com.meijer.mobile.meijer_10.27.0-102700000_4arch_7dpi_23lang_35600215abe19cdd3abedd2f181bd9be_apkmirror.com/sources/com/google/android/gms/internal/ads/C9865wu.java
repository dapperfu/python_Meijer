package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.wu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9865wu implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final C9437su f79560a;

    public C9865wu(C9437su c9437su) {
        this.f79560a = c9437su;
    }

    public final Context a() {
        return b(this.f79560a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* synthetic */ Object zzb() {
        return b(this.f79560a);
    }

    public static Context b(C9437su c9437su) {
        Context contextB = c9437su.b();
        C9233qy0.b(contextB);
        return contextB;
    }
}
