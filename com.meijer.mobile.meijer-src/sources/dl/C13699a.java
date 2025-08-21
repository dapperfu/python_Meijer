package dl;

import Pk.Coupon;
import Pk.CouponCategory;
import com.meijer.mobile.coupons.api.models.CouponCategoryJson;
import com.meijer.mobile.coupons.api.models.CouponJson;
import com.meijer.mobile.coupons.api.models.CouponsResponseJson;
import com.meijer.mobile.coupons.api.models.LegacyCouponJson;
import com.meijer.mobile.coupons.api.models.OfferJson;
import el.CouponsResponse;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import uh.j;
import wk.C17898a;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u0010\u001a\u00020\u000f*\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0018\u001a\u00020\u0017*\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0011\u0010\u001c\u001a\u00020\u001b*\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0011\u0010\u001f\u001a\u00020\u001e*\u00020\u001a¢\u0006\u0004\b\u001f\u0010 \u001a\u0011\u0010\"\u001a\u00020!*\u00020\u001a¢\u0006\u0004\b\"\u0010#\u001a\u0011\u0010%\u001a\u00020\u001a*\u00020$¢\u0006\u0004\b%\u0010&\u001a\u0011\u0010'\u001a\u00020\u0001*\u00020$¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/meijer/mobile/coupons/api/models/CouponJson;", "LPk/a;", "f", "(Lcom/meijer/mobile/coupons/api/models/CouponJson;)LPk/a;", "Lcom/meijer/mobile/coupons/api/models/OfferJson$BorderColor;", "LPk/a$a;", "d", "(Lcom/meijer/mobile/coupons/api/models/OfferJson$BorderColor;)LPk/a$a;", "Lcom/meijer/mobile/coupons/api/models/OfferJson$HatColor;", "LPk/a$d;", "e", "(Lcom/meijer/mobile/coupons/api/models/OfferJson$HatColor;)LPk/a$d;", "Lcom/meijer/mobile/coupons/api/models/CouponsResponseJson;", "", "specialOffersUrl", "Lel/a;", "j", "(Lcom/meijer/mobile/coupons/api/models/CouponsResponseJson;Ljava/lang/String;)Lel/a;", "Lcom/meijer/mobile/coupons/api/models/CouponsResponseJson$CouponsResponseCode;", "Lel/a$a;", "i", "(Lcom/meijer/mobile/coupons/api/models/CouponsResponseJson$CouponsResponseCode;)Lel/a$a;", "Lcom/meijer/mobile/coupons/api/models/CouponCategoryJson;", "LPk/b;", "h", "(Lcom/meijer/mobile/coupons/api/models/CouponCategoryJson;)LPk/b;", "Lcom/meijer/mobile/coupons/api/models/OfferJson;", "LPk/a$c;", "a", "(Lcom/meijer/mobile/coupons/api/models/OfferJson;)LPk/a$c;", "", "b", "(Lcom/meijer/mobile/coupons/api/models/OfferJson;)Z", "LPk/a$e;", "c", "(Lcom/meijer/mobile/coupons/api/models/OfferJson;)LPk/a$e;", "Lcom/meijer/mobile/coupons/api/models/LegacyCouponJson;", "l", "(Lcom/meijer/mobile/coupons/api/models/LegacyCouponJson;)Lcom/meijer/mobile/coupons/api/models/OfferJson;", "g", "(Lcom/meijer/mobile/coupons/api/models/LegacyCouponJson;)LPk/a;", "coupons_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: dl.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C13699a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: dl.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C2022a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[OfferJson.BorderColor.values().length];
            try {
                iArr[OfferJson.BorderColor.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OfferJson.BorderColor.BLUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OfferJson.BorderColor.RED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OfferJson.HatColor.values().length];
            try {
                iArr2[OfferJson.HatColor.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OfferJson.HatColor.BLUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[OfferJson.HatColor.RED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CouponsResponseJson.CouponsResponseCode.values().length];
            try {
                iArr3[CouponsResponseJson.CouponsResponseCode.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[CouponsResponseJson.CouponsResponseCode.INVALID_OFFER_CODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[CouponsResponseJson.CouponsResponseCode.OFFER_CODE_ANOTHER_ACCOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[CouponsResponseJson.CouponsResponseCode.OFFER_CODE_ALREADY_CLIPPED.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[CouponsResponseJson.CouponsResponseCode.OFFER_CODE_ALREADY_REDEEMED.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[CouponsResponseJson.CouponsResponseCode.OFFER_CODE_EXPIRED.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[CouponsResponseJson.CouponsResponseCode.OFFER_CODE_EXPIRED_LESS_THAN_TWO_WEEKS.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[CouponsResponseJson.CouponsResponseCode.OFFER_CODE_NOT_AVAILABLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[CouponsResponseJson.CouponsResponseCode.SAME_KIND_OF_OFFER_CODE_APPLIED.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[CouponsResponseJson.CouponsResponseCode.OFFER_CODE_ONLY_AVAILABLE_TO_NEW_MEMBERS.ordinal()] = 10;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[CouponsResponseJson.CouponsResponseCode.UNAUTH_ERROR.ordinal()] = 11;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[CouponsResponseJson.CouponsResponseCode.UNKNOWN_ERROR.ordinal()] = 12;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[OfferJson.RewardType.values().length];
            try {
                iArr4[OfferJson.RewardType.DISCOUNT_AMOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[OfferJson.RewardType.DISCOUNT_PERCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[OfferJson.RewardType.FREE.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static final Coupon.c a(OfferJson offerJson) {
        Intrinsics.j(offerJson, "<this>");
        return offerJson.getDiscountLevel() == OfferJson.DiscountLevel.BASKET_LEVEL ? Coupon.c.b.f26149b : (offerJson.getConditionType() == OfferJson.ConditionType.BUY_SINGLE_QUANTITY && offerJson.getRewardType() == OfferJson.RewardType.FREE) ? Coupon.c.b.f26149b : offerJson.getConditionType() == OfferJson.ConditionType.SPEND_AMOUNT ? new Coupon.c.Spend(offerJson.getConditionValue()) : new Coupon.c.Buy(offerJson.getConditionValue());
    }

    public static final boolean b(OfferJson offerJson) {
        Intrinsics.j(offerJson, "<this>");
        if (Intrinsics.e(a(offerJson), new Coupon.c.Buy(offerJson.getConditionValue())) && offerJson.getConditionType() == OfferJson.ConditionType.BUY_QUANTITY) {
            String lowerCase = offerJson.getTitle().toLowerCase(Locale.ROOT);
            Intrinsics.i(lowerCase, "toLowerCase(...)");
            if (StringsKt.d0(lowerCase, "get 1", false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    public static final Coupon.e c(OfferJson offerJson) {
        Intrinsics.j(offerJson, "<this>");
        int i10 = C2022a.$EnumSwitchMapping$3[offerJson.getRewardType().ordinal()];
        if (i10 == 1) {
            return new Coupon.e.PriceDiscount(offerJson.getRedeemAmount());
        }
        if (i10 == 2) {
            return new Coupon.e.PercentDiscount(offerJson.getRedeemAmount());
        }
        if (i10 == 3) {
            return new Coupon.e.Free(offerJson.getRedeemAmount());
        }
        qw.a.INSTANCE.e(new IllegalStateException("Unknown discountTypeId: " + offerJson.getRewardType() + ", could not determine reward."));
        return Coupon.e.b.f26158b;
    }

    private static final Coupon.EnumC0469a d(OfferJson.BorderColor borderColor) {
        int i10 = C2022a.$EnumSwitchMapping$0[borderColor.ordinal()];
        if (i10 == 1) {
            return Coupon.EnumC0469a.f26142a;
        }
        if (i10 == 2) {
            return Coupon.EnumC0469a.f26143b;
        }
        if (i10 == 3) {
            return Coupon.EnumC0469a.f26144c;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final Coupon.d e(OfferJson.HatColor hatColor) {
        int i10 = C2022a.$EnumSwitchMapping$1[hatColor.ordinal()];
        if (i10 == 1) {
            return Coupon.d.f26151a;
        }
        if (i10 == 2) {
            return Coupon.d.f26152b;
        }
        if (i10 == 3) {
            return Coupon.d.f26153c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Coupon f(CouponJson couponJson) {
        long j10;
        LocalDateTime localDateTime;
        LocalDateTime localDateTime2;
        LocalDateTime localDateTime3;
        Intrinsics.j(couponJson, "<this>");
        long offerId = couponJson.getOffer().getOfferId();
        boolean isSuggested = couponJson.getIsSuggested();
        boolean isHidden = couponJson.getIsHidden();
        String couponInclusionGroupTag = couponJson.getCouponInclusionGroupTag();
        String couponExpirationGroupTag = couponJson.getCouponExpirationGroupTag();
        boolean isClipped = couponJson.getIsClipped();
        boolean isSpecialOffer = couponJson.getIsSpecialOffer();
        String title = couponJson.getOffer().getTitle();
        String description = couponJson.getOffer().getDescription();
        List<String> listQ = couponJson.getOffer().q();
        String hatText = couponJson.getOffer().getHatText();
        Coupon.d dVarE = e(couponJson.getOffer().getHatColor());
        Coupon.EnumC0469a enumC0469aD = d(couponJson.getOffer().getBorderColor());
        boolean isMeijerBuck = couponJson.getOffer().getIsMeijerBuck();
        boolean isShowLargeImage = couponJson.getOffer().getIsShowLargeImage();
        String imageURL = couponJson.getOffer().getImageURL();
        String largeImageURL = couponJson.getOffer().getLargeImageURL();
        String termsAndConditions = couponJson.getOffer().getTermsAndConditions();
        boolean isManufacturerCoupon = couponJson.getOffer().getIsManufacturerCoupon();
        String redemptionStartDate = couponJson.getOffer().getRedemptionStartDate();
        if (redemptionStartDate != null) {
            j10 = offerId;
            localDateTime = (LocalDateTime) wk.d.b(redemptionStartDate, C17898a.f167225a.s(), new j());
        } else {
            j10 = offerId;
            localDateTime = null;
        }
        String redemptionEndDate = couponJson.getOffer().getRedemptionEndDate();
        LocalDateTime localDateTime4 = redemptionEndDate != null ? (LocalDateTime) wk.d.b(redemptionEndDate, C17898a.f167225a.s(), new j()) : null;
        String redemptionDate = couponJson.getRedemptionDate();
        if (redemptionDate != null) {
            localDateTime2 = localDateTime;
            localDateTime3 = (LocalDateTime) wk.d.b(redemptionDate, C17898a.f167225a.s(), new j());
        } else {
            localDateTime2 = localDateTime;
            localDateTime3 = null;
        }
        CouponCategoryJson category = couponJson.getOffer().getCategory();
        return new Coupon(j10, isSuggested, isHidden, couponInclusionGroupTag, couponExpirationGroupTag, isClipped, isSpecialOffer, title, description, listQ, hatText, dVarE, enumC0469aD, isMeijerBuck, isShowLargeImage, imageURL, largeImageURL, termsAndConditions, isManufacturerCoupon, localDateTime2, localDateTime4, localDateTime3, category != null ? h(category) : null, couponJson.getOffer().getCategoryName(), false, false, null, a(couponJson.getOffer()), c(couponJson.getOffer()), b(couponJson.getOffer()), 117440512, null);
    }

    public static final Coupon g(LegacyCouponJson legacyCouponJson) {
        long j10;
        LocalDateTime localDateTime;
        LocalDateTime localDateTime2;
        LocalDateTime localDateTime3;
        Intrinsics.j(legacyCouponJson, "<this>");
        OfferJson offerJsonL = l(legacyCouponJson);
        long offerId = offerJsonL.getOfferId();
        boolean isSuggested = legacyCouponJson.getIsSuggested();
        boolean isHidden = legacyCouponJson.getIsHidden();
        String couponInclusionGroupTag = legacyCouponJson.getCouponInclusionGroupTag();
        String couponExpirationGroupTag = legacyCouponJson.getCouponExpirationGroupTag();
        boolean isClipped = legacyCouponJson.getIsClipped();
        boolean isSpecialOffer = legacyCouponJson.getIsSpecialOffer();
        String title = offerJsonL.getTitle();
        String description = offerJsonL.getDescription();
        List<String> listQ = offerJsonL.q();
        String hatText = offerJsonL.getHatText();
        Coupon.d dVarE = e(offerJsonL.getHatColor());
        Coupon.EnumC0469a enumC0469aD = d(offerJsonL.getBorderColor());
        boolean isMeijerBuck = offerJsonL.getIsMeijerBuck();
        boolean isShowLargeImage = offerJsonL.getIsShowLargeImage();
        String imageURL = offerJsonL.getImageURL();
        String largeImageURL = offerJsonL.getLargeImageURL();
        String termsAndConditions = offerJsonL.getTermsAndConditions();
        boolean isManufacturerCoupon = offerJsonL.getIsManufacturerCoupon();
        String redemptionStartDate = offerJsonL.getRedemptionStartDate();
        if (redemptionStartDate != null) {
            j10 = offerId;
            localDateTime = (LocalDateTime) wk.d.b(redemptionStartDate, C17898a.f167225a.s(), new j());
        } else {
            j10 = offerId;
            localDateTime = null;
        }
        String redemptionEndDate = offerJsonL.getRedemptionEndDate();
        LocalDateTime localDateTime4 = redemptionEndDate != null ? (LocalDateTime) wk.d.b(redemptionEndDate, C17898a.f167225a.s(), new j()) : null;
        String redemptionDate = legacyCouponJson.getRedemptionDate();
        if (redemptionDate != null) {
            localDateTime2 = localDateTime;
            localDateTime3 = (LocalDateTime) wk.d.b(redemptionDate, C17898a.f167225a.s(), new j());
        } else {
            localDateTime2 = localDateTime;
            localDateTime3 = null;
        }
        CouponCategoryJson category = offerJsonL.getCategory();
        return new Coupon(j10, isSuggested, isHidden, couponInclusionGroupTag, couponExpirationGroupTag, isClipped, isSpecialOffer, title, description, listQ, hatText, dVarE, enumC0469aD, isMeijerBuck, isShowLargeImage, imageURL, largeImageURL, termsAndConditions, isManufacturerCoupon, localDateTime2, localDateTime4, localDateTime3, category != null ? h(category) : null, offerJsonL.getCategoryName(), false, false, null, a(offerJsonL), c(offerJsonL), b(offerJsonL), 117440512, null);
    }

    public static final CouponCategory h(CouponCategoryJson couponCategoryJson) {
        Intrinsics.j(couponCategoryJson, "<this>");
        return new CouponCategory(couponCategoryJson.getSegmentID(), couponCategoryJson.getSegmentName());
    }

    private static final CouponsResponse.EnumC2049a i(CouponsResponseJson.CouponsResponseCode couponsResponseCode) {
        switch (couponsResponseCode == null ? -1 : C2022a.$EnumSwitchMapping$2[couponsResponseCode.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return CouponsResponse.EnumC2049a.f130224c;
            case 2:
                return CouponsResponse.EnumC2049a.f130225d;
            case 3:
                return CouponsResponse.EnumC2049a.f130226e;
            case 4:
                return CouponsResponse.EnumC2049a.f130227f;
            case 5:
                return CouponsResponse.EnumC2049a.f130228g;
            case 6:
                return CouponsResponse.EnumC2049a.f130229h;
            case 7:
                return CouponsResponse.EnumC2049a.f130230i;
            case 8:
                return CouponsResponse.EnumC2049a.f130231j;
            case 9:
                return CouponsResponse.EnumC2049a.f130232k;
            case 10:
                return CouponsResponse.EnumC2049a.f130233l;
            case 11:
                return CouponsResponse.EnumC2049a.f130234m;
            case 12:
                return CouponsResponse.EnumC2049a.f130235n;
        }
    }

    public static final CouponsResponse j(CouponsResponseJson couponsResponseJson, String str) {
        List listM;
        Intrinsics.j(couponsResponseJson, "<this>");
        int couponCount = couponsResponseJson.getCouponCount();
        int availableCouponCount = couponsResponseJson.getAvailableCouponCount();
        List<CouponJson> listD = couponsResponseJson.d();
        if (listD != null) {
            List<CouponJson> list = listD;
            listM = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                listM.add(f((CouponJson) it.next()));
            }
        } else {
            listM = null;
        }
        if (listM == null) {
            listM = CollectionsKt.m();
        }
        return new CouponsResponse(couponCount, availableCouponCount, listM, i(couponsResponseJson.getResponseCode()), couponsResponseJson.getResponseMessage(), couponsResponseJson.getHasSpecialOffers(), str);
    }

    public static /* synthetic */ CouponsResponse k(CouponsResponseJson couponsResponseJson, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return j(couponsResponseJson, str);
    }

    public static final OfferJson l(LegacyCouponJson legacyCouponJson) {
        Intrinsics.j(legacyCouponJson, "<this>");
        return new OfferJson(legacyCouponJson.getOfferId(), legacyCouponJson.getTitle(), legacyCouponJson.getDescription(), legacyCouponJson.t(), legacyCouponJson.getHatText(), legacyCouponJson.getHatColor(), legacyCouponJson.getBorderColor(), legacyCouponJson.getIsMeijerBuck(), legacyCouponJson.getIsShowLargeImage(), legacyCouponJson.getImageURL(), legacyCouponJson.getLargeImageURL(), legacyCouponJson.getTermsAndConditions(), legacyCouponJson.getIsManufacturerCoupon(), legacyCouponJson.getRedemptionStartDate(), legacyCouponJson.getRedemptionEndDate(), legacyCouponJson.getCategory(), legacyCouponJson.getCategoryName(), legacyCouponJson.getRedeemAmount(), legacyCouponJson.getRewardType(), legacyCouponJson.getDiscountLevel(), legacyCouponJson.getConditionType(), legacyCouponJson.getConditionValue());
    }
}
