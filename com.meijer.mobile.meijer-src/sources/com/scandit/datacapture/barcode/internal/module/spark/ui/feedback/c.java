package com.scandit.datacapture.barcode.internal.module.spark.ui.feedback;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.scandit.datacapture.barcode.internal.module.spark.ui.feedback.c;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class c extends View {
    public final void a(int i10) {
        setBackground(new ColorDrawable(i10));
        setAlpha(0.0f);
        setVisibility(0);
        animate().alpha(1.0f).setDuration(200L).withEndAction(new Runnable() { // from class: Tt.a
            @Override // java.lang.Runnable
            public final void run() {
                c.a(this.f36795a);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        Intrinsics.j(context, "context");
        setVisibility(8);
        setBackground(new ColorDrawable(0));
    }

    public static final void a(c this$0) {
        Intrinsics.j(this$0, "this$0");
        this$0.setVisibility(8);
    }
}
