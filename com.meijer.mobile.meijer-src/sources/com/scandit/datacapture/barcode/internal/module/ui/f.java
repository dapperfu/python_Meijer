package com.scandit.datacapture.barcode.internal.module.ui;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class f extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f124282a;

    public f(g gVar) {
        this.f124282a = gVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Intrinsics.j(view, "view");
        Intrinsics.j(outline, "outline");
        outline.set(this.f124282a.f124283a);
    }
}
