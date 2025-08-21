package kotlin;

import H1.y;
import P0.e;
import V0.D1;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5884s;
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
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.C6034t0;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d0.C13576j;
import f1.C13942e;
import f1.InterfaceC13938a;
import g1.U;
import j0.C14903g;
import java.util.ArrayList;
import java.util.List;
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
import mv.C15809k;
import mv.InterfaceC15783O;
import r1.C16819m;
import r1.s;
import r1.u;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001aO\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aG\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aÞ\u0001\u0010*\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\f2\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00130\u00072\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020!2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020\u001c2\b\b\u0002\u0010'\u001a\u00020!2\b\b\u0002\u0010(\u001a\u00020!2\b\b\u0002\u0010)\u001a\u00020!H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a0\u0010/\u001a\u00020\u00132\u0006\u0010,\u001a\u00020!2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010.\u001a\u00020\bH\u0003ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a3\u00103\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0003¢\u0006\u0004\b3\u00104\u001aS\u0010:\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002060\u00072\u0018\u00109\u001a\u0014\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001308H\u0003¢\u0006\u0004\b:\u0010;\u001a#\u0010A\u001a\u00020@2\n\u0010=\u001a\u0006\u0012\u0002\b\u00030<2\u0006\u0010?\u001a\u00020>H\u0000¢\u0006\u0004\bA\u0010B\"\u0014\u0010D\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010C\"\u0014\u0010F\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010C\"\u0014\u0010G\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010C\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006J²\u0006\f\u0010H\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010I\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lx0/n;", "initialValue", "LH1/d;", "density", "Lc0/i;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmValueChange", "Lx0/o1;", "snackbarHostState", "Lx0/m;", "d", "(Lx0/n;LH1/d;Lc0/i;Lkotlin/jvm/functions/Function1;Lx0/o1;)Lx0/m;", "confirmStateChange", "p", "(Lx0/n;Lc0/i;Lkotlin/jvm/functions/Function1;Lx0/o1;Landroidx/compose/runtime/Composer;II)Lx0/m;", "Lkotlin/Function0;", "", "appBar", "backLayerContent", "frontLayerContent", "Landroidx/compose/ui/Modifier;", "modifier", "scaffoldState", "snackbarHost", "gesturesEnabled", "LH1/h;", "peekHeight", "headerHeight", "persistentAppBar", "stickyFrontLayer", "LV0/q0;", "backLayerBackgroundColor", "backLayerContentColor", "LV0/D1;", "frontLayerShape", "frontLayerElevation", "frontLayerBackgroundColor", "frontLayerContentColor", "frontLayerScrimColor", "c", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lx0/m;Lkotlin/jvm/functions/Function3;ZFFZZJJLV0/D1;FJJJLandroidx/compose/runtime/Composer;III)V", "color", "onDismiss", "visible", "g", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "target", "content", "a", "(Lx0/n;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "backLayer", "LH1/b;", "calculateBackLayerConstraints", "Lkotlin/Function2;", "frontLayer", "e", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "Lx0/e;", "state", "Lf0/z;", "orientation", "Lf1/a;", "f", "(Lx0/e;Lf0/z;)Lf1/a;", "F", "AnimationSlideOffset", "b", "VelocityThreshold", "PositionalThreshold", "alpha", "animationProgress", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18018l {

    /* renamed from: a, reason: collision with root package name */
    private static final float f169265a = H1.h.p(20);

    /* renamed from: b, reason: collision with root package name */
    private static final float f169266b = H1.h.p(125);

    /* renamed from: c, reason: collision with root package name */
    private static final float f169267c = H1.h.p(56);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.l$a */
    static final class a extends Lambda implements Function3<K, I, H1.b, J> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z1<Float> f169268f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.l$a$a, reason: collision with other inner class name */
        static final class C2700a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ f0 f169269f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ float f169270g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2700a(f0 f0Var, float f10) {
                super(1);
                this.f169269f = f0Var;
                this.f169270g = f10;
            }

            public final void a(f0.a aVar) {
                aVar.g(this.f169269f, 0, 0, this.f169270g);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(z1<Float> z1Var) {
            super(3);
            this.f169268f = z1Var;
        }

        public final J a(K k10, I i10, long j10) {
            float fB = C18018l.b(this.f169268f) - 1;
            if (fB < 0.0f) {
                fB = 0.0f;
            }
            if (fB > 1.0f) {
                fB = 1.0f;
            }
            f0 f0VarK0 = i10.k0(j10);
            return K.G0(k10, f0VarK0.getWidth(), f0VarK0.getHeight(), null, new C2700a(f0VarK0, fB), 4, null);
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
        final /* synthetic */ float f169271f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ z1<Float> f169272g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f10, z1<Float> z1Var) {
            super(1);
            this.f169271f = f10;
            this.f169272g = z1Var;
        }

        public final void a(androidx.compose.ui.graphics.e eVar) {
            float f10 = 1;
            float fB = C18018l.b(this.f169272g) - f10;
            if (fB < 0.0f) {
                fB = 0.0f;
            }
            if (fB > 1.0f) {
                fB = 1.0f;
            }
            eVar.d(fB);
            eVar.e((f10 - fB) * this.f169271f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.e eVar) {
            a(eVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.l$c */
    static final class c extends Lambda implements Function3<K, I, H1.b, J> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z1<Float> f169273f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.l$c$a */
        static final class a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ f0 f169274f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ float f169275g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f0 f0Var, float f10) {
                super(1);
                this.f169274f = f0Var;
                this.f169275g = f10;
            }

            public final void a(f0.a aVar) {
                aVar.g(this.f169274f, 0, 0, this.f169275g);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f143329a;
            }
        }

        public final J a(K k10, I i10, long j10) {
            float fB = 1 - C18018l.b(this.f169273f);
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
            this.f169273f = z1Var;
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
        final /* synthetic */ float f169276f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ z1<Float> f169277g;

        public final void a(androidx.compose.ui.graphics.e eVar) {
            float f10 = 1;
            float fB = f10 - C18018l.b(this.f169277g);
            if (fB < 0.0f) {
                fB = 0.0f;
            }
            if (fB > 1.0f) {
                fB = 1.0f;
            }
            eVar.d(fB);
            eVar.e((f10 - fB) * this.f169276f);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(float f10, z1<Float> z1Var) {
            super(1);
            this.f169276f = f10;
            this.f169277g = z1Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.e eVar) {
            a(eVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.l$e */
    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC18024n f169278f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f169279g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f169280h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f169281i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(EnumC18024n enumC18024n, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, int i10) {
            super(2);
            this.f169278f = enumC18024n;
            this.f169279g = function2;
            this.f169280h = function22;
            this.f169281i = i10;
        }

        public final void a(Composer composer, int i10) {
            C18018l.a(this.f169278f, this.f169279g, this.f169280h, composer, J0.a(this.f169281i | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.l$f */
    static final class f extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C18021m f169282f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ H1.d f169283g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C18021m c18021m, H1.d dVar) {
            super(0);
            this.f169282f = c18021m;
            this.f169283g = dVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f169282f.l(this.f169283g);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.l$g */
    static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f169284f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f169285g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<H1.b, H1.b> f169286h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f169287i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f169288j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f169289k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ C18021m f169290l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ C17997e<EnumC18024n> f169291m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ D1 f169292n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ long f169293o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ long f169294p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ float f169295q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ float f169296r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ float f169297s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ float f169298t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f169299u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ long f169300v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ Function3<C18029o1, Composer, Integer, Unit> f169301w;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LH1/b;", "constraints", "", "backLayerHeight", "", "a", "(JFLandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: x0.l$g$a */
        static final class a extends Lambda implements Function4<H1.b, Float, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ float f169302f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ boolean f169303g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f169304h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ C18021m f169305i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ C17997e<EnumC18024n> f169306j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f169307k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ D1 f169308l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ long f169309m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ long f169310n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ float f169311o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ float f169312p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ float f169313q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ float f169314r;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f169315s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ long f169316t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ Function3<C18029o1, Composer, Integer, Unit> f169317u;

            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LH1/r;", "layoutSize", "LH1/b;", "<anonymous parameter 1>", "Lkotlin/Pair;", "Lx0/a0;", "Lx0/n;", "a", "(JJ)Lkotlin/Pair;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: x0.l$g$a$a, reason: collision with other inner class name */
            static final class C2701a extends Lambda implements Function2<H1.r, H1.b, Pair<? extends InterfaceC17986a0<EnumC18024n>, ? extends EnumC18024n>> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ float f169318f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ C18021m f169319g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ Ref.FloatRef f169320h;

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx0/b0;", "Lx0/n;", "", "a", "(Lx0/b0;)V"}, k = 3, mv = {1, 9, 0})
                /* renamed from: x0.l$g$a$a$b */
                static final class b extends Lambda implements Function1<C17989b0<EnumC18024n>, Unit> {

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ float f169321f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ float f169322g;

                    /* renamed from: h, reason: collision with root package name */
                    final /* synthetic */ float f169323h;

                    /* renamed from: i, reason: collision with root package name */
                    final /* synthetic */ Ref.FloatRef f169324i;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(float f10, float f11, float f12, Ref.FloatRef floatRef) {
                        super(1);
                        this.f169321f = f10;
                        this.f169322g = f11;
                        this.f169323h = f12;
                        this.f169324i = floatRef;
                    }

                    public final void a(C17989b0<EnumC18024n> c17989b0) {
                        float f10 = this.f169321f;
                        if (f10 != 0.0f) {
                            float f11 = this.f169322g;
                            if (f10 != f11) {
                                c17989b0.a(EnumC18024n.f169435a, f11);
                                c17989b0.a(EnumC18024n.f169436b, this.f169324i.f143739a);
                                return;
                            }
                        }
                        c17989b0.a(EnumC18024n.f169435a, this.f169323h);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(C17989b0<EnumC18024n> c17989b0) {
                        a(c17989b0);
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: x0.l$g$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C2702a {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[EnumC18024n.values().length];
                        try {
                            iArr[EnumC18024n.f169435a.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[EnumC18024n.f169436b.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2701a(float f10, C18021m c18021m, Ref.FloatRef floatRef) {
                    super(2);
                    this.f169318f = f10;
                    this.f169319g = c18021m;
                    this.f169320h = floatRef;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Pair<? extends InterfaceC17986a0<EnumC18024n>, ? extends EnumC18024n> invoke(H1.r rVar, H1.b bVar) {
                    return a(rVar.getPackedValue(), bVar.getValue());
                }

                public final Pair<InterfaceC17986a0<EnumC18024n>, EnumC18024n> a(long j10, long j11) {
                    EnumC18024n enumC18024n;
                    float f10 = H1.r.f(j10);
                    float f11 = H1.r.f(j10);
                    float f12 = this.f169318f;
                    InterfaceC17986a0 interfaceC17986a0A = androidx.compose.material.a.a(new b(f10, f12, f11 - f12, this.f169320h));
                    int i10 = C2702a.$EnumSwitchMapping$0[this.f169319g.g().ordinal()];
                    if (i10 != 1) {
                        if (i10 == 2) {
                            enumC18024n = EnumC18024n.f169436b;
                            if (!interfaceC17986a0A.d(enumC18024n)) {
                                enumC18024n = EnumC18024n.f169435a;
                            }
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        enumC18024n = EnumC18024n.f169435a;
                    }
                    return TuplesKt.a(interfaceC17986a0A, enumC18024n);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
            /* renamed from: x0.l$g$a$b */
            static final class b extends Lambda implements Function1<u, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ C18021m f169325f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ InterfaceC15783O f169326g;

                @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
                /* renamed from: x0.l$g$a$b$a, reason: collision with other inner class name */
                static final class C2703a extends Lambda implements Function0<Boolean> {

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ C18021m f169327f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ InterfaceC15783O f169328g;

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
                    @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1$1$1", f = "BackdropScaffold.kt", l = {443}, m = "invokeSuspend")
                    /* renamed from: x0.l$g$a$b$a$a, reason: collision with other inner class name */
                    static final class C2704a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f169329a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ C18021m f169330b;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C2704a(C18021m c18021m, Continuation<? super C2704a> continuation) {
                            super(2, continuation);
                            this.f169330b = c18021m;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C2704a(this.f169330b, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                            return ((C2704a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object objF = IntrinsicsKt.f();
                            int i10 = this.f169329a;
                            if (i10 != 0) {
                                if (i10 == 1) {
                                    ResultKt.b(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.b(obj);
                                C18021m c18021m = this.f169330b;
                                this.f169329a = 1;
                                if (c18021m.k(this) == objF) {
                                    return objF;
                                }
                            }
                            return Unit.f143329a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C2703a(C18021m c18021m, InterfaceC15783O interfaceC15783O) {
                        super(0);
                        this.f169327f = c18021m;
                        this.f169328g = interfaceC15783O;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: c, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke() {
                        if (this.f169327f.d().invoke(EnumC18024n.f169436b).booleanValue()) {
                            C15809k.d(this.f169328g, null, null, new C2704a(this.f169327f, null), 3, null);
                        }
                        return Boolean.TRUE;
                    }
                }

                @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
                /* renamed from: x0.l$g$a$b$b, reason: collision with other inner class name */
                static final class C2705b extends Lambda implements Function0<Boolean> {

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ C18021m f169331f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ InterfaceC15783O f169332g;

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
                    @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1$2$1", f = "BackdropScaffold.kt", l = {450}, m = "invokeSuspend")
                    /* renamed from: x0.l$g$a$b$b$a, reason: collision with other inner class name */
                    static final class C2706a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f169333a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ C18021m f169334b;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C2706a(C18021m c18021m, Continuation<? super C2706a> continuation) {
                            super(2, continuation);
                            this.f169334b = c18021m;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C2706a(this.f169334b, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                            return ((C2706a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object objF = IntrinsicsKt.f();
                            int i10 = this.f169333a;
                            if (i10 != 0) {
                                if (i10 == 1) {
                                    ResultKt.b(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.b(obj);
                                C18021m c18021m = this.f169334b;
                                this.f169333a = 1;
                                if (c18021m.b(this) == objF) {
                                    return objF;
                                }
                            }
                            return Unit.f143329a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C2705b(C18021m c18021m, InterfaceC15783O interfaceC15783O) {
                        super(0);
                        this.f169331f = c18021m;
                        this.f169332g = interfaceC15783O;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: c, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke() {
                        if (this.f169331f.d().invoke(EnumC18024n.f169435a).booleanValue()) {
                            C15809k.d(this.f169332g, null, null, new C2706a(this.f169331f, null), 3, null);
                        }
                        return Boolean.TRUE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C18021m c18021m, InterfaceC15783O interfaceC15783O) {
                    super(1);
                    this.f169325f = c18021m;
                    this.f169326g = interfaceC15783O;
                }

                public final void a(u uVar) {
                    if (this.f169325f.h()) {
                        s.f(uVar, null, new C2703a(this.f169325f, this.f169326g), 1, null);
                    } else {
                        s.q(uVar, null, new C2705b(this.f169325f, this.f169326g), 1, null);
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
            /* renamed from: x0.l$g$a$c */
            static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ float f169335f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ Function2<Composer, Integer, Unit> f169336g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ long f169337h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ boolean f169338i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ C18021m f169339j;

                /* renamed from: k, reason: collision with root package name */
                final /* synthetic */ InterfaceC15783O f169340k;

                @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: x0.l$g$a$c$a, reason: collision with other inner class name */
                static final class C2707a extends Lambda implements Function0<Unit> {

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ boolean f169341f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ C18021m f169342g;

                    /* renamed from: h, reason: collision with root package name */
                    final /* synthetic */ InterfaceC15783O f169343h;

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
                    @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$3$1$1$1$1", f = "BackdropScaffold.kt", l = {467}, m = "invokeSuspend")
                    /* renamed from: x0.l$g$a$c$a$a, reason: collision with other inner class name */
                    static final class C2708a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f169344a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ C18021m f169345b;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C2708a(C18021m c18021m, Continuation<? super C2708a> continuation) {
                            super(2, continuation);
                            this.f169345b = c18021m;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C2708a(this.f169345b, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                            return ((C2708a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object objF = IntrinsicsKt.f();
                            int i10 = this.f169344a;
                            if (i10 != 0) {
                                if (i10 == 1) {
                                    ResultKt.b(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.b(obj);
                                C18021m c18021m = this.f169345b;
                                this.f169344a = 1;
                                if (c18021m.b(this) == objF) {
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
                    C2707a(boolean z10, C18021m c18021m, InterfaceC15783O interfaceC15783O) {
                        super(0);
                        this.f169341f = z10;
                        this.f169342g = c18021m;
                        this.f169343h = interfaceC15783O;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (this.f169341f && this.f169342g.d().invoke(EnumC18024n.f169435a).booleanValue()) {
                            C15809k.d(this.f169343h, null, null, new C2708a(this.f169342g, null), 3, null);
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                c(float f10, Function2<? super Composer, ? super Integer, Unit> function2, long j10, boolean z10, C18021m c18021m, InterfaceC15783O interfaceC15783O) {
                    super(2);
                    this.f169335f = f10;
                    this.f169336g = function2;
                    this.f169337h = j10;
                    this.f169338i = z10;
                    this.f169339j = c18021m;
                    this.f169340k = interfaceC15783O;
                }

                public final void a(Composer composer, int i10) {
                    if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1946125143, i10, -1, "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous>.<anonymous> (BackdropScaffold.kt:460)");
                    }
                    Modifier modifierM = D.m(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, this.f169335f, 7, null);
                    Function2<Composer, Integer, Unit> function2 = this.f169336g;
                    long j10 = this.f169337h;
                    boolean z10 = this.f169338i;
                    C18021m c18021m = this.f169339j;
                    InterfaceC15783O interfaceC15783O = this.f169340k;
                    MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
                    int iA = C5859f.a(composer, 0);
                    InterfaceC5884s interfaceC5884sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, modifierM);
                    InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
                    Function0<InterfaceC5953g> function0A = companion.a();
                    if (composer.k() == null) {
                        C5859f.c();
                    }
                    composer.F();
                    if (composer.h()) {
                        composer.I(function0A);
                    } else {
                        composer.s();
                    }
                    Composer composerA = androidx.compose.runtime.D1.a(composer);
                    androidx.compose.runtime.D1.c(composerA, measurePolicyG, companion.e());
                    androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                    if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                    C5806j c5806j = C5806j.f48836a;
                    function2.invoke(composer, 0);
                    boolean zA = composer.a(z10) | composer.V(c18021m) | composer.D(interfaceC15783O);
                    Object objB = composer.B();
                    if (zA || objB == Composer.INSTANCE.a()) {
                        objB = new C2707a(z10, c18021m, interfaceC15783O);
                        composer.t(objB);
                    }
                    C18018l.g(j10, (Function0) objB, c18021m.g() == EnumC18024n.f169436b, composer, 0);
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(float f10, boolean z10, boolean z11, C18021m c18021m, C17997e<EnumC18024n> c17997e, InterfaceC15783O interfaceC15783O, D1 d12, long j10, long j11, float f11, float f12, float f13, float f14, Function2<? super Composer, ? super Integer, Unit> function2, long j12, Function3<? super C18029o1, ? super Composer, ? super Integer, Unit> function3) {
                super(4);
                this.f169302f = f10;
                this.f169303g = z10;
                this.f169304h = z11;
                this.f169305i = c18021m;
                this.f169306j = c17997e;
                this.f169307k = interfaceC15783O;
                this.f169308l = d12;
                this.f169309m = j10;
                this.f169310n = j11;
                this.f169311o = f11;
                this.f169312p = f12;
                this.f169313q = f13;
                this.f169314r = f14;
                this.f169315s = function2;
                this.f169316t = j12;
                this.f169317u = function3;
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
                float fK = H1.b.k(j10) - this.f169302f;
                floatRef.f143739a = fK;
                if (this.f169303g) {
                    floatRef.f143739a = Math.min(fK, f10);
                }
                Modifier modifierB = this.f169304h ? androidx.compose.ui.input.nestedscroll.a.b(Modifier.INSTANCE, this.f169305i.e(), null, 2, null) : Modifier.INSTANCE;
                C17997e<EnumC18024n> c17997e = this.f169306j;
                EnumC13937z enumC13937z = EnumC13937z.f131419a;
                Modifier modifierE = androidx.compose.material.a.e(androidx.compose.material.a.h(modifierB, c17997e, enumC13937z, new C2701a(this.f169313q, this.f169305i, floatRef)), this.f169306j, enumC13937z, this.f169304h, false, null, false, 56, null);
                boolean zV = composer.V(this.f169305i) | composer.D(this.f169307k);
                C18021m c18021m = this.f169305i;
                InterfaceC15783O interfaceC15783O = this.f169307k;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new b(c18021m, interfaceC15783O);
                    composer.t(objB);
                }
                t1.a(C16819m.d(modifierE, false, (Function1) objB, 1, null), this.f169308l, this.f169309m, this.f169310n, null, this.f169311o, ComposableLambdaKt.c(1946125143, true, new c(this.f169314r, this.f169315s, this.f169316t, this.f169304h, this.f169305i, this.f169307k), composer, 54), composer, 1572864, 16);
                Modifier modifierM = D.m(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, (this.f169305i.i() && floatRef.f143739a == ((float) H1.b.k(j10)) - this.f169302f) ? this.f169312p : H1.h.p(0), 7, null);
                P0.e eVarB = P0.e.INSTANCE.b();
                Function3<C18029o1, Composer, Integer, Unit> function3 = this.f169317u;
                C18021m c18021m2 = this.f169305i;
                MeasurePolicy measurePolicyG = C5804h.g(eVarB, false);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierM);
                InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.h()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyG, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE2, companion.f());
                C5806j c5806j = C5806j.f48836a;
                function3.invoke(c18021m2.f(), composer, 0);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(H1.b bVar, Float f10, Composer composer, Integer num) {
                a(bVar.getValue(), f10.floatValue(), composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function1<? super H1.b, H1.b> function1, float f10, boolean z10, boolean z11, C18021m c18021m, C17997e<EnumC18024n> c17997e, D1 d12, long j10, long j11, float f11, float f12, float f13, float f14, Function2<? super Composer, ? super Integer, Unit> function22, long j12, Function3<? super C18029o1, ? super Composer, ? super Integer, Unit> function3) {
            super(2);
            this.f169284f = modifier;
            this.f169285g = function2;
            this.f169286h = function1;
            this.f169287i = f10;
            this.f169288j = z10;
            this.f169289k = z11;
            this.f169290l = c18021m;
            this.f169291m = c17997e;
            this.f169292n = d12;
            this.f169293o = j10;
            this.f169294p = j11;
            this.f169295q = f11;
            this.f169296r = f12;
            this.f169297s = f13;
            this.f169298t = f14;
            this.f169299u = function22;
            this.f169300v = j12;
            this.f169301w = function3;
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
                objB = androidx.compose.runtime.J.k(EmptyCoroutineContext.f143553a, composer);
                composer.t(objB);
            }
            C18018l.e(androidx.compose.foundation.layout.J.f(this.f169284f, 0.0f, 1, null), this.f169285g, this.f169286h, ComposableLambdaKt.c(516504859, true, new a(this.f169287i, this.f169288j, this.f169289k, this.f169290l, this.f169291m, (InterfaceC15783O) objB, this.f169292n, this.f169293o, this.f169294p, this.f169295q, this.f169296r, this.f169297s, this.f169298t, this.f169299u, this.f169300v, this.f169301w), composer, 54), composer, 3120);
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
    /* renamed from: x0.l$h */
    static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f169346f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f169347g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f169348h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Modifier f169349i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C18021m f169350j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function3<C18029o1, Composer, Integer, Unit> f169351k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f169352l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ float f169353m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ float f169354n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f169355o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f169356p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ long f169357q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ long f169358r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ D1 f169359s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ float f169360t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ long f169361u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ long f169362v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ long f169363w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ int f169364x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ int f169365y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ int f169366z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Modifier modifier, C18021m c18021m, Function3<? super C18029o1, ? super Composer, ? super Integer, Unit> function3, boolean z10, float f10, float f11, boolean z11, boolean z12, long j10, long j11, D1 d12, float f12, long j12, long j13, long j14, int i10, int i11, int i12) {
            super(2);
            this.f169346f = function2;
            this.f169347g = function22;
            this.f169348h = function23;
            this.f169349i = modifier;
            this.f169350j = c18021m;
            this.f169351k = function3;
            this.f169352l = z10;
            this.f169353m = f10;
            this.f169354n = f11;
            this.f169355o = z11;
            this.f169356p = z12;
            this.f169357q = j10;
            this.f169358r = j11;
            this.f169359s = d12;
            this.f169360t = f12;
            this.f169361u = j12;
            this.f169362v = j13;
            this.f169363w = j14;
            this.f169364x = i10;
            this.f169365y = i11;
            this.f169366z = i12;
        }

        public final void a(Composer composer, int i10) {
            C18018l.c(this.f169346f, this.f169347g, this.f169348h, this.f169349i, this.f169350j, this.f169351k, this.f169352l, this.f169353m, this.f169354n, this.f169355o, this.f169356p, this.f169357q, this.f169358r, this.f169359s, this.f169360t, this.f169361u, this.f169362v, this.f169363w, composer, J0.a(this.f169364x | 1), J0.a(this.f169365y), this.f169366z);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.l$i */
    static final class i extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f169367f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C18021m f169368g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f169369h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f169370i;

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(461235665, i10, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:374)");
            }
            if (this.f169367f) {
                composer.startReplaceGroup(1665275251);
                Function2<Composer, Integer, Unit> function2 = this.f169369h;
                Function2<Composer, Integer, Unit> function22 = this.f169370i;
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                C14903g c14903g = C14903g.f139698a;
                function2.invoke(composer, 0);
                function22.invoke(composer, 0);
                composer.v();
                composer.P();
            } else {
                composer.startReplaceGroup(1665408644);
                C18018l.a(this.f169368g.c().x(), this.f169369h, this.f169370i, composer, 0);
                composer.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(boolean z10, C18021m c18021m, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22) {
            super(2);
            this.f169367f = z10;
            this.f169368g = c18021m;
            this.f169369h = function2;
            this.f169370i = function22;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH1/b;", "it", "a", "(J)J"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.l$j */
    static final class j extends Lambda implements Function1<H1.b, H1.b> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f169371f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(float f10) {
            super(1);
            this.f169371f = f10;
        }

        public final long a(long j10) {
            return H1.c.j(H1.b.d(j10, 0, 0, 0, 0, 10, null), 0, -MathKt.d(this.f169371f), 1, null);
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
        final /* synthetic */ Function2<Composer, Integer, Unit> f169372f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<H1.b, H1.b> f169373g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function4<H1.b, Float, Composer, Integer, Unit> f169374h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: x0.l$k$a */
        static final class a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ f0 f169375f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List<f0> f169376g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(f0 f0Var, List<? extends f0> list) {
                super(1);
                this.f169375f = f0Var;
                this.f169376g = list;
            }

            public final void a(f0.a aVar) {
                f0.a.l(aVar, this.f169375f, 0, 0, 0.0f, 4, null);
                List<f0> list = this.f169376g;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    f0.a.l(aVar, list.get(i10), 0, 0, 0.0f, 4, null);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.l$k$b */
        static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function4<H1.b, Float, Composer, Integer, Unit> f169377f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ long f169378g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ float f169379h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(Function4<? super H1.b, ? super Float, ? super Composer, ? super Integer, Unit> function4, long j10, float f10) {
                super(2);
                this.f169377f = function4;
                this.f169378g = j10;
                this.f169379h = f10;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1222642649, i10, -1, "androidx.compose.material.BackdropStack.<anonymous>.<anonymous>.<anonymous> (BackdropScaffold.kt:583)");
                }
                this.f169377f.invoke(H1.b.a(this.f169378g), Float.valueOf(this.f169379h), composer, 0);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(Function2<? super Composer, ? super Integer, Unit> function2, Function1<? super H1.b, H1.b> function1, Function4<? super H1.b, ? super Float, ? super Composer, ? super Integer, Unit> function4) {
            super(2);
            this.f169372f = function2;
            this.f169373g = function1;
            this.f169374h = function4;
        }

        public final J a(r0 r0Var, long j10) {
            f0 f0VarK0 = ((I) CollectionsKt.s0(r0Var.Z(EnumC18012j.f169084a, this.f169372f))).k0(this.f169373g.invoke(H1.b.a(j10)).getValue());
            List<I> listZ = r0Var.Z(EnumC18012j.f169085b, ComposableLambdaKt.composableLambdaInstance(-1222642649, true, new b(this.f169374h, j10, f0VarK0.getHeight())));
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
    static final class C2709l extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f169380f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f169381g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<H1.b, H1.b> f169382h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function4<H1.b, Float, Composer, Integer, Unit> f169383i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f169384j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2709l(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function1<? super H1.b, H1.b> function1, Function4<? super H1.b, ? super Float, ? super Composer, ? super Integer, Unit> function4, int i10) {
            super(2);
            this.f169380f = modifier;
            this.f169381g = function2;
            this.f169382h = function1;
            this.f169383i = function4;
            this.f169384j = i10;
        }

        public final void a(Composer composer, int i10) {
            C18018l.e(this.f169380f, this.f169381g, this.f169382h, this.f169383i, composer, J0.a(this.f169384j | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0002*\u00020\u0006H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0002*\u00020\u0003H\u0003¢\u0006\u0004\b\t\u0010\bJ\"\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0096@ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0096@ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"x0/l$m", "Lf1/a;", "", "LU0/f;", "b", "(F)J", "LH1/y;", "c", "(J)F", "a", "available", "Lf1/e;", "source", "E1", "(JI)J", "consumed", "L0", "(JJI)J", "M1", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b0", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.l$m */
    public static final class m implements InterfaceC13938a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C17997e<?> f169385a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ EnumC13937z f169386b;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1", f = "BackdropScaffold.kt", l = {680}, m = "onPostFling-RZ2iAVY")
        /* renamed from: x0.l$m$a */
        static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            long f169387a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f169388b;

            /* renamed from: d, reason: collision with root package name */
            int f169390d;

            a(Continuation<? super a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f169388b = obj;
                this.f169390d |= Integer.MIN_VALUE;
                return m.this.b0(0L, 0L, this);
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1", f = "BackdropScaffold.kt", l = {671}, m = "onPreFling-QWom1Mo")
        /* renamed from: x0.l$m$b */
        static final class b extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            long f169391a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f169392b;

            /* renamed from: d, reason: collision with root package name */
            int f169394d;

            b(Continuation<? super b> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f169392b = obj;
                this.f169394d |= Integer.MIN_VALUE;
                return m.this.M1(0L, this);
            }
        }

        m(C17997e<?> c17997e, EnumC13937z enumC13937z) {
            this.f169385a = c17997e;
            this.f169386b = enumC13937z;
        }

        @JvmName
        private final float a(long j10) {
            return this.f169386b == EnumC13937z.f131420b ? U0.f.m(j10) : U0.f.n(j10);
        }

        private final long b(float f10) {
            EnumC13937z enumC13937z = this.f169386b;
            float f11 = enumC13937z == EnumC13937z.f131420b ? f10 : 0.0f;
            if (enumC13937z != EnumC13937z.f131419a) {
                f10 = 0.0f;
            }
            return U0.g.a(f11, f10);
        }

        @JvmName
        private final float c(long j10) {
            return this.f169386b == EnumC13937z.f131420b ? y.h(j10) : y.i(j10);
        }

        @Override // f1.InterfaceC13938a
        public long L0(long consumed, long available, int source) {
            return C13942e.f(source, C13942e.INSTANCE.d()) ? b(this.f169385a.n(a(available))) : U0.f.INSTANCE.c();
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
                boolean r0 = r8 instanceof kotlin.C18018l.m.b
                if (r0 == 0) goto L13
                r0 = r8
                x0.l$m$b r0 = (kotlin.C18018l.m.b) r0
                int r1 = r0.f169394d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f169394d = r1
                goto L18
            L13:
                x0.l$m$b r0 = new x0.l$m$b
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f169392b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f169394d
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L2b
                long r6 = r0.f169391a
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
                x0.e<?> r2 = r5.f169385a
                float r2 = r2.A()
                r4 = 0
                int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r4 >= 0) goto L60
                x0.e<?> r4 = r5.f169385a
                x0.a0 r4 = r4.o()
                float r4 = r4.e()
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 <= 0) goto L60
                x0.e<?> r2 = r5.f169385a
                r0.f169391a = r6
                r0.f169394d = r3
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C18018l.m.M1(long, kotlin.coroutines.Continuation):java.lang.Object");
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
                boolean r3 = r7 instanceof kotlin.C18018l.m.a
                if (r3 == 0) goto L13
                r3 = r7
                x0.l$m$a r3 = (kotlin.C18018l.m.a) r3
                int r4 = r3.f169390d
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r4 & r0
                if (r1 == 0) goto L13
                int r4 = r4 - r0
                r3.f169390d = r4
                goto L18
            L13:
                x0.l$m$a r3 = new x0.l$m$a
                r3.<init>(r7)
            L18:
                java.lang.Object r4 = r3.f169388b
                java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r0 = r3.f169390d
                r1 = 1
                if (r0 == 0) goto L33
                if (r0 != r1) goto L2b
                long r5 = r3.f169387a
                kotlin.ResultKt.b(r4)
                goto L47
            L2b:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r4)
                throw r3
            L33:
                kotlin.ResultKt.b(r4)
                x0.e<?> r4 = r2.f169385a
                float r0 = r2.c(r5)
                r3.f169387a = r5
                r3.f169390d = r1
                java.lang.Object r3 = r4.G(r0, r3)
                if (r3 != r7) goto L47
                return r7
            L47:
                H1.y r3 = H1.y.b(r5)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C18018l.m.b0(long, long, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // f1.InterfaceC13938a
        public long E1(long available, int source) {
            float fA = a(available);
            if (fA < 0.0f && C13942e.f(source, C13942e.INSTANCE.d())) {
                return b(this.f169385a.n(fA));
            }
            return U0.f.INSTANCE.c();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/f;", "", "a", "(LX0/f;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.l$n */
    static final class n extends Lambda implements Function1<X0.f, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f169395f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ z1<Float> f169396g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(long j10, z1<Float> z1Var) {
            super(1);
            this.f169395f = j10;
            this.f169396g = z1Var;
        }

        public final void a(X0.f fVar) {
            X0.f.i1(fVar, this.f169395f, 0L, 0L, C18018l.h(this.f169396g), null, null, 0, 118, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.f fVar) {
            a(fVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.l$o */
    static final class o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f169397f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f169398g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f169399h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f169400i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(long j10, Function0<Unit> function0, boolean z10, int i10) {
            super(2);
            this.f169397f = j10;
            this.f169398g = function0;
            this.f169399h = z10;
            this.f169400i = i10;
        }

        public final void a(Composer composer, int i10) {
            C18018l.g(this.f169397f, this.f169398g, this.f169399h, composer, J0.a(this.f169400i | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/J;", "", "<anonymous>", "(Lg1/J;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$Scrim$dismissModifier$1$1", f = "BackdropScaffold.kt", l = {HttpResponseStatus.ERROR_NOT_IMPLEMENTED}, m = "invokeSuspend")
    /* renamed from: x0.l$p */
    static final class p extends SuspendLambda implements Function2<g1.J, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f169401a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f169402b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f169403c;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/f;", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.l$p$a */
        static final class a extends Lambda implements Function1<U0.f, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f169404f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function0<Unit> function0) {
                super(1);
                this.f169404f = function0;
            }

            public final void a(long j10) {
                this.f169404f.invoke();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(U0.f fVar) {
                a(fVar.getPackedValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(Function0<Unit> function0, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f169403c = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            p pVar = new p(this.f169403c, continuation);
            pVar.f169402b = obj;
            return pVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g1.J j10, Continuation<? super Unit> continuation) {
            return ((p) create(j10, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f169401a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                g1.J j10 = (g1.J) this.f169402b;
                a aVar = new a(this.f169403c);
                this.f169401a = 1;
                if (C13904L.m(j10, null, null, null, aVar, this, 7, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.l$q */
    static final class q extends Lambda implements Function1<EnumC18024n, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final q f169405f = new q();

        q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(EnumC18024n enumC18024n) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lx0/m;", "c", "()Lx0/m;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.l$r */
    static final class r extends Lambda implements Function0<C18021m> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC18024n f169406f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ H1.d f169407g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6452i<Float> f169408h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<EnumC18024n, Boolean> f169409i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C18029o1 f169410j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        r(EnumC18024n enumC18024n, H1.d dVar, InterfaceC6452i<Float> interfaceC6452i, Function1<? super EnumC18024n, Boolean> function1, C18029o1 c18029o1) {
            super(0);
            this.f169406f = enumC18024n;
            this.f169407g = dVar;
            this.f169408h = interfaceC6452i;
            this.f169409i = function1;
            this.f169410j = c18029o1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C18021m invoke() {
            return C18018l.d(this.f169406f, this.f169407g, this.f169408h, this.f169409i, this.f169410j);
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
    public static final void c(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r38, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r39, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r40, androidx.compose.ui.Modifier r41, kotlin.C18021m r42, kotlin.jvm.functions.Function3<? super kotlin.C18029o1, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r43, boolean r44, float r45, float r46, boolean r47, boolean r48, long r49, long r51, V0.D1 r53, float r54, long r55, long r57, long r59, androidx.compose.runtime.Composer r61, int r62, int r63, int r64) {
        /*
            Method dump skipped, instructions count: 1327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C18018l.c(kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, x0.m, kotlin.jvm.functions.Function3, boolean, float, float, boolean, boolean, long, long, V0.D1, float, long, long, long, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(EnumC18024n enumC18024n, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-950970976);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.V(enumC18024n) ? 4 : 2) | i10;
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
            z1<Float> z1VarD = C6443c.d(enumC18024n == EnumC18024n.f169436b ? 0.0f : 2.0f, new n0(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
            float fI1 = ((H1.d) composerStartRestartGroup.o(C6034t0.g())).I1(f169265a);
            Modifier.Companion companion = Modifier.INSTANCE;
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA, measurePolicyG, companion3.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
            C5806j c5806j = C5806j.f48836a;
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
            MeasurePolicy measurePolicyG2 = C5804h.g(companion2.o(), false);
            int iA2 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierA2);
            Function0<InterfaceC5953g> function0A2 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA2 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA2, measurePolicyG2, companion3.e());
            androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
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
            MeasurePolicy measurePolicyG3 = C5804h.g(companion2.o(), false);
            int iA3 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR3 = composerStartRestartGroup.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierA4);
            Function0<InterfaceC5953g> function0A3 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A3);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA3 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA3, measurePolicyG3, companion3.e());
            androidx.compose.runtime.D1.c(composerA3, interfaceC5884sR3, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
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
            t0L.a(new e(enumC18024n, function2, function22, i10));
        }
    }

    public static final C18021m d(EnumC18024n enumC18024n, H1.d dVar, InterfaceC6452i<Float> interfaceC6452i, Function1<? super EnumC18024n, Boolean> function1, C18029o1 c18029o1) {
        C18021m c18021m = new C18021m(enumC18024n, interfaceC6452i, function1, c18029o1);
        c18021m.l(dVar);
        return c18021m;
    }

    public static final InterfaceC13938a f(C17997e<?> c17997e, EnumC13937z enumC13937z) {
        return new m(c17997e, enumC13937z);
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
                z1<Float> z1VarD = C6443c.d(z10 ? 1.0f : 0.0f, new n0(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                if (z10) {
                    composerStartRestartGroup.startReplaceGroup(478960289);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Unit unit = Unit.f143329a;
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
                C13576j.a(modifierThen2, (Function1) objB2, composerStartRestartGroup, 0);
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

    public static final C18021m p(EnumC18024n enumC18024n, InterfaceC6452i<Float> interfaceC6452i, Function1<? super EnumC18024n, Boolean> function1, C18029o1 c18029o1, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            interfaceC6452i = C18015k.f169255a.a();
        }
        InterfaceC6452i<Float> interfaceC6452i2 = interfaceC6452i;
        if ((i11 & 4) != 0) {
            function1 = q.f169405f;
        }
        Function1<? super EnumC18024n, Boolean> function12 = function1;
        if ((i11 & 8) != 0) {
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new C18029o1();
                composer.t(objB);
            }
            c18029o1 = (C18029o1) objB;
        }
        C18029o1 c18029o12 = c18029o1;
        if (ComposerKt.M()) {
            ComposerKt.U(-862178912, i10, -1, "androidx.compose.material.rememberBackdropScaffoldState (BackdropScaffold.kt:257)");
        }
        H1.d dVar = (H1.d) composer.o(C6034t0.g());
        Object[] objArr = {interfaceC6452i2, function12, c18029o12};
        L0.k<C18021m, ?> kVarA = C18021m.f169412f.a(interfaceC6452i2, function12, c18029o12, dVar);
        boolean zV = ((((i10 & 14) ^ 6) > 4 && composer.V(enumC18024n)) || (i10 & 6) == 4) | composer.V(dVar) | composer.D(interfaceC6452i2) | ((((i10 & 896) ^ 384) > 256 && composer.V(function12)) || (i10 & 384) == 256) | ((((i10 & 7168) ^ 3072) > 2048 && composer.V(c18029o12)) || (i10 & 3072) == 2048);
        Object objB2 = composer.B();
        if (zV || objB2 == Composer.INSTANCE.a()) {
            Object rVar = new r(enumC18024n, dVar, interfaceC6452i2, function12, c18029o12);
            composer.t(rVar);
            objB2 = rVar;
        }
        C18021m c18021m = (C18021m) L0.c.c(objArr, kVarA, null, (Function0) objB2, composer, 0, 4);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c18021m;
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
            t0L.a(new C2709l(modifier, function2, function1, function4, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float h(z1<Float> z1Var) {
        return z1Var.getValue().floatValue();
    }
}
