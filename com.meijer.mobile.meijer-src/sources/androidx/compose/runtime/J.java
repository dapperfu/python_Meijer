package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15784P;
import mv.InterfaceC15769A;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a2\u0010\u000b\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a<\u0010\u000e\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aF\u0010\u0011\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a@\u0010\u0015\u001a\u00020\u00012\u0016\u0010\u0014\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0013\"\u0004\u0018\u00010\u00052\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001aB\u0010\u001b\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052'\u0010\u001a\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0017¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001aL\u0010\u001d\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052'\u0010\u001a\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0017¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001aV\u0010\u001f\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052'\u0010\u001a\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0017¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u001f\u0010 \u001aP\u0010!\u001a\u00020\u00012\u0016\u0010\u0014\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0013\"\u0004\u0018\u00010\u00052'\u0010\u001a\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0017¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010'\u001a\u00020\u00182\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\b'\u0010(\"\u0014\u0010*\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010)¨\u0006+"}, d2 = {"Lkotlin/Function0;", "", "effect", "i", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "", "key1", "Lkotlin/Function1;", "Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "Lkotlin/ExtensionFunctionType;", "c", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "key2", "b", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "key3", "a", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "keys", "d", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function2;", "Lmv/O;", "Lkotlin/coroutines/Continuation;", "block", "g", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "f", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "e", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "h", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroidx/compose/runtime/Composer;", "composer", "k", "(Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lmv/O;", "Landroidx/compose/runtime/F;", "InternalDisposableEffectScope", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    private static final F f50225a = new F();

    @PublishedApi
    public static final InterfaceC15783O k(CoroutineContext coroutineContext, Composer composer) {
        if (coroutineContext.g(mv.C0.INSTANCE) == null) {
            return new P0(composer.q(), coroutineContext);
        }
        InterfaceC15769A interfaceC15769AB = mv.F0.b(null, 1, null);
        interfaceC15769AB.c(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
        return C15784P.a(interfaceC15769AB);
    }

    public static final void a(Object obj, Object obj2, Object obj3, Function1<? super F, ? extends E> function1, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-1239538271, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:223)");
        }
        boolean zV = composer.V(obj) | composer.V(obj2) | composer.V(obj3);
        Object objB = composer.B();
        if (zV || objB == Composer.INSTANCE.a()) {
            objB = new D(function1);
            composer.t(objB);
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
    }

    public static final void b(Object obj, Object obj2, Function1<? super F, ? extends E> function1, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(1429097729, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:185)");
        }
        boolean zV = composer.V(obj) | composer.V(obj2);
        Object objB = composer.B();
        if (zV || objB == Composer.INSTANCE.a()) {
            objB = new D(function1);
            composer.t(objB);
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
    }

    public static final void c(Object obj, Function1<? super F, ? extends E> function1, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-1371986847, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:148)");
        }
        boolean zV = composer.V(obj);
        Object objB = composer.B();
        if (zV || objB == Composer.INSTANCE.a()) {
            objB = new D(function1);
            composer.t(objB);
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
    }

    public static final void d(Object[] objArr, Function1<? super F, ? extends E> function1, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-1307627122, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:259)");
        }
        boolean zV = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zV |= composer.V(obj);
        }
        Object objB = composer.B();
        if (zV || objB == Composer.INSTANCE.a()) {
            composer.t(new D(function1));
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
    }

    public static final void e(Object obj, Object obj2, Object obj3, Function2<? super InterfaceC15783O, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-54093371, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:354)");
        }
        CoroutineContext coroutineContextQ = composer.q();
        boolean zV = composer.V(obj) | composer.V(obj2) | composer.V(obj3);
        Object objB = composer.B();
        if (zV || objB == Composer.INSTANCE.a()) {
            objB = new X(coroutineContextQ, function2);
            composer.t(objB);
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
    }

    public static final void f(Object obj, Object obj2, Function2<? super InterfaceC15783O, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(590241125, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:335)");
        }
        CoroutineContext coroutineContextQ = composer.q();
        boolean zV = composer.V(obj) | composer.V(obj2);
        Object objB = composer.B();
        if (zV || objB == Composer.INSTANCE.a()) {
            objB = new X(coroutineContextQ, function2);
            composer.t(objB);
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
    }

    public static final void g(Object obj, Function2<? super InterfaceC15783O, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(1179185413, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:316)");
        }
        CoroutineContext coroutineContextQ = composer.q();
        boolean zV = composer.V(obj);
        Object objB = composer.B();
        if (zV || objB == Composer.INSTANCE.a()) {
            objB = new X(coroutineContextQ, function2);
            composer.t(objB);
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
    }

    public static final void h(Object[] objArr, Function2<? super InterfaceC15783O, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-139560008, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:377)");
        }
        CoroutineContext coroutineContextQ = composer.q();
        boolean zV = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zV |= composer.V(obj);
        }
        Object objB = composer.B();
        if (zV || objB == Composer.INSTANCE.a()) {
            composer.t(new X(coroutineContextQ, function2));
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
    }

    public static final void i(Function0<Unit> function0, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-1288466761, i10, -1, "androidx.compose.runtime.SideEffect (Effects.kt:49)");
        }
        composer.x(function0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
    }
}
