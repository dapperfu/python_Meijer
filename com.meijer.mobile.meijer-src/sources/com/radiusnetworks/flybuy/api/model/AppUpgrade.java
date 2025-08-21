package com.radiusnetworks.flybuy.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/AppUpgrade;", "", "required", "", "url", "", "version", "message", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getRequired", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUrl", "getVersion", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/radiusnetworks/flybuy/api/model/AppUpgrade;", "equals", "other", "hashCode", "", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AppUpgrade {
    private final String message;
    private final Boolean required;
    private final String url;
    private final String version;

    public AppUpgrade() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ AppUpgrade copy$default(AppUpgrade appUpgrade, Boolean bool, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = appUpgrade.required;
        }
        if ((i10 & 2) != 0) {
            str = appUpgrade.url;
        }
        if ((i10 & 4) != 0) {
            str2 = appUpgrade.version;
        }
        if ((i10 & 8) != 0) {
            str3 = appUpgrade.message;
        }
        return appUpgrade.copy(bool, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getRequired() {
        return this.required;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component3, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final AppUpgrade copy(Boolean required, String url, String version, String message) {
        return new AppUpgrade(required, url, version, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppUpgrade)) {
            return false;
        }
        AppUpgrade appUpgrade = (AppUpgrade) other;
        return Intrinsics.e(this.required, appUpgrade.required) && Intrinsics.e(this.url, appUpgrade.url) && Intrinsics.e(this.version, appUpgrade.version) && Intrinsics.e(this.message, appUpgrade.message);
    }

    public int hashCode() {
        Boolean bool = this.required;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.url;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.version;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.message;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "AppUpgrade(required=" + this.required + ", url=" + this.url + ", version=" + this.version + ", message=" + this.message + ')';
    }

    public AppUpgrade(Boolean bool, String str, String str2, String str3) {
        this.required = bool;
        this.url = str;
        this.version = str2;
        this.message = str3;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Boolean getRequired() {
        return this.required;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getVersion() {
        return this.version;
    }

    public /* synthetic */ AppUpgrade(Boolean bool, String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3);
    }
}
