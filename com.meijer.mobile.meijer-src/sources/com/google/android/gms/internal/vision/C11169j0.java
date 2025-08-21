package com.google.android.gms.internal.vision;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.vision.j0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11169j0 implements Comparator<AbstractC11161h0> {
    C11169j0() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(AbstractC11161h0 abstractC11161h0, AbstractC11161h0 abstractC11161h02) {
        AbstractC11161h0 abstractC11161h03 = abstractC11161h0;
        AbstractC11161h0 abstractC11161h04 = abstractC11161h02;
        InterfaceC11178m0 interfaceC11178m0 = (InterfaceC11178m0) abstractC11161h03.iterator();
        InterfaceC11178m0 interfaceC11178m02 = (InterfaceC11178m0) abstractC11161h04.iterator();
        while (interfaceC11178m0.hasNext() && interfaceC11178m02.hasNext()) {
            int iCompare = Integer.compare(AbstractC11161h0.q(interfaceC11178m0.zza()), AbstractC11161h0.q(interfaceC11178m02.zza()));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return Integer.compare(abstractC11161h03.e(), abstractC11161h04.e());
    }
}
