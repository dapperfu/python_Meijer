package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSession;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayColorScheme;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayStyle;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountNotInListStatus;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusItem;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountNotInListActionSettings;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountStatus;
import com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager;
import com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewSettings;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.C13079t;
import com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountBrushHandler;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.internal.sdk.common.async.MainThreadHelper;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import com.scandit.datacapture.core.ui.style.Brush;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.t, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13079t implements BarcodeIndicatorPresenter {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeCountViewLayerManager f121457a;

    /* renamed from: b, reason: collision with root package name */
    public final S f121458b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC13081v f121459c;

    /* renamed from: d, reason: collision with root package name */
    public final NativeBarcodeCountBasicOverlayStyle f121460d;

    /* renamed from: e, reason: collision with root package name */
    public final BarcodeCountBrushHandler f121461e;

    /* renamed from: f, reason: collision with root package name */
    public final Function4 f121462f;

    /* renamed from: g, reason: collision with root package name */
    public final MainThreadHelper f121463g;

    /* renamed from: h, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.count.ui.cluster.s f121464h;

    /* renamed from: i, reason: collision with root package name */
    public long f121465i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f121466j;

    /* renamed from: k, reason: collision with root package name */
    public List f121467k;

    /* renamed from: l, reason: collision with root package name */
    public List f121468l;

    /* renamed from: m, reason: collision with root package name */
    public List f121469m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f121470n;

    /* renamed from: o, reason: collision with root package name */
    public NativeBarcodeCountBasicOverlayColorScheme f121471o;

    /* renamed from: p, reason: collision with root package name */
    public final Lazy f121472p;

    /* renamed from: q, reason: collision with root package name */
    public final G f121473q;

    /* renamed from: r, reason: collision with root package name */
    public Map f121474r;

    /* renamed from: s, reason: collision with root package name */
    public Map f121475s;

    /* renamed from: t, reason: collision with root package name */
    public Map f121476t;

    /* renamed from: u, reason: collision with root package name */
    public Map f121477u;

    /* renamed from: v, reason: collision with root package name */
    public List f121478v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f121479w;

    /* renamed from: x, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.count.ui.status.n f121480x;

    /* renamed from: y, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.ui.i f121481y;

    /* renamed from: z, reason: collision with root package name */
    public final C13067g f121482z;

    public final TrackedBarcode a(com.scandit.datacapture.barcode.internal.module.count.capture.n cluster) {
        Object obj;
        Intrinsics.j(cluster, "cluster");
        Iterator it = cluster.f121299b.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int i10 = a((TrackedBarcode) next, N.f121399a).f121423a;
                do {
                    Object next2 = it.next();
                    int i11 = a((TrackedBarcode) next2, N.f121399a).f121423a;
                    if (i10 < i11) {
                        next = next2;
                        i10 = i11;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (TrackedBarcode) obj;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final boolean b() {
        return this.f121479w;
    }

    public final void c() {
        Iterator it = this.f121474r.entrySet().iterator();
        while (it.hasNext()) {
            L l10 = (L) ((Map.Entry) it.next()).getValue();
            ViewParent parent = l10.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(l10);
            }
        }
        this.f121474r.clear();
        this.f121475s.clear();
        this.f121463g.runOnMainThread(new C13071k(this));
    }

    public C13079t(com.scandit.datacapture.barcode.internal.module.count.ui.g layerManager, U trackedBarcodeHelper, C13084y popupPresenter, NativeBarcodeCountBasicOverlayStyle style, com.scandit.datacapture.barcode.internal.module.count.ui.handlers.r brushHandler, com.scandit.datacapture.barcode.internal.module.count.ui.e onBarcodeViewClickedListener, com.scandit.datacapture.barcode.internal.module.count.ui.cluster.B clusterPresenter) {
        MainThreadHelper mainThreadHelper = new MainThreadHelper();
        Intrinsics.j(layerManager, "layerManager");
        Intrinsics.j(trackedBarcodeHelper, "trackedBarcodeHelper");
        Intrinsics.j(popupPresenter, "popupPresenter");
        Intrinsics.j(style, "style");
        Intrinsics.j(brushHandler, "brushHandler");
        Intrinsics.j(onBarcodeViewClickedListener, "onBarcodeViewClickedListener");
        Intrinsics.j(mainThreadHelper, "mainThreadHelper");
        Intrinsics.j(clusterPresenter, "clusterPresenter");
        this.f121457a = layerManager;
        this.f121458b = trackedBarcodeHelper;
        this.f121459c = popupPresenter;
        this.f121460d = style;
        this.f121461e = brushHandler;
        this.f121462f = onBarcodeViewClickedListener;
        this.f121463g = mainThreadHelper;
        this.f121464h = clusterPresenter;
        this.f121467k = CollectionsKt.m();
        this.f121468l = CollectionsKt.m();
        this.f121469m = CollectionsKt.m();
        this.f121471o = NativeBarcodeCountBasicOverlayColorScheme.DEFAULT;
        this.f121472p = LazyKt.b(new C13068h(this));
        this.f121473q = new G(layerManager.f121592j);
        clusterPresenter.b();
        clusterPresenter.a(style, this.f121471o);
        this.f121474r = new LinkedHashMap();
        this.f121475s = new LinkedHashMap();
        this.f121476t = MapsKt.k();
        this.f121477u = MapsKt.k();
        this.f121478v = CollectionsKt.m();
        this.f121480x = com.scandit.datacapture.barcode.internal.module.count.ui.status.n.f121818a;
        this.f121481y = new com.scandit.datacapture.barcode.internal.module.ui.i(new C13075o(this), new C13076p(this), new C13077q(this));
        this.f121482z = new C13067g(this);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void b(boolean z10, boolean z11) {
        for (L l10 : this.f121474r.values()) {
            if (l10.f121394g == W.f121420f) {
                if (z10) {
                    L.b(l10, z11);
                } else {
                    L.a(l10, z11);
                }
            }
        }
    }

    public final N d(TrackedBarcode trackedBarcode) {
        List list = this.f121478v;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((TrackedBarcode) it.next()).getGlobalId$scandit_barcode_capture() == trackedBarcode.getGlobalId$scandit_barcode_capture()) {
                    return N.f121401c;
                }
            }
        }
        Boolean bool = (Boolean) this.f121477u.get(Integer.valueOf(trackedBarcode.getGlobalId$scandit_barcode_capture()));
        return bool != null ? bool.booleanValue() : false ? N.f121399a : N.f121400b;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void reset() {
        O.a();
        this.f121476t = MapsKt.k();
        this.f121478v = CollectionsKt.m();
        c();
        com.scandit.datacapture.barcode.internal.module.count.ui.barcodeoverlay.a aVar = (com.scandit.datacapture.barcode.internal.module.count.ui.barcodeoverlay.a) this.f121472p.getValue();
        if (aVar != null) {
            aVar.f121505b = CollectionsKt.m();
        }
        this.f121463g.runOnMainThread(new C13072l(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void b(boolean z10) {
        this.f121463g.runOnMainThread(new C13074n(this, z10));
    }

    public final void c(TrackedBarcode barcode) {
        L l10;
        int i10;
        Integer numValueOf;
        L l11 = (L) this.f121474r.get(Integer.valueOf(barcode.getGlobalId$scandit_barcode_capture()));
        if (l11 != null) {
            NativeBarcodeCountBasicOverlayStyle style = this.f121460d;
            W status = a(barcode, d(barcode));
            NativeBarcodeCountBasicOverlayColorScheme colorScheme = this.f121471o;
            C13070j dotBrushProvider = new C13070j(this.f121461e);
            Intrinsics.j(style, "style");
            Intrinsics.j(status, "status");
            Intrinsics.j(colorScheme, "colorScheme");
            Intrinsics.j(barcode, "barcode");
            Intrinsics.j(dotBrushProvider, "dotBrushProvider");
            l11.f121394g = status;
            int i11 = AbstractC13064d.f121434a;
            C13080u normalView = l11.f121389b;
            Intrinsics.j(normalView, "normalView");
            Intrinsics.j(style, "style");
            Intrinsics.j(status, "status");
            Intrinsics.j(colorScheme, "colorScheme");
            Intrinsics.j(barcode, "barcode");
            Intrinsics.j(dotBrushProvider, "dotBrushProvider");
            boolean zA = AbstractC13064d.a(barcode, style, status, dotBrushProvider);
            EnumC13061a enumC13061aA = AbstractC13064d.a(style, status);
            C13063c c13063c = new C13063c(dotBrushProvider, barcode);
            int iOrdinal = enumC13061aA.ordinal();
            Y y10 = null;
            if (iOrdinal == 0) {
                Integer numValueOf2 = Integer.valueOf(R.drawable.sc_ic_barcode_dot);
                Brush brush = (Brush) c13063c.invoke(status);
                normalView.a(numValueOf2, brush != null ? Integer.valueOf(brush.getFillColor()) : null, colorScheme);
            } else if (iOrdinal == 1) {
                Integer numA = AbstractC13064d.a(status, colorScheme);
                int iOrdinal2 = status.ordinal();
                if (iOrdinal2 != 1) {
                    numValueOf = iOrdinal2 != 2 ? null : Integer.valueOf(AbstractC13064d.f121435b);
                } else {
                    numValueOf = Integer.valueOf(AbstractC13064d.f121434a);
                }
                if (numValueOf == null) {
                    normalView.a(numA, colorScheme);
                } else {
                    normalView.a(numA, numValueOf, colorScheme);
                }
            } else if (iOrdinal == 2) {
                Brush brush2 = (Brush) c13063c.invoke(status);
                normalView.a(AbstractC13064d.a(status, colorScheme), brush2 != null ? Integer.valueOf(brush2.getFillColor()) : null, colorScheme);
            }
            boolean z10 = status == W.f121420f && zA;
            Y y11 = normalView.f121484b;
            if (y11 == null) {
                Intrinsics.y("warningBackground");
            } else {
                y10 = y11;
            }
            y10.setVisibility(!z10 ? 8 : 0);
            int i12 = R.string.sc_barcode_count_indicator_content_description_barcode_data;
            String data = barcode.getBarcode().getData();
            int iOrdinal3 = status.ordinal();
            if (iOrdinal3 == 0) {
                i10 = R.string.sc_barcode_count_scan_status_scanned;
            } else if (iOrdinal3 == 1) {
                i10 = R.string.sc_barcode_count_not_in_list_status_accepted;
            } else if (iOrdinal3 == 2) {
                i10 = R.string.sc_barcode_count_not_in_list_status_rejected;
            } else if (iOrdinal3 == 3) {
                i10 = R.string.sc_barcode_count_list_status_not_in_list;
            } else if (iOrdinal3 == 4) {
                i10 = R.string.sc_barcode_count_scan_status_unscanned;
            } else {
                if (iOrdinal3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                i10 = R.string.sc_barcode_count_scan_status_filtered;
            }
            normalView.a(i12, data, i10);
        }
        if (this.f121480x != com.scandit.datacapture.barcode.internal.module.count.ui.status.n.f121819b || (l10 = (L) this.f121474r.get(Integer.valueOf(barcode.getGlobalId$scandit_barcode_capture()))) == null) {
            return;
        }
        l10.b(false);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void b(TrackedBarcode barcode) {
        Intrinsics.j(barcode, "barcode");
        c(barcode);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void a(boolean z10) {
        this.f121466j = z10;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void a(NativeBarcodeCountBasicOverlayColorScheme value) {
        Intrinsics.j(value, "value");
        this.f121471o = value;
        ((com.scandit.datacapture.barcode.internal.module.count.ui.cluster.B) this.f121464h).a(this.f121460d, value);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void a(BarcodeCountCaptureListSession session) {
        Intrinsics.j(session, "session");
        List<TrackedBarcode> correctBarcodes = session.getCorrectBarcodes();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(correctBarcodes, 10));
        Iterator<T> it = correctBarcodes.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((TrackedBarcode) it.next()).getGlobalId$scandit_barcode_capture()));
        }
        this.f121467k = arrayList;
        List<TrackedBarcode> acceptedBarcodes = session.getAcceptedBarcodes();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(acceptedBarcodes, 10));
        Iterator<T> it2 = acceptedBarcodes.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((TrackedBarcode) it2.next()).getGlobalId$scandit_barcode_capture()));
        }
        this.f121468l = arrayList2;
        List<TrackedBarcode> rejectedBarcodes = session.getRejectedBarcodes();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.x(rejectedBarcodes, 10));
        Iterator<T> it3 = rejectedBarcodes.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Integer.valueOf(((TrackedBarcode) it3.next()).getGlobalId$scandit_barcode_capture()));
        }
        this.f121469m = arrayList3;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void a(FrameLayout captureView) {
        Intrinsics.j(captureView, "captureView");
        if (captureView == null) {
            Intrinsics.y("touchCaptureView");
            captureView = null;
        }
        captureView.setOnTouchListener(new View.OnTouchListener() { // from class: Kt.g
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C13079t.a(this.f17559a, view, motionEvent);
            }
        });
    }

    public static final boolean a(C13079t this$0, View view, MotionEvent motionEvent) {
        Intrinsics.j(this$0, "this$0");
        com.scandit.datacapture.barcode.internal.module.ui.i iVar = this$0.f121481y;
        Intrinsics.g(motionEvent);
        boolean zA = iVar.a(motionEvent);
        if (!zA) {
            view.performClick();
        }
        return zA;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void a(TrackedBarcode trackedBarcode, NativeBarcodeCountNotInListStatus status) {
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        Intrinsics.j(status, "status");
        C13084y c13084y = (C13084y) this.f121459c;
        c13084y.getClass();
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        Intrinsics.j(status, "status");
        c13084y.f121491d = status;
        c13084y.f121492e = trackedBarcode;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void a(TrackedBarcode barcode) {
        Intrinsics.j(barcode, "barcode");
        InterfaceC13081v interfaceC13081v = this.f121459c;
        int globalId$scandit_barcode_capture = barcode.getGlobalId$scandit_barcode_capture();
        C13084y c13084y = (C13084y) interfaceC13081v;
        TrackedBarcode trackedBarcode = c13084y.f121492e;
        if (trackedBarcode == null || trackedBarcode.getGlobalId$scandit_barcode_capture() != globalId$scandit_barcode_capture) {
            return;
        }
        c13084y.f121492e = null;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void a(BarcodeCountViewSettings viewSettings) {
        Intrinsics.j(viewSettings, "viewSettings");
        if (viewSettings.w()) {
            com.scandit.datacapture.barcode.internal.module.count.ui.status.n nVar = com.scandit.datacapture.barcode.internal.module.count.ui.status.n.f121819b;
            this.f121480x = nVar;
            G g10 = this.f121473q;
            g10.getClass();
            Intrinsics.j(nVar, "<set-?>");
            g10.f121375g = nVar;
        } else {
            com.scandit.datacapture.barcode.internal.module.count.ui.status.n nVar2 = com.scandit.datacapture.barcode.internal.module.count.ui.status.n.f121818a;
            this.f121480x = nVar2;
            G g11 = this.f121473q;
            g11.getClass();
            Intrinsics.j(nVar2, "<set-?>");
            g11.f121375g = nVar2;
        }
        InterfaceC13081v interfaceC13081v = this.f121459c;
        BarcodeCountNotInListActionSettings settings = viewSettings.b();
        NativeBarcodeCountBasicOverlayColorScheme colorScheme = this.f121471o;
        C13084y c13084y = (C13084y) interfaceC13081v;
        c13084y.getClass();
        Intrinsics.j(settings, "settings");
        Intrinsics.j(colorScheme, "colorScheme");
        com.scandit.datacapture.barcode.internal.module.count.ui.popover.h hVar = c13084y.f121493f;
        hVar.getClass();
        Intrinsics.j(settings, "settings");
        Intrinsics.j(colorScheme, "colorScheme");
        Lazy lazy = com.scandit.datacapture.barcode.internal.module.count.ui.popover.h.f121764f;
        hVar.a(com.scandit.datacapture.barcode.internal.module.count.ui.popover.f.a(hVar.f121765a, settings, colorScheme, hVar.f121766b));
    }

    public static final void a(C13079t c13079t, List list, ArrayList arrayList) {
        Map map = c13079t.f121475s;
        c13079t.f121475s = c13079t.f121474r;
        c13079t.f121474r = map;
        map.clear();
        Iterator it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            V trackedBarcodeInfo = (V) it.next();
            TrackedBarcode trackedBarcode = (TrackedBarcode) c13079t.f121476t.get(Integer.valueOf(trackedBarcodeInfo.f121412a));
            if (trackedBarcode != null) {
                L indicatorView = (L) c13079t.f121475s.remove(Integer.valueOf(trackedBarcodeInfo.f121412a));
                if (indicatorView == null) {
                    FrameLayout frameLayoutG = c13079t.f121457a.g();
                    S.f121408a.getClass();
                    int iFloatValue = (int) ((Number) Q.f121407b.getValue()).floatValue();
                    L l10 = new L(c13079t.f121457a.e(), c13079t.f121480x);
                    l10.setLayoutParams(new FrameLayout.LayoutParams(iFloatValue, iFloatValue));
                    frameLayoutG.addView(l10);
                    z10 = true;
                    indicatorView = l10;
                }
                I i10 = I.f121379a;
                Intrinsics.j(i10, "<set-?>");
                indicatorView.f121392e = i10;
                c13079t.f121474r.put(Integer.valueOf(trackedBarcodeInfo.f121412a), indicatorView);
                S.f121408a.getClass();
                float fFloatValue = ((Number) Q.f121407b.getValue()).floatValue() / 2;
                indicatorView.setX(trackedBarcodeInfo.f121414c.getX() - fFloatValue);
                indicatorView.setY(trackedBarcodeInfo.f121414c.getY() - fFloatValue);
                indicatorView.setScaleX(trackedBarcodeInfo.f121415d);
                indicatorView.setScaleY(trackedBarcodeInfo.f121415d);
                c13079t.c(trackedBarcode);
                C13084y c13084y = (C13084y) c13079t.f121459c;
                c13084y.getClass();
                Intrinsics.j(indicatorView, "indicatorView");
                Intrinsics.j(trackedBarcodeInfo, "trackedBarcodeInfo");
                TrackedBarcode trackedBarcode2 = c13084y.f121492e;
                if (trackedBarcode2 != null && trackedBarcode2.getGlobalId$scandit_barcode_capture() == trackedBarcodeInfo.f121412a) {
                    ViewParent parent = indicatorView.getParent();
                    Intrinsics.h(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    if (!Intrinsics.e((ViewGroup) parent, c13084y.f121489b.b())) {
                        ViewParent parent2 = indicatorView.getParent();
                        Intrinsics.h(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                        ((ViewGroup) parent2).removeView(indicatorView);
                        c13084y.f121489b.b().addView(indicatorView);
                    }
                }
                if (c13084y.f121492e == null) {
                    ViewParent parent3 = indicatorView.getParent();
                    Intrinsics.h(parent3, "null cannot be cast to non-null type android.view.ViewGroup");
                    if (Intrinsics.e((ViewGroup) parent3, c13084y.f121489b.b())) {
                        ViewParent parent4 = indicatorView.getParent();
                        Intrinsics.h(parent4, "null cannot be cast to non-null type android.view.ViewGroup");
                        ((ViewGroup) parent4).removeView(indicatorView);
                        c13084y.f121489b.g().addView(indicatorView);
                    }
                }
            }
        }
        if (z10 && c13079t.f121470n) {
            c13079t.f121470n = false;
            if (O.e()) {
                c13079t.f121463g.runOnMainThread(new C13078s(c13079t));
            }
        }
        if (c13079t.f121480x == com.scandit.datacapture.barcode.internal.module.count.ui.status.n.f121818a) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                z zVar = (z) it2.next();
                int i11 = zVar.f121495b;
                L l11 = (L) c13079t.f121475s.remove(Integer.valueOf(i11));
                if (l11 == null) {
                    FrameLayout frameLayoutG2 = c13079t.f121457a.g();
                    S.f121408a.getClass();
                    int iFloatValue2 = (int) ((Number) Q.f121407b.getValue()).floatValue();
                    L l12 = new L(c13079t.f121457a.e(), c13079t.f121480x);
                    l12.setLayoutParams(new FrameLayout.LayoutParams(iFloatValue2, iFloatValue2));
                    frameLayoutG2.addView(l12);
                    l11 = l12;
                }
                I i12 = I.f121380b;
                Intrinsics.j(i12, "<set-?>");
                l11.f121392e = i12;
                c13079t.f121474r.put(Integer.valueOf(i11), l11);
                S.f121408a.getClass();
                float fFloatValue2 = ((Number) Q.f121407b.getValue()).floatValue() / 2;
                Point center = QuadrilateralUtilsKt.getCenter(zVar.f121497d);
                l11.setX(center.getX() - fFloatValue2);
                l11.setY(center.getY() - fFloatValue2);
                l11.setScaleX(zVar.f121499f);
                l11.setScaleY(zVar.f121499f);
                l11.a(zVar);
            }
        }
        for (Map.Entry entry : c13079t.f121475s.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            L l13 = (L) entry.getValue();
            ViewParent parent5 = l13.getParent();
            Intrinsics.h(parent5, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent5).removeView(l13);
            C13084y c13084y2 = (C13084y) c13079t.f121459c;
            TrackedBarcode trackedBarcode3 = c13084y2.f121492e;
            if (trackedBarcode3 != null && trackedBarcode3.getGlobalId$scandit_barcode_capture() == iIntValue) {
                c13084y2.f121492e = null;
            }
        }
        c13079t.f121475s.clear();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void a(boolean z10, boolean z11) {
        this.f121479w = z10;
        for (L l10 : this.f121474r.values()) {
            if (l10.f121394g != W.f121420f) {
                if (z10) {
                    l10.b(z11);
                } else {
                    L.b(l10.f121389b, z11);
                    l10.f121390c.a(z11);
                }
            }
        }
        com.scandit.datacapture.barcode.internal.module.count.ui.cluster.B b10 = (com.scandit.datacapture.barcode.internal.module.count.ui.cluster.B) this.f121464h;
        b10.f121521j = this.f121480x == com.scandit.datacapture.barcode.internal.module.count.ui.status.n.f121819b || !z10;
        b10.a();
        this.f121463g.runOnMainThread(new C13073m(this, z10, z11));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void a() {
        a(CollectionsKt.m());
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void a(List statusList) {
        Intrinsics.j(statusList, "statusList");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listM1 = CollectionsKt.m1(this.f121476t.keySet());
        Iterator it = statusList.iterator();
        while (it.hasNext()) {
            NativeBarcodeCountStatusItem nativeBarcodeCountStatusItem = (NativeBarcodeCountStatusItem) it.next();
            NativeTrackedBarcode trackedBarcode = nativeBarcodeCountStatusItem.getTrackedBarcode();
            Intrinsics.i(trackedBarcode, "getTrackedBarcode(...)");
            int globalId$scandit_barcode_capture = new TrackedBarcode(trackedBarcode).getBarcode().getGlobalId$scandit_barcode_capture();
            Integer numValueOf = Integer.valueOf(globalId$scandit_barcode_capture);
            BarcodeCountStatus status = nativeBarcodeCountStatusItem.getStatus();
            Intrinsics.i(status, "getStatus(...)");
            linkedHashMap.put(numValueOf, new com.scandit.datacapture.barcode.internal.module.count.ui.status.e(status, nativeBarcodeCountStatusItem.getTrackedBarcode().getClusterIdentifier()));
            listM1.remove(Integer.valueOf(globalId$scandit_barcode_capture));
        }
        Iterator it2 = listM1.iterator();
        while (it2.hasNext()) {
            linkedHashMap.put(Integer.valueOf(((Number) it2.next()).intValue()), com.scandit.datacapture.barcode.internal.module.count.ui.status.c.f121794a);
        }
        O.a(linkedHashMap);
        this.f121463g.runOnMainThread(new C13078s(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void a(int i10) {
        O.a(i10);
        this.f121470n = true;
    }

    public final W a(TrackedBarcode trackedBarcode, N scanStatus) {
        M m10;
        NativeBarcodeCountNotInListStatus nativeBarcodeCountNotInListStatus;
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        Intrinsics.j(scanStatus, "scanStatus");
        int iOrdinal = scanStatus.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return W.f121420f;
            }
            if (iOrdinal == 2) {
                return W.f121421g;
            }
            throw new NoWhenBranchMatchedException();
        }
        int globalId$scandit_barcode_capture = trackedBarcode.getGlobalId$scandit_barcode_capture();
        if (!this.f121466j) {
            m10 = M.f121395a;
        } else if (this.f121467k.contains(Integer.valueOf(globalId$scandit_barcode_capture))) {
            m10 = M.f121396b;
        } else {
            m10 = M.f121397c;
        }
        int iOrdinal2 = m10.ordinal();
        if (iOrdinal2 == 0 || iOrdinal2 == 1) {
            return W.f121416b;
        }
        if (iOrdinal2 == 2) {
            int globalId$scandit_barcode_capture2 = trackedBarcode.getGlobalId$scandit_barcode_capture();
            if (this.f121466j && !this.f121467k.contains(Integer.valueOf(globalId$scandit_barcode_capture2))) {
                if (this.f121468l.contains(Integer.valueOf(globalId$scandit_barcode_capture2))) {
                    nativeBarcodeCountNotInListStatus = NativeBarcodeCountNotInListStatus.ACCEPTED;
                } else if (this.f121469m.contains(Integer.valueOf(globalId$scandit_barcode_capture2))) {
                    nativeBarcodeCountNotInListStatus = NativeBarcodeCountNotInListStatus.REJECTED;
                } else {
                    nativeBarcodeCountNotInListStatus = NativeBarcodeCountNotInListStatus.NONE;
                }
            } else {
                nativeBarcodeCountNotInListStatus = NativeBarcodeCountNotInListStatus.NONE;
            }
            int i10 = AbstractC13066f.f121440b[nativeBarcodeCountNotInListStatus.ordinal()];
            if (i10 == 1) {
                return W.f121419e;
            }
            if (i10 == 2) {
                return W.f121417c;
            }
            if (i10 == 3) {
                return W.f121418d;
            }
            throw new NoWhenBranchMatchedException();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0279  */
    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r38, java.util.ArrayList r40, java.util.ArrayList r41, java.util.ArrayList r42, java.util.ArrayList r43) {
        /*
            Method dump skipped, instructions count: 1073
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.C13079t.a(long, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void");
    }
}
