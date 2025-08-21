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
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.C13212t;
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
/* loaded from: classes12.dex */
public final class C13212t implements BarcodeIndicatorPresenter {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeCountViewLayerManager f122409a;

    /* renamed from: b, reason: collision with root package name */
    public final S f122410b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC13214v f122411c;

    /* renamed from: d, reason: collision with root package name */
    public final NativeBarcodeCountBasicOverlayStyle f122412d;

    /* renamed from: e, reason: collision with root package name */
    public final BarcodeCountBrushHandler f122413e;

    /* renamed from: f, reason: collision with root package name */
    public final Function4 f122414f;

    /* renamed from: g, reason: collision with root package name */
    public final MainThreadHelper f122415g;

    /* renamed from: h, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.count.ui.cluster.s f122416h;

    /* renamed from: i, reason: collision with root package name */
    public long f122417i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f122418j;

    /* renamed from: k, reason: collision with root package name */
    public List f122419k;

    /* renamed from: l, reason: collision with root package name */
    public List f122420l;

    /* renamed from: m, reason: collision with root package name */
    public List f122421m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f122422n;

    /* renamed from: o, reason: collision with root package name */
    public NativeBarcodeCountBasicOverlayColorScheme f122423o;

    /* renamed from: p, reason: collision with root package name */
    public final Lazy f122424p;

    /* renamed from: q, reason: collision with root package name */
    public final G f122425q;

    /* renamed from: r, reason: collision with root package name */
    public Map f122426r;

    /* renamed from: s, reason: collision with root package name */
    public Map f122427s;

    /* renamed from: t, reason: collision with root package name */
    public Map f122428t;

    /* renamed from: u, reason: collision with root package name */
    public Map f122429u;

    /* renamed from: v, reason: collision with root package name */
    public List f122430v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f122431w;

    /* renamed from: x, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.count.ui.status.n f122432x;

    /* renamed from: y, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.ui.i f122433y;

    /* renamed from: z, reason: collision with root package name */
    public final C13200g f122434z;

    public final TrackedBarcode a(com.scandit.datacapture.barcode.internal.module.count.capture.n cluster) {
        Object obj;
        Intrinsics.j(cluster, "cluster");
        Iterator it = cluster.f122251b.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int i10 = a((TrackedBarcode) next, N.f122351a).f122375a;
                do {
                    Object next2 = it.next();
                    int i11 = a((TrackedBarcode) next2, N.f122351a).f122375a;
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
        return this.f122431w;
    }

    public final void c() {
        Iterator it = this.f122426r.entrySet().iterator();
        while (it.hasNext()) {
            L l10 = (L) ((Map.Entry) it.next()).getValue();
            ViewParent parent = l10.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(l10);
            }
        }
        this.f122426r.clear();
        this.f122427s.clear();
        this.f122415g.runOnMainThread(new C13204k(this));
    }

    public C13212t(com.scandit.datacapture.barcode.internal.module.count.ui.g layerManager, U trackedBarcodeHelper, C13217y popupPresenter, NativeBarcodeCountBasicOverlayStyle style, com.scandit.datacapture.barcode.internal.module.count.ui.handlers.r brushHandler, com.scandit.datacapture.barcode.internal.module.count.ui.e onBarcodeViewClickedListener, com.scandit.datacapture.barcode.internal.module.count.ui.cluster.B clusterPresenter) {
        MainThreadHelper mainThreadHelper = new MainThreadHelper();
        Intrinsics.j(layerManager, "layerManager");
        Intrinsics.j(trackedBarcodeHelper, "trackedBarcodeHelper");
        Intrinsics.j(popupPresenter, "popupPresenter");
        Intrinsics.j(style, "style");
        Intrinsics.j(brushHandler, "brushHandler");
        Intrinsics.j(onBarcodeViewClickedListener, "onBarcodeViewClickedListener");
        Intrinsics.j(mainThreadHelper, "mainThreadHelper");
        Intrinsics.j(clusterPresenter, "clusterPresenter");
        this.f122409a = layerManager;
        this.f122410b = trackedBarcodeHelper;
        this.f122411c = popupPresenter;
        this.f122412d = style;
        this.f122413e = brushHandler;
        this.f122414f = onBarcodeViewClickedListener;
        this.f122415g = mainThreadHelper;
        this.f122416h = clusterPresenter;
        this.f122419k = CollectionsKt.m();
        this.f122420l = CollectionsKt.m();
        this.f122421m = CollectionsKt.m();
        this.f122423o = NativeBarcodeCountBasicOverlayColorScheme.DEFAULT;
        this.f122424p = LazyKt.b(new C13201h(this));
        this.f122425q = new G(layerManager.f122544j);
        clusterPresenter.b();
        clusterPresenter.a(style, this.f122423o);
        this.f122426r = new LinkedHashMap();
        this.f122427s = new LinkedHashMap();
        this.f122428t = MapsKt.k();
        this.f122429u = MapsKt.k();
        this.f122430v = CollectionsKt.m();
        this.f122432x = com.scandit.datacapture.barcode.internal.module.count.ui.status.n.f122770a;
        this.f122433y = new com.scandit.datacapture.barcode.internal.module.ui.i(new C13208o(this), new C13209p(this), new C13210q(this));
        this.f122434z = new C13200g(this);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void b(boolean z10, boolean z11) {
        for (L l10 : this.f122426r.values()) {
            if (l10.f122346g == W.f122372f) {
                if (z10) {
                    L.b(l10, z11);
                } else {
                    L.a(l10, z11);
                }
            }
        }
    }

    public final N d(TrackedBarcode trackedBarcode) {
        List list = this.f122430v;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((TrackedBarcode) it.next()).getGlobalId$scandit_barcode_capture() == trackedBarcode.getGlobalId$scandit_barcode_capture()) {
                    return N.f122353c;
                }
            }
        }
        Boolean bool = (Boolean) this.f122429u.get(Integer.valueOf(trackedBarcode.getGlobalId$scandit_barcode_capture()));
        return bool != null ? bool.booleanValue() : false ? N.f122351a : N.f122352b;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void reset() {
        O.a();
        this.f122428t = MapsKt.k();
        this.f122430v = CollectionsKt.m();
        c();
        com.scandit.datacapture.barcode.internal.module.count.ui.barcodeoverlay.a aVar = (com.scandit.datacapture.barcode.internal.module.count.ui.barcodeoverlay.a) this.f122424p.getValue();
        if (aVar != null) {
            aVar.f122457b = CollectionsKt.m();
        }
        this.f122415g.runOnMainThread(new C13205l(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void b(boolean z10) {
        this.f122415g.runOnMainThread(new C13207n(this, z10));
    }

    public final void c(TrackedBarcode barcode) {
        L l10;
        int i10;
        Integer numValueOf;
        L l11 = (L) this.f122426r.get(Integer.valueOf(barcode.getGlobalId$scandit_barcode_capture()));
        if (l11 != null) {
            NativeBarcodeCountBasicOverlayStyle style = this.f122412d;
            W status = a(barcode, d(barcode));
            NativeBarcodeCountBasicOverlayColorScheme colorScheme = this.f122423o;
            C13203j dotBrushProvider = new C13203j(this.f122413e);
            Intrinsics.j(style, "style");
            Intrinsics.j(status, "status");
            Intrinsics.j(colorScheme, "colorScheme");
            Intrinsics.j(barcode, "barcode");
            Intrinsics.j(dotBrushProvider, "dotBrushProvider");
            l11.f122346g = status;
            int i11 = AbstractC13197d.f122386a;
            C13213u normalView = l11.f122341b;
            Intrinsics.j(normalView, "normalView");
            Intrinsics.j(style, "style");
            Intrinsics.j(status, "status");
            Intrinsics.j(colorScheme, "colorScheme");
            Intrinsics.j(barcode, "barcode");
            Intrinsics.j(dotBrushProvider, "dotBrushProvider");
            boolean zA = AbstractC13197d.a(barcode, style, status, dotBrushProvider);
            EnumC13194a enumC13194aA = AbstractC13197d.a(style, status);
            C13196c c13196c = new C13196c(dotBrushProvider, barcode);
            int iOrdinal = enumC13194aA.ordinal();
            Y y10 = null;
            if (iOrdinal == 0) {
                Integer numValueOf2 = Integer.valueOf(R.drawable.sc_ic_barcode_dot);
                Brush brush = (Brush) c13196c.invoke(status);
                normalView.a(numValueOf2, brush != null ? Integer.valueOf(brush.getFillColor()) : null, colorScheme);
            } else if (iOrdinal == 1) {
                Integer numA = AbstractC13197d.a(status, colorScheme);
                int iOrdinal2 = status.ordinal();
                if (iOrdinal2 != 1) {
                    numValueOf = iOrdinal2 != 2 ? null : Integer.valueOf(AbstractC13197d.f122387b);
                } else {
                    numValueOf = Integer.valueOf(AbstractC13197d.f122386a);
                }
                if (numValueOf == null) {
                    normalView.a(numA, colorScheme);
                } else {
                    normalView.a(numA, numValueOf, colorScheme);
                }
            } else if (iOrdinal == 2) {
                Brush brush2 = (Brush) c13196c.invoke(status);
                normalView.a(AbstractC13197d.a(status, colorScheme), brush2 != null ? Integer.valueOf(brush2.getFillColor()) : null, colorScheme);
            }
            boolean z10 = status == W.f122372f && zA;
            Y y11 = normalView.f122436b;
            if (y11 == null) {
                Intrinsics.x("warningBackground");
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
        if (this.f122432x != com.scandit.datacapture.barcode.internal.module.count.ui.status.n.f122771b || (l10 = (L) this.f122426r.get(Integer.valueOf(barcode.getGlobalId$scandit_barcode_capture()))) == null) {
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
        this.f122418j = z10;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void a(NativeBarcodeCountBasicOverlayColorScheme value) {
        Intrinsics.j(value, "value");
        this.f122423o = value;
        ((com.scandit.datacapture.barcode.internal.module.count.ui.cluster.B) this.f122416h).a(this.f122412d, value);
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
        this.f122419k = arrayList;
        List<TrackedBarcode> acceptedBarcodes = session.getAcceptedBarcodes();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(acceptedBarcodes, 10));
        Iterator<T> it2 = acceptedBarcodes.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((TrackedBarcode) it2.next()).getGlobalId$scandit_barcode_capture()));
        }
        this.f122420l = arrayList2;
        List<TrackedBarcode> rejectedBarcodes = session.getRejectedBarcodes();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.x(rejectedBarcodes, 10));
        Iterator<T> it3 = rejectedBarcodes.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Integer.valueOf(((TrackedBarcode) it3.next()).getGlobalId$scandit_barcode_capture()));
        }
        this.f122421m = arrayList3;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void a(FrameLayout captureView) {
        Intrinsics.j(captureView, "captureView");
        if (captureView == null) {
            Intrinsics.x("touchCaptureView");
            captureView = null;
        }
        captureView.setOnTouchListener(new View.OnTouchListener() { // from class: Kt.g
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C13212t.a(this.f17720a, view, motionEvent);
            }
        });
    }

    public static final boolean a(C13212t this$0, View view, MotionEvent motionEvent) {
        Intrinsics.j(this$0, "this$0");
        com.scandit.datacapture.barcode.internal.module.ui.i iVar = this$0.f122433y;
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
        C13217y c13217y = (C13217y) this.f122411c;
        c13217y.getClass();
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        Intrinsics.j(status, "status");
        c13217y.f122443d = status;
        c13217y.f122444e = trackedBarcode;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void a(TrackedBarcode barcode) {
        Intrinsics.j(barcode, "barcode");
        InterfaceC13214v interfaceC13214v = this.f122411c;
        int globalId$scandit_barcode_capture = barcode.getGlobalId$scandit_barcode_capture();
        C13217y c13217y = (C13217y) interfaceC13214v;
        TrackedBarcode trackedBarcode = c13217y.f122444e;
        if (trackedBarcode == null || trackedBarcode.getGlobalId$scandit_barcode_capture() != globalId$scandit_barcode_capture) {
            return;
        }
        c13217y.f122444e = null;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void a(BarcodeCountViewSettings viewSettings) {
        Intrinsics.j(viewSettings, "viewSettings");
        if (viewSettings.w()) {
            com.scandit.datacapture.barcode.internal.module.count.ui.status.n nVar = com.scandit.datacapture.barcode.internal.module.count.ui.status.n.f122771b;
            this.f122432x = nVar;
            G g10 = this.f122425q;
            g10.getClass();
            Intrinsics.j(nVar, "<set-?>");
            g10.f122327g = nVar;
        } else {
            com.scandit.datacapture.barcode.internal.module.count.ui.status.n nVar2 = com.scandit.datacapture.barcode.internal.module.count.ui.status.n.f122770a;
            this.f122432x = nVar2;
            G g11 = this.f122425q;
            g11.getClass();
            Intrinsics.j(nVar2, "<set-?>");
            g11.f122327g = nVar2;
        }
        InterfaceC13214v interfaceC13214v = this.f122411c;
        BarcodeCountNotInListActionSettings settings = viewSettings.b();
        NativeBarcodeCountBasicOverlayColorScheme colorScheme = this.f122423o;
        C13217y c13217y = (C13217y) interfaceC13214v;
        c13217y.getClass();
        Intrinsics.j(settings, "settings");
        Intrinsics.j(colorScheme, "colorScheme");
        com.scandit.datacapture.barcode.internal.module.count.ui.popover.h hVar = c13217y.f122445f;
        hVar.getClass();
        Intrinsics.j(settings, "settings");
        Intrinsics.j(colorScheme, "colorScheme");
        Lazy lazy = com.scandit.datacapture.barcode.internal.module.count.ui.popover.h.f122716f;
        hVar.a(com.scandit.datacapture.barcode.internal.module.count.ui.popover.f.a(hVar.f122717a, settings, colorScheme, hVar.f122718b));
    }

    public static final void a(C13212t c13212t, List list, ArrayList arrayList) {
        Map map = c13212t.f122427s;
        c13212t.f122427s = c13212t.f122426r;
        c13212t.f122426r = map;
        map.clear();
        Iterator it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            V trackedBarcodeInfo = (V) it.next();
            TrackedBarcode trackedBarcode = (TrackedBarcode) c13212t.f122428t.get(Integer.valueOf(trackedBarcodeInfo.f122364a));
            if (trackedBarcode != null) {
                L indicatorView = (L) c13212t.f122427s.remove(Integer.valueOf(trackedBarcodeInfo.f122364a));
                if (indicatorView == null) {
                    FrameLayout frameLayoutG = c13212t.f122409a.g();
                    S.f122360a.getClass();
                    int iFloatValue = (int) ((Number) Q.f122359b.getValue()).floatValue();
                    L l10 = new L(c13212t.f122409a.e(), c13212t.f122432x);
                    l10.setLayoutParams(new FrameLayout.LayoutParams(iFloatValue, iFloatValue));
                    frameLayoutG.addView(l10);
                    z10 = true;
                    indicatorView = l10;
                }
                I i10 = I.f122331a;
                Intrinsics.j(i10, "<set-?>");
                indicatorView.f122344e = i10;
                c13212t.f122426r.put(Integer.valueOf(trackedBarcodeInfo.f122364a), indicatorView);
                S.f122360a.getClass();
                float fFloatValue = ((Number) Q.f122359b.getValue()).floatValue() / 2;
                indicatorView.setX(trackedBarcodeInfo.f122366c.getX() - fFloatValue);
                indicatorView.setY(trackedBarcodeInfo.f122366c.getY() - fFloatValue);
                indicatorView.setScaleX(trackedBarcodeInfo.f122367d);
                indicatorView.setScaleY(trackedBarcodeInfo.f122367d);
                c13212t.c(trackedBarcode);
                C13217y c13217y = (C13217y) c13212t.f122411c;
                c13217y.getClass();
                Intrinsics.j(indicatorView, "indicatorView");
                Intrinsics.j(trackedBarcodeInfo, "trackedBarcodeInfo");
                TrackedBarcode trackedBarcode2 = c13217y.f122444e;
                if (trackedBarcode2 != null && trackedBarcode2.getGlobalId$scandit_barcode_capture() == trackedBarcodeInfo.f122364a) {
                    ViewParent parent = indicatorView.getParent();
                    Intrinsics.h(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    if (!Intrinsics.e((ViewGroup) parent, c13217y.f122441b.b())) {
                        ViewParent parent2 = indicatorView.getParent();
                        Intrinsics.h(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                        ((ViewGroup) parent2).removeView(indicatorView);
                        c13217y.f122441b.b().addView(indicatorView);
                    }
                }
                if (c13217y.f122444e == null) {
                    ViewParent parent3 = indicatorView.getParent();
                    Intrinsics.h(parent3, "null cannot be cast to non-null type android.view.ViewGroup");
                    if (Intrinsics.e((ViewGroup) parent3, c13217y.f122441b.b())) {
                        ViewParent parent4 = indicatorView.getParent();
                        Intrinsics.h(parent4, "null cannot be cast to non-null type android.view.ViewGroup");
                        ((ViewGroup) parent4).removeView(indicatorView);
                        c13217y.f122441b.g().addView(indicatorView);
                    }
                }
            }
        }
        if (z10 && c13212t.f122422n) {
            c13212t.f122422n = false;
            if (O.e()) {
                c13212t.f122415g.runOnMainThread(new C13211s(c13212t));
            }
        }
        if (c13212t.f122432x == com.scandit.datacapture.barcode.internal.module.count.ui.status.n.f122770a) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                z zVar = (z) it2.next();
                int i11 = zVar.f122447b;
                L l11 = (L) c13212t.f122427s.remove(Integer.valueOf(i11));
                if (l11 == null) {
                    FrameLayout frameLayoutG2 = c13212t.f122409a.g();
                    S.f122360a.getClass();
                    int iFloatValue2 = (int) ((Number) Q.f122359b.getValue()).floatValue();
                    L l12 = new L(c13212t.f122409a.e(), c13212t.f122432x);
                    l12.setLayoutParams(new FrameLayout.LayoutParams(iFloatValue2, iFloatValue2));
                    frameLayoutG2.addView(l12);
                    l11 = l12;
                }
                I i12 = I.f122332b;
                Intrinsics.j(i12, "<set-?>");
                l11.f122344e = i12;
                c13212t.f122426r.put(Integer.valueOf(i11), l11);
                S.f122360a.getClass();
                float fFloatValue2 = ((Number) Q.f122359b.getValue()).floatValue() / 2;
                Point center = QuadrilateralUtilsKt.getCenter(zVar.f122449d);
                l11.setX(center.getX() - fFloatValue2);
                l11.setY(center.getY() - fFloatValue2);
                l11.setScaleX(zVar.f122451f);
                l11.setScaleY(zVar.f122451f);
                l11.a(zVar);
            }
        }
        for (Map.Entry entry : c13212t.f122427s.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            L l13 = (L) entry.getValue();
            ViewParent parent5 = l13.getParent();
            Intrinsics.h(parent5, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent5).removeView(l13);
            C13217y c13217y2 = (C13217y) c13212t.f122411c;
            TrackedBarcode trackedBarcode3 = c13217y2.f122444e;
            if (trackedBarcode3 != null && trackedBarcode3.getGlobalId$scandit_barcode_capture() == iIntValue) {
                c13217y2.f122444e = null;
            }
        }
        c13212t.f122427s.clear();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void a(boolean z10, boolean z11) {
        this.f122431w = z10;
        for (L l10 : this.f122426r.values()) {
            if (l10.f122346g != W.f122372f) {
                if (z10) {
                    l10.b(z11);
                } else {
                    L.b(l10.f122341b, z11);
                    l10.f122342c.a(z11);
                }
            }
        }
        com.scandit.datacapture.barcode.internal.module.count.ui.cluster.B b10 = (com.scandit.datacapture.barcode.internal.module.count.ui.cluster.B) this.f122416h;
        b10.f122473j = this.f122432x == com.scandit.datacapture.barcode.internal.module.count.ui.status.n.f122771b || !z10;
        b10.a();
        this.f122415g.runOnMainThread(new C13206m(this, z10, z11));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void a() {
        a(CollectionsKt.m());
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void a(List statusList) {
        Intrinsics.j(statusList, "statusList");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listM1 = CollectionsKt.m1(this.f122428t.keySet());
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
            linkedHashMap.put(Integer.valueOf(((Number) it2.next()).intValue()), com.scandit.datacapture.barcode.internal.module.count.ui.status.c.f122746a);
        }
        O.a(linkedHashMap);
        this.f122415g.runOnMainThread(new C13211s(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void a(int i10) {
        O.a(i10);
        this.f122422n = true;
    }

    public final W a(TrackedBarcode trackedBarcode, N scanStatus) {
        M m10;
        NativeBarcodeCountNotInListStatus nativeBarcodeCountNotInListStatus;
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        Intrinsics.j(scanStatus, "scanStatus");
        int iOrdinal = scanStatus.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return W.f122372f;
            }
            if (iOrdinal == 2) {
                return W.f122373g;
            }
            throw new NoWhenBranchMatchedException();
        }
        int globalId$scandit_barcode_capture = trackedBarcode.getGlobalId$scandit_barcode_capture();
        if (!this.f122418j) {
            m10 = M.f122347a;
        } else if (this.f122419k.contains(Integer.valueOf(globalId$scandit_barcode_capture))) {
            m10 = M.f122348b;
        } else {
            m10 = M.f122349c;
        }
        int iOrdinal2 = m10.ordinal();
        if (iOrdinal2 == 0 || iOrdinal2 == 1) {
            return W.f122368b;
        }
        if (iOrdinal2 == 2) {
            int globalId$scandit_barcode_capture2 = trackedBarcode.getGlobalId$scandit_barcode_capture();
            if (this.f122418j && !this.f122419k.contains(Integer.valueOf(globalId$scandit_barcode_capture2))) {
                if (this.f122420l.contains(Integer.valueOf(globalId$scandit_barcode_capture2))) {
                    nativeBarcodeCountNotInListStatus = NativeBarcodeCountNotInListStatus.ACCEPTED;
                } else if (this.f122421m.contains(Integer.valueOf(globalId$scandit_barcode_capture2))) {
                    nativeBarcodeCountNotInListStatus = NativeBarcodeCountNotInListStatus.REJECTED;
                } else {
                    nativeBarcodeCountNotInListStatus = NativeBarcodeCountNotInListStatus.NONE;
                }
            } else {
                nativeBarcodeCountNotInListStatus = NativeBarcodeCountNotInListStatus.NONE;
            }
            int i10 = AbstractC13199f.f122392b[nativeBarcodeCountNotInListStatus.ordinal()];
            if (i10 == 1) {
                return W.f122371e;
            }
            if (i10 == 2) {
                return W.f122369c;
            }
            if (i10 == 3) {
                return W.f122370d;
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
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.C13212t.a(long, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void");
    }
}
