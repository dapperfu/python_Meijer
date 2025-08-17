package com.launchdarkly.sdk.android;

import com.launchdarkly.sdk.android.ConnectionInformation;

/* loaded from: classes7.dex */
class ConnectionInformationState implements ConnectionInformation {
    private ConnectionInformation.ConnectionMode connectionMode;
    private Long lastFailedConnection;
    private LDFailure lastFailure;
    private Long lastSuccessfulConnection;

    @Override // com.launchdarkly.sdk.android.ConnectionInformation
    public Long a() {
        return this.lastFailedConnection;
    }

    @Override // com.launchdarkly.sdk.android.ConnectionInformation
    public Long b() {
        return this.lastSuccessfulConnection;
    }

    @Override // com.launchdarkly.sdk.android.ConnectionInformation
    public LDFailure c() {
        return this.lastFailure;
    }

    public ConnectionInformation.ConnectionMode d() {
        return this.connectionMode;
    }

    void e(ConnectionInformation.ConnectionMode connectionMode) {
        this.connectionMode = connectionMode;
    }

    void f(Long l10) {
        this.lastFailedConnection = l10;
    }

    void g(LDFailure lDFailure) {
        this.lastFailure = lDFailure;
    }

    void h(Long l10) {
        this.lastSuccessfulConnection = l10;
    }

    ConnectionInformationState() {
    }
}
