package com.radiusnetworks.flybuy.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import og.InterfaceC16127c;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/AppInstanceResponse;", "", "minSyncIntervalSeconds", "", "data", "Lcom/radiusnetworks/flybuy/api/model/AppData;", "(JLcom/radiusnetworks/flybuy/api/model/AppData;)V", "getData", "()Lcom/radiusnetworks/flybuy/api/model/AppData;", "getMinSyncIntervalSeconds", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AppInstanceResponse {
    private final AppData data;

    @InterfaceC16127c("min_sync_interval_seconds")
    private final long minSyncIntervalSeconds;

    public AppInstanceResponse(long j10, AppData data) {
        Intrinsics.j(data, "data");
        this.minSyncIntervalSeconds = j10;
        this.data = data;
    }

    public static /* synthetic */ AppInstanceResponse copy$default(AppInstanceResponse appInstanceResponse, long j10, AppData appData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = appInstanceResponse.minSyncIntervalSeconds;
        }
        if ((i10 & 2) != 0) {
            appData = appInstanceResponse.data;
        }
        return appInstanceResponse.copy(j10, appData);
    }

    /* renamed from: component1, reason: from getter */
    public final long getMinSyncIntervalSeconds() {
        return this.minSyncIntervalSeconds;
    }

    /* renamed from: component2, reason: from getter */
    public final AppData getData() {
        return this.data;
    }

    public final AppInstanceResponse copy(long minSyncIntervalSeconds, AppData data) {
        Intrinsics.j(data, "data");
        return new AppInstanceResponse(minSyncIntervalSeconds, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppInstanceResponse)) {
            return false;
        }
        AppInstanceResponse appInstanceResponse = (AppInstanceResponse) other;
        return this.minSyncIntervalSeconds == appInstanceResponse.minSyncIntervalSeconds && Intrinsics.e(this.data, appInstanceResponse.data);
    }

    public int hashCode() {
        return this.data.hashCode() + (Long.hashCode(this.minSyncIntervalSeconds) * 31);
    }

    public String toString() {
        return "AppInstanceResponse(minSyncIntervalSeconds=" + this.minSyncIntervalSeconds + ", data=" + this.data + ')';
    }

    public final AppData getData() {
        return this.data;
    }

    public final long getMinSyncIntervalSeconds() {
        return this.minSyncIntervalSeconds;
    }

    public /* synthetic */ AppInstanceResponse(long j10, AppData appData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, appData);
    }
}
