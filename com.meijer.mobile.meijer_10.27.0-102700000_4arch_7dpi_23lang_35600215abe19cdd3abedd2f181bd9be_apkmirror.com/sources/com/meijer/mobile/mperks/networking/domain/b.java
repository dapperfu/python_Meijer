package com.meijer.mobile.mperks.networking.domain;

import com.meijer.mobile.mperks.networking.domain.MperksClaimRewardError;
import com.meijer.mobile.mperks.networking.domain.MperksCouponErrorDto;
import com.meijer.mobile.mperks.networking.domain.models.MperksClaimRewardResponseJson;
import io.MperksClaimReward;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u0004\u0018\u00010\t*\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/MperksClaimRewardResponseJson;", "Lio/b;", "c", "(Lcom/meijer/mobile/mperks/networking/domain/models/MperksClaimRewardResponseJson;)Lio/b;", "Lcom/meijer/mobile/mperks/networking/domain/MperksCouponErrorDto;", "Lcom/meijer/mobile/mperks/networking/domain/a;", "b", "(Lcom/meijer/mobile/mperks/networking/domain/MperksCouponErrorDto;)Lcom/meijer/mobile/mperks/networking/domain/a;", "Lcom/meijer/mobile/mperks/networking/domain/MperksCouponErrorDto$MperksErrorCode;", "Lcom/meijer/mobile/mperks/networking/domain/a$a;", "a", "(Lcom/meijer/mobile/mperks/networking/domain/MperksCouponErrorDto$MperksErrorCode;)Lcom/meijer/mobile/mperks/networking/domain/a$a;", "networking_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MperksCouponErrorDto.MperksErrorCode.values().length];
            try {
                iArr[MperksCouponErrorDto.MperksErrorCode.INSUFFICIENT_POINTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MperksCouponErrorDto.MperksErrorCode.COUPON_EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MperksCouponErrorDto.MperksErrorCode.NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MperksCouponErrorDto.MperksErrorCode.NOT_AVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MperksCouponErrorDto.MperksErrorCode.ALREADY_CLIPPED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MperksCouponErrorDto.MperksErrorCode.INTERNAL_SERVER_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MperksCouponErrorDto.MperksErrorCode.UNAUTH_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MperksCouponErrorDto.MperksErrorCode.UNKNOWN_ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final MperksClaimRewardError.EnumC1799a a(MperksCouponErrorDto.MperksErrorCode mperksErrorCode) {
        switch (mperksErrorCode == null ? -1 : a.$EnumSwitchMapping$0[mperksErrorCode.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return MperksClaimRewardError.EnumC1799a.f113580h;
            case 2:
                return MperksClaimRewardError.EnumC1799a.f113578f;
            case 3:
                return MperksClaimRewardError.EnumC1799a.f113577e;
            case 4:
                return MperksClaimRewardError.EnumC1799a.f113576d;
            case 5:
                return MperksClaimRewardError.EnumC1799a.f113575c;
            case 6:
                return MperksClaimRewardError.EnumC1799a.f113579g;
            case 7:
                return MperksClaimRewardError.EnumC1799a.f113581i;
            case 8:
                return MperksClaimRewardError.EnumC1799a.f113582j;
        }
    }

    public static final MperksClaimRewardError b(MperksCouponErrorDto mperksCouponErrorDto) {
        Intrinsics.j(mperksCouponErrorDto, "<this>");
        MperksCouponErrorDto.MperksErrorCode code = mperksCouponErrorDto.getCode();
        return new MperksClaimRewardError(code != null ? a(code) : null, mperksCouponErrorDto.getError(), mperksCouponErrorDto.getMessage());
    }

    public static final MperksClaimReward c(MperksClaimRewardResponseJson mperksClaimRewardResponseJson) {
        Intrinsics.j(mperksClaimRewardResponseJson, "<this>");
        boolean success = mperksClaimRewardResponseJson.getSuccess();
        MperksCouponErrorDto error = mperksClaimRewardResponseJson.getError();
        return new MperksClaimReward(success, error != null ? b(error) : null);
    }
}
