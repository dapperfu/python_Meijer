package Ph;

import Fh.a;
import Ji.C;
import Ji.LocalThemeScope;
import Ph.F;
import Qh.M;
import Qh.e0;
import Qh.p0;
import Rh.ContactUsDecorator;
import ak.AbstractC5607a;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.InterfaceC5772o;
import androidx.compose.ui.platform.D1;
import com.meijer.mobile.accounts.ux.profile.a;
import com.meijer.mobile.accounts.ux.profile.l;
import com.meijer.mobile.accounts.ux.profile.p;
import j0.InterfaceC14794C;
import j0.InterfaceC14814f;
import kotlin.C17970r;
import kotlin.C17973s;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16193g;
import qv.C16648k;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aU\u0010\r\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Lcom/meijer/mobile/accounts/ux/profile/l$e;", "viewState", "LRh/a;", "contactUsDecorator", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcom/meijer/mobile/accounts/ux/profile/a;", "", "onResourceAction", "LFh/a;", "onNavigationRequest", "b", "(LJi/M;Lcom/meijer/mobile/accounts/ux/profile/l$e;LRh/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class F {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.profile.ProfileScreenKt$ProfileScreen$1$1", f = "ProfileScreen.kt", l = {}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f25469a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l.ProfileScreenViewState f25470b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f25471c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C17970r f25472d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.profile.ProfileScreenKt$ProfileScreen$1$1$1", f = "ProfileScreen.kt", l = {77}, m = "invokeSuspend")
        /* renamed from: Ph.F$a$a, reason: collision with other inner class name */
        static final class C0448a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f25473a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17970r f25474b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0448a(C17970r c17970r, Continuation<? super C0448a> continuation) {
                super(2, continuation);
                this.f25474b = c17970r;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0448a(this.f25474b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C0448a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f25473a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17973s bottomSheetState = this.f25474b.getBottomSheetState();
                    this.f25473a = 1;
                    if (bottomSheetState.b(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.profile.ProfileScreenKt$ProfileScreen$1$1$2", f = "ProfileScreen.kt", l = {79}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f25475a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17970r f25476b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C17970r c17970r, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f25476b = c17970r;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f25476b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f25475a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17973s bottomSheetState = this.f25476b.getBottomSheetState();
                    this.f25475a = 1;
                    if (bottomSheetState.a(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l.ProfileScreenViewState eVar, InterfaceC16622O interfaceC16622O, C17970r c17970r, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f25470b = eVar;
            this.f25471c = interfaceC16622O;
            this.f25472d = c17970r;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f25470b, this.f25471c, this.f25472d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f25469a == 0) {
                ResultKt.b(obj);
                if (this.f25470b.getShouldOpenModal()) {
                    C16648k.d(this.f25471c, null, null, new C0448a(this.f25472d, null), 3, null);
                } else {
                    C16648k.d(this.f25471c, null, null, new b(this.f25472d, null), 3, null);
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.profile.ProfileScreenKt$ProfileScreen$2$1", f = "ProfileScreen.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f25477a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C17970r f25478b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ D1 f25479c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f25480d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.profile.a, Unit> f25481e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(C17970r c17970r, D1 d12, InterfaceC5772o interfaceC5772o, Function1<? super com.meijer.mobile.accounts.ux.profile.a, Unit> function1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f25478b = c17970r;
            this.f25479c = d12;
            this.f25480d = interfaceC5772o;
            this.f25481e = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f25478b, this.f25479c, this.f25480d, this.f25481e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f25477a == 0) {
                ResultKt.b(obj);
                if (this.f25478b.getBottomSheetState().f()) {
                    D1 d12 = this.f25479c;
                    if (d12 != null) {
                        d12.b();
                    }
                    InterfaceC5772o.l(this.f25480d, false, 1, null);
                    this.f25481e.invoke(a.C1343a.f94714a);
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l.ProfileScreenViewState f25482a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f25483b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.profile.a, Unit> f25484c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Fh.a, Unit> f25485d;

        /* JADX WARN: Multi-variable type inference failed */
        c(l.ProfileScreenViewState eVar, LocalThemeScope localThemeScope, Function1<? super com.meijer.mobile.accounts.ux.profile.a, Unit> function1, Function1<? super Fh.a, Unit> function12) {
            this.f25482a = eVar;
            this.f25483b = localThemeScope;
            this.f25484c = function1;
            this.f25485d = function12;
        }

        public final void a(InterfaceC14814f BottomSheetScaffold, Composer composer, int i10) {
            Intrinsics.j(BottomSheetScaffold, "$this$BottomSheetScaffold");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1833068921, i10, -1, "com.meijer.mobile.accounts.ux.composables.profile.ProfileScreen.<anonymous> (ProfileScreen.kt:117)");
            }
            com.meijer.mobile.accounts.ux.profile.p pVarL = this.f25482a.getScreen();
            if (pVarL instanceof p.b) {
                composer.startReplaceGroup(-1552850716);
                M.t(this.f25483b, this.f25482a, null, this.f25484c, composer, LocalThemeScope.f15770g, 2);
                composer.P();
            } else if (pVarL instanceof p.a) {
                composer.startReplaceGroup(-1552604638);
                Qh.r.j(this.f25483b, this.f25482a, null, this.f25484c, composer, LocalThemeScope.f15770g, 2);
                composer.P();
            } else if (pVarL instanceof p.c) {
                composer.startReplaceGroup(-1552355584);
                e0.s(this.f25483b, this.f25482a, null, this.f25484c, this.f25485d, composer, LocalThemeScope.f15770g, 2);
                composer.P();
            } else {
                if (!(pVarL instanceof p.d)) {
                    composer.startReplaceGroup(642643271);
                    composer.P();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-1552039260);
                p0.g(this.f25483b, this.f25482a, null, this.f25484c, composer, LocalThemeScope.f15770g, 2);
                composer.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
            a(interfaceC14814f, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f25486a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Fh.a, Unit> f25487b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f25488a;

            a(LocalThemeScope localThemeScope) {
                this.f25488a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1592979098, i10, -1, "com.meijer.mobile.accounts.ux.composables.profile.ProfileScreen.<anonymous>.<anonymous> (ProfileScreen.kt:94)");
                }
                Dr.g.g(this.f25488a, C16193g.c(Fh.h.f10765p4, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
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

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(381836838, i10, -1, "com.meijer.mobile.accounts.ux.composables.profile.ProfileScreen.<anonymous> (ProfileScreen.kt:92)");
            }
            AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(Fh.h.f10781s, new Object[0]);
            C.f.d dVar = C.f.d.f15507e;
            LocalThemeScope localThemeScope = this.f25486a;
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-1592979098, true, new a(localThemeScope), composer, 54);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f25487b);
            final Function1<Fh.a, Unit> function1 = this.f25487b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Ph.G
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return F.d.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, dVar, 0.0f, false, abstractC5607aD, composer, LocalThemeScope.f15770g | 24576 | (C.f.d.f15508f << 18) | (AbstractC5607a.f45514b << 27), 199);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(LocalThemeScope localThemeScope, Function1<? super Fh.a, Unit> function1) {
            this.f25486a = localThemeScope;
            this.f25487b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(a.k.f10423a);
            return Unit.f142422a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f25489a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l.ProfileScreenViewState f25490b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ContactUsDecorator f25491c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.profile.a, Unit> f25492d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<Fh.a, Unit> f25493e;

        /* JADX WARN: Multi-variable type inference failed */
        e(LocalThemeScope localThemeScope, l.ProfileScreenViewState eVar, ContactUsDecorator contactUsDecorator, Function1<? super com.meijer.mobile.accounts.ux.profile.a, Unit> function1, Function1<? super Fh.a, Unit> function12) {
            this.f25489a = localThemeScope;
            this.f25490b = eVar;
            this.f25491c = contactUsDecorator;
            this.f25492d = function1;
            this.f25493e = function12;
        }

        public final void a(InterfaceC14794C padding, Composer composer, int i10) {
            Intrinsics.j(padding, "padding");
            if ((i10 & 6) == 0) {
                i10 |= composer.V(padding) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2065136240, i10, -1, "com.meijer.mobile.accounts.ux.composables.profile.ProfileScreen.<anonymous> (ProfileScreen.kt:106)");
            }
            D.c(this.f25489a, this.f25490b, this.f25491c, androidx.compose.foundation.layout.D.h(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), padding), this.f25492d, this.f25493e, composer, LocalThemeScope.f15770g, 0);
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r36, final com.meijer.mobile.accounts.ux.profile.l.ProfileScreenViewState r37, final Rh.ContactUsDecorator r38, androidx.compose.ui.Modifier r39, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.profile.a, kotlin.Unit> r40, final kotlin.jvm.functions.Function1<? super Fh.a, kotlin.Unit> r41, androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ph.F.b(Ji.M, com.meijer.mobile.accounts.ux.profile.l$e, Rh.a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, l.ProfileScreenViewState eVar, ContactUsDecorator contactUsDecorator, Modifier modifier, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, eVar, contactUsDecorator, modifier, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
