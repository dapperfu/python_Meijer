package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* loaded from: classes14.dex */
public interface MessageLite extends MessageLiteOrBuilder {

    public interface Builder extends Cloneable, MessageLiteOrBuilder {
        MessageLite build();

        Builder r0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException;
    }

    Builder b();

    int c();

    Builder d();

    Parser<? extends MessageLite> f();

    void g(CodedOutputStream codedOutputStream) throws IOException;
}
