package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import sc.AbstractC16928h;
import sc.InterfaceC16924d;
import sc.InterfaceC16933m;

@Keep
/* loaded from: classes4.dex */
public class CctBackendFactory implements InterfaceC16924d {
    @Override // sc.InterfaceC16924d
    public InterfaceC16933m create(AbstractC16928h abstractC16928h) {
        return new d(abstractC16928h.b(), abstractC16928h.e(), abstractC16928h.d());
    }
}
