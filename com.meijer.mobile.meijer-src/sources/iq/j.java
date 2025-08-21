package iq;

import Ki.LocalThemeScope;
import android.app.Activity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import bk.AbstractC6392a;
import eq.Asset;
import eq.C13838d;
import eq.TabScreen;
import eq.r0;
import iq.AbstractC14842b;
import iq.j;
import j0.InterfaceC14882C;
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

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Liq/E;", "uiState", "Lkotlin/Function1;", "Liq/b;", "", "sendEvent", "b", "(LKi/M;Landroidx/compose/ui/Modifier;Liq/E;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class j {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f139053a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ShopAndScanCartViewState f139054b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f139055c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC14842b, Unit> f139056d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: iq.j$a$a, reason: collision with other inner class name */
        static final class C2207a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f139057a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<AbstractC14842b, Unit> f139058b;

            /* JADX WARN: Multi-variable type inference failed */
            C2207a(LocalThemeScope localThemeScope, Function1<? super AbstractC14842b, Unit> function1) {
                this.f139057a = localThemeScope;
                this.f139058b = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1) {
                function1.invoke(AbstractC14842b.h.f139017a);
                return Unit.f143329a;
            }

            public final void b(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(443491580, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartScreen.<anonymous>.<anonymous> (ShopAndScanCartScreen.kt:50)");
                }
                LocalThemeScope localThemeScope = this.f139057a;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f139058b);
                final Function1<AbstractC14842b, Unit> function1 = this.f139058b;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: iq.i
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return j.a.C2207a.c(function1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C13838d.f(localThemeScope, (Function0) objB, composer, LocalThemeScope.f17314g);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                b(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, ShopAndScanCartViewState shopAndScanCartViewState, Activity activity, Function1<? super AbstractC14842b, Unit> function1) {
            this.f139053a = localThemeScope;
            this.f139054b = shopAndScanCartViewState;
            this.f139055c = activity;
            this.f139056d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Activity activity) {
            if (activity != null) {
                activity.finish();
            }
            return Unit.f143329a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(10406073, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartScreen.<anonymous> (ShopAndScanCartScreen.kt:42)");
            }
            LocalThemeScope localThemeScope = this.f139053a;
            AbstractC6392a storeName = this.f139054b.getStoreName();
            Asset asset = new Asset(Cj.i.f4810n0, com.meijer.mobile.shopandscan.e.f117937m1);
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(this.f139055c);
            final Activity activity = this.f139055c;
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
            C13838d.d(localThemeScope, storeName, asset, null, (Function0) objB, ComposableLambdaKt.c(443491580, true, new C2207a(this.f139053a, this.f139056d), composer, 54), composer, 196608 | LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f139059a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC14842b, Unit> f139060b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ShopAndScanCartViewState f139061c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f139062a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ShopAndScanCartViewState f139063b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<AbstractC14842b, Unit> f139064c;

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, ShopAndScanCartViewState shopAndScanCartViewState, Function1<? super AbstractC14842b, Unit> function1) {
                this.f139062a = localThemeScope;
                this.f139063b = shopAndScanCartViewState;
                this.f139064c = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit A(Function1 function1, String itemId) {
                Intrinsics.j(itemId, "itemId");
                function1.invoke(new AbstractC14842b.DismissItemRestriction(itemId));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit B(Function1 function1, long j10, String itemId) {
                Intrinsics.j(itemId, "itemId");
                function1.invoke(new AbstractC14842b.CouponAction(j10, itemId));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit C(Function1 function1, String itemId, int i10) {
                Intrinsics.j(itemId, "itemId");
                function1.invoke(new AbstractC14842b.UpdateItem(itemId, i10));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit D(Function1 function1, String itemId) {
                Intrinsics.j(itemId, "itemId");
                function1.invoke(new AbstractC14842b.RemoveItem(itemId));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit E(Function1 function1, String itemId) {
                Intrinsics.j(itemId, "itemId");
                function1.invoke(new AbstractC14842b.SyncItem(itemId));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit F(Function1 function1) {
                function1.invoke(AbstractC14842b.n.f139024a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit G(Function1 function1) {
                function1.invoke(AbstractC14842b.C2205b.f139010a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit H(Function1 function1) {
                function1.invoke(AbstractC14842b.a.f139009a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit I(Function1 function1) {
                function1.invoke(AbstractC14842b.g.f139016a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit J(Function1 function1) {
                function1.invoke(AbstractC14842b.i.f139018a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit v(Function1 function1) {
                function1.invoke(AbstractC14842b.c.f139011a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit w(Function1 function1, int i10, int i11) {
                function1.invoke(new AbstractC14842b.SaveScrollPosition(i10, i11));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit x(Function1 function1, int i10) {
                function1.invoke(new AbstractC14842b.SavePreviousItemCount(i10));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit y(Function1 function1, String itemId) {
                Intrinsics.j(itemId, "itemId");
                function1.invoke(new AbstractC14842b.FocusedQuantityStepper(itemId));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit z(Function1 function1) {
                function1.invoke(AbstractC14842b.p.f139026a);
                return Unit.f143329a;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                u(composer, num.intValue());
                return Unit.f143329a;
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
        b(LocalThemeScope localThemeScope, Function1<? super AbstractC14842b, Unit> function1, ShopAndScanCartViewState shopAndScanCartViewState) {
            this.f139059a = localThemeScope;
            this.f139060b = function1;
            this.f139061c = shopAndScanCartViewState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, int i10) {
            function1.invoke(AbstractC14842b.j.f139019a);
            return Unit.f143329a;
        }

        public final void b(InterfaceC14882C paddingValues, Composer composer, int i10) {
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
            List listP = CollectionsKt.p(new TabScreen(com.meijer.mobile.shopandscan.e.f117953s, com.meijer.mobile.shopandscan.b.f117717r, ComposableLambdaKt.c(253812914, true, new a(this.f139059a, this.f139061c, this.f139060b), composer, 54)), new TabScreen(com.meijer.mobile.shopandscan.e.f117956t, com.meijer.mobile.shopandscan.b.f117718s, C14841a.f139006a.a()));
            LocalThemeScope localThemeScope = this.f139059a;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f139060b);
            final Function1<AbstractC14842b, Unit> function1 = this.f139060b;
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
            r0.b(localThemeScope, listP, modifierH, (Function1) objB, composer, LocalThemeScope.f17314g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
            b(interfaceC14882C, composer, num.intValue());
            return Unit.f143329a;
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
    public static final void b(final Ki.LocalThemeScope r33, androidx.compose.ui.Modifier r34, final iq.ShopAndScanCartViewState r35, final kotlin.jvm.functions.Function1<? super iq.AbstractC14842b, kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iq.j.b(Ki.M, androidx.compose.ui.Modifier, iq.E, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, ShopAndScanCartViewState shopAndScanCartViewState, Function1 function1, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, shopAndScanCartViewState, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
