package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes4.dex */
final class c implements DynamiteModule.a.InterfaceC1261a {
    c() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.a.InterfaceC1261a
    public final int a(Context context, String str, boolean z10) throws DynamiteModule.LoadingException {
        return DynamiteModule.f(context, str, z10);
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.a.InterfaceC1261a
    public final int b(Context context, String str) {
        return DynamiteModule.a(context, str);
    }
}
