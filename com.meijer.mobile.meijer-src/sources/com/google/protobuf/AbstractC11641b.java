package com.google.protobuf;

import com.google.protobuf.P;

/* renamed from: com.google.protobuf.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC11641b<MessageType extends P> implements Y<MessageType> {

    /* renamed from: a, reason: collision with root package name */
    private static final C11653n f91325a = C11653n.b();

    private MessageType c(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.a()) {
            return messagetype;
        }
        throw d(messagetype).a().j(messagetype);
    }

    private UninitializedMessageException d(MessageType messagetype) {
        return messagetype instanceof AbstractC11640a ? ((AbstractC11640a) messagetype).t() : new UninitializedMessageException(messagetype);
    }

    @Override // com.google.protobuf.Y
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public MessageType a(AbstractC11646g abstractC11646g, C11653n c11653n) throws InvalidProtocolBufferException {
        return (MessageType) c(f(abstractC11646g, c11653n));
    }

    public MessageType f(AbstractC11646g abstractC11646g, C11653n c11653n) throws InvalidProtocolBufferException {
        AbstractC11647h abstractC11647hQ = abstractC11646g.q();
        MessageType messagetypeB = b(abstractC11647hQ, c11653n);
        try {
            abstractC11647hQ.a(0);
            return messagetypeB;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.j(messagetypeB);
        }
    }
}
