package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes4.dex */
final class f implements DynamiteModule.a {
    f() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC1270a interfaceC1270a) throws DynamiteModule.LoadingException {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int iA = interfaceC1270a.a(context, str, false);
        bVar.f65855b = iA;
        bVar.f65856c = iA != 0 ? 1 : 0;
        return bVar;
    }
}
