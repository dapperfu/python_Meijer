package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider;

import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f123696a;

    /* renamed from: b, reason: collision with root package name */
    public final BarcodePickState f123697b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.e(this.f123696a, bVar.f123696a) && this.f123697b == bVar.f123697b;
    }

    public final int hashCode() {
        return this.f123697b.hashCode() + (this.f123696a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(itemData=" + this.f123696a + ", state=" + this.f123697b + ')';
    }

    public b(String itemData, BarcodePickState state) {
        Intrinsics.j(itemData, "itemData");
        Intrinsics.j(state, "state");
        this.f123696a = itemData;
        this.f123697b = state;
    }
}
