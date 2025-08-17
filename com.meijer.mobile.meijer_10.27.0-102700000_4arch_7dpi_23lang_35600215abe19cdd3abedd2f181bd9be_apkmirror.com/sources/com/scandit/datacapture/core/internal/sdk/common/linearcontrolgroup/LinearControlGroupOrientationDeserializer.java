package com.scandit.datacapture.core.internal.sdk.common.linearcontrolgroup;

import com.scandit.datacapture.core.ui.control.LinearControlGroupOrientation;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/common/linearcontrolgroup/LinearControlGroupOrientationDeserializer;", "", "", "text", "Lcom/scandit/datacapture/core/ui/control/LinearControlGroupOrientation;", "fromString", "(Ljava/lang/String;)Lcom/scandit/datacapture/core/ui/control/LinearControlGroupOrientation;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class LinearControlGroupOrientationDeserializer {
    public static final LinearControlGroupOrientationDeserializer INSTANCE = new LinearControlGroupOrientationDeserializer();

    @JvmStatic
    public static final LinearControlGroupOrientation fromString(String text) {
        Intrinsics.j(text, "text");
        if (Intrinsics.e(text, "horizontal")) {
            return LinearControlGroupOrientation.HORIZONTAL;
        }
        if (Intrinsics.e(text, "vertical")) {
            return LinearControlGroupOrientation.VERTICAL;
        }
        throw new IllegalStateException((text + " is required to be one of [horizontal, vertical]").toString());
    }

    private LinearControlGroupOrientationDeserializer() {
    }
}
