package Qi;

import Ki.LocalThemeScope;
import Oi.l;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15432b;
import l0.InterfaceC15433c;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LQi/rb;", "LOi/c;", "LOi/l$y;", "state", "<init>", "(LOi/l$y;)V", "LKi/M;", "", "f", "(LKi/M;Landroidx/compose/runtime/Composer;I)V", "b", "a", "LOi/l$y;", "m", "()LOi/l$y;", "", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Qi.rb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4989rb implements Oi.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.y state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qi.rb$a */
    static final class a implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30535a;

        a(LocalThemeScope localThemeScope) {
            this.f30535a = localThemeScope;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2054647361, i10, -1, "com.meijer.mobile.androidacres.showcase.components.TabShowcaseAssembly.Content.<anonymous>.<anonymous>.<anonymous> (TabShowcase.kt:46)");
            }
            Si.b.b(this.f30535a, null, "Tab: Scrollable, Swipeable", "1.0", null, D5.f28444a.c(), composer, 200064, 9);
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
    /* renamed from: Qi.rb$b */
    static final class b implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30536a;

        b(LocalThemeScope localThemeScope) {
            this.f30536a = localThemeScope;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-93977240, i10, -1, "com.meijer.mobile.androidacres.showcase.components.TabShowcaseAssembly.Content.<anonymous>.<anonymous>.<anonymous> (TabShowcase.kt:54)");
            }
            Si.b.b(this.f30536a, null, "Tab: Scrollable, Non-Swipeable", "1.0", null, D5.f28444a.e(), composer, 200064, 9);
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
    /* renamed from: Qi.rb$c */
    static final class c implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30537a;

        c(LocalThemeScope localThemeScope) {
            this.f30537a = localThemeScope;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2016714119, i10, -1, "com.meijer.mobile.androidacres.showcase.components.TabShowcaseAssembly.Content.<anonymous>.<anonymous>.<anonymous> (TabShowcase.kt:62)");
            }
            Si.b.b(this.f30537a, null, "Tab: Non-Scrollable, Swipeable", "1.0", null, D5.f28444a.b(), composer, 200064, 9);
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
    /* renamed from: Qi.rb$d */
    static final class d implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30538a;

        d(LocalThemeScope localThemeScope) {
            this.f30538a = localThemeScope;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-167561818, i10, -1, "com.meijer.mobile.androidacres.showcase.components.TabShowcaseAssembly.Content.<anonymous>.<anonymous>.<anonymous> (TabShowcase.kt:70)");
            }
            Si.b.b(this.f30538a, null, "Tab: Non-Scrollable, Non-Swipeable", "1.0", null, D5.f28444a.d(), composer, 200064, 9);
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

    public C4989rb(l.y state) {
        Intrinsics.j(state, "state");
        this.state = state;
        this.name = "Tab";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-2054647361, true, new a(localThemeScope)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-93977240, true, new b(localThemeScope)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(2016714119, true, new c(localThemeScope)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-167561818, true, new d(localThemeScope)), 3, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(C4989rb c4989rb, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c4989rb.f(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(C4989rb c4989rb, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c4989rb.b(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    @Override // Oi.c
    public void b(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1180356469);
        if ((i10 & 1) == 0 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1180356469, i10, -1, "com.meijer.mobile.androidacres.showcase.components.TabShowcaseAssembly.Controls (TabShowcase.kt:81)");
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.ob
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4989rb.l(this.f30444a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Oi.c
    public void f(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(217750260);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(217750260, i11, -1, "com.meijer.mobile.androidacres.showcase.components.TabShowcaseAssembly.Content (TabShowcase.kt:43)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z10 = (i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(localThemeScope));
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Qi.pb
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4989rb.j(localThemeScope, (l0.w) obj);
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
            t0L.a(new Function2() { // from class: Qi.qb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4989rb.k(this.f30506a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Oi.c
    public String getName() {
        return this.name;
    }

    @Override // Oi.c
    /* renamed from: m, reason: from getter */
    public l.y getState() {
        return this.state;
    }
}
