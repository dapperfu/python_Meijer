package com.scandit.datacapture.barcode.internal.module.pick.ui.guidances;

import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class e extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f123481a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f123482b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f123483c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f123484d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z10, g gVar, String str, boolean z11) {
        super(1);
        this.f123481a = z10;
        this.f123482b = gVar;
        this.f123483c = str;
        this.f123484d = z11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        g it = (g) obj;
        Intrinsics.j(it, "it");
        if (this.f123481a) {
            i iVar = (i) this.f123482b.f123491e.getValue();
            String text = this.f123483c;
            boolean z10 = this.f123484d;
            l lVar = (l) iVar;
            lVar.getClass();
            Intrinsics.j(text, "text");
            if (z10) {
                lVar.f123494a.a(com.scandit.datacapture.barcode.internal.module.ui.j.f124293c, text);
            } else {
                lVar.f123494a.a(com.scandit.datacapture.barcode.internal.module.ui.j.f124294d, text);
            }
            g gVar = this.f123482b;
            if (!gVar.f123490d) {
                gVar.addView(((l) ((i) gVar.f123491e.getValue())).f123494a, new FrameLayout.LayoutParams(-2, -2, 17));
            }
        } else {
            g gVar2 = this.f123482b;
            if (gVar2.f123490d) {
                gVar2.removeView(((l) ((i) gVar2.f123491e.getValue())).f123494a);
            }
        }
        this.f123482b.f123490d = this.f123481a;
        return Unit.f143329a;
    }
}
