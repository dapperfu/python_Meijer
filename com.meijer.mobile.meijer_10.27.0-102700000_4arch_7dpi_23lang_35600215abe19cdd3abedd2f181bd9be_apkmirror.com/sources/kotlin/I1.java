package kotlin;

import V0.C5346q0;
import V0.D1;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.G0;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.r;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.C5795w;
import androidx.compose.ui.layout.InterfaceC5797y;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import j0.InterfaceC14794C;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import r1.C16705m;
import r1.s;
import r1.u;
import u1.C17208B;
import z1.TransformedText;
import z1.W;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a½\u0001\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a@\u0010#\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a#\u0010'\u001a\u00020%*\u00020%2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u0002H\u0000¢\u0006\u0004\b'\u0010(\u001a\u0019\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)H\u0000¢\u0006\u0004\b,\u0010-\u001a\u0019\u0010.\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)H\u0000¢\u0006\u0004\b.\u0010-\"\u001a\u00103\u001a\u00020/8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u00100\u001a\u0004\b1\u00102\"\u001a\u00105\u001a\u00020/8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u00100\u001a\u0004\b4\u00102\"\u001a\u0010:\u001a\u0004\u0018\u000107*\u0002068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u00109\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006;"}, d2 = {"Lx0/M1;", "type", "", "value", "Lkotlin/Function0;", "", "innerTextField", "Lz1/W;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "", "singleLine", "enabled", "isError", "Lh0/j;", "interactionSource", "Lj0/C;", "contentPadding", "LV0/D1;", "shape", "Lx0/F1;", "colors", "border", "a", "(Lx0/M1;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lz1/W;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLh0/j;Lj0/C;LV0/D1;Lx0/F1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "LV0/q0;", "contentColor", "Landroidx/compose/ui/text/z;", "typography", "", "contentAlpha", "content", "b", "(JLandroidx/compose/ui/text/z;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Modifier;", "defaultErrorMessage", "c", "(Landroidx/compose/ui/Modifier;ZLjava/lang/String;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/f0;", "placeable", "", "h", "(Landroidx/compose/ui/layout/f0;)I", "g", "LH1/h;", "F", "f", "()F", "TextFieldPadding", "d", "HorizontalIconPadding", "Landroidx/compose/ui/layout/r;", "", "e", "(Landroidx/compose/ui/layout/r;)Ljava/lang/Object;", "layoutId", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class I1 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f167005a = H1.h.p(16);

    /* renamed from: b, reason: collision with root package name */
    private static final float f167006b = H1.h.p(12);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "labelProgress", "LV0/q0;", "labelTextStyleColor", "labelContentColor", "placeholderAlphaProgress", "", "a", "(FJJFLandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class a extends Lambda implements Function6<Float, C5346q0, C5346q0, Float, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167007f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167008g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f167009h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ F1 f167010i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f167011j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f167012k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ h0.j f167013l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167014m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167015n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ D1 f167016o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ M1 f167017p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167018q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f167019r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ InterfaceC14794C f167020s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f167021t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167022u;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/k;", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.I1$a$a, reason: collision with other inner class name */
        static final class C2655a extends Lambda implements Function1<U0.k, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ float f167023f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<U0.k> f167024g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2655a(float f10, InterfaceC5730l0<U0.k> interfaceC5730l0) {
                super(1);
                this.f167023f = f10;
                this.f167024g = interfaceC5730l0;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(U0.k kVar) {
                a(kVar.getPackedValue());
                return Unit.f142422a;
            }

            public final void a(long j10) {
                float fI = U0.k.i(j10) * this.f167023f;
                float fG = U0.k.g(j10) * this.f167023f;
                if (U0.k.i(this.f167024g.getValue().getPackedValue()) == fI && U0.k.g(this.f167024g.getValue().getPackedValue()) == fG) {
                    return;
                }
                this.f167024g.setValue(U0.k.c(U0.l.a(fI, fG)));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ float f167025f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ long f167026g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f167027h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ boolean f167028i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ long f167029j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(float f10, long j10, Function2<? super Composer, ? super Integer, Unit> function2, boolean z10, long j11) {
                super(2);
                this.f167025f = f10;
                this.f167026g = j10;
                this.f167027h = function2;
                this.f167028i = z10;
                this.f167029j = j11;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1865025495, i10, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:131)");
                }
                C17877E0 c17877e0 = C17877E0.f166879a;
                TextStyle textStyleC = C17208B.c(c17877e0.c(composer, 6).getSubtitle1(), c17877e0.c(composer, 6).getCaption(), this.f167025f);
                boolean z10 = this.f167028i;
                long j10 = this.f167029j;
                if (z10) {
                    textStyleC = TextStyle.c(textStyleC, j10, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                }
                I1.b(this.f167026g, textStyleC, null, this.f167027h, composer, 384, 0);
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
        static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ long f167030f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f167031g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            d(long j10, Function2<? super Composer, ? super Integer, Unit> function2) {
                super(2);
                this.f167030f = j10;
                this.f167031g = function2;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1165144581, i10, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:164)");
                }
                I1.b(this.f167030f, null, null, this.f167031g, composer, 0, 6);
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

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        static final class e extends Lambda implements Function3<Modifier, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ float f167032f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ F1 f167033g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f167034h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f167035i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            e(float f10, F1 f12, boolean z10, Function2<? super Composer, ? super Integer, Unit> function2) {
                super(3);
                this.f167032f = f10;
                this.f167033g = f12;
                this.f167034h = z10;
                this.f167035i = function2;
            }

            public final void a(Modifier modifier, Composer composer, int i10) {
                if ((i10 & 6) == 0) {
                    i10 |= composer.V(modifier) ? 4 : 2;
                }
                if (!composer.p((i10 & 19) != 18, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-413527723, i10, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:151)");
                }
                Modifier modifierA = T0.a.a(modifier, this.f167032f);
                F1 f12 = this.f167033g;
                boolean z10 = this.f167034h;
                Function2<Composer, Integer, Unit> function2 = this.f167035i;
                MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierA);
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
                I1.b(f12.e(z10, composer, 0).getValue().getValue(), C17877E0.f166879a.c(composer, 6).getSubtitle1(), null, function2, composer, 0, 4);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
                a(modifier, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ long f167036f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f167037g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            f(long j10, Function2<? super Composer, ? super Integer, Unit> function2) {
                super(2);
                this.f167036f = j10;
                this.f167037g = function2;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1694126319, i10, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:170)");
                }
                I1.b(this.f167036f, null, null, this.f167037g, composer, 0, 6);
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
        static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<U0.k> f167038f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC14794C f167039g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f167040h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            g(InterfaceC5730l0<U0.k> interfaceC5730l0, InterfaceC14794C interfaceC14794C, Function2<? super Composer, ? super Integer, Unit> function2) {
                super(2);
                this.f167038f = interfaceC5730l0;
                this.f167039g = interfaceC14794C;
                this.f167040h = function2;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1212965554, i10, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:193)");
                }
                Modifier modifierJ = C17901Q0.j(C5795w.b(Modifier.INSTANCE, "border"), this.f167038f.getValue().getPackedValue(), this.f167039g);
                Function2<Composer, Integer, Unit> function2 = this.f167040h;
                MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), true);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierJ);
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
                if (function2 == null) {
                    composer.startReplaceGroup(720285106);
                } else {
                    composer.startReplaceGroup(-392406993);
                    function2.invoke(composer, 0);
                }
                composer.P();
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

        public final void a(float f10, long j10, long j11, float f11, Composer composer, int i10) {
            int i11;
            long j12;
            int i12;
            ComposableLambda composableLambda;
            ComposableLambda composableLambda2;
            ComposableLambda composableLambda3;
            float f12 = f10;
            if ((i10 & 6) == 0) {
                i11 = (composer.b(f12) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                j12 = j10;
                i11 |= composer.e(j12) ? 32 : 16;
            } else {
                j12 = j10;
            }
            if ((i10 & 384) == 0) {
                i11 |= composer.e(j11) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                i11 |= composer.b(f11) ? RecyclerView.m.FLAG_MOVED : 1024;
            }
            int i13 = i11;
            if (!composer.p((i13 & 9363) != 9362, i13 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(225557475, i13, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:128)");
            }
            Function2<Composer, Integer, Unit> function2 = this.f167007f;
            ComposableLambda composableLambdaC = null;
            if (function2 == null) {
                composer.startReplaceGroup(-1572254148);
                composer.P();
                i12 = 54;
            } else {
                composer.startReplaceGroup(-1572254147);
                i12 = 54;
                c cVar = new c(f12, j11, function2, this.f167021t, j12);
                f12 = f12;
                composableLambdaC = ComposableLambdaKt.c(-1865025495, true, cVar, composer, 54);
                composer.P();
            }
            ComposableLambda composableLambda4 = composableLambdaC;
            if (this.f167008g == null || this.f167009h.length() != 0 || f11 <= 0.0f) {
                composer.startReplaceGroup(-1570844268);
                composer.P();
                composableLambda = null;
            } else {
                composer.startReplaceGroup(-1571270300);
                ComposableLambda composableLambdaC2 = ComposableLambdaKt.c(-413527723, true, new e(f11, this.f167010i, this.f167011j, this.f167008g), composer, i12);
                composer.P();
                composableLambda = composableLambdaC2;
            }
            long value = this.f167010i.h(this.f167011j, this.f167012k, this.f167013l, composer, 0).getValue().getValue();
            Function2<Composer, Integer, Unit> function22 = this.f167014m;
            if (function22 == null) {
                composer.startReplaceGroup(-1570655509);
                composer.P();
                composableLambda2 = null;
            } else {
                composer.startReplaceGroup(-1570655508);
                ComposableLambda composableLambdaC3 = ComposableLambdaKt.c(-1165144581, true, new d(value, function22), composer, i12);
                composer.P();
                composableLambda2 = composableLambdaC3;
            }
            long value2 = this.f167010i.b(this.f167011j, this.f167012k, this.f167013l, composer, 0).getValue().getValue();
            Function2<Composer, Integer, Unit> function23 = this.f167015n;
            if (function23 == null) {
                composer.startReplaceGroup(-1570361846);
                composer.P();
                composableLambda3 = null;
            } else {
                composer.startReplaceGroup(-1570361845);
                ComposableLambda composableLambdaC4 = ComposableLambdaKt.c(1694126319, true, new f(value2, function23), composer, i12);
                composer.P();
                composableLambda3 = composableLambdaC4;
            }
            Modifier modifierC = androidx.compose.foundation.b.c(Modifier.INSTANCE, this.f167010i.a(this.f167011j, composer, 0).getValue().getValue(), this.f167016o);
            int i14 = b.$EnumSwitchMapping$0[this.f167017p.ordinal()];
            if (i14 == 1) {
                composer.startReplaceGroup(-1570081481);
                J1.a(modifierC, this.f167018q, composableLambda4, composableLambda, composableLambda2, composableLambda3, this.f167019r, f10, this.f167020s, composer, (i13 << 21) & 29360128);
                composer.P();
            } else if (i14 != 2) {
                composer.startReplaceGroup(-1568043975);
                composer.P();
            } else {
                composer.startReplaceGroup(-1569502122);
                Object objB = composer.B();
                Composer.Companion companion = Composer.INSTANCE;
                if (objB == companion.a()) {
                    objB = t1.e(U0.k.c(U0.k.INSTANCE.b()), null, 2, null);
                    composer.t(objB);
                }
                InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
                ComposableLambda composableLambdaC5 = ComposableLambdaKt.c(-1212965554, true, new g(interfaceC5730l0, this.f167020s, this.f167022u), composer, i12);
                Function2<Composer, Integer, Unit> function24 = this.f167018q;
                boolean z10 = this.f167019r;
                boolean z11 = (i13 & 14) == 4;
                Object objB2 = composer.B();
                if (z11 || objB2 == companion.a()) {
                    objB2 = new C2655a(f12, interfaceC5730l0);
                    composer.t(objB2);
                }
                C17901Q0.b(modifierC, function24, composableLambda, composableLambda4, composableLambda2, composableLambda3, z10, f12, (Function1) objB2, composableLambdaC5, this.f167020s, composer, 805306368 | ((i13 << 21) & 29360128), 0);
                composer.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[M1.values().length];
                try {
                    iArr[M1.f167220a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[M1.f167221b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, String str, F1 f12, boolean z10, boolean z11, h0.j jVar, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, D1 d12, M1 m12, Function2<? super Composer, ? super Integer, Unit> function25, boolean z12, InterfaceC14794C interfaceC14794C, boolean z13, Function2<? super Composer, ? super Integer, Unit> function26) {
            super(6);
            this.f167007f = function2;
            this.f167008g = function22;
            this.f167009h = str;
            this.f167010i = f12;
            this.f167011j = z10;
            this.f167012k = z11;
            this.f167013l = jVar;
            this.f167014m = function23;
            this.f167015n = function24;
            this.f167016o = d12;
            this.f167017p = m12;
            this.f167018q = function25;
            this.f167019r = z12;
            this.f167020s = interfaceC14794C;
            this.f167021t = z13;
            this.f167022u = function26;
        }

        @Override // kotlin.jvm.functions.Function6
        public /* bridge */ /* synthetic */ Unit h(Float f10, C5346q0 c5346q0, C5346q0 c5346q02, Float f11, Composer composer, Integer num) {
            a(f10.floatValue(), c5346q0.getValue(), c5346q02.getValue(), f11.floatValue(), composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ M1 f167041f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f167042g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167043h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ W f167044i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167045j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167046k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167047l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167048m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f167049n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f167050o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f167051p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ h0.j f167052q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC14794C f167053r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ D1 f167054s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ F1 f167055t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167056u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f167057v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f167058w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(M1 m12, String str, Function2<? super Composer, ? super Integer, Unit> function2, W w10, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, boolean z10, boolean z11, boolean z12, h0.j jVar, InterfaceC14794C interfaceC14794C, D1 d12, F1 f12, Function2<? super Composer, ? super Integer, Unit> function26, int i10, int i11) {
            super(2);
            this.f167041f = m12;
            this.f167042g = str;
            this.f167043h = function2;
            this.f167044i = w10;
            this.f167045j = function22;
            this.f167046k = function23;
            this.f167047l = function24;
            this.f167048m = function25;
            this.f167049n = z10;
            this.f167050o = z11;
            this.f167051p = z12;
            this.f167052q = jVar;
            this.f167053r = interfaceC14794C;
            this.f167054s = d12;
            this.f167055t = f12;
            this.f167056u = function26;
            this.f167057v = i10;
            this.f167058w = i11;
        }

        public final void a(Composer composer, int i10) {
            I1.a(this.f167041f, this.f167042g, this.f167043h, this.f167044i, this.f167045j, this.f167046k, this.f167047l, this.f167048m, this.f167049n, this.f167050o, this.f167051p, this.f167052q, this.f167053r, this.f167054s, this.f167055t, this.f167056u, composer, J0.a(this.f167057v | 1), J0.a(this.f167058w));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx0/A0;", "it", "LV0/q0;", "a", "(Lx0/A0;Landroidx/compose/runtime/Composer;I)J"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function3<EnumC17869A0, Composer, Integer, C5346q0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ F1 f167059f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f167060g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f167061h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ h0.j f167062i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(F1 f12, boolean z10, boolean z11, h0.j jVar) {
            super(3);
            this.f167059f = f12;
            this.f167060g = z10;
            this.f167061h = z11;
            this.f167062i = jVar;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ C5346q0 invoke(EnumC17869A0 enumC17869A0, Composer composer, Integer num) {
            return C5346q0.m(a(enumC17869A0, composer, num.intValue()));
        }

        public final long a(EnumC17869A0 enumC17869A0, Composer composer, int i10) {
            boolean z10;
            composer.startReplaceGroup(-1272940975);
            if (ComposerKt.M()) {
                ComposerKt.U(-1272940975, i10, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:95)");
            }
            F1 f12 = this.f167059f;
            boolean z11 = this.f167060g;
            if (enumC17869A0 == EnumC17869A0.f166646b) {
                z10 = false;
            } else {
                z10 = this.f167061h;
            }
            long value = f12.f(z11, z10, this.f167062i, composer, 0).getValue().getValue();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return value;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f167063f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ TextStyle f167064g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Float f167065h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167066i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f167067j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f167068k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(long j10, TextStyle textStyle, Float f10, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f167063f = j10;
            this.f167064g = textStyle;
            this.f167065h = f10;
            this.f167066i = function2;
            this.f167067j = i10;
            this.f167068k = i11;
        }

        public final void a(Composer composer, int i10) {
            I1.b(this.f167063f, this.f167064g, this.f167065h, this.f167066i, composer, J0.a(this.f167067j | 1), this.f167068k);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f167069f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Float f167070g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167071h;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Float f167072f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f167073g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ long f167074h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Float f10, Function2<? super Composer, ? super Integer, Unit> function2, long j10) {
                super(2);
                this.f167072f = f10;
                this.f167073g = function2;
                this.f167074h = j10;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1132188434, i10, -1, "androidx.compose.material.Decoration.<anonymous>.<anonymous> (TextFieldImpl.kt:240)");
                }
                if (this.f167072f != null) {
                    composer.startReplaceGroup(-1177895124);
                    r.a(C17892M.a().d(this.f167072f), this.f167073g, composer, G0.f49976i);
                    composer.P();
                } else {
                    composer.startReplaceGroup(-1177696538);
                    r.a(C17892M.a().d(Float.valueOf(C5346q0.t(this.f167074h))), this.f167073g, composer, G0.f49976i);
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
        /* JADX WARN: Multi-variable type inference failed */
        e(long j10, Float f10, Function2<? super Composer, ? super Integer, Unit> function2) {
            super(2);
            this.f167069f = j10;
            this.f167070g = f10;
            this.f167071h = function2;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(494684590, i10, -1, "androidx.compose.material.Decoration.<anonymous> (TextFieldImpl.kt:239)");
            }
            r.a(C17894N.a().d(C5346q0.m(this.f167069f)), ComposableLambdaKt.c(-1132188434, true, new a(this.f167070g, this.f167071h, this.f167069f), composer, 54), composer, G0.f49976i | 48);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends Lambda implements Function1<u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f167075f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str) {
            super(1);
            this.f167075f = str;
        }

        public final void a(u uVar) {
            s.o(uVar, this.f167075f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    public static final void a(M1 m12, String str, Function2<? super Composer, ? super Integer, Unit> function2, W w10, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, boolean z10, boolean z11, boolean z12, h0.j jVar, InterfaceC14794C interfaceC14794C, D1 d12, F1 f12, Function2<? super Composer, ? super Integer, Unit> function26, Composer composer, int i10, int i11) {
        M1 m13;
        int i12;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i13;
        int i14;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(341783750);
        if ((i10 & 6) == 0) {
            m13 = m12;
            i12 = (composerStartRestartGroup.V(m13) ? 4 : 2) | i10;
        } else {
            m13 = m12;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            function27 = function2;
            i12 |= composerStartRestartGroup.D(function27) ? 256 : 128;
        } else {
            function27 = function2;
        }
        if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.V(w10) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.D(function22) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i13 = 196608;
            i12 |= composerStartRestartGroup.D(function23) ? 131072 : 65536;
        } else {
            i13 = 196608;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= composerStartRestartGroup.D(function24) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= composerStartRestartGroup.D(function25) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= composerStartRestartGroup.a(z10) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= composerStartRestartGroup.a(z11) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i14 = i11 | (composerStartRestartGroup.a(z12) ? 4 : 2);
        } else {
            i14 = i11;
        }
        if ((i11 & 48) == 0) {
            i14 |= composerStartRestartGroup.V(jVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i14 |= composerStartRestartGroup.V(interfaceC14794C) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i14 |= composerStartRestartGroup.V(d12) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 24576) == 0) {
            i14 |= composerStartRestartGroup.V(f12) ? 16384 : 8192;
        }
        if ((i11 & i13) == 0) {
            i14 |= composerStartRestartGroup.D(function26) ? 131072 : 65536;
        }
        int i15 = i14;
        if (composerStartRestartGroup.p(((i12 & 306783379) == 306783378 && (74899 & i15) == 74898) ? false : true, i12 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(341783750, i12, i15, "androidx.compose.material.CommonDecorationBox (TextFieldImpl.kt:78)");
            }
            boolean z13 = ((i12 & 112) == 32) | ((i12 & 7168) == 2048);
            Object objB = composerStartRestartGroup.B();
            if (z13 || objB == Composer.INSTANCE.a()) {
                objB = w10.a(new AnnotatedString(str, null, null, 6, null));
                composerStartRestartGroup.t(objB);
            }
            String text = ((TransformedText) objB).getText().getText();
            EnumC17869A0 enumC17869A0 = h0.f.a(jVar, composerStartRestartGroup, (i15 >> 3) & 14).getValue().booleanValue() ? EnumC17869A0.f166645a : text.length() == 0 ? EnumC17869A0.f166646b : EnumC17869A0.f166647c;
            c cVar = new c(f12, z11, z12, jVar);
            C17877E0 c17877e0 = C17877E0.f166879a;
            Typography typographyC = c17877e0.c(composerStartRestartGroup, 6);
            TextStyle subtitle1 = typographyC.getSubtitle1();
            TextStyle caption = typographyC.getCaption();
            long jH = subtitle1.h();
            C5346q0.Companion companion = C5346q0.INSTANCE;
            boolean z14 = (C5346q0.s(jH, companion.j()) && !C5346q0.s(caption.h(), companion.j())) || (!C5346q0.s(subtitle1.h(), companion.j()) && C5346q0.s(caption.h(), companion.j()));
            L1 l12 = L1.f167193a;
            composerStartRestartGroup.startReplaceGroup(1578866909);
            long jH2 = c17877e0.c(composerStartRestartGroup, 6).getCaption().h();
            if (z14) {
                composerStartRestartGroup.startReplaceGroup(-1572812364);
                if (jH2 == 16) {
                    jH2 = cVar.invoke(enumC17869A0, composerStartRestartGroup, 0).getValue();
                }
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(780549965);
                composerStartRestartGroup.P();
            }
            long j10 = jH2;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1578874175);
            long jH3 = c17877e0.c(composerStartRestartGroup, 6).getSubtitle1().h();
            if (z14) {
                composerStartRestartGroup.startReplaceGroup(-1572585196);
                if (jH3 == 16) {
                    jH3 = cVar.invoke(enumC17869A0, composerStartRestartGroup, 0).getValue();
                }
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(780557293);
                composerStartRestartGroup.P();
            }
            long j11 = jH3;
            composerStartRestartGroup.P();
            composer2 = composerStartRestartGroup;
            l12.a(enumC17869A0, j10, j11, cVar, function22 != null, ComposableLambdaKt.c(225557475, true, new a(function22, function23, text, f12, z11, z12, jVar, function24, function25, d12, m13, function27, z10, interfaceC14794C, z14, function26), composerStartRestartGroup, 54), composer2, 1769472);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.K();
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new b(m12, str, function2, w10, function22, function23, function24, function25, z10, z11, z12, jVar, interfaceC14794C, d12, f12, function26, i10, i11));
        }
    }

    public static final void b(long j10, TextStyle textStyle, Float f10, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10, int i11) {
        int i12;
        TextStyle textStyle2;
        Float f11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-399493340);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.e(j10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(textStyle) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.V(f10) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(function2) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if (composerStartRestartGroup.p((i12 & 1171) != 1170, i12 & 1)) {
            TextStyle textStyle3 = i13 != 0 ? null : textStyle;
            Float f12 = i14 != 0 ? null : f10;
            if (ComposerKt.M()) {
                ComposerKt.U(-399493340, i12, -1, "androidx.compose.material.Decoration (TextFieldImpl.kt:236)");
            }
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(494684590, true, new e(j10, f12, function2), composerStartRestartGroup, 54);
            if (textStyle3 != null) {
                composerStartRestartGroup.startReplaceGroup(2115981348);
                N1.a(textStyle3, composableLambdaC, composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
            } else {
                composerStartRestartGroup.startReplaceGroup(2115982984);
                composableLambdaC.invoke(composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            textStyle2 = textStyle3;
            f11 = f12;
        } else {
            composerStartRestartGroup.K();
            textStyle2 = textStyle;
            f11 = f10;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new d(j10, textStyle2, f11, function2, i10, i11));
        }
    }

    public static final Modifier c(Modifier modifier, boolean z10, String str) {
        return z10 ? C16705m.d(modifier, false, new f(str), 1, null) : modifier;
    }

    public static final float d() {
        return f167006b;
    }

    public static final float f() {
        return f167005a;
    }

    public static final int g(f0 f0Var) {
        if (f0Var != null) {
            return f0Var.getHeight();
        }
        return 0;
    }

    public static final int h(f0 f0Var) {
        if (f0Var != null) {
            return f0Var.getWidth();
        }
        return 0;
    }

    public static final Object e(androidx.compose.ui.layout.r rVar) {
        InterfaceC5797y interfaceC5797y;
        Object parentData = rVar.getParentData();
        if (parentData instanceof InterfaceC5797y) {
            interfaceC5797y = (InterfaceC5797y) parentData;
        } else {
            interfaceC5797y = null;
        }
        if (interfaceC5797y == null) {
            return null;
        }
        return interfaceC5797y.getLayoutId();
    }
}
