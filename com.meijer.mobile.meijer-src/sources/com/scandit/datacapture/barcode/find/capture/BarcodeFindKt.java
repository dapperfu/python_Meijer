package com.scandit.datacapture.barcode.find.capture;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toKeyable", "Lcom/scandit/datacapture/barcode/find/capture/KeyableByteArray;", "", "scandit-barcode-capture"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BarcodeFindKt {
    public static final KeyableByteArray toKeyable(byte[] bArr) {
        Intrinsics.j(bArr, "<this>");
        return new KeyableByteArray(bArr);
    }
}
