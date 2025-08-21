package mr;

import Ki.C;
import Ki.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import bk.AbstractC6392a;
import com.meijer.mobile.subscription.ux.subscription.AbstractC13119k;
import com.meijer.mobile.subscription.ux.subscription.J;
import com.meijer.mobile.subscription.ux.subscription.SubscriptionViewState;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import java.util.List;
import ki.q1;
import kotlin.C18054z0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kr.C15410d;
import l0.C15429A;
import l0.C15432b;
import l0.InterfaceC15433c;
import mr.z;
import mv.C15809k;
import mv.InterfaceC15783O;
import oi.C16136F;
import oi.P0;
import p1.C16335d;
import p1.C16338g;
import pi.C16453n;
import r1.C16819m;
import yr.N;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aG\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\r\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a9\u0010\u000f\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a?\u0010\u0016\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u0013H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a%\u0010\u001a\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a9\u0010\u001e\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a3\u0010\"\u001a\u00020\u0007*\u00020\u00002\u0006\u0010 \u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0007¢\u0006\u0004\b\"\u0010#¨\u0006'²\u0006\u0010\u0010%\u001a\u0004\u0018\u00010$8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010&\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lcom/meijer/mobile/subscription/ux/subscription/I;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcom/meijer/mobile/subscription/ux/subscription/k;", "", "onAction", "Lkotlin/Function0;", "onExit", "p", "(LKi/M;Lcom/meijer/mobile/subscription/ux/subscription/I;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "z", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "u", "(LKi/M;Lcom/meijer/mobile/subscription/ux/subscription/I;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lmr/l;", "dayDecorator", "Lkotlin/Function2;", "", "onDaySelected", "r", "(LKi/M;Lmr/l;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/subscription/ux/subscription/J$a;", "headerItem", "k", "(LKi/M;Lcom/meijer/mobile/subscription/ux/subscription/J$a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/subscription/ux/subscription/J$b;", "slotItem", "m", "(LKi/M;Lcom/meijer/mobile/subscription/ux/subscription/J$b;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "isContinueEnabled", "onContinueClick", "x", "(LKi/M;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "isCheckoutSubscriptionLoading", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class z {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f151583a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC13119k, Unit> f151584b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f151585c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: mr.z$a$a, reason: collision with other inner class name */
        static final class C2336a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f151586a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f151587b;

            C2336a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
                this.f151586a = localThemeScope;
                this.f151587b = function0;
            }

            public final void a(InterfaceC14888I SubscriptionToolbar, Composer composer, int i10) {
                Intrinsics.j(SubscriptionToolbar, "$this$SubscriptionToolbar");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1261780935, i10, -1, "com.meijer.mobile.subscription.ux.checkout.TimeSlotsContent.<anonymous>.<anonymous> (TimeSlotsContent.kt:97)");
                }
                P0.i(this.f151586a, C16136F.f153892a, this.f151587b, C.f.o.f17066e, C16338g.c(C15410d.f148810u, composer, 0), null, false, false, 0L, composer, LocalThemeScope.f17314g | (C16136F.f153893b << 3) | (C.f.o.f17067f << 9), 240);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, Function1<? super AbstractC13119k, Unit> function1, Function0<Unit> function0) {
            this.f151583a = localThemeScope;
            this.f151584b = function1;
            this.f151585c = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(AbstractC13119k.e.f120022a);
            return Unit.f143329a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-40607763, i10, -1, "com.meijer.mobile.subscription.ux.checkout.TimeSlotsContent.<anonymous> (TimeSlotsContent.kt:89)");
            }
            String strC = C16338g.c(C15410d.f148734A0, composer, 0);
            C.f.d dVar = C.f.d.f17051e;
            AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(C15410d.f148782g, new Object[0]);
            LocalThemeScope localThemeScope = this.f151583a;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f151584b);
            final Function1<AbstractC13119k, Unit> function1 = this.f151584b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: mr.y
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return z.a.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            jr.m.c(localThemeScope, null, strC, abstractC6392aD, dVar, (Function0) objB, ComposableLambdaKt.c(1261780935, true, new C2336a(this.f151583a, this.f151585c), composer, 54), composer, 1572864 | LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 9) | (C.f.d.f17052f << 12), 1);
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
        final /* synthetic */ SubscriptionViewState f151588a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f151589b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC13119k, Unit> f151590c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f151591d;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
        public static final class a extends Lambda implements Function1 {

            /* renamed from: f, reason: collision with root package name */
            public static final a f151592f = new a();

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Void invoke(J j10) {
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        /* renamed from: mr.z$b$b, reason: collision with other inner class name */
        public static final class C2337b extends Lambda implements Function1<Integer, Object> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function1 f151593f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List f151594g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2337b(Function1 function1, List list) {
                super(1);
                this.f151593f = function1;
                this.f151594g = list;
            }

            public final Object a(int i10) {
                return this.f151593f.invoke(this.f151594g.get(i10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
        @SourceDebugExtension
        public static final class c extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f151595f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f151596g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function1 f151597h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(List list, LocalThemeScope localThemeScope, Function1 function1) {
                super(4);
                this.f151595f = list;
                this.f151596g = localThemeScope;
                this.f151597h = function1;
            }

            public final void a(InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = (composer.V(interfaceC15433c) ? 4 : 2) | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= composer.d(i10) ? 32 : 16;
                }
                if (!composer.p((i12 & 147) != 146, i12 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                J j10 = (J) this.f151595f.get(i10);
                composer.startReplaceGroup(-1173731723);
                if (j10 instanceof J.HeaderItem) {
                    composer.startReplaceGroup(-1173660672);
                    z.k(this.f151596g, (J.HeaderItem) j10, androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), composer, LocalThemeScope.f17314g | 384 | (AbstractC6392a.f60445b << 3), 0);
                    composer.P();
                } else {
                    if (!(j10 instanceof J.SlotItem)) {
                        composer.startReplaceGroup(-314956978);
                        composer.P();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceGroup(-314943058);
                    z.m(this.f151596g, (J.SlotItem) j10, null, this.f151597h, composer, LocalThemeScope.f17314g, 2);
                    composer.P();
                }
                composer.P();
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

        /* JADX WARN: Multi-variable type inference failed */
        b(SubscriptionViewState subscriptionViewState, LocalThemeScope localThemeScope, Function1<? super AbstractC13119k, Unit> function1, boolean z10) {
            this.f151588a = subscriptionViewState;
            this.f151589b = localThemeScope;
            this.f151590c = function1;
            this.f151591d = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(SubscriptionViewState subscriptionViewState, LocalThemeScope localThemeScope, Function1 function1, l0.w LazyColumn) {
            Intrinsics.j(LazyColumn, "$this$LazyColumn");
            List<J> listH = subscriptionViewState.h();
            LazyColumn.i(listH.size(), null, new C2337b(a.f151592f, listH), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new c(listH, localThemeScope, function1)));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function1 function1, SubscriptionViewState subscriptionViewState) {
            function1.invoke(new AbstractC13119k.SaveSubscription(subscriptionViewState.getSubscriptionDecorator()));
            return Unit.f143329a;
        }

        public final void c(InterfaceC14882C paddingValues, Composer composer, int i10) {
            int i11;
            Intrinsics.j(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(paddingValues) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(534258516, i11, -1, "com.meijer.mobile.subscription.ux.checkout.TimeSlotsContent.<anonymous> (TimeSlotsContent.kt:108)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierF = androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null);
            final SubscriptionViewState subscriptionViewState = this.f151588a;
            final LocalThemeScope localThemeScope = this.f151589b;
            final Function1<AbstractC13119k, Unit> function1 = this.f151590c;
            boolean z10 = this.f151591d;
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierF);
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
            D1.c(composerA, measurePolicyG, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C5806j c5806j = C5806j.f48836a;
            if (subscriptionViewState.getIsSubscriptionLoading()) {
                composer.startReplaceGroup(1901836231);
                N.b(localThemeScope, null, composer, LocalThemeScope.f17314g, 1);
                composer.P();
            } else {
                composer.startReplaceGroup(1901951830);
                Modifier modifierH = androidx.compose.foundation.layout.J.h(D.h(companion, paddingValues), 0.0f, 1, null);
                MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), companion2.k(), composer, 0);
                int iA2 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierH);
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
                D1.c(composerA2, measurePolicyA, companion3.e());
                D1.c(composerA2, interfaceC5884sR2, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion3.f());
                C14903g c14903g = C14903g.f139698a;
                Modifier modifierD = androidx.compose.foundation.layout.J.D(companion, null, false, 3, null);
                int i12 = LocalThemeScope.f17314g;
                z.z(localThemeScope, modifierD, composer, i12 | 48, 0);
                z.u(localThemeScope, subscriptionViewState, null, function1, composer, i12, 2);
                Modifier modifierH2 = androidx.compose.foundation.layout.J.h(InterfaceC14902f.b(c14903g, companion, 1.0f, false, 2, null), 0.0f, 1, null);
                InterfaceC14882C interfaceC14882CE = D.e(localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), 2, null);
                composer.startReplaceGroup(-1746271574);
                boolean zD = composer.D(subscriptionViewState) | composer.D(localThemeScope) | composer.V(function1);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: mr.A
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return z.b.d(subscriptionViewState, localThemeScope, function1, (l0.w) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C15432b.a(modifierH2, null, interfaceC14882CE, false, null, null, null, false, null, (Function1) objB, composer, 0, 506);
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(function1) | composer.D(subscriptionViewState);
                Object objB2 = composer.B();
                if (zV || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: mr.B
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return z.b.e(function1, subscriptionViewState);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                z.x(localThemeScope, z10, null, (Function0) objB2, composer, i12, 2);
                composer.v();
                composer.P();
            }
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
            c(interfaceC14882C, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f151598a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f151599b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TimeSlotDayDecorator f151600c;

        c(LocalThemeScope localThemeScope, String str, TimeSlotDayDecorator timeSlotDayDecorator) {
            this.f151598a = localThemeScope;
            this.f151599b = str;
            this.f151600c = timeSlotDayDecorator;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(String str, r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.g0(semantics, str);
            return Unit.f143329a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-807551606, i10, -1, "com.meijer.mobile.subscription.ux.checkout.TimeSlotsDayItem.<anonymous> (TimeSlotsContent.kt:266)");
            }
            C5800d.f fVarB = C5800d.f48779a.b();
            e.b bVarG = P0.e.INSTANCE.g();
            Modifier modifierJ = D.j(Modifier.INSTANCE, this.f151598a.getAdsSpacing().getFive().getDp(), this.f151598a.getAdsSpacing().getFour().getDp());
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f151599b);
            final String str = this.f151599b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: mr.C
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return z.c.c(str, (r1.u) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Modifier modifierD = C16819m.d(modifierJ, false, (Function1) objB, 1, null);
            LocalThemeScope localThemeScope = this.f151598a;
            TimeSlotDayDecorator timeSlotDayDecorator = this.f151600c;
            MeasurePolicy measurePolicyA = C5807k.a(fVarB, bVarG, composer, 54);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
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
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14903g c14903g = C14903g.f139698a;
            si.j.h(localThemeScope, new q1.Label(null, null, null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 375, null), timeSlotDayDecorator.c(), null, composer, (q1.Label.f142335j << 3) | LocalThemeScope.f17314g, 4);
            composer.v();
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
    static final class d implements Function2<AbstractC13119k, Boolean, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC13119k, Unit> f151601a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC15783O f151602b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C15429A f151603c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f151604d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.subscription.ux.checkout.TimeSlotsContentKt$TimeSlotsDaysSection$1$1$1$1$1$1$1", f = "TimeSlotsContent.kt", l = {225}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f151605a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C15429A f151606b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f151607c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C15429A c15429a, int i10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f151606b = c15429a;
                this.f151607c = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f151606b, this.f151607c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f151605a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C15429A c15429a = this.f151606b;
                    int i11 = this.f151607c;
                    this.f151605a = 1;
                    if (C15429A.l(c15429a, i11, 0, this, 2, null) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(Function1<? super AbstractC13119k, Unit> function1, InterfaceC15783O interfaceC15783O, C15429A c15429a, int i10) {
            this.f151601a = function1;
            this.f151602b = interfaceC15783O;
            this.f151603c = c15429a;
            this.f151604d = i10;
        }

        public final void a(AbstractC13119k action, boolean z10) {
            Intrinsics.j(action, "action");
            this.f151601a.invoke(action);
            if (z10) {
                C15809k.d(this.f151602b, null, null, new a(this.f151603c, this.f151604d, null), 3, null);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC13119k abstractC13119k, Boolean bool) {
            a(abstractC13119k, bool.booleanValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class e extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f151608f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List list) {
            super(1);
            this.f151608f = list;
        }

        public final Object a(int i10) {
            this.f151608f.get(i10);
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class f extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f151609f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f151610g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f151611h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC15783O f151612i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C15429A f151613j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List list, LocalThemeScope localThemeScope, Function1 function1, InterfaceC15783O interfaceC15783O, C15429A c15429a) {
            super(4);
            this.f151609f = list;
            this.f151610g = localThemeScope;
            this.f151611h = function1;
            this.f151612i = interfaceC15783O;
            this.f151613j = c15429a;
        }

        public final void a(InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.V(interfaceC15433c) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= composer.d(i10) ? 32 : 16;
            }
            if (!composer.p((i12 & 147) != 146, i12 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1091073711, i12, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            TimeSlotDayDecorator timeSlotDayDecorator = (TimeSlotDayDecorator) this.f151609f.get(i10);
            composer.startReplaceGroup(-565572299);
            LocalThemeScope localThemeScope = this.f151610g;
            composer.startReplaceGroup(-1224400529);
            boolean zV = composer.V(this.f151611h) | composer.D(this.f151612i) | composer.V(this.f151613j) | ((((i12 & 112) ^ 48) > 32 && composer.d(i10)) || (i12 & 48) == 32);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new d(this.f151611h, this.f151612i, this.f151613j, i10);
                composer.t(objB);
            }
            composer.P();
            z.r(localThemeScope, timeSlotDayDecorator, null, (Function2) objB, composer, LocalThemeScope.f17314g, 2);
            composer.P();
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
    static final class g implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f151614a;

        g(LocalThemeScope localThemeScope) {
            this.f151614a = localThemeScope;
        }

        public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1557650649, i10, -1, "com.meijer.mobile.subscription.ux.checkout.TimeSlotsHeaderSection.<anonymous> (TimeSlotsContent.kt:182)");
            }
            C18054z0.a(C16335d.c(C.b.h.c.f17008e.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), composer, 0), null, null, this.f151614a.getAdsColors().getAdsColorBrandPrimary().getColor(), composer, 48, 4);
            C14890K.a(androidx.compose.foundation.layout.J.z(Modifier.INSTANCE, this.f151614a.getAdsSpacing().getThree().getDp()), composer, 0);
            si.j.h(this.f151614a, new q1.Label(null, null, null, null, 0, false, 0, this.f151614a.getAdsTypography().getHeadings().getSix(), null, 383, null), C16338g.c(C15410d.f148816x, composer, 0), null, composer, (q1.Label.f142335j << 3) | LocalThemeScope.f17314g, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
            a(interfaceC14888I, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        z(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final Ki.LocalThemeScope r22, final com.meijer.mobile.subscription.ux.subscription.J.HeaderItem r23, androidx.compose.ui.Modifier r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mr.z.k(Ki.M, com.meijer.mobile.subscription.ux.subscription.J$a, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, J.HeaderItem headerItem, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        k(localThemeScope, headerItem, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final Ki.LocalThemeScope r23, final com.meijer.mobile.subscription.ux.subscription.J.SlotItem r24, androidx.compose.ui.Modifier r25, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.subscription.ux.subscription.AbstractC13119k, kotlin.Unit> r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mr.z.m(Ki.M, com.meijer.mobile.subscription.ux.subscription.J$b, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(LocalThemeScope localThemeScope, J.SlotItem slotItem, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        m(localThemeScope, slotItem, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0160 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(final Ki.LocalThemeScope r34, final com.meijer.mobile.subscription.ux.subscription.SubscriptionViewState r35, androidx.compose.ui.Modifier r36, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.subscription.ux.subscription.AbstractC13119k, kotlin.Unit> r37, final kotlin.jvm.functions.Function0<kotlin.Unit> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mr.z.p(Ki.M, com.meijer.mobile.subscription.ux.subscription.I, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, SubscriptionViewState subscriptionViewState, Modifier modifier, Function1 function1, Function0 function0, int i10, int i11, Composer composer, int i12) {
        p(localThemeScope, subscriptionViewState, modifier, function1, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(final Ki.LocalThemeScope r25, final mr.TimeSlotDayDecorator r26, androidx.compose.ui.Modifier r27, final kotlin.jvm.functions.Function2<? super com.meijer.mobile.subscription.ux.subscription.AbstractC13119k, ? super java.lang.Boolean, kotlin.Unit> r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mr.z.r(Ki.M, mr.l, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(Function2 function2, TimeSlotDayDecorator timeSlotDayDecorator) {
        function2.invoke(new AbstractC13119k.SetSelectedDay(timeSlotDayDecorator), Boolean.valueOf(!timeSlotDayDecorator.getIsDaySelected()));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(LocalThemeScope localThemeScope, TimeSlotDayDecorator timeSlotDayDecorator, Modifier modifier, Function2 function2, int i10, int i11, Composer composer, int i12) {
        r(localThemeScope, timeSlotDayDecorator, modifier, function2, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void u(final Ki.LocalThemeScope r21, final com.meijer.mobile.subscription.ux.subscription.SubscriptionViewState r22, androidx.compose.ui.Modifier r23, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.subscription.ux.subscription.AbstractC13119k, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mr.z.u(Ki.M, com.meijer.mobile.subscription.ux.subscription.I, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(LocalThemeScope localThemeScope, SubscriptionViewState subscriptionViewState, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        u(localThemeScope, subscriptionViewState, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(SubscriptionViewState subscriptionViewState, LocalThemeScope localThemeScope, Function1 function1, InterfaceC15783O interfaceC15783O, C15429A c15429a, l0.w LazyRow) {
        Intrinsics.j(LazyRow, "$this$LazyRow");
        List<TimeSlotDayDecorator> listD = subscriptionViewState.d();
        LazyRow.i(listD.size(), null, new e(listD), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new f(listD, localThemeScope, function1, interfaceC15783O, c15429a)));
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void x(final Ki.LocalThemeScope r17, final boolean r18, androidx.compose.ui.Modifier r19, final kotlin.jvm.functions.Function0<kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mr.z.x(Ki.M, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(LocalThemeScope localThemeScope, boolean z10, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        x(localThemeScope, z10, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(InterfaceC5872l0 interfaceC5872l0, Function1 function1, J.SlotItem slotItem, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(!((Boolean) interfaceC5872l0.getValue()).booleanValue()));
        function1.invoke(new AbstractC13119k.SetSelectedTimeSlot(slotItem.getSlotDecorator().getSlot().getId()));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(final LocalThemeScope localThemeScope, final Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(1269051111);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i15 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(1269051111, i12, -1, "com.meijer.mobile.subscription.ux.checkout.TimeSlotsHeaderSection (TimeSlotsContent.kt:170)");
            }
            C16453n.i(localThemeScope, new q1.Row(D.m(modifier2, localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 8, null), null, P0.e.INSTANCE.i(), 2, null), ComposableLambdaKt.c(-1557650649, true, new g(localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, LocalThemeScope.f17314g | 384 | (i12 & 14) | (q1.Row.f142392d << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier = modifier2;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: mr.t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return z.A(localThemeScope, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
