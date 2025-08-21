package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.iconprovider;

import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.l;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.m;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.o;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class b implements c {
    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.iconprovider.c
    public final BarcodePickIcon a(BarcodePickState state) {
        Intrinsics.j(state, "state");
        int i10 = a.f123725a[state.ordinal()];
        if (i10 == 1) {
            return l.f123732a;
        }
        if (i10 == 2) {
            return l.f123732a;
        }
        if (i10 == 3) {
            return new o(R.drawable.sc_ic_barcode_pick_plus);
        }
        if (i10 == 4) {
            return new o(R.drawable.sc_ic_barcode_pick_picked);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.iconprovider.c
    public final BarcodePickIcon b(BarcodePickState state) {
        Intrinsics.j(state, "state");
        return m.f123733a;
    }
}
