package go;

import com.meijer.mobile.mperks.networking.api.models.AdjustmentDetailsJson;
import com.meijer.mobile.mperks.networking.api.models.CouponDetailsJson;
import com.meijer.mobile.mperks.networking.api.models.MperksTransactionJson;
import com.meijer.mobile.mperks.networking.api.models.RewardAccountTransactionReasonJson;
import com.meijer.mobile.mperks.networking.api.models.SaleDetailsJson;
import com.meijer.mobile.mperks.networking.domain.models.MperksTransaction;
import com.meijer.mobile.mperks.networking.domain.models.ReasonDetails;
import fl.C14016a;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import wk.C17898a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/MperksTransactionJson;", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksTransaction;", "a", "(Lcom/meijer/mobile/mperks/networking/api/models/MperksTransactionJson;)Lcom/meijer/mobile/mperks/networking/domain/models/MperksTransaction;", "networking_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class n {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RewardAccountTransactionReasonJson.values().length];
            try {
                iArr[RewardAccountTransactionReasonJson.OnlineSale.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RewardAccountTransactionReasonJson.InStoreSale.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RewardAccountTransactionReasonJson.PartnerSale.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RewardAccountTransactionReasonJson.BuyCoupon.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RewardAccountTransactionReasonJson.PointAdjustment.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final MperksTransaction a(MperksTransactionJson mperksTransactionJson) {
        AdjustmentDetailsJson adjustmentDetails;
        Intrinsics.j(mperksTransactionJson, "<this>");
        String transactionId = mperksTransactionJson.getTransactionId();
        MperksTransaction.TransactionType transactionType = Intrinsics.e(mperksTransactionJson.getTransactionType(), "Credit") ? MperksTransaction.TransactionType.CREDIT : MperksTransaction.TransactionType.DEBIT;
        int points = mperksTransactionJson.getPoints();
        Instant instant = (Instant) wk.d.b(mperksTransactionJson.getPostedAt(), C17898a.f167225a.s(), new C14016a());
        ReasonDetails reasonDetailsA = null;
        ZonedDateTime zonedDateTimeAtZone = instant != null ? instant.atZone(ZoneId.systemDefault()) : null;
        String label = mperksTransactionJson.getLabel();
        Long rewardId = mperksTransactionJson.getRewardId();
        int i10 = a.$EnumSwitchMapping$0[mperksTransactionJson.getReason().ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            SaleDetailsJson saleDetails = mperksTransactionJson.getSaleDetails();
            if (saleDetails != null) {
                reasonDetailsA = r.a(saleDetails, mperksTransactionJson.getReason());
            }
        } else if (i10 == 4) {
            CouponDetailsJson couponDetails = mperksTransactionJson.getCouponDetails();
            if (couponDetails != null) {
                reasonDetailsA = C14398d.a(couponDetails, mperksTransactionJson.getReason());
            }
        } else if (i10 == 5 && (adjustmentDetails = mperksTransactionJson.getAdjustmentDetails()) != null) {
            reasonDetailsA = C14395a.a(adjustmentDetails, mperksTransactionJson.getReason());
        }
        return new MperksTransaction(transactionId, transactionType, points, zonedDateTimeAtZone, label, rewardId, reasonDetailsA);
    }
}
