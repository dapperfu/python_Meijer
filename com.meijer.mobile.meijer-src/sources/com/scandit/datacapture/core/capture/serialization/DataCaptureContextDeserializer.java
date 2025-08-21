package com.scandit.datacapture.core.capture.serialization;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.component.DataCaptureComponent;
import com.scandit.datacapture.core.component.serialization.DataCaptureComponentDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializerResult;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureViewDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializer;
import com.scandit.datacapture.core.internal.module.ui.NativeDataCaptureView;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.serialization.FrameSourceDeserializer;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializer;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetter;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetterKind;
import com.scandit.datacapture.tools.internal.sdk.ProxySetter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u00029:B=\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB5\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\r\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0000H\u0097\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bH\u0097\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0000H\u0097\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0097\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0097\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b#\u0010$J5\u0010+\u001a\u00020\"2\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00062\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b+\u0010,R$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u0010\u001fR$\u00108\u001a\u0002022\u0006\u00103\u001a\u0002028W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006;"}, d2 = {"Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializer;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerProxy;", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializer;", "frameSourceDeserializer", "Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializer;", "viewDeserializer", "", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureModeDeserializer;", "modeDeserializers", "Lcom/scandit/datacapture/core/component/serialization/DataCaptureComponentDeserializer;", "componentDeserializers", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureContextDeserializer;", "impl", "<init>", "(Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializer;Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializer;Ljava/util/List;Ljava/util/List;Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureContextDeserializer;)V", "(Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializer;Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializer;Ljava/util/List;Ljava/util/List;)V", "_deserializer", "()Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializer;", "_impl", "()Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureContextDeserializer;", "deserializer", "", "_setDeserializer", "(Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializer;)V", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerHelper;", "helper", "_setHelper", "(Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerHelper;)V", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerListener;", "listener", "_setListener", "(Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerListener;)V", "", "jsonData", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerResult;", "contextFromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerResult;", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "view", "Lcom/scandit/datacapture/core/component/DataCaptureComponent;", "components", "updateContextFromJson", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/core/ui/DataCaptureView;Ljava/util/List;Ljava/lang/String;)Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerResult;", "g", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerListener;", "getListener", "()Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerListener;", "setListener", "", "<set-?>", "getAvoidThreadDependencies", "()Z", "setAvoidThreadDependencies", "(Z)V", "avoidThreadDependencies", "com/scandit/datacapture/core/capture/serialization/a", "com/scandit/datacapture/core/capture/serialization/b", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@Mockable
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class DataCaptureContextDeserializer implements DataCaptureContextDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final FrameSourceDeserializer f125028a;

    /* renamed from: b, reason: collision with root package name */
    private final DataCaptureViewDeserializer f125029b;

    /* renamed from: c, reason: collision with root package name */
    private final List f125030c;

    /* renamed from: d, reason: collision with root package name */
    private final List f125031d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ DataCaptureContextDeserializerProxyAdapter f125032e;

    /* renamed from: f, reason: collision with root package name */
    private final b f125033f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private DataCaptureContextDeserializerListener listener;

    /* JADX WARN: Multi-variable type inference failed */
    public DataCaptureContextDeserializer(FrameSourceDeserializer frameSourceDeserializer, DataCaptureViewDeserializer viewDeserializer, List<? extends DataCaptureModeDeserializer> modeDeserializers, List<? extends DataCaptureComponentDeserializer> componentDeserializers, NativeDataCaptureContextDeserializer impl) {
        Intrinsics.j(frameSourceDeserializer, "frameSourceDeserializer");
        Intrinsics.j(viewDeserializer, "viewDeserializer");
        Intrinsics.j(modeDeserializers, "modeDeserializers");
        Intrinsics.j(componentDeserializers, "componentDeserializers");
        Intrinsics.j(impl, "impl");
        this.f125028a = frameSourceDeserializer;
        this.f125029b = viewDeserializer;
        this.f125030c = modeDeserializers;
        this.f125031d = componentDeserializers;
        this.f125032e = new DataCaptureContextDeserializerProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        b bVar = new b(frameSourceDeserializer);
        this.f125033f = bVar;
        _setDeserializer(this);
        _setHelper(bVar);
        impl.setListener(new DataCaptureContextDeserializerListenerReversedAdapter(new a(this), this, null, 4, null));
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerProxy
    @ProxyGetter(ProxyGetterKind.WITH_SETTER)
    public DataCaptureContextDeserializer _deserializer() {
        return this.f125032e._deserializer();
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeDataCaptureContextDeserializer getF125040a() {
        return this.f125032e.getF125040a();
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerProxy
    @ProxySetter
    public void _setDeserializer(DataCaptureContextDeserializer deserializer) {
        Intrinsics.j(deserializer, "deserializer");
        this.f125032e._setDeserializer(deserializer);
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerProxy
    @ProxyFunction(nativeName = "setHelper")
    public void _setHelper(DataCaptureContextDeserializerHelper helper) {
        this.f125032e._setHelper(helper);
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerProxy
    @ProxyFunction(nativeName = "setListener")
    public void _setListener(DataCaptureContextDeserializerListener listener) {
        this.f125032e._setListener(listener);
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerProxy
    @ProxyFunction(property = "avoidThreadDependencies")
    public boolean getAvoidThreadDependencies() {
        return this.f125032e.getAvoidThreadDependencies();
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerProxy
    @ProxyFunction(property = "avoidThreadDependencies")
    public void setAvoidThreadDependencies(boolean z10) {
        this.f125032e.setAvoidThreadDependencies(z10);
    }

    public final DataCaptureContextDeserializerResult contextFromJson(String jsonData) {
        Intrinsics.j(jsonData, "jsonData");
        NativeDataCaptureContextDeserializerResult nativeDataCaptureContextDeserializerResultContextFromJson = getF125040a().contextFromJson(new JsonValue(jsonData).getF126782a());
        DataCaptureContext dataCaptureContext = this.f125033f.f125049a;
        DataCaptureView deserializedView = this.f125029b.get_helper().getDeserializedView();
        if (dataCaptureContext == null) {
            throw new AssertionError("Null deserializedContext");
        }
        Intrinsics.g(nativeDataCaptureContextDeserializerResultContextFromJson);
        DataCaptureContextDeserializerResult dataCaptureContextDeserializerResult = new DataCaptureContextDeserializerResult(nativeDataCaptureContextDeserializerResultContextFromJson, dataCaptureContext, deserializedView);
        this.f125033f.f125049a = null;
        this.f125028a.get_helper().clear();
        this.f125029b.get_helper().clear();
        Iterator it = this.f125030c.iterator();
        while (it.hasNext()) {
            ((DataCaptureModeDeserializer) it.next()).get_helper().clear();
        }
        Iterator it2 = this.f125031d.iterator();
        while (it2.hasNext()) {
            ((DataCaptureComponentDeserializer) it2.next()).get_helper().clear();
        }
        return dataCaptureContextDeserializerResult;
    }

    public final DataCaptureContextDeserializerListener getListener() {
        return this.listener;
    }

    public final void setListener(DataCaptureContextDeserializerListener dataCaptureContextDeserializerListener) {
        this.listener = dataCaptureContextDeserializerListener;
    }

    public final DataCaptureContextDeserializerResult updateContextFromJson(DataCaptureContext dataCaptureContext, DataCaptureView view, List<? extends DataCaptureComponent> components, String jsonData) {
        NativeDataCaptureView nativeDataCaptureView_impl;
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(components, "components");
        Intrinsics.j(jsonData, "jsonData");
        ProxyCacheKt.getGlobalProxyCache().put(Reflection.b(NativeDataCaptureContext.class), null, dataCaptureContext._impl(), dataCaptureContext);
        if (view != null) {
            ProxyCacheKt.getGlobalProxyCache().put(Reflection.b(NativeDataCaptureView.class), null, view._impl(), view);
            nativeDataCaptureView_impl = view._impl();
        } else {
            nativeDataCaptureView_impl = null;
        }
        NativeDataCaptureContextDeserializer f125040a = getF125040a();
        NativeDataCaptureContext nativeDataCaptureContext_impl = dataCaptureContext._impl();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(components, 10));
        Iterator<T> it = components.iterator();
        while (it.hasNext()) {
            arrayList.add(((DataCaptureComponent) it.next())._dataCaptureComponentImpl());
        }
        NativeDataCaptureContextDeserializerResult nativeDataCaptureContextDeserializerResultUpdateContextFromJson = f125040a.updateContextFromJson(nativeDataCaptureContext_impl, nativeDataCaptureView_impl, new ArrayList<>(arrayList), new JsonValue(jsonData).getF126782a());
        if (view == null) {
            view = this.f125029b.get_helper().getDeserializedView();
        }
        Intrinsics.g(nativeDataCaptureContextDeserializerResultUpdateContextFromJson);
        DataCaptureContextDeserializerResult dataCaptureContextDeserializerResult = new DataCaptureContextDeserializerResult(nativeDataCaptureContextDeserializerResultUpdateContextFromJson, dataCaptureContext, view);
        this.f125033f.f125049a = null;
        this.f125028a.get_helper().clear();
        this.f125029b.get_helper().clear();
        Iterator it2 = this.f125030c.iterator();
        while (it2.hasNext()) {
            ((DataCaptureModeDeserializer) it2.next()).get_helper().clear();
        }
        Iterator it3 = this.f125031d.iterator();
        while (it3.hasNext()) {
            ((DataCaptureComponentDeserializer) it3.next()).get_helper().clear();
        }
        return dataCaptureContextDeserializerResult;
    }

    public DataCaptureContextDeserializer(FrameSourceDeserializer frameSourceDeserializer, DataCaptureViewDeserializer viewDeserializer, List<? extends DataCaptureModeDeserializer> modeDeserializers, List<? extends DataCaptureComponentDeserializer> componentDeserializers) {
        Intrinsics.j(frameSourceDeserializer, "frameSourceDeserializer");
        Intrinsics.j(viewDeserializer, "viewDeserializer");
        Intrinsics.j(modeDeserializers, "modeDeserializers");
        Intrinsics.j(componentDeserializers, "componentDeserializers");
        NativeFrameSourceDeserializer f126879a = frameSourceDeserializer.getF126879a();
        NativeDataCaptureViewDeserializer nativeDataCaptureViewDeserializer_impl = viewDeserializer._impl();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(modeDeserializers, 10));
        Iterator<T> it = modeDeserializers.iterator();
        while (it.hasNext()) {
            arrayList.add(((DataCaptureModeDeserializer) it.next()).getF121485c());
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.x(componentDeserializers, 10));
        Iterator<T> it2 = componentDeserializers.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((DataCaptureComponentDeserializer) it2.next())._componentDeserializerImpl());
        }
        NativeDataCaptureContextDeserializer nativeDataCaptureContextDeserializerCreate = NativeDataCaptureContextDeserializer.create(f126879a, nativeDataCaptureViewDeserializer_impl, arrayList2, new ArrayList(arrayList3));
        Intrinsics.i(nativeDataCaptureContextDeserializerCreate, "create(...)");
        this(frameSourceDeserializer, viewDeserializer, modeDeserializers, componentDeserializers, nativeDataCaptureContextDeserializerCreate);
    }
}
