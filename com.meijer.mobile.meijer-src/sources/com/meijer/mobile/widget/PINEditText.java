package com.meijer.mobile.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;

/* loaded from: classes12.dex */
public class PINEditText extends AppCompatEditText {
    private void e() {
        setInputType(2);
    }

    public PINEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e();
    }
}
