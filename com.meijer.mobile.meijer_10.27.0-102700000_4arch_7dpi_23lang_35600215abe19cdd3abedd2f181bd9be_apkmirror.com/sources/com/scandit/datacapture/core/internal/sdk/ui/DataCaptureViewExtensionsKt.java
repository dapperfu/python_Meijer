package com.scandit.datacapture.core.internal.sdk.ui;

import com.scandit.datacapture.core.ui.DataCaptureView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"'\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00048F¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"_controlsMap", "", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "Lcom/scandit/datacapture/core/ui/control/Control;", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "get_controlsMap$annotations", "(Lcom/scandit/datacapture/core/ui/DataCaptureView;)V", "get_controlsMap", "(Lcom/scandit/datacapture/core/ui/DataCaptureView;)Ljava/util/Map;", "scandit-capture-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DataCaptureViewExtensionsKt {
    public static /* synthetic */ void get_controlsMap$annotations(DataCaptureView dataCaptureView) {
    }

    public static final /* synthetic */ Map get_controlsMap(DataCaptureView dataCaptureView) {
        Intrinsics.j(dataCaptureView, "<this>");
        return dataCaptureView.getControlLayout().b();
    }
}
