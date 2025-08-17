package androidx.compose.runtime;

import M0.SnapshotStateList;
import M0.SnapshotStateMap;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000:\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n\"\u00028\u0000H\u0007¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"T", "value", "Landroidx/compose/runtime/n1;", "policy", "Landroidx/compose/runtime/l0;", "d", "(Ljava/lang/Object;Landroidx/compose/runtime/n1;)Landroidx/compose/runtime/l0;", "LM0/m;", "a", "()LM0/m;", "", "elements", "b", "([Ljava/lang/Object;)LM0/m;", "", "g", "(Ljava/util/Collection;)LM0/m;", "K", "V", "LM0/o;", "c", "()LM0/o;", "newValue", "Landroidx/compose/runtime/z1;", "f", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/z1;", "runtime_release"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
@SourceDebugExtension
/* loaded from: classes.dex */
final /* synthetic */ class t1 {
    public static final <T> SnapshotStateList<T> a() {
        return new SnapshotStateList<>();
    }

    public static final <T> SnapshotStateList<T> b(T... tArr) {
        SnapshotStateList<T> mVar = new SnapshotStateList<>();
        mVar.addAll(ArraysKt.i1(tArr));
        return mVar;
    }

    public static final <K, V> SnapshotStateMap<K, V> c() {
        return new SnapshotStateMap<>();
    }

    public static /* synthetic */ InterfaceC5730l0 e(Object obj, n1 n1Var, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            n1Var = o1.r();
        }
        return o1.i(obj, n1Var);
    }

    public static final <T> SnapshotStateList<T> g(Collection<? extends T> collection) {
        SnapshotStateList<T> mVar = new SnapshotStateList<>();
        mVar.addAll(collection);
        return mVar;
    }

    public static final <T> InterfaceC5730l0<T> d(T t10, n1<T> n1Var) {
        return u1.a(t10, n1Var);
    }

    public static final <T> z1<T> f(T t10, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-1058319986, i10, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:329)");
        }
        Object objB = composer.B();
        if (objB == Composer.INSTANCE.a()) {
            objB = e(t10, null, 2, null);
            composer.t(objB);
        }
        InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
        interfaceC5730l0.setValue(t10);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return interfaceC5730l0;
    }
}
