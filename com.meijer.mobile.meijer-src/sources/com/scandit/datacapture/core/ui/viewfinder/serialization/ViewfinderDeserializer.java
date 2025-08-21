package com.scandit.datacapture.core.ui.viewfinder.serialization;

import com.scandit.datacapture.core.internal.module.serialization.NativeViewfinderDeserializer;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NoViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.AimerViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.LaserlineViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderLineStyle;
import com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderStyle;
import com.scandit.datacapture.core.ui.viewfinder.TargetAimerViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.Viewfinder;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0097\u0001¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00158WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializer;", "Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializerProxy;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeViewfinderDeserializer;", "impl", "<init>", "(Lcom/scandit/datacapture/core/internal/module/serialization/NativeViewfinderDeserializer;)V", "()V", "_impl", "()Lcom/scandit/datacapture/core/internal/module/serialization/NativeViewfinderDeserializer;", "Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializerHelper;", "helper", "", "_setHelper", "(Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializerHelper;)V", "", "jsonData", "Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "viewfinderFromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "_getAndResetLastViewfinder", "()Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "", "getWarnings", "()Ljava/util/List;", "warnings", "Helper", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@Mockable
/* loaded from: classes12.dex */
public final class ViewfinderDeserializer implements ViewfinderDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ViewfinderDeserializerProxyAdapter f127150a;

    /* renamed from: b, reason: collision with root package name */
    private final Helper f127151b;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializer$Helper;", "Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializerHelper;", "<init>", "()V", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NoViewfinder;", "createNoViewfinder", "()Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NoViewfinder;", "Lcom/scandit/datacapture/core/ui/viewfinder/LaserlineViewfinder;", "createLaserlineViewfinder", "()Lcom/scandit/datacapture/core/ui/viewfinder/LaserlineViewfinder;", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderStyle;", "style", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderLineStyle;", "lineStyle", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinder;", "createRectangularViewfinder", "(Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderStyle;Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderLineStyle;)Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinder;", "Lcom/scandit/datacapture/core/ui/viewfinder/AimerViewfinder;", "createAimerViewfinder", "()Lcom/scandit/datacapture/core/ui/viewfinder/AimerViewfinder;", "Lcom/scandit/datacapture/core/ui/viewfinder/TargetAimerViewfinder;", "createTargetAimerViewfinder", "()Lcom/scandit/datacapture/core/ui/viewfinder/TargetAimerViewfinder;", "Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "a", "Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "getViewfinder", "()Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "setViewfinder", "(Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;)V", "viewfinder", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Helper implements ViewfinderDeserializerHelper {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Viewfinder viewfinder;

        @Override // com.scandit.datacapture.core.ui.viewfinder.serialization.ViewfinderDeserializerHelper
        public AimerViewfinder createAimerViewfinder() {
            AimerViewfinder aimerViewfinder = new AimerViewfinder();
            this.viewfinder = aimerViewfinder;
            return aimerViewfinder;
        }

        @Override // com.scandit.datacapture.core.ui.viewfinder.serialization.ViewfinderDeserializerHelper
        public LaserlineViewfinder createLaserlineViewfinder() {
            LaserlineViewfinder laserlineViewfinder = new LaserlineViewfinder();
            this.viewfinder = laserlineViewfinder;
            return laserlineViewfinder;
        }

        @Override // com.scandit.datacapture.core.ui.viewfinder.serialization.ViewfinderDeserializerHelper
        public NoViewfinder createNoViewfinder() {
            NoViewfinder noViewfinder = new NoViewfinder();
            this.viewfinder = noViewfinder;
            return noViewfinder;
        }

        @Override // com.scandit.datacapture.core.ui.viewfinder.serialization.ViewfinderDeserializerHelper
        public RectangularViewfinder createRectangularViewfinder(RectangularViewfinderStyle style, RectangularViewfinderLineStyle lineStyle) {
            Intrinsics.j(style, "style");
            Intrinsics.j(lineStyle, "lineStyle");
            RectangularViewfinder rectangularViewfinder = new RectangularViewfinder(style, lineStyle);
            this.viewfinder = rectangularViewfinder;
            return rectangularViewfinder;
        }

        @Override // com.scandit.datacapture.core.ui.viewfinder.serialization.ViewfinderDeserializerHelper
        public TargetAimerViewfinder createTargetAimerViewfinder() {
            TargetAimerViewfinder targetAimerViewfinder = new TargetAimerViewfinder();
            this.viewfinder = targetAimerViewfinder;
            return targetAimerViewfinder;
        }

        public final Viewfinder getViewfinder() {
            return this.viewfinder;
        }

        public final void setViewfinder(Viewfinder viewfinder) {
            this.viewfinder = viewfinder;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewfinderDeserializer(NativeViewfinderDeserializer impl) {
        Intrinsics.j(impl, "impl");
        this.f127150a = new ViewfinderDeserializerProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        Helper helper = new Helper();
        this.f127151b = helper;
        _setHelper(helper);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.serialization.ViewfinderDeserializerProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeViewfinderDeserializer getF127155a() {
        return this.f127150a.getF127155a();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.serialization.ViewfinderDeserializerProxy
    @ProxyFunction(nativeName = "setHelper")
    public void _setHelper(ViewfinderDeserializerHelper helper) {
        this.f127150a._setHelper(helper);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.serialization.ViewfinderDeserializerProxy
    @ProxyFunction(property = "warnings")
    public List<String> getWarnings() {
        return this.f127150a.getWarnings();
    }

    public final Viewfinder _getAndResetLastViewfinder() {
        Viewfinder viewfinder = this.f127151b.getViewfinder();
        this.f127151b.setViewfinder(null);
        return viewfinder;
    }

    public final Viewfinder viewfinderFromJson(String jsonData) {
        Intrinsics.j(jsonData, "jsonData");
        _getAndResetLastViewfinder();
        getF127155a().viewfinderFromJson(CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        Viewfinder viewfinder_getAndResetLastViewfinder = _getAndResetLastViewfinder();
        if (viewfinder_getAndResetLastViewfinder != null) {
            return viewfinder_getAndResetLastViewfinder;
        }
        throw new IllegalStateException("No Java viewfinder was created during deserialization");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ViewfinderDeserializer() {
        NativeViewfinderDeserializer nativeViewfinderDeserializerCreate = NativeViewfinderDeserializer.create();
        Intrinsics.i(nativeViewfinderDeserializerCreate, "create(...)");
        this(nativeViewfinderDeserializerCreate);
    }
}
