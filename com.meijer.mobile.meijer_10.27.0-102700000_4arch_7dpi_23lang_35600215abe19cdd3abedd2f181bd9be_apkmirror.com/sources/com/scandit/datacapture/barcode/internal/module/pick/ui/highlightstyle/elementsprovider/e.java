package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider;

import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f122758a;

    /* renamed from: b, reason: collision with root package name */
    public final BarcodePickState f122759b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.e(this.f122758a, eVar.f122758a) && this.f122759b == eVar.f122759b;
    }

    public final int hashCode() {
        return this.f122759b.hashCode() + (this.f122758a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(itemData=" + this.f122758a + ", state=" + this.f122759b + ')';
    }

    public e(String itemData, BarcodePickState state) {
        Intrinsics.j(itemData, "itemData");
        Intrinsics.j(state, "state");
        this.f122758a = itemData;
        this.f122759b = state;
    }
}
