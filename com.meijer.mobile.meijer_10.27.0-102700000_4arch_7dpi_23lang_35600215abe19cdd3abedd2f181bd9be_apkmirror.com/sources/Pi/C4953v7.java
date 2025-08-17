package Pi;

import Ji.LocalThemeScope;
import Ni.l;
import P0.e;
import Pi.C4953v7;
import V0.C5346q0;
import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import d0.C13439f;
import d0.C13442i;
import j0.C14801J;
import j0.C14815g;
import j0.InterfaceC14800I;
import kotlin.C17983x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import m0.C15521g;
import m0.InterfaceC15506C;
import m0.InterfaceC15516b;
import m0.InterfaceC15528n;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LPi/v7;", "LNi/c;", "LNi/l$s;", "state", "<init>", "(LNi/l$s;)V", "LJi/M;", "", "a", "(LJi/M;Landroidx/compose/runtime/Composer;I)V", "f", "LNi/l$s;", "m", "()LNi/l$s;", "", "getName", "()Ljava/lang/String;", "name", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Pi.v7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4953v7 implements Ni.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.ProgressTrackerState state;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Pi.v7$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f27917b;

        a(LocalThemeScope localThemeScope) {
            this.f27917b = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(147058190, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressTrackerShowcase.Content.<anonymous> (ProgressTracker.kt:44)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierG = d0.T.g(companion, d0.T.c(0, composer, 0, 1), false, null, false, 14, null);
            C4953v7 c4953v7 = C4953v7.this;
            LocalThemeScope localThemeScope = this.f27917b;
            C5658d c5658d = C5658d.f48555a;
            C5658d.m mVarH = c5658d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion2.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierG);
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
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
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion3.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            Modifier modifierF = C13439f.f(companion, C13442i.a(H1.h.p(1), C5346q0.INSTANCE.f()), null, 2, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierF);
            Function0<InterfaceC5811g> function0A2 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA2, measurePolicyB, companion3.e());
            androidx.compose.runtime.D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
            C14801J c14801j = C14801J.f139030a;
            Ei.k.k(localThemeScope, c4953v7.getState().d(), c4953v7.getState().g().getValue(), null, c4953v7.getState().e().getValue().booleanValue(), c4953v7.getState().c().getValue().booleanValue(), c4953v7.getState().h().getValue().booleanValue(), c4953v7.getState().b().getValue().booleanValue(), 0, 0, c4953v7.getState().f().getValue(), composer, 0, 0, 388);
            composer.v();
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
    @SourceDebugExtension
    /* renamed from: Pi.v7$b */
    static final class b implements Function3<InterfaceC15528n, Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pi.v7$b$a */
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4953v7 f27919a;

            a(C4953v7 c4953v7) {
                this.f27919a = c4953v7;
            }

            public final void a(InterfaceC14800I Button, Composer composer, int i10) {
                Intrinsics.j(Button, "$this$Button");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(144410895, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressTrackerShowcase.Controls.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProgressTracker.kt:194)");
                }
                if (this.f27919a.getState().b().getValue().booleanValue()) {
                    composer.startReplaceGroup(-1412199396);
                    kotlin.N1.b("Toggle 'All Steps Complete' OFF", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
                    composer.P();
                } else {
                    composer.startReplaceGroup(-1412107171);
                    kotlin.N1.b("Toggle 'All Steps Complete' ON", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
                    composer.P();
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        public final void b(InterfaceC15528n item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1640860929, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressTrackerShowcase.Controls.<anonymous>.<anonymous>.<anonymous> (ProgressTracker.kt:193)");
            }
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(C4953v7.this);
            final C4953v7 c4953v7 = C4953v7.this;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Pi.x7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4953v7.b.c(c4953v7);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17983x.a((Function0) objB, null, false, null, null, null, null, null, null, ComposableLambdaKt.c(144410895, true, new a(C4953v7.this), composer, 54), composer, 805306368, 510);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        b() {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15528n interfaceC15528n, Composer composer, Integer num) {
            b(interfaceC15528n, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(C4953v7 c4953v7) {
            c4953v7.getState().b().setValue(Boolean.valueOf(!c4953v7.getState().b().getValue().booleanValue()));
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Pi.v7$c */
    static final class c implements Function3<InterfaceC15528n, Composer, Integer, Unit> {
        public final void b(InterfaceC15528n item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1901641118, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressTrackerShowcase.Controls.<anonymous>.<anonymous>.<anonymous> (ProgressTracker.kt:71)");
            }
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(C4953v7.this);
            final C4953v7 c4953v7 = C4953v7.this;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Pi.w7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4953v7.c.c(c4953v7);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17983x.a((Function0) objB, null, false, null, null, null, null, null, null, C5.f25697a.f(), composer, 805306368, 510);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        c() {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15528n interfaceC15528n, Composer composer, Integer num) {
            b(interfaceC15528n, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(C4953v7 c4953v7) {
            int iIntValue;
            Integer value = c4953v7.getState().g().getValue();
            if (value != null && (iIntValue = value.intValue()) > 0) {
                c4953v7.getState().g().setValue(Integer.valueOf(iIntValue - 1));
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Pi.v7$d */
    static final class d implements Function3<InterfaceC15528n, Composer, Integer, Unit> {
        public final void b(InterfaceC15528n item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1934712313, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressTrackerShowcase.Controls.<anonymous>.<anonymous>.<anonymous> (ProgressTracker.kt:83)");
            }
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(C4953v7.this);
            final C4953v7 c4953v7 = C4953v7.this;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Pi.y7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4953v7.d.c(c4953v7);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17983x.a((Function0) objB, null, false, null, null, null, null, null, null, C5.f25697a.b(), composer, 805306368, 510);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        d() {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15528n interfaceC15528n, Composer composer, Integer num) {
            b(interfaceC15528n, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(C4953v7 c4953v7) {
            int iIntValue;
            Integer value = c4953v7.getState().g().getValue();
            if (value != null && (iIntValue = value.intValue()) < c4953v7.getState().d().size()) {
                c4953v7.getState().g().setValue(Integer.valueOf(iIntValue + 1));
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Pi.v7$e */
    static final class e implements Function3<InterfaceC15528n, Composer, Integer, Unit> {
        public final void b(InterfaceC15528n item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1323244582, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressTrackerShowcase.Controls.<anonymous>.<anonymous>.<anonymous> (ProgressTracker.kt:97)");
            }
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(C4953v7.this);
            final C4953v7 c4953v7 = C4953v7.this;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Pi.z7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4953v7.e.c(c4953v7);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17983x.a((Function0) objB, null, false, null, null, null, null, null, null, C5.f25697a.a(), composer, 805306368, 510);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        e() {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15528n interfaceC15528n, Composer composer, Integer num) {
            b(interfaceC15528n, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(C4953v7 c4953v7) {
            Integer value;
            if (c4953v7.getState().d().size() > 2 && (value = c4953v7.getState().g().getValue()) != null) {
                int iIntValue = value.intValue();
                if (iIntValue >= c4953v7.getState().d().size() - 1) {
                    c4953v7.getState().g().setValue(Integer.valueOf(RangesKt.o(iIntValue - 1, 0, c4953v7.getState().d().size() - 1)));
                } else if (iIntValue < c4953v7.getState().d().size() - 1) {
                    c4953v7.getState().g().setValue(Integer.valueOf(RangesKt.o(iIntValue, 0, c4953v7.getState().d().size() - 1)));
                }
                CollectionsKt.N(c4953v7.getState().d());
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Pi.v7$f */
    static final class f implements Function3<InterfaceC15528n, Composer, Integer, Unit> {
        public final void b(InterfaceC15528n item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(286234181, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressTrackerShowcase.Controls.<anonymous>.<anonymous>.<anonymous> (ProgressTracker.kt:118)");
            }
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(C4953v7.this);
            final C4953v7 c4953v7 = C4953v7.this;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Pi.A7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4953v7.f.c(c4953v7);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17983x.a((Function0) objB, null, false, null, null, null, null, null, null, C5.f25697a.e(), composer, 805306368, 510);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        f() {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15528n interfaceC15528n, Composer composer, Integer num) {
            b(interfaceC15528n, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(C4953v7 c4953v7) {
            c4953v7.getState().d().add("This is a long text to show that the text can wrap to the next line and maintain a responsive design");
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Pi.v7$g */
    static final class g implements Function3<InterfaceC15528n, Composer, Integer, Unit> {
        public final void b(InterfaceC15528n item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-750776220, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressTrackerShowcase.Controls.<anonymous>.<anonymous>.<anonymous> (ProgressTracker.kt:128)");
            }
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(C4953v7.this);
            final C4953v7 c4953v7 = C4953v7.this;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Pi.B7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4953v7.g.c(c4953v7);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17983x.a((Function0) objB, null, false, null, null, null, null, null, null, C5.f25697a.d(), composer, 805306368, 510);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        g() {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15528n interfaceC15528n, Composer composer, Integer num) {
            b(interfaceC15528n, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(C4953v7 c4953v7) {
            c4953v7.getState().c().setValue(Boolean.valueOf(!c4953v7.getState().c().getValue().booleanValue()));
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Pi.v7$h */
    static final class h implements Function3<InterfaceC15528n, Composer, Integer, Unit> {
        public final void b(InterfaceC15528n item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1787786621, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressTrackerShowcase.Controls.<anonymous>.<anonymous>.<anonymous> (ProgressTracker.kt:138)");
            }
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(C4953v7.this);
            final C4953v7 c4953v7 = C4953v7.this;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Pi.C7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4953v7.h.c(c4953v7);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17983x.a((Function0) objB, null, false, null, null, null, null, null, null, C5.f25697a.c(), composer, 805306368, 510);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        h() {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15528n interfaceC15528n, Composer composer, Integer num) {
            b(interfaceC15528n, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(C4953v7 c4953v7) {
            c4953v7.getState().h().setValue(Boolean.valueOf(!c4953v7.getState().h().getValue().booleanValue()));
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Pi.v7$i */
    static final class i implements Function3<InterfaceC15528n, Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pi.v7$i$a */
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4953v7 f27927a;

            a(C4953v7 c4953v7) {
                this.f27927a = c4953v7;
            }

            public final void a(InterfaceC14800I Button, Composer composer, int i10) {
                Intrinsics.j(Button, "$this$Button");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1039525198, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressTrackerShowcase.Controls.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProgressTracker.kt:153)");
                }
                if (this.f27927a.getState().e().getValue().booleanValue()) {
                    composer.startReplaceGroup(1743667720);
                    kotlin.N1.b("Remove Numbers", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
                    composer.P();
                } else {
                    composer.startReplaceGroup(1743666277);
                    kotlin.N1.b("Add Numbers", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
                    composer.P();
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        public final void b(InterfaceC15528n item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1470170274, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressTrackerShowcase.Controls.<anonymous>.<anonymous>.<anonymous> (ProgressTracker.kt:148)");
            }
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(C4953v7.this);
            final C4953v7 c4953v7 = C4953v7.this;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Pi.D7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4953v7.i.c(c4953v7);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17983x.a((Function0) objB, null, false, null, null, null, null, null, null, ComposableLambdaKt.c(-1039525198, true, new a(C4953v7.this), composer, 54), composer, 805306368, 510);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        i() {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15528n interfaceC15528n, Composer composer, Integer num) {
            b(interfaceC15528n, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(C4953v7 c4953v7) {
            c4953v7.getState().e().setValue(Boolean.valueOf(!c4953v7.getState().e().getValue().booleanValue()));
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Pi.v7$j */
    static final class j implements Function3<InterfaceC15528n, Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pi.v7$j$a */
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4953v7 f27929a;

            a(C4953v7 c4953v7) {
                this.f27929a = c4953v7;
            }

            public final void a(InterfaceC14800I Button, Composer composer, int i10) {
                Intrinsics.j(Button, "$this$Button");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-2076535599, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressTrackerShowcase.Controls.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProgressTracker.kt:168)");
                }
                if (this.f27929a.getState().f().getValue() == null) {
                    composer.startReplaceGroup(-1658002775);
                    kotlin.N1.b("Show Back button", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
                    composer.P();
                } else {
                    composer.startReplaceGroup(-1657925399);
                    kotlin.N1.b("Hide Back button", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
                    composer.P();
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        public final void c(InterfaceC15528n item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(433159873, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressTrackerShowcase.Controls.<anonymous>.<anonymous>.<anonymous> (ProgressTracker.kt:159)");
            }
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(C4953v7.this);
            final C4953v7 c4953v7 = C4953v7.this;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Pi.E7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4953v7.j.d(c4953v7);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17983x.a((Function0) objB, null, false, null, null, null, null, null, null, ComposableLambdaKt.c(-2076535599, true, new a(C4953v7.this), composer, 54), composer, 805306368, 510);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e() {
            return Unit.f142422a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15528n interfaceC15528n, Composer composer, Integer num) {
            c(interfaceC15528n, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(C4953v7 c4953v7) {
            if (c4953v7.getState().f().getValue() == null) {
                c4953v7.getState().f().setValue(new Function0() { // from class: Pi.F7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4953v7.j.e();
                    }
                });
            } else {
                c4953v7.getState().f().setValue(null);
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Pi.v7$k */
    static final class k implements Function3<InterfaceC15528n, Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pi.v7$k$a */
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4953v7 f27931a;

            a(C4953v7 c4953v7) {
                this.f27931a = c4953v7;
            }

            public final void a(InterfaceC14800I Button, Composer composer, int i10) {
                Intrinsics.j(Button, "$this$Button");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1181421296, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressTrackerShowcase.Controls.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProgressTracker.kt:187)");
                }
                if (this.f27931a.getState().g().getValue() != null) {
                    composer.startReplaceGroup(1474501256);
                    kotlin.N1.b("Remove selection", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
                    composer.P();
                } else {
                    composer.startReplaceGroup(1474502856);
                    kotlin.N1.b("Enable selection", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
                    composer.P();
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        public final void b(InterfaceC15528n item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-603850528, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressTrackerShowcase.Controls.<anonymous>.<anonymous>.<anonymous> (ProgressTracker.kt:177)");
            }
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(C4953v7.this);
            final C4953v7 c4953v7 = C4953v7.this;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Pi.G7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4953v7.k.c(c4953v7);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17983x.a((Function0) objB, null, false, null, null, null, null, null, null, ComposableLambdaKt.c(1181421296, true, new a(C4953v7.this), composer, 54), composer, 805306368, 510);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        k() {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15528n interfaceC15528n, Composer composer, Integer num) {
            b(interfaceC15528n, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(C4953v7 c4953v7) {
            if (c4953v7.getState().g().getValue() == null) {
                c4953v7.getState().g().setValue(0);
            } else {
                c4953v7.getState().g().setValue(null);
            }
            return Unit.f142422a;
        }
    }

    public C4953v7(l.ProgressTrackerState state) {
        Intrinsics.j(state, "state");
        this.state = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(C4953v7 c4953v7, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c4953v7.a(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(C4953v7 c4953v7, InterfaceC15506C LazyVerticalGrid) {
        Intrinsics.j(LazyVerticalGrid, "$this$LazyVerticalGrid");
        InterfaceC15506C.f(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(1901641118, true, c4953v7.new c()), 7, null);
        InterfaceC15506C.f(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1934712313, true, c4953v7.new d()), 7, null);
        InterfaceC15506C.f(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(1323244582, true, c4953v7.new e()), 7, null);
        InterfaceC15506C.f(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(286234181, true, c4953v7.new f()), 7, null);
        InterfaceC15506C.f(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(-750776220, true, c4953v7.new g()), 7, null);
        InterfaceC15506C.f(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1787786621, true, c4953v7.new h()), 7, null);
        InterfaceC15506C.f(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(1470170274, true, c4953v7.new i()), 7, null);
        InterfaceC15506C.f(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(433159873, true, c4953v7.new j()), 7, null);
        InterfaceC15506C.f(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(-603850528, true, c4953v7.new k()), 7, null);
        InterfaceC15506C.f(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1640860929, true, c4953v7.new b()), 7, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(C4953v7 c4953v7, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c4953v7.f(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    @Override // Ni.c
    public void a(LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        final LocalThemeScope localThemeScope2;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(1587451451);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(this) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            localThemeScope2 = localThemeScope;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1587451451, i11, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressTrackerShowcase.Content (ProgressTracker.kt:37)");
            }
            localThemeScope2 = localThemeScope;
            Ri.b.b(localThemeScope2, null, d("Horizontal"), "1.0", "First label is locked as 'Test'.", ComposableLambdaKt.c(147058190, true, new a(localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | 224256, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Pi.u7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4953v7.j(this.f27879a, localThemeScope2, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
    @SuppressLint({"AlwaysProvideAModifier"})
    public void f(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(172074194);
        if ((i10 & 48) == 0) {
            i11 = (composerStartRestartGroup.D(this) ? 32 : 16) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 17) == 16 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(172074194, i11, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressTrackerShowcase.Controls (ProgressTracker.kt:66)");
            }
            InterfaceC15516b.a aVar = new InterfaceC15516b.a(2);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zD = composerStartRestartGroup.D(this);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Pi.s7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4953v7.k(this.f27838a, (InterfaceC15506C) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            C15521g.a(aVar, null, null, null, false, null, null, null, false, null, (Function1) objB, composerStartRestartGroup, 0, 0, 1022);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Pi.t7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4953v7.l(this.f27857a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
    public String getName() {
        return "Progress Tracker";
    }

    @Override // Ni.c
    /* renamed from: m, reason: from getter */
    public l.ProgressTrackerState getState() {
        return this.state;
    }
}
