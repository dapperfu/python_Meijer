package com.meijer.mobile.widget;

import Mn.L2;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.fullstory.FS;
import com.meijer.mobile.meijer.a0;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/widget/UnauthContentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "text", "", "setTitle", "(Ljava/lang/String;)V", "setDesc", "Landroid/graphics/drawable/Drawable;", "drawable", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", "LMn/L2;", "x", "LMn/L2;", "binding", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class UnauthContentView extends ConstraintLayout {

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final L2 binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UnauthContentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.j(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(TypedArray typedArray, int i10) {
        return typedArray instanceof Context ? FS.Resources_getDrawable((Context) typedArray, i10) : typedArray instanceof Resources ? FS.Resources_getDrawable((Resources) typedArray, i10) : typedArray.getDrawable(i10);
    }

    public /* synthetic */ UnauthContentView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void setDesc(String text) {
        this.binding.f20188z.setText(text);
    }

    public final void setIcon(Drawable drawable) {
        this.binding.f20186A.setImageDrawable(drawable);
    }

    public final void setTitle(String text) {
        this.binding.f20187B.setText(text);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UnauthContentView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.j(context, "context");
        L2 l2K0 = L2.K0(dj.c.a(context), this, true);
        Intrinsics.i(l2K0, "inflate(...)");
        this.binding = l2K0;
        int[] UnauthContentView = a0.f100929E;
        Intrinsics.i(UnauthContentView, "UnauthContentView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, UnauthContentView, 0, i10);
        Drawable drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160 = __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, a0.f100930F);
        if (drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160 != null) {
            setIcon(drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160);
        }
        String string = typedArrayObtainStyledAttributes.getString(a0.f100932H);
        if (string != null) {
            string = StringsKt.r0(string) ? null : string;
            if (string != null) {
                setTitle(string);
            }
        }
        String string2 = typedArrayObtainStyledAttributes.getString(a0.f100931G);
        if (string2 != null) {
            String str = StringsKt.r0(string2) ? null : string2;
            if (str != null) {
                setDesc(str);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
