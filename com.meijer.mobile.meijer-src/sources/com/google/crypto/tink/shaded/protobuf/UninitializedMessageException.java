package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* loaded from: classes8.dex */
public class UninitializedMessageException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f89145a;

    public UninitializedMessageException(Q q10) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f89145a = null;
    }

    public InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
