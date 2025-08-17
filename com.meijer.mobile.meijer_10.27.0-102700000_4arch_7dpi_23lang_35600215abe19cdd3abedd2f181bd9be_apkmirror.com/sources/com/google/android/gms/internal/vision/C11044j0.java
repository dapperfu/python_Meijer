package com.google.android.gms.internal.vision;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.vision.j0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11044j0 implements Comparator<AbstractC11036h0> {
    C11044j0() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(AbstractC11036h0 abstractC11036h0, AbstractC11036h0 abstractC11036h02) {
        AbstractC11036h0 abstractC11036h03 = abstractC11036h0;
        AbstractC11036h0 abstractC11036h04 = abstractC11036h02;
        InterfaceC11053m0 interfaceC11053m0 = (InterfaceC11053m0) abstractC11036h03.iterator();
        InterfaceC11053m0 interfaceC11053m02 = (InterfaceC11053m0) abstractC11036h04.iterator();
        while (interfaceC11053m0.hasNext() && interfaceC11053m02.hasNext()) {
            int iCompare = Integer.compare(AbstractC11036h0.q(interfaceC11053m0.zza()), AbstractC11036h0.q(interfaceC11053m02.zza()));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return Integer.compare(abstractC11036h03.e(), abstractC11036h04.e());
    }
}
