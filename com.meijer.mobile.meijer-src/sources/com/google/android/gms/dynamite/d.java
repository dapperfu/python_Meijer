package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes4.dex */
final class d implements DynamiteModule.a {
    d() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC1270a interfaceC1270a) throws DynamiteModule.LoadingException {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int iA = interfaceC1270a.a(context, str, true);
        bVar.f65855b = iA;
        if (iA != 0) {
            bVar.f65856c = 1;
            return bVar;
        }
        int iB = interfaceC1270a.b(context, str);
        bVar.f65854a = iB;
        if (iB != 0) {
            bVar.f65856c = -1;
        }
        return bVar;
    }
}
