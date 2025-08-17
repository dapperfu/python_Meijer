package com.scandit.datacapture.barcode.internal.module.ui.shutterbutton;

import android.content.Context;
import com.scandit.datacapture.barcode.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f123410a;

    public b(Context context) {
        Intrinsics.j(context, "context");
        this.f123410a = context;
    }

    public final f a() {
        f fVar = new f(this.f123410a);
        fVar.setId(((Number) d.f123412a.getValue()).intValue());
        fVar.setContentDescription(fVar.getContext().getString(R.string.sc_barcode_find_shutter_content_description));
        return fVar;
    }
}
