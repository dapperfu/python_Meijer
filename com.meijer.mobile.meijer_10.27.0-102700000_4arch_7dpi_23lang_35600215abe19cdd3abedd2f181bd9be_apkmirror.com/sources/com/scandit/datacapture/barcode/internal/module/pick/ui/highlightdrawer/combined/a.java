package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.combined;

import com.scandit.datacapture.barcode.batch.data.TrackedObject;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class a implements BarcodePickDrawer {

    /* renamed from: a, reason: collision with root package name */
    public final List f122600a;

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(TrackedObject track, BarcodePickState pickState) {
        Intrinsics.j(track, "track");
        Intrinsics.j(pickState, "pickState");
        Iterator it = this.f122600a.iterator();
        while (it.hasNext()) {
            ((BarcodePickDrawer) it.next()).a(track, pickState);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void b(TrackedObject track, BarcodePickState pickState) {
        Intrinsics.j(track, "track");
        Intrinsics.j(pickState, "pickState");
        Iterator it = this.f122600a.iterator();
        while (it.hasNext()) {
            ((BarcodePickDrawer) it.next()).b(track, pickState);
        }
    }

    public a(List drawers) {
        Intrinsics.j(drawers, "drawers");
        this.f122600a = drawers;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void start() {
        Iterator it = this.f122600a.iterator();
        while (it.hasNext()) {
            ((BarcodePickDrawer) it.next()).start();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void stop() {
        Iterator it = this.f122600a.iterator();
        while (it.hasNext()) {
            ((BarcodePickDrawer) it.next()).stop();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(int i10) {
        Iterator it = this.f122600a.iterator();
        while (it.hasNext()) {
            ((BarcodePickDrawer) it.next()).a(i10);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void b() {
        Iterator it = this.f122600a.iterator();
        while (it.hasNext()) {
            ((BarcodePickDrawer) it.next()).b();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(List tracks) {
        Intrinsics.j(tracks, "tracks");
        Iterator it = this.f122600a.iterator();
        while (it.hasNext()) {
            ((BarcodePickDrawer) it.next()).a(tracks);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(BarcodePickViewHighlightStyle highlightStyle) {
        Intrinsics.j(highlightStyle, "highlightStyle");
        Iterator it = this.f122600a.iterator();
        while (it.hasNext()) {
            ((BarcodePickDrawer) it.next()).a(highlightStyle);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final boolean a() {
        List list = this.f122600a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((BarcodePickDrawer) it.next()).a()) {
                return true;
            }
        }
        return false;
    }
}
