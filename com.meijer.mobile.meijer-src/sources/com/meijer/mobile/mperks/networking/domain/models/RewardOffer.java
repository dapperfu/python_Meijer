package com.meijer.mobile.mperks.networking.domain.models;

import j$.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\b\u0086\b\u0018\u00002\u00020\u0001:\u0001=B\u0087\u0001\u0012\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0016\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010\u001bJ\u0010\u0010&\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b&\u0010\u0019J\u0090\u0001\u0010'\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b)\u0010\u001bJ\u0010\u0010*\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b*\u0010\"J\u001a\u0010,\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b\u0006\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b3\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b4\u0010\u001bR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b5\u0010\u001bR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u0010 R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\b9\u0010\"R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\b;\u0010$R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u00101\u001a\u0004\b<\u0010\u001bR\u0017\u0010\u0013\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\b\u0013\u0010\u0019¨\u0006>"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/RewardOffer;", "", "", "Lcom/meijer/mobile/core/models/mperks/MperksCouponId;", "meijerOfferId", "", "isClippable", "", "title", "subTitle", "description", "termsConditionsDescription", "j$/time/LocalDateTime", "endDate", "", "pointCost", "Lcom/meijer/mobile/mperks/networking/domain/models/RewardOffer$ConditionType;", "conditionType", "imageURL", "isClipped", "<init>", "(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/LocalDateTime;ILcom/meijer/mobile/mperks/networking/domain/models/RewardOffer$ConditionType;Ljava/lang/String;Z)V", "component1", "()J", "component2", "()Z", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "()Lj$/time/LocalDateTime;", "component8", "()I", "component9", "()Lcom/meijer/mobile/mperks/networking/domain/models/RewardOffer$ConditionType;", "component10", "component11", "copy", "(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/LocalDateTime;ILcom/meijer/mobile/mperks/networking/domain/models/RewardOffer$ConditionType;Ljava/lang/String;Z)Lcom/meijer/mobile/mperks/networking/domain/models/RewardOffer;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getMeijerOfferId", "Z", "Ljava/lang/String;", "getTitle", "getSubTitle", "getDescription", "getTermsConditionsDescription", "Lj$/time/LocalDateTime;", "getEndDate", "I", "getPointCost", "Lcom/meijer/mobile/mperks/networking/domain/models/RewardOffer$ConditionType;", "getConditionType", "getImageURL", "ConditionType", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RewardOffer {
    private final ConditionType conditionType;
    private final String description;
    private final LocalDateTime endDate;
    private final String imageURL;
    private final boolean isClippable;
    private final boolean isClipped;
    private final long meijerOfferId;
    private final int pointCost;
    private final String subTitle;
    private final String termsConditionsDescription;
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/RewardOffer$ConditionType;", "", "<init>", "(Ljava/lang/String;I)V", "SINGLE_QUANTITY", "QUANTITY", "SPEND", "MUST_PURCHASE", "M_PERKS_AT_THE_PUMP", "POINT_CONDITION", "UNKNOWN", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ConditionType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ConditionType[] $VALUES;
        public static final ConditionType SINGLE_QUANTITY = new ConditionType("SINGLE_QUANTITY", 0);
        public static final ConditionType QUANTITY = new ConditionType("QUANTITY", 1);
        public static final ConditionType SPEND = new ConditionType("SPEND", 2);
        public static final ConditionType MUST_PURCHASE = new ConditionType("MUST_PURCHASE", 3);
        public static final ConditionType M_PERKS_AT_THE_PUMP = new ConditionType("M_PERKS_AT_THE_PUMP", 4);
        public static final ConditionType POINT_CONDITION = new ConditionType("POINT_CONDITION", 5);
        public static final ConditionType UNKNOWN = new ConditionType("UNKNOWN", 6);

        private static final /* synthetic */ ConditionType[] $values() {
            return new ConditionType[]{SINGLE_QUANTITY, QUANTITY, SPEND, MUST_PURCHASE, M_PERKS_AT_THE_PUMP, POINT_CONDITION, UNKNOWN};
        }

        public static EnumEntries<ConditionType> getEntries() {
            return $ENTRIES;
        }

        static {
            ConditionType[] conditionTypeArr$values = $values();
            $VALUES = conditionTypeArr$values;
            $ENTRIES = EnumEntriesKt.a(conditionTypeArr$values);
        }

        public static ConditionType valueOf(String str) {
            return (ConditionType) Enum.valueOf(ConditionType.class, str);
        }

        public static ConditionType[] values() {
            return (ConditionType[]) $VALUES.clone();
        }

        private ConditionType(String str, int i10) {
        }
    }

    public RewardOffer() {
        this(0L, false, null, null, null, null, null, 0, null, null, false, 2047, null);
    }

    public static /* synthetic */ RewardOffer copy$default(RewardOffer rewardOffer, long j10, boolean z10, String str, String str2, String str3, String str4, LocalDateTime localDateTime, int i10, ConditionType conditionType, String str5, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = rewardOffer.meijerOfferId;
        }
        return rewardOffer.copy(j10, (i11 & 2) != 0 ? rewardOffer.isClippable : z10, (i11 & 4) != 0 ? rewardOffer.title : str, (i11 & 8) != 0 ? rewardOffer.subTitle : str2, (i11 & 16) != 0 ? rewardOffer.description : str3, (i11 & 32) != 0 ? rewardOffer.termsConditionsDescription : str4, (i11 & 64) != 0 ? rewardOffer.endDate : localDateTime, (i11 & 128) != 0 ? rewardOffer.pointCost : i10, (i11 & 256) != 0 ? rewardOffer.conditionType : conditionType, (i11 & 512) != 0 ? rewardOffer.imageURL : str5, (i11 & 1024) != 0 ? rewardOffer.isClipped : z11);
    }

    /* renamed from: component1, reason: from getter */
    public final long getMeijerOfferId() {
        return this.meijerOfferId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getImageURL() {
        return this.imageURL;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsClipped() {
        return this.isClipped;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsClippable() {
        return this.isClippable;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTermsConditionsDescription() {
        return this.termsConditionsDescription;
    }

    /* renamed from: component7, reason: from getter */
    public final LocalDateTime getEndDate() {
        return this.endDate;
    }

    /* renamed from: component8, reason: from getter */
    public final int getPointCost() {
        return this.pointCost;
    }

    /* renamed from: component9, reason: from getter */
    public final ConditionType getConditionType() {
        return this.conditionType;
    }

    public final RewardOffer copy(long meijerOfferId, boolean isClippable, String title, String subTitle, String description, String termsConditionsDescription, LocalDateTime endDate, int pointCost, ConditionType conditionType, String imageURL, boolean isClipped) {
        return new RewardOffer(meijerOfferId, isClippable, title, subTitle, description, termsConditionsDescription, endDate, pointCost, conditionType, imageURL, isClipped);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardOffer)) {
            return false;
        }
        RewardOffer rewardOffer = (RewardOffer) other;
        return this.meijerOfferId == rewardOffer.meijerOfferId && this.isClippable == rewardOffer.isClippable && Intrinsics.e(this.title, rewardOffer.title) && Intrinsics.e(this.subTitle, rewardOffer.subTitle) && Intrinsics.e(this.description, rewardOffer.description) && Intrinsics.e(this.termsConditionsDescription, rewardOffer.termsConditionsDescription) && Intrinsics.e(this.endDate, rewardOffer.endDate) && this.pointCost == rewardOffer.pointCost && this.conditionType == rewardOffer.conditionType && Intrinsics.e(this.imageURL, rewardOffer.imageURL) && this.isClipped == rewardOffer.isClipped;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.meijerOfferId) * 31) + Boolean.hashCode(this.isClippable)) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.termsConditionsDescription;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        LocalDateTime localDateTime = this.endDate;
        int iHashCode6 = (((iHashCode5 + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31) + Integer.hashCode(this.pointCost)) * 31;
        ConditionType conditionType = this.conditionType;
        int iHashCode7 = (iHashCode6 + (conditionType == null ? 0 : conditionType.hashCode())) * 31;
        String str5 = this.imageURL;
        return ((iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31) + Boolean.hashCode(this.isClipped);
    }

    public String toString() {
        return "RewardOffer(meijerOfferId=" + this.meijerOfferId + ", isClippable=" + this.isClippable + ", title=" + this.title + ", subTitle=" + this.subTitle + ", description=" + this.description + ", termsConditionsDescription=" + this.termsConditionsDescription + ", endDate=" + this.endDate + ", pointCost=" + this.pointCost + ", conditionType=" + this.conditionType + ", imageURL=" + this.imageURL + ", isClipped=" + this.isClipped + ')';
    }

    public RewardOffer(long j10, boolean z10, String str, String str2, String str3, String str4, LocalDateTime localDateTime, int i10, ConditionType conditionType, String str5, boolean z11) {
        this.meijerOfferId = j10;
        this.isClippable = z10;
        this.title = str;
        this.subTitle = str2;
        this.description = str3;
        this.termsConditionsDescription = str4;
        this.endDate = localDateTime;
        this.pointCost = i10;
        this.conditionType = conditionType;
        this.imageURL = str5;
        this.isClipped = z11;
    }

    public final ConditionType getConditionType() {
        return this.conditionType;
    }

    public final String getDescription() {
        return this.description;
    }

    public final LocalDateTime getEndDate() {
        return this.endDate;
    }

    public final String getImageURL() {
        return this.imageURL;
    }

    public final long getMeijerOfferId() {
        return this.meijerOfferId;
    }

    public final int getPointCost() {
        return this.pointCost;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTermsConditionsDescription() {
        return this.termsConditionsDescription;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean isClippable() {
        return this.isClippable;
    }

    public final boolean isClipped() {
        return this.isClipped;
    }

    public /* synthetic */ RewardOffer(long j10, boolean z10, String str, String str2, String str3, String str4, LocalDateTime localDateTime, int i10, ConditionType conditionType, String str5, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j10, (i11 & 2) != 0 ? false : z10, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : localDateTime, (i11 & 128) != 0 ? 0 : i10, (i11 & 256) != 0 ? null : conditionType, (i11 & 512) == 0 ? str5 : null, (i11 & 1024) != 0 ? false : z11);
    }
}
