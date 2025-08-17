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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\bU\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001Bé\u0001\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u000f\u001a\u00020\r\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010!J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010!J\u0010\u0010(\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010!J\u0010\u0010+\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b-\u0010,J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010!J\u0012\u0010/\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b/\u0010#J\u0012\u00100\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b0\u0010#J\u0012\u00101\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b1\u0010#J\u0010\u00102\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010!J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010!J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010!J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010!J\u0010\u00108\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b8\u00103Jò\u0001\u00109\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u000f\u001a\u00020\r2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0015\u001a\u00020\u00142\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u001a\u001a\u00020\u0014HÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b;\u0010!J\u0010\u0010<\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b<\u0010=J\u001a\u0010?\u001a\u00020\u00142\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b?\u0010@R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010!\"\u0004\bC\u0010DR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010E\u001a\u0004\bF\u0010#\"\u0004\bG\u0010HR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010A\u001a\u0004\bI\u0010!\"\u0004\bJ\u0010DR$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010A\u001a\u0004\bK\u0010!\"\u0004\bL\u0010DR\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010A\u001a\u0004\bM\u0010!\"\u0004\bN\u0010DR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010A\u001a\u0004\bO\u0010!\"\u0004\bP\u0010DR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010Q\u001a\u0004\bR\u0010)\"\u0004\bS\u0010TR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010A\u001a\u0004\bU\u0010!\"\u0004\bV\u0010DR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010W\u001a\u0004\bX\u0010,\"\u0004\bY\u0010ZR\"\u0010\u000f\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010W\u001a\u0004\b[\u0010,\"\u0004\b\\\u0010ZR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010A\u001a\u0004\b]\u0010!\"\u0004\b^\u0010DR$\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010E\u001a\u0004\b_\u0010#\"\u0004\b`\u0010HR$\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010E\u001a\u0004\ba\u0010#\"\u0004\bb\u0010HR$\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010E\u001a\u0004\bc\u0010#\"\u0004\bd\u0010HR\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010e\u001a\u0004\bf\u00103\"\u0004\bg\u0010hR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010A\u001a\u0004\bi\u0010!\"\u0004\bj\u0010DR$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010A\u001a\u0004\bk\u0010!\"\u0004\bl\u0010DR$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010A\u001a\u0004\bm\u0010!\"\u0004\bn\u0010DR$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010A\u001a\u0004\bo\u0010!\"\u0004\bp\u0010DR\"\u0010\u001a\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010e\u001a\u0004\bq\u00103\"\u0004\br\u0010hR\u0013\u0010v\u001a\u0004\u0018\u00010s8F¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0013\u0010x\u001a\u0004\u0018\u00010s8F¢\u0006\u0006\u001a\u0004\bw\u0010u¨\u0006y"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/MperksInProgressReward;", "", "", "documentType", "", "rewardId", "rewardProgram", "productCategory", "startAtString", "endAtString", "Lcom/meijer/mobile/mperks/networking/domain/models/InProgressRewardDetails;", "rewardDetails", "earnKind", "", "earnRequirement", "progress", "earnMetric", "maxDaysToEarn", "maxDaysToRedeem", "maxEarnCount", "", "allowCarryOver", "title", "description", "imageUrl", "terms", "hasUpcs", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/mperks/networking/domain/models/InProgressRewardDetails;Ljava/lang/String;DDLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Lbo/f;", "toEarnReward", "()Lbo/f;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "component7", "()Lcom/meijer/mobile/mperks/networking/domain/models/InProgressRewardDetails;", "component8", "component9", "()D", "component10", "component11", "component12", "component13", "component14", "component15", "()Z", "component16", "component17", "component18", "component19", "component20", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/mperks/networking/domain/models/InProgressRewardDetails;Ljava/lang/String;DDLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/meijer/mobile/mperks/networking/domain/models/MperksInProgressReward;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDocumentType", "setDocumentType", "(Ljava/lang/String;)V", "Ljava/lang/Integer;", "getRewardId", "setRewardId", "(Ljava/lang/Integer;)V", "getRewardProgram", "setRewardProgram", "getProductCategory", "setProductCategory", "getStartAtString", "setStartAtString", "getEndAtString", "setEndAtString", "Lcom/meijer/mobile/mperks/networking/domain/models/InProgressRewardDetails;", "getRewardDetails", "setRewardDetails", "(Lcom/meijer/mobile/mperks/networking/domain/models/InProgressRewardDetails;)V", "getEarnKind", "setEarnKind", "D", "getEarnRequirement", "setEarnRequirement", "(D)V", "getProgress", "setProgress", "getEarnMetric", "setEarnMetric", "getMaxDaysToEarn", "setMaxDaysToEarn", "getMaxDaysToRedeem", "setMaxDaysToRedeem", "getMaxEarnCount", "setMaxEarnCount", "Z", "getAllowCarryOver", "setAllowCarryOver", "(Z)V", "getTitle", "setTitle", "getDescription", "setDescription", "getImageUrl", "setImageUrl", "getTerms", "setTerms", "getHasUpcs", "setHasUpcs", "j$/time/ZonedDateTime", "getStartAt", "()Lj$/time/ZonedDateTime;", "startAt", "getEndAt", "endAt", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class MperksInProgressReward {
    private boolean allowCarryOver;
    private String description;
    private String documentType;
    private String earnKind;
    private String earnMetric;
    private double earnRequirement;
    private String endAtString;
    private boolean hasUpcs;
    private String imageUrl;
    private Integer maxDaysToEarn;
    private Integer maxDaysToRedeem;
    private Integer maxEarnCount;
    private String productCategory;
    private double progress;
    private InProgressRewardDetails rewardDetails;
    private Integer rewardId;
    private String rewardProgram;
    private String startAtString;
    private String terms;
    private String title;

    public MperksInProgressReward(@g(name = "documentType") String str, @g(name = "rewardId") Integer num, @g(name = "rewardProgram") String str2, @g(name = "productCategory") String str3, @g(name = "startAt") String startAtString, @g(name = "endAt") String endAtString, @g(name = "rewardDetails") InProgressRewardDetails rewardDetails, @g(name = "earnKind") String str4, @g(name = "earnRequirement") double d10, @g(name = "progress") double d11, @g(name = "earnMetric") String str5, @g(name = "maxDaysToEarn") Integer num2, @g(name = "maxDaysToRedeem") Integer num3, @g(name = "maxEarnCount") Integer num4, @g(name = "allowCarryOver") boolean z10, @g(name = "title") String str6, @g(name = "description") String str7, @g(name = "imageUrl") String str8, @g(name = "terms") String str9, @g(name = "hasUpcs") boolean z11) {
        Intrinsics.j(startAtString, "startAtString");
        Intrinsics.j(endAtString, "endAtString");
        Intrinsics.j(rewardDetails, "rewardDetails");
        this.documentType = str;
        this.rewardId = num;
        this.rewardProgram = str2;
        this.productCategory = str3;
        this.startAtString = startAtString;
        this.endAtString = endAtString;
        this.rewardDetails = rewardDetails;
        this.earnKind = str4;
        this.earnRequirement = d10;
        this.progress = d11;
        this.earnMetric = str5;
        this.maxDaysToEarn = num2;
        this.maxDaysToRedeem = num3;
        this.maxEarnCount = num4;
        this.allowCarryOver = z10;
        this.title = str6;
        this.description = str7;
        this.imageUrl = str8;
        this.terms = str9;
        this.hasUpcs = z11;
    }

    public static /* synthetic */ MperksInProgressReward copy$default(MperksInProgressReward mperksInProgressReward, String str, Integer num, String str2, String str3, String str4, String str5, InProgressRewardDetails inProgressRewardDetails, String str6, double d10, double d11, String str7, Integer num2, Integer num3, Integer num4, boolean z10, String str8, String str9, String str10, String str11, boolean z11, int i10, Object obj) {
        boolean z12;
        String str12;
        String str13 = (i10 & 1) != 0 ? mperksInProgressReward.documentType : str;
        Integer num5 = (i10 & 2) != 0 ? mperksInProgressReward.rewardId : num;
        String str14 = (i10 & 4) != 0 ? mperksInProgressReward.rewardProgram : str2;
        String str15 = (i10 & 8) != 0 ? mperksInProgressReward.productCategory : str3;
        String str16 = (i10 & 16) != 0 ? mperksInProgressReward.startAtString : str4;
        String str17 = (i10 & 32) != 0 ? mperksInProgressReward.endAtString : str5;
        InProgressRewardDetails inProgressRewardDetails2 = (i10 & 64) != 0 ? mperksInProgressReward.rewardDetails : inProgressRewardDetails;
        String str18 = (i10 & 128) != 0 ? mperksInProgressReward.earnKind : str6;
        double d12 = (i10 & 256) != 0 ? mperksInProgressReward.earnRequirement : d10;
        double d13 = (i10 & 512) != 0 ? mperksInProgressReward.progress : d11;
        String str19 = (i10 & 1024) != 0 ? mperksInProgressReward.earnMetric : str7;
        Integer num6 = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? mperksInProgressReward.maxDaysToEarn : num2;
        String str20 = str13;
        Integer num7 = (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? mperksInProgressReward.maxDaysToRedeem : num3;
        Integer num8 = (i10 & 8192) != 0 ? mperksInProgressReward.maxEarnCount : num4;
        boolean z13 = (i10 & 16384) != 0 ? mperksInProgressReward.allowCarryOver : z10;
        String str21 = (i10 & 32768) != 0 ? mperksInProgressReward.title : str8;
        String str22 = (i10 & 65536) != 0 ? mperksInProgressReward.description : str9;
        String str23 = (i10 & 131072) != 0 ? mperksInProgressReward.imageUrl : str10;
        String str24 = (i10 & 262144) != 0 ? mperksInProgressReward.terms : str11;
        if ((i10 & 524288) != 0) {
            str12 = str24;
            z12 = mperksInProgressReward.hasUpcs;
        } else {
            z12 = z11;
            str12 = str24;
        }
        return mperksInProgressReward.copy(str20, num5, str14, str15, str16, str17, inProgressRewardDetails2, str18, d12, d13, str19, num6, num7, num8, z13, str21, str22, str23, str12, z12);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    /* renamed from: component10, reason: from getter */
    public final double getProgress() {
        return this.progress;
    }

    /* renamed from: component11, reason: from getter */
    public final String getEarnMetric() {
        return this.earnMetric;
    }

    /* renamed from: component12, reason: from getter */
    public final Integer getMaxDaysToEarn() {
        return this.maxDaysToEarn;
    }

    /* renamed from: component13, reason: from getter */
    public final Integer getMaxDaysToRedeem() {
        return this.maxDaysToRedeem;
    }

    /* renamed from: component14, reason: from getter */
    public final Integer getMaxEarnCount() {
        return this.maxEarnCount;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getAllowCarryOver() {
        return this.allowCarryOver;
    }

    /* renamed from: component16, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component17, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component18, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component19, reason: from getter */
    public final String getTerms() {
        return this.terms;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getRewardId() {
        return this.rewardId;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getHasUpcs() {
        return this.hasUpcs;
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
    public final InProgressRewardDetails getRewardDetails() {
        return this.rewardDetails;
    }

    /* renamed from: component8, reason: from getter */
    public final String getEarnKind() {
        return this.earnKind;
    }

    /* renamed from: component9, reason: from getter */
    public final double getEarnRequirement() {
        return this.earnRequirement;
    }

    public final MperksInProgressReward copy(@g(name = "documentType") String documentType, @g(name = "rewardId") Integer rewardId, @g(name = "rewardProgram") String rewardProgram, @g(name = "productCategory") String productCategory, @g(name = "startAt") String startAtString, @g(name = "endAt") String endAtString, @g(name = "rewardDetails") InProgressRewardDetails rewardDetails, @g(name = "earnKind") String earnKind, @g(name = "earnRequirement") double earnRequirement, @g(name = "progress") double progress, @g(name = "earnMetric") String earnMetric, @g(name = "maxDaysToEarn") Integer maxDaysToEarn, @g(name = "maxDaysToRedeem") Integer maxDaysToRedeem, @g(name = "maxEarnCount") Integer maxEarnCount, @g(name = "allowCarryOver") boolean allowCarryOver, @g(name = "title") String title, @g(name = "description") String description, @g(name = "imageUrl") String imageUrl, @g(name = "terms") String terms, @g(name = "hasUpcs") boolean hasUpcs) {
        Intrinsics.j(startAtString, "startAtString");
        Intrinsics.j(endAtString, "endAtString");
        Intrinsics.j(rewardDetails, "rewardDetails");
        return new MperksInProgressReward(documentType, rewardId, rewardProgram, productCategory, startAtString, endAtString, rewardDetails, earnKind, earnRequirement, progress, earnMetric, maxDaysToEarn, maxDaysToRedeem, maxEarnCount, allowCarryOver, title, description, imageUrl, terms, hasUpcs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MperksInProgressReward)) {
            return false;
        }
        MperksInProgressReward mperksInProgressReward = (MperksInProgressReward) other;
        return Intrinsics.e(this.documentType, mperksInProgressReward.documentType) && Intrinsics.e(this.rewardId, mperksInProgressReward.rewardId) && Intrinsics.e(this.rewardProgram, mperksInProgressReward.rewardProgram) && Intrinsics.e(this.productCategory, mperksInProgressReward.productCategory) && Intrinsics.e(this.startAtString, mperksInProgressReward.startAtString) && Intrinsics.e(this.endAtString, mperksInProgressReward.endAtString) && Intrinsics.e(this.rewardDetails, mperksInProgressReward.rewardDetails) && Intrinsics.e(this.earnKind, mperksInProgressReward.earnKind) && Double.compare(this.earnRequirement, mperksInProgressReward.earnRequirement) == 0 && Double.compare(this.progress, mperksInProgressReward.progress) == 0 && Intrinsics.e(this.earnMetric, mperksInProgressReward.earnMetric) && Intrinsics.e(this.maxDaysToEarn, mperksInProgressReward.maxDaysToEarn) && Intrinsics.e(this.maxDaysToRedeem, mperksInProgressReward.maxDaysToRedeem) && Intrinsics.e(this.maxEarnCount, mperksInProgressReward.maxEarnCount) && this.allowCarryOver == mperksInProgressReward.allowCarryOver && Intrinsics.e(this.title, mperksInProgressReward.title) && Intrinsics.e(this.description, mperksInProgressReward.description) && Intrinsics.e(this.imageUrl, mperksInProgressReward.imageUrl) && Intrinsics.e(this.terms, mperksInProgressReward.terms) && this.hasUpcs == mperksInProgressReward.hasUpcs;
    }

    public int hashCode() {
        String str = this.documentType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.rewardId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.rewardProgram;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productCategory;
        int iHashCode4 = (((((((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.startAtString.hashCode()) * 31) + this.endAtString.hashCode()) * 31) + this.rewardDetails.hashCode()) * 31;
        String str4 = this.earnKind;
        int iHashCode5 = (((((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + Double.hashCode(this.earnRequirement)) * 31) + Double.hashCode(this.progress)) * 31;
        String str5 = this.earnMetric;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.maxDaysToEarn;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.maxDaysToRedeem;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.maxEarnCount;
        int iHashCode9 = (((iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31) + Boolean.hashCode(this.allowCarryOver)) * 31;
        String str6 = this.title;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.description;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.imageUrl;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.terms;
        return ((iHashCode12 + (str9 != null ? str9.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasUpcs);
    }

    public String toString() {
        return "MperksInProgressReward(documentType=" + this.documentType + ", rewardId=" + this.rewardId + ", rewardProgram=" + this.rewardProgram + ", productCategory=" + this.productCategory + ", startAtString=" + this.startAtString + ", endAtString=" + this.endAtString + ", rewardDetails=" + this.rewardDetails + ", earnKind=" + this.earnKind + ", earnRequirement=" + this.earnRequirement + ", progress=" + this.progress + ", earnMetric=" + this.earnMetric + ", maxDaysToEarn=" + this.maxDaysToEarn + ", maxDaysToRedeem=" + this.maxDaysToRedeem + ", maxEarnCount=" + this.maxEarnCount + ", allowCarryOver=" + this.allowCarryOver + ", title=" + this.title + ", description=" + this.description + ", imageUrl=" + this.imageUrl + ", terms=" + this.terms + ", hasUpcs=" + this.hasUpcs + ')';
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

    public final double getEarnRequirement() {
        return this.earnRequirement;
    }

    public final ZonedDateTime getEndAt() {
        Instant instant = (Instant) d.a(this.endAtString, C17590a.f164803a.t(), new C13684a());
        if (instant != null) {
            return instant.atZone(ZoneId.systemDefault());
        }
        return null;
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

    public final double getProgress() {
        return this.progress;
    }

    public final InProgressRewardDetails getRewardDetails() {
        return this.rewardDetails;
    }

    public final Integer getRewardId() {
        return this.rewardId;
    }

    public final String getRewardProgram() {
        return this.rewardProgram;
    }

    public final ZonedDateTime getStartAt() {
        Instant instant = (Instant) d.a(this.startAtString, C17590a.f164803a.t(), new C13684a());
        if (instant != null) {
            return instant.atZone(ZoneId.systemDefault());
        }
        return null;
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
        this.earnKind = str;
    }

    public final void setEarnMetric(String str) {
        this.earnMetric = str;
    }

    public final void setEarnRequirement(double d10) {
        this.earnRequirement = d10;
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

    public final void setProgress(double d10) {
        this.progress = d10;
    }

    public final void setRewardDetails(InProgressRewardDetails inProgressRewardDetails) {
        Intrinsics.j(inProgressRewardDetails, "<set-?>");
        this.rewardDetails = inProgressRewardDetails;
    }

    public final void setRewardId(Integer num) {
        this.rewardId = num;
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
        return new EarnReward(this.rewardId, this.rewardProgram, this.imageUrl, this.title, this.description, getStartAt(), getEndAt(), this.terms, this.productCategory, this.earnKind, this.earnRequirement, this.progress, this.earnMetric, this.maxDaysToEarn, this.maxDaysToRedeem, this.maxEarnCount, this.allowCarryOver, this.hasUpcs);
    }

    public /* synthetic */ MperksInProgressReward(String str, Integer num, String str2, String str3, String str4, String str5, InProgressRewardDetails inProgressRewardDetails, String str6, double d10, double d11, String str7, Integer num2, Integer num3, Integer num4, boolean z10, String str8, String str9, String str10, String str11, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, str4, str5, inProgressRewardDetails, (i10 & 128) != 0 ? null : str6, d10, d11, (i10 & 1024) != 0 ? null : str7, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? null : num2, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : num3, (i10 & 8192) != 0 ? null : num4, (i10 & 16384) != 0 ? false : z10, (32768 & i10) != 0 ? null : str8, (65536 & i10) != 0 ? null : str9, (131072 & i10) != 0 ? null : str10, (i10 & 262144) != 0 ? null : str11, z11);
    }
}
