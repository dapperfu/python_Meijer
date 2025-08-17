package com.meijer.mobile.meijer.activity.checkout.fulfillmentslots;

import Am.C2906v;
import Ji.LocalThemeScope;
import ak.AbstractC5607a;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1;
import j0.InterfaceC14794C;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import qv.InterfaceC16622O;
import tv.InterfaceC17144F;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a²\u0001\u0010\u0018\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00060\u0013H\u0001¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;", "viewState", "Lkotlin/Function0;", "", "onOpenInfoActionSheet", "onOpenOosActionSheet", "", "isTimeslotRedesigned", "onBackArrowClicked", "isEditMode", "isBopasEnabled", "isBunchaEnabled", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1;", "viewModel", "hasSelectedTimeSlot", "onUpdateActivityExtra", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isBopasSlot", "onTimeSlotSetCanProceedToNextStepInCheckout", "c", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;ZZZLcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.l0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11854l0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.l0$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102995a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f102996b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FulfillmentSlotsViewState f102997c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f102998d;

        a(LocalThemeScope localThemeScope, boolean z10, FulfillmentSlotsViewState fulfillmentSlotsViewState, Function0<Unit> function0) {
            this.f102995a = localThemeScope;
            this.f102996b = z10;
            this.f102997c = fulfillmentSlotsViewState;
            this.f102998d = function0;
        }

        public final void a(Composer composer, int i10) {
            String strB;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1089492038, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsPage.<anonymous> (FulfillmentSlotsPage.kt:48)");
            }
            LocalThemeScope localThemeScope = this.f102995a;
            Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
            if (this.f102996b) {
                composer.startReplaceGroup(-10417396);
                AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
                strB = companion.d(com.meijer.mobile.meijer.Y.f99613I6, companion.d(com.meijer.mobile.meijer.Y.f99632J6, new Object[0]), this.f102997c.p().b((Context) composer.o(AndroidCompositionLocals_androidKt.g()))).b((Context) composer.o(AndroidCompositionLocals_androidKt.g()));
                composer.P();
            } else {
                composer.startReplaceGroup(-9993192);
                strB = this.f102997c.p().b((Context) composer.o(AndroidCompositionLocals_androidKt.g()));
                composer.P();
            }
            C2906v.c(localThemeScope, modifierH, strB, this.f102998d, false, composer, LocalThemeScope.f15770g | 48, 8);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.l0$b */
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102999a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q1 f103000b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FulfillmentSlotsViewState f103001c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f103002d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f103003e;

        b(LocalThemeScope localThemeScope, q1 q1Var, FulfillmentSlotsViewState fulfillmentSlotsViewState, boolean z10, boolean z11) {
            this.f102999a = localThemeScope;
            this.f103000b = q1Var;
            this.f103001c = fulfillmentSlotsViewState;
            this.f103002d = z10;
            this.f103003e = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(q1 q1Var) {
            q1Var.e0(q1.g.k.f103084a);
            return Unit.f142422a;
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(androidx.compose.runtime.Composer r12, int r13) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.C11854l0.b.b(androidx.compose.runtime.Composer, int):void");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.l0$c */
    static final class c implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f103004a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q1 f103005b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f103006c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ FulfillmentSlotsViewState f103007d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f103008e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f103009f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f103010g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f103011h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f103012i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f103013j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f103014k;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.l0$c$a */
        /* synthetic */ class a extends FunctionReferenceImpl implements Function1<q1.g, Unit> {
            a(Object obj) {
                super(1, obj, q1.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/FulfillmentSlotsViewModel$Action;)V", 0);
            }

            public final void a(q1.g p02) {
                Intrinsics.j(p02, "p0");
                ((q1) this.receiver).e0(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(q1.g gVar) {
                a(gVar);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.l0$c$b */
        /* synthetic */ class b extends FunctionReferenceImpl implements Function1<q1.g, Unit> {
            b(Object obj) {
                super(1, obj, q1.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/FulfillmentSlotsViewModel$Action;)V", 0);
            }

            public final void a(q1.g p02) {
                Intrinsics.j(p02, "p0");
                ((q1) this.receiver).e0(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(q1.g gVar) {
                a(gVar);
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsPageKt$FulfillmentSlotsPage$4$3$1", f = "FulfillmentSlotsPage.kt", l = {93}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.l0$c$c, reason: collision with other inner class name */
        static final class C1456c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f103015a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q1 f103016b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<Boolean, Unit> f103017c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f103018d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.l0$c$c$a */
            static final class a<T> implements InterfaceC17153g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function1<Boolean, Unit> f103019a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f103020b;

                /* JADX WARN: Multi-variable type inference failed */
                a(Function1<? super Boolean, Unit> function1, Function0<Unit> function0) {
                    this.f103019a = function1;
                    this.f103020b = function0;
                }

                @Override // tv.InterfaceC17153g
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(q1.h hVar, Continuation<? super Unit> continuation) {
                    if (hVar instanceof q1.h.TimeSlotSetCanProceedToNextStepInCheckout) {
                        this.f103019a.invoke(Boxing.a(((q1.h.TimeSlotSetCanProceedToNextStepInCheckout) hVar).getIsBopasTimeSlot()));
                    } else {
                        if (!(hVar instanceof q1.h.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f103020b.invoke();
                    }
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1456c(q1 q1Var, Function1<? super Boolean, Unit> function1, Function0<Unit> function0, Continuation<? super C1456c> continuation) {
                super(2, continuation);
                this.f103016b = q1Var;
                this.f103017c = function1;
                this.f103018d = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1456c(this.f103016b, this.f103017c, this.f103018d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C1456c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f103015a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                } else {
                    ResultKt.b(obj);
                    InterfaceC17144F<q1.h> interfaceC17144FB = this.f103016b.a0().b();
                    a aVar = new a(this.f103017c, this.f103018d);
                    this.f103015a = 1;
                    if (interfaceC17144FB.collect(aVar, this) == objF) {
                        return objF;
                    }
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(boolean z10, q1 q1Var, LocalThemeScope localThemeScope, FulfillmentSlotsViewState fulfillmentSlotsViewState, boolean z11, boolean z12, boolean z13, Function0<Unit> function0, Function0<Unit> function02, Function1<? super Boolean, Unit> function1, Function0<Unit> function03) {
            this.f103004a = z10;
            this.f103005b = q1Var;
            this.f103006c = localThemeScope;
            this.f103007d = fulfillmentSlotsViewState;
            this.f103008e = z11;
            this.f103009f = z12;
            this.f103010g = z13;
            this.f103011h = function0;
            this.f103012i = function02;
            this.f103013j = function1;
            this.f103014k = function03;
        }

        public final void a(InterfaceC14794C paddingValues, Composer composer, int i10) {
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
                ComposerKt.U(373690943, i11, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsPage.<anonymous> (FulfillmentSlotsPage.kt:65)");
            }
            if (this.f103004a) {
                composer.startReplaceGroup(71726641);
                Modifier modifierH = androidx.compose.foundation.layout.D.h(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
                q1 q1Var = this.f103005b;
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(q1Var);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new a(q1Var);
                    composer.t(objB);
                }
                composer.P();
                Q.P(this.f103006c, modifierH, this.f103007d, this.f103008e, this.f103009f, this.f103010g, (Function1) ((KFunction) objB), this.f103011h, this.f103012i, composer, LocalThemeScope.f15770g, 0);
                composer.P();
            } else {
                composer.startReplaceGroup(72317811);
                LocalThemeScope localThemeScope = this.f103006c;
                Modifier modifierH2 = androidx.compose.foundation.layout.D.h(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
                FulfillmentSlotsViewState fulfillmentSlotsViewState = this.f103007d;
                boolean z10 = this.f103008e;
                boolean z11 = this.f103009f;
                q1 q1Var2 = this.f103005b;
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(q1Var2);
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new b(q1Var2);
                    composer.t(objB2);
                }
                composer.P();
                S0.X(localThemeScope, modifierH2, fulfillmentSlotsViewState, z10, z11, (Function1) ((KFunction) objB2), this.f103012i, composer, LocalThemeScope.f15770g, 0);
                composer.P();
            }
            Unit unit = Unit.f142422a;
            composer.startReplaceGroup(-1746271574);
            boolean zD3 = composer.D(this.f103005b) | composer.V(this.f103013j) | composer.V(this.f103014k);
            q1 q1Var3 = this.f103005b;
            Function1<Boolean, Unit> function1 = this.f103013j;
            Function0<Unit> function0 = this.f103014k;
            Object objB3 = composer.B();
            if (zD3 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new C1456c(q1Var3, function1, function0, null);
                composer.t(objB3);
            }
            composer.P();
            androidx.compose.runtime.J.g(unit, (Function2) objB3, composer, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
            a(interfaceC14794C, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ji.LocalThemeScope r45, androidx.compose.ui.Modifier r46, final com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewState r47, kotlin.jvm.functions.Function0<kotlin.Unit> r48, final kotlin.jvm.functions.Function0<kotlin.Unit> r49, final boolean r50, final kotlin.jvm.functions.Function0<kotlin.Unit> r51, final boolean r52, final boolean r53, final boolean r54, final com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1 r55, final boolean r56, final kotlin.jvm.functions.Function0<kotlin.Unit> r57, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r58, androidx.compose.runtime.Composer r59, final int r60, final int r61, final int r62) {
        /*
            Method dump skipped, instructions count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.C11854l0.c(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.E1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function0, boolean, boolean, boolean, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Modifier modifier, FulfillmentSlotsViewState fulfillmentSlotsViewState, Function0 function0, Function0 function02, boolean z10, Function0 function03, boolean z11, boolean z12, boolean z13, q1 q1Var, boolean z14, Function0 function04, Function1 function1, int i10, int i11, int i12, Composer composer, int i13) {
        c(localThemeScope, modifier, fulfillmentSlotsViewState, function0, function02, z10, function03, z11, z12, z13, q1Var, z14, function04, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f142422a;
    }
}
