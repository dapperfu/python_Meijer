package com.meijer.mobile.core.design.widget.calloutview;

import Cj.f;
import Cj.k;
import Cj.m;
import Cj.p;
import Cj.q;
import Z1.b;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.fullstory.FS;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import ej.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR(\u0010#\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\u000f\u0010\"R(\u0010%\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010!\"\u0004\b\u0011\u0010\"R(\u0010*\u001a\u0004\u0018\u00010&2\b\u0010\u001f\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b\u0012\u0010)R(\u0010,\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010!\"\u0004\b\u0013\u0010\"¨\u0006-"}, d2 = {"Lcom/meijer/mobile/core/design/widget/calloutview/CalloutView;", "Lcom/google/android/material/card/MaterialCardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "defStyleRes", "", "k", "(Landroid/util/AttributeSet;II)V", "resId", "setTitle", "(I)V", "setBody", "setIcon", "setIconContentDescription", "Lcom/google/android/material/textview/MaterialTextView;", "s", "Lcom/google/android/material/textview/MaterialTextView;", "titleTextView", "t", "bodyTextView", "Landroid/widget/ImageView;", "u", "Landroid/widget/ImageView;", "iconView", "", "value", "getTitle", "()Ljava/lang/CharSequence;", "(Ljava/lang/CharSequence;)V", "title", "getBody", "body", "Landroid/graphics/drawable/Drawable;", "getIcon", "()Landroid/graphics/drawable/Drawable;", "(Landroid/graphics/drawable/Drawable;)V", BarcodePickDeserializer.FIELD_ICON, "getIconContentDescription", "iconContentDescription", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CalloutView extends MaterialCardView {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private MaterialTextView titleTextView;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private MaterialTextView bodyTextView;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private ImageView iconView;

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(TypedArray typedArray, int i10) {
        return typedArray instanceof Context ? FS.Resources_getDrawable((Context) typedArray, i10) : typedArray instanceof Resources ? FS.Resources_getDrawable((Resources) typedArray, i10) : typedArray.getDrawable(i10);
    }

    public final void setBody(CharSequence charSequence) {
        MaterialTextView materialTextView = this.bodyTextView;
        MaterialTextView materialTextView2 = null;
        if (materialTextView == null) {
            Intrinsics.x("bodyTextView");
            materialTextView = null;
        }
        materialTextView.setText(charSequence);
        MaterialTextView materialTextView3 = this.bodyTextView;
        if (materialTextView3 == null) {
            Intrinsics.x("bodyTextView");
        } else {
            materialTextView2 = materialTextView3;
        }
        materialTextView2.setVisibility(charSequence == null || StringsKt.s0(charSequence) ? 8 : 0);
    }

    public final void setIcon(Drawable drawable) {
        ImageView imageView = this.iconView;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.x("iconView");
            imageView = null;
        }
        imageView.setImageDrawable(drawable);
        ImageView imageView3 = this.iconView;
        if (imageView3 == null) {
            Intrinsics.x("iconView");
        } else {
            imageView2 = imageView3;
        }
        imageView2.setVisibility(drawable != null ? 0 : 8);
    }

    public final void setIconContentDescription(CharSequence charSequence) {
        ImageView imageView = this.iconView;
        if (imageView == null) {
            Intrinsics.x("iconView");
            imageView = null;
        }
        imageView.setContentDescription(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        MaterialTextView materialTextView = this.titleTextView;
        MaterialTextView materialTextView2 = null;
        if (materialTextView == null) {
            Intrinsics.x("titleTextView");
            materialTextView = null;
        }
        materialTextView.setText(charSequence);
        MaterialTextView materialTextView3 = this.titleTextView;
        if (materialTextView3 == null) {
            Intrinsics.x("titleTextView");
        } else {
            materialTextView2 = materialTextView3;
        }
        materialTextView2.setVisibility(charSequence == null || StringsKt.s0(charSequence) ? 8 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalloutView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.j(context, "context");
        Intrinsics.j(attrs, "attrs");
        l(this, attrs, 0, 0, 4, null);
    }

    private final void k(AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        c.d(this, m.f4996u, true);
        this.titleTextView = (MaterialTextView) findViewById(k.f4940m);
        this.bodyTextView = (MaterialTextView) findViewById(k.f4934k);
        this.iconView = (ImageView) findViewById(k.f4937l);
        Context context = getContext();
        Intrinsics.i(context, "getContext(...)");
        int[] CalloutView = q.f5148a;
        Intrinsics.i(CalloutView, "CalloutView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, CalloutView, defStyleAttr, defStyleRes);
        setTitle(typedArrayObtainStyledAttributes.getString(q.f5154e));
        setBody(typedArrayObtainStyledAttributes.getString(q.f5150b));
        setIcon(__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, q.f5152c));
        setIconContentDescription(typedArrayObtainStyledAttributes.getString(q.f5153d));
        typedArrayObtainStyledAttributes.recycle();
    }

    static /* synthetic */ void l(CalloutView calloutView, AttributeSet attributeSet, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = f.f4647a;
        }
        if ((i12 & 4) != 0) {
            i11 = p.f5112k;
        }
        calloutView.k(attributeSet, i10, i11);
    }

    public final CharSequence getBody() {
        MaterialTextView materialTextView = this.bodyTextView;
        if (materialTextView == null) {
            Intrinsics.x("bodyTextView");
            materialTextView = null;
        }
        return materialTextView.getText();
    }

    public final Drawable getIcon() {
        ImageView imageView = this.iconView;
        if (imageView == null) {
            Intrinsics.x("iconView");
            imageView = null;
        }
        return imageView.getDrawable();
    }

    public final CharSequence getIconContentDescription() {
        ImageView imageView = this.iconView;
        if (imageView == null) {
            Intrinsics.x("iconView");
            imageView = null;
        }
        return imageView.getContentDescription();
    }

    public final CharSequence getTitle() {
        MaterialTextView materialTextView = this.titleTextView;
        if (materialTextView == null) {
            Intrinsics.x("titleTextView");
            materialTextView = null;
        }
        return materialTextView.getText();
    }

    public final void setIconContentDescription(int resId) {
        setIconContentDescription(getContext().getString(resId));
    }

    public final void setBody(int resId) {
        setBody(getContext().getString(resId));
    }

    public final void setIcon(int resId) {
        setIcon(b.e(getContext(), resId));
    }

    public final void setTitle(int resId) {
        setTitle(getContext().getString(resId));
    }
}
