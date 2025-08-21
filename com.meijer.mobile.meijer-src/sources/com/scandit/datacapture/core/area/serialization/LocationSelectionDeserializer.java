package com.scandit.datacapture.core.area.serialization;

import com.scandit.datacapture.core.area.LocationSelection;
import com.scandit.datacapture.core.area.RadiusLocationSelection;
import com.scandit.datacapture.core.area.RectangularLocationSelection;
import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.common.geometry.MeasureUnit;
import com.scandit.datacapture.core.common.geometry.SizeWithUnit;
import com.scandit.datacapture.core.internal.module.serialization.NativeLocationSelectionDeserializer;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.area.NoLocationSelection;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0097\u0001¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00158WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/scandit/datacapture/core/area/serialization/LocationSelectionDeserializer;", "Lcom/scandit/datacapture/core/area/serialization/LocationSelectionDeserializerProxy;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeLocationSelectionDeserializer;", "impl", "<init>", "(Lcom/scandit/datacapture/core/internal/module/serialization/NativeLocationSelectionDeserializer;)V", "()V", "_impl", "()Lcom/scandit/datacapture/core/internal/module/serialization/NativeLocationSelectionDeserializer;", "Lcom/scandit/datacapture/core/area/serialization/LocationSelectionDeserializerHelper;", "helper", "", "_setHelper", "(Lcom/scandit/datacapture/core/area/serialization/LocationSelectionDeserializerHelper;)V", "", "jsonData", "Lcom/scandit/datacapture/core/area/LocationSelection;", "locationSelectionFromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/core/area/LocationSelection;", "_getAndResetLastLocationSelection", "()Lcom/scandit/datacapture/core/area/LocationSelection;", "", "getWarnings", "()Ljava/util/List;", "warnings", "Helper", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@Mockable
/* loaded from: classes12.dex */
public final class LocationSelectionDeserializer implements LocationSelectionDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ LocationSelectionDeserializerProxyAdapter f124974a;

    /* renamed from: b, reason: collision with root package name */
    private final Helper f124975b;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/scandit/datacapture/core/area/serialization/LocationSelectionDeserializer$Helper;", "Lcom/scandit/datacapture/core/area/serialization/LocationSelectionDeserializerHelper;", "<init>", "()V", "Lcom/scandit/datacapture/core/internal/sdk/area/NoLocationSelection;", "createNoLocationSelectionFromJson", "()Lcom/scandit/datacapture/core/internal/sdk/area/NoLocationSelection;", "Lcom/scandit/datacapture/core/area/RadiusLocationSelection;", "createRadiusLocationSelectionFromJson", "()Lcom/scandit/datacapture/core/area/RadiusLocationSelection;", "Lcom/scandit/datacapture/core/area/RectangularLocationSelection;", "createRectangularLocationSelectionFromJson", "()Lcom/scandit/datacapture/core/area/RectangularLocationSelection;", "Lcom/scandit/datacapture/core/area/LocationSelection;", "a", "Lcom/scandit/datacapture/core/area/LocationSelection;", "getLocationSelection", "()Lcom/scandit/datacapture/core/area/LocationSelection;", "setLocationSelection", "(Lcom/scandit/datacapture/core/area/LocationSelection;)V", "locationSelection", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Helper implements LocationSelectionDeserializerHelper {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private LocationSelection locationSelection;

        @Override // com.scandit.datacapture.core.area.serialization.LocationSelectionDeserializerHelper
        public NoLocationSelection createNoLocationSelectionFromJson() {
            NoLocationSelection noLocationSelection = new NoLocationSelection();
            this.locationSelection = noLocationSelection;
            return noLocationSelection;
        }

        @Override // com.scandit.datacapture.core.area.serialization.LocationSelectionDeserializerHelper
        public RadiusLocationSelection createRadiusLocationSelectionFromJson() {
            RadiusLocationSelection radiusLocationSelection = new RadiusLocationSelection(new FloatWithUnit(0.0f, MeasureUnit.FRACTION));
            this.locationSelection = radiusLocationSelection;
            return radiusLocationSelection;
        }

        @Override // com.scandit.datacapture.core.area.serialization.LocationSelectionDeserializerHelper
        public RectangularLocationSelection createRectangularLocationSelectionFromJson() {
            FloatWithUnit floatWithUnit = new FloatWithUnit(0.0f, MeasureUnit.FRACTION);
            RectangularLocationSelection rectangularLocationSelectionWithSize = RectangularLocationSelection.INSTANCE.withSize(new SizeWithUnit(floatWithUnit, floatWithUnit));
            this.locationSelection = rectangularLocationSelectionWithSize;
            return rectangularLocationSelectionWithSize;
        }

        public final LocationSelection getLocationSelection() {
            return this.locationSelection;
        }

        public final void setLocationSelection(LocationSelection locationSelection) {
            this.locationSelection = locationSelection;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LocationSelectionDeserializer(NativeLocationSelectionDeserializer impl) {
        Intrinsics.j(impl, "impl");
        this.f124974a = new LocationSelectionDeserializerProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        Helper helper = new Helper();
        this.f124975b = helper;
        _setHelper(helper);
    }

    @Override // com.scandit.datacapture.core.area.serialization.LocationSelectionDeserializerProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeLocationSelectionDeserializer getF124979a() {
        return this.f124974a.getF124979a();
    }

    @Override // com.scandit.datacapture.core.area.serialization.LocationSelectionDeserializerProxy
    @ProxyFunction(nativeName = "setHelper")
    public void _setHelper(LocationSelectionDeserializerHelper helper) {
        this.f124974a._setHelper(helper);
    }

    @Override // com.scandit.datacapture.core.area.serialization.LocationSelectionDeserializerProxy
    @ProxyFunction(property = "warnings")
    public List<String> getWarnings() {
        return this.f124974a.getWarnings();
    }

    public final LocationSelection _getAndResetLastLocationSelection() {
        LocationSelection locationSelection = this.f124975b.getLocationSelection();
        this.f124975b.setLocationSelection(null);
        return locationSelection;
    }

    public final LocationSelection locationSelectionFromJson(String jsonData) {
        Intrinsics.j(jsonData, "jsonData");
        _getAndResetLastLocationSelection();
        getF124979a().locationSelectionFromJson(CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        LocationSelection locationSelection_getAndResetLastLocationSelection = _getAndResetLastLocationSelection();
        if (locationSelection_getAndResetLastLocationSelection != null) {
            return locationSelection_getAndResetLastLocationSelection;
        }
        throw new IllegalStateException("No Java location selection was created during deserialization");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LocationSelectionDeserializer() {
        NativeLocationSelectionDeserializer nativeLocationSelectionDeserializerCreate = NativeLocationSelectionDeserializer.create();
        Intrinsics.i(nativeLocationSelectionDeserializerCreate, "create(...)");
        this(nativeLocationSelectionDeserializerCreate);
    }
}
