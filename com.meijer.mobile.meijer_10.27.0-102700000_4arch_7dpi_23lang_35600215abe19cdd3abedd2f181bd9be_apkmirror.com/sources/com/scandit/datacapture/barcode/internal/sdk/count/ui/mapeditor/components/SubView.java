package com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR*\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/SubView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "value", "c", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "text", "color", "getColor", "()I", "setColor", "(I)V", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class SubView extends FrameLayout {

    @Deprecated
    public static final int MAX_TEXT_LENGTH = 4;

    /* renamed from: a, reason: collision with root package name */
    private final SubDrawable f123499a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f123500b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String text;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SubView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.j(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SubView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.j(context, "context");
    }

    public final int getColor() {
        return this.f123499a.getSubColor();
    }

    public final String getText() {
        return this.text;
    }

    public final void setColor(int i10) {
        this.f123499a.setSubColor(i10);
        this.f123500b.setTextColor(MapEditorUtils.INSTANCE.uiElementColorOnBackground(i10));
    }

    public final void setText(String value) {
        Intrinsics.j(value, "value");
        this.text = value;
        this.f123500b.setText(MapEditorUtils.INSTANCE.ellipsizeTextIfTooLong(value, 4));
    }

    public /* synthetic */ SubView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SubView(Context context, AttributeSet attributeSet, int i10) {
        Typeface typefaceCreate;
        super(context, attributeSet, i10);
        Intrinsics.j(context, "context");
        SubDrawable subDrawable = new SubDrawable(context);
        this.f123499a = subDrawable;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        int iPxFromDp = PixelExtensionsKt.pxFromDp(8, context);
        int iPxFromDp2 = PixelExtensionsKt.pxFromDp(2, context);
        textView.setPadding(iPxFromDp, iPxFromDp2, iPxFromDp, iPxFromDp2);
        textView.setTextSize(2, 12.0f);
        if (Build.VERSION.SDK_INT >= 28) {
            typefaceCreate = Typeface.create(null, 600, false);
        } else {
            typefaceCreate = Typeface.DEFAULT_BOLD;
        }
        textView.setTypeface(typefaceCreate);
        textView.setMaxLines(1);
        textView.setTextColor(MapEditorUtils.INSTANCE.uiElementColorOnBackground(getColor()));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        addView(textView, layoutParams);
        this.f123500b = textView;
        this.text = "";
        setBackground(subDrawable);
        int iPxFromDp3 = (int) PixelExtensionsKt.pxFromDp(66.0f, context);
        setMinimumWidth(iPxFromDp3);
        setMinimumHeight(iPxFromDp3);
    }
}
