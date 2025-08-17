package kotlin;

import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.H0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.platform.InterfaceC5856h;
import java.util.List;
import kotlin.C6292E;
import kotlin.C6313a;
import kotlin.C6315b;
import kotlin.C6327j;
import kotlin.C6330m;
import kotlin.InterfaceC6326i;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.n0;
import qv.InterfaceC16622O;
import qv.Z;
import r1.C16699g;
import r1.C16705m;
import r1.s;
import r1.u;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0014\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0019\u001a\u00020\u000b2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001aH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a+\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0019\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u001f\u0010 *N\b\u0002\u0010#\"#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\u001a¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00060\u00042#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\u001a¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00060\u0004¨\u0006$"}, d2 = {"Lx0/o1;", "hostState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lx0/k1;", "", "snackbar", "b", "(Lx0/o1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lx0/m1;", "", "hasAction", "Landroidx/compose/ui/platform/h;", "accessibilityManager", "", "h", "(Lx0/m1;ZLandroidx/compose/ui/platform/h;)J", "current", "content", "a", "(Lx0/k1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lc0/i;", "", "animation", "visible", "Lkotlin/Function0;", "onAnimationFinish", "Landroidx/compose/runtime/z1;", "f", "(Lc0/i;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/z1;", "g", "(Lc0/i;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/z1;", "Lkotlin/ParameterName;", "name", "FadeInFadeOutTransition", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.n1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17960n1 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "", "children", "a", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.n1$a, reason: from Kotlin metadata */
    static final class Function0 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC17951k1 f168384f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC17951k1 f168385g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ List<InterfaceC17951k1> f168386h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ C17971r0<InterfaceC17951k1> f168387i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f168388j;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.n1$a$a */
        static final class a extends Lambda implements Function1<u, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f168389f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f168390g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ InterfaceC17951k1 f168391h;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: x0.n1$a$a$a, reason: collision with other inner class name */
            static final class C2689a extends Lambda implements kotlin.jvm.functions.Function0<Boolean> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ InterfaceC17951k1 f168392f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2689a(InterfaceC17951k1 interfaceC17951k1) {
                    super(0);
                    this.f168392f = interfaceC17951k1;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    this.f168392f.dismiss();
                    return Boolean.TRUE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(boolean z10, String str, InterfaceC17951k1 interfaceC17951k1) {
                super(1);
                this.f168389f = z10;
                this.f168390g = str;
                this.f168391h = interfaceC17951k1;
            }

            public final void a(u uVar) {
                if (this.f168389f) {
                    s.n0(uVar, C16699g.INSTANCE.b());
                }
                s.o0(uVar, this.f168390g);
                s.n(uVar, null, new C2689a(this.f168391h), 1, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
                a(uVar);
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: x0.n1$a$b */
        static final class b extends Lambda implements kotlin.jvm.functions.Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC17951k1 f168393f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C17971r0<InterfaceC17951k1> f168394g;

            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lx0/q0;", "Lx0/k1;", "it", "", "a", "(Lx0/q0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: x0.n1$a$b$a */
            static final class a extends Lambda implements Function1<FadeInFadeOutAnimationItem<InterfaceC17951k1>, Boolean> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ InterfaceC17951k1 f168395f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(InterfaceC17951k1 interfaceC17951k1) {
                    super(1);
                    this.f168395f = interfaceC17951k1;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(FadeInFadeOutAnimationItem<InterfaceC17951k1> fadeInFadeOutAnimationItem) {
                    return Boolean.valueOf(Intrinsics.e(fadeInFadeOutAnimationItem.c(), this.f168395f));
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f142422a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC17951k1 interfaceC17951k1, C17971r0<InterfaceC17951k1> c17971r0) {
                super(0);
                this.f168393f = interfaceC17951k1;
                this.f168394g = c17971r0;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (Intrinsics.e(this.f168393f, this.f168394g.getCurrent())) {
                    return;
                }
                CollectionsKt.J(this.f168394g.b(), new a(this.f168393f));
                H0 scope = this.f168394g.getScope();
                if (scope != null) {
                    scope.invalidate();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Function0(InterfaceC17951k1 interfaceC17951k1, InterfaceC17951k1 interfaceC17951k12, List<InterfaceC17951k1> list, C17971r0<InterfaceC17951k1> c17971r0, String str) {
            super(3);
            this.f168384f = interfaceC17951k1;
            this.f168385g = interfaceC17951k12;
            this.f168386h = list;
            this.f168387i = c17971r0;
            this.f168388j = str;
        }

        public final void a(Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.D(function2) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if (!composer.p((i11 & 19) != 18, i11 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1471040642, i11, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:257)");
            }
            boolean zE = Intrinsics.e(this.f168384f, this.f168385g);
            int i12 = zE ? 150 : 75;
            int i13 = (!zE || J1.a.b(this.f168386h).size() == 1) ? 0 : 75;
            n0 n0VarK = C6327j.k(i12, i13, C6292E.d());
            boolean zD = composer.D(this.f168384f) | composer.D(this.f168387i);
            InterfaceC17951k1 interfaceC17951k1 = this.f168384f;
            C17971r0<InterfaceC17951k1> c17971r0 = this.f168387i;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new b(interfaceC17951k1, c17971r0);
                composer.t(objB);
            }
            z1 z1VarF = C17960n1.f(n0VarK, zE, (kotlin.jvm.functions.Function0) objB, composer, 0, 0);
            z1 z1VarG = C17960n1.g(C6327j.k(i12, i13, C6292E.c()), zE, composer, 0);
            Modifier modifierC = androidx.compose.ui.graphics.d.c(Modifier.INSTANCE, ((Number) z1VarG.getValue()).floatValue(), ((Number) z1VarG.getValue()).floatValue(), ((Number) z1VarF.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131064, null);
            boolean zA = composer.a(zE) | composer.V(this.f168388j) | composer.D(this.f168384f);
            String str = this.f168388j;
            InterfaceC17951k1 interfaceC17951k12 = this.f168384f;
            Object objB2 = composer.B();
            if (zA || objB2 == Composer.INSTANCE.a()) {
                objB2 = new a(zE, str, interfaceC17951k12);
                composer.t(objB2);
            }
            Modifier modifierD = C16705m.d(modifierC, false, (Function1) objB2, 1, null);
            MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            kotlin.jvm.functions.Function0<InterfaceC5811g> function0A = companion.a();
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
            D1.c(composerA, measurePolicyG, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C5664j c5664j = C5664j.f48612a;
            function2.invoke(composer, Integer.valueOf(i11 & 14));
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            a(function2, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.n1$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC17951k1, Composer, Integer, Unit> f168396f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC17951k1 f168397g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function3<? super InterfaceC17951k1, ? super Composer, ? super Integer, Unit> function3, InterfaceC17951k1 interfaceC17951k1) {
            super(2);
            this.f168396f = function3;
            this.f168397g = interfaceC17951k1;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2041982076, i10, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:317)");
            }
            Function3<InterfaceC17951k1, Composer, Integer, Unit> function3 = this.f168396f;
            InterfaceC17951k1 interfaceC17951k1 = this.f168397g;
            Intrinsics.g(interfaceC17951k1);
            function3.invoke(interfaceC17951k1, composer, 0);
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
    /* renamed from: x0.n1$c */
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC17951k1 f168398f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f168399g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC17951k1, Composer, Integer, Unit> f168400h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f168401i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f168402j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(InterfaceC17951k1 interfaceC17951k1, Modifier modifier, Function3<? super InterfaceC17951k1, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f168398f = interfaceC17951k1;
            this.f168399g = modifier;
            this.f168400h = function3;
            this.f168401i = i10;
            this.f168402j = i11;
        }

        public final void a(Composer composer, int i10) {
            C17960n1.a(this.f168398f, this.f168399g, this.f168400h, composer, J0.a(this.f168401i | 1), this.f168402j);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.SnackbarHostKt$SnackbarHost$1$1", f = "SnackbarHost.kt", l = {166}, m = "invokeSuspend")
    /* renamed from: x0.n1$d */
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f168403a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC17951k1 f168404b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5856h f168405c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC17951k1 interfaceC17951k1, InterfaceC5856h interfaceC5856h, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f168404b = interfaceC17951k1;
            this.f168405c = interfaceC5856h;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.f168404b, this.f168405c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f168403a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17951k1 interfaceC17951k1 = this.f168404b;
                if (interfaceC17951k1 != null) {
                    EnumC17957m1 duration = interfaceC17951k1.getDuration();
                    if (this.f168404b.getActionLabel() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    long jH = C17960n1.h(duration, z10, this.f168405c);
                    this.f168403a = 1;
                    if (Z.b(jH, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
            this.f168404b.dismiss();
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.n1$e */
    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17963o1 f168406f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f168407g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC17951k1, Composer, Integer, Unit> f168408h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f168409i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f168410j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(C17963o1 c17963o1, Modifier modifier, Function3<? super InterfaceC17951k1, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f168406f = c17963o1;
            this.f168407g = modifier;
            this.f168408h = function3;
            this.f168409i = i10;
            this.f168410j = i11;
        }

        public final void a(Composer composer, int i10) {
            C17960n1.b(this.f168406f, this.f168407g, this.f168408h, composer, J0.a(this.f168409i | 1), this.f168410j);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.n1$g */
    static final class g extends Lambda implements kotlin.jvm.functions.Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final g f168411f = new g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.SnackbarHostKt$animatedOpacity$2$1", f = "SnackbarHost.kt", l = {344}, m = "invokeSuspend")
    /* renamed from: x0.n1$h */
    static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f168412a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6313a<Float, C6330m> f168413b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f168414c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6326i<Float> f168415d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.functions.Function0<Unit> f168416e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C6313a<Float, C6330m> c6313a, boolean z10, InterfaceC6326i<Float> interfaceC6326i, kotlin.jvm.functions.Function0<Unit> function0, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f168413b = c6313a;
            this.f168414c = z10;
            this.f168415d = interfaceC6326i;
            this.f168416e = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new h(this.f168413b, this.f168414c, this.f168415d, this.f168416e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float f10;
            h hVar;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f168412a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    hVar = this;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C6313a<Float, C6330m> c6313a = this.f168413b;
                if (this.f168414c) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                Float fC = Boxing.c(f10);
                InterfaceC6326i<Float> interfaceC6326i = this.f168415d;
                this.f168412a = 1;
                hVar = this;
                if (C6313a.f(c6313a, fC, interfaceC6326i, null, null, hVar, 12, null) == objF) {
                    return objF;
                }
            }
            hVar.f168416e.invoke();
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.SnackbarHostKt$animatedScale$1$1", f = "SnackbarHost.kt", l = {354}, m = "invokeSuspend")
    /* renamed from: x0.n1$i */
    static final class i extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f168417a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6313a<Float, C6330m> f168418b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f168419c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6326i<Float> f168420d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(C6313a<Float, C6330m> c6313a, boolean z10, InterfaceC6326i<Float> interfaceC6326i, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f168418b = c6313a;
            this.f168419c = z10;
            this.f168420d = interfaceC6326i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new i(this.f168418b, this.f168419c, this.f168420d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float f10;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f168417a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C6313a<Float, C6330m> c6313a = this.f168418b;
                if (this.f168419c) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.8f;
                }
                Float fC = Boxing.c(f10);
                InterfaceC6326i<Float> interfaceC6326i = this.f168420d;
                this.f168417a = 1;
                if (C6313a.f(c6313a, fC, interfaceC6326i, null, null, this, 12, null) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(kotlin.InterfaceC17951k1 r19, androidx.compose.ui.Modifier r20, kotlin.jvm.functions.Function3<? super kotlin.InterfaceC17951k1, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r21, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17960n1.a(x0.k1, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.n1$f */
    public /* synthetic */ class f {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC17957m1.values().length];
            try {
                iArr[EnumC17957m1.f168344c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17957m1.f168343b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC17957m1.f168342a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z1<Float> f(InterfaceC6326i<Float> interfaceC6326i, boolean z10, kotlin.jvm.functions.Function0<Unit> function0, Composer composer, int i10, int i11) {
        if ((i11 & 4) != 0) {
            function0 = g.f168411f;
        }
        kotlin.jvm.functions.Function0<Unit> function02 = function0;
        if (ComposerKt.M()) {
            ComposerKt.U(1016418159, i10, -1, "androidx.compose.material.animatedOpacity (SnackbarHost.kt:340)");
        }
        Object objB = composer.B();
        Composer.Companion companion = Composer.INSTANCE;
        if (objB == companion.a()) {
            objB = C6315b.b(!z10 ? 1.0f : 0.0f, 0.0f, 2, null);
            composer.t(objB);
        }
        C6313a c6313a = (C6313a) objB;
        Boolean boolValueOf = Boolean.valueOf(z10);
        boolean zD = composer.D(c6313a) | ((((i10 & 112) ^ 48) > 32 && composer.a(z10)) || (i10 & 48) == 32) | composer.D(interfaceC6326i) | ((((i10 & 896) ^ 384) > 256 && composer.V(function02)) || (i10 & 384) == 256);
        Object objB2 = composer.B();
        if (zD || objB2 == companion.a()) {
            Object hVar = new h(c6313a, z10, interfaceC6326i, function02, null);
            composer.t(hVar);
            objB2 = hVar;
        }
        J.g(boolValueOf, (Function2) objB2, composer, (i10 >> 3) & 14);
        z1<Float> z1VarG = c6313a.g();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return z1VarG;
    }

    public static final long h(EnumC17957m1 enumC17957m1, boolean z10, InterfaceC5856h interfaceC5856h) {
        long j10;
        int i10 = f.$EnumSwitchMapping$0[enumC17957m1.ordinal()];
        if (i10 == 1) {
            j10 = Long.MAX_VALUE;
        } else if (i10 == 2) {
            j10 = 10000;
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            j10 = 4000;
        }
        long j11 = j10;
        return interfaceC5856h == null ? j11 : interfaceC5856h.a(j11, true, true, z10);
    }

    public static final void b(C17963o1 c17963o1, Modifier modifier, Function3<? super InterfaceC17951k1, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        Modifier modifier2;
        Function3<? super InterfaceC17951k1, ? super Composer, ? super Integer, Unit> function32;
        Composer composerStartRestartGroup = composer.startRestartGroup(431012348);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.V(c17963o1)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i17 = i11 & 4;
        if (i17 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.D(function3)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (composerStartRestartGroup.p(z10, i12 & 1)) {
            if (i16 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (i17 != 0) {
                function3 = C17886J.f167076a.a();
            }
            if (ComposerKt.M()) {
                ComposerKt.U(431012348, i12, -1, "androidx.compose.material.SnackbarHost (SnackbarHost.kt:155)");
            }
            InterfaceC17951k1 interfaceC17951k1B = c17963o1.b();
            InterfaceC5856h interfaceC5856h = (InterfaceC5856h) composerStartRestartGroup.o(C5892t0.c());
            boolean zD = composerStartRestartGroup.D(interfaceC17951k1B) | composerStartRestartGroup.D(interfaceC5856h);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new d(interfaceC17951k1B, interfaceC5856h, null);
                composerStartRestartGroup.t(objB);
            }
            J.g(interfaceC17951k1B, (Function2) objB, composerStartRestartGroup, 0);
            Function3<? super InterfaceC17951k1, ? super Composer, ? super Integer, Unit> function33 = function3;
            a(c17963o1.b(), modifier3, function33, composerStartRestartGroup, i12 & 1008, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
            function32 = function33;
        } else {
            composerStartRestartGroup.K();
            modifier2 = modifier;
            function32 = function3;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new e(c17963o1, modifier2, function32, i10, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z1<Float> g(InterfaceC6326i<Float> interfaceC6326i, boolean z10, Composer composer, int i10) {
        boolean z11;
        float f10;
        if (ComposerKt.M()) {
            ComposerKt.U(2003504988, i10, -1, "androidx.compose.material.animatedScale (SnackbarHost.kt:350)");
        }
        Object objB = composer.B();
        Composer.Companion companion = Composer.INSTANCE;
        if (objB == companion.a()) {
            if (!z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.8f;
            }
            objB = C6315b.b(f10, 0.0f, 2, null);
            composer.t(objB);
        }
        C6313a c6313a = (C6313a) objB;
        Boolean boolValueOf = Boolean.valueOf(z10);
        boolean zD = composer.D(c6313a);
        if ((((i10 & 112) ^ 48) > 32 && composer.a(z10)) || (i10 & 48) == 32) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean zD2 = zD | z11 | composer.D(interfaceC6326i);
        Object objB2 = composer.B();
        if (zD2 || objB2 == companion.a()) {
            objB2 = new i(c6313a, z10, interfaceC6326i, null);
            composer.t(objB2);
        }
        J.g(boolValueOf, (Function2) objB2, composer, (i10 >> 3) & 14);
        z1<Float> z1VarG = c6313a.g();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return z1VarG;
    }
}
