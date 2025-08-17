package com.scandit.datacapture.barcode.internal.module.count.ui.popover;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayColorScheme;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountNotInListActionSettings;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.C13083x;
import com.scandit.datacapture.barcode.internal.module.ui.popover.C13260m;
import com.scandit.datacapture.barcode.internal.module.ui.popover.InterfaceC13261n;
import com.scandit.datacapture.barcode.internal.module.ui.popover.InterfaceC13262o;
import com.scandit.datacapture.barcode.internal.module.ui.popover.K;
import com.scandit.datacapture.barcode.internal.module.ui.popover.LinearPopoverButtonViewSettings;
import com.scandit.datacapture.barcode.internal.module.ui.popover.P;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class h {

    /* renamed from: f, reason: collision with root package name */
    public static final Lazy f121764f = LazyKt.b(a.f121762a);

    /* renamed from: a, reason: collision with root package name */
    public final Context f121765a;

    /* renamed from: b, reason: collision with root package name */
    public final g f121766b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC13261n f121767c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC13262o f121768d;

    /* renamed from: e, reason: collision with root package name */
    public P f121769e;

    public h(Context context, FrameLayout container, C13083x listener) {
        C13260m popover = new C13260m(context);
        Map buttonSettings = f.a(context, new BarcodeCountNotInListActionSettings(), NativeBarcodeCountBasicOverlayColorScheme.DEFAULT, listener);
        K popoverPositioner = new K();
        Intrinsics.j(context, "context");
        Intrinsics.j(container, "container");
        Intrinsics.j(listener, "listener");
        Intrinsics.j(popover, "popover");
        Intrinsics.j(buttonSettings, "buttonSettings");
        Intrinsics.j(popoverPositioner, "popoverPositioner");
        this.f121765a = context;
        this.f121766b = listener;
        this.f121767c = popover;
        this.f121768d = popoverPositioner;
        a(buttonSettings);
        Intrinsics.j(container, "container");
        container.addView(popover, new FrameLayout.LayoutParams(-2, -2));
    }

    public final void a(Map map) {
        C13260m c13260m = (C13260m) this.f121767c;
        Iterator it = c13260m.f123402a.values().iterator();
        while (it.hasNext()) {
            c13260m.removeView((View) it.next());
        }
        c13260m.f123402a.clear();
        for (Map.Entry entry : map.entrySet()) {
            ((C13260m) this.f121767c).a((LinearPopoverButtonViewSettings) entry.getKey(), (Function0) entry.getValue());
        }
        this.f121769e = null;
    }
}
