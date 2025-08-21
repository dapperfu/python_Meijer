package kotlin;

import H1.r;
import H1.y;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.C6034t0;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d0.C13576j;
import f1.C13942e;
import f1.InterfaceC13938a;
import g1.J;
import g1.U;
import j0.C14903g;
import j0.InterfaceC14902f;
import kotlin.C13904L;
import kotlin.C6443c;
import kotlin.EnumC13937z;
import kotlin.InterfaceC6452i;
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
import mv.C15809k;
import mv.InterfaceC15783O;
import r1.C16819m;
import r1.s;
import r1.u;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aG\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0089\u0001\u0010\u001e\u001a\u00020\r2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0005¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00182\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001cH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001b\u0010 \u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010!\u001a0\u0010%\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u00182\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u001c2\u0006\u0010$\u001a\u00020\u0006H\u0003ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a#\u0010,\u001a\u00020+2\n\u0010(\u001a\u0006\u0012\u0002\b\u00030'2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b,\u0010-\"\u0014\u0010/\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010.\"\u0014\u00100\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010.\"\u0014\u00101\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063²\u0006\f\u00102\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"Lx0/N0;", "initialValue", "Lc0/i;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmValueChange", "skipHalfExpanded", "Lx0/M0;", "j", "(Lx0/N0;Lc0/i;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Lx0/M0;", "Lj0/f;", "", "Lkotlin/ExtensionFunctionType;", "sheetContent", "Landroidx/compose/ui/Modifier;", "modifier", "sheetState", "sheetGesturesEnabled", "LV0/D1;", "sheetShape", "LH1/h;", "sheetElevation", "LV0/q0;", "sheetBackgroundColor", "sheetContentColor", "scrimColor", "Lkotlin/Function0;", "content", "b", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lx0/M0;ZLV0/D1;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "i", "(Landroidx/compose/ui/Modifier;Lx0/M0;)Landroidx/compose/ui/Modifier;", "color", "onDismiss", "visible", "c", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "Lx0/e;", "state", "Lf0/z;", "orientation", "Lf1/a;", "a", "(Lx0/e;Lf0/z;)Lf1/a;", "F", "ModalBottomSheetPositionalThreshold", "ModalBottomSheetVelocityThreshold", "MaxModalBottomSheetWidth", "alpha", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.L0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17957L0 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f168214a = H1.h.p(56);

    /* renamed from: b, reason: collision with root package name */
    private static final float f168215b = H1.h.p(125);

    /* renamed from: c, reason: collision with root package name */
    private static final float f168216c = H1.h.p(640);

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0002*\u00020\u0006H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0002*\u00020\u0003H\u0003¢\u0006\u0004\b\t\u0010\bJ\"\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0096@ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0096@ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"x0/L0$a", "Lf1/a;", "", "LU0/f;", "b", "(F)J", "LH1/y;", "c", "(J)F", "a", "available", "Lf1/e;", "source", "E1", "(JI)J", "consumed", "L0", "(JJI)J", "M1", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b0", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.L0$a */
    public static final class a implements InterfaceC13938a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C17997e<?> f168217a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ EnumC13937z f168218b;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "ModalBottomSheet.kt", l = {570}, m = "onPostFling-RZ2iAVY")
        /* renamed from: x0.L0$a$a, reason: collision with other inner class name */
        static final class C2680a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            long f168219a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f168220b;

            /* renamed from: d, reason: collision with root package name */
            int f168222d;

            C2680a(Continuation<? super C2680a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f168220b = obj;
                this.f168222d |= Integer.MIN_VALUE;
                return a.this.b0(0L, 0L, this);
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "ModalBottomSheet.kt", l = {561}, m = "onPreFling-QWom1Mo")
        /* renamed from: x0.L0$a$b */
        static final class b extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            long f168223a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f168224b;

            /* renamed from: d, reason: collision with root package name */
            int f168226d;

            b(Continuation<? super b> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f168224b = obj;
                this.f168226d |= Integer.MIN_VALUE;
                return a.this.M1(0L, this);
            }
        }

        a(C17997e<?> c17997e, EnumC13937z enumC13937z) {
            this.f168217a = c17997e;
            this.f168218b = enumC13937z;
        }

        @JvmName
        private final float a(long j10) {
            return this.f168218b == EnumC13937z.f131420b ? U0.f.m(j10) : U0.f.n(j10);
        }

        private final long b(float f10) {
            EnumC13937z enumC13937z = this.f168218b;
            float f11 = enumC13937z == EnumC13937z.f131420b ? f10 : 0.0f;
            if (enumC13937z != EnumC13937z.f131419a) {
                f10 = 0.0f;
            }
            return U0.g.a(f11, f10);
        }

        @JvmName
        private final float c(long j10) {
            return this.f168218b == EnumC13937z.f131420b ? y.h(j10) : y.i(j10);
        }

        @Override // f1.InterfaceC13938a
        public long L0(long consumed, long available, int source) {
            return C13942e.f(source, C13942e.INSTANCE.d()) ? b(this.f168217a.n(a(available))) : U0.f.INSTANCE.c();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // f1.InterfaceC13938a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object M1(long r6, kotlin.coroutines.Continuation<? super H1.y> r8) {
            /*
                r5 = this;
                boolean r0 = r8 instanceof kotlin.C17957L0.a.b
                if (r0 == 0) goto L13
                r0 = r8
                x0.L0$a$b r0 = (kotlin.C17957L0.a.b) r0
                int r1 = r0.f168226d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f168226d = r1
                goto L18
            L13:
                x0.L0$a$b r0 = new x0.L0$a$b
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f168224b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f168226d
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L2b
                long r6 = r0.f168223a
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
                x0.e<?> r2 = r5.f168217a
                float r2 = r2.A()
                r4 = 0
                int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r4 >= 0) goto L60
                x0.e<?> r4 = r5.f168217a
                x0.a0 r4 = r4.o()
                float r4 = r4.e()
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 <= 0) goto L60
                x0.e<?> r2 = r5.f168217a
                r0.f168223a = r6
                r0.f168226d = r3
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C17957L0.a.M1(long, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // f1.InterfaceC13938a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object b0(long r3, long r5, kotlin.coroutines.Continuation<? super H1.y> r7) {
            /*
                r2 = this;
                boolean r3 = r7 instanceof kotlin.C17957L0.a.C2680a
                if (r3 == 0) goto L13
                r3 = r7
                x0.L0$a$a r3 = (kotlin.C17957L0.a.C2680a) r3
                int r4 = r3.f168222d
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r4 & r0
                if (r1 == 0) goto L13
                int r4 = r4 - r0
                r3.f168222d = r4
                goto L18
            L13:
                x0.L0$a$a r3 = new x0.L0$a$a
                r3.<init>(r7)
            L18:
                java.lang.Object r4 = r3.f168220b
                java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r0 = r3.f168222d
                r1 = 1
                if (r0 == 0) goto L33
                if (r0 != r1) goto L2b
                long r5 = r3.f168219a
                kotlin.ResultKt.b(r4)
                goto L47
            L2b:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r4)
                throw r3
            L33:
                kotlin.ResultKt.b(r4)
                x0.e<?> r4 = r2.f168217a
                float r0 = r2.c(r5)
                r3.f168219a = r5
                r3.f168222d = r1
                java.lang.Object r3 = r4.G(r0, r3)
                if (r3 != r7) goto L47
                return r7
            L47:
                H1.y r3 = H1.y.b(r5)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C17957L0.a.b0(long, long, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // f1.InterfaceC13938a
        public long E1(long available, int source) {
            float fA = a(available);
            if (fA < 0.0f && C13942e.f(source, C13942e.INSTANCE.d())) {
                return b(this.f168217a.n(fA));
            }
            return U0.f.INSTANCE.c();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.L0$b */
    static final class b extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17959M0 f168227f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC15783O f168228g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1$1", f = "ModalBottomSheet.kt", l = {363}, m = "invokeSuspend")
        /* renamed from: x0.L0$b$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f168229a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17959M0 f168230b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C17959M0 c17959m0, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f168230b = c17959m0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f168230b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f168229a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17959M0 c17959m0 = this.f168230b;
                    this.f168229a = 1;
                    if (c17959m0.i(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C17959M0 c17959m0, InterfaceC15783O interfaceC15783O) {
            super(0);
            this.f168227f = c17959m0;
            this.f168228g = interfaceC15783O;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.f168227f.d().r().invoke(EnumC17961N0.f168314a).booleanValue()) {
                C15809k.d(this.f168228g, null, null, new a(this.f168227f, null), 3, null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.L0$c */
    static final class c extends Lambda implements Function1<u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17959M0 f168231f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC15783O f168232g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.L0$c$a */
        static final class a extends Lambda implements Function0<Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C17959M0 f168233f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f168234g;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$1$1", f = "ModalBottomSheet.kt", l = {HttpResponseStatus.ERROR_UNAUTHORIZED}, m = "invokeSuspend")
            /* renamed from: x0.L0$c$a$a, reason: collision with other inner class name */
            static final class C2681a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f168235a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17959M0 f168236b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2681a(C17959M0 c17959m0, Continuation<? super C2681a> continuation) {
                    super(2, continuation);
                    this.f168236b = c17959m0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C2681a(this.f168236b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((C2681a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f168235a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17959M0 c17959m0 = this.f168236b;
                        this.f168235a = 1;
                        if (c17959m0.i(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C17959M0 c17959m0, InterfaceC15783O interfaceC15783O) {
                super(0);
                this.f168233f = c17959m0;
                this.f168234g = interfaceC15783O;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                if (this.f168233f.d().r().invoke(EnumC17961N0.f168314a).booleanValue()) {
                    C15809k.d(this.f168234g, null, null, new C2681a(this.f168233f, null), 3, null);
                }
                return Boolean.TRUE;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.L0$c$b */
        static final class b extends Lambda implements Function0<Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C17959M0 f168237f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f168238g;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$2$1", f = "ModalBottomSheet.kt", l = {HttpResponseStatus.ERROR_REQUEST_URI_TOO_LONG}, m = "invokeSuspend")
            /* renamed from: x0.L0$c$b$a */
            static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f168239a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17959M0 f168240b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(C17959M0 c17959m0, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f168240b = c17959m0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new a(this.f168240b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f168239a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17959M0 c17959m0 = this.f168240b;
                        this.f168239a = 1;
                        if (c17959m0.c(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C17959M0 c17959m0, InterfaceC15783O interfaceC15783O) {
                super(0);
                this.f168237f = c17959m0;
                this.f168238g = interfaceC15783O;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                if (this.f168237f.d().r().invoke(EnumC17961N0.f168315b).booleanValue()) {
                    C15809k.d(this.f168238g, null, null, new a(this.f168237f, null), 3, null);
                }
                return Boolean.TRUE;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.L0$c$c, reason: collision with other inner class name */
        static final class C2682c extends Lambda implements Function0<Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C17959M0 f168241f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f168242g;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$3$1", f = "ModalBottomSheet.kt", l = {425}, m = "invokeSuspend")
            /* renamed from: x0.L0$c$c$a */
            static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f168243a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17959M0 f168244b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(C17959M0 c17959m0, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f168244b = c17959m0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new a(this.f168244b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f168243a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17959M0 c17959m0 = this.f168244b;
                        this.f168243a = 1;
                        if (c17959m0.h(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2682c(C17959M0 c17959m0, InterfaceC15783O interfaceC15783O) {
                super(0);
                this.f168241f = c17959m0;
                this.f168242g = interfaceC15783O;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                if (this.f168241f.d().r().invoke(EnumC17961N0.f168316c).booleanValue()) {
                    C15809k.d(this.f168242g, null, null, new a(this.f168241f, null), 3, null);
                }
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C17959M0 c17959m0, InterfaceC15783O interfaceC15783O) {
            super(1);
            this.f168231f = c17959m0;
            this.f168232g = interfaceC15783O;
        }

        public final void a(u uVar) {
            if (this.f168231f.k()) {
                s.n(uVar, null, new a(this.f168231f, this.f168232g), 1, null);
                if (this.f168231f.d().s() == EnumC17961N0.f168316c) {
                    s.q(uVar, null, new b(this.f168231f, this.f168232g), 1, null);
                } else if (this.f168231f.f()) {
                    s.f(uVar, null, new C2682c(this.f168231f, this.f168232g), 1, null);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.L0$d */
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14902f, Composer, Integer, Unit> f168245f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function3<? super InterfaceC14902f, ? super Composer, ? super Integer, Unit> function3) {
            super(2);
            this.f168245f = function3;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(17396558, i10, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous>.<anonymous> (ModalBottomSheet.kt:438)");
            }
            Function3<InterfaceC14902f, Composer, Integer, Unit> function3 = this.f168245f;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            function3.invoke(C14903g.f139698a, composer, 6);
            composer.v();
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

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.L0$e */
    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14902f, Composer, Integer, Unit> f168246f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f168247g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C17959M0 f168248h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f168249i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ V0.D1 f168250j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f168251k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ long f168252l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ long f168253m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ long f168254n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168255o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f168256p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f168257q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function3<? super InterfaceC14902f, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, C17959M0 c17959m0, boolean z10, V0.D1 d12, float f10, long j10, long j11, long j12, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f168246f = function3;
            this.f168247g = modifier;
            this.f168248h = c17959m0;
            this.f168249i = z10;
            this.f168250j = d12;
            this.f168251k = f10;
            this.f168252l = j10;
            this.f168253m = j11;
            this.f168254n = j12;
            this.f168255o = function2;
            this.f168256p = i10;
            this.f168257q = i11;
        }

        public final void a(Composer composer, int i10) {
            C17957L0.b(this.f168246f, this.f168247g, this.f168248h, this.f168249i, this.f168250j, this.f168251k, this.f168252l, this.f168253m, this.f168254n, this.f168255o, composer, J0.a(this.f168256p | 1), this.f168257q);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/f;", "", "a", "(LX0/f;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.L0$f */
    static final class f extends Lambda implements Function1<X0.f, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f168258f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ z1<Float> f168259g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j10, z1<Float> z1Var) {
            super(1);
            this.f168258f = j10;
            this.f168259g = z1Var;
        }

        public final void a(X0.f fVar) {
            X0.f.i1(fVar, this.f168258f, 0L, 0L, RangesKt.n(C17957L0.d(this.f168259g), 0.0f, 1.0f), null, null, 0, 118, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.f fVar) {
            a(fVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.L0$g */
    static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f168260f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f168261g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f168262h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f168263i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(long j10, Function0<Unit> function0, boolean z10, int i10) {
            super(2);
            this.f168260f = j10;
            this.f168261g = function0;
            this.f168262h = z10;
            this.f168263i = i10;
        }

        public final void a(Composer composer, int i10) {
            C17957L0.c(this.f168260f, this.f168261g, this.f168262h, composer, J0.a(this.f168263i | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/J;", "", "<anonymous>", "(Lg1/J;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$1$1", f = "ModalBottomSheet.kt", l = {497}, m = "invokeSuspend")
    /* renamed from: x0.L0$h */
    static final class h extends SuspendLambda implements Function2<J, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f168264a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f168265b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f168266c;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/f;", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.L0$h$a */
        static final class a extends Lambda implements Function1<U0.f, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f168267f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function0<Unit> function0) {
                super(1);
                this.f168267f = function0;
            }

            public final void a(long j10) {
                this.f168267f.invoke();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(U0.f fVar) {
                a(fVar.getPackedValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Function0<Unit> function0, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f168266c = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            h hVar = new h(this.f168266c, continuation);
            hVar.f168265b = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j10, Continuation<? super Unit> continuation) {
            return ((h) create(j10, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f168264a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                J j10 = (J) this.f168265b;
                a aVar = new a(this.f168266c);
                this.f168264a = 1;
                if (C13904L.m(j10, null, null, null, aVar, this, 7, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.L0$i */
    static final class i extends Lambda implements Function1<u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f168268f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f168269g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.L0$i$a */
        static final class a extends Lambda implements Function0<Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f168270f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function0<Unit> function0) {
                super(0);
                this.f168270f = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                this.f168270f.invoke();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, Function0<Unit> function0) {
            super(1);
            this.f168268f = str;
            this.f168269g = function0;
        }

        public final void a(u uVar) {
            s.g0(uVar, this.f168268f);
            s.E(uVar, null, new a(this.f168269g), 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LH1/r;", "sheetSize", "LH1/b;", "constraints", "Lkotlin/Pair;", "Lx0/a0;", "Lx0/N0;", "a", "(JJ)Lkotlin/Pair;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.L0$j */
    static final class j extends Lambda implements Function2<r, H1.b, Pair<? extends InterfaceC17986a0<EnumC17961N0>, ? extends EnumC17961N0>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17959M0 f168271f;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx0/b0;", "Lx0/N0;", "", "a", "(Lx0/b0;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.L0$j$b */
        static final class b extends Lambda implements Function1<C17989b0<EnumC17961N0>, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ float f168272f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C17959M0 f168273g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ long f168274h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(float f10, C17959M0 c17959m0, long j10) {
                super(1);
                this.f168272f = f10;
                this.f168273g = c17959m0;
                this.f168274h = j10;
            }

            public final void a(C17989b0<EnumC17961N0> c17989b0) {
                c17989b0.a(EnumC17961N0.f168314a, this.f168272f);
                float f10 = this.f168272f / 2.0f;
                if (!this.f168273g.getIsSkipHalfExpanded() && r.f(this.f168274h) > f10) {
                    c17989b0.a(EnumC17961N0.f168316c, f10);
                }
                if (r.f(this.f168274h) != 0) {
                    c17989b0.a(EnumC17961N0.f168315b, Math.max(0.0f, this.f168272f - r.f(this.f168274h)));
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C17989b0<EnumC17961N0> c17989b0) {
                a(c17989b0);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: x0.L0$j$a */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC17961N0.values().length];
                try {
                    iArr[EnumC17961N0.f168314a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC17961N0.f168316c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC17961N0.f168315b.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(C17959M0 c17959m0) {
            super(2);
            this.f168271f = c17959m0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Pair<? extends InterfaceC17986a0<EnumC17961N0>, ? extends EnumC17961N0> invoke(r rVar, H1.b bVar) {
            return a(rVar.getPackedValue(), bVar.getValue());
        }

        public final Pair<InterfaceC17986a0<EnumC17961N0>, EnumC17961N0> a(long j10, long j11) {
            boolean z10;
            InterfaceC17986a0 interfaceC17986a0A = androidx.compose.material.a.a(new b(H1.b.k(j11), this.f168271f, j10));
            if (this.f168271f.d().o().getSize() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            EnumC17961N0 enumC17961N0E = this.f168271f.e();
            if (z10 || !interfaceC17986a0A.d(enumC17961N0E)) {
                int i10 = a.$EnumSwitchMapping$0[this.f168271f.g().ordinal()];
                if (i10 != 1) {
                    if (i10 != 2 && i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    EnumC17961N0 enumC17961N0 = EnumC17961N0.f168316c;
                    if (!interfaceC17986a0A.d(enumC17961N0)) {
                        enumC17961N0 = EnumC17961N0.f168315b;
                        if (!interfaceC17986a0A.d(enumC17961N0)) {
                            enumC17961N0 = EnumC17961N0.f168314a;
                        }
                    }
                    enumC17961N0E = enumC17961N0;
                } else {
                    enumC17961N0E = EnumC17961N0.f168314a;
                }
            }
            return TuplesKt.a(interfaceC17986a0A, enumC17961N0E);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.L0$k */
    static final class k extends Lambda implements Function1<EnumC17961N0, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final k f168275f = new k();

        k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(EnumC17961N0 enumC17961N0) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lx0/M0;", "c", "()Lx0/M0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.L0$l */
    static final class l extends Lambda implements Function0<C17959M0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC17961N0 f168276f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ H1.d f168277g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<EnumC17961N0, Boolean> f168278h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC6452i<Float> f168279i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f168280j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(EnumC17961N0 enumC17961N0, H1.d dVar, Function1<? super EnumC17961N0, Boolean> function1, InterfaceC6452i<Float> interfaceC6452i, boolean z10) {
            super(0);
            this.f168276f = enumC17961N0;
            this.f168277g = dVar;
            this.f168278h = function1;
            this.f168279i = interfaceC6452i;
            this.f168280j = z10;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C17959M0 invoke() {
            return new C17959M0(this.f168276f, this.f168277g, this.f168278h, this.f168279i, this.f168280j);
        }
    }

    private static final InterfaceC13938a a(C17997e<?> c17997e, EnumC13937z enumC13937z) {
        return new a(c17997e, enumC13937z);
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
    public static final void b(kotlin.jvm.functions.Function3<? super j0.InterfaceC14902f, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, androidx.compose.ui.Modifier r32, kotlin.C17959M0 r33, boolean r34, V0.D1 r35, float r36, long r37, long r39, long r41, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r43, androidx.compose.runtime.Composer r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 1238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17957L0.b(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, x0.M0, boolean, V0.D1, float, long, long, long, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
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
                z1<Float> z1VarD = C6443c.d(z10 ? 1.0f : 0.0f, new n0(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                String strA = s1.a(C18038r1.INSTANCE.b(), composerStartRestartGroup, 6);
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
                    modifierC = C16819m.c(modifierThen, true, (Function1) objB2);
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
                C13576j.a(modifierThen2, (Function1) objB3, composerStartRestartGroup, 0);
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

    public static final C17959M0 j(EnumC17961N0 enumC17961N0, InterfaceC6452i<Float> interfaceC6452i, Function1<? super EnumC17961N0, Boolean> function1, boolean z10, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            interfaceC6452i = C17955K0.f168188a.a();
        }
        InterfaceC6452i<Float> interfaceC6452i2 = interfaceC6452i;
        Function1<? super EnumC17961N0, Boolean> function12 = (i11 & 4) != 0 ? k.f168275f : function1;
        boolean z11 = (i11 & 8) != 0 ? false : z10;
        if (ComposerKt.M()) {
            ComposerKt.U(-126412120, i10, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:277)");
        }
        H1.d dVar = (H1.d) composer.o(C6034t0.g());
        composer.startMovableGroup(976451635, enumC17961N0);
        Object[] objArr = {enumC17961N0, interfaceC6452i2, Boolean.valueOf(z11), function12, dVar};
        L0.k<C17959M0, ?> kVarA = C17959M0.INSTANCE.a(interfaceC6452i2, function12, z11, dVar);
        boolean zV = ((((i10 & 14) ^ 6) > 4 && composer.V(enumC17961N0)) || (i10 & 6) == 4) | composer.V(dVar) | ((((i10 & 896) ^ 384) > 256 && composer.V(function12)) || (i10 & 384) == 256) | composer.D(interfaceC6452i2) | ((((i10 & 7168) ^ 3072) > 2048 && composer.a(z11)) || (i10 & 3072) == 2048);
        Object objB = composer.B();
        if (zV || objB == Composer.INSTANCE.a()) {
            Object lVar = new l(enumC17961N0, dVar, function12, interfaceC6452i2, z11);
            composer.t(lVar);
            objB = lVar;
        }
        C17959M0 c17959m0 = (C17959M0) L0.c.c(objArr, kVarA, null, (Function0) objB, composer, 0, 4);
        composer.T();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c17959m0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(z1<Float> z1Var) {
        return z1Var.getValue().floatValue();
    }

    private static final Modifier i(Modifier modifier, C17959M0 c17959m0) {
        return androidx.compose.material.a.h(modifier, c17959m0.d(), EnumC13937z.f131419a, new j(c17959m0));
    }
}
