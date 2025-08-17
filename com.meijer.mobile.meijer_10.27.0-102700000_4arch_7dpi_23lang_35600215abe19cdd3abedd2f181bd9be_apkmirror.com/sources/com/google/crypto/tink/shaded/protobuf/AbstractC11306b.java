package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.Q;

/* renamed from: com.google.crypto.tink.shaded.protobuf.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC11306b<MessageType extends Q> implements Z<MessageType> {

    /* renamed from: a, reason: collision with root package name */
    private static final C11319o f88316a = C11319o.b();

    private MessageType c(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.a()) {
            return messagetype;
        }
        throw d(messagetype).a().k(messagetype);
    }

    private UninitializedMessageException d(MessageType messagetype) {
        return messagetype instanceof AbstractC11305a ? ((AbstractC11305a) messagetype).m() : new UninitializedMessageException(messagetype);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Z
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public MessageType b(AbstractC11312h abstractC11312h, C11319o c11319o) throws InvalidProtocolBufferException {
        return (MessageType) c(f(abstractC11312h, c11319o));
    }

    public MessageType f(AbstractC11312h abstractC11312h, C11319o c11319o) throws InvalidProtocolBufferException {
        AbstractC11313i abstractC11313iR = abstractC11312h.r();
        MessageType messagetypeA = a(abstractC11313iR, c11319o);
        try {
            abstractC11313iR.a(0);
            return messagetypeA;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.k(messagetypeA);
        }
    }
}
