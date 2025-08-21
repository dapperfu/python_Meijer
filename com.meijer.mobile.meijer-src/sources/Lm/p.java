package Lm;

import Sk.CouponOptions;
import Tr.A;
import Tr.C5371b;
import com.meijer.mobile.coupons.api.models.CouponsRequest;
import dl.C13702d;
import hi.InterfaceC14523a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vm.C17693b;
import yo.C18335a;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001Ba\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"LLm/p;", "LLm/h;", "Lvm/b;", "appBackgroundManager", "Lyo/k;", "userManager", "Lil/m;", "cartRepository", "Ldl/d;", "couponsRepository", "Lhi/a;", "analyticsEngine", "Lyo/a;", "appPrefManager", "LTq/j;", "storeProvider", "LTr/b;", "couponChangeManager", "LTr/A;", "couponsCommandManager", "LSk/a;", "couponOptions", "", "tag", "<init>", "(Lvm/b;Lyo/k;Lil/m;Ldl/d;Lhi/a;Lyo/a;LTq/j;LTr/b;LTr/A;LSk/a;Ljava/lang/String;)V", "Lcom/meijer/mobile/coupons/api/models/CouponsRequest;", "h0", "()Lcom/meijer/mobile/coupons/api/models/CouponsRequest;", "couponsRequest", "", "q0", "()I", "noCouponsTextResourceId", "", "O0", "()Z", "isBasePage", "LQk/c;", "r0", "()LQk/c;", "pageType", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class p extends h {
    @Override // Lm.h
    public boolean O0() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(C17693b appBackgroundManager, yo.k userManager, il.m cartRepository, C13702d couponsRepository, InterfaceC14523a analyticsEngine, C18335a appPrefManager, Tq.j storeProvider, C5371b couponChangeManager, A couponsCommandManager, CouponOptions couponOptions, String tag) {
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
    }

    @Override // Lm.h
    public CouponsRequest h0() {
        return CouponsRequest.INSTANCE.c(getStoreProvider().h().getZipCode(), getStoreProvider().h().getStoreId(), getCouponOptions());
    }

    @Override // Lm.h
    public int q0() {
        return Nr.g.f22671V;
    }

    @Override // Lm.h
    /* renamed from: r0 */
    public Qk.c getPageType() {
        return Qk.c.f31050n;
    }
}
