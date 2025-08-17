package Pi;

import Ai.C2857v;
import Ji.LocalThemeScope;
import Ni.l;
import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5724i0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import j0.C14808Q;
import j0.C14815g;
import j0.InterfaceC14794C;
import j0.InterfaceC14806O;
import ji.q1;
import kotlin.C17948j1;
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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e²\u0006\f\u0010\u001d\u001a\u00020\u001c8\nX\u008a\u0084\u0002"}, d2 = {"LPi/K5;", "LNi/c;", "LNi/l$q;", "state", "<init>", "(LNi/l$q;)V", "LJi/M;", "", "a", "(LJi/M;Landroidx/compose/runtime/Composer;I)V", "f", "LNi/l$q;", "s", "()LNi/l$q;", "", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "Landroidx/compose/runtime/i0;", "c", "Landroidx/compose/runtime/i0;", "getWidthScale", "()Landroidx/compose/runtime/i0;", "setWidthScale", "(Landroidx/compose/runtime/i0;)V", "widthScale", "Landroidx/compose/ui/Modifier;", "modifier", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class K5 implements Ni.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.q state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5724i0 widthScale;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26343a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K5 f26344b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.z1<Modifier> f26345c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pi.K5$a$a, reason: collision with other inner class name */
        static final class C0501a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f26346a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.z1<Modifier> f26347b;

            /* JADX WARN: Multi-variable type inference failed */
            C0501a(LocalThemeScope localThemeScope, androidx.compose.runtime.z1<? extends Modifier> z1Var) {
                this.f26346a = localThemeScope;
                this.f26347b = z1Var;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1367778234, i10, -1, "com.meijer.mobile.androidacres.showcase.components.DropdownShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DropdownShowcase.kt:62)");
                }
                C2857v.q0(this.f26346a, null, K5.m(this.f26347b), composer, 0, 1);
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

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, K5 k52, androidx.compose.runtime.z1<? extends Modifier> z1Var) {
            this.f26343a = localThemeScope;
            this.f26344b = k52;
            this.f26345c = z1Var;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1948494707, i10, -1, "com.meijer.mobile.androidacres.showcase.components.DropdownShowcase.Content.<anonymous>.<anonymous>.<anonymous> (DropdownShowcase.kt:58)");
            }
            Ri.b.b(this.f26343a, null, this.f26344b.d("Examples"), "1.2", null, ComposableLambdaKt.c(-1367778234, true, new C0501a(this.f26343a, this.f26345c), composer, 54), composer, 199680, 9);
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
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(K5 k52, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        k52.a(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(K5 k52, float f10) {
        k52.widthScale.B(f10);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(K5 k52, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        k52.f(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    @Override // Ni.c
    @SuppressLint({"AlwaysProvideAModifier"})
    public void a(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
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
                objB = androidx.compose.runtime.o1.e(new Function0() { // from class: Pi.F5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return K5.l(this.f25812a);
                    }
                });
                composerStartRestartGroup.t(objB);
            }
            final androidx.compose.runtime.z1 z1Var = (androidx.compose.runtime.z1) objB;
            composerStartRestartGroup.P();
            boolean z10 = false;
            InterfaceC14794C interfaceC14794CE = C14808Q.e(C14808Q.g(j0.W.b(InterfaceC14806O.INSTANCE, composerStartRestartGroup, 6), j0.U.INSTANCE.e()), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            if ((i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(localThemeScope))) {
                z10 = true;
            }
            boolean zD = composerStartRestartGroup.D(this) | z10;
            Object objB2 = composerStartRestartGroup.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new Function1() { // from class: Pi.G5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K5.n(localThemeScope, this, z1Var, (l0.w) obj);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            C15342b.a(null, null, interfaceC14794CE, false, null, null, null, false, null, (Function1) objB2, composerStartRestartGroup, 0, 507);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Pi.H5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return K5.o(this.f25941a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
    @SuppressLint({"AlwaysProvideAModifier"})
    public void f(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
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
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composerStartRestartGroup, 0);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierI);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
            C14815g c14815g = C14815g.f139108a;
            ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 383, null), "Width Scale", null, composerStartRestartGroup, (i11 & 14) | 384, 4);
            float fB = this.widthScale.b();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zD = composerStartRestartGroup.D(this);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Pi.I5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K5.p(this.f26282a, ((Float) obj).floatValue());
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            C17948j1.b(fB, (Function1) objB, null, false, null, 0, null, null, null, composerStartRestartGroup, 0, 508);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Pi.J5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return K5.q(this.f26315a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
    public String getName() {
        return this.name;
    }

    @Override // Ni.c
    /* renamed from: s, reason: from getter */
    public l.q getState() {
        return this.state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier m(androidx.compose.runtime.z1<? extends Modifier> z1Var) {
        return z1Var.getValue();
    }
}
