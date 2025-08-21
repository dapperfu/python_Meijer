package com.meijer.mobile.home.service.models.mperks;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ:\u0010\u000b\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/home/service/models/mperks/MperksDataDto;", "", "", "Lcom/meijer/mobile/home/service/models/mperks/AvailableRewardCouponDto;", "availableCouponsDto", "Lcom/meijer/mobile/home/service/models/mperks/ClippedRewardCouponDto;", "clippedRewardCouponsDto", "", "pointBalance", "<init>", "(Ljava/util/List;Ljava/util/List;I)V", "copy", "(Ljava/util/List;Ljava/util/List;I)Lcom/meijer/mobile/home/service/models/mperks/MperksDataDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "c", "I", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MperksDataDto {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<AvailableRewardCouponDto> availableCouponsDto;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ClippedRewardCouponDto> clippedRewardCouponsDto;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int pointBalance;

    public MperksDataDto() {
        this(null, null, 0, 7, null);
    }

    public final MperksDataDto copy(@g(name = "availableRewardCoupons") List<AvailableRewardCouponDto> availableCouponsDto, @g(name = "clippedRewardCoupons") List<ClippedRewardCouponDto> clippedRewardCouponsDto, @g(name = "pointBalance") int pointBalance) {
        Intrinsics.j(availableCouponsDto, "availableCouponsDto");
        Intrinsics.j(clippedRewardCouponsDto, "clippedRewardCouponsDto");
        return new MperksDataDto(availableCouponsDto, clippedRewardCouponsDto, pointBalance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MperksDataDto)) {
            return false;
        }
        MperksDataDto mperksDataDto = (MperksDataDto) other;
        return Intrinsics.e(this.availableCouponsDto, mperksDataDto.availableCouponsDto) && Intrinsics.e(this.clippedRewardCouponsDto, mperksDataDto.clippedRewardCouponsDto) && this.pointBalance == mperksDataDto.pointBalance;
    }

    public int hashCode() {
        return (((this.availableCouponsDto.hashCode() * 31) + this.clippedRewardCouponsDto.hashCode()) * 31) + Integer.hashCode(this.pointBalance);
    }

    public String toString() {
        return "MperksDataDto(availableCouponsDto=" + this.availableCouponsDto + ", clippedRewardCouponsDto=" + this.clippedRewardCouponsDto + ", pointBalance=" + this.pointBalance + ')';
    }

    public MperksDataDto(@g(name = "availableRewardCoupons") List<AvailableRewardCouponDto> availableCouponsDto, @g(name = "clippedRewardCoupons") List<ClippedRewardCouponDto> clippedRewardCouponsDto, @g(name = "pointBalance") int i10) {
        Intrinsics.j(availableCouponsDto, "availableCouponsDto");
        Intrinsics.j(clippedRewardCouponsDto, "clippedRewardCouponsDto");
        this.availableCouponsDto = availableCouponsDto;
        this.clippedRewardCouponsDto = clippedRewardCouponsDto;
        this.pointBalance = i10;
    }

    public final List<AvailableRewardCouponDto> a() {
        return this.availableCouponsDto;
    }

    public final List<ClippedRewardCouponDto> b() {
        return this.clippedRewardCouponsDto;
    }

    /* renamed from: c, reason: from getter */
    public final int getPointBalance() {
        return this.pointBalance;
    }

    public /* synthetic */ MperksDataDto(List list, List list2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CollectionsKt.m() : list, (i11 & 2) != 0 ? CollectionsKt.m() : list2, (i11 & 4) != 0 ? 0 : i10);
    }
}
