package com.meijer.mobile.meijer.activity.home.legacy.viewmodel;

import Il.FulfillmentBarDecorator;
import Lu.g;
import androidx.databinding.a;
import androidx.databinding.i;
import androidx.databinding.j;
import bk.AbstractC6392a;
import com.meijer.mobile.meijer.S;
import com.meijer.mobile.meijer.X;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.home.legacy.ExpandedSearchAppBarItemListener;
import com.meijer.mobile.meijer.activity.home.legacy.viewmodel.NavBarItem;
import ev.C13889a;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import il.m;
import io.reactivex.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import yo.MeijerUser;
import zl.AbstractC18503f;
import zl.k;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001EB1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010\u001dJ\r\u0010 \u001a\u00020\u0019¢\u0006\u0004\b \u0010\u001dJ\u000f\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b!\u0010\u001dJ\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010&R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010'R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R(\u00101\u001a\b\u0012\u0004\u0012\u0002000/8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00108\u001a\u0002078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0011\u0010=\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b<\u0010\u0016R\u0011\u0010?\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b>\u0010\u0016R\u0011\u0010B\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0011\u0010D\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bC\u0010\u0016¨\u0006F"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/legacy/viewmodel/NavBarItem;", "Landroidx/databinding/a;", "Lcom/meijer/mobile/meijer/activity/home/legacy/ExpandedSearchAppBarItemListener;", "Lyo/k;", "userManager", "LTq/j;", "storeProvider", "Lil/m;", "cartRepository", "Lhi/a;", "analyticsEngine", "Lzl/k;", "featureManager", "<init>", "(Lyo/k;LTq/j;Lil/m;Lhi/a;Lzl/k;)V", "Lbk/a;", "getGreeting", "()Lbk/a;", "getGreetingContentDescription", "getCartDescription", "", "getShoppingListIconResource", "()I", "Lcom/meijer/mobile/meijer/activity/home/legacy/viewmodel/NavBarItem$NavBarActionListener;", "listener", "", "onAttached", "(Lcom/meijer/mobile/meijer/activity/home/legacy/viewmodel/NavBarItem$NavBarActionListener;)V", "onDetached", "()V", "onAccountTapped", "onShoppingListTapped", "onCartTapped", "onSearchTapped", "onScanTapped", "Lyo/k;", "LTq/j;", "Lil/m;", "Lhi/a;", "Lzl/k;", "Lcom/meijer/mobile/meijer/activity/home/legacy/viewmodel/NavBarItem$NavBarActionListener;", "LJu/a;", "disposables", "LJu/a;", "LIl/a;", "fulfillmentBarDecorator", "LIl/a;", "Landroidx/databinding/i;", "", "greetingFirstName", "Landroidx/databinding/i;", "getGreetingFirstName", "()Landroidx/databinding/i;", "setGreetingFirstName", "(Landroidx/databinding/i;)V", "Landroidx/databinding/j;", "cartItemCount", "Landroidx/databinding/j;", "getCartItemCount", "()Landroidx/databinding/j;", "getExpandedSearchBarVisibility", "expandedSearchBarVisibility", "getCollapsedSearchBarVisibility", "collapsedSearchBarVisibility", "getFulfillmentType", "()Ljava/lang/String;", "fulfillmentType", "getTitle", "title", "NavBarActionListener", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class NavBarItem extends a implements ExpandedSearchAppBarItemListener {
    public static final int $stable = 8;
    private final InterfaceC14523a analyticsEngine;
    private final j cartItemCount;
    private final m cartRepository;
    private final Ju.a disposables;
    private final k featureManager;
    private FulfillmentBarDecorator fulfillmentBarDecorator;
    private i<String> greetingFirstName;
    private NavBarActionListener listener;
    private final Tq.j storeProvider;
    private final yo.k userManager;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/legacy/viewmodel/NavBarItem$NavBarActionListener;", "", "onShowAccount", "", "onShowShoppingList", "onShowCart", "onShowOrderOptions", "onSearch", "onScan", "onScanNoStoreSelected", "onSearchNoStoreSelected", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface NavBarActionListener {
        void onScan();

        void onScanNoStoreSelected();

        void onSearch();

        void onSearchNoStoreSelected();

        void onShowAccount();

        void onShowCart();

        void onShowOrderOptions();

        void onShowShoppingList();
    }

    public final void onDetached() {
        this.listener = null;
        this.disposables.d();
    }

    public NavBarItem(yo.k userManager, Tq.j storeProvider, m cartRepository, InterfaceC14523a analyticsEngine, k featureManager) {
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(featureManager, "featureManager");
        this.userManager = userManager;
        this.storeProvider = storeProvider;
        this.cartRepository = cartRepository;
        this.analyticsEngine = analyticsEngine;
        this.featureManager = featureManager;
        this.disposables = new Ju.a();
        this.fulfillmentBarDecorator = new FulfillmentBarDecorator(null, null, null, null, null, 0, 0, false, false, null, 1023, null);
        this.greetingFirstName = new i<>(userManager.p());
        this.cartItemCount = new j(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttached$lambda$10(NavBarItem navBarItem, MeijerUser meijerUser) {
        navBarItem.greetingFirstName.N(meijerUser.getFirstName());
        navBarItem.notifyPropertyChanged(8);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttached$lambda$12(Throwable th2) {
        qw.a.INSTANCE.f(th2, "Error in userStream for NavBarItem", new Object[0]);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttached$lambda$6(NavBarItem navBarItem, Integer num) {
        j jVar = navBarItem.cartItemCount;
        Intrinsics.g(num);
        jVar.N(num.intValue());
        navBarItem.notifyPropertyChanged(3);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttached$lambda$8(Throwable th2) {
        qw.a.INSTANCE.f(th2, "Error in totalItemCountStream for NavBarItem", new Object[0]);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCartTapped$lambda$15(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("menu");
        track.v("menu");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSearchTapped$lambda$16(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("home: search");
        track.v("dashboard");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onShoppingListTapped$lambda$14(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("menu");
        track.v("menu");
        return Unit.f143329a;
    }

    public final AbstractC6392a getCartDescription() {
        return AbstractC6392a.INSTANCE.b(X.f100310m, this.cartItemCount.M(), new Object[0]);
    }

    public final j getCartItemCount() {
        return this.cartItemCount;
    }

    public final int getCollapsedSearchBarVisibility() {
        return this.userManager.b() ? 0 : 8;
    }

    public final int getExpandedSearchBarVisibility() {
        return this.userManager.b() ? 8 : 0;
    }

    public final String getFulfillmentType() {
        return this.fulfillmentBarDecorator.i() ? "pickup" : this.fulfillmentBarDecorator.h() ? "delivery" : "None Selected";
    }

    public final AbstractC6392a getGreeting() {
        AbstractC6392a abstractC6392aD;
        String strM = this.greetingFirstName.M();
        String str = strM;
        if (str == null || StringsKt.s0(str)) {
            strM = null;
        }
        String str2 = strM;
        if (str2 != null) {
            String str3 = this.userManager.b() ? str2 : null;
            if (str3 != null && (abstractC6392aD = AbstractC6392a.INSTANCE.d(Y.f100722V6, str3)) != null) {
                return abstractC6392aD;
            }
        }
        return AbstractC6392a.INSTANCE.d(Y.f100684T6, new Object[0]);
    }

    public final AbstractC6392a getGreetingContentDescription() {
        AbstractC6392a abstractC6392aD;
        String strM = this.greetingFirstName.M();
        String str = strM;
        if (str == null || StringsKt.s0(str)) {
            strM = null;
        }
        String str2 = strM;
        if (str2 != null) {
            String str3 = this.userManager.b() ? str2 : null;
            if (str3 != null && (abstractC6392aD = AbstractC6392a.INSTANCE.d(Y.f100741W6, str3)) != null) {
                return abstractC6392aD;
            }
        }
        return AbstractC6392a.INSTANCE.d(Y.f100703U6, new Object[0]);
    }

    public final i<String> getGreetingFirstName() {
        return this.greetingFirstName;
    }

    public final int getShoppingListIconResource() {
        return this.featureManager.e(AbstractC18503f.O.f172854h) ? Cj.i.f4738S1 : S.f99556O;
    }

    public final int getTitle() {
        return Y.f100829ai;
    }

    public final void onAccountTapped() {
        NavBarActionListener navBarActionListener = this.listener;
        if (navBarActionListener != null) {
            navBarActionListener.onShowAccount();
        }
    }

    public final void onAttached(NavBarActionListener listener) {
        Intrinsics.j(listener, "listener");
        this.listener = listener;
        if (this.userManager.b()) {
            l<Integer> lVarObserveOn = this.cartRepository.Q().subscribeOn(C13889a.b()).observeOn(Iu.a.a());
            final Function1 function1 = new Function1() { // from class: en.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NavBarItem.onAttached$lambda$6(this.f130248a, (Integer) obj);
                }
            };
            g<? super Integer> gVar = new g() { // from class: en.c
                @Override // Lu.g
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: en.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NavBarItem.onAttached$lambda$8((Throwable) obj);
                }
            };
            Dk.a.a(lVarObserveOn.subscribe(gVar, new g() { // from class: en.e
                @Override // Lu.g
                public final void accept(Object obj) {
                    function12.invoke(obj);
                }
            }), this.disposables);
            l<MeijerUser> lVarObserveOn2 = this.userManager.F().subscribeOn(C13889a.b()).observeOn(Iu.a.a());
            final Function1 function13 = new Function1() { // from class: en.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NavBarItem.onAttached$lambda$10(this.f130251a, (MeijerUser) obj);
                }
            };
            g<? super MeijerUser> gVar2 = new g() { // from class: en.g
                @Override // Lu.g
                public final void accept(Object obj) {
                    function13.invoke(obj);
                }
            };
            final Function1 function14 = new Function1() { // from class: en.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NavBarItem.onAttached$lambda$12((Throwable) obj);
                }
            };
            Dk.a.a(lVarObserveOn2.subscribe(gVar2, new g() { // from class: en.i
                @Override // Lu.g
                public final void accept(Object obj) {
                    function14.invoke(obj);
                }
            }), this.disposables);
        }
    }

    public final void onCartTapped() {
        this.analyticsEngine.b(C14756c.a("event: home cart"), new Function1() { // from class: en.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NavBarItem.onCartTapped$lambda$15((TrackingData) obj);
            }
        });
        NavBarActionListener navBarActionListener = this.listener;
        if (navBarActionListener != null) {
            navBarActionListener.onShowCart();
        }
    }

    @Override // com.meijer.mobile.meijer.activity.home.legacy.ExpandedSearchAppBarItemListener
    public void onScanTapped() {
        if (this.storeProvider.d()) {
            NavBarActionListener navBarActionListener = this.listener;
            if (navBarActionListener != null) {
                navBarActionListener.onScan();
                return;
            }
            return;
        }
        NavBarActionListener navBarActionListener2 = this.listener;
        if (navBarActionListener2 != null) {
            navBarActionListener2.onScanNoStoreSelected();
        }
    }

    @Override // com.meijer.mobile.meijer.activity.home.legacy.ExpandedSearchAppBarItemListener
    public void onSearchTapped() {
        this.analyticsEngine.b(C14756c.a("event: home: search icon"), new Function1() { // from class: en.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NavBarItem.onSearchTapped$lambda$16((TrackingData) obj);
            }
        });
        if (this.storeProvider.d()) {
            NavBarActionListener navBarActionListener = this.listener;
            if (navBarActionListener != null) {
                navBarActionListener.onSearch();
                return;
            }
            return;
        }
        NavBarActionListener navBarActionListener2 = this.listener;
        if (navBarActionListener2 != null) {
            navBarActionListener2.onSearchNoStoreSelected();
        }
    }

    public final void onShoppingListTapped() {
        this.analyticsEngine.b(C14756c.a("event: home shopping list"), new Function1() { // from class: en.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NavBarItem.onShoppingListTapped$lambda$14((TrackingData) obj);
            }
        });
        NavBarActionListener navBarActionListener = this.listener;
        if (navBarActionListener != null) {
            navBarActionListener.onShowShoppingList();
        }
    }

    public final void setGreetingFirstName(i<String> iVar) {
        Intrinsics.j(iVar, "<set-?>");
        this.greetingFirstName = iVar;
    }
}
