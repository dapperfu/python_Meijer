package com.radiusnetworks.flybuy.api.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import og.InterfaceC16127c;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/PatchAppInstanceData;", "", "pushToken", "", "timeZone", "subscribedPushTopicIds", "", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getPushToken", "()Ljava/lang/String;", "getSubscribedPushTopicIds", "()Ljava/util/List;", "getTimeZone", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PatchAppInstanceData {

    @InterfaceC16127c("push_token")
    private final String pushToken;

    @InterfaceC16127c("subscribed_push_topic_ids")
    private final List<Long> subscribedPushTopicIds;

    @InterfaceC16127c("timezone")
    private final String timeZone;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PatchAppInstanceData copy$default(PatchAppInstanceData patchAppInstanceData, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = patchAppInstanceData.pushToken;
        }
        if ((i10 & 2) != 0) {
            str2 = patchAppInstanceData.timeZone;
        }
        if ((i10 & 4) != 0) {
            list = patchAppInstanceData.subscribedPushTopicIds;
        }
        return patchAppInstanceData.copy(str, str2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPushToken() {
        return this.pushToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
    }

    public final List<Long> component3() {
        return this.subscribedPushTopicIds;
    }

    public final PatchAppInstanceData copy(String pushToken, String timeZone, List<Long> subscribedPushTopicIds) {
        return new PatchAppInstanceData(pushToken, timeZone, subscribedPushTopicIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PatchAppInstanceData)) {
            return false;
        }
        PatchAppInstanceData patchAppInstanceData = (PatchAppInstanceData) other;
        return Intrinsics.e(this.pushToken, patchAppInstanceData.pushToken) && Intrinsics.e(this.timeZone, patchAppInstanceData.timeZone) && Intrinsics.e(this.subscribedPushTopicIds, patchAppInstanceData.subscribedPushTopicIds);
    }

    public int hashCode() {
        String str = this.pushToken;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.timeZone;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Long> list = this.subscribedPushTopicIds;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "PatchAppInstanceData(pushToken=" + this.pushToken + ", timeZone=" + this.timeZone + ", subscribedPushTopicIds=" + this.subscribedPushTopicIds + ')';
    }

    public final String getPushToken() {
        return this.pushToken;
    }

    public final List<Long> getSubscribedPushTopicIds() {
        return this.subscribedPushTopicIds;
    }

    public final String getTimeZone() {
        return this.timeZone;
    }

    public PatchAppInstanceData(String str, String str2, List<Long> list) {
        this.pushToken = str;
        this.timeZone = str2;
        this.subscribedPushTopicIds = list;
    }
}
