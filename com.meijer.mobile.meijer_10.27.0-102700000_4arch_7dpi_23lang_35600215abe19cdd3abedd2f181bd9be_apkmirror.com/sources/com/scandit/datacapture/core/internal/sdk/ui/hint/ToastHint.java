package com.scandit.datacapture.core.internal.sdk.ui.hint;

import com.scandit.datacapture.core.internal.module.ui.NativeHintStyle;
import com.scandit.datacapture.core.internal.module.ui.NativeToastHint;
import com.scandit.datacapture.core.internal.module.ui.NativeToastHintStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B-\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0004\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/hint/ToastHint;", "", "Lcom/scandit/datacapture/core/internal/module/ui/NativeToastHint;", "native", "<init>", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeToastHint;)V", "Lcom/scandit/datacapture/core/internal/module/ui/NativeToastHintStyle;", "style", "", "text", "tag", "", "canBeDismissed", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeToastHintStyle;Ljava/lang/String;Ljava/lang/String;Z)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lcom/scandit/datacapture/core/internal/module/ui/NativeToastHint;", "getNative", "()Lcom/scandit/datacapture/core/internal/module/ui/NativeToastHint;", "getText", "()Ljava/lang/String;", "Lcom/scandit/datacapture/core/internal/module/ui/NativeHintStyle;", "getHintStyle", "()Lcom/scandit/datacapture/core/internal/module/ui/NativeHintStyle;", "hintStyle", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class ToastHint {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final NativeToastHint native;

    public ToastHint(NativeToastHint nativeToastHint) {
        Intrinsics.j(nativeToastHint, "native");
        this.native = nativeToastHint;
    }

    public /* synthetic */ ToastHint(NativeToastHintStyle nativeToastHintStyle, String str, String str2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeToastHintStyle, str, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? false : z10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof ToastHint) {
            return Intrinsics.e(this.native, ((ToastHint) other).native);
        }
        return false;
    }

    public final NativeHintStyle getHintStyle() {
        NativeHintStyle hintStyle = this.native.getHintStyle();
        Intrinsics.i(hintStyle, "getHintStyle(...)");
        return hintStyle;
    }

    public final NativeToastHint getNative() {
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
    public ToastHint(NativeToastHintStyle style, String text, String tag, boolean z10) {
        Intrinsics.j(style, "style");
        Intrinsics.j(text, "text");
        Intrinsics.j(tag, "tag");
        NativeToastHint nativeToastHintCreate = NativeToastHint.create(style, text, tag, z10);
        Intrinsics.i(nativeToastHintCreate, "create(...)");
        this(nativeToastHintCreate);
    }
}
