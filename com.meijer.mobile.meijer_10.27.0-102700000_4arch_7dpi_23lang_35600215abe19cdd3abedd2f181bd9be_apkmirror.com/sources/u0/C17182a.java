package u0;

import V0.C5331k1;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.InterfaceC5849e1;
import androidx.compose.ui.text.input.ImeOptions;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C0;
import qv.C16623P;
import qv.C16648k;
import qv.InterfaceC16622O;
import s0.C16844b;
import sv.EnumC17050a;
import tv.C17146H;
import tv.InterfaceC17139A;
import tv.InterfaceC17153g;
import u0.q0;
import u1.TextLayoutResult;
import z1.InterfaceC18354E;
import z1.InterfaceC18363i;
import z1.TextFieldValue;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJM\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J!\u0010\u0019\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJK\u0010(\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u001bH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010\u0003R\u0018\u0010-\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00102R\u001c\u00106\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lu0/a;", "Lu0/q0;", "<init>", "()V", "Lkotlin/Function1;", "Lu0/s0;", "", "initializeRequest", "q", "(Lkotlin/jvm/functions/Function1;)V", "Lz1/M;", "value", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "", "Lz1/i;", "onEditCommand", "Landroidx/compose/ui/text/input/a;", "onImeActionPerformed", "d", "(Lz1/M;Landroidx/compose/ui/text/input/ImeOptions;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "a", "b", "oldValue", "newValue", "e", "(Lz1/M;Lz1/M;)V", "Landroidx/compose/ui/geometry/Rect;", "rect", "h", "(Landroidx/compose/ui/geometry/Rect;)V", "textFieldValue", "Lz1/E;", "offsetMapping", "Lu1/v;", "textLayoutResult", "LV0/k1;", "textFieldToRootTransform", "innerTextFieldBounds", "decorationBoxBounds", "g", "(Lz1/M;Lz1/E;Lu1/v;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)V", "k", "Lqv/C0;", "Lqv/C0;", "job", "c", "Lu0/s0;", "currentRequest", "Ltv/A;", "Ltv/A;", "backingStylusHandwritingTrigger", "p", "()Ltv/A;", "stylusHandwritingTrigger", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17182a extends q0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private C0 job;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private s0 currentRequest;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private InterfaceC17139A<Unit> backingStylusHandwritingTrigger;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu0/s0;", "it", "", "a", "(Lu0/s0;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: u0.a$a, reason: collision with other inner class name */
    static final class C2559a extends Lambda implements Function1<s0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f162464f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C17182a f162465g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ImeOptions f162466h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<List<? extends InterfaceC18363i>, Unit> f162467i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.ui.text.input.a, Unit> f162468j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2559a(TextFieldValue textFieldValue, C17182a c17182a, ImeOptions imeOptions, Function1<? super List<? extends InterfaceC18363i>, Unit> function1, Function1<? super androidx.compose.ui.text.input.a, Unit> function12) {
            super(1);
            this.f162464f = textFieldValue;
            this.f162465g = c17182a;
            this.f162466h = imeOptions;
            this.f162467i = function1;
            this.f162468j = function12;
        }

        public final void a(s0 s0Var) {
            s0Var.l(this.f162464f, this.f162465g.getTextInputModifierNode(), this.f162466h, this.f162467i, this.f162468j);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(s0 s0Var) {
            a(s0Var);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/e1;", "", "<anonymous>", "(Landroidx/compose/ui/platform/e1;)Ljava/lang/Void;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {125}, m = "invokeSuspend")
    /* renamed from: u0.a$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC5849e1, Continuation<?>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f162469a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f162470b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<s0, Unit> f162471c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C17182a f162472d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ q0.a f162473e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)Ljava/lang/Void;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {149}, m = "invokeSuspend")
        /* renamed from: u0.a$b$a, reason: collision with other inner class name */
        static final class C2560a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<?>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f162474a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f162475b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5849e1 f162476c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<s0, Unit> f162477d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C17182a f162478e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ q0.a f162479f;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {140, 141}, m = "invokeSuspend")
            /* renamed from: u0.a$b$a$a, reason: collision with other inner class name */
            static final class C2561a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f162480a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17182a f162481b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ l0 f162482c;

                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
                /* renamed from: u0.a$b$a$a$a, reason: collision with other inner class name */
                static final class C2562a extends Lambda implements Function1<Long, Unit> {

                    /* renamed from: f, reason: collision with root package name */
                    public static final C2562a f162483f = new C2562a();

                    C2562a() {
                        super(1);
                    }

                    public final void a(long j10) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
                        a(l10.longValue());
                        return Unit.f142422a;
                    }
                }

                @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
                /* renamed from: u0.a$b$a$a$b, reason: collision with other inner class name */
                static final class C2563b<T> implements InterfaceC17153g {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ l0 f162484a;

                    C2563b(l0 l0Var) {
                        this.f162484a = l0Var;
                    }

                    @Override // tv.InterfaceC17153g
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
                        this.f162484a.f();
                        return Unit.f142422a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2561a(C17182a c17182a, l0 l0Var, Continuation<? super C2561a> continuation) {
                    super(2, continuation);
                    this.f162481b = c17182a;
                    this.f162482c = l0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C2561a(this.f162481b, this.f162482c, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((C2561a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
                
                    if (r5.collect(r1, r4) == r0) goto L17;
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
                        int r1 = r4.f162480a
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L1e
                        if (r1 == r3) goto L1a
                        if (r1 == r2) goto L16
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r0)
                        throw r5
                    L16:
                        kotlin.ResultKt.b(r5)
                        goto L44
                    L1a:
                        kotlin.ResultKt.b(r5)
                        goto L2c
                    L1e:
                        kotlin.ResultKt.b(r5)
                        u0.a$b$a$a$a r5 = u0.C17182a.b.C2560a.C2561a.C2562a.f162483f
                        r4.f162480a = r3
                        java.lang.Object r5 = androidx.compose.runtime.C5712d0.b(r5, r4)
                        if (r5 != r0) goto L2c
                        goto L43
                    L2c:
                        u0.a r5 = r4.f162481b
                        tv.A r5 = u0.C17182a.m(r5)
                        if (r5 == 0) goto L4a
                        u0.a$b$a$a$b r1 = new u0.a$b$a$a$b
                        u0.l0 r3 = r4.f162482c
                        r1.<init>(r3)
                        r4.f162480a = r2
                        java.lang.Object r5 = r5.collect(r1, r4)
                        if (r5 != r0) goto L44
                    L43:
                        return r0
                    L44:
                        kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
                        r5.<init>()
                        throw r5
                    L4a:
                        kotlin.Unit r5 = kotlin.Unit.f142422a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: u0.C17182a.b.C2560a.C2561a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: u0.a$b$a$b, reason: collision with other inner class name */
            /* synthetic */ class C2564b extends FunctionReferenceImpl implements Function1<C5331k1, Unit> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ q0.a f162485b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2564b(q0.a aVar) {
                    super(1, Intrinsics.Kotlin.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
                    this.f162485b = aVar;
                }

                public final void a(float[] fArr) {
                    C17182a.r(this.f162485b, fArr);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C5331k1 c5331k1) {
                    a(c5331k1.getValues());
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2560a(InterfaceC5849e1 interfaceC5849e1, Function1<? super s0, Unit> function1, C17182a c17182a, q0.a aVar, Continuation<? super C2560a> continuation) {
                super(2, continuation);
                this.f162476c = interfaceC5849e1;
                this.f162477d = function1;
                this.f162478e = c17182a;
                this.f162479f = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C2560a c2560a = new C2560a(this.f162476c, this.f162477d, this.f162478e, this.f162479f, continuation);
                c2560a.f162475b = obj;
                return c2560a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<?> continuation) {
                return ((C2560a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f162474a;
                try {
                    if (i10 != 0) {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj);
                    } else {
                        ResultKt.b(obj);
                        InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f162475b;
                        l0 l0VarInvoke = r0.c().invoke(this.f162476c.getView());
                        s0 s0Var = new s0(this.f162476c.getView(), new C2564b(this.f162479f), l0VarInvoke);
                        if (C16844b.a()) {
                            C16648k.d(interfaceC16622O, null, null, new C2561a(this.f162478e, l0VarInvoke, null), 3, null);
                        }
                        Function1<s0, Unit> function1 = this.f162477d;
                        if (function1 != null) {
                            function1.invoke(s0Var);
                        }
                        this.f162478e.currentRequest = s0Var;
                        InterfaceC5849e1 interfaceC5849e1 = this.f162476c;
                        this.f162474a = 1;
                        if (interfaceC5849e1.a(s0Var, this) == objF) {
                            return objF;
                        }
                    }
                    throw new KotlinNothingValueException();
                } catch (Throwable th2) {
                    this.f162478e.currentRequest = null;
                    throw th2;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super s0, Unit> function1, C17182a c17182a, q0.a aVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f162471c = function1;
            this.f162472d = c17182a;
            this.f162473e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f162471c, this.f162472d, this.f162473e, continuation);
            bVar.f162470b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5849e1 interfaceC5849e1, Continuation<?> continuation) {
            return ((b) create(interfaceC5849e1, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f162469a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                C2560a c2560a = new C2560a((InterfaceC5849e1) this.f162470b, this.f162471c, this.f162472d, this.f162473e, null);
                this.f162469a = 1;
                if (C16623P.g(c2560a, this) == objF) {
                    return objF;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    @Override // z1.I
    public void a() {
        q(null);
    }

    @Override // z1.I
    public void g(TextFieldValue textFieldValue, InterfaceC18354E offsetMapping, TextLayoutResult textLayoutResult, Function1<? super C5331k1, Unit> textFieldToRootTransform, Rect innerTextFieldBounds, Rect decorationBoxBounds) {
        s0 s0Var = this.currentRequest;
        if (s0Var != null) {
            s0Var.n(textFieldValue, offsetMapping, textLayoutResult, innerTextFieldBounds, decorationBoxBounds);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC17139A<Unit> p() {
        InterfaceC17139A<Unit> interfaceC17139A = this.backingStylusHandwritingTrigger;
        if (interfaceC17139A != null) {
            return interfaceC17139A;
        }
        if (!C16844b.a()) {
            return null;
        }
        InterfaceC17139A<Unit> interfaceC17139AB = C17146H.b(1, 0, EnumC17050a.f161242c, 2, null);
        this.backingStylusHandwritingTrigger = interfaceC17139AB;
        return interfaceC17139AB;
    }

    @Override // z1.I
    public void b() {
        C0 c02 = this.job;
        if (c02 != null) {
            C0.a.a(c02, null, 1, null);
        }
        this.job = null;
        InterfaceC17139A<Unit> interfaceC17139AP = p();
        if (interfaceC17139AP != null) {
            interfaceC17139AP.f();
        }
    }

    @Override // z1.I
    public void d(TextFieldValue value, ImeOptions imeOptions, Function1<? super List<? extends InterfaceC18363i>, Unit> onEditCommand, Function1<? super androidx.compose.ui.text.input.a, Unit> onImeActionPerformed) {
        q(new C2559a(value, this, imeOptions, onEditCommand, onImeActionPerformed));
    }

    @Override // z1.I
    public void e(TextFieldValue oldValue, TextFieldValue newValue) {
        s0 s0Var = this.currentRequest;
        if (s0Var != null) {
            s0Var.m(oldValue, newValue);
        }
    }

    @Override // z1.I
    public void h(Rect rect) {
        s0 s0Var = this.currentRequest;
        if (s0Var != null) {
            s0Var.j(rect);
        }
    }

    private final void q(Function1<? super s0, Unit> initializeRequest) {
        q0.a textInputModifierNode = getTextInputModifierNode();
        if (textInputModifierNode == null) {
            return;
        }
        this.job = textInputModifierNode.h1(new b(initializeRequest, this, textInputModifierNode, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(q0.a aVar, float[] fArr) {
        LayoutCoordinates layoutCoordinatesB = aVar.B();
        if (layoutCoordinatesB != null) {
            if (!layoutCoordinatesB.isAttached()) {
                layoutCoordinatesB = null;
            }
            if (layoutCoordinatesB != null) {
                layoutCoordinatesB.a0(fArr);
            }
        }
    }

    @Override // u0.q0
    public void k() {
        InterfaceC17139A<Unit> interfaceC17139AP = p();
        if (interfaceC17139AP != null) {
            interfaceC17139AP.b(Unit.f142422a);
        }
    }
}
