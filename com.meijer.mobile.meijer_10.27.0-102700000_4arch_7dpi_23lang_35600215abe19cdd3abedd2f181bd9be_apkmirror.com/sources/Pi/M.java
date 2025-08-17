package Pi;

import Ji.C;
import Ji.LocalThemeScope;
import Ni.l;
import P0.e;
import Pi.M;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import j0.C14801J;
import j0.C14815g;
import ji.InterfaceC14913P;
import ji.InterfaceC14935g;
import ji.q1;
import kotlin.C17983x;
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
import m0.C15521g;
import m0.InterfaceC15506C;
import m0.InterfaceC15516b;
import m0.InterfaceC15528n;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\u0011\u001a\u00020\u000f*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0003¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0016\u001a\u00020\u000f*\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014H\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u000f*\u00020\u0006H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u000f*\u00020\u0006H\u0017¢\u0006\u0004\b\u001c\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006$²\u0006\u000e\u0010#\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002"}, d2 = {"LPi/M;", "LNi/c;", "LNi/l$c;", "state", "<init>", "(LNi/l$c;)V", "LJi/M;", "Lji/q1$b;", "badgeTemplate", "LV0/q0;", "backgroundColor", "LJi/T;", "iconColor", "Lkotlin/Function1;", "", "", "updateText", "n", "(LJi/M;Lji/q1$b;JLJi/T;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "description", "Lkotlin/Function0;", "content", "p", "(LJi/M;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "r", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "a", "(LJi/M;Landroidx/compose/runtime/Composer;I)V", "f", "LNi/l$c;", "A", "()LNi/l$c;", "getName", "()Ljava/lang/String;", "name", "whichOneClicked", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class M implements Ni.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.BadgeState state;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC14913P, Composer, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26405b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q1.Badge f26406c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ji.T f26407d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f26408e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Pi.M$a$a, reason: collision with other inner class name */
        static final class C0503a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f26409a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q1.Badge f26410b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ji.T f26411c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<String, Unit> f26412d;

            /* JADX WARN: Multi-variable type inference failed */
            C0503a(LocalThemeScope localThemeScope, q1.Badge badge, Ji.T t10, Function1<? super String, Unit> function1) {
                this.f26409a = localThemeScope;
                this.f26410b = badge;
                this.f26411c = t10;
                this.f26412d = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1) {
                function1.invoke("Row 1");
                return Unit.f142422a;
            }

            public final void b(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1531829706, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BadgeShowcase.BadgeExamples.<anonymous>.<anonymous>.<anonymous> (BadgeShowcase.kt:120)");
                }
                LocalThemeScope localThemeScope = this.f26409a;
                q1.Badge badge = this.f26410b;
                q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.b.a.h.f15380e, null, null, null, 0.0f, this.f26411c, null, 94, null);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f26412d);
                final Function1<String, Unit> function1 = this.f26412d;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Pi.L
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return M.a.C0503a.c(function1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                wi.h.d(localThemeScope, null, 0, badge, drawableIcon, (Function0) objB, composer, 0, 3);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                b(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f26413a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q1.Badge f26414b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ji.T f26415c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<String, Unit> f26416d;

            /* JADX WARN: Multi-variable type inference failed */
            b(LocalThemeScope localThemeScope, q1.Badge badge, Ji.T t10, Function1<? super String, Unit> function1) {
                this.f26413a = localThemeScope;
                this.f26414b = badge;
                this.f26415c = t10;
                this.f26416d = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1) {
                function1.invoke("Row 2");
                return Unit.f142422a;
            }

            public final void b(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1247654189, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BadgeShowcase.BadgeExamples.<anonymous>.<anonymous>.<anonymous> (BadgeShowcase.kt:129)");
                }
                LocalThemeScope localThemeScope = this.f26413a;
                q1.Badge badge = this.f26414b;
                q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.b.a.h.f15380e, null, null, null, 0.0f, this.f26415c, null, 94, null);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f26416d);
                final Function1<String, Unit> function1 = this.f26416d;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Pi.N
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return M.a.b.c(function1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                wi.h.d(localThemeScope, 0, 0, badge, drawableIcon, (Function0) objB, composer, 48, 2);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                b(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f26417a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q1.Badge f26418b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ji.T f26419c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<String, Unit> f26420d;

            /* JADX WARN: Multi-variable type inference failed */
            c(LocalThemeScope localThemeScope, q1.Badge badge, Ji.T t10, Function1<? super String, Unit> function1) {
                this.f26417a = localThemeScope;
                this.f26418b = badge;
                this.f26419c = t10;
                this.f26420d = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1) {
                function1.invoke("Row 3");
                return Unit.f142422a;
            }

            public final void b(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1695769774, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BadgeShowcase.BadgeExamples.<anonymous>.<anonymous>.<anonymous> (BadgeShowcase.kt:139)");
                }
                LocalThemeScope localThemeScope = this.f26417a;
                q1.Badge badge = this.f26418b;
                q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.b.a.h.f15380e, null, null, null, 0.0f, this.f26419c, null, 94, null);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f26420d);
                final Function1<String, Unit> function1 = this.f26420d;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Pi.O
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return M.a.c.c(function1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                wi.h.d(localThemeScope, 1, 0, badge, drawableIcon, (Function0) objB, composer, 48, 2);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                b(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class d implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f26421a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q1.Badge f26422b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ji.T f26423c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<String, Unit> f26424d;

            /* JADX WARN: Multi-variable type inference failed */
            d(LocalThemeScope localThemeScope, q1.Badge badge, Ji.T t10, Function1<? super String, Unit> function1) {
                this.f26421a = localThemeScope;
                this.f26422b = badge;
                this.f26423c = t10;
                this.f26424d = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1) {
                function1.invoke("Row 4");
                return Unit.f142422a;
            }

            public final void b(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(2143885359, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BadgeShowcase.BadgeExamples.<anonymous>.<anonymous>.<anonymous> (BadgeShowcase.kt:149)");
                }
                LocalThemeScope localThemeScope = this.f26421a;
                q1.Badge badge = this.f26422b;
                q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.b.a.h.f15380e, null, null, null, 0.0f, this.f26423c, null, 94, null);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f26424d);
                final Function1<String, Unit> function1 = this.f26424d;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Pi.P
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return M.a.d.c(function1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                wi.h.d(localThemeScope, 10, 0, badge, drawableIcon, (Function0) objB, composer, 48, 2);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                b(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class e implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f26425a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q1.Badge f26426b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ji.T f26427c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<String, Unit> f26428d;

            /* JADX WARN: Multi-variable type inference failed */
            e(LocalThemeScope localThemeScope, q1.Badge badge, Ji.T t10, Function1<? super String, Unit> function1) {
                this.f26425a = localThemeScope;
                this.f26426b = badge;
                this.f26427c = t10;
                this.f26428d = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1) {
                function1.invoke("Row 5");
                return Unit.f142422a;
            }

            public final void b(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1702966352, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BadgeShowcase.BadgeExamples.<anonymous>.<anonymous>.<anonymous> (BadgeShowcase.kt:159)");
                }
                LocalThemeScope localThemeScope = this.f26425a;
                q1.Badge badge = this.f26426b;
                q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.b.a.h.f15380e, null, null, null, 0.0f, this.f26427c, null, 94, null);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f26428d);
                final Function1<String, Unit> function1 = this.f26428d;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Pi.Q
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return M.a.e.c(function1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                wi.h.d(localThemeScope, 100, 0, badge, drawableIcon, (Function0) objB, composer, 48, 2);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                b(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class f implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f26429a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q1.Badge f26430b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ji.T f26431c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<String, Unit> f26432d;

            /* JADX WARN: Multi-variable type inference failed */
            f(LocalThemeScope localThemeScope, q1.Badge badge, Ji.T t10, Function1<? super String, Unit> function1) {
                this.f26429a = localThemeScope;
                this.f26430b = badge;
                this.f26431c = t10;
                this.f26432d = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1) {
                function1.invoke("Row 6");
                return Unit.f142422a;
            }

            public final void b(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1254850767, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BadgeShowcase.BadgeExamples.<anonymous>.<anonymous>.<anonymous> (BadgeShowcase.kt:169)");
                }
                LocalThemeScope localThemeScope = this.f26429a;
                q1.Badge badge = this.f26430b;
                q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.a.q.f15356e, null, null, null, 0.0f, this.f26431c, null, 94, null);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f26432d);
                final Function1<String, Unit> function1 = this.f26432d;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Pi.S
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return M.a.f.c(function1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                wi.h.d(localThemeScope, 1000, androidx.room.G.MAX_BIND_PARAMETER_CNT, badge, drawableIcon, (Function0) objB, composer, 432, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                b(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, q1.Badge badge, Ji.T t10, Function1<? super String, Unit> function1) {
            this.f26405b = localThemeScope;
            this.f26406c = badge;
            this.f26407d = t10;
            this.f26408e = function1;
        }

        public final void a(InterfaceC14913P Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1888016754, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BadgeShowcase.BadgeExamples.<anonymous>.<anonymous> (BadgeShowcase.kt:119)");
            }
            M.this.r(ComposableLambdaKt.c(-1531829706, true, new C0503a(this.f26405b, this.f26406c, this.f26407d, this.f26408e), composer, 54), composer, 6);
            M.this.r(ComposableLambdaKt.c(1247654189, true, new b(this.f26405b, this.f26406c, this.f26407d, this.f26408e), composer, 54), composer, 6);
            M.this.r(ComposableLambdaKt.c(1695769774, true, new c(this.f26405b, this.f26406c, this.f26407d, this.f26408e), composer, 54), composer, 6);
            M.this.r(ComposableLambdaKt.c(2143885359, true, new d(this.f26405b, this.f26406c, this.f26407d, this.f26408e), composer, 54), composer, 6);
            M.this.r(ComposableLambdaKt.c(-1702966352, true, new e(this.f26405b, this.f26406c, this.f26407d, this.f26408e), composer, 54), composer, 6);
            M.this.r(ComposableLambdaKt.c(-1254850767, true, new f(this.f26405b, this.f26406c, this.f26407d, this.f26408e), composer, 54), composer, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14913P interfaceC14913P, Composer composer, Integer num) {
            a(interfaceC14913P, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26433a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M f26434b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<String> f26435a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f26436b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ M f26437c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Pi.M$b$a$a, reason: collision with other inner class name */
            static final class C0504a implements Function3<InterfaceC14913P, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ M f26438a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f26439b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<String> f26440c;

                public final void d(InterfaceC14913P Assemble, Composer composer, int i10) {
                    int i11;
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if ((i10 & 6) == 0) {
                        i11 = i10 | ((i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2);
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1321317460, i11, -1, "com.meijer.mobile.androidacres.showcase.components.BadgeShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BadgeShowcase.kt:59)");
                    }
                    M m10 = this.f26438a;
                    LocalThemeScope localThemeScope = this.f26439b;
                    q1.Badge primary = Assemble.getBadges().getPrimary();
                    composer.startReplaceGroup(5004770);
                    final InterfaceC5730l0<String> interfaceC5730l0 = this.f26440c;
                    Object objB = composer.B();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objB == companion.a()) {
                        objB = new Function1() { // from class: Pi.T
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return M.b.a.C0504a.e(interfaceC5730l0, (String) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    m10.n(localThemeScope, primary, 0L, null, (Function1) objB, composer, 24576, 6);
                    M m11 = this.f26438a;
                    LocalThemeScope localThemeScope2 = this.f26439b;
                    q1.Badge secondary = Assemble.getBadges().getSecondary();
                    composer.startReplaceGroup(5004770);
                    final InterfaceC5730l0<String> interfaceC5730l02 = this.f26440c;
                    Object objB2 = composer.B();
                    if (objB2 == companion.a()) {
                        objB2 = new Function1() { // from class: Pi.U
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return M.b.a.C0504a.f(interfaceC5730l02, (String) obj);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    m11.n(localThemeScope2, secondary, 0L, null, (Function1) objB2, composer, 24576, 6);
                    M m12 = this.f26438a;
                    LocalThemeScope localThemeScope3 = this.f26439b;
                    q1.Badge inverse = Assemble.getBadges().getInverse();
                    long color = this.f26439b.getAdsColors().getAdsColorBrandPrimary().getColor();
                    Ji.T adsColorInverse = this.f26439b.getAdsColors().getAdsColorInverse();
                    composer.startReplaceGroup(5004770);
                    final InterfaceC5730l0<String> interfaceC5730l03 = this.f26440c;
                    Object objB3 = composer.B();
                    if (objB3 == companion.a()) {
                        objB3 = new Function1() { // from class: Pi.V
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return M.b.a.C0504a.g(interfaceC5730l03, (String) obj);
                            }
                        };
                        composer.t(objB3);
                    }
                    composer.P();
                    m12.n(localThemeScope3, inverse, color, adsColorInverse, (Function1) objB3, composer, 24576, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                C0504a(M m10, LocalThemeScope localThemeScope, InterfaceC5730l0<String> interfaceC5730l0) {
                    this.f26438a = m10;
                    this.f26439b = localThemeScope;
                    this.f26440c = interfaceC5730l0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(InterfaceC5730l0 interfaceC5730l0, String row) {
                    Intrinsics.j(row, "row");
                    b.e(interfaceC5730l0, "Column 1, " + row);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit f(InterfaceC5730l0 interfaceC5730l0, String row) {
                    Intrinsics.j(row, "row");
                    b.e(interfaceC5730l0, "Column 2, " + row);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit g(InterfaceC5730l0 interfaceC5730l0, String row) {
                    Intrinsics.j(row, "row");
                    b.e(interfaceC5730l0, "Column 3, " + row);
                    return Unit.f142422a;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14913P interfaceC14913P, Composer composer, Integer num) {
                    d(interfaceC14913P, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(InterfaceC5730l0<String> interfaceC5730l0, LocalThemeScope localThemeScope, M m10) {
                this.f26435a = interfaceC5730l0;
                this.f26436b = localThemeScope;
                this.f26437c = m10;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1793768892, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BadgeShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BadgeShowcase.kt:55)");
                }
                InterfaceC5730l0<String> interfaceC5730l0 = this.f26435a;
                LocalThemeScope localThemeScope = this.f26436b;
                M m10 = this.f26437c;
                Modifier.Companion companion = Modifier.INSTANCE;
                C5658d c5658d = C5658d.f48555a;
                C5658d.m mVarH = c5658d.h();
                e.Companion companion2 = P0.e.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion2.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
                kotlin.N1.b(b.d(interfaceC5730l0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
                int iA2 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion);
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
                Ji.Q.e(localThemeScope, InterfaceC14935g.a.f139807a, ComposableLambdaKt.c(-1321317460, true, new C0504a(m10, localThemeScope, interfaceC5730l0), composer, 54), composer, 432);
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

        b(LocalThemeScope localThemeScope, M m10) {
            this.f26433a = localThemeScope;
            this.f26434b = m10;
        }

        public final void c(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1785253207, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BadgeShowcase.Content.<anonymous>.<anonymous>.<anonymous> (BadgeShowcase.kt:50)");
            }
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = androidx.compose.runtime.t1.e("<NONE>", null, 2, null);
                composer.t(objB);
            }
            composer.P();
            Ri.b.b(this.f26433a, null, this.f26434b.d("Base"), "2.0", null, ComposableLambdaKt.c(1793768892, true, new a((InterfaceC5730l0) objB, this.f26433a, this.f26434b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            c(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String d(InterfaceC5730l0<String> interfaceC5730l0) {
            return interfaceC5730l0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(InterfaceC5730l0<String> interfaceC5730l0, String str) {
            interfaceC5730l0.setValue(str);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26441a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M f26442b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M f26443a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f26444b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Pi.M$c$a$a, reason: collision with other inner class name */
            static final class C0505a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ M f26445a;

                C0505a(M m10) {
                    this.f26445a = m10;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c() {
                    return Unit.f142422a;
                }

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1974091033, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BadgeShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BadgeShowcase.kt:86)");
                    }
                    int iIntValue = this.f26445a.getState().b().getValue().intValue();
                    boolean zBooleanValue = this.f26445a.getState().c().getValue().booleanValue();
                    composer.startReplaceGroup(1849434622);
                    Object objB = composer.B();
                    if (objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: Pi.W
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return M.c.a.C0505a.c();
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    wi.h.h(iIntValue, "", zBooleanValue, (Function0) objB, composer, 3120);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ M f26446a;

                b(M m10) {
                    this.f26446a = m10;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c() {
                    return Unit.f142422a;
                }

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(693149406, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BadgeShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BadgeShowcase.kt:96)");
                    }
                    int iIntValue = this.f26446a.getState().b().getValue().intValue();
                    boolean zBooleanValue = this.f26446a.getState().c().getValue().booleanValue();
                    composer.startReplaceGroup(1849434622);
                    Object objB = composer.B();
                    if (objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: Pi.X
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return M.c.a.b.c();
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    wi.h.f(iIntValue, "", zBooleanValue, (Function0) objB, composer, 3120);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(M m10, LocalThemeScope localThemeScope) {
                this.f26443a = m10;
                this.f26444b = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1479013669, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BadgeShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BadgeShowcase.kt:83)");
                }
                M m10 = this.f26443a;
                LocalThemeScope localThemeScope = this.f26444b;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion2.a();
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
                androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                C14815g c14815g = C14815g.f139108a;
                m10.p(localThemeScope, "Shopping Cart Badge used to show cart quantity", ComposableLambdaKt.c(-1974091033, true, new C0505a(m10), composer, 54), composer, 432);
                m10.p(localThemeScope, "Filter Badge to show number of applied filters", ComposableLambdaKt.c(693149406, true, new b(m10), composer, 54), composer, 432);
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

        c(LocalThemeScope localThemeScope, M m10) {
            this.f26441a = localThemeScope;
            this.f26442b = m10;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1987386670, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BadgeShowcase.Content.<anonymous>.<anonymous>.<anonymous> (BadgeShowcase.kt:79)");
            }
            Ri.b.b(this.f26441a, null, this.f26442b.d("Base"), "2.0", null, ComposableLambdaKt.c(1479013669, true, new a(this.f26442b, this.f26441a), composer, 54), composer, 199680, 9);
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
    @SourceDebugExtension
    static final class d implements Function3<InterfaceC15528n, Composer, Integer, Unit> {
        public final void b(InterfaceC15528n item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-272104895, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BadgeShowcase.Controls.<anonymous>.<anonymous>.<anonymous> (BadgeShowcase.kt:207)");
            }
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(M.this);
            final M m10 = M.this;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Pi.Y
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return M.d.c(m10);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17983x.a((Function0) objB, null, false, null, null, null, null, null, null, E2.f25758a.a(), composer, 805306368, 510);
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
        public static final Unit c(M m10) {
            if (m10.getState().b().getValue().intValue() > 0) {
                m10.getState().b().setValue(Integer.valueOf(r1.getValue().intValue() - 1));
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function3<InterfaceC15528n, Composer, Integer, Unit> {
        public final void b(InterfaceC15528n item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2060090410, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BadgeShowcase.Controls.<anonymous>.<anonymous>.<anonymous> (BadgeShowcase.kt:217)");
            }
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(M.this);
            final M m10 = M.this;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Pi.Z
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return M.e.c(m10);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17983x.a((Function0) objB, null, false, null, null, null, null, null, null, E2.f25758a.b(), composer, 805306368, 510);
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
        public static final Unit c(M m10) {
            if (m10.getState().b().getValue().intValue() < 100) {
                InterfaceC5730l0<Integer> interfaceC5730l0B = m10.getState().b();
                interfaceC5730l0B.setValue(Integer.valueOf(interfaceC5730l0B.getValue().intValue() + 1));
            }
            return Unit.f142422a;
        }
    }

    public M(l.BadgeState state) {
        Intrinsics.j(state, "state");
        this.state = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(Ji.LocalThemeScope r19, final ji.q1.Badge r20, long r21, Ji.T r23, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Pi.M.n(Ji.M, ji.q1$b, long, Ji.T, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(M m10, LocalThemeScope localThemeScope, q1.Badge badge, long j10, Ji.T t10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        m10.n(localThemeScope, badge, j10, t10, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(final LocalThemeScope localThemeScope, final String str, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i10) {
        int i11;
        String str2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(254525533);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            str2 = str;
            i11 |= composerStartRestartGroup.V(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(function2) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(254525533, i11, -1, "com.meijer.mobile.androidacres.showcase.components.BadgeShowcase.BadgeIconRow (BadgeShowcase.kt:184)");
            }
            C5658d.e eVarG = C5658d.f48555a.g();
            e.c cVarI = P0.e.INSTANCE.i();
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 8;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), H1.h.p(f10));
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(eVarG, cVarI, composerStartRestartGroup, 54);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierI);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
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
            androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14801J c14801j = C14801J.f139030a;
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 6) & 14));
            composer2 = composerStartRestartGroup;
            kotlin.N1.b(str2, androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, localThemeScope.getAdsTypography().getBodyCompact().getTwo().getStyle(), composer2, ((i11 >> 3) & 14) | 48, 0, 65532);
            composer2.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Pi.I
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return M.q(this.f25979a, localThemeScope, str, function2, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(M m10, LocalThemeScope localThemeScope, String str, Function2 function2, int i10, Composer composer, int i11) {
        m10.p(localThemeScope, str, function2, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(M m10, Function2 function2, int i10, Composer composer, int i11) {
        m10.r(function2, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(LocalThemeScope localThemeScope, M m10, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1785253207, true, new b(localThemeScope, m10)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1987386670, true, new c(localThemeScope, m10)), 3, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(M m10, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        m10.a(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(M m10, InterfaceC15506C LazyVerticalGrid) {
        Intrinsics.j(LazyVerticalGrid, "$this$LazyVerticalGrid");
        InterfaceC15506C.f(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(-272104895, true, m10.new d()), 7, null);
        InterfaceC15506C.f(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(2060090410, true, m10.new e()), 7, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(M m10, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        m10.f(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    @Override // Ni.c
    /* renamed from: A, reason: from getter */
    public l.BadgeState getState() {
        return this.state;
    }

    @Override // Ni.c
    public void a(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(1468014174);
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
                ComposerKt.U(1468014174, i11, -1, "com.meijer.mobile.androidacres.showcase.components.BadgeShowcase.Content (BadgeShowcase.kt:47)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(localThemeScope))) | composerStartRestartGroup.D(this);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Pi.E
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return M.t(localThemeScope, this, (l0.w) obj);
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
            t0L.a(new Function2() { // from class: Pi.F
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return M.u(this.f25792a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
    public void f(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(587929461);
        if ((i10 & 48) == 0) {
            i11 = (composerStartRestartGroup.D(this) ? 32 : 16) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 17) == 16 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(587929461, i11, -1, "com.meijer.mobile.androidacres.showcase.components.BadgeShowcase.Controls (BadgeShowcase.kt:203)");
            }
            InterfaceC15516b.a aVar = new InterfaceC15516b.a(2);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zD = composerStartRestartGroup.D(this);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Pi.G
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return M.v(this.f25816a, (InterfaceC15506C) obj);
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
            t0L.a(new Function2() { // from class: Pi.H
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return M.w(this.f25835a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
    public String getName() {
        return "Badge";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i10) {
        int i11;
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1161473967);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(function2)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1161473967, i11, -1, "com.meijer.mobile.androidacres.showcase.components.BadgeShowcase.BadgeRow (BadgeShowcase.kt:229)");
            }
            Modifier modifierJ = androidx.compose.foundation.layout.D.j(Modifier.INSTANCE, H1.h.p(21), H1.h.p(6));
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composerStartRestartGroup, 0);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierJ);
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
            androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
            C14801J c14801j = C14801J.f139030a;
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i11 & 14));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Pi.K
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return M.s(this.f26330a, function2, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
