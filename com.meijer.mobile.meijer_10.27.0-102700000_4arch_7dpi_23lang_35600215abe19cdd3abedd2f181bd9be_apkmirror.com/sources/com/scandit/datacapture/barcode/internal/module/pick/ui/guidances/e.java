package com.scandit.datacapture.barcode.internal.module.pick.ui.guidances;

import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class e extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f122529a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f122530b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f122531c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f122532d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z10, g gVar, String str, boolean z11) {
        super(1);
        this.f122529a = z10;
        this.f122530b = gVar;
        this.f122531c = str;
        this.f122532d = z11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        g it = (g) obj;
        Intrinsics.j(it, "it");
        if (this.f122529a) {
            i iVar = (i) this.f122530b.f122539e.getValue();
            String text = this.f122531c;
            boolean z10 = this.f122532d;
            l lVar = (l) iVar;
            lVar.getClass();
            Intrinsics.j(text, "text");
            if (z10) {
                lVar.f122542a.a(com.scandit.datacapture.barcode.internal.module.ui.j.f123341c, text);
            } else {
                lVar.f122542a.a(com.scandit.datacapture.barcode.internal.module.ui.j.f123342d, text);
            }
            g gVar = this.f122530b;
            if (!gVar.f122538d) {
                gVar.addView(((l) ((i) gVar.f122539e.getValue())).f122542a, new FrameLayout.LayoutParams(-2, -2, 17));
            }
        } else {
            g gVar2 = this.f122530b;
            if (gVar2.f122538d) {
                gVar2.removeView(((l) ((i) gVar2.f122539e.getValue())).f122542a);
            }
        }
        this.f122530b.f122538d = this.f122529a;
        return Unit.f142422a;
    }
}
