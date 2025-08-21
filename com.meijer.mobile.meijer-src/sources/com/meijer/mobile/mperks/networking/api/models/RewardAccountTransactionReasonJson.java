package com.meijer.mobile.mperks.networking.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@i(generateAdapter = false)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/RewardAccountTransactionReasonJson;", "", "", "reasonCode", "<init>", "(Ljava/lang/String;II)V", "I", "getReasonCode", "()I", "Undefined", "OnlineSale", "InStoreSale", "PartnerSale", "RewardProgressAdjustment", "NonPurchaseReward", "PointAdjustment", "BuyCoupon", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RewardAccountTransactionReasonJson {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RewardAccountTransactionReasonJson[] $VALUES;
    private final int reasonCode;

    @g(name = "Undefined")
    public static final RewardAccountTransactionReasonJson Undefined = new RewardAccountTransactionReasonJson("Undefined", 0, 0);

    @g(name = "OnlineSale")
    public static final RewardAccountTransactionReasonJson OnlineSale = new RewardAccountTransactionReasonJson("OnlineSale", 1, 1);

    @g(name = "InStoreSale")
    public static final RewardAccountTransactionReasonJson InStoreSale = new RewardAccountTransactionReasonJson("InStoreSale", 2, 2);

    @g(name = "PartnerSale")
    public static final RewardAccountTransactionReasonJson PartnerSale = new RewardAccountTransactionReasonJson("PartnerSale", 3, 3);

    @g(name = "RewardProgressAdjustment")
    public static final RewardAccountTransactionReasonJson RewardProgressAdjustment = new RewardAccountTransactionReasonJson("RewardProgressAdjustment", 4, 4);

    @g(name = "NonPurchaseReward")
    public static final RewardAccountTransactionReasonJson NonPurchaseReward = new RewardAccountTransactionReasonJson("NonPurchaseReward", 5, 5);

    @g(name = "PointAdjustment")
    public static final RewardAccountTransactionReasonJson PointAdjustment = new RewardAccountTransactionReasonJson("PointAdjustment", 6, 6);

    @g(name = "BuyCoupon")
    public static final RewardAccountTransactionReasonJson BuyCoupon = new RewardAccountTransactionReasonJson("BuyCoupon", 7, 7);

    private static final /* synthetic */ RewardAccountTransactionReasonJson[] a() {
        return new RewardAccountTransactionReasonJson[]{Undefined, OnlineSale, InStoreSale, PartnerSale, RewardProgressAdjustment, NonPurchaseReward, PointAdjustment, BuyCoupon};
    }

    static {
        RewardAccountTransactionReasonJson[] rewardAccountTransactionReasonJsonArrA = a();
        $VALUES = rewardAccountTransactionReasonJsonArrA;
        $ENTRIES = EnumEntriesKt.a(rewardAccountTransactionReasonJsonArrA);
    }

    public static RewardAccountTransactionReasonJson valueOf(String str) {
        return (RewardAccountTransactionReasonJson) Enum.valueOf(RewardAccountTransactionReasonJson.class, str);
    }

    public static RewardAccountTransactionReasonJson[] values() {
        return (RewardAccountTransactionReasonJson[]) $VALUES.clone();
    }

    private RewardAccountTransactionReasonJson(String str, int i10, int i11) {
        this.reasonCode = i11;
    }
}
