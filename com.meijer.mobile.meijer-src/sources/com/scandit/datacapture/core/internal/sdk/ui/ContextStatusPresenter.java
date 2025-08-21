package com.scandit.datacapture.core.internal.sdk.ui;

import com.scandit.datacapture.core.common.ContextStatus;
import com.scandit.datacapture.core.internal.sdk.common.NativeError;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0016\u0010\f\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/ContextStatusPresenter;", "", "view", "Lcom/scandit/datacapture/core/internal/sdk/ui/ContextStatusView;", "getView", "()Lcom/scandit/datacapture/core/internal/sdk/ui/ContextStatusView;", "setView", "(Lcom/scandit/datacapture/core/internal/sdk/ui/ContextStatusView;)V", "onStatusChanged", "", "status", "Lcom/scandit/datacapture/core/common/ContextStatus;", "onWarningsChanged", "warnings", "Ljava/util/ArrayList;", "Lcom/scandit/datacapture/core/internal/sdk/common/NativeError;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ContextStatusPresenter {
    ContextStatusView getView();

    void onStatusChanged(ContextStatus status);

    void onWarningsChanged(ArrayList<NativeError> warnings);

    void setView(ContextStatusView contextStatusView);
}
