package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider;

import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f123710a;

    /* renamed from: b, reason: collision with root package name */
    public final BarcodePickState f123711b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.e(this.f123710a, eVar.f123710a) && this.f123711b == eVar.f123711b;
    }

    public final int hashCode() {
        return this.f123711b.hashCode() + (this.f123710a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(itemData=" + this.f123710a + ", state=" + this.f123711b + ')';
    }

    public e(String itemData, BarcodePickState state) {
        Intrinsics.j(itemData, "itemData");
        Intrinsics.j(state, "state");
        this.f123710a = itemData;
        this.f123711b = state;
    }
}
