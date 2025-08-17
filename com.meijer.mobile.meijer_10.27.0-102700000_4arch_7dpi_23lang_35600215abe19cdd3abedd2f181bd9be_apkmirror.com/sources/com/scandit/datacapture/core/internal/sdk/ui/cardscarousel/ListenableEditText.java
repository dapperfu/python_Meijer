package com.scandit.datacapture.core.internal.sdk.ui.cardscarousel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.EditText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/ListenableEditText;", "Landroid/widget/EditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyPreIme", "(ILandroid/view/KeyEvent;)Z", "Lkotlin/Function0;", "", "a", "Lkotlin/jvm/functions/Function0;", "getOnCloseKeyboardButtonTapped", "()Lkotlin/jvm/functions/Function0;", "setOnCloseKeyboardButtonTapped", "(Lkotlin/jvm/functions/Function0;)V", "onCloseKeyboardButtonTapped", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class ListenableEditText extends EditText {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Function0 onCloseKeyboardButtonTapped;

    public /* synthetic */ ListenableEditText(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int keyCode, KeyEvent event) {
        if (keyCode != 4 || event == null || event.getAction() != 1) {
            return super.onKeyPreIme(keyCode, event);
        }
        this.onCloseKeyboardButtonTapped.invoke();
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListenableEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.j(context, "context");
        this.onCloseKeyboardButtonTapped = y.f125719a;
    }

    public final Function0<Unit> getOnCloseKeyboardButtonTapped() {
        return this.onCloseKeyboardButtonTapped;
    }

    public final void setOnCloseKeyboardButtonTapped(Function0<Unit> function0) {
        Intrinsics.j(function0, "<set-?>");
        this.onCloseKeyboardButtonTapped = function0;
    }
}
