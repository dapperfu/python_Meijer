package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewPresenter;
import com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.C13361h;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13361h {

    /* renamed from: a, reason: collision with root package name */
    public x f124150a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f124151b;

    /* renamed from: c, reason: collision with root package name */
    public final C13360g f124152c;

    public C13361h(RelativeLayout container) {
        Intrinsics.j(container, "container");
        this.f124151b = new WeakReference(container);
        Context context = container.getContext();
        Intrinsics.i(context, "getContext(...)");
        C13360g c13360g = new C13360g(context);
        c13360g.setOnClickListener(new View.OnClickListener() { // from class: Ut.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C13361h.a(this.f37742a, view);
            }
        });
        this.f124152c = c13360g;
    }

    public static final void a(C13361h this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        x xVar = this$0.f124150a;
        if (xVar != null) {
            ((SparkScanViewPresenter) xVar).t();
        }
    }
}
