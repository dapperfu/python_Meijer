package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
final class B9 implements InterfaceC7452Xc0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7450Xb0 f66300a;

    B9(D9 d92, C7450Xb0 c7450Xb0) {
        this.f66300a = c7450Xb0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7452Xc0
    public final boolean zza(File file) {
        try {
            return this.f66300a.a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
