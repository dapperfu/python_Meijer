package com.meijer.mobile.digitalshopping.api.timeslots.model;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJD\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0016\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/timeslots/model/OmsDeliveryWindowResponse;", "", "", PreferencesHelper.PREF_ID, "startTime", "endTime", "lockTime", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/OmsDeliveryAvailabilityResponse;", "availability", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/digitalshopping/api/timeslots/model/OmsDeliveryAvailabilityResponse;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/digitalshopping/api/timeslots/model/OmsDeliveryAvailabilityResponse;)Lcom/meijer/mobile/digitalshopping/api/timeslots/model/OmsDeliveryWindowResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "e", "d", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/OmsDeliveryAvailabilityResponse;", "()Lcom/meijer/mobile/digitalshopping/api/timeslots/model/OmsDeliveryAvailabilityResponse;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OmsDeliveryWindowResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String startTime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String endTime;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lockTime;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final OmsDeliveryAvailabilityResponse availability;

    public final OmsDeliveryWindowResponse copy(@g(name = PreferencesHelper.PREF_ID) String id2, @g(name = "startTime") String startTime, @g(name = "endTime") String endTime, @g(name = "lockTime") String lockTime, @g(name = "availability") OmsDeliveryAvailabilityResponse availability) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(startTime, "startTime");
        Intrinsics.j(endTime, "endTime");
        Intrinsics.j(availability, "availability");
        return new OmsDeliveryWindowResponse(id2, startTime, endTime, lockTime, availability);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OmsDeliveryWindowResponse)) {
            return false;
        }
        OmsDeliveryWindowResponse omsDeliveryWindowResponse = (OmsDeliveryWindowResponse) other;
        return Intrinsics.e(this.id, omsDeliveryWindowResponse.id) && Intrinsics.e(this.startTime, omsDeliveryWindowResponse.startTime) && Intrinsics.e(this.endTime, omsDeliveryWindowResponse.endTime) && Intrinsics.e(this.lockTime, omsDeliveryWindowResponse.lockTime) && Intrinsics.e(this.availability, omsDeliveryWindowResponse.availability);
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.startTime.hashCode()) * 31) + this.endTime.hashCode()) * 31;
        String str = this.lockTime;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.availability.hashCode();
    }

    public String toString() {
        return "OmsDeliveryWindowResponse(id=" + this.id + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", lockTime=" + this.lockTime + ", availability=" + this.availability + ')';
    }

    public OmsDeliveryWindowResponse(@g(name = PreferencesHelper.PREF_ID) String id2, @g(name = "startTime") String startTime, @g(name = "endTime") String endTime, @g(name = "lockTime") String str, @g(name = "availability") OmsDeliveryAvailabilityResponse availability) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(startTime, "startTime");
        Intrinsics.j(endTime, "endTime");
        Intrinsics.j(availability, "availability");
        this.id = id2;
        this.startTime = startTime;
        this.endTime = endTime;
        this.lockTime = str;
        this.availability = availability;
    }

    /* renamed from: a, reason: from getter */
    public final OmsDeliveryAvailabilityResponse getAvailability() {
        return this.availability;
    }

    /* renamed from: b, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    /* renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: d, reason: from getter */
    public final String getLockTime() {
        return this.lockTime;
    }

    /* renamed from: e, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }
}
