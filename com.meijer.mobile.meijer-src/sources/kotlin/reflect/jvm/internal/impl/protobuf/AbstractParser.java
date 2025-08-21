package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* loaded from: classes14.dex */
public abstract class AbstractParser<MessageType extends MessageLite> implements Parser<MessageType> {

    /* renamed from: a, reason: collision with root package name */
    private static final ExtensionRegistryLite f146725a = ExtensionRegistryLite.c();

    private MessageType e(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.a()) {
            return messagetype;
        }
        throw f(messagetype).a().i(messagetype);
    }

    private UninitializedMessageException f(MessageType messagetype) {
        return messagetype instanceof AbstractMessageLite ? ((AbstractMessageLite) messagetype).h() : new UninitializedMessageException(messagetype);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public MessageType d(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessageType) e(j(inputStream, extensionRegistryLite));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public MessageType a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessageType) e(k(inputStream, extensionRegistryLite));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public MessageType b(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessageType) e(l(byteString, extensionRegistryLite));
    }

    public MessageType j(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            return (MessageType) k(new AbstractMessageLite.Builder.a(inputStream, CodedInputStream.B(i10, inputStream)), extensionRegistryLite);
        } catch (IOException e10) {
            throw new InvalidProtocolBufferException(e10.getMessage());
        }
    }

    public MessageType k(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        CodedInputStream codedInputStreamG = CodedInputStream.g(inputStream);
        MessageType messagetypeC = c(codedInputStreamG, extensionRegistryLite);
        try {
            codedInputStreamG.a(0);
            return messagetypeC;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.i(messagetypeC);
        }
    }

    public MessageType l(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        CodedInputStream codedInputStreamS = byteString.s();
        MessageType messagetypeC = c(codedInputStreamS, extensionRegistryLite);
        try {
            codedInputStreamS.a(0);
            return messagetypeC;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.i(messagetypeC);
        }
    }
}
