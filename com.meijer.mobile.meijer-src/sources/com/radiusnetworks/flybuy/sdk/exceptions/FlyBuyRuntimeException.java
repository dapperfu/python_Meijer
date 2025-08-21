package com.radiusnetworks.flybuy.sdk.exceptions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/exceptions/FlyBuyRuntimeException;", "Ljava/lang/RuntimeException;", "message", "", "(Ljava/lang/String;)V", "common_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FlyBuyRuntimeException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlyBuyRuntimeException(String message) {
        super(message);
        Intrinsics.j(message, "message");
    }
}
