package com.scandit.datacapture.barcode.internal.module.find.ui.overlay;

import com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout;
import com.scandit.datacapture.barcode.internal.module.find.ui.u0;
import com.scandit.datacapture.core.internal.module.ui.NativeToastHintStyle;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class f implements BarcodeFindGuidanceHandler {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f123215a;

    /* renamed from: b, reason: collision with root package name */
    public e f123216b;

    public f(u0 viewLayout) {
        Intrinsics.j(viewLayout, "viewLayout");
        this.f123215a = new WeakReference(viewLayout);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.BarcodeFindGuidanceHandler
    public final void a(boolean z10, String text) {
        Intrinsics.j(text, "text");
        e eVar = e.f123211b;
        if (z10) {
            if (eVar != this.f123216b) {
                BarcodeFindViewLayout barcodeFindViewLayout = (BarcodeFindViewLayout) this.f123215a.get();
                if (barcodeFindViewLayout != null) {
                    barcodeFindViewLayout.b(text);
                    Unit unit = Unit.f143329a;
                }
                this.f123216b = eVar;
                return;
            }
            return;
        }
        if (eVar == this.f123216b) {
            BarcodeFindViewLayout barcodeFindViewLayout2 = (BarcodeFindViewLayout) this.f123215a.get();
            if (barcodeFindViewLayout2 != null) {
                barcodeFindViewLayout2.l();
                Unit unit2 = Unit.f143329a;
            }
            this.f123216b = null;
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.BarcodeFindGuidanceHandler
    public final void b(boolean z10, String text) {
        Intrinsics.j(text, "text");
        e eVar = e.f123210a;
        if (z10) {
            if (eVar != this.f123216b) {
                BarcodeFindViewLayout barcodeFindViewLayout = (BarcodeFindViewLayout) this.f123215a.get();
                if (barcodeFindViewLayout != null) {
                    barcodeFindViewLayout.a(text);
                    Unit unit = Unit.f143329a;
                }
                this.f123216b = eVar;
                return;
            }
            return;
        }
        if (eVar == this.f123216b) {
            BarcodeFindViewLayout barcodeFindViewLayout2 = (BarcodeFindViewLayout) this.f123215a.get();
            if (barcodeFindViewLayout2 != null) {
                barcodeFindViewLayout2.l();
                Unit unit2 = Unit.f143329a;
            }
            this.f123216b = null;
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.BarcodeFindGuidanceHandler
    public final void c(boolean z10, String text) {
        Intrinsics.j(text, "text");
        if (!z10) {
            BarcodeFindViewLayout barcodeFindViewLayout = (BarcodeFindViewLayout) this.f123215a.get();
            if (barcodeFindViewLayout != null) {
                barcodeFindViewLayout.c("item_list_updated");
                Unit unit = Unit.f143329a;
                return;
            }
            return;
        }
        WeakReference weakReference = this.f123215a;
        NativeToastHintStyle nativeToastHintStyle = NativeToastHintStyle.INFO;
        BarcodeFindViewLayout barcodeFindViewLayout2 = (BarcodeFindViewLayout) weakReference.get();
        if (barcodeFindViewLayout2 != null) {
            barcodeFindViewLayout2.a(text, nativeToastHintStyle, "item_list_updated");
            Unit unit2 = Unit.f143329a;
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.BarcodeFindGuidanceHandler
    public final void d(boolean z10, String text) {
        Intrinsics.j(text, "text");
        e eVar = e.f123213d;
        if (z10) {
            if (eVar != this.f123216b) {
                BarcodeFindViewLayout barcodeFindViewLayout = (BarcodeFindViewLayout) this.f123215a.get();
                if (barcodeFindViewLayout != null) {
                    barcodeFindViewLayout.a(text);
                    Unit unit = Unit.f143329a;
                }
                this.f123216b = eVar;
                return;
            }
            return;
        }
        if (eVar == this.f123216b) {
            BarcodeFindViewLayout barcodeFindViewLayout2 = (BarcodeFindViewLayout) this.f123215a.get();
            if (barcodeFindViewLayout2 != null) {
                barcodeFindViewLayout2.l();
                Unit unit2 = Unit.f143329a;
            }
            this.f123216b = null;
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.BarcodeFindGuidanceHandler
    public final void e(boolean z10, String text) {
        Intrinsics.j(text, "text");
        e eVar = e.f123212c;
        if (z10) {
            if (eVar != this.f123216b) {
                BarcodeFindViewLayout barcodeFindViewLayout = (BarcodeFindViewLayout) this.f123215a.get();
                if (barcodeFindViewLayout != null) {
                    barcodeFindViewLayout.a(text);
                    Unit unit = Unit.f143329a;
                }
                this.f123216b = eVar;
                return;
            }
            return;
        }
        if (eVar == this.f123216b) {
            BarcodeFindViewLayout barcodeFindViewLayout2 = (BarcodeFindViewLayout) this.f123215a.get();
            if (barcodeFindViewLayout2 != null) {
                barcodeFindViewLayout2.l();
                Unit unit2 = Unit.f143329a;
            }
            this.f123216b = null;
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.BarcodeFindGuidanceHandler
    public final void f(boolean z10, String text) {
        Intrinsics.j(text, "text");
        if (!z10) {
            BarcodeFindViewLayout barcodeFindViewLayout = (BarcodeFindViewLayout) this.f123215a.get();
            if (barcodeFindViewLayout != null) {
                barcodeFindViewLayout.c("all_items_found");
                Unit unit = Unit.f143329a;
                return;
            }
            return;
        }
        WeakReference weakReference = this.f123215a;
        NativeToastHintStyle nativeToastHintStyle = NativeToastHintStyle.SUCCESS;
        BarcodeFindViewLayout barcodeFindViewLayout2 = (BarcodeFindViewLayout) weakReference.get();
        if (barcodeFindViewLayout2 != null) {
            barcodeFindViewLayout2.a(text, nativeToastHintStyle, "all_items_found");
            Unit unit2 = Unit.f143329a;
        }
    }
}
