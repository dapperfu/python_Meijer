package com.scandit.datacapture.core.internal.module.ui.control;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.scandit.datacapture.core.internal.module.ui.control.ToggleImageButton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class ToggleImageButton extends ImageButton {

    /* renamed from: d, reason: collision with root package name */
    private static final Lazy f126122d = LazyKt.b(a.f126127a);

    /* renamed from: e, reason: collision with root package name */
    private static final Lazy f126123e = LazyKt.b(b.f126128a);

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f126124a;

    /* renamed from: b, reason: collision with root package name */
    private Function0 f126125b;

    /* renamed from: c, reason: collision with root package name */
    private Function0 f126126c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleImageButton(Context context, ViewGroup.LayoutParams initialParams) {
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(initialParams, "initialParams");
        setLayoutParams(initialParams);
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        setBackground(new ColorDrawable(0));
        setPadding(0, 0, 0, 0);
        setOnClickListener(new View.OnClickListener() { // from class: eu.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToggleImageButton.a(this.f130899a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ToggleImageButton this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        Function0 function0 = this$0.f126126c;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final boolean b() {
        return this.f126124a;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.j(event, "event");
        if (event.getAction() == 0 && !this.f126124a) {
            this.f126124a = true;
            Function0 function0 = this.f126125b;
            if (function0 != null) {
                function0.invoke();
            }
        } else if ((event.getAction() == 1 || event.getAction() == 3) && this.f126124a) {
            this.f126124a = false;
            Function0 function02 = this.f126125b;
            if (function02 != null) {
                function02.invoke();
            }
        }
        return super.onTouchEvent(event);
    }

    public final void a(Function0 block) {
        Intrinsics.j(block, "block");
        this.f126125b = block;
    }

    public final void b(Function0 block) {
        Intrinsics.j(block, "block");
        this.f126126c = block;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ToggleImageButton(Context context) {
        Lazy lazy = f126122d;
        this(context, new ViewGroup.LayoutParams(((Number) lazy.getValue()).intValue(), ((Number) lazy.getValue()).intValue()));
    }
}
