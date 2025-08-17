package com.scandit.datacapture.barcode.internal.module.count.ui.mode;

import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter;
import com.scandit.datacapture.barcode.internal.module.count.ui.handlers.J;
import com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.e;
import com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.f;
import com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.g;
import com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.j;
import com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.m;
import com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.n;
import com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.o;
import com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.r;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13115h;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* loaded from: classes11.dex */
public final class d implements BarcodeCountInternalModePresenter {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeCountUiPresenter f121751a;

    /* renamed from: b, reason: collision with root package name */
    public final f f121752b;

    /* renamed from: c, reason: collision with root package name */
    public final n f121753c;

    /* renamed from: d, reason: collision with root package name */
    public BarcodeCountInternalMode f121754d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f121755e;

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.mode.BarcodeCountInternalModePresenter
    public final void a(BarcodeCountInternalMode internalMode) {
        Intrinsics.j(internalMode, "internalMode");
        this.f121754d = internalMode;
        this.f121751a.a(internalMode);
        j jVar = (j) this.f121752b;
        jVar.f121731c.a(jVar.f121730b, g.f121726a);
        r rVar = (r) this.f121753c;
        rVar.f121744c.a(rVar.f121743b, o.f121738a);
        if (Intrinsics.e(internalMode, a.f121746a) || !(internalMode instanceof b)) {
            return;
        }
        b bVar = (b) internalMode;
        int iOrdinal = bVar.f121748b.ordinal();
        if (iOrdinal == 0) {
            ((j) this.f121752b).b();
            f fVar = this.f121752b;
            String text = bVar.f121747a.getScanBarcodesGuidanceText();
            j jVar2 = (j) fVar;
            jVar2.getClass();
            Intrinsics.j(text, "text");
            e eVar = jVar2.f121730b;
            if (eVar != null) {
                Intrinsics.j(text, "text");
                eVar.f121722c.setText(text);
            }
            ((j) this.f121752b).a();
            f fVar2 = this.f121752b;
            c onFinished = new c(this, bVar);
            j jVar3 = (j) fVar2;
            jVar3.getClass();
            Intrinsics.j(onFinished, "onFinished");
            e eVar2 = jVar3.f121730b;
            if (eVar2 != null) {
                eVar2.a(onFinished);
                return;
            }
            return;
        }
        if (iOrdinal != 2) {
            return;
        }
        ((r) this.f121753c).b();
        n nVar = this.f121753c;
        String text2 = bVar.f121747a.getStepBackGuidanceText();
        r rVar2 = (r) nVar;
        rVar2.getClass();
        Intrinsics.j(text2, "text");
        m mVar = rVar2.f121743b;
        if (mVar != null) {
            Intrinsics.j(text2, "text");
            mVar.f121737b.setText(text2);
        }
        ((r) this.f121753c).a();
        r rVar3 = (r) this.f121753c;
        m mVar2 = rVar3.f121743b;
        if (mVar2 != null) {
            mVar2.removeCallbacks(rVar3.f121745d);
        }
        rVar3.b();
        m mVar3 = rVar3.f121743b;
        if (mVar3 != null) {
            mVar3.postDelayed(rVar3.f121745d, Duration.F(r.f121741e));
        }
    }

    public d(J barcodeCountUiPresenter, com.scandit.datacapture.barcode.internal.module.count.ui.g layerManager, BarcodeCount barcodeCount, C13115h layoutHelper) {
        j splashViewHolder = new j(layerManager.f121587e, layoutHelper);
        r stepBackGuidanceViewHolder = new r(layerManager.f121587e, layoutHelper);
        Intrinsics.j(barcodeCountUiPresenter, "barcodeCountUiPresenter");
        Intrinsics.j(layerManager, "layerManager");
        Intrinsics.j(barcodeCount, "barcodeCount");
        Intrinsics.j(layoutHelper, "layoutHelper");
        Intrinsics.j(splashViewHolder, "splashViewHolder");
        Intrinsics.j(stepBackGuidanceViewHolder, "stepBackGuidanceViewHolder");
        this.f121751a = barcodeCountUiPresenter;
        this.f121752b = splashViewHolder;
        this.f121753c = stepBackGuidanceViewHolder;
        this.f121755e = new WeakReference(barcodeCount);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.mode.BarcodeCountInternalModePresenter
    public final void b() {
        BarcodeCountInternalMode barcodeCountInternalMode = this.f121754d;
        b bVar = barcodeCountInternalMode instanceof b ? (b) barcodeCountInternalMode : null;
        if (bVar != null) {
            com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.a aVar = bVar.f121748b;
            if (aVar != com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.a.f121704a) {
                if (aVar == com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.a.f121705b) {
                    a(new b(bVar.f121747a, com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.a.f121706c));
                }
            } else {
                e eVar = ((j) this.f121752b).f121730b;
                if (eVar != null) {
                    eVar.a();
                }
                j jVar = (j) this.f121752b;
                jVar.f121731c.a(jVar.f121730b, g.f121726a);
                a(new b(bVar.f121747a, com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.a.f121705b));
            }
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.mode.BarcodeCountInternalModePresenter
    public final void c() {
        BarcodeCountInternalMode barcodeCountInternalMode = this.f121754d;
        b bVar = barcodeCountInternalMode instanceof b ? (b) barcodeCountInternalMode : null;
        if (bVar != null) {
            int iOrdinal = bVar.f121748b.ordinal();
            if (iOrdinal == 1) {
                BarcodeCount barcodeCount = (BarcodeCount) this.f121755e.get();
                if (barcodeCount != null) {
                    barcodeCount.reset();
                    return;
                }
                return;
            }
            if (iOrdinal != 2) {
                return;
            }
            a(new b(bVar.f121747a, com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.a.f121705b));
            BarcodeCount barcodeCount2 = (BarcodeCount) this.f121755e.get();
            if (barcodeCount2 != null) {
                barcodeCount2.reset();
            }
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.mode.BarcodeCountInternalModePresenter
    public final void d() {
        BarcodeCountInternalMode barcodeCountInternalMode = this.f121754d;
        b bVar = barcodeCountInternalMode instanceof b ? (b) barcodeCountInternalMode : null;
        if (bVar == null || bVar.f121748b != com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.a.f121704a) {
            return;
        }
        e eVar = ((j) this.f121752b).f121730b;
        if (eVar != null) {
            eVar.a();
        }
        j jVar = (j) this.f121752b;
        jVar.f121731c.a(jVar.f121730b, g.f121726a);
        a(new b(bVar.f121747a, com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.a.f121705b));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.mode.BarcodeCountInternalModePresenter
    public final void a() {
        ((j) this.f121752b).a();
        ((r) this.f121753c).a();
    }
}
