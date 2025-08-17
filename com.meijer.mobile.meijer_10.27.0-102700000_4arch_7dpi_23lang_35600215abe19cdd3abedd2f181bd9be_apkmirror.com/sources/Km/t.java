package Km;

import Fq.ShoppingListItem;
import Km.h;
import Ok.Coupon;
import Ok.CouponCategory;
import Rk.CouponOptions;
import Tr.A;
import Tr.C5283b;
import cl.C6412d;
import com.medallia.digital.mobilesdk.l3;
import dl.CouponsResponse;
import gi.InterfaceC14261a;
import iv.C14764a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import tm.AbstractC17122a;
import um.C17279b;
import yo.C18264a;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001Bi\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J%\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00160\u001d2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u001dH\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020%2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u001d\u0010/\u001a\u00020%2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001dH\u0016¢\u0006\u0004\b/\u00100R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u00101\u001a\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R(\u0010,\u001a\u00020+8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b8\u00109\u0012\u0004\b=\u0010'\u001a\u0004\b:\u0010;\"\u0004\b<\u0010.R0\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b>\u0010?\u0012\u0004\bC\u0010'\u001a\u0004\b@\u0010A\"\u0004\bB\u00100R\u0014\u0010G\u001a\u00020D8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010*¨\u0006J"}, d2 = {"LKm/t;", "LKm/h;", "Lum/b;", "appBackgroundManager", "Lyo/k;", "userManager", "Lhl/m;", "cartRepository", "Lcl/d;", "couponsRepository", "Lgi/a;", "analyticsEngine", "Lyo/a;", "appPrefManager", "LTq/j;", "storeProvider", "LTr/b;", "couponChangeManager", "LTr/A;", "couponsCommandManager", "LRk/a;", "couponOptions", "", "tag", "LPk/c;", "pageType", "<init>", "(Lum/b;Lyo/k;Lhl/m;Lcl/d;Lgi/a;Lyo/a;LTq/j;LTr/b;LTr/A;LRk/a;Ljava/lang/String;LPk/c;)V", "Lio/reactivex/l;", "", "LOk/a;", "E1", "()Lio/reactivex/l;", "LFq/c;", "shoppingList", "G1", "(Ljava/util/List;)Ljava/util/List;", "", "P", "()V", "", "t1", "()Z", "Ldl/a;", "couponsResponse", "C", "(Ldl/a;)V", "d", "(Ljava/util/List;)V", "LPk/c;", "s0", "()LPk/c;", "LNu/b;", "D", "LNu/b;", "relatedCouponsDisposable", "E", "Ldl/a;", "getCouponsResponse", "()Ldl/a;", "setCouponsResponse", "getCouponsResponse$annotations", "F", "Ljava/util/List;", "getShoppingList", "()Ljava/util/List;", "setShoppingList", "getShoppingList$annotations", "", "q0", "()I", "noCouponsTextResourceId", "O0", "isBasePage", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class t extends h {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final Pk.c pageType;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private Nu.b relatedCouponsDisposable;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private CouponsResponse couponsResponse;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private List<ShoppingListItem> shoppingList;

    @Override // Km.h
    public boolean O0() {
        return false;
    }

    @Override // Km.h
    public boolean t1() {
        return true;
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Pk.c.values().length];
            try {
                iArr[Pk.c.f28331g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Pk.c.f28332h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Pk.c.f28337m.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(C17279b appBackgroundManager, yo.k userManager, hl.m cartRepository, C6412d couponsRepository, InterfaceC14261a analyticsEngine, C18264a appPrefManager, Tq.j storeProvider, C5283b couponChangeManager, A couponsCommandManager, CouponOptions couponOptions, String tag, Pk.c pageType) {
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
        Intrinsics.j(pageType, "pageType");
        this.pageType = pageType;
        this.couponsResponse = new CouponsResponse(0, 0, null, null, null, false, null, l3.f92485d, null);
    }

    private final io.reactivex.l<List<Coupon>> E1() {
        final ArrayList arrayList = new ArrayList();
        arrayList.clear();
        io.reactivex.l<List<Coupon>> lVarFromCallable = io.reactivex.l.fromCallable(new Callable() { // from class: Km.s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return t.F1(this.f17419a, arrayList);
            }
        });
        Intrinsics.i(lVarFromCallable, "fromCallable(...)");
        return lVarFromCallable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List F1(t tVar, List list) {
        List<String> listG1 = tVar.G1(tVar.shoppingList);
        if (tVar.couponsResponse.f() != null) {
            for (String str : listG1) {
                List<Coupon> listF = tVar.couponsResponse.f();
                Intrinsics.g(listF);
                for (Coupon coupon : listF) {
                    CouponCategory category = coupon.getCategory();
                    Intrinsics.g(category);
                    String segmentName = category.getSegmentName();
                    if (segmentName == null) {
                        segmentName = "";
                    }
                    Locale locale = Locale.ROOT;
                    String lowerCase = segmentName.toLowerCase(locale);
                    Intrinsics.i(lowerCase, "toLowerCase(...)");
                    if (!StringsKt.c0(lowerCase, str, false, 2, null)) {
                        String lowerCase2 = coupon.getTitle().toLowerCase(locale);
                        Intrinsics.i(lowerCase2, "toLowerCase(...)");
                        if (!StringsKt.c0(lowerCase2, str, false, 2, null)) {
                            String lowerCase3 = coupon.getDescription().toLowerCase(locale);
                            Intrinsics.i(lowerCase3, "toLowerCase(...)");
                            if (StringsKt.c0(lowerCase3, str, false, 2, null)) {
                            }
                        }
                    }
                    if (!list.contains(coupon)) {
                        list.add(coupon);
                    }
                }
            }
            List<ShoppingListItem> list2 = tVar.shoppingList;
            Intrinsics.g(list2);
            for (ShoppingListItem shoppingListItem : list2) {
                List<Coupon> listF2 = tVar.couponsResponse.f();
                Intrinsics.g(listF2);
                for (Coupon coupon2 : listF2) {
                    if (coupon2.getOfferId() == shoppingListItem.getCouponId() && !list.contains(coupon2)) {
                        list.add(coupon2);
                    }
                }
            }
        }
        return list;
    }

    private final List<String> G1(List<ShoppingListItem> shoppingList) {
        String itemDescription;
        ArrayList arrayList = new ArrayList();
        Intrinsics.g(shoppingList);
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
                        if (!arrayList.contains(string)) {
                            String lowerCase = string.toLowerCase(Locale.ROOT);
                            Intrinsics.i(lowerCase, "toLowerCase(...)");
                            arrayList.add(lowerCase);
                        }
                    } else {
                        i10++;
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H1(t tVar, List list, List coupons) {
        Intrinsics.j(coupons, "coupons");
        h.b bVarE0 = tVar.E0();
        if (bVarE0 != null) {
            bVarE0.Z(tVar.a0(coupons, false, null));
            bVarE0.d(list);
            bVarE0.R0(false, 0);
            bVarE0.j(coupons.size());
            tVar.couponsViewVisibility.N(0);
            tVar.noCouponsTextVisibility.N(coupons.isEmpty() ? 0 : 8);
            tVar.x1(coupons.size(), tVar.couponsResponse.getAvailableCouponCount());
            tVar.Y();
            tVar.getCouponChangeManager().b(tVar.getTag());
        }
        tVar.f161921b = AbstractC17122a.EnumC2540a.IDLE;
        return Unit.f142422a;
    }

    @Override // Km.h, Tr.A.a
    public void C(CouponsResponse couponsResponse) {
        Integer numValueOf;
        Intrinsics.j(couponsResponse, "couponsResponse");
        int i10 = a.$EnumSwitchMapping$0[getPageType().ordinal()];
        if (i10 == 1) {
            if (couponsResponse.getCouponCount() > 10) {
                List<Coupon> listF = couponsResponse.f();
                numValueOf = listF != null ? Integer.valueOf(listF.size()) : null;
                Intrinsics.g(numValueOf);
                if (numValueOf.intValue() > 10) {
                    List<Coupon> listF2 = couponsResponse.f();
                    Intrinsics.g(listF2);
                    List<Coupon> listF3 = couponsResponse.f();
                    Intrinsics.g(listF3);
                    CollectionsKt.m1(listF2.subList(9, listF3.size() - 1)).clear();
                }
            }
            super.C(couponsResponse);
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            this.couponsResponse = couponsResponse;
            q1();
            return;
        }
        if (couponsResponse.getCouponCount() > 10) {
            List<Coupon> listF4 = couponsResponse.f();
            numValueOf = listF4 != null ? Integer.valueOf(listF4.size()) : null;
            Intrinsics.g(numValueOf);
            if (numValueOf.intValue() > 10) {
                List<Coupon> listF5 = couponsResponse.f();
                Intrinsics.g(listF5);
                List<Coupon> listF6 = couponsResponse.f();
                Intrinsics.g(listF6);
                CollectionsKt.m1(listF5.subList(9, listF6.size() - 1)).clear();
            }
        }
        couponsResponse.j(false);
        super.C(couponsResponse);
    }

    @Override // Km.h, Tr.A.a
    public void d(final List<ShoppingListItem> shoppingList) {
        Intrinsics.j(shoppingList, "shoppingList");
        if (a.$EnumSwitchMapping$0[getPageType().ordinal()] != 3) {
            super.d(shoppingList);
            return;
        }
        this.shoppingList = shoppingList;
        if (this.couponsResponse.f() != null) {
            io.reactivex.l<List<Coupon>> lVarObserveOn = E1().subscribeOn(C14764a.b()).observeOn(Mu.a.a());
            final Function1 function1 = new Function1() { // from class: Km.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t.H1(this.f17416a, shoppingList, (List) obj);
                }
            };
            this.relatedCouponsDisposable = lVarObserveOn.subscribe(new Pu.g() { // from class: Km.r
                @Override // Pu.g
                public final void accept(Object obj) {
                    t.J1(function1, obj);
                }
            });
        }
    }

    @Override // Km.h
    /* renamed from: s0, reason: from getter */
    public Pk.c getPageType() {
        return this.pageType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // Km.h, tm.AbstractC17122a
    public void P() {
        super.P();
        Nu.b bVar = this.relatedCouponsDisposable;
        if (bVar != null) {
            Intrinsics.g(bVar);
            if (!bVar.isDisposed()) {
                Nu.b bVar2 = this.relatedCouponsDisposable;
                Intrinsics.g(bVar2);
                bVar2.dispose();
            }
        }
    }

    @Override // Km.h
    public int q0() {
        if (getPageType() == Pk.c.f28331g) {
            return Nr.g.f22715V;
        }
        return Nr.g.f22716W;
    }
}
