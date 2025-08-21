package j0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.L0;
import androidx.compose.ui.platform.N0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0003\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0002\u001a\u0011\u0010\u0005\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0002\u001a\u0011\u0010\u0006\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0002¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/Modifier;", "c", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "d", "e", "a", "b", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class T {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class a extends Lambda implements Function1<N0, Unit> {
        public a() {
            super(1);
        }

        public final void a(N0 n02) {
            n02.b("imePadding");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class b extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        public b() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return a(modifier, composer, num.intValue());
        }

        public final Modifier a(Modifier modifier, Composer composer, int i10) {
            composer.startReplaceGroup(359872873);
            if (ComposerKt.M()) {
                ComposerKt.U(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
            }
            C14895P c14895pC = C14895P.INSTANCE.c(composer, 6);
            boolean zV = composer.V(c14895pC);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new C14916t(c14895pC.getIme());
                composer.t(objB);
            }
            C14916t c14916t = (C14916t) objB;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return c14916t;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class c extends Lambda implements Function1<N0, Unit> {
        public c() {
            super(1);
        }

        public final void a(N0 n02) {
            n02.b("navigationBarsPadding");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class d extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        public d() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return a(modifier, composer, num.intValue());
        }

        public final Modifier a(Modifier modifier, Composer composer, int i10) {
            composer.startReplaceGroup(359872873);
            if (ComposerKt.M()) {
                ComposerKt.U(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
            }
            C14895P c14895pC = C14895P.INSTANCE.c(composer, 6);
            boolean zV = composer.V(c14895pC);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new C14916t(c14895pC.getNavigationBars());
                composer.t(objB);
            }
            C14916t c14916t = (C14916t) objB;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return c14916t;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class e extends Lambda implements Function1<N0, Unit> {
        public e() {
            super(1);
        }

        public final void a(N0 n02) {
            n02.b("safeDrawingPadding");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class f extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        public f() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return a(modifier, composer, num.intValue());
        }

        public final Modifier a(Modifier modifier, Composer composer, int i10) {
            composer.startReplaceGroup(359872873);
            if (ComposerKt.M()) {
                ComposerKt.U(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
            }
            C14895P c14895pC = C14895P.INSTANCE.c(composer, 6);
            boolean zV = composer.V(c14895pC);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new C14916t(c14895pC.getSafeDrawing());
                composer.t(objB);
            }
            C14916t c14916t = (C14916t) objB;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return c14916t;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class g extends Lambda implements Function1<N0, Unit> {
        public g() {
            super(1);
        }

        public final void a(N0 n02) {
            n02.b("safeGesturesPadding");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class h extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        public h() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return a(modifier, composer, num.intValue());
        }

        public final Modifier a(Modifier modifier, Composer composer, int i10) {
            composer.startReplaceGroup(359872873);
            if (ComposerKt.M()) {
                ComposerKt.U(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
            }
            C14895P c14895pC = C14895P.INSTANCE.c(composer, 6);
            boolean zV = composer.V(c14895pC);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new C14916t(c14895pC.getSafeGestures());
                composer.t(objB);
            }
            C14916t c14916t = (C14916t) objB;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return c14916t;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class i extends Lambda implements Function1<N0, Unit> {
        public i() {
            super(1);
        }

        public final void a(N0 n02) {
            n02.b("systemBarsPadding");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class j extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        public j() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return a(modifier, composer, num.intValue());
        }

        public final Modifier a(Modifier modifier, Composer composer, int i10) {
            composer.startReplaceGroup(359872873);
            if (ComposerKt.M()) {
                ComposerKt.U(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
            }
            C14895P c14895pC = C14895P.INSTANCE.c(composer, 6);
            boolean zV = composer.V(c14895pC);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new C14916t(c14895pC.getSystemBars());
                composer.t(objB);
            }
            C14916t c14916t = (C14916t) objB;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return c14916t;
        }
    }

    public static final Modifier a(Modifier modifier) {
        Function1 function1A;
        if (L0.b()) {
            function1A = new a();
        } else {
            function1A = L0.a();
        }
        return androidx.compose.ui.b.b(modifier, function1A, new b());
    }

    public static final Modifier b(Modifier modifier) {
        Function1 function1A;
        if (L0.b()) {
            function1A = new c();
        } else {
            function1A = L0.a();
        }
        return androidx.compose.ui.b.b(modifier, function1A, new d());
    }

    public static final Modifier c(Modifier modifier) {
        Function1 function1A;
        if (L0.b()) {
            function1A = new e();
        } else {
            function1A = L0.a();
        }
        return androidx.compose.ui.b.b(modifier, function1A, new f());
    }

    public static final Modifier d(Modifier modifier) {
        Function1 function1A;
        if (L0.b()) {
            function1A = new g();
        } else {
            function1A = L0.a();
        }
        return androidx.compose.ui.b.b(modifier, function1A, new h());
    }

    public static final Modifier e(Modifier modifier) {
        Function1 function1A;
        if (L0.b()) {
            function1A = new i();
        } else {
            function1A = L0.a();
        }
        return androidx.compose.ui.b.b(modifier, function1A, new j());
    }
}
