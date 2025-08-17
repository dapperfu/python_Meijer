package com.launchdarkly.sdk.android;

/* loaded from: classes7.dex */
public interface ConnectionInformation {

    public enum ConnectionMode {
        STREAMING(true),
        POLLING(true),
        BACKGROUND_POLLING(true),
        BACKGROUND_DISABLED(false),
        OFFLINE(false),
        SET_OFFLINE(false),
        SHUTDOWN(false);

        private boolean connectionActive;

        boolean isConnectionActive() {
            return this.connectionActive;
        }

        ConnectionMode(boolean z10) {
            this.connectionActive = z10;
        }
    }

    Long a();

    Long b();

    LDFailure c();
}
