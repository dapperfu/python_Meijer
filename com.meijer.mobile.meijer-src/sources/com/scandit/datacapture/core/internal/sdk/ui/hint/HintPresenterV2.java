package com.scandit.datacapture.core.internal.sdk.ui.hint;

import com.scandit.datacapture.core.internal.module.ui.NativeHintPresenterV2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0010J\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\nJ\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0014R\"\u0010\u001e\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintPresenterV2;", "", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintHolderV2;", "hintHolderV2", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintHolderV2;)V", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/ToastHint;", "toast", "", "showToast", "(Lcom/scandit/datacapture/core/internal/sdk/ui/hint/ToastHint;)V", "", "tag", "hideToast", "(Ljava/lang/String;)V", "hideAllToasts", "()V", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/GuidanceHint;", "guidance", "showGuidance", "(Lcom/scandit/datacapture/core/internal/sdk/ui/hint/GuidanceHint;)V", "hideCurrentGuidance", "userWantsToHideToast", "userWantsToHideGuidance", "Lcom/scandit/datacapture/core/internal/module/ui/NativeHintPresenterV2;", "kotlin.jvm.PlatformType", "a", "Lcom/scandit/datacapture/core/internal/module/ui/NativeHintPresenterV2;", "get_impl$scandit_capture_core", "()Lcom/scandit/datacapture/core/internal/module/ui/NativeHintPresenterV2;", "_impl", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class HintPresenterV2 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final NativeHintPresenterV2 _impl;

    public HintPresenterV2(HintHolderV2 hintHolderV2) {
        Intrinsics.j(hintHolderV2, "hintHolderV2");
        this._impl = NativeHintPresenterV2.create(hintHolderV2.getPlatformHintPresenter());
        hintHolderV2.setHideHintListener(new HideHintListener() { // from class: com.scandit.datacapture.core.internal.sdk.ui.hint.HintPresenterV2.1
            @Override // com.scandit.datacapture.core.internal.sdk.ui.hint.HideHintListener
            public void userWantsToHideGuidance(GuidanceHint guidance) {
                Intrinsics.j(guidance, "guidance");
                HintPresenterV2.this.userWantsToHideGuidance(guidance);
            }

            @Override // com.scandit.datacapture.core.internal.sdk.ui.hint.HideHintListener
            public void userWantsToHideToast(ToastHint toast) {
                Intrinsics.j(toast, "toast");
                HintPresenterV2.this.userWantsToHideToast(toast);
            }
        });
    }

    /* renamed from: get_impl$scandit_capture_core, reason: from getter */
    public final NativeHintPresenterV2 get_impl() {
        return this._impl;
    }

    public final void hideAllToasts() {
        this._impl.hideAllToasts();
    }

    public final void hideCurrentGuidance() {
        this._impl.hideCurrentGuidance();
    }

    public final void hideToast(String tag) {
        Intrinsics.j(tag, "tag");
        this._impl.hideToast(tag);
    }

    public final void showGuidance(GuidanceHint guidance) {
        Intrinsics.j(guidance, "guidance");
        this._impl.showGuidance(guidance.getNative());
    }

    public final void showToast(ToastHint toast) {
        Intrinsics.j(toast, "toast");
        this._impl.showToast(toast.getNative());
    }

    public final void userWantsToHideGuidance(GuidanceHint guidance) {
        Intrinsics.j(guidance, "guidance");
        this._impl.userWantsToHideGuidance(guidance.getNative());
    }

    public final void userWantsToHideToast(ToastHint toast) {
        Intrinsics.j(toast, "toast");
        this._impl.userWantsToHideToast(toast.getNative());
    }
}
