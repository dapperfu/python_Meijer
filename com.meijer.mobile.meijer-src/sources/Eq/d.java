package Eq;

import Fq.ShoppingListItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "LFq/c;", "", "b", "(Ljava/util/List;)Ljava/lang/String;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class d {
    public static final String b(List<ShoppingListItem> list) {
        Intrinsics.j(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((ShoppingListItem) obj).getIsComplete()) {
                arrayList.add(obj);
            }
        }
        final String str = "•";
        return StringsKt.C1(CollectionsKt.B0(arrayList, "\n", null, null, 0, null, new Function1() { // from class: Eq.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return d.c(str, (ShoppingListItem) obj2);
            }
        }, 30, null)).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence c(String str, ShoppingListItem item) {
        String string;
        Intrinsics.j(item, "item");
        Integer numValueOf = Integer.valueOf(item.getQuantity());
        String str2 = null;
        if (numValueOf.intValue() <= 1) {
            numValueOf = null;
        }
        String itemDescription = item.getItemDescription();
        String notes = item.getNotes();
        if (notes != null && (string = StringsKt.C1(notes).toString()) != null) {
            if (StringsKt.s0(string)) {
                string = null;
            }
            if (string != null) {
                str2 = "(\"" + string + "\")";
            }
        }
        return CollectionsKt.B0(CollectionsKt.r(str, numValueOf, itemDescription, str2), " ", null, null, 0, null, null, 62, null);
    }
}
