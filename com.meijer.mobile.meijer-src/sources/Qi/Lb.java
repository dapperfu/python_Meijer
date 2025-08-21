package Qi;

import Ki.LocalThemeScope;
import Oi.l;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15432b;
import l0.InterfaceC15433c;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LQi/Lb;", "LOi/c;", "LOi/l$p;", "state", "<init>", "(LOi/l$p;)V", "LKi/M;", "", "f", "(LKi/M;Landroidx/compose/runtime/Composer;I)V", "a", "LOi/l$p;", "k", "()LOi/l$p;", "", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class Lb implements Oi.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.p state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29097a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Lb f29098b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qi.Lb$a$a, reason: collision with other inner class name */
        static final class C0566a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29099a;

            C0566a(LocalThemeScope localThemeScope) {
                this.f29099a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-164468556, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ToastShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ToastShowcase.kt:42)");
                }
                yc.m(this.f29099a, composer, 0);
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

        a(LocalThemeScope localThemeScope, Lb lb2) {
            this.f29097a = localThemeScope;
            this.f29098b = lb2;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(551476641, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ToastShowcase.Content.<anonymous>.<anonymous>.<anonymous> (ToastShowcase.kt:38)");
            }
            Si.b.b(this.f29097a, null, this.f29098b.c("Static toasts"), "1.0", null, ComposableLambdaKt.c(-164468556, true, new C0566a(this.f29097a), composer, 54), composer, 199680, 9);
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
        final /* synthetic */ LocalThemeScope f29100a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Lb f29101b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29102a;

            a(LocalThemeScope localThemeScope) {
                this.f29102a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-479223779, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ToastShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ToastShowcase.kt:51)");
                }
                yc.o(this.f29102a, q1.m.a.C2256a.f142367a, composer, 48);
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

        b(LocalThemeScope localThemeScope, Lb lb2) {
            this.f29100a = localThemeScope;
            this.f29101b = lb2;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(349343178, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ToastShowcase.Content.<anonymous>.<anonymous>.<anonymous> (ToastShowcase.kt:47)");
            }
            Si.b.b(this.f29100a, null, this.f29101b.c("Default toasts"), "1.0", null, ComposableLambdaKt.c(-479223779, true, new a(this.f29100a), composer, 54), composer, 199680, 9);
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
        final /* synthetic */ LocalThemeScope f29103a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Lb f29104b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29105a;

            a(LocalThemeScope localThemeScope) {
                this.f29105a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-715841604, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ToastShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ToastShowcase.kt:59)");
                }
                yc.o(this.f29105a, q1.m.a.e.f142374a, composer, 48);
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

        c(LocalThemeScope localThemeScope, Lb lb2) {
            this.f29103a = localThemeScope;
            this.f29104b = lb2;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(112725353, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ToastShowcase.Content.<anonymous>.<anonymous>.<anonymous> (ToastShowcase.kt:55)");
            }
            Si.b.b(this.f29103a, null, this.f29104b.c("Warning toasts"), "1.0", null, ComposableLambdaKt.c(-715841604, true, new a(this.f29103a), composer, 54), composer, 199680, 9);
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
        final /* synthetic */ LocalThemeScope f29106a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Lb f29107b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29108a;

            a(LocalThemeScope localThemeScope) {
                this.f29108a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-952459429, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ToastShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ToastShowcase.kt:67)");
                }
                yc.o(this.f29108a, q1.m.a.c.f142370a, composer, 48);
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

        d(LocalThemeScope localThemeScope, Lb lb2) {
            this.f29106a = localThemeScope;
            this.f29107b = lb2;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-123892472, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ToastShowcase.Content.<anonymous>.<anonymous>.<anonymous> (ToastShowcase.kt:63)");
            }
            Si.b.b(this.f29106a, null, this.f29107b.c("Information toasts"), "1.0", null, ComposableLambdaKt.c(-952459429, true, new a(this.f29106a), composer, 54), composer, 199680, 9);
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
        final /* synthetic */ LocalThemeScope f29109a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Lb f29110b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29111a;

            a(LocalThemeScope localThemeScope) {
                this.f29111a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1189077254, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ToastShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ToastShowcase.kt:75)");
                }
                yc.o(this.f29111a, q1.m.a.b.f142368a, composer, 48);
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

        e(LocalThemeScope localThemeScope, Lb lb2) {
            this.f29109a = localThemeScope;
            this.f29110b = lb2;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-360510297, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ToastShowcase.Content.<anonymous>.<anonymous>.<anonymous> (ToastShowcase.kt:71)");
            }
            Si.b.b(this.f29109a, null, this.f29110b.c("Error toasts"), "1.0", null, ComposableLambdaKt.c(-1189077254, true, new a(this.f29109a), composer, 54), composer, 199680, 9);
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
        final /* synthetic */ LocalThemeScope f29112a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Lb f29113b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29114a;

            a(LocalThemeScope localThemeScope) {
                this.f29114a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1425695079, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ToastShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ToastShowcase.kt:83)");
                }
                yc.o(this.f29114a, q1.m.a.d.f142372a, composer, 48);
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

        f(LocalThemeScope localThemeScope, Lb lb2) {
            this.f29112a = localThemeScope;
            this.f29113b = lb2;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-597128122, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ToastShowcase.Content.<anonymous>.<anonymous>.<anonymous> (ToastShowcase.kt:79)");
            }
            Si.b.b(this.f29112a, null, this.f29113b.c("Success toasts"), "1.0", null, ComposableLambdaKt.c(-1425695079, true, new a(this.f29112a), composer, 54), composer, 199680, 9);
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

    public Lb(l.p state) {
        Intrinsics.j(state, "state");
        this.state = state;
        this.name = "Toast";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, Lb lb2, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(551476641, true, new a(localThemeScope, lb2)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(349343178, true, new b(localThemeScope, lb2)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(112725353, true, new c(localThemeScope, lb2)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-123892472, true, new d(localThemeScope, lb2)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-360510297, true, new e(localThemeScope, lb2)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-597128122, true, new f(localThemeScope, lb2)), 3, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Lb lb2, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        lb2.f(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    @Override // Oi.c
    public void f(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-490223274);
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
                ComposerKt.U(-490223274, i11, -1, "com.meijer.mobile.androidacres.showcase.components.ToastShowcase.Content (ToastShowcase.kt:35)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z10 = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(localThemeScope))) | ((i11 & 112) == 32);
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Qi.Jb
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Lb.i(localThemeScope, this, (l0.w) obj);
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
            t0L.a(new Function2() { // from class: Qi.Kb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Lb.j(this.f29063a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Oi.c
    public String getName() {
        return this.name;
    }

    @Override // Oi.c
    /* renamed from: k, reason: from getter */
    public l.p getState() {
        return this.state;
    }
}
