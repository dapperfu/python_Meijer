package com.scandit.datacapture.core.internal.sdk.ui.hint;

import android.content.Context;
import android.view.View;
import com.scandit.datacapture.core.common.geometry.Rect;
import com.scandit.datacapture.core.internal.module.ui.NativePlatformHintPresenter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dJ\b\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u0004\u0018\u00010\rX¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintHolderV2;", "", "hideHintListener", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HideHintListener;", "getHideHintListener", "()Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HideHintListener;", "setHideHintListener", "(Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HideHintListener;)V", "platformHintPresenter", "Lcom/scandit/datacapture/core/internal/module/ui/NativePlatformHintPresenter;", "getPlatformHintPresenter", "()Lcom/scandit/datacapture/core/internal/module/ui/NativePlatformHintPresenter;", "viewFinderRect", "Lcom/scandit/datacapture/core/common/geometry/Rect;", "getViewFinderRect", "()Lcom/scandit/datacapture/core/common/geometry/Rect;", "setViewFinderRect", "(Lcom/scandit/datacapture/core/common/geometry/Rect;)V", "asView", "Landroid/view/View;", "hideGuidance", "", "guidance", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/GuidanceHint;", "hideToast", "toast", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/ToastHint;", "showGuidance", "showToast", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface HintHolderV2 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f126674a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintHolderV2$Companion;", "", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintHolderV2;", "implementation", "(Landroid/content/Context;)Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintHolderV2;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f126674a = new Companion();

        public final HintHolderV2 implementation(Context context) {
            Intrinsics.j(context, "context");
            return new HintHolderV2Impl(context);
        }

        private Companion() {
        }
    }

    View asView();

    HideHintListener getHideHintListener();

    NativePlatformHintPresenter getPlatformHintPresenter();

    Rect getViewFinderRect();

    void hideGuidance(GuidanceHint guidance);

    void hideToast(ToastHint toast);

    void setHideHintListener(HideHintListener hideHintListener);

    void setViewFinderRect(Rect rect);

    void showGuidance(GuidanceHint guidance);

    void showToast(ToastHint toast);
}
