package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J3\u0010\u0006\u001a\u00020\u00072\u001f\u0010\b\u001a\u001b\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\b\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\f\u001a\u00020\u0007H&J\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0014J \u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0012H&J\b\u0010\u001a\u001a\u00020\u0007H\u0016J\b\u0010\u001b\u001a\u00020\u0007H\u0016J\u0018\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0012H&J\b\u0010\u001d\u001a\u00020\u0007H\u0016J\b\u0010\u001e\u001a\u00020\u0007H&R\u0012\u0010\u0003\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/Applier;", "N", "", "current", "getCurrent", "()Ljava/lang/Object;", "apply", "", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "value", "clear", "down", "node", "(Ljava/lang/Object;)V", "insertBottomUp", "index", "", "instance", "(ILjava/lang/Object;)V", "insertTopDown", "move", "from", "to", "count", "onBeginChanges", "onEndChanges", "remove", "reuse", "up", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Applier<N> {
    void clear();

    void down(N node);

    N getCurrent();

    void insertBottomUp(int index, N instance);

    void insertTopDown(int index, N instance);

    void move(int from, int to2, int count);

    default void onBeginChanges() {
    }

    default void onEndChanges() {
    }

    void remove(int index, int count);

    void up();

    default void apply(Function2<? super N, Object, Unit> block, Object value) {
        block.invoke(getCurrent(), value);
    }

    default void reuse() {
        InterfaceC5861g interfaceC5861g;
        N current = getCurrent();
        if (current instanceof InterfaceC5861g) {
            interfaceC5861g = (InterfaceC5861g) current;
        } else {
            interfaceC5861g = null;
        }
        if (interfaceC5861g != null) {
            interfaceC5861g.l();
        }
    }
}
