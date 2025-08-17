package kotlin;

import H1.t;
import V0.C5306c0;
import V0.C5319g1;
import V0.C5322h1;
import V0.C5333l0;
import V0.C5346q0;
import V0.C5347r0;
import V0.C5349s0;
import V0.InterfaceC5316f1;
import X0.a;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.text.EnumC5682n;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.G0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.r;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.platform.Q1;
import androidx.compose.ui.window.q;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import j0.C14801J;
import j0.C14802K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import r1.u;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aL\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a)\u0010\u0015\u001a\u00020\u000b*\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u001a\u001a\u00020\u0019*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a-\u0010 \u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H\u0001¢\u0006\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Lw0/m;", "offsetProvider", "", "isStartHandle", "LF1/i;", "direction", "handlesCrossed", "LH1/k;", "minTouchTargetSize", "", "lineHeight", "Landroidx/compose/ui/Modifier;", "modifier", "", "b", "(Lw0/m;ZLF1/i;ZJFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "iconVisible", "isLeft", "c", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "e", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Z)Landroidx/compose/ui/Modifier;", "LT0/d;", "radius", "LV0/f1;", "d", "(LT0/d;F)LV0/f1;", "positionProvider", "LP0/e;", "handleReferencePoint", "content", "a", "(Lw0/m;LP0/e;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17715a {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w0.a$a, reason: collision with other inner class name */
    static final class C2615a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC17727m f165459f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ P0.e f165460g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f165461h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f165462i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2615a(InterfaceC17727m interfaceC17727m, P0.e eVar, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f165459f = interfaceC17727m;
            this.f165460g = eVar;
            this.f165461h = function2;
            this.f165462i = i10;
        }

        public final void a(Composer composer, int i10) {
            C17715a.a(this.f165459f, this.f165460g, this.f165461h, composer, J0.a(this.f165462i | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w0.a$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Q1 f165463f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f165464g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f165465h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Modifier f165466i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC17727m f165467j;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: w0.a$b$a, reason: collision with other inner class name */
        static final class C2616a extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ long f165468f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ boolean f165469g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Modifier f165470h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ InterfaceC17727m f165471i;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
            @SourceDebugExtension
            /* renamed from: w0.a$b$a$a, reason: collision with other inner class name */
            static final class C2617a extends Lambda implements Function0<Boolean> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ InterfaceC17727m f165472f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2617a(InterfaceC17727m interfaceC17727m) {
                    super(0);
                    this.f165472f = interfaceC17727m;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.valueOf((this.f165472f.a() & 9223372034707292159L) != 9205357640488583168L);
                }
            }

            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
            @SourceDebugExtension
            /* renamed from: w0.a$b$a$b, reason: collision with other inner class name */
            static final class C2618b extends Lambda implements Function0<Boolean> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ InterfaceC17727m f165473f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2618b(InterfaceC17727m interfaceC17727m) {
                    super(0);
                    this.f165473f = interfaceC17727m;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.valueOf((this.f165473f.a() & 9223372034707292159L) != 9205357640488583168L);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2616a(long j10, boolean z10, Modifier modifier, InterfaceC17727m interfaceC17727m) {
                super(2);
                this.f165468f = j10;
                this.f165469g = z10;
                this.f165470h = modifier;
                this.f165471i = interfaceC17727m;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1260045569, i10, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous>.<anonymous> (AndroidSelectionHandles.android.kt:86)");
                }
                if (this.f165468f != 9205357640488583168L) {
                    composer.startReplaceGroup(-837626688);
                    C5658d.e eVarB = this.f165469g ? C5658d.a.f48564a.b() : C5658d.a.f48564a.a();
                    Modifier modifierR = J.r(this.f165470h, H1.k.h(this.f165468f), H1.k.g(this.f165468f), 0.0f, 0.0f, 12, null);
                    InterfaceC17727m interfaceC17727m = this.f165471i;
                    boolean z10 = this.f165469g;
                    MeasurePolicy measurePolicyB = G.b(eVarB, P0.e.INSTANCE.l(), composer, 0);
                    int iA = C5717f.a(composer, 0);
                    InterfaceC5742s interfaceC5742sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, modifierR);
                    InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
                    Function0<InterfaceC5811g> function0A = companion.a();
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
                    D1.c(composerA, measurePolicyB, companion.e());
                    D1.c(composerA, interfaceC5742sR, companion.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                    if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion.f());
                    C14801J c14801j = C14801J.f139030a;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    boolean zD = composer.D(interfaceC17727m);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new C2617a(interfaceC17727m);
                        composer.t(objB);
                    }
                    C17715a.c(companion2, (Function0) objB, z10, composer, 6);
                    composer.v();
                    composer.P();
                } else {
                    composer.startReplaceGroup(-836697680);
                    Modifier modifier = this.f165470h;
                    boolean zD2 = composer.D(this.f165471i);
                    InterfaceC17727m interfaceC17727m2 = this.f165471i;
                    Object objB2 = composer.B();
                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new C2618b(interfaceC17727m2);
                        composer.t(objB2);
                    }
                    C17715a.c(modifier, (Function0) objB2, this.f165469g, composer, 0);
                    composer.P();
                }
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
        b(Q1 q12, long j10, boolean z10, Modifier modifier, InterfaceC17727m interfaceC17727m) {
            super(2);
            this.f165463f = q12;
            this.f165464g = j10;
            this.f165465h = z10;
            this.f165466i = modifier;
            this.f165467j = interfaceC17727m;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1365123137, i10, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:85)");
            }
            r.a(C5892t0.t().d(this.f165463f), ComposableLambdaKt.c(1260045569, true, new C2616a(this.f165464g, this.f165465h, this.f165466i, this.f165467j), composer, 54), composer, G0.f49976i | 48);
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
    /* renamed from: w0.a$c */
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC17727m f165474f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f165475g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ F1.i f165476h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f165477i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f165478j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f165479k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Modifier f165480l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f165481m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f165482n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC17727m interfaceC17727m, boolean z10, F1.i iVar, boolean z11, long j10, float f10, Modifier modifier, int i10, int i11) {
            super(2);
            this.f165474f = interfaceC17727m;
            this.f165475g = z10;
            this.f165476h = iVar;
            this.f165477i = z11;
            this.f165478j = j10;
            this.f165479k = f10;
            this.f165480l = modifier;
            this.f165481m = i10;
            this.f165482n = i11;
        }

        public final void a(Composer composer, int i10) {
            C17715a.b(this.f165474f, this.f165475g, this.f165476h, this.f165477i, this.f165478j, this.f165479k, this.f165480l, composer, J0.a(this.f165481m | 1), this.f165482n);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: w0.a$d */
    static final class d extends Lambda implements Function1<u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC17727m f165483f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f165484g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f165485h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC17727m interfaceC17727m, boolean z10, boolean z11) {
            super(1);
            this.f165483f = interfaceC17727m;
            this.f165484g = z10;
            this.f165485h = z11;
        }

        public final void a(u uVar) {
            long jA = this.f165483f.a();
            uVar.a(C17693B.d(), new SelectionHandleInfo(this.f165484g ? EnumC5682n.f49691b : EnumC5682n.f49692c, jA, this.f165485h ? EnumC17740z.f165632a : EnumC17740z.f165634c, (9223372034707292159L & jA) != 9205357640488583168L, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w0.a$e */
    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f165486f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Boolean> f165487g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f165488h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f165489i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Modifier modifier, Function0<Boolean> function0, boolean z10, int i10) {
            super(2);
            this.f165486f = modifier;
            this.f165487g = function0;
            this.f165488h = z10;
            this.f165489i = i10;
        }

        public final void a(Composer composer, int i10) {
            C17715a.c(this.f165486f, this.f165487g, this.f165488h, composer, J0.a(this.f165489i | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: w0.a$f */
    static final class f extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Boolean> f165490f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f165491g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LT0/d;", "LT0/i;", "a", "(LT0/d;)LT0/i;"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: w0.a$f$a, reason: collision with other inner class name */
        static final class C2619a extends Lambda implements Function1<T0.d, T0.i> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ long f165492f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function0<Boolean> f165493g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f165494h;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/c;", "", "a", "(LX0/c;)V"}, k = 3, mv = {1, 9, 0})
            @SourceDebugExtension
            /* renamed from: w0.a$f$a$a, reason: collision with other inner class name */
            static final class C2620a extends Lambda implements Function1<X0.c, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function0<Boolean> f165495f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ boolean f165496g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ InterfaceC5316f1 f165497h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ C5347r0 f165498i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2620a(Function0<Boolean> function0, boolean z10, InterfaceC5316f1 interfaceC5316f1, C5347r0 c5347r0) {
                    super(1);
                    this.f165495f = function0;
                    this.f165496g = z10;
                    this.f165497h = interfaceC5316f1;
                    this.f165498i = c5347r0;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(X0.c cVar) {
                    a(cVar);
                    return Unit.f142422a;
                }

                public final void a(X0.c cVar) {
                    cVar.a2();
                    if (!this.f165495f.invoke().booleanValue()) {
                        return;
                    }
                    if (this.f165496g) {
                        InterfaceC5316f1 interfaceC5316f1 = this.f165497h;
                        C5347r0 c5347r0 = this.f165498i;
                        long jQ1 = cVar.Q1();
                        X0.d drawContext = cVar.getDrawContext();
                        long jB = drawContext.b();
                        drawContext.g().save();
                        try {
                            drawContext.getTransform().f(-1.0f, 1.0f, jQ1);
                            X0.f.X0(cVar, interfaceC5316f1, 0L, 0.0f, null, c5347r0, 0, 46, null);
                            return;
                        } finally {
                            drawContext.g().i();
                            drawContext.h(jB);
                        }
                    }
                    X0.f.X0(cVar, this.f165497h, 0L, 0.0f, null, this.f165498i, 0, 46, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2619a(long j10, Function0<Boolean> function0, boolean z10) {
                super(1);
                this.f165492f = j10;
                this.f165493g = function0;
                this.f165494h = z10;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final T0.i invoke(T0.d dVar) {
                return dVar.q(new C2620a(this.f165493g, this.f165494h, C17715a.d(dVar, Float.intBitsToFloat((int) (dVar.b() >> 32)) / 2.0f), C5347r0.Companion.c(C5347r0.INSTANCE, this.f165492f, 0, 2, null)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Function0<Boolean> function0, boolean z10) {
            super(3);
            this.f165490f = function0;
            this.f165491g = z10;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return a(modifier, composer, num.intValue());
        }

        public final Modifier a(Modifier modifier, Composer composer, int i10) {
            composer.startReplaceGroup(-196777734);
            if (ComposerKt.M()) {
                ComposerKt.U(-196777734, i10, -1, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:133)");
            }
            long selectionHandleColor = ((SelectionColors) composer.o(C17713W.b())).getSelectionHandleColor();
            boolean zE = composer.e(selectionHandleColor) | composer.V(this.f165490f) | composer.a(this.f165491g);
            Function0<Boolean> function0 = this.f165490f;
            boolean z10 = this.f165491g;
            Object objB = composer.B();
            if (zE || objB == Composer.INSTANCE.a()) {
                objB = new C2619a(selectionHandleColor, function0, z10);
                composer.t(objB);
            }
            Modifier modifierC = androidx.compose.ui.draw.b.c(modifier, (Function1) objB);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return modifierC;
        }
    }

    public static final void a(InterfaceC17727m interfaceC17727m, P0.e eVar, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(476043083);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(interfaceC17727m) : composerStartRestartGroup.D(interfaceC17727m) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(eVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(function2) ? 256 : 128;
        }
        boolean z10 = false;
        if (composerStartRestartGroup.p((i11 & 147) != 146, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(476043083, i11, -1, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:223)");
            }
            boolean z11 = (i11 & 112) == 32;
            if ((i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.V(interfaceC17727m))) {
                z10 = true;
            }
            boolean z12 = z11 | z10;
            Object objB = composerStartRestartGroup.B();
            if (z12 || objB == Composer.INSTANCE.a()) {
                objB = new C17722h(eVar, interfaceC17727m);
                composerStartRestartGroup.t(objB);
            }
            androidx.compose.ui.window.b.a((C17722h) objB, null, new q(false, false, false, null, true, false, 15, null), function2, composerStartRestartGroup, ((i11 << 3) & 7168) | 384, 2);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new C2615a(interfaceC17727m, eVar, function2, i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(kotlin.InterfaceC17727m r19, boolean r20, F1.i r21, boolean r22, long r23, float r25, androidx.compose.ui.Modifier r26, androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17715a.b(w0.m, boolean, F1.i, boolean, long, float, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final InterfaceC5316f1 d(T0.d dVar, float f10) {
        int iCeil = ((int) Math.ceil(f10)) * 2;
        C17721g c17721g = C17721g.f165521a;
        InterfaceC5316f1 interfaceC5316f1C = c17721g.c();
        Canvas canvasA = c17721g.a();
        X0.a aVarB = c17721g.b();
        if (interfaceC5316f1C == null || canvasA == null || iCeil > interfaceC5316f1C.getWidth() || iCeil > interfaceC5316f1C.getHeight()) {
            interfaceC5316f1C = C5322h1.b(iCeil, iCeil, C5319g1.INSTANCE.a(), false, null, 24, null);
            c17721g.f(interfaceC5316f1C);
            canvasA = C5333l0.a(interfaceC5316f1C);
            c17721g.d(canvasA);
        }
        InterfaceC5316f1 interfaceC5316f1 = interfaceC5316f1C;
        Canvas canvas = canvasA;
        if (aVarB == null) {
            aVarB = new X0.a();
            c17721g.e(aVarB);
        }
        X0.a aVar = aVarB;
        t layoutDirection = dVar.getLayoutDirection();
        float width = interfaceC5316f1.getWidth();
        float height = interfaceC5316f1.getHeight();
        long jD = U0.k.d((Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32));
        a.DrawParams drawParams = aVar.getDrawParams();
        H1.d density = drawParams.getDensity();
        t layoutDirection2 = drawParams.getLayoutDirection();
        Canvas canvas2 = drawParams.getCanvas();
        long size = drawParams.getSize();
        a.DrawParams drawParams2 = aVar.getDrawParams();
        drawParams2.j(dVar);
        drawParams2.k(layoutDirection);
        drawParams2.i(canvas);
        drawParams2.l(jD);
        canvas.save();
        X0.f.i1(aVar, C5346q0.INSTANCE.a(), 0L, aVar.b(), 0.0f, null, null, C5306c0.INSTANCE.a(), 58, null);
        X0.f.i1(aVar, C5349s0.d(4278190080L), U0.f.INSTANCE.c(), U0.k.d((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L)), 0.0f, null, null, 0, BinsView.TOTE_HEIGHT_DP, null);
        X0.f.f1(aVar, C5349s0.d(4278190080L), f10, U0.f.e((Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32)), 0.0f, null, null, 0, BinsView.TOTE_HEIGHT_DP, null);
        canvas.i();
        a.DrawParams drawParams3 = aVar.getDrawParams();
        drawParams3.j(density);
        drawParams3.k(layoutDirection2);
        drawParams3.i(canvas2);
        drawParams3.l(size);
        return interfaceC5316f1;
    }

    public static final Modifier e(Modifier modifier, Function0<Boolean> function0, boolean z10) {
        return androidx.compose.ui.b.c(modifier, null, new f(function0, z10), 1, null);
    }

    public static final void c(Modifier modifier, Function0<Boolean> function0, boolean z10, Composer composer, int i10) {
        int i11;
        boolean z11;
        int i12;
        int i13;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(2111672474);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(function0)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.a(z10)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) != 146) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (composerStartRestartGroup.p(z11, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(2111672474, i11, -1, "androidx.compose.foundation.text.selection.SelectionHandleIcon (AndroidSelectionHandles.android.kt:127)");
            }
            C14802K.a(e(J.w(modifier, C17693B.c(), C17693B.b()), function0, z10), composerStartRestartGroup, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new e(modifier, function0, z10, i10));
        }
    }
}
