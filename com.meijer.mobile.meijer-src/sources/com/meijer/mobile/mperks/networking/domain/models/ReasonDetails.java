package com.meijer.mobile.mperks.networking.domain.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/ReasonDetails;", "", "reason", "Lcom/meijer/mobile/mperks/networking/domain/models/RewardAccountTransactionReason;", "<init>", "(Lcom/meijer/mobile/mperks/networking/domain/models/RewardAccountTransactionReason;)V", "getReason", "()Lcom/meijer/mobile/mperks/networking/domain/models/RewardAccountTransactionReason;", "SaleDetails", "CouponDetails", "AdjustmentDetails", "Lcom/meijer/mobile/mperks/networking/domain/models/ReasonDetails$AdjustmentDetails;", "Lcom/meijer/mobile/mperks/networking/domain/models/ReasonDetails$CouponDetails;", "Lcom/meijer/mobile/mperks/networking/domain/models/ReasonDetails$SaleDetails;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class ReasonDetails {
    private final RewardAccountTransactionReason reason;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/ReasonDetails$AdjustmentDetails;", "Lcom/meijer/mobile/mperks/networking/domain/models/ReasonDetails;", "reason", "Lcom/meijer/mobile/mperks/networking/domain/models/RewardAccountTransactionReason;", "comments", "", "createdBy", "<init>", "(Lcom/meijer/mobile/mperks/networking/domain/models/RewardAccountTransactionReason;Ljava/lang/String;Ljava/lang/String;)V", "getReason", "()Lcom/meijer/mobile/mperks/networking/domain/models/RewardAccountTransactionReason;", "getComments", "()Ljava/lang/String;", "getCreatedBy", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AdjustmentDetails extends ReasonDetails {
        private final String comments;
        private final String createdBy;
        private final RewardAccountTransactionReason reason;

        public AdjustmentDetails() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ AdjustmentDetails copy$default(AdjustmentDetails adjustmentDetails, RewardAccountTransactionReason rewardAccountTransactionReason, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                rewardAccountTransactionReason = adjustmentDetails.reason;
            }
            if ((i10 & 2) != 0) {
                str = adjustmentDetails.comments;
            }
            if ((i10 & 4) != 0) {
                str2 = adjustmentDetails.createdBy;
            }
            return adjustmentDetails.copy(rewardAccountTransactionReason, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final RewardAccountTransactionReason getReason() {
            return this.reason;
        }

        /* renamed from: component2, reason: from getter */
        public final String getComments() {
            return this.comments;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCreatedBy() {
            return this.createdBy;
        }

        public final AdjustmentDetails copy(RewardAccountTransactionReason reason, String comments, String createdBy) {
            Intrinsics.j(reason, "reason");
            return new AdjustmentDetails(reason, comments, createdBy);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdjustmentDetails)) {
                return false;
            }
            AdjustmentDetails adjustmentDetails = (AdjustmentDetails) other;
            return this.reason == adjustmentDetails.reason && Intrinsics.e(this.comments, adjustmentDetails.comments) && Intrinsics.e(this.createdBy, adjustmentDetails.createdBy);
        }

        public int hashCode() {
            int iHashCode = this.reason.hashCode() * 31;
            String str = this.comments;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.createdBy;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "AdjustmentDetails(reason=" + this.reason + ", comments=" + this.comments + ", createdBy=" + this.createdBy + ')';
        }

        public /* synthetic */ AdjustmentDetails(RewardAccountTransactionReason rewardAccountTransactionReason, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? RewardAccountTransactionReason.Undefined : rewardAccountTransactionReason, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2);
        }

        public final String getComments() {
            return this.comments;
        }

        public final String getCreatedBy() {
            return this.createdBy;
        }

        @Override // com.meijer.mobile.mperks.networking.domain.models.ReasonDetails
        public RewardAccountTransactionReason getReason() {
            return this.reason;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AdjustmentDetails(RewardAccountTransactionReason reason, String str, String str2) {
            super(reason, null);
            Intrinsics.j(reason, "reason");
            this.reason = reason;
            this.comments = str;
            this.createdBy = str2;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\f\b\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\r\u0010\u0016\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\b\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\nHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/ReasonDetails$CouponDetails;", "Lcom/meijer/mobile/mperks/networking/domain/models/ReasonDetails;", "reason", "Lcom/meijer/mobile/mperks/networking/domain/models/RewardAccountTransactionReason;", "couponId", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "clipSource", "Lcom/meijer/mobile/mperks/networking/domain/models/ClipSource;", "clipLabel", "", "<init>", "(Lcom/meijer/mobile/mperks/networking/domain/models/RewardAccountTransactionReason;JLcom/meijer/mobile/mperks/networking/domain/models/ClipSource;Ljava/lang/String;)V", "getReason", "()Lcom/meijer/mobile/mperks/networking/domain/models/RewardAccountTransactionReason;", "getCouponId", "()J", "getClipSource", "()Lcom/meijer/mobile/mperks/networking/domain/models/ClipSource;", "getClipLabel", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CouponDetails extends ReasonDetails {
        private final String clipLabel;
        private final ClipSource clipSource;
        private final long couponId;
        private final RewardAccountTransactionReason reason;

        public CouponDetails() {
            this(null, 0L, null, null, 15, null);
        }

        public static /* synthetic */ CouponDetails copy$default(CouponDetails couponDetails, RewardAccountTransactionReason rewardAccountTransactionReason, long j10, ClipSource clipSource, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                rewardAccountTransactionReason = couponDetails.reason;
            }
            if ((i10 & 2) != 0) {
                j10 = couponDetails.couponId;
            }
            if ((i10 & 4) != 0) {
                clipSource = couponDetails.clipSource;
            }
            if ((i10 & 8) != 0) {
                str = couponDetails.clipLabel;
            }
            return couponDetails.copy(rewardAccountTransactionReason, j10, clipSource, str);
        }

        /* renamed from: component1, reason: from getter */
        public final RewardAccountTransactionReason getReason() {
            return this.reason;
        }

        /* renamed from: component2, reason: from getter */
        public final long getCouponId() {
            return this.couponId;
        }

        /* renamed from: component3, reason: from getter */
        public final ClipSource getClipSource() {
            return this.clipSource;
        }

        /* renamed from: component4, reason: from getter */
        public final String getClipLabel() {
            return this.clipLabel;
        }

        public final CouponDetails copy(RewardAccountTransactionReason reason, long couponId, ClipSource clipSource, String clipLabel) {
            Intrinsics.j(reason, "reason");
            return new CouponDetails(reason, couponId, clipSource, clipLabel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CouponDetails)) {
                return false;
            }
            CouponDetails couponDetails = (CouponDetails) other;
            return this.reason == couponDetails.reason && this.couponId == couponDetails.couponId && this.clipSource == couponDetails.clipSource && Intrinsics.e(this.clipLabel, couponDetails.clipLabel);
        }

        public int hashCode() {
            int iHashCode = ((this.reason.hashCode() * 31) + Long.hashCode(this.couponId)) * 31;
            ClipSource clipSource = this.clipSource;
            int iHashCode2 = (iHashCode + (clipSource == null ? 0 : clipSource.hashCode())) * 31;
            String str = this.clipLabel;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "CouponDetails(reason=" + this.reason + ", couponId=" + this.couponId + ", clipSource=" + this.clipSource + ", clipLabel=" + this.clipLabel + ')';
        }

        public /* synthetic */ CouponDetails(RewardAccountTransactionReason rewardAccountTransactionReason, long j10, ClipSource clipSource, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? RewardAccountTransactionReason.Undefined : rewardAccountTransactionReason, (i10 & 2) != 0 ? 0L : j10, (i10 & 4) != 0 ? null : clipSource, (i10 & 8) != 0 ? null : str);
        }

        public final String getClipLabel() {
            return this.clipLabel;
        }

        public final ClipSource getClipSource() {
            return this.clipSource;
        }

        public final long getCouponId() {
            return this.couponId;
        }

        @Override // com.meijer.mobile.mperks.networking.domain.models.ReasonDetails
        public RewardAccountTransactionReason getReason() {
            return this.reason;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CouponDetails(RewardAccountTransactionReason reason, long j10, ClipSource clipSource, String str) {
            super(reason, null);
            Intrinsics.j(reason, "reason");
            this.reason = reason;
            this.couponId = j10;
            this.clipSource = clipSource;
            this.clipLabel = str;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/ReasonDetails$SaleDetails;", "Lcom/meijer/mobile/mperks/networking/domain/models/ReasonDetails;", "reason", "Lcom/meijer/mobile/mperks/networking/domain/models/RewardAccountTransactionReason;", "saleId", "", "partner", "partnerOrderId", "digitalOrderId", "<init>", "(Lcom/meijer/mobile/mperks/networking/domain/models/RewardAccountTransactionReason;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getReason", "()Lcom/meijer/mobile/mperks/networking/domain/models/RewardAccountTransactionReason;", "getSaleId", "()Ljava/lang/String;", "getPartner", "getPartnerOrderId", "getDigitalOrderId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SaleDetails extends ReasonDetails {
        private final String digitalOrderId;
        private final String partner;
        private final String partnerOrderId;
        private final RewardAccountTransactionReason reason;
        private final String saleId;

        public SaleDetails() {
            this(null, null, null, null, null, 31, null);
        }

        public static /* synthetic */ SaleDetails copy$default(SaleDetails saleDetails, RewardAccountTransactionReason rewardAccountTransactionReason, String str, String str2, String str3, String str4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                rewardAccountTransactionReason = saleDetails.reason;
            }
            if ((i10 & 2) != 0) {
                str = saleDetails.saleId;
            }
            if ((i10 & 4) != 0) {
                str2 = saleDetails.partner;
            }
            if ((i10 & 8) != 0) {
                str3 = saleDetails.partnerOrderId;
            }
            if ((i10 & 16) != 0) {
                str4 = saleDetails.digitalOrderId;
            }
            String str5 = str4;
            String str6 = str2;
            return saleDetails.copy(rewardAccountTransactionReason, str, str6, str3, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final RewardAccountTransactionReason getReason() {
            return this.reason;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSaleId() {
            return this.saleId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPartner() {
            return this.partner;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPartnerOrderId() {
            return this.partnerOrderId;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDigitalOrderId() {
            return this.digitalOrderId;
        }

        public final SaleDetails copy(RewardAccountTransactionReason reason, String saleId, String partner, String partnerOrderId, String digitalOrderId) {
            Intrinsics.j(reason, "reason");
            return new SaleDetails(reason, saleId, partner, partnerOrderId, digitalOrderId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SaleDetails)) {
                return false;
            }
            SaleDetails saleDetails = (SaleDetails) other;
            return this.reason == saleDetails.reason && Intrinsics.e(this.saleId, saleDetails.saleId) && Intrinsics.e(this.partner, saleDetails.partner) && Intrinsics.e(this.partnerOrderId, saleDetails.partnerOrderId) && Intrinsics.e(this.digitalOrderId, saleDetails.digitalOrderId);
        }

        public int hashCode() {
            int iHashCode = this.reason.hashCode() * 31;
            String str = this.saleId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.partner;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.partnerOrderId;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.digitalOrderId;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "SaleDetails(reason=" + this.reason + ", saleId=" + this.saleId + ", partner=" + this.partner + ", partnerOrderId=" + this.partnerOrderId + ", digitalOrderId=" + this.digitalOrderId + ')';
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ SaleDetails(com.meijer.mobile.mperks.networking.domain.models.RewardAccountTransactionReason r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
            /*
                r1 = this;
                r8 = r7 & 1
                if (r8 == 0) goto L6
                com.meijer.mobile.mperks.networking.domain.models.RewardAccountTransactionReason r2 = com.meijer.mobile.mperks.networking.domain.models.RewardAccountTransactionReason.Undefined
            L6:
                r8 = r7 & 2
                r0 = 0
                if (r8 == 0) goto Lc
                r3 = r0
            Lc:
                r8 = r7 & 4
                if (r8 == 0) goto L11
                r4 = r0
            L11:
                r8 = r7 & 8
                if (r8 == 0) goto L16
                r5 = r0
            L16:
                r7 = r7 & 16
                if (r7 == 0) goto L21
                r8 = r0
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L27
            L21:
                r8 = r6
                r7 = r5
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L27:
                r3.<init>(r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.networking.domain.models.ReasonDetails.SaleDetails.<init>(com.meijer.mobile.mperks.networking.domain.models.RewardAccountTransactionReason, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final String getDigitalOrderId() {
            return this.digitalOrderId;
        }

        public final String getPartner() {
            return this.partner;
        }

        public final String getPartnerOrderId() {
            return this.partnerOrderId;
        }

        @Override // com.meijer.mobile.mperks.networking.domain.models.ReasonDetails
        public RewardAccountTransactionReason getReason() {
            return this.reason;
        }

        public final String getSaleId() {
            return this.saleId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SaleDetails(RewardAccountTransactionReason reason, String str, String str2, String str3, String str4) {
            super(reason, null);
            Intrinsics.j(reason, "reason");
            this.reason = reason;
            this.saleId = str;
            this.partner = str2;
            this.partnerOrderId = str3;
            this.digitalOrderId = str4;
        }
    }

    public /* synthetic */ ReasonDetails(RewardAccountTransactionReason rewardAccountTransactionReason, DefaultConstructorMarker defaultConstructorMarker) {
        this(rewardAccountTransactionReason);
    }

    private ReasonDetails(RewardAccountTransactionReason rewardAccountTransactionReason) {
        this.reason = rewardAccountTransactionReason;
    }

    public RewardAccountTransactionReason getReason() {
        return this.reason;
    }
}
