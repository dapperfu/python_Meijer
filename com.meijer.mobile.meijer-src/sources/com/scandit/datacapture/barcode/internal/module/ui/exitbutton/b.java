package com.scandit.datacapture.barcode.internal.module.ui.exitbutton;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f124268a;

    public b(Context context) {
        Intrinsics.j(context, "context");
        this.f124268a = context;
    }

    public final c a() {
        c cVar = new c(this.f124268a);
        cVar.setId(View.generateViewId());
        return cVar;
    }
}
