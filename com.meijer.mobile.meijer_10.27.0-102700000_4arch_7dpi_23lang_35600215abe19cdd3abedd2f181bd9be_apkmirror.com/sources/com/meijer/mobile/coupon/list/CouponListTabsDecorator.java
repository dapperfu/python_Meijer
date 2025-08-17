package com.meijer.mobile.coupon.list;

import Ok.Coupon;
import Ok.CouponCategory;
import Xk.CouponState;
import Xr.a;
import ak.AbstractC5607a;
import com.meijer.mobile.core.models.coupon.CouponAd;
import com.meijer.mobile.coupon.list.CouponListTabsDecorator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 62\u00020\u0001:\u0001\u0015B\u0089\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0092\u0001\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\nHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b(\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010\u001aR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b$\u0010-R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b)\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0018R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\u001e\u001a\u0004\b.\u0010 R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010,\u001a\u0004\b/\u0010-R\u0011\u00104\u001a\u0002028F¢\u0006\u0006\u001a\u0004\b&\u00103R\u0011\u00105\u001a\u0002028F¢\u0006\u0006\u001a\u0004\b+\u00103¨\u00067"}, d2 = {"Lcom/meijer/mobile/coupon/list/J;", "", "", "isStoreSet", "", "cartItemCount", "filteredAvailableCouponsCount", "availableCouponsCount", "filteredClippedCouponsCount", "clippedCouponsCount", "", "LXk/c;", "availableCouponStateList", "clippedCouponStateList", "", "specialOffersBannerUrl", "hasSpecialOffers", "Lcom/meijer/mobile/core/models/coupon/CouponAd;", "listOfCouponAds", "<init>", "(ZIIIIILjava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/util/List;)V", "a", "(ZIIIIILjava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/util/List;)Lcom/meijer/mobile/coupon/list/J;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "k", "()Z", "b", "I", "e", "c", "getFilteredAvailableCouponsCount", "d", "getAvailableCouponsCount", "getFilteredClippedCouponsCount", "f", "getClippedCouponsCount", "g", "Ljava/util/List;", "()Ljava/util/List;", "h", "i", "Ljava/lang/String;", "j", "Lak/a;", "()Lak/a;", "availableCouponsCountText", "clippedCouponsCountText", "l", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.coupon.list.J, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class CouponListTabsDecorator {

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: m, reason: collision with root package name */
    public static final int f96584m = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isStoreSet;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int cartItemCount;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int filteredAvailableCouponsCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int availableCouponsCount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int filteredClippedCouponsCount;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int clippedCouponsCount;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<CouponState> availableCouponStateList;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<CouponState> clippedCouponStateList;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String specialOffersBannerUrl;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasSpecialOffers;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<CouponAd> listOfCouponAds;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJO\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/coupon/list/J$a;", "", "<init>", "()V", "", "showCategoryHeaders", "", "LOk/a;", "coupons", "b", "(ZLjava/util/List;)Z", "LXk/c;", "listOfCouponStates", "showSpecialOfferBanner", "", "specialOffersUrl", "Lcom/meijer/mobile/core/models/coupon/CouponAd;", "couponAds", "LXr/a;", "c", "(Ljava/util/List;ZZLjava/lang/String;Ljava/util/List;)Ljava/util/List;", "", "COUPON_AD_START_INDEX", "I", "COUPON_AD_INTERVAL", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.coupon.list.J$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean b(boolean showCategoryHeaders, List<Coupon> coupons) {
            if (!showCategoryHeaders || coupons.isEmpty()) {
                return false;
            }
            List<Coupon> list = coupons;
            boolean z10 = list instanceof Collection;
            if (!z10 || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    CouponCategory category = ((Coupon) it.next()).getCategory();
                    if ((category != null ? category.getSegmentID() : null) == null) {
                        return false;
                    }
                }
            }
            if (z10 && list.isEmpty()) {
                return true;
            }
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                CouponCategory category2 = ((Coupon) it2.next()).getCategory();
                if ((category2 != null ? category2.getSegmentName() : null) == null) {
                    return false;
                }
            }
            return true;
        }

        private Companion() {
        }

        public static /* synthetic */ List d(Companion companion, List list, boolean z10, boolean z11, String str, List list2, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            boolean z12 = z11;
            if ((i10 & 8) != 0) {
                str = null;
            }
            String str2 = str;
            if ((i10 & 16) != 0) {
                list2 = CollectionsKt.m();
            }
            return companion.c(list, z10, z12, str2, list2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Ref.IntRef intRef, List list, List list2, List listOfCoupons) {
            int i10;
            Intrinsics.j(listOfCoupons, "listOfCoupons");
            Iterator it = listOfCoupons.iterator();
            while (it.hasNext()) {
                Coupon coupon = (Coupon) it.next();
                intRef.f142833a++;
                list.add(new a.Coupon(Qr.a.n(coupon)));
                if (!list2.isEmpty() && (i10 = intRef.f142833a) >= 9 && (i10 - 9) % 3 == 0) {
                    list.add(list2.remove(0));
                }
            }
            return Unit.f142422a;
        }

        public final List<Xr.a> c(List<CouponState> listOfCouponStates, boolean showCategoryHeaders, boolean showSpecialOfferBanner, String specialOffersUrl, List<CouponAd> couponAds) {
            Intrinsics.j(listOfCouponStates, "listOfCouponStates");
            Intrinsics.j(couponAds, "couponAds");
            final ArrayList arrayList = new ArrayList();
            List<CouponState> list = listOfCouponStates;
            ArrayList<Coupon> arrayList2 = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((CouponState) it.next()).getCoupon());
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it2 = couponAds.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                String imageURL = ((CouponAd) next).getImageURL();
                if (!(imageURL == null || imageURL.length() == 0)) {
                    arrayList3.add(next);
                }
            }
            ArrayList arrayList4 = new ArrayList(CollectionsKt.x(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(K.a((CouponAd) it3.next()));
            }
            final List listM1 = CollectionsKt.m1(arrayList4);
            final Ref.IntRef intRef = new Ref.IntRef();
            Function1 function1 = new Function1() { // from class: com.meijer.mobile.coupon.list.I
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CouponListTabsDecorator.Companion.e(intRef, arrayList, listM1, (List) obj);
                }
            };
            if (showSpecialOfferBanner) {
                arrayList.add(new a.SpecialOffersBanner(specialOffersUrl, false, 2, null));
            }
            if (!b(showCategoryHeaders, arrayList2)) {
                function1.invoke(arrayList2);
                return arrayList;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Coupon coupon : arrayList2) {
                CouponCategory category = coupon.getCategory();
                String segmentName = category != null ? category.getSegmentName() : null;
                Intrinsics.g(segmentName);
                List arrayList5 = (List) linkedHashMap.get(segmentName);
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                arrayList5.add(coupon);
                CouponCategory category2 = coupon.getCategory();
                String segmentName2 = category2 != null ? category2.getSegmentName() : null;
                Intrinsics.g(segmentName2);
                linkedHashMap.put(segmentName2, arrayList5);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                List list2 = (List) entry.getValue();
                arrayList.add(new a.Header(str, list2.size()));
                function1.invoke(list2);
            }
            return arrayList;
        }
    }

    public CouponListTabsDecorator() {
        this(false, 0, 0, 0, 0, 0, null, null, null, false, null, 2047, null);
    }

    public static /* synthetic */ CouponListTabsDecorator b(CouponListTabsDecorator couponListTabsDecorator, boolean z10, int i10, int i11, int i12, int i13, int i14, List list, List list2, String str, boolean z11, List list3, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z10 = couponListTabsDecorator.isStoreSet;
        }
        if ((i15 & 2) != 0) {
            i10 = couponListTabsDecorator.cartItemCount;
        }
        if ((i15 & 4) != 0) {
            i11 = couponListTabsDecorator.filteredAvailableCouponsCount;
        }
        if ((i15 & 8) != 0) {
            i12 = couponListTabsDecorator.availableCouponsCount;
        }
        if ((i15 & 16) != 0) {
            i13 = couponListTabsDecorator.filteredClippedCouponsCount;
        }
        if ((i15 & 32) != 0) {
            i14 = couponListTabsDecorator.clippedCouponsCount;
        }
        if ((i15 & 64) != 0) {
            list = couponListTabsDecorator.availableCouponStateList;
        }
        if ((i15 & 128) != 0) {
            list2 = couponListTabsDecorator.clippedCouponStateList;
        }
        if ((i15 & 256) != 0) {
            str = couponListTabsDecorator.specialOffersBannerUrl;
        }
        if ((i15 & 512) != 0) {
            z11 = couponListTabsDecorator.hasSpecialOffers;
        }
        if ((i15 & 1024) != 0) {
            list3 = couponListTabsDecorator.listOfCouponAds;
        }
        boolean z12 = z11;
        List list4 = list3;
        List list5 = list2;
        String str2 = str;
        int i16 = i14;
        List list6 = list;
        int i17 = i13;
        int i18 = i11;
        return couponListTabsDecorator.a(z10, i10, i18, i12, i17, i16, list6, list5, str2, z12, list4);
    }

    public final CouponListTabsDecorator a(boolean isStoreSet, int cartItemCount, int filteredAvailableCouponsCount, int availableCouponsCount, int filteredClippedCouponsCount, int clippedCouponsCount, List<CouponState> availableCouponStateList, List<CouponState> clippedCouponStateList, String specialOffersBannerUrl, boolean hasSpecialOffers, List<CouponAd> listOfCouponAds) {
        Intrinsics.j(availableCouponStateList, "availableCouponStateList");
        Intrinsics.j(clippedCouponStateList, "clippedCouponStateList");
        Intrinsics.j(listOfCouponAds, "listOfCouponAds");
        return new CouponListTabsDecorator(isStoreSet, cartItemCount, filteredAvailableCouponsCount, availableCouponsCount, filteredClippedCouponsCount, clippedCouponsCount, availableCouponStateList, clippedCouponStateList, specialOffersBannerUrl, hasSpecialOffers, listOfCouponAds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponListTabsDecorator)) {
            return false;
        }
        CouponListTabsDecorator couponListTabsDecorator = (CouponListTabsDecorator) other;
        return this.isStoreSet == couponListTabsDecorator.isStoreSet && this.cartItemCount == couponListTabsDecorator.cartItemCount && this.filteredAvailableCouponsCount == couponListTabsDecorator.filteredAvailableCouponsCount && this.availableCouponsCount == couponListTabsDecorator.availableCouponsCount && this.filteredClippedCouponsCount == couponListTabsDecorator.filteredClippedCouponsCount && this.clippedCouponsCount == couponListTabsDecorator.clippedCouponsCount && Intrinsics.e(this.availableCouponStateList, couponListTabsDecorator.availableCouponStateList) && Intrinsics.e(this.clippedCouponStateList, couponListTabsDecorator.clippedCouponStateList) && Intrinsics.e(this.specialOffersBannerUrl, couponListTabsDecorator.specialOffersBannerUrl) && this.hasSpecialOffers == couponListTabsDecorator.hasSpecialOffers && Intrinsics.e(this.listOfCouponAds, couponListTabsDecorator.listOfCouponAds);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((Boolean.hashCode(this.isStoreSet) * 31) + Integer.hashCode(this.cartItemCount)) * 31) + Integer.hashCode(this.filteredAvailableCouponsCount)) * 31) + Integer.hashCode(this.availableCouponsCount)) * 31) + Integer.hashCode(this.filteredClippedCouponsCount)) * 31) + Integer.hashCode(this.clippedCouponsCount)) * 31) + this.availableCouponStateList.hashCode()) * 31) + this.clippedCouponStateList.hashCode()) * 31;
        String str = this.specialOffersBannerUrl;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.hasSpecialOffers)) * 31) + this.listOfCouponAds.hashCode();
    }

    public String toString() {
        return "CouponListTabsDecorator(isStoreSet=" + this.isStoreSet + ", cartItemCount=" + this.cartItemCount + ", filteredAvailableCouponsCount=" + this.filteredAvailableCouponsCount + ", availableCouponsCount=" + this.availableCouponsCount + ", filteredClippedCouponsCount=" + this.filteredClippedCouponsCount + ", clippedCouponsCount=" + this.clippedCouponsCount + ", availableCouponStateList=" + this.availableCouponStateList + ", clippedCouponStateList=" + this.clippedCouponStateList + ", specialOffersBannerUrl=" + this.specialOffersBannerUrl + ", hasSpecialOffers=" + this.hasSpecialOffers + ", listOfCouponAds=" + this.listOfCouponAds + ')';
    }

    public CouponListTabsDecorator(boolean z10, int i10, int i11, int i12, int i13, int i14, List<CouponState> availableCouponStateList, List<CouponState> clippedCouponStateList, String str, boolean z11, List<CouponAd> listOfCouponAds) {
        Intrinsics.j(availableCouponStateList, "availableCouponStateList");
        Intrinsics.j(clippedCouponStateList, "clippedCouponStateList");
        Intrinsics.j(listOfCouponAds, "listOfCouponAds");
        this.isStoreSet = z10;
        this.cartItemCount = i10;
        this.filteredAvailableCouponsCount = i11;
        this.availableCouponsCount = i12;
        this.filteredClippedCouponsCount = i13;
        this.clippedCouponsCount = i14;
        this.availableCouponStateList = availableCouponStateList;
        this.clippedCouponStateList = clippedCouponStateList;
        this.specialOffersBannerUrl = str;
        this.hasSpecialOffers = z11;
        this.listOfCouponAds = listOfCouponAds;
    }

    public final List<CouponState> c() {
        return this.availableCouponStateList;
    }

    public final AbstractC5607a d() {
        int i10 = this.filteredAvailableCouponsCount;
        int i11 = this.availableCouponsCount;
        return i10 == i11 ? AbstractC5607a.INSTANCE.b(Nr.f.f22684d, i11, new Object[0]) : AbstractC5607a.INSTANCE.d(Nr.g.f22762v, Integer.valueOf(i10), Integer.valueOf(this.availableCouponsCount));
    }

    /* renamed from: e, reason: from getter */
    public final int getCartItemCount() {
        return this.cartItemCount;
    }

    public final List<CouponState> f() {
        return this.clippedCouponStateList;
    }

    public final AbstractC5607a g() {
        int i10 = this.filteredClippedCouponsCount;
        int i11 = this.clippedCouponsCount;
        return i10 == i11 ? AbstractC5607a.INSTANCE.b(Nr.f.f22684d, i11, new Object[0]) : AbstractC5607a.INSTANCE.d(Nr.g.f22762v, Integer.valueOf(i10), Integer.valueOf(this.clippedCouponsCount));
    }

    /* renamed from: h, reason: from getter */
    public final boolean getHasSpecialOffers() {
        return this.hasSpecialOffers;
    }

    public final List<CouponAd> i() {
        return this.listOfCouponAds;
    }

    /* renamed from: j, reason: from getter */
    public final String getSpecialOffersBannerUrl() {
        return this.specialOffersBannerUrl;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getIsStoreSet() {
        return this.isStoreSet;
    }

    public /* synthetic */ CouponListTabsDecorator(boolean z10, int i10, int i11, int i12, int i13, int i14, List list, List list2, String str, boolean z11, List list3, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? false : z10, (i15 & 2) != 0 ? 0 : i10, (i15 & 4) != 0 ? 0 : i11, (i15 & 8) != 0 ? 0 : i12, (i15 & 16) != 0 ? 0 : i13, (i15 & 32) != 0 ? 0 : i14, (i15 & 64) != 0 ? CollectionsKt.m() : list, (i15 & 128) != 0 ? CollectionsKt.m() : list2, (i15 & 256) != 0 ? null : str, (i15 & 512) != 0 ? false : z11, (i15 & 1024) != 0 ? CollectionsKt.m() : list3);
    }
}
