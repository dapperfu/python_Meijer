package com.meijer.mobile.mperks.networking.domain.models;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003*+,BO\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0003JV\u0010\"\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018¨\u0006-"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/MperksCreditCardInfoResponse;", "", "enrollmentStatus", "", "dollarProgress", "rewardOffers", "", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksCreditCardInfoResponse$RewardOffers;", "legacyGroceryOffers", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksCreditCardInfoResponse$LegacyGroceryOffers;", "legacyGeneralOffers", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksCreditCardInfoResponse$LegacyGeneralOffers;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getEnrollmentStatus", "()Ljava/lang/Integer;", "setEnrollmentStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDollarProgress", "setDollarProgress", "getRewardOffers", "()Ljava/util/List;", "setRewardOffers", "(Ljava/util/List;)V", "getLegacyGroceryOffers", "setLegacyGroceryOffers", "getLegacyGeneralOffers", "setLegacyGeneralOffers", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/meijer/mobile/mperks/networking/domain/models/MperksCreditCardInfoResponse;", "equals", "", "other", "hashCode", "toString", "", "RewardOffers", "LegacyGroceryOffers", "LegacyGeneralOffers", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class MperksCreditCardInfoResponse {
    private Integer dollarProgress;
    private Integer enrollmentStatus;
    private List<LegacyGeneralOffers> legacyGeneralOffers;
    private List<LegacyGroceryOffers> legacyGroceryOffers;
    private List<RewardOffers> rewardOffers;

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b@\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u00106\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010>\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015Jª\u0001\u0010A\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020\u00052\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020\u0003HÖ\u0001J\t\u0010F\u001a\u00020\u0007HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0004\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R\u001e\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b)\u0010\u0015\"\u0004\b*\u0010\u0017R\u001e\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b+\u0010\u0015\"\u0004\b,\u0010\u0017R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b-\u0010\u0015\"\u0004\b.\u0010\u0017R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001e\"\u0004\b0\u0010 R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0010\u0010\u0019\"\u0004\b1\u0010\u001bR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b2\u0010\u0015\"\u0004\b3\u0010\u0017¨\u0006G"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/MperksCreditCardInfoResponse$LegacyGeneralOffers;", "", "meijerOfferId", "", "isClippable", "", "title", "", "subTitle", "description", "termsConditionsDescription", "endDate", "pointCost", "rewardState", "conditionTypeId", "imageURL", "isClipped", "rewardType", "<init>", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getMeijerOfferId", "()Ljava/lang/Integer;", "setMeijerOfferId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "setClippable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getSubTitle", "setSubTitle", "getDescription", "setDescription", "getTermsConditionsDescription", "setTermsConditionsDescription", "getEndDate", "setEndDate", "getPointCost", "setPointCost", "getRewardState", "setRewardState", "getConditionTypeId", "setConditionTypeId", "getImageURL", "setImageURL", "setClipped", "getRewardType", "setRewardType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/meijer/mobile/mperks/networking/domain/models/MperksCreditCardInfoResponse$LegacyGeneralOffers;", "equals", "other", "hashCode", "toString", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LegacyGeneralOffers {
        private Integer conditionTypeId;
        private String description;
        private String endDate;
        private String imageURL;
        private Boolean isClippable;
        private Boolean isClipped;
        private Integer meijerOfferId;
        private Integer pointCost;
        private Integer rewardState;
        private Integer rewardType;
        private String subTitle;
        private String termsConditionsDescription;
        private String title;

        public LegacyGeneralOffers() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }

        public static /* synthetic */ LegacyGeneralOffers copy$default(LegacyGeneralOffers legacyGeneralOffers, Integer num, Boolean bool, String str, String str2, String str3, String str4, String str5, Integer num2, Integer num3, Integer num4, String str6, Boolean bool2, Integer num5, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = legacyGeneralOffers.meijerOfferId;
            }
            return legacyGeneralOffers.copy(num, (i10 & 2) != 0 ? legacyGeneralOffers.isClippable : bool, (i10 & 4) != 0 ? legacyGeneralOffers.title : str, (i10 & 8) != 0 ? legacyGeneralOffers.subTitle : str2, (i10 & 16) != 0 ? legacyGeneralOffers.description : str3, (i10 & 32) != 0 ? legacyGeneralOffers.termsConditionsDescription : str4, (i10 & 64) != 0 ? legacyGeneralOffers.endDate : str5, (i10 & 128) != 0 ? legacyGeneralOffers.pointCost : num2, (i10 & 256) != 0 ? legacyGeneralOffers.rewardState : num3, (i10 & 512) != 0 ? legacyGeneralOffers.conditionTypeId : num4, (i10 & 1024) != 0 ? legacyGeneralOffers.imageURL : str6, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? legacyGeneralOffers.isClipped : bool2, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? legacyGeneralOffers.rewardType : num5);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getMeijerOfferId() {
            return this.meijerOfferId;
        }

        /* renamed from: component10, reason: from getter */
        public final Integer getConditionTypeId() {
            return this.conditionTypeId;
        }

        /* renamed from: component11, reason: from getter */
        public final String getImageURL() {
            return this.imageURL;
        }

        /* renamed from: component12, reason: from getter */
        public final Boolean getIsClipped() {
            return this.isClipped;
        }

        /* renamed from: component13, reason: from getter */
        public final Integer getRewardType() {
            return this.rewardType;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getIsClippable() {
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
        public final String getEndDate() {
            return this.endDate;
        }

        /* renamed from: component8, reason: from getter */
        public final Integer getPointCost() {
            return this.pointCost;
        }

        /* renamed from: component9, reason: from getter */
        public final Integer getRewardState() {
            return this.rewardState;
        }

        public final LegacyGeneralOffers copy(@g(name = "meijerOfferId") Integer meijerOfferId, @g(name = "isClippable") Boolean isClippable, @g(name = "title") String title, @g(name = "subTitle") String subTitle, @g(name = "description") String description, @g(name = "termsConditionsDescription") String termsConditionsDescription, @g(name = "endDate") String endDate, @g(name = "pointCost") Integer pointCost, @g(name = "rewardState") Integer rewardState, @g(name = "conditionTypeId") Integer conditionTypeId, @g(name = "imageURL") String imageURL, @g(name = "isClipped") Boolean isClipped, @g(name = "rewardType") Integer rewardType) {
            return new LegacyGeneralOffers(meijerOfferId, isClippable, title, subTitle, description, termsConditionsDescription, endDate, pointCost, rewardState, conditionTypeId, imageURL, isClipped, rewardType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LegacyGeneralOffers)) {
                return false;
            }
            LegacyGeneralOffers legacyGeneralOffers = (LegacyGeneralOffers) other;
            return Intrinsics.e(this.meijerOfferId, legacyGeneralOffers.meijerOfferId) && Intrinsics.e(this.isClippable, legacyGeneralOffers.isClippable) && Intrinsics.e(this.title, legacyGeneralOffers.title) && Intrinsics.e(this.subTitle, legacyGeneralOffers.subTitle) && Intrinsics.e(this.description, legacyGeneralOffers.description) && Intrinsics.e(this.termsConditionsDescription, legacyGeneralOffers.termsConditionsDescription) && Intrinsics.e(this.endDate, legacyGeneralOffers.endDate) && Intrinsics.e(this.pointCost, legacyGeneralOffers.pointCost) && Intrinsics.e(this.rewardState, legacyGeneralOffers.rewardState) && Intrinsics.e(this.conditionTypeId, legacyGeneralOffers.conditionTypeId) && Intrinsics.e(this.imageURL, legacyGeneralOffers.imageURL) && Intrinsics.e(this.isClipped, legacyGeneralOffers.isClipped) && Intrinsics.e(this.rewardType, legacyGeneralOffers.rewardType);
        }

        public int hashCode() {
            Integer num = this.meijerOfferId;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Boolean bool = this.isClippable;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.title;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subTitle;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.description;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.termsConditionsDescription;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.endDate;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num2 = this.pointCost;
            int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.rewardState;
            int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.conditionTypeId;
            int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
            String str6 = this.imageURL;
            int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Boolean bool2 = this.isClipped;
            int iHashCode12 = (iHashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Integer num5 = this.rewardType;
            return iHashCode12 + (num5 != null ? num5.hashCode() : 0);
        }

        public String toString() {
            return "LegacyGeneralOffers(meijerOfferId=" + this.meijerOfferId + ", isClippable=" + this.isClippable + ", title=" + this.title + ", subTitle=" + this.subTitle + ", description=" + this.description + ", termsConditionsDescription=" + this.termsConditionsDescription + ", endDate=" + this.endDate + ", pointCost=" + this.pointCost + ", rewardState=" + this.rewardState + ", conditionTypeId=" + this.conditionTypeId + ", imageURL=" + this.imageURL + ", isClipped=" + this.isClipped + ", rewardType=" + this.rewardType + ')';
        }

        public LegacyGeneralOffers(@g(name = "meijerOfferId") Integer num, @g(name = "isClippable") Boolean bool, @g(name = "title") String str, @g(name = "subTitle") String str2, @g(name = "description") String str3, @g(name = "termsConditionsDescription") String str4, @g(name = "endDate") String str5, @g(name = "pointCost") Integer num2, @g(name = "rewardState") Integer num3, @g(name = "conditionTypeId") Integer num4, @g(name = "imageURL") String str6, @g(name = "isClipped") Boolean bool2, @g(name = "rewardType") Integer num5) {
            this.meijerOfferId = num;
            this.isClippable = bool;
            this.title = str;
            this.subTitle = str2;
            this.description = str3;
            this.termsConditionsDescription = str4;
            this.endDate = str5;
            this.pointCost = num2;
            this.rewardState = num3;
            this.conditionTypeId = num4;
            this.imageURL = str6;
            this.isClipped = bool2;
            this.rewardType = num5;
        }

        public final Integer getConditionTypeId() {
            return this.conditionTypeId;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getEndDate() {
            return this.endDate;
        }

        public final String getImageURL() {
            return this.imageURL;
        }

        public final Integer getMeijerOfferId() {
            return this.meijerOfferId;
        }

        public final Integer getPointCost() {
            return this.pointCost;
        }

        public final Integer getRewardState() {
            return this.rewardState;
        }

        public final Integer getRewardType() {
            return this.rewardType;
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

        public final Boolean isClippable() {
            return this.isClippable;
        }

        public final Boolean isClipped() {
            return this.isClipped;
        }

        public final void setClippable(Boolean bool) {
            this.isClippable = bool;
        }

        public final void setClipped(Boolean bool) {
            this.isClipped = bool;
        }

        public final void setConditionTypeId(Integer num) {
            this.conditionTypeId = num;
        }

        public final void setDescription(String str) {
            this.description = str;
        }

        public final void setEndDate(String str) {
            this.endDate = str;
        }

        public final void setImageURL(String str) {
            this.imageURL = str;
        }

        public final void setMeijerOfferId(Integer num) {
            this.meijerOfferId = num;
        }

        public final void setPointCost(Integer num) {
            this.pointCost = num;
        }

        public final void setRewardState(Integer num) {
            this.rewardState = num;
        }

        public final void setRewardType(Integer num) {
            this.rewardType = num;
        }

        public final void setSubTitle(String str) {
            this.subTitle = str;
        }

        public final void setTermsConditionsDescription(String str) {
            this.termsConditionsDescription = str;
        }

        public final void setTitle(String str) {
            this.title = str;
        }

        public /* synthetic */ LegacyGeneralOffers(Integer num, Boolean bool, String str, String str2, String str3, String str4, String str5, Integer num2, Integer num3, Integer num4, String str6, Boolean bool2, Integer num5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : bool, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : str5, (i10 & 128) != 0 ? null : num2, (i10 & 256) != 0 ? null : num3, (i10 & 512) != 0 ? null : num4, (i10 & 1024) != 0 ? null : str6, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? null : bool2, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : num5);
        }
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b@\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u00106\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010>\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015Jª\u0001\u0010A\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020\u00052\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020\u0003HÖ\u0001J\t\u0010F\u001a\u00020\u0007HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0004\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R\u001e\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b)\u0010\u0015\"\u0004\b*\u0010\u0017R\u001e\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b+\u0010\u0015\"\u0004\b,\u0010\u0017R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b-\u0010\u0015\"\u0004\b.\u0010\u0017R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001e\"\u0004\b0\u0010 R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0010\u0010\u0019\"\u0004\b1\u0010\u001bR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b2\u0010\u0015\"\u0004\b3\u0010\u0017¨\u0006G"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/MperksCreditCardInfoResponse$LegacyGroceryOffers;", "", "meijerOfferId", "", "isClippable", "", "title", "", "subTitle", "description", "termsConditionsDescription", "endDate", "pointCost", "rewardState", "conditionTypeId", "imageURL", "isClipped", "rewardType", "<init>", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getMeijerOfferId", "()Ljava/lang/Integer;", "setMeijerOfferId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "setClippable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getSubTitle", "setSubTitle", "getDescription", "setDescription", "getTermsConditionsDescription", "setTermsConditionsDescription", "getEndDate", "setEndDate", "getPointCost", "setPointCost", "getRewardState", "setRewardState", "getConditionTypeId", "setConditionTypeId", "getImageURL", "setImageURL", "setClipped", "getRewardType", "setRewardType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/meijer/mobile/mperks/networking/domain/models/MperksCreditCardInfoResponse$LegacyGroceryOffers;", "equals", "other", "hashCode", "toString", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LegacyGroceryOffers {
        private Integer conditionTypeId;
        private String description;
        private String endDate;
        private String imageURL;
        private Boolean isClippable;
        private Boolean isClipped;
        private Integer meijerOfferId;
        private Integer pointCost;
        private Integer rewardState;
        private Integer rewardType;
        private String subTitle;
        private String termsConditionsDescription;
        private String title;

        public LegacyGroceryOffers() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }

        public static /* synthetic */ LegacyGroceryOffers copy$default(LegacyGroceryOffers legacyGroceryOffers, Integer num, Boolean bool, String str, String str2, String str3, String str4, String str5, Integer num2, Integer num3, Integer num4, String str6, Boolean bool2, Integer num5, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = legacyGroceryOffers.meijerOfferId;
            }
            return legacyGroceryOffers.copy(num, (i10 & 2) != 0 ? legacyGroceryOffers.isClippable : bool, (i10 & 4) != 0 ? legacyGroceryOffers.title : str, (i10 & 8) != 0 ? legacyGroceryOffers.subTitle : str2, (i10 & 16) != 0 ? legacyGroceryOffers.description : str3, (i10 & 32) != 0 ? legacyGroceryOffers.termsConditionsDescription : str4, (i10 & 64) != 0 ? legacyGroceryOffers.endDate : str5, (i10 & 128) != 0 ? legacyGroceryOffers.pointCost : num2, (i10 & 256) != 0 ? legacyGroceryOffers.rewardState : num3, (i10 & 512) != 0 ? legacyGroceryOffers.conditionTypeId : num4, (i10 & 1024) != 0 ? legacyGroceryOffers.imageURL : str6, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? legacyGroceryOffers.isClipped : bool2, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? legacyGroceryOffers.rewardType : num5);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getMeijerOfferId() {
            return this.meijerOfferId;
        }

        /* renamed from: component10, reason: from getter */
        public final Integer getConditionTypeId() {
            return this.conditionTypeId;
        }

        /* renamed from: component11, reason: from getter */
        public final String getImageURL() {
            return this.imageURL;
        }

        /* renamed from: component12, reason: from getter */
        public final Boolean getIsClipped() {
            return this.isClipped;
        }

        /* renamed from: component13, reason: from getter */
        public final Integer getRewardType() {
            return this.rewardType;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getIsClippable() {
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
        public final String getEndDate() {
            return this.endDate;
        }

        /* renamed from: component8, reason: from getter */
        public final Integer getPointCost() {
            return this.pointCost;
        }

        /* renamed from: component9, reason: from getter */
        public final Integer getRewardState() {
            return this.rewardState;
        }

        public final LegacyGroceryOffers copy(@g(name = "meijerOfferId") Integer meijerOfferId, @g(name = "isClippable") Boolean isClippable, @g(name = "title") String title, @g(name = "subTitle") String subTitle, @g(name = "description") String description, @g(name = "termsConditionsDescription") String termsConditionsDescription, @g(name = "endDate") String endDate, @g(name = "pointCost") Integer pointCost, @g(name = "rewardState") Integer rewardState, @g(name = "conditionTypeId") Integer conditionTypeId, @g(name = "imageURL") String imageURL, @g(name = "isClipped") Boolean isClipped, @g(name = "rewardType") Integer rewardType) {
            return new LegacyGroceryOffers(meijerOfferId, isClippable, title, subTitle, description, termsConditionsDescription, endDate, pointCost, rewardState, conditionTypeId, imageURL, isClipped, rewardType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LegacyGroceryOffers)) {
                return false;
            }
            LegacyGroceryOffers legacyGroceryOffers = (LegacyGroceryOffers) other;
            return Intrinsics.e(this.meijerOfferId, legacyGroceryOffers.meijerOfferId) && Intrinsics.e(this.isClippable, legacyGroceryOffers.isClippable) && Intrinsics.e(this.title, legacyGroceryOffers.title) && Intrinsics.e(this.subTitle, legacyGroceryOffers.subTitle) && Intrinsics.e(this.description, legacyGroceryOffers.description) && Intrinsics.e(this.termsConditionsDescription, legacyGroceryOffers.termsConditionsDescription) && Intrinsics.e(this.endDate, legacyGroceryOffers.endDate) && Intrinsics.e(this.pointCost, legacyGroceryOffers.pointCost) && Intrinsics.e(this.rewardState, legacyGroceryOffers.rewardState) && Intrinsics.e(this.conditionTypeId, legacyGroceryOffers.conditionTypeId) && Intrinsics.e(this.imageURL, legacyGroceryOffers.imageURL) && Intrinsics.e(this.isClipped, legacyGroceryOffers.isClipped) && Intrinsics.e(this.rewardType, legacyGroceryOffers.rewardType);
        }

        public int hashCode() {
            Integer num = this.meijerOfferId;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Boolean bool = this.isClippable;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.title;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subTitle;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.description;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.termsConditionsDescription;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.endDate;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num2 = this.pointCost;
            int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.rewardState;
            int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.conditionTypeId;
            int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
            String str6 = this.imageURL;
            int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Boolean bool2 = this.isClipped;
            int iHashCode12 = (iHashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Integer num5 = this.rewardType;
            return iHashCode12 + (num5 != null ? num5.hashCode() : 0);
        }

        public String toString() {
            return "LegacyGroceryOffers(meijerOfferId=" + this.meijerOfferId + ", isClippable=" + this.isClippable + ", title=" + this.title + ", subTitle=" + this.subTitle + ", description=" + this.description + ", termsConditionsDescription=" + this.termsConditionsDescription + ", endDate=" + this.endDate + ", pointCost=" + this.pointCost + ", rewardState=" + this.rewardState + ", conditionTypeId=" + this.conditionTypeId + ", imageURL=" + this.imageURL + ", isClipped=" + this.isClipped + ", rewardType=" + this.rewardType + ')';
        }

        public LegacyGroceryOffers(@g(name = "meijerOfferId") Integer num, @g(name = "isClippable") Boolean bool, @g(name = "title") String str, @g(name = "subTitle") String str2, @g(name = "description") String str3, @g(name = "termsConditionsDescription") String str4, @g(name = "endDate") String str5, @g(name = "pointCost") Integer num2, @g(name = "rewardState") Integer num3, @g(name = "conditionTypeId") Integer num4, @g(name = "imageURL") String str6, @g(name = "isClipped") Boolean bool2, @g(name = "rewardType") Integer num5) {
            this.meijerOfferId = num;
            this.isClippable = bool;
            this.title = str;
            this.subTitle = str2;
            this.description = str3;
            this.termsConditionsDescription = str4;
            this.endDate = str5;
            this.pointCost = num2;
            this.rewardState = num3;
            this.conditionTypeId = num4;
            this.imageURL = str6;
            this.isClipped = bool2;
            this.rewardType = num5;
        }

        public final Integer getConditionTypeId() {
            return this.conditionTypeId;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getEndDate() {
            return this.endDate;
        }

        public final String getImageURL() {
            return this.imageURL;
        }

        public final Integer getMeijerOfferId() {
            return this.meijerOfferId;
        }

        public final Integer getPointCost() {
            return this.pointCost;
        }

        public final Integer getRewardState() {
            return this.rewardState;
        }

        public final Integer getRewardType() {
            return this.rewardType;
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

        public final Boolean isClippable() {
            return this.isClippable;
        }

        public final Boolean isClipped() {
            return this.isClipped;
        }

        public final void setClippable(Boolean bool) {
            this.isClippable = bool;
        }

        public final void setClipped(Boolean bool) {
            this.isClipped = bool;
        }

        public final void setConditionTypeId(Integer num) {
            this.conditionTypeId = num;
        }

        public final void setDescription(String str) {
            this.description = str;
        }

        public final void setEndDate(String str) {
            this.endDate = str;
        }

        public final void setImageURL(String str) {
            this.imageURL = str;
        }

        public final void setMeijerOfferId(Integer num) {
            this.meijerOfferId = num;
        }

        public final void setPointCost(Integer num) {
            this.pointCost = num;
        }

        public final void setRewardState(Integer num) {
            this.rewardState = num;
        }

        public final void setRewardType(Integer num) {
            this.rewardType = num;
        }

        public final void setSubTitle(String str) {
            this.subTitle = str;
        }

        public final void setTermsConditionsDescription(String str) {
            this.termsConditionsDescription = str;
        }

        public final void setTitle(String str) {
            this.title = str;
        }

        public /* synthetic */ LegacyGroceryOffers(Integer num, Boolean bool, String str, String str2, String str3, String str4, String str5, Integer num2, Integer num3, Integer num4, String str6, Boolean bool2, Integer num5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : bool, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : str5, (i10 & 128) != 0 ? null : num2, (i10 & 256) != 0 ? null : num3, (i10 & 512) != 0 ? null : num4, (i10 & 1024) != 0 ? null : str6, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? null : bool2, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : num5);
        }
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b@\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u00106\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010>\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015Jª\u0001\u0010A\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020\u00052\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020\u0003HÖ\u0001J\t\u0010F\u001a\u00020\u0007HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0004\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R\u001e\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b)\u0010\u0015\"\u0004\b*\u0010\u0017R\u001e\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b+\u0010\u0015\"\u0004\b,\u0010\u0017R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b-\u0010\u0015\"\u0004\b.\u0010\u0017R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001e\"\u0004\b0\u0010 R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0010\u0010\u0019\"\u0004\b1\u0010\u001bR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b2\u0010\u0015\"\u0004\b3\u0010\u0017¨\u0006G"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/MperksCreditCardInfoResponse$RewardOffers;", "", "meijerOfferId", "", "isClippable", "", "title", "", "subTitle", "description", "termsConditionsDescription", "endDate", "pointCost", "rewardState", "conditionTypeId", "imageURL", "isClipped", "rewardType", "<init>", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getMeijerOfferId", "()Ljava/lang/Integer;", "setMeijerOfferId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "setClippable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getSubTitle", "setSubTitle", "getDescription", "setDescription", "getTermsConditionsDescription", "setTermsConditionsDescription", "getEndDate", "setEndDate", "getPointCost", "setPointCost", "getRewardState", "setRewardState", "getConditionTypeId", "setConditionTypeId", "getImageURL", "setImageURL", "setClipped", "getRewardType", "setRewardType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/meijer/mobile/mperks/networking/domain/models/MperksCreditCardInfoResponse$RewardOffers;", "equals", "other", "hashCode", "toString", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RewardOffers {
        private Integer conditionTypeId;
        private String description;
        private String endDate;
        private String imageURL;
        private Boolean isClippable;
        private Boolean isClipped;
        private Integer meijerOfferId;
        private Integer pointCost;
        private Integer rewardState;
        private Integer rewardType;
        private String subTitle;
        private String termsConditionsDescription;
        private String title;

        public RewardOffers() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }

        public static /* synthetic */ RewardOffers copy$default(RewardOffers rewardOffers, Integer num, Boolean bool, String str, String str2, String str3, String str4, String str5, Integer num2, Integer num3, Integer num4, String str6, Boolean bool2, Integer num5, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = rewardOffers.meijerOfferId;
            }
            return rewardOffers.copy(num, (i10 & 2) != 0 ? rewardOffers.isClippable : bool, (i10 & 4) != 0 ? rewardOffers.title : str, (i10 & 8) != 0 ? rewardOffers.subTitle : str2, (i10 & 16) != 0 ? rewardOffers.description : str3, (i10 & 32) != 0 ? rewardOffers.termsConditionsDescription : str4, (i10 & 64) != 0 ? rewardOffers.endDate : str5, (i10 & 128) != 0 ? rewardOffers.pointCost : num2, (i10 & 256) != 0 ? rewardOffers.rewardState : num3, (i10 & 512) != 0 ? rewardOffers.conditionTypeId : num4, (i10 & 1024) != 0 ? rewardOffers.imageURL : str6, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? rewardOffers.isClipped : bool2, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? rewardOffers.rewardType : num5);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getMeijerOfferId() {
            return this.meijerOfferId;
        }

        /* renamed from: component10, reason: from getter */
        public final Integer getConditionTypeId() {
            return this.conditionTypeId;
        }

        /* renamed from: component11, reason: from getter */
        public final String getImageURL() {
            return this.imageURL;
        }

        /* renamed from: component12, reason: from getter */
        public final Boolean getIsClipped() {
            return this.isClipped;
        }

        /* renamed from: component13, reason: from getter */
        public final Integer getRewardType() {
            return this.rewardType;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getIsClippable() {
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
        public final String getEndDate() {
            return this.endDate;
        }

        /* renamed from: component8, reason: from getter */
        public final Integer getPointCost() {
            return this.pointCost;
        }

        /* renamed from: component9, reason: from getter */
        public final Integer getRewardState() {
            return this.rewardState;
        }

        public final RewardOffers copy(@g(name = "meijerOfferId") Integer meijerOfferId, @g(name = "isClippable") Boolean isClippable, @g(name = "title") String title, @g(name = "subTitle") String subTitle, @g(name = "description") String description, @g(name = "termsConditionsDescription") String termsConditionsDescription, @g(name = "endDate") String endDate, @g(name = "pointCost") Integer pointCost, @g(name = "rewardState") Integer rewardState, @g(name = "conditionTypeId") Integer conditionTypeId, @g(name = "imageURL") String imageURL, @g(name = "isClipped") Boolean isClipped, @g(name = "rewardType") Integer rewardType) {
            return new RewardOffers(meijerOfferId, isClippable, title, subTitle, description, termsConditionsDescription, endDate, pointCost, rewardState, conditionTypeId, imageURL, isClipped, rewardType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RewardOffers)) {
                return false;
            }
            RewardOffers rewardOffers = (RewardOffers) other;
            return Intrinsics.e(this.meijerOfferId, rewardOffers.meijerOfferId) && Intrinsics.e(this.isClippable, rewardOffers.isClippable) && Intrinsics.e(this.title, rewardOffers.title) && Intrinsics.e(this.subTitle, rewardOffers.subTitle) && Intrinsics.e(this.description, rewardOffers.description) && Intrinsics.e(this.termsConditionsDescription, rewardOffers.termsConditionsDescription) && Intrinsics.e(this.endDate, rewardOffers.endDate) && Intrinsics.e(this.pointCost, rewardOffers.pointCost) && Intrinsics.e(this.rewardState, rewardOffers.rewardState) && Intrinsics.e(this.conditionTypeId, rewardOffers.conditionTypeId) && Intrinsics.e(this.imageURL, rewardOffers.imageURL) && Intrinsics.e(this.isClipped, rewardOffers.isClipped) && Intrinsics.e(this.rewardType, rewardOffers.rewardType);
        }

        public int hashCode() {
            Integer num = this.meijerOfferId;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Boolean bool = this.isClippable;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.title;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subTitle;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.description;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.termsConditionsDescription;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.endDate;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num2 = this.pointCost;
            int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.rewardState;
            int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.conditionTypeId;
            int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
            String str6 = this.imageURL;
            int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Boolean bool2 = this.isClipped;
            int iHashCode12 = (iHashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Integer num5 = this.rewardType;
            return iHashCode12 + (num5 != null ? num5.hashCode() : 0);
        }

        public String toString() {
            return "RewardOffers(meijerOfferId=" + this.meijerOfferId + ", isClippable=" + this.isClippable + ", title=" + this.title + ", subTitle=" + this.subTitle + ", description=" + this.description + ", termsConditionsDescription=" + this.termsConditionsDescription + ", endDate=" + this.endDate + ", pointCost=" + this.pointCost + ", rewardState=" + this.rewardState + ", conditionTypeId=" + this.conditionTypeId + ", imageURL=" + this.imageURL + ", isClipped=" + this.isClipped + ", rewardType=" + this.rewardType + ')';
        }

        public RewardOffers(@g(name = "meijerOfferId") Integer num, @g(name = "isClippable") Boolean bool, @g(name = "title") String str, @g(name = "subTitle") String str2, @g(name = "description") String str3, @g(name = "termsConditionsDescription") String str4, @g(name = "endDate") String str5, @g(name = "pointCost") Integer num2, @g(name = "rewardState") Integer num3, @g(name = "conditionTypeId") Integer num4, @g(name = "imageURL") String str6, @g(name = "isClipped") Boolean bool2, @g(name = "rewardType") Integer num5) {
            this.meijerOfferId = num;
            this.isClippable = bool;
            this.title = str;
            this.subTitle = str2;
            this.description = str3;
            this.termsConditionsDescription = str4;
            this.endDate = str5;
            this.pointCost = num2;
            this.rewardState = num3;
            this.conditionTypeId = num4;
            this.imageURL = str6;
            this.isClipped = bool2;
            this.rewardType = num5;
        }

        public final Integer getConditionTypeId() {
            return this.conditionTypeId;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getEndDate() {
            return this.endDate;
        }

        public final String getImageURL() {
            return this.imageURL;
        }

        public final Integer getMeijerOfferId() {
            return this.meijerOfferId;
        }

        public final Integer getPointCost() {
            return this.pointCost;
        }

        public final Integer getRewardState() {
            return this.rewardState;
        }

        public final Integer getRewardType() {
            return this.rewardType;
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

        public final Boolean isClippable() {
            return this.isClippable;
        }

        public final Boolean isClipped() {
            return this.isClipped;
        }

        public final void setClippable(Boolean bool) {
            this.isClippable = bool;
        }

        public final void setClipped(Boolean bool) {
            this.isClipped = bool;
        }

        public final void setConditionTypeId(Integer num) {
            this.conditionTypeId = num;
        }

        public final void setDescription(String str) {
            this.description = str;
        }

        public final void setEndDate(String str) {
            this.endDate = str;
        }

        public final void setImageURL(String str) {
            this.imageURL = str;
        }

        public final void setMeijerOfferId(Integer num) {
            this.meijerOfferId = num;
        }

        public final void setPointCost(Integer num) {
            this.pointCost = num;
        }

        public final void setRewardState(Integer num) {
            this.rewardState = num;
        }

        public final void setRewardType(Integer num) {
            this.rewardType = num;
        }

        public final void setSubTitle(String str) {
            this.subTitle = str;
        }

        public final void setTermsConditionsDescription(String str) {
            this.termsConditionsDescription = str;
        }

        public final void setTitle(String str) {
            this.title = str;
        }

        public /* synthetic */ RewardOffers(Integer num, Boolean bool, String str, String str2, String str3, String str4, String str5, Integer num2, Integer num3, Integer num4, String str6, Boolean bool2, Integer num5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : bool, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : str5, (i10 & 128) != 0 ? null : num2, (i10 & 256) != 0 ? null : num3, (i10 & 512) != 0 ? null : num4, (i10 & 1024) != 0 ? null : str6, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? null : bool2, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : num5);
        }
    }

    public MperksCreditCardInfoResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ MperksCreditCardInfoResponse copy$default(MperksCreditCardInfoResponse mperksCreditCardInfoResponse, Integer num, Integer num2, List list, List list2, List list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = mperksCreditCardInfoResponse.enrollmentStatus;
        }
        if ((i10 & 2) != 0) {
            num2 = mperksCreditCardInfoResponse.dollarProgress;
        }
        if ((i10 & 4) != 0) {
            list = mperksCreditCardInfoResponse.rewardOffers;
        }
        if ((i10 & 8) != 0) {
            list2 = mperksCreditCardInfoResponse.legacyGroceryOffers;
        }
        if ((i10 & 16) != 0) {
            list3 = mperksCreditCardInfoResponse.legacyGeneralOffers;
        }
        List list4 = list3;
        List list5 = list;
        return mperksCreditCardInfoResponse.copy(num, num2, list5, list2, list4);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getEnrollmentStatus() {
        return this.enrollmentStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getDollarProgress() {
        return this.dollarProgress;
    }

    public final List<RewardOffers> component3() {
        return this.rewardOffers;
    }

    public final List<LegacyGroceryOffers> component4() {
        return this.legacyGroceryOffers;
    }

    public final List<LegacyGeneralOffers> component5() {
        return this.legacyGeneralOffers;
    }

    public final MperksCreditCardInfoResponse copy(@g(name = "enrollmentStatus") Integer enrollmentStatus, @g(name = "dollarProgress") Integer dollarProgress, @g(name = "rewardOffers") List<RewardOffers> rewardOffers, @g(name = "legacyGroceryOffers") List<LegacyGroceryOffers> legacyGroceryOffers, @g(name = "legacyGeneralOffers") List<LegacyGeneralOffers> legacyGeneralOffers) {
        Intrinsics.j(rewardOffers, "rewardOffers");
        Intrinsics.j(legacyGroceryOffers, "legacyGroceryOffers");
        Intrinsics.j(legacyGeneralOffers, "legacyGeneralOffers");
        return new MperksCreditCardInfoResponse(enrollmentStatus, dollarProgress, rewardOffers, legacyGroceryOffers, legacyGeneralOffers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MperksCreditCardInfoResponse)) {
            return false;
        }
        MperksCreditCardInfoResponse mperksCreditCardInfoResponse = (MperksCreditCardInfoResponse) other;
        return Intrinsics.e(this.enrollmentStatus, mperksCreditCardInfoResponse.enrollmentStatus) && Intrinsics.e(this.dollarProgress, mperksCreditCardInfoResponse.dollarProgress) && Intrinsics.e(this.rewardOffers, mperksCreditCardInfoResponse.rewardOffers) && Intrinsics.e(this.legacyGroceryOffers, mperksCreditCardInfoResponse.legacyGroceryOffers) && Intrinsics.e(this.legacyGeneralOffers, mperksCreditCardInfoResponse.legacyGeneralOffers);
    }

    public int hashCode() {
        Integer num = this.enrollmentStatus;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.dollarProgress;
        return ((((((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31) + this.rewardOffers.hashCode()) * 31) + this.legacyGroceryOffers.hashCode()) * 31) + this.legacyGeneralOffers.hashCode();
    }

    public String toString() {
        return "MperksCreditCardInfoResponse(enrollmentStatus=" + this.enrollmentStatus + ", dollarProgress=" + this.dollarProgress + ", rewardOffers=" + this.rewardOffers + ", legacyGroceryOffers=" + this.legacyGroceryOffers + ", legacyGeneralOffers=" + this.legacyGeneralOffers + ')';
    }

    public MperksCreditCardInfoResponse(@g(name = "enrollmentStatus") Integer num, @g(name = "dollarProgress") Integer num2, @g(name = "rewardOffers") List<RewardOffers> rewardOffers, @g(name = "legacyGroceryOffers") List<LegacyGroceryOffers> legacyGroceryOffers, @g(name = "legacyGeneralOffers") List<LegacyGeneralOffers> legacyGeneralOffers) {
        Intrinsics.j(rewardOffers, "rewardOffers");
        Intrinsics.j(legacyGroceryOffers, "legacyGroceryOffers");
        Intrinsics.j(legacyGeneralOffers, "legacyGeneralOffers");
        this.enrollmentStatus = num;
        this.dollarProgress = num2;
        this.rewardOffers = rewardOffers;
        this.legacyGroceryOffers = legacyGroceryOffers;
        this.legacyGeneralOffers = legacyGeneralOffers;
    }

    public final Integer getDollarProgress() {
        return this.dollarProgress;
    }

    public final Integer getEnrollmentStatus() {
        return this.enrollmentStatus;
    }

    public final List<LegacyGeneralOffers> getLegacyGeneralOffers() {
        return this.legacyGeneralOffers;
    }

    public final List<LegacyGroceryOffers> getLegacyGroceryOffers() {
        return this.legacyGroceryOffers;
    }

    public final List<RewardOffers> getRewardOffers() {
        return this.rewardOffers;
    }

    public final void setDollarProgress(Integer num) {
        this.dollarProgress = num;
    }

    public final void setEnrollmentStatus(Integer num) {
        this.enrollmentStatus = num;
    }

    public final void setLegacyGeneralOffers(List<LegacyGeneralOffers> list) {
        Intrinsics.j(list, "<set-?>");
        this.legacyGeneralOffers = list;
    }

    public final void setLegacyGroceryOffers(List<LegacyGroceryOffers> list) {
        Intrinsics.j(list, "<set-?>");
        this.legacyGroceryOffers = list;
    }

    public final void setRewardOffers(List<RewardOffers> list) {
        Intrinsics.j(list, "<set-?>");
        this.rewardOffers = list;
    }

    public /* synthetic */ MperksCreditCardInfoResponse(Integer num, Integer num2, List list, List list2, List list3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? CollectionsKt.m() : list, (i10 & 8) != 0 ? CollectionsKt.m() : list2, (i10 & 16) != 0 ? CollectionsKt.m() : list3);
    }
}
