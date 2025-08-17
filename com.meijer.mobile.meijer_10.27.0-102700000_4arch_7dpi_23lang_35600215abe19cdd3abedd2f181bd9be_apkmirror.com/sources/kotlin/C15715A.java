package kotlin;

import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Ln0/y;", "T", "", "firstVisibleIndex", "lastVisibleIndex", "", "positionedItems", "stickingItems", "c", "(IILjava/util/List;Ljava/util/List;)Ljava/util/List;", "Ljava/util/Comparator;", "a", "Ljava/util/Comparator;", "LazyLayoutMeasuredItemIndexComparator", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: n0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15715A {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator<InterfaceC15765y> f150778a = new Comparator() { // from class: n0.z
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C15715A.b((InterfaceC15765y) obj, (InterfaceC15765y) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(InterfaceC15765y interfaceC15765y, InterfaceC15765y interfaceC15765y2) {
        return Intrinsics.k(interfaceC15765y.getIndex(), interfaceC15765y2.getIndex());
    }

    public static final <T extends InterfaceC15765y> List<T> c(int i10, int i11, List<? extends T> list, List<? extends T> list2) {
        if (list.isEmpty()) {
            return CollectionsKt.m();
        }
        List<T> listM1 = CollectionsKt.m1(list2);
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            T t10 = list.get(i12);
            int index = t10.getIndex();
            if (i10 <= index && index <= i11) {
                listM1.add(t10);
            }
        }
        CollectionsKt.B(listM1, f150778a);
        return listM1;
    }
}
