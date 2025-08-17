package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
final class B9 implements InterfaceC7327Xc0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7325Xb0 f65460a;

    B9(D9 d92, C7325Xb0 c7325Xb0) {
        this.f65460a = c7325Xb0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7327Xc0
    public final boolean zza(File file) {
        try {
            return this.f65460a.a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
