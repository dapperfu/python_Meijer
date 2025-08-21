package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.P;

/* renamed from: androidx.datastore.preferences.protobuf.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6078b<MessageType extends P> implements Y<MessageType> {

    /* renamed from: a, reason: collision with root package name */
    private static final C6090n f54437a = C6090n.b();

    private MessageType c(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.a()) {
            return messagetype;
        }
        throw d(messagetype).a().k(messagetype);
    }

    private UninitializedMessageException d(MessageType messagetype) {
        return messagetype instanceof AbstractC6077a ? ((AbstractC6077a) messagetype).n() : new UninitializedMessageException(messagetype);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public MessageType a(AbstractC6083g abstractC6083g, C6090n c6090n) throws InvalidProtocolBufferException {
        return (MessageType) c(f(abstractC6083g, c6090n));
    }

    public MessageType f(AbstractC6083g abstractC6083g, C6090n c6090n) throws InvalidProtocolBufferException {
        AbstractC6084h abstractC6084hR = abstractC6083g.r();
        MessageType messagetypeB = b(abstractC6084hR, c6090n);
        try {
            abstractC6084hR.a(0);
            return messagetypeB;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.k(messagetypeB);
        }
    }
}
