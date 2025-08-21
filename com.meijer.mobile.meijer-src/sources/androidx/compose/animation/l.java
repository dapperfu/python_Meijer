package androidx.compose.animation;

import H1.r;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.t1;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.f0;
import kotlin.AbstractC6316q;
import kotlin.AnimationResult;
import kotlin.C6439a;
import kotlin.C6457n;
import kotlin.EnumC6447e;
import kotlin.InterfaceC6452i;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.q0;
import mv.C15809k;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB[\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012:\b\u0002\u0010\r\u001a4\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J&\u0010\u001c\u001a\u00020\u001b*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0013R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+RT\u0010\r\u001a4\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u00104\u001a\u00020\u00038\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b2\u00103R*\u00109\u001a\u00020\u00102\u0006\u00105\u001a\u00020\u00108\u0002@BX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b6\u00103\"\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R/\u0010F\u001a\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010>8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006G"}, d2 = {"Landroidx/compose/animation/l;", "Lb0/q;", "Lc0/i;", "LH1/r;", "animationSpec", "LP0/e;", "alignment", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "startSize", "endSize", "", "listener", "<init>", "(Lc0/i;LP0/e;Lkotlin/jvm/functions/Function2;)V", "LH1/b;", "default", "U2", "(J)J", "v2", "()V", "t2", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "targetSize", "K2", "o", "Lc0/i;", "N2", "()Lc0/i;", "R2", "(Lc0/i;)V", "p", "LP0/e;", "L2", "()LP0/e;", "P2", "(LP0/e;)V", "q", "Lkotlin/jvm/functions/Function2;", "O2", "()Lkotlin/jvm/functions/Function2;", "S2", "(Lkotlin/jvm/functions/Function2;)V", "r", "J", "lookaheadSize", "value", "s", "T2", "(J)V", "lookaheadConstraints", "", "t", "Z", "lookaheadConstraintsAvailable", "Landroidx/compose/animation/l$a;", "<set-?>", "u", "Landroidx/compose/runtime/l0;", "M2", "()Landroidx/compose/animation/l$a;", "Q2", "(Landroidx/compose/animation/l$a;)V", "animData", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class l extends AbstractC6316q {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private InterfaceC6452i<r> animationSpec;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private P0.e alignment;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private Function2<? super r, ? super r, Unit> listener;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadConstraintsAvailable;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private long lookaheadSize = e.c();

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private long lookaheadConstraints = H1.c.b(0, 0, 0, 0, 15, null);

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 animData = t1.e(null, null, 2, null);

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R(\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/animation/l$a;", "", "Lc0/a;", "LH1/r;", "Lc0/n;", "anim", "startSize", "<init>", "(Lc0/a;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lc0/a;", "()Lc0/a;", "b", "J", "()J", "c", "(J)V", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.animation.l$a, reason: from toString */
    public static final /* data */ class AnimData {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final C6439a<r, C6457n> anim;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private long startSize;

        public /* synthetic */ AnimData(C6439a c6439a, long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(c6439a, j10);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnimData)) {
                return false;
            }
            AnimData animData = (AnimData) other;
            return Intrinsics.e(this.anim, animData.anim) && r.e(this.startSize, animData.startSize);
        }

        public int hashCode() {
            return (this.anim.hashCode() * 31) + r.h(this.startSize);
        }

        public String toString() {
            return "AnimData(anim=" + this.anim + ", startSize=" + ((Object) r.i(this.startSize)) + ')';
        }

        private AnimData(C6439a<r, C6457n> c6439a, long j10) {
            this.anim = c6439a;
            this.startSize = j10;
        }

        public final C6439a<r, C6457n> a() {
            return this.anim;
        }

        /* renamed from: b, reason: from getter */
        public final long getStartSize() {
            return this.startSize;
        }

        public final void c(long j10) {
            this.startSize = j10;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1", f = "AnimationModifier.kt", l = {230}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48114a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AnimData f48115b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f48116c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l f48117d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AnimData animData, long j10, l lVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f48115b = animData;
            this.f48116c = j10;
            this.f48117d = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f48115b, this.f48116c, this.f48117d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b bVar;
            Function2<r, r, Unit> function2O2;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f48114a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    bVar = this;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C6439a<r, C6457n> c6439aA = this.f48115b.a();
                r rVarB = r.b(this.f48116c);
                InterfaceC6452i<r> interfaceC6452iN2 = this.f48117d.N2();
                this.f48114a = 1;
                bVar = this;
                obj = C6439a.f(c6439aA, rVarB, interfaceC6452iN2, null, null, bVar, 12, null);
                if (obj == objF) {
                    return objF;
                }
            }
            AnimationResult animationResult = (AnimationResult) obj;
            if (animationResult.getEndReason() == EnumC6447e.f60859b && (function2O2 = bVar.f48117d.O2()) != 0) {
                function2O2.invoke(r.b(bVar.f48115b.getStartSize()), animationResult.b().getValue());
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class c extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f48119g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f48120h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f48121i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ K f48122j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ f0 f48123k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j10, int i10, int i11, K k10, f0 f0Var) {
            super(1);
            this.f48119g = j10;
            this.f48120h = i10;
            this.f48121i = i11;
            this.f48122j = k10;
            this.f48123k = f0Var;
        }

        public final void a(f0.a aVar) {
            f0.a.j(aVar, this.f48123k, l.this.getAlignment().a(this.f48119g, r.c((this.f48120h << 32) | (this.f48121i & 4294967295L)), this.f48122j.getLayoutDirection()), 0.0f, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f143329a;
        }
    }

    private final void T2(long j10) {
        this.lookaheadConstraints = j10;
        this.lookaheadConstraintsAvailable = true;
    }

    private final long U2(long j10) {
        return this.lookaheadConstraintsAvailable ? this.lookaheadConstraints : j10;
    }

    /* renamed from: L2, reason: from getter */
    public final P0.e getAlignment() {
        return this.alignment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AnimData M2() {
        return (AnimData) this.animData.getValue();
    }

    public final InterfaceC6452i<r> N2() {
        return this.animationSpec;
    }

    public final Function2<r, r, Unit> O2() {
        return this.listener;
    }

    public final void P2(P0.e eVar) {
        this.alignment = eVar;
    }

    public final void Q2(AnimData animData) {
        this.animData.setValue(animData);
    }

    public final void R2(InterfaceC6452i<r> interfaceC6452i) {
        this.animationSpec = interfaceC6452i;
    }

    public final void S2(Function2<? super r, ? super r, Unit> function2) {
        this.listener = function2;
    }

    @Override // androidx.compose.ui.node.D
    public J a(K k10, I i10, long j10) {
        f0 f0VarK0;
        long jD;
        if (k10.v0()) {
            T2(j10);
            f0VarK0 = i10.k0(j10);
        } else {
            f0VarK0 = i10.k0(U2(j10));
        }
        f0 f0Var = f0VarK0;
        long jC = r.c((f0Var.getWidth() << 32) | (f0Var.getHeight() & 4294967295L));
        if (k10.v0()) {
            this.lookaheadSize = jC;
            jD = jC;
        } else {
            jD = H1.c.d(j10, K2(e.d(this.lookaheadSize) ? this.lookaheadSize : jC));
        }
        int i11 = (int) (jD >> 32);
        int i12 = (int) (jD & 4294967295L);
        return K.G0(k10, i11, i12, null, new c(jC, i11, i12, k10, f0Var), 4, null);
    }

    public l(InterfaceC6452i<r> interfaceC6452i, P0.e eVar, Function2<? super r, ? super r, Unit> function2) {
        this.animationSpec = interfaceC6452i;
        this.alignment = eVar;
        this.listener = function2;
    }

    public final long K2(long targetSize) {
        AnimData animDataM2 = M2();
        boolean z10 = true;
        if (animDataM2 != null) {
            if (r.e(targetSize, animDataM2.a().m().getPackedValue()) || animDataM2.a().p()) {
                z10 = false;
            }
            if (!r.e(targetSize, animDataM2.a().k().getPackedValue()) || z10) {
                animDataM2.c(animDataM2.a().m().getPackedValue());
                C15809k.d(j2(), null, null, new b(animDataM2, targetSize, this, null), 3, null);
            }
        } else {
            long j10 = 1;
            animDataM2 = new AnimData(new C6439a(r.b(targetSize), q0.e(r.INSTANCE), r.b(r.c((j10 & 4294967295L) | (j10 << 32))), null, 8, null), targetSize, null);
        }
        Q2(animDataM2);
        return animDataM2.a().m().getPackedValue();
    }

    @Override // androidx.compose.ui.Modifier.c
    public void t2() {
        super.t2();
        this.lookaheadSize = e.c();
        this.lookaheadConstraintsAvailable = false;
    }

    @Override // androidx.compose.ui.Modifier.c
    public void v2() {
        super.v2();
        Q2(null);
    }
}
