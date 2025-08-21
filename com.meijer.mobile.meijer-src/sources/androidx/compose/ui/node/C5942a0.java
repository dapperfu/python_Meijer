package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/node/a0;", "T", "", "LD0/c;", "vector", "Lkotlin/Function0;", "", "onVectorMutated", "<init>", "(LD0/c;Lkotlin/jvm/functions/Function0;)V", "b", "()V", "", "index", "element", "a", "(ILjava/lang/Object;)V", "d", "(I)Ljava/lang/Object;", "LD0/c;", "c", "()LD0/c;", "Lkotlin/jvm/functions/Function0;", "getOnVectorMutated", "()Lkotlin/jvm/functions/Function0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.node.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5942a0<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final int f51701c = D0.c.f5876d;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final D0.c<T> vector;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onVectorMutated;

    public final void a(int index, T element) {
        this.vector.a(index, element);
        this.onVectorMutated.invoke();
    }

    public final void b() {
        this.vector.k();
        this.onVectorMutated.invoke();
    }

    public final D0.c<T> c() {
        return this.vector;
    }

    public final T d(int index) {
        T tU = this.vector.u(index);
        this.onVectorMutated.invoke();
        return tU;
    }

    public C5942a0(D0.c<T> cVar, Function0<Unit> function0) {
        this.vector = cVar;
        this.onVectorMutated = function0;
    }
}
