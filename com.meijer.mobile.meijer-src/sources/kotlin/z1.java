package kotlin;

import H1.o;
import M0.SnapshotStateList;
import P0.e;
import V0.C5489q0;
import V0.F1;
import androidx.compose.foundation.layout.A;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.o1;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import d0.C13576j;
import h0.C14434a;
import h0.C14435b;
import h0.C14436c;
import h0.n;
import j0.C14890K;
import j0.InterfaceC14898b;
import kotlin.Metadata;
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
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.n0;
import kotlin.t;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import r0.C16806i;

@Metadata(d1 = {"\u0000X\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000f\u001aW\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aA\u0010\u0013\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\t\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a.\u0010\u001a\u001a\u00020\u0003*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u001a\u0010 \u001a\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u001a\u0010#\u001a\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001f\"\u001a\u0010&\u001a\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001f\"\u0014\u0010(\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001d\"\u0014\u0010*\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001d\"\u0014\u0010+\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001d\"\u0014\u0010-\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u001d\"\u0014\u0010/\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u001d\"\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0010008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102\"\u0014\u00105\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u001d\"\u0014\u00107\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u001d\"\u0014\u00109\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006?²\u0006\u000e\u0010:\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u001a\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010<\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002²\u0006\f\u0010=\u001a\u00020\u00168\nX\u008a\u0084\u0002²\u0006\f\u0010>\u001a\u00020\u00168\nX\u008a\u0084\u0002"}, d2 = {"", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Lh0/l;", "interactionSource", "Lx0/x1;", "colors", "a", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLh0/l;Lx0/x1;Landroidx/compose/runtime/Composer;II)V", "Lj0/b;", "Lkotlin/Function0;", "", "thumbValue", "Lh0/j;", "f", "(Lj0/b;ZZLx0/x1;Lkotlin/jvm/functions/Function0;Lh0/j;Landroidx/compose/runtime/Composer;I)V", "LX0/f;", "LV0/q0;", "trackColor", "trackWidth", "strokeWidth", "q", "(LX0/f;JFF)V", "LH1/h;", "F", "s", "()F", "TrackWidth", "b", "r", "TrackStrokeWidth", "c", "getThumbDiameter", "ThumbDiameter", "d", "ThumbRippleRadius", "e", "DefaultSwitchPadding", "SwitchWidth", "g", "SwitchHeight", "h", "ThumbPathLength", "Lc0/n0;", "i", "Lc0/n0;", "AnimationSpec", "j", "ThumbDefaultElevation", "k", "ThumbPressedElevation", "l", "SwitchVelocityThreshold", "forceAnimationCheck", "currentOnCheckedChange", "currentChecked", "thumbColor", "resolvedThumbColor", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f169993a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f169994b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f169995c;

    /* renamed from: d, reason: collision with root package name */
    private static final float f169996d;

    /* renamed from: e, reason: collision with root package name */
    private static final float f169997e;

    /* renamed from: f, reason: collision with root package name */
    private static final float f169998f;

    /* renamed from: g, reason: collision with root package name */
    private static final float f169999g;

    /* renamed from: h, reason: collision with root package name */
    private static final float f170000h;

    /* renamed from: i, reason: collision with root package name */
    private static final n0<Float> f170001i;

    /* renamed from: j, reason: collision with root package name */
    private static final float f170002j;

    /* renamed from: k, reason: collision with root package name */
    private static final float f170003k;

    /* renamed from: l, reason: collision with root package name */
    private static final float f170004l;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.SwitchKt$Switch$1$1", f = "Switch.kt", l = {130}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f170005a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C17997e<Boolean> f170006b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.z1<Boolean> f170007c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.z1<Function1<Boolean, Unit>> f170008d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f170009e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.z1$a$a, reason: collision with other inner class name */
        static final class C2726a extends Lambda implements Function0<Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C17997e<Boolean> f170010f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2726a(C17997e<Boolean> c17997e) {
                super(0);
                this.f170010f = c17997e;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return this.f170010f.s();
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "newValue", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material.SwitchKt$Switch$1$1$2", f = "Switch.kt", l = {}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f170011a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ boolean f170012b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.z1<Boolean> f170013c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.z1<Function1<Boolean, Unit>> f170014d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f170015e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(androidx.compose.runtime.z1<Boolean> z1Var, androidx.compose.runtime.z1<? extends Function1<? super Boolean, Unit>> z1Var2, InterfaceC5872l0<Boolean> interfaceC5872l0, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f170013c = z1Var;
                this.f170014d = z1Var2;
                this.f170015e = interfaceC5872l0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                b bVar = new b(this.f170013c, this.f170014d, this.f170015e, continuation);
                bVar.f170012b = ((Boolean) obj).booleanValue();
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return d(bool.booleanValue(), continuation);
            }

            public final Object d(boolean z10, Continuation<? super Unit> continuation) {
                return ((b) create(Boolean.valueOf(z10), continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f170011a == 0) {
                    ResultKt.b(obj);
                    boolean z10 = this.f170012b;
                    if (z1.e(this.f170013c) != z10) {
                        Function1 function1D = z1.d(this.f170014d);
                        if (function1D != null) {
                            function1D.invoke(Boxing.a(z10));
                        }
                        z1.c(this.f170015e, !z1.b(r2));
                    }
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(C17997e<Boolean> c17997e, androidx.compose.runtime.z1<Boolean> z1Var, androidx.compose.runtime.z1<? extends Function1<? super Boolean, Unit>> z1Var2, InterfaceC5872l0<Boolean> interfaceC5872l0, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f170006b = c17997e;
            this.f170007c = z1Var;
            this.f170008d = z1Var2;
            this.f170009e = interfaceC5872l0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f170006b, this.f170007c, this.f170008d, this.f170009e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f170005a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16561f interfaceC16561fQ = o1.q(new C2726a(this.f170006b));
                b bVar = new b(this.f170007c, this.f170008d, this.f170009e, null);
                this.f170005a = 1;
                if (C16563h.k(interfaceC16561fQ, bVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.SwitchKt$Switch$2$1", f = "Switch.kt", l = {139}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f170016a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f170017b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C17997e<Boolean> f170018c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, C17997e<Boolean> c17997e, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f170017b = z10;
            this.f170018c = c17997e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f170017b, this.f170018c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f170016a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                if (this.f170017b != this.f170018c.s().booleanValue()) {
                    C17997e<Boolean> c17997e = this.f170018c;
                    Boolean boolA = Boxing.a(this.f170017b);
                    this.f170016a = 1;
                    if (androidx.compose.material.a.g(c17997e, boolA, 0.0f, this, 2, null) == objF) {
                        return objF;
                    }
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function0<Float> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17997e<Boolean> f170019f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C17997e<Boolean> c17997e) {
            super(0);
            this.f170019f = c17997e;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(this.f170019f.A());
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f170020f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f170021g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f170022h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f170023i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ h0.l f170024j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ x1 f170025k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f170026l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f170027m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(boolean z10, Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z11, h0.l lVar, x1 x1Var, int i10, int i11) {
            super(2);
            this.f170020f = z10;
            this.f170021g = function1;
            this.f170022h = modifier;
            this.f170023i = z11;
            this.f170024j = lVar;
            this.f170025k = x1Var;
            this.f170026l = i10;
            this.f170027m = i11;
        }

        public final void a(Composer composer, int i10) {
            z1.a(this.f170020f, this.f170021g, this.f170022h, this.f170023i, this.f170024j, this.f170025k, composer, J0.a(this.f170026l | 1), this.f170027m);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx0/b0;", "", "", "a", "(Lx0/b0;)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends Lambda implements Function1<C17989b0<Boolean>, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f170028f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f170029g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(float f10, float f11) {
            super(1);
            this.f170028f = f10;
            this.f170029g = f11;
        }

        public final void a(C17989b0<Boolean> c17989b0) {
            c17989b0.a(Boolean.FALSE, this.f170028f);
            c17989b0.a(Boolean.TRUE, this.f170029g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C17989b0<Boolean> c17989b0) {
            a(c17989b0);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "distance", "b", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    static final class f extends Lambda implements Function1<Float, Float> {

        /* renamed from: f, reason: collision with root package name */
        public static final f f170030f = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
            return b(f10.floatValue());
        }

        public final Float b(float f10) {
            return Float.valueOf(f10 * 0.7f);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    static final class g extends Lambda implements Function0<Float> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f170031f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(float f10) {
            super(0);
            this.f170031f = f10;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(this.f170031f);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.SwitchKt$SwitchImpl$1$1", f = "Switch.kt", l = {225}, m = "invokeSuspend")
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f170032a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0.j f170033b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<h0.i> f170034c;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh0/i;", "interaction", "", "a", "(Lh0/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SnapshotStateList<h0.i> f170035a;

            a(SnapshotStateList<h0.i> snapshotStateList) {
                this.f170035a = snapshotStateList;
            }

            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(h0.i iVar, Continuation<? super Unit> continuation) {
                if (iVar instanceof n.b) {
                    this.f170035a.add(iVar);
                } else if (iVar instanceof n.c) {
                    this.f170035a.remove(((n.c) iVar).getPress());
                } else if (iVar instanceof n.a) {
                    this.f170035a.remove(((n.a) iVar).getPress());
                } else if (iVar instanceof C14435b) {
                    this.f170035a.add(iVar);
                } else if (iVar instanceof C14436c) {
                    this.f170035a.remove(((C14436c) iVar).getStart());
                } else if (iVar instanceof C14434a) {
                    this.f170035a.remove(((C14434a) iVar).getStart());
                }
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(h0.j jVar, SnapshotStateList<h0.i> snapshotStateList, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f170033b = jVar;
            this.f170034c = snapshotStateList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new h(this.f170033b, this.f170034c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f170032a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16561f<h0.i> interfaceC16561fB = this.f170033b.b();
                a aVar = new a(this.f170034c);
                this.f170032a = 1;
                if (interfaceC16561fB.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/f;", "", "a", "(LX0/f;)V"}, k = 3, mv = {1, 9, 0})
    static final class i extends Lambda implements Function1<X0.f, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.z1<C5489q0> f170036f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(androidx.compose.runtime.z1<C5489q0> z1Var) {
            super(1);
            this.f170036f = z1Var;
        }

        public final void a(X0.f fVar) {
            z1.q(fVar, z1.g(this.f170036f), fVar.I1(z1.s()), fVar.I1(z1.r()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.f fVar) {
            a(fVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH1/d;", "LH1/n;", "a", "(LH1/d;)J"}, k = 3, mv = {1, 9, 0})
    static final class j extends Lambda implements Function1<H1.d, H1.n> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Float> f170037f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Function0<Float> function0) {
            super(1);
            this.f170037f = function0;
        }

        public final long a(H1.d dVar) {
            return o.a(MathKt.d(this.f170037f.invoke().floatValue()), 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ H1.n invoke(H1.d dVar) {
            return H1.n.c(a(dVar));
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class k extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC14898b f170038f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f170039g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f170040h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ x1 f170041i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0<Float> f170042j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ h0.j f170043k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f170044l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(InterfaceC14898b interfaceC14898b, boolean z10, boolean z11, x1 x1Var, Function0<Float> function0, h0.j jVar, int i10) {
            super(2);
            this.f170038f = interfaceC14898b;
            this.f170039g = z10;
            this.f170040h = z11;
            this.f170041i = x1Var;
            this.f170042j = function0;
            this.f170043k = jVar;
            this.f170044l = i10;
        }

        public final void a(Composer composer, int i10) {
            z1.f(this.f170038f, this.f170039g, this.f170040h, this.f170041i, this.f170042j, this.f170043k, composer, J0.a(this.f170044l | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(X0.f fVar, long j10, float f10, float f11) {
        float f12 = f11 / 2;
        X0.f.O0(fVar, j10, U0.g.a(f12, U0.f.n(fVar.Q1())), U0.g.a(f10 - f12, U0.f.n(fVar.Q1())), f11, F1.INSTANCE.b(), null, 0.0f, null, 0, 480, null);
    }

    static {
        float fP = H1.h.p(34);
        f169993a = fP;
        f169994b = H1.h.p(14);
        float fP2 = H1.h.p(20);
        f169995c = fP2;
        f169996d = H1.h.p(24);
        f169997e = H1.h.p(2);
        f169998f = fP;
        f169999g = fP2;
        f170000h = H1.h.p(fP - fP2);
        f170001i = new n0<>(100, 0, null, 6, null);
        f170002j = H1.h.p(1);
        f170003k = H1.h.p(6);
        f170004l = H1.h.p(125);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014e  */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r36, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r37, androidx.compose.ui.Modifier r38, boolean r39, h0.l r40, kotlin.x1 r41, androidx.compose.runtime.Composer r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.z1.a(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, h0.l, x0.x1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(InterfaceC14898b interfaceC14898b, boolean z10, boolean z11, x1 x1Var, Function0<Float> function0, h0.j jVar, Composer composer, int i10) {
        int i11;
        Modifier.Companion companion;
        boolean z12;
        long jH;
        Composer composerStartRestartGroup = composer.startRestartGroup(70908914);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.V(interfaceC14898b) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.a(z11) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.V(x1Var) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.D(function0) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.V(jVar) ? 131072 : 65536;
        }
        int i12 = i11;
        if (composerStartRestartGroup.p((74899 & i12) != 74898, i12 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(70908914, i12, -1, "androidx.compose.material.SwitchImpl (Switch.kt:220)");
            }
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = o1.f();
                composerStartRestartGroup.t(objB);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) objB;
            boolean z13 = (458752 & i12) == 131072;
            Object objB2 = composerStartRestartGroup.B();
            if (z13 || objB2 == companion2.a()) {
                objB2 = new h(jVar, snapshotStateList, null);
                composerStartRestartGroup.t(objB2);
            }
            J.g(jVar, (Function2) objB2, composerStartRestartGroup, (i12 >> 15) & 14);
            float f10 = !snapshotStateList.isEmpty() ? f170003k : f170002j;
            int i13 = ((i12 >> 6) & 14) | (i12 & 112) | ((i12 >> 3) & 896);
            androidx.compose.runtime.z1<C5489q0> z1VarA = x1Var.a(z11, z10, composerStartRestartGroup, i13);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            e.Companion companion4 = P0.e.INSTANCE;
            Modifier modifierF = androidx.compose.foundation.layout.J.f(interfaceC14898b.g(companion3, companion4.e()), 0.0f, 1, null);
            boolean zV = composerStartRestartGroup.V(z1VarA);
            Object objB3 = composerStartRestartGroup.B();
            if (zV || objB3 == companion2.a()) {
                objB3 = new i(z1VarA);
                composerStartRestartGroup.t(objB3);
            }
            C13576j.a(modifierF, (Function1) objB3, composerStartRestartGroup, 0);
            androidx.compose.runtime.z1<C5489q0> z1VarB = x1Var.b(z11, z10, composerStartRestartGroup, i13);
            InterfaceC18013j0 interfaceC18013j0 = (InterfaceC18013j0) composerStartRestartGroup.o(C18016k0.d());
            float fP = H1.h.p(((H1.h) composerStartRestartGroup.o(C18016k0.c())).getValue() + f10);
            if (!C5489q0.s(h(z1VarB), C17943E0.f167967a.a(composerStartRestartGroup, 6).n()) || interfaceC18013j0 == null) {
                companion = companion3;
                z12 = true;
                composerStartRestartGroup.startReplaceGroup(1478584670);
                composerStartRestartGroup.P();
                jH = h(z1VarB);
            } else {
                composerStartRestartGroup.startReplaceGroup(1478495731);
                companion = companion3;
                z12 = true;
                jH = interfaceC18013j0.a(h(z1VarB), fP, composerStartRestartGroup, 0);
                composerStartRestartGroup.P();
            }
            androidx.compose.runtime.z1<C5489q0> z1VarA2 = t.a(jH, null, null, null, composerStartRestartGroup, 0, 14);
            composerStartRestartGroup = composerStartRestartGroup;
            Modifier modifierG = interfaceC14898b.g(companion, companion4.h());
            boolean z14 = (i12 & 57344) == 16384 ? z12 : false;
            Object objB4 = composerStartRestartGroup.B();
            if (z14 || objB4 == companion2.a()) {
                objB4 = new j(function0);
                composerStartRestartGroup.t(objB4);
            }
            C14890K.a(androidx.compose.foundation.b.c(T0.l.b(androidx.compose.foundation.layout.J.o(androidx.compose.foundation.j.b(A.a(modifierG, (Function1) objB4), jVar, C17982Y0.f(false, f169996d, 0L, 4, null)), f169995c), f10, C16806i.f(), false, 0L, 0L, 24, null), i(z1VarA2), C16806i.f()), composerStartRestartGroup, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new k(interfaceC14898b, z10, z11, x1Var, function0, jVar, i10));
        }
    }

    public static final float r() {
        return f169994b;
    }

    public static final float s() {
        return f169993a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Boolean, Unit> d(androidx.compose.runtime.z1<? extends Function1<? super Boolean, Unit>> z1Var) {
        return (Function1) z1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(androidx.compose.runtime.z1<Boolean> z1Var) {
        return z1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long g(androidx.compose.runtime.z1<C5489q0> z1Var) {
        return z1Var.getValue().getValue();
    }

    private static final long h(androidx.compose.runtime.z1<C5489q0> z1Var) {
        return z1Var.getValue().getValue();
    }

    private static final long i(androidx.compose.runtime.z1<C5489q0> z1Var) {
        return z1Var.getValue().getValue();
    }
}
