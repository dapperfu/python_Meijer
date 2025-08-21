package yu;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l0.InterfaceC15439i;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\tR\u0014\u0010\f\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\u000e\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006\u000f"}, d2 = {"Lyu/c;", "Lyu/i;", "Ll0/i;", "lazyListItem", "<init>", "(Ll0/i;)V", "a", "Ll0/i;", "", "()I", "index", "b", "offset", "c", "size", "lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
final class c extends SnapperLayoutItemInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15439i lazyListItem;

    public c(InterfaceC15439i lazyListItem) {
        Intrinsics.j(lazyListItem, "lazyListItem");
        this.lazyListItem = lazyListItem;
    }

    @Override // yu.SnapperLayoutItemInfo
    public int a() {
        return this.lazyListItem.getIndex();
    }

    @Override // yu.SnapperLayoutItemInfo
    public int b() {
        return this.lazyListItem.getOffset();
    }

    @Override // yu.SnapperLayoutItemInfo
    public int c() {
        return this.lazyListItem.getSize();
    }
}
