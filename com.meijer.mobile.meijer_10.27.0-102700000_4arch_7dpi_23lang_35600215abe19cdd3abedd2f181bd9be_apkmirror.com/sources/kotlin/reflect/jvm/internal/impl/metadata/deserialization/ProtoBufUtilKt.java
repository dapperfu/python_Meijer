package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* loaded from: classes13.dex */
public final class ProtoBufUtilKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends GeneratedMessageLite.ExtendableMessage<M>, T> T a(GeneratedMessageLite.ExtendableMessage<M> extendableMessage, GeneratedMessageLite.GeneratedExtension<M, T> extension) {
        Intrinsics.j(extendableMessage, "<this>");
        Intrinsics.j(extension, "extension");
        if (extendableMessage.y(extension)) {
            return (T) extendableMessage.u(extension);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends GeneratedMessageLite.ExtendableMessage<M>, T> T b(GeneratedMessageLite.ExtendableMessage<M> extendableMessage, GeneratedMessageLite.GeneratedExtension<M, List<T>> extension, int i10) {
        Intrinsics.j(extendableMessage, "<this>");
        Intrinsics.j(extension, "extension");
        if (i10 < extendableMessage.x(extension)) {
            return (T) extendableMessage.v(extension, i10);
        }
        return null;
    }
}
