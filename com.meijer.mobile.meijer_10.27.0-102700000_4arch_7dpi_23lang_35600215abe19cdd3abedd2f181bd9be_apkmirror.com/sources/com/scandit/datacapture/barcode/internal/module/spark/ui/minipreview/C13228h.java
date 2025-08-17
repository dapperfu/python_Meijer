package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewPresenter;
import com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.C13228h;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13228h {

    /* renamed from: a, reason: collision with root package name */
    public x f123198a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f123199b;

    /* renamed from: c, reason: collision with root package name */
    public final C13227g f123200c;

    public C13228h(RelativeLayout container) {
        Intrinsics.j(container, "container");
        this.f123199b = new WeakReference(container);
        Context context = container.getContext();
        Intrinsics.i(context, "getContext(...)");
        C13227g c13227g = new C13227g(context);
        c13227g.setOnClickListener(new View.OnClickListener() { // from class: Ut.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C13228h.a(this.f36330a, view);
            }
        });
        this.f123200c = c13227g;
    }

    public static final void a(C13228h this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        x xVar = this$0.f123198a;
        if (xVar != null) {
            ((SparkScanViewPresenter) xVar).t();
        }
    }
}
