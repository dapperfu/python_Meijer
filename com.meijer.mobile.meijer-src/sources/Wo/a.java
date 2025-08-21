package Wo;

import Co.Image;
import So.MultiUPCQuery;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import nk.g;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\b2\u0010\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LSo/c$l;", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "LCo/h;", "e", "(LSo/c$l;Ljava/lang/Integer;)LCo/h;", "LSo/c$q;", "", "LCo/k;", "d", "(LSo/c$q;)Ljava/util/List;", "LSo/c$n;", "LCo/o;", "c", "(LSo/c$n;)LCo/o;", "stock", "", "a", "(LSo/c$n;)Z", "LSo/c$j;", "images", "LCo/e;", "b", "(Ljava/util/List;)Ljava/util/List;", "apollo_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class a {
    private static final boolean a(MultiUPCQuery.Stock stock) {
        String stockStatus = stock != null ? stock.getStockStatus() : null;
        if (stockStatus == null) {
            return false;
        }
        int iHashCode = stockStatus.hashCode();
        return iHashCode != -1834264542 ? iHashCode != -442154872 ? iHashCode == 1928030449 && stockStatus.equals("inStock") : stockStatus.equals("inStoreOnly") : stockStatus.equals("lowStock");
    }

    private static final List<Image> b(List<MultiUPCQuery.ProductMedium> list) {
        String altText;
        if (list == null) {
            list = CollectionsKt.m();
        }
        List<MultiUPCQuery.ProductMedium> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
        for (MultiUPCQuery.ProductMedium productMedium : list2) {
            int iMax = Math.max(productMedium != null ? productMedium.getHeight() : 0, productMedium != null ? productMedium.getWidth() : 0);
            String url = productMedium != null ? productMedium.getUrl() : null;
            if (url == null) {
                url = "";
            }
            arrayList.add(new Image(url, (productMedium == null || (altText = productMedium.getAltText()) == null) ? productMedium != null ? productMedium.getDefaultAltText() : null : altText, g.INSTANCE.a(iMax), (productMedium == null || !productMedium.getIsDefault()) ? g.c.f152491c : g.c.f152490b, null, 16, null));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final Co.StockInfo c(So.MultiUPCQuery.Stock r12) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.j(r12, r0)
            java.lang.String r0 = r12.getIlcPrimary()
            if (r0 == 0) goto L13
            Co.g$a r1 = Co.ItemLocation.INSTANCE
            Co.g r0 = r1.a(r0)
        L11:
            r5 = r0
            goto L15
        L13:
            r0 = 0
            goto L11
        L15:
            java.lang.String r6 = r12.getIlcs()
            if (r6 == 0) goto L50
            java.lang.String r0 = ","
            java.lang.String[] r7 = new java.lang.String[]{r0}
            r10 = 6
            r11 = 0
            r8 = 0
            r9 = 0
            java.util.List r0 = kotlin.text.StringsKt.b1(r6, r7, r8, r9, r10, r11)
            if (r0 == 0) goto L50
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L36:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4e
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            Co.g$a r3 = Co.ItemLocation.INSTANCE
            Co.g r2 = r3.a(r2)
            if (r2 == 0) goto L36
            r1.add(r2)
            goto L36
        L4e:
            r6 = r1
            goto L55
        L50:
            java.util.List r1 = kotlin.collections.CollectionsKt.m()
            goto L4e
        L55:
            java.lang.String r12 = r12.getStockStatus()
            r0 = 0
            if (r12 == 0) goto L9e
            int r1 = r12.hashCode()
            switch(r1) {
                case -1834264542: goto L8f;
                case -955663279: goto L83;
                case -442154872: goto L74;
                case 1928030449: goto L64;
                default: goto L63;
            }
        L63:
            goto L9e
        L64:
            java.lang.String r1 = "inStock"
            boolean r12 = r12.equals(r1)
            if (r12 != 0) goto L6d
            goto L9e
        L6d:
            nk.n$a r12 = new nk.n$a
            r12.<init>(r0)
        L72:
            r4 = r12
            goto La4
        L74:
            java.lang.String r1 = "inStoreOnly"
            boolean r12 = r12.equals(r1)
            if (r12 != 0) goto L7d
            goto L9e
        L7d:
            nk.n$b r12 = new nk.n$b
            r12.<init>(r0)
            goto L72
        L83:
            java.lang.String r1 = "outOfStock"
            boolean r12 = r12.equals(r1)
            if (r12 != 0) goto L8c
            goto L9e
        L8c:
            nk.n$d r12 = nk.n.d.f152513a
            goto L72
        L8f:
            java.lang.String r1 = "lowStock"
            boolean r12 = r12.equals(r1)
            if (r12 != 0) goto L98
            goto L9e
        L98:
            nk.n$c r12 = new nk.n$c
            r12.<init>(r0)
            goto L72
        L9e:
            nk.n$a r12 = new nk.n$a
            r12.<init>(r0)
            goto L72
        La4:
            Co.o r1 = new Co.o
            r8 = 3
            r9 = 0
            r2 = 0
            r3 = 0
            r7 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Wo.a.c(So.c$n):Co.o");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<Co.ProductVariantGroup> d(So.MultiUPCQuery.Variants r26) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Wo.a.d(So.c$q):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0409  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final Co.ProductFullDetails e(So.MultiUPCQuery.ProductsMultiUpc r75, java.lang.Integer r76) {
        /*
            Method dump skipped, instructions count: 1119
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Wo.a.e(So.c$l, java.lang.Integer):Co.h");
    }
}
