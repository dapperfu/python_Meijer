package com.meijer.mobile.cart.model.hybris;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\n\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/CustomerDataResponse;", "", "", "Lcom/meijer/mobile/core/model/common/Guid;", "customerId", "maskedMperksRewardsId", "Lcom/meijer/mobile/cart/model/hybris/MembershipResponse;", "membershipResponse", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/MembershipResponse;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/MembershipResponse;)Lcom/meijer/mobile/cart/model/hybris/CustomerDataResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Lcom/meijer/mobile/cart/model/hybris/MembershipResponse;", "()Lcom/meijer/mobile/cart/model/hybris/MembershipResponse;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CustomerDataResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customerId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String maskedMperksRewardsId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final MembershipResponse membershipResponse;

    public CustomerDataResponse() {
        this(null, null, null, 7, null);
    }

    public final CustomerDataResponse copy(@g(name = "customerId") String customerId, @g(name = "maskedMperksRewardsId") String maskedMperksRewardsId, @g(name = "membership") MembershipResponse membershipResponse) {
        Intrinsics.j(customerId, "customerId");
        Intrinsics.j(maskedMperksRewardsId, "maskedMperksRewardsId");
        return new CustomerDataResponse(customerId, maskedMperksRewardsId, membershipResponse);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerDataResponse)) {
            return false;
        }
        CustomerDataResponse customerDataResponse = (CustomerDataResponse) other;
        return Intrinsics.e(this.customerId, customerDataResponse.customerId) && Intrinsics.e(this.maskedMperksRewardsId, customerDataResponse.maskedMperksRewardsId) && Intrinsics.e(this.membershipResponse, customerDataResponse.membershipResponse);
    }

    public int hashCode() {
        int iHashCode = ((this.customerId.hashCode() * 31) + this.maskedMperksRewardsId.hashCode()) * 31;
        MembershipResponse membershipResponse = this.membershipResponse;
        return iHashCode + (membershipResponse == null ? 0 : membershipResponse.hashCode());
    }

    public String toString() {
        return "CustomerDataResponse(customerId=" + this.customerId + ", maskedMperksRewardsId=" + this.maskedMperksRewardsId + ", membershipResponse=" + this.membershipResponse + ')';
    }

    public CustomerDataResponse(@g(name = "customerId") String customerId, @g(name = "maskedMperksRewardsId") String maskedMperksRewardsId, @g(name = "membership") MembershipResponse membershipResponse) {
        Intrinsics.j(customerId, "customerId");
        Intrinsics.j(maskedMperksRewardsId, "maskedMperksRewardsId");
        this.customerId = customerId;
        this.maskedMperksRewardsId = maskedMperksRewardsId;
        this.membershipResponse = membershipResponse;
    }

    /* renamed from: a, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    /* renamed from: b, reason: from getter */
    public final String getMaskedMperksRewardsId() {
        return this.maskedMperksRewardsId;
    }

    /* renamed from: c, reason: from getter */
    public final MembershipResponse getMembershipResponse() {
        return this.membershipResponse;
    }

    public /* synthetic */ CustomerDataResponse(String str, String str2, MembershipResponse membershipResponse, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "(***) ***-****" : str2, (i10 & 4) != 0 ? null : membershipResponse);
    }
}
