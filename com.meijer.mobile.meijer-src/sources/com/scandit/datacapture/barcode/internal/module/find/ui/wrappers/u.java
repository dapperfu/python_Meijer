package com.scandit.datacapture.barcode.internal.module.find.ui.wrappers;

import com.scandit.datacapture.barcode.find.ui.PreviewResolutionRatioHandler;
import com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.u;
import com.scandit.datacapture.core.ui.DataCaptureView;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final PreviewResolutionRatioHandler f123319a;

    /* renamed from: b, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f f123320b;

    /* renamed from: c, reason: collision with root package name */
    public final List f123321c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f123322d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f123323e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f123324f;

    public final void a() {
        if (this.f123322d) {
            return;
        }
        this.f123322d = true;
        com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f fVar = this.f123320b;
        fVar.f124381a.a(fVar.b(), fVar.a());
        ((DataCaptureView) this.f123320b.b()).post(new Runnable() { // from class: Rt.a
            @Override // java.lang.Runnable
            public final void run() {
                u.a(this.f34036a);
            }
        });
    }

    public u(PreviewResolutionRatioHandler resolutionRatioHandler, com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f dataCaptureViewWrapper, List dependantViewWrappers) {
        Intrinsics.j(resolutionRatioHandler, "resolutionRatioHandler");
        Intrinsics.j(dataCaptureViewWrapper, "dataCaptureViewWrapper");
        Intrinsics.j(dependantViewWrappers, "dependantViewWrappers");
        this.f123319a = resolutionRatioHandler;
        this.f123320b = dataCaptureViewWrapper;
        this.f123321c = dependantViewWrappers;
        if (resolutionRatioHandler.getRatio() == -1.0f) {
            resolutionRatioHandler.setListener(new t(this));
        } else {
            a();
        }
    }

    public final void b() {
        if (this.f123322d && this.f123323e && this.f123324f) {
            com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f fVar = this.f123320b;
            fVar.f124381a.a(fVar.b(), fVar.a());
            for (com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f fVar2 : this.f123321c) {
                fVar2.f124381a.a(fVar2.b(), fVar2.a());
            }
        }
    }

    public static final void a(u this$0) {
        Intrinsics.j(this$0, "this$0");
        if (this$0.f123324f) {
            return;
        }
        this$0.f123324f = true;
        if (this$0.f123322d && this$0.f123323e) {
            this$0.f123320b.b().setVisibility(0);
            Iterator it = this$0.f123321c.iterator();
            while (it.hasNext()) {
                ((com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f) it.next()).a(this$0.f123320b.a());
            }
        }
    }
}
