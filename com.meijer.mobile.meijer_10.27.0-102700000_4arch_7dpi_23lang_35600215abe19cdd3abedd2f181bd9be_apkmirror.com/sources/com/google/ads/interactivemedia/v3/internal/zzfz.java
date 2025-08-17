package com.google.ads.interactivemedia.v3.internal;

import Td.AbstractC5232j;
import Td.InterfaceC5225c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzfz implements InterfaceC5225c {
    public /* synthetic */ zzfz(zzgd zzgdVar) {
    }

    @Override // Td.InterfaceC5225c
    public final Object then(AbstractC5232j abstractC5232j) {
        List<AbstractC5232j> list = (List) abstractC5232j.n();
        ArrayList arrayList = new ArrayList(list.size());
        for (AbstractC5232j abstractC5232j2 : list) {
            if (abstractC5232j2.r()) {
                arrayList.add(abstractC5232j2.n());
            }
        }
        return arrayList;
    }
}
