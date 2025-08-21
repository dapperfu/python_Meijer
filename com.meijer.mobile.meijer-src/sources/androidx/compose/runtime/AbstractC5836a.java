package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0007H$¢\u0006\u0004\b\f\u0010\nJ)\u0010\u0011\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR*\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00028\u00008\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019\"\u0004\b \u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/runtime/a;", "T", "Landroidx/compose/runtime/Applier;", "root", "<init>", "(Ljava/lang/Object;)V", "node", "", "down", "up", "()V", "clear", "onClear", "", "", "index", "count", "remove", "(Ljava/util/List;II)V", "from", "to", "move", "(Ljava/util/List;III)V", "Ljava/lang/Object;", "getRoot", "()Ljava/lang/Object;", "Landroidx/compose/runtime/y1;", "stack", "Ljava/util/ArrayList;", "<set-?>", "current", "getCurrent", "setCurrent", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5836a<T> implements Applier<T> {
    public static final int $stable = 8;
    private T current;
    private final T root;
    private final ArrayList<T> stack = y1.c(null, 1, null);

    protected abstract void onClear();

    protected final void remove(List<T> list, int i10, int i11) {
        if (i11 == 1) {
            list.remove(i10);
        } else {
            list.subList(i10, i11 + i10).clear();
        }
    }

    @Override // androidx.compose.runtime.Applier
    public final void clear() {
        y1.a(this.stack);
        setCurrent(this.root);
        onClear();
    }

    @Override // androidx.compose.runtime.Applier
    public void down(T node) {
        y1.j(this.stack, getCurrent());
        setCurrent(node);
    }

    @Override // androidx.compose.runtime.Applier
    public T getCurrent() {
        return this.current;
    }

    public final T getRoot() {
        return this.root;
    }

    protected final void move(List<T> list, int i10, int i11, int i12) {
        int i13 = i10 > i11 ? i11 : i11 - i12;
        if (i12 != 1) {
            List<T> listSubList = list.subList(i10, i12 + i10);
            List listM1 = CollectionsKt.m1(listSubList);
            listSubList.clear();
            list.addAll(i13, listM1);
            return;
        }
        if (i10 == i11 + 1 || i10 == i11 - 1) {
            list.set(i10, list.set(i11, list.get(i10)));
        } else {
            list.add(i13, list.remove(i10));
        }
    }

    protected void setCurrent(T t10) {
        this.current = t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.Applier
    public void up() {
        setCurrent(y1.i(this.stack));
    }

    public AbstractC5836a(T t10) {
        this.root = t10;
        this.current = t10;
    }
}
