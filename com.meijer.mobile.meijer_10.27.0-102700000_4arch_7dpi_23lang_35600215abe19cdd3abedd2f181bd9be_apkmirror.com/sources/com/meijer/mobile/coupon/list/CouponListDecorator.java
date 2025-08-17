package com.meijer.mobile.coupon.list;

import Fq.ShoppingListItem;
import Ok.Coupon;
import Ok.CouponCategory;
import Xk.CouponState;
import Xr.CouponListItemDecorator;
import Xr.a;
import com.meijer.mobile.coupon.list.W;
import el.C13686c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\rB7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ@\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0017\u0010\u0012R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/meijer/mobile/coupon/list/o;", "", "", "couponsCount", "", "LXk/c;", "couponStateList", "", "specialOffersBannerUrl", "", "hasSpecialOffers", "<init>", "(ILjava/util/List;Ljava/lang/String;Z)V", "a", "(ILjava/util/List;Ljava/lang/String;Z)Lcom/meijer/mobile/coupon/list/o;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "d", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Ljava/lang/String;", "f", "Z", "e", "()Z", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.coupon.list.o, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class CouponListDecorator {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f96856f = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int couponsCount;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<CouponState> couponStateList;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String specialOffersBannerUrl;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasSpecialOffers;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0081\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/coupon/list/o$a;", "", "<init>", "()V", "", "LXk/c;", "listOfCouponStates", "Lcom/meijer/mobile/coupon/list/W;", "couponPage", "", "showSpecialOfferBanner", "", "specialOffersUrl", "adBannerUrl", "adBannerTitle", "adBannerDescription", "totalCouponsText", "LFq/c;", "shoppingList", "LXr/a;", "a", "(Ljava/util/List;Lcom/meijer/mobile/coupon/list/W;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "SPECIAL_OFFERS_REDEEMED_SECTION", "Ljava/lang/String;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.coupon.list.o$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Xr.a> a(List<CouponState> listOfCouponStates, W couponPage, boolean showSpecialOfferBanner, String specialOffersUrl, String adBannerUrl, String adBannerTitle, String adBannerDescription, String totalCouponsText, List<ShoppingListItem> shoppingList) {
            String itemDescription;
            Intrinsics.j(listOfCouponStates, "listOfCouponStates");
            Intrinsics.j(couponPage, "couponPage");
            ArrayList arrayList = new ArrayList();
            if (adBannerUrl != null && adBannerUrl.length() != 0) {
                arrayList.add(new a.Ad(adBannerUrl, adBannerTitle, null, null, adBannerDescription, 12, null));
            }
            if (showSpecialOfferBanner) {
                boolean z10 = adBannerUrl == null || adBannerUrl.length() == 0;
                arrayList.add(new a.SpecialOffersBanner(specialOffersUrl, !z10));
                if (z10 && totalCouponsText != null && totalCouponsText.length() != 0) {
                    arrayList.add(new a.SpecialOffersHeader(totalCouponsText));
                }
            }
            if (couponPage instanceof W.d) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                List<CouponState> list = listOfCouponStates;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((CouponState) it.next()).getCoupon());
                }
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    String segmentName = "Special Offers Redeemed";
                    if (!it2.hasNext()) {
                        break;
                    }
                    Coupon coupon = (Coupon) it2.next();
                    if (!C13686c.f(coupon)) {
                        CouponCategory category = coupon.getCategory();
                        segmentName = category != null ? category.getSegmentName() : null;
                        Intrinsics.g(segmentName);
                    }
                    List arrayList3 = (List) linkedHashMap.get(segmentName);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(coupon);
                    linkedHashMap.put(segmentName, arrayList3);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str = (String) entry.getKey();
                    List list2 = (List) entry.getValue();
                    if (Intrinsics.e(str, "Special Offers Redeemed")) {
                        arrayList.add(new a.Header(str, list2.size()));
                    }
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(new a.Coupon(Qr.a.n((Coupon) it3.next())));
                    }
                }
                Unit unit = Unit.f142422a;
                return arrayList;
            }
            if (couponPage instanceof W.AdCoupons) {
                List<CouponState> list3 = listOfCouponStates;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.x(list3, 10));
                Iterator<T> it4 = list3.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(Boolean.valueOf(arrayList.add(new a.Coupon(Qr.a.n(((CouponState) it4.next()).getCoupon())))));
                }
            } else if (couponPage instanceof W.BundleCoupons) {
                List<CouponState> list4 = listOfCouponStates;
                ArrayList arrayList5 = new ArrayList(CollectionsKt.x(list4, 10));
                Iterator<T> it5 = list4.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(Boolean.valueOf(arrayList.add(new a.Coupon(CouponListItemDecorator.b(Qr.a.n(((CouponState) it5.next()).getCoupon()), null, null, null, null, null, null, null, null, false, null, false, false, 4079, null)))));
                }
            } else {
                if (!(couponPage instanceof W.RelatedShoppingList)) {
                    Unit unit2 = Unit.f142422a;
                    return arrayList;
                }
                ArrayList arrayList6 = new ArrayList();
                if (shoppingList != null) {
                    ArrayList<String> arrayList7 = new ArrayList();
                    for (ShoppingListItem shoppingListItem : shoppingList) {
                        if (!shoppingListItem.s() && !shoppingListItem.getIsComplete() && (itemDescription = shoppingListItem.getItemDescription()) != null) {
                            int length = itemDescription.length();
                            int i10 = 0;
                            while (true) {
                                if (i10 >= length) {
                                    break;
                                }
                                if (Character.isLetter(itemDescription.charAt(i10))) {
                                    String strSubstring = itemDescription.substring(i10);
                                    Intrinsics.i(strSubstring, "substring(...)");
                                    String string = StringsKt.y1(strSubstring).toString();
                                    if (!arrayList7.contains(string)) {
                                        String lowerCase = string.toLowerCase(Locale.ROOT);
                                        Intrinsics.i(lowerCase, "toLowerCase(...)");
                                        arrayList7.add(lowerCase);
                                    }
                                } else {
                                    i10++;
                                }
                            }
                        }
                    }
                    for (String str2 : arrayList7) {
                        for (CouponState couponState : listOfCouponStates) {
                            CouponCategory category2 = couponState.getCoupon().getCategory();
                            Intrinsics.g(category2);
                            String segmentName2 = category2.getSegmentName();
                            if (segmentName2 == null) {
                                segmentName2 = "";
                            }
                            Locale locale = Locale.ROOT;
                            String lowerCase2 = segmentName2.toLowerCase(locale);
                            Intrinsics.i(lowerCase2, "toLowerCase(...)");
                            if (!StringsKt.c0(lowerCase2, str2, false, 2, null)) {
                                String lowerCase3 = couponState.getCoupon().getTitle().toLowerCase(locale);
                                Intrinsics.i(lowerCase3, "toLowerCase(...)");
                                if (!StringsKt.c0(lowerCase3, str2, false, 2, null)) {
                                    String lowerCase4 = couponState.getCoupon().getDescription().toLowerCase(locale);
                                    Intrinsics.i(lowerCase4, "toLowerCase(...)");
                                    if (StringsKt.c0(lowerCase4, str2, false, 2, null)) {
                                    }
                                }
                            }
                            if (!arrayList6.contains(couponState.getCoupon())) {
                                arrayList6.add(couponState.getCoupon());
                            }
                        }
                    }
                    for (ShoppingListItem shoppingListItem2 : shoppingList) {
                        for (CouponState couponState2 : listOfCouponStates) {
                            if (couponState2.getOfferId() == shoppingListItem2.getCouponId() && !arrayList6.contains(couponState2.getCoupon())) {
                                arrayList6.add(couponState2.getCoupon());
                            }
                        }
                    }
                }
                ArrayList arrayList8 = new ArrayList(CollectionsKt.x(arrayList6, 10));
                Iterator it6 = arrayList6.iterator();
                while (it6.hasNext()) {
                    arrayList8.add(Boolean.valueOf(arrayList.add(new a.Coupon(Qr.a.n((Coupon) it6.next())))));
                }
            }
            return arrayList;
        }
    }

    public CouponListDecorator() {
        this(0, null, null, false, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CouponListDecorator b(CouponListDecorator couponListDecorator, int i10, List list, String str, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = couponListDecorator.couponsCount;
        }
        if ((i11 & 2) != 0) {
            list = couponListDecorator.couponStateList;
        }
        if ((i11 & 4) != 0) {
            str = couponListDecorator.specialOffersBannerUrl;
        }
        if ((i11 & 8) != 0) {
            z10 = couponListDecorator.hasSpecialOffers;
        }
        return couponListDecorator.a(i10, list, str, z10);
    }

    public final CouponListDecorator a(int couponsCount, List<CouponState> couponStateList, String specialOffersBannerUrl, boolean hasSpecialOffers) {
        Intrinsics.j(couponStateList, "couponStateList");
        return new CouponListDecorator(couponsCount, couponStateList, specialOffersBannerUrl, hasSpecialOffers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponListDecorator)) {
            return false;
        }
        CouponListDecorator couponListDecorator = (CouponListDecorator) other;
        return this.couponsCount == couponListDecorator.couponsCount && Intrinsics.e(this.couponStateList, couponListDecorator.couponStateList) && Intrinsics.e(this.specialOffersBannerUrl, couponListDecorator.specialOffersBannerUrl) && this.hasSpecialOffers == couponListDecorator.hasSpecialOffers;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.couponsCount) * 31) + this.couponStateList.hashCode()) * 31;
        String str = this.specialOffersBannerUrl;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.hasSpecialOffers);
    }

    public String toString() {
        return "CouponListDecorator(couponsCount=" + this.couponsCount + ", couponStateList=" + this.couponStateList + ", specialOffersBannerUrl=" + this.specialOffersBannerUrl + ", hasSpecialOffers=" + this.hasSpecialOffers + ')';
    }

    public CouponListDecorator(int i10, List<CouponState> couponStateList, String str, boolean z10) {
        Intrinsics.j(couponStateList, "couponStateList");
        this.couponsCount = i10;
        this.couponStateList = couponStateList;
        this.specialOffersBannerUrl = str;
        this.hasSpecialOffers = z10;
    }

    public final List<CouponState> c() {
        return this.couponStateList;
    }

    /* renamed from: d, reason: from getter */
    public final int getCouponsCount() {
        return this.couponsCount;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getHasSpecialOffers() {
        return this.hasSpecialOffers;
    }

    /* renamed from: f, reason: from getter */
    public final String getSpecialOffersBannerUrl() {
        return this.specialOffersBannerUrl;
    }

    public /* synthetic */ CouponListDecorator(int i10, List list, String str, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? CollectionsKt.m() : list, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? false : z10);
    }
}
