package go;

import com.meijer.mobile.mperks.networking.api.models.RewardAccountTransactionReasonJson;
import com.meijer.mobile.mperks.networking.domain.models.RewardAccountTransactionReason;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/RewardAccountTransactionReasonJson;", "Lcom/meijer/mobile/mperks/networking/domain/models/RewardAccountTransactionReason;", "a", "(Lcom/meijer/mobile/mperks/networking/api/models/RewardAccountTransactionReasonJson;)Lcom/meijer/mobile/mperks/networking/domain/models/RewardAccountTransactionReason;", "networking_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class o {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RewardAccountTransactionReasonJson.values().length];
            try {
                iArr[RewardAccountTransactionReasonJson.Undefined.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RewardAccountTransactionReasonJson.OnlineSale.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RewardAccountTransactionReasonJson.InStoreSale.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RewardAccountTransactionReasonJson.PartnerSale.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RewardAccountTransactionReasonJson.RewardProgressAdjustment.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RewardAccountTransactionReasonJson.NonPurchaseReward.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[RewardAccountTransactionReasonJson.PointAdjustment.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[RewardAccountTransactionReasonJson.BuyCoupon.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final RewardAccountTransactionReason a(RewardAccountTransactionReasonJson rewardAccountTransactionReasonJson) {
        Intrinsics.j(rewardAccountTransactionReasonJson, "<this>");
        switch (a.$EnumSwitchMapping$0[rewardAccountTransactionReasonJson.ordinal()]) {
            case 1:
                return RewardAccountTransactionReason.Undefined;
            case 2:
                return RewardAccountTransactionReason.OnlineSale;
            case 3:
                return RewardAccountTransactionReason.InStoreSale;
            case 4:
                return RewardAccountTransactionReason.PartnerSale;
            case 5:
                return RewardAccountTransactionReason.RewardProgressAdjustment;
            case 6:
                return RewardAccountTransactionReason.NonPurchaseReward;
            case 7:
                return RewardAccountTransactionReason.PointAdjustment;
            case 8:
                return RewardAccountTransactionReason.BuyCoupon;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
