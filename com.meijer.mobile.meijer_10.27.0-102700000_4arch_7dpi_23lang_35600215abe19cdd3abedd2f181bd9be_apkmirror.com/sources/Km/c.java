package Km;

import Ok.Coupon;
import Rk.CouponOptions;
import Tr.A;
import Tr.C5283b;
import Tr.CouponsListChange;
import ak.AbstractC5607a;
import cl.C6412d;
import com.meijer.mobile.coupon.model.search.CouponsSortType;
import dl.CouponsResponse;
import fi.C13902c;
import fi.C13904e;
import fi.EnumC13905f;
import fi.GoogleAdAnalytics;
import fi.GoogleAdData;
import gi.InterfaceC14261a;
import hi.C14476c;
import hi.TrackingData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import tm.AbstractC17122a;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.P;
import tv.S;
import um.C17279b;
import yo.C18264a;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001Ba\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00101\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u001fH\u0014¢\u0006\u0004\b1\u00102J\u001f\u00103\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u001fH\u0014¢\u0006\u0004\b3\u00102J\u0017\u00104\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020.H\u0014¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b6\u00105R \u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020908078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010:R \u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000209080<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010$R\u0014\u0010H\u001a\u00020E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006I"}, d2 = {"LKm/c;", "LKm/h;", "Lum/b;", "appBackgroundManager", "Lyo/k;", "userManager", "Lhl/m;", "cartRepository", "Lcl/d;", "couponsRepository", "Lgi/a;", "analyticsEngine", "Lyo/a;", "appPrefManager", "LTq/j;", "storeProvider", "LTr/b;", "couponChangeManager", "LTr/A;", "couponsCommandManager", "LRk/a;", "couponOptions", "", "tag", "<init>", "(Lum/b;Lyo/k;Lhl/m;Lcl/d;Lgi/a;Lyo/a;LTq/j;LTr/b;LTr/A;LRk/a;Ljava/lang/String;)V", "Lfi/a;", "analytics", "", "d1", "(Lfi/a;)V", "", "hasSpecialOffers", "v1", "(Z)Z", "M0", "()Z", "Ldl/a;", "couponsResponse", "C", "(Ldl/a;)V", "", "couponsCount", "totalCoupons", "x1", "(II)V", "LTr/B;", "change", "updateCoupon", "G0", "(LTr/B;Z)V", "I0", "H0", "(LTr/B;)V", "P0", "Ltv/B;", "", "Lfi/d;", "Ltv/B;", "_googleAdsListState", "Ltv/P;", "o0", "()Ltv/P;", "googleAdsListState", "q0", "()I", "noCouponsTextResourceId", "O0", "isBasePage", "LPk/c;", "s0", "()LPk/c;", "pageType", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class c extends h {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<List<GoogleAdData>> _googleAdsListState;

    @Override // Km.h
    public boolean M0() {
        return true;
    }

    @Override // Km.h
    public boolean O0() {
        return true;
    }

    @Override // Km.h
    public boolean v1(boolean hasSpecialOffers) {
        return hasSpecialOffers;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C17279b appBackgroundManager, yo.k userManager, hl.m cartRepository, C6412d couponsRepository, InterfaceC14261a analyticsEngine, C18264a appPrefManager, Tq.j storeProvider, C5283b couponChangeManager, A couponsCommandManager, CouponOptions couponOptions, String tag) {
        super(appBackgroundManager, userManager, cartRepository, couponsRepository, analyticsEngine, appPrefManager, storeProvider, couponChangeManager, couponsCommandManager, couponOptions, tag);
        Intrinsics.j(appBackgroundManager, "appBackgroundManager");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(couponsRepository, "couponsRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(appPrefManager, "appPrefManager");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(couponChangeManager, "couponChangeManager");
        Intrinsics.j(couponsCommandManager, "couponsCommandManager");
        Intrinsics.j(couponOptions, "couponOptions");
        Intrinsics.j(tag, "tag");
        InterfaceC17140B<List<GoogleAdData>> interfaceC17140BA = S.a(CollectionsKt.m());
        this._googleAdsListState = interfaceC17140BA;
        couponOptions.w(userManager.z("AVAILABLE_COUPONS"));
        couponOptions.v(userManager.A("AVAILABLE_COUPONS", "CLIPPED_COUPONS"));
        couponOptions.x(CouponsSortType.INSTANCE.a(userManager.m("AVAILABLE_COUPONS", CouponsSortType.RELEVANCE.getDisplayName())));
        ArrayList arrayList = new ArrayList();
        C13904e c13904e = C13904e.f131155a;
        GoogleAdData googleAdDataB = C13904e.b(c13904e, EnumC13905f.f131156d, "CouponsPage", true, null, userManager.y(), 1, 8, null);
        if (googleAdDataB != null) {
            arrayList.add(googleAdDataB);
        }
        EnumC13905f enumC13905f = EnumC13905f.f131159g;
        GoogleAdData googleAdDataB2 = C13904e.b(c13904e, enumC13905f, "CouponsPage", true, null, userManager.y(), 2, 8, null);
        if (googleAdDataB2 != null) {
            arrayList.add(googleAdDataB2);
        }
        GoogleAdData googleAdDataB3 = C13904e.b(c13904e, enumC13905f, "CouponsPage", true, null, userManager.y(), 3, 8, null);
        if (googleAdDataB3 != null) {
            arrayList.add(googleAdDataB3);
        }
        while (!interfaceC17140BA.e(interfaceC17140BA.getValue(), arrayList)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B1(CouponsListChange couponsListChange, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("coupons");
        track.n("Meijer: Coupons: available");
        Qk.b bVar = Qk.b.f30831a;
        track.c(bVar.h("Coupon List Page"));
        Coupon coupon = couponsListChange.getCoupon();
        if (coupon != null) {
            track.c(bVar.e(coupon));
        }
        return Unit.f142422a;
    }

    @Override // Km.h, Tr.A.a
    public void C(CouponsResponse couponsResponse) {
        Intrinsics.j(couponsResponse, "couponsResponse");
        if (couponsResponse.getCouponCount() != 0 || getCouponOptions().e().isEmpty()) {
            super.C(couponsResponse);
            getCouponsCommandManager().Y();
        } else {
            getCouponOptions().e().clear();
            this.f161921b = AbstractC17122a.EnumC2540a.NEEDS_REFRESH;
            S();
        }
    }

    @Override // Km.h
    protected void G0(CouponsListChange change, boolean updateCoupon) {
        Intrinsics.j(change, "change");
        super.G0(change, updateCoupon);
        this.f161921b = AbstractC17122a.EnumC2540a.NEEDS_REFRESH;
    }

    @Override // Km.h
    protected void H0(CouponsListChange change) {
        Intrinsics.j(change, "change");
        super.H0(change);
        if (getCouponCount() != 0 || getCouponOptions().e().isEmpty()) {
            return;
        }
        getCouponOptions().e().clear();
        this.f161921b = AbstractC17122a.EnumC2540a.NEEDS_REFRESH;
        S();
    }

    @Override // Km.h
    protected void I0(CouponsListChange change, boolean updateCoupon) {
        Intrinsics.j(change, "change");
        super.I0(change, updateCoupon);
        this.f161921b = AbstractC17122a.EnumC2540a.NEEDS_REFRESH;
    }

    @Override // Km.h
    public void P0(final CouponsListChange change) {
        Intrinsics.j(change, "change");
        super.P0(change);
        if (change.getType() == CouponsListChange.a.f35394a) {
            getAnalyticsEngine().h(C14476c.a("coupon clip"), new Function1() { // from class: Km.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return c.B1(change, (TrackingData) obj);
                }
            });
        }
    }

    @Override // Km.h
    public void d1(GoogleAdAnalytics analytics) {
        Intrinsics.j(analytics, "analytics");
        getAnalyticsEngine().e(C13902c.b(analytics, "coupons"));
    }

    @Override // Km.h
    public P<List<GoogleAdData>> o0() {
        return C17154h.c(this._googleAdsListState);
    }

    @Override // Km.h
    /* renamed from: s0 */
    public Pk.c getPageType() {
        return Pk.c.f28328d;
    }

    @Override // Km.h
    public int q0() {
        if (getCouponOptions().e().isEmpty()) {
            return Nr.g.f22701H;
        }
        return Nr.g.f22722b;
    }

    @Override // Km.h
    public void x1(int couponsCount, int totalCoupons) {
        super.x1(couponsCount, totalCoupons);
        if (totalCoupons > 0) {
            this.couponsHeaderVisibility.N(0);
            if (couponsCount == totalCoupons) {
                this.couponsHeaderText.N(AbstractC5607a.INSTANCE.b(Nr.f.f22684d, totalCoupons, new Object[0]));
                return;
            } else {
                this.couponsHeaderText.N(AbstractC5607a.INSTANCE.d(Nr.g.f22762v, Integer.valueOf(couponsCount), Integer.valueOf(totalCoupons)));
                return;
            }
        }
        this.couponsHeaderVisibility.N(8);
    }
}
