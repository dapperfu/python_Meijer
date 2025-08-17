package com.meijer.mobile.core.design.widget.enhancedtextinputlayoutview;

import Bj.f;
import Bj.k;
import Bj.m;
import Bj.p;
import Bj.q;
import ak.AbstractC5607a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import bk.d;
import com.google.android.material.textfield.TextInputLayout;
import com.meijer.mobile.core.design.widget.enhancedtextinputlayoutview.EnhancedTextInputLayoutView;
import dj.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 L2\u00020\u0001:\u0001.B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0015\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0019\u0010\u0012J\u0017\u0010\u001a\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001a\u0010\u0012JQ\u0010$\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\f\u0018\u00010!¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0006¢\u0006\u0004\b'\u0010\u000eJ'\u0010+\u001a\u00020\f2\u0006\u0010(\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010/R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00107\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010/R\u0018\u00109\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010/R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010@\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R$\u0010H\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010\u0018\u001a\u00020A2\u0006\u0010I\u001a\u00020A8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010E\"\u0004\bK\u0010G¨\u0006M"}, d2 = {"Lcom/meijer/mobile/core/design/widget/enhancedtextinputlayoutview/EnhancedTextInputLayoutView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "resId", "", "setBoxBackgroundColorResource", "(I)V", "", "successText", "setSuccess", "(Ljava/lang/CharSequence;)V", "Lak/a;", "formattedString", "setError", "(Lak/a;)V", "errorText", "text", "setPlaceholderText", "setHintText", "endIconMode", "Landroid/content/res/ColorStateList;", "tint", "Landroid/graphics/drawable/Drawable;", "drawable", "contentDescription", "Lkotlin/Function1;", "Landroid/view/View;", "action", "b", "(ILandroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)V", "index", "setSelection", "child", "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "hintText", "informationText", "Lcom/google/android/material/textfield/TextInputLayout;", "c", "Lcom/google/android/material/textfield/TextInputLayout;", "textInputLayout", "d", "errorTextView", "e", "successTextView", "Landroid/widget/EditText;", "f", "Landroid/widget/EditText;", "editText", "g", "Ljava/lang/CharSequence;", "placeholderText", "", "h", "Ljava/lang/String;", "getSecondaryText", "()Ljava/lang/String;", "setSecondaryText", "(Ljava/lang/String;)V", "secondaryText", "value", "getText", "setText", "i", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class EnhancedTextInputLayoutView extends LinearLayout {

    /* renamed from: j, reason: collision with root package name */
    public static final int f96057j = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private TextView hintText;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private TextView informationText;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private TextInputLayout textInputLayout;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private TextView errorTextView;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private TextView successTextView;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private EditText editText;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private CharSequence placeholderText;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private String secondaryText;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EnhancedTextInputLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.j(context, "context");
    }

    public final void setError(AbstractC5607a formattedString) {
        Intrinsics.j(formattedString, "formattedString");
        Context context = getContext();
        Intrinsics.i(context, "getContext(...)");
        setError(d.a(context, formattedString));
    }

    public /* synthetic */ EnhancedTextInputLayoutView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? f.f2606e : i10, (i12 & 8) != 0 ? p.f3069m : i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void c(EnhancedTextInputLayoutView enhancedTextInputLayoutView, int i10, ColorStateList colorStateList, Drawable drawable, CharSequence charSequence, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            colorStateList = null;
        }
        if ((i11 & 4) != 0) {
            drawable = null;
        }
        if ((i11 & 8) != 0) {
            charSequence = null;
        }
        if ((i11 & 16) != 0) {
            function1 = null;
        }
        enhancedTextInputLayoutView.b(i10, colorStateList, drawable, charSequence, function1);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        Intrinsics.j(child, "child");
        Intrinsics.j(params, "params");
        if (!(child instanceof EditText)) {
            super.addView(child, index, params);
            return;
        }
        EditText editText = (EditText) child;
        if (editText.getId() == -1) {
            editText.setId(View.generateViewId());
        }
        this.editText = editText;
        if (editText == null) {
            Intrinsics.y("editText");
            editText = null;
        }
        editText.setHint(this.placeholderText);
        TextInputLayout textInputLayout = this.textInputLayout;
        if (textInputLayout != null) {
            textInputLayout.addView(child, index, params);
        }
        TextView textView = this.hintText;
        if (textView != null) {
            EditText editText2 = this.editText;
            if (editText2 == null) {
                Intrinsics.y("editText");
                editText2 = null;
            }
            textView.setLabelFor(editText2.getId());
        }
        if (child instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) child;
            autoCompleteTextView.setKeyListener(null);
            autoCompleteTextView.setFocusable(true);
        }
    }

    public final void b(int endIconMode, ColorStateList tint, Drawable drawable, CharSequence contentDescription, final Function1<? super View, Unit> action) {
        TextInputLayout textInputLayout = this.textInputLayout;
        if (textInputLayout != null) {
            textInputLayout.setEndIconMode(endIconMode);
        }
        TextInputLayout textInputLayout2 = this.textInputLayout;
        if (textInputLayout2 != null) {
            textInputLayout2.setEndIconTintList(tint);
        }
        TextInputLayout textInputLayout3 = this.textInputLayout;
        if (textInputLayout3 != null) {
            textInputLayout3.setEndIconDrawable(drawable);
        }
        TextInputLayout textInputLayout4 = this.textInputLayout;
        if (textInputLayout4 != null) {
            textInputLayout4.setEndIconCheckable(false);
        }
        TextInputLayout textInputLayout5 = this.textInputLayout;
        if (textInputLayout5 != null) {
            textInputLayout5.setEndIconContentDescription(contentDescription);
        }
        TextInputLayout textInputLayout6 = this.textInputLayout;
        if (textInputLayout6 != null) {
            textInputLayout6.setEndIconOnClickListener(action != null ? new View.OnClickListener() { // from class: Tj.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EnhancedTextInputLayoutView.d(action, view);
                }
            } : null);
        }
    }

    public final String getSecondaryText() {
        return this.secondaryText;
    }

    public final String getText() {
        EditText editText = this.editText;
        if (editText == null) {
            Intrinsics.y("editText");
            editText = null;
        }
        return editText.getText().toString();
    }

    public final void setBoxBackgroundColorResource(int resId) {
        TextInputLayout textInputLayout = this.textInputLayout;
        if (textInputLayout != null) {
            textInputLayout.setBoxBackgroundColorResource(resId);
        }
    }

    public final void setError(CharSequence errorText) {
        TextView textView;
        TextView textView2 = this.errorTextView;
        if (textView2 != null) {
            textView2.setText(errorText);
        }
        TextInputLayout textInputLayout = this.textInputLayout;
        if (textInputLayout != null) {
            textInputLayout.setError(errorText);
        }
        TextView textView3 = this.successTextView;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        if (errorText == null || errorText.length() == 0) {
            TextView textView4 = this.errorTextView;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            TextInputLayout textInputLayout2 = this.textInputLayout;
            if (textInputLayout2 != null) {
                textInputLayout2.setErrorEnabled(false);
            }
        } else if (StringsKt.r0(errorText)) {
            TextInputLayout textInputLayout3 = this.textInputLayout;
            if (textInputLayout3 != null) {
                textInputLayout3.setErrorEnabled(true);
            }
            TextView textView5 = this.errorTextView;
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
        } else {
            TextView textView6 = this.errorTextView;
            if (textView6 != null) {
                textView6.setVisibility(0);
            }
        }
        TextInputLayout textInputLayout4 = this.textInputLayout;
        if (textInputLayout4 == null || (textView = (TextView) textInputLayout4.findViewById(ae.f.f44674T)) == null) {
            return;
        }
        textView.setVisibility(8);
    }

    public final void setHintText(CharSequence text) {
        TextView textView = this.hintText;
        if (textView != null) {
            textView.setText(text);
        }
    }

    public final void setPlaceholderText(CharSequence text) {
        EditText editText = this.editText;
        if (editText == null) {
            Intrinsics.y("editText");
            editText = null;
        }
        editText.setHint(text);
    }

    public final void setSecondaryText(String str) {
        this.secondaryText = str;
    }

    public final void setSelection(int index) {
        EditText editText = this.editText;
        if (editText == null) {
            Intrinsics.y("editText");
            editText = null;
        }
        editText.setSelection(index);
    }

    public final void setSuccess(CharSequence successText) {
        TextView textView = this.successTextView;
        if (textView != null) {
            textView.setText(successText);
        }
        TextView textView2 = this.successTextView;
        if (textView2 != null) {
            textView2.setVisibility(successText == null || successText.length() == 0 ? 8 : 0);
        }
        TextView textView3 = this.errorTextView;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        TextInputLayout textInputLayout = this.textInputLayout;
        if (textInputLayout != null) {
            textInputLayout.setErrorEnabled(false);
        }
    }

    public final void setText(String value) {
        Intrinsics.j(value, "value");
        EditText editText = this.editText;
        if (editText == null) {
            Intrinsics.y("editText");
            editText = null;
        }
        editText.setText(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Function1 function1, View view) {
        function1.invoke(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EnhancedTextInputLayoutView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Intrinsics.j(context, "context");
        this.secondaryText = "";
        c.d(this, m.f2949s, true);
        setOrientation(1);
        this.textInputLayout = (TextInputLayout) findViewById(k.f2819G);
        this.hintText = (TextView) findViewById(k.f2841R);
        this.informationText = (TextView) findViewById(k.f2860a0);
        this.errorTextView = (TextView) findViewById(k.f2827K);
        this.successTextView = (TextView) findViewById(k.f2842R0);
        int[] EnhancedTextInputLayoutView = q.f3116l;
        Intrinsics.i(EnhancedTextInputLayoutView, "EnhancedTextInputLayoutView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, EnhancedTextInputLayoutView, i10, i11);
        TextView textView = this.hintText;
        if (textView != null) {
            textView.setText(typedArrayObtainStyledAttributes.getString(q.f3117m));
        }
        TextView textView2 = this.informationText;
        if (textView2 != null) {
            textView2.setText(typedArrayObtainStyledAttributes.getString(q.f3119o));
        }
        this.placeholderText = typedArrayObtainStyledAttributes.getText(q.f3120p);
        TextInputLayout textInputLayout = this.textInputLayout;
        if (textInputLayout != null) {
            textInputLayout.setEndIconMode(typedArrayObtainStyledAttributes.getInt(q.f3118n, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
