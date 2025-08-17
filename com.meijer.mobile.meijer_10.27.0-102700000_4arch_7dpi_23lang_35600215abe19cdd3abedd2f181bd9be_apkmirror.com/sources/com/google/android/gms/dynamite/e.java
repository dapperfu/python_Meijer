package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes4.dex */
final class e implements DynamiteModule.a {
    e() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC1261a interfaceC1261a) throws DynamiteModule.LoadingException {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int iB = interfaceC1261a.b(context, str);
        bVar.f65014a = iB;
        if (iB != 0) {
            bVar.f65016c = -1;
            return bVar;
        }
        int iA = interfaceC1261a.a(context, str, true);
        bVar.f65015b = iA;
        if (iA != 0) {
            bVar.f65016c = 1;
        }
        return bVar;
    }
}
