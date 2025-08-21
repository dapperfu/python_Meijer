package kotlin;

import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.x;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.G0;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.r;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.T;
import d0.V;
import j0.C14903g;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import kotlin.C6418E;
import kotlin.C6433U;
import kotlin.C6453j;
import kotlin.InterfaceC6419F;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.n0;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0003\u001aV\u0010\u000f\u001a\u00020\f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a`\u0010\u0019\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\"\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010!\"\u001a\u0010&\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010%\"\u0014\u0010(\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010!\"\u001a\u0010*\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b)\u0010%\"\u0014\u0010,\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010!\"\u0014\u0010.\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010!\"\u0014\u00100\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010!¨\u00064²\u0006\f\u00102\u001a\u0002018\nX\u008a\u0084\u0002²\u0006\f\u00103\u001a\u0002018\nX\u008a\u0084\u0002"}, d2 = {"Lc0/U;", "", "expandedStates", "Landroidx/compose/runtime/l0;", "Landroidx/compose/ui/graphics/i;", "transformOriginState", "Ld0/V;", "scrollState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lj0/f;", "", "Lkotlin/ExtensionFunctionType;", "content", "a", "(Lc0/U;Landroidx/compose/runtime/l0;Ld0/V;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "onClick", "enabled", "Lj0/C;", "contentPadding", "Lh0/l;", "interactionSource", "Lj0/I;", "d", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLj0/C;Lh0/l;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "LH1/p;", "parentBounds", "menuBounds", "h", "(LH1/p;LH1/p;)J", "LH1/h;", "F", "MenuElevation", "b", "j", "()F", "MenuVerticalMargin", "c", "DropdownMenuItemHorizontalPadding", "i", "DropdownMenuVerticalPadding", "e", "DropdownMenuItemDefaultMinWidth", "f", "DropdownMenuItemDefaultMaxWidth", "g", "DropdownMenuItemDefaultMinHeight", "", "scale", "alpha", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.I0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17951I0 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f168058a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f168059b;

    /* renamed from: d, reason: collision with root package name */
    private static final float f168061d;

    /* renamed from: g, reason: collision with root package name */
    private static final float f168064g;

    /* renamed from: c, reason: collision with root package name */
    private static final float f168060c = H1.h.p(16);

    /* renamed from: e, reason: collision with root package name */
    private static final float f168062e = H1.h.p(112);

    /* renamed from: f, reason: collision with root package name */
    private static final float f168063f = H1.h.p(280);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/e;", "", "a", "(Landroidx/compose/ui/graphics/e;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.I0$a */
    static final class a extends Lambda implements Function1<androidx.compose.ui.graphics.e, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<androidx.compose.ui.graphics.i> f168065f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ z1<Float> f168066g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ z1<Float> f168067h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC5872l0<androidx.compose.ui.graphics.i> interfaceC5872l0, z1<Float> z1Var, z1<Float> z1Var2) {
            super(1);
            this.f168065f = interfaceC5872l0;
            this.f168066g = z1Var;
            this.f168067h = z1Var2;
        }

        public final void a(androidx.compose.ui.graphics.e eVar) {
            eVar.h(C17951I0.b(this.f168066g));
            eVar.m(C17951I0.b(this.f168066g));
            eVar.d(C17951I0.c(this.f168067h));
            eVar.F0(this.f168065f.getValue().getPackedValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.e eVar) {
            a(eVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.I0$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f168068f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ V f168069g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14902f, Composer, Integer, Unit> f168070h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Modifier modifier, V v10, Function3<? super InterfaceC14902f, ? super Composer, ? super Integer, Unit> function3) {
            super(2);
            this.f168068f = modifier;
            this.f168069g = v10;
            this.f168070h = function3;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(895555282, i10, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:211)");
            }
            Modifier modifierG = T.g(x.b(D.k(this.f168068f, 0.0f, C17951I0.i(), 1, null), j0.x.f139750b), this.f168069g, false, null, false, 14, null);
            Function3<InterfaceC14902f, Composer, Integer, Unit> function3 = this.f168070h;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierG);
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
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
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
    /* renamed from: x0.I0$c */
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C6433U<Boolean> f168071f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<androidx.compose.ui.graphics.i> f168072g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ V f168073h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Modifier f168074i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14902f, Composer, Integer, Unit> f168075j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f168076k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f168077l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(C6433U<Boolean> c6433u, InterfaceC5872l0<androidx.compose.ui.graphics.i> interfaceC5872l0, V v10, Modifier modifier, Function3<? super InterfaceC14902f, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f168071f = c6433u;
            this.f168072g = interfaceC5872l0;
            this.f168073h = v10;
            this.f168074i = modifier;
            this.f168075j = function3;
            this.f168076k = i10;
            this.f168077l = i11;
        }

        public final void a(Composer composer, int i10) {
            C17951I0.a(this.f168071f, this.f168072g, this.f168073h, this.f168074i, this.f168075j, composer, J0.a(this.f168076k | 1), this.f168077l);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/k0$b;", "", "Lc0/F;", "", "a", "(Lc0/k0$b;Landroidx/compose/runtime/Composer;I)Lc0/F;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.I0$d */
    static final class d extends Lambda implements Function3<k0.b<Boolean>, Composer, Integer, InterfaceC6419F<Float>> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f168078f = new d();

        d() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC6419F<Float> invoke(k0.b<Boolean> bVar, Composer composer, Integer num) {
            return a(bVar, composer, num.intValue());
        }

        public final InterfaceC6419F<Float> a(k0.b<Boolean> bVar, Composer composer, int i10) {
            n0 n0VarL;
            composer.startReplaceGroup(-2065494304);
            if (ComposerKt.M()) {
                ComposerKt.U(-2065494304, i10, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:184)");
            }
            if (bVar.c(Boolean.FALSE, Boolean.TRUE)) {
                n0VarL = C6453j.l(30, 0, null, 6, null);
            } else {
                n0VarL = C6453j.l(75, 0, null, 6, null);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return n0VarL;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/k0$b;", "", "Lc0/F;", "", "a", "(Lc0/k0$b;Landroidx/compose/runtime/Composer;I)Lc0/F;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.I0$e */
    static final class e extends Lambda implements Function3<k0.b<Boolean>, Composer, Integer, InterfaceC6419F<Float>> {

        /* renamed from: f, reason: collision with root package name */
        public static final e f168079f = new e();

        e() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC6419F<Float> invoke(k0.b<Boolean> bVar, Composer composer, Integer num) {
            return a(bVar, composer, num.intValue());
        }

        public final InterfaceC6419F<Float> a(k0.b<Boolean> bVar, Composer composer, int i10) {
            n0 n0VarL;
            composer.startReplaceGroup(-800950068);
            if (ComposerKt.M()) {
                ComposerKt.U(-800950068, i10, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:163)");
            }
            if (bVar.c(Boolean.FALSE, Boolean.TRUE)) {
                n0VarL = C6453j.l(BinsView.TOTE_HEIGHT_DP, 0, C6418E.e(), 2, null);
            } else {
                n0VarL = C6453j.l(1, 74, null, 4, null);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return n0VarL;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.I0$f */
    static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f168080f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14888I, Composer, Integer, Unit> f168081g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC14888I f168082h;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.I0$f$a */
        static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function3<InterfaceC14888I, Composer, Integer, Unit> f168083f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC14888I f168084g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function3<? super InterfaceC14888I, ? super Composer, ? super Integer, Unit> function3, InterfaceC14888I interfaceC14888I) {
                super(2);
                this.f168083f = function3;
                this.f168084g = interfaceC14888I;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1705995688, i10, -1, "androidx.compose.material.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:254)");
                }
                this.f168083f.invoke(this.f168084g, composer, 0);
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
        f(boolean z10, Function3<? super InterfaceC14888I, ? super Composer, ? super Integer, Unit> function3, InterfaceC14888I interfaceC14888I) {
            super(2);
            this.f168080f = z10;
            this.f168081g = function3;
            this.f168082h = interfaceC14888I;
        }

        public final void a(Composer composer, int i10) {
            float fB;
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1190489496, i10, -1, "androidx.compose.material.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:253)");
            }
            if (this.f168080f) {
                composer.startReplaceGroup(-186854702);
                fB = C17956L.f168212a.c(composer, 6);
            } else {
                composer.startReplaceGroup(-186853962);
                fB = C17956L.f168212a.b(composer, 6);
            }
            composer.P();
            r.a(C17958M.a().d(Float.valueOf(fB)), ComposableLambdaKt.c(-1705995688, true, new a(this.f168081g, this.f168082h), composer, 54), composer, G0.f50200i | 48);
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
    /* renamed from: x0.I0$g */
    static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f168085f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f168086g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f168087h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC14882C f168088i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ h0.l f168089j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14888I, Composer, Integer, Unit> f168090k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f168091l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f168092m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(Function0<Unit> function0, Modifier modifier, boolean z10, InterfaceC14882C interfaceC14882C, h0.l lVar, Function3<? super InterfaceC14888I, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f168085f = function0;
            this.f168086g = modifier;
            this.f168087h = z10;
            this.f168088i = interfaceC14882C;
            this.f168089j = lVar;
            this.f168090k = function3;
            this.f168091l = i10;
            this.f168092m = i11;
        }

        public final void a(Composer composer, int i10) {
            C17951I0.d(this.f168085f, this.f168086g, this.f168087h, this.f168088i, this.f168089j, this.f168090k, composer, J0.a(this.f168091l | 1), this.f168092m);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    static {
        float f10 = 8;
        f168058a = H1.h.p(f10);
        float f11 = 48;
        f168059b = H1.h.p(f11);
        f168061d = H1.h.p(f10);
        f168064g = H1.h.p(f11);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(kotlin.C6433U<java.lang.Boolean> r24, androidx.compose.runtime.InterfaceC5872l0<androidx.compose.ui.graphics.i> r25, d0.V r26, androidx.compose.ui.Modifier r27, kotlin.jvm.functions.Function3<? super j0.InterfaceC14902f, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r28, androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17951I0.a(c0.U, androidx.compose.runtime.l0, d0.V, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(kotlin.jvm.functions.Function0<kotlin.Unit> r21, androidx.compose.ui.Modifier r22, boolean r23, j0.InterfaceC14882C r24, h0.l r25, kotlin.jvm.functions.Function3<? super j0.InterfaceC14888I, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r26, androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17951I0.d(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, j0.C, h0.l, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final float i() {
        return f168061d;
    }

    public static final float j() {
        return f168059b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(z1<Float> z1Var) {
        return z1Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(z1<Float> z1Var) {
        return z1Var.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long h(H1.p r5, H1.p r6) {
        /*
            int r0 = r6.getLeft()
            int r1 = r5.getRight()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r0 < r1) goto Lf
        Ld:
            r0 = r3
            goto L49
        Lf:
            int r0 = r6.getRight()
            int r1 = r5.getLeft()
            if (r0 > r1) goto L1b
            r0 = r2
            goto L49
        L1b:
            int r0 = r6.j()
            if (r0 != 0) goto L22
            goto Ld
        L22:
            int r0 = r5.getLeft()
            int r1 = r6.getLeft()
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r5.getRight()
            int r4 = r6.getRight()
            int r1 = java.lang.Math.min(r1, r4)
            int r0 = r0 + r1
            int r0 = r0 / 2
            int r1 = r6.getLeft()
            int r0 = r0 - r1
            float r0 = (float) r0
            int r1 = r6.j()
            float r1 = (float) r1
            float r0 = r0 / r1
        L49:
            int r1 = r6.getTop()
            int r4 = r5.getBottom()
            if (r1 < r4) goto L55
        L53:
            r2 = r3
            goto L8f
        L55:
            int r1 = r6.getBottom()
            int r4 = r5.getTop()
            if (r1 > r4) goto L60
            goto L8f
        L60:
            int r1 = r6.e()
            if (r1 != 0) goto L67
            goto L53
        L67:
            int r1 = r5.getTop()
            int r2 = r6.getTop()
            int r1 = java.lang.Math.max(r1, r2)
            int r5 = r5.getBottom()
            int r2 = r6.getBottom()
            int r5 = java.lang.Math.min(r5, r2)
            int r1 = r1 + r5
            int r1 = r1 / 2
            int r5 = r6.getTop()
            int r1 = r1 - r5
            float r5 = (float) r1
            int r6 = r6.e()
            float r6 = (float) r6
            float r2 = r5 / r6
        L8f:
            long r5 = V0.L1.a(r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17951I0.h(H1.p, H1.p):long");
    }
}
