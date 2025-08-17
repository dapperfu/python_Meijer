package l0;

import androidx.compose.runtime.C5702c1;
import androidx.compose.runtime.InterfaceC5726j0;
import i0.C14589e;
import kotlin.C15717C;
import kotlin.C15759s;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u001d\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015R+\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u0010R+\u0010\b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u0010R\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u0017\u0010&\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b\u001b\u0010%¨\u0006'"}, d2 = {"Ll0/x;", "", "", "initialIndex", "initialScrollOffset", "<init>", "(II)V", "index", "scrollOffset", "", "g", "Ll0/q;", "measureResult", "h", "(Ll0/q;)V", "i", "(I)V", "d", "Ll0/j;", "itemProvider", "j", "(Ll0/j;I)I", "<set-?>", "a", "Landroidx/compose/runtime/j0;", "()I", "e", "b", "c", "f", "", "Z", "hadFirstNotEmptyLayout", "Ljava/lang/Object;", "lastKnownFirstItemKey", "Ln0/C;", "Ln0/C;", "()Ln0/C;", "nearestRangeState", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5726j0 index;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5726j0 scrollOffset;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean hadFirstNotEmptyLayout;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Object lastKnownFirstItemKey;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C15717C nearestRangeState;

    private final void g(int index, int scrollOffset) {
        if (!(((float) index) >= 0.0f)) {
            C14589e.a("Index should be non-negative (" + index + ')');
        }
        e(index);
        this.nearestRangeState.l(index);
        f(scrollOffset);
    }

    public final void i(int scrollOffset) {
        if (!(((float) scrollOffset) >= 0.0f)) {
            C14589e.c("scrollOffset should be non-negative");
        }
        f(scrollOffset);
    }

    private final void f(int i10) {
        this.scrollOffset.j(i10);
    }

    public final int a() {
        return this.index.a();
    }

    /* renamed from: b, reason: from getter */
    public final C15717C getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final int c() {
        return this.scrollOffset.a();
    }

    public final void e(int i10) {
        this.index.j(i10);
    }

    public final int j(InterfaceC15350j itemProvider, int index) {
        int iA = C15759s.a(itemProvider, this.lastKnownFirstItemKey, index);
        if (index != iA) {
            e(iA);
            this.nearestRangeState.l(index);
        }
        return iA;
    }

    public x(int i10, int i11) {
        this.index = C5702c1.a(i10);
        this.scrollOffset = C5702c1.a(i11);
        this.nearestRangeState = new C15717C(i10, 30, 100);
    }

    public final void d(int index, int scrollOffset) {
        g(index, scrollOffset);
        this.lastKnownFirstItemKey = null;
    }

    public final void h(q measureResult) {
        Object key;
        r firstVisibleItem = measureResult.getFirstVisibleItem();
        if (firstVisibleItem != null) {
            key = firstVisibleItem.getKey();
        } else {
            key = null;
        }
        this.lastKnownFirstItemKey = key;
        if (!this.hadFirstNotEmptyLayout && measureResult.getTotalItemsCount() <= 0) {
            return;
        }
        boolean z10 = true;
        this.hadFirstNotEmptyLayout = true;
        int firstVisibleItemScrollOffset = measureResult.getFirstVisibleItemScrollOffset();
        int index = 0;
        if (firstVisibleItemScrollOffset < 0.0f) {
            z10 = false;
        }
        if (!z10) {
            C14589e.c("scrollOffset should be non-negative");
        }
        r firstVisibleItem2 = measureResult.getFirstVisibleItem();
        if (firstVisibleItem2 != null) {
            index = firstVisibleItem2.getIndex();
        }
        g(index, firstVisibleItemScrollOffset);
    }
}
