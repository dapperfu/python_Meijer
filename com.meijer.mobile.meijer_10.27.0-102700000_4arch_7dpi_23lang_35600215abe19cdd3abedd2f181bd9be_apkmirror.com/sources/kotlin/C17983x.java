package kotlin;

import P0.e;
import V0.C5346q0;
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
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.semantics.Role;
import d0.BorderStroke;
import j0.C14801J;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import r1.s;
import r1.u;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u008c\u0001\u0010\u0017\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u008c\u0001\u0010\u0019\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0004\b\u0019\u0010\u0018\u001a\u008c\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0004\b\u001a\u0010\u0018¨\u0006\u001d²\u0006\f\u0010\u001c\u001a\u00020\u001b8\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Lh0/l;", "interactionSource", "Lx0/w;", "elevation", "LV0/D1;", "shape", "Ld0/h;", "border", "Lx0/u;", "colors", "Lj0/C;", "contentPadding", "Lkotlin/Function1;", "Lj0/I;", "Lkotlin/ExtensionFunctionType;", "content", "a", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLh0/l;Lx0/w;LV0/D1;Ld0/h;Lx0/u;Lj0/C;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "c", "d", "LV0/q0;", "contentColor", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.x, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17983x {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.x$a */
    static final class a extends Lambda implements Function1<u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f168855f = new a();

        a() {
            super(1);
        }

        public final void a(u uVar) {
            s.s0(uVar, Role.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.x$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z1<C5346q0> f168856f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC14794C f168857g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14800I, Composer, Integer, Unit> f168858h;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.x$b$a */
        static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC14794C f168859f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function3<InterfaceC14800I, Composer, Integer, Unit> f168860g;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
            @SourceDebugExtension
            /* renamed from: x0.x$b$a$a, reason: collision with other inner class name */
            static final class C2701a extends Lambda implements Function2<Composer, Integer, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ InterfaceC14794C f168861f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ Function3<InterfaceC14800I, Composer, Integer, Unit> f168862g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C2701a(InterfaceC14794C interfaceC14794C, Function3<? super InterfaceC14800I, ? super Composer, ? super Integer, Unit> function3) {
                    super(2);
                    this.f168861f = interfaceC14794C;
                    this.f168862g = function3;
                }

                public final void a(Composer composer, int i10) {
                    if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-630330208, i10, -1, "androidx.compose.material.Button.<anonymous>.<anonymous>.<anonymous> (Button.kt:123)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    C17979v c17979v = C17979v.f168713a;
                    Modifier modifierH = D.h(J.a(companion, c17979v.e(), c17979v.d()), this.f168861f);
                    C5658d.f fVarB = C5658d.f48555a.b();
                    e.c cVarI = P0.e.INSTANCE.i();
                    Function3<InterfaceC14800I, Composer, Integer, Unit> function3 = this.f168862g;
                    MeasurePolicy measurePolicyB = G.b(fVarB, cVarI, composer, 54);
                    int iA = C5717f.a(composer, 0);
                    InterfaceC5742s interfaceC5742sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
                    D1.c(composerA, measurePolicyB, companion2.e());
                    D1.c(composerA, interfaceC5742sR, companion2.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                    if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion2.f());
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
            a(InterfaceC14794C interfaceC14794C, Function3<? super InterfaceC14800I, ? super Composer, ? super Integer, Unit> function3) {
                super(2);
                this.f168859f = interfaceC14794C;
                this.f168860g = function3;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1699085201, i10, -1, "androidx.compose.material.Button.<anonymous>.<anonymous> (Button.kt:122)");
                }
                N1.a(C17877E0.f166879a.c(composer, 6).getButton(), ComposableLambdaKt.c(-630330208, true, new C2701a(this.f168859f, this.f168860g), composer, 54), composer, 48);
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
        b(z1<C5346q0> z1Var, InterfaceC14794C interfaceC14794C, Function3<? super InterfaceC14800I, ? super Composer, ? super Integer, Unit> function3) {
            super(2);
            this.f168856f = z1Var;
            this.f168857g = interfaceC14794C;
            this.f168858h = function3;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(7524271, i10, -1, "androidx.compose.material.Button.<anonymous> (Button.kt:121)");
            }
            r.a(C17892M.a().d(Float.valueOf(C5346q0.t(C17983x.b(this.f168856f)))), ComposableLambdaKt.c(-1699085201, true, new a(this.f168857g, this.f168858h), composer, 54), composer, G0.f49976i | 48);
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
    /* renamed from: x0.x$c */
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f168863f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f168864g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f168865h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ h0.l f168866i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC17981w f168867j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ V0.D1 f168868k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ BorderStroke f168869l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ InterfaceC17977u f168870m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC14794C f168871n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14800I, Composer, Integer, Unit> f168872o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f168873p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f168874q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function0<Unit> function0, Modifier modifier, boolean z10, h0.l lVar, InterfaceC17981w interfaceC17981w, V0.D1 d12, BorderStroke borderStroke, InterfaceC17977u interfaceC17977u, InterfaceC14794C interfaceC14794C, Function3<? super InterfaceC14800I, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f168863f = function0;
            this.f168864g = modifier;
            this.f168865h = z10;
            this.f168866i = lVar;
            this.f168867j = interfaceC17981w;
            this.f168868k = d12;
            this.f168869l = borderStroke;
            this.f168870m = interfaceC17977u;
            this.f168871n = interfaceC14794C;
            this.f168872o = function3;
            this.f168873p = i10;
            this.f168874q = i11;
        }

        public final void a(Composer composer, int i10) {
            C17983x.a(this.f168863f, this.f168864g, this.f168865h, this.f168866i, this.f168867j, this.f168868k, this.f168869l, this.f168870m, this.f168871n, this.f168872o, composer, J0.a(this.f168873p | 1), this.f168874q);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fb  */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r6v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(kotlin.jvm.functions.Function0<kotlin.Unit> r30, androidx.compose.ui.Modifier r31, boolean r32, h0.l r33, kotlin.InterfaceC17981w r34, V0.D1 r35, d0.BorderStroke r36, kotlin.InterfaceC17977u r37, j0.InterfaceC14794C r38, kotlin.jvm.functions.Function3<? super j0.InterfaceC14800I, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r39, androidx.compose.runtime.Composer r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17983x.a(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, h0.l, x0.w, V0.D1, d0.h, x0.u, j0.C, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void c(Function0<Unit> function0, Modifier modifier, boolean z10, h0.l lVar, InterfaceC17981w interfaceC17981w, V0.D1 d12, BorderStroke borderStroke, InterfaceC17977u interfaceC17977u, InterfaceC14794C interfaceC14794C, Function3<? super InterfaceC14800I, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i10, int i11) {
        Modifier modifier2 = (i11 & 2) != 0 ? Modifier.INSTANCE : modifier;
        boolean z11 = (i11 & 4) != 0 ? true : z10;
        h0.l lVar2 = (i11 & 8) != 0 ? null : lVar;
        InterfaceC17981w interfaceC17981w2 = (i11 & 16) != 0 ? null : interfaceC17981w;
        V0.D1 small = (i11 & 32) != 0 ? C17877E0.f166879a.b(composer, 6).getSmall() : d12;
        BorderStroke borderStrokeF = (i11 & 64) != 0 ? C17979v.f168713a.f(composer, 6) : borderStroke;
        InterfaceC17977u interfaceC17977uH = (i11 & 128) != 0 ? C17979v.f168713a.h(0L, 0L, 0L, composer, 3072, 7) : interfaceC17977u;
        InterfaceC14794C interfaceC14794CC = (i11 & 256) != 0 ? C17979v.f168713a.c() : interfaceC14794C;
        if (ComposerKt.M()) {
            ComposerKt.U(-1776134358, i10, -1, "androidx.compose.material.OutlinedButton (Button.kt:183)");
        }
        a(function0, modifier2, z11, lVar2, interfaceC17981w2, small, borderStrokeF, interfaceC17977uH, interfaceC14794CC, function3, composer, i10 & 2147483646, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
    }

    public static final void d(Function0<Unit> function0, Modifier modifier, boolean z10, h0.l lVar, InterfaceC17981w interfaceC17981w, V0.D1 d12, BorderStroke borderStroke, InterfaceC17977u interfaceC17977u, InterfaceC14794C interfaceC14794C, Function3<? super InterfaceC14800I, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i10, int i11) {
        Modifier modifier2 = (i11 & 2) != 0 ? Modifier.INSTANCE : modifier;
        boolean z11 = (i11 & 4) != 0 ? true : z10;
        h0.l lVar2 = (i11 & 8) != 0 ? null : lVar;
        InterfaceC17981w interfaceC17981w2 = (i11 & 16) != 0 ? null : interfaceC17981w;
        V0.D1 small = (i11 & 32) != 0 ? C17877E0.f166879a.b(composer, 6).getSmall() : d12;
        BorderStroke borderStroke2 = (i11 & 64) == 0 ? borderStroke : null;
        InterfaceC17977u interfaceC17977uI = (i11 & 128) != 0 ? C17979v.f168713a.i(0L, 0L, 0L, composer, 3072, 7) : interfaceC17977u;
        InterfaceC14794C interfaceC14794CG = (i11 & 256) != 0 ? C17979v.f168713a.g() : interfaceC14794C;
        if (ComposerKt.M()) {
            ComposerKt.U(288797557, i10, -1, "androidx.compose.material.TextButton (Button.kt:241)");
        }
        a(function0, modifier2, z11, lVar2, interfaceC17981w2, small, borderStroke2, interfaceC17977uI, interfaceC14794CG, function3, composer, i10 & 2147483646, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long b(z1<C5346q0> z1Var) {
        return z1Var.getValue().getValue();
    }
}
