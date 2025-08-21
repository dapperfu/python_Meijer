package Qi;

import Ki.C;
import Ki.LocalThemeScope;
import Oi.l;
import P0.e;
import Qi.M;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import j0.C14889J;
import j0.C14903g;
import ki.InterfaceC15147P;
import ki.InterfaceC15169g;
import ki.q1;
import kotlin.C18049x;
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
import m0.C15632g;
import m0.InterfaceC15617C;
import m0.InterfaceC15627b;
import m0.InterfaceC15639n;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\u0011\u001a\u00020\u000f*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0003¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0016\u001a\u00020\u000f*\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014H\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u000f*\u00020\u0006H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u000f*\u00020\u0006H\u0017¢\u0006\u0004\b\u001c\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006%²\u0006\u000e\u0010$\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002"}, d2 = {"LQi/M;", "LOi/c;", "LOi/l$c;", "state", "<init>", "(LOi/l$c;)V", "LKi/M;", "Lki/q1$b;", "badgeTemplate", "LV0/q0;", "backgroundColor", "LKi/T;", "iconColor", "Lkotlin/Function1;", "", "", "updateText", "n", "(LKi/M;Lki/q1$b;JLKi/T;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "description", "Lkotlin/Function0;", "content", "p", "(LKi/M;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "r", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "f", "(LKi/M;Landroidx/compose/runtime/Composer;I)V", "b", "a", "LOi/l$c;", "A", "()LOi/l$c;", "getName", "()Ljava/lang/String;", "name", "whichOneClicked", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class M implements Oi.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.BadgeState state;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC15147P, Composer, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29117b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q1.Badge f29118c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ki.T f29119d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f29120e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.M$a$a, reason: collision with other inner class name */
        static final class C0567a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29121a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q1.Badge f29122b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ki.T f29123c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<String, Unit> f29124d;

            /* JADX WARN: Multi-variable type inference failed */
            C0567a(LocalThemeScope localThemeScope, q1.Badge badge, Ki.T t10, Function1<? super String, Unit> function1) {
                this.f29121a = localThemeScope;
                this.f29122b = badge;
                this.f29123c = t10;
                this.f29124d = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1) {
                function1.invoke("Row 1");
                return Unit.f143329a;
            }

            public final void b(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1531829706, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BadgeShowcase.BadgeExamples.<anonymous>.<anonymous>.<anonymous> (BadgeShowcase.kt:120)");
                }
                LocalThemeScope localThemeScope = this.f29121a;
                q1.Badge badge = this.f29122b;
                q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.b.a.h.f16924e, null, null, null, 0.0f, this.f29123c, null, 94, null);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f29124d);
                final Function1<String, Unit> function1 = this.f29124d;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Qi.L
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return M.a.C0567a.c(function1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                xi.h.d(localThemeScope, null, 0, badge, drawableIcon, (Function0) objB, composer, 0, 3);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                b(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29125a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q1.Badge f29126b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ki.T f29127c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<String, Unit> f29128d;

            /* JADX WARN: Multi-variable type inference failed */
            b(LocalThemeScope localThemeScope, q1.Badge badge, Ki.T t10, Function1<? super String, Unit> function1) {
                this.f29125a = localThemeScope;
                this.f29126b = badge;
                this.f29127c = t10;
                this.f29128d = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1) {
                function1.invoke("Row 2");
                return Unit.f143329a;
            }

            public final void b(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1247654189, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BadgeShowcase.BadgeExamples.<anonymous>.<anonymous>.<anonymous> (BadgeShowcase.kt:129)");
                }
                LocalThemeScope localThemeScope = this.f29125a;
                q1.Badge badge = this.f29126b;
                q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.b.a.h.f16924e, null, null, null, 0.0f, this.f29127c, null, 94, null);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f29128d);
                final Function1<String, Unit> function1 = this.f29128d;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Qi.N
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return M.a.b.c(function1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                xi.h.d(localThemeScope, 0, 0, badge, drawableIcon, (Function0) objB, composer, 48, 2);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                b(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29129a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q1.Badge f29130b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ki.T f29131c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<String, Unit> f29132d;

            /* JADX WARN: Multi-variable type inference failed */
            c(LocalThemeScope localThemeScope, q1.Badge badge, Ki.T t10, Function1<? super String, Unit> function1) {
                this.f29129a = localThemeScope;
                this.f29130b = badge;
                this.f29131c = t10;
                this.f29132d = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1) {
                function1.invoke("Row 3");
                return Unit.f143329a;
            }

            public final void b(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1695769774, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BadgeShowcase.BadgeExamples.<anonymous>.<anonymous>.<anonymous> (BadgeShowcase.kt:139)");
                }
                LocalThemeScope localThemeScope = this.f29129a;
                q1.Badge badge = this.f29130b;
                q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.b.a.h.f16924e, null, null, null, 0.0f, this.f29131c, null, 94, null);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f29132d);
                final Function1<String, Unit> function1 = this.f29132d;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Qi.O
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return M.a.c.c(function1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                xi.h.d(localThemeScope, 1, 0, badge, drawableIcon, (Function0) objB, composer, 48, 2);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                b(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class d implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29133a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q1.Badge f29134b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ki.T f29135c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<String, Unit> f29136d;

            /* JADX WARN: Multi-variable type inference failed */
            d(LocalThemeScope localThemeScope, q1.Badge badge, Ki.T t10, Function1<? super String, Unit> function1) {
                this.f29133a = localThemeScope;
                this.f29134b = badge;
                this.f29135c = t10;
                this.f29136d = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1) {
                function1.invoke("Row 4");
                return Unit.f143329a;
            }

            public final void b(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(2143885359, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BadgeShowcase.BadgeExamples.<anonymous>.<anonymous>.<anonymous> (BadgeShowcase.kt:149)");
                }
                LocalThemeScope localThemeScope = this.f29133a;
                q1.Badge badge = this.f29134b;
                q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.b.a.h.f16924e, null, null, null, 0.0f, this.f29135c, null, 94, null);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f29136d);
                final Function1<String, Unit> function1 = this.f29136d;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Qi.P
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return M.a.d.c(function1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                xi.h.d(localThemeScope, 10, 0, badge, drawableIcon, (Function0) objB, composer, 48, 2);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                b(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class e implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29137a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q1.Badge f29138b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ki.T f29139c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<String, Unit> f29140d;

            /* JADX WARN: Multi-variable type inference failed */
            e(LocalThemeScope localThemeScope, q1.Badge badge, Ki.T t10, Function1<? super String, Unit> function1) {
                this.f29137a = localThemeScope;
                this.f29138b = badge;
                this.f29139c = t10;
                this.f29140d = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1) {
                function1.invoke("Row 5");
                return Unit.f143329a;
            }

            public final void b(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1702966352, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BadgeShowcase.BadgeExamples.<anonymous>.<anonymous>.<anonymous> (BadgeShowcase.kt:159)");
                }
                LocalThemeScope localThemeScope = this.f29137a;
                q1.Badge badge = this.f29138b;
                q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.b.a.h.f16924e, null, null, null, 0.0f, this.f29139c, null, 94, null);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f29140d);
                final Function1<String, Unit> function1 = this.f29140d;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Qi.Q
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return M.a.e.c(function1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                xi.h.d(localThemeScope, 100, 0, badge, drawableIcon, (Function0) objB, composer, 48, 2);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                b(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class f implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29141a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q1.Badge f29142b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ki.T f29143c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<String, Unit> f29144d;

            /* JADX WARN: Multi-variable type inference failed */
            f(LocalThemeScope localThemeScope, q1.Badge badge, Ki.T t10, Function1<? super String, Unit> function1) {
                this.f29141a = localThemeScope;
                this.f29142b = badge;
                this.f29143c = t10;
                this.f29144d = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1) {
                function1.invoke("Row 6");
                return Unit.f143329a;
            }

            public final void b(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1254850767, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BadgeShowcase.BadgeExamples.<anonymous>.<anonymous>.<anonymous> (BadgeShowcase.kt:169)");
                }
                LocalThemeScope localThemeScope = this.f29141a;
                q1.Badge badge = this.f29142b;
                q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.a.q.f16900e, null, null, null, 0.0f, this.f29143c, null, 94, null);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f29144d);
                final Function1<String, Unit> function1 = this.f29144d;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Qi.S
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return M.a.f.c(function1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                xi.h.d(localThemeScope, 1000, androidx.room.G.MAX_BIND_PARAMETER_CNT, badge, drawableIcon, (Function0) objB, composer, 432, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                b(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, q1.Badge badge, Ki.T t10, Function1<? super String, Unit> function1) {
            this.f29117b = localThemeScope;
            this.f29118c = badge;
            this.f29119d = t10;
            this.f29120e = function1;
        }

        public final void a(InterfaceC15147P Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1888016754, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BadgeShowcase.BadgeExamples.<anonymous>.<anonymous> (BadgeShowcase.kt:119)");
            }
            M.this.r(ComposableLambdaKt.c(-1531829706, true, new C0567a(this.f29117b, this.f29118c, this.f29119d, this.f29120e), composer, 54), composer, 6);
            M.this.r(ComposableLambdaKt.c(1247654189, true, new b(this.f29117b, this.f29118c, this.f29119d, this.f29120e), composer, 54), composer, 6);
            M.this.r(ComposableLambdaKt.c(1695769774, true, new c(this.f29117b, this.f29118c, this.f29119d, this.f29120e), composer, 54), composer, 6);
            M.this.r(ComposableLambdaKt.c(2143885359, true, new d(this.f29117b, this.f29118c, this.f29119d, this.f29120e), composer, 54), composer, 6);
            M.this.r(ComposableLambdaKt.c(-1702966352, true, new e(this.f29117b, this.f29118c, this.f29119d, this.f29120e), composer, 54), composer, 6);
            M.this.r(ComposableLambdaKt.c(-1254850767, true, new f(this.f29117b, this.f29118c, this.f29119d, this.f29120e), composer, 54), composer, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15147P interfaceC15147P, Composer composer, Integer num) {
            a(interfaceC15147P, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29145a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M f29146b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<String> f29147a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29148b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ M f29149c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Qi.M$b$a$a, reason: collision with other inner class name */
            static final class C0568a implements Function3<InterfaceC15147P, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ M f29150a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f29151b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<String> f29152c;

                public final void d(InterfaceC15147P Assemble, Composer composer, int i10) {
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
                    M m10 = this.f29150a;
                    LocalThemeScope localThemeScope = this.f29151b;
                    q1.Badge primary = Assemble.getBadges().getPrimary();
                    composer.startReplaceGroup(5004770);
                    final InterfaceC5872l0<String> interfaceC5872l0 = this.f29152c;
                    Object objB = composer.B();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objB == companion.a()) {
                        objB = new Function1() { // from class: Qi.T
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return M.b.a.C0568a.e(interfaceC5872l0, (String) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    m10.n(localThemeScope, primary, 0L, null, (Function1) objB, composer, 24576, 6);
                    M m11 = this.f29150a;
                    LocalThemeScope localThemeScope2 = this.f29151b;
                    q1.Badge secondary = Assemble.getBadges().getSecondary();
                    composer.startReplaceGroup(5004770);
                    final InterfaceC5872l0<String> interfaceC5872l02 = this.f29152c;
                    Object objB2 = composer.B();
                    if (objB2 == companion.a()) {
                        objB2 = new Function1() { // from class: Qi.U
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return M.b.a.C0568a.f(interfaceC5872l02, (String) obj);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    m11.n(localThemeScope2, secondary, 0L, null, (Function1) objB2, composer, 24576, 6);
                    M m12 = this.f29150a;
                    LocalThemeScope localThemeScope3 = this.f29151b;
                    q1.Badge inverse = Assemble.getBadges().getInverse();
                    long color = this.f29151b.getAdsColors().getAdsColorBrandPrimary().getColor();
                    Ki.T adsColorInverse = this.f29151b.getAdsColors().getAdsColorInverse();
                    composer.startReplaceGroup(5004770);
                    final InterfaceC5872l0<String> interfaceC5872l03 = this.f29152c;
                    Object objB3 = composer.B();
                    if (objB3 == companion.a()) {
                        objB3 = new Function1() { // from class: Qi.V
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return M.b.a.C0568a.g(interfaceC5872l03, (String) obj);
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

                C0568a(M m10, LocalThemeScope localThemeScope, InterfaceC5872l0<String> interfaceC5872l0) {
                    this.f29150a = m10;
                    this.f29151b = localThemeScope;
                    this.f29152c = interfaceC5872l0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(InterfaceC5872l0 interfaceC5872l0, String row) {
                    Intrinsics.j(row, "row");
                    b.e(interfaceC5872l0, "Column 1, " + row);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit f(InterfaceC5872l0 interfaceC5872l0, String row) {
                    Intrinsics.j(row, "row");
                    b.e(interfaceC5872l0, "Column 2, " + row);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit g(InterfaceC5872l0 interfaceC5872l0, String row) {
                    Intrinsics.j(row, "row");
                    b.e(interfaceC5872l0, "Column 3, " + row);
                    return Unit.f143329a;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15147P interfaceC15147P, Composer composer, Integer num) {
                    d(interfaceC15147P, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(InterfaceC5872l0<String> interfaceC5872l0, LocalThemeScope localThemeScope, M m10) {
                this.f29147a = interfaceC5872l0;
                this.f29148b = localThemeScope;
                this.f29149c = m10;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1793768892, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BadgeShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BadgeShowcase.kt:55)");
                }
                InterfaceC5872l0<String> interfaceC5872l0 = this.f29147a;
                LocalThemeScope localThemeScope = this.f29148b;
                M m10 = this.f29149c;
                Modifier.Companion companion = Modifier.INSTANCE;
                C5800d c5800d = C5800d.f48779a;
                C5800d.m mVarH = c5800d.h();
                e.Companion companion2 = P0.e.INSTANCE;
                MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion3.a();
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
                androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion3.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
                C14903g c14903g = C14903g.f139698a;
                kotlin.N1.b(b.d(interfaceC5872l0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
                int iA2 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion);
                Function0<InterfaceC5953g> function0A2 = companion3.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A2);
                } else {
                    composer.s();
                }
                Composer composerA2 = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA2, measurePolicyB, companion3.e());
                androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
                C14889J c14889j = C14889J.f139620a;
                Ki.Q.e(localThemeScope, InterfaceC15169g.a.f142062a, ComposableLambdaKt.c(-1321317460, true, new C0568a(m10, localThemeScope, interfaceC5872l0), composer, 54), composer, 432);
                composer.v();
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

        b(LocalThemeScope localThemeScope, M m10) {
            this.f29145a = localThemeScope;
            this.f29146b = m10;
        }

        public final void c(InterfaceC15433c item, Composer composer, int i10) {
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
            Si.b.b(this.f29145a, null, this.f29146b.c("Base"), "2.0", null, ComposableLambdaKt.c(1793768892, true, new a((InterfaceC5872l0) objB, this.f29145a, this.f29146b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            c(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String d(InterfaceC5872l0<String> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(InterfaceC5872l0<String> interfaceC5872l0, String str) {
            interfaceC5872l0.setValue(str);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29153a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M f29154b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M f29155a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29156b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Qi.M$c$a$a, reason: collision with other inner class name */
            static final class C0569a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ M f29157a;

                C0569a(M m10) {
                    this.f29157a = m10;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c() {
                    return Unit.f143329a;
                }

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1974091033, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BadgeShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BadgeShowcase.kt:86)");
                    }
                    int iIntValue = this.f29157a.getState().b().getValue().intValue();
                    boolean zBooleanValue = this.f29157a.getState().c().getValue().booleanValue();
                    composer.startReplaceGroup(1849434622);
                    Object objB = composer.B();
                    if (objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: Qi.W
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return M.c.a.C0569a.c();
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    xi.h.h(iIntValue, "", zBooleanValue, (Function0) objB, composer, 3120);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ M f29158a;

                b(M m10) {
                    this.f29158a = m10;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c() {
                    return Unit.f143329a;
                }

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(693149406, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BadgeShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BadgeShowcase.kt:96)");
                    }
                    int iIntValue = this.f29158a.getState().b().getValue().intValue();
                    boolean zBooleanValue = this.f29158a.getState().c().getValue().booleanValue();
                    composer.startReplaceGroup(1849434622);
                    Object objB = composer.B();
                    if (objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: Qi.X
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return M.c.a.b.c();
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    xi.h.f(iIntValue, "", zBooleanValue, (Function0) objB, composer, 3120);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(M m10, LocalThemeScope localThemeScope) {
                this.f29155a = m10;
                this.f29156b = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1479013669, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BadgeShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BadgeShowcase.kt:83)");
                }
                M m10 = this.f29155a;
                LocalThemeScope localThemeScope = this.f29156b;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion2.a();
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
                androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                C14903g c14903g = C14903g.f139698a;
                m10.p(localThemeScope, "Shopping Cart Badge used to show cart quantity", ComposableLambdaKt.c(-1974091033, true, new C0569a(m10), composer, 54), composer, 432);
                m10.p(localThemeScope, "Filter Badge to show number of applied filters", ComposableLambdaKt.c(693149406, true, new b(m10), composer, 54), composer, 432);
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

        c(LocalThemeScope localThemeScope, M m10) {
            this.f29153a = localThemeScope;
            this.f29154b = m10;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1987386670, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BadgeShowcase.Content.<anonymous>.<anonymous>.<anonymous> (BadgeShowcase.kt:79)");
            }
            Si.b.b(this.f29153a, null, this.f29154b.c("Base"), "2.0", null, ComposableLambdaKt.c(1479013669, true, new a(this.f29154b, this.f29153a), composer, 54), composer, 199680, 9);
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
    @SourceDebugExtension
    static final class d implements Function3<InterfaceC15639n, Composer, Integer, Unit> {
        public final void b(InterfaceC15639n item, Composer composer, int i10) {
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
                objB = new Function0() { // from class: Qi.Y
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return M.d.c(m10);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C18049x.a((Function0) objB, null, false, null, null, null, null, null, null, E2.f28470a.a(), composer, 805306368, 510);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        d() {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15639n interfaceC15639n, Composer composer, Integer num) {
            b(interfaceC15639n, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(M m10) {
            if (m10.getState().b().getValue().intValue() > 0) {
                m10.getState().b().setValue(Integer.valueOf(r1.getValue().intValue() - 1));
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function3<InterfaceC15639n, Composer, Integer, Unit> {
        public final void b(InterfaceC15639n item, Composer composer, int i10) {
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
                objB = new Function0() { // from class: Qi.Z
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return M.e.c(m10);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C18049x.a((Function0) objB, null, false, null, null, null, null, null, null, E2.f28470a.b(), composer, 805306368, 510);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        e() {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15639n interfaceC15639n, Composer composer, Integer num) {
            b(interfaceC15639n, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(M m10) {
            if (m10.getState().b().getValue().intValue() < 100) {
                InterfaceC5872l0<Integer> interfaceC5872l0B = m10.getState().b();
                interfaceC5872l0B.setValue(Integer.valueOf(interfaceC5872l0B.getValue().intValue() + 1));
            }
            return Unit.f143329a;
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
    public final void n(Ki.LocalThemeScope r19, final ki.q1.Badge r20, long r21, Ki.T r23, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qi.M.n(Ki.M, ki.q1$b, long, Ki.T, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(M m10, LocalThemeScope localThemeScope, q1.Badge badge, long j10, Ki.T t10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        m10.n(localThemeScope, badge, j10, t10, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
            C5800d.e eVarG = C5800d.f48779a.g();
            e.c cVarI = P0.e.INSTANCE.i();
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 8;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), H1.h.p(f10));
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(eVarG, cVarI, composerStartRestartGroup, 54);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierI);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
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
            androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14889J c14889j = C14889J.f139620a;
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
            t0L.a(new Function2() { // from class: Qi.I
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return M.q(this.f28691a, localThemeScope, str, function2, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(M m10, LocalThemeScope localThemeScope, String str, Function2 function2, int i10, Composer composer, int i11) {
        m10.p(localThemeScope, str, function2, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(M m10, Function2 function2, int i10, Composer composer, int i11) {
        m10.r(function2, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(LocalThemeScope localThemeScope, M m10, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1785253207, true, new b(localThemeScope, m10)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1987386670, true, new c(localThemeScope, m10)), 3, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(M m10, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        m10.f(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(M m10, InterfaceC15617C LazyVerticalGrid) {
        Intrinsics.j(LazyVerticalGrid, "$this$LazyVerticalGrid");
        InterfaceC15617C.f(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(-272104895, true, m10.new d()), 7, null);
        InterfaceC15617C.f(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(2060090410, true, m10.new e()), 7, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(M m10, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        m10.b(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    @Override // Oi.c
    /* renamed from: A, reason: from getter */
    public l.BadgeState getState() {
        return this.state;
    }

    @Override // Oi.c
    public void b(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
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
            InterfaceC15627b.a aVar = new InterfaceC15627b.a(2);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zD = composerStartRestartGroup.D(this);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Qi.G
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return M.v(this.f28528a, (InterfaceC15617C) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            C15632g.a(aVar, null, null, null, false, null, null, null, false, null, (Function1) objB, composerStartRestartGroup, 0, 0, 1022);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.H
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return M.w(this.f28547a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Oi.c
    public void f(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
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
                objB = new Function1() { // from class: Qi.E
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return M.t(localThemeScope, this, (l0.w) obj);
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
            t0L.a(new Function2() { // from class: Qi.F
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return M.u(this.f28504a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Oi.c
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
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composerStartRestartGroup, 0);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierJ);
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
            androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
            C14889J c14889j = C14889J.f139620a;
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i11 & 14));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.K
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return M.s(this.f29042a, function2, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
