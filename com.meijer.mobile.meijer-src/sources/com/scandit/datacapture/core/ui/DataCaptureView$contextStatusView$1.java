package com.scandit.datacapture.core.ui;

import com.scandit.datacapture.core.common.ContextStatus;
import com.scandit.datacapture.core.internal.sdk.common.NativeContextStatusCompat;
import com.scandit.datacapture.core.internal.sdk.common.NativeError;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.ContextStatusView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nH\u0016¨\u0006\u000b"}, d2 = {"com/scandit/datacapture/core/ui/DataCaptureView$contextStatusView$1", "Lcom/scandit/datacapture/core/internal/sdk/ui/ContextStatusView;", "displayContextStatus", "", "status", "Lcom/scandit/datacapture/core/common/ContextStatus;", "displayWarnings", "warnings", "Ljava/util/ArrayList;", "Lcom/scandit/datacapture/core/internal/sdk/common/NativeError;", "Lkotlin/collections/ArrayList;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DataCaptureView$contextStatusView$1 implements ContextStatusView {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ DataCaptureView f126918a;

    DataCaptureView$contextStatusView$1(DataCaptureView dataCaptureView) {
        this.f126918a = dataCaptureView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ContextStatus status, DataCaptureView this$0) {
        Intrinsics.j(status, "$status");
        Intrinsics.j(this$0, "this$0");
        if (NativeContextStatusCompat.isSuccessOrUnknown(status.getCode())) {
            this$0.f126907l.a();
            this$0.f126907l.setVisibility(4);
        } else {
            this$0.f126907l.a(status);
            this$0.f126907l.setVisibility(0);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.ContextStatusView
    public void displayContextStatus(final ContextStatus status) {
        Intrinsics.j(status, "status");
        final DataCaptureView dataCaptureView = this.f126918a;
        dataCaptureView.post(new Runnable() { // from class: com.scandit.datacapture.core.ui.e
            @Override // java.lang.Runnable
            public final void run() {
                DataCaptureView$contextStatusView$1.a(status, dataCaptureView);
            }
        });
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.ContextStatusView
    public void displayWarnings(ArrayList<NativeError> warnings) {
        Intrinsics.j(warnings, "warnings");
        if (warnings.isEmpty()) {
            return;
        }
        DataCaptureView dataCaptureView = this.f126918a;
        ViewExtensionsKt.runOnMainThread(dataCaptureView, new b(warnings, dataCaptureView));
    }
}
