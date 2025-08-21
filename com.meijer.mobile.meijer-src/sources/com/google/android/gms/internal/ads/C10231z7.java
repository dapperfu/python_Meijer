package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* renamed from: com.google.android.gms.internal.ads.z7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10231z7 implements InterfaceC9055o7 {

    /* renamed from: a, reason: collision with root package name */
    private File f81212a = null;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f81213b;

    C10231z7(Context context) {
        this.f81213b = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9055o7
    public final File zza() {
        if (this.f81212a == null) {
            this.f81212a = new File(this.f81213b.getCacheDir(), "volley");
        }
        return this.f81212a;
    }
}
