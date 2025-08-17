package com.scandit.datacapture.barcode.internal.module.ar.ui;

import android.content.Context;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.common.geometry.MeasureUnit;
import com.scandit.datacapture.core.internal.sdk.extensions.AnchorExtensionsKt;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.control.Control;
import com.scandit.datacapture.core.ui.control.LinearControlGroup;
import com.scandit.datacapture.core.ui.control.LinearControlGroupOrientation;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final NativeBarcodeArView f121184a;

    /* renamed from: b, reason: collision with root package name */
    public final DataCaptureView f121185b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f121186c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f121187d;

    /* renamed from: e, reason: collision with root package name */
    public final Lazy f121188e;

    public final void a() {
        Control control = (Control) this.f121188e.getValue();
        if (control != null) {
            this.f121185b.removeControl(control);
            if (this.f121184a.getShouldShowCameraSwitchControl()) {
                Anchor cameraSwitchControlPosition = this.f121184a.getCameraSwitchControlPosition();
                Intrinsics.i(cameraSwitchControlPosition, "getCameraSwitchControlPosition(...)");
                a(cameraSwitchControlPosition);
            }
        }
    }

    public d(NativeBarcodeArView impl, DataCaptureView dataCaptureView, com.scandit.datacapture.barcode.ar.ui.a cameraSwitchControlBuilder) {
        Intrinsics.j(impl, "impl");
        Intrinsics.j(dataCaptureView, "dataCaptureView");
        Intrinsics.j(cameraSwitchControlBuilder, "cameraSwitchControlBuilder");
        this.f121184a = impl;
        this.f121185b = dataCaptureView;
        this.f121186c = LazyKt.b(new b(this));
        this.f121187d = LazyKt.b(new c(this));
        this.f121188e = LazyKt.b(new a(cameraSwitchControlBuilder, this));
    }

    public final void b() {
        this.f121185b.removeControl((Control) this.f121186c.getValue());
        if (this.f121184a.getShouldShowTorchControl()) {
            Anchor torchControlPosition = this.f121184a.getTorchControlPosition();
            Intrinsics.i(torchControlPosition, "getTorchControlPosition(...)");
            a(torchControlPosition);
        }
    }

    public final void c() {
        this.f121185b.removeControl((Control) this.f121187d.getValue());
        if (this.f121184a.getShouldShowZoomControl()) {
            Anchor zoomControlPosition = this.f121184a.getZoomControlPosition();
            Intrinsics.i(zoomControlPosition, "getZoomControlPosition(...)");
            a(zoomControlPosition);
        }
    }

    public final void a(Anchor anchor) {
        ArrayList arrayList = new ArrayList();
        if (this.f121184a.getShouldShowTorchControl()) {
            Anchor torchControlPosition = this.f121184a.getTorchControlPosition();
            Intrinsics.i(torchControlPosition, "getTorchControlPosition(...)");
            if (torchControlPosition == anchor) {
                arrayList.add((Control) this.f121186c.getValue());
            }
        }
        if (this.f121184a.getShouldShowZoomControl()) {
            Anchor zoomControlPosition = this.f121184a.getZoomControlPosition();
            Intrinsics.i(zoomControlPosition, "getZoomControlPosition(...)");
            if (zoomControlPosition == anchor) {
                arrayList.add((Control) this.f121187d.getValue());
            }
        }
        Control control = (Control) this.f121188e.getValue();
        if (control != null && this.f121184a.getShouldShowCameraSwitchControl()) {
            Anchor cameraSwitchControlPosition = this.f121184a.getCameraSwitchControlPosition();
            Intrinsics.i(cameraSwitchControlPosition, "getCameraSwitchControlPosition(...)");
            if (cameraSwitchControlPosition == anchor) {
                arrayList.add(control);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            return;
        }
        DataCaptureView dataCaptureView = this.f121185b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dataCaptureView.removeControl((Control) it.next());
        }
        DataCaptureView dataCaptureView2 = this.f121185b;
        LinearControlGroup.Companion companion = LinearControlGroup.INSTANCE;
        Context context = dataCaptureView2.getContext();
        Intrinsics.i(context, "getContext(...)");
        dataCaptureView2.addControl(companion.builder(context).setControls(arrayList).setOrientation(LinearControlGroupOrientation.VERTICAL).setSpacing(new FloatWithUnit(12.0f, MeasureUnit.DIP)).build(), anchor, AnchorExtensionsKt.getDefaultOffset(anchor));
    }
}
