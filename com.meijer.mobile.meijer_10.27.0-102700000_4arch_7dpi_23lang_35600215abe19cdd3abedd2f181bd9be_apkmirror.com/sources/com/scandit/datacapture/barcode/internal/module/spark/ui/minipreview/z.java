package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewPresenter;
import com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.z;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public x f123236a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f123237b;

    /* renamed from: c, reason: collision with root package name */
    public final y f123238c;

    public z(RelativeLayout container) {
        Intrinsics.j(container, "container");
        this.f123237b = new WeakReference(container);
        Context context = container.getContext();
        Intrinsics.i(context, "getContext(...)");
        y yVar = new y(context);
        yVar.setOnClickListener(new View.OnClickListener() { // from class: Ut.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z.a(this.f36334a, view);
            }
        });
        this.f123238c = yVar;
    }

    public static final void a(z this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        x xVar = this$0.f123236a;
        if (xVar != null) {
            ((SparkScanViewPresenter) xVar).w();
        }
    }
}
