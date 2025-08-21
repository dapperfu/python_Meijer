package com.scandit.datacapture.core.internal.module.ui;

import android.content.Context;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class m extends TextView {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f126254a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context) {
        super(context);
        Intrinsics.j(context, "context");
        this.f126254a = LazyKt.b(new l(this));
    }

    public final void a() {
        CharSequence text;
        int width = (getWidth() - getPaddingRight()) - getPaddingLeft();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (height > 0 && width > 0 && (text = getText()) != null && text.length() != 0) {
            float textSize = getTextSize();
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(textSize);
            int height2 = StaticLayout.Builder.obtain(getText(), 0, getText().length(), textPaint, width).build().getHeight();
            while (height2 > height && textSize > ((Number) this.f126254a.getValue()).floatValue()) {
                textSize -= 1.0f;
                textPaint.setTextSize(textSize);
                height2 = StaticLayout.Builder.obtain(getText(), 0, getText().length(), textPaint, width).build().getHeight();
            }
            setTextSize(0, textSize);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            a();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            a();
        }
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        a();
    }
}
