package Lh;

import Fh.a;
import Ji.C;
import Ji.LocalThemeScope;
import Lh.D;
import Th.c;
import ak.AbstractC5607a;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.InterfaceC5772o;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import ck.C6408b;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.accounts.ux.createaccount.CreateAccountUiState;
import com.meijer.mobile.accounts.ux.createaccount.b;
import com.meijer.mobile.accounts.ux.createaccount.k;
import e.C13588d;
import j0.InterfaceC14794C;
import j0.InterfaceC14814f;
import ji.InterfaceC14920X;
import ji.Q0;
import ji.q1;
import k6.InterfaceC15110m;
import kotlin.C17893M0;
import kotlin.C17921a1;
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
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aM\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f²\u0006\u0010\u0010\u000e\u001a\u0004\u0018\u00010\r8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Lcom/meijer/mobile/accounts/ux/createaccount/l;", "uiState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcom/meijer/mobile/accounts/ux/createaccount/b;", "", "onAction", "LFh/a;", "onNavigationRequest", "b", "(LJi/M;Lcom/meijer/mobile/accounts/ux/createaccount/l;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class D {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.createaccount.CreateAccountScreenKt$CreateAccountScreen$1$1", f = "CreateAccountScreen.kt", l = {70, 72}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f18128a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CreateAccountUiState f18129b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f18130c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C17893M0 f18131d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CreateAccountUiState createAccountUiState, InterfaceC5772o interfaceC5772o, C17893M0 c17893m0, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f18129b = createAccountUiState;
            this.f18130c = interfaceC5772o;
            this.f18131d = c17893m0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f18129b, this.f18130c, this.f18131d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
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
                int r1 = r4.f18128a
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
                com.meijer.mobile.accounts.ux.createaccount.l r5 = r4.f18129b
                Th.d r5 = r5.getCreateAccountDecorator()
                Th.c r5 = r5.getBottomSheetDecorator()
                boolean r5 = r5.getIsVisible()
                if (r5 == 0) goto L40
                androidx.compose.ui.focus.o r5 = r4.f18130c
                r1 = 0
                r2 = 0
                androidx.compose.ui.focus.InterfaceC5772o.l(r5, r1, r3, r2)
                x0.M0 r5 = r4.f18131d
                r4.f18128a = r3
                java.lang.Object r5 = r5.l(r4)
                if (r5 != r0) goto L4b
                goto L4a
            L40:
                x0.M0 r5 = r4.f18131d
                r4.f18128a = r2
                java.lang.Object r5 = r5.i(r4)
                if (r5 != r0) goto L4b
            L4a:
                return r0
            L4b:
                kotlin.Unit r5 = kotlin.Unit.f142422a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: Lh.D.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.createaccount.CreateAccountScreenKt$CreateAccountScreen$2$1", f = "CreateAccountScreen.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f18132a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C17893M0 f18133b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f18134c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ CreateAccountUiState f18135d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.createaccount.b, Unit> f18136e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f18137f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f18138g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f18139h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f18140i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(C17893M0 c17893m0, androidx.compose.ui.focus.y yVar, CreateAccountUiState createAccountUiState, Function1<? super com.meijer.mobile.accounts.ux.createaccount.b, Unit> function1, androidx.compose.ui.focus.y yVar2, androidx.compose.ui.focus.y yVar3, androidx.compose.ui.focus.y yVar4, androidx.compose.ui.focus.y yVar5, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f18133b = c17893m0;
            this.f18134c = yVar;
            this.f18135d = createAccountUiState;
            this.f18136e = function1;
            this.f18137f = yVar2;
            this.f18138g = yVar3;
            this.f18139h = yVar4;
            this.f18140i = yVar5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f18133b, this.f18134c, this.f18135d, this.f18136e, this.f18137f, this.f18138g, this.f18139h, this.f18140i, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            c.Default r92;
            IntrinsicsKt.f();
            if (this.f18132a == 0) {
                ResultKt.b(obj);
                if (this.f18133b.k()) {
                    Boxing.a(androidx.compose.ui.focus.y.h(this.f18134c, 0, 1, null));
                } else {
                    Th.c bottomSheetDecorator = this.f18135d.getCreateAccountDecorator().getBottomSheetDecorator();
                    if (bottomSheetDecorator instanceof c.Default) {
                        r92 = (c.Default) bottomSheetDecorator;
                    } else {
                        r92 = null;
                    }
                    if (r92 != null) {
                        androidx.compose.ui.focus.y yVar = this.f18137f;
                        androidx.compose.ui.focus.y yVar2 = this.f18138g;
                        androidx.compose.ui.focus.y yVar3 = this.f18139h;
                        androidx.compose.ui.focus.y yVar4 = this.f18140i;
                        Th.c previous = r92.getPrevious();
                        if (previous instanceof c.b) {
                            Boxing.a(androidx.compose.ui.focus.y.h(yVar, 0, 1, null));
                        } else if (previous instanceof c.e) {
                            Boxing.a(androidx.compose.ui.focus.y.h(yVar2, 0, 1, null));
                        } else if (previous instanceof c.d) {
                            Boxing.a(androidx.compose.ui.focus.y.h(yVar3, 0, 1, null));
                        } else if (previous instanceof c.C0778c) {
                            Boxing.a(androidx.compose.ui.focus.y.h(yVar4, 0, 1, null));
                        } else {
                            Unit unit = Unit.f142422a;
                        }
                    }
                    this.f18136e.invoke(b.c.f94328a);
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CreateAccountUiState f18141a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f18142b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f18143c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.createaccount.b, Unit> f18144d;

        /* JADX WARN: Multi-variable type inference failed */
        c(CreateAccountUiState createAccountUiState, LocalThemeScope localThemeScope, androidx.compose.ui.focus.y yVar, Function1<? super com.meijer.mobile.accounts.ux.createaccount.b, Unit> function1) {
            this.f18141a = createAccountUiState;
            this.f18142b = localThemeScope;
            this.f18143c = yVar;
            this.f18144d = function1;
        }

        public final void a(InterfaceC14814f AcresBottomSheet, Composer composer, int i10) {
            Intrinsics.j(AcresBottomSheet, "$this$AcresBottomSheet");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1546841783, i10, -1, "com.meijer.mobile.accounts.ux.composables.createaccount.CreateAccountScreen.<anonymous> (CreateAccountScreen.kt:103)");
            }
            C4076d.d(this.f18142b, null, this.f18141a.getCreateAccountDecorator().getBottomSheetDecorator(), this.f18143c, this.f18144d, composer, LocalThemeScope.f15770g | 3072 | (AbstractC5607a.f45514b << 6), 1);
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
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CreateAccountUiState f18145a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f18146b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Fh.a, Unit> f18147c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.createaccount.b, Unit> f18148d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f18149e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f18150f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f18151g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f18152h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CreateAccountUiState f18153a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f18154b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<Fh.a, Unit> f18155c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Lh.D$d$a$a, reason: collision with other inner class name */
            static final class C0306a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f18156a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ CreateAccountUiState f18157b;

                C0306a(LocalThemeScope localThemeScope, CreateAccountUiState createAccountUiState) {
                    this.f18156a = localThemeScope;
                    this.f18157b = createAccountUiState;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-102032703, i10, -1, "com.meijer.mobile.accounts.ux.composables.createaccount.CreateAccountScreen.<anonymous>.<anonymous>.<anonymous> (CreateAccountScreen.kt:114)");
                    }
                    Dr.g.g(this.f18156a, C6408b.a(this.f18157b.getCreateAccountState().getAppBarDecorator().getTitle(), composer, AbstractC5607a.f45514b), null, this.f18157b.getCreateAccountState().getAppBarDecorator().getIsImportantForAccessibility(), null, 0, null, 0, composer, LocalThemeScope.f15770g, 122);
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
                    ComposerKt.U(164169601, i10, -1, "com.meijer.mobile.accounts.ux.composables.createaccount.CreateAccountScreen.<anonymous>.<anonymous> (CreateAccountScreen.kt:112)");
                }
                AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(Fh.h.f10781s, new Object[0]);
                C.f.d dVar = C.f.d.f15507e;
                boolean isBackIconShown = this.f18153a.getCreateAccountState().getAppBarDecorator().getIsBackIconShown();
                LocalThemeScope localThemeScope = this.f18154b;
                ComposableLambda composableLambdaC = ComposableLambdaKt.c(-102032703, true, new C0306a(localThemeScope, this.f18153a), composer, 54);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f18155c);
                final Function1<Fh.a, Unit> function1 = this.f18155c;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Lh.E
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return D.d.a.c(function1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, dVar, 0.0f, isBackIconShown, abstractC5607aD, composer, LocalThemeScope.f15770g | 24576 | (C.f.d.f15508f << 18) | (AbstractC5607a.f45514b << 27), 71);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(CreateAccountUiState createAccountUiState, LocalThemeScope localThemeScope, Function1<? super Fh.a, Unit> function1) {
                this.f18153a = createAccountUiState;
                this.f18154b = localThemeScope;
                this.f18155c = function1;
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
        @SourceDebugExtension
        static final class b implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f18158a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ CreateAccountUiState f18159b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.createaccount.b, Unit> f18160c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.y f18161d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.y f18162e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.y f18163f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.y f18164g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function1<Fh.a, Unit> f18165h;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f18166a;

                a(LocalThemeScope localThemeScope) {
                    this.f18166a = localThemeScope;
                }

                public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(-320485102, i10, -1, "com.meijer.mobile.accounts.ux.composables.createaccount.CreateAccountScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreateAccountScreen.kt:151)");
                    }
                    q1.k.LargeV2 largeLoadingV2 = Assemble.getLoading().getLargeLoadingV2();
                    Bi.o oVar = Bi.o.f2584a;
                    Bi.m.e(this.f18166a, FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null)), largeLoadingV2, oVar, null, null, null, composer, LocalThemeScope.f15770g | 3072 | (q1.k.LargeV2.f140096f << 6), 56);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14920X interfaceC14920X, Composer composer, Integer num) {
                    a(interfaceC14920X, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            b(LocalThemeScope localThemeScope, CreateAccountUiState createAccountUiState, Function1<? super com.meijer.mobile.accounts.ux.createaccount.b, Unit> function1, androidx.compose.ui.focus.y yVar, androidx.compose.ui.focus.y yVar2, androidx.compose.ui.focus.y yVar3, androidx.compose.ui.focus.y yVar4, Function1<? super Fh.a, Unit> function12) {
                this.f18158a = localThemeScope;
                this.f18159b = createAccountUiState;
                this.f18160c = function1;
                this.f18161d = yVar;
                this.f18162e = yVar2;
                this.f18163f = yVar3;
                this.f18164g = yVar4;
                this.f18165h = function12;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e() {
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(Function1 function1) {
                function1.invoke(b.C1329b.f94327a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g() {
                return Unit.f142422a;
            }

            public final void d(InterfaceC14794C padding, Composer composer, int i10) {
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
                Modifier modifierD = androidx.compose.foundation.b.d(androidx.compose.foundation.layout.J.f(androidx.compose.foundation.layout.D.h(companion, padding), 0.0f, 1, null), this.f18158a.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null);
                CreateAccountUiState createAccountUiState = this.f18159b;
                LocalThemeScope localThemeScope = this.f18158a;
                final Function1<com.meijer.mobile.accounts.ux.createaccount.b, Unit> function1 = this.f18160c;
                androidx.compose.ui.focus.y yVar = this.f18161d;
                androidx.compose.ui.focus.y yVar2 = this.f18162e;
                androidx.compose.ui.focus.y yVar3 = this.f18163f;
                androidx.compose.ui.focus.y yVar4 = this.f18164g;
                Function1<Fh.a, Unit> function12 = this.f18165h;
                MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
                int iA = C5717f.a(composer2, 0);
                InterfaceC5742s interfaceC5742sR = composer2.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer2, modifierD);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion2.a();
                if (composer2.k() == null) {
                    C5717f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A);
                } else {
                    composer2.s();
                }
                Composer composerA = D1.a(composer2);
                D1.c(composerA, measurePolicyG, companion2.e());
                D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C5664j c5664j = C5664j.f48612a;
                com.meijer.mobile.accounts.ux.createaccount.k createAccountState = createAccountUiState.getCreateAccountState();
                if (createAccountState instanceof k.Animation) {
                    composer2.startReplaceGroup(-869749162);
                    composer2.startReplaceGroup(1849434622);
                    Object objB = composer2.B();
                    Composer.Companion companion3 = Composer.INSTANCE;
                    if (objB == companion3.a()) {
                        objB = new Function0() { // from class: Lh.F
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return D.d.b.e();
                            }
                        };
                        composer2.t(objB);
                    }
                    composer2.P();
                    C13588d.a(false, (Function0) objB, composer2, 48, 1);
                    Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(companion);
                    InterfaceC15110m.e eVarA = InterfaceC15110m.e.a(((k.Animation) createAccountUiState.getCreateAccountState()).getLottieSpec());
                    String strA = C6408b.a(((k.Animation) createAccountUiState.getCreateAccountState()).getLiveRegionDescription(), composer2, AbstractC5607a.f45514b);
                    composer2.startReplaceGroup(5004770);
                    boolean zV = composer2.V(function1);
                    Object objB2 = composer2.B();
                    if (zV || objB2 == companion3.a()) {
                        objB2 = new Function0() { // from class: Lh.G
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return D.d.b.f(function1);
                            }
                        };
                        composer2.t(objB2);
                    }
                    composer2.P();
                    N.d(localThemeScope, modifierFsUnmask, eVarA, strA, (Function0) objB2, composer2, LocalThemeScope.f15770g, 0);
                    composer2.P();
                } else if (createAccountState instanceof k.Loading) {
                    composer2.startReplaceGroup(-869080988);
                    composer2.startReplaceGroup(1849434622);
                    Object objB3 = composer2.B();
                    if (objB3 == Composer.INSTANCE.a()) {
                        objB3 = new Function0() { // from class: Lh.H
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return D.d.b.g();
                            }
                        };
                        composer2.t(objB3);
                    }
                    composer2.P();
                    C13588d.a(false, (Function0) objB3, composer2, 48, 1);
                    Ji.Q.e(localThemeScope, Q0.b.f139711a, ComposableLambdaKt.c(-320485102, true, new a(localThemeScope), composer2, 54), composer2, LocalThemeScope.f15770g | 384 | (Q0.b.f139712b << 3));
                    composer2.P();
                } else {
                    if (!(createAccountState instanceof k.FormFields)) {
                        composer2.startReplaceGroup(664678823);
                        composer2.P();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer2.startReplaceGroup(-868392385);
                    e0.p(localThemeScope, createAccountUiState.getCreateAccountDecorator(), yVar, yVar2, yVar3, yVar4, null, function1, function12, composer2, 224640 | LocalThemeScope.f15770g, 32);
                    composer2 = composer2;
                    composer2.P();
                }
                composer2.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
                d(interfaceC14794C, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(CreateAccountUiState createAccountUiState, LocalThemeScope localThemeScope, Function1<? super Fh.a, Unit> function1, Function1<? super com.meijer.mobile.accounts.ux.createaccount.b, Unit> function12, androidx.compose.ui.focus.y yVar, androidx.compose.ui.focus.y yVar2, androidx.compose.ui.focus.y yVar3, androidx.compose.ui.focus.y yVar4) {
            this.f18145a = createAccountUiState;
            this.f18146b = localThemeScope;
            this.f18147c = function1;
            this.f18148d = function12;
            this.f18149e = yVar;
            this.f18150f = yVar2;
            this.f18151g = yVar3;
            this.f18152h = yVar4;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(36595174, i10, -1, "com.meijer.mobile.accounts.ux.composables.createaccount.CreateAccountScreen.<anonymous> (CreateAccountScreen.kt:110)");
            }
            C17921a1.a(null, null, ComposableLambdaKt.c(164169601, true, new a(this.f18145a, this.f18146b, this.f18147c), composer, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-223606936, true, new b(this.f18146b, this.f18145a, this.f18148d, this.f18149e, this.f18150f, this.f18151g, this.f18152h, this.f18147c), composer, 54), composer, 384, 12582912, 131067);
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
    public static final void b(final Ji.LocalThemeScope r21, final com.meijer.mobile.accounts.ux.createaccount.CreateAccountUiState r22, androidx.compose.ui.Modifier r23, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.createaccount.b, kotlin.Unit> r24, final kotlin.jvm.functions.Function1<? super Fh.a, kotlin.Unit> r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.D.b(Ji.M, com.meijer.mobile.accounts.ux.createaccount.l, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, CreateAccountUiState createAccountUiState, Modifier modifier, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, createAccountUiState, modifier, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
