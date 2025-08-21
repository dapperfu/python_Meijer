package com.meijer.mobile.mperks.networking.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0003\u0010\f\u001a\u00020\u000b\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J~\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0003\u0010\f\u001a\u00020\u000b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b$\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010,\u001a\u0004\b(\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b!\u00101\u001a\u0004\b\"\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b#\u00103\u001a\u0004\b\u001f\u00104¨\u00065"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/MperksTransactionJson;", "", "", "transactionId", "transactionType", "", "points", "postedAt", "label", "", "rewardId", "Lcom/meijer/mobile/mperks/networking/api/models/RewardAccountTransactionReasonJson;", "reason", "Lcom/meijer/mobile/mperks/networking/api/models/SaleDetailsJson;", "saleDetails", "Lcom/meijer/mobile/mperks/networking/api/models/CouponDetailsJson;", "couponDetails", "Lcom/meijer/mobile/mperks/networking/api/models/AdjustmentDetailsJson;", "adjustmentDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/meijer/mobile/mperks/networking/api/models/RewardAccountTransactionReasonJson;Lcom/meijer/mobile/mperks/networking/api/models/SaleDetailsJson;Lcom/meijer/mobile/mperks/networking/api/models/CouponDetailsJson;Lcom/meijer/mobile/mperks/networking/api/models/AdjustmentDetailsJson;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/meijer/mobile/mperks/networking/api/models/RewardAccountTransactionReasonJson;Lcom/meijer/mobile/mperks/networking/api/models/SaleDetailsJson;Lcom/meijer/mobile/mperks/networking/api/models/CouponDetailsJson;Lcom/meijer/mobile/mperks/networking/api/models/AdjustmentDetailsJson;)Lcom/meijer/mobile/mperks/networking/api/models/MperksTransactionJson;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "i", "b", "j", "c", "I", "d", "e", "f", "Ljava/lang/Long;", "g", "()Ljava/lang/Long;", "Lcom/meijer/mobile/mperks/networking/api/models/RewardAccountTransactionReasonJson;", "()Lcom/meijer/mobile/mperks/networking/api/models/RewardAccountTransactionReasonJson;", "h", "Lcom/meijer/mobile/mperks/networking/api/models/SaleDetailsJson;", "()Lcom/meijer/mobile/mperks/networking/api/models/SaleDetailsJson;", "Lcom/meijer/mobile/mperks/networking/api/models/CouponDetailsJson;", "()Lcom/meijer/mobile/mperks/networking/api/models/CouponDetailsJson;", "Lcom/meijer/mobile/mperks/networking/api/models/AdjustmentDetailsJson;", "()Lcom/meijer/mobile/mperks/networking/api/models/AdjustmentDetailsJson;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MperksTransactionJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int points;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String postedAt;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String label;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long rewardId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final RewardAccountTransactionReasonJson reason;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final SaleDetailsJson saleDetails;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final CouponDetailsJson couponDetails;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final AdjustmentDetailsJson adjustmentDetails;

    public MperksTransactionJson(@g(name = "transactionId") String transactionId, @g(name = "transactionType") String transactionType, @g(name = "points") int i10, @g(name = "postedAt") String postedAt, @g(name = "label") String str, @g(name = "rewardId") Long l10, @g(name = "reason") RewardAccountTransactionReasonJson reason, @g(name = "saleDetails") SaleDetailsJson saleDetailsJson, @g(name = "couponDetails") CouponDetailsJson couponDetailsJson, @g(name = "adjustmentDetails") AdjustmentDetailsJson adjustmentDetailsJson) {
        Intrinsics.j(transactionId, "transactionId");
        Intrinsics.j(transactionType, "transactionType");
        Intrinsics.j(postedAt, "postedAt");
        Intrinsics.j(reason, "reason");
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.points = i10;
        this.postedAt = postedAt;
        this.label = str;
        this.rewardId = l10;
        this.reason = reason;
        this.saleDetails = saleDetailsJson;
        this.couponDetails = couponDetailsJson;
        this.adjustmentDetails = adjustmentDetailsJson;
    }

    public final MperksTransactionJson copy(@g(name = "transactionId") String transactionId, @g(name = "transactionType") String transactionType, @g(name = "points") int points, @g(name = "postedAt") String postedAt, @g(name = "label") String label, @g(name = "rewardId") Long rewardId, @g(name = "reason") RewardAccountTransactionReasonJson reason, @g(name = "saleDetails") SaleDetailsJson saleDetails, @g(name = "couponDetails") CouponDetailsJson couponDetails, @g(name = "adjustmentDetails") AdjustmentDetailsJson adjustmentDetails) {
        Intrinsics.j(transactionId, "transactionId");
        Intrinsics.j(transactionType, "transactionType");
        Intrinsics.j(postedAt, "postedAt");
        Intrinsics.j(reason, "reason");
        return new MperksTransactionJson(transactionId, transactionType, points, postedAt, label, rewardId, reason, saleDetails, couponDetails, adjustmentDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MperksTransactionJson)) {
            return false;
        }
        MperksTransactionJson mperksTransactionJson = (MperksTransactionJson) other;
        return Intrinsics.e(this.transactionId, mperksTransactionJson.transactionId) && Intrinsics.e(this.transactionType, mperksTransactionJson.transactionType) && this.points == mperksTransactionJson.points && Intrinsics.e(this.postedAt, mperksTransactionJson.postedAt) && Intrinsics.e(this.label, mperksTransactionJson.label) && Intrinsics.e(this.rewardId, mperksTransactionJson.rewardId) && this.reason == mperksTransactionJson.reason && Intrinsics.e(this.saleDetails, mperksTransactionJson.saleDetails) && Intrinsics.e(this.couponDetails, mperksTransactionJson.couponDetails) && Intrinsics.e(this.adjustmentDetails, mperksTransactionJson.adjustmentDetails);
    }

    public int hashCode() {
        int iHashCode = ((((((this.transactionId.hashCode() * 31) + this.transactionType.hashCode()) * 31) + Integer.hashCode(this.points)) * 31) + this.postedAt.hashCode()) * 31;
        String str = this.label;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l10 = this.rewardId;
        int iHashCode3 = (((iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31) + this.reason.hashCode()) * 31;
        SaleDetailsJson saleDetailsJson = this.saleDetails;
        int iHashCode4 = (iHashCode3 + (saleDetailsJson == null ? 0 : saleDetailsJson.hashCode())) * 31;
        CouponDetailsJson couponDetailsJson = this.couponDetails;
        int iHashCode5 = (iHashCode4 + (couponDetailsJson == null ? 0 : couponDetailsJson.hashCode())) * 31;
        AdjustmentDetailsJson adjustmentDetailsJson = this.adjustmentDetails;
        return iHashCode5 + (adjustmentDetailsJson != null ? adjustmentDetailsJson.hashCode() : 0);
    }

    public String toString() {
        return "MperksTransactionJson(transactionId=" + this.transactionId + ", transactionType=" + this.transactionType + ", points=" + this.points + ", postedAt=" + this.postedAt + ", label=" + this.label + ", rewardId=" + this.rewardId + ", reason=" + this.reason + ", saleDetails=" + this.saleDetails + ", couponDetails=" + this.couponDetails + ", adjustmentDetails=" + this.adjustmentDetails + ')';
    }

    /* renamed from: a, reason: from getter */
    public final AdjustmentDetailsJson getAdjustmentDetails() {
        return this.adjustmentDetails;
    }

    /* renamed from: b, reason: from getter */
    public final CouponDetailsJson getCouponDetails() {
        return this.couponDetails;
    }

    /* renamed from: c, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: d, reason: from getter */
    public final int getPoints() {
        return this.points;
    }

    /* renamed from: e, reason: from getter */
    public final String getPostedAt() {
        return this.postedAt;
    }

    /* renamed from: f, reason: from getter */
    public final RewardAccountTransactionReasonJson getReason() {
        return this.reason;
    }

    /* renamed from: g, reason: from getter */
    public final Long getRewardId() {
        return this.rewardId;
    }

    /* renamed from: h, reason: from getter */
    public final SaleDetailsJson getSaleDetails() {
        return this.saleDetails;
    }

    /* renamed from: i, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* renamed from: j, reason: from getter */
    public final String getTransactionType() {
        return this.transactionType;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ MperksTransactionJson(java.lang.String r14, java.lang.String r15, int r16, java.lang.String r17, java.lang.String r18, java.lang.Long r19, com.meijer.mobile.mperks.networking.api.models.RewardAccountTransactionReasonJson r20, com.meijer.mobile.mperks.networking.api.models.SaleDetailsJson r21, com.meijer.mobile.mperks.networking.api.models.CouponDetailsJson r22, com.meijer.mobile.mperks.networking.api.models.AdjustmentDetailsJson r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 4
            if (r1 == 0) goto L9
            r1 = 0
            r5 = r1
            goto Lb
        L9:
            r5 = r16
        Lb:
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L12
            r7 = r2
            goto L14
        L12:
            r7 = r18
        L14:
            r1 = r0 & 32
            if (r1 == 0) goto L1a
            r8 = r2
            goto L1c
        L1a:
            r8 = r19
        L1c:
            r1 = r0 & 64
            if (r1 == 0) goto L24
            com.meijer.mobile.mperks.networking.api.models.RewardAccountTransactionReasonJson r1 = com.meijer.mobile.mperks.networking.api.models.RewardAccountTransactionReasonJson.Undefined
            r9 = r1
            goto L26
        L24:
            r9 = r20
        L26:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L2c
            r10 = r2
            goto L2e
        L2c:
            r10 = r21
        L2e:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L34
            r11 = r2
            goto L36
        L34:
            r11 = r22
        L36:
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L41
            r12 = r2
            r3 = r14
            r4 = r15
            r6 = r17
            r2 = r13
            goto L48
        L41:
            r12 = r23
            r2 = r13
            r3 = r14
            r4 = r15
            r6 = r17
        L48:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.networking.api.models.MperksTransactionJson.<init>(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.Long, com.meijer.mobile.mperks.networking.api.models.RewardAccountTransactionReasonJson, com.meijer.mobile.mperks.networking.api.models.SaleDetailsJson, com.meijer.mobile.mperks.networking.api.models.CouponDetailsJson, com.meijer.mobile.mperks.networking.api.models.AdjustmentDetailsJson, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
