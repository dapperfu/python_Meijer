package Qi;

import Ki.LocalThemeScope;
import Oi.l;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import j0.C14889J;
import ki.C15132A;
import ki.C15133B;
import ki.C15134C;
import ki.C15181m;
import ki.C15183n;
import ki.C15185o;
import ki.C15187p;
import ki.C15189q;
import ki.C15191r;
import ki.C15193s;
import ki.C15195t;
import ki.C15207z;
import ki.InterfaceC15205y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15432b;
import l0.InterfaceC15433c;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001b\u0010\f\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\nJ\u001b\u0010\r\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\nJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0006H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u000e*\u00020\u0006H\u0017¢\u0006\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"LQi/O1;", "LOi/c;", "LOi/l$e;", "state", "<init>", "(LOi/l$e;)V", "LKi/M;", "Ll0/w;", "scope", "p", "(LKi/M;Ll0/w;)Ll0/w;", "q", "n", "o", "", "f", "(LKi/M;Landroidx/compose/runtime/Composer;I)V", "b", "a", "LOi/l$e;", "m", "()LOi/l$e;", "", "getName", "()Ljava/lang/String;", "name", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class O1 implements Oi.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.ButtonState state;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29275a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O1 f29276b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.O1$a$a, reason: collision with other inner class name */
        static final class C0572a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O1 f29277a;

            C0572a(O1 o12) {
                this.f29277a = o12;
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
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.e(), P0.e.INSTANCE.l(), composer, 6);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14889J c14889j = C14889J.f139620a;
                InterfaceC15205y.a.b bVar = InterfaceC15205y.a.b.f142543a;
                composer.startReplaceGroup(-702508151);
                Ki.K.b(null, ComposableLambdaKt.c(2115665818, true, new N1(bVar, 54, "Inverse"), composer, 54), composer, 48, 1);
                composer.P();
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

        a(LocalThemeScope localThemeScope, O1 o12) {
            this.f29275a = localThemeScope;
            this.f29276b = o12;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(383479797, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.inverseScopeV2.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:186)");
            }
            Si.b.b(this.f29275a, null, this.f29276b.c("Inverse Rectangle Large"), "2.0", null, ComposableLambdaKt.c(-952036152, true, new C0572a(this.f29276b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29278a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O1 f29279b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O1 f29280a;

            a(O1 o12) {
                this.f29280a = o12;
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
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.e(), P0.e.INSTANCE.l(), composer, 6);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14889J c14889j = C14889J.f139620a;
                C15207z c15207z = C15207z.f142557a;
                composer.startReplaceGroup(-702508151);
                Ki.K.b(null, ComposableLambdaKt.c(2115665818, true, new N1(c15207z, 54, "Inverse"), composer, 54), composer, 48, 1);
                composer.P();
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

        b(LocalThemeScope localThemeScope, O1 o12) {
            this.f29278a = localThemeScope;
            this.f29279b = o12;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1471330654, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.inverseScopeV2.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:204)");
            }
            Si.b.b(this.f29278a, null, this.f29279b.c("Inverse Rectangle Small"), "2.0", null, ComposableLambdaKt.c(-2059242127, true, new a(this.f29279b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29281a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O1 f29282b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O1 f29283a;

            a(O1 o12) {
                this.f29283a = o12;
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
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.e(), P0.e.INSTANCE.l(), composer, 6);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14889J c14889j = C14889J.f139620a;
                C15181m c15181m = C15181m.f142151a;
                composer.startReplaceGroup(1355200366);
                Ki.K.b(null, ComposableLambdaKt.c(-2035438339, true, new M1(c15181m, 54, "99"), composer, 54), composer, 48, 1);
                composer.P();
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

        c(LocalThemeScope localThemeScope, O1 o12) {
            this.f29281a = localThemeScope;
            this.f29282b = o12;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(135956925, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.inverseScopeV2.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:222)");
            }
            Si.b.b(this.f29281a, null, this.f29282b.c("Inverse Circle Large"), "2.0", null, ComposableLambdaKt.c(900351440, true, new a(this.f29282b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29284a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O1 f29285b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O1 f29286a;

            a(O1 o12) {
                this.f29286a = o12;
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
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.e(), P0.e.INSTANCE.l(), composer, 6);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14889J c14889j = C14889J.f139620a;
                C15189q c15189q = C15189q.f142178a;
                composer.startReplaceGroup(1355200366);
                Ki.K.b(null, ComposableLambdaKt.c(-2035438339, true, new M1(c15189q, 54, "99"), composer, 54), composer, 48, 1);
                composer.P();
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

        d(LocalThemeScope localThemeScope, O1 o12) {
            this.f29284a = localThemeScope;
            this.f29285b = o12;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1199416804, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.inverseScopeV2.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:237)");
            }
            Si.b.b(this.f29284a, null, this.f29285b.c("Inverse Circle Small"), "2.0", null, ComposableLambdaKt.c(-435022289, true, new a(this.f29285b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29287a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O1 f29288b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O1 f29289a;

            a(O1 o12) {
                this.f29289a = o12;
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
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.e(), P0.e.INSTANCE.l(), composer, 6);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14889J c14889j = C14889J.f139620a;
                InterfaceC15205y.a.c cVar = InterfaceC15205y.a.c.f142545a;
                composer.startReplaceGroup(-702508151);
                Ki.K.b(null, ComposableLambdaKt.c(2115665818, true, new N1(cVar, 54, "Passive"), composer, 54), composer, 48, 1);
                composer.P();
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

        e(LocalThemeScope localThemeScope, O1 o12) {
            this.f29287a = localThemeScope;
            this.f29288b = o12;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1843452884, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.passiveScopeV2.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:254)");
            }
            Si.b.b(this.f29287a, null, this.f29288b.c("Passive Rectangle Large"), "2.0", null, ComposableLambdaKt.c(1115998463, true, new a(this.f29288b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29290a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O1 f29291b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O1 f29292a;

            a(O1 o12) {
                this.f29292a = o12;
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
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.e(), P0.e.INSTANCE.l(), composer, 6);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14889J c14889j = C14889J.f139620a;
                C15132A c15132a = C15132A.f141851a;
                composer.startReplaceGroup(-702508151);
                Ki.K.b(null, ComposableLambdaKt.c(2115665818, true, new N1(c15132a, 54, "Passive"), composer, 54), composer, 48, 1);
                composer.P();
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

        f(LocalThemeScope localThemeScope, O1 o12) {
            this.f29290a = localThemeScope;
            this.f29291b = o12;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-755602027, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.passiveScopeV2.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:272)");
            }
            Si.b.b(this.f29290a, null, this.f29291b.c("Passive Rectangle Small"), "2.0", null, ComposableLambdaKt.c(8792488, true, new a(this.f29291b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29293a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O1 f29294b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O1 f29295a;

            a(O1 o12) {
                this.f29295a = o12;
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
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.e(), P0.e.INSTANCE.l(), composer, 6);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14889J c14889j = C14889J.f139620a;
                C15183n c15183n = C15183n.f142165a;
                composer.startReplaceGroup(1355200366);
                Ki.K.b(null, ComposableLambdaKt.c(-2035438339, true, new M1(c15183n, 54, "99"), composer, 54), composer, 48, 1);
                composer.P();
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

        g(LocalThemeScope localThemeScope, O1 o12) {
            this.f29293a = localThemeScope;
            this.f29294b = o12;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2090975756, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.passiveScopeV2.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:290)");
            }
            Si.b.b(this.f29293a, null, this.f29294b.c("Passive Circle Large"), "2.0", null, ComposableLambdaKt.c(-1326581241, true, new a(this.f29294b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29296a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O1 f29297b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O1 f29298a;

            a(O1 o12) {
                this.f29298a = o12;
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
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.e(), P0.e.INSTANCE.l(), composer, 6);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14889J c14889j = C14889J.f139620a;
                C15191r c15191r = C15191r.f142443a;
                composer.startReplaceGroup(1355200366);
                Ki.K.b(null, ComposableLambdaKt.c(-2035438339, true, new M1(c15191r, 54, "99"), composer, 54), composer, 48, 1);
                composer.P();
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

        h(LocalThemeScope localThemeScope, O1 o12) {
            this.f29296a = localThemeScope;
            this.f29297b = o12;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(868617811, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.passiveScopeV2.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:305)");
            }
            Si.b.b(this.f29296a, null, this.f29297b.c("Passive Circle Small"), "2.0", null, ComposableLambdaKt.c(1633012326, true, new a(this.f29297b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29299a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O1 f29300b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O1 f29301a;

            a(O1 o12) {
                this.f29301a = o12;
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
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.e(), P0.e.INSTANCE.l(), composer, 6);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14889J c14889j = C14889J.f139620a;
                InterfaceC15205y.a.d dVar = InterfaceC15205y.a.d.f142547a;
                composer.startReplaceGroup(-702508151);
                Ki.K.b(null, ComposableLambdaKt.c(2115665818, true, new N1(dVar, 54, "Primary"), composer, 54), composer, 48, 1);
                composer.P();
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

        i(LocalThemeScope localThemeScope, O1 o12) {
            this.f29299a = localThemeScope;
            this.f29300b = o12;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1972686265, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.primaryScopeV2.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:50)");
            }
            Si.b.b(this.f29299a, null, this.f29300b.c("Primary Rectangle Large"), "2.0", null, ComposableLambdaKt.c(986765082, true, new a(this.f29300b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class j implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29302a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O1 f29303b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O1 f29304a;

            a(O1 o12) {
                this.f29304a = o12;
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
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.e(), P0.e.INSTANCE.l(), composer, 6);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14889J c14889j = C14889J.f139620a;
                C15133B c15133b = C15133B.f141857a;
                composer.startReplaceGroup(-702508151);
                Ki.K.b(null, ComposableLambdaKt.c(2115665818, true, new N1(c15133b, 54, "Primary"), composer, 54), composer, 48, 1);
                composer.P();
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

        j(LocalThemeScope localThemeScope, O1 o12) {
            this.f29302a = localThemeScope;
            this.f29303b = o12;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-884835408, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.primaryScopeV2.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:68)");
            }
            Si.b.b(this.f29302a, null, this.f29303b.c("Primary Rectangle Small"), "2.0", null, ComposableLambdaKt.c(-120440893, true, new a(this.f29303b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class k implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29305a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O1 f29306b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O1 f29307a;

            a(O1 o12) {
                this.f29307a = o12;
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
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.e(), P0.e.INSTANCE.l(), composer, 6);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14889J c14889j = C14889J.f139620a;
                C15185o c15185o = C15185o.f142170a;
                composer.startReplaceGroup(1355200366);
                Ki.K.b(null, ComposableLambdaKt.c(-2035438339, true, new M1(c15185o, 54, "99"), composer, 54), composer, 48, 1);
                composer.P();
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

        k(LocalThemeScope localThemeScope, O1 o12) {
            this.f29305a = localThemeScope;
            this.f29306b = o12;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2074758159, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.primaryScopeV2.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:86)");
            }
            Si.b.b(this.f29305a, null, this.f29306b.c("Primary Circle Large"), "2.0", null, ComposableLambdaKt.c(-1455814622, true, new a(this.f29306b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class l implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29308a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O1 f29309b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O1 f29310a;

            a(O1 o12) {
                this.f29310a = o12;
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
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.e(), P0.e.INSTANCE.l(), composer, 6);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14889J c14889j = C14889J.f139620a;
                C15193s c15193s = C15193s.f142447a;
                composer.startReplaceGroup(1355200366);
                Ki.K.b(null, ComposableLambdaKt.c(-2035438339, true, new M1(c15193s, 54, "99"), composer, 54), composer, 48, 1);
                composer.P();
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

        l(LocalThemeScope localThemeScope, O1 o12) {
            this.f29308a = localThemeScope;
            this.f29309b = o12;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(739384430, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.primaryScopeV2.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:101)");
            }
            Si.b.b(this.f29308a, null, this.f29309b.c("Primary Circle Small"), "2.0", null, ComposableLambdaKt.c(1503778945, true, new a(this.f29309b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class m implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29311a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O1 f29312b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O1 f29313a;

            a(O1 o12) {
                this.f29313a = o12;
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
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.e(), P0.e.INSTANCE.l(), composer, 6);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14889J c14889j = C14889J.f139620a;
                InterfaceC15205y.a.e eVar = InterfaceC15205y.a.e.f142549a;
                composer.startReplaceGroup(-702508151);
                Ki.K.b(null, ComposableLambdaKt.c(2115665818, true, new N1(eVar, 54, "Secondary"), composer, 54), composer, 48, 1);
                composer.P();
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

        m(LocalThemeScope localThemeScope, O1 o12) {
            this.f29311a = localThemeScope;
            this.f29312b = o12;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1576406215, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.secondaryScopeV2.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:118)");
            }
            Si.b.b(this.f29311a, null, this.f29312b.c("Secondary Rectangle Large"), "2.0", null, ComposableLambdaKt.c(-812011700, true, new a(this.f29312b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class n implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29314a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O1 f29315b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O1 f29316a;

            a(O1 o12) {
                this.f29316a = o12;
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
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.e(), P0.e.INSTANCE.l(), composer, 6);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14889J c14889j = C14889J.f139620a;
                C15134C c15134c = C15134C.f141860a;
                composer.startReplaceGroup(-702508151);
                Ki.K.b(null, ComposableLambdaKt.c(2115665818, true, new N1(c15134c, 54, "Secondary"), composer, 54), composer, 48, 1);
                composer.P();
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

        n(LocalThemeScope localThemeScope, O1 o12) {
            this.f29314a = localThemeScope;
            this.f29315b = o12;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(171214434, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.secondaryScopeV2.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:136)");
            }
            Si.b.b(this.f29314a, null, this.f29315b.c("Secondary Rectangle Small"), "2.0", null, ComposableLambdaKt.c(314935733, true, new a(this.f29315b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class o implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29317a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O1 f29318b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O1 f29319a;

            a(O1 o12) {
                this.f29319a = o12;
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
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.e(), P0.e.INSTANCE.l(), composer, 6);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14889J c14889j = C14889J.f139620a;
                C15187p c15187p = C15187p.f142174a;
                composer.startReplaceGroup(1355200366);
                Ki.K.b(null, ComposableLambdaKt.c(-2035438339, true, new M1(c15187p, 54, "99"), composer, 54), composer, 48, 1);
                composer.P();
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

        o(LocalThemeScope localThemeScope, O1 o12) {
            this.f29317a = localThemeScope;
            this.f29318b = o12;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1072282369, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.secondaryScopeV2.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:154)");
            }
            Si.b.b(this.f29317a, null, this.f29318b.c("Secondary Circle Large"), "2.0", null, ComposableLambdaKt.c(1216003668, true, new a(this.f29318b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class p implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29320a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O1 f29321b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O1 f29322a;

            a(O1 o12) {
                this.f29322a = o12;
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
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.e(), P0.e.INSTANCE.l(), composer, 6);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14889J c14889j = C14889J.f139620a;
                C15195t c15195t = C15195t.f142484a;
                composer.startReplaceGroup(1355200366);
                Ki.K.b(null, ComposableLambdaKt.c(-2035438339, true, new M1(c15195t, 54, "99"), composer, 54), composer, 48, 1);
                composer.P();
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

        p(LocalThemeScope localThemeScope, O1 o12) {
            this.f29320a = localThemeScope;
            this.f29321b = o12;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1973350304, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.secondaryScopeV2.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:169)");
            }
            Si.b.b(this.f29320a, null, this.f29321b.c("Secondary Circle Small"), "2.0", null, ComposableLambdaKt.c(2117071603, true, new a(this.f29321b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
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
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(O1 o12, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        o12.f(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(O1 o12, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        o12.b(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
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

    @Override // Oi.c
    public void b(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
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
            t0L.a(new Function2() { // from class: Qi.J1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return O1.l(this.f29021a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Oi.c
    public void f(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
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
                objB = new Function1() { // from class: Qi.K1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return O1.j(this.f29047a, localThemeScope, (l0.w) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            C15432b.a(null, null, null, false, null, null, null, false, null, (Function1) objB, composerStartRestartGroup, 0, 511);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.L1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return O1.k(this.f29072a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Oi.c
    public String getName() {
        return "Buttons (Deprecated)";
    }

    @Override // Oi.c
    /* renamed from: m, reason: from getter */
    public l.ButtonState getState() {
        return this.state;
    }
}
