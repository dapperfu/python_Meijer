package kotlin;

import H1.r;
import H1.y;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.C5892t0;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d0.C13443j;
import f1.C13832e;
import f1.InterfaceC13828a;
import g1.J;
import g1.U;
import j0.C14815g;
import j0.InterfaceC14814f;
import kotlin.C13794L;
import kotlin.C6317c;
import kotlin.EnumC13827z;
import kotlin.InterfaceC6326i;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.n0;
import kotlin.ranges.RangesKt;
import qv.C16648k;
import qv.InterfaceC16622O;
import r1.C16705m;
import r1.s;
import r1.u;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aG\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0089\u0001\u0010\u001e\u001a\u00020\r2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0005¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00182\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001cH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001b\u0010 \u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010!\u001a0\u0010%\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u00182\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u001c2\u0006\u0010$\u001a\u00020\u0006H\u0003ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a#\u0010,\u001a\u00020+2\n\u0010(\u001a\u0006\u0012\u0002\b\u00030'2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b,\u0010-\"\u0014\u0010/\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010.\"\u0014\u00100\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010.\"\u0014\u00101\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063²\u0006\f\u00102\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"Lx0/N0;", "initialValue", "Lc0/i;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmValueChange", "skipHalfExpanded", "Lx0/M0;", "j", "(Lx0/N0;Lc0/i;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Lx0/M0;", "Lj0/f;", "", "Lkotlin/ExtensionFunctionType;", "sheetContent", "Landroidx/compose/ui/Modifier;", "modifier", "sheetState", "sheetGesturesEnabled", "LV0/D1;", "sheetShape", "LH1/h;", "sheetElevation", "LV0/q0;", "sheetBackgroundColor", "sheetContentColor", "scrimColor", "Lkotlin/Function0;", "content", "b", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lx0/M0;ZLV0/D1;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "i", "(Landroidx/compose/ui/Modifier;Lx0/M0;)Landroidx/compose/ui/Modifier;", "color", "onDismiss", "visible", "c", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "Lx0/e;", "state", "Lf0/z;", "orientation", "Lf1/a;", "a", "(Lx0/e;Lf0/z;)Lf1/a;", "F", "ModalBottomSheetPositionalThreshold", "ModalBottomSheetVelocityThreshold", "MaxModalBottomSheetWidth", "alpha", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.L0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17891L0 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f167126a = H1.h.p(56);

    /* renamed from: b, reason: collision with root package name */
    private static final float f167127b = H1.h.p(125);

    /* renamed from: c, reason: collision with root package name */
    private static final float f167128c = H1.h.p(640);

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0002*\u00020\u0006H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0002*\u00020\u0003H\u0003¢\u0006\u0004\b\t\u0010\bJ\"\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0096@ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0096@ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"x0/L0$a", "Lf1/a;", "", "LU0/f;", "b", "(F)J", "LH1/y;", "c", "(J)F", "a", "available", "Lf1/e;", "source", "E1", "(JI)J", "consumed", "L0", "(JJI)J", "M1", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b0", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.L0$a */
    public static final class a implements InterfaceC13828a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C17931e<?> f167129a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ EnumC13827z f167130b;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "ModalBottomSheet.kt", l = {570}, m = "onPostFling-RZ2iAVY")
        /* renamed from: x0.L0$a$a, reason: collision with other inner class name */
        static final class C2656a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            long f167131a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f167132b;

            /* renamed from: d, reason: collision with root package name */
            int f167134d;

            C2656a(Continuation<? super C2656a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f167132b = obj;
                this.f167134d |= Integer.MIN_VALUE;
                return a.this.b0(0L, 0L, this);
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "ModalBottomSheet.kt", l = {561}, m = "onPreFling-QWom1Mo")
        /* renamed from: x0.L0$a$b */
        static final class b extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            long f167135a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f167136b;

            /* renamed from: d, reason: collision with root package name */
            int f167138d;

            b(Continuation<? super b> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f167136b = obj;
                this.f167138d |= Integer.MIN_VALUE;
                return a.this.M1(0L, this);
            }
        }

        a(C17931e<?> c17931e, EnumC13827z enumC13827z) {
            this.f167129a = c17931e;
            this.f167130b = enumC13827z;
        }

        @JvmName
        private final float a(long j10) {
            return this.f167130b == EnumC13827z.f130586b ? U0.f.m(j10) : U0.f.n(j10);
        }

        private final long b(float f10) {
            EnumC13827z enumC13827z = this.f167130b;
            float f11 = enumC13827z == EnumC13827z.f130586b ? f10 : 0.0f;
            if (enumC13827z != EnumC13827z.f130585a) {
                f10 = 0.0f;
            }
            return U0.g.a(f11, f10);
        }

        @JvmName
        private final float c(long j10) {
            return this.f167130b == EnumC13827z.f130586b ? y.h(j10) : y.i(j10);
        }

        @Override // f1.InterfaceC13828a
        public long L0(long consumed, long available, int source) {
            return C13832e.f(source, C13832e.INSTANCE.d()) ? b(this.f167129a.n(a(available))) : U0.f.INSTANCE.c();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // f1.InterfaceC13828a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object M1(long r6, kotlin.coroutines.Continuation<? super H1.y> r8) {
            /*
                r5 = this;
                boolean r0 = r8 instanceof kotlin.C17891L0.a.b
                if (r0 == 0) goto L13
                r0 = r8
                x0.L0$a$b r0 = (kotlin.C17891L0.a.b) r0
                int r1 = r0.f167138d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f167138d = r1
                goto L18
            L13:
                x0.L0$a$b r0 = new x0.L0$a$b
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f167136b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f167138d
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L2b
                long r6 = r0.f167135a
                kotlin.ResultKt.b(r8)
                goto L66
            L2b:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L33:
                kotlin.ResultKt.b(r8)
                float r8 = r5.c(r6)
                x0.e<?> r2 = r5.f167129a
                float r2 = r2.A()
                r4 = 0
                int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r4 >= 0) goto L60
                x0.e<?> r4 = r5.f167129a
                x0.a0 r4 = r4.o()
                float r4 = r4.e()
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 <= 0) goto L60
                x0.e<?> r2 = r5.f167129a
                r0.f167135a = r6
                r0.f167138d = r3
                java.lang.Object r8 = r2.G(r8, r0)
                if (r8 != r1) goto L66
                return r1
            L60:
                H1.y$a r6 = H1.y.INSTANCE
                long r6 = r6.a()
            L66:
                H1.y r6 = H1.y.b(r6)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C17891L0.a.M1(long, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // f1.InterfaceC13828a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object b0(long r3, long r5, kotlin.coroutines.Continuation<? super H1.y> r7) {
            /*
                r2 = this;
                boolean r3 = r7 instanceof kotlin.C17891L0.a.C2656a
                if (r3 == 0) goto L13
                r3 = r7
                x0.L0$a$a r3 = (kotlin.C17891L0.a.C2656a) r3
                int r4 = r3.f167134d
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r4 & r0
                if (r1 == 0) goto L13
                int r4 = r4 - r0
                r3.f167134d = r4
                goto L18
            L13:
                x0.L0$a$a r3 = new x0.L0$a$a
                r3.<init>(r7)
            L18:
                java.lang.Object r4 = r3.f167132b
                java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r0 = r3.f167134d
                r1 = 1
                if (r0 == 0) goto L33
                if (r0 != r1) goto L2b
                long r5 = r3.f167131a
                kotlin.ResultKt.b(r4)
                goto L47
            L2b:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r4)
                throw r3
            L33:
                kotlin.ResultKt.b(r4)
                x0.e<?> r4 = r2.f167129a
                float r0 = r2.c(r5)
                r3.f167131a = r5
                r3.f167134d = r1
                java.lang.Object r3 = r4.G(r0, r3)
                if (r3 != r7) goto L47
                return r7
            L47:
                H1.y r3 = H1.y.b(r5)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C17891L0.a.b0(long, long, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // f1.InterfaceC13828a
        public long E1(long available, int source) {
            float fA = a(available);
            if (fA < 0.0f && C13832e.f(source, C13832e.INSTANCE.d())) {
                return b(this.f167129a.n(fA));
            }
            return U0.f.INSTANCE.c();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.L0$b */
    static final class b extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17893M0 f167139f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f167140g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1$1", f = "ModalBottomSheet.kt", l = {363}, m = "invokeSuspend")
        /* renamed from: x0.L0$b$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f167141a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17893M0 f167142b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C17893M0 c17893m0, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f167142b = c17893m0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f167142b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f167141a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17893M0 c17893m0 = this.f167142b;
                    this.f167141a = 1;
                    if (c17893m0.i(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C17893M0 c17893m0, InterfaceC16622O interfaceC16622O) {
            super(0);
            this.f167139f = c17893m0;
            this.f167140g = interfaceC16622O;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.f167139f.d().r().invoke(EnumC17895N0.f167226a).booleanValue()) {
                C16648k.d(this.f167140g, null, null, new a(this.f167139f, null), 3, null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.L0$c */
    static final class c extends Lambda implements Function1<u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17893M0 f167143f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f167144g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.L0$c$a */
        static final class a extends Lambda implements Function0<Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C17893M0 f167145f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f167146g;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$1$1", f = "ModalBottomSheet.kt", l = {HttpResponseStatus.ERROR_UNAUTHORIZED}, m = "invokeSuspend")
            /* renamed from: x0.L0$c$a$a, reason: collision with other inner class name */
            static final class C2657a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f167147a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17893M0 f167148b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2657a(C17893M0 c17893m0, Continuation<? super C2657a> continuation) {
                    super(2, continuation);
                    this.f167148b = c17893m0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C2657a(this.f167148b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((C2657a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f167147a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17893M0 c17893m0 = this.f167148b;
                        this.f167147a = 1;
                        if (c17893m0.i(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C17893M0 c17893m0, InterfaceC16622O interfaceC16622O) {
                super(0);
                this.f167145f = c17893m0;
                this.f167146g = interfaceC16622O;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                if (this.f167145f.d().r().invoke(EnumC17895N0.f167226a).booleanValue()) {
                    C16648k.d(this.f167146g, null, null, new C2657a(this.f167145f, null), 3, null);
                }
                return Boolean.TRUE;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.L0$c$b */
        static final class b extends Lambda implements Function0<Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C17893M0 f167149f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f167150g;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$2$1", f = "ModalBottomSheet.kt", l = {HttpResponseStatus.ERROR_REQUEST_URI_TOO_LONG}, m = "invokeSuspend")
            /* renamed from: x0.L0$c$b$a */
            static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f167151a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17893M0 f167152b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(C17893M0 c17893m0, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f167152b = c17893m0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new a(this.f167152b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f167151a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17893M0 c17893m0 = this.f167152b;
                        this.f167151a = 1;
                        if (c17893m0.c(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C17893M0 c17893m0, InterfaceC16622O interfaceC16622O) {
                super(0);
                this.f167149f = c17893m0;
                this.f167150g = interfaceC16622O;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                if (this.f167149f.d().r().invoke(EnumC17895N0.f167227b).booleanValue()) {
                    C16648k.d(this.f167150g, null, null, new a(this.f167149f, null), 3, null);
                }
                return Boolean.TRUE;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.L0$c$c, reason: collision with other inner class name */
        static final class C2658c extends Lambda implements Function0<Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C17893M0 f167153f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f167154g;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$3$1", f = "ModalBottomSheet.kt", l = {425}, m = "invokeSuspend")
            /* renamed from: x0.L0$c$c$a */
            static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f167155a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17893M0 f167156b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(C17893M0 c17893m0, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f167156b = c17893m0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new a(this.f167156b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f167155a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17893M0 c17893m0 = this.f167156b;
                        this.f167155a = 1;
                        if (c17893m0.h(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2658c(C17893M0 c17893m0, InterfaceC16622O interfaceC16622O) {
                super(0);
                this.f167153f = c17893m0;
                this.f167154g = interfaceC16622O;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                if (this.f167153f.d().r().invoke(EnumC17895N0.f167228c).booleanValue()) {
                    C16648k.d(this.f167154g, null, null, new a(this.f167153f, null), 3, null);
                }
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C17893M0 c17893m0, InterfaceC16622O interfaceC16622O) {
            super(1);
            this.f167143f = c17893m0;
            this.f167144g = interfaceC16622O;
        }

        public final void a(u uVar) {
            if (this.f167143f.k()) {
                s.n(uVar, null, new a(this.f167143f, this.f167144g), 1, null);
                if (this.f167143f.d().s() == EnumC17895N0.f167228c) {
                    s.q(uVar, null, new b(this.f167143f, this.f167144g), 1, null);
                } else if (this.f167143f.f()) {
                    s.f(uVar, null, new C2658c(this.f167143f, this.f167144g), 1, null);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.L0$d */
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14814f, Composer, Integer, Unit> f167157f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function3<? super InterfaceC14814f, ? super Composer, ? super Integer, Unit> function3) {
            super(2);
            this.f167157f = function3;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(17396558, i10, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous>.<anonymous> (ModalBottomSheet.kt:438)");
            }
            Function3<InterfaceC14814f, Composer, Integer, Unit> function3 = this.f167157f;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            function3.invoke(C14815g.f139108a, composer, 6);
            composer.v();
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

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.L0$e */
    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14814f, Composer, Integer, Unit> f167158f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f167159g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C17893M0 f167160h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f167161i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ V0.D1 f167162j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f167163k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ long f167164l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ long f167165m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ long f167166n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167167o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f167168p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f167169q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function3<? super InterfaceC14814f, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, C17893M0 c17893m0, boolean z10, V0.D1 d12, float f10, long j10, long j11, long j12, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f167158f = function3;
            this.f167159g = modifier;
            this.f167160h = c17893m0;
            this.f167161i = z10;
            this.f167162j = d12;
            this.f167163k = f10;
            this.f167164l = j10;
            this.f167165m = j11;
            this.f167166n = j12;
            this.f167167o = function2;
            this.f167168p = i10;
            this.f167169q = i11;
        }

        public final void a(Composer composer, int i10) {
            C17891L0.b(this.f167158f, this.f167159g, this.f167160h, this.f167161i, this.f167162j, this.f167163k, this.f167164l, this.f167165m, this.f167166n, this.f167167o, composer, J0.a(this.f167168p | 1), this.f167169q);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/f;", "", "a", "(LX0/f;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.L0$f */
    static final class f extends Lambda implements Function1<X0.f, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f167170f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ z1<Float> f167171g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j10, z1<Float> z1Var) {
            super(1);
            this.f167170f = j10;
            this.f167171g = z1Var;
        }

        public final void a(X0.f fVar) {
            X0.f.i1(fVar, this.f167170f, 0L, 0L, RangesKt.n(C17891L0.d(this.f167171g), 0.0f, 1.0f), null, null, 0, 118, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.f fVar) {
            a(fVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.L0$g */
    static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f167172f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f167173g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f167174h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f167175i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(long j10, Function0<Unit> function0, boolean z10, int i10) {
            super(2);
            this.f167172f = j10;
            this.f167173g = function0;
            this.f167174h = z10;
            this.f167175i = i10;
        }

        public final void a(Composer composer, int i10) {
            C17891L0.c(this.f167172f, this.f167173g, this.f167174h, composer, J0.a(this.f167175i | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/J;", "", "<anonymous>", "(Lg1/J;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$1$1", f = "ModalBottomSheet.kt", l = {497}, m = "invokeSuspend")
    /* renamed from: x0.L0$h */
    static final class h extends SuspendLambda implements Function2<J, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f167176a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f167177b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f167178c;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/f;", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.L0$h$a */
        static final class a extends Lambda implements Function1<U0.f, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f167179f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function0<Unit> function0) {
                super(1);
                this.f167179f = function0;
            }

            public final void a(long j10) {
                this.f167179f.invoke();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(U0.f fVar) {
                a(fVar.getPackedValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Function0<Unit> function0, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f167178c = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            h hVar = new h(this.f167178c, continuation);
            hVar.f167177b = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j10, Continuation<? super Unit> continuation) {
            return ((h) create(j10, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f167176a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                J j10 = (J) this.f167177b;
                a aVar = new a(this.f167178c);
                this.f167176a = 1;
                if (C13794L.m(j10, null, null, null, aVar, this, 7, null) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.L0$i */
    static final class i extends Lambda implements Function1<u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f167180f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f167181g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.L0$i$a */
        static final class a extends Lambda implements Function0<Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f167182f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function0<Unit> function0) {
                super(0);
                this.f167182f = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                this.f167182f.invoke();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, Function0<Unit> function0) {
            super(1);
            this.f167180f = str;
            this.f167181g = function0;
        }

        public final void a(u uVar) {
            s.g0(uVar, this.f167180f);
            s.E(uVar, null, new a(this.f167181g), 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LH1/r;", "sheetSize", "LH1/b;", "constraints", "Lkotlin/Pair;", "Lx0/a0;", "Lx0/N0;", "a", "(JJ)Lkotlin/Pair;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.L0$j */
    static final class j extends Lambda implements Function2<r, H1.b, Pair<? extends InterfaceC17920a0<EnumC17895N0>, ? extends EnumC17895N0>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17893M0 f167183f;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx0/b0;", "Lx0/N0;", "", "a", "(Lx0/b0;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.L0$j$b */
        static final class b extends Lambda implements Function1<C17923b0<EnumC17895N0>, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ float f167184f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C17893M0 f167185g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ long f167186h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(float f10, C17893M0 c17893m0, long j10) {
                super(1);
                this.f167184f = f10;
                this.f167185g = c17893m0;
                this.f167186h = j10;
            }

            public final void a(C17923b0<EnumC17895N0> c17923b0) {
                c17923b0.a(EnumC17895N0.f167226a, this.f167184f);
                float f10 = this.f167184f / 2.0f;
                if (!this.f167185g.getIsSkipHalfExpanded() && r.f(this.f167186h) > f10) {
                    c17923b0.a(EnumC17895N0.f167228c, f10);
                }
                if (r.f(this.f167186h) != 0) {
                    c17923b0.a(EnumC17895N0.f167227b, Math.max(0.0f, this.f167184f - r.f(this.f167186h)));
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C17923b0<EnumC17895N0> c17923b0) {
                a(c17923b0);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: x0.L0$j$a */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC17895N0.values().length];
                try {
                    iArr[EnumC17895N0.f167226a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC17895N0.f167228c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC17895N0.f167227b.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(C17893M0 c17893m0) {
            super(2);
            this.f167183f = c17893m0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Pair<? extends InterfaceC17920a0<EnumC17895N0>, ? extends EnumC17895N0> invoke(r rVar, H1.b bVar) {
            return a(rVar.getPackedValue(), bVar.getValue());
        }

        public final Pair<InterfaceC17920a0<EnumC17895N0>, EnumC17895N0> a(long j10, long j11) {
            boolean z10;
            InterfaceC17920a0 interfaceC17920a0A = androidx.compose.material.a.a(new b(H1.b.k(j11), this.f167183f, j10));
            if (this.f167183f.d().o().getSize() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            EnumC17895N0 enumC17895N0E = this.f167183f.e();
            if (z10 || !interfaceC17920a0A.d(enumC17895N0E)) {
                int i10 = a.$EnumSwitchMapping$0[this.f167183f.g().ordinal()];
                if (i10 != 1) {
                    if (i10 != 2 && i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    EnumC17895N0 enumC17895N0 = EnumC17895N0.f167228c;
                    if (!interfaceC17920a0A.d(enumC17895N0)) {
                        enumC17895N0 = EnumC17895N0.f167227b;
                        if (!interfaceC17920a0A.d(enumC17895N0)) {
                            enumC17895N0 = EnumC17895N0.f167226a;
                        }
                    }
                    enumC17895N0E = enumC17895N0;
                } else {
                    enumC17895N0E = EnumC17895N0.f167226a;
                }
            }
            return TuplesKt.a(interfaceC17920a0A, enumC17895N0E);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.L0$k */
    static final class k extends Lambda implements Function1<EnumC17895N0, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final k f167187f = new k();

        k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(EnumC17895N0 enumC17895N0) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lx0/M0;", "c", "()Lx0/M0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.L0$l */
    static final class l extends Lambda implements Function0<C17893M0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC17895N0 f167188f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ H1.d f167189g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<EnumC17895N0, Boolean> f167190h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC6326i<Float> f167191i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f167192j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(EnumC17895N0 enumC17895N0, H1.d dVar, Function1<? super EnumC17895N0, Boolean> function1, InterfaceC6326i<Float> interfaceC6326i, boolean z10) {
            super(0);
            this.f167188f = enumC17895N0;
            this.f167189g = dVar;
            this.f167190h = function1;
            this.f167191i = interfaceC6326i;
            this.f167192j = z10;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C17893M0 invoke() {
            return new C17893M0(this.f167188f, this.f167189g, this.f167190h, this.f167191i, this.f167192j);
        }
    }

    private static final InterfaceC13828a a(C17931e<?> c17931e, EnumC13827z enumC13827z) {
        return new a(c17931e, enumC13827z);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010d  */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(kotlin.jvm.functions.Function3<? super j0.InterfaceC14814f, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, androidx.compose.ui.Modifier r32, kotlin.C17893M0 r33, boolean r34, V0.D1 r35, float r36, long r37, long r39, long r41, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r43, androidx.compose.runtime.Composer r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 1238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17891L0.b(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, x0.M0, boolean, V0.D1, float, long, long, long, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(long j10, Function0<Unit> function0, boolean z10, Composer composer, int i10) {
        int i11;
        Modifier modifierC;
        Composer composerStartRestartGroup = composer.startRestartGroup(-526532668);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.e(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(function0) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 256 : 128;
        }
        if (composerStartRestartGroup.p((i11 & 147) != 146, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(-526532668, i11, -1, "androidx.compose.material.Scrim (ModalBottomSheet.kt:489)");
            }
            if (j10 != 16) {
                composerStartRestartGroup.startReplaceGroup(477792612);
                int i12 = i11;
                z1<Float> z1VarD = C6317c.d(z10 ? 1.0f : 0.0f, new n0(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                String strA = s1.a(C17972r1.INSTANCE.b(), composerStartRestartGroup, 6);
                if (z10) {
                    composerStartRestartGroup.startReplaceGroup(478010511);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    int i13 = i12 & 112;
                    boolean z11 = i13 == 32;
                    Object objB = composerStartRestartGroup.B();
                    if (z11 || objB == Composer.INSTANCE.a()) {
                        objB = new h(function0, null);
                        composerStartRestartGroup.t(objB);
                    }
                    Modifier modifierThen = companion.then(new SuspendPointerInputElement(function0, null, null, new U.a((Function2) objB), 6, null));
                    boolean zV = (i13 == 32) | composerStartRestartGroup.V(strA);
                    Object objB2 = composerStartRestartGroup.B();
                    if (zV || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new i(strA, function0);
                        composerStartRestartGroup.t(objB2);
                    }
                    modifierC = C16705m.c(modifierThen, true, (Function1) objB2);
                    composerStartRestartGroup.P();
                } else {
                    composerStartRestartGroup.startReplaceGroup(478374234);
                    composerStartRestartGroup.P();
                    modifierC = Modifier.INSTANCE;
                }
                Modifier modifierThen2 = androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null).then(modifierC);
                boolean zV2 = composerStartRestartGroup.V(z1VarD) | ((i12 & 14) == 4);
                Object objB3 = composerStartRestartGroup.B();
                if (zV2 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new f(j10, z1VarD);
                    composerStartRestartGroup.t(objB3);
                }
                C13443j.a(modifierThen2, (Function1) objB3, composerStartRestartGroup, 0);
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(478559490);
                composerStartRestartGroup.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new g(j10, function0, z10, i10));
        }
    }

    public static final C17893M0 j(EnumC17895N0 enumC17895N0, InterfaceC6326i<Float> interfaceC6326i, Function1<? super EnumC17895N0, Boolean> function1, boolean z10, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            interfaceC6326i = C17889K0.f167100a.a();
        }
        InterfaceC6326i<Float> interfaceC6326i2 = interfaceC6326i;
        Function1<? super EnumC17895N0, Boolean> function12 = (i11 & 4) != 0 ? k.f167187f : function1;
        boolean z11 = (i11 & 8) != 0 ? false : z10;
        if (ComposerKt.M()) {
            ComposerKt.U(-126412120, i10, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:277)");
        }
        H1.d dVar = (H1.d) composer.o(C5892t0.g());
        composer.startMovableGroup(976451635, enumC17895N0);
        Object[] objArr = {enumC17895N0, interfaceC6326i2, Boolean.valueOf(z11), function12, dVar};
        L0.k<C17893M0, ?> kVarA = C17893M0.INSTANCE.a(interfaceC6326i2, function12, z11, dVar);
        boolean zV = ((((i10 & 14) ^ 6) > 4 && composer.V(enumC17895N0)) || (i10 & 6) == 4) | composer.V(dVar) | ((((i10 & 896) ^ 384) > 256 && composer.V(function12)) || (i10 & 384) == 256) | composer.D(interfaceC6326i2) | ((((i10 & 7168) ^ 3072) > 2048 && composer.a(z11)) || (i10 & 3072) == 2048);
        Object objB = composer.B();
        if (zV || objB == Composer.INSTANCE.a()) {
            Object lVar = new l(enumC17895N0, dVar, function12, interfaceC6326i2, z11);
            composer.t(lVar);
            objB = lVar;
        }
        C17893M0 c17893m0 = (C17893M0) L0.c.c(objArr, kVarA, null, (Function0) objB, composer, 0, 4);
        composer.T();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c17893m0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(z1<Float> z1Var) {
        return z1Var.getValue().floatValue();
    }

    private static final Modifier i(Modifier modifier, C17893M0 c17893m0) {
        return androidx.compose.material.a.h(modifier, c17893m0.d(), EnumC13827z.f130585a, new j(c17893m0));
    }
}
