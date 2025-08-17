package com.scandit.datacapture.barcode.internal.module.find.ui;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.find.ui.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13154b extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final int f122182a;

    /* renamed from: b, reason: collision with root package name */
    public final int f122183b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C13168m f122184c;

    public C13154b(C13168m c13168m, int i10, int i11) {
        this.f122184c = c13168m;
        this.f122182a = i10;
        this.f122183b = i11;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int iB;
        Intrinsics.j(view, "view");
        Intrinsics.j(outline, "outline");
        if (this.f122184c.f122247e) {
            Lazy lazy = C13168m.f122237f;
            iB = (int) (C13164i.b() - ((Number) C13168m.f122239h.getValue()).floatValue());
        } else {
            iB = 0;
        }
        outline.setOval(iB, iB, this.f122182a - iB, this.f122183b - iB);
    }
}
