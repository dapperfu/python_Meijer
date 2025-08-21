package com.radiusnetworks.flybuy.sdk;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B=\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/ConfigOptions;", "", "baseUrl", "", "appTokenKey", "logLevel", "", "internalLogLevel", "deferredLocationTrackingEnabled", "", "crashMonitoringEnabled", "(Ljava/lang/String;Ljava/lang/String;IIZZ)V", "getAppTokenKey", "()Ljava/lang/String;", "getBaseUrl", "getCrashMonitoringEnabled", "()Z", "getDeferredLocationTrackingEnabled", "getInternalLogLevel$core_defaultRelease", "()I", "getLogLevel", "Builder", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ConfigOptions {
    private final String appTokenKey;
    private final String baseUrl;
    private final boolean crashMonitoringEnabled;
    private final boolean deferredLocationTrackingEnabled;
    private final int internalLogLevel;
    private final int logLevel;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\u0007J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/ConfigOptions$Builder;", "", "appTokenKey", "", "(Ljava/lang/String;)V", "baseUrl", "crashMonitoringEnabled", "", "deferredLocationTrackingEnabled", "internalLogLevel", "", "logLevel", "build", "Lcom/radiusnetworks/flybuy/sdk/ConfigOptions;", "setBaseUrl", "setCrashMonitoringEnabled", "setDeferredLocationTrackingEnabled", "setInternalLogLevel", "setLogLevel", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private final String appTokenKey;
        private String baseUrl;
        private boolean crashMonitoringEnabled;
        private boolean deferredLocationTrackingEnabled;
        private int internalLogLevel;
        private int logLevel;

        public Builder(String appTokenKey) {
            Intrinsics.j(appTokenKey, "appTokenKey");
            this.appTokenKey = appTokenKey;
            this.logLevel = 6;
            this.internalLogLevel = 8;
            this.crashMonitoringEnabled = true;
        }

        public final ConfigOptions build() {
            return new ConfigOptions(this.baseUrl, this.appTokenKey, this.logLevel, this.internalLogLevel, this.deferredLocationTrackingEnabled, this.crashMonitoringEnabled, null);
        }

        public final Builder setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public final Builder setCrashMonitoringEnabled(boolean crashMonitoringEnabled) {
            this.crashMonitoringEnabled = crashMonitoringEnabled;
            return this;
        }

        public final Builder setDeferredLocationTrackingEnabled(boolean deferredLocationTrackingEnabled) {
            this.deferredLocationTrackingEnabled = deferredLocationTrackingEnabled;
            return this;
        }

        public final Builder setInternalLogLevel(int internalLogLevel) {
            this.internalLogLevel = internalLogLevel;
            return this;
        }

        public final Builder setLogLevel(int logLevel) {
            this.logLevel = logLevel;
            return this;
        }
    }

    public /* synthetic */ ConfigOptions(String str, String str2, int i10, int i11, boolean z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i10, i11, z10, z11);
    }

    private ConfigOptions(String str, String str2, int i10, int i11, boolean z10, boolean z11) {
        this.baseUrl = str;
        this.appTokenKey = str2;
        this.logLevel = i10;
        this.internalLogLevel = i11;
        this.deferredLocationTrackingEnabled = z10;
        this.crashMonitoringEnabled = z11;
    }

    public final String getAppTokenKey() {
        return this.appTokenKey;
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public final boolean getCrashMonitoringEnabled() {
        return this.crashMonitoringEnabled;
    }

    public final boolean getDeferredLocationTrackingEnabled() {
        return this.deferredLocationTrackingEnabled;
    }

    /* renamed from: getInternalLogLevel$core_defaultRelease, reason: from getter */
    public final int getInternalLogLevel() {
        return this.internalLogLevel;
    }

    public final int getLogLevel() {
        return this.logLevel;
    }

    public /* synthetic */ ConfigOptions(String str, String str2, int i10, int i11, boolean z10, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i12 & 4) != 0 ? 6 : i10, (i12 & 8) != 0 ? 8 : i11, z10, z11);
    }
}
