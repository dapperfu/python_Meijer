package com.scandit.datacapture.core.json;

import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.common.geometry.MarginsWithUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0019\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0014j\b\u0012\u0004\u0012\u00020\u0003`\u0015H\u0097\u0001J\t\u0010\u0016\u001a\u00020\u0006H\u0097\u0001J!\u0010\u0017\u001a\u00020\u00182\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0014j\b\u0012\u0004\u0012\u00020\u0003`\u0015H\u0097\u0001J\t\u0010\u001a\u001a\u00020\u0000H\u0097\u0001J\t\u0010\u001b\u001a\u00020\u0010H\u0097\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u0097\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u0097\u0001J\t\u0010 \u001a\u00020!H\u0097\u0001J\t\u0010\"\u001a\u00020#H\u0097\u0001J\t\u0010$\u001a\u00020\u001fH\u0097\u0001J\t\u0010%\u001a\u00020&H\u0097\u0001J\t\u0010'\u001a\u00020\u0000H\u0097\u0001J\t\u0010(\u001a\u00020)H\u0097\u0001J\t\u0010*\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010+\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u0003H\u0097\u0003J\u0011\u0010-\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u0003H\u0097\u0001J\u001d\u0010.\u001a\u0004\u0018\u00010\u00002\u0006\u0010,\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u00010\u0000H\u0097\u0001J\u0019\u00100\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u0010H\u0097\u0001J\u0019\u00101\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u001dH\u0097\u0001J\u0019\u00102\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u001fH\u0097\u0001J\u0019\u00103\u001a\u00020!2\u0006\u0010,\u001a\u00020\u00032\u0006\u0010/\u001a\u00020!H\u0097\u0001J\u0019\u00104\u001a\u00020#2\u0006\u0010,\u001a\u00020\u00032\u0006\u0010/\u001a\u00020#H\u0097\u0001J\u0019\u00105\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u001fH\u0097\u0001J\u0019\u00106\u001a\u00020&2\u0006\u0010,\u001a\u00020\u00032\u0006\u0010/\u001a\u00020&H\u0097\u0001J\"\u00107\u001a\u0004\u0018\u00010\u001f2\u0006\u0010,\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u00010\u001fH\u0097\u0001¢\u0006\u0002\u00108J!\u00109\u001a\u0004\u0018\u00010\u00032\u0006\u0010,\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0002\b:J\u001d\u0010;\u001a\u0004\u0018\u00010\u00002\u0006\u0010,\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u00010\u0000H\u0097\u0001J\u0019\u0010<\u001a\u00020)2\u0006\u0010,\u001a\u00020\u00032\u0006\u0010/\u001a\u00020)H\u0097\u0001J\u0019\u0010=\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u0003H\u0097\u0001J\t\u0010>\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010?\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u001fH\u0097\u0001J\u0011\u0010A\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010B\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010C\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010D\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010E\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010F\u001a\u00020!2\u0006\u0010,\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010G\u001a\u00020#2\u0006\u0010,\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010H\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010I\u001a\u00020&2\u0006\u0010,\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010J\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010K\u001a\u00020)2\u0006\u0010,\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010L\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0003H\u0097\u0001R\u0014\u0010\b\u001a\u00020\u00038WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006M"}, d2 = {"Lcom/scandit/datacapture/core/json/JsonValue;", "Lcom/scandit/datacapture/core/json/JsonValueProxy;", "jsonData", "", "(Ljava/lang/String;)V", "impl", "Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "(Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;)V", "absolutePath", "getAbsolutePath", "()Ljava/lang/String;", "size", "", "getSize", "()J", "used", "", "getUsed", "()Z", "_getWarnings", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "_impl", "_removeKeys", "", "keys", "asArray", "asBoolean", "asBrush", "Lcom/scandit/datacapture/core/ui/style/Brush;", "asColor", "", "asFloat", "", "asFloatWithUnit", "Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "asInt", "asMarginsWithUnit", "Lcom/scandit/datacapture/core/common/geometry/MarginsWithUnit;", "asObject", "asPointWithUnit", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "asString", "contains", "key", "containsNull", "getByKeyAsArray", "defaultValue", "getByKeyAsBoolean", "getByKeyAsBrush", "getByKeyAsColor", "getByKeyAsFloat", "getByKeyAsFloatWithUnit", "getByKeyAsInt", "getByKeyAsMarginsWithUnit", "getByKeyAsNullableColor", "(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;", "getByKeyAsNullableString", "getByKeyAsNullableString$scandit_capture_core", "getByKeyAsObject", "getByKeyAsPointWithUnit", "getByKeyAsString", "jsonString", "requireByIndex", "index", "requireByKey", "requireByKeyAsArray", "requireByKeyAsBoolean", "requireByKeyAsBrush", "requireByKeyAsColor", "requireByKeyAsFloat", "requireByKeyAsFloatWithUnit", "requireByKeyAsInt", "requireByKeyAsMarginsWithUnit", "requireByKeyAsObject", "requireByKeyAsPointWithUnit", "requireByKeyAsString", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Mockable
/* loaded from: classes11.dex */
public final class JsonValue implements JsonValueProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ JsonValueProxyAdapter f125829a;

    /* JADX WARN: Multi-variable type inference failed */
    public JsonValue(NativeJsonValue impl) {
        Intrinsics.j(impl, "impl");
        this.f125829a = new JsonValueProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getWarnings")
    public ArrayList<String> _getWarnings() {
        return this.f125829a._getWarnings();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeJsonValue getF125830a() {
        return this.f125829a.getF125830a();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "removeKeys")
    public void _removeKeys(ArrayList<String> keys) {
        Intrinsics.j(keys, "keys");
        this.f125829a._removeKeys(keys);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction
    public JsonValue asArray() {
        return this.f125829a.asArray();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "asBool")
    public boolean asBoolean() {
        return this.f125829a.asBoolean();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction
    public Brush asBrush() {
        return this.f125829a.asBrush();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction
    public int asColor() {
        return this.f125829a.asColor();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction
    public float asFloat() {
        return this.f125829a.asFloat();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction
    public FloatWithUnit asFloatWithUnit() {
        return this.f125829a.asFloatWithUnit();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction
    public int asInt() {
        return this.f125829a.asInt();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction
    public MarginsWithUnit asMarginsWithUnit() {
        return this.f125829a.asMarginsWithUnit();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction
    public JsonValue asObject() {
        return this.f125829a.asObject();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction
    public PointWithUnit asPointWithUnit() {
        return this.f125829a.asPointWithUnit();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction
    public String asString() {
        return this.f125829a.asString();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction
    public boolean contains(String key) {
        Intrinsics.j(key, "key");
        return this.f125829a.contains(key);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction
    public boolean containsNull(String key) {
        Intrinsics.j(key, "key");
        return this.f125829a.containsNull(key);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(property = "absolutePath")
    public String getAbsolutePath() {
        return this.f125829a.getAbsolutePath();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getArrayForKeyOrDefault")
    public JsonValue getByKeyAsArray(String key, JsonValue defaultValue) {
        Intrinsics.j(key, "key");
        return this.f125829a.getByKeyAsArray(key, defaultValue);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getBoolForKeyOrDefault")
    public boolean getByKeyAsBoolean(String key, boolean defaultValue) {
        Intrinsics.j(key, "key");
        return this.f125829a.getByKeyAsBoolean(key, defaultValue);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getBrushForKeyOrDefault")
    public Brush getByKeyAsBrush(String key, Brush defaultValue) {
        Intrinsics.j(key, "key");
        Intrinsics.j(defaultValue, "defaultValue");
        return this.f125829a.getByKeyAsBrush(key, defaultValue);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getColorForKeyOrDefault")
    public int getByKeyAsColor(String key, int defaultValue) {
        Intrinsics.j(key, "key");
        return this.f125829a.getByKeyAsColor(key, defaultValue);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getFloatForKeyOrDefault")
    public float getByKeyAsFloat(String key, float defaultValue) {
        Intrinsics.j(key, "key");
        return this.f125829a.getByKeyAsFloat(key, defaultValue);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getFloatWithUnitForKeyOrDefault")
    public FloatWithUnit getByKeyAsFloatWithUnit(String key, FloatWithUnit defaultValue) {
        Intrinsics.j(key, "key");
        Intrinsics.j(defaultValue, "defaultValue");
        return this.f125829a.getByKeyAsFloatWithUnit(key, defaultValue);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getIntForKeyOrDefault")
    public int getByKeyAsInt(String key, int defaultValue) {
        Intrinsics.j(key, "key");
        return this.f125829a.getByKeyAsInt(key, defaultValue);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getMarginsWithUnitForKeyOrDefault")
    public MarginsWithUnit getByKeyAsMarginsWithUnit(String key, MarginsWithUnit defaultValue) {
        Intrinsics.j(key, "key");
        Intrinsics.j(defaultValue, "defaultValue");
        return this.f125829a.getByKeyAsMarginsWithUnit(key, defaultValue);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getOptionalColorForKeyOrDefault")
    public Integer getByKeyAsNullableColor(String key, Integer defaultValue) {
        Intrinsics.j(key, "key");
        return this.f125829a.getByKeyAsNullableColor(key, defaultValue);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getObjectForKeyOrDefault")
    public JsonValue getByKeyAsObject(String key, JsonValue defaultValue) {
        Intrinsics.j(key, "key");
        return this.f125829a.getByKeyAsObject(key, defaultValue);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getPointWithUnitForKeyOrDefault")
    public PointWithUnit getByKeyAsPointWithUnit(String key, PointWithUnit defaultValue) {
        Intrinsics.j(key, "key");
        Intrinsics.j(defaultValue, "defaultValue");
        return this.f125829a.getByKeyAsPointWithUnit(key, defaultValue);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getStringForKeyOrDefault")
    public String getByKeyAsString(String key, String defaultValue) {
        Intrinsics.j(key, "key");
        Intrinsics.j(defaultValue, "defaultValue");
        return this.f125829a.getByKeyAsString(key, defaultValue);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "size", property = "size")
    public long getSize() {
        return this.f125829a.getSize();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "isUsed", property = "used")
    public boolean getUsed() {
        return this.f125829a.getUsed();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "toString")
    public String jsonString() {
        return this.f125829a.jsonString();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getForIndex")
    public JsonValue requireByIndex(int index) {
        return this.f125829a.requireByIndex(index);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getForKey")
    public JsonValue requireByKey(String key) {
        Intrinsics.j(key, "key");
        return this.f125829a.requireByKey(key);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getArrayForKey")
    public JsonValue requireByKeyAsArray(String key) {
        Intrinsics.j(key, "key");
        return this.f125829a.requireByKeyAsArray(key);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getBoolForKey")
    public boolean requireByKeyAsBoolean(String key) {
        Intrinsics.j(key, "key");
        return this.f125829a.requireByKeyAsBoolean(key);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getBrushForKey")
    public Brush requireByKeyAsBrush(String key) {
        Intrinsics.j(key, "key");
        return this.f125829a.requireByKeyAsBrush(key);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getColorForKey")
    public int requireByKeyAsColor(String key) {
        Intrinsics.j(key, "key");
        return this.f125829a.requireByKeyAsColor(key);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getFloatForKey")
    public float requireByKeyAsFloat(String key) {
        Intrinsics.j(key, "key");
        return this.f125829a.requireByKeyAsFloat(key);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getFloatWithUnitForKey")
    public FloatWithUnit requireByKeyAsFloatWithUnit(String key) {
        Intrinsics.j(key, "key");
        return this.f125829a.requireByKeyAsFloatWithUnit(key);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getIntForKey")
    public int requireByKeyAsInt(String key) {
        Intrinsics.j(key, "key");
        return this.f125829a.requireByKeyAsInt(key);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getMarginsWithUnitForKey")
    public MarginsWithUnit requireByKeyAsMarginsWithUnit(String key) {
        Intrinsics.j(key, "key");
        return this.f125829a.requireByKeyAsMarginsWithUnit(key);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getObjectForKey")
    public JsonValue requireByKeyAsObject(String key) {
        Intrinsics.j(key, "key");
        return this.f125829a.requireByKeyAsObject(key);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getPointWithUnitForKey")
    public PointWithUnit requireByKeyAsPointWithUnit(String key) {
        Intrinsics.j(key, "key");
        return this.f125829a.requireByKeyAsPointWithUnit(key);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getStringForKey")
    public String requireByKeyAsString(String key) {
        Intrinsics.j(key, "key");
        return this.f125829a.requireByKeyAsString(key);
    }

    public final String getByKeyAsNullableString$scandit_capture_core(String key, String defaultValue) {
        Intrinsics.j(key, "key");
        return getF125830a().getOptionalStringForKeyOrDefault(key, defaultValue);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public JsonValue(String jsonData) {
        Intrinsics.j(jsonData, "jsonData");
        NativeJsonValue nativeJsonValueFromString = NativeJsonValue.fromString(jsonData);
        Intrinsics.i(nativeJsonValueFromString, "fromString(...)");
        this(nativeJsonValueFromString);
    }
}
