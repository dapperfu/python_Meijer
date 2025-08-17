package com.meijer.mobile.mperks.networking.domain.models;

import com.meijer.mobile.mperks.networking.domain.MperksCouponErrorDto;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/MperksClaimRewardResponseJson;", "", "success", "", "error", "Lcom/meijer/mobile/mperks/networking/domain/MperksCouponErrorDto;", "<init>", "(ZLcom/meijer/mobile/mperks/networking/domain/MperksCouponErrorDto;)V", "getSuccess", "()Z", "getError", "()Lcom/meijer/mobile/mperks/networking/domain/MperksCouponErrorDto;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class MperksClaimRewardResponseJson {
    private final MperksCouponErrorDto error;
    private final boolean success;

    public MperksClaimRewardResponseJson(@g(name = "success") boolean z10, @g(name = "error") MperksCouponErrorDto mperksCouponErrorDto) {
        this.success = z10;
        this.error = mperksCouponErrorDto;
    }

    public static /* synthetic */ MperksClaimRewardResponseJson copy$default(MperksClaimRewardResponseJson mperksClaimRewardResponseJson, boolean z10, MperksCouponErrorDto mperksCouponErrorDto, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = mperksClaimRewardResponseJson.success;
        }
        if ((i10 & 2) != 0) {
            mperksCouponErrorDto = mperksClaimRewardResponseJson.error;
        }
        return mperksClaimRewardResponseJson.copy(z10, mperksCouponErrorDto);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* renamed from: component2, reason: from getter */
    public final MperksCouponErrorDto getError() {
        return this.error;
    }

    public final MperksClaimRewardResponseJson copy(@g(name = "success") boolean success, @g(name = "error") MperksCouponErrorDto error) {
        return new MperksClaimRewardResponseJson(success, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MperksClaimRewardResponseJson)) {
            return false;
        }
        MperksClaimRewardResponseJson mperksClaimRewardResponseJson = (MperksClaimRewardResponseJson) other;
        return this.success == mperksClaimRewardResponseJson.success && Intrinsics.e(this.error, mperksClaimRewardResponseJson.error);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        MperksCouponErrorDto mperksCouponErrorDto = this.error;
        return iHashCode + (mperksCouponErrorDto == null ? 0 : mperksCouponErrorDto.hashCode());
    }

    public String toString() {
        return "MperksClaimRewardResponseJson(success=" + this.success + ", error=" + this.error + ')';
    }

    public final MperksCouponErrorDto getError() {
        return this.error;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public /* synthetic */ MperksClaimRewardResponseJson(boolean z10, MperksCouponErrorDto mperksCouponErrorDto, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, (i10 & 2) != 0 ? null : mperksCouponErrorDto);
    }
}
