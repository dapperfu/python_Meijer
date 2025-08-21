package com.scandit.datacapture.barcode.internal.module.ui.shutterbutton;

import android.content.Context;
import com.scandit.datacapture.barcode.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f124362a;

    public b(Context context) {
        Intrinsics.j(context, "context");
        this.f124362a = context;
    }

    public final f a() {
        f fVar = new f(this.f124362a);
        fVar.setId(((Number) d.f124364a.getValue()).intValue());
        fVar.setContentDescription(fVar.getContext().getString(R.string.sc_barcode_find_shutter_content_description));
        return fVar;
    }
}
