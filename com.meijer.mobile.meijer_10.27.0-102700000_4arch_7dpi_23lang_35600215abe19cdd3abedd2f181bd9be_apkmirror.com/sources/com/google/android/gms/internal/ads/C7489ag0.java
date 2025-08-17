package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.ads.ag0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7489ag0 {
    public static InterfaceC7300Wf0 a(InterfaceC7300Wf0 interfaceC7300Wf0) {
        return ((interfaceC7300Wf0 instanceof C7399Zf0) || (interfaceC7300Wf0 instanceof C7333Xf0)) ? interfaceC7300Wf0 : interfaceC7300Wf0 instanceof Serializable ? new C7333Xf0(interfaceC7300Wf0) : new C7399Zf0(interfaceC7300Wf0);
    }
}
