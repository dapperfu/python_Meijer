package zm;

import Ki.C;
import Ki.LocalThemeScope;
import Ki.Q;
import P0.e;
import android.content.Context;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import c5.C6484c;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.cart.ChangeFulfillmentPreviewDecorator;
import com.meijer.mobile.meijer.activity.cart.S0;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14882C;
import java.util.List;
import ki.ProductCardTags;
import ki.q1;
import kotlin.C17987a1;
import kotlin.C18051y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15432b;
import l0.InterfaceC15433c;
import m5.C15669h;
import oi.C16194s0;
import oi.P0;
import p1.C16335d;
import p1.C16338g;
import r0.C16806i;
import r0.RoundedCornerShape;
import yr.C18370z;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aS\u0010\f\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0001¢\u0006\u0004\b\f\u0010\r\u001aG\u0010\u000f\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0013\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a7\u0010\u0015\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a7\u0010\u001a\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a)\u0010\u001c\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0001¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006 ²\u0006\u000e\u0010\u001f\u001a\u00020\u001e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001f\u001a\u00020\u001e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001f\u001a\u00020\u001e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001f\u001a\u00020\u001e8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/meijer/activity/cart/S0$d;", "viewState", "Lkotlin/Function1;", "Lnk/f;", "", "onItemClick", "Lkotlin/Function0;", "onAcceptFulfillmentChange", "onBackArrowClicked", "l", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/cart/S0$d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "onContinue", "u", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/cart/S0$d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lbk/a;", "message", "p", "(LKi/M;Landroidx/compose/ui/Modifier;Lbk/a;Landroidx/compose/runtime/Composer;II)V", "i", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/cart/S0$d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/meijer/activity/cart/N0;", "decorator", "onClick", "r", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/cart/N0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "n", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "", "lastAction", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class m {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f173035a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ S0.ViewState f173036b;

        a(LocalThemeScope localThemeScope, S0.ViewState viewState) {
            this.f173035a = localThemeScope;
            this.f173036b = viewState;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1724552667, i10, -1, "com.meijer.mobile.meijer.activity.cart.composables.CartItems.<anonymous>.<anonymous>.<anonymous> (ChangeFulfillmentProductsScreen.kt:158)");
            }
            LocalThemeScope localThemeScope = this.f173035a;
            m.p(localThemeScope, D.i(Modifier.INSTANCE, localThemeScope.getAdsSpacing().getFive().getDp()), this.f173036b.getItemRemovalMessage(), composer, LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 6), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f173037a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<ChangeFulfillmentPreviewDecorator> f173038b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<nk.f, Unit> f173039c;

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, List<ChangeFulfillmentPreviewDecorator> list, Function1<? super nk.f, Unit> function1) {
            this.f173037a = localThemeScope;
            this.f173038b = list;
            this.f173039c = function1;
        }

        public final void a(InterfaceC15433c items, int i10, Composer composer, int i11) {
            Intrinsics.j(items, "$this$items");
            if ((i11 & 48) == 0) {
                i11 |= composer.d(i10) ? 32 : 16;
            }
            if ((i11 & 145) == 144 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(854678962, i11, -1, "com.meijer.mobile.meijer.activity.cart.composables.CartItems.<anonymous>.<anonymous>.<anonymous> (ChangeFulfillmentProductsScreen.kt:166)");
            }
            m.r(this.f173037a, C18370z.f(Modifier.INSTANCE, "list_item_container", null, 2, null), this.f173038b.get(i10), this.f173039c, composer, LocalThemeScope.f17314g);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15433c, num.intValue(), composer, num2.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f173040a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f173041b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f173042a;

            a(LocalThemeScope localThemeScope) {
                this.f173042a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1292832219, i10, -1, "com.meijer.mobile.meijer.activity.cart.composables.ChangeFulfillmentProductsScreen.<anonymous>.<anonymous> (ChangeFulfillmentProductsScreen.kt:84)");
                }
                Dr.g.g(this.f173042a, C16338g.c(Y.f100450H0, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        c(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f173040a = localThemeScope;
            this.f173041b = function0;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2142363365, i10, -1, "com.meijer.mobile.meijer.activity.cart.composables.ChangeFulfillmentProductsScreen.<anonymous> (ChangeFulfillmentProductsScreen.kt:81)");
            }
            Modifier modifierF = C18370z.f(Modifier.INSTANCE, "fulfillment_preview_toolbar", null, 2, null);
            AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(Cj.o.f5080p, new Object[0]);
            C.f.d dVar = C.f.d.f17051e;
            LocalThemeScope localThemeScope = this.f173040a;
            Dr.g.f(localThemeScope, modifierF, null, null, ComposableLambdaKt.c(-1292832219, true, new a(localThemeScope), composer, 54), this.f173041b, dVar, 0.0f, false, abstractC6392aD, composer, LocalThemeScope.f17314g | 24576 | (C.f.d.f17052f << 18) | (AbstractC6392a.f60445b << 27), 198);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f173043a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ S0.ViewState f173044b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<nk.f, Unit> f173045c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f173046d;

        /* JADX WARN: Multi-variable type inference failed */
        d(LocalThemeScope localThemeScope, S0.ViewState viewState, Function1<? super nk.f, Unit> function1, Function0<Unit> function0) {
            this.f173043a = localThemeScope;
            this.f173044b = viewState;
            this.f173045c = function1;
            this.f173046d = function0;
        }

        public final void a(InterfaceC14882C paddingValues, Composer composer, int i10) {
            Intrinsics.j(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i10 |= composer.V(paddingValues) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1156171060, i10, -1, "com.meijer.mobile.meijer.activity.cart.composables.ChangeFulfillmentProductsScreen.<anonymous> (ChangeFulfillmentProductsScreen.kt:90)");
            }
            m.u(this.f173043a, D.h(Modifier.INSTANCE, paddingValues), this.f173044b, this.f173045c, this.f173046d, composer, LocalThemeScope.f17314g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
            a(interfaceC14882C, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f173047a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ChangeFulfillmentPreviewDecorator f173048b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f173049c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class a extends AdaptedFunctionReference implements Function1<LocalThemeScope, ProductCardTags> {

            /* renamed from: h, reason: collision with root package name */
            public static final a f173050h = new a();

            a() {
                super(1, ProductCardTags.class, "<init>", "<init>(Lcom/meijer/mobile/android_acres_library/foundations/v2/LocalThemeScope;Lcom/meijer/mobile/android_acres_library/assemblies/TagTemplates$ProductCardTags;)V", 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ProductCardTags invoke(LocalThemeScope p02) {
                Intrinsics.j(p02, "p0");
                return new ProductCardTags(p02, null, 2, 0 == true ? 1 : 0);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function3<ProductCardTags, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f173051a;

            b(LocalThemeScope localThemeScope) {
                this.f173051a = localThemeScope;
            }

            public final void a(ProductCardTags Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-308208053, i10, -1, "com.meijer.mobile.meijer.activity.cart.composables.ProductOosCard.<anonymous>.<anonymous>.<anonymous> (ChangeFulfillmentProductsScreen.kt:190)");
                }
                Ii.h.h(this.f173051a, Assemble.getTags().getOutOfStock(), C16338g.c(Cj.o.f5069j0, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Tag.f142423e << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ProductCardTags o1Var, Composer composer, Integer num) {
                a(o1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        e(LocalThemeScope localThemeScope, ChangeFulfillmentPreviewDecorator n02, Modifier modifier) {
            this.f173047a = localThemeScope;
            this.f173048b = n02;
            this.f173049c = modifier;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1939584747, i10, -1, "com.meijer.mobile.meijer.activity.cart.composables.ProductOosCard.<anonymous> (ChangeFulfillmentProductsScreen.kt:188)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = D.i(companion, this.f173047a.getAdsSpacing().getFive().getDp());
            LocalThemeScope localThemeScope = this.f173047a;
            ChangeFulfillmentPreviewDecorator n02 = this.f173048b;
            Modifier modifier = this.f173049c;
            C5800d c5800d = C5800d.f48779a;
            C5800d.m mVarH = c5800d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = a.f173050h;
                composer.t(objB);
            }
            composer.P();
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-308208053, true, new b(localThemeScope), composer, 54);
            int i11 = LocalThemeScope.f17314g;
            Q.f(localThemeScope, (Function1) objB, composableLambdaC, composer, i11 | 432);
            C14890K.a(J.i(companion, localThemeScope.getAdsSpacing().getTwo().getDp()), composer, 0);
            Modifier modifierM = D.m(J.h(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getFive().getDp(), 7, null);
            MeasurePolicy measurePolicyB = G.b(c5800d.o(localThemeScope.getAdsSpacing().getFive().getDp()), companion2.l(), composer, 48);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierM);
            Function0<InterfaceC5953g> function0A2 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = D1.a(composer);
            D1.c(composerA2, measurePolicyB, companion3.e());
            D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            C15669h c15669hC = new C15669h.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())).f(n02.getThumbnailUrl()).c();
            a5.h hVarA = a5.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g()));
            String strC = n02.getThumbnailDescription();
            InterfaceC5926k interfaceC5926kA = InterfaceC5926k.INSTANCE.a();
            C6484c.d(c15669hC, strC, hVarA, J.v(C18370z.f(companion, "product_image", null, 2, null), H1.h.p(60)), C16335d.c(Cj.i.f4726O1, composer, 0), C16335d.c(Cj.i.f4726O1, composer, 0), null, null, null, null, null, interfaceC5926kA, 0.0f, null, 0, false, null, composer, 0, 48, 128960);
            String strB = n02.getProductName();
            if (strB == null) {
                strB = "";
            }
            si.j.h(localThemeScope, new q1.Label(C18370z.f(modifier, "preview_product_name", null, 2, null), null, null, null, F1.t.INSTANCE.b(), false, 2, localThemeScope.getAdsTypography().getBody().getTwo(), null, HttpResponseStatus.REDIRECTION_FOUND, null), strB, null, composer, i11 | (q1.Label.f142335j << 3), 4);
            composer.v();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void i(final LocalThemeScope localThemeScope, final Modifier modifier, final S0.ViewState viewState, final Function1<? super nk.f, Unit> onItemClick, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(viewState, "viewState");
        Intrinsics.j(onItemClick, "onItemClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1223790608);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(viewState) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(onItemClick) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1223790608, i11, -1, "com.meijer.mobile.meijer.activity.cart.composables.CartItems (ChangeFulfillmentProductsScreen.kt:150)");
            }
            final List<ChangeFulfillmentPreviewDecorator> listC = viewState.c();
            Modifier modifierF = J.f(C18370z.f(modifier, "updated_products_list", null, 2, null), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zD = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(localThemeScope))) | composerStartRestartGroup.D(viewState) | composerStartRestartGroup.D(listC) | ((i11 & 7168) == 2048);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: zm.h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return m.j(listC, localThemeScope, viewState, onItemClick, (l0.w) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            composer2 = composerStartRestartGroup;
            C15432b.a(modifierF, null, null, false, null, null, null, false, null, (Function1) objB, composer2, 0, 510);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: zm.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return m.k(localThemeScope, modifier, viewState, onItemClick, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(List list, LocalThemeScope localThemeScope, S0.ViewState viewState, Function1 function1, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1724552667, true, new a(localThemeScope, viewState)), 3, null);
        l0.w.b(LazyColumn, list.size(), null, null, ComposableLambdaKt.composableLambdaInstance(854678962, true, new b(localThemeScope, list, function1)), 6, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, Modifier modifier, S0.ViewState viewState, Function1 function1, int i10, Composer composer, int i11) {
        i(localThemeScope, modifier, viewState, function1, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    public static final void l(final LocalThemeScope localThemeScope, final Modifier modifier, final S0.ViewState viewState, final Function1<? super nk.f, Unit> onItemClick, final Function0<Unit> onAcceptFulfillmentChange, final Function0<Unit> onBackArrowClicked, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(viewState, "viewState");
        Intrinsics.j(onItemClick, "onItemClick");
        Intrinsics.j(onAcceptFulfillmentChange, "onAcceptFulfillmentChange");
        Intrinsics.j(onBackArrowClicked, "onBackArrowClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-280882870);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(viewState) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(onItemClick) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.D(onAcceptFulfillmentChange) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.D(onBackArrowClicked) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-280882870, i11, -1, "com.meijer.mobile.meijer.activity.cart.composables.ChangeFulfillmentProductsScreen (ChangeFulfillmentProductsScreen.kt:77)");
            }
            composer2 = composerStartRestartGroup;
            C17987a1.a(modifier, null, ComposableLambdaKt.c(2142363365, true, new c(localThemeScope, onBackArrowClicked), composerStartRestartGroup, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-1156171060, true, new d(localThemeScope, viewState, onItemClick, onAcceptFulfillmentChange), composerStartRestartGroup, 54), composer2, ((i11 >> 3) & 14) | 384, 12582912, 131066);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: zm.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return m.m(localThemeScope, modifier, viewState, onItemClick, onAcceptFulfillmentChange, onBackArrowClicked, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, Modifier modifier, S0.ViewState viewState, Function1 function1, Function0 function0, Function0 function02, int i10, Composer composer, int i11) {
        l(localThemeScope, modifier, viewState, function1, function0, function02, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    public static final void n(final LocalThemeScope localThemeScope, final Modifier modifier, final Function0<Unit> onContinue, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(onContinue, "onContinue");
        Composer composerStartRestartGroup = composer.startRestartGroup(-232972523);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(onContinue) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-232972523, i11, -1, "com.meijer.mobile.meijer.activity.cart.composables.FooterItem (ChangeFulfillmentProductsScreen.kt:237)");
            }
            Modifier modifierI = D.i(J.h(C18370z.f(modifier, "button_layout", null, 2, null), 0.0f, 1, null), localThemeScope.getAdsSpacing().getFive().getDp());
            MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierI);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyG, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C5806j c5806j = C5806j.f48836a;
            P0.k(localThemeScope, C16194s0.f154251a, C16338g.c(Y.f100622Q1, composerStartRestartGroup, 0), onContinue, C18370z.f(Modifier.INSTANCE, "continue_button", null, 2, null), C16338g.c(Y.f100622Q1, composerStartRestartGroup, 0), true, 0L, false, composerStartRestartGroup, 1572864 | LocalThemeScope.f17314g | (i11 & 14) | (C16194s0.f154252b << 3) | ((i11 << 3) & 7168), 192);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: zm.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return m.o(localThemeScope, modifier, onContinue, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, int i10, Composer composer, int i11) {
        n(localThemeScope, modifier, function0, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(final Ki.LocalThemeScope r22, androidx.compose.ui.Modifier r23, final bk.AbstractC6392a r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zm.m.p(Ki.M, androidx.compose.ui.Modifier, bk.a, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, Modifier modifier, AbstractC6392a abstractC6392a, int i10, int i11, Composer composer, int i12) {
        p(localThemeScope, modifier, abstractC6392a, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final void r(final LocalThemeScope localThemeScope, final Modifier modifier, final ChangeFulfillmentPreviewDecorator decorator, final Function1<? super nk.f, Unit> onClick, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(decorator, "decorator");
        Intrinsics.j(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1677609339);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(decorator) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(onClick) ? 2048 : 1024;
        }
        int i12 = i11;
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1677609339, i12, -1, "com.meijer.mobile.meijer.activity.cart.composables.ProductOosCard (ChangeFulfillmentProductsScreen.kt:181)");
            }
            Modifier modifierM = D.m(modifier, 0.0f, 0.0f, 0.0f, H1.h.p(1), 7, null);
            RoundedCornerShape roundedCornerShapeC = C16806i.c(localThemeScope.getAdsCornerRadii().getRadius01().getDp());
            float fP = H1.h.p(2);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = ((i12 & 7168) == 2048) | composerStartRestartGroup.D(decorator);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: zm.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m.t(onClick, decorator);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            composer2 = composerStartRestartGroup;
            C18051y.b((Function0) objB, modifierM, false, roundedCornerShapeC, 0L, 0L, null, fP, null, ComposableLambdaKt.c(1939584747, true, new e(localThemeScope, decorator, modifier), composerStartRestartGroup, 54), composer2, 817889280, 372);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: zm.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return m.s(localThemeScope, modifier, decorator, onClick, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(LocalThemeScope localThemeScope, Modifier modifier, ChangeFulfillmentPreviewDecorator n02, Function1 function1, int i10, Composer composer, int i11) {
        r(localThemeScope, modifier, n02, function1, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void u(final Ki.LocalThemeScope r20, androidx.compose.ui.Modifier r21, final com.meijer.mobile.meijer.activity.cart.S0.ViewState r22, final kotlin.jvm.functions.Function1<? super nk.f, kotlin.Unit> r23, final kotlin.jvm.functions.Function0<kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zm.m.u(Ki.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.cart.S0$d, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(LocalThemeScope localThemeScope, Modifier modifier, S0.ViewState viewState, Function1 function1, Function0 function0, int i10, int i11, Composer composer, int i12) {
        u(localThemeScope, modifier, viewState, function1, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Function1 function1, ChangeFulfillmentPreviewDecorator n02) {
        function1.invoke(n02.getProduct());
        return Unit.f143329a;
    }
}
