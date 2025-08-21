package kotlin;

import P0.e;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.G0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.r;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import j0.C14889J;
import j0.C14890K;
import j0.C14896Q;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import j0.InterfaceC14894O;
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
public final class C18009i {

    /* renamed from: a, reason: collision with root package name */
    private static final float f169016a = H1.h.p(56);

    /* renamed from: b, reason: collision with root package name */
    private static final float f169017b;

    /* renamed from: c, reason: collision with root package name */
    private static final Modifier f169018c;

    /* renamed from: d, reason: collision with root package name */
    private static final Modifier f169019d;

    /* renamed from: e, reason: collision with root package name */
    private static final float f169020e;

    /* renamed from: f, reason: collision with root package name */
    private static final float f169021f;

    /* renamed from: g, reason: collision with root package name */
    private static final InterfaceC14894O f169022g;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.i$a */
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC14894O f169023f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC14882C f169024g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14888I, Composer, Integer, Unit> f169025h;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: x0.i$a$a, reason: collision with other inner class name */
        static final class C2695a extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC14894O f169026f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC14882C f169027g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function3<InterfaceC14888I, Composer, Integer, Unit> f169028h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2695a(InterfaceC14894O interfaceC14894O, InterfaceC14882C interfaceC14882C, Function3<? super InterfaceC14888I, ? super Composer, ? super Integer, Unit> function3) {
                super(2);
                this.f169026f = interfaceC14894O;
                this.f169027g = interfaceC14882C;
                this.f169028h = function3;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(600325466, i10, -1, "androidx.compose.material.AppBar.<anonymous>.<anonymous> (AppBar.kt:713)");
                }
                Modifier modifierI = J.i(D.h(S.c(J.h(Modifier.INSTANCE, 0.0f, 1, null), this.f169026f), this.f169027g), C18009i.f169016a);
                C5800d.e eVarG = C5800d.f48779a.g();
                e.c cVarI = P0.e.INSTANCE.i();
                Function3<InterfaceC14888I, Composer, Integer, Unit> function3 = this.f169028h;
                MeasurePolicy measurePolicyB = G.b(eVarG, cVarI, composer, 54);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
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
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyB, companion.e());
                D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion.f());
                function3.invoke(C14889J.f139620a, composer, 6);
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
        a(InterfaceC14894O interfaceC14894O, InterfaceC14882C interfaceC14882C, Function3<? super InterfaceC14888I, ? super Composer, ? super Integer, Unit> function3) {
            super(2);
            this.f169023f = interfaceC14894O;
            this.f169024g = interfaceC14882C;
            this.f169025h = function3;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(213273114, i10, -1, "androidx.compose.material.AppBar.<anonymous> (AppBar.kt:712)");
            }
            r.a(C17958M.a().d(Float.valueOf(C17956L.f168212a.d(composer, 6))), ComposableLambdaKt.c(600325466, true, new C2695a(this.f169023f, this.f169024g, this.f169025h), composer, 54), composer, G0.f50200i | 48);
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
    /* renamed from: x0.i$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f169029f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f169030g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f169031h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC14882C f169032i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ V0.D1 f169033j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC14894O f169034k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Modifier f169035l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14888I, Composer, Integer, Unit> f169036m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f169037n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f169038o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(long j10, long j11, float f10, InterfaceC14882C interfaceC14882C, V0.D1 d12, InterfaceC14894O interfaceC14894O, Modifier modifier, Function3<? super InterfaceC14888I, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f169029f = j10;
            this.f169030g = j11;
            this.f169031h = f10;
            this.f169032i = interfaceC14882C;
            this.f169033j = d12;
            this.f169034k = interfaceC14894O;
            this.f169035l = modifier;
            this.f169036m = function3;
            this.f169037n = i10;
            this.f169038o = i11;
        }

        public final void a(Composer composer, int i10) {
            C18009i.a(this.f169029f, this.f169030g, this.f169031h, this.f169032i, this.f169033j, this.f169034k, this.f169035l, this.f169036m, composer, J0.a(this.f169037n | 1), this.f169038o);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.i$c */
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f169039f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f169040g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f169041h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ V0.D1 f169042i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f169043j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC14882C f169044k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14888I, Composer, Integer, Unit> f169045l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f169046m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f169047n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Modifier modifier, long j10, long j11, V0.D1 d12, float f10, InterfaceC14882C interfaceC14882C, Function3<? super InterfaceC14888I, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f169039f = modifier;
            this.f169040g = j10;
            this.f169041h = j11;
            this.f169042i = d12;
            this.f169043j = f10;
            this.f169044k = interfaceC14882C;
            this.f169045l = function3;
            this.f169046m = i10;
            this.f169047n = i11;
        }

        public final void a(Composer composer, int i10) {
            C18009i.b(this.f169039f, this.f169040g, this.f169041h, this.f169042i, this.f169043j, this.f169044k, this.f169045l, composer, J0.a(this.f169046m | 1), this.f169047n);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lj0/I;", "", "a", "(Lj0/I;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.i$d */
    static final class d extends Lambda implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f169048f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f169049g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14888I, Composer, Integer, Unit> f169050h;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.i$d$a */
        static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f169051f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function2<? super Composer, ? super Integer, Unit> function2) {
                super(2);
                this.f169051f = function2;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1654084516, i10, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous>.<anonymous> (AppBar.kt:116)");
                }
                r.a(C17958M.a().d(Float.valueOf(C17956L.f168212a.c(composer, 6))), this.f169051f, composer, G0.f50200i);
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

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: x0.i$d$b */
        static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function3<InterfaceC14888I, Composer, Integer, Unit> f169052f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(Function3<? super InterfaceC14888I, ? super Composer, ? super Integer, Unit> function3) {
                super(2);
                this.f169052f = function3;
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
                C5800d.e eVarC = C5800d.f48779a.c();
                e.c cVarI = P0.e.INSTANCE.i();
                Function3<InterfaceC14888I, Composer, Integer, Unit> function3 = this.f169052f;
                MeasurePolicy measurePolicyB = G.b(eVarC, cVarI, composer, 54);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
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
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyB, companion.e());
                D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion.f());
                function3.invoke(C14889J.f139620a, composer, 6);
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
        d(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super InterfaceC14888I, ? super Composer, ? super Integer, Unit> function3) {
            super(3);
            this.f169048f = function2;
            this.f169049g = function22;
            this.f169050h = function3;
        }

        public final void a(InterfaceC14888I interfaceC14888I, Composer composer, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= composer.V(interfaceC14888I) ? 4 : 2;
            }
            if (!composer.p((i10 & 19) != 18, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1849684359, i10, -1, "androidx.compose.material.TopAppBar.<anonymous> (AppBar.kt:103)");
            }
            if (this.f169048f == null) {
                composer.startReplaceGroup(1108917613);
                C14890K.a(C18009i.f169018c, composer, 6);
                composer.P();
            } else {
                composer.startReplaceGroup(1108983209);
                Modifier modifier = C18009i.f169019d;
                e.c cVarI = P0.e.INSTANCE.i();
                Function2<Composer, Integer, Unit> function2 = this.f169048f;
                MeasurePolicy measurePolicyB = G.b(C5800d.f48779a.g(), cVarI, composer, 48);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifier);
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
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyB, companion.e());
                D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion.f());
                C14889J c14889j = C14889J.f139620a;
                r.a(C17958M.a().d(Float.valueOf(C17956L.f168212a.c(composer, 6))), function2, composer, G0.f50200i);
                composer.v();
                composer.P();
            }
            Modifier modifierB = InterfaceC14888I.b(interfaceC14888I, J.d(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
            e.c cVarI2 = P0.e.INSTANCE.i();
            Function2<Composer, Integer, Unit> function22 = this.f169049g;
            MeasurePolicy measurePolicyB2 = G.b(C5800d.f48779a.g(), cVarI2, composer, 48);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierB);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A2 = companion2.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = D1.a(composer);
            D1.c(composerA2, measurePolicyB2, companion2.e());
            D1.c(composerA2, interfaceC5884sR2, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion2.b();
            if (composerA2.h() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion2.f());
            C14889J c14889j2 = C14889J.f139620a;
            N1.a(C17943E0.f167967a.c(composer, 6).getH6(), ComposableLambdaKt.c(-1654084516, true, new a(function22), composer, 54), composer, 48);
            composer.v();
            r.a(C17958M.a().d(Float.valueOf(C17956L.f168212a.d(composer, 6))), ComposableLambdaKt.c(2129753671, true, new b(this.f169050h), composer, 54), composer, 48 | G0.f50200i);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
            a(interfaceC14888I, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.i$e */
    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f169053f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC14894O f169054g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f169055h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f169056i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14888I, Composer, Integer, Unit> f169057j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ long f169058k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ long f169059l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ float f169060m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f169061n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f169062o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function2<? super Composer, ? super Integer, Unit> function2, InterfaceC14894O interfaceC14894O, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super InterfaceC14888I, ? super Composer, ? super Integer, Unit> function3, long j10, long j11, float f10, int i10, int i11) {
            super(2);
            this.f169053f = function2;
            this.f169054g = interfaceC14894O;
            this.f169055h = modifier;
            this.f169056i = function22;
            this.f169057j = function3;
            this.f169058k = j10;
            this.f169059l = j11;
            this.f169060m = f10;
            this.f169061n = i10;
            this.f169062o = i11;
        }

        public final void a(Composer composer, int i10) {
            C18009i.c(this.f169053f, this.f169054g, this.f169055h, this.f169056i, this.f169057j, this.f169058k, this.f169059l, this.f169060m, composer, J0.a(this.f169061n | 1), this.f169062o);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.i$f */
    static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f169063f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f169064g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f169065h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14888I, Composer, Integer, Unit> f169066i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f169067j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ long f169068k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ float f169069l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f169070m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f169071n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super InterfaceC14888I, ? super Composer, ? super Integer, Unit> function3, long j10, long j11, float f10, int i10, int i11) {
            super(2);
            this.f169063f = function2;
            this.f169064g = modifier;
            this.f169065h = function22;
            this.f169066i = function3;
            this.f169067j = j10;
            this.f169068k = j11;
            this.f169069l = f10;
            this.f169070m = i10;
            this.f169071n = i11;
        }

        public final void a(Composer composer, int i10) {
            C18009i.d(this.f169063f, this.f169064g, this.f169065h, this.f169066i, this.f169067j, this.f169068k, this.f169069l, composer, J0.a(this.f169070m | 1), this.f169071n);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    static {
        float f10 = 4;
        float fP = H1.h.p(f10);
        f169017b = fP;
        Modifier.Companion companion = Modifier.INSTANCE;
        f169018c = J.z(companion, H1.h.p(H1.h.p(16) - fP));
        f169019d = J.z(J.d(companion, 0.0f, 1, null), H1.h.p(H1.h.p(72) - fP));
        f169020e = H1.h.p(8);
        f169021f = H1.h.p(f10);
        f169022g = C14896Q.c(H1.h.p(0), 0.0f, 0.0f, 0.0f, 14, null);
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
    public static final void a(long r25, long r27, float r29, j0.InterfaceC14882C r30, V0.D1 r31, j0.InterfaceC14894O r32, androidx.compose.ui.Modifier r33, kotlin.jvm.functions.Function3<? super j0.InterfaceC14888I, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C18009i.a(long, long, float, j0.C, V0.D1, j0.O, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
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
    public static final void b(androidx.compose.ui.Modifier r24, long r25, long r27, V0.D1 r29, float r30, j0.InterfaceC14882C r31, kotlin.jvm.functions.Function3<? super j0.InterfaceC14888I, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C18009i.b(androidx.compose.ui.Modifier, long, long, V0.D1, float, j0.C, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
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
    public static final void c(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r26, j0.InterfaceC14894O r27, androidx.compose.ui.Modifier r28, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, kotlin.jvm.functions.Function3<? super j0.InterfaceC14888I, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, long r31, long r33, float r35, androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C18009i.c(kotlin.jvm.functions.Function2, j0.O, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, long, long, float, androidx.compose.runtime.Composer, int, int):void");
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
    public static final void d(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r24, androidx.compose.ui.Modifier r25, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r26, kotlin.jvm.functions.Function3<? super j0.InterfaceC14888I, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r27, long r28, long r30, float r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C18009i.d(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, long, long, float, androidx.compose.runtime.Composer, int, int):void");
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
