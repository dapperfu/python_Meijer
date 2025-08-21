package com.meijer.mobile.coupons.api.models;

import com.meijer.mobile.coupons.api.models.OfferJson;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b;\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0002\u0012\f\b\u0001\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0003\u0010\f\u001a\u00020\u0005\u0012\b\b\u0003\u0010\r\u001a\u00020\b\u0012\b\b\u0003\u0010\u000e\u001a\u00020\b\u0012\u000e\b\u0003\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000f\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0003\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0017\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\b\b\u0003\u0010\u001b\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\b\u0012\b\b\u0003\u0010#\u001a\u00020\"\u0012\b\b\u0003\u0010%\u001a\u00020$\u0012\b\b\u0003\u0010'\u001a\u00020&\u0012\b\b\u0003\u0010)\u001a\u00020(\u0012\b\b\u0003\u0010*\u001a\u00020\"¢\u0006\u0004\b+\u0010,JÒ\u0002\u0010-\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\u000b\u001a\u00020\u00052\b\b\u0003\u0010\f\u001a\u00020\u00052\b\b\u0003\u0010\r\u001a\u00020\b2\b\b\u0003\u0010\u000e\u001a\u00020\b2\u000e\b\u0003\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\u0013\u001a\u00020\u00122\b\b\u0003\u0010\u0015\u001a\u00020\u00142\b\b\u0003\u0010\u0016\u001a\u00020\u00052\b\b\u0003\u0010\u0017\u001a\u00020\u00052\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\u001b\u001a\u00020\u00052\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010#\u001a\u00020\"2\b\b\u0003\u0010%\u001a\u00020$2\b\b\u0003\u0010'\u001a\u00020&2\b\b\u0003\u0010)\u001a\u00020(2\b\b\u0003\u0010*\u001a\u00020\"HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u00020\u00052\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010<\u001a\u0004\b@\u0010>\"\u0004\bA\u0010BR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u00100R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bF\u0010D\u001a\u0004\bG\u00100R\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010<\u001a\u0004\bH\u0010>\"\u0004\bI\u0010BR\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bE\u0010<\u001a\u0004\bJ\u0010>R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bK\u0010D\u001a\u0004\bL\u00100R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bM\u0010D\u001a\u0004\bK\u00100R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000f8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bR\u0010D\u001a\u0004\bR\u00100R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bN\u0010UR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\b7\u0010XR\u0017\u0010\u0016\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b9\u0010<\u001a\u0004\bY\u0010>R\u0017\u0010\u0017\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bZ\u0010<\u001a\u0004\b[\u0010>R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\\\u0010D\u001a\u0004\bS\u00100R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b]\u0010D\u001a\u0004\bV\u00100R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b^\u0010D\u001a\u0004\b_\u00100R\u0017\u0010\u001b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b`\u0010<\u001a\u0004\ba\u0010>R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bP\u0010D\u001a\u0004\b^\u00100R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b_\u0010D\u001a\u0004\b]\u00100R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bL\u0010D\u001a\u0004\b\\\u00100R\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bH\u0010b\u001a\u0004\b;\u0010cR\u0019\u0010!\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b@\u0010D\u001a\u0004\b?\u00100R\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\ba\u0010d\u001a\u0004\bZ\u0010eR\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\bY\u0010f\u001a\u0004\b`\u0010gR\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b[\u0010h\u001a\u0004\bM\u0010iR\u0017\u0010)\u001a\u00020(8\u0006¢\u0006\f\n\u0004\bJ\u0010j\u001a\u0004\bC\u0010kR\u0017\u0010*\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b=\u0010d\u001a\u0004\bF\u0010e¨\u0006l"}, d2 = {"Lcom/meijer/mobile/coupons/api/models/LegacyCouponJson;", "", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "offerId", "", "isSuggested", "isHidden", "", "couponInclusionGroupTag", "couponExpirationGroupTag", "isClipped", "isSpecialOffer", "title", "description", "", "tags", "hatText", "Lcom/meijer/mobile/coupons/api/models/OfferJson$HatColor;", "hatColor", "Lcom/meijer/mobile/coupons/api/models/OfferJson$BorderColor;", "borderColor", "isMeijerBuck", "isShowLargeImage", "imageURL", "largeImageURL", "termsAndConditions", "isManufacturerCoupon", "redemptionStartDate", "redemptionEndDate", "redemptionDate", "Lcom/meijer/mobile/coupons/api/models/CouponCategoryJson;", "category", "categoryName", "", "redeemAmount", "Lcom/meijer/mobile/coupons/api/models/OfferJson$RewardType;", "rewardType", "Lcom/meijer/mobile/coupons/api/models/OfferJson$DiscountLevel;", "discountLevel", "Lcom/meijer/mobile/coupons/api/models/OfferJson$ConditionType;", "conditionType", "conditionValue", "<init>", "(JZZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/meijer/mobile/coupons/api/models/OfferJson$HatColor;Lcom/meijer/mobile/coupons/api/models/OfferJson$BorderColor;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/coupons/api/models/CouponCategoryJson;Ljava/lang/String;DLcom/meijer/mobile/coupons/api/models/OfferJson$RewardType;Lcom/meijer/mobile/coupons/api/models/OfferJson$DiscountLevel;Lcom/meijer/mobile/coupons/api/models/OfferJson$ConditionType;D)V", "copy", "(JZZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/meijer/mobile/coupons/api/models/OfferJson$HatColor;Lcom/meijer/mobile/coupons/api/models/OfferJson$BorderColor;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/coupons/api/models/CouponCategoryJson;Ljava/lang/String;DLcom/meijer/mobile/coupons/api/models/OfferJson$RewardType;Lcom/meijer/mobile/coupons/api/models/OfferJson$DiscountLevel;Lcom/meijer/mobile/coupons/api/models/OfferJson$ConditionType;D)Lcom/meijer/mobile/coupons/api/models/LegacyCouponJson;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "n", "()J", "b", "Z", "C", "()Z", "c", "x", "setHidden", "(Z)V", "d", "Ljava/lang/String;", "g", "e", "f", "w", "setClipped", "B", "h", "v", "i", "j", "Ljava/util/List;", "t", "()Ljava/util/List;", "k", "l", "Lcom/meijer/mobile/coupons/api/models/OfferJson$HatColor;", "()Lcom/meijer/mobile/coupons/api/models/OfferJson$HatColor;", "m", "Lcom/meijer/mobile/coupons/api/models/OfferJson$BorderColor;", "()Lcom/meijer/mobile/coupons/api/models/OfferJson$BorderColor;", "z", "o", "A", "p", "q", "r", "u", "s", "y", "Lcom/meijer/mobile/coupons/api/models/CouponCategoryJson;", "()Lcom/meijer/mobile/coupons/api/models/CouponCategoryJson;", "D", "()D", "Lcom/meijer/mobile/coupons/api/models/OfferJson$RewardType;", "()Lcom/meijer/mobile/coupons/api/models/OfferJson$RewardType;", "Lcom/meijer/mobile/coupons/api/models/OfferJson$DiscountLevel;", "()Lcom/meijer/mobile/coupons/api/models/OfferJson$DiscountLevel;", "Lcom/meijer/mobile/coupons/api/models/OfferJson$ConditionType;", "()Lcom/meijer/mobile/coupons/api/models/OfferJson$ConditionType;", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class LegacyCouponJson {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
    private final OfferJson.DiscountLevel discountLevel;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private final OfferJson.ConditionType conditionType;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
    private final double conditionValue;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long offerId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSuggested;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isHidden;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String couponInclusionGroupTag;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String couponExpirationGroupTag;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isClipped;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSpecialOffer;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> tags;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String hatText;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final OfferJson.HatColor hatColor;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final OfferJson.BorderColor borderColor;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMeijerBuck;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isShowLargeImage;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageURL;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String largeImageURL;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final String termsAndConditions;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isManufacturerCoupon;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final String redemptionStartDate;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final String redemptionEndDate;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final String redemptionDate;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final CouponCategoryJson category;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final String categoryName;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final double redeemAmount;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final OfferJson.RewardType rewardType;

    public LegacyCouponJson(@g(name = "meijerOfferId") long j10, @g(name = "isSuggested") boolean z10, @g(name = "isHidden") boolean z11, @g(name = "couponInclusionGroupTag") String str, @g(name = "couponExpirationGroupTag") String str2, @g(name = "isClipped") boolean z12, @g(name = "isSpecialOffer") boolean z13, @g(name = "title") String title, @g(name = "description") String description, @g(name = "tags") List<String> tags, @g(name = "hatText") String str3, @g(name = "hatColor") OfferJson.HatColor hatColor, @g(name = "borderColor") OfferJson.BorderColor borderColor, @g(name = "isMeijerBuck") boolean z14, @g(name = "showLargeImage") boolean z15, @g(name = "imageURL") String str4, @g(name = "largeImageURL") String str5, @g(name = "termsAndConditions") String str6, @g(name = "manufacturerCoupon") boolean z16, @g(name = "redemptionStartDate") String str7, @g(name = "redemptionEndDate") String str8, @g(name = "redemptionDate") String str9, @g(name = "category") CouponCategoryJson couponCategoryJson, @g(name = "categoryName") String str10, @g(name = "redeemAmount") double d10, @g(name = "discountTypeId") OfferJson.RewardType rewardType, @g(name = "discountLevelId") OfferJson.DiscountLevel discountLevel, @g(name = "conditionTypeId") OfferJson.ConditionType conditionType, @g(name = "conditionValue") double d11) {
        Intrinsics.j(title, "title");
        Intrinsics.j(description, "description");
        Intrinsics.j(tags, "tags");
        Intrinsics.j(hatColor, "hatColor");
        Intrinsics.j(borderColor, "borderColor");
        Intrinsics.j(rewardType, "rewardType");
        Intrinsics.j(discountLevel, "discountLevel");
        Intrinsics.j(conditionType, "conditionType");
        this.offerId = j10;
        this.isSuggested = z10;
        this.isHidden = z11;
        this.couponInclusionGroupTag = str;
        this.couponExpirationGroupTag = str2;
        this.isClipped = z12;
        this.isSpecialOffer = z13;
        this.title = title;
        this.description = description;
        this.tags = tags;
        this.hatText = str3;
        this.hatColor = hatColor;
        this.borderColor = borderColor;
        this.isMeijerBuck = z14;
        this.isShowLargeImage = z15;
        this.imageURL = str4;
        this.largeImageURL = str5;
        this.termsAndConditions = str6;
        this.isManufacturerCoupon = z16;
        this.redemptionStartDate = str7;
        this.redemptionEndDate = str8;
        this.redemptionDate = str9;
        this.category = couponCategoryJson;
        this.categoryName = str10;
        this.redeemAmount = d10;
        this.rewardType = rewardType;
        this.discountLevel = discountLevel;
        this.conditionType = conditionType;
        this.conditionValue = d11;
    }

    public final LegacyCouponJson copy(@g(name = "meijerOfferId") long offerId, @g(name = "isSuggested") boolean isSuggested, @g(name = "isHidden") boolean isHidden, @g(name = "couponInclusionGroupTag") String couponInclusionGroupTag, @g(name = "couponExpirationGroupTag") String couponExpirationGroupTag, @g(name = "isClipped") boolean isClipped, @g(name = "isSpecialOffer") boolean isSpecialOffer, @g(name = "title") String title, @g(name = "description") String description, @g(name = "tags") List<String> tags, @g(name = "hatText") String hatText, @g(name = "hatColor") OfferJson.HatColor hatColor, @g(name = "borderColor") OfferJson.BorderColor borderColor, @g(name = "isMeijerBuck") boolean isMeijerBuck, @g(name = "showLargeImage") boolean isShowLargeImage, @g(name = "imageURL") String imageURL, @g(name = "largeImageURL") String largeImageURL, @g(name = "termsAndConditions") String termsAndConditions, @g(name = "manufacturerCoupon") boolean isManufacturerCoupon, @g(name = "redemptionStartDate") String redemptionStartDate, @g(name = "redemptionEndDate") String redemptionEndDate, @g(name = "redemptionDate") String redemptionDate, @g(name = "category") CouponCategoryJson category, @g(name = "categoryName") String categoryName, @g(name = "redeemAmount") double redeemAmount, @g(name = "discountTypeId") OfferJson.RewardType rewardType, @g(name = "discountLevelId") OfferJson.DiscountLevel discountLevel, @g(name = "conditionTypeId") OfferJson.ConditionType conditionType, @g(name = "conditionValue") double conditionValue) {
        Intrinsics.j(title, "title");
        Intrinsics.j(description, "description");
        Intrinsics.j(tags, "tags");
        Intrinsics.j(hatColor, "hatColor");
        Intrinsics.j(borderColor, "borderColor");
        Intrinsics.j(rewardType, "rewardType");
        Intrinsics.j(discountLevel, "discountLevel");
        Intrinsics.j(conditionType, "conditionType");
        return new LegacyCouponJson(offerId, isSuggested, isHidden, couponInclusionGroupTag, couponExpirationGroupTag, isClipped, isSpecialOffer, title, description, tags, hatText, hatColor, borderColor, isMeijerBuck, isShowLargeImage, imageURL, largeImageURL, termsAndConditions, isManufacturerCoupon, redemptionStartDate, redemptionEndDate, redemptionDate, category, categoryName, redeemAmount, rewardType, discountLevel, conditionType, conditionValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegacyCouponJson)) {
            return false;
        }
        LegacyCouponJson legacyCouponJson = (LegacyCouponJson) other;
        return this.offerId == legacyCouponJson.offerId && this.isSuggested == legacyCouponJson.isSuggested && this.isHidden == legacyCouponJson.isHidden && Intrinsics.e(this.couponInclusionGroupTag, legacyCouponJson.couponInclusionGroupTag) && Intrinsics.e(this.couponExpirationGroupTag, legacyCouponJson.couponExpirationGroupTag) && this.isClipped == legacyCouponJson.isClipped && this.isSpecialOffer == legacyCouponJson.isSpecialOffer && Intrinsics.e(this.title, legacyCouponJson.title) && Intrinsics.e(this.description, legacyCouponJson.description) && Intrinsics.e(this.tags, legacyCouponJson.tags) && Intrinsics.e(this.hatText, legacyCouponJson.hatText) && this.hatColor == legacyCouponJson.hatColor && this.borderColor == legacyCouponJson.borderColor && this.isMeijerBuck == legacyCouponJson.isMeijerBuck && this.isShowLargeImage == legacyCouponJson.isShowLargeImage && Intrinsics.e(this.imageURL, legacyCouponJson.imageURL) && Intrinsics.e(this.largeImageURL, legacyCouponJson.largeImageURL) && Intrinsics.e(this.termsAndConditions, legacyCouponJson.termsAndConditions) && this.isManufacturerCoupon == legacyCouponJson.isManufacturerCoupon && Intrinsics.e(this.redemptionStartDate, legacyCouponJson.redemptionStartDate) && Intrinsics.e(this.redemptionEndDate, legacyCouponJson.redemptionEndDate) && Intrinsics.e(this.redemptionDate, legacyCouponJson.redemptionDate) && Intrinsics.e(this.category, legacyCouponJson.category) && Intrinsics.e(this.categoryName, legacyCouponJson.categoryName) && Double.compare(this.redeemAmount, legacyCouponJson.redeemAmount) == 0 && this.rewardType == legacyCouponJson.rewardType && this.discountLevel == legacyCouponJson.discountLevel && this.conditionType == legacyCouponJson.conditionType && Double.compare(this.conditionValue, legacyCouponJson.conditionValue) == 0;
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.offerId) * 31) + Boolean.hashCode(this.isSuggested)) * 31) + Boolean.hashCode(this.isHidden)) * 31;
        String str = this.couponInclusionGroupTag;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.couponExpirationGroupTag;
        int iHashCode3 = (((((((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isClipped)) * 31) + Boolean.hashCode(this.isSpecialOffer)) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.tags.hashCode()) * 31;
        String str3 = this.hatText;
        int iHashCode4 = (((((((((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.hatColor.hashCode()) * 31) + this.borderColor.hashCode()) * 31) + Boolean.hashCode(this.isMeijerBuck)) * 31) + Boolean.hashCode(this.isShowLargeImage)) * 31;
        String str4 = this.imageURL;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.largeImageURL;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.termsAndConditions;
        int iHashCode7 = (((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + Boolean.hashCode(this.isManufacturerCoupon)) * 31;
        String str7 = this.redemptionStartDate;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.redemptionEndDate;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.redemptionDate;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        CouponCategoryJson couponCategoryJson = this.category;
        int iHashCode11 = (iHashCode10 + (couponCategoryJson == null ? 0 : couponCategoryJson.hashCode())) * 31;
        String str10 = this.categoryName;
        return ((((((((((iHashCode11 + (str10 != null ? str10.hashCode() : 0)) * 31) + Double.hashCode(this.redeemAmount)) * 31) + this.rewardType.hashCode()) * 31) + this.discountLevel.hashCode()) * 31) + this.conditionType.hashCode()) * 31) + Double.hashCode(this.conditionValue);
    }

    public String toString() {
        return "LegacyCouponJson(offerId=" + this.offerId + ", isSuggested=" + this.isSuggested + ", isHidden=" + this.isHidden + ", couponInclusionGroupTag=" + this.couponInclusionGroupTag + ", couponExpirationGroupTag=" + this.couponExpirationGroupTag + ", isClipped=" + this.isClipped + ", isSpecialOffer=" + this.isSpecialOffer + ", title=" + this.title + ", description=" + this.description + ", tags=" + this.tags + ", hatText=" + this.hatText + ", hatColor=" + this.hatColor + ", borderColor=" + this.borderColor + ", isMeijerBuck=" + this.isMeijerBuck + ", isShowLargeImage=" + this.isShowLargeImage + ", imageURL=" + this.imageURL + ", largeImageURL=" + this.largeImageURL + ", termsAndConditions=" + this.termsAndConditions + ", isManufacturerCoupon=" + this.isManufacturerCoupon + ", redemptionStartDate=" + this.redemptionStartDate + ", redemptionEndDate=" + this.redemptionEndDate + ", redemptionDate=" + this.redemptionDate + ", category=" + this.category + ", categoryName=" + this.categoryName + ", redeemAmount=" + this.redeemAmount + ", rewardType=" + this.rewardType + ", discountLevel=" + this.discountLevel + ", conditionType=" + this.conditionType + ", conditionValue=" + this.conditionValue + ')';
    }

    /* renamed from: A, reason: from getter */
    public final boolean getIsShowLargeImage() {
        return this.isShowLargeImage;
    }

    /* renamed from: B, reason: from getter */
    public final boolean getIsSpecialOffer() {
        return this.isSpecialOffer;
    }

    /* renamed from: C, reason: from getter */
    public final boolean getIsSuggested() {
        return this.isSuggested;
    }

    /* renamed from: a, reason: from getter */
    public final OfferJson.BorderColor getBorderColor() {
        return this.borderColor;
    }

    /* renamed from: b, reason: from getter */
    public final CouponCategoryJson getCategory() {
        return this.category;
    }

    /* renamed from: c, reason: from getter */
    public final String getCategoryName() {
        return this.categoryName;
    }

    /* renamed from: d, reason: from getter */
    public final OfferJson.ConditionType getConditionType() {
        return this.conditionType;
    }

    /* renamed from: e, reason: from getter */
    public final double getConditionValue() {
        return this.conditionValue;
    }

    /* renamed from: f, reason: from getter */
    public final String getCouponExpirationGroupTag() {
        return this.couponExpirationGroupTag;
    }

    /* renamed from: g, reason: from getter */
    public final String getCouponInclusionGroupTag() {
        return this.couponInclusionGroupTag;
    }

    /* renamed from: h, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: i, reason: from getter */
    public final OfferJson.DiscountLevel getDiscountLevel() {
        return this.discountLevel;
    }

    /* renamed from: j, reason: from getter */
    public final OfferJson.HatColor getHatColor() {
        return this.hatColor;
    }

    /* renamed from: k, reason: from getter */
    public final String getHatText() {
        return this.hatText;
    }

    /* renamed from: l, reason: from getter */
    public final String getImageURL() {
        return this.imageURL;
    }

    /* renamed from: m, reason: from getter */
    public final String getLargeImageURL() {
        return this.largeImageURL;
    }

    /* renamed from: n, reason: from getter */
    public final long getOfferId() {
        return this.offerId;
    }

    /* renamed from: o, reason: from getter */
    public final double getRedeemAmount() {
        return this.redeemAmount;
    }

    /* renamed from: p, reason: from getter */
    public final String getRedemptionDate() {
        return this.redemptionDate;
    }

    /* renamed from: q, reason: from getter */
    public final String getRedemptionEndDate() {
        return this.redemptionEndDate;
    }

    /* renamed from: r, reason: from getter */
    public final String getRedemptionStartDate() {
        return this.redemptionStartDate;
    }

    /* renamed from: s, reason: from getter */
    public final OfferJson.RewardType getRewardType() {
        return this.rewardType;
    }

    public final List<String> t() {
        return this.tags;
    }

    /* renamed from: u, reason: from getter */
    public final String getTermsAndConditions() {
        return this.termsAndConditions;
    }

    /* renamed from: v, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: w, reason: from getter */
    public final boolean getIsClipped() {
        return this.isClipped;
    }

    /* renamed from: x, reason: from getter */
    public final boolean getIsHidden() {
        return this.isHidden;
    }

    /* renamed from: y, reason: from getter */
    public final boolean getIsManufacturerCoupon() {
        return this.isManufacturerCoupon;
    }

    /* renamed from: z, reason: from getter */
    public final boolean getIsMeijerBuck() {
        return this.isMeijerBuck;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ LegacyCouponJson(long r37, boolean r39, boolean r40, java.lang.String r41, java.lang.String r42, boolean r43, boolean r44, java.lang.String r45, java.lang.String r46, java.util.List r47, java.lang.String r48, com.meijer.mobile.coupons.api.models.OfferJson.HatColor r49, com.meijer.mobile.coupons.api.models.OfferJson.BorderColor r50, boolean r51, boolean r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, boolean r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, com.meijer.mobile.coupons.api.models.CouponCategoryJson r60, java.lang.String r61, double r62, com.meijer.mobile.coupons.api.models.OfferJson.RewardType r64, com.meijer.mobile.coupons.api.models.OfferJson.DiscountLevel r65, com.meijer.mobile.coupons.api.models.OfferJson.ConditionType r66, double r67, int r69, kotlin.jvm.internal.DefaultConstructorMarker r70) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupons.api.models.LegacyCouponJson.<init>(long, boolean, boolean, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.util.List, java.lang.String, com.meijer.mobile.coupons.api.models.OfferJson$HatColor, com.meijer.mobile.coupons.api.models.OfferJson$BorderColor, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, com.meijer.mobile.coupons.api.models.CouponCategoryJson, java.lang.String, double, com.meijer.mobile.coupons.api.models.OfferJson$RewardType, com.meijer.mobile.coupons.api.models.OfferJson$DiscountLevel, com.meijer.mobile.coupons.api.models.OfferJson$ConditionType, double, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
