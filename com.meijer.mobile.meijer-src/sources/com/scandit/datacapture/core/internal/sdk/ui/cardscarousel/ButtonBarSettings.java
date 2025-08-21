package com.scandit.datacapture.core.internal.sdk.ui.cardscarousel;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0005\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0006\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0007\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\b\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/ButtonBarSettings;", "", "Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/ButtonBarShowMode;", "buttonBarShowMode", "", "isCollapseButtonVisible", "isAcceptScanButtonVisible", "isCancelScanButtonVisible", "isRestartScanButtonVisible", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/ButtonBarShowMode;ZZZZ)V", "isCarouselExpanded", "", "buttonBarVisibility", "(Z)I", "buttonBarVisibilityCanChange", "()Z", "a", "Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/ButtonBarShowMode;", "getButtonBarShowMode", "()Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/ButtonBarShowMode;", "b", "Z", "c", "d", "e", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class ButtonBarSettings {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ButtonBarShowMode buttonBarShowMode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isCollapseButtonVisible;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isAcceptScanButtonVisible;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isCancelScanButtonVisible;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isRestartScanButtonVisible;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonBarShowMode.values().length];
            try {
                iArr[ButtonBarShowMode.Never.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonBarShowMode.WhileExpanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonBarShowMode.Always.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ButtonBarSettings() {
        this(null, false, false, false, false, 31, null);
    }

    public ButtonBarSettings(ButtonBarShowMode buttonBarShowMode, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intrinsics.j(buttonBarShowMode, "buttonBarShowMode");
        this.buttonBarShowMode = buttonBarShowMode;
        this.isCollapseButtonVisible = z10;
        this.isAcceptScanButtonVisible = z11;
        this.isCancelScanButtonVisible = z12;
        this.isRestartScanButtonVisible = z13;
    }

    public final int buttonBarVisibility(boolean isCarouselExpanded) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.buttonBarShowMode.ordinal()];
        if (i10 == 1) {
            return 4;
        }
        if (i10 == 2) {
            return isCarouselExpanded ? 0 : 4;
        }
        if (i10 == 3) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean buttonBarVisibilityCanChange() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.buttonBarShowMode.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        if (i10 == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ButtonBarShowMode getButtonBarShowMode() {
        return this.buttonBarShowMode;
    }

    /* renamed from: isAcceptScanButtonVisible, reason: from getter */
    public final boolean getIsAcceptScanButtonVisible() {
        return this.isAcceptScanButtonVisible;
    }

    /* renamed from: isCancelScanButtonVisible, reason: from getter */
    public final boolean getIsCancelScanButtonVisible() {
        return this.isCancelScanButtonVisible;
    }

    /* renamed from: isCollapseButtonVisible, reason: from getter */
    public final boolean getIsCollapseButtonVisible() {
        return this.isCollapseButtonVisible;
    }

    /* renamed from: isRestartScanButtonVisible, reason: from getter */
    public final boolean getIsRestartScanButtonVisible() {
        return this.isRestartScanButtonVisible;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ButtonBarSettings(com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.ButtonBarShowMode r2, boolean r3, boolean r4, boolean r5, boolean r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.ButtonBarShowMode r2 = com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.ButtonBarShowMode.Never
        L6:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto Lc
            r3 = r0
        Lc:
            r8 = r7 & 4
            if (r8 == 0) goto L11
            r4 = r0
        L11:
            r8 = r7 & 8
            if (r8 == 0) goto L16
            r5 = r0
        L16:
            r7 = r7 & 16
            if (r7 == 0) goto L21
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L27
        L21:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L27:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.ButtonBarSettings.<init>(com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.ButtonBarShowMode, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
