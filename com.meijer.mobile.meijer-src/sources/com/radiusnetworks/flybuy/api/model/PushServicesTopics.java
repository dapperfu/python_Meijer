package com.radiusnetworks.flybuy.api.model;

import com.radiusnetworks.flybuy.api.mapbox.model.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import og.InterfaceC16127c;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/PushServicesTopics;", "", "fcmTopic", "", "airshipTag", "oneSignal", "Lcom/radiusnetworks/flybuy/api/model/OneSignalTopic;", "(Ljava/lang/String;Ljava/lang/String;Lcom/radiusnetworks/flybuy/api/model/OneSignalTopic;)V", "getAirshipTag", "()Ljava/lang/String;", "getFcmTopic", "getOneSignal", "()Lcom/radiusnetworks/flybuy/api/model/OneSignalTopic;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PushServicesTopics {

    @InterfaceC16127c("airship")
    private final String airshipTag;

    @InterfaceC16127c("fcm")
    private final String fcmTopic;

    @InterfaceC16127c("one_signal")
    private final OneSignalTopic oneSignal;

    public static /* synthetic */ PushServicesTopics copy$default(PushServicesTopics pushServicesTopics, String str, String str2, OneSignalTopic oneSignalTopic, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pushServicesTopics.fcmTopic;
        }
        if ((i10 & 2) != 0) {
            str2 = pushServicesTopics.airshipTag;
        }
        if ((i10 & 4) != 0) {
            oneSignalTopic = pushServicesTopics.oneSignal;
        }
        return pushServicesTopics.copy(str, str2, oneSignalTopic);
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
    public final OneSignalTopic getOneSignal() {
        return this.oneSignal;
    }

    public final PushServicesTopics copy(String fcmTopic, String airshipTag, OneSignalTopic oneSignal) {
        Intrinsics.j(fcmTopic, "fcmTopic");
        Intrinsics.j(airshipTag, "airshipTag");
        Intrinsics.j(oneSignal, "oneSignal");
        return new PushServicesTopics(fcmTopic, airshipTag, oneSignal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushServicesTopics)) {
            return false;
        }
        PushServicesTopics pushServicesTopics = (PushServicesTopics) other;
        return Intrinsics.e(this.fcmTopic, pushServicesTopics.fcmTopic) && Intrinsics.e(this.airshipTag, pushServicesTopics.airshipTag) && Intrinsics.e(this.oneSignal, pushServicesTopics.oneSignal);
    }

    public String toString() {
        return "PushServicesTopics(fcmTopic=" + this.fcmTopic + ", airshipTag=" + this.airshipTag + ", oneSignal=" + this.oneSignal + ')';
    }

    public PushServicesTopics(String fcmTopic, String airshipTag, OneSignalTopic oneSignal) {
        Intrinsics.j(fcmTopic, "fcmTopic");
        Intrinsics.j(airshipTag, "airshipTag");
        Intrinsics.j(oneSignal, "oneSignal");
        this.fcmTopic = fcmTopic;
        this.airshipTag = airshipTag;
        this.oneSignal = oneSignal;
    }

    public final String getAirshipTag() {
        return this.airshipTag;
    }

    public final String getFcmTopic() {
        return this.fcmTopic;
    }

    public final OneSignalTopic getOneSignal() {
        return this.oneSignal;
    }

    public int hashCode() {
        return this.oneSignal.hashCode() + a.a(this.airshipTag, this.fcmTopic.hashCode() * 31, 31);
    }
}
