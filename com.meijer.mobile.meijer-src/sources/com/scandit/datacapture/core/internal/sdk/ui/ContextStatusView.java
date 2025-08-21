package com.scandit.datacapture.core.internal.sdk.ui;

import com.scandit.datacapture.core.common.ContextStatus;
import com.scandit.datacapture.core.internal.sdk.common.NativeError;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nH&¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/ContextStatusView;", "", "displayContextStatus", "", "status", "Lcom/scandit/datacapture/core/common/ContextStatus;", "displayWarnings", "warnings", "Ljava/util/ArrayList;", "Lcom/scandit/datacapture/core/internal/sdk/common/NativeError;", "Lkotlin/collections/ArrayList;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ContextStatusView {
    void displayContextStatus(ContextStatus status);

    void displayWarnings(ArrayList<NativeError> warnings);
}
