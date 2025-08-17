package com.meijer.mobile.meijer.activity.shoppinglist.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.meijer.mobile.meijer.O;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/meijer/activity/shoppinglist/view/ShoppingListItemCheckBox;", "Landroidx/appcompat/widget/AppCompatCheckBox;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "extraSpace", "", "onCreateDrawableState", "(I)[I", "", "value", "", "setIsProcessing", "(Z)V", "checked", "setChecked", "e", "Z", "isProcessing", "f", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ShoppingListItemCheckBox extends AppCompatCheckBox {

    /* renamed from: g, reason: collision with root package name */
    public static final int f112525g = 8;

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f112526h = {O.f98646b};

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isProcessing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShoppingListItemCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.j(context, "context");
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int extraSpace) {
        if (!this.isProcessing || isChecked()) {
            int[] iArrOnCreateDrawableState = super.onCreateDrawableState(extraSpace);
            Intrinsics.g(iArrOnCreateDrawableState);
            return iArrOnCreateDrawableState;
        }
        int[] iArrOnCreateDrawableState2 = super.onCreateDrawableState(extraSpace + 1);
        View.mergeDrawableStates(iArrOnCreateDrawableState2, f112526h);
        Intrinsics.g(iArrOnCreateDrawableState2);
        return iArrOnCreateDrawableState2;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean checked) {
        if (this.isProcessing) {
            return;
        }
        super.setChecked(checked);
        setIsProcessing(false);
    }

    public final void setIsProcessing(boolean value) {
        if (this.isProcessing != value) {
            this.isProcessing = value;
            refreshDrawableState();
        }
    }
}
