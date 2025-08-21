package com.scandit.datacapture.core.internal.sdk.ui.hint;

import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.scandit.datacapture.core.internal.module.ui.NativeGuidanceHint;
import com.scandit.datacapture.core.internal.module.ui.NativeGuidanceHintAnchor;
import com.scandit.datacapture.core.internal.module.ui.NativeGuidanceHintIcon;
import com.scandit.datacapture.core.internal.module.ui.NativeGuidanceHintLayout;
import com.scandit.datacapture.core.internal.module.ui.NativeGuidanceHintStyle;
import com.scandit.datacapture.core.internal.module.ui.NativeHintStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0004\u0010\rBK\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0004\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010%\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/hint/GuidanceHint;", "", "Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHint;", "native", "<init>", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHint;)V", "Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHintStyle;", "style", "", "text", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHintStyle;Ljava/lang/String;)V", "Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHintAnchor;", "anchor", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHintStyle;Ljava/lang/String;Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHintAnchor;)V", "Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHintLayout;", "layout", "Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHintIcon;", BarcodePickDeserializer.FIELD_ICON, "iconResource", "", "canBeDismissed", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHintStyle;Ljava/lang/String;Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHintAnchor;Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHintLayout;Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHintIcon;Ljava/lang/String;Z)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHint;", "getNative", "()Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHint;", "getText", "()Ljava/lang/String;", "Lcom/scandit/datacapture/core/internal/module/ui/NativeHintStyle;", "getHintStyle", "()Lcom/scandit/datacapture/core/internal/module/ui/NativeHintStyle;", "hintStyle", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class GuidanceHint {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final NativeGuidanceHint native;

    public GuidanceHint(NativeGuidanceHint nativeGuidanceHint) {
        Intrinsics.j(nativeGuidanceHint, "native");
        this.native = nativeGuidanceHint;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GuidanceHint(NativeGuidanceHintStyle style, String text) {
        Intrinsics.j(style, "style");
        Intrinsics.j(text, "text");
        NativeGuidanceHint nativeGuidanceHintCreate = NativeGuidanceHint.create(style, text, NativeGuidanceHintAnchor.ABOVE_VIEW_FINDER);
        Intrinsics.i(nativeGuidanceHintCreate, "create(...)");
        this(nativeGuidanceHintCreate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof GuidanceHint) {
            return Intrinsics.e(this.native, ((GuidanceHint) other).native);
        }
        return false;
    }

    public final NativeHintStyle getHintStyle() {
        NativeHintStyle hintStyle = this.native.getHintStyle();
        Intrinsics.i(hintStyle, "getHintStyle(...)");
        return hintStyle;
    }

    public final NativeGuidanceHint getNative() {
        return this.native;
    }

    public final String getText() {
        String text = this.native.getText();
        Intrinsics.i(text, "getText(...)");
        return text;
    }

    public int hashCode() {
        return this.native.hashCode();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GuidanceHint(NativeGuidanceHintStyle style, String text, NativeGuidanceHintAnchor anchor) {
        Intrinsics.j(style, "style");
        Intrinsics.j(text, "text");
        Intrinsics.j(anchor, "anchor");
        NativeGuidanceHint nativeGuidanceHintCreate = NativeGuidanceHint.create(style, text, anchor);
        Intrinsics.i(nativeGuidanceHintCreate, "create(...)");
        this(nativeGuidanceHintCreate);
    }

    public /* synthetic */ GuidanceHint(NativeGuidanceHintStyle nativeGuidanceHintStyle, String str, NativeGuidanceHintAnchor nativeGuidanceHintAnchor, NativeGuidanceHintLayout nativeGuidanceHintLayout, NativeGuidanceHintIcon nativeGuidanceHintIcon, String str2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeGuidanceHintStyle, str, nativeGuidanceHintAnchor, (i10 & 8) != 0 ? NativeGuidanceHintLayout.COMPACT : nativeGuidanceHintLayout, (i10 & 16) != 0 ? NativeGuidanceHintIcon.NONE : nativeGuidanceHintIcon, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? false : z10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GuidanceHint(NativeGuidanceHintStyle style, String text, NativeGuidanceHintAnchor anchor, NativeGuidanceHintLayout layout, NativeGuidanceHintIcon icon, String str, boolean z10) {
        Intrinsics.j(style, "style");
        Intrinsics.j(text, "text");
        Intrinsics.j(anchor, "anchor");
        Intrinsics.j(layout, "layout");
        Intrinsics.j(icon, "icon");
        NativeGuidanceHint nativeGuidanceHintCreateFull = NativeGuidanceHint.createFull(style, text, anchor, layout, icon, str, z10);
        Intrinsics.i(nativeGuidanceHintCreateFull, "createFull(...)");
        this(nativeGuidanceHintCreateFull);
    }
}
