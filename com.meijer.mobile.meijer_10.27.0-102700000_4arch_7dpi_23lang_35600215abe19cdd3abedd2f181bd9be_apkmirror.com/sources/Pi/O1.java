package Pi;

import Ji.LocalThemeScope;
import Ni.l;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import j0.C14801J;
import ji.C14898A;
import ji.C14899B;
import ji.C14900C;
import ji.C14947m;
import ji.C14949n;
import ji.C14951o;
import ji.C14953p;
import ji.C14955q;
import ji.C14957r;
import ji.C14959s;
import ji.C14961t;
import ji.C14973z;
import ji.InterfaceC14971y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15342b;
import l0.InterfaceC15343c;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001b\u0010\f\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\nJ\u001b\u0010\r\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\nJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0006H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u000e*\u00020\u0006H\u0017¢\u0006\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LPi/O1;", "LNi/c;", "LNi/l$e;", "state", "<init>", "(LNi/l$e;)V", "LJi/M;", "Ll0/w;", "scope", "p", "(LJi/M;Ll0/w;)Ll0/w;", "q", "n", "o", "", "a", "(LJi/M;Landroidx/compose/runtime/Composer;I)V", "f", "LNi/l$e;", "m", "()LNi/l$e;", "", "getName", "()Ljava/lang/String;", "name", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class O1 implements Ni.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.ButtonState state;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26563a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O1 f26564b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Pi.O1$a$a, reason: collision with other inner class name */
        static final class C0508a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O1 f26565a;

            C0508a(O1 o12) {
                this.f26565a = o12;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-952036152, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.inverseScopeV2.<anonymous>.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:190)");
                }
                Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.e(), P0.e.INSTANCE.l(), composer, 6);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14801J c14801j = C14801J.f139030a;
                InterfaceC14971y.a.b bVar = InterfaceC14971y.a.b.f140288a;
                composer.startReplaceGroup(-702508151);
                Ji.K.b(null, ComposableLambdaKt.c(2115665818, true, new N1(bVar, 54, "Inverse"), composer, 54), composer, 48, 1);
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

        a(LocalThemeScope localThemeScope, O1 o12) {
            this.f26563a = localThemeScope;
            this.f26564b = o12;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(383479797, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.inverseScopeV2.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:186)");
            }
            Ri.b.b(this.f26563a, null, this.f26564b.d("Inverse Rectangle Large"), "2.0", null, ComposableLambdaKt.c(-952036152, true, new C0508a(this.f26564b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26566a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O1 f26567b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O1 f26568a;

            a(O1 o12) {
                this.f26568a = o12;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-2059242127, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.inverseScopeV2.<anonymous>.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:208)");
                }
                Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.e(), P0.e.INSTANCE.l(), composer, 6);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14801J c14801j = C14801J.f139030a;
                C14973z c14973z = C14973z.f140302a;
                composer.startReplaceGroup(-702508151);
                Ji.K.b(null, ComposableLambdaKt.c(2115665818, true, new N1(c14973z, 54, "Inverse"), composer, 54), composer, 48, 1);
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

        b(LocalThemeScope localThemeScope, O1 o12) {
            this.f26566a = localThemeScope;
            this.f26567b = o12;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1471330654, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.inverseScopeV2.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:204)");
            }
            Ri.b.b(this.f26566a, null, this.f26567b.d("Inverse Rectangle Small"), "2.0", null, ComposableLambdaKt.c(-2059242127, true, new a(this.f26567b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26569a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O1 f26570b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O1 f26571a;

            a(O1 o12) {
                this.f26571a = o12;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(900351440, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.inverseScopeV2.<anonymous>.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:226)");
                }
                Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.e(), P0.e.INSTANCE.l(), composer, 6);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14801J c14801j = C14801J.f139030a;
                C14947m c14947m = C14947m.f139896a;
                composer.startReplaceGroup(1355200366);
                Ji.K.b(null, ComposableLambdaKt.c(-2035438339, true, new M1(c14947m, 54, "99"), composer, 54), composer, 48, 1);
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

        c(LocalThemeScope localThemeScope, O1 o12) {
            this.f26569a = localThemeScope;
            this.f26570b = o12;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(135956925, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.inverseScopeV2.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:222)");
            }
            Ri.b.b(this.f26569a, null, this.f26570b.d("Inverse Circle Large"), "2.0", null, ComposableLambdaKt.c(900351440, true, new a(this.f26570b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26572a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O1 f26573b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O1 f26574a;

            a(O1 o12) {
                this.f26574a = o12;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-435022289, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.inverseScopeV2.<anonymous>.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:241)");
                }
                Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.e(), P0.e.INSTANCE.l(), composer, 6);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14801J c14801j = C14801J.f139030a;
                C14955q c14955q = C14955q.f139923a;
                composer.startReplaceGroup(1355200366);
                Ji.K.b(null, ComposableLambdaKt.c(-2035438339, true, new M1(c14955q, 54, "99"), composer, 54), composer, 48, 1);
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

        d(LocalThemeScope localThemeScope, O1 o12) {
            this.f26572a = localThemeScope;
            this.f26573b = o12;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1199416804, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.inverseScopeV2.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:237)");
            }
            Ri.b.b(this.f26572a, null, this.f26573b.d("Inverse Circle Small"), "2.0", null, ComposableLambdaKt.c(-435022289, true, new a(this.f26573b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26575a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O1 f26576b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O1 f26577a;

            a(O1 o12) {
                this.f26577a = o12;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1115998463, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.passiveScopeV2.<anonymous>.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:258)");
                }
                Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.e(), P0.e.INSTANCE.l(), composer, 6);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14801J c14801j = C14801J.f139030a;
                InterfaceC14971y.a.c cVar = InterfaceC14971y.a.c.f140290a;
                composer.startReplaceGroup(-702508151);
                Ji.K.b(null, ComposableLambdaKt.c(2115665818, true, new N1(cVar, 54, "Passive"), composer, 54), composer, 48, 1);
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

        e(LocalThemeScope localThemeScope, O1 o12) {
            this.f26575a = localThemeScope;
            this.f26576b = o12;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1843452884, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.passiveScopeV2.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:254)");
            }
            Ri.b.b(this.f26575a, null, this.f26576b.d("Passive Rectangle Large"), "2.0", null, ComposableLambdaKt.c(1115998463, true, new a(this.f26576b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26578a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O1 f26579b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O1 f26580a;

            a(O1 o12) {
                this.f26580a = o12;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(8792488, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.passiveScopeV2.<anonymous>.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:276)");
                }
                Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.e(), P0.e.INSTANCE.l(), composer, 6);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14801J c14801j = C14801J.f139030a;
                C14898A c14898a = C14898A.f139596a;
                composer.startReplaceGroup(-702508151);
                Ji.K.b(null, ComposableLambdaKt.c(2115665818, true, new N1(c14898a, 54, "Passive"), composer, 54), composer, 48, 1);
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

        f(LocalThemeScope localThemeScope, O1 o12) {
            this.f26578a = localThemeScope;
            this.f26579b = o12;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-755602027, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.passiveScopeV2.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:272)");
            }
            Ri.b.b(this.f26578a, null, this.f26579b.d("Passive Rectangle Small"), "2.0", null, ComposableLambdaKt.c(8792488, true, new a(this.f26579b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26581a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O1 f26582b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O1 f26583a;

            a(O1 o12) {
                this.f26583a = o12;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1326581241, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.passiveScopeV2.<anonymous>.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:294)");
                }
                Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.e(), P0.e.INSTANCE.l(), composer, 6);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14801J c14801j = C14801J.f139030a;
                C14949n c14949n = C14949n.f139910a;
                composer.startReplaceGroup(1355200366);
                Ji.K.b(null, ComposableLambdaKt.c(-2035438339, true, new M1(c14949n, 54, "99"), composer, 54), composer, 48, 1);
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

        g(LocalThemeScope localThemeScope, O1 o12) {
            this.f26581a = localThemeScope;
            this.f26582b = o12;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2090975756, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.passiveScopeV2.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:290)");
            }
            Ri.b.b(this.f26581a, null, this.f26582b.d("Passive Circle Large"), "2.0", null, ComposableLambdaKt.c(-1326581241, true, new a(this.f26582b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26584a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O1 f26585b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O1 f26586a;

            a(O1 o12) {
                this.f26586a = o12;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1633012326, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.passiveScopeV2.<anonymous>.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:309)");
                }
                Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.e(), P0.e.INSTANCE.l(), composer, 6);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14801J c14801j = C14801J.f139030a;
                C14957r c14957r = C14957r.f140188a;
                composer.startReplaceGroup(1355200366);
                Ji.K.b(null, ComposableLambdaKt.c(-2035438339, true, new M1(c14957r, 54, "99"), composer, 54), composer, 48, 1);
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

        h(LocalThemeScope localThemeScope, O1 o12) {
            this.f26584a = localThemeScope;
            this.f26585b = o12;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(868617811, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.passiveScopeV2.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:305)");
            }
            Ri.b.b(this.f26584a, null, this.f26585b.d("Passive Circle Small"), "2.0", null, ComposableLambdaKt.c(1633012326, true, new a(this.f26585b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26587a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O1 f26588b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O1 f26589a;

            a(O1 o12) {
                this.f26589a = o12;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(986765082, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.primaryScopeV2.<anonymous>.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:54)");
                }
                Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.e(), P0.e.INSTANCE.l(), composer, 6);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14801J c14801j = C14801J.f139030a;
                InterfaceC14971y.a.d dVar = InterfaceC14971y.a.d.f140292a;
                composer.startReplaceGroup(-702508151);
                Ji.K.b(null, ComposableLambdaKt.c(2115665818, true, new N1(dVar, 54, "Primary"), composer, 54), composer, 48, 1);
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

        i(LocalThemeScope localThemeScope, O1 o12) {
            this.f26587a = localThemeScope;
            this.f26588b = o12;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1972686265, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.primaryScopeV2.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:50)");
            }
            Ri.b.b(this.f26587a, null, this.f26588b.d("Primary Rectangle Large"), "2.0", null, ComposableLambdaKt.c(986765082, true, new a(this.f26588b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class j implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26590a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O1 f26591b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O1 f26592a;

            a(O1 o12) {
                this.f26592a = o12;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-120440893, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.primaryScopeV2.<anonymous>.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:72)");
                }
                Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.e(), P0.e.INSTANCE.l(), composer, 6);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14801J c14801j = C14801J.f139030a;
                C14899B c14899b = C14899B.f139602a;
                composer.startReplaceGroup(-702508151);
                Ji.K.b(null, ComposableLambdaKt.c(2115665818, true, new N1(c14899b, 54, "Primary"), composer, 54), composer, 48, 1);
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

        j(LocalThemeScope localThemeScope, O1 o12) {
            this.f26590a = localThemeScope;
            this.f26591b = o12;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-884835408, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.primaryScopeV2.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:68)");
            }
            Ri.b.b(this.f26590a, null, this.f26591b.d("Primary Rectangle Small"), "2.0", null, ComposableLambdaKt.c(-120440893, true, new a(this.f26591b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class k implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26593a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O1 f26594b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O1 f26595a;

            a(O1 o12) {
                this.f26595a = o12;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1455814622, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.primaryScopeV2.<anonymous>.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:90)");
                }
                Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.e(), P0.e.INSTANCE.l(), composer, 6);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14801J c14801j = C14801J.f139030a;
                C14951o c14951o = C14951o.f139915a;
                composer.startReplaceGroup(1355200366);
                Ji.K.b(null, ComposableLambdaKt.c(-2035438339, true, new M1(c14951o, 54, "99"), composer, 54), composer, 48, 1);
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

        k(LocalThemeScope localThemeScope, O1 o12) {
            this.f26593a = localThemeScope;
            this.f26594b = o12;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2074758159, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.primaryScopeV2.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:86)");
            }
            Ri.b.b(this.f26593a, null, this.f26594b.d("Primary Circle Large"), "2.0", null, ComposableLambdaKt.c(-1455814622, true, new a(this.f26594b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class l implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26596a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O1 f26597b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O1 f26598a;

            a(O1 o12) {
                this.f26598a = o12;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1503778945, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.primaryScopeV2.<anonymous>.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:105)");
                }
                Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.e(), P0.e.INSTANCE.l(), composer, 6);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14801J c14801j = C14801J.f139030a;
                C14959s c14959s = C14959s.f140192a;
                composer.startReplaceGroup(1355200366);
                Ji.K.b(null, ComposableLambdaKt.c(-2035438339, true, new M1(c14959s, 54, "99"), composer, 54), composer, 48, 1);
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

        l(LocalThemeScope localThemeScope, O1 o12) {
            this.f26596a = localThemeScope;
            this.f26597b = o12;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(739384430, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.primaryScopeV2.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:101)");
            }
            Ri.b.b(this.f26596a, null, this.f26597b.d("Primary Circle Small"), "2.0", null, ComposableLambdaKt.c(1503778945, true, new a(this.f26597b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class m implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26599a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O1 f26600b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O1 f26601a;

            a(O1 o12) {
                this.f26601a = o12;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-812011700, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.secondaryScopeV2.<anonymous>.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:122)");
                }
                Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.e(), P0.e.INSTANCE.l(), composer, 6);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14801J c14801j = C14801J.f139030a;
                InterfaceC14971y.a.e eVar = InterfaceC14971y.a.e.f140294a;
                composer.startReplaceGroup(-702508151);
                Ji.K.b(null, ComposableLambdaKt.c(2115665818, true, new N1(eVar, 54, "Secondary"), composer, 54), composer, 48, 1);
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

        m(LocalThemeScope localThemeScope, O1 o12) {
            this.f26599a = localThemeScope;
            this.f26600b = o12;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1576406215, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.secondaryScopeV2.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:118)");
            }
            Ri.b.b(this.f26599a, null, this.f26600b.d("Secondary Rectangle Large"), "2.0", null, ComposableLambdaKt.c(-812011700, true, new a(this.f26600b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class n implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26602a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O1 f26603b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O1 f26604a;

            a(O1 o12) {
                this.f26604a = o12;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(314935733, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.secondaryScopeV2.<anonymous>.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:140)");
                }
                Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.e(), P0.e.INSTANCE.l(), composer, 6);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14801J c14801j = C14801J.f139030a;
                C14900C c14900c = C14900C.f139605a;
                composer.startReplaceGroup(-702508151);
                Ji.K.b(null, ComposableLambdaKt.c(2115665818, true, new N1(c14900c, 54, "Secondary"), composer, 54), composer, 48, 1);
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

        n(LocalThemeScope localThemeScope, O1 o12) {
            this.f26602a = localThemeScope;
            this.f26603b = o12;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(171214434, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.secondaryScopeV2.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:136)");
            }
            Ri.b.b(this.f26602a, null, this.f26603b.d("Secondary Rectangle Small"), "2.0", null, ComposableLambdaKt.c(314935733, true, new a(this.f26603b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class o implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26605a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O1 f26606b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O1 f26607a;

            a(O1 o12) {
                this.f26607a = o12;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1216003668, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.secondaryScopeV2.<anonymous>.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:158)");
                }
                Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.e(), P0.e.INSTANCE.l(), composer, 6);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14801J c14801j = C14801J.f139030a;
                C14953p c14953p = C14953p.f139919a;
                composer.startReplaceGroup(1355200366);
                Ji.K.b(null, ComposableLambdaKt.c(-2035438339, true, new M1(c14953p, 54, "99"), composer, 54), composer, 48, 1);
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

        o(LocalThemeScope localThemeScope, O1 o12) {
            this.f26605a = localThemeScope;
            this.f26606b = o12;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1072282369, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.secondaryScopeV2.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:154)");
            }
            Ri.b.b(this.f26605a, null, this.f26606b.d("Secondary Circle Large"), "2.0", null, ComposableLambdaKt.c(1216003668, true, new a(this.f26606b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class p implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26608a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O1 f26609b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O1 f26610a;

            a(O1 o12) {
                this.f26610a = o12;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(2117071603, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.secondaryScopeV2.<anonymous>.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:173)");
                }
                Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.e(), P0.e.INSTANCE.l(), composer, 6);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14801J c14801j = C14801J.f139030a;
                C14961t c14961t = C14961t.f140229a;
                composer.startReplaceGroup(1355200366);
                Ji.K.b(null, ComposableLambdaKt.c(-2035438339, true, new M1(c14961t, 54, "99"), composer, 54), composer, 48, 1);
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

        p(LocalThemeScope localThemeScope, O1 o12) {
            this.f26608a = localThemeScope;
            this.f26609b = o12;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1973350304, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.secondaryScopeV2.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:169)");
            }
            Ri.b.b(this.f26608a, null, this.f26609b.d("Secondary Circle Small"), "2.0", null, ComposableLambdaKt.c(2117071603, true, new a(this.f26609b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public O1(l.ButtonState state) {
        Intrinsics.j(state, "state");
        this.state = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(O1 o12, LocalThemeScope localThemeScope, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        o12.p(localThemeScope, LazyColumn);
        o12.q(localThemeScope, LazyColumn);
        o12.n(localThemeScope, LazyColumn);
        o12.o(localThemeScope, LazyColumn);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(O1 o12, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        o12.a(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(O1 o12, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        o12.f(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    private final l0.w n(LocalThemeScope localThemeScope, l0.w wVar) {
        l0.w.g(wVar, null, null, ComposableLambdaKt.composableLambdaInstance(383479797, true, new a(localThemeScope, this)), 3, null);
        l0.w.g(wVar, null, null, ComposableLambdaKt.composableLambdaInstance(1471330654, true, new b(localThemeScope, this)), 3, null);
        l0.w.g(wVar, null, null, ComposableLambdaKt.composableLambdaInstance(135956925, true, new c(localThemeScope, this)), 3, null);
        l0.w.g(wVar, null, null, ComposableLambdaKt.composableLambdaInstance(-1199416804, true, new d(localThemeScope, this)), 3, null);
        return wVar;
    }

    private final l0.w o(LocalThemeScope localThemeScope, l0.w wVar) {
        l0.w.g(wVar, null, null, ComposableLambdaKt.composableLambdaInstance(-1843452884, true, new e(localThemeScope, this)), 3, null);
        l0.w.g(wVar, null, null, ComposableLambdaKt.composableLambdaInstance(-755602027, true, new f(localThemeScope, this)), 3, null);
        l0.w.g(wVar, null, null, ComposableLambdaKt.composableLambdaInstance(-2090975756, true, new g(localThemeScope, this)), 3, null);
        l0.w.g(wVar, null, null, ComposableLambdaKt.composableLambdaInstance(868617811, true, new h(localThemeScope, this)), 3, null);
        return wVar;
    }

    private final l0.w p(LocalThemeScope localThemeScope, l0.w wVar) {
        l0.w.g(wVar, null, null, ComposableLambdaKt.composableLambdaInstance(-1972686265, true, new i(localThemeScope, this)), 3, null);
        l0.w.g(wVar, null, null, ComposableLambdaKt.composableLambdaInstance(-884835408, true, new j(localThemeScope, this)), 3, null);
        l0.w.g(wVar, null, null, ComposableLambdaKt.composableLambdaInstance(2074758159, true, new k(localThemeScope, this)), 3, null);
        l0.w.g(wVar, null, null, ComposableLambdaKt.composableLambdaInstance(739384430, true, new l(localThemeScope, this)), 3, null);
        return wVar;
    }

    private final l0.w q(LocalThemeScope localThemeScope, l0.w wVar) {
        l0.w.g(wVar, null, null, ComposableLambdaKt.composableLambdaInstance(-1576406215, true, new m(localThemeScope, this)), 3, null);
        l0.w.g(wVar, null, null, ComposableLambdaKt.composableLambdaInstance(171214434, true, new n(localThemeScope, this)), 3, null);
        l0.w.g(wVar, null, null, ComposableLambdaKt.composableLambdaInstance(1072282369, true, new o(localThemeScope, this)), 3, null);
        l0.w.g(wVar, null, null, ComposableLambdaKt.composableLambdaInstance(1973350304, true, new p(localThemeScope, this)), 3, null);
        return wVar;
    }

    @Override // Ni.c
    public void a(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2022063960);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(this) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-2022063960, i11, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.Content (ButtonShowcaseLegacy.kt:38)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z10 = false;
            boolean z11 = (i11 & 112) == 32;
            if ((i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(localThemeScope))) {
                z10 = true;
            }
            boolean z12 = z11 | z10;
            Object objB = composerStartRestartGroup.B();
            if (z12 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Pi.K1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return O1.j(this.f26335a, localThemeScope, (l0.w) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            C15342b.a(null, null, null, false, null, null, null, false, null, (Function1) objB, composerStartRestartGroup, 0, 511);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Pi.L1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return O1.k(this.f26360a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
    public void f(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-694975105);
        if ((i10 & 1) == 0 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-694975105, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.Controls (ButtonShowcaseLegacy.kt:495)");
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Pi.J1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return O1.l(this.f26309a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
    public String getName() {
        return "Buttons (Deprecated)";
    }

    @Override // Ni.c
    /* renamed from: m, reason: from getter */
    public l.ButtonState getState() {
        return this.state;
    }
}
