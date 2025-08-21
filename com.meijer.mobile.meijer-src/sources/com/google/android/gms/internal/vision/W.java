package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.W;
import com.google.android.gms.internal.vision.X;

/* loaded from: classes6.dex */
public abstract class W<MessageType extends X<MessageType, BuilderType>, BuilderType extends W<MessageType, BuilderType>> implements InterfaceC11217z1 {
    protected abstract BuilderType b(MessageType messagetype);

    public abstract BuilderType c(byte[] bArr, int i10, int i11, A0 a02) throws zzjk;

    @Override // com.google.android.gms.internal.vision.InterfaceC11217z1
    public final /* synthetic */ InterfaceC11217z1 W2(InterfaceC11208w1 interfaceC11208w1) {
        if (zzr().getClass().isInstance(interfaceC11208w1)) {
            return b((X) interfaceC11208w1);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
