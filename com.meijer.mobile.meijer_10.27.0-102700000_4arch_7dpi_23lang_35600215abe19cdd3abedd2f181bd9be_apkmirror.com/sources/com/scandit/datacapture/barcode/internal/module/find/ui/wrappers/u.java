package com.scandit.datacapture.barcode.internal.module.find.ui.wrappers;

import com.scandit.datacapture.barcode.find.ui.PreviewResolutionRatioHandler;
import com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.u;
import com.scandit.datacapture.core.ui.DataCaptureView;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final PreviewResolutionRatioHandler f122367a;

    /* renamed from: b, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f f122368b;

    /* renamed from: c, reason: collision with root package name */
    public final List f122369c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f122370d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f122371e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f122372f;

    public final void a() {
        if (this.f122370d) {
            return;
        }
        this.f122370d = true;
        com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f fVar = this.f122368b;
        fVar.f123429a.a(fVar.b(), fVar.a());
        ((DataCaptureView) this.f122368b.b()).post(new Runnable() { // from class: Rt.a
            @Override // java.lang.Runnable
            public final void run() {
                u.a(this.f32999a);
            }
        });
    }

    public u(PreviewResolutionRatioHandler resolutionRatioHandler, com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f dataCaptureViewWrapper, List dependantViewWrappers) {
        Intrinsics.j(resolutionRatioHandler, "resolutionRatioHandler");
        Intrinsics.j(dataCaptureViewWrapper, "dataCaptureViewWrapper");
        Intrinsics.j(dependantViewWrappers, "dependantViewWrappers");
        this.f122367a = resolutionRatioHandler;
        this.f122368b = dataCaptureViewWrapper;
        this.f122369c = dependantViewWrappers;
        if (resolutionRatioHandler.getRatio() == -1.0f) {
            resolutionRatioHandler.setListener(new t(this));
        } else {
            a();
        }
    }

    public final void b() {
        if (this.f122370d && this.f122371e && this.f122372f) {
            com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f fVar = this.f122368b;
            fVar.f123429a.a(fVar.b(), fVar.a());
            for (com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f fVar2 : this.f122369c) {
                fVar2.f123429a.a(fVar2.b(), fVar2.a());
            }
        }
    }

    public static final void a(u this$0) {
        Intrinsics.j(this$0, "this$0");
        if (this$0.f122372f) {
            return;
        }
        this$0.f122372f = true;
        if (this$0.f122370d && this$0.f122371e) {
            this$0.f122368b.b().setVisibility(0);
            Iterator it = this$0.f122369c.iterator();
            while (it.hasNext()) {
                ((com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f) it.next()).a(this$0.f122368b.a());
            }
        }
    }
}
