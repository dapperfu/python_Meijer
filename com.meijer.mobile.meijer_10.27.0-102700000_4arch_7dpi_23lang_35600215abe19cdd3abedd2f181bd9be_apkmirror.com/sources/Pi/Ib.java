package Pi;

import Ji.LocalThemeScope;
import Ni.l;
import android.annotation.SuppressLint;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import j0.C14808Q;
import j0.InterfaceC14794C;
import j0.InterfaceC14806O;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15342b;
import l0.InterfaceC15343c;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LPi/Ib;", "LNi/c;", "LNi/l$B;", "state", "<init>", "(LNi/l$B;)V", "LJi/M;", "", "a", "(LJi/M;Landroidx/compose/runtime/Composer;I)V", "f", "LNi/l$B;", "m", "()LNi/l$B;", "", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class Ib implements Ni.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.B state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26290a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ib f26291b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pi.Ib$a$a, reason: collision with other inner class name */
        static final class C0500a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f26292a;

            C0500a(LocalThemeScope localThemeScope) {
                this.f26292a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1842287288, i10, -1, "com.meijer.mobile.androidacres.showcase.components.TextInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TextInputShowcase.kt:37)");
                }
                zi.K.t0(this.f26292a, null, composer, 0, 1);
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

        a(LocalThemeScope localThemeScope, Ib ib2) {
            this.f26290a = localThemeScope;
            this.f26291b = ib2;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1769724619, i10, -1, "com.meijer.mobile.androidacres.showcase.components.TextInputShowcase.Content.<anonymous>.<anonymous>.<anonymous> (TextInputShowcase.kt:33)");
            }
            Ri.b.b(this.f26290a, null, this.f26291b.d("Plain"), "1.2", null, ComposableLambdaKt.c(-1842287288, true, new C0500a(this.f26290a), composer, 54), composer, 199680, 9);
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
        final /* synthetic */ LocalThemeScope f26293a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ib f26294b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f26295a;

            a(LocalThemeScope localThemeScope) {
                this.f26295a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1985522609, i10, -1, "com.meijer.mobile.androidacres.showcase.components.TextInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TextInputShowcase.kt:46)");
                }
                zi.K.m0(this.f26295a, null, composer, 0, 1);
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

        b(LocalThemeScope localThemeScope, Ib ib2) {
            this.f26293a = localThemeScope;
            this.f26294b = ib2;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1296196514, i10, -1, "com.meijer.mobile.androidacres.showcase.components.TextInputShowcase.Content.<anonymous>.<anonymous>.<anonymous> (TextInputShowcase.kt:42)");
            }
            Ri.b.b(this.f26293a, null, this.f26294b.d("Interactive Plain"), "1.2", null, ComposableLambdaKt.c(1985522609, true, new a(this.f26293a), composer, 54), composer, 199680, 9);
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

    public Ib(l.B state) {
        Intrinsics.j(state, "state");
        this.state = state;
        this.name = "Text Input";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, Ib ib2, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1769724619, true, new a(localThemeScope, ib2)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1296196514, true, new b(localThemeScope, ib2)), 3, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(Ib ib2, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        ib2.a(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(Ib ib2, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        ib2.f(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    @Override // Ni.c
    @SuppressLint({"AlwaysProvideAModifier"})
    public void a(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1766552598);
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
                ComposerKt.U(-1766552598, i11, -1, "com.meijer.mobile.androidacres.showcase.components.TextInputShowcase.Content (TextInputShowcase.kt:28)");
            }
            InterfaceC14794C interfaceC14794CE = C14808Q.e(C14808Q.g(j0.W.b(InterfaceC14806O.INSTANCE, composerStartRestartGroup, 6), j0.U.INSTANCE.e()), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z10 = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(localThemeScope))) | ((i11 & 112) == 32);
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Pi.Fb
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Ib.j(localThemeScope, this, (l0.w) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            C15342b.a(null, null, interfaceC14794CE, false, null, null, null, false, null, (Function1) objB, composerStartRestartGroup, 0, 507);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Pi.Gb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Ib.k(this.f25832a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
    public void f(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(442269185);
        if ((i10 & 1) == 0 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(442269185, i10, -1, "com.meijer.mobile.androidacres.showcase.components.TextInputShowcase.Controls (TextInputShowcase.kt:53)");
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Pi.Hb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Ib.l(this.f25976a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
    public String getName() {
        return this.name;
    }

    @Override // Ni.c
    /* renamed from: m, reason: from getter */
    public l.B getState() {
        return this.state;
    }
}
