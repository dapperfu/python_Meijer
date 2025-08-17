package xp;

import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import com.meijer.mobile.rateandtip.ux.y;
import j4.i;
import kotlin.C14664h;
import kotlin.C14675s;
import kotlin.InterfaceC6163b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import wp.j;
import ws.C17861g;
import xp.C18077b;
import xp.g;
import xs.C18091a;
import xs.EnumC18092b;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\r²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Li4/s;", "LJi/M;", "localThemeScope", "Lcom/meijer/mobile/rateandtip/ux/y;", "viewModel", "Lkotlin/Function1;", "Lcom/meijer/mobile/rateandtip/ux/y$a;", "", "onAction", "a", "(Li4/s;LJi/M;Lcom/meijer/mobile/rateandtip/ux/y;Lkotlin/jvm/functions/Function1;)V", "Lcom/meijer/mobile/rateandtip/ux/y$d;", "viewState", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: xp.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C18077b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: xp.b$a */
    static final class a implements Function4<InterfaceC6163b, C14664h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f169825a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f169826b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<y.a, Unit> f169827c;

        /* JADX WARN: Multi-variable type inference failed */
        a(y yVar, LocalThemeScope localThemeScope, Function1<? super y.a, Unit> function1) {
            this.f169825a = yVar;
            this.f169826b = localThemeScope;
            this.f169827c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(Function1 function1, int i10) {
            function1.invoke(new y.a.ChangeRating(i10));
            return Unit.f142422a;
        }

        public final void b(InterfaceC6163b composable, C14664h it, Composer composer, int i10) {
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(it, "it");
            if (ComposerKt.M()) {
                ComposerKt.U(-999843181, i10, -1, "com.meijer.mobile.rateandtip.ux.compose.navigation.rateAndTipNavGraph.<anonymous>.<anonymous> (RateAndTipNavGraph.kt:30)");
            }
            z1 z1VarB = o1.b(this.f169825a.L(), null, composer, 0, 1);
            int shopperRating = c(z1VarB).getShopperRating();
            C18091a rateDecorator = c(z1VarB).getRateDecorator();
            LocalThemeScope localThemeScope = this.f169826b;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f169827c);
            final Function1<y.a, Unit> function1 = this.f169827c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: xp.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C18077b.a.d(function1, ((Integer) obj).intValue());
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17861g.b(localThemeScope, null, rateDecorator, shopperRating, (Function1) objB, composer, LocalThemeScope.f15770g | (C18091a.f169897e << 6), 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6163b interfaceC6163b, C14664h c14664h, Composer composer, Integer num) {
            b(interfaceC6163b, c14664h, composer, num.intValue());
            return Unit.f142422a;
        }

        private static final y.ViewState c(z1<y.ViewState> z1Var) {
            return z1Var.getValue();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: xp.b$b, reason: collision with other inner class name */
    static final class C2729b implements Function4<InterfaceC6163b, C14664h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f169828a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f169829b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<y.a, Unit> f169830c;

        /* JADX WARN: Multi-variable type inference failed */
        C2729b(y yVar, LocalThemeScope localThemeScope, Function1<? super y.a, Unit> function1) {
            this.f169828a = yVar;
            this.f169829b = localThemeScope;
            this.f169830c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function1 function1, EnumC18092b it) {
            Intrinsics.j(it, "it");
            function1.invoke(new y.a.SelectTipOption(it));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(Function1 function1, double d10) {
            function1.invoke(new y.a.UpdateCustomTipAmount(d10));
            return Unit.f142422a;
        }

        public final void c(InterfaceC6163b composable, C14664h it, Composer composer, int i10) {
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(it, "it");
            if (ComposerKt.M()) {
                ComposerKt.U(-935350966, i10, -1, "com.meijer.mobile.rateandtip.ux.compose.navigation.rateAndTipNavGraph.<anonymous>.<anonymous> (RateAndTipNavGraph.kt:39)");
            }
            z1 z1VarB = o1.b(this.f169828a.L(), null, composer, 0, 1);
            LocalThemeScope localThemeScope = this.f169829b;
            y.ViewState viewStateD = d(z1VarB);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f169830c);
            final Function1<y.a, Unit> function1 = this.f169830c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: xp.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C18077b.C2729b.e(function1, (EnumC18092b) obj);
                    }
                };
                composer.t(objB);
            }
            Function1 function12 = (Function1) objB;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f169830c);
            final Function1<y.a, Unit> function13 = this.f169830c;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: xp.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C18077b.C2729b.f(function13, ((Double) obj).doubleValue());
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            j.b(localThemeScope, null, viewStateD, function12, (Function1) objB2, composer, LocalThemeScope.f15770g, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6163b interfaceC6163b, C14664h c14664h, Composer composer, Integer num) {
            c(interfaceC6163b, c14664h, composer, num.intValue());
            return Unit.f142422a;
        }

        private static final y.ViewState d(z1<y.ViewState> z1Var) {
            return z1Var.getValue();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: xp.b$c */
    static final class c implements Function4<InterfaceC6163b, C14664h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f169831a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f169832b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<y.a, Unit> f169833c;

        /* JADX WARN: Multi-variable type inference failed */
        c(y yVar, LocalThemeScope localThemeScope, Function1<? super y.a, Unit> function1) {
            this.f169831a = yVar;
            this.f169832b = localThemeScope;
            this.f169833c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function1 function1) {
            function1.invoke(y.a.c.f115163a);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(Function1 function1) {
            function1.invoke(y.a.b.f115162a);
            return Unit.f142422a;
        }

        public final void c(InterfaceC6163b composable, C14664h it, Composer composer, int i10) {
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(it, "it");
            if (ComposerKt.M()) {
                ComposerKt.U(-766099381, i10, -1, "com.meijer.mobile.rateandtip.ux.compose.navigation.rateAndTipNavGraph.<anonymous>.<anonymous> (RateAndTipNavGraph.kt:48)");
            }
            y.ViewState viewStateD = d(o1.b(this.f169831a.L(), null, composer, 0, 1));
            LocalThemeScope localThemeScope = this.f169832b;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f169833c);
            final Function1<y.a, Unit> function1 = this.f169833c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: xp.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C18077b.c.e(function1);
                    }
                };
                composer.t(objB);
            }
            Function0 function0 = (Function0) objB;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f169833c);
            final Function1<y.a, Unit> function12 = this.f169833c;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: xp.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C18077b.c.f(function12);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            wp.f.f(localThemeScope, null, viewStateD, function0, (Function0) objB2, composer, LocalThemeScope.f15770g, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6163b interfaceC6163b, C14664h c14664h, Composer composer, Integer num) {
            c(interfaceC6163b, c14664h, composer, num.intValue());
            return Unit.f142422a;
        }

        private static final y.ViewState d(z1<y.ViewState> z1Var) {
            return z1Var.getValue();
        }
    }

    public static final void a(C14675s c14675s, LocalThemeScope localThemeScope, y viewModel, Function1<? super y.a, Unit> onAction) {
        Intrinsics.j(c14675s, "<this>");
        Intrinsics.j(localThemeScope, "localThemeScope");
        Intrinsics.j(viewModel, "viewModel");
        Intrinsics.j(onAction, "onAction");
        C14675s c14675s2 = new C14675s(c14675s.getProvider(), viewModel.L().getValue().getStartScreen().getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), "RateAndTipRoute");
        i.c(c14675s2, g.a.f169839b.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-999843181, true, new a(viewModel, localThemeScope, onAction)), 126, null);
        i.c(c14675s2, g.c.f169841b.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-935350966, true, new C2729b(viewModel, localThemeScope, onAction)), 126, null);
        i.c(c14675s2, g.b.f169840b.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-766099381, true, new c(viewModel, localThemeScope, onAction)), 126, null);
        c14675s.e(c14675s2);
    }
}
