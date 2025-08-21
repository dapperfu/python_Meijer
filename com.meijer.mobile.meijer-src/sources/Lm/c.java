package Lm;

import Pk.Coupon;
import Sk.CouponOptions;
import Tr.A;
import Tr.C5371b;
import Tr.CouponsListChange;
import bk.AbstractC6392a;
import com.meijer.mobile.coupon.model.search.CouponsSortType;
import dl.C13702d;
import el.CouponsResponse;
import gi.C14375c;
import gi.C14377e;
import gi.EnumC14378f;
import gi.GoogleAdAnalytics;
import gi.GoogleAdData;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.P;
import pv.S;
import um.AbstractC17446a;
import vm.C17693b;
import yo.C18335a;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001Ba\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00101\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u001fH\u0014¢\u0006\u0004\b1\u00102J\u001f\u00103\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u001fH\u0014¢\u0006\u0004\b3\u00102J\u0017\u00104\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020.H\u0014¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b6\u00105R \u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020908078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R \u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000209080=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010$R\u0014\u0010I\u001a\u00020F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006J"}, d2 = {"LLm/c;", "LLm/h;", "Lvm/b;", "appBackgroundManager", "Lyo/k;", "userManager", "Lil/m;", "cartRepository", "Ldl/d;", "couponsRepository", "Lhi/a;", "analyticsEngine", "Lyo/a;", "appPrefManager", "LTq/j;", "storeProvider", "LTr/b;", "couponChangeManager", "LTr/A;", "couponsCommandManager", "LSk/a;", "couponOptions", "", "tag", "<init>", "(Lvm/b;Lyo/k;Lil/m;Ldl/d;Lhi/a;Lyo/a;LTq/j;LTr/b;LTr/A;LSk/a;Ljava/lang/String;)V", "Lgi/a;", "analytics", "", "d1", "(Lgi/a;)V", "", "hasSpecialOffers", "v1", "(Z)Z", "N0", "()Z", "Lel/a;", "couponsResponse", "E", "(Lel/a;)V", "", "couponsCount", "totalCoupons", "w1", "(II)V", "LTr/B;", "change", "updateCoupon", "G0", "(LTr/B;Z)V", "L0", "I0", "(LTr/B;)V", "R0", "Lpv/B;", "", "Lgi/d;", "C", "Lpv/B;", "_googleAdsListState", "Lpv/P;", "l0", "()Lpv/P;", "googleAdsListState", "q0", "()I", "noCouponsTextResourceId", "O0", "isBasePage", "LQk/c;", "r0", "()LQk/c;", "pageType", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class c extends h {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<List<GoogleAdData>> _googleAdsListState;

    @Override // Lm.h
    public boolean N0() {
        return true;
    }

    @Override // Lm.h
    public boolean O0() {
        return true;
    }

    @Override // Lm.h
    public boolean v1(boolean hasSpecialOffers) {
        return hasSpecialOffers;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C17693b appBackgroundManager, yo.k userManager, il.m cartRepository, C13702d couponsRepository, InterfaceC14523a analyticsEngine, C18335a appPrefManager, Tq.j storeProvider, C5371b couponChangeManager, A couponsCommandManager, CouponOptions couponOptions, String tag) {
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
        InterfaceC16549B<List<GoogleAdData>> interfaceC16549BA = S.a(CollectionsKt.m());
        this._googleAdsListState = interfaceC16549BA;
        couponOptions.w(userManager.z("AVAILABLE_COUPONS"));
        couponOptions.v(userManager.A("AVAILABLE_COUPONS", "CLIPPED_COUPONS"));
        couponOptions.x(CouponsSortType.INSTANCE.a(userManager.m("AVAILABLE_COUPONS", CouponsSortType.RELEVANCE.getDisplayName())));
        ArrayList arrayList = new ArrayList();
        C14377e c14377e = C14377e.f134254a;
        GoogleAdData googleAdDataB = C14377e.b(c14377e, EnumC14378f.f134255d, "CouponsPage", true, null, userManager.y(), 1, 8, null);
        if (googleAdDataB != null) {
            arrayList.add(googleAdDataB);
        }
        EnumC14378f enumC14378f = EnumC14378f.f134258g;
        GoogleAdData googleAdDataB2 = C14377e.b(c14377e, enumC14378f, "CouponsPage", true, null, userManager.y(), 2, 8, null);
        if (googleAdDataB2 != null) {
            arrayList.add(googleAdDataB2);
        }
        GoogleAdData googleAdDataB3 = C14377e.b(c14377e, enumC14378f, "CouponsPage", true, null, userManager.y(), 3, 8, null);
        if (googleAdDataB3 != null) {
            arrayList.add(googleAdDataB3);
        }
        while (!interfaceC16549BA.e(interfaceC16549BA.getValue(), arrayList)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y1(CouponsListChange couponsListChange, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("coupons");
        track.n("Meijer: Coupons: available");
        Rk.b bVar = Rk.b.f33418a;
        track.c(bVar.h("Coupon List Page"));
        Coupon coupon = couponsListChange.getCoupon();
        if (coupon != null) {
            track.c(bVar.e(coupon));
        }
        return Unit.f143329a;
    }

    @Override // Lm.h, Tr.A.a
    public void E(CouponsResponse couponsResponse) {
        Intrinsics.j(couponsResponse, "couponsResponse");
        if (couponsResponse.getCouponCount() != 0 || getCouponOptions().e().isEmpty()) {
            super.E(couponsResponse);
            getCouponsCommandManager().Y();
        } else {
            getCouponOptions().e().clear();
            this.f164283b = AbstractC17446a.EnumC2605a.NEEDS_REFRESH;
            S();
        }
    }

    @Override // Lm.h
    protected void G0(CouponsListChange change, boolean updateCoupon) {
        Intrinsics.j(change, "change");
        super.G0(change, updateCoupon);
        this.f164283b = AbstractC17446a.EnumC2605a.NEEDS_REFRESH;
    }

    @Override // Lm.h
    protected void I0(CouponsListChange change) {
        Intrinsics.j(change, "change");
        super.I0(change);
        if (getCouponCount() != 0 || getCouponOptions().e().isEmpty()) {
            return;
        }
        getCouponOptions().e().clear();
        this.f164283b = AbstractC17446a.EnumC2605a.NEEDS_REFRESH;
        S();
    }

    @Override // Lm.h
    protected void L0(CouponsListChange change, boolean updateCoupon) {
        Intrinsics.j(change, "change");
        super.L0(change, updateCoupon);
        this.f164283b = AbstractC17446a.EnumC2605a.NEEDS_REFRESH;
    }

    @Override // Lm.h
    public void R0(final CouponsListChange change) {
        Intrinsics.j(change, "change");
        super.R0(change);
        if (change.getType() == CouponsListChange.a.f36744a) {
            getAnalyticsEngine().b(C14756c.a("coupon clip"), new Function1() { // from class: Lm.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return c.y1(change, (TrackingData) obj);
                }
            });
        }
    }

    @Override // Lm.h
    public void d1(GoogleAdAnalytics analytics) {
        Intrinsics.j(analytics, "analytics");
        getAnalyticsEngine().k(C14375c.b(analytics, "coupons"));
    }

    @Override // Lm.h
    public P<List<GoogleAdData>> l0() {
        return C16563h.c(this._googleAdsListState);
    }

    @Override // Lm.h
    /* renamed from: r0 */
    public Qk.c getPageType() {
        return Qk.c.f31040d;
    }

    @Override // Lm.h
    public int q0() {
        if (getCouponOptions().e().isEmpty()) {
            return Nr.g.f22657H;
        }
        return Nr.g.f22678b;
    }

    @Override // Lm.h
    public void w1(int couponsCount, int totalCoupons) {
        super.w1(couponsCount, totalCoupons);
        if (totalCoupons > 0) {
            this.couponsHeaderVisibility.N(0);
            if (couponsCount == totalCoupons) {
                this.couponsHeaderText.N(AbstractC6392a.INSTANCE.b(Nr.f.f22640d, totalCoupons, new Object[0]));
                return;
            } else {
                this.couponsHeaderText.N(AbstractC6392a.INSTANCE.d(Nr.g.f22718v, Integer.valueOf(couponsCount), Integer.valueOf(totalCoupons)));
                return;
            }
        }
        this.couponsHeaderVisibility.N(8);
    }
}
