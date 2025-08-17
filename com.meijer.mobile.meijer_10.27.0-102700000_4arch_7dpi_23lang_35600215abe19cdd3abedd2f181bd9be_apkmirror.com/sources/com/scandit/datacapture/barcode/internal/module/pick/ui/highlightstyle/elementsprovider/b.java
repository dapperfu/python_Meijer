package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider;

import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f122744a;

    /* renamed from: b, reason: collision with root package name */
    public final BarcodePickState f122745b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.e(this.f122744a, bVar.f122744a) && this.f122745b == bVar.f122745b;
    }

    public final int hashCode() {
        return this.f122745b.hashCode() + (this.f122744a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(itemData=" + this.f122744a + ", state=" + this.f122745b + ')';
    }

    public b(String itemData, BarcodePickState state) {
        Intrinsics.j(itemData, "itemData");
        Intrinsics.j(state, "state");
        this.f122744a = itemData;
        this.f122745b = state;
    }
}
