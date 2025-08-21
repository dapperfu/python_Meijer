package com.scandit.datacapture.barcode.internal.module.find.ui;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.find.ui.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13287b extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final int f123134a;

    /* renamed from: b, reason: collision with root package name */
    public final int f123135b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C13301m f123136c;

    public C13287b(C13301m c13301m, int i10, int i11) {
        this.f123136c = c13301m;
        this.f123134a = i10;
        this.f123135b = i11;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int iB;
        Intrinsics.j(view, "view");
        Intrinsics.j(outline, "outline");
        if (this.f123136c.f123199e) {
            Lazy lazy = C13301m.f123189f;
            iB = (int) (C13297i.b() - ((Number) C13301m.f123191h.getValue()).floatValue());
        } else {
            iB = 0;
        }
        outline.setOval(iB, iB, this.f123134a - iB, this.f123135b - iB);
    }
}
