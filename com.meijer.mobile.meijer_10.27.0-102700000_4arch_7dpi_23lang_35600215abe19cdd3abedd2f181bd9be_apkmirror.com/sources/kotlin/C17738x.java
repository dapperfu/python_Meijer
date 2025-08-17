package kotlin;

import androidx.compose.foundation.text.C5678j;
import androidx.compose.foundation.text.E;
import androidx.compose.foundation.text.P;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.F;
import androidx.compose.runtime.G0;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.r;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.C5881p0;
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.platform.H1;
import androidx.compose.ui.platform.InterfaceC5884q0;
import androidx.compose.ui.text.AnnotatedString;
import androidx.recyclerview.widget.RecyclerView;
import c1.InterfaceC6344a;
import g1.J;
import g1.U;
import i0.C14586b;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16648k;
import qv.EnumC16624Q;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aG\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00030\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e²\u0006\u0010\u0010\b\u001a\u0004\u0018\u00010\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "content", "a", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Lw0/p;", "selection", "Lkotlin/Function1;", "onSelectionChange", "children", "b", "(Landroidx/compose/ui/Modifier;Lw0/p;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: w0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17738x {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw0/p;", "it", "", "a", "(Lw0/p;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w0.x$a */
    static final class a extends Lambda implements Function1<Selection, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Selection> f165572f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC5730l0<Selection> interfaceC5730l0) {
            super(1);
            this.f165572f = interfaceC5730l0;
        }

        public final void a(Selection selection) {
            C17738x.d(this.f165572f, selection);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Selection selection) {
            a(selection);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w0.x$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f165573f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f165574g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f165575h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f165576i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f165573f = modifier;
            this.f165574g = function2;
            this.f165575h = i10;
            this.f165576i = i11;
        }

        public final void a(Composer composer, int i10) {
            C17738x.a(this.f165573f, this.f165574g, composer, J0.a(this.f165575h | 1), this.f165576i);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "textToCopy", "", "a", "(Landroidx/compose/ui/text/AnnotatedString;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w0.x$c */
    static final class c extends Lambda implements Function1<AnnotatedString, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f165577f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5884q0 f165578g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1$1", f = "SelectionContainer.kt", l = {103}, m = "invokeSuspend")
        /* renamed from: w0.x$c$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f165579a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5884q0 f165580b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AnnotatedString f165581c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC5884q0 interfaceC5884q0, AnnotatedString annotatedString, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f165580b = interfaceC5884q0;
                this.f165581c = annotatedString;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f165580b, this.f165581c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f165579a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC5884q0 interfaceC5884q0 = this.f165580b;
                    C5881p0 c5881p0E = C14586b.e(this.f165581c);
                    this.f165579a = 1;
                    if (interfaceC5884q0.b(c5881p0E, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC16622O interfaceC16622O, InterfaceC5884q0 interfaceC5884q0) {
            super(1);
            this.f165577f = interfaceC16622O;
            this.f165578g = interfaceC5884q0;
        }

        public final void a(AnnotatedString annotatedString) {
            C16648k.d(this.f165577f, null, EnumC16624Q.f157614d, new a(this.f165578g, annotatedString, null), 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AnnotatedString annotatedString) {
            a(annotatedString);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w0.x$d */
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17698G f165582f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C17703L f165583g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f165584h;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w0.x$d$a */
        static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C17703L f165585f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f165586g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ C17698G f165587h;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
            @SourceDebugExtension
            /* renamed from: w0.x$d$a$a, reason: collision with other inner class name */
            static final class C2622a extends Lambda implements Function2<Composer, Integer, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function2<Composer, Integer, Unit> f165588f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ C17698G f165589g;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/J;", "", "invoke", "(Lg1/J;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: w0.x$d$a$a$a, reason: collision with other inner class name */
                static final class C2623a implements PointerInputEventHandler {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ P f165590a;

                    C2623a(P p10) {
                        this.f165590a = p10;
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(J j10, Continuation<? super Unit> continuation) {
                        Object objC = E.c(j10, this.f165590a, continuation);
                        return objC == IntrinsicsKt.f() ? objC : Unit.f142422a;
                    }
                }

                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LU0/f;", "c", "()J"}, k = 3, mv = {1, 9, 0})
                /* renamed from: w0.x$d$a$a$b */
                static final class b extends Lambda implements Function0<U0.f> {

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ C17698G f165591f;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(C17698G c17698g) {
                        super(0);
                        this.f165591f = c17698g;
                    }

                    public final long c() {
                        U0.f fVarH = this.f165591f.H();
                        return fVarH != null ? fVarH.getPackedValue() : U0.f.INSTANCE.b();
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ U0.f invoke() {
                        return U0.f.d(c());
                    }
                }

                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LU0/f;", "c", "()J"}, k = 3, mv = {1, 9, 0})
                /* renamed from: w0.x$d$a$a$c */
                static final class c extends Lambda implements Function0<U0.f> {

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ C17698G f165592f;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    c(C17698G c17698g) {
                        super(0);
                        this.f165592f = c17698g;
                    }

                    public final long c() {
                        U0.f fVarX = this.f165592f.x();
                        return fVarX != null ? fVarX.getPackedValue() : U0.f.INSTANCE.b();
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ U0.f invoke() {
                        return U0.f.d(c());
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C2622a(Function2<? super Composer, ? super Integer, Unit> function2, C17698G c17698g) {
                    super(2);
                    this.f165588f = function2;
                    this.f165589g = c17698g;
                }

                public final void a(Composer composer, int i10) {
                    if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-272381430, i10, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous>.<anonymous> (SelectionContainer.kt:120)");
                    }
                    this.f165588f.invoke(composer, 0);
                    if (this.f165589g.L() && this.f165589g.z() && !this.f165589g.N()) {
                        composer.startReplaceGroup(-881553831);
                        Selection selectionD = this.f165589g.D();
                        if (selectionD == null) {
                            composer.startReplaceGroup(-881514989);
                        } else {
                            composer.startReplaceGroup(-881514988);
                            C17698G c17698g = this.f165589g;
                            composer.startReplaceGroup(1495586214);
                            List listP = CollectionsKt.p(Boolean.TRUE, Boolean.FALSE);
                            int size = listP.size();
                            int i11 = 0;
                            while (i11 < size) {
                                boolean zBooleanValue = ((Boolean) listP.get(i11)).booleanValue();
                                boolean zA = composer.a(zBooleanValue);
                                Object objB = composer.B();
                                if (zA || objB == Composer.INSTANCE.a()) {
                                    objB = c17698g.I(zBooleanValue);
                                    composer.t(objB);
                                }
                                P p10 = (P) objB;
                                boolean zA2 = composer.a(zBooleanValue);
                                Object objB2 = composer.B();
                                if (zA2 || objB2 == Composer.INSTANCE.a()) {
                                    objB2 = zBooleanValue ? new b(c17698g) : new c(c17698g);
                                    composer.t(objB2);
                                }
                                Function0 function0 = (Function0) objB2;
                                F1.i direction = zBooleanValue ? selectionD.getStart().getDirection() : selectionD.getEnd().getDirection();
                                float fG = zBooleanValue ? c17698g.G() : c17698g.w();
                                int i12 = i11;
                                h hVar = new h(function0);
                                boolean handlesCrossed = selectionD.getHandlesCrossed();
                                Modifier.Companion companion = Modifier.INSTANCE;
                                boolean zD = composer.D(p10);
                                Object objB3 = composer.B();
                                if (zD || objB3 == Composer.INSTANCE.a()) {
                                    objB3 = new C2623a(p10);
                                    composer.t(objB3);
                                }
                                C17715a.b(hVar, zBooleanValue, direction, handlesCrossed, 0L, fG, U.c(companion, p10, (PointerInputEventHandler) objB3), composer, 0, 16);
                                i11 = i12 + 1;
                            }
                            composer.P();
                        }
                        composer.P();
                        composer.P();
                    } else {
                        composer.startReplaceGroup(-879541497);
                        composer.P();
                    }
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(C17703L c17703l, Function2<? super Composer, ? super Integer, Unit> function2, C17698G c17698g) {
                super(2);
                this.f165585f = c17703l;
                this.f165586g = function2;
                this.f165587h = c17698g;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(577209674, i10, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous> (SelectionContainer.kt:119)");
                }
                r.a(C17704M.a().d(this.f165585f), ComposableLambdaKt.c(-272381430, true, new C2622a(this.f165586g, this.f165587h), composer, 54), composer, G0.f49976i | 48);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(C17698G c17698g, C17703L c17703l, Function2<? super Composer, ? super Integer, Unit> function2) {
            super(2);
            this.f165582f = c17698g;
            this.f165583g = c17703l;
            this.f165584h = function2;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1869667463, i10, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous> (SelectionContainer.kt:118)");
            }
            C17698G c17698g = this.f165582f;
            C5678j.a(c17698g, ComposableLambdaKt.c(577209674, true, new a(this.f165583g, this.f165584h, c17698g), composer, 54), composer, 48);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "a", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: w0.x$e */
    static final class e extends Lambda implements Function1<F, androidx.compose.runtime.E> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17698G f165593f;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"w0/x$e$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: w0.x$e$a */
        public static final class a implements androidx.compose.runtime.E {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C17698G f165594a;

            public a(C17698G c17698g) {
                this.f165594a = c17698g;
            }

            @Override // androidx.compose.runtime.E
            public void dispose() {
                this.f165594a.P();
                this.f165594a.b0(false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C17698G c17698g) {
            super(1);
            this.f165593f = c17698g;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.E invoke(F f10) {
            return new a(this.f165593f);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w0.x$f */
    static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f165595f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Selection f165596g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<Selection, Unit> f165597h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f165598i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f165599j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f165600k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Modifier modifier, Selection selection, Function1<? super Selection, Unit> function1, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f165595f = modifier;
            this.f165596g = selection;
            this.f165597h = function1;
            this.f165598i = function2;
            this.f165599j = i10;
            this.f165600k = i11;
        }

        public final void a(Composer composer, int i10) {
            C17738x.b(this.f165595f, this.f165596g, this.f165597h, this.f165598i, composer, J0.a(this.f165599j | 1), this.f165600k);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lw0/L;", "c", "()Lw0/L;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w0.x$g */
    static final class g extends Lambda implements Function0<C17703L> {

        /* renamed from: f, reason: collision with root package name */
        public static final g f165601f = new g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C17703L invoke() {
            return new C17703L();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w0.x$h */
    static final class h implements InterfaceC17727m, FunctionAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function0 f165602a;

        @Override // kotlin.InterfaceC17727m
        public final /* synthetic */ long a() {
            return ((U0.f) this.f165602a.invoke()).getPackedValue();
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC17727m) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.f165602a;
        }

        h(Function0 function0) {
            this.f165602a = function0;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public static final void b(Modifier modifier, Selection selection, Function1<? super Selection, Unit> function1, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10, int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(2078139907);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.V(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(selection) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.D(function1) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(function2) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if (composerStartRestartGroup.p((i12 & 1171) != 1170, i12 & 1)) {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2078139907, i12, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:89)");
            }
            C17703L c17703l = (C17703L) L0.c.c(new Object[0], C17703L.INSTANCE.a(), null, g.f165601f, composerStartRestartGroup, 3072, 4);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new C17698G(c17703l);
                composerStartRestartGroup.t(objB);
            }
            C17698G c17698g = (C17698G) objB;
            InterfaceC5884q0 interfaceC5884q0 = (InterfaceC5884q0) composerStartRestartGroup.o(C5892t0.d());
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = androidx.compose.runtime.J.k(EmptyCoroutineContext.f142646a, composerStartRestartGroup);
                composerStartRestartGroup.t(objB2);
            }
            InterfaceC16622O interfaceC16622O = (InterfaceC16622O) objB2;
            c17698g.a0((InterfaceC6344a) composerStartRestartGroup.o(C5892t0.k()));
            boolean zV = composerStartRestartGroup.V(interfaceC16622O) | composerStartRestartGroup.V(interfaceC5884q0);
            Object objB3 = composerStartRestartGroup.B();
            if (zV || objB3 == companion.a()) {
                objB3 = new c(interfaceC16622O, interfaceC5884q0);
                composerStartRestartGroup.t(objB3);
            }
            c17698g.d0((Function1) objB3);
            c17698g.i0((H1) composerStartRestartGroup.o(C5892t0.r()));
            c17698g.e0(function1);
            c17698g.f0(selection);
            C17705N.a(modifier.then(c17698g.A()), ComposableLambdaKt.c(-1869667463, true, new d(c17698g, c17703l, function2), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 0);
            boolean zD = composerStartRestartGroup.D(c17698g);
            Object objB4 = composerStartRestartGroup.B();
            if (zD || objB4 == companion.a()) {
                objB4 = new e(c17698g);
                composerStartRestartGroup.t(objB4);
            }
            androidx.compose.runtime.J.c(c17698g, (Function1) objB4, composerStartRestartGroup, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        Modifier modifier2 = modifier;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new f(modifier2, selection, function1, function2, i10, i11));
        }
    }

    public static final void a(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        boolean z10;
        Function2<? super Composer, ? super Integer, Unit> function22;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1075498320);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(function2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (composerStartRestartGroup.p(z10, i12 & 1)) {
            if (i15 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1075498320, i12, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:52)");
            }
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = t1.e(null, null, 2, null);
                composerStartRestartGroup.t(objB);
            }
            InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
            int i16 = i12;
            Selection selectionC = c(interfaceC5730l0);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = new a(interfaceC5730l0);
                composerStartRestartGroup.t(objB2);
            }
            int i17 = (i16 & 14) | 384 | ((i16 << 6) & 7168);
            Modifier modifier2 = modifier;
            function22 = function2;
            b(modifier2, selectionC, (Function1) objB2, function22, composerStartRestartGroup, i17, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier = modifier2;
        } else {
            function22 = function2;
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new b(modifier, function22, i10, i11));
        }
    }

    private static final Selection c(InterfaceC5730l0<Selection> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC5730l0<Selection> interfaceC5730l0, Selection selection) {
        interfaceC5730l0.setValue(selection);
    }
}
