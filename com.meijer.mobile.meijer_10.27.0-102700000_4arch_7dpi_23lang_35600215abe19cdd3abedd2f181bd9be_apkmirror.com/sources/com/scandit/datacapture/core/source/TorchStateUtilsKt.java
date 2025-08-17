package com.scandit.datacapture.core.source;

import com.scandit.datacapture.core.internal.module.serialization.NativeEnumSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toJson", "", "Lcom/scandit/datacapture/core/source/TorchState;", "scandit-capture-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TorchStateUtilsKt {
    public static final /* synthetic */ String toJson(TorchState torchState) {
        Intrinsics.j(torchState, "<this>");
        String str = NativeEnumSerializer.torchStateToString(torchState);
        Intrinsics.i(str, "torchStateToString(...)");
        return str;
    }
}
