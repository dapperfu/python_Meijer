package Lm;

import Pk.Coupon;
import Sk.CouponOptions;
import Tr.A;
import Tr.C5371b;
import Tr.CouponsListChange;
import Ur.d;
import com.meijer.mobile.coupons.api.models.CouponsRequest;
import dl.C13702d;
import el.CouponsResponse;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import um.AbstractC17446a;
import vm.C17693b;
import yo.C18335a;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001Bq\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ5\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00162\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00104\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u00100R\u0014\u0010@\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u00100¨\u0006A"}, d2 = {"LLm/x;", "LLm/h;", "Lvm/b;", "appBackgroundManager", "Lyo/k;", "userManager", "Lil/m;", "cartRepository", "Ldl/d;", "couponsRepository", "Lhi/a;", "analyticsEngine", "Lyo/a;", "appPrefManager", "LTq/j;", "storeProvider", "LTr/b;", "couponChangeManager", "LTr/A;", "couponsCommandManager", "LSk/a;", "couponOptions", "", "LPk/a;", "specialOffers", "", "tag", "<init>", "(Lvm/b;Lyo/k;Lil/m;Ldl/d;Lhi/a;Lyo/a;LTq/j;LTr/b;LTr/A;LSk/a;Ljava/util/List;Ljava/lang/String;)V", "", "S", "()V", "listOfCoupons", "", "hasSpecialOffers", "specialOffersUrl", "LUr/d$j;", "a0", "(Ljava/util/List;ZLjava/lang/String;)Ljava/util/List;", "LTr/B;", "change", "R0", "(LTr/B;)V", "", "C", "Ljava/util/List;", "", "q0", "()I", "noCouponsTextResourceId", "O0", "()Z", "isBasePage", "LQk/c;", "r0", "()LQk/c;", "pageType", "Lcom/meijer/mobile/coupons/api/models/CouponsRequest;", "h0", "()Lcom/meijer/mobile/coupons/api/models/CouponsRequest;", "couponsRequest", "i0", "errorMessageResourceId", "p0", "loadingMessageResourceId", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class x extends h {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final List<Coupon> specialOffers;

    @Override // Lm.h
    public boolean O0() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C17693b appBackgroundManager, yo.k userManager, il.m cartRepository, C13702d couponsRepository, InterfaceC14523a analyticsEngine, C18335a appPrefManager, Tq.j storeProvider, C5371b couponChangeManager, A couponsCommandManager, CouponOptions couponOptions, List<Coupon> list, String tag) {
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
        ArrayList arrayList = new ArrayList();
        this.specialOffers = arrayList;
        if (list != null) {
            this.f164283b = AbstractC17446a.EnumC2605a.IDLE;
            arrayList.addAll(list);
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
            track.c(bVar.j(coupon));
        }
        return Unit.f143329a;
    }

    @Override // Lm.h
    public void R0(final CouponsListChange change) {
        Intrinsics.j(change, "change");
        super.R0(change);
        if (change.getType() == CouponsListChange.a.f36744a) {
            getAnalyticsEngine().b(C14756c.a("coupon clip"), new Function1() { // from class: Lm.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return x.y1(change, (TrackingData) obj);
                }
            });
        }
    }

    @Override // Lm.h
    public List<d.j> a0(List<Coupon> listOfCoupons, boolean hasSpecialOffers, String specialOffersUrl) {
        Intrinsics.j(listOfCoupons, "listOfCoupons");
        return Km.v.f17576a.c(listOfCoupons, Nr.g.f22707p0);
    }

    @Override // Lm.h
    public CouponsRequest h0() {
        return CouponsRequest.INSTANCE.d(getStoreProvider().h().getZipCode(), getStoreProvider().h().getStoreId());
    }

    @Override // Lm.h
    public int i0() {
        return Nr.g.f22703n0;
    }

    @Override // Lm.h
    public int p0() {
        return Nr.g.f22705o0;
    }

    @Override // Lm.h
    public int q0() {
        return Nr.g.f22671V;
    }

    @Override // Lm.h
    /* renamed from: r0 */
    public Qk.c getPageType() {
        return Qk.c.f31048l;
    }

    @Override // Lm.h, um.AbstractC17446a
    public void S() {
        super.S();
        if (!this.specialOffers.isEmpty()) {
            List<Coupon> list = this.specialOffers;
            E(new CouponsResponse(list.size(), 0, list, CouponsResponse.EnumC2049a.f130224c, null, false, null, 114, null));
            this.specialOffers.clear();
        }
    }
}
