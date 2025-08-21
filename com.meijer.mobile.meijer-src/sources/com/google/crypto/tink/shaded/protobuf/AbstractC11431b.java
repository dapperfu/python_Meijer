package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.Q;

/* renamed from: com.google.crypto.tink.shaded.protobuf.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC11431b<MessageType extends Q> implements Z<MessageType> {

    /* renamed from: a, reason: collision with root package name */
    private static final C11444o f89156a = C11444o.b();

    private MessageType c(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.a()) {
            return messagetype;
        }
        throw d(messagetype).a().k(messagetype);
    }

    private UninitializedMessageException d(MessageType messagetype) {
        return messagetype instanceof AbstractC11430a ? ((AbstractC11430a) messagetype).m() : new UninitializedMessageException(messagetype);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Z
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public MessageType b(AbstractC11437h abstractC11437h, C11444o c11444o) throws InvalidProtocolBufferException {
        return (MessageType) c(f(abstractC11437h, c11444o));
    }

    public MessageType f(AbstractC11437h abstractC11437h, C11444o c11444o) throws InvalidProtocolBufferException {
        AbstractC11438i abstractC11438iR = abstractC11437h.r();
        MessageType messagetypeA = a(abstractC11438iR, c11444o);
        try {
            abstractC11438iR.a(0);
            return messagetypeA;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.k(messagetypeA);
        }
    }
}
