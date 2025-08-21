package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.ads.ag0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7614ag0 {
    public static InterfaceC7425Wf0 a(InterfaceC7425Wf0 interfaceC7425Wf0) {
        return ((interfaceC7425Wf0 instanceof C7524Zf0) || (interfaceC7425Wf0 instanceof C7458Xf0)) ? interfaceC7425Wf0 : interfaceC7425Wf0 instanceof Serializable ? new C7458Xf0(interfaceC7425Wf0) : new C7524Zf0(interfaceC7425Wf0);
    }
}
