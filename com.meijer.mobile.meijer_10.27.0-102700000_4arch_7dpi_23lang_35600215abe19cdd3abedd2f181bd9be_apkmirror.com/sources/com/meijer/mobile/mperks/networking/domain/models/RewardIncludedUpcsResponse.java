package com.meijer.mobile.mperks.networking.domain.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0013\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\b0\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/RewardIncludedUpcsResponse;", "", "count", "", "continuationToken", "", "upcs", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "<init>", "(ILjava/lang/String;Ljava/util/List;)V", "getCount", "()I", "getContinuationToken", "()Ljava/lang/String;", "getUpcs", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RewardIncludedUpcsResponse {
    private final String continuationToken;
    private final int count;
    private final List<String> upcs;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RewardIncludedUpcsResponse copy$default(RewardIncludedUpcsResponse rewardIncludedUpcsResponse, int i10, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = rewardIncludedUpcsResponse.count;
        }
        if ((i11 & 2) != 0) {
            str = rewardIncludedUpcsResponse.continuationToken;
        }
        if ((i11 & 4) != 0) {
            list = rewardIncludedUpcsResponse.upcs;
        }
        return rewardIncludedUpcsResponse.copy(i10, str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContinuationToken() {
        return this.continuationToken;
    }

    public final List<String> component3() {
        return this.upcs;
    }

    public final RewardIncludedUpcsResponse copy(int count, String continuationToken, List<String> upcs) {
        Intrinsics.j(upcs, "upcs");
        return new RewardIncludedUpcsResponse(count, continuationToken, upcs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardIncludedUpcsResponse)) {
            return false;
        }
        RewardIncludedUpcsResponse rewardIncludedUpcsResponse = (RewardIncludedUpcsResponse) other;
        return this.count == rewardIncludedUpcsResponse.count && Intrinsics.e(this.continuationToken, rewardIncludedUpcsResponse.continuationToken) && Intrinsics.e(this.upcs, rewardIncludedUpcsResponse.upcs);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.count) * 31;
        String str = this.continuationToken;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.upcs.hashCode();
    }

    public String toString() {
        return "RewardIncludedUpcsResponse(count=" + this.count + ", continuationToken=" + this.continuationToken + ", upcs=" + this.upcs + ')';
    }

    public RewardIncludedUpcsResponse(int i10, String str, List<String> upcs) {
        Intrinsics.j(upcs, "upcs");
        this.count = i10;
        this.continuationToken = str;
        this.upcs = upcs;
    }

    public final String getContinuationToken() {
        return this.continuationToken;
    }

    public final int getCount() {
        return this.count;
    }

    public final List<String> getUpcs() {
        return this.upcs;
    }
}
