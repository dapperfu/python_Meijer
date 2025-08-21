package com.scandit.datacapture.core.internal.module.ui;

import com.scandit.datacapture.core.common.ContextStatus;
import com.scandit.datacapture.core.internal.sdk.ui.ContextStatusPresenter;
import com.scandit.datacapture.core.internal.sdk.ui.ContextStatusView;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class a implements ContextStatusPresenter {

    /* renamed from: a, reason: collision with root package name */
    public ContextStatusView f126119a;

    @Override // com.scandit.datacapture.core.internal.sdk.ui.ContextStatusPresenter
    public final ContextStatusView getView() {
        return this.f126119a;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.ContextStatusPresenter
    public final void onStatusChanged(ContextStatus status) {
        Intrinsics.j(status, "status");
        ContextStatusView contextStatusView = this.f126119a;
        if (contextStatusView != null) {
            contextStatusView.displayContextStatus(status);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.ContextStatusPresenter
    public final void onWarningsChanged(ArrayList warnings) {
        Intrinsics.j(warnings, "warnings");
        ContextStatusView contextStatusView = this.f126119a;
        if (contextStatusView != null) {
            contextStatusView.displayWarnings(warnings);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.ContextStatusPresenter
    public final void setView(ContextStatusView contextStatusView) {
        this.f126119a = contextStatusView;
    }
}
