package Io;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/product/model/hybris/api/models/HybrisStockInfo;", "LCo/o;", "a", "(Lcom/meijer/mobile/product/model/hybris/api/models/HybrisStockInfo;)LCo/o;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class e {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final Co.StockInfo a(com.meijer.mobile.product.model.hybris.api.models.HybrisStockInfo r8) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.j(r8, r0)
            java.lang.String r2 = r8.getEligibility()
            int r3 = r8.getLevel()
            java.lang.String r0 = r8.getStockLevelStatus()
            if (r0 == 0) goto L61
            int r1 = r0.hashCode()
            switch(r1) {
                case -1834264542: goto L4e;
                case -955663279: goto L42;
                case -442154872: goto L2f;
                case 1928030449: goto L1b;
                default: goto L1a;
            }
        L1a:
            goto L61
        L1b:
            java.lang.String r1 = "inStock"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L24
            goto L61
        L24:
            nk.n$a r0 = new nk.n$a
            int r1 = r8.getLevel()
            r0.<init>(r1)
        L2d:
            r4 = r0
            goto L6b
        L2f:
            java.lang.String r1 = "inStoreOnly"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L38
            goto L61
        L38:
            nk.n$b r0 = new nk.n$b
            int r1 = r8.getLevel()
            r0.<init>(r1)
            goto L2d
        L42:
            java.lang.String r1 = "outOfStock"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4b
            goto L61
        L4b:
            nk.n$d r0 = nk.n.d.f152513a
            goto L2d
        L4e:
            java.lang.String r1 = "lowStock"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L57
            goto L61
        L57:
            nk.n$c r0 = new nk.n$c
            int r1 = r8.getLevel()
            r0.<init>(r1)
            goto L2d
        L61:
            nk.n$a r0 = new nk.n$a
            int r1 = r8.getLevel()
            r0.<init>(r1)
            goto L2d
        L6b:
            java.lang.String r0 = r8.getIlcPrimary()
            if (r0 == 0) goto L79
            Co.g$a r1 = Co.ItemLocation.INSTANCE
            Co.g r0 = r1.a(r0)
        L77:
            r5 = r0
            goto L7b
        L79:
            r0 = 0
            goto L77
        L7b:
            java.util.List r0 = r8.c()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r0 = r0.iterator()
        L8a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La2
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            Co.g$a r7 = Co.ItemLocation.INSTANCE
            Co.g r1 = r7.a(r1)
            if (r1 == 0) goto L8a
            r6.add(r1)
            goto L8a
        La2:
            boolean r7 = r8.getIsNewILC()
            Co.o r1 = new Co.o
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Io.e.a(com.meijer.mobile.product.model.hybris.api.models.HybrisStockInfo):Co.o");
    }
}
