package com.meijer.mobile.mperks.networking.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ4\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/MperksCreditCardInfoResponse;", "", "", "enrollmentStatus", "", "dollarProgress", "", "Lcom/meijer/mobile/mperks/networking/api/models/RewardOfferJson;", "rewardOffers", "<init>", "(IDLjava/util/List;)V", "copy", "(IDLjava/util/List;)Lcom/meijer/mobile/mperks/networking/api/models/MperksCreditCardInfoResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "D", "()D", "c", "Ljava/util/List;", "()Ljava/util/List;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MperksCreditCardInfoResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int enrollmentStatus;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double dollarProgress;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<RewardOfferJson> rewardOffers;

    public MperksCreditCardInfoResponse() {
        this(0, 0.0d, null, 7, null);
    }

    public final MperksCreditCardInfoResponse copy(@g(name = "enrollmentStatus") int enrollmentStatus, @g(name = "dollarProgress") double dollarProgress, @g(name = "rewardOffers") List<RewardOfferJson> rewardOffers) {
        Intrinsics.j(rewardOffers, "rewardOffers");
        return new MperksCreditCardInfoResponse(enrollmentStatus, dollarProgress, rewardOffers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MperksCreditCardInfoResponse)) {
            return false;
        }
        MperksCreditCardInfoResponse mperksCreditCardInfoResponse = (MperksCreditCardInfoResponse) other;
        return this.enrollmentStatus == mperksCreditCardInfoResponse.enrollmentStatus && Double.compare(this.dollarProgress, mperksCreditCardInfoResponse.dollarProgress) == 0 && Intrinsics.e(this.rewardOffers, mperksCreditCardInfoResponse.rewardOffers);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.enrollmentStatus) * 31) + Double.hashCode(this.dollarProgress)) * 31) + this.rewardOffers.hashCode();
    }

    public String toString() {
        return "MperksCreditCardInfoResponse(enrollmentStatus=" + this.enrollmentStatus + ", dollarProgress=" + this.dollarProgress + ", rewardOffers=" + this.rewardOffers + ')';
    }

    public MperksCreditCardInfoResponse(@g(name = "enrollmentStatus") int i10, @g(name = "dollarProgress") double d10, @g(name = "rewardOffers") List<RewardOfferJson> rewardOffers) {
        Intrinsics.j(rewardOffers, "rewardOffers");
        this.enrollmentStatus = i10;
        this.dollarProgress = d10;
        this.rewardOffers = rewardOffers;
    }

    /* renamed from: a, reason: from getter */
    public final double getDollarProgress() {
        return this.dollarProgress;
    }

    /* renamed from: b, reason: from getter */
    public final int getEnrollmentStatus() {
        return this.enrollmentStatus;
    }

    public final List<RewardOfferJson> c() {
        return this.rewardOffers;
    }

    public /* synthetic */ MperksCreditCardInfoResponse(int i10, double d10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? 0.0d : d10, (i11 & 4) != 0 ? CollectionsKt.m() : list);
    }
}
