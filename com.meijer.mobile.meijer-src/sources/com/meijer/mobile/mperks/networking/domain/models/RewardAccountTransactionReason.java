package com.meijer.mobile.mperks.networking.domain.models;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/RewardAccountTransactionReason;", "", "reasonCode", "", "<init>", "(Ljava/lang/String;II)V", "getReasonCode", "()I", "Undefined", "OnlineSale", "InStoreSale", "PartnerSale", "RewardProgressAdjustment", "NonPurchaseReward", "PointAdjustment", "BuyCoupon", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RewardAccountTransactionReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RewardAccountTransactionReason[] $VALUES;
    private final int reasonCode;
    public static final RewardAccountTransactionReason Undefined = new RewardAccountTransactionReason("Undefined", 0, 0);
    public static final RewardAccountTransactionReason OnlineSale = new RewardAccountTransactionReason("OnlineSale", 1, 1);
    public static final RewardAccountTransactionReason InStoreSale = new RewardAccountTransactionReason("InStoreSale", 2, 2);
    public static final RewardAccountTransactionReason PartnerSale = new RewardAccountTransactionReason("PartnerSale", 3, 3);
    public static final RewardAccountTransactionReason RewardProgressAdjustment = new RewardAccountTransactionReason("RewardProgressAdjustment", 4, 4);
    public static final RewardAccountTransactionReason NonPurchaseReward = new RewardAccountTransactionReason("NonPurchaseReward", 5, 5);
    public static final RewardAccountTransactionReason PointAdjustment = new RewardAccountTransactionReason("PointAdjustment", 6, 6);
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
