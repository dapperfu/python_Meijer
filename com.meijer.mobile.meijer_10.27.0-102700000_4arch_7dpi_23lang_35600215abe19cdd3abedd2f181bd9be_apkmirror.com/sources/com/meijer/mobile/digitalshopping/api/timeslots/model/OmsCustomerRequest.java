package com.meijer.mobile.digitalshopping.api.timeslots.model;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJN\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001c\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/timeslots/model/OmsCustomerRequest;", "", "", "customerId", "partnerCustomerId", "emailId", "firstName", "lastName", "phoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/digitalshopping/api/timeslots/model/OmsCustomerRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "e", "c", "d", "f", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OmsCustomerRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customerId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerCustomerId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String emailId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastName;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phoneNumber;

    public OmsCustomerRequest(@g(name = "customerId") String customerId, @g(name = "partnerCustomerId") String str, @g(name = "emailId") String emailId, @g(name = "firstName") String firstName, @g(name = "lastName") String lastName, @g(name = "phoneNumber") String phoneNumber) {
        Intrinsics.j(customerId, "customerId");
        Intrinsics.j(emailId, "emailId");
        Intrinsics.j(firstName, "firstName");
        Intrinsics.j(lastName, "lastName");
        Intrinsics.j(phoneNumber, "phoneNumber");
        this.customerId = customerId;
        this.partnerCustomerId = str;
        this.emailId = emailId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public final OmsCustomerRequest copy(@g(name = "customerId") String customerId, @g(name = "partnerCustomerId") String partnerCustomerId, @g(name = "emailId") String emailId, @g(name = "firstName") String firstName, @g(name = "lastName") String lastName, @g(name = "phoneNumber") String phoneNumber) {
        Intrinsics.j(customerId, "customerId");
        Intrinsics.j(emailId, "emailId");
        Intrinsics.j(firstName, "firstName");
        Intrinsics.j(lastName, "lastName");
        Intrinsics.j(phoneNumber, "phoneNumber");
        return new OmsCustomerRequest(customerId, partnerCustomerId, emailId, firstName, lastName, phoneNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OmsCustomerRequest)) {
            return false;
        }
        OmsCustomerRequest omsCustomerRequest = (OmsCustomerRequest) other;
        return Intrinsics.e(this.customerId, omsCustomerRequest.customerId) && Intrinsics.e(this.partnerCustomerId, omsCustomerRequest.partnerCustomerId) && Intrinsics.e(this.emailId, omsCustomerRequest.emailId) && Intrinsics.e(this.firstName, omsCustomerRequest.firstName) && Intrinsics.e(this.lastName, omsCustomerRequest.lastName) && Intrinsics.e(this.phoneNumber, omsCustomerRequest.phoneNumber);
    }

    public int hashCode() {
        int iHashCode = this.customerId.hashCode() * 31;
        String str = this.partnerCustomerId;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.emailId.hashCode()) * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.phoneNumber.hashCode();
    }

    public String toString() {
        return "OmsCustomerRequest(customerId=" + this.customerId + ", partnerCustomerId=" + this.partnerCustomerId + ", emailId=" + this.emailId + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", phoneNumber=" + this.phoneNumber + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    /* renamed from: b, reason: from getter */
    public final String getEmailId() {
        return this.emailId;
    }

    /* renamed from: c, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: d, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: e, reason: from getter */
    public final String getPartnerCustomerId() {
        return this.partnerCustomerId;
    }

    /* renamed from: f, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public /* synthetic */ OmsCustomerRequest(String str, String str2, String str3, String str4, String str5, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, str3, str4, str5, str6);
    }
}
