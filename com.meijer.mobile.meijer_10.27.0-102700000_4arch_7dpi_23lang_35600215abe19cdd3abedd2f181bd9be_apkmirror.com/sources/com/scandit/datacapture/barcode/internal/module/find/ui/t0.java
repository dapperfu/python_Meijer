package com.scandit.datacapture.barcode.internal.module.find.ui;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class t0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f122278a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f122279b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f122280c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, LinkedHashMap linkedHashMap, Map map) {
        super(1);
        this.f122278a = u0Var;
        this.f122279b = linkedHashMap;
        this.f122280c = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView r1 = (com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView) r1
            java.lang.String r2 = "it"
            kotlin.jvm.internal.Intrinsics.j(r1, r2)
            com.scandit.datacapture.barcode.internal.module.find.ui.u0 r1 = r0.f122278a
            com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView r2 = r1.f122289i
            java.util.Map r3 = r0.f122279b
            java.util.Map r4 = r0.f122280c
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r3.size()
            r5.<init>(r6)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L24:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto Le2
            java.lang.Object r6 = r3.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getValue()
            com.scandit.datacapture.barcode.find.capture.BarcodeFindItem r6 = (com.scandit.datacapture.barcode.find.capture.BarcodeFindItem) r6
            com.scandit.datacapture.barcode.find.capture.BarcodeFindItemContent r7 = r6.getContent()
            r8 = 0
            if (r7 == 0) goto L42
            java.lang.String r7 = r7.getInfo()
            goto L43
        L42:
            r7 = r8
        L43:
            if (r7 != 0) goto L5d
            com.scandit.datacapture.barcode.find.capture.BarcodeFindItemContent r7 = r6.getContent()
            if (r7 == 0) goto L50
            java.lang.String r7 = r7.getAdditionalInfo()
            goto L51
        L50:
            r7 = r8
        L51:
            if (r7 != 0) goto L5d
            com.scandit.datacapture.barcode.find.capture.BarcodeFindItemSearchOptions r7 = r6.getSearchOptions()
            java.lang.String r7 = r7.getBarcodeData()
        L5b:
            r11 = r7
            goto L79
        L5d:
            com.scandit.datacapture.barcode.find.capture.BarcodeFindItemContent r7 = r6.getContent()
            java.lang.String r7 = r7.getInfo()
            if (r7 != 0) goto L70
            com.scandit.datacapture.barcode.find.capture.BarcodeFindItemContent r7 = r6.getContent()
            java.lang.String r7 = r7.getAdditionalInfo()
            goto L5b
        L70:
            com.scandit.datacapture.barcode.find.capture.BarcodeFindItemContent r7 = r6.getContent()
            java.lang.String r7 = r7.getInfo()
            goto L5b
        L79:
            int r7 = r6.hashCode()
            java.lang.String r10 = java.lang.String.valueOf(r7)
            com.scandit.datacapture.barcode.find.capture.BarcodeFindItemContent r7 = r6.getContent()
            if (r7 == 0) goto L98
            java.lang.String r7 = r7.getInfo()
            if (r7 == 0) goto L98
            com.scandit.datacapture.barcode.find.capture.BarcodeFindItemContent r7 = r6.getContent()
            java.lang.String r7 = r7.getAdditionalInfo()
            r17 = r7
            goto L9a
        L98:
            r17 = r8
        L9a:
            com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView r7 = r1.f122289i
            android.content.Context r7 = r7.getContext()
            int r9 = com.scandit.datacapture.barcode.R.string.sc_barcode_find_card_content_description
            java.lang.Object[] r12 = new java.lang.Object[]{r11}
            java.lang.String r12 = r7.getString(r9, r12)
            java.lang.String r7 = "getString(...)"
            kotlin.jvm.internal.Intrinsics.i(r12, r7)
            com.scandit.datacapture.barcode.find.capture.BarcodeFindItemContent r7 = r6.getContent()
            if (r7 == 0) goto Lbc
            android.graphics.Bitmap r7 = r7.getImage()
            r18 = r7
            goto Lbe
        Lbc:
            r18 = r8
        Lbe:
            java.util.Collection r7 = r4.values()
            boolean r6 = r7.contains(r6)
            if (r6 == 0) goto Lce
            int r6 = com.scandit.datacapture.barcode.R.drawable.sc_magnifying_glass_check
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
        Lce:
            r15 = r8
            int r13 = r1.f122306z
            com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.TextCardData r9 = new com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.TextCardData
            r19 = 80
            r20 = 0
            r14 = 0
            r16 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r5.add(r9)
            goto L24
        Le2:
            r2.setData(r5)
            kotlin.Unit r1 = kotlin.Unit.f142422a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.barcode.internal.module.find.ui.t0.invoke(java.lang.Object):java.lang.Object");
    }
}
