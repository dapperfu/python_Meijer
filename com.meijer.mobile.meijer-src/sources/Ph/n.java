package Ph;

import Gh.a;
import Ki.C;
import Ki.LocalThemeScope;
import Ph.n;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import bk.AbstractC6392a;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.accounts.ux.preferences.g;
import com.meijer.mobile.accounts.ux.preferences.k;
import j0.InterfaceC14882C;
import j0.InterfaceC14902f;
import kotlin.C17987a1;
import kotlin.C18036r;
import kotlin.C18039s;
import kotlin.Metadata;
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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aU\u0010\r\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lcom/meijer/mobile/accounts/ux/preferences/g$b;", "viewState", "", "isAccountOverviewScreenEnabled", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LGh/a;", "", "onNavigationRequest", "Lcom/meijer/mobile/accounts/ux/preferences/k;", "onAction", "b", "(LKi/M;Lcom/meijer/mobile/accounts/ux/preferences/g$b;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class n {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.preferences.PreferenceScreenKt$PreferenceScreen$1$1", f = "PreferenceScreen.kt", l = {}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f25836a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g.PreferenceScreenViewState f25837b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC15783O f25838c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C18036r f25839d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.preferences.PreferenceScreenKt$PreferenceScreen$1$1$1", f = "PreferenceScreen.kt", l = {64}, m = "invokeSuspend")
        /* renamed from: Ph.n$a$a, reason: collision with other inner class name */
        static final class C0433a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f25840a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C18036r f25841b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0433a(C18036r c18036r, Continuation<? super C0433a> continuation) {
                super(2, continuation);
                this.f25841b = c18036r;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0433a(this.f25841b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C0433a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f25840a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C18039s bottomSheetState = this.f25841b.getBottomSheetState();
                    this.f25840a = 1;
                    if (bottomSheetState.b(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.preferences.PreferenceScreenKt$PreferenceScreen$1$1$2", f = "PreferenceScreen.kt", l = {66}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f25842a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C18036r f25843b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C18036r c18036r, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f25843b = c18036r;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f25843b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f25842a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C18039s bottomSheetState = this.f25843b.getBottomSheetState();
                    this.f25842a = 1;
                    if (bottomSheetState.a(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g.PreferenceScreenViewState bVar, InterfaceC15783O interfaceC15783O, C18036r c18036r, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f25837b = bVar;
            this.f25838c = interfaceC15783O;
            this.f25839d = c18036r;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f25837b, this.f25838c, this.f25839d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f25836a == 0) {
                ResultKt.b(obj);
                if (this.f25837b.getShowModal()) {
                    C15809k.d(this.f25838c, null, null, new C0433a(this.f25839d, null), 3, null);
                } else {
                    C15809k.d(this.f25838c, null, null, new b(this.f25839d, null), 3, null);
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.preferences.PreferenceScreenKt$PreferenceScreen$2$1", f = "PreferenceScreen.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f25844a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C18036r f25845b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.preferences.k, Unit> f25846c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(C18036r c18036r, Function1<? super com.meijer.mobile.accounts.ux.preferences.k, Unit> function1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f25845b = c18036r;
            this.f25846c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f25845b, this.f25846c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f25844a == 0) {
                ResultKt.b(obj);
                if (this.f25845b.getBottomSheetState().f()) {
                    this.f25846c.invoke(k.a.f95537a);
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f25847a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g.PreferenceScreenViewState f25848b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C18036r f25849c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.preferences.k, Unit> f25850d;

        /* JADX WARN: Multi-variable type inference failed */
        c(LocalThemeScope localThemeScope, g.PreferenceScreenViewState bVar, C18036r c18036r, Function1<? super com.meijer.mobile.accounts.ux.preferences.k, Unit> function1) {
            this.f25847a = localThemeScope;
            this.f25848b = bVar;
            this.f25849c = c18036r;
            this.f25850d = function1;
        }

        public final void a(InterfaceC14902f BottomSheetScaffold, Composer composer, int i10) {
            Intrinsics.j(BottomSheetScaffold, "$this$BottomSheetScaffold");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-86632197, i10, -1, "com.meijer.mobile.accounts.ux.composables.preferences.PreferenceScreen.<anonymous> (PreferenceScreen.kt:81)");
            }
            LocalThemeScope localThemeScope = this.f25847a;
            String strC = this.f25848b.getEmail();
            AbstractC6392a abstractC6392aH = this.f25848b.getResendEmailErrorTitle();
            AbstractC6392a abstractC6392aG = this.f25848b.getResendEmailErrorDescription();
            boolean zF = this.f25849c.getBottomSheetState().f();
            Function1<com.meijer.mobile.accounts.ux.preferences.k, Unit> function1 = this.f25850d;
            int i11 = LocalThemeScope.f17314g;
            int i12 = AbstractC6392a.f60445b;
            y.e(localThemeScope, strC, abstractC6392aH, abstractC6392aG, zF, null, function1, composer, i11 | (i12 << 6) | (i12 << 9), 16);
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
    static final class d implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f25851a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f25852b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Gh.a, Unit> f25853c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f25854d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ g.PreferenceScreenViewState f25855e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.preferences.k, Unit> f25856f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f25857a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<Gh.a, Unit> f25858b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f25859c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ph.n$d$a$a, reason: collision with other inner class name */
            static final class C0434a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f25860a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f25861b;

                C0434a(LocalThemeScope localThemeScope, boolean z10) {
                    this.f25860a = localThemeScope;
                    this.f25861b = z10;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-2104060211, i10, -1, "com.meijer.mobile.accounts.ux.composables.preferences.PreferenceScreen.<anonymous>.<anonymous>.<anonymous> (PreferenceScreen.kt:94)");
                    }
                    Dr.g.g(this.f25860a, C16338g.c(this.f25861b ? Gh.h.f12755N : Gh.h.f12843Z3, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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
                    ComposerKt.U(-47287411, i10, -1, "com.meijer.mobile.accounts.ux.composables.preferences.PreferenceScreen.<anonymous>.<anonymous> (PreferenceScreen.kt:92)");
                }
                AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(Gh.h.f12972s, new Object[0]);
                C.f.d dVar = C.f.d.f17051e;
                LocalThemeScope localThemeScope = this.f25857a;
                ComposableLambda composableLambdaC = ComposableLambdaKt.c(-2104060211, true, new C0434a(localThemeScope, this.f25859c), composer, 54);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f25858b);
                final Function1<Gh.a, Unit> function1 = this.f25858b;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Ph.o
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return n.d.a.c(function1);
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
            a(LocalThemeScope localThemeScope, Function1<? super Gh.a, Unit> function1, boolean z10) {
                this.f25857a = localThemeScope;
                this.f25858b = function1;
                this.f25859c = z10;
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
        static final class b implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f25862a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ g.PreferenceScreenViewState f25863b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.preferences.k, Unit> f25864c;

            /* JADX WARN: Multi-variable type inference failed */
            b(LocalThemeScope localThemeScope, g.PreferenceScreenViewState bVar, Function1<? super com.meijer.mobile.accounts.ux.preferences.k, Unit> function1) {
                this.f25862a = localThemeScope;
                this.f25863b = bVar;
                this.f25864c = function1;
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
                    ComposerKt.U(-1963361228, i10, -1, "com.meijer.mobile.accounts.ux.composables.preferences.PreferenceScreen.<anonymous>.<anonymous> (PreferenceScreen.kt:109)");
                }
                l.d(this.f25862a, D.h(J.f(Modifier.INSTANCE, 0.0f, 1, null), padding), this.f25863b, this.f25864c, composer, LocalThemeScope.f17314g, 0);
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

        /* JADX WARN: Multi-variable type inference failed */
        d(Modifier modifier, LocalThemeScope localThemeScope, Function1<? super Gh.a, Unit> function1, boolean z10, g.PreferenceScreenViewState bVar, Function1<? super com.meijer.mobile.accounts.ux.preferences.k, Unit> function12) {
            this.f25851a = modifier;
            this.f25852b = localThemeScope;
            this.f25853c = function1;
            this.f25854d = z10;
            this.f25855e = bVar;
            this.f25856f = function12;
        }

        public final void a(InterfaceC14882C it, Composer composer, int i10) {
            Intrinsics.j(it, "it");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-408238030, i10, -1, "com.meijer.mobile.accounts.ux.composables.preferences.PreferenceScreen.<anonymous> (PreferenceScreen.kt:89)");
            }
            C17987a1.a(FullStoryAnnotationsKt.fsUnmask(this.f25851a), null, ComposableLambdaKt.c(-47287411, true, new a(this.f25852b, this.f25853c, this.f25854d), composer, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-1963361228, true, new b(this.f25852b, this.f25855e, this.f25856f), composer, 54), composer, 384, 12582912, 131066);
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

    /* JADX WARN: Removed duplicated region for block: B:102:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r32, final com.meijer.mobile.accounts.ux.preferences.g.PreferenceScreenViewState r33, final boolean r34, androidx.compose.ui.Modifier r35, final kotlin.jvm.functions.Function1<? super Gh.a, kotlin.Unit> r36, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.preferences.k, kotlin.Unit> r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ph.n.b(Ki.M, com.meijer.mobile.accounts.ux.preferences.g$b, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, g.PreferenceScreenViewState bVar, boolean z10, Modifier modifier, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, bVar, z10, modifier, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
