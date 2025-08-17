package kotlin;

import H1.y;
import P0.e;
import V0.D1;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.D;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.layout.p0;
import androidx.compose.ui.layout.r0;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.C5892t0;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d0.C13443j;
import f1.C13832e;
import f1.InterfaceC13828a;
import g1.U;
import j0.C14815g;
import java.util.ArrayList;
import java.util.List;
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
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.n0;
import qv.C16648k;
import qv.InterfaceC16622O;
import r1.C16705m;
import r1.s;
import r1.u;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001aO\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aG\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aÞ\u0001\u0010*\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\f2\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00130\u00072\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020!2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020\u001c2\b\b\u0002\u0010'\u001a\u00020!2\b\b\u0002\u0010(\u001a\u00020!2\b\b\u0002\u0010)\u001a\u00020!H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a0\u0010/\u001a\u00020\u00132\u0006\u0010,\u001a\u00020!2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010.\u001a\u00020\bH\u0003ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a3\u00103\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0003¢\u0006\u0004\b3\u00104\u001aS\u0010:\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002060\u00072\u0018\u00109\u001a\u0014\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001308H\u0003¢\u0006\u0004\b:\u0010;\u001a#\u0010A\u001a\u00020@2\n\u0010=\u001a\u0006\u0012\u0002\b\u00030<2\u0006\u0010?\u001a\u00020>H\u0000¢\u0006\u0004\bA\u0010B\"\u0014\u0010D\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010C\"\u0014\u0010F\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010C\"\u0014\u0010G\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010C\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006J²\u0006\f\u0010H\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010I\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lx0/n;", "initialValue", "LH1/d;", "density", "Lc0/i;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmValueChange", "Lx0/o1;", "snackbarHostState", "Lx0/m;", "d", "(Lx0/n;LH1/d;Lc0/i;Lkotlin/jvm/functions/Function1;Lx0/o1;)Lx0/m;", "confirmStateChange", "p", "(Lx0/n;Lc0/i;Lkotlin/jvm/functions/Function1;Lx0/o1;Landroidx/compose/runtime/Composer;II)Lx0/m;", "Lkotlin/Function0;", "", "appBar", "backLayerContent", "frontLayerContent", "Landroidx/compose/ui/Modifier;", "modifier", "scaffoldState", "snackbarHost", "gesturesEnabled", "LH1/h;", "peekHeight", "headerHeight", "persistentAppBar", "stickyFrontLayer", "LV0/q0;", "backLayerBackgroundColor", "backLayerContentColor", "LV0/D1;", "frontLayerShape", "frontLayerElevation", "frontLayerBackgroundColor", "frontLayerContentColor", "frontLayerScrimColor", "c", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lx0/m;Lkotlin/jvm/functions/Function3;ZFFZZJJLV0/D1;FJJJLandroidx/compose/runtime/Composer;III)V", "color", "onDismiss", "visible", "g", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "target", "content", "a", "(Lx0/n;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "backLayer", "LH1/b;", "calculateBackLayerConstraints", "Lkotlin/Function2;", "frontLayer", "e", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "Lx0/e;", "state", "Lf0/z;", "orientation", "Lf1/a;", "f", "(Lx0/e;Lf0/z;)Lf1/a;", "F", "AnimationSlideOffset", "b", "VelocityThreshold", "PositionalThreshold", "alpha", "animationProgress", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17952l {

    /* renamed from: a, reason: collision with root package name */
    private static final float f168177a = H1.h.p(20);

    /* renamed from: b, reason: collision with root package name */
    private static final float f168178b = H1.h.p(125);

    /* renamed from: c, reason: collision with root package name */
    private static final float f168179c = H1.h.p(56);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.l$a */
    static final class a extends Lambda implements Function3<K, I, H1.b, J> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z1<Float> f168180f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.l$a$a, reason: collision with other inner class name */
        static final class C2676a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ f0 f168181f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ float f168182g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2676a(f0 f0Var, float f10) {
                super(1);
                this.f168181f = f0Var;
                this.f168182g = f10;
            }

            public final void a(f0.a aVar) {
                aVar.g(this.f168181f, 0, 0, this.f168182g);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(z1<Float> z1Var) {
            super(3);
            this.f168180f = z1Var;
        }

        public final J a(K k10, I i10, long j10) {
            float fB = C17952l.b(this.f168180f) - 1;
            if (fB < 0.0f) {
                fB = 0.0f;
            }
            if (fB > 1.0f) {
                fB = 1.0f;
            }
            f0 f0VarK0 = i10.k0(j10);
            return K.G0(k10, f0VarK0.getWidth(), f0VarK0.getHeight(), null, new C2676a(f0VarK0, fB), 4, null);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ J invoke(K k10, I i10, H1.b bVar) {
            return a(k10, i10, bVar.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/e;", "", "a", "(Landroidx/compose/ui/graphics/e;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.l$b */
    static final class b extends Lambda implements Function1<androidx.compose.ui.graphics.e, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f168183f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ z1<Float> f168184g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f10, z1<Float> z1Var) {
            super(1);
            this.f168183f = f10;
            this.f168184g = z1Var;
        }

        public final void a(androidx.compose.ui.graphics.e eVar) {
            float f10 = 1;
            float fB = C17952l.b(this.f168184g) - f10;
            if (fB < 0.0f) {
                fB = 0.0f;
            }
            if (fB > 1.0f) {
                fB = 1.0f;
            }
            eVar.d(fB);
            eVar.e((f10 - fB) * this.f168183f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.e eVar) {
            a(eVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.l$c */
    static final class c extends Lambda implements Function3<K, I, H1.b, J> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z1<Float> f168185f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.l$c$a */
        static final class a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ f0 f168186f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ float f168187g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f0 f0Var, float f10) {
                super(1);
                this.f168186f = f0Var;
                this.f168187g = f10;
            }

            public final void a(f0.a aVar) {
                aVar.g(this.f168186f, 0, 0, this.f168187g);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f142422a;
            }
        }

        public final J a(K k10, I i10, long j10) {
            float fB = 1 - C17952l.b(this.f168185f);
            if (fB < 0.0f) {
                fB = 0.0f;
            }
            if (fB > 1.0f) {
                fB = 1.0f;
            }
            f0 f0VarK0 = i10.k0(j10);
            return K.G0(k10, f0VarK0.getWidth(), f0VarK0.getHeight(), null, new a(f0VarK0, fB), 4, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(z1<Float> z1Var) {
            super(3);
            this.f168185f = z1Var;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ J invoke(K k10, I i10, H1.b bVar) {
            return a(k10, i10, bVar.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/e;", "", "a", "(Landroidx/compose/ui/graphics/e;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.l$d */
    static final class d extends Lambda implements Function1<androidx.compose.ui.graphics.e, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f168188f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ z1<Float> f168189g;

        public final void a(androidx.compose.ui.graphics.e eVar) {
            float f10 = 1;
            float fB = f10 - C17952l.b(this.f168189g);
            if (fB < 0.0f) {
                fB = 0.0f;
            }
            if (fB > 1.0f) {
                fB = 1.0f;
            }
            eVar.d(fB);
            eVar.e((f10 - fB) * this.f168188f);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(float f10, z1<Float> z1Var) {
            super(1);
            this.f168188f = f10;
            this.f168189g = z1Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.e eVar) {
            a(eVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.l$e */
    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC17958n f168190f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168191g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168192h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f168193i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(EnumC17958n enumC17958n, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, int i10) {
            super(2);
            this.f168190f = enumC17958n;
            this.f168191g = function2;
            this.f168192h = function22;
            this.f168193i = i10;
        }

        public final void a(Composer composer, int i10) {
            C17952l.a(this.f168190f, this.f168191g, this.f168192h, composer, J0.a(this.f168193i | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.l$f */
    static final class f extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17955m f168194f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ H1.d f168195g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C17955m c17955m, H1.d dVar) {
            super(0);
            this.f168194f = c17955m;
            this.f168195g = dVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f168194f.l(this.f168195g);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.l$g */
    static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f168196f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168197g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<H1.b, H1.b> f168198h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f168199i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f168200j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f168201k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ C17955m f168202l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ C17931e<EnumC17958n> f168203m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ D1 f168204n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ long f168205o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ long f168206p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ float f168207q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ float f168208r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ float f168209s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ float f168210t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168211u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ long f168212v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ Function3<C17963o1, Composer, Integer, Unit> f168213w;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LH1/b;", "constraints", "", "backLayerHeight", "", "a", "(JFLandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: x0.l$g$a */
        static final class a extends Lambda implements Function4<H1.b, Float, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ float f168214f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ boolean f168215g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f168216h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ C17955m f168217i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ C17931e<EnumC17958n> f168218j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f168219k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ D1 f168220l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ long f168221m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ long f168222n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ float f168223o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ float f168224p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ float f168225q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ float f168226r;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f168227s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ long f168228t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ Function3<C17963o1, Composer, Integer, Unit> f168229u;

            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LH1/r;", "layoutSize", "LH1/b;", "<anonymous parameter 1>", "Lkotlin/Pair;", "Lx0/a0;", "Lx0/n;", "a", "(JJ)Lkotlin/Pair;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: x0.l$g$a$a, reason: collision with other inner class name */
            static final class C2677a extends Lambda implements Function2<H1.r, H1.b, Pair<? extends InterfaceC17920a0<EnumC17958n>, ? extends EnumC17958n>> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ float f168230f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ C17955m f168231g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ Ref.FloatRef f168232h;

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx0/b0;", "Lx0/n;", "", "a", "(Lx0/b0;)V"}, k = 3, mv = {1, 9, 0})
                /* renamed from: x0.l$g$a$a$b */
                static final class b extends Lambda implements Function1<C17923b0<EnumC17958n>, Unit> {

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ float f168233f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ float f168234g;

                    /* renamed from: h, reason: collision with root package name */
                    final /* synthetic */ float f168235h;

                    /* renamed from: i, reason: collision with root package name */
                    final /* synthetic */ Ref.FloatRef f168236i;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(float f10, float f11, float f12, Ref.FloatRef floatRef) {
                        super(1);
                        this.f168233f = f10;
                        this.f168234g = f11;
                        this.f168235h = f12;
                        this.f168236i = floatRef;
                    }

                    public final void a(C17923b0<EnumC17958n> c17923b0) {
                        float f10 = this.f168233f;
                        if (f10 != 0.0f) {
                            float f11 = this.f168234g;
                            if (f10 != f11) {
                                c17923b0.a(EnumC17958n.f168347a, f11);
                                c17923b0.a(EnumC17958n.f168348b, this.f168236i.f142832a);
                                return;
                            }
                        }
                        c17923b0.a(EnumC17958n.f168347a, this.f168235h);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(C17923b0<EnumC17958n> c17923b0) {
                        a(c17923b0);
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: x0.l$g$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C2678a {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[EnumC17958n.values().length];
                        try {
                            iArr[EnumC17958n.f168347a.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[EnumC17958n.f168348b.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2677a(float f10, C17955m c17955m, Ref.FloatRef floatRef) {
                    super(2);
                    this.f168230f = f10;
                    this.f168231g = c17955m;
                    this.f168232h = floatRef;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Pair<? extends InterfaceC17920a0<EnumC17958n>, ? extends EnumC17958n> invoke(H1.r rVar, H1.b bVar) {
                    return a(rVar.getPackedValue(), bVar.getValue());
                }

                public final Pair<InterfaceC17920a0<EnumC17958n>, EnumC17958n> a(long j10, long j11) {
                    EnumC17958n enumC17958n;
                    float f10 = H1.r.f(j10);
                    float f11 = H1.r.f(j10);
                    float f12 = this.f168230f;
                    InterfaceC17920a0 interfaceC17920a0A = androidx.compose.material.a.a(new b(f10, f12, f11 - f12, this.f168232h));
                    int i10 = C2678a.$EnumSwitchMapping$0[this.f168231g.g().ordinal()];
                    if (i10 != 1) {
                        if (i10 == 2) {
                            enumC17958n = EnumC17958n.f168348b;
                            if (!interfaceC17920a0A.d(enumC17958n)) {
                                enumC17958n = EnumC17958n.f168347a;
                            }
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        enumC17958n = EnumC17958n.f168347a;
                    }
                    return TuplesKt.a(interfaceC17920a0A, enumC17958n);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
            /* renamed from: x0.l$g$a$b */
            static final class b extends Lambda implements Function1<u, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ C17955m f168237f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ InterfaceC16622O f168238g;

                @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
                /* renamed from: x0.l$g$a$b$a, reason: collision with other inner class name */
                static final class C2679a extends Lambda implements Function0<Boolean> {

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ C17955m f168239f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ InterfaceC16622O f168240g;

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
                    @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1$1$1", f = "BackdropScaffold.kt", l = {443}, m = "invokeSuspend")
                    /* renamed from: x0.l$g$a$b$a$a, reason: collision with other inner class name */
                    static final class C2680a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f168241a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ C17955m f168242b;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C2680a(C17955m c17955m, Continuation<? super C2680a> continuation) {
                            super(2, continuation);
                            this.f168242b = c17955m;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C2680a(this.f168242b, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                            return ((C2680a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object objF = IntrinsicsKt.f();
                            int i10 = this.f168241a;
                            if (i10 != 0) {
                                if (i10 == 1) {
                                    ResultKt.b(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.b(obj);
                                C17955m c17955m = this.f168242b;
                                this.f168241a = 1;
                                if (c17955m.k(this) == objF) {
                                    return objF;
                                }
                            }
                            return Unit.f142422a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C2679a(C17955m c17955m, InterfaceC16622O interfaceC16622O) {
                        super(0);
                        this.f168239f = c17955m;
                        this.f168240g = interfaceC16622O;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: c, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke() {
                        if (this.f168239f.d().invoke(EnumC17958n.f168348b).booleanValue()) {
                            C16648k.d(this.f168240g, null, null, new C2680a(this.f168239f, null), 3, null);
                        }
                        return Boolean.TRUE;
                    }
                }

                @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
                /* renamed from: x0.l$g$a$b$b, reason: collision with other inner class name */
                static final class C2681b extends Lambda implements Function0<Boolean> {

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ C17955m f168243f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ InterfaceC16622O f168244g;

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
                    @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1$2$1", f = "BackdropScaffold.kt", l = {450}, m = "invokeSuspend")
                    /* renamed from: x0.l$g$a$b$b$a, reason: collision with other inner class name */
                    static final class C2682a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f168245a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ C17955m f168246b;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C2682a(C17955m c17955m, Continuation<? super C2682a> continuation) {
                            super(2, continuation);
                            this.f168246b = c17955m;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C2682a(this.f168246b, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                            return ((C2682a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object objF = IntrinsicsKt.f();
                            int i10 = this.f168245a;
                            if (i10 != 0) {
                                if (i10 == 1) {
                                    ResultKt.b(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.b(obj);
                                C17955m c17955m = this.f168246b;
                                this.f168245a = 1;
                                if (c17955m.b(this) == objF) {
                                    return objF;
                                }
                            }
                            return Unit.f142422a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C2681b(C17955m c17955m, InterfaceC16622O interfaceC16622O) {
                        super(0);
                        this.f168243f = c17955m;
                        this.f168244g = interfaceC16622O;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: c, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke() {
                        if (this.f168243f.d().invoke(EnumC17958n.f168347a).booleanValue()) {
                            C16648k.d(this.f168244g, null, null, new C2682a(this.f168243f, null), 3, null);
                        }
                        return Boolean.TRUE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C17955m c17955m, InterfaceC16622O interfaceC16622O) {
                    super(1);
                    this.f168237f = c17955m;
                    this.f168238g = interfaceC16622O;
                }

                public final void a(u uVar) {
                    if (this.f168237f.h()) {
                        s.f(uVar, null, new C2679a(this.f168237f, this.f168238g), 1, null);
                    } else {
                        s.q(uVar, null, new C2681b(this.f168237f, this.f168238g), 1, null);
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
            /* renamed from: x0.l$g$a$c */
            static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ float f168247f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ Function2<Composer, Integer, Unit> f168248g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ long f168249h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ boolean f168250i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ C17955m f168251j;

                /* renamed from: k, reason: collision with root package name */
                final /* synthetic */ InterfaceC16622O f168252k;

                @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: x0.l$g$a$c$a, reason: collision with other inner class name */
                static final class C2683a extends Lambda implements Function0<Unit> {

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ boolean f168253f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ C17955m f168254g;

                    /* renamed from: h, reason: collision with root package name */
                    final /* synthetic */ InterfaceC16622O f168255h;

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
                    @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$3$1$1$1$1", f = "BackdropScaffold.kt", l = {467}, m = "invokeSuspend")
                    /* renamed from: x0.l$g$a$c$a$a, reason: collision with other inner class name */
                    static final class C2684a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f168256a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ C17955m f168257b;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C2684a(C17955m c17955m, Continuation<? super C2684a> continuation) {
                            super(2, continuation);
                            this.f168257b = c17955m;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C2684a(this.f168257b, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                            return ((C2684a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object objF = IntrinsicsKt.f();
                            int i10 = this.f168256a;
                            if (i10 != 0) {
                                if (i10 == 1) {
                                    ResultKt.b(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.b(obj);
                                C17955m c17955m = this.f168257b;
                                this.f168256a = 1;
                                if (c17955m.b(this) == objF) {
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
                    C2683a(boolean z10, C17955m c17955m, InterfaceC16622O interfaceC16622O) {
                        super(0);
                        this.f168253f = z10;
                        this.f168254g = c17955m;
                        this.f168255h = interfaceC16622O;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (this.f168253f && this.f168254g.d().invoke(EnumC17958n.f168347a).booleanValue()) {
                            C16648k.d(this.f168255h, null, null, new C2684a(this.f168254g, null), 3, null);
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                c(float f10, Function2<? super Composer, ? super Integer, Unit> function2, long j10, boolean z10, C17955m c17955m, InterfaceC16622O interfaceC16622O) {
                    super(2);
                    this.f168247f = f10;
                    this.f168248g = function2;
                    this.f168249h = j10;
                    this.f168250i = z10;
                    this.f168251j = c17955m;
                    this.f168252k = interfaceC16622O;
                }

                public final void a(Composer composer, int i10) {
                    if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1946125143, i10, -1, "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous>.<anonymous> (BackdropScaffold.kt:460)");
                    }
                    Modifier modifierM = D.m(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, this.f168247f, 7, null);
                    Function2<Composer, Integer, Unit> function2 = this.f168248g;
                    long j10 = this.f168249h;
                    boolean z10 = this.f168250i;
                    C17955m c17955m = this.f168251j;
                    InterfaceC16622O interfaceC16622O = this.f168252k;
                    MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
                    int iA = C5717f.a(composer, 0);
                    InterfaceC5742s interfaceC5742sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, modifierM);
                    InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
                    Function0<InterfaceC5811g> function0A = companion.a();
                    if (composer.k() == null) {
                        C5717f.c();
                    }
                    composer.F();
                    if (composer.h()) {
                        composer.I(function0A);
                    } else {
                        composer.s();
                    }
                    Composer composerA = androidx.compose.runtime.D1.a(composer);
                    androidx.compose.runtime.D1.c(composerA, measurePolicyG, companion.e());
                    androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                    if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                    C5664j c5664j = C5664j.f48612a;
                    function2.invoke(composer, 0);
                    boolean zA = composer.a(z10) | composer.V(c17955m) | composer.D(interfaceC16622O);
                    Object objB = composer.B();
                    if (zA || objB == Composer.INSTANCE.a()) {
                        objB = new C2683a(z10, c17955m, interfaceC16622O);
                        composer.t(objB);
                    }
                    C17952l.g(j10, (Function0) objB, c17955m.g() == EnumC17958n.f168348b, composer, 0);
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(float f10, boolean z10, boolean z11, C17955m c17955m, C17931e<EnumC17958n> c17931e, InterfaceC16622O interfaceC16622O, D1 d12, long j10, long j11, float f11, float f12, float f13, float f14, Function2<? super Composer, ? super Integer, Unit> function2, long j12, Function3<? super C17963o1, ? super Composer, ? super Integer, Unit> function3) {
                super(4);
                this.f168214f = f10;
                this.f168215g = z10;
                this.f168216h = z11;
                this.f168217i = c17955m;
                this.f168218j = c17931e;
                this.f168219k = interfaceC16622O;
                this.f168220l = d12;
                this.f168221m = j10;
                this.f168222n = j11;
                this.f168223o = f11;
                this.f168224p = f12;
                this.f168225q = f13;
                this.f168226r = f14;
                this.f168227s = function2;
                this.f168228t = j12;
                this.f168229u = function3;
            }

            public final void a(long j10, float f10, Composer composer, int i10) {
                int i11;
                if ((i10 & 6) == 0) {
                    i11 = i10 | (composer.e(j10) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i10 & 48) == 0) {
                    i11 |= composer.b(f10) ? 32 : 16;
                }
                if (!composer.p((i11 & 147) != 146, i11 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(516504859, i11, -1, "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous> (BackdropScaffold.kt:399)");
                }
                Ref.FloatRef floatRef = new Ref.FloatRef();
                float fK = H1.b.k(j10) - this.f168214f;
                floatRef.f142832a = fK;
                if (this.f168215g) {
                    floatRef.f142832a = Math.min(fK, f10);
                }
                Modifier modifierB = this.f168216h ? androidx.compose.ui.input.nestedscroll.a.b(Modifier.INSTANCE, this.f168217i.e(), null, 2, null) : Modifier.INSTANCE;
                C17931e<EnumC17958n> c17931e = this.f168218j;
                EnumC13827z enumC13827z = EnumC13827z.f130585a;
                Modifier modifierE = androidx.compose.material.a.e(androidx.compose.material.a.h(modifierB, c17931e, enumC13827z, new C2677a(this.f168225q, this.f168217i, floatRef)), this.f168218j, enumC13827z, this.f168216h, false, null, false, 56, null);
                boolean zV = composer.V(this.f168217i) | composer.D(this.f168219k);
                C17955m c17955m = this.f168217i;
                InterfaceC16622O interfaceC16622O = this.f168219k;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new b(c17955m, interfaceC16622O);
                    composer.t(objB);
                }
                t1.a(C16705m.d(modifierE, false, (Function1) objB, 1, null), this.f168220l, this.f168221m, this.f168222n, null, this.f168223o, ComposableLambdaKt.c(1946125143, true, new c(this.f168226r, this.f168227s, this.f168228t, this.f168216h, this.f168217i, this.f168219k), composer, 54), composer, 1572864, 16);
                Modifier modifierM = D.m(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, (this.f168217i.i() && floatRef.f142832a == ((float) H1.b.k(j10)) - this.f168214f) ? this.f168224p : H1.h.p(0), 7, null);
                P0.e eVarB = P0.e.INSTANCE.b();
                Function3<C17963o1, Composer, Integer, Unit> function3 = this.f168229u;
                C17955m c17955m2 = this.f168217i;
                MeasurePolicy measurePolicyG = C5662h.g(eVarB, false);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierM);
                InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.h()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyG, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE2, companion.f());
                C5664j c5664j = C5664j.f48612a;
                function3.invoke(c17955m2.f(), composer, 0);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(H1.b bVar, Float f10, Composer composer, Integer num) {
                a(bVar.getValue(), f10.floatValue(), composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function1<? super H1.b, H1.b> function1, float f10, boolean z10, boolean z11, C17955m c17955m, C17931e<EnumC17958n> c17931e, D1 d12, long j10, long j11, float f11, float f12, float f13, float f14, Function2<? super Composer, ? super Integer, Unit> function22, long j12, Function3<? super C17963o1, ? super Composer, ? super Integer, Unit> function3) {
            super(2);
            this.f168196f = modifier;
            this.f168197g = function2;
            this.f168198h = function1;
            this.f168199i = f10;
            this.f168200j = z10;
            this.f168201k = z11;
            this.f168202l = c17955m;
            this.f168203m = c17931e;
            this.f168204n = d12;
            this.f168205o = j10;
            this.f168206p = j11;
            this.f168207q = f11;
            this.f168208r = f12;
            this.f168209s = f13;
            this.f168210t = f14;
            this.f168211u = function22;
            this.f168212v = j12;
            this.f168213w = function3;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1961515015, i10, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:395)");
            }
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = androidx.compose.runtime.J.k(EmptyCoroutineContext.f142646a, composer);
                composer.t(objB);
            }
            C17952l.e(androidx.compose.foundation.layout.J.f(this.f168196f, 0.0f, 1, null), this.f168197g, this.f168198h, ComposableLambdaKt.c(516504859, true, new a(this.f168199i, this.f168200j, this.f168201k, this.f168202l, this.f168203m, (InterfaceC16622O) objB, this.f168204n, this.f168205o, this.f168206p, this.f168207q, this.f168208r, this.f168209s, this.f168210t, this.f168211u, this.f168212v, this.f168213w), composer, 54), composer, 3120);
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
    /* renamed from: x0.l$h */
    static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168258f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168259g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168260h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Modifier f168261i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C17955m f168262j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function3<C17963o1, Composer, Integer, Unit> f168263k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f168264l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ float f168265m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ float f168266n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f168267o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f168268p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ long f168269q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ long f168270r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ D1 f168271s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ float f168272t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ long f168273u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ long f168274v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ long f168275w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ int f168276x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ int f168277y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ int f168278z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Modifier modifier, C17955m c17955m, Function3<? super C17963o1, ? super Composer, ? super Integer, Unit> function3, boolean z10, float f10, float f11, boolean z11, boolean z12, long j10, long j11, D1 d12, float f12, long j12, long j13, long j14, int i10, int i11, int i12) {
            super(2);
            this.f168258f = function2;
            this.f168259g = function22;
            this.f168260h = function23;
            this.f168261i = modifier;
            this.f168262j = c17955m;
            this.f168263k = function3;
            this.f168264l = z10;
            this.f168265m = f10;
            this.f168266n = f11;
            this.f168267o = z11;
            this.f168268p = z12;
            this.f168269q = j10;
            this.f168270r = j11;
            this.f168271s = d12;
            this.f168272t = f12;
            this.f168273u = j12;
            this.f168274v = j13;
            this.f168275w = j14;
            this.f168276x = i10;
            this.f168277y = i11;
            this.f168278z = i12;
        }

        public final void a(Composer composer, int i10) {
            C17952l.c(this.f168258f, this.f168259g, this.f168260h, this.f168261i, this.f168262j, this.f168263k, this.f168264l, this.f168265m, this.f168266n, this.f168267o, this.f168268p, this.f168269q, this.f168270r, this.f168271s, this.f168272t, this.f168273u, this.f168274v, this.f168275w, composer, J0.a(this.f168276x | 1), J0.a(this.f168277y), this.f168278z);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.l$i */
    static final class i extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f168279f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C17955m f168280g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168281h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168282i;

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(461235665, i10, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:374)");
            }
            if (this.f168279f) {
                composer.startReplaceGroup(1665275251);
                Function2<Composer, Integer, Unit> function2 = this.f168281h;
                Function2<Composer, Integer, Unit> function22 = this.f168282i;
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                C14815g c14815g = C14815g.f139108a;
                function2.invoke(composer, 0);
                function22.invoke(composer, 0);
                composer.v();
                composer.P();
            } else {
                composer.startReplaceGroup(1665408644);
                C17952l.a(this.f168280g.c().x(), this.f168281h, this.f168282i, composer, 0);
                composer.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(boolean z10, C17955m c17955m, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22) {
            super(2);
            this.f168279f = z10;
            this.f168280g = c17955m;
            this.f168281h = function2;
            this.f168282i = function22;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH1/b;", "it", "a", "(J)J"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.l$j */
    static final class j extends Lambda implements Function1<H1.b, H1.b> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f168283f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(float f10) {
            super(1);
            this.f168283f = f10;
        }

        public final long a(long j10) {
            return H1.c.j(H1.b.d(j10, 0, 0, 0, 0, 10, null), 0, -MathKt.d(this.f168283f), 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ H1.b invoke(H1.b bVar) {
            return H1.b.a(a(bVar.getValue()));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/r0;", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/r0;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.l$k */
    static final class k extends Lambda implements Function2<r0, H1.b, J> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168284f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<H1.b, H1.b> f168285g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function4<H1.b, Float, Composer, Integer, Unit> f168286h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: x0.l$k$a */
        static final class a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ f0 f168287f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List<f0> f168288g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(f0 f0Var, List<? extends f0> list) {
                super(1);
                this.f168287f = f0Var;
                this.f168288g = list;
            }

            public final void a(f0.a aVar) {
                f0.a.l(aVar, this.f168287f, 0, 0, 0.0f, 4, null);
                List<f0> list = this.f168288g;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    f0.a.l(aVar, list.get(i10), 0, 0, 0.0f, 4, null);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.l$k$b */
        static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function4<H1.b, Float, Composer, Integer, Unit> f168289f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ long f168290g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ float f168291h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(Function4<? super H1.b, ? super Float, ? super Composer, ? super Integer, Unit> function4, long j10, float f10) {
                super(2);
                this.f168289f = function4;
                this.f168290g = j10;
                this.f168291h = f10;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1222642649, i10, -1, "androidx.compose.material.BackdropStack.<anonymous>.<anonymous>.<anonymous> (BackdropScaffold.kt:583)");
                }
                this.f168289f.invoke(H1.b.a(this.f168290g), Float.valueOf(this.f168291h), composer, 0);
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
        k(Function2<? super Composer, ? super Integer, Unit> function2, Function1<? super H1.b, H1.b> function1, Function4<? super H1.b, ? super Float, ? super Composer, ? super Integer, Unit> function4) {
            super(2);
            this.f168284f = function2;
            this.f168285g = function1;
            this.f168286h = function4;
        }

        public final J a(r0 r0Var, long j10) {
            f0 f0VarK0 = ((I) CollectionsKt.s0(r0Var.Z(EnumC17946j.f167996a, this.f168284f))).k0(this.f168285g.invoke(H1.b.a(j10)).getValue());
            List<I> listZ = r0Var.Z(EnumC17946j.f167997b, ComposableLambdaKt.composableLambdaInstance(-1222642649, true, new b(this.f168286h, j10, f0VarK0.getHeight())));
            ArrayList arrayList = new ArrayList(listZ.size());
            int size = listZ.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(listZ.get(i10).k0(j10));
            }
            int iMax = Math.max(H1.b.n(j10), f0VarK0.getWidth());
            int iMax2 = Math.max(H1.b.m(j10), f0VarK0.getHeight());
            int size2 = arrayList.size();
            int iMax3 = iMax2;
            int iMax4 = iMax;
            for (int i11 = 0; i11 < size2; i11++) {
                f0 f0Var = (f0) arrayList.get(i11);
                iMax4 = Math.max(iMax4, f0Var.getWidth());
                iMax3 = Math.max(iMax3, f0Var.getHeight());
            }
            return K.G0(r0Var, iMax4, iMax3, null, new a(f0VarK0, arrayList), 4, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ J invoke(r0 r0Var, H1.b bVar) {
            return a(r0Var, bVar.getValue());
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.l$l, reason: collision with other inner class name */
    static final class C2685l extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f168292f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168293g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<H1.b, H1.b> f168294h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function4<H1.b, Float, Composer, Integer, Unit> f168295i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f168296j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2685l(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function1<? super H1.b, H1.b> function1, Function4<? super H1.b, ? super Float, ? super Composer, ? super Integer, Unit> function4, int i10) {
            super(2);
            this.f168292f = modifier;
            this.f168293g = function2;
            this.f168294h = function1;
            this.f168295i = function4;
            this.f168296j = i10;
        }

        public final void a(Composer composer, int i10) {
            C17952l.e(this.f168292f, this.f168293g, this.f168294h, this.f168295i, composer, J0.a(this.f168296j | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0002*\u00020\u0006H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0002*\u00020\u0003H\u0003¢\u0006\u0004\b\t\u0010\bJ\"\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0096@ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0096@ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"x0/l$m", "Lf1/a;", "", "LU0/f;", "b", "(F)J", "LH1/y;", "c", "(J)F", "a", "available", "Lf1/e;", "source", "E1", "(JI)J", "consumed", "L0", "(JJI)J", "M1", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b0", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.l$m */
    public static final class m implements InterfaceC13828a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C17931e<?> f168297a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ EnumC13827z f168298b;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1", f = "BackdropScaffold.kt", l = {680}, m = "onPostFling-RZ2iAVY")
        /* renamed from: x0.l$m$a */
        static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            long f168299a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f168300b;

            /* renamed from: d, reason: collision with root package name */
            int f168302d;

            a(Continuation<? super a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f168300b = obj;
                this.f168302d |= Integer.MIN_VALUE;
                return m.this.b0(0L, 0L, this);
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1", f = "BackdropScaffold.kt", l = {671}, m = "onPreFling-QWom1Mo")
        /* renamed from: x0.l$m$b */
        static final class b extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            long f168303a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f168304b;

            /* renamed from: d, reason: collision with root package name */
            int f168306d;

            b(Continuation<? super b> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f168304b = obj;
                this.f168306d |= Integer.MIN_VALUE;
                return m.this.M1(0L, this);
            }
        }

        m(C17931e<?> c17931e, EnumC13827z enumC13827z) {
            this.f168297a = c17931e;
            this.f168298b = enumC13827z;
        }

        @JvmName
        private final float a(long j10) {
            return this.f168298b == EnumC13827z.f130586b ? U0.f.m(j10) : U0.f.n(j10);
        }

        private final long b(float f10) {
            EnumC13827z enumC13827z = this.f168298b;
            float f11 = enumC13827z == EnumC13827z.f130586b ? f10 : 0.0f;
            if (enumC13827z != EnumC13827z.f130585a) {
                f10 = 0.0f;
            }
            return U0.g.a(f11, f10);
        }

        @JvmName
        private final float c(long j10) {
            return this.f168298b == EnumC13827z.f130586b ? y.h(j10) : y.i(j10);
        }

        @Override // f1.InterfaceC13828a
        public long L0(long consumed, long available, int source) {
            return C13832e.f(source, C13832e.INSTANCE.d()) ? b(this.f168297a.n(a(available))) : U0.f.INSTANCE.c();
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
                boolean r0 = r8 instanceof kotlin.C17952l.m.b
                if (r0 == 0) goto L13
                r0 = r8
                x0.l$m$b r0 = (kotlin.C17952l.m.b) r0
                int r1 = r0.f168306d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f168306d = r1
                goto L18
            L13:
                x0.l$m$b r0 = new x0.l$m$b
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f168304b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f168306d
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L2b
                long r6 = r0.f168303a
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
                x0.e<?> r2 = r5.f168297a
                float r2 = r2.A()
                r4 = 0
                int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r4 >= 0) goto L60
                x0.e<?> r4 = r5.f168297a
                x0.a0 r4 = r4.o()
                float r4 = r4.e()
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 <= 0) goto L60
                x0.e<?> r2 = r5.f168297a
                r0.f168303a = r6
                r0.f168306d = r3
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C17952l.m.M1(long, kotlin.coroutines.Continuation):java.lang.Object");
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
                boolean r3 = r7 instanceof kotlin.C17952l.m.a
                if (r3 == 0) goto L13
                r3 = r7
                x0.l$m$a r3 = (kotlin.C17952l.m.a) r3
                int r4 = r3.f168302d
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r4 & r0
                if (r1 == 0) goto L13
                int r4 = r4 - r0
                r3.f168302d = r4
                goto L18
            L13:
                x0.l$m$a r3 = new x0.l$m$a
                r3.<init>(r7)
            L18:
                java.lang.Object r4 = r3.f168300b
                java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r0 = r3.f168302d
                r1 = 1
                if (r0 == 0) goto L33
                if (r0 != r1) goto L2b
                long r5 = r3.f168299a
                kotlin.ResultKt.b(r4)
                goto L47
            L2b:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r4)
                throw r3
            L33:
                kotlin.ResultKt.b(r4)
                x0.e<?> r4 = r2.f168297a
                float r0 = r2.c(r5)
                r3.f168299a = r5
                r3.f168302d = r1
                java.lang.Object r3 = r4.G(r0, r3)
                if (r3 != r7) goto L47
                return r7
            L47:
                H1.y r3 = H1.y.b(r5)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C17952l.m.b0(long, long, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // f1.InterfaceC13828a
        public long E1(long available, int source) {
            float fA = a(available);
            if (fA < 0.0f && C13832e.f(source, C13832e.INSTANCE.d())) {
                return b(this.f168297a.n(fA));
            }
            return U0.f.INSTANCE.c();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/f;", "", "a", "(LX0/f;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.l$n */
    static final class n extends Lambda implements Function1<X0.f, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f168307f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ z1<Float> f168308g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(long j10, z1<Float> z1Var) {
            super(1);
            this.f168307f = j10;
            this.f168308g = z1Var;
        }

        public final void a(X0.f fVar) {
            X0.f.i1(fVar, this.f168307f, 0L, 0L, C17952l.h(this.f168308g), null, null, 0, 118, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.f fVar) {
            a(fVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.l$o */
    static final class o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f168309f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f168310g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f168311h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f168312i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(long j10, Function0<Unit> function0, boolean z10, int i10) {
            super(2);
            this.f168309f = j10;
            this.f168310g = function0;
            this.f168311h = z10;
            this.f168312i = i10;
        }

        public final void a(Composer composer, int i10) {
            C17952l.g(this.f168309f, this.f168310g, this.f168311h, composer, J0.a(this.f168312i | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/J;", "", "<anonymous>", "(Lg1/J;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$Scrim$dismissModifier$1$1", f = "BackdropScaffold.kt", l = {HttpResponseStatus.ERROR_NOT_IMPLEMENTED}, m = "invokeSuspend")
    /* renamed from: x0.l$p */
    static final class p extends SuspendLambda implements Function2<g1.J, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f168313a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f168314b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f168315c;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/f;", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.l$p$a */
        static final class a extends Lambda implements Function1<U0.f, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f168316f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function0<Unit> function0) {
                super(1);
                this.f168316f = function0;
            }

            public final void a(long j10) {
                this.f168316f.invoke();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(U0.f fVar) {
                a(fVar.getPackedValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(Function0<Unit> function0, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f168315c = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            p pVar = new p(this.f168315c, continuation);
            pVar.f168314b = obj;
            return pVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g1.J j10, Continuation<? super Unit> continuation) {
            return ((p) create(j10, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f168313a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                g1.J j10 = (g1.J) this.f168314b;
                a aVar = new a(this.f168315c);
                this.f168313a = 1;
                if (C13794L.m(j10, null, null, null, aVar, this, 7, null) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.l$q */
    static final class q extends Lambda implements Function1<EnumC17958n, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final q f168317f = new q();

        q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(EnumC17958n enumC17958n) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lx0/m;", "c", "()Lx0/m;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.l$r */
    static final class r extends Lambda implements Function0<C17955m> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC17958n f168318f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ H1.d f168319g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6326i<Float> f168320h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<EnumC17958n, Boolean> f168321i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C17963o1 f168322j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        r(EnumC17958n enumC17958n, H1.d dVar, InterfaceC6326i<Float> interfaceC6326i, Function1<? super EnumC17958n, Boolean> function1, C17963o1 c17963o1) {
            super(0);
            this.f168318f = enumC17958n;
            this.f168319g = dVar;
            this.f168320h = interfaceC6326i;
            this.f168321i = function1;
            this.f168322j = c17963o1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C17955m invoke() {
            return C17952l.d(this.f168318f, this.f168319g, this.f168320h, this.f168321i, this.f168322j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:323:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r38, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r39, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r40, androidx.compose.ui.Modifier r41, kotlin.C17955m r42, kotlin.jvm.functions.Function3<? super kotlin.C17963o1, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r43, boolean r44, float r45, float r46, boolean r47, boolean r48, long r49, long r51, V0.D1 r53, float r54, long r55, long r57, long r59, androidx.compose.runtime.Composer r61, int r62, int r63, int r64) {
        /*
            Method dump skipped, instructions count: 1327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17952l.c(kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, x0.m, kotlin.jvm.functions.Function3, boolean, float, float, boolean, boolean, long, long, V0.D1, float, long, long, long, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(EnumC17958n enumC17958n, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-950970976);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.V(enumC17958n) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(function2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(function22) ? 256 : 128;
        }
        int i12 = i11;
        if (composerStartRestartGroup.p((i12 & 147) != 146, i12 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(-950970976, i12, -1, "androidx.compose.material.BackLayerTransition (BackdropScaffold.kt:520)");
            }
            z1<Float> z1VarD = C6317c.d(enumC17958n == EnumC17958n.f168348b ? 0.0f : 2.0f, new n0(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
            float fI1 = ((H1.d) composerStartRestartGroup.o(C5892t0.g())).I1(f168177a);
            Modifier.Companion companion = Modifier.INSTANCE;
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5662h.g(companion2.o(), false);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA, measurePolicyG, companion3.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
            C5664j c5664j = C5664j.f48612a;
            boolean zV = composerStartRestartGroup.V(z1VarD);
            Object objB = composerStartRestartGroup.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new a(z1VarD);
                composerStartRestartGroup.t(objB);
            }
            Modifier modifierA = androidx.compose.ui.layout.D.a(companion, (Function3) objB);
            boolean zV2 = composerStartRestartGroup.V(z1VarD) | composerStartRestartGroup.b(fI1);
            Object objB2 = composerStartRestartGroup.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new b(fI1, z1VarD);
                composerStartRestartGroup.t(objB2);
            }
            Modifier modifierA2 = androidx.compose.ui.graphics.d.a(modifierA, (Function1) objB2);
            MeasurePolicy measurePolicyG2 = C5662h.g(companion2.o(), false);
            int iA2 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierA2);
            Function0<InterfaceC5811g> function0A2 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA2 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA2, measurePolicyG2, companion3.e());
            androidx.compose.runtime.D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.h() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 3) & 14));
            composerStartRestartGroup.v();
            boolean zV3 = composerStartRestartGroup.V(z1VarD);
            Object objB3 = composerStartRestartGroup.B();
            if (zV3 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new c(z1VarD);
                composerStartRestartGroup.t(objB3);
            }
            Modifier modifierA3 = androidx.compose.ui.layout.D.a(companion, (Function3) objB3);
            boolean zV4 = composerStartRestartGroup.V(z1VarD) | composerStartRestartGroup.b(fI1);
            Object objB4 = composerStartRestartGroup.B();
            if (zV4 || objB4 == Composer.INSTANCE.a()) {
                objB4 = new d(fI1, z1VarD);
                composerStartRestartGroup.t(objB4);
            }
            Modifier modifierA4 = androidx.compose.ui.graphics.d.a(modifierA3, (Function1) objB4);
            MeasurePolicy measurePolicyG3 = C5662h.g(companion2.o(), false);
            int iA3 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR3 = composerStartRestartGroup.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierA4);
            Function0<InterfaceC5811g> function0A3 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A3);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA3 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA3, measurePolicyG3, companion3.e());
            androidx.compose.runtime.D1.c(composerA3, interfaceC5742sR3, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.h() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            androidx.compose.runtime.D1.c(composerA3, modifierE3, companion3.f());
            function22.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 6) & 14));
            composerStartRestartGroup.v();
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new e(enumC17958n, function2, function22, i10));
        }
    }

    public static final C17955m d(EnumC17958n enumC17958n, H1.d dVar, InterfaceC6326i<Float> interfaceC6326i, Function1<? super EnumC17958n, Boolean> function1, C17963o1 c17963o1) {
        C17955m c17955m = new C17955m(enumC17958n, interfaceC6326i, function1, c17963o1);
        c17955m.l(dVar);
        return c17955m;
    }

    public static final InterfaceC13828a f(C17931e<?> c17931e, EnumC13827z enumC13827z) {
        return new m(c17931e, enumC13827z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(long j10, Function0<Unit> function0, boolean z10, Composer composer, int i10) {
        int i11;
        Modifier modifierThen;
        Composer composerStartRestartGroup = composer.startRestartGroup(-92141505);
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
                ComposerKt.U(-92141505, i11, -1, "androidx.compose.material.Scrim (BackdropScaffold.kt:494)");
            }
            if (j10 != 16) {
                composerStartRestartGroup.startReplaceGroup(478794687);
                int i12 = i11;
                z1<Float> z1VarD = C6317c.d(z10 ? 1.0f : 0.0f, new n0(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                if (z10) {
                    composerStartRestartGroup.startReplaceGroup(478960289);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Unit unit = Unit.f142422a;
                    boolean z11 = (i12 & 112) == 32;
                    Object objB = composerStartRestartGroup.B();
                    if (z11 || objB == Composer.INSTANCE.a()) {
                        objB = new p(function0, null);
                        composerStartRestartGroup.t(objB);
                    }
                    modifierThen = companion.then(new SuspendPointerInputElement(unit, null, null, new U.a((Function2) objB), 6, null));
                    composerStartRestartGroup.P();
                } else {
                    composerStartRestartGroup.startReplaceGroup(479060698);
                    composerStartRestartGroup.P();
                    modifierThen = Modifier.INSTANCE;
                }
                Modifier modifierThen2 = androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null).then(modifierThen);
                boolean zV = composerStartRestartGroup.V(z1VarD) | ((i12 & 14) == 4);
                Object objB2 = composerStartRestartGroup.B();
                if (zV || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new n(j10, z1VarD);
                    composerStartRestartGroup.t(objB2);
                }
                C13443j.a(modifierThen2, (Function1) objB2, composerStartRestartGroup, 0);
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(479228098);
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
            t0L.a(new o(j10, function0, z10, i10));
        }
    }

    public static final C17955m p(EnumC17958n enumC17958n, InterfaceC6326i<Float> interfaceC6326i, Function1<? super EnumC17958n, Boolean> function1, C17963o1 c17963o1, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            interfaceC6326i = C17949k.f168167a.a();
        }
        InterfaceC6326i<Float> interfaceC6326i2 = interfaceC6326i;
        if ((i11 & 4) != 0) {
            function1 = q.f168317f;
        }
        Function1<? super EnumC17958n, Boolean> function12 = function1;
        if ((i11 & 8) != 0) {
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new C17963o1();
                composer.t(objB);
            }
            c17963o1 = (C17963o1) objB;
        }
        C17963o1 c17963o12 = c17963o1;
        if (ComposerKt.M()) {
            ComposerKt.U(-862178912, i10, -1, "androidx.compose.material.rememberBackdropScaffoldState (BackdropScaffold.kt:257)");
        }
        H1.d dVar = (H1.d) composer.o(C5892t0.g());
        Object[] objArr = {interfaceC6326i2, function12, c17963o12};
        L0.k<C17955m, ?> kVarA = C17955m.f168324f.a(interfaceC6326i2, function12, c17963o12, dVar);
        boolean zV = ((((i10 & 14) ^ 6) > 4 && composer.V(enumC17958n)) || (i10 & 6) == 4) | composer.V(dVar) | composer.D(interfaceC6326i2) | ((((i10 & 896) ^ 384) > 256 && composer.V(function12)) || (i10 & 384) == 256) | ((((i10 & 7168) ^ 3072) > 2048 && composer.V(c17963o12)) || (i10 & 3072) == 2048);
        Object objB2 = composer.B();
        if (zV || objB2 == Composer.INSTANCE.a()) {
            Object rVar = new r(enumC17958n, dVar, interfaceC6326i2, function12, c17963o12);
            composer.t(rVar);
            objB2 = rVar;
        }
        C17955m c17955m = (C17955m) L0.c.c(objArr, kVarA, null, (Function0) objB2, composer, 0, 4);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c17955m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(z1<Float> z1Var) {
        return z1Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function1<? super H1.b, H1.b> function1, Function4<? super H1.b, ? super Float, ? super Composer, ? super Integer, Unit> function4, Composer composer, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1248995194);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(function2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.D(function1)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 3072) == 0) {
            if (composerStartRestartGroup.D(function4)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i11 |= i12;
        }
        boolean z13 = true;
        if ((i11 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (composerStartRestartGroup.p(z10, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(-1248995194, i11, -1, "androidx.compose.material.BackdropStack (BackdropScaffold.kt:573)");
            }
            if ((i11 & 112) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((i11 & 896) == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z14 = z11 | z12;
            if ((i11 & 7168) != 2048) {
                z13 = false;
            }
            boolean z15 = z14 | z13;
            Object objB = composerStartRestartGroup.B();
            if (z15 || objB == Composer.INSTANCE.a()) {
                objB = new k(function2, function1, function4);
                composerStartRestartGroup.t(objB);
            }
            p0.a(modifier, (Function2) objB, composerStartRestartGroup, i11 & 14, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new C2685l(modifier, function2, function1, function4, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float h(z1<Float> z1Var) {
        return z1Var.getValue().floatValue();
    }
}
