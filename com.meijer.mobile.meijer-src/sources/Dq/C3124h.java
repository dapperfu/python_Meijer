package Dq;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import l0.C15429A;
import l0.InterfaceC15439i;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0018\u0010\u000f\u001a\u00020\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Ll0/A;", "", "absoluteIndex", "Ll0/i;", "b", "(Ll0/A;I)Ll0/i;", "T", "", "from", "to", "", "c", "(Ljava/util/List;II)V", "a", "(Ll0/i;)I", "offsetEnd", "shoppinglist_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: Dq.h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C3124h {
    public static final int a(InterfaceC15439i interfaceC15439i) {
        Intrinsics.j(interfaceC15439i, "<this>");
        return interfaceC15439i.getOffset() + interfaceC15439i.getSize();
    }

    public static final InterfaceC15439i b(C15429A c15429a, int i10) {
        Intrinsics.j(c15429a, "<this>");
        return (InterfaceC15439i) CollectionsKt.v0(c15429a.x().h(), i10 - ((InterfaceC15439i) CollectionsKt.s0(c15429a.x().h())).getIndex());
    }

    public static final <T> void c(List<T> list, int i10, int i11) {
        T tRemove;
        Intrinsics.j(list, "<this>");
        if (i10 == i11 || (tRemove = list.remove(i10)) == null) {
            return;
        }
        list.add(i11, tRemove);
    }
}
