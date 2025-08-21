package com.meijer.mobile.digitalshopping.api.timeslots.model;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0015\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/timeslots/model/DTMDeliveryPartner;", "", "", "facilityId", "partnerEligibility", "fulfillmentEligibility", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/digitalshopping/api/timeslots/model/DTMDeliveryPartner;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class DTMDeliveryPartner {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String facilityId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerEligibility;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fulfillmentEligibility;

    public DTMDeliveryPartner(@g(name = "facilityId") String facilityId, @g(name = "partnerEligibility") String partnerEligibility, @g(name = "fulfillmentEligibility") String str) {
        Intrinsics.j(facilityId, "facilityId");
        Intrinsics.j(partnerEligibility, "partnerEligibility");
        this.facilityId = facilityId;
        this.partnerEligibility = partnerEligibility;
        this.fulfillmentEligibility = str;
    }

    public final DTMDeliveryPartner copy(@g(name = "facilityId") String facilityId, @g(name = "partnerEligibility") String partnerEligibility, @g(name = "fulfillmentEligibility") String fulfillmentEligibility) {
        Intrinsics.j(facilityId, "facilityId");
        Intrinsics.j(partnerEligibility, "partnerEligibility");
        return new DTMDeliveryPartner(facilityId, partnerEligibility, fulfillmentEligibility);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DTMDeliveryPartner)) {
            return false;
        }
        DTMDeliveryPartner dTMDeliveryPartner = (DTMDeliveryPartner) other;
        return Intrinsics.e(this.facilityId, dTMDeliveryPartner.facilityId) && Intrinsics.e(this.partnerEligibility, dTMDeliveryPartner.partnerEligibility) && Intrinsics.e(this.fulfillmentEligibility, dTMDeliveryPartner.fulfillmentEligibility);
    }

    public int hashCode() {
        int iHashCode = ((this.facilityId.hashCode() * 31) + this.partnerEligibility.hashCode()) * 31;
        String str = this.fulfillmentEligibility;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "DTMDeliveryPartner(facilityId=" + this.facilityId + ", partnerEligibility=" + this.partnerEligibility + ", fulfillmentEligibility=" + this.fulfillmentEligibility + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getFacilityId() {
        return this.facilityId;
    }

    /* renamed from: b, reason: from getter */
    public final String getFulfillmentEligibility() {
        return this.fulfillmentEligibility;
    }

    /* renamed from: c, reason: from getter */
    public final String getPartnerEligibility() {
        return this.partnerEligibility;
    }

    public /* synthetic */ DTMDeliveryPartner(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : str3);
    }
}
