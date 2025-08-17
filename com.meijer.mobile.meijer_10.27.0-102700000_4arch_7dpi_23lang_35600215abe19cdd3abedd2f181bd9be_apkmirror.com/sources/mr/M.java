package mr;

import Ji.C;
import Ji.LocalThemeScope;
import P0.e;
import ak.AbstractC5607a;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import com.meijer.mobile.subscription.ux.subscription.j;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import java.util.List;
import ji.q1;
import kotlin.C17988z0;
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
import kr.C15307d;
import l0.C15339A;
import l0.C15342b;
import l0.InterfaceC15343c;
import mr.C15689a;
import mr.M;
import mr.s;
import ni.C15802F;
import ni.P0;
import oi.C16088n;
import p1.C16190d;
import p1.C16193g;
import qv.C16648k;
import qv.InterfaceC16622O;
import r1.C16705m;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a]\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u000f\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a;\u0010\u0012\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a`\u0010\u001b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052#\b\u0002\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a%\u0010\u001f\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u001f\u0010 \u001a;\u0010#\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b#\u0010$\u001a9\u0010&\u001a\u00020\u0007*\u00020\u00002\u0006\u0010%\u001a\u00020\u00162\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b&\u0010'¨\u0006+²\u0006\u0010\u0010)\u001a\u0004\u0018\u00010(8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010*\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Lmr/P;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lmr/a$a;", "", "onCheckoutAction", "Lcom/meijer/mobile/subscription/ux/subscription/j;", "onNavigationAction", "Lkotlin/Function0;", "onExit", "w", "(LJi/M;Lmr/P;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "L", "(LJi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "onAction", "E", "(LJi/M;Lmr/P;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lmr/r;", "dayDecorator", "", "Lkotlin/ParameterName;", "name", "isSelected", "onSelectedDay", "z", "(LJi/M;Lmr/r;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lmr/s$a;", "headerItem", "q", "(LJi/M;Lmr/s$a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lmr/s$b;", "slotItem", "s", "(LJi/M;Lmr/s$b;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "isContinueEnabled", "I", "(LJi/M;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "isCheckoutSubscriptionLoading", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class M {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f150563a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.subscription.ux.subscription.j, Unit> f150564b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f150565c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: mr.M$a$a, reason: collision with other inner class name */
        static final class C2316a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f150566a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f150567b;

            C2316a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
                this.f150566a = localThemeScope;
                this.f150567b = function0;
            }

            public final void a(InterfaceC14800I SubscriptionToolbar, Composer composer, int i10) {
                Intrinsics.j(SubscriptionToolbar, "$this$SubscriptionToolbar");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-438506521, i10, -1, "com.meijer.mobile.subscription.ux.checkout.TimeSlotsContent.<anonymous>.<anonymous> (TimeSlotsContent.kt:95)");
                }
                P0.i(this.f150566a, C15802F.f151433a, this.f150567b, C.f.o.f15522e, C16193g.c(C15307d.f147900u, composer, 0), null, false, false, 0L, composer, LocalThemeScope.f15770g | (C15802F.f151434b << 3) | (C.f.o.f15523f << 9), 240);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, Function1<? super com.meijer.mobile.subscription.ux.subscription.j, Unit> function1, Function0<Unit> function0) {
            this.f150563a = localThemeScope;
            this.f150564b = function1;
            this.f150565c = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(j.f.f119047a);
            return Unit.f142422a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(732329217, i10, -1, "com.meijer.mobile.subscription.ux.checkout.TimeSlotsContent.<anonymous> (TimeSlotsContent.kt:87)");
            }
            String strC = C16193g.c(C15307d.f147909y0, composer, 0);
            C.f.d dVar = C.f.d.f15507e;
            AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(C15307d.f147872g, new Object[0]);
            LocalThemeScope localThemeScope = this.f150563a;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f150564b);
            final Function1<com.meijer.mobile.subscription.ux.subscription.j, Unit> function1 = this.f150564b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: mr.L
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return M.a.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            jr.m.c(localThemeScope, null, strC, abstractC5607aD, dVar, (Function0) objB, ComposableLambdaKt.c(-438506521, true, new C2316a(this.f150563a, this.f150565c), composer, 54), composer, 1572864 | LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 9) | (C.f.d.f15508f << 12), 1);
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
        final /* synthetic */ TimeSlotsViewState f150568a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f150569b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<C15689a.AbstractC2318a, Unit> f150570c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f150571d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.subscription.ux.subscription.j, Unit> f150572e;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
        public static final class a extends Lambda implements Function1 {

            /* renamed from: f, reason: collision with root package name */
            public static final a f150573f = new a();

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Void invoke(s sVar) {
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        /* renamed from: mr.M$b$b, reason: collision with other inner class name */
        public static final class C2317b extends Lambda implements Function1<Integer, Object> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function1 f150574f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List f150575g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2317b(Function1 function1, List list) {
                super(1);
                this.f150574f = function1;
                this.f150575g = list;
            }

            public final Object a(int i10) {
                return this.f150574f.invoke(this.f150575g.get(i10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
        @SourceDebugExtension
        public static final class c extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f150576f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f150577g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function1 f150578h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(List list, LocalThemeScope localThemeScope, Function1 function1) {
                super(4);
                this.f150576f = list;
                this.f150577g = localThemeScope;
                this.f150578h = function1;
            }

            public final void a(InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = (composer.V(interfaceC15343c) ? 4 : 2) | i11;
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
                s sVar = (s) this.f150576f.get(i10);
                composer.startReplaceGroup(-1845760999);
                if (sVar instanceof s.HeaderItem) {
                    composer.startReplaceGroup(-1845690444);
                    M.q(this.f150577g, (s.HeaderItem) sVar, androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), composer, LocalThemeScope.f15770g | 384 | (AbstractC5607a.f45514b << 3), 0);
                    composer.P();
                } else {
                    if (!(sVar instanceof s.SlotItem)) {
                        composer.startReplaceGroup(-613730006);
                        composer.P();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceGroup(-613716086);
                    M.s(this.f150577g, (s.SlotItem) sVar, null, this.f150578h, composer, LocalThemeScope.f15770g, 2);
                    composer.P();
                }
                composer.P();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Integer num, Composer composer, Integer num2) {
                a(interfaceC15343c, num.intValue(), composer, num2.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(TimeSlotsViewState timeSlotsViewState, LocalThemeScope localThemeScope, Function1<? super C15689a.AbstractC2318a, Unit> function1, boolean z10, Function1<? super com.meijer.mobile.subscription.ux.subscription.j, Unit> function12) {
            this.f150568a = timeSlotsViewState;
            this.f150569b = localThemeScope;
            this.f150570c = function1;
            this.f150571d = z10;
            this.f150572e = function12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(TimeSlotsViewState timeSlotsViewState, LocalThemeScope localThemeScope, Function1 function1, l0.w LazyColumn) {
            Intrinsics.j(LazyColumn, "$this$LazyColumn");
            List<s> listD = timeSlotsViewState.d();
            LazyColumn.i(listD.size(), null, new C2317b(a.f150573f, listD), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new c(listD, localThemeScope, function1)));
            return Unit.f142422a;
        }

        public final void b(InterfaceC14794C paddingValues, Composer composer, int i10) {
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
                ComposerKt.U(-657825862, i11, -1, "com.meijer.mobile.subscription.ux.checkout.TimeSlotsContent.<anonymous> (TimeSlotsContent.kt:106)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierF = androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null);
            final TimeSlotsViewState timeSlotsViewState = this.f150568a;
            final LocalThemeScope localThemeScope = this.f150569b;
            final Function1<C15689a.AbstractC2318a, Unit> function1 = this.f150570c;
            boolean z10 = this.f150571d;
            Function1<com.meijer.mobile.subscription.ux.subscription.j, Unit> function12 = this.f150572e;
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5662h.g(companion2.o(), false);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierF);
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyG, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C5664j c5664j = C5664j.f48612a;
            if (timeSlotsViewState.getIsCheckoutSubscriptionLoading()) {
                composer.startReplaceGroup(-629377835);
                yr.N.b(localThemeScope, null, composer, LocalThemeScope.f15770g, 1);
                composer.P();
            } else {
                composer.startReplaceGroup(-629270017);
                Modifier modifierH = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.h(companion, paddingValues), 0.0f, 1, null);
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), companion2.k(), composer, 0);
                int iA2 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierH);
                Function0<InterfaceC5811g> function0A2 = companion3.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A2);
                } else {
                    composer.s();
                }
                Composer composerA2 = D1.a(composer);
                D1.c(composerA2, measurePolicyA, companion3.e());
                D1.c(composerA2, interfaceC5742sR2, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion3.f());
                C14815g c14815g = C14815g.f139108a;
                Modifier modifierD = androidx.compose.foundation.layout.J.D(companion, null, false, 3, null);
                int i12 = LocalThemeScope.f15770g;
                M.L(localThemeScope, modifierD, composer, i12 | 48, 0);
                M.E(localThemeScope, timeSlotsViewState, null, function1, composer, i12, 2);
                Modifier modifierH2 = androidx.compose.foundation.layout.J.h(InterfaceC14814f.b(c14815g, companion, 1.0f, false, 2, null), 0.0f, 1, null);
                InterfaceC14794C interfaceC14794CE = androidx.compose.foundation.layout.D.e(localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), 2, null);
                composer.startReplaceGroup(-1746271574);
                boolean zD = composer.D(timeSlotsViewState) | composer.D(localThemeScope) | composer.V(function1);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: mr.N
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return M.b.c(timeSlotsViewState, localThemeScope, function1, (l0.w) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C15342b.a(modifierH2, null, interfaceC14794CE, false, null, null, null, false, null, (Function1) objB, composer, 0, 506);
                M.I(localThemeScope, z10, null, function12, composer, i12, 2);
                composer.v();
                composer.P();
            }
            composer.v();
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f150579a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f150580b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TimeSlotDayDecorator f150581c;

        c(LocalThemeScope localThemeScope, String str, TimeSlotDayDecorator timeSlotDayDecorator) {
            this.f150579a = localThemeScope;
            this.f150580b = str;
            this.f150581c = timeSlotDayDecorator;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(String str, r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.g0(semantics, str);
            return Unit.f142422a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-218989890, i10, -1, "com.meijer.mobile.subscription.ux.checkout.TimeSlotsDayItem.<anonymous> (TimeSlotsContent.kt:255)");
            }
            C5658d.f fVarB = C5658d.f48555a.b();
            e.b bVarG = P0.e.INSTANCE.g();
            Modifier modifierJ = androidx.compose.foundation.layout.D.j(Modifier.INSTANCE, this.f150579a.getAdsSpacing().getFive().getDp(), this.f150579a.getAdsSpacing().getFour().getDp());
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f150580b);
            final String str = this.f150580b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: mr.O
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return M.c.c(str, (r1.u) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Modifier modifierD = C16705m.d(modifierJ, false, (Function1) objB, 1, null);
            LocalThemeScope localThemeScope = this.f150579a;
            TimeSlotDayDecorator timeSlotDayDecorator = this.f150581c;
            MeasurePolicy measurePolicyA = C5665k.a(fVarB, bVarG, composer, 54);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14815g c14815g = C14815g.f139108a;
            ri.j.h(localThemeScope, new q1.Label(null, null, null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 375, null), timeSlotDayDecorator.c(), null, composer, (q1.Label.f140080j << 3) | LocalThemeScope.f15770g, 4);
            composer.v();
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
    static final class d implements Function1<Boolean, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f150582a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C15339A f150583b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f150584c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.subscription.ux.checkout.TimeSlotsContentKt$TimeSlotsDaysSection$2$1$1$1$1$1$1", f = "TimeSlotsContent.kt", l = {217}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f150585a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C15339A f150586b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f150587c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C15339A c15339a, int i10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f150586b = c15339a;
                this.f150587c = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f150586b, this.f150587c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f150585a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C15339A c15339a = this.f150586b;
                    int i11 = this.f150587c;
                    this.f150585a = 1;
                    if (C15339A.l(c15339a, i11, 0, this, 2, null) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        d(InterfaceC16622O interfaceC16622O, C15339A c15339a, int i10) {
            this.f150582a = interfaceC16622O;
            this.f150583b = c15339a;
            this.f150584c = i10;
        }

        public final void a(boolean z10) {
            if (z10) {
                C16648k.d(this.f150582a, null, null, new a(this.f150583b, this.f150584c, null), 3, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            a(bool.booleanValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class e extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f150588f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List list) {
            super(1);
            this.f150588f = list;
        }

        public final Object a(int i10) {
            this.f150588f.get(i10);
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class f extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f150589f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f150590g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f150591h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f150592i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C15339A f150593j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List list, LocalThemeScope localThemeScope, Function1 function1, InterfaceC16622O interfaceC16622O, C15339A c15339a) {
            super(4);
            this.f150589f = list;
            this.f150590g = localThemeScope;
            this.f150591h = function1;
            this.f150592i = interfaceC16622O;
            this.f150593j = c15339a;
        }

        public final void a(InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.V(interfaceC15343c) ? 4 : 2) | i11;
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
            TimeSlotDayDecorator timeSlotDayDecorator = (TimeSlotDayDecorator) this.f150589f.get(i10);
            composer.startReplaceGroup(-1700580370);
            LocalThemeScope localThemeScope = this.f150590g;
            Function1 function1 = this.f150591h;
            composer.startReplaceGroup(-1746271574);
            boolean zD = composer.D(this.f150592i) | composer.V(this.f150593j) | ((((i12 & 112) ^ 48) > 32 && composer.d(i10)) || (i12 & 48) == 32);
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new d(this.f150592i, this.f150593j, i10);
                composer.t(objB);
            }
            composer.P();
            M.z(localThemeScope, timeSlotDayDecorator, null, function1, (Function1) objB, composer, LocalThemeScope.f15770g, 2);
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15343c, num.intValue(), composer, num2.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f150594a;

        g(LocalThemeScope localThemeScope) {
            this.f150594a = localThemeScope;
        }

        public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1557650649, i10, -1, "com.meijer.mobile.subscription.ux.checkout.TimeSlotsHeaderSection.<anonymous> (TimeSlotsContent.kt:174)");
            }
            C17988z0.a(C16190d.c(C.b.h.c.f15464e.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), composer, 0), null, null, this.f150594a.getAdsColors().getAdsColorBrandPrimary().getColor(), composer, 48, 4);
            C14802K.a(androidx.compose.foundation.layout.J.z(Modifier.INSTANCE, this.f150594a.getAdsSpacing().getThree().getDp()), composer, 0);
            ri.j.h(this.f150594a, new q1.Label(null, null, null, null, 0, false, 0, this.f150594a.getAdsTypography().getHeadings().getSix(), null, 383, null), C16193g.c(C15307d.f147906x, composer, 0), null, composer, (q1.Label.f140080j << 3) | LocalThemeScope.f15770g, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
            a(interfaceC14800I, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(C15689a.AbstractC2318a it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(boolean z10) {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(Function1 function1, TimeSlotDayDecorator timeSlotDayDecorator) {
        function1.invoke(new C15689a.AbstractC2318a.SelectDay(timeSlotDayDecorator));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(LocalThemeScope localThemeScope, TimeSlotDayDecorator timeSlotDayDecorator, Modifier modifier, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        z(localThemeScope, timeSlotDayDecorator, modifier, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void E(final Ji.LocalThemeScope r21, final mr.TimeSlotsViewState r22, androidx.compose.ui.Modifier r23, kotlin.jvm.functions.Function1<? super mr.C15689a.AbstractC2318a, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mr.M.E(Ji.M, mr.P, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(TimeSlotsViewState timeSlotsViewState, LocalThemeScope localThemeScope, Function1 function1, InterfaceC16622O interfaceC16622O, C15339A c15339a, l0.w LazyRow) {
        Intrinsics.j(LazyRow, "$this$LazyRow");
        List<TimeSlotDayDecorator> listC = timeSlotsViewState.c();
        LazyRow.i(listC.size(), null, new e(listC), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new f(listC, localThemeScope, function1, interfaceC16622O, c15339a)));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(LocalThemeScope localThemeScope, TimeSlotsViewState timeSlotsViewState, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        E(localThemeScope, timeSlotsViewState, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(C15689a.AbstractC2318a it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void I(final Ji.LocalThemeScope r19, final boolean r20, androidx.compose.ui.Modifier r21, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.subscription.ux.subscription.j, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mr.M.I(Ji.M, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(Function1 function1) {
        function1.invoke(j.e.f119046a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(LocalThemeScope localThemeScope, boolean z10, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        I(localThemeScope, z10, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        L(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
    public static final void q(final Ji.LocalThemeScope r22, final mr.s.HeaderItem r23, androidx.compose.ui.Modifier r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mr.M.q(Ji.M, mr.s$a, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(LocalThemeScope localThemeScope, s.HeaderItem headerItem, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        q(localThemeScope, headerItem, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(final Ji.LocalThemeScope r23, final mr.s.SlotItem r24, androidx.compose.ui.Modifier r25, kotlin.jvm.functions.Function1<? super mr.C15689a.AbstractC2318a, kotlin.Unit> r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mr.M.s(Ji.M, mr.s$b, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(C15689a.AbstractC2318a it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(LocalThemeScope localThemeScope, s.SlotItem slotItem, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        s(localThemeScope, slotItem, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void w(final Ji.LocalThemeScope r36, final mr.TimeSlotsViewState r37, androidx.compose.ui.Modifier r38, kotlin.jvm.functions.Function1<? super mr.C15689a.AbstractC2318a, kotlin.Unit> r39, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.subscription.ux.subscription.j, kotlin.Unit> r40, final kotlin.jvm.functions.Function0<kotlin.Unit> r41, androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mr.M.w(Ji.M, mr.P, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(C15689a.AbstractC2318a it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(LocalThemeScope localThemeScope, TimeSlotsViewState timeSlotsViewState, Modifier modifier, Function1 function1, Function1 function12, Function0 function0, int i10, int i11, Composer composer, int i12) {
        w(localThemeScope, timeSlotsViewState, modifier, function1, function12, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void z(final Ji.LocalThemeScope r25, final mr.TimeSlotDayDecorator r26, androidx.compose.ui.Modifier r27, kotlin.jvm.functions.Function1<? super mr.C15689a.AbstractC2318a, kotlin.Unit> r28, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mr.M.z(Ji.M, mr.r, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(final LocalThemeScope localThemeScope, final Modifier modifier, Composer composer, final int i10, final int i11) {
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
                ComposerKt.U(1269051111, i12, -1, "com.meijer.mobile.subscription.ux.checkout.TimeSlotsHeaderSection (TimeSlotsContent.kt:162)");
            }
            C16088n.i(localThemeScope, new q1.Row(androidx.compose.foundation.layout.D.m(modifier2, localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 8, null), null, P0.e.INSTANCE.i(), 2, null), ComposableLambdaKt.c(-1557650649, true, new g(localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, LocalThemeScope.f15770g | 384 | (i12 & 14) | (q1.Row.f140137d << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier = modifier2;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: mr.G
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return M.M(localThemeScope, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(InterfaceC5730l0 interfaceC5730l0, Function1 function1, s.SlotItem slotItem, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(!((Boolean) interfaceC5730l0.getValue()).booleanValue()));
        function1.invoke(new C15689a.AbstractC2318a.SelectTimeSlot(slotItem.getSlotDecorator().getSlot().getId()));
        return Unit.f142422a;
    }
}
