package com.scandit.datacapture.barcode.internal.module.count.ui.popover;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayColorScheme;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountNotInListActionSettings;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.C13216x;
import com.scandit.datacapture.barcode.internal.module.ui.popover.C13393m;
import com.scandit.datacapture.barcode.internal.module.ui.popover.InterfaceC13394n;
import com.scandit.datacapture.barcode.internal.module.ui.popover.InterfaceC13395o;
import com.scandit.datacapture.barcode.internal.module.ui.popover.K;
import com.scandit.datacapture.barcode.internal.module.ui.popover.LinearPopoverButtonViewSettings;
import com.scandit.datacapture.barcode.internal.module.ui.popover.P;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class h {

    /* renamed from: f, reason: collision with root package name */
    public static final Lazy f122716f = LazyKt.b(a.f122714a);

    /* renamed from: a, reason: collision with root package name */
    public final Context f122717a;

    /* renamed from: b, reason: collision with root package name */
    public final g f122718b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC13394n f122719c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC13395o f122720d;

    /* renamed from: e, reason: collision with root package name */
    public P f122721e;

    public h(Context context, FrameLayout container, C13216x listener) {
        C13393m popover = new C13393m(context);
        Map buttonSettings = f.a(context, new BarcodeCountNotInListActionSettings(), NativeBarcodeCountBasicOverlayColorScheme.DEFAULT, listener);
        K popoverPositioner = new K();
        Intrinsics.j(context, "context");
        Intrinsics.j(container, "container");
        Intrinsics.j(listener, "listener");
        Intrinsics.j(popover, "popover");
        Intrinsics.j(buttonSettings, "buttonSettings");
        Intrinsics.j(popoverPositioner, "popoverPositioner");
        this.f122717a = context;
        this.f122718b = listener;
        this.f122719c = popover;
        this.f122720d = popoverPositioner;
        a(buttonSettings);
        Intrinsics.j(container, "container");
        container.addView(popover, new FrameLayout.LayoutParams(-2, -2));
    }

    public final void a(Map map) {
        C13393m c13393m = (C13393m) this.f122719c;
        Iterator it = c13393m.f124354a.values().iterator();
        while (it.hasNext()) {
            c13393m.removeView((View) it.next());
        }
        c13393m.f124354a.clear();
        for (Map.Entry entry : map.entrySet()) {
            ((C13393m) this.f122719c).a((LinearPopoverButtonViewSettings) entry.getKey(), (Function0) entry.getValue());
        }
        this.f122721e = null;
    }
}
