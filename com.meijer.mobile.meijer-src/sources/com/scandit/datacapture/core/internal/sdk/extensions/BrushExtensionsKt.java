package com.scandit.datacapture.core.internal.sdk.extensions;

import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"of", "Lcom/scandit/datacapture/core/ui/style/Brush;", "Lcom/scandit/datacapture/core/ui/style/Brush$Companion;", "nativeBrush", "Lcom/scandit/datacapture/core/internal/sdk/ui/style/NativeBrush;", "scandit-capture-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BrushExtensionsKt {
    public static final Brush of(Brush.Companion companion, NativeBrush nativeBrush) {
        Intrinsics.j(companion, "<this>");
        Intrinsics.j(nativeBrush, "nativeBrush");
        return CoreNativeTypeFactory.INSTANCE.convert(nativeBrush);
    }
}
