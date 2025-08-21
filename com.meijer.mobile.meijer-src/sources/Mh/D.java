package Mh;

import Gh.a;
import Ki.C;
import Ki.LocalThemeScope;
import Mh.D;
import Uh.c;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.InterfaceC5914o;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import bk.AbstractC6392a;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.accounts.ux.createaccount.CreateAccountUiState;
import com.meijer.mobile.accounts.ux.createaccount.b;
import com.meijer.mobile.accounts.ux.createaccount.k;
import dk.C13698b;
import e.C13736d;
import j0.InterfaceC14882C;
import j0.InterfaceC14902f;
import ki.InterfaceC15154X;
import ki.Q0;
import ki.q1;
import kotlin.C17959M0;
import kotlin.C17987a1;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l6.InterfaceC15469m;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aM\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f²\u0006\u0010\u0010\u000e\u001a\u0004\u0018\u00010\r8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lcom/meijer/mobile/accounts/ux/createaccount/l;", "uiState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcom/meijer/mobile/accounts/ux/createaccount/b;", "", "onAction", "LGh/a;", "onNavigationRequest", "b", "(LKi/M;Lcom/meijer/mobile/accounts/ux/createaccount/l;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class D {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.createaccount.CreateAccountScreenKt$CreateAccountScreen$1$1", f = "CreateAccountScreen.kt", l = {70, 72}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f19937a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CreateAccountUiState f19938b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f19939c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C17959M0 f19940d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CreateAccountUiState createAccountUiState, InterfaceC5914o interfaceC5914o, C17959M0 c17959m0, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f19938b = createAccountUiState;
            this.f19939c = interfaceC5914o;
            this.f19940d = c17959m0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f19938b, this.f19939c, this.f19940d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
        
            if (r5.l(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        
            if (r5.i(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r4.f19937a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.ResultKt.b(r5)
                goto L4b
            L1b:
                kotlin.ResultKt.b(r5)
                com.meijer.mobile.accounts.ux.createaccount.l r5 = r4.f19938b
                Uh.d r5 = r5.getCreateAccountDecorator()
                Uh.c r5 = r5.getBottomSheetDecorator()
                boolean r5 = r5.getIsVisible()
                if (r5 == 0) goto L40
                androidx.compose.ui.focus.o r5 = r4.f19939c
                r1 = 0
                r2 = 0
                androidx.compose.ui.focus.InterfaceC5914o.l(r5, r1, r3, r2)
                x0.M0 r5 = r4.f19940d
                r4.f19937a = r3
                java.lang.Object r5 = r5.l(r4)
                if (r5 != r0) goto L4b
                goto L4a
            L40:
                x0.M0 r5 = r4.f19940d
                r4.f19937a = r2
                java.lang.Object r5 = r5.i(r4)
                if (r5 != r0) goto L4b
            L4a:
                return r0
            L4b:
                kotlin.Unit r5 = kotlin.Unit.f143329a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: Mh.D.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.createaccount.CreateAccountScreenKt$CreateAccountScreen$2$1", f = "CreateAccountScreen.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f19941a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C17959M0 f19942b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f19943c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ CreateAccountUiState f19944d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.createaccount.b, Unit> f19945e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f19946f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f19947g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f19948h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f19949i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(C17959M0 c17959m0, androidx.compose.ui.focus.y yVar, CreateAccountUiState createAccountUiState, Function1<? super com.meijer.mobile.accounts.ux.createaccount.b, Unit> function1, androidx.compose.ui.focus.y yVar2, androidx.compose.ui.focus.y yVar3, androidx.compose.ui.focus.y yVar4, androidx.compose.ui.focus.y yVar5, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f19942b = c17959m0;
            this.f19943c = yVar;
            this.f19944d = createAccountUiState;
            this.f19945e = function1;
            this.f19946f = yVar2;
            this.f19947g = yVar3;
            this.f19948h = yVar4;
            this.f19949i = yVar5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f19942b, this.f19943c, this.f19944d, this.f19945e, this.f19946f, this.f19947g, this.f19948h, this.f19949i, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            c.Default r92;
            IntrinsicsKt.f();
            if (this.f19941a == 0) {
                ResultKt.b(obj);
                if (this.f19942b.k()) {
                    Boxing.a(androidx.compose.ui.focus.y.h(this.f19943c, 0, 1, null));
                } else {
                    Uh.c bottomSheetDecorator = this.f19944d.getCreateAccountDecorator().getBottomSheetDecorator();
                    if (bottomSheetDecorator instanceof c.Default) {
                        r92 = (c.Default) bottomSheetDecorator;
                    } else {
                        r92 = null;
                    }
                    if (r92 != null) {
                        androidx.compose.ui.focus.y yVar = this.f19946f;
                        androidx.compose.ui.focus.y yVar2 = this.f19947g;
                        androidx.compose.ui.focus.y yVar3 = this.f19948h;
                        androidx.compose.ui.focus.y yVar4 = this.f19949i;
                        Uh.c previous = r92.getPrevious();
                        if (previous instanceof c.b) {
                            Boxing.a(androidx.compose.ui.focus.y.h(yVar, 0, 1, null));
                        } else if (previous instanceof c.e) {
                            Boxing.a(androidx.compose.ui.focus.y.h(yVar2, 0, 1, null));
                        } else if (previous instanceof c.d) {
                            Boxing.a(androidx.compose.ui.focus.y.h(yVar3, 0, 1, null));
                        } else if (previous instanceof c.C0825c) {
                            Boxing.a(androidx.compose.ui.focus.y.h(yVar4, 0, 1, null));
                        } else {
                            Unit unit = Unit.f143329a;
                        }
                    }
                    this.f19945e.invoke(b.c.f95173a);
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CreateAccountUiState f19950a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f19951b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f19952c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.createaccount.b, Unit> f19953d;

        /* JADX WARN: Multi-variable type inference failed */
        c(CreateAccountUiState createAccountUiState, LocalThemeScope localThemeScope, androidx.compose.ui.focus.y yVar, Function1<? super com.meijer.mobile.accounts.ux.createaccount.b, Unit> function1) {
            this.f19950a = createAccountUiState;
            this.f19951b = localThemeScope;
            this.f19952c = yVar;
            this.f19953d = function1;
        }

        public final void a(InterfaceC14902f AcresBottomSheet, Composer composer, int i10) {
            Intrinsics.j(AcresBottomSheet, "$this$AcresBottomSheet");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1546841783, i10, -1, "com.meijer.mobile.accounts.ux.composables.createaccount.CreateAccountScreen.<anonymous> (CreateAccountScreen.kt:103)");
            }
            C4150d.d(this.f19951b, null, this.f19950a.getCreateAccountDecorator().getBottomSheetDecorator(), this.f19952c, this.f19953d, composer, LocalThemeScope.f17314g | 3072 | (AbstractC6392a.f60445b << 6), 1);
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
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CreateAccountUiState f19954a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f19955b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Gh.a, Unit> f19956c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.createaccount.b, Unit> f19957d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f19958e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f19959f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f19960g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f19961h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CreateAccountUiState f19962a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f19963b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<Gh.a, Unit> f19964c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Mh.D$d$a$a, reason: collision with other inner class name */
            static final class C0348a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f19965a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ CreateAccountUiState f19966b;

                C0348a(LocalThemeScope localThemeScope, CreateAccountUiState createAccountUiState) {
                    this.f19965a = localThemeScope;
                    this.f19966b = createAccountUiState;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-102032703, i10, -1, "com.meijer.mobile.accounts.ux.composables.createaccount.CreateAccountScreen.<anonymous>.<anonymous>.<anonymous> (CreateAccountScreen.kt:114)");
                    }
                    Dr.g.g(this.f19965a, C13698b.a(this.f19966b.getCreateAccountState().getAppBarDecorator().getTitle(), composer, AbstractC6392a.f60445b), null, this.f19966b.getCreateAccountState().getAppBarDecorator().getIsImportantForAccessibility(), null, 0, null, 0, composer, LocalThemeScope.f17314g, 122);
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
                    ComposerKt.U(164169601, i10, -1, "com.meijer.mobile.accounts.ux.composables.createaccount.CreateAccountScreen.<anonymous>.<anonymous> (CreateAccountScreen.kt:112)");
                }
                AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(Gh.h.f12972s, new Object[0]);
                C.f.d dVar = C.f.d.f17051e;
                boolean isBackIconShown = this.f19962a.getCreateAccountState().getAppBarDecorator().getIsBackIconShown();
                LocalThemeScope localThemeScope = this.f19963b;
                ComposableLambda composableLambdaC = ComposableLambdaKt.c(-102032703, true, new C0348a(localThemeScope, this.f19962a), composer, 54);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f19964c);
                final Function1<Gh.a, Unit> function1 = this.f19964c;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Mh.E
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return D.d.a.c(function1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, dVar, 0.0f, isBackIconShown, abstractC6392aD, composer, LocalThemeScope.f17314g | 24576 | (C.f.d.f17052f << 18) | (AbstractC6392a.f60445b << 27), 71);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(CreateAccountUiState createAccountUiState, LocalThemeScope localThemeScope, Function1<? super Gh.a, Unit> function1) {
                this.f19962a = createAccountUiState;
                this.f19963b = localThemeScope;
                this.f19964c = function1;
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
        @SourceDebugExtension
        static final class b implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f19967a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ CreateAccountUiState f19968b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.createaccount.b, Unit> f19969c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.y f19970d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.y f19971e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.y f19972f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.y f19973g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function1<Gh.a, Unit> f19974h;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f19975a;

                a(LocalThemeScope localThemeScope) {
                    this.f19975a = localThemeScope;
                }

                public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(-320485102, i10, -1, "com.meijer.mobile.accounts.ux.composables.createaccount.CreateAccountScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreateAccountScreen.kt:151)");
                    }
                    q1.k.LargeV2 largeLoadingV2 = Assemble.getLoading().getLargeLoadingV2();
                    Ci.o oVar = Ci.o.f4629a;
                    Ci.m.e(this.f19975a, FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null)), largeLoadingV2, oVar, null, null, null, composer, LocalThemeScope.f17314g | 3072 | (q1.k.LargeV2.f142351f << 6), 56);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15154X interfaceC15154X, Composer composer, Integer num) {
                    a(interfaceC15154X, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            b(LocalThemeScope localThemeScope, CreateAccountUiState createAccountUiState, Function1<? super com.meijer.mobile.accounts.ux.createaccount.b, Unit> function1, androidx.compose.ui.focus.y yVar, androidx.compose.ui.focus.y yVar2, androidx.compose.ui.focus.y yVar3, androidx.compose.ui.focus.y yVar4, Function1<? super Gh.a, Unit> function12) {
                this.f19967a = localThemeScope;
                this.f19968b = createAccountUiState;
                this.f19969c = function1;
                this.f19970d = yVar;
                this.f19971e = yVar2;
                this.f19972f = yVar3;
                this.f19973g = yVar4;
                this.f19974h = function12;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e() {
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(Function1 function1) {
                function1.invoke(b.C1338b.f95172a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g() {
                return Unit.f143329a;
            }

            public final void d(InterfaceC14882C padding, Composer composer, int i10) {
                int i11;
                Composer composer2 = composer;
                Intrinsics.j(padding, "padding");
                if ((i10 & 6) == 0) {
                    i11 = i10 | (composer2.V(padding) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer2.j()) {
                    composer2.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-223606936, i11, -1, "com.meijer.mobile.accounts.ux.composables.createaccount.CreateAccountScreen.<anonymous>.<anonymous> (CreateAccountScreen.kt:127)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierD = androidx.compose.foundation.b.d(androidx.compose.foundation.layout.J.f(androidx.compose.foundation.layout.D.h(companion, padding), 0.0f, 1, null), this.f19967a.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null);
                CreateAccountUiState createAccountUiState = this.f19968b;
                LocalThemeScope localThemeScope = this.f19967a;
                final Function1<com.meijer.mobile.accounts.ux.createaccount.b, Unit> function1 = this.f19969c;
                androidx.compose.ui.focus.y yVar = this.f19970d;
                androidx.compose.ui.focus.y yVar2 = this.f19971e;
                androidx.compose.ui.focus.y yVar3 = this.f19972f;
                androidx.compose.ui.focus.y yVar4 = this.f19973g;
                Function1<Gh.a, Unit> function12 = this.f19974h;
                MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
                int iA = C5859f.a(composer2, 0);
                InterfaceC5884s interfaceC5884sR = composer2.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer2, modifierD);
                InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion2.a();
                if (composer2.k() == null) {
                    C5859f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A);
                } else {
                    composer2.s();
                }
                Composer composerA = D1.a(composer2);
                D1.c(composerA, measurePolicyG, companion2.e());
                D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C5806j c5806j = C5806j.f48836a;
                com.meijer.mobile.accounts.ux.createaccount.k createAccountState = createAccountUiState.getCreateAccountState();
                if (createAccountState instanceof k.Animation) {
                    composer2.startReplaceGroup(-869749162);
                    composer2.startReplaceGroup(1849434622);
                    Object objB = composer2.B();
                    Composer.Companion companion3 = Composer.INSTANCE;
                    if (objB == companion3.a()) {
                        objB = new Function0() { // from class: Mh.F
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return D.d.b.e();
                            }
                        };
                        composer2.t(objB);
                    }
                    composer2.P();
                    C13736d.a(false, (Function0) objB, composer2, 48, 1);
                    Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(companion);
                    InterfaceC15469m.e eVarA = InterfaceC15469m.e.a(((k.Animation) createAccountUiState.getCreateAccountState()).getLottieSpec());
                    String strA = C13698b.a(((k.Animation) createAccountUiState.getCreateAccountState()).getLiveRegionDescription(), composer2, AbstractC6392a.f60445b);
                    composer2.startReplaceGroup(5004770);
                    boolean zV = composer2.V(function1);
                    Object objB2 = composer2.B();
                    if (zV || objB2 == companion3.a()) {
                        objB2 = new Function0() { // from class: Mh.G
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return D.d.b.f(function1);
                            }
                        };
                        composer2.t(objB2);
                    }
                    composer2.P();
                    N.d(localThemeScope, modifierFsUnmask, eVarA, strA, (Function0) objB2, composer2, LocalThemeScope.f17314g, 0);
                    composer2.P();
                } else if (createAccountState instanceof k.Loading) {
                    composer2.startReplaceGroup(-869080988);
                    composer2.startReplaceGroup(1849434622);
                    Object objB3 = composer2.B();
                    if (objB3 == Composer.INSTANCE.a()) {
                        objB3 = new Function0() { // from class: Mh.H
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return D.d.b.g();
                            }
                        };
                        composer2.t(objB3);
                    }
                    composer2.P();
                    C13736d.a(false, (Function0) objB3, composer2, 48, 1);
                    Ki.Q.e(localThemeScope, Q0.b.f141966a, ComposableLambdaKt.c(-320485102, true, new a(localThemeScope), composer2, 54), composer2, LocalThemeScope.f17314g | 384 | (Q0.b.f141967b << 3));
                    composer2.P();
                } else {
                    if (!(createAccountState instanceof k.FormFields)) {
                        composer2.startReplaceGroup(664678823);
                        composer2.P();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer2.startReplaceGroup(-868392385);
                    e0.p(localThemeScope, createAccountUiState.getCreateAccountDecorator(), yVar, yVar2, yVar3, yVar4, null, function1, function12, composer2, 224640 | LocalThemeScope.f17314g, 32);
                    composer2 = composer2;
                    composer2.P();
                }
                composer2.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
                d(interfaceC14882C, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(CreateAccountUiState createAccountUiState, LocalThemeScope localThemeScope, Function1<? super Gh.a, Unit> function1, Function1<? super com.meijer.mobile.accounts.ux.createaccount.b, Unit> function12, androidx.compose.ui.focus.y yVar, androidx.compose.ui.focus.y yVar2, androidx.compose.ui.focus.y yVar3, androidx.compose.ui.focus.y yVar4) {
            this.f19954a = createAccountUiState;
            this.f19955b = localThemeScope;
            this.f19956c = function1;
            this.f19957d = function12;
            this.f19958e = yVar;
            this.f19959f = yVar2;
            this.f19960g = yVar3;
            this.f19961h = yVar4;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(36595174, i10, -1, "com.meijer.mobile.accounts.ux.composables.createaccount.CreateAccountScreen.<anonymous> (CreateAccountScreen.kt:110)");
            }
            C17987a1.a(null, null, ComposableLambdaKt.c(164169601, true, new a(this.f19954a, this.f19955b, this.f19956c), composer, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-223606936, true, new b(this.f19955b, this.f19954a, this.f19957d, this.f19958e, this.f19959f, this.f19960g, this.f19961h, this.f19956c), composer, 54), composer, 384, 12582912, 131067);
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r21, final com.meijer.mobile.accounts.ux.createaccount.CreateAccountUiState r22, androidx.compose.ui.Modifier r23, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.createaccount.b, kotlin.Unit> r24, final kotlin.jvm.functions.Function1<? super Gh.a, kotlin.Unit> r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Mh.D.b(Ki.M, com.meijer.mobile.accounts.ux.createaccount.l, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, CreateAccountUiState createAccountUiState, Modifier modifier, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, createAccountUiState, modifier, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
