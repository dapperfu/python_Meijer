package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes4.dex */
final class j implements DynamiteModule.a {
    j() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC1270a interfaceC1270a) throws DynamiteModule.LoadingException {
        int iA;
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int iB = interfaceC1270a.b(context, str);
        bVar.f65854a = iB;
        int i10 = 1;
        int i11 = 0;
        if (iB != 0) {
            iA = interfaceC1270a.a(context, str, false);
            bVar.f65855b = iA;
        } else {
            iA = interfaceC1270a.a(context, str, true);
            bVar.f65855b = iA;
        }
        int i12 = bVar.f65854a;
        if (i12 == 0) {
            if (iA == 0) {
                i10 = 0;
            }
            bVar.f65856c = i10;
            return bVar;
        }
        i11 = i12;
        if (iA < i11) {
            i10 = -1;
        }
        bVar.f65856c = i10;
        return bVar;
    }
}
