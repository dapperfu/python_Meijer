package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.AbstractC10325q;
import com.google.android.gms.internal.clearcut.r;

/* loaded from: classes6.dex */
public abstract class r<MessageType extends AbstractC10325q<MessageType, BuilderType>, BuilderType extends r<MessageType, BuilderType>> implements K0 {
    @Override // com.google.android.gms.internal.clearcut.K0
    public final /* synthetic */ K0 J2(J0 j02) {
        if (b().getClass().isInstance(j02)) {
            return c((AbstractC10325q) j02);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    protected abstract BuilderType c(MessageType messagetype);
}
