package com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0019\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fR*\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R.\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R$\u0010 \u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR+\u0010&\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001f*\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/ToteView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "hideSub", "()V", "showSub", "", "value", "d", "Ljava/lang/String;", "getMainBarcode", "()Ljava/lang/String;", "setMainBarcode", "(Ljava/lang/String;)V", "mainBarcode", "e", "getSubBarcode", "setSubBarcode", "subBarcode", "color", "getToteColor", "()I", "setToteColor", "(I)V", "toteColor", "<set-?>", "getSubColor", "setSubColor", "getSubColor$delegate", "(Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/ToteView;)Ljava/lang/Object;", "subColor", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class ToteView extends FrameLayout {

    @Deprecated
    public static final int MAX_TEXT_LENGTH = 6;

    /* renamed from: a, reason: collision with root package name */
    private final ToteDrawable f123512a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f123513b;

    /* renamed from: c, reason: collision with root package name */
    private final SubView f123514c;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String mainBarcode;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String subBarcode;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ToteView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.j(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ToteView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.j(context, "context");
    }

    public final String getMainBarcode() {
        return this.mainBarcode;
    }

    public final String getSubBarcode() {
        return this.subBarcode;
    }

    public final int getSubColor() {
        return this.f123514c.getColor();
    }

    public final int getToteColor() {
        return this.f123512a.getToteColor();
    }

    public final void hideSub() {
        this.f123514c.setAlpha(0.0f);
    }

    public final void setMainBarcode(String value) {
        Intrinsics.j(value, "value");
        this.mainBarcode = value;
        this.f123513b.setText(MapEditorUtils.INSTANCE.ellipsizeTextIfTooLong(value, 6));
    }

    public final void setSubBarcode(String str) {
        this.subBarcode = str;
        if (str == null || str.length() == 0) {
            this.f123514c.setText("");
            this.f123514c.setAlpha(0.0f);
        } else {
            this.f123514c.setText(str);
            this.f123514c.setAlpha(1.0f);
        }
    }

    public final void setSubColor(int i10) {
        this.f123514c.setColor(i10);
    }

    public final void setToteColor(int i10) {
        this.f123512a.setToteColor(i10);
        this.f123513b.setTextColor(MapEditorUtils.INSTANCE.uiElementColorOnBackground(i10));
    }

    public final void showSub() {
        String str = this.subBarcode;
        if (str == null || str.length() == 0) {
            return;
        }
        this.f123514c.setAlpha(1.0f);
    }

    public /* synthetic */ ToteView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ToteView(Context context, AttributeSet attributeSet, int i10) {
        Typeface typefaceCreate;
        super(context, attributeSet, i10);
        Intrinsics.j(context, "context");
        ToteDrawable toteDrawable = new ToteDrawable(context);
        this.f123512a = toteDrawable;
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
        textView.setTextColor(MapEditorUtils.INSTANCE.uiElementColorOnBackground(getToteColor()));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        addView(textView, layoutParams);
        this.f123513b = textView;
        SubView subView = new SubView(context, null, 0, 6, null);
        int iPxFromDp3 = (int) PixelExtensionsKt.pxFromDp(66.0f, context);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iPxFromDp3, iPxFromDp3);
        subView.setX(PixelExtensionsKt.pxFromDp(16.0f, context));
        subView.setY(PixelExtensionsKt.pxFromDp(30.0f, context));
        subView.setAlpha(0.0f);
        addView(subView, layoutParams2);
        this.f123514c = subView;
        this.mainBarcode = "";
        setBackground(toteDrawable);
        setMinimumWidth(PixelExtensionsKt.pxFromDp(BinsView.TOTE_WIDTH_DP, context));
        setMinimumHeight(PixelExtensionsKt.pxFromDp(BinsView.TOTE_HEIGHT_DP, context));
    }
}
