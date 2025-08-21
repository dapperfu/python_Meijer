package Lm;

import Lm.h;
import Pk.Coupon;
import Sk.CouponOptions;
import Tr.A;
import Tr.C5371b;
import Tr.CouponsListChange;
import bk.AbstractC6392a;
import com.meijer.mobile.coupon.model.search.CouponsSortType;
import com.meijer.mobile.coupons.api.models.CouponsRequest;
import dl.C13702d;
import hi.InterfaceC14523a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import um.AbstractC17446a;
import vm.C17693b;
import yo.C18335a;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001Ba\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001aH\u0016¢\u0006\u0004\b$\u0010\u001cJ\u001f\u0010(\u001a\u00020!2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001aH\u0014¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020!2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001aH\u0014¢\u0006\u0004\b*\u0010)R\u0014\u0010-\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u001cR\u0014\u00103\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00106\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"LLm/j;", "LLm/h;", "Lvm/b;", "appBackgroundManager", "Lyo/k;", "userManager", "Lil/m;", "cartRepository", "Ldl/d;", "couponsRepository", "Lhi/a;", "analyticsEngine", "Lyo/a;", "appPrefManager", "LTq/j;", "storeProvider", "LTr/b;", "couponChangeManager", "LTr/A;", "couponsCommandManager", "LSk/a;", "couponOptions", "", "tag", "<init>", "(Lvm/b;Lyo/k;Lil/m;Ldl/d;Lhi/a;Lyo/a;LTq/j;LTr/b;LTr/A;LSk/a;Ljava/lang/String;)V", "", "N0", "()Z", "u1", "", "couponsCount", "totalCoupons", "", "w1", "(II)V", "T", "LTr/B;", "change", "updateCoupon", "G0", "(LTr/B;Z)V", "L0", "q0", "()I", "noCouponsTextResourceId", "O0", "isBasePage", "LQk/c;", "r0", "()LQk/c;", "pageType", "A0", "()Ljava/lang/String;", "trackingPage", "Lcom/meijer/mobile/coupons/api/models/CouponsRequest;", "h0", "()Lcom/meijer/mobile/coupons/api/models/CouponsRequest;", "couponsRequest", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j extends h {
    @Override // Lm.h
    public boolean N0() {
        return true;
    }

    @Override // Lm.h
    public boolean O0() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C17693b appBackgroundManager, yo.k userManager, il.m cartRepository, C13702d couponsRepository, InterfaceC14523a analyticsEngine, C18335a appPrefManager, Tq.j storeProvider, C5371b couponChangeManager, A couponsCommandManager, CouponOptions couponOptions, String tag) {
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
        this.unauthenticatedVisibility.N(userManager.b() ? 8 : 0);
        this.couponsViewVisibility.N(userManager.b() ? 0 : 8);
        couponOptions.w(userManager.z("CLIPPED_COUPONS"));
        couponOptions.v(userManager.A("CLIPPED_COUPONS", "CLIPPED_COUPONS"));
        couponOptions.x(CouponsSortType.INSTANCE.a(userManager.m("CLIPPED_COUPONS", CouponsSortType.RELEVANCE.getDisplayName())));
    }

    @Override // Lm.h
    public String A0() {
        return "mperks: clipped";
    }

    @Override // Lm.h
    protected void G0(CouponsListChange change, boolean updateCoupon) {
        Intrinsics.j(change, "change");
        w1(getCouponCount() + 1, getTotalCouponCount() + 1);
        this.f164283b = AbstractC17446a.EnumC2605a.NEEDS_REFRESH;
    }

    @Override // Lm.h
    protected void L0(CouponsListChange change, boolean updateCoupon) {
        Intrinsics.j(change, "change");
        w1(getCouponCount() - 1, getTotalCouponCount() - 1);
        if (N()) {
            h.b bVarD0 = D0();
            Intrinsics.g(bVarD0);
            Coupon coupon = change.getCoupon();
            Intrinsics.g(coupon);
            if (bVarD0.D(coupon) != null) {
                h.b bVarD02 = D0();
                Intrinsics.g(bVarD02);
                bVarD02.j(getCouponCount());
            }
        }
        if (getCouponCount() != 0 || getCouponOptions().e().isEmpty()) {
            return;
        }
        getCouponOptions().e().clear();
        this.f164283b = AbstractC17446a.EnumC2605a.NEEDS_REFRESH;
        S();
    }

    @Override // Lm.h
    public CouponsRequest h0() {
        return CouponsRequest.INSTANCE.a(getCouponOptions().i(), CollectionsKt.B0(getCouponOptions().e(), null, null, null, 0, null, null, 63, null));
    }

    @Override // Lm.h
    public int q0() {
        return Nr.g.f22669T;
    }

    @Override // Lm.h
    /* renamed from: r0 */
    public Qk.c getPageType() {
        return Qk.c.f31041e;
    }

    @Override // Lm.h, um.AbstractC17446a
    public boolean T() {
        if (super.T() && getUserManager().b()) {
            return true;
        }
        if (getCouponChangeManager().e()) {
            Iterator<CouponsListChange> it = getCouponChangeManager().c().iterator();
            while (it.hasNext()) {
                if (it.next().getType() == CouponsListChange.a.f36744a) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // Lm.h
    public boolean u1() {
        return !getUserManager().b();
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
