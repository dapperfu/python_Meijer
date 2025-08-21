package com.google.ads.interactivemedia.v3.internal;

import Vd.AbstractC5516j;
import Vd.InterfaceC5509c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzfz implements InterfaceC5509c {
    public /* synthetic */ zzfz(zzgd zzgdVar) {
    }

    @Override // Vd.InterfaceC5509c
    public final Object then(AbstractC5516j abstractC5516j) {
        List<AbstractC5516j> list = (List) abstractC5516j.n();
        ArrayList arrayList = new ArrayList(list.size());
        for (AbstractC5516j abstractC5516j2 : list) {
            if (abstractC5516j2.r()) {
                arrayList.add(abstractC5516j2.n());
            }
        }
        return arrayList;
    }
}
