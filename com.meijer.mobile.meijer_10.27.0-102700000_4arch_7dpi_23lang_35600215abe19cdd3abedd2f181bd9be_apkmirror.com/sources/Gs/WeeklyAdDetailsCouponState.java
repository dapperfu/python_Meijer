package Gs;

import Oj.a;
import Xr.CouponListItemDecorator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ@\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"LGs/m;", "", "", "LXr/c;", "couponListItemDecorator", "", "specialOffersBannerUrl", "", "hasSpecialOffers", "LOj/a;", "loadingState", "<init>", "(Ljava/util/List;Ljava/lang/String;ZLOj/a;)V", "a", "(Ljava/util/List;Ljava/lang/String;ZLOj/a;)LGs/m;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Ljava/lang/String;", "f", "Z", "d", "()Z", "LOj/a;", "e", "()LOj/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Gs.m, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class WeeklyAdDetailsCouponState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<CouponListItemDecorator> couponListItemDecorator;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String specialOffersBannerUrl;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasSpecialOffers;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Oj.a loadingState;

    public WeeklyAdDetailsCouponState() {
        this(null, null, false, null, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeeklyAdDetailsCouponState)) {
            return false;
        }
        WeeklyAdDetailsCouponState weeklyAdDetailsCouponState = (WeeklyAdDetailsCouponState) other;
        return Intrinsics.e(this.couponListItemDecorator, weeklyAdDetailsCouponState.couponListItemDecorator) && Intrinsics.e(this.specialOffersBannerUrl, weeklyAdDetailsCouponState.specialOffersBannerUrl) && this.hasSpecialOffers == weeklyAdDetailsCouponState.hasSpecialOffers && Intrinsics.e(this.loadingState, weeklyAdDetailsCouponState.loadingState);
    }

    public WeeklyAdDetailsCouponState(List<CouponListItemDecorator> couponListItemDecorator, String str, boolean z10, Oj.a loadingState) {
        Intrinsics.j(couponListItemDecorator, "couponListItemDecorator");
        Intrinsics.j(loadingState, "loadingState");
        this.couponListItemDecorator = couponListItemDecorator;
        this.specialOffersBannerUrl = str;
        this.hasSpecialOffers = z10;
        this.loadingState = loadingState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WeeklyAdDetailsCouponState b(WeeklyAdDetailsCouponState weeklyAdDetailsCouponState, List list, String str, boolean z10, Oj.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = weeklyAdDetailsCouponState.couponListItemDecorator;
        }
        if ((i10 & 2) != 0) {
            str = weeklyAdDetailsCouponState.specialOffersBannerUrl;
        }
        if ((i10 & 4) != 0) {
            z10 = weeklyAdDetailsCouponState.hasSpecialOffers;
        }
        if ((i10 & 8) != 0) {
            aVar = weeklyAdDetailsCouponState.loadingState;
        }
        return weeklyAdDetailsCouponState.a(list, str, z10, aVar);
    }

    public final WeeklyAdDetailsCouponState a(List<CouponListItemDecorator> couponListItemDecorator, String specialOffersBannerUrl, boolean hasSpecialOffers, Oj.a loadingState) {
        Intrinsics.j(couponListItemDecorator, "couponListItemDecorator");
        Intrinsics.j(loadingState, "loadingState");
        return new WeeklyAdDetailsCouponState(couponListItemDecorator, specialOffersBannerUrl, hasSpecialOffers, loadingState);
    }

    public final List<CouponListItemDecorator> c() {
        return this.couponListItemDecorator;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getHasSpecialOffers() {
        return this.hasSpecialOffers;
    }

    /* renamed from: e, reason: from getter */
    public final Oj.a getLoadingState() {
        return this.loadingState;
    }

    /* renamed from: f, reason: from getter */
    public final String getSpecialOffersBannerUrl() {
        return this.specialOffersBannerUrl;
    }

    public int hashCode() {
        int iHashCode = this.couponListItemDecorator.hashCode() * 31;
        String str = this.specialOffersBannerUrl;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.hasSpecialOffers)) * 31) + this.loadingState.hashCode();
    }

    public String toString() {
        return "WeeklyAdDetailsCouponState(couponListItemDecorator=" + this.couponListItemDecorator + ", specialOffersBannerUrl=" + this.specialOffersBannerUrl + ", hasSpecialOffers=" + this.hasSpecialOffers + ", loadingState=" + this.loadingState + ')';
    }

    public /* synthetic */ WeeklyAdDetailsCouponState(List list, String str, boolean z10, Oj.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.m() : list, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? new a.NotLoading(null, 1, null) : aVar);
    }
}
