package com.scandit.datacapture.barcode.internal.module.ui.exitbutton;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f123316a;

    public b(Context context) {
        Intrinsics.j(context, "context");
        this.f123316a = context;
    }

    public final c a() {
        c cVar = new c(this.f123316a);
        cVar.setId(View.generateViewId());
        return cVar;
    }
}
