package kotlin;

import P0.e;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.G0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.r;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import j0.C14801J;
import j0.C14802K;
import j0.C14808Q;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import j0.InterfaceC14806O;
import j0.S;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a}\u0010\u0011\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001au\u0010\u0013\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001ai\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a3\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001cH\u0000¢\u0006\u0004\b!\u0010\"\u001ae\u0010$\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\nH\u0003ø\u0001\u0000¢\u0006\u0004\b$\u0010%\"\u0014\u0010'\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010&\"\u0014\u0010(\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010&\"\u0014\u0010*\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010)\"\u0014\u0010+\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010)\"\u0014\u0010-\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010&\"\u0014\u0010/\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010&\"\u0014\u00102\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"Lkotlin/Function0;", "", "title", "Lj0/O;", "windowInsets", "Landroidx/compose/ui/Modifier;", "modifier", "navigationIcon", "Lkotlin/Function1;", "Lj0/I;", "Lkotlin/ExtensionFunctionType;", "actions", "LV0/q0;", "backgroundColor", "contentColor", "LH1/h;", "elevation", "c", "(Lkotlin/jvm/functions/Function2;Lj0/O;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJFLandroidx/compose/runtime/Composer;II)V", "d", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJFLandroidx/compose/runtime/Composer;II)V", "LV0/D1;", "cutoutShape", "Lj0/C;", "contentPadding", "content", "b", "(Landroidx/compose/ui/Modifier;JJLV0/D1;FLj0/C;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "", "controlPointX", "verticalOffset", "radius", "Lkotlin/Pair;", "l", "(FFF)Lkotlin/Pair;", "shape", "a", "(JJFLj0/C;LV0/D1;Lj0/O;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "F", "AppBarHeight", "AppBarHorizontalPadding", "Landroidx/compose/ui/Modifier;", "TitleInsetWithoutIcon", "TitleIconModifier", "e", "BottomAppBarCutoutOffset", "f", "BottomAppBarRoundedEdgeRadius", "g", "Lj0/O;", "ZeroInsets", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.i, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17943i {

    /* renamed from: a, reason: collision with root package name */
    private static final float f167928a = H1.h.p(56);

    /* renamed from: b, reason: collision with root package name */
    private static final float f167929b;

    /* renamed from: c, reason: collision with root package name */
    private static final Modifier f167930c;

    /* renamed from: d, reason: collision with root package name */
    private static final Modifier f167931d;

    /* renamed from: e, reason: collision with root package name */
    private static final float f167932e;

    /* renamed from: f, reason: collision with root package name */
    private static final float f167933f;

    /* renamed from: g, reason: collision with root package name */
    private static final InterfaceC14806O f167934g;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.i$a */
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC14806O f167935f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC14794C f167936g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14800I, Composer, Integer, Unit> f167937h;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: x0.i$a$a, reason: collision with other inner class name */
        static final class C2671a extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC14806O f167938f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC14794C f167939g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function3<InterfaceC14800I, Composer, Integer, Unit> f167940h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2671a(InterfaceC14806O interfaceC14806O, InterfaceC14794C interfaceC14794C, Function3<? super InterfaceC14800I, ? super Composer, ? super Integer, Unit> function3) {
                super(2);
                this.f167938f = interfaceC14806O;
                this.f167939g = interfaceC14794C;
                this.f167940h = function3;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(600325466, i10, -1, "androidx.compose.material.AppBar.<anonymous>.<anonymous> (AppBar.kt:713)");
                }
                Modifier modifierI = J.i(D.h(S.c(J.h(Modifier.INSTANCE, 0.0f, 1, null), this.f167938f), this.f167939g), C17943i.f167928a);
                C5658d.e eVarG = C5658d.f48555a.g();
                e.c cVarI = P0.e.INSTANCE.i();
                Function3<InterfaceC14800I, Composer, Integer, Unit> function3 = this.f167940h;
                MeasurePolicy measurePolicyB = G.b(eVarG, cVarI, composer, 54);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
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
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyB, companion.e());
                D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion.f());
                function3.invoke(C14801J.f139030a, composer, 6);
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
        a(InterfaceC14806O interfaceC14806O, InterfaceC14794C interfaceC14794C, Function3<? super InterfaceC14800I, ? super Composer, ? super Integer, Unit> function3) {
            super(2);
            this.f167935f = interfaceC14806O;
            this.f167936g = interfaceC14794C;
            this.f167937h = function3;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(213273114, i10, -1, "androidx.compose.material.AppBar.<anonymous> (AppBar.kt:712)");
            }
            r.a(C17892M.a().d(Float.valueOf(C17890L.f167124a.d(composer, 6))), ComposableLambdaKt.c(600325466, true, new C2671a(this.f167935f, this.f167936g, this.f167937h), composer, 54), composer, G0.f49976i | 48);
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
    /* renamed from: x0.i$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f167941f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f167942g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f167943h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC14794C f167944i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ V0.D1 f167945j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC14806O f167946k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Modifier f167947l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14800I, Composer, Integer, Unit> f167948m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f167949n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f167950o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(long j10, long j11, float f10, InterfaceC14794C interfaceC14794C, V0.D1 d12, InterfaceC14806O interfaceC14806O, Modifier modifier, Function3<? super InterfaceC14800I, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f167941f = j10;
            this.f167942g = j11;
            this.f167943h = f10;
            this.f167944i = interfaceC14794C;
            this.f167945j = d12;
            this.f167946k = interfaceC14806O;
            this.f167947l = modifier;
            this.f167948m = function3;
            this.f167949n = i10;
            this.f167950o = i11;
        }

        public final void a(Composer composer, int i10) {
            C17943i.a(this.f167941f, this.f167942g, this.f167943h, this.f167944i, this.f167945j, this.f167946k, this.f167947l, this.f167948m, composer, J0.a(this.f167949n | 1), this.f167950o);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.i$c */
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f167951f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f167952g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f167953h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ V0.D1 f167954i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f167955j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC14794C f167956k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14800I, Composer, Integer, Unit> f167957l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f167958m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f167959n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Modifier modifier, long j10, long j11, V0.D1 d12, float f10, InterfaceC14794C interfaceC14794C, Function3<? super InterfaceC14800I, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f167951f = modifier;
            this.f167952g = j10;
            this.f167953h = j11;
            this.f167954i = d12;
            this.f167955j = f10;
            this.f167956k = interfaceC14794C;
            this.f167957l = function3;
            this.f167958m = i10;
            this.f167959n = i11;
        }

        public final void a(Composer composer, int i10) {
            C17943i.b(this.f167951f, this.f167952g, this.f167953h, this.f167954i, this.f167955j, this.f167956k, this.f167957l, composer, J0.a(this.f167958m | 1), this.f167959n);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lj0/I;", "", "a", "(Lj0/I;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.i$d */
    static final class d extends Lambda implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167960f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167961g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14800I, Composer, Integer, Unit> f167962h;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.i$d$a */
        static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f167963f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function2<? super Composer, ? super Integer, Unit> function2) {
                super(2);
                this.f167963f = function2;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1654084516, i10, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous>.<anonymous> (AppBar.kt:116)");
                }
                r.a(C17892M.a().d(Float.valueOf(C17890L.f167124a.c(composer, 6))), this.f167963f, composer, G0.f49976i);
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
        /* renamed from: x0.i$d$b */
        static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function3<InterfaceC14800I, Composer, Integer, Unit> f167964f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(Function3<? super InterfaceC14800I, ? super Composer, ? super Integer, Unit> function3) {
                super(2);
                this.f167964f = function3;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(2129753671, i10, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous> (AppBar.kt:124)");
                }
                Modifier modifierD = J.d(Modifier.INSTANCE, 0.0f, 1, null);
                C5658d.e eVarC = C5658d.f48555a.c();
                e.c cVarI = P0.e.INSTANCE.i();
                Function3<InterfaceC14800I, Composer, Integer, Unit> function3 = this.f167964f;
                MeasurePolicy measurePolicyB = G.b(eVarC, cVarI, composer, 54);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
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
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyB, companion.e());
                D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion.f());
                function3.invoke(C14801J.f139030a, composer, 6);
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
        d(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super InterfaceC14800I, ? super Composer, ? super Integer, Unit> function3) {
            super(3);
            this.f167960f = function2;
            this.f167961g = function22;
            this.f167962h = function3;
        }

        public final void a(InterfaceC14800I interfaceC14800I, Composer composer, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= composer.V(interfaceC14800I) ? 4 : 2;
            }
            if (!composer.p((i10 & 19) != 18, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1849684359, i10, -1, "androidx.compose.material.TopAppBar.<anonymous> (AppBar.kt:103)");
            }
            if (this.f167960f == null) {
                composer.startReplaceGroup(1108917613);
                C14802K.a(C17943i.f167930c, composer, 6);
                composer.P();
            } else {
                composer.startReplaceGroup(1108983209);
                Modifier modifier = C17943i.f167931d;
                e.c cVarI = P0.e.INSTANCE.i();
                Function2<Composer, Integer, Unit> function2 = this.f167960f;
                MeasurePolicy measurePolicyB = G.b(C5658d.f48555a.g(), cVarI, composer, 48);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifier);
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
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyB, companion.e());
                D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion.f());
                C14801J c14801j = C14801J.f139030a;
                r.a(C17892M.a().d(Float.valueOf(C17890L.f167124a.c(composer, 6))), function2, composer, G0.f49976i);
                composer.v();
                composer.P();
            }
            Modifier modifierB = InterfaceC14800I.b(interfaceC14800I, J.d(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
            e.c cVarI2 = P0.e.INSTANCE.i();
            Function2<Composer, Integer, Unit> function22 = this.f167961g;
            MeasurePolicy measurePolicyB2 = G.b(C5658d.f48555a.g(), cVarI2, composer, 48);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierB);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A2 = companion2.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = D1.a(composer);
            D1.c(composerA2, measurePolicyB2, companion2.e());
            D1.c(composerA2, interfaceC5742sR2, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion2.b();
            if (composerA2.h() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion2.f());
            C14801J c14801j2 = C14801J.f139030a;
            N1.a(C17877E0.f166879a.c(composer, 6).getH6(), ComposableLambdaKt.c(-1654084516, true, new a(function22), composer, 54), composer, 48);
            composer.v();
            r.a(C17892M.a().d(Float.valueOf(C17890L.f167124a.d(composer, 6))), ComposableLambdaKt.c(2129753671, true, new b(this.f167962h), composer, 54), composer, 48 | G0.f49976i);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
            a(interfaceC14800I, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.i$e */
    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167965f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC14806O f167966g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f167967h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167968i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14800I, Composer, Integer, Unit> f167969j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ long f167970k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ long f167971l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ float f167972m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f167973n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f167974o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function2<? super Composer, ? super Integer, Unit> function2, InterfaceC14806O interfaceC14806O, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super InterfaceC14800I, ? super Composer, ? super Integer, Unit> function3, long j10, long j11, float f10, int i10, int i11) {
            super(2);
            this.f167965f = function2;
            this.f167966g = interfaceC14806O;
            this.f167967h = modifier;
            this.f167968i = function22;
            this.f167969j = function3;
            this.f167970k = j10;
            this.f167971l = j11;
            this.f167972m = f10;
            this.f167973n = i10;
            this.f167974o = i11;
        }

        public final void a(Composer composer, int i10) {
            C17943i.c(this.f167965f, this.f167966g, this.f167967h, this.f167968i, this.f167969j, this.f167970k, this.f167971l, this.f167972m, composer, J0.a(this.f167973n | 1), this.f167974o);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.i$f */
    static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167975f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f167976g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167977h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14800I, Composer, Integer, Unit> f167978i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f167979j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ long f167980k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ float f167981l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f167982m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f167983n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super InterfaceC14800I, ? super Composer, ? super Integer, Unit> function3, long j10, long j11, float f10, int i10, int i11) {
            super(2);
            this.f167975f = function2;
            this.f167976g = modifier;
            this.f167977h = function22;
            this.f167978i = function3;
            this.f167979j = j10;
            this.f167980k = j11;
            this.f167981l = f10;
            this.f167982m = i10;
            this.f167983n = i11;
        }

        public final void a(Composer composer, int i10) {
            C17943i.d(this.f167975f, this.f167976g, this.f167977h, this.f167978i, this.f167979j, this.f167980k, this.f167981l, composer, J0.a(this.f167982m | 1), this.f167983n);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    static {
        float f10 = 4;
        float fP = H1.h.p(f10);
        f167929b = fP;
        Modifier.Companion companion = Modifier.INSTANCE;
        f167930c = J.z(companion, H1.h.p(H1.h.p(16) - fP));
        f167931d = J.z(J.d(companion, 0.0f, 1, null), H1.h.p(H1.h.p(72) - fP));
        f167932e = H1.h.p(8);
        f167933f = H1.h.p(f10);
        f167934g = C14808Q.c(H1.h.p(0), 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(long r25, long r27, float r29, j0.InterfaceC14794C r30, V0.D1 r31, j0.InterfaceC14806O r32, androidx.compose.ui.Modifier r33, kotlin.jvm.functions.Function3<? super j0.InterfaceC14800I, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17943i.a(long, long, float, j0.C, V0.D1, j0.O, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(androidx.compose.ui.Modifier r24, long r25, long r27, V0.D1 r29, float r30, j0.InterfaceC14794C r31, kotlin.jvm.functions.Function3<? super j0.InterfaceC14800I, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17943i.b(androidx.compose.ui.Modifier, long, long, V0.D1, float, j0.C, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r26, j0.InterfaceC14806O r27, androidx.compose.ui.Modifier r28, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, kotlin.jvm.functions.Function3<? super j0.InterfaceC14800I, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, long r31, long r33, float r35, androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17943i.c(kotlin.jvm.functions.Function2, j0.O, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, long, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r24, androidx.compose.ui.Modifier r25, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r26, kotlin.jvm.functions.Function3<? super j0.InterfaceC14800I, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r27, long r28, long r30, float r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17943i.d(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, long, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Pair<Float, Float> l(float f10, float f11, float f12) {
        Float fValueOf;
        Float fValueOf2;
        Pair pairA;
        Float fValueOf3;
        Float fValueOf4;
        float f13 = f11 * f11;
        float f14 = f12 * f12;
        float f15 = (f10 * f10) + f13;
        float f16 = f13 * f14 * (f15 - f14);
        float f17 = f10 * f14;
        double d10 = f16;
        float fSqrt = (f17 - ((float) Math.sqrt(d10))) / f15;
        float fSqrt2 = (f17 + ((float) Math.sqrt(d10))) / f15;
        float fSqrt3 = (float) Math.sqrt(f14 - (fSqrt * fSqrt));
        float fSqrt4 = (float) Math.sqrt(f14 - (fSqrt2 * fSqrt2));
        if (f11 > 0.0f) {
            if (fSqrt3 > fSqrt4) {
                fValueOf3 = Float.valueOf(fSqrt);
                fValueOf4 = Float.valueOf(fSqrt3);
            } else {
                fValueOf3 = Float.valueOf(fSqrt2);
                fValueOf4 = Float.valueOf(fSqrt4);
            }
            pairA = TuplesKt.a(fValueOf3, fValueOf4);
        } else {
            if (fSqrt3 < fSqrt4) {
                fValueOf = Float.valueOf(fSqrt);
                fValueOf2 = Float.valueOf(fSqrt3);
            } else {
                fValueOf = Float.valueOf(fSqrt2);
                fValueOf2 = Float.valueOf(fSqrt4);
            }
            pairA = TuplesKt.a(fValueOf, fValueOf2);
        }
        float fFloatValue = ((Number) pairA.a()).floatValue();
        float fFloatValue2 = ((Number) pairA.b()).floatValue();
        if (fFloatValue < f10) {
            fFloatValue2 = -fFloatValue2;
        }
        return TuplesKt.a(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2));
    }
}
