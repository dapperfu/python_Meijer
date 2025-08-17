package com.meijer.mobile.cart.model.hybris;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0086\u0001\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b&\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b'\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b(\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b)\u0010\u0014R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b\u001b\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b\"\u0010%R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b\u001e\u0010%¨\u0006*"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/HybrisLightningCartReward;", "", "", "promoDesc", "", "rewardAmount", "", "lineNumber", "linChildInstance", "promoNum", "rewardCode", "rewardType", "customOfferCode", "grantSequence", "executionCycle", "<init>", "(Ljava/lang/String;DLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "copy", "(Ljava/lang/String;DLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/meijer/mobile/cart/model/hybris/HybrisLightningCartReward;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "D", "h", "()D", "c", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "d", "g", "i", "j", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class HybrisLightningCartReward {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promoDesc;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double rewardAmount;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer lineNumber;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer linChildInstance;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer promoNum;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer rewardCode;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String rewardType;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer customOfferCode;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer grantSequence;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer executionCycle;

    public HybrisLightningCartReward() {
        this(null, 0.0d, null, null, null, null, null, null, null, null, 1023, null);
    }

    public final HybrisLightningCartReward copy(@g(name = "promoDesc") String promoDesc, @g(name = "rewardAmount") double rewardAmount, @g(name = "lineNumber") Integer lineNumber, @g(name = "linChildInstance") Integer linChildInstance, @g(name = "promoNum") Integer promoNum, @g(name = "rewardCode") Integer rewardCode, @g(name = "rewardType") String rewardType, @g(name = "customOfferCode") Integer customOfferCode, @g(name = "grantSequence") Integer grantSequence, @g(name = "executionCycle") Integer executionCycle) {
        return new HybrisLightningCartReward(promoDesc, rewardAmount, lineNumber, linChildInstance, promoNum, rewardCode, rewardType, customOfferCode, grantSequence, executionCycle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisLightningCartReward)) {
            return false;
        }
        HybrisLightningCartReward hybrisLightningCartReward = (HybrisLightningCartReward) other;
        return Intrinsics.e(this.promoDesc, hybrisLightningCartReward.promoDesc) && Double.compare(this.rewardAmount, hybrisLightningCartReward.rewardAmount) == 0 && Intrinsics.e(this.lineNumber, hybrisLightningCartReward.lineNumber) && Intrinsics.e(this.linChildInstance, hybrisLightningCartReward.linChildInstance) && Intrinsics.e(this.promoNum, hybrisLightningCartReward.promoNum) && Intrinsics.e(this.rewardCode, hybrisLightningCartReward.rewardCode) && Intrinsics.e(this.rewardType, hybrisLightningCartReward.rewardType) && Intrinsics.e(this.customOfferCode, hybrisLightningCartReward.customOfferCode) && Intrinsics.e(this.grantSequence, hybrisLightningCartReward.grantSequence) && Intrinsics.e(this.executionCycle, hybrisLightningCartReward.executionCycle);
    }

    public int hashCode() {
        String str = this.promoDesc;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Double.hashCode(this.rewardAmount)) * 31;
        Integer num = this.lineNumber;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.linChildInstance;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.promoNum;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.rewardCode;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.rewardType;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num5 = this.customOfferCode;
        int iHashCode7 = (iHashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.grantSequence;
        int iHashCode8 = (iHashCode7 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.executionCycle;
        return iHashCode8 + (num7 != null ? num7.hashCode() : 0);
    }

    public String toString() {
        return "HybrisLightningCartReward(promoDesc=" + this.promoDesc + ", rewardAmount=" + this.rewardAmount + ", lineNumber=" + this.lineNumber + ", linChildInstance=" + this.linChildInstance + ", promoNum=" + this.promoNum + ", rewardCode=" + this.rewardCode + ", rewardType=" + this.rewardType + ", customOfferCode=" + this.customOfferCode + ", grantSequence=" + this.grantSequence + ", executionCycle=" + this.executionCycle + ')';
    }

    public HybrisLightningCartReward(@g(name = "promoDesc") String str, @g(name = "rewardAmount") double d10, @g(name = "lineNumber") Integer num, @g(name = "linChildInstance") Integer num2, @g(name = "promoNum") Integer num3, @g(name = "rewardCode") Integer num4, @g(name = "rewardType") String str2, @g(name = "customOfferCode") Integer num5, @g(name = "grantSequence") Integer num6, @g(name = "executionCycle") Integer num7) {
        this.promoDesc = str;
        this.rewardAmount = d10;
        this.lineNumber = num;
        this.linChildInstance = num2;
        this.promoNum = num3;
        this.rewardCode = num4;
        this.rewardType = str2;
        this.customOfferCode = num5;
        this.grantSequence = num6;
        this.executionCycle = num7;
    }

    /* renamed from: a, reason: from getter */
    public final Integer getCustomOfferCode() {
        return this.customOfferCode;
    }

    /* renamed from: b, reason: from getter */
    public final Integer getExecutionCycle() {
        return this.executionCycle;
    }

    /* renamed from: c, reason: from getter */
    public final Integer getGrantSequence() {
        return this.grantSequence;
    }

    /* renamed from: d, reason: from getter */
    public final Integer getLinChildInstance() {
        return this.linChildInstance;
    }

    /* renamed from: e, reason: from getter */
    public final Integer getLineNumber() {
        return this.lineNumber;
    }

    /* renamed from: f, reason: from getter */
    public final String getPromoDesc() {
        return this.promoDesc;
    }

    /* renamed from: g, reason: from getter */
    public final Integer getPromoNum() {
        return this.promoNum;
    }

    /* renamed from: h, reason: from getter */
    public final double getRewardAmount() {
        return this.rewardAmount;
    }

    /* renamed from: i, reason: from getter */
    public final Integer getRewardCode() {
        return this.rewardCode;
    }

    /* renamed from: j, reason: from getter */
    public final String getRewardType() {
        return this.rewardType;
    }

    public /* synthetic */ HybrisLightningCartReward(String str, double d10, Integer num, Integer num2, Integer num3, Integer num4, String str2, Integer num5, Integer num6, Integer num7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? 0.0d : d10, (i10 & 4) != 0 ? 0 : num, (i10 & 8) != 0 ? 0 : num2, (i10 & 16) != 0 ? 0 : num3, (i10 & 32) != 0 ? 0 : num4, (i10 & 64) != 0 ? null : str2, (i10 & 128) != 0 ? 0 : num5, (i10 & 256) != 0 ? 0 : num6, (i10 & 512) != 0 ? 0 : num7);
    }
}
