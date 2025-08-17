package com.scandit.datacapture.barcode.internal.module.find.ui.overlay;

import com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout;
import com.scandit.datacapture.barcode.internal.module.find.ui.u0;
import com.scandit.datacapture.core.internal.module.ui.NativeToastHintStyle;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class f implements BarcodeFindGuidanceHandler {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f122263a;

    /* renamed from: b, reason: collision with root package name */
    public e f122264b;

    public f(u0 viewLayout) {
        Intrinsics.j(viewLayout, "viewLayout");
        this.f122263a = new WeakReference(viewLayout);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.BarcodeFindGuidanceHandler
    public final void a(boolean z10, String text) {
        Intrinsics.j(text, "text");
        e eVar = e.f122259b;
        if (z10) {
            if (eVar != this.f122264b) {
                BarcodeFindViewLayout barcodeFindViewLayout = (BarcodeFindViewLayout) this.f122263a.get();
                if (barcodeFindViewLayout != null) {
                    barcodeFindViewLayout.b(text);
                    Unit unit = Unit.f142422a;
                }
                this.f122264b = eVar;
                return;
            }
            return;
        }
        if (eVar == this.f122264b) {
            BarcodeFindViewLayout barcodeFindViewLayout2 = (BarcodeFindViewLayout) this.f122263a.get();
            if (barcodeFindViewLayout2 != null) {
                barcodeFindViewLayout2.l();
                Unit unit2 = Unit.f142422a;
            }
            this.f122264b = null;
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.BarcodeFindGuidanceHandler
    public final void b(boolean z10, String text) {
        Intrinsics.j(text, "text");
        e eVar = e.f122258a;
        if (z10) {
            if (eVar != this.f122264b) {
                BarcodeFindViewLayout barcodeFindViewLayout = (BarcodeFindViewLayout) this.f122263a.get();
                if (barcodeFindViewLayout != null) {
                    barcodeFindViewLayout.a(text);
                    Unit unit = Unit.f142422a;
                }
                this.f122264b = eVar;
                return;
            }
            return;
        }
        if (eVar == this.f122264b) {
            BarcodeFindViewLayout barcodeFindViewLayout2 = (BarcodeFindViewLayout) this.f122263a.get();
            if (barcodeFindViewLayout2 != null) {
                barcodeFindViewLayout2.l();
                Unit unit2 = Unit.f142422a;
            }
            this.f122264b = null;
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.BarcodeFindGuidanceHandler
    public final void c(boolean z10, String text) {
        Intrinsics.j(text, "text");
        if (!z10) {
            BarcodeFindViewLayout barcodeFindViewLayout = (BarcodeFindViewLayout) this.f122263a.get();
            if (barcodeFindViewLayout != null) {
                barcodeFindViewLayout.c("item_list_updated");
                Unit unit = Unit.f142422a;
                return;
            }
            return;
        }
        WeakReference weakReference = this.f122263a;
        NativeToastHintStyle nativeToastHintStyle = NativeToastHintStyle.INFO;
        BarcodeFindViewLayout barcodeFindViewLayout2 = (BarcodeFindViewLayout) weakReference.get();
        if (barcodeFindViewLayout2 != null) {
            barcodeFindViewLayout2.a(text, nativeToastHintStyle, "item_list_updated");
            Unit unit2 = Unit.f142422a;
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.BarcodeFindGuidanceHandler
    public final void d(boolean z10, String text) {
        Intrinsics.j(text, "text");
        e eVar = e.f122261d;
        if (z10) {
            if (eVar != this.f122264b) {
                BarcodeFindViewLayout barcodeFindViewLayout = (BarcodeFindViewLayout) this.f122263a.get();
                if (barcodeFindViewLayout != null) {
                    barcodeFindViewLayout.a(text);
                    Unit unit = Unit.f142422a;
                }
                this.f122264b = eVar;
                return;
            }
            return;
        }
        if (eVar == this.f122264b) {
            BarcodeFindViewLayout barcodeFindViewLayout2 = (BarcodeFindViewLayout) this.f122263a.get();
            if (barcodeFindViewLayout2 != null) {
                barcodeFindViewLayout2.l();
                Unit unit2 = Unit.f142422a;
            }
            this.f122264b = null;
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.BarcodeFindGuidanceHandler
    public final void e(boolean z10, String text) {
        Intrinsics.j(text, "text");
        e eVar = e.f122260c;
        if (z10) {
            if (eVar != this.f122264b) {
                BarcodeFindViewLayout barcodeFindViewLayout = (BarcodeFindViewLayout) this.f122263a.get();
                if (barcodeFindViewLayout != null) {
                    barcodeFindViewLayout.a(text);
                    Unit unit = Unit.f142422a;
                }
                this.f122264b = eVar;
                return;
            }
            return;
        }
        if (eVar == this.f122264b) {
            BarcodeFindViewLayout barcodeFindViewLayout2 = (BarcodeFindViewLayout) this.f122263a.get();
            if (barcodeFindViewLayout2 != null) {
                barcodeFindViewLayout2.l();
                Unit unit2 = Unit.f142422a;
            }
            this.f122264b = null;
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.BarcodeFindGuidanceHandler
    public final void f(boolean z10, String text) {
        Intrinsics.j(text, "text");
        if (!z10) {
            BarcodeFindViewLayout barcodeFindViewLayout = (BarcodeFindViewLayout) this.f122263a.get();
            if (barcodeFindViewLayout != null) {
                barcodeFindViewLayout.c("all_items_found");
                Unit unit = Unit.f142422a;
                return;
            }
            return;
        }
        WeakReference weakReference = this.f122263a;
        NativeToastHintStyle nativeToastHintStyle = NativeToastHintStyle.SUCCESS;
        BarcodeFindViewLayout barcodeFindViewLayout2 = (BarcodeFindViewLayout) weakReference.get();
        if (barcodeFindViewLayout2 != null) {
            barcodeFindViewLayout2.a(text, nativeToastHintStyle, "all_items_found");
            Unit unit2 = Unit.f142422a;
        }
    }
}
