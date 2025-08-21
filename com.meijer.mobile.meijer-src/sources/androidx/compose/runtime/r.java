package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\b\u0010\t\u001a2\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0002\b\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a9\u0010\u0015\u001a\u00020\u00132\u001a\u0010\u0012\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00110\u0010\"\u0006\u0012\u0002\b\u00030\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a)\u0010\u0018\u001a\u00020\u00132\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003H\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"T", "Landroidx/compose/runtime/n1;", "policy", "Lkotlin/Function0;", "defaultFactory", "Landroidx/compose/runtime/F0;", "c", "(Landroidx/compose/runtime/n1;Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/F0;", "f", "(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/F0;", "Lkotlin/Function1;", "Landroidx/compose/runtime/q;", "Lkotlin/ExtensionFunctionType;", "defaultComputation", "e", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/F0;", "", "Landroidx/compose/runtime/G0;", "values", "", "content", "b", "([Landroidx/compose/runtime/G0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "value", "a", "(Landroidx/compose/runtime/G0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class r {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ G0<?>[] f50567f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f50568g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f50569h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(G0<?>[] g0Arr, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f50567f = g0Arr;
            this.f50568g = function2;
            this.f50569h = i10;
        }

        public final void a(Composer composer, int i10) {
            G0<?>[] g0Arr = this.f50567f;
            r.b((G0[]) Arrays.copyOf(g0Arr, g0Arr.length), this.f50568g, composer, J0.a(this.f50569h | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ G0<?> f50570f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f50571g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f50572h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(G0<?> g02, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f50570f = g02;
            this.f50571g = function2;
            this.f50572h = i10;
        }

        public final void a(Composer composer, int i10) {
            r.a(this.f50570f, this.f50571g, composer, J0.a(this.f50572h | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final <T> F0<T> c(n1<T> n1Var, Function0<? extends T> function0) {
        return new H(n1Var, function0);
    }

    public static /* synthetic */ F0 d(n1 n1Var, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            n1Var = o1.r();
        }
        return c(n1Var, function0);
    }

    public static final <T> F0<T> e(Function1<? super InterfaceC5881q, ? extends T> function1) {
        return new C5894x(function1);
    }

    public static final <T> F0<T> f(Function0<? extends T> function0) {
        return new A1(function0);
    }

    public static final void a(G0<?> g02, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1350970552);
        if (ComposerKt.M()) {
            ComposerKt.U(-1350970552, i10, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:381)");
        }
        composerStartRestartGroup.H(g02);
        function2.invoke(composerStartRestartGroup, Integer.valueOf((i10 >> 3) & 14));
        composerStartRestartGroup.u();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new b(g02, function2, i10));
        }
    }

    public static final void b(G0<?>[] g0Arr, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1390796515);
        if (ComposerKt.M()) {
            ComposerKt.U(-1390796515, i10, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:361)");
        }
        composerStartRestartGroup.W(g0Arr);
        function2.invoke(composerStartRestartGroup, Integer.valueOf((i10 >> 3) & 14));
        composerStartRestartGroup.M();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new a(g0Arr, function2, i10));
        }
    }
}
