package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer;

import com.scandit.datacapture.barcode.batch.data.TrackedObject;
import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedObject;
import com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickInternal;
import com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSession;
import com.scandit.datacapture.barcode.internal.module.pick.capture.v;
import com.scandit.datacapture.barcode.internal.module.pick.capture.w;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.ui.o;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.DataCaptureViewSizeListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes12.dex */
public final class f implements BarcodePickListener, DataCaptureViewSizeListener {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodePick f123588a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f123589b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f123590c;

    /* renamed from: d, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.k f123591d;

    /* renamed from: e, reason: collision with root package name */
    public final BarcodePickDrawer f123592e;

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void a(BarcodePickInternal mode) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(mode, "mode");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void b(BarcodePickInternal mode) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(mode, "mode");
    }

    public f(BarcodePick mode, o runOnMain, com.scandit.datacapture.barcode.pick.ui.m onDrawerDataUpdatedWithStatusIconsShown, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.k elementsRequestor, BarcodePickDrawer highlightDrawer) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(runOnMain, "runOnMain");
        Intrinsics.j(onDrawerDataUpdatedWithStatusIconsShown, "onDrawerDataUpdatedWithStatusIconsShown");
        Intrinsics.j(elementsRequestor, "elementsRequestor");
        Intrinsics.j(highlightDrawer, "highlightDrawer");
        this.f123588a = mode;
        this.f123589b = runOnMain;
        this.f123590c = onDrawerDataUpdatedWithStatusIconsShown;
        this.f123591d = elementsRequestor;
        this.f123592e = highlightDrawer;
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewSizeListener
    public final void onSizeChanged(DataCaptureView view, int i10, int i11, int i12) {
        Intrinsics.j(view, "view");
        NativeBarcodePickSession session = this.f123588a._impl$scandit_barcode_capture().getSession();
        if (session == null) {
            return;
        }
        a(new v(new b(session)));
    }

    public final void a(v vVar) {
        HashSet<String> toPickObjects = ((w) vVar.f123406b.getValue()).f123407a.getToPickObjects();
        Intrinsics.g(toPickObjects);
        Set setO1 = CollectionsKt.o1(toPickObjects);
        HashSet<String> pickedObjects = ((w) vVar.f123406b.getValue()).f123407a.getPickedObjects();
        Intrinsics.g(pickedObjects);
        Set setO12 = CollectionsKt.o1(pickedObjects);
        HashSet<String> undefinedObjects = ((w) vVar.f123406b.getValue()).f123407a.getUndefinedObjects();
        Intrinsics.g(undefinedObjects);
        Set setO13 = CollectionsKt.o1(undefinedObjects);
        ArrayList<NativeTrackedObject> addedTrackedObjects = ((w) vVar.f123406b.getValue()).f123407a.getAddedTrackedObjects();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(addedTrackedObjects);
        List<TrackedObject> listConvertNativeTrackedObjectList = barcodeNativeTypeFactory.convertNativeTrackedObjectList(addedTrackedObjects);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(listConvertNativeTrackedObjectList, 10)), 16));
        for (Object obj : listConvertNativeTrackedObjectList) {
            linkedHashMap.put(obj, a(((TrackedObject) obj).getData(), setO12, setO1, setO13));
        }
        ArrayList<NativeTrackedObject> updatedTrackedObjects = ((w) vVar.f123406b.getValue()).f123407a.getUpdatedTrackedObjects();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory2 = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(updatedTrackedObjects);
        List<TrackedObject> listConvertNativeTrackedObjectList2 = barcodeNativeTypeFactory2.convertNativeTrackedObjectList(updatedTrackedObjects);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(listConvertNativeTrackedObjectList2, 10)), 16));
        for (Object obj2 : listConvertNativeTrackedObjectList2) {
            linkedHashMap2.put(obj2, a(((TrackedObject) obj2).getData(), setO12, setO1, setO13));
        }
        ArrayList<Integer> removedTrackedObjects = ((w) vVar.f123406b.getValue()).f123407a.getRemovedTrackedObjects();
        Intrinsics.g(removedTrackedObjects);
        List listJ1 = CollectionsKt.j1(removedTrackedObjects);
        HashMap<Integer, NativeTrackedObject> filteredTrackedObjects = ((w) vVar.f123406b.getValue()).f123407a.getFilteredTrackedObjects();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory3 = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(filteredTrackedObjects);
        List listJ12 = CollectionsKt.j1(barcodeNativeTypeFactory3.convertTrackedObjectNativeMap(filteredTrackedObjects).values());
        if (linkedHashMap.isEmpty() && linkedHashMap2.isEmpty() && listJ1.isEmpty() && listJ12.isEmpty()) {
            return;
        }
        this.f123589b.invoke(new e(linkedHashMap, linkedHashMap2, listJ1, this, listJ12));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void b(BarcodePickInternal mode, v session, FrameData data) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(session, "session");
        Intrinsics.j(data, "data");
        a(session);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void a(BarcodePickInternal mode, v session, FrameData frameData) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(session, "session");
        a(session);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void a(BarcodePickInternal mode, Map requestedData) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(requestedData, "requestedData");
        v vVarC = mode.c();
        for (Map.Entry entry : requestedData.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.k kVar = this.f123591d;
            HashSet<String> pickedObjects = ((w) vVarC.f123406b.getValue()).f123407a.getPickedObjects();
            Intrinsics.g(pickedObjects);
            HashSet<String> toPickObjects = ((w) vVarC.f123406b.getValue()).f123407a.getToPickObjects();
            Intrinsics.g(toPickObjects);
            HashSet<String> undefinedObjects = ((w) vVarC.f123406b.getValue()).f123407a.getUndefinedObjects();
            Intrinsics.g(undefinedObjects);
            kVar.a(str, str2, a(str, pickedObjects, toPickObjects, undefinedObjects), new c(this, vVarC));
        }
        a(vVarC);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void a(BarcodePickInternal mode, String id2, boolean z10) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(id2, "id");
        this.f123591d.a(id2);
        NativeBarcodePickSession session = this.f123588a._impl$scandit_barcode_capture().getSession();
        if (session == null) {
            return;
        }
        a(new v(new d(session)));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void a(TrackedObject trackedObject) {
        this.f123591d.b(trackedObject != null ? trackedObject.getData() : null);
        NativeBarcodePickSession session = this.f123588a._impl$scandit_barcode_capture().getSession();
        if (session == null) {
            return;
        }
        a(new v(new d(session)));
    }

    public static BarcodePickState a(String str, Set set, Set set2, Set set3) {
        if (str == null) {
            return BarcodePickState.UNKNOWN;
        }
        return set2.contains(str) ? BarcodePickState.TO_PICK : set.contains(str) ? BarcodePickState.PICKED : set3.contains(str) ? BarcodePickState.UNKNOWN : BarcodePickState.IGNORE;
    }
}
