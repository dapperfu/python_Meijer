package d0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.F0;
import androidx.compose.runtime.InterfaceC5739q;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\"\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"Ld0/J;", "b", "(Landroidx/compose/runtime/Composer;I)Ld0/J;", "Landroidx/compose/runtime/F0;", "Ld0/K;", "a", "Landroidx/compose/runtime/F0;", "()Landroidx/compose/runtime/F0;", "LocalOverscrollFactory", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    private static final F0<K> f126877a = androidx.compose.runtime.r.e(a.f126878f);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/q;", "Ld0/K;", "a", "(Landroidx/compose/runtime/q;)Ld0/K;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<InterfaceC5739q, K> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f126878f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final K invoke(InterfaceC5739q interfaceC5739q) {
            return C13436c.b(interfaceC5739q);
        }
    }

    public static final F0<K> a() {
        return f126877a;
    }

    public static final J b(Composer composer, int i10) {
        composer.startReplaceGroup(282942128);
        if (ComposerKt.M()) {
            ComposerKt.U(282942128, i10, -1, "androidx.compose.foundation.rememberOverscrollEffect (Overscroll.kt:344)");
        }
        K k10 = (K) composer.o(f126877a);
        if (k10 == null) {
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return null;
        }
        boolean zV = composer.V(k10);
        Object objB = composer.B();
        if (zV || objB == Composer.INSTANCE.a()) {
            objB = k10.a();
            composer.t(objB);
        }
        J j10 = (J) objB;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return j10;
    }
}
