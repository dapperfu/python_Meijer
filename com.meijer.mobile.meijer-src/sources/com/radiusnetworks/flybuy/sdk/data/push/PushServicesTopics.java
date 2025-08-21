package com.radiusnetworks.flybuy.sdk.data.push;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/push/PushServicesTopics;", "", "fcmTopic", "", "airshipTag", "onesignalTagKey", "onesignalTagValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAirshipTag", "()Ljava/lang/String;", "getFcmTopic", "getOnesignalTagKey", "getOnesignalTagValue", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PushServicesTopics {
    private final String airshipTag;
    private final String fcmTopic;
    private final String onesignalTagKey;
    private final String onesignalTagValue;

    public static /* synthetic */ PushServicesTopics copy$default(PushServicesTopics pushServicesTopics, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pushServicesTopics.fcmTopic;
        }
        if ((i10 & 2) != 0) {
            str2 = pushServicesTopics.airshipTag;
        }
        if ((i10 & 4) != 0) {
            str3 = pushServicesTopics.onesignalTagKey;
        }
        if ((i10 & 8) != 0) {
            str4 = pushServicesTopics.onesignalTagValue;
        }
        return pushServicesTopics.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFcmTopic() {
        return this.fcmTopic;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAirshipTag() {
        return this.airshipTag;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOnesignalTagKey() {
        return this.onesignalTagKey;
    }

    /* renamed from: component4, reason: from getter */
    public final String getOnesignalTagValue() {
        return this.onesignalTagValue;
    }

    public final PushServicesTopics copy(String fcmTopic, String airshipTag, String onesignalTagKey, String onesignalTagValue) {
        Intrinsics.j(fcmTopic, "fcmTopic");
        Intrinsics.j(airshipTag, "airshipTag");
        Intrinsics.j(onesignalTagKey, "onesignalTagKey");
        Intrinsics.j(onesignalTagValue, "onesignalTagValue");
        return new PushServicesTopics(fcmTopic, airshipTag, onesignalTagKey, onesignalTagValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushServicesTopics)) {
            return false;
        }
        PushServicesTopics pushServicesTopics = (PushServicesTopics) other;
        return Intrinsics.e(this.fcmTopic, pushServicesTopics.fcmTopic) && Intrinsics.e(this.airshipTag, pushServicesTopics.airshipTag) && Intrinsics.e(this.onesignalTagKey, pushServicesTopics.onesignalTagKey) && Intrinsics.e(this.onesignalTagValue, pushServicesTopics.onesignalTagValue);
    }

    public int hashCode() {
        return this.onesignalTagValue.hashCode() + ((this.onesignalTagKey.hashCode() + ((this.airshipTag.hashCode() + (this.fcmTopic.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "PushServicesTopics(fcmTopic=" + this.fcmTopic + ", airshipTag=" + this.airshipTag + ", onesignalTagKey=" + this.onesignalTagKey + ", onesignalTagValue=" + this.onesignalTagValue + ')';
    }

    public PushServicesTopics(String fcmTopic, String airshipTag, String onesignalTagKey, String onesignalTagValue) {
        Intrinsics.j(fcmTopic, "fcmTopic");
        Intrinsics.j(airshipTag, "airshipTag");
        Intrinsics.j(onesignalTagKey, "onesignalTagKey");
        Intrinsics.j(onesignalTagValue, "onesignalTagValue");
        this.fcmTopic = fcmTopic;
        this.airshipTag = airshipTag;
        this.onesignalTagKey = onesignalTagKey;
        this.onesignalTagValue = onesignalTagValue;
    }

    public final String getAirshipTag() {
        return this.airshipTag;
    }

    public final String getFcmTopic() {
        return this.fcmTopic;
    }

    public final String getOnesignalTagKey() {
        return this.onesignalTagKey;
    }

    public final String getOnesignalTagValue() {
        return this.onesignalTagValue;
    }
}
