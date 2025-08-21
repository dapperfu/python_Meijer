package androidx.compose.runtime;

import J0.IntRef;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a7\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\f\u0010\r\"\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\" \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u0014"}, d2 = {"T", "Lkotlin/Function0;", "calculation", "Landroidx/compose/runtime/z1;", "d", "(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/z1;", "Landroidx/compose/runtime/n1;", "policy", "c", "(Landroidx/compose/runtime/n1;Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/z1;", "LD0/c;", "Landroidx/compose/runtime/C;", "b", "()LD0/c;", "LJ0/j;", "LJ0/d;", "a", "LJ0/j;", "calculationBlockNestedLevel", "derivedStateObservers", "runtime_release"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
@SourceDebugExtension
/* loaded from: classes.dex */
final /* synthetic */ class p1 {

    /* renamed from: a, reason: collision with root package name */
    private static final J0.j<IntRef> f50552a = new J0.j<>();

    /* renamed from: b, reason: collision with root package name */
    private static final J0.j<D0.c<C>> f50553b = new J0.j<>();

    public static final D0.c<C> b() {
        J0.j<D0.c<C>> jVar = f50553b;
        D0.c<C> cVarA = jVar.a();
        if (cVarA != null) {
            return cVarA;
        }
        D0.c<C> cVar = new D0.c<>(new C[0], 0);
        jVar.b(cVar);
        return cVar;
    }

    public static final <T> z1<T> c(n1<T> n1Var, Function0<? extends T> function0) {
        return new A(function0, n1Var);
    }

    public static final <T> z1<T> d(Function0<? extends T> function0) {
        return new A(function0, null);
    }
}
