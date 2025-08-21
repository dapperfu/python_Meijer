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
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13248h;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* loaded from: classes12.dex */
public final class d implements BarcodeCountInternalModePresenter {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeCountUiPresenter f122703a;

    /* renamed from: b, reason: collision with root package name */
    public final f f122704b;

    /* renamed from: c, reason: collision with root package name */
    public final n f122705c;

    /* renamed from: d, reason: collision with root package name */
    public BarcodeCountInternalMode f122706d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f122707e;

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.mode.BarcodeCountInternalModePresenter
    public final void a(BarcodeCountInternalMode internalMode) {
        Intrinsics.j(internalMode, "internalMode");
        this.f122706d = internalMode;
        this.f122703a.a(internalMode);
        j jVar = (j) this.f122704b;
        jVar.f122683c.a(jVar.f122682b, g.f122678a);
        r rVar = (r) this.f122705c;
        rVar.f122696c.a(rVar.f122695b, o.f122690a);
        if (Intrinsics.e(internalMode, a.f122698a) || !(internalMode instanceof b)) {
            return;
        }
        b bVar = (b) internalMode;
        int iOrdinal = bVar.f122700b.ordinal();
        if (iOrdinal == 0) {
            ((j) this.f122704b).b();
            f fVar = this.f122704b;
            String text = bVar.f122699a.getScanBarcodesGuidanceText();
            j jVar2 = (j) fVar;
            jVar2.getClass();
            Intrinsics.j(text, "text");
            e eVar = jVar2.f122682b;
            if (eVar != null) {
                Intrinsics.j(text, "text");
                eVar.f122674c.setText(text);
            }
            ((j) this.f122704b).a();
            f fVar2 = this.f122704b;
            c onFinished = new c(this, bVar);
            j jVar3 = (j) fVar2;
            jVar3.getClass();
            Intrinsics.j(onFinished, "onFinished");
            e eVar2 = jVar3.f122682b;
            if (eVar2 != null) {
                eVar2.a(onFinished);
                return;
            }
            return;
        }
        if (iOrdinal != 2) {
            return;
        }
        ((r) this.f122705c).b();
        n nVar = this.f122705c;
        String text2 = bVar.f122699a.getStepBackGuidanceText();
        r rVar2 = (r) nVar;
        rVar2.getClass();
        Intrinsics.j(text2, "text");
        m mVar = rVar2.f122695b;
        if (mVar != null) {
            Intrinsics.j(text2, "text");
            mVar.f122689b.setText(text2);
        }
        ((r) this.f122705c).a();
        r rVar3 = (r) this.f122705c;
        m mVar2 = rVar3.f122695b;
        if (mVar2 != null) {
            mVar2.removeCallbacks(rVar3.f122697d);
        }
        rVar3.b();
        m mVar3 = rVar3.f122695b;
        if (mVar3 != null) {
            mVar3.postDelayed(rVar3.f122697d, Duration.F(r.f122693e));
        }
    }

    public d(J barcodeCountUiPresenter, com.scandit.datacapture.barcode.internal.module.count.ui.g layerManager, BarcodeCount barcodeCount, C13248h layoutHelper) {
        j splashViewHolder = new j(layerManager.f122539e, layoutHelper);
        r stepBackGuidanceViewHolder = new r(layerManager.f122539e, layoutHelper);
        Intrinsics.j(barcodeCountUiPresenter, "barcodeCountUiPresenter");
        Intrinsics.j(layerManager, "layerManager");
        Intrinsics.j(barcodeCount, "barcodeCount");
        Intrinsics.j(layoutHelper, "layoutHelper");
        Intrinsics.j(splashViewHolder, "splashViewHolder");
        Intrinsics.j(stepBackGuidanceViewHolder, "stepBackGuidanceViewHolder");
        this.f122703a = barcodeCountUiPresenter;
        this.f122704b = splashViewHolder;
        this.f122705c = stepBackGuidanceViewHolder;
        this.f122707e = new WeakReference(barcodeCount);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.mode.BarcodeCountInternalModePresenter
    public final void b() {
        BarcodeCountInternalMode barcodeCountInternalMode = this.f122706d;
        b bVar = barcodeCountInternalMode instanceof b ? (b) barcodeCountInternalMode : null;
        if (bVar != null) {
            com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.a aVar = bVar.f122700b;
            if (aVar != com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.a.f122656a) {
                if (aVar == com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.a.f122657b) {
                    a(new b(bVar.f122699a, com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.a.f122658c));
                }
            } else {
                e eVar = ((j) this.f122704b).f122682b;
                if (eVar != null) {
                    eVar.a();
                }
                j jVar = (j) this.f122704b;
                jVar.f122683c.a(jVar.f122682b, g.f122678a);
                a(new b(bVar.f122699a, com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.a.f122657b));
            }
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.mode.BarcodeCountInternalModePresenter
    public final void c() {
        BarcodeCountInternalMode barcodeCountInternalMode = this.f122706d;
        b bVar = barcodeCountInternalMode instanceof b ? (b) barcodeCountInternalMode : null;
        if (bVar != null) {
            int iOrdinal = bVar.f122700b.ordinal();
            if (iOrdinal == 1) {
                BarcodeCount barcodeCount = (BarcodeCount) this.f122707e.get();
                if (barcodeCount != null) {
                    barcodeCount.reset();
                    return;
                }
                return;
            }
            if (iOrdinal != 2) {
                return;
            }
            a(new b(bVar.f122699a, com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.a.f122657b));
            BarcodeCount barcodeCount2 = (BarcodeCount) this.f122707e.get();
            if (barcodeCount2 != null) {
                barcodeCount2.reset();
            }
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.mode.BarcodeCountInternalModePresenter
    public final void d() {
        BarcodeCountInternalMode barcodeCountInternalMode = this.f122706d;
        b bVar = barcodeCountInternalMode instanceof b ? (b) barcodeCountInternalMode : null;
        if (bVar == null || bVar.f122700b != com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.a.f122656a) {
            return;
        }
        e eVar = ((j) this.f122704b).f122682b;
        if (eVar != null) {
            eVar.a();
        }
        j jVar = (j) this.f122704b;
        jVar.f122683c.a(jVar.f122682b, g.f122678a);
        a(new b(bVar.f122699a, com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.a.f122657b));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.mode.BarcodeCountInternalModePresenter
    public final void a() {
        ((j) this.f122704b).a();
        ((r) this.f122705c).a();
    }
}
