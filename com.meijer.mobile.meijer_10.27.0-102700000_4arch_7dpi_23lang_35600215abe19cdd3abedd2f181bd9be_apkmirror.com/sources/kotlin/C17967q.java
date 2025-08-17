package kotlin;

import H1.r;
import H1.y;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.A;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.N;
import androidx.compose.ui.layout.P;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.C5892t0;
import androidx.recyclerview.widget.RecyclerView;
import f1.C13832e;
import f1.InterfaceC13828a;
import j0.C14815g;
import j0.InterfaceC14794C;
import j0.InterfaceC14814f;
import java.util.ArrayList;
import java.util.List;
import kotlin.C17965p0;
import kotlin.EnumC13827z;
import kotlin.InterfaceC6326i;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlin.math.MathKt;
import qv.C16648k;
import qv.InterfaceC16622O;
import r1.s;
import r1.u;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a=\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aç\u0001\u0010+\u001a\u00020\u00122\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0005¢\u0006\u0002\b\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00182\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u00052\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020!2\b\b\u0002\u0010'\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020#2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00120\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001am\u0010.\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020!2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0017\u0010*\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0005¢\u0006\u0002\b\u0013H\u0003ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a\u0082\u0001\u00104\u001a\u00020\u00122\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00182\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00120\u00182\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00120\u00182\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u00182\u0006\u0010&\u001a\u00020!2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00103\u001a\u00020\bH\u0003ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a#\u0010:\u001a\u0002092\n\u0010-\u001a\u0006\u0012\u0002\b\u0003062\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b:\u0010;\"\u0014\u0010=\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010<\"\u0014\u0010>\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010<\"\u0014\u0010?\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010<\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006@"}, d2 = {"Lx0/t;", "initialValue", "Lc0/i;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmStateChange", "Lx0/s;", "l", "(Lx0/t;Lc0/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lx0/s;", "bottomSheetState", "Lx0/o1;", "snackbarHostState", "Lx0/r;", "k", "(Lx0/s;Lx0/o1;Landroidx/compose/runtime/Composer;II)Lx0/r;", "Lj0/f;", "", "Lkotlin/ExtensionFunctionType;", "sheetContent", "Landroidx/compose/ui/Modifier;", "modifier", "scaffoldState", "Lkotlin/Function0;", "topBar", "snackbarHost", "floatingActionButton", "Lx0/p0;", "floatingActionButtonPosition", "sheetGesturesEnabled", "LV0/D1;", "sheetShape", "LH1/h;", "sheetElevation", "LV0/q0;", "sheetBackgroundColor", "sheetContentColor", "sheetPeekHeight", "backgroundColor", "contentColor", "Lj0/C;", "content", "b", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lx0/r;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLV0/D1;FJJFJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "state", "a", "(Lx0/s;ZLV0/D1;FJJFLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "body", "bottomSheet", "sheetOffset", "sheetState", "c", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FLkotlin/jvm/functions/Function0;ILx0/s;Landroidx/compose/runtime/Composer;I)V", "Lx0/e;", "Lf0/z;", "orientation", "Lf1/a;", "d", "(Lx0/e;Lf0/z;)Lf1/a;", "F", "FabSpacing", "BottomSheetScaffoldPositionalThreshold", "BottomSheetScaffoldVelocityThreshold", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17967q {

    /* renamed from: a, reason: collision with root package name */
    private static final float f168513a = H1.h.p(16);

    /* renamed from: b, reason: collision with root package name */
    private static final float f168514b = H1.h.p(56);

    /* renamed from: c, reason: collision with root package name */
    private static final float f168515c = H1.h.p(125);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LH1/r;", "sheetSize", "LH1/b;", "constraints", "Lkotlin/Pair;", "Lx0/a0;", "Lx0/t;", "a", "(JJ)Lkotlin/Pair;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.q$a */
    static final class a extends Lambda implements Function2<r, H1.b, Pair<? extends InterfaceC17920a0<EnumC17975t>, ? extends EnumC17975t>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17973s f168516f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f168517g;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx0/b0;", "Lx0/t;", "", "a", "(Lx0/b0;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.q$a$b */
        static final class b extends Lambda implements Function1<C17923b0<EnumC17975t>, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f168518f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ float f168519g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ float f168520h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(int i10, float f10, float f11) {
                super(1);
                this.f168518f = i10;
                this.f168519g = f10;
                this.f168520h = f11;
            }

            public final void a(C17923b0<EnumC17975t> c17923b0) {
                c17923b0.a(EnumC17975t.f168664a, this.f168518f - this.f168519g);
                float f10 = this.f168520h;
                if (f10 <= 0.0f || f10 == this.f168519g) {
                    return;
                }
                c17923b0.a(EnumC17975t.f168665b, this.f168518f - f10);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C17923b0<EnumC17975t> c17923b0) {
                a(c17923b0);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: x0.q$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C2691a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC17975t.values().length];
                try {
                    iArr[EnumC17975t.f168664a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC17975t.f168665b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C17973s c17973s, float f10) {
            super(2);
            this.f168516f = c17973s;
            this.f168517g = f10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Pair<? extends InterfaceC17920a0<EnumC17975t>, ? extends EnumC17975t> invoke(r rVar, H1.b bVar) {
            return a(rVar.getPackedValue(), bVar.getValue());
        }

        public final Pair<InterfaceC17920a0<EnumC17975t>, EnumC17975t> a(long j10, long j11) {
            EnumC17975t enumC17975t;
            InterfaceC17920a0 interfaceC17920a0A = androidx.compose.material.a.a(new b(H1.b.k(j11), this.f168517g, r.f(j10)));
            int i10 = C2691a.$EnumSwitchMapping$0[this.f168516f.c().x().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    enumC17975t = EnumC17975t.f168665b;
                    if (!interfaceC17920a0A.d(enumC17975t)) {
                        enumC17975t = EnumC17975t.f168664a;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                enumC17975t = EnumC17975t.f168664a;
            }
            return TuplesKt.a(interfaceC17920a0A, enumC17975t);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.q$b */
    static final class b extends Lambda implements Function1<u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17973s f168521f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f168522g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.q$b$a */
        static final class a extends Lambda implements Function0<Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C17973s f168523f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f168524g;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1$1$1", f = "BottomSheetScaffold.kt", l = {423}, m = "invokeSuspend")
            /* renamed from: x0.q$b$a$a, reason: collision with other inner class name */
            static final class C2692a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f168525a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17973s f168526b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2692a(C17973s c17973s, Continuation<? super C2692a> continuation) {
                    super(2, continuation);
                    this.f168526b = c17973s;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C2692a(this.f168526b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((C2692a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f168525a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17973s c17973s = this.f168526b;
                        this.f168525a = 1;
                        if (c17973s.b(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C17973s c17973s, InterfaceC16622O interfaceC16622O) {
                super(0);
                this.f168523f = c17973s;
                this.f168524g = interfaceC16622O;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                if (this.f168523f.c().r().invoke(EnumC17975t.f168665b).booleanValue()) {
                    C16648k.d(this.f168524g, null, null, new C2692a(this.f168523f, null), 3, null);
                }
                return Boolean.TRUE;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.q$b$b, reason: collision with other inner class name */
        static final class C2693b extends Lambda implements Function0<Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C17973s f168527f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f168528g;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1$2$1", f = "BottomSheetScaffold.kt", l = {430}, m = "invokeSuspend")
            /* renamed from: x0.q$b$b$a */
            static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f168529a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17973s f168530b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(C17973s c17973s, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f168530b = c17973s;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new a(this.f168530b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f168529a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17973s c17973s = this.f168530b;
                        this.f168529a = 1;
                        if (c17973s.a(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2693b(C17973s c17973s, InterfaceC16622O interfaceC16622O) {
                super(0);
                this.f168527f = c17973s;
                this.f168528g = interfaceC16622O;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                if (this.f168527f.c().r().invoke(EnumC17975t.f168664a).booleanValue()) {
                    C16648k.d(this.f168528g, null, null, new a(this.f168527f, null), 3, null);
                }
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C17973s c17973s, InterfaceC16622O interfaceC16622O) {
            super(1);
            this.f168521f = c17973s;
            this.f168522g = interfaceC16622O;
        }

        public final void a(u uVar) {
            if (this.f168521f.c().o().getSize() > 1) {
                if (this.f168521f.f()) {
                    s.q(uVar, null, new a(this.f168521f, this.f168522g), 1, null);
                } else {
                    s.f(uVar, null, new C2693b(this.f168521f, this.f168522g), 1, null);
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
    /* renamed from: x0.q$c */
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14814f, Composer, Integer, Unit> f168531f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function3<? super InterfaceC14814f, ? super Composer, ? super Integer, Unit> function3) {
            super(2);
            this.f168531f = function3;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2055704138, i10, -1, "androidx.compose.material.BottomSheet.<anonymous> (BottomSheetScaffold.kt:440)");
            }
            Function3<InterfaceC14814f, Composer, Integer, Unit> function3 = this.f168531f;
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
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
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
    /* renamed from: x0.q$d */
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17973s f168532f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f168533g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ V0.D1 f168534h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f168535i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f168536j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ long f168537k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ float f168538l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Modifier f168539m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14814f, Composer, Integer, Unit> f168540n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f168541o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f168542p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(C17973s c17973s, boolean z10, V0.D1 d12, float f10, long j10, long j11, float f11, Modifier modifier, Function3<? super InterfaceC14814f, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f168532f = c17973s;
            this.f168533g = z10;
            this.f168534h = d12;
            this.f168535i = f10;
            this.f168536j = j10;
            this.f168537k = j11;
            this.f168538l = f11;
            this.f168539m = modifier;
            this.f168540n = function3;
            this.f168541o = i10;
            this.f168542p = i11;
        }

        public final void a(Composer composer, int i10) {
            C17967q.a(this.f168532f, this.f168533g, this.f168534h, this.f168535i, this.f168536j, this.f168537k, this.f168538l, this.f168539m, this.f168540n, composer, J0.a(this.f168541o | 1), this.f168542p);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.q$e */
    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17970r f168543f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168544g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168545h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f168546i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f168547j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14794C, Composer, Integer, Unit> f168548k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f168549l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ V0.D1 f168550m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ float f168551n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ long f168552o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ long f168553p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14814f, Composer, Integer, Unit> f168554q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function3<C17963o1, Composer, Integer, Unit> f168555r;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.q$e$a */
        static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function3<InterfaceC14794C, Composer, Integer, Unit> f168556f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ float f168557g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function3<? super InterfaceC14794C, ? super Composer, ? super Integer, Unit> function3, float f10) {
                super(2);
                this.f168556f = function3;
                this.f168557g = f10;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1143451324, i10, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:340)");
                }
                this.f168556f.invoke(D.e(0.0f, 0.0f, 0.0f, this.f168557g, 7, null), composer, 0);
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

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: x0.q$e$b */
        static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f168558f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C17970r f168559g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ float f168560h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ V0.D1 f168561i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ float f168562j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ long f168563k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ long f168564l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ Function3<InterfaceC14814f, Composer, Integer, Unit> f168565m;

            public final void a(Composer composer, int i10) {
                Modifier modifierB;
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1856649243, i10, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:342)");
                }
                if (this.f168558f) {
                    composer.startReplaceGroup(981757373);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    boolean zV = composer.V(this.f168559g.getBottomSheetState().c());
                    C17970r c17970r = this.f168559g;
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = C17967q.d(c17970r.getBottomSheetState().c(), EnumC13827z.f130585a);
                        composer.t(objB);
                    }
                    modifierB = androidx.compose.ui.input.nestedscroll.a.b(companion, (InterfaceC13828a) objB, null, 2, null);
                    composer.P();
                } else {
                    composer.startReplaceGroup(447327754);
                    composer.P();
                    modifierB = Modifier.INSTANCE;
                }
                C17967q.a(this.f168559g.getBottomSheetState(), this.f168558f, this.f168561i, this.f168562j, this.f168563k, this.f168564l, this.f168560h, J.n(J.h(modifierB, 0.0f, 1, null), this.f168560h, 0.0f, 2, null), this.f168565m, composer, 0, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(boolean z10, C17970r c17970r, float f10, V0.D1 d12, float f11, long j10, long j11, Function3<? super InterfaceC14814f, ? super Composer, ? super Integer, Unit> function3) {
                super(2);
                this.f168558f = z10;
                this.f168559g = c17970r;
                this.f168560h = f10;
                this.f168561i = d12;
                this.f168562j = f11;
                this.f168563k = j10;
                this.f168564l = j11;
                this.f168565m = function3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.q$e$c */
        static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function3<C17963o1, Composer, Integer, Unit> f168566f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C17970r f168567g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(Function3<? super C17963o1, ? super Composer, ? super Integer, Unit> function3, C17970r c17970r) {
                super(2);
                this.f168566f = function3;
                this.f168567g = c17970r;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1011922215, i10, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:366)");
                }
                this.f168566f.invoke(this.f168567g.getSnackbarHostState(), composer, 0);
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

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.q$e$d */
        static final class d extends Lambda implements Function0<Float> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C17970r f168568f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(C17970r c17970r) {
                super(0);
                this.f168568f = c17970r;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(this.f168568f.getBottomSheetState().h());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(C17970r c17970r, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, float f10, int i10, Function3<? super InterfaceC14794C, ? super Composer, ? super Integer, Unit> function3, boolean z10, V0.D1 d12, float f11, long j10, long j11, Function3<? super InterfaceC14814f, ? super Composer, ? super Integer, Unit> function32, Function3<? super C17963o1, ? super Composer, ? super Integer, Unit> function33) {
            super(2);
            this.f168543f = c17970r;
            this.f168544g = function2;
            this.f168545h = function22;
            this.f168546i = f10;
            this.f168547j = i10;
            this.f168548k = function3;
            this.f168549l = z10;
            this.f168550m = d12;
            this.f168551n = f11;
            this.f168552o = j10;
            this.f168553p = j11;
            this.f168554q = function32;
            this.f168555r = function33;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-131096268, i10, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:338)");
            }
            C17973s c17973sA = this.f168543f.getBottomSheetState();
            Function2<Composer, Integer, Unit> function2 = this.f168544g;
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(1143451324, true, new a(this.f168548k, this.f168546i), composer, 54);
            ComposableLambda composableLambdaC2 = ComposableLambdaKt.c(1856649243, true, new b(this.f168549l, this.f168543f, this.f168546i, this.f168550m, this.f168551n, this.f168552o, this.f168553p, this.f168554q), composer, 54);
            Function2<Composer, Integer, Unit> function22 = this.f168545h;
            ComposableLambda composableLambdaC3 = ComposableLambdaKt.c(-1011922215, true, new c(this.f168555r, this.f168543f), composer, 54);
            float f10 = this.f168546i;
            boolean zV = composer.V(this.f168543f);
            C17970r c17970r = this.f168543f;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new d(c17970r);
                composer.t(objB);
            }
            C17967q.c(function2, composableLambdaC, composableLambdaC2, function22, composableLambdaC3, f10, (Function0) objB, this.f168547j, c17973sA, composer, 25008);
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
    /* renamed from: x0.q$f */
    static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14814f, Composer, Integer, Unit> f168569f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f168570g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C17970r f168571h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168572i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function3<C17963o1, Composer, Integer, Unit> f168573j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168574k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f168575l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f168576m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ V0.D1 f168577n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ float f168578o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ long f168579p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ long f168580q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ float f168581r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ long f168582s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ long f168583t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14794C, Composer, Integer, Unit> f168584u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f168585v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f168586w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ int f168587x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Function3<? super InterfaceC14814f, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, C17970r c17970r, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super C17963o1, ? super Composer, ? super Integer, Unit> function32, Function2<? super Composer, ? super Integer, Unit> function22, int i10, boolean z10, V0.D1 d12, float f10, long j10, long j11, float f11, long j12, long j13, Function3<? super InterfaceC14794C, ? super Composer, ? super Integer, Unit> function33, int i11, int i12, int i13) {
            super(2);
            this.f168569f = function3;
            this.f168570g = modifier;
            this.f168571h = c17970r;
            this.f168572i = function2;
            this.f168573j = function32;
            this.f168574k = function22;
            this.f168575l = i10;
            this.f168576m = z10;
            this.f168577n = d12;
            this.f168578o = f10;
            this.f168579p = j10;
            this.f168580q = j11;
            this.f168581r = f11;
            this.f168582s = j12;
            this.f168583t = j13;
            this.f168584u = function33;
            this.f168585v = i11;
            this.f168586w = i12;
            this.f168587x = i13;
        }

        public final void a(Composer composer, int i10) {
            C17967q.b(this.f168569f, this.f168570g, this.f168571h, this.f168572i, this.f168573j, this.f168574k, this.f168575l, this.f168576m, this.f168577n, this.f168578o, this.f168579p, this.f168580q, this.f168581r, this.f168582s, this.f168583t, this.f168584u, composer, J0.a(this.f168585v | 1), J0.a(this.f168586w), this.f168587x);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/K;", "", "Landroidx/compose/ui/layout/I;", "<name for destructuring parameter 0>", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "d", "(Landroidx/compose/ui/layout/K;Ljava/util/List;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.q$g */
    static final class g implements N {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Float> f168588a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f168589b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f168590c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C17973s f168591d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: x0.q$g$a */
        static final class a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<Float> f168592f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f168593g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ K f168594h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f168595i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ int f168596j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ float f168597k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ int f168598l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ int f168599m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ C17973s f168600n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ int f168601o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ int f168602p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ List<f0> f168603q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ List<f0> f168604r;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ List<f0> f168605s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ List<f0> f168606t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ List<f0> f168607u;

            /* renamed from: v, reason: collision with root package name */
            final /* synthetic */ int f168608v;

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: x0.q$g$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C2694a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnumC17975t.values().length];
                    try {
                        iArr[EnumC17975t.f168664a.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC17975t.f168665b.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function0<Float> function0, int i10, K k10, int i11, int i12, float f10, int i13, int i14, C17973s c17973s, int i15, int i16, List<? extends f0> list, List<? extends f0> list2, List<? extends f0> list3, List<? extends f0> list4, List<? extends f0> list5, int i17) {
                super(1);
                this.f168592f = function0;
                this.f168593g = i10;
                this.f168594h = k10;
                this.f168595i = i11;
                this.f168596j = i12;
                this.f168597k = f10;
                this.f168598l = i13;
                this.f168599m = i14;
                this.f168600n = c17973s;
                this.f168601o = i15;
                this.f168602p = i16;
                this.f168603q = list;
                this.f168604r = list2;
                this.f168605s = list3;
                this.f168606t = list4;
                this.f168607u = list5;
                this.f168608v = i17;
            }

            public final void a(f0.a aVar) {
                int i10;
                int iD = MathKt.d(this.f168592f.invoke().floatValue());
                int i11 = this.f168593g;
                C17965p0.Companion companion = C17965p0.INSTANCE;
                int iE0 = C17965p0.e(i11, companion.c()) ? this.f168594h.E0(C17967q.f168513a) : C17965p0.e(i11, companion.a()) ? (this.f168595i - this.f168596j) / 2 : (this.f168595i - this.f168596j) - this.f168594h.E0(C17967q.f168513a);
                float fI1 = this.f168594h.I1(this.f168597k);
                int i12 = this.f168598l;
                int iE02 = fI1 < ((float) (i12 / 2)) ? (iD - i12) - this.f168594h.E0(C17967q.f168513a) : iD - (i12 / 2);
                int i13 = (this.f168595i - this.f168599m) / 2;
                int i14 = C2694a.$EnumSwitchMapping$0[this.f168600n.d().ordinal()];
                if (i14 == 1) {
                    i10 = iE02 - this.f168601o;
                } else {
                    if (i14 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i10 = this.f168602p - this.f168601o;
                }
                int i15 = i10;
                List<f0> list = this.f168603q;
                int i16 = this.f168608v;
                int size = list.size();
                for (int i17 = 0; i17 < size; i17++) {
                    f0.a.l(aVar, list.get(i17), 0, i16, 0.0f, 4, null);
                }
                List<f0> list2 = this.f168604r;
                int size2 = list2.size();
                for (int i18 = 0; i18 < size2; i18++) {
                    f0.a.l(aVar, list2.get(i18), 0, 0, 0.0f, 4, null);
                }
                List<f0> list3 = this.f168605s;
                int size3 = list3.size();
                for (int i19 = 0; i19 < size3; i19++) {
                    f0.a.l(aVar, list3.get(i19), 0, 0, 0.0f, 4, null);
                }
                List<f0> list4 = this.f168606t;
                int size4 = list4.size();
                for (int i20 = 0; i20 < size4; i20++) {
                    f0.a.l(aVar, list4.get(i20), iE0, iE02, 0.0f, 4, null);
                }
                List<f0> list5 = this.f168607u;
                int size5 = list5.size();
                for (int i21 = 0; i21 < size5; i21++) {
                    f0.a.l(aVar, list5.get(i21), i13, i15, 0.0f, 4, null);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f142422a;
            }
        }

        g(Function0<Float> function0, int i10, float f10, C17973s c17973s) {
            this.f168588a = function0;
            this.f168589b = i10;
            this.f168590c = f10;
            this.f168591d = c17973s;
        }

        @Override // androidx.compose.ui.layout.N
        public final androidx.compose.ui.layout.J d(K k10, List<? extends List<? extends I>> list, long j10) {
            Object obj;
            Object obj2;
            Object obj3;
            Object obj4;
            int height;
            Object obj5;
            List<? extends I> list2 = list.get(0);
            List<? extends I> list3 = list.get(1);
            List<? extends I> list4 = list.get(2);
            List<? extends I> list5 = list.get(3);
            List<? extends I> list6 = list.get(4);
            int iL = H1.b.l(j10);
            int iK = H1.b.k(j10);
            long jD = H1.b.d(j10, 0, 0, 0, 0, 10, null);
            ArrayList arrayList = new ArrayList(list4.size());
            int size = list4.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(list4.get(i10).k0(jD));
            }
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                arrayList2.add(list2.get(i11).k0(jD));
            }
            if (arrayList2.isEmpty()) {
                obj = null;
            } else {
                obj = arrayList2.get(0);
                int height2 = ((f0) obj).getHeight();
                int iO = CollectionsKt.o(arrayList2);
                if (1 <= iO) {
                    int i12 = 1;
                    while (true) {
                        Object obj6 = arrayList2.get(i12);
                        int height3 = ((f0) obj6).getHeight();
                        if (height2 < height3) {
                            height2 = height3;
                            obj = obj6;
                        }
                        if (i12 == iO) {
                            break;
                        }
                        i12++;
                    }
                }
            }
            f0 f0Var = (f0) obj;
            int height4 = f0Var != null ? f0Var.getHeight() : 0;
            long jD2 = H1.b.d(jD, 0, 0, 0, iK - height4, 7, null);
            ArrayList arrayList3 = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                arrayList3.add(list3.get(i13).k0(jD2));
            }
            ArrayList arrayList4 = new ArrayList(list5.size());
            int size4 = list5.size();
            for (int i14 = 0; i14 < size4; i14++) {
                arrayList4.add(list5.get(i14).k0(jD));
            }
            if (arrayList4.isEmpty()) {
                obj2 = null;
            } else {
                obj2 = arrayList4.get(0);
                int width = ((f0) obj2).getWidth();
                int iO2 = CollectionsKt.o(arrayList4);
                if (1 <= iO2) {
                    int i15 = 1;
                    while (true) {
                        Object obj7 = arrayList4.get(i15);
                        int width2 = ((f0) obj7).getWidth();
                        if (width < width2) {
                            obj2 = obj7;
                            width = width2;
                        }
                        if (i15 == iO2) {
                            break;
                        }
                        i15++;
                    }
                }
            }
            f0 f0Var2 = (f0) obj2;
            int width3 = f0Var2 != null ? f0Var2.getWidth() : 0;
            if (arrayList4.isEmpty()) {
                obj3 = null;
            } else {
                obj3 = arrayList4.get(0);
                int height5 = ((f0) obj3).getHeight();
                int iO3 = CollectionsKt.o(arrayList4);
                if (1 <= iO3) {
                    int i16 = 1;
                    while (true) {
                        Object obj8 = arrayList4.get(i16);
                        int height6 = ((f0) obj8).getHeight();
                        if (height5 < height6) {
                            height5 = height6;
                            obj3 = obj8;
                        }
                        if (i16 == iO3) {
                            break;
                        }
                        i16++;
                    }
                }
            }
            f0 f0Var3 = (f0) obj3;
            int height7 = f0Var3 != null ? f0Var3.getHeight() : 0;
            ArrayList arrayList5 = new ArrayList(list6.size());
            int size5 = list6.size();
            for (int i17 = 0; i17 < size5; i17++) {
                arrayList5.add(list6.get(i17).k0(jD));
            }
            if (arrayList5.isEmpty()) {
                obj4 = null;
            } else {
                obj4 = arrayList5.get(0);
                int width4 = ((f0) obj4).getWidth();
                int iO4 = CollectionsKt.o(arrayList5);
                if (1 <= iO4) {
                    int i18 = 1;
                    while (true) {
                        Object obj9 = arrayList5.get(i18);
                        int width5 = ((f0) obj9).getWidth();
                        if (width4 < width5) {
                            obj4 = obj9;
                            width4 = width5;
                        }
                        if (i18 == iO4) {
                            break;
                        }
                        i18++;
                    }
                }
            }
            f0 f0Var4 = (f0) obj4;
            int width6 = f0Var4 != null ? f0Var4.getWidth() : 0;
            if (arrayList5.isEmpty()) {
                height = 0;
                obj5 = null;
            } else {
                height = 0;
                Object obj10 = arrayList5.get(0);
                int height8 = ((f0) obj10).getHeight();
                int iO5 = CollectionsKt.o(arrayList5);
                int i19 = 1;
                if (1 <= iO5) {
                    while (true) {
                        Object obj11 = arrayList5.get(i19);
                        int height9 = ((f0) obj11).getHeight();
                        if (height8 < height9) {
                            obj10 = obj11;
                            height8 = height9;
                        }
                        if (i19 == iO5) {
                            break;
                        }
                        i19++;
                    }
                }
                obj5 = obj10;
            }
            f0 f0Var5 = (f0) obj5;
            if (f0Var5 != null) {
                height = f0Var5.getHeight();
            }
            return K.G0(k10, iL, iK, null, new a(this.f168588a, this.f168589b, k10, iL, width3, this.f168590c, height7, width6, this.f168591d, height, iK, arrayList3, arrayList2, arrayList, arrayList4, arrayList5, height4), 4, null);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.q$h */
    static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168609f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168610g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168611h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168612i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168613j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f168614k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function0<Float> f168615l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f168616m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ C17973s f168617n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f168618o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, float f10, Function0<Float> function0, int i10, C17973s c17973s, int i11) {
            super(2);
            this.f168609f = function2;
            this.f168610g = function22;
            this.f168611h = function23;
            this.f168612i = function24;
            this.f168613j = function25;
            this.f168614k = f10;
            this.f168615l = function0;
            this.f168616m = i10;
            this.f168617n = c17973s;
            this.f168618o = i11;
        }

        public final void a(Composer composer, int i10) {
            C17967q.c(this.f168609f, this.f168610g, this.f168611h, this.f168612i, this.f168613j, this.f168614k, this.f168615l, this.f168616m, this.f168617n, composer, J0.a(this.f168618o | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0002*\u00020\u0006H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0002*\u00020\u0003H\u0003¢\u0006\u0004\b\t\u0010\bJ\"\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0096@ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0096@ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"x0/q$i", "Lf1/a;", "", "LU0/f;", "b", "(F)J", "LH1/y;", "c", "(J)F", "a", "available", "Lf1/e;", "source", "E1", "(JI)J", "consumed", "L0", "(JJI)J", "M1", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b0", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.q$i */
    public static final class i implements InterfaceC13828a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C17931e<?> f168619a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ EnumC13827z f168620b;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "BottomSheetScaffold.kt", l = {581}, m = "onPostFling-RZ2iAVY")
        /* renamed from: x0.q$i$a */
        static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            long f168621a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f168622b;

            /* renamed from: d, reason: collision with root package name */
            int f168624d;

            a(Continuation<? super a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f168622b = obj;
                this.f168624d |= Integer.MIN_VALUE;
                return i.this.b0(0L, 0L, this);
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "BottomSheetScaffold.kt", l = {572}, m = "onPreFling-QWom1Mo")
        /* renamed from: x0.q$i$b */
        static final class b extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            long f168625a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f168626b;

            /* renamed from: d, reason: collision with root package name */
            int f168628d;

            b(Continuation<? super b> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f168626b = obj;
                this.f168628d |= Integer.MIN_VALUE;
                return i.this.M1(0L, this);
            }
        }

        i(C17931e<?> c17931e, EnumC13827z enumC13827z) {
            this.f168619a = c17931e;
            this.f168620b = enumC13827z;
        }

        @JvmName
        private final float a(long j10) {
            return this.f168620b == EnumC13827z.f130586b ? U0.f.m(j10) : U0.f.n(j10);
        }

        private final long b(float f10) {
            EnumC13827z enumC13827z = this.f168620b;
            float f11 = enumC13827z == EnumC13827z.f130586b ? f10 : 0.0f;
            if (enumC13827z != EnumC13827z.f130585a) {
                f10 = 0.0f;
            }
            return U0.g.a(f11, f10);
        }

        @JvmName
        private final float c(long j10) {
            return this.f168620b == EnumC13827z.f130586b ? y.h(j10) : y.i(j10);
        }

        @Override // f1.InterfaceC13828a
        public long L0(long consumed, long available, int source) {
            return C13832e.f(source, C13832e.INSTANCE.d()) ? b(this.f168619a.n(a(available))) : U0.f.INSTANCE.c();
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
                boolean r0 = r8 instanceof kotlin.C17967q.i.b
                if (r0 == 0) goto L13
                r0 = r8
                x0.q$i$b r0 = (kotlin.C17967q.i.b) r0
                int r1 = r0.f168628d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f168628d = r1
                goto L18
            L13:
                x0.q$i$b r0 = new x0.q$i$b
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f168626b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f168628d
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L2b
                long r6 = r0.f168625a
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
                x0.e<?> r2 = r5.f168619a
                float r2 = r2.A()
                r4 = 0
                int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r4 >= 0) goto L60
                x0.e<?> r4 = r5.f168619a
                x0.a0 r4 = r4.o()
                float r4 = r4.e()
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 <= 0) goto L60
                x0.e<?> r2 = r5.f168619a
                r0.f168625a = r6
                r0.f168628d = r3
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C17967q.i.M1(long, kotlin.coroutines.Continuation):java.lang.Object");
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
                boolean r3 = r7 instanceof kotlin.C17967q.i.a
                if (r3 == 0) goto L13
                r3 = r7
                x0.q$i$a r3 = (kotlin.C17967q.i.a) r3
                int r4 = r3.f168624d
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r4 & r0
                if (r1 == 0) goto L13
                int r4 = r4 - r0
                r3.f168624d = r4
                goto L18
            L13:
                x0.q$i$a r3 = new x0.q$i$a
                r3.<init>(r7)
            L18:
                java.lang.Object r4 = r3.f168622b
                java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r0 = r3.f168624d
                r1 = 1
                if (r0 == 0) goto L33
                if (r0 != r1) goto L2b
                long r5 = r3.f168621a
                kotlin.ResultKt.b(r4)
                goto L47
            L2b:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r4)
                throw r3
            L33:
                kotlin.ResultKt.b(r4)
                x0.e<?> r4 = r2.f168619a
                float r0 = r2.c(r5)
                r3.f168621a = r5
                r3.f168624d = r1
                java.lang.Object r3 = r4.G(r0, r3)
                if (r3 != r7) goto L47
                return r7
            L47:
                H1.y r3 = H1.y.b(r5)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C17967q.i.b0(long, long, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // f1.InterfaceC13828a
        public long E1(long available, int source) {
            float fA = a(available);
            if (fA < 0.0f && C13832e.f(source, C13832e.INSTANCE.d())) {
                return b(this.f168619a.n(fA));
            }
            return U0.f.INSTANCE.c();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.q$j */
    static final class j extends Lambda implements Function1<EnumC17975t, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final j f168629f = new j();

        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(EnumC17975t enumC17975t) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lx0/s;", "c", "()Lx0/s;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.q$k */
    static final class k extends Lambda implements Function0<C17973s> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC17975t f168630f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ H1.d f168631g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6326i<Float> f168632h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<EnumC17975t, Boolean> f168633i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(EnumC17975t enumC17975t, H1.d dVar, InterfaceC6326i<Float> interfaceC6326i, Function1<? super EnumC17975t, Boolean> function1) {
            super(0);
            this.f168630f = enumC17975t;
            this.f168631g = dVar;
            this.f168632h = interfaceC6326i;
            this.f168633i = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C17973s invoke() {
            return new C17973s(this.f168630f, this.f168631g, this.f168632h, this.f168633i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:269:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(kotlin.jvm.functions.Function3<? super j0.InterfaceC14814f, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r37, androidx.compose.ui.Modifier r38, kotlin.C17970r r39, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r40, kotlin.jvm.functions.Function3<? super kotlin.C17963o1, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r41, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r42, int r43, boolean r44, V0.D1 r45, float r46, long r47, long r49, float r51, long r52, long r54, kotlin.jvm.functions.Function3<? super j0.InterfaceC14794C, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r56, androidx.compose.runtime.Composer r57, int r58, int r59, int r60) {
        /*
            Method dump skipped, instructions count: 1025
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17967q.b(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, x0.r, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, int, boolean, V0.D1, float, long, long, float, long, long, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(kotlin.C17973s r27, boolean r28, V0.D1 r29, float r30, long r31, long r33, float r35, androidx.compose.ui.Modifier r36, kotlin.jvm.functions.Function3<? super j0.InterfaceC14814f, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17967q.a(x0.s, boolean, V0.D1, float, long, long, float, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, float f10, Function0<Float> function0, int i10, C17973s c17973s, Composer composer, int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(1411837005);
        if ((i11 & 6) == 0) {
            i12 = (composerStartRestartGroup.D(function2) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= composerStartRestartGroup.D(function22) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= composerStartRestartGroup.D(function23) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(function24) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= composerStartRestartGroup.D(function25) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= composerStartRestartGroup.b(f10) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= composerStartRestartGroup.D(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= composerStartRestartGroup.d(i10) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= composerStartRestartGroup.V(c17973s) ? 67108864 : 33554432;
        }
        if (composerStartRestartGroup.p((38347923 & i12) != 38347922, i12 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(1411837005, i12, -1, "androidx.compose.material.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:469)");
            }
            List listP = CollectionsKt.p(function2 == null ? C17882H.f166944a.b() : function2, function22, function23, function24 == null ? C17882H.f166944a.c() : function24, function25);
            boolean z10 = ((3670016 & i12) == 1048576) | ((29360128 & i12) == 8388608) | ((458752 & i12) == 131072) | ((i12 & 234881024) == 67108864);
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new g(function0, i10, f10, c17973s);
                composerStartRestartGroup.t(objB);
            }
            N n10 = (N) objB;
            Modifier.Companion companion = Modifier.INSTANCE;
            Function2<Composer, Integer, Unit> function2B = A.b(listP);
            boolean zV = composerStartRestartGroup.V(n10);
            Object objB2 = composerStartRestartGroup.B();
            if (zV || objB2 == Composer.INSTANCE.a()) {
                objB2 = P.a(n10);
                composerStartRestartGroup.t(objB2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objB2;
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicy, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B2);
            }
            D1.c(composerA, modifierE, companion2.f());
            function2B.invoke(composerStartRestartGroup, 0);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new h(function2, function22, function23, function24, function25, f10, function0, i10, c17973s, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC13828a d(C17931e<?> c17931e, EnumC13827z enumC13827z) {
        return new i(c17931e, enumC13827z);
    }

    public static final C17970r k(C17973s c17973s, C17963o1 c17963o1, Composer composer, int i10, int i11) {
        Composer composer2;
        if ((i11 & 1) != 0) {
            composer2 = composer;
            c17973s = l(EnumC17975t.f168664a, null, null, composer2, 6, 6);
        } else {
            composer2 = composer;
        }
        if ((i11 & 2) != 0) {
            Object objB = composer2.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new C17963o1();
                composer2.t(objB);
            }
            c17963o1 = (C17963o1) objB;
        }
        if (ComposerKt.M()) {
            ComposerKt.U(-1022285988, i10, -1, "androidx.compose.material.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:266)");
        }
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && composer2.V(c17973s)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && composer2.V(c17963o1)) || (i10 & 48) == 32);
        Object objB2 = composer2.B();
        if (z10 || objB2 == Composer.INSTANCE.a()) {
            objB2 = new C17970r(c17973s, c17963o1);
            composer2.t(objB2);
        }
        C17970r c17970r = (C17970r) objB2;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c17970r;
    }

    public static final C17973s l(EnumC17975t enumC17975t, InterfaceC6326i<Float> interfaceC6326i, Function1<? super EnumC17975t, Boolean> function1, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            interfaceC6326i = C17964p.f168442a.a();
        }
        if ((i11 & 4) != 0) {
            function1 = j.f168629f;
        }
        if (ComposerKt.M()) {
            ComposerKt.U(1808153344, i10, -1, "androidx.compose.material.rememberBottomSheetState (BottomSheetScaffold.kt:224)");
        }
        H1.d dVar = (H1.d) composer.o(C5892t0.g());
        Object[] objArr = {interfaceC6326i};
        L0.k<C17973s, ?> kVarA = C17973s.INSTANCE.a(interfaceC6326i, function1, dVar);
        boolean zV = ((((i10 & 14) ^ 6) > 4 && composer.V(enumC17975t)) || (i10 & 6) == 4) | composer.V(dVar) | composer.D(interfaceC6326i) | ((((i10 & 896) ^ 384) > 256 && composer.V(function1)) || (i10 & 384) == 256);
        Object objB = composer.B();
        if (zV || objB == Composer.INSTANCE.a()) {
            objB = new k(enumC17975t, dVar, interfaceC6326i, function1);
            composer.t(objB);
        }
        C17973s c17973s = (C17973s) L0.c.c(objArr, kVarA, null, (Function0) objB, composer, 0, 4);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c17973s;
    }
}
