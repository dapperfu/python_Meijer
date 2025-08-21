package Qh;

import Gh.a;
import Ki.C;
import Ki.LocalThemeScope;
import Qh.G;
import Rh.e0;
import Rh.p0;
import Sh.ContactUsDecorator;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.InterfaceC5914o;
import androidx.compose.ui.platform.D1;
import bk.AbstractC6392a;
import com.meijer.mobile.accounts.ux.profile.a;
import com.meijer.mobile.accounts.ux.profile.l;
import com.meijer.mobile.accounts.ux.profile.p;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import j0.InterfaceC14882C;
import j0.InterfaceC14902f;
import kotlin.C18036r;
import kotlin.C18039s;
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
import mv.C15809k;
import mv.InterfaceC15783O;
import p1.C16338g;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aU\u0010\r\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lcom/meijer/mobile/accounts/ux/profile/l$e;", "viewState", "LSh/a;", "contactUsDecorator", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcom/meijer/mobile/accounts/ux/profile/a;", "", "onResourceAction", "LGh/a;", "onNavigationRequest", "c", "(LKi/M;Lcom/meijer/mobile/accounts/ux/profile/l$e;LSh/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class G {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.profile.ProfileScreenKt$ProfileScreen$1$1", f = "ProfileScreen.kt", l = {}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f28182a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l.ProfileScreenViewState f28183b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC15783O f28184c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C18036r f28185d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.profile.ProfileScreenKt$ProfileScreen$1$1$1", f = "ProfileScreen.kt", l = {78}, m = "invokeSuspend")
        /* renamed from: Qh.G$a$a, reason: collision with other inner class name */
        static final class C0512a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f28186a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C18036r f28187b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0512a(C18036r c18036r, Continuation<? super C0512a> continuation) {
                super(2, continuation);
                this.f28187b = c18036r;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0512a(this.f28187b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C0512a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f28186a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C18039s bottomSheetState = this.f28187b.getBottomSheetState();
                    this.f28186a = 1;
                    if (bottomSheetState.b(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.profile.ProfileScreenKt$ProfileScreen$1$1$2", f = "ProfileScreen.kt", l = {BinsView.LABEL_WIDTH_DP}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f28188a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C18036r f28189b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C18036r c18036r, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f28189b = c18036r;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f28189b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f28188a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C18039s bottomSheetState = this.f28189b.getBottomSheetState();
                    this.f28188a = 1;
                    if (bottomSheetState.a(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l.ProfileScreenViewState eVar, InterfaceC15783O interfaceC15783O, C18036r c18036r, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f28183b = eVar;
            this.f28184c = interfaceC15783O;
            this.f28185d = c18036r;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f28183b, this.f28184c, this.f28185d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f28182a == 0) {
                ResultKt.b(obj);
                if (this.f28183b.getShouldOpenModal()) {
                    C15809k.d(this.f28184c, null, null, new C0512a(this.f28185d, null), 3, null);
                } else {
                    C15809k.d(this.f28184c, null, null, new b(this.f28185d, null), 3, null);
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.profile.ProfileScreenKt$ProfileScreen$2$1", f = "ProfileScreen.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f28190a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C18036r f28191b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ D1 f28192c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f28193d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C18036r c18036r, D1 d12, InterfaceC5914o interfaceC5914o, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f28191b = c18036r;
            this.f28192c = d12;
            this.f28193d = interfaceC5914o;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f28191b, this.f28192c, this.f28193d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f28190a == 0) {
                ResultKt.b(obj);
                if (this.f28191b.getBottomSheetState().f()) {
                    D1 d12 = this.f28192c;
                    if (d12 != null) {
                        d12.b();
                    }
                    InterfaceC5914o.l(this.f28193d, false, 1, null);
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l.ProfileScreenViewState f28194a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f28195b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.profile.a, Unit> f28196c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Gh.a, Unit> f28197d;

        /* JADX WARN: Multi-variable type inference failed */
        c(l.ProfileScreenViewState eVar, LocalThemeScope localThemeScope, Function1<? super com.meijer.mobile.accounts.ux.profile.a, Unit> function1, Function1<? super Gh.a, Unit> function12) {
            this.f28194a = eVar;
            this.f28195b = localThemeScope;
            this.f28196c = function1;
            this.f28197d = function12;
        }

        public final void a(InterfaceC14902f BottomSheetScaffold, Composer composer, int i10) {
            Intrinsics.j(BottomSheetScaffold, "$this$BottomSheetScaffold");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1833068921, i10, -1, "com.meijer.mobile.accounts.ux.composables.profile.ProfileScreen.<anonymous> (ProfileScreen.kt:126)");
            }
            com.meijer.mobile.accounts.ux.profile.p pVarL = this.f28194a.getScreen();
            if (pVarL instanceof p.b) {
                composer.startReplaceGroup(-1552850716);
                Rh.M.t(this.f28195b, this.f28194a, null, this.f28196c, composer, LocalThemeScope.f17314g, 2);
                composer.P();
            } else if (pVarL instanceof p.a) {
                composer.startReplaceGroup(-1552604638);
                Rh.r.j(this.f28195b, this.f28194a, null, this.f28196c, composer, LocalThemeScope.f17314g, 2);
                composer.P();
            } else if (pVarL instanceof p.c) {
                composer.startReplaceGroup(-1552355584);
                e0.s(this.f28195b, this.f28194a, null, this.f28196c, this.f28197d, composer, LocalThemeScope.f17314g, 2);
                composer.P();
            } else {
                if (!(pVarL instanceof p.d)) {
                    composer.startReplaceGroup(642643271);
                    composer.P();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-1552039260);
                p0.g(this.f28195b, this.f28194a, null, this.f28196c, composer, LocalThemeScope.f17314g, 2);
                composer.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
            a(interfaceC14902f, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f28198a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Gh.a, Unit> f28199b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f28200a;

            a(LocalThemeScope localThemeScope) {
                this.f28200a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1592979098, i10, -1, "com.meijer.mobile.accounts.ux.composables.profile.ProfileScreen.<anonymous>.<anonymous> (ProfileScreen.kt:103)");
                }
                Dr.g.g(this.f28200a, C16338g.c(Gh.h.f12956p4, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(381836838, i10, -1, "com.meijer.mobile.accounts.ux.composables.profile.ProfileScreen.<anonymous> (ProfileScreen.kt:101)");
            }
            AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(Gh.h.f12972s, new Object[0]);
            C.f.d dVar = C.f.d.f17051e;
            LocalThemeScope localThemeScope = this.f28198a;
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-1592979098, true, new a(localThemeScope), composer, 54);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f28199b);
            final Function1<Gh.a, Unit> function1 = this.f28199b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Qh.H
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return G.d.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, dVar, 0.0f, false, abstractC6392aD, composer, LocalThemeScope.f17314g | 24576 | (C.f.d.f17052f << 18) | (AbstractC6392a.f60445b << 27), 199);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(LocalThemeScope localThemeScope, Function1<? super Gh.a, Unit> function1) {
            this.f28198a = localThemeScope;
            this.f28199b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(a.k.f12614a);
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f28201a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l.ProfileScreenViewState f28202b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ContactUsDecorator f28203c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.profile.a, Unit> f28204d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<Gh.a, Unit> f28205e;

        /* JADX WARN: Multi-variable type inference failed */
        e(LocalThemeScope localThemeScope, l.ProfileScreenViewState eVar, ContactUsDecorator contactUsDecorator, Function1<? super com.meijer.mobile.accounts.ux.profile.a, Unit> function1, Function1<? super Gh.a, Unit> function12) {
            this.f28201a = localThemeScope;
            this.f28202b = eVar;
            this.f28203c = contactUsDecorator;
            this.f28204d = function1;
            this.f28205e = function12;
        }

        public final void a(InterfaceC14882C padding, Composer composer, int i10) {
            Intrinsics.j(padding, "padding");
            if ((i10 & 6) == 0) {
                i10 |= composer.V(padding) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2065136240, i10, -1, "com.meijer.mobile.accounts.ux.composables.profile.ProfileScreen.<anonymous> (ProfileScreen.kt:115)");
            }
            D.c(this.f28201a, this.f28202b, this.f28203c, androidx.compose.foundation.layout.D.h(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), padding), this.f28204d, this.f28205e, composer, LocalThemeScope.f17314g, 0);
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

    /* JADX WARN: Removed duplicated region for block: B:104:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ki.LocalThemeScope r33, final com.meijer.mobile.accounts.ux.profile.l.ProfileScreenViewState r34, final Sh.ContactUsDecorator r35, androidx.compose.ui.Modifier r36, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.profile.a, kotlin.Unit> r37, final kotlin.jvm.functions.Function1<? super Gh.a, kotlin.Unit> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qh.G.c(Ki.M, com.meijer.mobile.accounts.ux.profile.l$e, Sh.a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, l.ProfileScreenViewState eVar, ContactUsDecorator contactUsDecorator, Modifier modifier, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, eVar, contactUsDecorator, modifier, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(C18036r c18036r, Function1 function1, Function1 function12) {
        if (c18036r.getBottomSheetState().g()) {
            function1.invoke(a.C1352a.f95559a);
        } else {
            function12.invoke(a.k.f12614a);
        }
        return Unit.f143329a;
    }
}
