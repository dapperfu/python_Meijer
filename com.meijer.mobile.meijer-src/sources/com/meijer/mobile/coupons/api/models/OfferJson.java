package com.meijer.mobile.coupons.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b6\b\u0087\b\u0018\u00002\u00020\u0001:\u0005[\\]^_Bý\u0001\u0012\f\b\u0001\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0005\u0012\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\f\u001a\u00020\u000b\u0012\b\b\u0003\u0010\u000e\u001a\u00020\r\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0003\u0010\u0011\u001a\u00020\u000f\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\u0015\u001a\u00020\u000f\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0003\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0003\u0010 \u001a\u00020\u001f\u0012\b\b\u0003\u0010\"\u001a\u00020!\u0012\b\b\u0003\u0010#\u001a\u00020\u001b¢\u0006\u0004\b$\u0010%J\u0086\u0002\u0010&\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\f\u001a\u00020\u000b2\b\b\u0003\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u0010\u001a\u00020\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u000f2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0015\u001a\u00020\u000f2\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u001c\u001a\u00020\u001b2\b\b\u0003\u0010\u001e\u001a\u00020\u001d2\b\b\u0003\u0010 \u001a\u00020\u001f2\b\b\u0003\u0010\"\u001a\u00020!2\b\b\u0003\u0010#\u001a\u00020\u001bHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u000f2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010)R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b8\u0010)R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b=\u00105\u001a\u0004\b>\u0010)R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b8\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b0\u0010DR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b@\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b>\u0010E\u001a\u0004\bH\u0010GR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bI\u00105\u001a\u0004\bI\u0010)R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bJ\u00105\u001a\u0004\bJ\u0010)R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b2\u00105\u001a\u0004\bK\u0010)R\u0017\u0010\u0015\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bL\u0010E\u001a\u0004\bM\u0010GR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bN\u00105\u001a\u0004\bO\u0010)R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bO\u00105\u001a\u0004\bN\u0010)R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\b4\u0010RR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b;\u00105\u001a\u0004\b7\u0010)R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bK\u0010S\u001a\u0004\bL\u0010TR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b6\u0010U\u001a\u0004\bP\u0010VR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\bM\u0010W\u001a\u0004\bB\u0010XR\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bF\u0010Y\u001a\u0004\b9\u0010ZR\u0017\u0010#\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bH\u0010S\u001a\u0004\b=\u0010T¨\u0006`"}, d2 = {"Lcom/meijer/mobile/coupons/api/models/OfferJson;", "", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "offerId", "", "title", "description", "", "tags", "hatText", "Lcom/meijer/mobile/coupons/api/models/OfferJson$HatColor;", "hatColor", "Lcom/meijer/mobile/coupons/api/models/OfferJson$BorderColor;", "borderColor", "", "isMeijerBuck", "isShowLargeImage", "imageURL", "largeImageURL", "termsAndConditions", "isManufacturerCoupon", "redemptionStartDate", "redemptionEndDate", "Lcom/meijer/mobile/coupons/api/models/CouponCategoryJson;", "category", "categoryName", "", "redeemAmount", "Lcom/meijer/mobile/coupons/api/models/OfferJson$RewardType;", "rewardType", "Lcom/meijer/mobile/coupons/api/models/OfferJson$DiscountLevel;", "discountLevel", "Lcom/meijer/mobile/coupons/api/models/OfferJson$ConditionType;", "conditionType", "conditionValue", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/meijer/mobile/coupons/api/models/OfferJson$HatColor;Lcom/meijer/mobile/coupons/api/models/OfferJson$BorderColor;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/coupons/api/models/CouponCategoryJson;Ljava/lang/String;DLcom/meijer/mobile/coupons/api/models/OfferJson$RewardType;Lcom/meijer/mobile/coupons/api/models/OfferJson$DiscountLevel;Lcom/meijer/mobile/coupons/api/models/OfferJson$ConditionType;D)V", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/meijer/mobile/coupons/api/models/OfferJson$HatColor;Lcom/meijer/mobile/coupons/api/models/OfferJson$BorderColor;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/coupons/api/models/CouponCategoryJson;Ljava/lang/String;DLcom/meijer/mobile/coupons/api/models/OfferJson$RewardType;Lcom/meijer/mobile/coupons/api/models/OfferJson$DiscountLevel;Lcom/meijer/mobile/coupons/api/models/OfferJson$ConditionType;D)Lcom/meijer/mobile/coupons/api/models/OfferJson;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "l", "()J", "b", "Ljava/lang/String;", "s", "c", "f", "d", "Ljava/util/List;", "q", "()Ljava/util/List;", "e", "i", "Lcom/meijer/mobile/coupons/api/models/OfferJson$HatColor;", "h", "()Lcom/meijer/mobile/coupons/api/models/OfferJson$HatColor;", "g", "Lcom/meijer/mobile/coupons/api/models/OfferJson$BorderColor;", "()Lcom/meijer/mobile/coupons/api/models/OfferJson$BorderColor;", "Z", "u", "()Z", "v", "j", "k", "r", "m", "t", "n", "o", "p", "Lcom/meijer/mobile/coupons/api/models/CouponCategoryJson;", "()Lcom/meijer/mobile/coupons/api/models/CouponCategoryJson;", "D", "()D", "Lcom/meijer/mobile/coupons/api/models/OfferJson$RewardType;", "()Lcom/meijer/mobile/coupons/api/models/OfferJson$RewardType;", "Lcom/meijer/mobile/coupons/api/models/OfferJson$DiscountLevel;", "()Lcom/meijer/mobile/coupons/api/models/OfferJson$DiscountLevel;", "Lcom/meijer/mobile/coupons/api/models/OfferJson$ConditionType;", "()Lcom/meijer/mobile/coupons/api/models/OfferJson$ConditionType;", "BorderColor", "HatColor", "ConditionType", "RewardType", "DiscountLevel", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OfferJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long offerId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> tags;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String hatText;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final HatColor hatColor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final BorderColor borderColor;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMeijerBuck;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isShowLargeImage;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageURL;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String largeImageURL;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String termsAndConditions;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isManufacturerCoupon;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String redemptionStartDate;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String redemptionEndDate;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final CouponCategoryJson category;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String categoryName;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final double redeemAmount;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final RewardType rewardType;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final DiscountLevel discountLevel;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final ConditionType conditionType;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final double conditionValue;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @i(generateAdapter = false)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/meijer/mobile/coupons/api/models/OfferJson$BorderColor;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "BLUE", "RED", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BorderColor {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BorderColor[] $VALUES;

        @g(name = "0")
        public static final BorderColor NONE = new BorderColor("NONE", 0);

        @g(name = "1")
        public static final BorderColor BLUE = new BorderColor("BLUE", 1);

        @g(name = "2")
        public static final BorderColor RED = new BorderColor("RED", 2);

        private static final /* synthetic */ BorderColor[] a() {
            return new BorderColor[]{NONE, BLUE, RED};
        }

        static {
            BorderColor[] borderColorArrA = a();
            $VALUES = borderColorArrA;
            $ENTRIES = EnumEntriesKt.a(borderColorArrA);
        }

        public static BorderColor valueOf(String str) {
            return (BorderColor) Enum.valueOf(BorderColor.class, str);
        }

        public static BorderColor[] values() {
            return (BorderColor[]) $VALUES.clone();
        }

        private BorderColor(String str, int i10) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @i(generateAdapter = false)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/coupons/api/models/OfferJson$ConditionType;", "", "<init>", "(Ljava/lang/String;I)V", "BUY_SINGLE_QUANTITY", "BUY_QUANTITY", "SPEND_AMOUNT", "BUY_MUST_PURCHASE", "BUY_MPERKS_AT_THE_PUMP", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ConditionType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ConditionType[] $VALUES;

        @g(name = "0")
        public static final ConditionType BUY_SINGLE_QUANTITY = new ConditionType("BUY_SINGLE_QUANTITY", 0);

        @g(name = "1")
        public static final ConditionType BUY_QUANTITY = new ConditionType("BUY_QUANTITY", 1);

        @g(name = "2")
        public static final ConditionType SPEND_AMOUNT = new ConditionType("SPEND_AMOUNT", 2);

        @g(name = "3")
        public static final ConditionType BUY_MUST_PURCHASE = new ConditionType("BUY_MUST_PURCHASE", 3);

        @g(name = "4")
        public static final ConditionType BUY_MPERKS_AT_THE_PUMP = new ConditionType("BUY_MPERKS_AT_THE_PUMP", 4);

        private static final /* synthetic */ ConditionType[] a() {
            return new ConditionType[]{BUY_SINGLE_QUANTITY, BUY_QUANTITY, SPEND_AMOUNT, BUY_MUST_PURCHASE, BUY_MPERKS_AT_THE_PUMP};
        }

        static {
            ConditionType[] conditionTypeArrA = a();
            $VALUES = conditionTypeArrA;
            $ENTRIES = EnumEntriesKt.a(conditionTypeArrA);
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @i(generateAdapter = false)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/coupons/api/models/OfferJson$DiscountLevel;", "", "<init>", "(Ljava/lang/String;I)V", "ITEM_LEVEL", "BASKET_LEVEL", "ALL_GM", "DEPARTMENT_LEVEL", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DiscountLevel {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DiscountLevel[] $VALUES;

        @g(name = "1")
        public static final DiscountLevel ITEM_LEVEL = new DiscountLevel("ITEM_LEVEL", 0);

        @g(name = "2")
        public static final DiscountLevel BASKET_LEVEL = new DiscountLevel("BASKET_LEVEL", 1);

        @g(name = "3")
        public static final DiscountLevel ALL_GM = new DiscountLevel("ALL_GM", 2);

        @g(name = "4")
        public static final DiscountLevel DEPARTMENT_LEVEL = new DiscountLevel("DEPARTMENT_LEVEL", 3);

        private static final /* synthetic */ DiscountLevel[] a() {
            return new DiscountLevel[]{ITEM_LEVEL, BASKET_LEVEL, ALL_GM, DEPARTMENT_LEVEL};
        }

        static {
            DiscountLevel[] discountLevelArrA = a();
            $VALUES = discountLevelArrA;
            $ENTRIES = EnumEntriesKt.a(discountLevelArrA);
        }

        public static DiscountLevel valueOf(String str) {
            return (DiscountLevel) Enum.valueOf(DiscountLevel.class, str);
        }

        public static DiscountLevel[] values() {
            return (DiscountLevel[]) $VALUES.clone();
        }

        private DiscountLevel(String str, int i10) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @i(generateAdapter = false)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/meijer/mobile/coupons/api/models/OfferJson$HatColor;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "BLUE", "RED", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HatColor {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ HatColor[] $VALUES;

        @g(name = "0")
        public static final HatColor NONE = new HatColor("NONE", 0);

        @g(name = "1")
        public static final HatColor BLUE = new HatColor("BLUE", 1);

        @g(name = "2")
        public static final HatColor RED = new HatColor("RED", 2);

        private static final /* synthetic */ HatColor[] a() {
            return new HatColor[]{NONE, BLUE, RED};
        }

        static {
            HatColor[] hatColorArrA = a();
            $VALUES = hatColorArrA;
            $ENTRIES = EnumEntriesKt.a(hatColorArrA);
        }

        public static HatColor valueOf(String str) {
            return (HatColor) Enum.valueOf(HatColor.class, str);
        }

        public static HatColor[] values() {
            return (HatColor[]) $VALUES.clone();
        }

        private HatColor(String str, int i10) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @i(generateAdapter = false)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/coupons/api/models/OfferJson$RewardType;", "", "<init>", "(Ljava/lang/String;I)V", "DISCOUNT_AMOUNT", "DISCOUNT_PERCENT", "FREE", "FIXED_PRICE", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RewardType[] $VALUES;

        @g(name = "1")
        public static final RewardType DISCOUNT_AMOUNT = new RewardType("DISCOUNT_AMOUNT", 0);

        @g(name = "2")
        public static final RewardType DISCOUNT_PERCENT = new RewardType("DISCOUNT_PERCENT", 1);

        @g(name = "3")
        public static final RewardType FREE = new RewardType("FREE", 2);

        @g(name = "4")
        public static final RewardType FIXED_PRICE = new RewardType("FIXED_PRICE", 3);

        private static final /* synthetic */ RewardType[] a() {
            return new RewardType[]{DISCOUNT_AMOUNT, DISCOUNT_PERCENT, FREE, FIXED_PRICE};
        }

        static {
            RewardType[] rewardTypeArrA = a();
            $VALUES = rewardTypeArrA;
            $ENTRIES = EnumEntriesKt.a(rewardTypeArrA);
        }

        public static RewardType valueOf(String str) {
            return (RewardType) Enum.valueOf(RewardType.class, str);
        }

        public static RewardType[] values() {
            return (RewardType[]) $VALUES.clone();
        }

        private RewardType(String str, int i10) {
        }
    }

    public OfferJson(@g(name = "meijerOfferId") long j10, @g(name = "title") String title, @g(name = "description") String description, @g(name = "tags") List<String> tags, @g(name = "hatText") String str, @g(name = "hatColor") HatColor hatColor, @g(name = "borderColor") BorderColor borderColor, @g(name = "isMeijerBuck") boolean z10, @g(name = "showLargeImage") boolean z11, @g(name = "imageURL") String str2, @g(name = "largeImageURL") String str3, @g(name = "termsAndConditions") String str4, @g(name = "manufacturerCoupon") boolean z12, @g(name = "redemptionStartDate") String str5, @g(name = "redemptionEndDate") String str6, @g(name = "category") CouponCategoryJson couponCategoryJson, @g(name = "categoryName") String str7, @g(name = "redeemAmount") double d10, @g(name = "discountTypeId") RewardType rewardType, @g(name = "discountLevelId") DiscountLevel discountLevel, @g(name = "conditionTypeId") ConditionType conditionType, @g(name = "conditionValue") double d11) {
        Intrinsics.j(title, "title");
        Intrinsics.j(description, "description");
        Intrinsics.j(tags, "tags");
        Intrinsics.j(hatColor, "hatColor");
        Intrinsics.j(borderColor, "borderColor");
        Intrinsics.j(rewardType, "rewardType");
        Intrinsics.j(discountLevel, "discountLevel");
        Intrinsics.j(conditionType, "conditionType");
        this.offerId = j10;
        this.title = title;
        this.description = description;
        this.tags = tags;
        this.hatText = str;
        this.hatColor = hatColor;
        this.borderColor = borderColor;
        this.isMeijerBuck = z10;
        this.isShowLargeImage = z11;
        this.imageURL = str2;
        this.largeImageURL = str3;
        this.termsAndConditions = str4;
        this.isManufacturerCoupon = z12;
        this.redemptionStartDate = str5;
        this.redemptionEndDate = str6;
        this.category = couponCategoryJson;
        this.categoryName = str7;
        this.redeemAmount = d10;
        this.rewardType = rewardType;
        this.discountLevel = discountLevel;
        this.conditionType = conditionType;
        this.conditionValue = d11;
    }

    public final OfferJson copy(@g(name = "meijerOfferId") long offerId, @g(name = "title") String title, @g(name = "description") String description, @g(name = "tags") List<String> tags, @g(name = "hatText") String hatText, @g(name = "hatColor") HatColor hatColor, @g(name = "borderColor") BorderColor borderColor, @g(name = "isMeijerBuck") boolean isMeijerBuck, @g(name = "showLargeImage") boolean isShowLargeImage, @g(name = "imageURL") String imageURL, @g(name = "largeImageURL") String largeImageURL, @g(name = "termsAndConditions") String termsAndConditions, @g(name = "manufacturerCoupon") boolean isManufacturerCoupon, @g(name = "redemptionStartDate") String redemptionStartDate, @g(name = "redemptionEndDate") String redemptionEndDate, @g(name = "category") CouponCategoryJson category, @g(name = "categoryName") String categoryName, @g(name = "redeemAmount") double redeemAmount, @g(name = "discountTypeId") RewardType rewardType, @g(name = "discountLevelId") DiscountLevel discountLevel, @g(name = "conditionTypeId") ConditionType conditionType, @g(name = "conditionValue") double conditionValue) {
        Intrinsics.j(title, "title");
        Intrinsics.j(description, "description");
        Intrinsics.j(tags, "tags");
        Intrinsics.j(hatColor, "hatColor");
        Intrinsics.j(borderColor, "borderColor");
        Intrinsics.j(rewardType, "rewardType");
        Intrinsics.j(discountLevel, "discountLevel");
        Intrinsics.j(conditionType, "conditionType");
        return new OfferJson(offerId, title, description, tags, hatText, hatColor, borderColor, isMeijerBuck, isShowLargeImage, imageURL, largeImageURL, termsAndConditions, isManufacturerCoupon, redemptionStartDate, redemptionEndDate, category, categoryName, redeemAmount, rewardType, discountLevel, conditionType, conditionValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfferJson)) {
            return false;
        }
        OfferJson offerJson = (OfferJson) other;
        return this.offerId == offerJson.offerId && Intrinsics.e(this.title, offerJson.title) && Intrinsics.e(this.description, offerJson.description) && Intrinsics.e(this.tags, offerJson.tags) && Intrinsics.e(this.hatText, offerJson.hatText) && this.hatColor == offerJson.hatColor && this.borderColor == offerJson.borderColor && this.isMeijerBuck == offerJson.isMeijerBuck && this.isShowLargeImage == offerJson.isShowLargeImage && Intrinsics.e(this.imageURL, offerJson.imageURL) && Intrinsics.e(this.largeImageURL, offerJson.largeImageURL) && Intrinsics.e(this.termsAndConditions, offerJson.termsAndConditions) && this.isManufacturerCoupon == offerJson.isManufacturerCoupon && Intrinsics.e(this.redemptionStartDate, offerJson.redemptionStartDate) && Intrinsics.e(this.redemptionEndDate, offerJson.redemptionEndDate) && Intrinsics.e(this.category, offerJson.category) && Intrinsics.e(this.categoryName, offerJson.categoryName) && Double.compare(this.redeemAmount, offerJson.redeemAmount) == 0 && this.rewardType == offerJson.rewardType && this.discountLevel == offerJson.discountLevel && this.conditionType == offerJson.conditionType && Double.compare(this.conditionValue, offerJson.conditionValue) == 0;
    }

    public int hashCode() {
        int iHashCode = ((((((Long.hashCode(this.offerId) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.tags.hashCode()) * 31;
        String str = this.hatText;
        int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.hatColor.hashCode()) * 31) + this.borderColor.hashCode()) * 31) + Boolean.hashCode(this.isMeijerBuck)) * 31) + Boolean.hashCode(this.isShowLargeImage)) * 31;
        String str2 = this.imageURL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.largeImageURL;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.termsAndConditions;
        int iHashCode5 = (((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + Boolean.hashCode(this.isManufacturerCoupon)) * 31;
        String str5 = this.redemptionStartDate;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.redemptionEndDate;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        CouponCategoryJson couponCategoryJson = this.category;
        int iHashCode8 = (iHashCode7 + (couponCategoryJson == null ? 0 : couponCategoryJson.hashCode())) * 31;
        String str7 = this.categoryName;
        return ((((((((((iHashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31) + Double.hashCode(this.redeemAmount)) * 31) + this.rewardType.hashCode()) * 31) + this.discountLevel.hashCode()) * 31) + this.conditionType.hashCode()) * 31) + Double.hashCode(this.conditionValue);
    }

    public String toString() {
        return "OfferJson(offerId=" + this.offerId + ", title=" + this.title + ", description=" + this.description + ", tags=" + this.tags + ", hatText=" + this.hatText + ", hatColor=" + this.hatColor + ", borderColor=" + this.borderColor + ", isMeijerBuck=" + this.isMeijerBuck + ", isShowLargeImage=" + this.isShowLargeImage + ", imageURL=" + this.imageURL + ", largeImageURL=" + this.largeImageURL + ", termsAndConditions=" + this.termsAndConditions + ", isManufacturerCoupon=" + this.isManufacturerCoupon + ", redemptionStartDate=" + this.redemptionStartDate + ", redemptionEndDate=" + this.redemptionEndDate + ", category=" + this.category + ", categoryName=" + this.categoryName + ", redeemAmount=" + this.redeemAmount + ", rewardType=" + this.rewardType + ", discountLevel=" + this.discountLevel + ", conditionType=" + this.conditionType + ", conditionValue=" + this.conditionValue + ')';
    }

    /* renamed from: a, reason: from getter */
    public final BorderColor getBorderColor() {
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
    public final ConditionType getConditionType() {
        return this.conditionType;
    }

    /* renamed from: e, reason: from getter */
    public final double getConditionValue() {
        return this.conditionValue;
    }

    /* renamed from: f, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: g, reason: from getter */
    public final DiscountLevel getDiscountLevel() {
        return this.discountLevel;
    }

    /* renamed from: h, reason: from getter */
    public final HatColor getHatColor() {
        return this.hatColor;
    }

    /* renamed from: i, reason: from getter */
    public final String getHatText() {
        return this.hatText;
    }

    /* renamed from: j, reason: from getter */
    public final String getImageURL() {
        return this.imageURL;
    }

    /* renamed from: k, reason: from getter */
    public final String getLargeImageURL() {
        return this.largeImageURL;
    }

    /* renamed from: l, reason: from getter */
    public final long getOfferId() {
        return this.offerId;
    }

    /* renamed from: m, reason: from getter */
    public final double getRedeemAmount() {
        return this.redeemAmount;
    }

    /* renamed from: n, reason: from getter */
    public final String getRedemptionEndDate() {
        return this.redemptionEndDate;
    }

    /* renamed from: o, reason: from getter */
    public final String getRedemptionStartDate() {
        return this.redemptionStartDate;
    }

    /* renamed from: p, reason: from getter */
    public final RewardType getRewardType() {
        return this.rewardType;
    }

    public final List<String> q() {
        return this.tags;
    }

    /* renamed from: r, reason: from getter */
    public final String getTermsAndConditions() {
        return this.termsAndConditions;
    }

    /* renamed from: s, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: t, reason: from getter */
    public final boolean getIsManufacturerCoupon() {
        return this.isManufacturerCoupon;
    }

    /* renamed from: u, reason: from getter */
    public final boolean getIsMeijerBuck() {
        return this.isMeijerBuck;
    }

    /* renamed from: v, reason: from getter */
    public final boolean getIsShowLargeImage() {
        return this.isShowLargeImage;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ OfferJson(long r30, java.lang.String r32, java.lang.String r33, java.util.List r34, java.lang.String r35, com.meijer.mobile.coupons.api.models.OfferJson.HatColor r36, com.meijer.mobile.coupons.api.models.OfferJson.BorderColor r37, boolean r38, boolean r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, boolean r43, java.lang.String r44, java.lang.String r45, com.meijer.mobile.coupons.api.models.CouponCategoryJson r46, java.lang.String r47, double r48, com.meijer.mobile.coupons.api.models.OfferJson.RewardType r50, com.meijer.mobile.coupons.api.models.OfferJson.DiscountLevel r51, com.meijer.mobile.coupons.api.models.OfferJson.ConditionType r52, double r53, int r55, kotlin.jvm.internal.DefaultConstructorMarker r56) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupons.api.models.OfferJson.<init>(long, java.lang.String, java.lang.String, java.util.List, java.lang.String, com.meijer.mobile.coupons.api.models.OfferJson$HatColor, com.meijer.mobile.coupons.api.models.OfferJson$BorderColor, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, com.meijer.mobile.coupons.api.models.CouponCategoryJson, java.lang.String, double, com.meijer.mobile.coupons.api.models.OfferJson$RewardType, com.meijer.mobile.coupons.api.models.OfferJson$DiscountLevel, com.meijer.mobile.coupons.api.models.OfferJson$ConditionType, double, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
