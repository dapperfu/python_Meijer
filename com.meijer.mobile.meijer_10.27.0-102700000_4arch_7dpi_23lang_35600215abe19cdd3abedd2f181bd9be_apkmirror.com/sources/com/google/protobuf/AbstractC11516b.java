package com.google.protobuf;

import com.google.protobuf.P;

/* renamed from: com.google.protobuf.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC11516b<MessageType extends P> implements Y<MessageType> {

    /* renamed from: a, reason: collision with root package name */
    private static final C11528n f90486a = C11528n.b();

    private MessageType c(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.a()) {
            return messagetype;
        }
        throw d(messagetype).a().j(messagetype);
    }

    private UninitializedMessageException d(MessageType messagetype) {
        return messagetype instanceof AbstractC11515a ? ((AbstractC11515a) messagetype).t() : new UninitializedMessageException(messagetype);
    }

    @Override // com.google.protobuf.Y
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public MessageType a(AbstractC11521g abstractC11521g, C11528n c11528n) throws InvalidProtocolBufferException {
        return (MessageType) c(f(abstractC11521g, c11528n));
    }

    public MessageType f(AbstractC11521g abstractC11521g, C11528n c11528n) throws InvalidProtocolBufferException {
        AbstractC11522h abstractC11522hQ = abstractC11521g.q();
        MessageType messagetypeB = b(abstractC11522hQ, c11528n);
        try {
            abstractC11522hQ.a(0);
            return messagetypeB;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.j(messagetypeB);
        }
    }
}
