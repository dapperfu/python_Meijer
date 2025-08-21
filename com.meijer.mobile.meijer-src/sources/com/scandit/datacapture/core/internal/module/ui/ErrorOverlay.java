package com.scandit.datacapture.core.internal.module.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.scandit.datacapture.core.common.ContextStatus;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class ErrorOverlay extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final m f126090a;

    public final void a(ContextStatus contextStatus) {
        Intrinsics.j(contextStatus, "contextStatus");
        String string = "Error " + contextStatus.getCode() + ": " + contextStatus.getMessage();
        Intrinsics.j(string, "string");
        this.f126090a.setText(string);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorOverlay(Context context) {
        super(context, null, 0);
        Intrinsics.j(context, "context");
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        setBackgroundColor(1996488704);
        m mVar = new m(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        mVar.setGravity(17);
        mVar.setLayoutParams(layoutParams);
        mVar.setTextAlignment(4);
        mVar.setTextColor(-1);
        mVar.setBackgroundColor(0);
        int iPxFromDp$default = PixelExtensionsKt.pxFromDp$default(20, (Context) null, 1, (Object) null);
        mVar.setPadding(iPxFromDp$default, iPxFromDp$default, iPxFromDp$default, iPxFromDp$default);
        mVar.setTextSize(25.0f);
        mVar.setAlpha(0.5f);
        this.f126090a = mVar;
        addView(mVar);
    }

    public final void a() {
        Intrinsics.j("", "string");
        this.f126090a.setText("");
    }
}
