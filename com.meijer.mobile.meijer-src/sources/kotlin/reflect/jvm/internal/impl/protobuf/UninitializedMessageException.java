package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.List;

/* loaded from: classes14.dex */
public class UninitializedMessageException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f146793a;

    public UninitializedMessageException(MessageLite messageLite) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f146793a = null;
    }

    public InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
