package com.meijer.mobile.coupons.api.models;

import Rk.CouponOptions;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.coupon.model.search.CouponsSortType;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b8\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0001)B\u0087\u0002\b\u0001\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u000e\b\u0003\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0003\u0010\u0018\u001a\u00020\u0013\u0012\b\b\u0003\u0010\u0019\u001a\u00020\u0013\u0012\u000e\b\u0003\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015\u0012\u000e\b\u0003\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\u008e\u0002\u0010!\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u000e\b\u0003\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00152\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00132\b\b\u0003\u0010\u0018\u001a\u00020\u00132\b\b\u0003\u0010\u0019\u001a\u00020\u00132\u000e\b\u0003\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u00152\u000e\b\u0003\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u0013HÀ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00132\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010%R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b)\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b1\u00104\u001a\u0004\b5\u00106R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b7\u00103\u001a\u0004\b8\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b9\u00103\u001a\u0004\b:\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b5\u00104\u001a\u0004\b;\u00106R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b<\u00103\u001a\u0004\b2\u0010#R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b/\u00104\u001a\u0004\b-\u00106R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b=\u00104\u001a\u0004\b0\u00106R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b8\u0010>\u001a\u0004\b=\u0010?R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b@\u00103\u001a\u0004\bA\u0010#R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b9\u0010DR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00158\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b+\u0010C\u001a\u0004\b@\u0010DR\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b;\u0010I\u001a\u0004\bB\u0010JR\u0017\u0010\u0019\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bA\u0010I\u001a\u0004\bE\u0010JR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u00158\u0006¢\u0006\f\n\u0004\bG\u0010F\u001a\u0004\b<\u0010HR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00158\u0006¢\u0006\f\n\u0004\b:\u0010F\u001a\u0004\b7\u0010HR\u0017\u0010\u001c\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bK\u0010I\u001a\u0004\bK\u0010J¨\u0006M"}, d2 = {"Lcom/meijer/mobile/coupons/api/models/CouponsRequest;", "", "Lcom/meijer/mobile/coupon/model/search/CouponsSortType;", "sortType", "", "pageSize", "currentPage", "", "categoryId", "offerClass", "searchCriteria", "zip", "storeId", "clippedFromTS", "ceilingCount", "ceilingDuration", "", "rewardCouponId", "tagId", "", "getOfferCountPerCategory", "", "upcList", "showClippedCoupons", "showOnlySpecialOffers", "showRedeemedOffers", "offerIds", "displayReasonFilters", "isClippedCouponsRequest", "<init>", "(Lcom/meijer/mobile/coupon/model/search/CouponsSortType;IILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;ZZLjava/util/List;Ljava/util/List;Z)V", "copy$coupons_release", "(Lcom/meijer/mobile/coupon/model/search/CouponsSortType;IILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;ZZLjava/util/List;Ljava/util/List;Z)Lcom/meijer/mobile/coupons/api/models/CouponsRequest;", "copy", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/coupon/model/search/CouponsSortType;", "p", "()Lcom/meijer/mobile/coupon/model/search/CouponsSortType;", "b", "I", "j", "c", "e", "d", "Ljava/lang/String;", "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", "f", "l", "g", "t", "q", "i", "k", "Ljava/lang/Long;", "()Ljava/lang/Long;", "m", "r", "n", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "o", "Ljava/util/List;", "s", "()Ljava/util/List;", "Z", "()Z", "u", "v", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CouponsRequest {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final CouponsSortType sortType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int pageSize;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int currentPage;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String categoryId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer offerClass;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String searchCriteria;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String zip;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer storeId;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clippedFromTS;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer ceilingCount;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer ceilingDuration;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long rewardCouponId;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String tagId;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean getOfferCountPerCategory;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Long> upcList;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean showClippedCoupons;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showOnlySpecialOffers;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showRedeemedOffers;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Long> offerIds;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> displayReasonFilters;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final transient boolean isClippedCouponsRequest;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0014\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/coupons/api/models/CouponsRequest$a;", "", "<init>", "()V", "Lcom/meijer/mobile/coupon/model/search/CouponsSortType;", "sortType", "", "categoryId", "Lcom/meijer/mobile/coupons/api/models/CouponsRequest;", "a", "(Lcom/meijer/mobile/coupon/model/search/CouponsSortType;Ljava/lang/String;)Lcom/meijer/mobile/coupons/api/models/CouponsRequest;", "zip", "", "storeId", "d", "(Ljava/lang/String;I)Lcom/meijer/mobile/coupons/api/models/CouponsRequest;", "LRk/a;", "couponOptions", "b", "(LRk/a;Ljava/lang/String;I)Lcom/meijer/mobile/coupons/api/models/CouponsRequest;", "c", "(Ljava/lang/String;ILRk/a;)Lcom/meijer/mobile/coupons/api/models/CouponsRequest;", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.coupons.api.models.CouponsRequest$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final CouponsRequest b(CouponOptions couponOptions, String zip, int storeId) {
            int i10 = 0;
            Intrinsics.j(couponOptions, "couponOptions");
            List<Long> listK = couponOptions.k();
            long rewardId = couponOptions.getRewardId();
            String searchCriteria = couponOptions.getSearchCriteria();
            String tagId = couponOptions.getTagId();
            CouponsSortType couponsSortTypeI = couponOptions.i();
            List<String> listE = couponOptions.e();
            if (listE.isEmpty()) {
                listE = null;
            }
            return new CouponsRequest(couponsSortTypeI, 9999, 1, listE != null ? CollectionsKt.B0(listE, ",", null, null, 0, null, null, 62, null) : null, 1, searchCriteria, zip, Integer.valueOf(storeId), null, i10, i10, Long.valueOf(rewardId), tagId, Boolean.TRUE, listK, Boolean.valueOf(couponOptions.getIsShowClippedCoupons()), false, couponOptions.getIsShowRedeemedOffers(), couponOptions.f(), null, false, 1638656, null);
        }

        private Companion() {
        }

        @JvmStatic
        public final CouponsRequest a(CouponsSortType sortType, String categoryId) {
            Intrinsics.j(sortType, "sortType");
            return new CouponsRequest(sortType, 9999, 1, categoryId, 1, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, true, 1048544, null);
        }

        @JvmStatic
        public final CouponsRequest c(String zip, int storeId, CouponOptions couponOptions) {
            Intrinsics.j(couponOptions, "couponOptions");
            List listE = CollectionsKt.e("SavingsForYou");
            boolean isShowClippedCoupons = couponOptions.getIsShowClippedCoupons();
            return new CouponsRequest(null, 9999, 1, null, null, null, zip, Integer.valueOf(storeId), null, null, null, null, null, null, null, Boolean.valueOf(isShowClippedCoupons), false, couponOptions.getIsShowRedeemedOffers(), null, listE, false, 1408825, null);
        }

        @JvmStatic
        public final CouponsRequest d(String zip, int storeId) {
            return new CouponsRequest(null, 9999, 1, null, null, null, zip, Integer.valueOf(storeId), null, null, null, null, null, null, null, null, true, true, null, null, false, 1900345, null);
        }
    }

    @JvmOverloads
    public CouponsRequest() {
        this(null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 2097151, null);
    }

    public final CouponsRequest copy$coupons_release(@g(name = "sortType") CouponsSortType sortType, @g(name = "pageSize") int pageSize, @g(name = "currentPage") int currentPage, @g(name = "categoryId") String categoryId, @g(name = "offerClass") Integer offerClass, @g(name = "searchCriteria") String searchCriteria, @g(name = "zip") String zip, @g(name = "storeId") Integer storeId, @g(name = "clippedFromTS") String clippedFromTS, @g(name = "ceilingCount") Integer ceilingCount, @g(name = "ceilingDuration") Integer ceilingDuration, @g(name = "rewardCouponId") Long rewardCouponId, @g(name = "tagId") String tagId, @g(name = "getOfferCountPerDepartment") Boolean getOfferCountPerCategory, @g(name = "upcList") List<Long> upcList, @g(name = "showClippedCoupons") Boolean showClippedCoupons, @g(name = "showOnlySpecialOffers") boolean showOnlySpecialOffers, @g(name = "showRedeemedOffers") boolean showRedeemedOffers, @g(name = "offerIds") List<Long> offerIds, @g(name = "displayReasonFilters") List<String> displayReasonFilters, boolean isClippedCouponsRequest) {
        Intrinsics.j(upcList, "upcList");
        Intrinsics.j(offerIds, "offerIds");
        Intrinsics.j(displayReasonFilters, "displayReasonFilters");
        return new CouponsRequest(sortType, pageSize, currentPage, categoryId, offerClass, searchCriteria, zip, storeId, clippedFromTS, ceilingCount, ceilingDuration, rewardCouponId, tagId, getOfferCountPerCategory, upcList, showClippedCoupons, showOnlySpecialOffers, showRedeemedOffers, offerIds, displayReasonFilters, isClippedCouponsRequest);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponsRequest)) {
            return false;
        }
        CouponsRequest couponsRequest = (CouponsRequest) other;
        return this.sortType == couponsRequest.sortType && this.pageSize == couponsRequest.pageSize && this.currentPage == couponsRequest.currentPage && Intrinsics.e(this.categoryId, couponsRequest.categoryId) && Intrinsics.e(this.offerClass, couponsRequest.offerClass) && Intrinsics.e(this.searchCriteria, couponsRequest.searchCriteria) && Intrinsics.e(this.zip, couponsRequest.zip) && Intrinsics.e(this.storeId, couponsRequest.storeId) && Intrinsics.e(this.clippedFromTS, couponsRequest.clippedFromTS) && Intrinsics.e(this.ceilingCount, couponsRequest.ceilingCount) && Intrinsics.e(this.ceilingDuration, couponsRequest.ceilingDuration) && Intrinsics.e(this.rewardCouponId, couponsRequest.rewardCouponId) && Intrinsics.e(this.tagId, couponsRequest.tagId) && Intrinsics.e(this.getOfferCountPerCategory, couponsRequest.getOfferCountPerCategory) && Intrinsics.e(this.upcList, couponsRequest.upcList) && Intrinsics.e(this.showClippedCoupons, couponsRequest.showClippedCoupons) && this.showOnlySpecialOffers == couponsRequest.showOnlySpecialOffers && this.showRedeemedOffers == couponsRequest.showRedeemedOffers && Intrinsics.e(this.offerIds, couponsRequest.offerIds) && Intrinsics.e(this.displayReasonFilters, couponsRequest.displayReasonFilters) && this.isClippedCouponsRequest == couponsRequest.isClippedCouponsRequest;
    }

    public int hashCode() {
        CouponsSortType couponsSortType = this.sortType;
        int iHashCode = (((((couponsSortType == null ? 0 : couponsSortType.hashCode()) * 31) + Integer.hashCode(this.pageSize)) * 31) + Integer.hashCode(this.currentPage)) * 31;
        String str = this.categoryId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.offerClass;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.searchCriteria;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.zip;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.storeId;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.clippedFromTS;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.ceilingCount;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.ceilingDuration;
        int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Long l10 = this.rewardCouponId;
        int iHashCode10 = (iHashCode9 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str5 = this.tagId;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.getOfferCountPerCategory;
        int iHashCode12 = (((iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31) + this.upcList.hashCode()) * 31;
        Boolean bool2 = this.showClippedCoupons;
        return ((((((((((iHashCode12 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + Boolean.hashCode(this.showOnlySpecialOffers)) * 31) + Boolean.hashCode(this.showRedeemedOffers)) * 31) + this.offerIds.hashCode()) * 31) + this.displayReasonFilters.hashCode()) * 31) + Boolean.hashCode(this.isClippedCouponsRequest);
    }

    public String toString() {
        return "CouponsRequest(sortType=" + this.sortType + ", pageSize=" + this.pageSize + ", currentPage=" + this.currentPage + ", categoryId=" + this.categoryId + ", offerClass=" + this.offerClass + ", searchCriteria=" + this.searchCriteria + ", zip=" + this.zip + ", storeId=" + this.storeId + ", clippedFromTS=" + this.clippedFromTS + ", ceilingCount=" + this.ceilingCount + ", ceilingDuration=" + this.ceilingDuration + ", rewardCouponId=" + this.rewardCouponId + ", tagId=" + this.tagId + ", getOfferCountPerCategory=" + this.getOfferCountPerCategory + ", upcList=" + this.upcList + ", showClippedCoupons=" + this.showClippedCoupons + ", showOnlySpecialOffers=" + this.showOnlySpecialOffers + ", showRedeemedOffers=" + this.showRedeemedOffers + ", offerIds=" + this.offerIds + ", displayReasonFilters=" + this.displayReasonFilters + ", isClippedCouponsRequest=" + this.isClippedCouponsRequest + ')';
    }

    @JvmOverloads
    public CouponsRequest(@g(name = "sortType") CouponsSortType couponsSortType) {
        this(couponsSortType, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 2097150, null);
    }

    /* renamed from: a, reason: from getter */
    public final String getCategoryId() {
        return this.categoryId;
    }

    /* renamed from: b, reason: from getter */
    public final Integer getCeilingCount() {
        return this.ceilingCount;
    }

    /* renamed from: c, reason: from getter */
    public final Integer getCeilingDuration() {
        return this.ceilingDuration;
    }

    /* renamed from: d, reason: from getter */
    public final String getClippedFromTS() {
        return this.clippedFromTS;
    }

    /* renamed from: e, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final List<String> f() {
        return this.displayReasonFilters;
    }

    /* renamed from: g, reason: from getter */
    public final Boolean getGetOfferCountPerCategory() {
        return this.getOfferCountPerCategory;
    }

    /* renamed from: h, reason: from getter */
    public final Integer getOfferClass() {
        return this.offerClass;
    }

    public final List<Long> i() {
        return this.offerIds;
    }

    /* renamed from: j, reason: from getter */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* renamed from: k, reason: from getter */
    public final Long getRewardCouponId() {
        return this.rewardCouponId;
    }

    /* renamed from: l, reason: from getter */
    public final String getSearchCriteria() {
        return this.searchCriteria;
    }

    /* renamed from: m, reason: from getter */
    public final Boolean getShowClippedCoupons() {
        return this.showClippedCoupons;
    }

    /* renamed from: n, reason: from getter */
    public final boolean getShowOnlySpecialOffers() {
        return this.showOnlySpecialOffers;
    }

    /* renamed from: o, reason: from getter */
    public final boolean getShowRedeemedOffers() {
        return this.showRedeemedOffers;
    }

    /* renamed from: p, reason: from getter */
    public final CouponsSortType getSortType() {
        return this.sortType;
    }

    /* renamed from: q, reason: from getter */
    public final Integer getStoreId() {
        return this.storeId;
    }

    /* renamed from: r, reason: from getter */
    public final String getTagId() {
        return this.tagId;
    }

    public final List<Long> s() {
        return this.upcList;
    }

    /* renamed from: t, reason: from getter */
    public final String getZip() {
        return this.zip;
    }

    /* renamed from: u, reason: from getter */
    public final boolean getIsClippedCouponsRequest() {
        return this.isClippedCouponsRequest;
    }

    @JvmOverloads
    public CouponsRequest(@g(name = "sortType") CouponsSortType couponsSortType, @g(name = "pageSize") int i10) {
        this(couponsSortType, i10, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 2097148, null);
    }

    @JvmOverloads
    public CouponsRequest(@g(name = "sortType") CouponsSortType couponsSortType, @g(name = "pageSize") int i10, @g(name = "currentPage") int i11) {
        this(couponsSortType, i10, i11, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 2097144, null);
    }

    @JvmOverloads
    public CouponsRequest(@g(name = "sortType") CouponsSortType couponsSortType, @g(name = "pageSize") int i10, @g(name = "currentPage") int i11, @g(name = "categoryId") String str) {
        this(couponsSortType, i10, i11, str, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 2097136, null);
    }

    @JvmOverloads
    public CouponsRequest(@g(name = "sortType") CouponsSortType couponsSortType, @g(name = "pageSize") int i10, @g(name = "currentPage") int i11, @g(name = "categoryId") String str, @g(name = "offerClass") Integer num) {
        this(couponsSortType, i10, i11, str, num, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 2097120, null);
    }

    @JvmOverloads
    public CouponsRequest(@g(name = "sortType") CouponsSortType couponsSortType, @g(name = "pageSize") int i10, @g(name = "currentPage") int i11, @g(name = "categoryId") String str, @g(name = "offerClass") Integer num, @g(name = "searchCriteria") String str2) {
        this(couponsSortType, i10, i11, str, num, str2, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 2097088, null);
    }

    @JvmOverloads
    public CouponsRequest(@g(name = "sortType") CouponsSortType couponsSortType, @g(name = "pageSize") int i10, @g(name = "currentPage") int i11, @g(name = "categoryId") String str, @g(name = "offerClass") Integer num, @g(name = "searchCriteria") String str2, @g(name = "zip") String str3) {
        this(couponsSortType, i10, i11, str, num, str2, str3, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 2097024, null);
    }

    @JvmOverloads
    public CouponsRequest(@g(name = "sortType") CouponsSortType couponsSortType, @g(name = "pageSize") int i10, @g(name = "currentPage") int i11, @g(name = "categoryId") String str, @g(name = "offerClass") Integer num, @g(name = "searchCriteria") String str2, @g(name = "zip") String str3, @g(name = "storeId") Integer num2) {
        this(couponsSortType, i10, i11, str, num, str2, str3, num2, null, null, null, null, null, null, null, null, false, false, null, null, false, 2096896, null);
    }

    @JvmOverloads
    public CouponsRequest(@g(name = "sortType") CouponsSortType couponsSortType, @g(name = "pageSize") int i10, @g(name = "currentPage") int i11, @g(name = "categoryId") String str, @g(name = "offerClass") Integer num, @g(name = "searchCriteria") String str2, @g(name = "zip") String str3, @g(name = "storeId") Integer num2, @g(name = "clippedFromTS") String str4) {
        this(couponsSortType, i10, i11, str, num, str2, str3, num2, str4, null, null, null, null, null, null, null, false, false, null, null, false, 2096640, null);
    }

    @JvmOverloads
    public CouponsRequest(@g(name = "sortType") CouponsSortType couponsSortType, @g(name = "pageSize") int i10, @g(name = "currentPage") int i11, @g(name = "categoryId") String str, @g(name = "offerClass") Integer num, @g(name = "searchCriteria") String str2, @g(name = "zip") String str3, @g(name = "storeId") Integer num2, @g(name = "clippedFromTS") String str4, @g(name = "ceilingCount") Integer num3) {
        this(couponsSortType, i10, i11, str, num, str2, str3, num2, str4, num3, null, null, null, null, null, null, false, false, null, null, false, 2096128, null);
    }

    @JvmOverloads
    public CouponsRequest(@g(name = "sortType") CouponsSortType couponsSortType, @g(name = "pageSize") int i10, @g(name = "currentPage") int i11, @g(name = "categoryId") String str, @g(name = "offerClass") Integer num, @g(name = "searchCriteria") String str2, @g(name = "zip") String str3, @g(name = "storeId") Integer num2, @g(name = "clippedFromTS") String str4, @g(name = "ceilingCount") Integer num3, @g(name = "ceilingDuration") Integer num4) {
        this(couponsSortType, i10, i11, str, num, str2, str3, num2, str4, num3, num4, null, null, null, null, null, false, false, null, null, false, 2095104, null);
    }

    @JvmOverloads
    public CouponsRequest(@g(name = "sortType") CouponsSortType couponsSortType, @g(name = "pageSize") int i10, @g(name = "currentPage") int i11, @g(name = "categoryId") String str, @g(name = "offerClass") Integer num, @g(name = "searchCriteria") String str2, @g(name = "zip") String str3, @g(name = "storeId") Integer num2, @g(name = "clippedFromTS") String str4, @g(name = "ceilingCount") Integer num3, @g(name = "ceilingDuration") Integer num4, @g(name = "rewardCouponId") Long l10) {
        this(couponsSortType, i10, i11, str, num, str2, str3, num2, str4, num3, num4, l10, null, null, null, null, false, false, null, null, false, 2093056, null);
    }

    @JvmOverloads
    public CouponsRequest(@g(name = "sortType") CouponsSortType couponsSortType, @g(name = "pageSize") int i10, @g(name = "currentPage") int i11, @g(name = "categoryId") String str, @g(name = "offerClass") Integer num, @g(name = "searchCriteria") String str2, @g(name = "zip") String str3, @g(name = "storeId") Integer num2, @g(name = "clippedFromTS") String str4, @g(name = "ceilingCount") Integer num3, @g(name = "ceilingDuration") Integer num4, @g(name = "rewardCouponId") Long l10, @g(name = "tagId") String str5) {
        this(couponsSortType, i10, i11, str, num, str2, str3, num2, str4, num3, num4, l10, str5, null, null, null, false, false, null, null, false, 2088960, null);
    }

    @JvmOverloads
    public CouponsRequest(@g(name = "sortType") CouponsSortType couponsSortType, @g(name = "pageSize") int i10, @g(name = "currentPage") int i11, @g(name = "categoryId") String str, @g(name = "offerClass") Integer num, @g(name = "searchCriteria") String str2, @g(name = "zip") String str3, @g(name = "storeId") Integer num2, @g(name = "clippedFromTS") String str4, @g(name = "ceilingCount") Integer num3, @g(name = "ceilingDuration") Integer num4, @g(name = "rewardCouponId") Long l10, @g(name = "tagId") String str5, @g(name = "getOfferCountPerDepartment") Boolean bool) {
        this(couponsSortType, i10, i11, str, num, str2, str3, num2, str4, num3, num4, l10, str5, bool, null, null, false, false, null, null, false, 2080768, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CouponsRequest(@g(name = "sortType") CouponsSortType couponsSortType, @g(name = "pageSize") int i10, @g(name = "currentPage") int i11, @g(name = "categoryId") String str, @g(name = "offerClass") Integer num, @g(name = "searchCriteria") String str2, @g(name = "zip") String str3, @g(name = "storeId") Integer num2, @g(name = "clippedFromTS") String str4, @g(name = "ceilingCount") Integer num3, @g(name = "ceilingDuration") Integer num4, @g(name = "rewardCouponId") Long l10, @g(name = "tagId") String str5, @g(name = "getOfferCountPerDepartment") Boolean bool, @g(name = "upcList") List<Long> upcList) {
        this(couponsSortType, i10, i11, str, num, str2, str3, num2, str4, num3, num4, l10, str5, bool, upcList, null, false, false, null, null, false, 2064384, null);
        Intrinsics.j(upcList, "upcList");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CouponsRequest(@g(name = "sortType") CouponsSortType couponsSortType, @g(name = "pageSize") int i10, @g(name = "currentPage") int i11, @g(name = "categoryId") String str, @g(name = "offerClass") Integer num, @g(name = "searchCriteria") String str2, @g(name = "zip") String str3, @g(name = "storeId") Integer num2, @g(name = "clippedFromTS") String str4, @g(name = "ceilingCount") Integer num3, @g(name = "ceilingDuration") Integer num4, @g(name = "rewardCouponId") Long l10, @g(name = "tagId") String str5, @g(name = "getOfferCountPerDepartment") Boolean bool, @g(name = "upcList") List<Long> upcList, @g(name = "showClippedCoupons") Boolean bool2) {
        this(couponsSortType, i10, i11, str, num, str2, str3, num2, str4, num3, num4, l10, str5, bool, upcList, bool2, false, false, null, null, false, 2031616, null);
        Intrinsics.j(upcList, "upcList");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CouponsRequest(@g(name = "sortType") CouponsSortType couponsSortType, @g(name = "pageSize") int i10, @g(name = "currentPage") int i11, @g(name = "categoryId") String str, @g(name = "offerClass") Integer num, @g(name = "searchCriteria") String str2, @g(name = "zip") String str3, @g(name = "storeId") Integer num2, @g(name = "clippedFromTS") String str4, @g(name = "ceilingCount") Integer num3, @g(name = "ceilingDuration") Integer num4, @g(name = "rewardCouponId") Long l10, @g(name = "tagId") String str5, @g(name = "getOfferCountPerDepartment") Boolean bool, @g(name = "upcList") List<Long> upcList, @g(name = "showClippedCoupons") Boolean bool2, @g(name = "showOnlySpecialOffers") boolean z10) {
        this(couponsSortType, i10, i11, str, num, str2, str3, num2, str4, num3, num4, l10, str5, bool, upcList, bool2, z10, false, null, null, false, 1966080, null);
        Intrinsics.j(upcList, "upcList");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CouponsRequest(@g(name = "sortType") CouponsSortType couponsSortType, @g(name = "pageSize") int i10, @g(name = "currentPage") int i11, @g(name = "categoryId") String str, @g(name = "offerClass") Integer num, @g(name = "searchCriteria") String str2, @g(name = "zip") String str3, @g(name = "storeId") Integer num2, @g(name = "clippedFromTS") String str4, @g(name = "ceilingCount") Integer num3, @g(name = "ceilingDuration") Integer num4, @g(name = "rewardCouponId") Long l10, @g(name = "tagId") String str5, @g(name = "getOfferCountPerDepartment") Boolean bool, @g(name = "upcList") List<Long> upcList, @g(name = "showClippedCoupons") Boolean bool2, @g(name = "showOnlySpecialOffers") boolean z10, @g(name = "showRedeemedOffers") boolean z11) {
        this(couponsSortType, i10, i11, str, num, str2, str3, num2, str4, num3, num4, l10, str5, bool, upcList, bool2, z10, z11, null, null, false, 1835008, null);
        Intrinsics.j(upcList, "upcList");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CouponsRequest(@g(name = "sortType") CouponsSortType couponsSortType, @g(name = "pageSize") int i10, @g(name = "currentPage") int i11, @g(name = "categoryId") String str, @g(name = "offerClass") Integer num, @g(name = "searchCriteria") String str2, @g(name = "zip") String str3, @g(name = "storeId") Integer num2, @g(name = "clippedFromTS") String str4, @g(name = "ceilingCount") Integer num3, @g(name = "ceilingDuration") Integer num4, @g(name = "rewardCouponId") Long l10, @g(name = "tagId") String str5, @g(name = "getOfferCountPerDepartment") Boolean bool, @g(name = "upcList") List<Long> upcList, @g(name = "showClippedCoupons") Boolean bool2, @g(name = "showOnlySpecialOffers") boolean z10, @g(name = "showRedeemedOffers") boolean z11, @g(name = "offerIds") List<Long> offerIds) {
        this(couponsSortType, i10, i11, str, num, str2, str3, num2, str4, num3, num4, l10, str5, bool, upcList, bool2, z10, z11, offerIds, null, false, 1572864, null);
        Intrinsics.j(upcList, "upcList");
        Intrinsics.j(offerIds, "offerIds");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CouponsRequest(@g(name = "sortType") CouponsSortType couponsSortType, @g(name = "pageSize") int i10, @g(name = "currentPage") int i11, @g(name = "categoryId") String str, @g(name = "offerClass") Integer num, @g(name = "searchCriteria") String str2, @g(name = "zip") String str3, @g(name = "storeId") Integer num2, @g(name = "clippedFromTS") String str4, @g(name = "ceilingCount") Integer num3, @g(name = "ceilingDuration") Integer num4, @g(name = "rewardCouponId") Long l10, @g(name = "tagId") String str5, @g(name = "getOfferCountPerDepartment") Boolean bool, @g(name = "upcList") List<Long> upcList, @g(name = "showClippedCoupons") Boolean bool2, @g(name = "showOnlySpecialOffers") boolean z10, @g(name = "showRedeemedOffers") boolean z11, @g(name = "offerIds") List<Long> offerIds, @g(name = "displayReasonFilters") List<String> displayReasonFilters) {
        this(couponsSortType, i10, i11, str, num, str2, str3, num2, str4, num3, num4, l10, str5, bool, upcList, bool2, z10, z11, offerIds, displayReasonFilters, false, 1048576, null);
        Intrinsics.j(upcList, "upcList");
        Intrinsics.j(offerIds, "offerIds");
        Intrinsics.j(displayReasonFilters, "displayReasonFilters");
    }

    @JvmOverloads
    public CouponsRequest(@g(name = "sortType") CouponsSortType couponsSortType, @g(name = "pageSize") int i10, @g(name = "currentPage") int i11, @g(name = "categoryId") String str, @g(name = "offerClass") Integer num, @g(name = "searchCriteria") String str2, @g(name = "zip") String str3, @g(name = "storeId") Integer num2, @g(name = "clippedFromTS") String str4, @g(name = "ceilingCount") Integer num3, @g(name = "ceilingDuration") Integer num4, @g(name = "rewardCouponId") Long l10, @g(name = "tagId") String str5, @g(name = "getOfferCountPerDepartment") Boolean bool, @g(name = "upcList") List<Long> upcList, @g(name = "showClippedCoupons") Boolean bool2, @g(name = "showOnlySpecialOffers") boolean z10, @g(name = "showRedeemedOffers") boolean z11, @g(name = "offerIds") List<Long> offerIds, @g(name = "displayReasonFilters") List<String> displayReasonFilters, boolean z12) {
        Intrinsics.j(upcList, "upcList");
        Intrinsics.j(offerIds, "offerIds");
        Intrinsics.j(displayReasonFilters, "displayReasonFilters");
        this.sortType = couponsSortType;
        this.pageSize = i10;
        this.currentPage = i11;
        this.categoryId = str;
        this.offerClass = num;
        this.searchCriteria = str2;
        this.zip = str3;
        this.storeId = num2;
        this.clippedFromTS = str4;
        this.ceilingCount = num3;
        this.ceilingDuration = num4;
        this.rewardCouponId = l10;
        this.tagId = str5;
        this.getOfferCountPerCategory = bool;
        this.upcList = upcList;
        this.showClippedCoupons = bool2;
        this.showOnlySpecialOffers = z10;
        this.showRedeemedOffers = z11;
        this.offerIds = offerIds;
        this.displayReasonFilters = displayReasonFilters;
        this.isClippedCouponsRequest = z12;
    }

    public /* synthetic */ CouponsRequest(CouponsSortType couponsSortType, int i10, int i11, String str, Integer num, String str2, String str3, Integer num2, String str4, Integer num3, Integer num4, Long l10, String str5, Boolean bool, List list, Boolean bool2, boolean z10, boolean z11, List list2, List list3, boolean z12, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : couponsSortType, (i12 & 2) != 0 ? 9999 : i10, (i12 & 4) != 0 ? 1 : i11, (i12 & 8) != 0 ? null : str, (i12 & 16) != 0 ? null : num, (i12 & 32) != 0 ? null : str2, (i12 & 64) != 0 ? null : str3, (i12 & 128) != 0 ? null : num2, (i12 & 256) != 0 ? null : str4, (i12 & 512) != 0 ? null : num3, (i12 & 1024) != 0 ? null : num4, (i12 & RecyclerView.m.FLAG_MOVED) != 0 ? null : l10, (i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str5, (i12 & 8192) != 0 ? null : bool, (i12 & 16384) != 0 ? CollectionsKt.m() : list, (i12 & 32768) != 0 ? null : bool2, (i12 & 65536) != 0 ? false : z10, (i12 & 131072) != 0 ? false : z11, (i12 & 262144) != 0 ? CollectionsKt.m() : list2, (i12 & 524288) != 0 ? CollectionsKt.m() : list3, (i12 & 1048576) != 0 ? false : z12);
    }
}
