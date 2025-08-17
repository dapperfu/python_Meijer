package com.meijer.mobile.mperks.networking.domain.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001;B\u0081\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00100\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0088\u0001\u00104\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u0007HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006<"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/MperkTransaction;", "", "documentType", "", "transactionId", "transactionType", "points", "", "postedAt", "label", "rewardId", "", "reason", "Lcom/meijer/mobile/mperks/networking/domain/models/MperkTransaction$RewardAccountTransactionReason;", "saleDetails", "Lcom/meijer/mobile/mperks/networking/domain/models/SaleDetails;", "couponDetails", "Lcom/meijer/mobile/mperks/networking/domain/models/CouponDetails;", "adjustmentDetails", "Lcom/meijer/mobile/mperks/networking/domain/models/AdjustmentDetails;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/meijer/mobile/mperks/networking/domain/models/MperkTransaction$RewardAccountTransactionReason;Lcom/meijer/mobile/mperks/networking/domain/models/SaleDetails;Lcom/meijer/mobile/mperks/networking/domain/models/CouponDetails;Lcom/meijer/mobile/mperks/networking/domain/models/AdjustmentDetails;)V", "getDocumentType", "()Ljava/lang/String;", "getTransactionId", "getTransactionType", "getPoints", "()I", "getPostedAt", "getLabel", "getRewardId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getReason", "()Lcom/meijer/mobile/mperks/networking/domain/models/MperkTransaction$RewardAccountTransactionReason;", "getSaleDetails", "()Lcom/meijer/mobile/mperks/networking/domain/models/SaleDetails;", "getCouponDetails", "()Lcom/meijer/mobile/mperks/networking/domain/models/CouponDetails;", "getAdjustmentDetails", "()Lcom/meijer/mobile/mperks/networking/domain/models/AdjustmentDetails;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/meijer/mobile/mperks/networking/domain/models/MperkTransaction$RewardAccountTransactionReason;Lcom/meijer/mobile/mperks/networking/domain/models/SaleDetails;Lcom/meijer/mobile/mperks/networking/domain/models/CouponDetails;Lcom/meijer/mobile/mperks/networking/domain/models/AdjustmentDetails;)Lcom/meijer/mobile/mperks/networking/domain/models/MperkTransaction;", "equals", "", "other", "hashCode", "toString", "RewardAccountTransactionReason", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class MperkTransaction {
    private final AdjustmentDetails adjustmentDetails;
    private final CouponDetails couponDetails;
    private final String documentType;
    private final String label;
    private final int points;
    private final String postedAt;
    private final RewardAccountTransactionReason reason;
    private final Long rewardId;
    private final SaleDetails saleDetails;
    private final String transactionId;
    private final String transactionType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @i(generateAdapter = false)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/MperkTransaction$RewardAccountTransactionReason;", "", "reasonCode", "", "<init>", "(Ljava/lang/String;II)V", "getReasonCode", "()I", "Undefined", "OnlineSale", "InStoreSale", "PartnerSale", "RewardProgressAdjustment", "NonPurchaseReward", "PointAdjustment", "BuyCoupon", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardAccountTransactionReason {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RewardAccountTransactionReason[] $VALUES;
        private final int reasonCode;

        @g(name = "Undefined")
        public static final RewardAccountTransactionReason Undefined = new RewardAccountTransactionReason("Undefined", 0, 0);

        @g(name = "OnlineSale")
        public static final RewardAccountTransactionReason OnlineSale = new RewardAccountTransactionReason("OnlineSale", 1, 1);

        @g(name = "InStoreSale")
        public static final RewardAccountTransactionReason InStoreSale = new RewardAccountTransactionReason("InStoreSale", 2, 2);

        @g(name = "PartnerSale")
        public static final RewardAccountTransactionReason PartnerSale = new RewardAccountTransactionReason("PartnerSale", 3, 3);

        @g(name = "RewardProgressAdjustment")
        public static final RewardAccountTransactionReason RewardProgressAdjustment = new RewardAccountTransactionReason("RewardProgressAdjustment", 4, 4);

        @g(name = "NonPurchaseReward")
        public static final RewardAccountTransactionReason NonPurchaseReward = new RewardAccountTransactionReason("NonPurchaseReward", 5, 5);

        @g(name = "PointAdjustment")
        public static final RewardAccountTransactionReason PointAdjustment = new RewardAccountTransactionReason("PointAdjustment", 6, 6);

        @g(name = "BuyCoupon")
        public static final RewardAccountTransactionReason BuyCoupon = new RewardAccountTransactionReason("BuyCoupon", 7, 7);

        private static final /* synthetic */ RewardAccountTransactionReason[] $values() {
            return new RewardAccountTransactionReason[]{Undefined, OnlineSale, InStoreSale, PartnerSale, RewardProgressAdjustment, NonPurchaseReward, PointAdjustment, BuyCoupon};
        }

        public static EnumEntries<RewardAccountTransactionReason> getEntries() {
            return $ENTRIES;
        }

        static {
            RewardAccountTransactionReason[] rewardAccountTransactionReasonArr$values = $values();
            $VALUES = rewardAccountTransactionReasonArr$values;
            $ENTRIES = EnumEntriesKt.a(rewardAccountTransactionReasonArr$values);
        }

        public static RewardAccountTransactionReason valueOf(String str) {
            return (RewardAccountTransactionReason) Enum.valueOf(RewardAccountTransactionReason.class, str);
        }

        public static RewardAccountTransactionReason[] values() {
            return (RewardAccountTransactionReason[]) $VALUES.clone();
        }

        public final int getReasonCode() {
            return this.reasonCode;
        }

        private RewardAccountTransactionReason(String str, int i10, int i11) {
            this.reasonCode = i11;
        }
    }

    public MperkTransaction(@g(name = "documentType") String documentType, @g(name = "transactionId") String transactionId, @g(name = "transactionType") String transactionType, @g(name = "points") int i10, @g(name = "postedAt") String postedAt, @g(name = "label") String str, @g(name = "rewardId") Long l10, @g(name = "reason") RewardAccountTransactionReason rewardAccountTransactionReason, @g(name = "saleDetails") SaleDetails saleDetails, @g(name = "couponDetails") CouponDetails couponDetails, @g(name = "adjustmentDetails") AdjustmentDetails adjustmentDetails) {
        Intrinsics.j(documentType, "documentType");
        Intrinsics.j(transactionId, "transactionId");
        Intrinsics.j(transactionType, "transactionType");
        Intrinsics.j(postedAt, "postedAt");
        this.documentType = documentType;
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.points = i10;
        this.postedAt = postedAt;
        this.label = str;
        this.rewardId = l10;
        this.reason = rewardAccountTransactionReason;
        this.saleDetails = saleDetails;
        this.couponDetails = couponDetails;
        this.adjustmentDetails = adjustmentDetails;
    }

    public static /* synthetic */ MperkTransaction copy$default(MperkTransaction mperkTransaction, String str, String str2, String str3, int i10, String str4, String str5, Long l10, RewardAccountTransactionReason rewardAccountTransactionReason, SaleDetails saleDetails, CouponDetails couponDetails, AdjustmentDetails adjustmentDetails, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mperkTransaction.documentType;
        }
        if ((i11 & 2) != 0) {
            str2 = mperkTransaction.transactionId;
        }
        if ((i11 & 4) != 0) {
            str3 = mperkTransaction.transactionType;
        }
        if ((i11 & 8) != 0) {
            i10 = mperkTransaction.points;
        }
        if ((i11 & 16) != 0) {
            str4 = mperkTransaction.postedAt;
        }
        if ((i11 & 32) != 0) {
            str5 = mperkTransaction.label;
        }
        if ((i11 & 64) != 0) {
            l10 = mperkTransaction.rewardId;
        }
        if ((i11 & 128) != 0) {
            rewardAccountTransactionReason = mperkTransaction.reason;
        }
        if ((i11 & 256) != 0) {
            saleDetails = mperkTransaction.saleDetails;
        }
        if ((i11 & 512) != 0) {
            couponDetails = mperkTransaction.couponDetails;
        }
        if ((i11 & 1024) != 0) {
            adjustmentDetails = mperkTransaction.adjustmentDetails;
        }
        CouponDetails couponDetails2 = couponDetails;
        AdjustmentDetails adjustmentDetails2 = adjustmentDetails;
        RewardAccountTransactionReason rewardAccountTransactionReason2 = rewardAccountTransactionReason;
        SaleDetails saleDetails2 = saleDetails;
        String str6 = str5;
        Long l11 = l10;
        String str7 = str4;
        String str8 = str3;
        return mperkTransaction.copy(str, str2, str8, i10, str7, str6, l11, rewardAccountTransactionReason2, saleDetails2, couponDetails2, adjustmentDetails2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    /* renamed from: component10, reason: from getter */
    public final CouponDetails getCouponDetails() {
        return this.couponDetails;
    }

    /* renamed from: component11, reason: from getter */
    public final AdjustmentDetails getAdjustmentDetails() {
        return this.adjustmentDetails;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTransactionType() {
        return this.transactionType;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPoints() {
        return this.points;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPostedAt() {
        return this.postedAt;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component7, reason: from getter */
    public final Long getRewardId() {
        return this.rewardId;
    }

    /* renamed from: component8, reason: from getter */
    public final RewardAccountTransactionReason getReason() {
        return this.reason;
    }

    /* renamed from: component9, reason: from getter */
    public final SaleDetails getSaleDetails() {
        return this.saleDetails;
    }

    public final MperkTransaction copy(@g(name = "documentType") String documentType, @g(name = "transactionId") String transactionId, @g(name = "transactionType") String transactionType, @g(name = "points") int points, @g(name = "postedAt") String postedAt, @g(name = "label") String label, @g(name = "rewardId") Long rewardId, @g(name = "reason") RewardAccountTransactionReason reason, @g(name = "saleDetails") SaleDetails saleDetails, @g(name = "couponDetails") CouponDetails couponDetails, @g(name = "adjustmentDetails") AdjustmentDetails adjustmentDetails) {
        Intrinsics.j(documentType, "documentType");
        Intrinsics.j(transactionId, "transactionId");
        Intrinsics.j(transactionType, "transactionType");
        Intrinsics.j(postedAt, "postedAt");
        return new MperkTransaction(documentType, transactionId, transactionType, points, postedAt, label, rewardId, reason, saleDetails, couponDetails, adjustmentDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MperkTransaction)) {
            return false;
        }
        MperkTransaction mperkTransaction = (MperkTransaction) other;
        return Intrinsics.e(this.documentType, mperkTransaction.documentType) && Intrinsics.e(this.transactionId, mperkTransaction.transactionId) && Intrinsics.e(this.transactionType, mperkTransaction.transactionType) && this.points == mperkTransaction.points && Intrinsics.e(this.postedAt, mperkTransaction.postedAt) && Intrinsics.e(this.label, mperkTransaction.label) && Intrinsics.e(this.rewardId, mperkTransaction.rewardId) && this.reason == mperkTransaction.reason && Intrinsics.e(this.saleDetails, mperkTransaction.saleDetails) && Intrinsics.e(this.couponDetails, mperkTransaction.couponDetails) && Intrinsics.e(this.adjustmentDetails, mperkTransaction.adjustmentDetails);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.documentType.hashCode() * 31) + this.transactionId.hashCode()) * 31) + this.transactionType.hashCode()) * 31) + Integer.hashCode(this.points)) * 31) + this.postedAt.hashCode()) * 31;
        String str = this.label;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l10 = this.rewardId;
        int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        RewardAccountTransactionReason rewardAccountTransactionReason = this.reason;
        int iHashCode4 = (iHashCode3 + (rewardAccountTransactionReason == null ? 0 : rewardAccountTransactionReason.hashCode())) * 31;
        SaleDetails saleDetails = this.saleDetails;
        int iHashCode5 = (iHashCode4 + (saleDetails == null ? 0 : saleDetails.hashCode())) * 31;
        CouponDetails couponDetails = this.couponDetails;
        int iHashCode6 = (iHashCode5 + (couponDetails == null ? 0 : couponDetails.hashCode())) * 31;
        AdjustmentDetails adjustmentDetails = this.adjustmentDetails;
        return iHashCode6 + (adjustmentDetails != null ? adjustmentDetails.hashCode() : 0);
    }

    public String toString() {
        return "MperkTransaction(documentType=" + this.documentType + ", transactionId=" + this.transactionId + ", transactionType=" + this.transactionType + ", points=" + this.points + ", postedAt=" + this.postedAt + ", label=" + this.label + ", rewardId=" + this.rewardId + ", reason=" + this.reason + ", saleDetails=" + this.saleDetails + ", couponDetails=" + this.couponDetails + ", adjustmentDetails=" + this.adjustmentDetails + ')';
    }

    public final AdjustmentDetails getAdjustmentDetails() {
        return this.adjustmentDetails;
    }

    public final CouponDetails getCouponDetails() {
        return this.couponDetails;
    }

    public final String getDocumentType() {
        return this.documentType;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getPoints() {
        return this.points;
    }

    public final String getPostedAt() {
        return this.postedAt;
    }

    public final RewardAccountTransactionReason getReason() {
        return this.reason;
    }

    public final Long getRewardId() {
        return this.rewardId;
    }

    public final SaleDetails getSaleDetails() {
        return this.saleDetails;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final String getTransactionType() {
        return this.transactionType;
    }

    public /* synthetic */ MperkTransaction(String str, String str2, String str3, int i10, String str4, String str5, Long l10, RewardAccountTransactionReason rewardAccountTransactionReason, SaleDetails saleDetails, CouponDetails couponDetails, AdjustmentDetails adjustmentDetails, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i10, str4, str5, l10, rewardAccountTransactionReason, (i11 & 256) != 0 ? new SaleDetails(null, null, null, null, 15, null) : saleDetails, (i11 & 512) != 0 ? new CouponDetails(null, null, null, 7, null) : couponDetails, (i11 & 1024) != 0 ? new AdjustmentDetails(null, null, 3, null) : adjustmentDetails);
    }
}
