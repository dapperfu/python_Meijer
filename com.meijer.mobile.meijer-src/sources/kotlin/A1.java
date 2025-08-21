package kotlin;

import H1.w;
import P0.e;
import V0.C5489q0;
import W0.AbstractC5526c;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.G0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.r;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.C5917b;
import androidx.compose.ui.layout.C5937w;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import d0.InterfaceC13561B;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14902f;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.C6308h;
import kotlin.C6418E;
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
import kotlin.l0;
import kotlin.n0;
import kotlin.o0;

@Metadata(d1 = {"\u0000`\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0080\u0001\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001ax\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001au\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\u0002\b\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a8\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a/\u0010\u001d\u001a\u00020\u00032\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a#\u0010$\u001a\u00020\u0003*\u00020\u001f2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%\u001aK\u0010-\u001a\u00020\u0003*\u00020\u001f2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020\"H\u0002¢\u0006\u0004\b-\u0010.\"\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00100\"\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00100\"\u0014\u00103\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00100\"\u0014\u00104\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00100\"\u0014\u00105\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00100\"\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108\"\u0014\u0010;\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00100\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006=²\u0006\f\u0010<\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"", "selected", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "text", BarcodePickDeserializer.FIELD_ICON, "Lh0/l;", "interactionSource", "LV0/q0;", "selectedContentColor", "unselectedContentColor", "b", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lh0/l;JJLandroidx/compose/runtime/Composer;II)V", "a", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLh0/l;JJLandroidx/compose/runtime/Composer;II)V", "Lkotlin/Function1;", "Lj0/f;", "Lkotlin/ExtensionFunctionType;", "content", "c", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLh0/l;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "activeColor", "inactiveColor", "e", "(JJZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "d", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/layout/f0$a;", "Landroidx/compose/ui/layout/f0;", "textOrIconPlaceable", "", "tabHeight", "p", "(Landroidx/compose/ui/layout/f0$a;Landroidx/compose/ui/layout/f0;I)V", "LH1/d;", "density", "textPlaceable", "iconPlaceable", "tabWidth", "firstBaseline", "lastBaseline", "o", "(Landroidx/compose/ui/layout/f0$a;LH1/d;Landroidx/compose/ui/layout/f0;Landroidx/compose/ui/layout/f0;IIII)V", "LH1/h;", "F", "SmallTabHeight", "LargeTabHeight", "HorizontalTextPadding", "SingleLineTextBaselineWithIcon", "DoubleLineTextBaselineWithIcon", "LH1/v;", "f", "J", "IconDistanceFromBaseline", "g", "TextDistanceFromLeadingIcon", "color", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class A1 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f167738a = H1.h.p(48);

    /* renamed from: b, reason: collision with root package name */
    private static final float f167739b = H1.h.p(72);

    /* renamed from: c, reason: collision with root package name */
    private static final float f167740c = H1.h.p(16);

    /* renamed from: d, reason: collision with root package name */
    private static final float f167741d = H1.h.p(14);

    /* renamed from: e, reason: collision with root package name */
    private static final float f167742e = H1.h.p(6);

    /* renamed from: f, reason: collision with root package name */
    private static final long f167743f = w.i(20);

    /* renamed from: g, reason: collision with root package name */
    private static final float f167744g = H1.h.p(8);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f167745f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f167746g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ h0.l f167747h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC13561B f167748i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f167749j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f167750k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167751l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167752m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Modifier modifier, boolean z10, h0.l lVar, InterfaceC13561B interfaceC13561B, boolean z11, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22) {
            super(2);
            this.f167745f = modifier;
            this.f167746g = z10;
            this.f167747h = lVar;
            this.f167748i = interfaceC13561B;
            this.f167749j = z11;
            this.f167750k = function0;
            this.f167751l = function2;
            this.f167752m = function22;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(866677691, i10, -1, "androidx.compose.material.LeadingIconTab.<anonymous> (Tab.kt:168)");
            }
            Modifier modifierH = J.h(D.k(SelectableKt.m4selectableO2vRcR0(J.i(this.f167745f, A1.f167738a), this.f167746g, this.f167747h, this.f167748i, this.f167749j, Role.j(Role.INSTANCE.h()), this.f167750k), A1.f167740c, 0.0f, 2, null), 0.0f, 1, null);
            C5800d.f fVarB = C5800d.f48779a.b();
            e.c cVarI = P0.e.INSTANCE.i();
            Function2<Composer, Integer, Unit> function2 = this.f167751l;
            Function2<Composer, Integer, Unit> function22 = this.f167752m;
            MeasurePolicy measurePolicyB = G.b(fVarB, cVarI, composer, 54);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyB, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14889J c14889j = C14889J.f139620a;
            function2.invoke(composer, 0);
            C14890K.a(J.s(Modifier.INSTANCE, A1.f167744g), composer, 6);
            N1.a(TextStyle.c(C17943E0.f167967a.c(composer, 6).getButton(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, F1.j.INSTANCE.a(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), function22, composer, 0);
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
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f167753f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f167754g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167755h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167756i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Modifier f167757j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f167758k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ h0.l f167759l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ long f167760m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ long f167761n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f167762o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f167763p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(boolean z10, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Modifier modifier, boolean z11, h0.l lVar, long j10, long j11, int i10, int i11) {
            super(2);
            this.f167753f = z10;
            this.f167754g = function0;
            this.f167755h = function2;
            this.f167756i = function22;
            this.f167757j = modifier;
            this.f167758k = z11;
            this.f167759l = lVar;
            this.f167760m = j10;
            this.f167761n = j11;
            this.f167762o = i10;
            this.f167763p = i11;
        }

        public final void a(Composer composer, int i10) {
            A1.a(this.f167753f, this.f167754g, this.f167755h, this.f167756i, this.f167757j, this.f167758k, this.f167759l, this.f167760m, this.f167761n, composer, J0.a(this.f167762o | 1), this.f167763p);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lj0/f;", "", "a", "(Lj0/f;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167764f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167765g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22) {
            super(3);
            this.f167764f = function2;
            this.f167765g = function22;
        }

        public final void a(InterfaceC14902f interfaceC14902f, Composer composer, int i10) {
            if (!composer.p((i10 & 17) != 16, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-178151495, i10, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:115)");
            }
            A1.d(this.f167764f, this.f167765g, composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
            a(interfaceC14902f, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f167766f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f167767g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f167768h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f167769i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167770j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167771k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ h0.l f167772l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ long f167773m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ long f167774n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f167775o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f167776p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(boolean z10, Function0<Unit> function0, Modifier modifier, boolean z11, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, h0.l lVar, long j10, long j11, int i10, int i11) {
            super(2);
            this.f167766f = z10;
            this.f167767g = function0;
            this.f167768h = modifier;
            this.f167769i = z11;
            this.f167770j = function2;
            this.f167771k = function22;
            this.f167772l = lVar;
            this.f167773m = j10;
            this.f167774n = j11;
            this.f167775o = i10;
            this.f167776p = i11;
        }

        public final void a(Composer composer, int i10) {
            A1.b(this.f167766f, this.f167767g, this.f167768h, this.f167769i, this.f167770j, this.f167771k, this.f167772l, this.f167773m, this.f167774n, composer, J0.a(this.f167775o | 1), this.f167776p);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f167777f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f167778g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ h0.l f167779h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC13561B f167780i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f167781j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f167782k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14902f, Composer, Integer, Unit> f167783l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Modifier modifier, boolean z10, h0.l lVar, InterfaceC13561B interfaceC13561B, boolean z11, Function0<Unit> function0, Function3<? super InterfaceC14902f, ? super Composer, ? super Integer, Unit> function3) {
            super(2);
            this.f167777f = modifier;
            this.f167778g = z10;
            this.f167779h = lVar;
            this.f167780i = interfaceC13561B;
            this.f167781j = z11;
            this.f167782k = function0;
            this.f167783l = function3;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1237246709, i10, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:239)");
            }
            Modifier modifierH = J.h(SelectableKt.m4selectableO2vRcR0(this.f167777f, this.f167778g, this.f167779h, this.f167780i, this.f167781j, Role.j(Role.INSTANCE.h()), this.f167782k), 0.0f, 1, null);
            e.b bVarG = P0.e.INSTANCE.g();
            C5800d.f fVarB = C5800d.f48779a.b();
            Function3<InterfaceC14902f, Composer, Integer, Unit> function3 = this.f167783l;
            MeasurePolicy measurePolicyA = C5807k.a(fVarB, bVarG, composer, 54);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
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
    static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f167784f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f167785g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f167786h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f167787i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ h0.l f167788j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ long f167789k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ long f167790l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14902f, Composer, Integer, Unit> f167791m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f167792n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f167793o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(boolean z10, Function0<Unit> function0, Modifier modifier, boolean z11, h0.l lVar, long j10, long j11, Function3<? super InterfaceC14902f, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f167784f = z10;
            this.f167785g = function0;
            this.f167786h = modifier;
            this.f167787i = z11;
            this.f167788j = lVar;
            this.f167789k = j10;
            this.f167790l = j11;
            this.f167791m = function3;
            this.f167792n = i10;
            this.f167793o = i11;
        }

        public final void a(Composer composer, int i10) {
            A1.c(this.f167784f, this.f167785g, this.f167786h, this.f167787i, this.f167788j, this.f167789k, this.f167790l, this.f167791m, composer, J0.a(this.f167792n | 1), this.f167793o);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167794f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(Function2<? super Composer, ? super Integer, Unit> function2) {
            super(2);
            this.f167794f = function2;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1729014781, i10, -1, "androidx.compose.material.Tab.<anonymous>.<anonymous> (Tab.kt:102)");
            }
            N1.a(TextStyle.c(C17943E0.f167967a.c(composer, 6).getButton(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, F1.j.INSTANCE.a(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), this.f167794f, composer, 0);
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

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/K;", "", "Landroidx/compose/ui/layout/I;", "measurables", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "d", "(Landroidx/compose/ui/layout/K;Ljava/util/List;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class h implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167795a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167796b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ f0 f167797f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ f0 f167798g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ K f167799h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f167800i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ int f167801j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ Integer f167802k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ Integer f167803l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f0 f0Var, f0 f0Var2, K k10, int i10, int i11, Integer num, Integer num2) {
                super(1);
                this.f167797f = f0Var;
                this.f167798g = f0Var2;
                this.f167799h = k10;
                this.f167800i = i10;
                this.f167801j = i11;
                this.f167802k = num;
                this.f167803l = num2;
            }

            public final void a(f0.a aVar) {
                f0 f0Var;
                f0 f0Var2 = this.f167797f;
                if (f0Var2 == null || (f0Var = this.f167798g) == null) {
                    if (f0Var2 != null) {
                        A1.p(aVar, f0Var2, this.f167801j);
                        return;
                    }
                    f0 f0Var3 = this.f167798g;
                    if (f0Var3 != null) {
                        A1.p(aVar, f0Var3, this.f167801j);
                        return;
                    }
                    return;
                }
                K k10 = this.f167799h;
                int i10 = this.f167800i;
                int i11 = this.f167801j;
                Integer num = this.f167802k;
                Intrinsics.g(num);
                int iIntValue = num.intValue();
                Integer num2 = this.f167803l;
                Intrinsics.g(num2);
                A1.o(aVar, k10, f0Var2, f0Var, i10, i11, iIntValue, num2.intValue());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        h(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22) {
            this.f167795a = function2;
            this.f167796b = function22;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final androidx.compose.ui.layout.J d(K k10, List<? extends I> list, long j10) {
            f0 f0VarK0;
            f0 f0VarK02;
            if (this.f167795a != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    I i11 = list.get(i10);
                    if (Intrinsics.e(C5937w.a(i11), "text")) {
                        f0VarK0 = i11.k0(H1.b.d(j10, 0, 0, 0, 0, 11, null));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            f0VarK0 = null;
            if (this.f167796b != null) {
                int size2 = list.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    I i13 = list.get(i12);
                    if (Intrinsics.e(C5937w.a(i13), BarcodePickDeserializer.FIELD_ICON)) {
                        f0VarK02 = i13.k0(j10);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            f0VarK02 = null;
            int iMax = Math.max(f0VarK0 != null ? f0VarK0.getWidth() : 0, f0VarK02 != null ? f0VarK02.getWidth() : 0);
            int iE0 = k10.E0((f0VarK0 == null || f0VarK02 == null) ? A1.f167738a : A1.f167739b);
            return K.G0(k10, iMax, iE0, null, new a(f0VarK0, f0VarK02, k10, iMax, iE0, f0VarK0 != null ? Integer.valueOf(f0VarK0.l0(C5917b.a())) : null, f0VarK0 != null ? Integer.valueOf(f0VarK0.l0(C5917b.b())) : null), 4, null);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class i extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167804f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167805g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f167806h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, int i10) {
            super(2);
            this.f167804f = function2;
            this.f167805g = function22;
            this.f167806h = i10;
        }

        public final void a(Composer composer, int i10) {
            A1.d(this.f167804f, this.f167805g, composer, J0.a(this.f167806h | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class j extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f167807f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f167808g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f167809h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167810i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f167811j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(long j10, long j11, boolean z10, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f167807f = j10;
            this.f167808g = j11;
            this.f167809h = z10;
            this.f167810i = function2;
            this.f167811j = i10;
        }

        public final void a(Composer composer, int i10) {
            A1.e(this.f167807f, this.f167808g, this.f167809h, this.f167810i, composer, J0.a(this.f167811j | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/k0$b;", "", "Lc0/F;", "LV0/q0;", "a", "(Lc0/k0$b;Landroidx/compose/runtime/Composer;I)Lc0/F;"}, k = 3, mv = {1, 9, 0})
    static final class k extends Lambda implements Function3<k0.b<Boolean>, Composer, Integer, InterfaceC6419F<C5489q0>> {

        /* renamed from: f, reason: collision with root package name */
        public static final k f167812f = new k();

        k() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC6419F<C5489q0> invoke(k0.b<Boolean> bVar, Composer composer, Integer num) {
            return a(bVar, composer, num.intValue());
        }

        public final InterfaceC6419F<C5489q0> a(k0.b<Boolean> bVar, Composer composer, int i10) {
            n0 n0VarL;
            composer.startReplaceGroup(-2120892502);
            if (ComposerKt.M()) {
                ComposerKt.U(-2120892502, i10, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:274)");
            }
            if (bVar.c(Boolean.FALSE, Boolean.TRUE)) {
                n0VarL = C6453j.k(BinsView.TOTE_WIDTH_DP, 100, C6418E.d());
            } else {
                n0VarL = C6453j.l(100, 0, C6418E.d(), 2, null);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return n0VarL;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r28, kotlin.jvm.functions.Function0<kotlin.Unit> r29, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, androidx.compose.ui.Modifier r32, boolean r33, h0.l r34, long r35, long r37, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.A1.a(boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, boolean, h0.l, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(boolean r27, kotlin.jvm.functions.Function0<kotlin.Unit> r28, androidx.compose.ui.Modifier r29, boolean r30, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, h0.l r33, long r34, long r36, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.A1.b(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, h0.l, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(boolean r29, kotlin.jvm.functions.Function0<kotlin.Unit> r30, androidx.compose.ui.Modifier r31, boolean r32, h0.l r33, long r34, long r36, kotlin.jvm.functions.Function3<? super j0.InterfaceC14902f, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.A1.c(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, h0.l, long, long, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(long j10, long j11, boolean z10, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10) {
        int i11;
        boolean z11;
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-405571117);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.e(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.e(j11) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            z11 = z10;
            i11 |= composerStartRestartGroup.a(z11) ? 256 : 128;
        } else {
            z11 = z10;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(function2) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if (composerStartRestartGroup.p((i11 & 1171) != 1170, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(-405571117, i11, -1, "androidx.compose.material.TabTransition (Tab.kt:269)");
            }
            int i13 = i11 >> 6;
            k0 k0VarI = l0.i(Boolean.valueOf(z11), null, composerStartRestartGroup, i13 & 14, 2);
            k kVar = k.f167812f;
            boolean zBooleanValue = ((Boolean) k0VarI.o()).booleanValue();
            composerStartRestartGroup.startReplaceGroup(1445938070);
            if (ComposerKt.M()) {
                ComposerKt.U(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:285)");
            }
            long j12 = zBooleanValue ? j10 : j11;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composerStartRestartGroup.P();
            AbstractC5526c abstractC5526cV = C5489q0.v(j12);
            boolean zV = composerStartRestartGroup.V(abstractC5526cV);
            Object objB = composerStartRestartGroup.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = (o0) C6308h.a(C5489q0.INSTANCE).invoke(abstractC5526cV);
                composerStartRestartGroup.t(objB);
            }
            o0 o0Var = (o0) objB;
            boolean zBooleanValue2 = ((Boolean) k0VarI.h()).booleanValue();
            composerStartRestartGroup.startReplaceGroup(1445938070);
            if (ComposerKt.M()) {
                ComposerKt.U(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:285)");
            }
            long j13 = zBooleanValue2 ? j10 : j11;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composerStartRestartGroup.P();
            C5489q0 c5489q0M = C5489q0.m(j13);
            boolean zBooleanValue3 = ((Boolean) k0VarI.o()).booleanValue();
            composerStartRestartGroup.startReplaceGroup(1445938070);
            if (ComposerKt.M()) {
                i12 = i13;
                ComposerKt.U(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:285)");
            } else {
                i12 = i13;
            }
            long j14 = zBooleanValue3 ? j10 : j11;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composerStartRestartGroup.P();
            z1 z1VarF = l0.f(k0VarI, c5489q0M, C5489q0.m(j14), kVar.invoke(k0VarI.m(), composerStartRestartGroup, 0), o0Var, "ColorAnimation", composerStartRestartGroup, 0);
            r.b(new G0[]{C17960N.a().d(C5489q0.m(C5489q0.q(f(z1VarF), 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), C17958M.a().d(Float.valueOf(C5489q0.t(f(z1VarF))))}, function2, composerStartRestartGroup, G0.f50200i | (i12 & 112));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new j(j10, j11, z11, function2, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(f0.a aVar, H1.d dVar, f0 f0Var, f0 f0Var2, int i10, int i11, int i12, int i13) {
        int iE0 = dVar.E0(i12 == i13 ? f167741d : f167742e) + dVar.E0(C1.f167869a.c());
        int height = (f0Var2.getHeight() + dVar.N1(f167743f)) - i12;
        int i14 = (i11 - i13) - iE0;
        f0.a.l(aVar, f0Var, (i10 - f0Var.getWidth()) / 2, i14, 0.0f, 4, null);
        f0.a.l(aVar, f0Var2, (i10 - f0Var2.getWidth()) / 2, i14 - height, 0.0f, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(1249848471);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(function2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(function22)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        boolean z12 = true;
        if ((i11 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (composerStartRestartGroup.p(z10, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(1249848471, i11, -1, "androidx.compose.material.TabBaselineLayout (Tab.kt:300)");
            }
            int i14 = i11 & 14;
            if (i14 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((i11 & 112) != 32) {
                z12 = false;
            }
            boolean z13 = z11 | z12;
            Object objB = composerStartRestartGroup.B();
            if (z13 || objB == Composer.INSTANCE.a()) {
                objB = new h(function2, function22);
                composerStartRestartGroup.t(objB);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objB;
            Modifier.Companion companion = Modifier.INSTANCE;
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicy, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            if (function2 != null) {
                composerStartRestartGroup.startReplaceGroup(-238651272);
                Modifier modifierK = D.k(C5937w.b(companion, "text"), f167740c, 0.0f, 2, null);
                MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
                int iA2 = C5859f.a(composerStartRestartGroup, 0);
                InterfaceC5884s interfaceC5884sR2 = composerStartRestartGroup.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierK);
                Function0<InterfaceC5953g> function0A2 = companion2.a();
                if (composerStartRestartGroup.k() == null) {
                    C5859f.c();
                }
                composerStartRestartGroup.F();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.I(function0A2);
                } else {
                    composerStartRestartGroup.s();
                }
                Composer composerA2 = D1.a(composerStartRestartGroup);
                D1.c(composerA2, measurePolicyG, companion2.e());
                D1.c(composerA2, interfaceC5884sR2, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion2.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion2.f());
                C5806j c5806j = C5806j.f48836a;
                function2.invoke(composerStartRestartGroup, Integer.valueOf(i14));
                composerStartRestartGroup.v();
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(-238546523);
                composerStartRestartGroup.P();
            }
            if (function22 != null) {
                composerStartRestartGroup.startReplaceGroup(-238517724);
                Modifier modifierB = C5937w.b(companion, BarcodePickDeserializer.FIELD_ICON);
                MeasurePolicy measurePolicyG2 = C5804h.g(P0.e.INSTANCE.o(), false);
                int iA3 = C5859f.a(composerStartRestartGroup, 0);
                InterfaceC5884s interfaceC5884sR3 = composerStartRestartGroup.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierB);
                Function0<InterfaceC5953g> function0A3 = companion2.a();
                if (composerStartRestartGroup.k() == null) {
                    C5859f.c();
                }
                composerStartRestartGroup.F();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.I(function0A3);
                } else {
                    composerStartRestartGroup.s();
                }
                Composer composerA3 = D1.a(composerStartRestartGroup);
                D1.c(composerA3, measurePolicyG2, companion2.e());
                D1.c(composerA3, interfaceC5884sR3, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion2.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                D1.c(composerA3, modifierE3, companion2.f());
                C5806j c5806j2 = C5806j.f48836a;
                function22.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 3) & 14));
                composerStartRestartGroup.v();
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(-238455259);
                composerStartRestartGroup.P();
            }
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new i(function2, function22, i10));
        }
    }

    private static final long f(z1<C5489q0> z1Var) {
        return z1Var.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(f0.a aVar, f0 f0Var, int i10) {
        f0.a.l(aVar, f0Var, 0, (i10 - f0Var.getHeight()) / 2, 0.0f, 4, null);
    }
}
