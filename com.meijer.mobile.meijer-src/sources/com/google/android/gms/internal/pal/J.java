package com.google.android.gms.internal.pal;

import com.google.android.gms.internal.pal.J;
import com.google.android.gms.internal.pal.K;

/* loaded from: classes6.dex */
public abstract class J<MessageType extends K<MessageType, BuilderType>, BuilderType extends J<MessageType, BuilderType>> implements InterfaceC10799f1 {
    protected abstract J c(K k10);

    @Override // com.google.android.gms.internal.pal.InterfaceC10799f1
    public final /* bridge */ /* synthetic */ InterfaceC10799f1 A3(InterfaceC10815g1 interfaceC10815g1) {
        if (C().getClass().isInstance(interfaceC10815g1)) {
            return c((K) interfaceC10815g1);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
