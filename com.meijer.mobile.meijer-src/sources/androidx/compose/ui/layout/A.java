package androidx.compose.ui.layout;

import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.V0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a.\u0010\f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0002\b\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\f\u0010\r\u001a.\u0010\u000e\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0002\b\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000e\u0010\r\u001a/\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"", "Lkotlin/Function0;", "", "contents", "b", "(Ljava/util/List;)Lkotlin/jvm/functions/Function2;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/runtime/V0;", "Landroidx/compose/ui/node/g;", "Lkotlin/ExtensionFunctionType;", "d", "(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;", "c", "content", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "a", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class A {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "", "a", "(Landroidx/compose/ui/node/LayoutNode;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<LayoutNode, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f51183f = new a();

        a() {
            super(1);
        }

        public final void a(LayoutNode layoutNode) {
            layoutNode.w1(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
            a(layoutNode);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f51184f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f51185g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ MeasurePolicy f51186h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f51187i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f51188j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, MeasurePolicy measurePolicy, int i10, int i11) {
            super(2);
            this.f51184f = modifier;
            this.f51185g = function2;
            this.f51186h = measurePolicy;
            this.f51187i = i10;
            this.f51188j = i11;
        }

        public final void a(Composer composer, int i10) {
            A.a(this.f51184f, this.f51185g, this.f51186h, composer, J0.a(this.f51187i | 1), this.f51188j);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<Function2<Composer, Integer, Unit>> f51189f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(List<? extends Function2<? super Composer, ? super Integer, Unit>> list) {
            super(2);
            this.f51189f = list;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1953651383, i10, -1, "androidx.compose.ui.layout.combineAsVirtualLayouts.<anonymous> (Layout.kt:176)");
            }
            List<Function2<Composer, Integer, Unit>> list = this.f51189f;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Function2<Composer, Integer, Unit> function2 = list.get(i11);
                int iA = C5859f.a(composer, 0);
                InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0I = companion.i();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.h()) {
                    composer.I(function0I);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                function2.invoke(composer, 0);
                composer.v();
            }
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/V0;", "Landroidx/compose/ui/node/g;", "", "a", "(Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class d extends Lambda implements Function3<V0<InterfaceC5953g>, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f51190f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Modifier modifier) {
            super(3);
            this.f51190f = modifier;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(V0<InterfaceC5953g> v02, Composer composer, Integer num) {
            a(v02.getComposer(), composer, num.intValue());
            return Unit.f143329a;
        }

        public final void a(Composer composer, Composer composer2, int i10) {
            if (ComposerKt.M()) {
                ComposerKt.U(-1586257396, i10, -1, "androidx.compose.ui.layout.materializerOf.<anonymous> (Layout.kt:196)");
            }
            int iA = C5859f.a(composer2, 0);
            Modifier modifierE = androidx.compose.ui.b.e(composer2, this.f51190f);
            composer.startReplaceableGroup(509942095);
            Composer composerA = D1.a(composer);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            D1.c(composerA, modifierE, companion.f());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            composer.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/V0;", "Landroidx/compose/ui/node/g;", "", "a", "(Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class e extends Lambda implements Function3<V0<InterfaceC5953g>, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f51191f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Modifier modifier) {
            super(3);
            this.f51191f = modifier;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(V0<InterfaceC5953g> v02, Composer composer, Integer num) {
            a(v02.getComposer(), composer, num.intValue());
            return Unit.f143329a;
        }

        public final void a(Composer composer, Composer composer2, int i10) {
            if (ComposerKt.M()) {
                ComposerKt.U(-55743822, i10, -1, "androidx.compose.ui.layout.materializerOfWithCompositionLocalInjection.<anonymous> (Layout.kt:218)");
            }
            int iA = C5859f.a(composer2, 0);
            Modifier modifierF = androidx.compose.ui.b.f(composer2, this.f51191f);
            composer.startReplaceableGroup(509942095);
            Composer composerA = D1.a(composer);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            D1.c(composerA, modifierF, companion.f());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            composer.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
    }

    @PublishedApi
    public static final Function2<Composer, Integer, Unit> b(List<? extends Function2<? super Composer, ? super Integer, Unit>> list) {
        return ComposableLambdaKt.composableLambdaInstance(-1953651383, true, new c(list));
    }

    @Deprecated
    @PublishedApi
    @JvmName
    public static final Function3<V0<InterfaceC5953g>, Composer, Integer, Unit> c(Modifier modifier) {
        return ComposableLambdaKt.composableLambdaInstance(-55743822, true, new e(modifier));
    }

    @PublishedApi
    @JvmName
    public static final Function3<V0<InterfaceC5953g>, Composer, Integer, Unit> d(Modifier modifier) {
        return ComposableLambdaKt.composableLambdaInstance(-1586257396, true, new d(modifier));
    }

    @Deprecated
    public static final void a(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, MeasurePolicy measurePolicy, Composer composer, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        Composer composerStartRestartGroup = composer.startRestartGroup(1949933075);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(function2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.V(measurePolicy)) {
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
            if (ComposerKt.M()) {
                ComposerKt.U(1949933075, i12, -1, "androidx.compose.ui.layout.MultiMeasureLayout (Layout.kt:237)");
            }
            int iA = C5859f.a(composerStartRestartGroup, 0);
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Function0<LayoutNode> function0A = LayoutNode.INSTANCE.a();
            int i17 = ((i12 << 3) & 896) | 6;
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            D1.c(composerA, measurePolicy, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            D1.b(composerA, a.f51183f);
            D1.c(composerA, modifierE, companion.f());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i17 >> 6) & 14));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        Modifier modifier2 = modifier;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new b(modifier2, function2, measurePolicy, i10, i11));
        }
    }
}
