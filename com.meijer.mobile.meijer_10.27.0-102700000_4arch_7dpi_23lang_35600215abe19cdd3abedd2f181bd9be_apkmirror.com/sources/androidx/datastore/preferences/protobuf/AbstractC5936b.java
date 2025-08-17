package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.P;

/* renamed from: androidx.datastore.preferences.protobuf.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5936b<MessageType extends P> implements Y<MessageType> {

    /* renamed from: a, reason: collision with root package name */
    private static final C5948n f54213a = C5948n.b();

    private MessageType c(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.a()) {
            return messagetype;
        }
        throw d(messagetype).a().k(messagetype);
    }

    private UninitializedMessageException d(MessageType messagetype) {
        return messagetype instanceof AbstractC5935a ? ((AbstractC5935a) messagetype).n() : new UninitializedMessageException(messagetype);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public MessageType a(AbstractC5941g abstractC5941g, C5948n c5948n) throws InvalidProtocolBufferException {
        return (MessageType) c(f(abstractC5941g, c5948n));
    }

    public MessageType f(AbstractC5941g abstractC5941g, C5948n c5948n) throws InvalidProtocolBufferException {
        AbstractC5942h abstractC5942hR = abstractC5941g.r();
        MessageType messagetypeB = b(abstractC5942hR, c5948n);
        try {
            abstractC5942hR.a(0);
            return messagetypeB;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.k(messagetypeB);
        }
    }
}
