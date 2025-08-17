package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.C15720F;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ln0/r;", "Ln0/F;", "pinnedItemList", "Ln0/i;", "beyondBoundsInfo", "", "", "a", "(Ln0/r;Ln0/F;Ln0/i;)Ljava/util/List;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: n0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15752l {
    public static final List<Integer> a(InterfaceC15758r interfaceC15758r, C15720F c15720f, C15749i c15749i) {
        IntRange intRangeA;
        if (!c15749i.d() && c15720f.isEmpty()) {
            return CollectionsKt.m();
        }
        ArrayList arrayList = new ArrayList();
        if (c15749i.d()) {
            intRangeA = new IntRange(c15749i.c(), Math.min(c15749i.b(), interfaceC15758r.a() - 1));
        } else {
            intRangeA = IntRange.INSTANCE.a();
        }
        int size = c15720f.size();
        for (int i10 = 0; i10 < size; i10++) {
            C15720F.a aVar = c15720f.get(i10);
            int iA = C15759s.a(interfaceC15758r, aVar.getKey(), aVar.getIndex());
            int first = intRangeA.getFirst();
            if ((iA > intRangeA.getLast() || first > iA) && iA >= 0 && iA < interfaceC15758r.a()) {
                arrayList.add(Integer.valueOf(iA));
            }
        }
        int first2 = intRangeA.getFirst();
        int last = intRangeA.getLast();
        if (first2 <= last) {
            while (true) {
                arrayList.add(Integer.valueOf(first2));
                if (first2 == last) {
                    break;
                }
                first2++;
            }
        }
        return arrayList;
    }
}
