package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewPresenter;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public x f123214a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f123215b;

    /* renamed from: c, reason: collision with root package name */
    public final q f123216c;

    public r(RelativeLayout container) {
        Intrinsics.j(container, "container");
        this.f123215b = new WeakReference(container);
        Context context = container.getContext();
        Intrinsics.i(context, "getContext(...)");
        q qVar = new q(context);
        qVar.setOnClickListener(new View.OnClickListener() { // from class: Ut.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.r.a(this.f36332a, view);
            }
        });
        this.f123216c = qVar;
    }

    public static final void a(r this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        x xVar = this$0.f123214a;
        if (xVar != null) {
            ((SparkScanViewPresenter) xVar).v();
        }
    }
}
