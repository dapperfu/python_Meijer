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

/* loaded from: classes11.dex */
public final class ToggleImageButton extends ImageButton {

    /* renamed from: d, reason: collision with root package name */
    private static final Lazy f125170d = LazyKt.b(a.f125175a);

    /* renamed from: e, reason: collision with root package name */
    private static final Lazy f125171e = LazyKt.b(b.f125176a);

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f125172a;

    /* renamed from: b, reason: collision with root package name */
    private Function0 f125173b;

    /* renamed from: c, reason: collision with root package name */
    private Function0 f125174c;

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
                ToggleImageButton.a(this.f130058a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ToggleImageButton this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        Function0 function0 = this$0.f125174c;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final boolean b() {
        return this.f125172a;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.j(event, "event");
        if (event.getAction() == 0 && !this.f125172a) {
            this.f125172a = true;
            Function0 function0 = this.f125173b;
            if (function0 != null) {
                function0.invoke();
            }
        } else if ((event.getAction() == 1 || event.getAction() == 3) && this.f125172a) {
            this.f125172a = false;
            Function0 function02 = this.f125173b;
            if (function02 != null) {
                function02.invoke();
            }
        }
        return super.onTouchEvent(event);
    }

    public final void a(Function0 block) {
        Intrinsics.j(block, "block");
        this.f125173b = block;
    }

    public final void b(Function0 block) {
        Intrinsics.j(block, "block");
        this.f125174c = block;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ToggleImageButton(Context context) {
        Lazy lazy = f125170d;
        this(context, new ViewGroup.LayoutParams(((Number) lazy.getValue()).intValue(), ((Number) lazy.getValue()).intValue()));
    }
}
