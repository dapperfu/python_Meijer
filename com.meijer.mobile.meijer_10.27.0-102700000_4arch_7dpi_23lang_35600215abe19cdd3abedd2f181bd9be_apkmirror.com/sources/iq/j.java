package iq;

import Ji.LocalThemeScope;
import ak.AbstractC5607a;
import android.app.Activity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import eq.Asset;
import eq.C13729d;
import eq.TabScreen;
import eq.r0;
import iq.AbstractC14754b;
import iq.j;
import j0.InterfaceC14794C;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Liq/E;", "uiState", "Lkotlin/Function1;", "Liq/b;", "", "sendEvent", "b", "(LJi/M;Landroidx/compose/ui/Modifier;Liq/E;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class j {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f138411a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ShopAndScanCartViewState f138412b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f138413c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC14754b, Unit> f138414d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: iq.j$a$a, reason: collision with other inner class name */
        static final class C2187a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f138415a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<AbstractC14754b, Unit> f138416b;

            /* JADX WARN: Multi-variable type inference failed */
            C2187a(LocalThemeScope localThemeScope, Function1<? super AbstractC14754b, Unit> function1) {
                this.f138415a = localThemeScope;
                this.f138416b = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1) {
                function1.invoke(AbstractC14754b.h.f138375a);
                return Unit.f142422a;
            }

            public final void b(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(443491580, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartScreen.<anonymous>.<anonymous> (ShopAndScanCartScreen.kt:50)");
                }
                LocalThemeScope localThemeScope = this.f138415a;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f138416b);
                final Function1<AbstractC14754b, Unit> function1 = this.f138416b;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: iq.i
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return j.a.C2187a.c(function1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C13729d.f(localThemeScope, (Function0) objB, composer, LocalThemeScope.f15770g);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                b(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, ShopAndScanCartViewState shopAndScanCartViewState, Activity activity, Function1<? super AbstractC14754b, Unit> function1) {
            this.f138411a = localThemeScope;
            this.f138412b = shopAndScanCartViewState;
            this.f138413c = activity;
            this.f138414d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Activity activity) {
            if (activity != null) {
                activity.finish();
            }
            return Unit.f142422a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(10406073, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartScreen.<anonymous> (ShopAndScanCartScreen.kt:42)");
            }
            LocalThemeScope localThemeScope = this.f138411a;
            AbstractC5607a storeName = this.f138412b.getStoreName();
            Asset asset = new Asset(Bj.i.f2765n0, com.meijer.mobile.shopandscan.e.f116992m1);
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(this.f138413c);
            final Activity activity = this.f138413c;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: iq.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return j.a.c(activity);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C13729d.d(localThemeScope, storeName, asset, null, (Function0) objB, ComposableLambdaKt.c(443491580, true, new C2187a(this.f138411a, this.f138414d), composer, 54), composer, 196608 | LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f138417a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC14754b, Unit> f138418b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ShopAndScanCartViewState f138419c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f138420a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ShopAndScanCartViewState f138421b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<AbstractC14754b, Unit> f138422c;

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, ShopAndScanCartViewState shopAndScanCartViewState, Function1<? super AbstractC14754b, Unit> function1) {
                this.f138420a = localThemeScope;
                this.f138421b = shopAndScanCartViewState;
                this.f138422c = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit A(Function1 function1, String itemId) {
                Intrinsics.j(itemId, "itemId");
                function1.invoke(new AbstractC14754b.DismissItemRestriction(itemId));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit B(Function1 function1, long j10, String itemId) {
                Intrinsics.j(itemId, "itemId");
                function1.invoke(new AbstractC14754b.CouponAction(j10, itemId));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit C(Function1 function1, String itemId, int i10) {
                Intrinsics.j(itemId, "itemId");
                function1.invoke(new AbstractC14754b.UpdateItem(itemId, i10));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit D(Function1 function1, String itemId) {
                Intrinsics.j(itemId, "itemId");
                function1.invoke(new AbstractC14754b.RemoveItem(itemId));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit E(Function1 function1, String itemId) {
                Intrinsics.j(itemId, "itemId");
                function1.invoke(new AbstractC14754b.SyncItem(itemId));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit F(Function1 function1) {
                function1.invoke(AbstractC14754b.n.f138382a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit G(Function1 function1) {
                function1.invoke(AbstractC14754b.C2185b.f138368a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit H(Function1 function1) {
                function1.invoke(AbstractC14754b.a.f138367a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit I(Function1 function1) {
                function1.invoke(AbstractC14754b.g.f138374a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit J(Function1 function1) {
                function1.invoke(AbstractC14754b.i.f138376a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit v(Function1 function1) {
                function1.invoke(AbstractC14754b.c.f138369a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit w(Function1 function1, int i10, int i11) {
                function1.invoke(new AbstractC14754b.SaveScrollPosition(i10, i11));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit x(Function1 function1, int i10) {
                function1.invoke(new AbstractC14754b.SavePreviousItemCount(i10));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit y(Function1 function1, String itemId) {
                Intrinsics.j(itemId, "itemId");
                function1.invoke(new AbstractC14754b.FocusedQuantityStepper(itemId));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit z(Function1 function1) {
                function1.invoke(AbstractC14754b.p.f138384a);
                return Unit.f142422a;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                u(composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX WARN: Removed duplicated region for block: B:76:0x022f  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x023a  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x025f  */
            /* JADX WARN: Removed duplicated region for block: B:85:0x0267  */
            /* JADX WARN: Removed duplicated region for block: B:88:0x0288  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x0290  */
            /* JADX WARN: Removed duplicated region for block: B:93:0x02c6  */
            /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void u(androidx.compose.runtime.Composer r24, int r25) {
                /*
                    Method dump skipped, instructions count: 714
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: iq.j.b.a.u(androidx.compose.runtime.Composer, int):void");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, Function1<? super AbstractC14754b, Unit> function1, ShopAndScanCartViewState shopAndScanCartViewState) {
            this.f138417a = localThemeScope;
            this.f138418b = function1;
            this.f138419c = shopAndScanCartViewState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, int i10) {
            function1.invoke(AbstractC14754b.j.f138377a);
            return Unit.f142422a;
        }

        public final void b(InterfaceC14794C paddingValues, Composer composer, int i10) {
            Intrinsics.j(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i10 |= composer.V(paddingValues) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1274280782, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartScreen.<anonymous> (ShopAndScanCartScreen.kt:57)");
            }
            Modifier modifierH = androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, paddingValues);
            List listP = CollectionsKt.p(new TabScreen(com.meijer.mobile.shopandscan.e.f117008s, com.meijer.mobile.shopandscan.b.f116772r, ComposableLambdaKt.c(253812914, true, new a(this.f138417a, this.f138419c, this.f138418b), composer, 54)), new TabScreen(com.meijer.mobile.shopandscan.e.f117011t, com.meijer.mobile.shopandscan.b.f116773s, C14753a.f138364a.a()));
            LocalThemeScope localThemeScope = this.f138417a;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f138418b);
            final Function1<AbstractC14754b, Unit> function1 = this.f138418b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: iq.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return j.b.c(function1, ((Integer) obj).intValue());
                    }
                };
                composer.t(objB);
            }
            composer.P();
            r0.b(localThemeScope, listP, modifierH, (Function1) objB, composer, LocalThemeScope.f15770g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
            b(interfaceC14794C, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r33, androidx.compose.ui.Modifier r34, final iq.ShopAndScanCartViewState r35, final kotlin.jvm.functions.Function1<? super iq.AbstractC14754b, kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iq.j.b(Ji.M, androidx.compose.ui.Modifier, iq.E, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, ShopAndScanCartViewState shopAndScanCartViewState, Function1 function1, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, shopAndScanCartViewState, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
