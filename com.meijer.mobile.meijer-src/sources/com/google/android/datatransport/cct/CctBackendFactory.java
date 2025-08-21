package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import uc.AbstractC17375h;
import uc.InterfaceC17371d;
import uc.InterfaceC17380m;

@Keep
/* loaded from: classes4.dex */
public class CctBackendFactory implements InterfaceC17371d {
    @Override // uc.InterfaceC17371d
    public InterfaceC17380m create(AbstractC17375h abstractC17375h) {
        return new d(abstractC17375h.b(), abstractC17375h.e(), abstractC17375h.d());
    }
}
