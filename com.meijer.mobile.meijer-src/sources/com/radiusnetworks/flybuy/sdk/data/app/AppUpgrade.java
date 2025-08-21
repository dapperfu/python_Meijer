package com.radiusnetworks.flybuy.sdk.data.app;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/app/AppUpgrade;", "", "required", "", "version", "", "url", "message", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getRequired", "()Z", "getUrl", "getVersion", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AppUpgrade {
    private final String message;
    private final boolean required;
    private final String url;
    private final String version;

    public static /* synthetic */ AppUpgrade copy$default(AppUpgrade appUpgrade, boolean z10, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = appUpgrade.required;
        }
        if ((i10 & 2) != 0) {
            str = appUpgrade.version;
        }
        if ((i10 & 4) != 0) {
            str2 = appUpgrade.url;
        }
        if ((i10 & 8) != 0) {
            str3 = appUpgrade.message;
        }
        return appUpgrade.copy(z10, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    /* renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final AppUpgrade copy(boolean required, String version, String url, String message) {
        Intrinsics.j(version, "version");
        Intrinsics.j(url, "url");
        Intrinsics.j(message, "message");
        return new AppUpgrade(required, version, url, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppUpgrade)) {
            return false;
        }
        AppUpgrade appUpgrade = (AppUpgrade) other;
        return this.required == appUpgrade.required && Intrinsics.e(this.version, appUpgrade.version) && Intrinsics.e(this.url, appUpgrade.url) && Intrinsics.e(this.message, appUpgrade.message);
    }

    public int hashCode() {
        return this.message.hashCode() + ((this.url.hashCode() + ((this.version.hashCode() + (Boolean.hashCode(this.required) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "AppUpgrade(required=" + this.required + ", version=" + this.version + ", url=" + this.url + ", message=" + this.message + ')';
    }

    public AppUpgrade(boolean z10, String version, String url, String message) {
        Intrinsics.j(version, "version");
        Intrinsics.j(url, "url");
        Intrinsics.j(message, "message");
        this.required = z10;
        this.version = version;
        this.url = url;
        this.message = message;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getVersion() {
        return this.version;
    }
}
