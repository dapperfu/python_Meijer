package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* renamed from: com.google.android.gms.internal.ads.z7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10106z7 implements InterfaceC8930o7 {

    /* renamed from: a, reason: collision with root package name */
    private File f80372a = null;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f80373b;

    C10106z7(Context context) {
        this.f80373b = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8930o7
    public final File zza() {
        if (this.f80372a == null) {
            this.f80372a = new File(this.f80373b.getCacheDir(), "volley");
        }
        return this.f80372a;
    }
}
