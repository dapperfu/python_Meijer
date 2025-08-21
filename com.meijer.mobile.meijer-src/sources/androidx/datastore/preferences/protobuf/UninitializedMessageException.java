package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public class UninitializedMessageException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f54430a;

    public UninitializedMessageException(P p10) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f54430a = null;
    }

    public InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
