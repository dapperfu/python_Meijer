package com.meijer.mobile.mperks.networking.domain.models;

import androidx.recyclerview.widget.RecyclerView;
import bo.EarnReward;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import el.C13684a;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import vk.C17590a;
import vk.d;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\bQ\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BÙ\u0001\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\f\u001a\u00020\u0002\u0012\b\b\u0001\u0010\r\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010!J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001fJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b-\u0010,J\u0012\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b.\u0010,J\u0010\u0010/\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010\u001fJ\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010\u001fJ\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010\u001fJ\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010\u001fJ\u0010\u00105\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b5\u00100Jâ\u0001\u00106\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\u00022\b\b\u0003\u0010\r\u001a\u00020\u00042\b\b\u0003\u0010\u000e\u001a\u00020\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0013\u001a\u00020\u00122\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0018\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b8\u0010\u001fJ\u0010\u00109\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b9\u0010!J\u001a\u0010;\u001a\u00020\u00122\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b;\u0010<R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010\u001f\"\u0004\b?\u0010@R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010!\"\u0004\bC\u0010DR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010=\u001a\u0004\bE\u0010\u001f\"\u0004\bF\u0010@R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010=\u001a\u0004\bG\u0010\u001f\"\u0004\bH\u0010@R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010=\u001a\u0004\bI\u0010\u001f\"\u0004\bJ\u0010@R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010=\u001a\u0004\bK\u0010\u001f\"\u0004\bL\u0010@R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010M\u001a\u0004\bN\u0010'\"\u0004\bO\u0010PR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010=\u001a\u0004\bQ\u0010\u001f\"\u0004\bR\u0010@R\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010A\u001a\u0004\bS\u0010!\"\u0004\bT\u0010DR\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010=\u001a\u0004\bU\u0010\u001f\"\u0004\bV\u0010@R$\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010W\u001a\u0004\bX\u0010,\"\u0004\bY\u0010ZR$\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010W\u001a\u0004\b[\u0010,\"\u0004\b\\\u0010ZR$\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010W\u001a\u0004\b]\u0010,\"\u0004\b^\u0010ZR\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010_\u001a\u0004\b`\u00100\"\u0004\ba\u0010bR$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010=\u001a\u0004\bc\u0010\u001f\"\u0004\bd\u0010@R$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010=\u001a\u0004\be\u0010\u001f\"\u0004\bf\u0010@R$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010=\u001a\u0004\bg\u0010\u001f\"\u0004\bh\u0010@R$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010=\u001a\u0004\bi\u0010\u001f\"\u0004\bj\u0010@R\"\u0010\u0018\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010_\u001a\u0004\bk\u00100\"\u0004\bl\u0010bR\u0011\u0010p\u001a\u00020m8F¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0011\u0010r\u001a\u00020m8F¢\u0006\u0006\u001a\u0004\bq\u0010o¨\u0006s"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/MperksAvailableReward;", "", "", "documentType", "", "rewardId", "rewardProgram", "productCategory", "startAtString", "endAtString", "Lcom/meijer/mobile/mperks/networking/domain/models/RewardDetails;", "rewardDetails", "earnKind", "earnRequirement", "earnMetric", "maxDaysToEarn", "maxDaysToRedeem", "maxEarnCount", "", "allowCarryOver", "title", "description", "imageUrl", "terms", "hasUpcs", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/mperks/networking/domain/models/RewardDetails;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Lbo/f;", "toEarnReward", "()Lbo/f;", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "component6", "component7", "()Lcom/meijer/mobile/mperks/networking/domain/models/RewardDetails;", "component8", "component9", "component10", "component11", "()Ljava/lang/Integer;", "component12", "component13", "component14", "()Z", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/mperks/networking/domain/models/RewardDetails;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/meijer/mobile/mperks/networking/domain/models/MperksAvailableReward;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDocumentType", "setDocumentType", "(Ljava/lang/String;)V", "I", "getRewardId", "setRewardId", "(I)V", "getRewardProgram", "setRewardProgram", "getProductCategory", "setProductCategory", "getStartAtString", "setStartAtString", "getEndAtString", "setEndAtString", "Lcom/meijer/mobile/mperks/networking/domain/models/RewardDetails;", "getRewardDetails", "setRewardDetails", "(Lcom/meijer/mobile/mperks/networking/domain/models/RewardDetails;)V", "getEarnKind", "setEarnKind", "getEarnRequirement", "setEarnRequirement", "getEarnMetric", "setEarnMetric", "Ljava/lang/Integer;", "getMaxDaysToEarn", "setMaxDaysToEarn", "(Ljava/lang/Integer;)V", "getMaxDaysToRedeem", "setMaxDaysToRedeem", "getMaxEarnCount", "setMaxEarnCount", "Z", "getAllowCarryOver", "setAllowCarryOver", "(Z)V", "getTitle", "setTitle", "getDescription", "setDescription", "getImageUrl", "setImageUrl", "getTerms", "setTerms", "getHasUpcs", "setHasUpcs", "j$/time/ZonedDateTime", "getStartAt", "()Lj$/time/ZonedDateTime;", "startAt", "getEndAt", "endAt", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class MperksAvailableReward {
    private boolean allowCarryOver;
    private String description;
    private String documentType;
    private String earnKind;
    private String earnMetric;
    private int earnRequirement;
    private String endAtString;
    private boolean hasUpcs;
    private String imageUrl;
    private Integer maxDaysToEarn;
    private Integer maxDaysToRedeem;
    private Integer maxEarnCount;
    private String productCategory;
    private RewardDetails rewardDetails;
    private int rewardId;
    private String rewardProgram;
    private String startAtString;
    private String terms;
    private String title;

    public MperksAvailableReward(@g(name = "documentType") String str, @g(name = "rewardId") int i10, @g(name = "rewardProgram") String str2, @g(name = "productCategory") String str3, @g(name = "startAt") String startAtString, @g(name = "endAt") String endAtString, @g(name = "rewardDetails") RewardDetails rewardDetails, @g(name = "earnKind") String earnKind, @g(name = "earnRequirement") int i11, @g(name = "earnMetric") String earnMetric, @g(name = "maxDaysToEarn") Integer num, @g(name = "maxDaysToRedeem") Integer num2, @g(name = "maxEarnCount") Integer num3, @g(name = "allowCarryOver") boolean z10, @g(name = "title") String str4, @g(name = "description") String str5, @g(name = "imageUrl") String str6, @g(name = "terms") String str7, @g(name = "hasUpcs") boolean z11) {
        Intrinsics.j(startAtString, "startAtString");
        Intrinsics.j(endAtString, "endAtString");
        Intrinsics.j(rewardDetails, "rewardDetails");
        Intrinsics.j(earnKind, "earnKind");
        Intrinsics.j(earnMetric, "earnMetric");
        this.documentType = str;
        this.rewardId = i10;
        this.rewardProgram = str2;
        this.productCategory = str3;
        this.startAtString = startAtString;
        this.endAtString = endAtString;
        this.rewardDetails = rewardDetails;
        this.earnKind = earnKind;
        this.earnRequirement = i11;
        this.earnMetric = earnMetric;
        this.maxDaysToEarn = num;
        this.maxDaysToRedeem = num2;
        this.maxEarnCount = num3;
        this.allowCarryOver = z10;
        this.title = str4;
        this.description = str5;
        this.imageUrl = str6;
        this.terms = str7;
        this.hasUpcs = z11;
    }

    public static /* synthetic */ MperksAvailableReward copy$default(MperksAvailableReward mperksAvailableReward, String str, int i10, String str2, String str3, String str4, String str5, RewardDetails rewardDetails, String str6, int i11, String str7, Integer num, Integer num2, Integer num3, boolean z10, String str8, String str9, String str10, String str11, boolean z11, int i12, Object obj) {
        boolean z12;
        String str12;
        String str13 = (i12 & 1) != 0 ? mperksAvailableReward.documentType : str;
        int i13 = (i12 & 2) != 0 ? mperksAvailableReward.rewardId : i10;
        String str14 = (i12 & 4) != 0 ? mperksAvailableReward.rewardProgram : str2;
        String str15 = (i12 & 8) != 0 ? mperksAvailableReward.productCategory : str3;
        String str16 = (i12 & 16) != 0 ? mperksAvailableReward.startAtString : str4;
        String str17 = (i12 & 32) != 0 ? mperksAvailableReward.endAtString : str5;
        RewardDetails rewardDetails2 = (i12 & 64) != 0 ? mperksAvailableReward.rewardDetails : rewardDetails;
        String str18 = (i12 & 128) != 0 ? mperksAvailableReward.earnKind : str6;
        int i14 = (i12 & 256) != 0 ? mperksAvailableReward.earnRequirement : i11;
        String str19 = (i12 & 512) != 0 ? mperksAvailableReward.earnMetric : str7;
        Integer num4 = (i12 & 1024) != 0 ? mperksAvailableReward.maxDaysToEarn : num;
        Integer num5 = (i12 & RecyclerView.m.FLAG_MOVED) != 0 ? mperksAvailableReward.maxDaysToRedeem : num2;
        Integer num6 = (i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? mperksAvailableReward.maxEarnCount : num3;
        boolean z13 = (i12 & 8192) != 0 ? mperksAvailableReward.allowCarryOver : z10;
        String str20 = str13;
        String str21 = (i12 & 16384) != 0 ? mperksAvailableReward.title : str8;
        String str22 = (i12 & 32768) != 0 ? mperksAvailableReward.description : str9;
        String str23 = (i12 & 65536) != 0 ? mperksAvailableReward.imageUrl : str10;
        String str24 = (i12 & 131072) != 0 ? mperksAvailableReward.terms : str11;
        if ((i12 & 262144) != 0) {
            str12 = str24;
            z12 = mperksAvailableReward.hasUpcs;
        } else {
            z12 = z11;
            str12 = str24;
        }
        return mperksAvailableReward.copy(str20, i13, str14, str15, str16, str17, rewardDetails2, str18, i14, str19, num4, num5, num6, z13, str21, str22, str23, str12, z12);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    /* renamed from: component10, reason: from getter */
    public final String getEarnMetric() {
        return this.earnMetric;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getMaxDaysToEarn() {
        return this.maxDaysToEarn;
    }

    /* renamed from: component12, reason: from getter */
    public final Integer getMaxDaysToRedeem() {
        return this.maxDaysToRedeem;
    }

    /* renamed from: component13, reason: from getter */
    public final Integer getMaxEarnCount() {
        return this.maxEarnCount;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getAllowCarryOver() {
        return this.allowCarryOver;
    }

    /* renamed from: component15, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component16, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component17, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component18, reason: from getter */
    public final String getTerms() {
        return this.terms;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getHasUpcs() {
        return this.hasUpcs;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRewardId() {
        return this.rewardId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRewardProgram() {
        return this.rewardProgram;
    }

    /* renamed from: component4, reason: from getter */
    public final String getProductCategory() {
        return this.productCategory;
    }

    /* renamed from: component5, reason: from getter */
    public final String getStartAtString() {
        return this.startAtString;
    }

    /* renamed from: component6, reason: from getter */
    public final String getEndAtString() {
        return this.endAtString;
    }

    /* renamed from: component7, reason: from getter */
    public final RewardDetails getRewardDetails() {
        return this.rewardDetails;
    }

    /* renamed from: component8, reason: from getter */
    public final String getEarnKind() {
        return this.earnKind;
    }

    /* renamed from: component9, reason: from getter */
    public final int getEarnRequirement() {
        return this.earnRequirement;
    }

    public final MperksAvailableReward copy(@g(name = "documentType") String documentType, @g(name = "rewardId") int rewardId, @g(name = "rewardProgram") String rewardProgram, @g(name = "productCategory") String productCategory, @g(name = "startAt") String startAtString, @g(name = "endAt") String endAtString, @g(name = "rewardDetails") RewardDetails rewardDetails, @g(name = "earnKind") String earnKind, @g(name = "earnRequirement") int earnRequirement, @g(name = "earnMetric") String earnMetric, @g(name = "maxDaysToEarn") Integer maxDaysToEarn, @g(name = "maxDaysToRedeem") Integer maxDaysToRedeem, @g(name = "maxEarnCount") Integer maxEarnCount, @g(name = "allowCarryOver") boolean allowCarryOver, @g(name = "title") String title, @g(name = "description") String description, @g(name = "imageUrl") String imageUrl, @g(name = "terms") String terms, @g(name = "hasUpcs") boolean hasUpcs) {
        Intrinsics.j(startAtString, "startAtString");
        Intrinsics.j(endAtString, "endAtString");
        Intrinsics.j(rewardDetails, "rewardDetails");
        Intrinsics.j(earnKind, "earnKind");
        Intrinsics.j(earnMetric, "earnMetric");
        return new MperksAvailableReward(documentType, rewardId, rewardProgram, productCategory, startAtString, endAtString, rewardDetails, earnKind, earnRequirement, earnMetric, maxDaysToEarn, maxDaysToRedeem, maxEarnCount, allowCarryOver, title, description, imageUrl, terms, hasUpcs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MperksAvailableReward)) {
            return false;
        }
        MperksAvailableReward mperksAvailableReward = (MperksAvailableReward) other;
        return Intrinsics.e(this.documentType, mperksAvailableReward.documentType) && this.rewardId == mperksAvailableReward.rewardId && Intrinsics.e(this.rewardProgram, mperksAvailableReward.rewardProgram) && Intrinsics.e(this.productCategory, mperksAvailableReward.productCategory) && Intrinsics.e(this.startAtString, mperksAvailableReward.startAtString) && Intrinsics.e(this.endAtString, mperksAvailableReward.endAtString) && Intrinsics.e(this.rewardDetails, mperksAvailableReward.rewardDetails) && Intrinsics.e(this.earnKind, mperksAvailableReward.earnKind) && this.earnRequirement == mperksAvailableReward.earnRequirement && Intrinsics.e(this.earnMetric, mperksAvailableReward.earnMetric) && Intrinsics.e(this.maxDaysToEarn, mperksAvailableReward.maxDaysToEarn) && Intrinsics.e(this.maxDaysToRedeem, mperksAvailableReward.maxDaysToRedeem) && Intrinsics.e(this.maxEarnCount, mperksAvailableReward.maxEarnCount) && this.allowCarryOver == mperksAvailableReward.allowCarryOver && Intrinsics.e(this.title, mperksAvailableReward.title) && Intrinsics.e(this.description, mperksAvailableReward.description) && Intrinsics.e(this.imageUrl, mperksAvailableReward.imageUrl) && Intrinsics.e(this.terms, mperksAvailableReward.terms) && this.hasUpcs == mperksAvailableReward.hasUpcs;
    }

    public int hashCode() {
        String str = this.documentType;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.rewardId)) * 31;
        String str2 = this.rewardProgram;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productCategory;
        int iHashCode3 = (((((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.startAtString.hashCode()) * 31) + this.endAtString.hashCode()) * 31) + this.rewardDetails.hashCode()) * 31) + this.earnKind.hashCode()) * 31) + Integer.hashCode(this.earnRequirement)) * 31) + this.earnMetric.hashCode()) * 31;
        Integer num = this.maxDaysToEarn;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxDaysToRedeem;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.maxEarnCount;
        int iHashCode6 = (((iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31) + Boolean.hashCode(this.allowCarryOver)) * 31;
        String str4 = this.title;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.description;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.imageUrl;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.terms;
        return ((iHashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasUpcs);
    }

    public String toString() {
        return "MperksAvailableReward(documentType=" + this.documentType + ", rewardId=" + this.rewardId + ", rewardProgram=" + this.rewardProgram + ", productCategory=" + this.productCategory + ", startAtString=" + this.startAtString + ", endAtString=" + this.endAtString + ", rewardDetails=" + this.rewardDetails + ", earnKind=" + this.earnKind + ", earnRequirement=" + this.earnRequirement + ", earnMetric=" + this.earnMetric + ", maxDaysToEarn=" + this.maxDaysToEarn + ", maxDaysToRedeem=" + this.maxDaysToRedeem + ", maxEarnCount=" + this.maxEarnCount + ", allowCarryOver=" + this.allowCarryOver + ", title=" + this.title + ", description=" + this.description + ", imageUrl=" + this.imageUrl + ", terms=" + this.terms + ", hasUpcs=" + this.hasUpcs + ')';
    }

    public final boolean getAllowCarryOver() {
        return this.allowCarryOver;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDocumentType() {
        return this.documentType;
    }

    public final String getEarnKind() {
        return this.earnKind;
    }

    public final String getEarnMetric() {
        return this.earnMetric;
    }

    public final int getEarnRequirement() {
        return this.earnRequirement;
    }

    public final ZonedDateTime getEndAt() {
        ZonedDateTime zonedDateTimeAtZone = ((Instant) d.a(this.endAtString, C17590a.f164803a.t(), new C13684a())).atZone(ZoneId.systemDefault());
        Intrinsics.i(zonedDateTimeAtZone, "atZone(...)");
        return zonedDateTimeAtZone;
    }

    public final String getEndAtString() {
        return this.endAtString;
    }

    public final boolean getHasUpcs() {
        return this.hasUpcs;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final Integer getMaxDaysToEarn() {
        return this.maxDaysToEarn;
    }

    public final Integer getMaxDaysToRedeem() {
        return this.maxDaysToRedeem;
    }

    public final Integer getMaxEarnCount() {
        return this.maxEarnCount;
    }

    public final String getProductCategory() {
        return this.productCategory;
    }

    public final RewardDetails getRewardDetails() {
        return this.rewardDetails;
    }

    public final int getRewardId() {
        return this.rewardId;
    }

    public final String getRewardProgram() {
        return this.rewardProgram;
    }

    public final ZonedDateTime getStartAt() {
        ZonedDateTime zonedDateTimeAtZone = ((Instant) d.a(this.startAtString, C17590a.f164803a.t(), new C13684a())).atZone(ZoneId.systemDefault());
        Intrinsics.i(zonedDateTimeAtZone, "atZone(...)");
        return zonedDateTimeAtZone;
    }

    public final String getStartAtString() {
        return this.startAtString;
    }

    public final String getTerms() {
        return this.terms;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setAllowCarryOver(boolean z10) {
        this.allowCarryOver = z10;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setDocumentType(String str) {
        this.documentType = str;
    }

    public final void setEarnKind(String str) {
        Intrinsics.j(str, "<set-?>");
        this.earnKind = str;
    }

    public final void setEarnMetric(String str) {
        Intrinsics.j(str, "<set-?>");
        this.earnMetric = str;
    }

    public final void setEarnRequirement(int i10) {
        this.earnRequirement = i10;
    }

    public final void setEndAtString(String str) {
        Intrinsics.j(str, "<set-?>");
        this.endAtString = str;
    }

    public final void setHasUpcs(boolean z10) {
        this.hasUpcs = z10;
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public final void setMaxDaysToEarn(Integer num) {
        this.maxDaysToEarn = num;
    }

    public final void setMaxDaysToRedeem(Integer num) {
        this.maxDaysToRedeem = num;
    }

    public final void setMaxEarnCount(Integer num) {
        this.maxEarnCount = num;
    }

    public final void setProductCategory(String str) {
        this.productCategory = str;
    }

    public final void setRewardDetails(RewardDetails rewardDetails) {
        Intrinsics.j(rewardDetails, "<set-?>");
        this.rewardDetails = rewardDetails;
    }

    public final void setRewardId(int i10) {
        this.rewardId = i10;
    }

    public final void setRewardProgram(String str) {
        this.rewardProgram = str;
    }

    public final void setStartAtString(String str) {
        Intrinsics.j(str, "<set-?>");
        this.startAtString = str;
    }

    public final void setTerms(String str) {
        this.terms = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final EarnReward toEarnReward() {
        return new EarnReward(Integer.valueOf(this.rewardId), this.rewardProgram, this.imageUrl, this.title, this.description, getStartAt(), getEndAt(), this.terms, this.productCategory, this.earnKind, this.earnRequirement, 0.0d, this.earnMetric, this.maxDaysToEarn, this.maxDaysToRedeem, this.maxEarnCount, this.allowCarryOver, this.hasUpcs, RecyclerView.m.FLAG_MOVED, null);
    }

    public /* synthetic */ MperksAvailableReward(String str, int i10, String str2, String str3, String str4, String str5, RewardDetails rewardDetails, String str6, int i11, String str7, Integer num, Integer num2, Integer num3, boolean z10, String str8, String str9, String str10, String str11, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : str, i10, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, str4, str5, rewardDetails, str6, i11, str7, (i12 & 1024) != 0 ? null : num, (i12 & RecyclerView.m.FLAG_MOVED) != 0 ? null : num2, (i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : num3, z10, (i12 & 16384) != 0 ? null : str8, (32768 & i12) != 0 ? null : str9, (65536 & i12) != 0 ? null : str10, (i12 & 131072) != 0 ? null : str11, z11);
    }
}
