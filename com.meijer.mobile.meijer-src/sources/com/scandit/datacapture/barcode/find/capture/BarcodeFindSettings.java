package com.scandit.datacapture.barcode.find.capture;

import com.scandit.datacapture.barcode.capture.SymbologySettings;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSettings;
import com.scandit.datacapture.core.internal.sdk.utils.TypeConverter;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\u0018\u0000  2\u00020\u0001:\u0001 B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0097\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0097\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0097\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindSettings;", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindSettingsProxy;", "<init>", "()V", "Lcom/scandit/datacapture/barcode/internal/module/find/capture/NativeBarcodeFindSettings;", "_impl", "()Lcom/scandit/datacapture/barcode/internal/module/find/capture/NativeBarcodeFindSettings;", "", "Lcom/scandit/datacapture/barcode/data/Symbology;", "symbologies", "", "enableSymbologies", "(Ljava/util/Set;)V", "symbology", "Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "getSymbologySettings", "(Lcom/scandit/datacapture/barcode/data/Symbology;)Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "", "enabled", "setSymbologyEnabled", "(Lcom/scandit/datacapture/barcode/data/Symbology;Z)V", "", "name", "", "value", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", "getEnabledSymbologies", "()Ljava/util/Set;", "enabledSymbologies", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeFindSettings implements BarcodeFindSettingsProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeFindSettingsProxyAdapter f121908a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindSettings$Companion;", "", "", "jsonData", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindSettings;", "fromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindSettings;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final BarcodeFindSettings fromJson(String jsonData) {
            Intrinsics.j(jsonData, "jsonData");
            NativeBarcodeFindSettings nativeBarcodeFindSettingsFromJson = NativeBarcodeFindSettings.fromJson(new JsonValue(jsonData).getF126782a());
            Intrinsics.i(nativeBarcodeFindSettingsFromJson, "fromJson(...)");
            return new BarcodeFindSettings(nativeBarcodeFindSettingsFromJson, null);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public /* synthetic */ BarcodeFindSettings(NativeBarcodeFindSettings nativeBarcodeFindSettings, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeFindSettings);
    }

    @JvmStatic
    public static final BarcodeFindSettings fromJson(String str) {
        return INSTANCE.fromJson(str);
    }

    @Override // com.scandit.datacapture.barcode.find.capture.BarcodeFindSettingsProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeBarcodeFindSettings getF121909a() {
        return this.f121908a.getF121909a();
    }

    @Override // com.scandit.datacapture.barcode.find.capture.BarcodeFindSettingsProxy
    @ProxyFunction
    public void enableSymbologies(Set<? extends Symbology> symbologies) {
        Intrinsics.j(symbologies, "symbologies");
        this.f121908a.enableSymbologies(symbologies);
    }

    @Override // com.scandit.datacapture.barcode.find.capture.BarcodeFindSettingsProxy
    @ProxyFunction(property = "enabledSymbologies")
    public Set<Symbology> getEnabledSymbologies() {
        return this.f121908a.getEnabledSymbologies();
    }

    @Override // com.scandit.datacapture.barcode.find.capture.BarcodeFindSettingsProxy
    @ProxyFunction
    public SymbologySettings getSymbologySettings(Symbology symbology) {
        Intrinsics.j(symbology, "symbology");
        return this.f121908a.getSymbologySettings(symbology);
    }

    @Override // com.scandit.datacapture.barcode.find.capture.BarcodeFindSettingsProxy
    @ProxyFunction
    public void setSymbologyEnabled(Symbology symbology, boolean enabled) {
        Intrinsics.j(symbology, "symbology");
        this.f121908a.setSymbologyEnabled(symbology, enabled);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private BarcodeFindSettings(NativeBarcodeFindSettings nativeBarcodeFindSettings) {
        this.f121908a = new BarcodeFindSettingsProxyAdapter(nativeBarcodeFindSettings, null, 2, 0 == true ? 1 : 0);
    }

    public final Object getProperty(String name) {
        Intrinsics.j(name, "name");
        Integer intProperty = getF121909a().getIntProperty(name);
        if (intProperty != null) {
            return intProperty;
        }
        Boolean boolProperty = getF121909a().getBoolProperty(name);
        Integer numValueOf = boolProperty != null ? Integer.valueOf(Boolean.compare(boolProperty.booleanValue(), false)) : null;
        if (numValueOf == null) {
            return -1;
        }
        return numValueOf;
    }

    public final void setProperty(String name, Object value) {
        Intrinsics.j(name, "name");
        Intrinsics.j(value, "value");
        if (value instanceof Boolean) {
            getF121909a().setBoolProperty(name, ((Boolean) value).booleanValue());
            return;
        }
        Integer numIntFromAny = TypeConverter.INSTANCE.intFromAny(value);
        if (numIntFromAny != null) {
            getF121909a().setIntProperty(name, numIntFromAny.intValue());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeFindSettings() {
        NativeBarcodeFindSettings nativeBarcodeFindSettingsCreate = NativeBarcodeFindSettings.create();
        Intrinsics.i(nativeBarcodeFindSettingsCreate, "create(...)");
        this(nativeBarcodeFindSettingsCreate);
    }
}
