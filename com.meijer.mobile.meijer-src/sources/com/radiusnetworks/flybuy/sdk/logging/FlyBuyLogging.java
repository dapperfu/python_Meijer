package com.radiusnetworks.flybuy.sdk.logging;

import androidx.annotation.Keep;
import kotlin.Metadata;

@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/logging/FlyBuyLogging;", "", "()V", "DEFAULT_INTERNAL_LOG_LEVEL", "", "DEFAULT_LOG_LEVEL", "internalLogLevel", "getInternalLogLevel", "()I", "setInternalLogLevel", "(I)V", "logLevel", "getLogLevel", "setLogLevel", "common_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FlyBuyLogging {
    public static final int DEFAULT_INTERNAL_LOG_LEVEL = 8;
    public static final int DEFAULT_LOG_LEVEL = 6;
    public static final FlyBuyLogging INSTANCE = new FlyBuyLogging();
    private static int logLevel = 6;
    private static int internalLogLevel = 8;

    public final int getInternalLogLevel() {
        return internalLogLevel;
    }

    public final int getLogLevel() {
        return logLevel;
    }

    public final void setInternalLogLevel(int i10) {
        internalLogLevel = i10;
    }

    public final void setLogLevel(int i10) {
        logLevel = i10;
    }

    private FlyBuyLogging() {
    }
}
