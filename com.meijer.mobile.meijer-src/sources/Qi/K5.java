package Qi;

import Bi.C2962v;
import Ki.LocalThemeScope;
import Oi.l;
import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5866i0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import j0.C14896Q;
import j0.C14903g;
import j0.InterfaceC14882C;
import j0.InterfaceC14894O;
import ki.q1;
import kotlin.C18014j1;
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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e²\u0006\f\u0010\u001d\u001a\u00020\u001c8\nX\u008a\u0084\u0002"}, d2 = {"LQi/K5;", "LOi/c;", "LOi/l$q;", "state", "<init>", "(LOi/l$q;)V", "LKi/M;", "", "f", "(LKi/M;Landroidx/compose/runtime/Composer;I)V", "b", "a", "LOi/l$q;", "s", "()LOi/l$q;", "", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "Landroidx/compose/runtime/i0;", "c", "Landroidx/compose/runtime/i0;", "getWidthScale", "()Landroidx/compose/runtime/i0;", "setWidthScale", "(Landroidx/compose/runtime/i0;)V", "widthScale", "Landroidx/compose/ui/Modifier;", "modifier", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class K5 implements Oi.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.q state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5866i0 widthScale;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29055a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K5 f29056b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.z1<Modifier> f29057c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qi.K5$a$a, reason: collision with other inner class name */
        static final class C0565a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29058a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.z1<Modifier> f29059b;

            /* JADX WARN: Multi-variable type inference failed */
            C0565a(LocalThemeScope localThemeScope, androidx.compose.runtime.z1<? extends Modifier> z1Var) {
                this.f29058a = localThemeScope;
                this.f29059b = z1Var;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1367778234, i10, -1, "com.meijer.mobile.androidacres.showcase.components.DropdownShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DropdownShowcase.kt:62)");
                }
                C2962v.q0(this.f29058a, null, K5.m(this.f29059b), composer, 0, 1);
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

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, K5 k52, androidx.compose.runtime.z1<? extends Modifier> z1Var) {
            this.f29055a = localThemeScope;
            this.f29056b = k52;
            this.f29057c = z1Var;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1948494707, i10, -1, "com.meijer.mobile.androidacres.showcase.components.DropdownShowcase.Content.<anonymous>.<anonymous>.<anonymous> (DropdownShowcase.kt:58)");
            }
            Si.b.b(this.f29055a, null, this.f29056b.c("Examples"), "1.2", null, ComposableLambdaKt.c(-1367778234, true, new C0565a(this.f29055a, this.f29057c), composer, 54), composer, 199680, 9);
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

    public K5(l.q state) {
        Intrinsics.j(state, "state");
        this.state = state;
        this.name = "Dropdown";
        this.widthScale = androidx.compose.runtime.A0.a(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier l(K5 k52) {
        return androidx.compose.foundation.layout.J.g(Modifier.INSTANCE, k52.widthScale.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, K5 k52, androidx.compose.runtime.z1 z1Var, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1948494707, true, new a(localThemeScope, k52, z1Var)), 3, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(K5 k52, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        k52.f(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(K5 k52, float f10) {
        k52.widthScale.A(f10);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(K5 k52, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        k52.b(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    @Override // Oi.c
    @SuppressLint({"AlwaysProvideAModifier"})
    public void b(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(328451903);
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
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(328451903, i11, -1, "com.meijer.mobile.androidacres.showcase.components.DropdownShowcase.Controls (DropdownShowcase.kt:70)");
            }
            Modifier modifierI = androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, localThemeScope.getAdsSpacing().getFive().getDp());
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composerStartRestartGroup, 0);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierI);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
            C14903g c14903g = C14903g.f139698a;
            si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 383, null), "Width Scale", null, composerStartRestartGroup, (i11 & 14) | 384, 4);
            float fB = this.widthScale.b();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zD = composerStartRestartGroup.D(this);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Qi.I5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K5.p(this.f28994a, ((Float) obj).floatValue());
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            C18014j1.b(fB, (Function1) objB, null, false, null, 0, null, null, null, composerStartRestartGroup, 0, 508);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.J5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return K5.q(this.f29027a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Oi.c
    @SuppressLint({"AlwaysProvideAModifier"})
    public void f(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-415745176);
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
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-415745176, i11, -1, "com.meijer.mobile.androidacres.showcase.components.DropdownShowcase.Content (DropdownShowcase.kt:51)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = androidx.compose.runtime.o1.e(new Function0() { // from class: Qi.F5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return K5.l(this.f28524a);
                    }
                });
                composerStartRestartGroup.t(objB);
            }
            final androidx.compose.runtime.z1 z1Var = (androidx.compose.runtime.z1) objB;
            composerStartRestartGroup.P();
            boolean z10 = false;
            InterfaceC14882C interfaceC14882CE = C14896Q.e(C14896Q.g(j0.W.b(InterfaceC14894O.INSTANCE, composerStartRestartGroup, 6), j0.U.INSTANCE.e()), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            if ((i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(localThemeScope))) {
                z10 = true;
            }
            boolean zD = composerStartRestartGroup.D(this) | z10;
            Object objB2 = composerStartRestartGroup.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new Function1() { // from class: Qi.G5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K5.n(localThemeScope, this, z1Var, (l0.w) obj);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            C15432b.a(null, null, interfaceC14882CE, false, null, null, null, false, null, (Function1) objB2, composerStartRestartGroup, 0, 507);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.H5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return K5.o(this.f28653a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Oi.c
    public String getName() {
        return this.name;
    }

    @Override // Oi.c
    /* renamed from: s, reason: from getter */
    public l.q getState() {
        return this.state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier m(androidx.compose.runtime.z1<? extends Modifier> z1Var) {
        return z1Var.getValue();
    }
}
