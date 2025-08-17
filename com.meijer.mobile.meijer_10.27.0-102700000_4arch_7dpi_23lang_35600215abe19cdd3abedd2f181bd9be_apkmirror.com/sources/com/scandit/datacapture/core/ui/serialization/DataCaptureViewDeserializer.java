package com.scandit.datacapture.core.ui.serialization;

import android.content.Context;
import androidx.annotation.Keep;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper;
import com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureViewDeserializer;
import com.scandit.datacapture.core.internal.module.ui.video.NativeVideoPreview;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.common.linearcontrolgroup.ControlDeserializer;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.control.Control;
import com.scandit.datacapture.core.ui.gesture.SwipeToZoom;
import com.scandit.datacapture.core.ui.gesture.TapToFocus;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetter;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetterKind;
import com.scandit.datacapture.tools.internal.sdk.ProxySetter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0002;<B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0000H\u0097\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0000H\u0097\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0097\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0097\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0097\u0001¢\u0006\u0004\b \u0010!J \u0010$\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001eH\u0097\u0001¢\u0006\u0004\b$\u0010%J\u001d\u0010(\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\"2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010,R\u0017\u00102\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u0010\u001bR\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020&0\u00048WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006="}, d2 = {"Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializer;", "Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializerProxy;", "Landroid/content/Context;", "context", "", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureModeDeserializer;", "modeDeserializers", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureViewDeserializer;", "impl", "<init>", "(Landroid/content/Context;Ljava/util/List;Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureViewDeserializer;)V", "(Landroid/content/Context;Ljava/util/List;)V", "_deserializer", "()Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializer;", "_impl", "()Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureViewDeserializer;", "deserializer", "", "_setDeserializer", "(Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializer;)V", "Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializerHelper;", "helper", "_setHelper", "(Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializerHelper;)V", "Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializerListener;", "listener", "_setListener", "(Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializerListener;)V", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "view", "Lcom/scandit/datacapture/core/json/JsonValue;", "json", "_updateViewFromJson", "(Lcom/scandit/datacapture/core/ui/DataCaptureView;Lcom/scandit/datacapture/core/json/JsonValue;)Lcom/scandit/datacapture/core/ui/DataCaptureView;", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "_viewFromJson", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/core/json/JsonValue;)Lcom/scandit/datacapture/core/ui/DataCaptureView;", "", "jsonData", "viewFromJson", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;Ljava/lang/String;)Lcom/scandit/datacapture/core/ui/DataCaptureView;", "updateViewFromJson", "(Lcom/scandit/datacapture/core/ui/DataCaptureView;Ljava/lang/String;)Lcom/scandit/datacapture/core/ui/DataCaptureView;", "Ljava/util/List;", "Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializer$Helper;", "b", "Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializer$Helper;", "get_helper", "()Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializer$Helper;", "_helper", "c", "Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializerListener;", "getListener", "()Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializerListener;", "setListener", "getWarnings", "()Ljava/util/List;", "warnings", "com/scandit/datacapture/core/ui/serialization/a", "Helper", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@Mockable
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class DataCaptureViewDeserializer implements DataCaptureViewDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ DataCaptureViewDeserializerProxyAdapter f126135a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Helper _helper;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private DataCaptureViewDeserializerListener listener;

    @Keep
    private final List<DataCaptureModeDeserializer> modeDeserializers;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\tJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\tJ\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializer$Helper;", "Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializerHelper;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureDeserializerHelper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "clear", "()V", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "createView", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)Lcom/scandit/datacapture/core/ui/DataCaptureView;", "createdNullFocusGesture", "", "showUIIndicator", "Lcom/scandit/datacapture/core/ui/gesture/TapToFocus;", "createTapToFocus", "(Z)Lcom/scandit/datacapture/core/ui/gesture/TapToFocus;", "createdNullZoomGesture", "Lcom/scandit/datacapture/core/ui/gesture/SwipeToZoom;", "createSwipeToZoom", "()Lcom/scandit/datacapture/core/ui/gesture/SwipeToZoom;", "view", "Lcom/scandit/datacapture/core/json/JsonValue;", "json", "updateViewFromJson", "(Lcom/scandit/datacapture/core/ui/DataCaptureView;Lcom/scandit/datacapture/core/json/JsonValue;)V", "b", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "getDeserializedView$scandit_capture_core", "()Lcom/scandit/datacapture/core/ui/DataCaptureView;", "setDeserializedView$scandit_capture_core", "(Lcom/scandit/datacapture/core/ui/DataCaptureView;)V", "deserializedView", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class Helper implements DataCaptureViewDeserializerHelper, DataCaptureDeserializerHelper {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f126138a;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private DataCaptureView deserializedView;

        /* renamed from: c, reason: collision with root package name */
        private boolean f126140c;

        /* renamed from: d, reason: collision with root package name */
        private TapToFocus f126141d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f126142e;

        /* renamed from: f, reason: collision with root package name */
        private SwipeToZoom f126143f;

        /* renamed from: g, reason: collision with root package name */
        private final ControlDeserializer f126144g;

        /* JADX INFO: Access modifiers changed from: private */
        public final synchronized void a(DataCaptureView dataCaptureView, JsonValue jsonValue) {
            try {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                List<? extends Control> listM1 = CollectionsKt.m1(dataCaptureView.getControls$scandit_capture_core());
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                JsonValue byKeyAsArray = jsonValue.getByKeyAsArray("controls", null);
                if (byKeyAsArray != null) {
                    int size = (int) byKeyAsArray.getSize();
                    for (int i10 = 0; i10 < size; i10++) {
                        JsonValue jsonValueRequireByIndex = byKeyAsArray.requireByIndex(i10);
                        ControlDeserializer controlDeserializer = this.f126144g;
                        Context context = dataCaptureView.getContext();
                        Intrinsics.i(context, "getContext(...)");
                        controlDeserializer.deserializeControl(context, jsonValueRequireByIndex, listM1, new c(arrayList, listM1, arrayList2, linkedHashMap, linkedHashMap2));
                    }
                }
                Iterator it = listM1.iterator();
                while (it.hasNext()) {
                    dataCaptureView.removeControl((Control) it.next());
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Control control = (Control) it2.next();
                    dataCaptureView.removeControl(control);
                    Anchor anchor = (Anchor) linkedHashMap.get(control);
                    PointWithUnit pointWithUnit = (PointWithUnit) linkedHashMap2.get(control);
                    if (anchor == null || pointWithUnit == null) {
                        dataCaptureView.addControl(control);
                    } else {
                        dataCaptureView.addControl(control, anchor, pointWithUnit);
                    }
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Control control2 = (Control) it3.next();
                    Anchor anchor2 = (Anchor) linkedHashMap.get(control2);
                    PointWithUnit pointWithUnit2 = (PointWithUnit) linkedHashMap2.get(control2);
                    if (anchor2 == null || pointWithUnit2 == null) {
                        dataCaptureView.addControl(control2);
                    } else {
                        dataCaptureView.addControl(control2, anchor2, pointWithUnit2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper
        public void clear() {
            this.deserializedView = null;
            this.f126140c = false;
            this.f126141d = null;
            this.f126142e = false;
            this.f126143f = null;
        }

        @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerHelper
        public void createdNullFocusGesture() {
            this.f126140c = true;
        }

        @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerHelper
        public void createdNullZoomGesture() {
            this.f126142e = true;
        }

        public Helper(Context context) {
            Intrinsics.j(context, "context");
            this.f126138a = new WeakReference(context);
            this.f126144g = new ControlDeserializer();
        }

        @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerHelper
        public SwipeToZoom createSwipeToZoom() {
            SwipeToZoom swipeToZoom = new SwipeToZoom();
            this.f126143f = swipeToZoom;
            this.f126142e = true;
            return swipeToZoom;
        }

        @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerHelper
        public TapToFocus createTapToFocus(boolean showUIIndicator) {
            TapToFocus tapToFocus = new TapToFocus();
            tapToFocus.setShowUIIndicator(showUIIndicator);
            this.f126141d = tapToFocus;
            this.f126140c = true;
            return tapToFocus;
        }

        @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerHelper
        public DataCaptureView createView(DataCaptureContext dataCaptureContext) {
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
            Context applicationContext = (Context) this.f126138a.get();
            if (applicationContext == null) {
                applicationContext = AppAndroidEnvironment.INSTANCE.getApplicationContext();
            }
            Context context = applicationContext;
            Intrinsics.g(context);
            NativeVideoPreview nativeVideoPreviewCreate = NativeVideoPreview.create();
            Intrinsics.i(nativeVideoPreviewCreate, "create(...)");
            DataCaptureView dataCaptureView = new DataCaptureView(context, dataCaptureContext, nativeVideoPreviewCreate, null, 0.0f, 24, null);
            this.deserializedView = dataCaptureView;
            return dataCaptureView;
        }

        /* renamed from: getDeserializedView$scandit_capture_core, reason: from getter */
        public final DataCaptureView getDeserializedView() {
            return this.deserializedView;
        }

        public final void setDeserializedView$scandit_capture_core(DataCaptureView dataCaptureView) {
            this.deserializedView = dataCaptureView;
        }

        @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerHelper
        public void updateViewFromJson(DataCaptureView view, JsonValue json) {
            Intrinsics.j(view, "view");
            Intrinsics.j(json, "json");
            if (this.f126140c) {
                view.setFocusGesture(this.f126141d);
            }
            if (this.f126142e) {
                view.setZoomGesture(this.f126143f);
            }
            view.set_optimizesRendering$scandit_capture_core(json.getByKeyAsBoolean("optimizesRendering", view.get_optimizesRendering()));
            if (view.getParent() == null) {
                a(view, json);
            } else {
                ViewExtensionsKt.runOnMainThread(view, new b(this, view, json));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DataCaptureViewDeserializer(Context context, List<? extends DataCaptureModeDeserializer> modeDeserializers, NativeDataCaptureViewDeserializer impl) {
        Intrinsics.j(context, "context");
        Intrinsics.j(modeDeserializers, "modeDeserializers");
        Intrinsics.j(impl, "impl");
        this.modeDeserializers = modeDeserializers;
        this.f126135a = new DataCaptureViewDeserializerProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        Helper helper = new Helper(context);
        this._helper = helper;
        _setDeserializer(this);
        _setHelper(helper);
        impl.setListener(new DataCaptureViewDeserializerListenerReversedAdapter(new a(this), this, null, 4, null));
    }

    @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerProxy
    @ProxyGetter(ProxyGetterKind.WITH_SETTER)
    public DataCaptureViewDeserializer _deserializer() {
        return this.f126135a._deserializer();
    }

    @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeDataCaptureViewDeserializer getF126150a() {
        return this.f126135a.getF126150a();
    }

    @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerProxy
    @ProxySetter
    public void _setDeserializer(DataCaptureViewDeserializer deserializer) {
        Intrinsics.j(deserializer, "deserializer");
        this.f126135a._setDeserializer(deserializer);
    }

    @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerProxy
    @ProxyFunction(nativeName = "setHelper")
    public void _setHelper(DataCaptureViewDeserializerHelper helper) {
        this.f126135a._setHelper(helper);
    }

    @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerProxy
    @ProxyFunction(nativeName = "setListener")
    public void _setListener(DataCaptureViewDeserializerListener listener) {
        this.f126135a._setListener(listener);
    }

    @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerProxy
    @ProxyFunction(nativeName = "updateViewFromJson")
    public DataCaptureView _updateViewFromJson(DataCaptureView view, JsonValue json) {
        Intrinsics.j(view, "view");
        Intrinsics.j(json, "json");
        return this.f126135a._updateViewFromJson(view, json);
    }

    @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerProxy
    @ProxyFunction(nativeName = "viewFromJson")
    public DataCaptureView _viewFromJson(DataCaptureContext dataCaptureContext, JsonValue json) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(json, "json");
        return this.f126135a._viewFromJson(dataCaptureContext, json);
    }

    @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerProxy
    @ProxyFunction(property = "warnings")
    public List<String> getWarnings() {
        return this.f126135a.getWarnings();
    }

    public final DataCaptureViewDeserializerListener getListener() {
        return this.listener;
    }

    public final Helper get_helper() {
        return this._helper;
    }

    public final void setListener(DataCaptureViewDeserializerListener dataCaptureViewDeserializerListener) {
        this.listener = dataCaptureViewDeserializerListener;
    }

    public final DataCaptureView updateViewFromJson(DataCaptureView view, String jsonData) {
        Intrinsics.j(view, "view");
        Intrinsics.j(jsonData, "jsonData");
        return _updateViewFromJson(view, new JsonValue(jsonData));
    }

    public final DataCaptureView viewFromJson(DataCaptureContext dataCaptureContext, String jsonData) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(jsonData, "jsonData");
        DataCaptureView dataCaptureView_viewFromJson = _viewFromJson(dataCaptureContext, new JsonValue(jsonData));
        this._helper.clear();
        return dataCaptureView_viewFromJson;
    }

    public DataCaptureViewDeserializer(Context context, List<? extends DataCaptureModeDeserializer> modeDeserializers) {
        Intrinsics.j(context, "context");
        Intrinsics.j(modeDeserializers, "modeDeserializers");
        ArrayList arrayList = new ArrayList(CollectionsKt.x(modeDeserializers, 10));
        Iterator<T> it = modeDeserializers.iterator();
        while (it.hasNext()) {
            arrayList.add(((DataCaptureModeDeserializer) it.next()).getF120533c());
        }
        NativeDataCaptureViewDeserializer nativeDataCaptureViewDeserializerCreate = NativeDataCaptureViewDeserializer.create(new ArrayList(arrayList));
        Intrinsics.i(nativeDataCaptureViewDeserializerCreate, "create(...)");
        this(context, modeDeserializers, nativeDataCaptureViewDeserializerCreate);
    }
}
