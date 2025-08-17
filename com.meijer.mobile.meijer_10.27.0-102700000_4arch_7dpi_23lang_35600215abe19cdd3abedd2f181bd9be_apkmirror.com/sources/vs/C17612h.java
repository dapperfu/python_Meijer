package vs;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"", "Lvs/f;", "", "isSponsoredProductBuyAgainEnabled", "isSponsoredProductFavOnSaleEnabled", "b", "(Ljava/util/List;ZZ)Ljava/util/List;", "isSponsoredProductBuyAgain", "c", "products_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: vs.h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C17612h {
    /* JADX WARN: Multi-variable type inference failed */
    public static final List<ProductListDecorator> b(List<ProductListDecorator> list, boolean z10, boolean z11) {
        Intrinsics.j(list, "<this>");
        List<ProductListDecorator> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((ProductListDecorator) obj).getProduct().getIsSponsoredCriteo() && (z10 || z11)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (!((ProductListDecorator) obj2).getProduct().getIsSponsoredCriteo() || (!z10 && !z11)) {
                arrayList2.add(obj2);
            }
        }
        List<ProductListDecorator> listM1 = CollectionsKt.m1(arrayList2);
        if (!arrayList.isEmpty()) {
            listM1.add(Math.min(2, listM1.size()), arrayList.get(0));
        }
        if (arrayList.size() >= 2) {
            listM1.add(listM1.size() <= 5 ? listM1.size() : 5, arrayList.get(1));
        }
        return listM1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List<ProductListDecorator> c(List<ProductListDecorator> list, final boolean z10, final boolean z11) {
        Intrinsics.j(list, "<this>");
        List<ProductListDecorator> listM1 = CollectionsKt.m1(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM1) {
            if (((ProductListDecorator) obj).getProduct().getIsSponsoredCriteo() && (z10 || z11)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            CollectionsKt.J(listM1, new Function1() { // from class: vs.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(C17612h.d(z10, z11, (ProductListDecorator) obj2));
                }
            });
            if (!arrayList.isEmpty()) {
                listM1.add(1, arrayList.get(0));
            }
            if (arrayList.size() > 1) {
                listM1.add(listM1.size() <= 4 ? listM1.size() : 4, arrayList.get(1));
            }
            if (arrayList.size() > 2) {
                listM1.addAll(arrayList.subList(2, arrayList.size()));
            }
        }
        return listM1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(boolean z10, boolean z11, ProductListDecorator decorator) {
        Intrinsics.j(decorator, "decorator");
        if (decorator.getProduct().getIsSponsoredCriteo()) {
            return z10 || z11;
        }
        return false;
    }
}
