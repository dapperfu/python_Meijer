package il;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/Cart;", "Lcom/meijer/mobile/cart/model/hybris/EntryJson;", "initialEntry", "", "requestedQuantity", "Lcom/meijer/mobile/cart/model/hybris/CartModification;", "a", "(Lcom/meijer/mobile/cart/model/hybris/Cart;Lcom/meijer/mobile/cart/model/hybris/EntryJson;D)Lcom/meijer/mobile/cart/model/hybris/CartModification;", "digitalshopping_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class x {
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.meijer.mobile.cart.model.hybris.CartModification a(com.meijer.mobile.cart.model.hybris.Cart r28, com.meijer.mobile.cart.model.hybris.EntryJson r29, double r30) {
        /*
            java.lang.String r0 = "<this>"
            r1 = r28
            kotlin.jvm.internal.Intrinsics.j(r1, r0)
            java.util.List r0 = r1.v()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            r3 = r1
            com.meijer.mobile.cart.model.hybris.EntryJson r3 = (com.meijer.mobile.cart.model.hybris.EntryJson) r3
            if (r29 == 0) goto L11
            int r3 = r3.getEntryNumber()
            int r4 = r29.getEntryNumber()
            if (r3 != r4) goto L11
            goto L2d
        L2c:
            r1 = r2
        L2d:
            com.meijer.mobile.cart.model.hybris.EntryJson r1 = (com.meijer.mobile.cart.model.hybris.EntryJson) r1
            if (r1 != 0) goto L5a
            if (r29 == 0) goto L5c
            r26 = 262127(0x3ffef, float:3.67318E-40)
            r27 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r3 = r29
            com.meijer.mobile.cart.model.hybris.EntryJson r1 = com.meijer.mobile.cart.model.hybris.EntryJson.a(r3, r4, r5, r6, r7, r9, r11, r12, r13, r14, r15, r16, r17, r19, r21, r22, r23, r24, r25, r26, r27)
        L5a:
            r4 = r1
            goto L5d
        L5c:
            r4 = r2
        L5d:
            r0 = 0
            if (r29 == 0) goto L66
            double r5 = r29.getActualQuantity()
            goto L67
        L66:
            r5 = r0
        L67:
            double r5 = r30 - r5
            if (r4 == 0) goto L70
            double r7 = r4.getActualQuantity()
            goto L71
        L70:
            r7 = r0
        L71:
            if (r29 == 0) goto L78
            double r9 = r29.getActualQuantity()
            goto L79
        L78:
            r9 = r0
        L79:
            double r9 = r7 - r9
            com.meijer.mobile.cart.model.hybris.CartModification r3 = new com.meijer.mobile.cart.model.hybris.CartModification
            int r7 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r7 > 0) goto L8d
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 <= 0) goto L8d
            fj.j$c r0 = fj.EntryChange.c.f131921c
            java.lang.String r0 = r0.getCode()
        L8b:
            r13 = r0
            goto Lba
        L8d:
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 >= 0) goto L98
            fj.j$c r0 = fj.EntryChange.c.f131922d
            java.lang.String r0 = r0.getCode()
            goto L8b
        L98:
            int r7 = (r30 > r0 ? 1 : (r30 == r0 ? 0 : -1))
            if (r7 != 0) goto Lb3
            if (r4 == 0) goto La6
            double r7 = r4.getActualQuantity()
            java.lang.Double r2 = java.lang.Double.valueOf(r7)
        La6:
            boolean r0 = kotlin.jvm.internal.Intrinsics.b(r2, r0)
            if (r0 == 0) goto Lb3
            fj.j$c r0 = fj.EntryChange.c.f131924f
            java.lang.String r0 = r0.getCode()
            goto L8b
        Lb3:
            fj.j$c r0 = fj.EntryChange.c.f131920b
            java.lang.String r0 = r0.getCode()
            goto L8b
        Lba:
            r18 = 212(0xd4, float:2.97E-43)
            r19 = 0
            r7 = 0
            r11 = 0
            r14 = 0
            r16 = 0
            r3.<init>(r4, r5, r7, r9, r11, r13, r14, r16, r18, r19)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: il.x.a(com.meijer.mobile.cart.model.hybris.Cart, com.meijer.mobile.cart.model.hybris.EntryJson, double):com.meijer.mobile.cart.model.hybris.CartModification");
    }
}
