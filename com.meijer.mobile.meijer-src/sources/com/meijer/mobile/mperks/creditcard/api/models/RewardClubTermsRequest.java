package com.meijer.mobile.mperks.creditcard.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/mperks/creditcard/api/models/RewardClubTermsRequest;", "", "", "clubId", "", "newTerms", "<init>", "(IZ)V", "copy", "(IZ)Lcom/meijer/mobile/mperks/creditcard/api/models/RewardClubTermsRequest;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Z", "()Z", "creditcard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RewardClubTermsRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int clubId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean newTerms;

    public RewardClubTermsRequest(@g(name = "clubId") int i10, @g(name = "newTerms") boolean z10) {
        this.clubId = i10;
        this.newTerms = z10;
    }

    public final RewardClubTermsRequest copy(@g(name = "clubId") int clubId, @g(name = "newTerms") boolean newTerms) {
        return new RewardClubTermsRequest(clubId, newTerms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardClubTermsRequest)) {
            return false;
        }
        RewardClubTermsRequest rewardClubTermsRequest = (RewardClubTermsRequest) other;
        return this.clubId == rewardClubTermsRequest.clubId && this.newTerms == rewardClubTermsRequest.newTerms;
    }

    public int hashCode() {
        return (Integer.hashCode(this.clubId) * 31) + Boolean.hashCode(this.newTerms);
    }

    public String toString() {
        return "RewardClubTermsRequest(clubId=" + this.clubId + ", newTerms=" + this.newTerms + ')';
    }

    /* renamed from: a, reason: from getter */
    public final int getClubId() {
        return this.clubId;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getNewTerms() {
        return this.newTerms;
    }

    public /* synthetic */ RewardClubTermsRequest(int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, z10);
    }
}
