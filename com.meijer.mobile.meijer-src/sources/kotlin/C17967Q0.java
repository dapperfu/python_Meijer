package kotlin;

import H1.t;
import H1.w;
import P0.e;
import V0.D1;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.text.C5835z;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.C5937w;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.C6034t0;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import j0.InterfaceC14882C;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import r1.u;
import z1.W;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0081\u0002\u0010\"\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#\u001a¥\u0001\u0010.\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010(\u001a\u00020'2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b.\u0010/\u001a\u001b\u00101\u001a\u00020\u0019*\u00020\u00192\u0006\u00100\u001a\u00020\u0019H\u0002¢\u0006\u0004\b1\u00102\u001aZ\u0010;\u001a\u00020\u00192\u0006\u00103\u001a\u00020\u00192\u0006\u00104\u001a\u00020\u00192\u0006\u00105\u001a\u00020\u00192\u0006\u00106\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u00192\u0006\u0010(\u001a\u00020'2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020'2\u0006\u0010-\u001a\u00020,H\u0002ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001aZ\u0010B\u001a\u00020\u00192\u0006\u0010=\u001a\u00020\u00192\u0006\u0010>\u001a\u00020\u00192\u0006\u0010?\u001a\u00020\u00192\u0006\u0010@\u001a\u00020\u00192\u0006\u0010A\u001a\u00020\u00192\u0006\u0010(\u001a\u00020'2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020'2\u0006\u0010-\u001a\u00020,H\u0002ø\u0001\u0000¢\u0006\u0004\bB\u0010<\u001a\u0083\u0001\u0010O\u001a\u00020\u0003*\u00020C2\u0006\u0010D\u001a\u00020\u00192\u0006\u0010E\u001a\u00020\u00192\b\u0010G\u001a\u0004\u0018\u00010F2\b\u0010H\u001a\u0004\u0018\u00010F2\u0006\u0010I\u001a\u00020F2\b\u0010J\u001a\u0004\u0018\u00010F2\b\u0010K\u001a\u0004\u0018\u00010F2\u0006\u0010L\u001a\u00020F2\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010:\u001a\u00020'2\u0006\u0010N\u001a\u00020M2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\bO\u0010P\u001a&\u0010R\u001a\u00020\u0005*\u00020\u00052\u0006\u0010Q\u001a\u00020)2\u0006\u0010-\u001a\u00020,H\u0000ø\u0001\u0000¢\u0006\u0004\bR\u0010S\"\u0014\u0010V\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010U\"\u001a\u0010[\u001a\u00020W8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010X\u001a\u0004\bY\u0010Z\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\\"}, d2 = {"", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/z;", "textStyle", "Lkotlin/Function0;", "label", "placeholder", "leadingIcon", "trailingIcon", "isError", "Lz1/W;", "visualTransformation", "Landroidx/compose/foundation/text/A;", "keyboardOptions", "Landroidx/compose/foundation/text/z;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Lh0/l;", "interactionSource", "LV0/D1;", "shape", "Lx0/F1;", "colors", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/z;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLz1/W;Landroidx/compose/foundation/text/A;Landroidx/compose/foundation/text/z;ZIILh0/l;LV0/D1;Lx0/F1;Landroidx/compose/runtime/Composer;III)V", "textField", "leading", "trailing", "", "animationProgress", "LU0/k;", "onLabelMeasured", "border", "Lj0/C;", "paddingValues", "b", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lj0/C;Landroidx/compose/runtime/Composer;II)V", "from", "l", "(II)I", "leadingPlaceableWidth", "trailingPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "LH1/b;", "constraints", "density", "i", "(IIIIIFJFLj0/C;)I", "leadingPlaceableHeight", "trailingPlaceableHeight", "textFieldPlaceableHeight", "labelPlaceableHeight", "placeholderPlaceableHeight", "h", "Landroidx/compose/ui/layout/f0$a;", "height", "width", "Landroidx/compose/ui/layout/f0;", "leadingPlaceable", "trailingPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "borderPlaceable", "LH1/t;", "layoutDirection", "k", "(Landroidx/compose/ui/layout/f0$a;IILandroidx/compose/ui/layout/f0;Landroidx/compose/ui/layout/f0;Landroidx/compose/ui/layout/f0;Landroidx/compose/ui/layout/f0;Landroidx/compose/ui/layout/f0;Landroidx/compose/ui/layout/f0;FZFLH1/t;Lj0/C;)V", "labelSize", "j", "(Landroidx/compose/ui/Modifier;JLj0/C;)Landroidx/compose/ui/Modifier;", "LH1/h;", "F", "OutlinedTextFieldInnerPadding", "LH1/v;", "J", "getOutlinedTextFieldTopPadding", "()J", "OutlinedTextFieldTopPadding", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.Q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17967Q0 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f168415a = H1.h.p(4);

    /* renamed from: b, reason: collision with root package name */
    private static final long f168416b = w.i(8);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.Q0$a */
    static final class a extends Lambda implements Function1<u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f168417f = new a();

        a() {
            super(1);
        }

        public final void a(u uVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "", "innerTextField", "a", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.Q0$b, reason: from Kotlin metadata */
    static final class Function0 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f168418f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f168419g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f168420h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ W f168421i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ h0.l f168422j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f168423k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168424l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168425m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168426n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168427o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ D1 f168428p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ F1 f168429q;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.Q0$b$a */
        static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f168430f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ boolean f168431g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ h0.l f168432h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ F1 f168433i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ D1 f168434j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(boolean z10, boolean z11, h0.l lVar, F1 f12, D1 d12) {
                super(2);
                this.f168430f = z10;
                this.f168431g = z11;
                this.f168432h = lVar;
                this.f168433i = f12;
                this.f168434j = d12;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1757478222, i10, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:398)");
                }
                G1.f167993a.a(this.f168430f, this.f168431g, this.f168432h, this.f168433i, this.f168434j, 0.0f, 0.0f, composer, 12582912, 96);
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
        Function0(String str, boolean z10, boolean z11, W w10, h0.l lVar, boolean z12, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, D1 d12, F1 f12) {
            super(3);
            this.f168418f = str;
            this.f168419g = z10;
            this.f168420h = z11;
            this.f168421i = w10;
            this.f168422j = lVar;
            this.f168423k = z12;
            this.f168424l = function2;
            this.f168425m = function22;
            this.f168426n = function23;
            this.f168427o = function24;
            this.f168428p = d12;
            this.f168429q = f12;
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
                ComposerKt.U(1710364390, i11, -1, "androidx.compose.material.OutlinedTextField.<anonymous> (OutlinedTextField.kt:383)");
            }
            G1 g12 = G1.f167993a;
            int i12 = i11;
            String str = this.f168418f;
            boolean z10 = this.f168419g;
            boolean z11 = this.f168420h;
            W w10 = this.f168421i;
            h0.l lVar = this.f168422j;
            boolean z12 = this.f168423k;
            Function2<Composer, Integer, Unit> function22 = this.f168424l;
            Function2<Composer, Integer, Unit> function23 = this.f168425m;
            Function2<Composer, Integer, Unit> function24 = this.f168426n;
            Function2<Composer, Integer, Unit> function25 = this.f168427o;
            D1 d12 = this.f168428p;
            F1 f12 = this.f168429q;
            g12.b(str, function2, z10, z11, w10, lVar, z12, function22, function23, function24, function25, d12, f12, null, ComposableLambdaKt.c(1757478222, true, new a(z10, z12, lVar, f12, d12), composer, 54), composer, (i12 << 3) & 112, 221184, 8192);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            a(function2, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.Q0$c */
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: A, reason: collision with root package name */
        final /* synthetic */ int f168435A;

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ int f168436B;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f168437f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f168438g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f168439h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f168440i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f168441j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ TextStyle f168442k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168443l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168444m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168445n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168446o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f168447p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ W f168448q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ KeyboardOptions f168449r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ C5835z f168450s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f168451t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f168452u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f168453v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ h0.l f168454w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ D1 f168455x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ F1 f168456y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ int f168457z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(String str, Function1<? super String, Unit> function1, Modifier modifier, boolean z10, boolean z11, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z12, W w10, KeyboardOptions keyboardOptions, C5835z c5835z, boolean z13, int i10, int i11, h0.l lVar, D1 d12, F1 f12, int i12, int i13, int i14) {
            super(2);
            this.f168437f = str;
            this.f168438g = function1;
            this.f168439h = modifier;
            this.f168440i = z10;
            this.f168441j = z11;
            this.f168442k = textStyle;
            this.f168443l = function2;
            this.f168444m = function22;
            this.f168445n = function23;
            this.f168446o = function24;
            this.f168447p = z12;
            this.f168448q = w10;
            this.f168449r = keyboardOptions;
            this.f168450s = c5835z;
            this.f168451t = z13;
            this.f168452u = i10;
            this.f168453v = i11;
            this.f168454w = lVar;
            this.f168455x = d12;
            this.f168456y = f12;
            this.f168457z = i12;
            this.f168435A = i13;
            this.f168436B = i14;
        }

        public final void a(Composer composer, int i10) {
            C17967Q0.a(this.f168437f, this.f168438g, this.f168439h, this.f168440i, this.f168441j, this.f168442k, this.f168443l, this.f168444m, this.f168445n, this.f168446o, this.f168447p, this.f168448q, this.f168449r, this.f168450s, this.f168451t, this.f168452u, this.f168453v, this.f168454w, this.f168455x, this.f168456y, composer, J0.a(this.f168457z | 1), J0.a(this.f168435A), this.f168436B);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.Q0$d */
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f168458f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168459g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function3<Modifier, Composer, Integer, Unit> f168460h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168461i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168462j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168463k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f168464l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ float f168465m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1<U0.k, Unit> f168466n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168467o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ InterfaceC14882C f168468p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f168469q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f168470r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z10, float f10, Function1<? super U0.k, Unit> function1, Function2<? super Composer, ? super Integer, Unit> function25, InterfaceC14882C interfaceC14882C, int i10, int i11) {
            super(2);
            this.f168458f = modifier;
            this.f168459g = function2;
            this.f168460h = function3;
            this.f168461i = function22;
            this.f168462j = function23;
            this.f168463k = function24;
            this.f168464l = z10;
            this.f168465m = f10;
            this.f168466n = function1;
            this.f168467o = function25;
            this.f168468p = interfaceC14882C;
            this.f168469q = i10;
            this.f168470r = i11;
        }

        public final void a(Composer composer, int i10) {
            C17967Q0.b(this.f168458f, this.f168459g, this.f168460h, this.f168461i, this.f168462j, this.f168463k, this.f168464l, this.f168465m, this.f168466n, this.f168467o, this.f168468p, composer, J0.a(this.f168469q | 1), J0.a(this.f168470r));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/c;", "", "a", "(LX0/c;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.Q0$e */
    static final class e extends Lambda implements Function1<X0.c, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f168471f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC14882C f168472g;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: x0.Q0$e$a */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[t.values().length];
                try {
                    iArr[t.f13339b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10, InterfaceC14882C interfaceC14882C) {
            super(1);
            this.f168471f = j10;
            this.f168472g = interfaceC14882C;
        }

        public final void a(X0.c cVar) {
            float fI = U0.k.i(this.f168471f);
            if (fI <= 0.0f) {
                cVar.a2();
                return;
            }
            float fI1 = cVar.I1(C17967Q0.f168415a);
            float fI12 = cVar.I1(this.f168472g.b(cVar.getLayoutDirection())) - fI1;
            float f10 = 2;
            float fI2 = fI + fI12 + (fI1 * f10);
            t layoutDirection = cVar.getLayoutDirection();
            int[] iArr = a.$EnumSwitchMapping$0;
            float fI3 = iArr[layoutDirection.ordinal()] == 1 ? U0.k.i(cVar.b()) - fI2 : RangesKt.e(fI12, 0.0f);
            if (iArr[cVar.getLayoutDirection().ordinal()] == 1) {
                fI2 = U0.k.i(cVar.b()) - RangesKt.e(fI12, 0.0f);
            }
            float f11 = fI2;
            float fG = U0.k.g(this.f168471f);
            float f12 = (-fG) / f10;
            float f13 = fG / f10;
            int iA = androidx.compose.ui.graphics.b.INSTANCE.a();
            X0.d drawContext = cVar.getDrawContext();
            long jB = drawContext.b();
            drawContext.g().save();
            try {
                drawContext.getTransform().c(fI3, f12, f11, f13, iA);
                cVar.a2();
            } finally {
                drawContext.g().i();
                drawContext.h(jB);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.c cVar) {
            a(cVar);
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:330:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r72, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r73, androidx.compose.ui.Modifier r74, boolean r75, boolean r76, androidx.compose.ui.text.TextStyle r77, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r78, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r79, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r80, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r81, boolean r82, z1.W r83, androidx.compose.foundation.text.KeyboardOptions r84, androidx.compose.foundation.text.C5835z r85, boolean r86, int r87, int r88, h0.l r89, V0.D1 r90, kotlin.F1 r91, androidx.compose.runtime.Composer r92, int r93, int r94, int r95) {
        /*
            Method dump skipped, instructions count: 1647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17967Q0.a(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.z, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, z1.W, androidx.compose.foundation.text.A, androidx.compose.foundation.text.z, boolean, int, int, h0.l, V0.D1, x0.F1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void b(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z10, float f10, Function1<? super U0.k, Unit> function1, Function2<? super Composer, ? super Integer, Unit> function25, InterfaceC14882C interfaceC14882C, Composer composer, int i10, int i11) {
        int i12;
        int i13;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2049536174);
        if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.V(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.D(function2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.D(function3) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(function22) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.D(function23) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= composerStartRestartGroup.D(function24) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i12 |= composerStartRestartGroup.a(z10) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i12 |= composerStartRestartGroup.b(f10) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i12 |= composerStartRestartGroup.D(function1) ? 67108864 : 33554432;
        }
        if ((805306368 & i10) == 0) {
            i12 |= composerStartRestartGroup.D(function25) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (composerStartRestartGroup.V(interfaceC14882C) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if (composerStartRestartGroup.p(((i12 & 306783379) == 306783378 && (i13 & 3) == 2) ? false : true, i12 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(-2049536174, i12, i13, "androidx.compose.material.OutlinedTextFieldLayout (OutlinedTextField.kt:687)");
            }
            boolean z11 = ((i13 & 14) == 4) | ((3670016 & i12) == 1048576) | ((234881024 & i12) == 67108864) | ((29360128 & i12) == 8388608);
            Object objB = composerStartRestartGroup.B();
            if (z11 || objB == Composer.INSTANCE.a()) {
                objB = new C17968R0(function1, z10, f10, interfaceC14882C);
                composerStartRestartGroup.t(objB);
            }
            C17968R0 c17968r0 = (C17968R0) objB;
            t tVar = (t) composerStartRestartGroup.o(C6034t0.m());
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            kotlin.jvm.functions.Function0<InterfaceC5953g> function0A = companion.a();
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
            androidx.compose.runtime.D1.c(composerA, c17968r0, companion.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
            function25.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
            if (function23 != null) {
                composerStartRestartGroup.startReplaceGroup(-978132235);
                Modifier modifierD = C17937B0.d(C5937w.b(Modifier.INSTANCE, "Leading"));
                MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.e(), false);
                int iA2 = C5859f.a(composerStartRestartGroup, 0);
                InterfaceC5884s interfaceC5884sR2 = composerStartRestartGroup.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierD);
                kotlin.jvm.functions.Function0<InterfaceC5953g> function0A2 = companion.a();
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
                androidx.compose.runtime.D1.c(composerA2, measurePolicyG, companion.e());
                androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion.b();
                if (composerA2.h() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                androidx.compose.runtime.D1.c(composerA2, modifierE2, companion.f());
                C5806j c5806j = C5806j.f48836a;
                function23.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 12) & 14));
                composerStartRestartGroup.v();
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(-977887180);
                composerStartRestartGroup.P();
            }
            if (function24 != null) {
                composerStartRestartGroup.startReplaceGroup(-977844493);
                Modifier modifierD2 = C17937B0.d(C5937w.b(Modifier.INSTANCE, "Trailing"));
                MeasurePolicy measurePolicyG2 = C5804h.g(P0.e.INSTANCE.e(), false);
                int iA3 = C5859f.a(composerStartRestartGroup, 0);
                InterfaceC5884s interfaceC5884sR3 = composerStartRestartGroup.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierD2);
                kotlin.jvm.functions.Function0<InterfaceC5953g> function0A3 = companion.a();
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
                androidx.compose.runtime.D1.c(composerA3, measurePolicyG2, companion.e());
                androidx.compose.runtime.D1.c(composerA3, interfaceC5884sR3, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion.b();
                if (composerA3.h() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                androidx.compose.runtime.D1.c(composerA3, modifierE3, companion.f());
                C5806j c5806j2 = C5806j.f48836a;
                function24.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                composerStartRestartGroup.v();
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(-977597516);
                composerStartRestartGroup.P();
            }
            float fG = D.g(interfaceC14882C, tVar);
            float f11 = D.f(interfaceC14882C, tVar);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            if (function23 != null) {
                i14 = 0;
                fG = H1.h.p(RangesKt.e(H1.h.p(fG - I1.d()), H1.h.p(0)));
            } else {
                i14 = 0;
            }
            float f12 = fG;
            if (function24 != null) {
                f11 = H1.h.p(RangesKt.e(H1.h.p(f11 - I1.d()), H1.h.p(i14)));
            }
            Modifier modifierM = D.m(companion2, f12, 0.0f, f11, 0.0f, 10, null);
            if (function3 != null) {
                composerStartRestartGroup.startReplaceGroup(-976746535);
                function3.invoke(C5937w.b(companion2, "Hint").then(modifierM), composerStartRestartGroup, Integer.valueOf((i12 >> 3) & 112));
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(-976659084);
                composerStartRestartGroup.P();
            }
            Modifier modifierThen = C5937w.b(companion2, "TextField").then(modifierM);
            e.Companion companion3 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG3 = C5804h.g(companion3.o(), true);
            int iA4 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR4 = composerStartRestartGroup.r();
            Modifier modifierE4 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierThen);
            kotlin.jvm.functions.Function0<InterfaceC5953g> function0A4 = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A4);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA4 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA4, measurePolicyG3, companion.e());
            androidx.compose.runtime.D1.c(composerA4, interfaceC5884sR4, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion.b();
            if (composerA4.h() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                composerA4.t(Integer.valueOf(iA4));
                composerA4.n(Integer.valueOf(iA4), function2B4);
            }
            androidx.compose.runtime.D1.c(composerA4, modifierE4, companion.f());
            C5806j c5806j3 = C5806j.f48836a;
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 3) & 14));
            composerStartRestartGroup.v();
            if (function22 != null) {
                composerStartRestartGroup.startReplaceGroup(-976429250);
                Modifier modifierB = C5937w.b(companion2, "Label");
                MeasurePolicy measurePolicyG4 = C5804h.g(companion3.o(), false);
                int iA5 = C5859f.a(composerStartRestartGroup, 0);
                InterfaceC5884s interfaceC5884sR5 = composerStartRestartGroup.r();
                Modifier modifierE5 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierB);
                kotlin.jvm.functions.Function0<InterfaceC5953g> function0A5 = companion.a();
                if (composerStartRestartGroup.k() == null) {
                    C5859f.c();
                }
                composerStartRestartGroup.F();
                if (composerStartRestartGroup.h()) {
                    composerStartRestartGroup.I(function0A5);
                } else {
                    composerStartRestartGroup.s();
                }
                Composer composerA5 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
                androidx.compose.runtime.D1.c(composerA5, measurePolicyG4, companion.e());
                androidx.compose.runtime.D1.c(composerA5, interfaceC5884sR5, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B5 = companion.b();
                if (composerA5.h() || !Intrinsics.e(composerA5.B(), Integer.valueOf(iA5))) {
                    composerA5.t(Integer.valueOf(iA5));
                    composerA5.n(Integer.valueOf(iA5), function2B5);
                }
                androidx.compose.runtime.D1.c(composerA5, modifierE5, companion.f());
                function26 = function22;
                function26.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 9) & 14));
                composerStartRestartGroup.v();
                composerStartRestartGroup.P();
            } else {
                function26 = function22;
                composerStartRestartGroup.startReplaceGroup(-976346604);
                composerStartRestartGroup.P();
            }
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            function26 = function22;
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new d(modifier, function2, function3, function26, function23, function24, z10, f10, function1, function25, interfaceC14882C, i10, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(int i10, int i11, int i12, int i13, int i14, float f10, long j10, float f11, InterfaceC14882C interfaceC14882C) {
        int iMax = Math.max(i12, Math.max(i14, J1.b.c(i13, 0, f10)));
        float top = interfaceC14882C.getTop() * f11;
        return H1.c.f(j10, Math.max(i10, Math.max(i11, MathKt.d(J1.b.b(top, Math.max(top, i13 / 2.0f), f10) + iMax + (interfaceC14882C.getBottom() * f11)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(int i10, int i11, int i12, int i13, int i14, float f10, long j10, float f11, InterfaceC14882C interfaceC14882C) {
        int iMax = i10 + Math.max(i12, Math.max(J1.b.c(i13, 0, f10), i14)) + i11;
        t tVar = t.f13338a;
        return H1.c.g(j10, Math.max(iMax, MathKt.d((i13 + (H1.h.p(interfaceC14882C.b(tVar) + interfaceC14882C.c(tVar)) * f11)) * f10)));
    }

    public static final Modifier j(Modifier modifier, long j10, InterfaceC14882C interfaceC14882C) {
        return androidx.compose.ui.draw.b.d(modifier, new e(j10, interfaceC14882C));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(f0.a aVar, int i10, int i11, f0 f0Var, f0 f0Var2, f0 f0Var3, f0 f0Var4, f0 f0Var5, f0 f0Var6, float f10, boolean z10, float f11, t tVar, InterfaceC14882C interfaceC14882C) {
        int iD = MathKt.d(interfaceC14882C.getTop() * f11);
        int iD2 = MathKt.d(D.g(interfaceC14882C, tVar) * f11);
        float fD = I1.d() * f11;
        if (f0Var != null) {
            f0.a.l(aVar, f0Var, 0, P0.e.INSTANCE.i().a(f0Var.getHeight(), i10), 0.0f, 4, null);
        }
        if (f0Var2 != null) {
            f0.a.l(aVar, f0Var2, i11 - f0Var2.getWidth(), P0.e.INSTANCE.i().a(f0Var2.getHeight(), i10), 0.0f, 4, null);
        }
        if (f0Var4 != null) {
            f0.a.l(aVar, f0Var4, MathKt.d(f0Var == null ? 0.0f : (I1.h(f0Var) - fD) * (1 - f10)) + iD2, J1.b.c(z10 ? P0.e.INSTANCE.i().a(f0Var4.getHeight(), i10) : iD, -(f0Var4.getHeight() / 2), f10), 0.0f, 4, null);
        }
        f0.a.l(aVar, f0Var3, I1.h(f0Var), Math.max(z10 ? P0.e.INSTANCE.i().a(f0Var3.getHeight(), i10) : iD, I1.g(f0Var4) / 2), 0.0f, 4, null);
        if (f0Var5 != null) {
            if (z10) {
                iD = P0.e.INSTANCE.i().a(f0Var5.getHeight(), i10);
            }
            f0.a.l(aVar, f0Var5, I1.h(f0Var), Math.max(iD, I1.g(f0Var4) / 2), 0.0f, 4, null);
        }
        f0.a.j(aVar, f0Var6, H1.n.INSTANCE.b(), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(int i10, int i11) {
        if (i10 == Integer.MAX_VALUE) {
            return i10;
        }
        return i10 - i11;
    }
}
