package com.radiusnetworks.flybuy.sdk.exceptions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/exceptions/FlyBuyInitializationException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "className", "", "initializationMethod", "(Ljava/lang/String;Ljava/lang/String;)V", "common_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FlyBuyInitializationException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlyBuyInitializationException(String className, String initializationMethod) {
        super(className + " has not been initialized. Make sure to call " + initializationMethod + " before calling this method.");
        Intrinsics.j(className, "className");
        Intrinsics.j(initializationMethod, "initializationMethod");
    }
}
