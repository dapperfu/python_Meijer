package kotlin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import kotlin.C6439a;
import kotlin.C6446d0;
import kotlin.C6457n;
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
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.o0;
import kotlin.q0;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aJ\u0010\t\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012'\u0010\b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00000\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0003¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u001a\u0010\u001d\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\" \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$²\u0006\f\u0010\u0007\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010#\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "LU0/f;", "magnifierCenter", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "animatedCenter", "platformMagnifier", "d", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "targetCalculation", "Landroidx/compose/runtime/z1;", "f", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/z1;", "Lc0/n;", "a", "Lc0/n;", "UnspecifiedAnimationVector2D", "Lc0/o0;", "b", "Lc0/o0;", "getUnspecifiedSafeOffsetVectorConverter", "()Lc0/o0;", "UnspecifiedSafeOffsetVectorConverter", "c", "J", "getOffsetDisplacementThreshold", "()J", "OffsetDisplacementThreshold", "Lc0/d0;", "Lc0/d0;", "e", "()Lc0/d0;", "MagnifierSpringSpec", "targetValue", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: w0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17767F {

    /* renamed from: a, reason: collision with root package name */
    private static final C6457n f166471a = new C6457n(Float.NaN, Float.NaN);

    /* renamed from: b, reason: collision with root package name */
    private static final o0<U0.f, C6457n> f166472b = q0.a(a.f166475f, b.f166476f);

    /* renamed from: c, reason: collision with root package name */
    private static final long f166473c;

    /* renamed from: d, reason: collision with root package name */
    private static final C6446d0<U0.f> f166474d;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/f;", "it", "Lc0/n;", "a", "(J)Lc0/n;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: w0.F$a */
    static final class a extends Lambda implements Function1<U0.f, C6457n> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f166475f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C6457n invoke(U0.f fVar) {
            return a(fVar.getPackedValue());
        }

        public final C6457n a(long j10) {
            if ((9223372034707292159L & j10) == 9205357640488583168L) {
                return C17767F.f166471a;
            }
            return new C6457n(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc0/n;", "it", "LU0/f;", "a", "(Lc0/n;)J"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: w0.F$b */
    static final class b extends Lambda implements Function1<C6457n, U0.f> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f166476f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ U0.f invoke(C6457n c6457n) {
            return U0.f.d(a(c6457n));
        }

        public final long a(C6457n c6457n) {
            float v12 = c6457n.getV1();
            float v22 = c6457n.getV2();
            return U0.f.e((Float.floatToRawIntBits(v12) << 32) | (Float.floatToRawIntBits(v22) & 4294967295L));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "b", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: w0.F$c */
    static final class c extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<U0.f> f166477f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<Function0<U0.f>, Modifier> f166478g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LU0/f;", "c", "()J"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w0.F$c$a */
        static final class a extends Lambda implements Function0<U0.f> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ z1<U0.f> f166479f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z1<U0.f> z1Var) {
                super(0);
                this.f166479f = z1Var;
            }

            public final long c() {
                return c.c(this.f166479f);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ U0.f invoke() {
                return U0.f.d(c());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function0<U0.f> function0, Function1<? super Function0<U0.f>, ? extends Modifier> function1) {
            super(3);
            this.f166477f = function0;
            this.f166478g = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return b(modifier, composer, num.intValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long c(z1<U0.f> z1Var) {
            return z1Var.getValue().getPackedValue();
        }

        public final Modifier b(Modifier modifier, Composer composer, int i10) {
            composer.startReplaceGroup(759876635);
            if (ComposerKt.M()) {
                ComposerKt.U(759876635, i10, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:64)");
            }
            z1 z1VarF = C17767F.f(this.f166477f, composer, 0);
            Function1<Function0<U0.f>, Modifier> function1 = this.f166478g;
            boolean zV = composer.V(z1VarF);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new a(z1VarF);
                composer.t(objB);
            }
            Modifier modifierInvoke = function1.invoke((Function0) objB);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return modifierInvoke;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1", f = "SelectionMagnifier.kt", l = {85}, m = "invokeSuspend")
    /* renamed from: w0.F$d */
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f166480a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f166481b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z1<U0.f> f166482c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C6439a<U0.f, C6457n> f166483d;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LU0/f;", "c", "()J"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w0.F$d$a */
        static final class a extends Lambda implements Function0<U0.f> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ z1<U0.f> f166484f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z1<U0.f> z1Var) {
                super(0);
                this.f166484f = z1Var;
            }

            public final long c() {
                return C17767F.g(this.f166484f);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ U0.f invoke() {
                return U0.f.d(c());
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/f;", "targetValue", "", "a", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: w0.F$d$b */
        static final class b<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C6439a<U0.f, C6457n> f166485a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f166486b;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1", f = "SelectionMagnifier.kt", l = {98}, m = "invokeSuspend")
            /* renamed from: w0.F$d$b$a */
            static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f166487a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C6439a<U0.f, C6457n> f166488b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ long f166489c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(C6439a<U0.f, C6457n> c6439a, long j10, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f166488b = c6439a;
                    this.f166489c = j10;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new a(this.f166488b, this.f166489c, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f166487a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C6439a<U0.f, C6457n> c6439a = this.f166488b;
                        U0.f fVarD = U0.f.d(this.f166489c);
                        C6446d0<U0.f> c6446d0E = C17767F.e();
                        this.f166487a = 1;
                        if (C6439a.f(c6439a, fVarD, c6446d0E, null, null, this, 12, null) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            b(C6439a<U0.f, C6457n> c6439a, InterfaceC15783O interfaceC15783O) {
                this.f166485a = c6439a;
                this.f166486b = interfaceC15783O;
            }

            public final Object a(long j10, Continuation<? super Unit> continuation) {
                if ((this.f166485a.m().getPackedValue() & 9223372034707292159L) == 9205357640488583168L || (j10 & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (this.f166485a.m().getPackedValue() & 4294967295L)) == Float.intBitsToFloat((int) (j10 & 4294967295L))) {
                    Object objT = this.f166485a.t(U0.f.d(j10), continuation);
                    return objT == IntrinsicsKt.f() ? objT : Unit.f143329a;
                }
                C15809k.d(this.f166486b, null, null, new a(this.f166485a, j10, null), 3, null);
                return Unit.f143329a;
            }

            @Override // pv.InterfaceC16562g
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((U0.f) obj).getPackedValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(z1<U0.f> z1Var, C6439a<U0.f, C6457n> c6439a, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f166482c = z1Var;
            this.f166483d = c6439a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(this.f166482c, this.f166483d, continuation);
            dVar.f166481b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f166480a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f166481b;
                InterfaceC16561f interfaceC16561fQ = o1.q(new a(this.f166482c));
                b bVar = new b(this.f166483d, interfaceC15783O);
                this.f166480a = 1;
                if (interfaceC16561fQ.collect(bVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    static {
        long jE = U0.f.e((Float.floatToRawIntBits(0.01f) << 32) | (Float.floatToRawIntBits(0.01f) & 4294967295L));
        f166473c = jE;
        f166474d = new C6446d0<>(0.0f, 0.0f, U0.f.d(jE), 3, null);
    }

    public static final Modifier d(Modifier modifier, Function0<U0.f> function0, Function1<? super Function0<U0.f>, ? extends Modifier> function1) {
        return androidx.compose.ui.b.c(modifier, null, new c(function0, function1), 1, null);
    }

    public static final C6446d0<U0.f> e() {
        return f166474d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z1<U0.f> f(Function0<U0.f> function0, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-1589795249, i10, -1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:75)");
        }
        Object objB = composer.B();
        Composer.Companion companion = Composer.INSTANCE;
        if (objB == companion.a()) {
            objB = o1.e(function0);
            composer.t(objB);
        }
        z1 z1Var = (z1) objB;
        Object objB2 = composer.B();
        if (objB2 == companion.a()) {
            Object c6439a = new C6439a(U0.f.d(g(z1Var)), f166472b, U0.f.d(f166473c), null, 8, null);
            composer.t(c6439a);
            objB2 = c6439a;
        }
        C6439a c6439a2 = (C6439a) objB2;
        Unit unit = Unit.f143329a;
        boolean zD = composer.D(c6439a2);
        Object objB3 = composer.B();
        if (zD || objB3 == companion.a()) {
            objB3 = new d(z1Var, c6439a2, null);
            composer.t(objB3);
        }
        J.g(unit, (Function2) objB3, composer, 6);
        z1<U0.f> z1VarG = c6439a2.g();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return z1VarG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long g(z1<U0.f> z1Var) {
        return z1Var.getValue().getPackedValue();
    }
}
