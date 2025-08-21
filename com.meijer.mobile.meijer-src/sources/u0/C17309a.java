package u0;

import V0.C5474k1;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.InterfaceC5991e1;
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
import mv.C0;
import mv.C15784P;
import mv.C15809k;
import mv.InterfaceC15783O;
import ov.EnumC16325a;
import pv.C16555H;
import pv.InterfaceC16548A;
import pv.InterfaceC16562g;
import s0.C16990b;
import u0.q0;
import u1.TextLayoutResult;
import z1.InterfaceC18417E;
import z1.InterfaceC18426i;
import z1.TextFieldValue;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJM\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J!\u0010\u0019\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJK\u0010(\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u001bH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010\u0003R\u0018\u0010-\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00102R\u001c\u00106\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lu0/a;", "Lu0/q0;", "<init>", "()V", "Lkotlin/Function1;", "Lu0/s0;", "", "initializeRequest", "q", "(Lkotlin/jvm/functions/Function1;)V", "Lz1/M;", "value", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "", "Lz1/i;", "onEditCommand", "Landroidx/compose/ui/text/input/a;", "onImeActionPerformed", "d", "(Lz1/M;Landroidx/compose/ui/text/input/ImeOptions;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "a", "b", "oldValue", "newValue", "e", "(Lz1/M;Lz1/M;)V", "Landroidx/compose/ui/geometry/Rect;", "rect", "h", "(Landroidx/compose/ui/geometry/Rect;)V", "textFieldValue", "Lz1/E;", "offsetMapping", "Lu1/v;", "textLayoutResult", "LV0/k1;", "textFieldToRootTransform", "innerTextFieldBounds", "decorationBoxBounds", "g", "(Lz1/M;Lz1/E;Lu1/v;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)V", "k", "Lmv/C0;", "Lmv/C0;", "job", "c", "Lu0/s0;", "currentRequest", "Lpv/A;", "Lpv/A;", "backingStylusHandwritingTrigger", "p", "()Lpv/A;", "stylusHandwritingTrigger", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17309a extends q0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private C0 job;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private s0 currentRequest;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private InterfaceC16548A<Unit> backingStylusHandwritingTrigger;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu0/s0;", "it", "", "a", "(Lu0/s0;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: u0.a$a, reason: collision with other inner class name */
    static final class C2583a extends Lambda implements Function1<s0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f163502f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C17309a f163503g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ImeOptions f163504h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<List<? extends InterfaceC18426i>, Unit> f163505i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.ui.text.input.a, Unit> f163506j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2583a(TextFieldValue textFieldValue, C17309a c17309a, ImeOptions imeOptions, Function1<? super List<? extends InterfaceC18426i>, Unit> function1, Function1<? super androidx.compose.ui.text.input.a, Unit> function12) {
            super(1);
            this.f163502f = textFieldValue;
            this.f163503g = c17309a;
            this.f163504h = imeOptions;
            this.f163505i = function1;
            this.f163506j = function12;
        }

        public final void a(s0 s0Var) {
            s0Var.l(this.f163502f, this.f163503g.getTextInputModifierNode(), this.f163504h, this.f163505i, this.f163506j);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(s0 s0Var) {
            a(s0Var);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/e1;", "", "<anonymous>", "(Landroidx/compose/ui/platform/e1;)Ljava/lang/Void;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {125}, m = "invokeSuspend")
    /* renamed from: u0.a$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC5991e1, Continuation<?>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f163507a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f163508b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<s0, Unit> f163509c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C17309a f163510d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ q0.a f163511e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)Ljava/lang/Void;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {149}, m = "invokeSuspend")
        /* renamed from: u0.a$b$a, reason: collision with other inner class name */
        static final class C2584a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<?>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f163512a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f163513b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5991e1 f163514c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<s0, Unit> f163515d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C17309a f163516e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ q0.a f163517f;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {140, 141}, m = "invokeSuspend")
            /* renamed from: u0.a$b$a$a, reason: collision with other inner class name */
            static final class C2585a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f163518a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17309a f163519b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ l0 f163520c;

                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
                /* renamed from: u0.a$b$a$a$a, reason: collision with other inner class name */
                static final class C2586a extends Lambda implements Function1<Long, Unit> {

                    /* renamed from: f, reason: collision with root package name */
                    public static final C2586a f163521f = new C2586a();

                    C2586a() {
                        super(1);
                    }

                    public final void a(long j10) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
                        a(l10.longValue());
                        return Unit.f143329a;
                    }
                }

                @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
                /* renamed from: u0.a$b$a$a$b, reason: collision with other inner class name */
                static final class C2587b<T> implements InterfaceC16562g {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ l0 f163522a;

                    C2587b(l0 l0Var) {
                        this.f163522a = l0Var;
                    }

                    @Override // pv.InterfaceC16562g
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
                        this.f163522a.f();
                        return Unit.f143329a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2585a(C17309a c17309a, l0 l0Var, Continuation<? super C2585a> continuation) {
                    super(2, continuation);
                    this.f163519b = c17309a;
                    this.f163520c = l0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C2585a(this.f163519b, this.f163520c, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((C2585a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                        int r1 = r4.f163518a
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
                        u0.a$b$a$a$a r5 = u0.C17309a.b.C2584a.C2585a.C2586a.f163521f
                        r4.f163518a = r3
                        java.lang.Object r5 = androidx.compose.runtime.C5854d0.b(r5, r4)
                        if (r5 != r0) goto L2c
                        goto L43
                    L2c:
                        u0.a r5 = r4.f163519b
                        pv.A r5 = u0.C17309a.m(r5)
                        if (r5 == 0) goto L4a
                        u0.a$b$a$a$b r1 = new u0.a$b$a$a$b
                        u0.l0 r3 = r4.f163520c
                        r1.<init>(r3)
                        r4.f163518a = r2
                        java.lang.Object r5 = r5.collect(r1, r4)
                        if (r5 != r0) goto L44
                    L43:
                        return r0
                    L44:
                        kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
                        r5.<init>()
                        throw r5
                    L4a:
                        kotlin.Unit r5 = kotlin.Unit.f143329a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: u0.C17309a.b.C2584a.C2585a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: u0.a$b$a$b, reason: collision with other inner class name */
            /* synthetic */ class C2588b extends FunctionReferenceImpl implements Function1<C5474k1, Unit> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ q0.a f163523b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2588b(q0.a aVar) {
                    super(1, Intrinsics.Kotlin.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
                    this.f163523b = aVar;
                }

                public final void a(float[] fArr) {
                    C17309a.r(this.f163523b, fArr);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C5474k1 c5474k1) {
                    a(c5474k1.getValues());
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2584a(InterfaceC5991e1 interfaceC5991e1, Function1<? super s0, Unit> function1, C17309a c17309a, q0.a aVar, Continuation<? super C2584a> continuation) {
                super(2, continuation);
                this.f163514c = interfaceC5991e1;
                this.f163515d = function1;
                this.f163516e = c17309a;
                this.f163517f = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C2584a c2584a = new C2584a(this.f163514c, this.f163515d, this.f163516e, this.f163517f, continuation);
                c2584a.f163513b = obj;
                return c2584a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<?> continuation) {
                return ((C2584a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f163512a;
                try {
                    if (i10 != 0) {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj);
                    } else {
                        ResultKt.b(obj);
                        InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f163513b;
                        l0 l0VarInvoke = r0.c().invoke(this.f163514c.getView());
                        s0 s0Var = new s0(this.f163514c.getView(), new C2588b(this.f163517f), l0VarInvoke);
                        if (C16990b.a()) {
                            C15809k.d(interfaceC15783O, null, null, new C2585a(this.f163516e, l0VarInvoke, null), 3, null);
                        }
                        Function1<s0, Unit> function1 = this.f163515d;
                        if (function1 != null) {
                            function1.invoke(s0Var);
                        }
                        this.f163516e.currentRequest = s0Var;
                        InterfaceC5991e1 interfaceC5991e1 = this.f163514c;
                        this.f163512a = 1;
                        if (interfaceC5991e1.a(s0Var, this) == objF) {
                            return objF;
                        }
                    }
                    throw new KotlinNothingValueException();
                } catch (Throwable th2) {
                    this.f163516e.currentRequest = null;
                    throw th2;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super s0, Unit> function1, C17309a c17309a, q0.a aVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f163509c = function1;
            this.f163510d = c17309a;
            this.f163511e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f163509c, this.f163510d, this.f163511e, continuation);
            bVar.f163508b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5991e1 interfaceC5991e1, Continuation<?> continuation) {
            return ((b) create(interfaceC5991e1, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f163507a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                C2584a c2584a = new C2584a((InterfaceC5991e1) this.f163508b, this.f163509c, this.f163510d, this.f163511e, null);
                this.f163507a = 1;
                if (C15784P.g(c2584a, this) == objF) {
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
    public void g(TextFieldValue textFieldValue, InterfaceC18417E offsetMapping, TextLayoutResult textLayoutResult, Function1<? super C5474k1, Unit> textFieldToRootTransform, Rect innerTextFieldBounds, Rect decorationBoxBounds) {
        s0 s0Var = this.currentRequest;
        if (s0Var != null) {
            s0Var.n(textFieldValue, offsetMapping, textLayoutResult, innerTextFieldBounds, decorationBoxBounds);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC16548A<Unit> p() {
        InterfaceC16548A<Unit> interfaceC16548A = this.backingStylusHandwritingTrigger;
        if (interfaceC16548A != null) {
            return interfaceC16548A;
        }
        if (!C16990b.a()) {
            return null;
        }
        InterfaceC16548A<Unit> interfaceC16548AB = C16555H.b(1, 0, EnumC16325a.f155826c, 2, null);
        this.backingStylusHandwritingTrigger = interfaceC16548AB;
        return interfaceC16548AB;
    }

    @Override // z1.I
    public void b() {
        C0 c02 = this.job;
        if (c02 != null) {
            C0.a.a(c02, null, 1, null);
        }
        this.job = null;
        InterfaceC16548A<Unit> interfaceC16548AP = p();
        if (interfaceC16548AP != null) {
            interfaceC16548AP.f();
        }
    }

    @Override // z1.I
    public void d(TextFieldValue value, ImeOptions imeOptions, Function1<? super List<? extends InterfaceC18426i>, Unit> onEditCommand, Function1<? super androidx.compose.ui.text.input.a, Unit> onImeActionPerformed) {
        q(new C2583a(value, this, imeOptions, onEditCommand, onImeActionPerformed));
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
        InterfaceC16548A<Unit> interfaceC16548AP = p();
        if (interfaceC16548AP != null) {
            interfaceC16548AP.b(Unit.f143329a);
        }
    }
}
