package Qr;

import Nr.f;
import Nr.g;
import Ok.Coupon;
import Ok.e;
import Pk.b;
import Pk.c;
import Xr.CouponListItemDecorator;
import ak.AbstractC5607a;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.t1;
import dl.SpecialOffer;
import el.C13686c;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import yi.EnumC18214a;
import yr.Q;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\u000f\u001a\u00020\t*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0013\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a#\u0010\u0015\u001a\u00020\t*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u0011\u0010\u0018\u001a\u00020\u0017*\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019\u001a1\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003H\u0002¢\u0006\u0004\b \u0010!\u001a'\u0010$\u001a\u0004\u0018\u00010\t*\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u0003¢\u0006\u0004\b$\u0010%\u001a%\u0010&\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u0003¢\u0006\u0004\b&\u0010'\u001a\u0011\u0010)\u001a\u00020(*\u00020\u0000¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"LOk/a;", "LPk/c;", "couponPage", "", "m", "(LOk/a;LPk/c;)Z", "Ldl/b;", "o", "(LOk/a;)Ldl/b;", "Lak/a;", "e", "(LOk/a;)Lak/a;", "showMore", "", "progress", "f", "(LOk/a;ZD)Lak/a;", "quantityMatched", "isCouponDetail", "a", "(LOk/a;DZ)Lak/a;", "j", "LXk/c;", "LHr/e;", "d", "(LXk/c;)LHr/e;", "LPk/b;", "actionLoadingState", "isProductInCart", "isCouponApplied", "Landroidx/compose/runtime/l0;", "Lyi/a;", "c", "(LOk/a;LPk/b;ZZ)Landroidx/compose/runtime/l0;", "showPrimary", "showSecondary", "i", "(LOk/a;ZZ)Lak/a;", "l", "(LOk/a;ZZ)Z", "LXr/c;", "n", "(LOk/a;)LXr/c;", "coupon_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a {
    private static final String h(double d10) {
        if (Double.valueOf(d10 % 1).equals(Double.valueOf(0.0d))) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) d10);
            sb2.append('%');
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(d10);
        sb3.append('%');
        return sb3.toString();
    }

    public static final AbstractC5607a a(Coupon coupon, double d10, boolean z10) {
        Intrinsics.j(coupon, "<this>");
        if (d10 < coupon.getEarnCondition().getGoal()) {
            return AbstractC5607a.INSTANCE.b(f.f22681a, (int) (coupon.getEarnCondition().getGoal() - d10), new Object[0]);
        }
        return AbstractC5607a.INSTANCE.d(z10 ? g.f22727d0 : Q.f171005n, new Object[0]);
    }

    public static /* synthetic */ AbstractC5607a b(Coupon coupon, double d10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(coupon, d10, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final Hr.CouponCountDownStateDecorator d(Xk.CouponState r12) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.j(r12, r0)
            Xk.c$b r0 = r12.getProgress()
            boolean r1 = r0 instanceof Xk.CouponState.b.Spend
            r2 = 1
            r3 = 0
            r5 = 2
            r6 = 0
            r7 = 0
            if (r1 == 0) goto L64
            Hr.e r1 = new Hr.e
            Ok.a r8 = r12.getCoupon()
            boolean r8 = r8.x()
            if (r8 == 0) goto L38
            r8 = r0
            Xk.c$b$d r8 = (Xk.CouponState.b.Spend) r8
            double r9 = r8.getAcquired()
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 != 0) goto L2b
            goto L38
        L2b:
            Ok.a r9 = r12.getCoupon()
            double r10 = r8.getAcquired()
            ak.a r8 = j(r9, r10, r6)
            goto L40
        L38:
            Ok.a r8 = r12.getCoupon()
            ak.a r8 = e(r8)
        L40:
            androidx.compose.runtime.l0 r5 = androidx.compose.runtime.o1.j(r8, r7, r5, r7)
            Ok.a r7 = r12.getCoupon()
            Pk.b r12 = r12.getCouponActionLoadingState()
            Xk.c$b$d r0 = (Xk.CouponState.b.Spend) r0
            double r8 = r0.getAcquired()
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 != 0) goto L57
            r6 = r2
        L57:
            r2 = r2 ^ r6
            boolean r0 = r0.d()
            androidx.compose.runtime.l0 r12 = c(r7, r12, r2, r0)
            r1.<init>(r5, r12)
            return r1
        L64:
            boolean r1 = r0 instanceof Xk.CouponState.b.Buy
            if (r1 == 0) goto Lb9
            Hr.e r1 = new Hr.e
            Ok.a r8 = r12.getCoupon()
            boolean r8 = r8.x()
            if (r8 == 0) goto L8d
            r8 = r0
            Xk.c$b$a r8 = (Xk.CouponState.b.Buy) r8
            double r9 = r8.getAcquired()
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 != 0) goto L80
            goto L8d
        L80:
            Ok.a r9 = r12.getCoupon()
            double r10 = r8.getAcquired()
            ak.a r8 = a(r9, r10, r6)
            goto L95
        L8d:
            Ok.a r8 = r12.getCoupon()
            ak.a r8 = e(r8)
        L95:
            androidx.compose.runtime.l0 r5 = androidx.compose.runtime.o1.j(r8, r7, r5, r7)
            Ok.a r7 = r12.getCoupon()
            Pk.b r12 = r12.getCouponActionLoadingState()
            Xk.c$b$a r0 = (Xk.CouponState.b.Buy) r0
            double r8 = r0.getAcquired()
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 != 0) goto Lac
            r6 = r2
        Lac:
            r2 = r2 ^ r6
            boolean r0 = r0.d()
            androidx.compose.runtime.l0 r12 = c(r7, r12, r2, r0)
            r1.<init>(r5, r12)
            return r1
        Lb9:
            Xk.c$b$c r1 = Xk.CouponState.b.C0846c.f39430a
            boolean r0 = kotlin.jvm.internal.Intrinsics.e(r0, r1)
            if (r0 == 0) goto Lff
            Hr.e r0 = new Hr.e
            Ok.a r1 = r12.getCoupon()
            boolean r1 = r1.x()
            if (r1 != 0) goto Ld6
            Ok.a r1 = r12.getCoupon()
            ak.a r1 = e(r1)
            goto Le0
        Ld6:
            ak.a$a r1 = ak.AbstractC5607a.INSTANCE
            int r2 = yr.Q.f171005n
            java.lang.Object[] r3 = new java.lang.Object[r6]
            ak.a r1 = r1.d(r2, r3)
        Le0:
            androidx.compose.runtime.l0 r1 = androidx.compose.runtime.o1.j(r1, r7, r5, r7)
            Ok.a r12 = r12.getCoupon()
            boolean r12 = r12.x()
            if (r12 != 0) goto Lf5
            yi.a r12 = yi.EnumC18214a.f170500d
            androidx.compose.runtime.l0 r12 = androidx.compose.runtime.o1.j(r12, r7, r5, r7)
            goto Lfb
        Lf5:
            yi.a r12 = yi.EnumC18214a.f170501e
            androidx.compose.runtime.l0 r12 = androidx.compose.runtime.o1.j(r12, r7, r5, r7)
        Lfb:
            r0.<init>(r1, r12)
            return r0
        Lff:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: Qr.a.d(Xk.c):Hr.e");
    }

    public static final AbstractC5607a e(Coupon coupon) {
        Intrinsics.j(coupon, "<this>");
        return f(coupon, false, 0.0d);
    }

    public static final AbstractC5607a f(Coupon coupon, boolean z10, double d10) {
        Intrinsics.j(coupon, "<this>");
        Coupon.c earnCondition = coupon.getEarnCondition();
        if (earnCondition instanceof Coupon.c.b) {
            Coupon.e reward = coupon.getReward();
            if (reward instanceof Coupon.e.Free) {
                return AbstractC5607a.INSTANCE.b(f.f22685e, (int) coupon.getReward().getValue(), new Object[0]);
            }
            if (reward instanceof Coupon.e.PriceDiscount) {
                return AbstractC5607a.INSTANCE.d(g.f22724c, g(coupon.getReward().getValue()));
            }
            if (reward instanceof Coupon.e.PercentDiscount) {
                return AbstractC5607a.INSTANCE.d(g.f22724c, h(coupon.getReward().getValue()));
            }
            if (Intrinsics.e(reward, Coupon.e.b.f24028b)) {
                return AbstractC5607a.INSTANCE.a();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(earnCondition instanceof Coupon.c.Spend)) {
            if (!(earnCondition instanceof Coupon.c.Buy)) {
                throw new NoWhenBranchMatchedException();
            }
            Coupon.e reward2 = coupon.getReward();
            if (reward2 instanceof Coupon.e.PriceDiscount) {
                return AbstractC5607a.INSTANCE.d(g.f22732g, Integer.valueOf((int) coupon.getEarnCondition().getGoal()), g(coupon.getReward().getValue()));
            }
            if (reward2 instanceof Coupon.e.PercentDiscount) {
                return coupon.getIsSpecialBuyCouponType() ? AbstractC5607a.INSTANCE.c(coupon.getTitle()) : AbstractC5607a.INSTANCE.d(g.f22730f, Integer.valueOf((int) coupon.getEarnCondition().getGoal()), h(coupon.getReward().getValue()));
            }
            if (reward2 instanceof Coupon.e.Free) {
                return AbstractC5607a.INSTANCE.b(f.f22682b, (int) coupon.getReward().getValue(), Integer.valueOf((int) coupon.getEarnCondition().getGoal()));
            }
            if (Intrinsics.e(reward2, Coupon.e.b.f24028b)) {
                return AbstractC5607a.INSTANCE.a();
            }
            throw new NoWhenBranchMatchedException();
        }
        double goal = coupon.getEarnCondition().getGoal();
        if (!z10) {
            d10 = 0.0d;
        }
        String strG = g(goal - d10);
        Coupon.e reward3 = coupon.getReward();
        if (reward3 instanceof Coupon.e.PriceDiscount) {
            return z10 ? AbstractC5607a.INSTANCE.d(g.f22757s0, strG) : AbstractC5607a.INSTANCE.d(g.f22761u0, strG, g(coupon.getReward().getValue()));
        }
        if (reward3 instanceof Coupon.e.PercentDiscount) {
            return AbstractC5607a.INSTANCE.d(z10 ? g.f22755r0 : g.f22759t0, strG, h(coupon.getReward().getValue()));
        }
        if (reward3 instanceof Coupon.e.Free) {
            return AbstractC5607a.INSTANCE.b(z10 ? f.f22687g : f.f22688h, (int) coupon.getReward().getValue(), strG);
        }
        if (Intrinsics.e(reward3, Coupon.e.b.f24028b)) {
            return AbstractC5607a.INSTANCE.a();
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final String g(double d10) {
        if (d10 >= 1.0d) {
            return Double.valueOf(d10 % ((double) 1)).equals(Double.valueOf(0.0d)) ? (String) CollectionsKt.s0(StringsKt.Z0(Fk.g.b(d10), new char[]{'.'}, false, 0, 6, null)) : Fk.g.b(d10);
        }
        StringBuilder sb2 = new StringBuilder();
        StringCompanionObject stringCompanionObject = StringCompanionObject.f142841a;
        String str = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d10)}, 1));
        Intrinsics.i(str, "format(...)");
        sb2.append(Integer.parseInt((String) CollectionsKt.D0(StringsKt.a1(str, new String[]{"."}, false, 0, 6, null))));
        sb2.append((char) 162);
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ak.AbstractC5607a i(Ok.Coupon r1, boolean r2, boolean r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.j(r1, r0)
            boolean r2 = l(r1, r2, r3)
            r3 = 0
            if (r2 == 0) goto L11
            java.lang.String r1 = r1.getHatText()
            goto L35
        L11:
            Ok.b r2 = r1.getCategory()
            if (r2 == 0) goto L24
            Ok.b r1 = r1.getCategory()
            if (r1 == 0) goto L22
            java.lang.String r1 = r1.getSegmentName()
            goto L35
        L22:
            r1 = r3
            goto L35
        L24:
            java.lang.String r2 = r1.getCategoryName()
            if (r2 == 0) goto L22
            int r2 = r2.length()
            if (r2 != 0) goto L31
            goto L22
        L31:
            java.lang.String r1 = r1.getCategoryName()
        L35:
            if (r1 == 0) goto L4a
            ak.a$a r2 = ak.AbstractC5607a.INSTANCE
            int r3 = Nr.g.f22725c0
            Fk.g r0 = Fk.g.f10897a
            java.lang.String r1 = r0.f(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            ak.a r1 = r2.d(r3, r1)
            return r1
        L4a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Qr.a.i(Ok.a, boolean, boolean):ak.a");
    }

    public static final AbstractC5607a j(Coupon coupon, double d10, boolean z10) {
        Intrinsics.j(coupon, "<this>");
        if (d10 < coupon.getEarnCondition().getGoal()) {
            return f(coupon, true, d10);
        }
        return AbstractC5607a.INSTANCE.d(z10 ? g.f22727d0 : Q.f171005n, new Object[0]);
    }

    public static /* synthetic */ AbstractC5607a k(Coupon coupon, double d10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return j(coupon, d10, z10);
    }

    public static final boolean l(Coupon coupon, boolean z10, boolean z11) {
        Intrinsics.j(coupon, "<this>");
        String hatText = coupon.getHatText();
        if (hatText == null || hatText.length() == 0) {
            return false;
        }
        return (z10 || z11) && !coupon.getIsSpecialOffer();
    }

    public static final boolean m(Coupon coupon, c couponPage) {
        Intrinsics.j(coupon, "<this>");
        Intrinsics.j(couponPage, "couponPage");
        String hatText = coupon.getHatText();
        return hatText == null || StringsKt.r0(hatText) || couponPage == c.f28335k;
    }

    public static final CouponListItemDecorator n(Coupon coupon) {
        Intrinsics.j(coupon, "<this>");
        Ok.c cVarA = e.a(coupon.getOfferId());
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        return new CouponListItemDecorator(cVarA, companion.c(coupon.getTitle()), companion.c(coupon.getDescription()), coupon.getImageURL(), coupon.getHatText(), C13686c.f(coupon) ? C13686c.c(coupon) : C13686c.e(coupon, null, 1, null), null, null, coupon.getIsAddedToShoppingList(), coupon.getTermsAndConditions(), coupon.x(), C13686c.g(coupon), 192, null);
    }

    public static final SpecialOffer o(Coupon coupon) {
        Intrinsics.j(coupon, "<this>");
        return new SpecialOffer(coupon.getOfferId(), coupon.getImageURL(), coupon.getTitle(), coupon.getDescription(), coupon.getRedemptionStartDate(), coupon.getRedemptionEndDate(), coupon.x(), coupon);
    }

    private static final InterfaceC5730l0<EnumC18214a> c(Coupon coupon, b bVar, boolean z10, boolean z11) {
        if (bVar.getIsLoading()) {
            return t1.e(EnumC18214a.f170497a, null, 2, null);
        }
        if (!coupon.x()) {
            return t1.e(EnumC18214a.f170500d, null, 2, null);
        }
        if (z10) {
            return !z11 ? t1.e(EnumC18214a.f170498b, null, 2, null) : t1.e(EnumC18214a.f170501e, null, 2, null);
        }
        return t1.e(EnumC18214a.f170499c, null, 2, null);
    }
}
