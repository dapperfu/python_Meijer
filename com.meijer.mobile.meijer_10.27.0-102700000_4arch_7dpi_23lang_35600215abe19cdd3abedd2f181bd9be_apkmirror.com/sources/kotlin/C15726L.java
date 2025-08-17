package kotlin;

import Z.AbstractC5517o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\u001ao\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0004\u0018\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0013\u001a\u00020\u0007*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Ln0/y;", "T", "Ln0/a0;", "", "positionedItems", "LZ/o;", "stickyItems", "", "beforeContentPadding", "afterContentPadding", "layoutWidth", "layoutHeight", "Lkotlin/Function1;", "getAndMeasure", "", "b", "(Ln0/a0;Ljava/util/List;LZ/o;IIIILkotlin/jvm/functions/Function1;)Ljava/util/List;", "c", "(Ln0/y;)I", "mainAxisOffset", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: n0.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15726L {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(InterfaceC15765y interfaceC15765y) {
        long jL = interfaceC15765y.l(0);
        return interfaceC15765y.getIsVertical() ? H1.n.l(jL) : H1.n.k(jL);
    }

    public static final <T extends InterfaceC15765y> List<T> b(InterfaceC15741a0 interfaceC15741a0, List<T> list, AbstractC5517o abstractC5517o, int i10, int i11, int i12, int i13, Function1<? super Integer, ? extends T> function1) {
        InterfaceC15741a0 interfaceC15741a02 = interfaceC15741a0;
        if (interfaceC15741a02 == null || list.isEmpty() || abstractC5517o._size == 0) {
            return CollectionsKt.m();
        }
        AbstractC5517o abstractC5517oB = interfaceC15741a02.b(((InterfaceC15765y) CollectionsKt.s0(list)).getIndex(), ((InterfaceC15765y) CollectionsKt.D0(list)).getIndex(), abstractC5517o);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list.size());
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            T t10 = list.get(i14);
            if (abstractC5517o.c(t10.getIndex())) {
                arrayList2.add(t10);
            }
        }
        int[] iArr = abstractC5517oB.content;
        int i15 = abstractC5517oB._size;
        int i16 = 0;
        while (i16 < i15) {
            int i17 = iArr[i16];
            Iterator<T> it = list.iterator();
            int i18 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i18 = -1;
                    break;
                }
                if (it.next().getIndex() == i17) {
                    break;
                }
                i18++;
            }
            T tInvoke = i18 == -1 ? function1.invoke(Integer.valueOf(i17)) : list.remove(i18);
            ArrayList arrayList3 = arrayList2;
            T t11 = tInvoke;
            int iA = interfaceC15741a02.a(arrayList3, i17, tInvoke.getMainAxisSizeWithSpacings(), i18 == -1 ? Integer.MIN_VALUE : c(tInvoke), i10, i11, i12, i13);
            t11.d(true);
            t11.h(iA, 0, i12, i13);
            arrayList.add(t11);
            i16++;
            interfaceC15741a02 = interfaceC15741a0;
            arrayList2 = arrayList3;
        }
        return arrayList;
    }
}
