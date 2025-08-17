package com.radiusnetworks.flybuy.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mg.InterfaceC15617c;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/PatchAppInstanceData;", "", "pushToken", "", "timeZone", "(Ljava/lang/String;Ljava/lang/String;)V", "getPushToken", "()Ljava/lang/String;", "getTimeZone", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PatchAppInstanceData {

    @InterfaceC15617c("push_token")
    private final String pushToken;

    @InterfaceC15617c("timezone")
    private final String timeZone;

    public PatchAppInstanceData(String str, String str2) {
        this.pushToken = str;
        this.timeZone = str2;
    }

    public static /* synthetic */ PatchAppInstanceData copy$default(PatchAppInstanceData patchAppInstanceData, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = patchAppInstanceData.pushToken;
        }
        if ((i10 & 2) != 0) {
            str2 = patchAppInstanceData.timeZone;
        }
        return patchAppInstanceData.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPushToken() {
        return this.pushToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
    }

    public final PatchAppInstanceData copy(String pushToken, String timeZone) {
        return new PatchAppInstanceData(pushToken, timeZone);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PatchAppInstanceData)) {
            return false;
        }
        PatchAppInstanceData patchAppInstanceData = (PatchAppInstanceData) other;
        return Intrinsics.e(this.pushToken, patchAppInstanceData.pushToken) && Intrinsics.e(this.timeZone, patchAppInstanceData.timeZone);
    }

    public final String getPushToken() {
        return this.pushToken;
    }

    public final String getTimeZone() {
        return this.timeZone;
    }

    public int hashCode() {
        String str = this.pushToken;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.timeZone;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "PatchAppInstanceData(pushToken=" + this.pushToken + ", timeZone=" + this.timeZone + ')';
    }
}
