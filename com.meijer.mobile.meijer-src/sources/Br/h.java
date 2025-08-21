package Br;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15429A;
import l0.InterfaceC15439i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll0/A;", "", "b", "(Ll0/A;Landroidx/compose/runtime/Composer;I)I", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class h {
    public static final int b(final C15429A c15429a, Composer composer, int i10) {
        Intrinsics.j(c15429a, "<this>");
        composer.startReplaceGroup(1562810302);
        if (ComposerKt.M()) {
            ComposerKt.U(1562810302, i10, -1, "com.meijer.mobile.ui.common.compose.getCurrentListItemIndex (LazyListStateExt.kt:20)");
        }
        composer.startReplaceGroup(5004770);
        boolean z10 = (((i10 & 14) ^ 6) > 4 && composer.V(c15429a)) || (i10 & 6) == 4;
        Object objB = composer.B();
        if (z10 || objB == Composer.INSTANCE.a()) {
            final float f10 = 0.85f;
            objB = o1.e(new Function0() { // from class: Br.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Integer.valueOf(h.c(c15429a, f10));
                }
            });
            composer.t(objB);
        }
        composer.P();
        int iIntValue = ((Number) ((z1) objB).getValue()).intValue();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return iIntValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(C15429A c15429a, float f10) {
        List<InterfaceC15439i> listH = c15429a.x().h();
        if (c15429a.x().getTotalItemsCount() == 0) {
            return 1;
        }
        List listM1 = CollectionsKt.m1(listH);
        InterfaceC15439i interfaceC15439i = (InterfaceC15439i) CollectionsKt.D0(listM1);
        if (interfaceC15439i.getOffset() + (interfaceC15439i.getSize() * f10) > c15429a.x().getViewportEndOffset() + c15429a.x().getViewportStartOffset()) {
            listM1.remove(CollectionsKt.o(listM1));
        }
        if (((InterfaceC15439i) CollectionsKt.u0(listM1)) != null && r3.getOffset() + (interfaceC15439i.getSize() * f10) < c15429a.x().getViewportStartOffset()) {
            listM1.remove(0);
        }
        List list = listM1;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((InterfaceC15439i) it.next()).getIndex()));
        }
        Integer num = (Integer) CollectionsKt.u0(arrayList);
        if (num == null) {
            return 1;
        }
        return num.intValue() + 1;
    }
}
