package qi;

import Ii.h;
import Ji.LocalThemeScope;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import j0.C14815g;
import java.util.Arrays;
import ji.q1;
import kotlin.C17985y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import r0.C16692i;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\u0004*\u00020\bH\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LJi/M;", "Lji/q1$i;", "template", "Lkotlin/Function0;", "", "content", "e", "(LJi/M;Lji/q1$i;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Lqi/a;", "c", "(Lqi/a;Landroidx/compose/runtime/Composer;I)V", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: qi.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C16531d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: qi.d$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16528a f157296a;

        a(InterfaceC16528a interfaceC16528a) {
            this.f157296a = interfaceC16528a;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(84614697, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.info_block.Block.<anonymous> (InfoBlock.kt:71)");
            }
            Modifier modifierJ = D.j(Modifier.INSTANCE, this.f157296a.c().getAdsSpacing().getFive().getDp(), this.f157296a.c().getAdsSpacing().getFour().getDp());
            InterfaceC16528a interfaceC16528a = this.f157296a;
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierJ);
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
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14815g c14815g = C14815g.f139108a;
            interfaceC16528a.getContent().invoke(composer, 0);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qi.d$b */
    public static final class b implements Function1<C16532e, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f157297a = new b();

        public final void a(C16532e c16532e) {
            Intrinsics.j(c16532e, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C16532e c16532e) {
            a(c16532e);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LIi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LIi/h;", "s", "()LIi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: qi.d$c */
    public static final class c extends Ii.c<Integer, C16532e, C16532e> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final z1<Function1<C16532e, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final z1<C16532e> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final C16532e initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: qi.d$c$a */
        public static final class a implements Function0<C16532e> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f157301a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f157302b;

            public a(h hVar, c cVar) {
                this.f157301a = hVar;
                this.f157302b = cVar;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Ii.h, java.lang.Object, qi.e] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C16532e invoke() {
                ?? r02 = this.f157301a;
                this.f157302b.t().getValue().invoke(r02);
                return r02;
            }
        }

        @Override // Ii.c
        public z1<C16532e> r() {
            return this.state;
        }

        @Override // Ii.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C16532e getInitialScope() {
            return this.initialScope;
        }

        public z1<Function1<C16532e, Unit>> t() {
            return this.latestContent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1 function1, Composer composer, int i10, Object[] objArr, h hVar) {
            this.latestContent = o1.p(function1, composer, (i10 >> 6) & 14);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(objArr);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = o1.e(new a(hVar, this));
                composer.t(objB);
            }
            composer.P();
            this.state = (z1) objB;
            this.initialScope = hVar;
        }
    }

    public static final void e(final LocalThemeScope localThemeScope, final q1.InfoBlock template, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(template, "template");
        Intrinsics.j(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1157387153);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(template) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(content) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1157387153, i11, -1, "com.meijer.mobile.android_acres_library.atomic_providers.info_block.InfoBlock (InfoBlock.kt:38)");
            }
            C16532e c16532e = new C16532e(template, localThemeScope, content);
            Object[] objArr = {template};
            Modifier modifier = template.getModifier();
            composerStartRestartGroup.startReplaceGroup(-2104237158);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = b.f157297a;
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            Object[] objArrCopyOf = Arrays.copyOf(objArr, 1);
            composerStartRestartGroup.startReplaceGroup(1252494947);
            c cVar = new c((Function1) objB, composerStartRestartGroup, 0, objArrCopyOf, c16532e);
            composerStartRestartGroup.P();
            cVar.k(0, modifier).invoke(composerStartRestartGroup, 0);
            composerStartRestartGroup.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: qi.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C16531d.f(localThemeScope, template, content, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void c(final InterfaceC16528a interfaceC16528a, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(interfaceC16528a, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1957793914);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(interfaceC16528a) : composerStartRestartGroup.D(interfaceC16528a) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1957793914, i11, -1, "com.meijer.mobile.android_acres_library.atomic_providers.info_block.Block (InfoBlock.kt:62)");
            }
            C17985y.a(J.h(Modifier.INSTANCE, 0.0f, 1, null).then(interfaceC16528a.getTemplate().getModifier()), C16692i.c(interfaceC16528a.c().getAdsCornerRadii().getRadius04().getDp()), interfaceC16528a.getTemplate().getColor().getColor(), 0L, null, H1.h.p(0), ComposableLambdaKt.c(84614697, true, new a(interfaceC16528a), composerStartRestartGroup, 54), composerStartRestartGroup, 1769472, 24);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: qi.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C16531d.d(interfaceC16528a, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(InterfaceC16528a interfaceC16528a, int i10, Composer composer, int i11) {
        c(interfaceC16528a, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, q1.InfoBlock infoBlock, Function2 function2, int i10, Composer composer, int i11) {
        e(localThemeScope, infoBlock, function2, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }
}
