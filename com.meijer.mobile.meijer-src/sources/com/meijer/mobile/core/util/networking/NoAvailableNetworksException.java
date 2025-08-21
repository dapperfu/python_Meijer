package com.meijer.mobile.core.util.networking;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/meijer/mobile/core/util/networking/NoAvailableNetworksException;", "Ljava/io/IOException;", "<init>", "()V", "", "message", "(Ljava/lang/String;)V", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NoAvailableNetworksException extends IOException {
    public NoAvailableNetworksException() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoAvailableNetworksException(String message) {
        super(message);
        Intrinsics.j(message, "message");
    }
}
