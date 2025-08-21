package com.scandit.datacapture.barcode.internal.module.pick.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f123472a;

    public static final void a(View view) {
    }

    public g(Context context) {
        Intrinsics.j(context, "context");
        this.f123472a = context;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.f
    public final View a() {
        FrameLayout frameLayout = new FrameLayout(this.f123472a);
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.scandit.datacapture.barcode.internal.module.pick.ui.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.a(view);
            }
        });
        return frameLayout;
    }
}
