package com.meijer.mobile.cart.model.hybris;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/MembershipResponse;", "", "", "code", "partnerCustomerId", "timeCreated", "timeUpdated", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/cart/model/hybris/MembershipResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MembershipResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerCustomerId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String timeCreated;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String timeUpdated;

    public MembershipResponse() {
        this(null, null, null, null, 15, null);
    }

    public final MembershipResponse copy(@g(name = "code") String code, @g(name = "partnerCustomerId") String partnerCustomerId, @g(name = "timeCreated") String timeCreated, @g(name = "timeUpdated") String timeUpdated) {
        Intrinsics.j(code, "code");
        return new MembershipResponse(code, partnerCustomerId, timeCreated, timeUpdated);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MembershipResponse)) {
            return false;
        }
        MembershipResponse membershipResponse = (MembershipResponse) other;
        return Intrinsics.e(this.code, membershipResponse.code) && Intrinsics.e(this.partnerCustomerId, membershipResponse.partnerCustomerId) && Intrinsics.e(this.timeCreated, membershipResponse.timeCreated) && Intrinsics.e(this.timeUpdated, membershipResponse.timeUpdated);
    }

    public int hashCode() {
        int iHashCode = this.code.hashCode() * 31;
        String str = this.partnerCustomerId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.timeCreated;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.timeUpdated;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "MembershipResponse(code=" + this.code + ", partnerCustomerId=" + this.partnerCustomerId + ", timeCreated=" + this.timeCreated + ", timeUpdated=" + this.timeUpdated + ')';
    }

    public MembershipResponse(@g(name = "code") String code, @g(name = "partnerCustomerId") String str, @g(name = "timeCreated") String str2, @g(name = "timeUpdated") String str3) {
        Intrinsics.j(code, "code");
        this.code = code;
        this.partnerCustomerId = str;
        this.timeCreated = str2;
        this.timeUpdated = str3;
    }

    /* renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: b, reason: from getter */
    public final String getPartnerCustomerId() {
        return this.partnerCustomerId;
    }

    /* renamed from: c, reason: from getter */
    public final String getTimeCreated() {
        return this.timeCreated;
    }

    /* renamed from: d, reason: from getter */
    public final String getTimeUpdated() {
        return this.timeUpdated;
    }

    public /* synthetic */ MembershipResponse(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4);
    }
}
