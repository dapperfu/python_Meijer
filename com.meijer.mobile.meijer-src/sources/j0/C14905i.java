package j0;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eRJ\u0010\u0017\u001a8\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00140\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u000eR\u0016\u0010\u001e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u000eR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\r\u0010\u001f¨\u0006!"}, d2 = {"Lj0/i;", "", "Landroidx/compose/ui/layout/I;", "", "hasNext", "()Z", "f", "()Landroidx/compose/ui/layout/I;", "Lj0/p;", "info", "c", "(Lj0/p;)Landroidx/compose/ui/layout/I;", "", "a", "I", "itemCount", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "index", "", "b", "Lkotlin/jvm/functions/Function2;", "getMeasurables", "", "Ljava/util/List;", "_list", "d", "itemIndex", "e", "listIndex", "()Ljava/util/List;", "list", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: j0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14905i implements Iterator<androidx.compose.ui.layout.I>, KMappedMarker {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int itemCount;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function2<Integer, C14912p, List<androidx.compose.ui.layout.I>> getMeasurables;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<androidx.compose.ui.layout.I> _list;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int itemIndex;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int listIndex;

    @Override // java.util.Iterator
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public androidx.compose.ui.layout.I next() {
        return d(this, null, 1, null);
    }

    public static /* synthetic */ androidx.compose.ui.layout.I d(C14905i c14905i, C14912p c14912p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c14912p = new C14912p(0, 0, 0.0f, 0.0f, 15, null);
        }
        return c14905i.c(c14912p);
    }

    public final List<androidx.compose.ui.layout.I> a() {
        return this._list;
    }

    public final androidx.compose.ui.layout.I c(C14912p info) {
        if (this.listIndex < a().size()) {
            androidx.compose.ui.layout.I i10 = a().get(this.listIndex);
            this.listIndex++;
            return i10;
        }
        int i11 = this.itemIndex;
        if (i11 >= this.itemCount) {
            throw new IndexOutOfBoundsException("No item returned at index call. Index: " + this.itemIndex);
        }
        List<androidx.compose.ui.layout.I> listInvoke = this.getMeasurables.invoke(Integer.valueOf(i11), info);
        this.itemIndex++;
        if (listInvoke.isEmpty()) {
            return next();
        }
        androidx.compose.ui.layout.I i12 = (androidx.compose.ui.layout.I) CollectionsKt.s0(listInvoke);
        this._list.addAll(listInvoke);
        this.listIndex++;
        return i12;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.listIndex < a().size() || this.itemIndex < this.itemCount;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
