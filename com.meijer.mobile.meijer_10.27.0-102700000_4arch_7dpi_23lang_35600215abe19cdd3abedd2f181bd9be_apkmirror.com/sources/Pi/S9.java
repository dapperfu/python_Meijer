package Pi;

import Ji.LocalThemeScope;
import Ni.l;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LPi/S9;", "LNi/c;", "LNi/l$v;", "state", "<init>", "(LNi/l$v;)V", "LJi/M;", "", "a", "(LJi/M;Landroidx/compose/runtime/Composer;I)V", "LNi/l$v;", "k", "()LNi/l$v;", "", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class S9 implements Ni.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.SearchState state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26987a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ S9 f26988b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pi.S9$a$a, reason: collision with other inner class name */
        static final class C0512a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f26989a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ S9 f26990b;

            C0512a(LocalThemeScope localThemeScope, S9 s92) {
                this.f26989a = localThemeScope;
                this.f26990b = s92;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1497065882, i10, -1, "com.meijer.mobile.androidacres.showcase.components.SearchShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchShowcase.kt:57)");
                }
                C4904ra.c(this.f26989a, this.f26990b.getState(), composer, 0);
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

        a(LocalThemeScope localThemeScope, S9 s92) {
            this.f26987a = localThemeScope;
            this.f26988b = s92;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-668498925, i10, -1, "com.meijer.mobile.androidacres.showcase.components.SearchShowcase.Content.<anonymous>.<anonymous>.<anonymous> (SearchShowcase.kt:53)");
            }
            Ri.b.b(this.f26987a, null, this.f26988b.d("Main"), "2.0", null, ComposableLambdaKt.c(-1497065882, true, new C0512a(this.f26987a, this.f26988b), composer, 54), composer, 199680, 9);
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
        final /* synthetic */ LocalThemeScope f26991a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ S9 f26992b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f26993a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ S9 f26994b;

            a(LocalThemeScope localThemeScope, S9 s92) {
                this.f26993a = localThemeScope;
                this.f26994b = s92;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(965842831, i10, -1, "com.meijer.mobile.androidacres.showcase.components.SearchShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchShowcase.kt:66)");
                }
                C4904ra.e(this.f26993a, this.f26994b.getState(), composer, 0);
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

        b(LocalThemeScope localThemeScope, S9 s92) {
            this.f26991a = localThemeScope;
            this.f26992b = s92;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1645228548, i10, -1, "com.meijer.mobile.androidacres.showcase.components.SearchShowcase.Content.<anonymous>.<anonymous>.<anonymous> (SearchShowcase.kt:62)");
            }
            Ri.b.b(this.f26991a, null, this.f26992b.d("Main"), "2.0", null, ComposableLambdaKt.c(965842831, true, new a(this.f26991a, this.f26992b), composer, 54), composer, 199680, 9);
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

    public S9(l.SearchState state) {
        Intrinsics.j(state, "state");
        this.state = state;
        this.name = "Search";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, S9 s92, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-668498925, true, new a(localThemeScope, s92)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1645228548, true, new b(localThemeScope, s92)), 3, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(S9 s92, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        s92.a(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    @Override // Ni.c
    public void a(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1014737272);
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
                ComposerKt.U(-1014737272, i11, -1, "com.meijer.mobile.androidacres.showcase.components.SearchShowcase.Content (SearchShowcase.kt:47)");
            }
            InterfaceC14794C interfaceC14794CE = C14808Q.e(C14808Q.g(j0.W.b(InterfaceC14806O.INSTANCE, composerStartRestartGroup, 6), j0.U.INSTANCE.e()), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z10 = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(localThemeScope))) | ((i11 & 112) == 32);
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Pi.Q9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return S9.i(localThemeScope, this, (l0.w) obj);
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
            t0L.a(new Function2() { // from class: Pi.R9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return S9.j(this.f26970a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
    public String getName() {
        return this.name;
    }

    @Override // Ni.c
    /* renamed from: k, reason: from getter */
    public l.SearchState getState() {
        return this.state;
    }
}
