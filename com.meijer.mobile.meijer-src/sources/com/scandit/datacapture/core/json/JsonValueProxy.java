package com.scandit.datacapture.core.json;

import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.common.geometry.MarginsWithUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\ba\u0018\u00002\u00020\u0001J\u0018\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000fj\b\u0012\u0004\u0012\u00020\u0003`\u0010H'J\b\u0010\u0011\u001a\u00020\u0012H'J \u0010\u0013\u001a\u00020\u00142\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000fj\b\u0012\u0004\u0012\u00020\u0003`\u0010H'J\b\u0010\u0016\u001a\u00020\u0017H'J\b\u0010\u0018\u001a\u00020\u000bH'J\b\u0010\u0019\u001a\u00020\u001aH'J\b\u0010\u001b\u001a\u00020\u001cH'J\b\u0010\u001d\u001a\u00020\u001eH'J\b\u0010\u001f\u001a\u00020 H'J\b\u0010!\u001a\u00020\u001cH'J\b\u0010\"\u001a\u00020#H'J\b\u0010$\u001a\u00020\u0017H'J\b\u0010%\u001a\u00020&H'J\b\u0010'\u001a\u00020\u0003H'J\u0011\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u0003H§\u0002J\u0010\u0010*\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u0003H'J\u001c\u0010+\u001a\u0004\u0018\u00010\u00172\u0006\u0010)\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010\u0017H'J\u0018\u0010-\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u000bH'J\u0018\u0010.\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u001aH'J\u0018\u0010/\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u001cH'J\u0018\u00100\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u001eH'J\u0018\u00101\u001a\u00020 2\u0006\u0010)\u001a\u00020\u00032\u0006\u0010,\u001a\u00020 H'J\u0018\u00102\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u001cH'J\u0018\u00103\u001a\u00020#2\u0006\u0010)\u001a\u00020\u00032\u0006\u0010,\u001a\u00020#H'J!\u00104\u001a\u0004\u0018\u00010\u001c2\u0006\u0010)\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010\u001cH'¢\u0006\u0002\u00105J\u001c\u00106\u001a\u0004\u0018\u00010\u00172\u0006\u0010)\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010\u0017H'J\u0018\u00107\u001a\u00020&2\u0006\u0010)\u001a\u00020\u00032\u0006\u0010,\u001a\u00020&H'J\u0018\u00108\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0003H'J\b\u00109\u001a\u00020\u0003H'J\u0010\u0010:\u001a\u00020\u00172\u0006\u0010;\u001a\u00020\u001cH'J\u0010\u0010<\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0003H'J\u0010\u0010=\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0003H'J\u0010\u0010>\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u0003H'J\u0010\u0010?\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u0003H'J\u0010\u0010@\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u0003H'J\u0010\u0010A\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u0003H'J\u0010\u0010B\u001a\u00020 2\u0006\u0010)\u001a\u00020\u0003H'J\u0010\u0010C\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u0003H'J\u0010\u0010D\u001a\u00020#2\u0006\u0010)\u001a\u00020\u0003H'J\u0010\u0010E\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0003H'J\u0010\u0010F\u001a\u00020&2\u0006\u0010)\u001a\u00020\u0003H'J\u0010\u0010G\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0003H'R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006H"}, d2 = {"Lcom/scandit/datacapture/core/json/JsonValueProxy;", "", "absolutePath", "", "getAbsolutePath", "()Ljava/lang/String;", "size", "", "getSize", "()J", "used", "", "getUsed", "()Z", "_getWarnings", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "_removeKeys", "", "keys", "asArray", "Lcom/scandit/datacapture/core/json/JsonValue;", "asBoolean", "asBrush", "Lcom/scandit/datacapture/core/ui/style/Brush;", "asColor", "", "asFloat", "", "asFloatWithUnit", "Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "asInt", "asMarginsWithUnit", "Lcom/scandit/datacapture/core/common/geometry/MarginsWithUnit;", "asObject", "asPointWithUnit", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "asString", "contains", "key", "containsNull", "getByKeyAsArray", "defaultValue", "getByKeyAsBoolean", "getByKeyAsBrush", "getByKeyAsColor", "getByKeyAsFloat", "getByKeyAsFloatWithUnit", "getByKeyAsInt", "getByKeyAsMarginsWithUnit", "getByKeyAsNullableColor", "(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;", "getByKeyAsObject", "getByKeyAsPointWithUnit", "getByKeyAsString", "jsonString", "requireByIndex", "index", "requireByKey", "requireByKeyAsArray", "requireByKeyAsBoolean", "requireByKeyAsBrush", "requireByKeyAsColor", "requireByKeyAsFloat", "requireByKeyAsFloatWithUnit", "requireByKeyAsInt", "requireByKeyAsMarginsWithUnit", "requireByKeyAsObject", "requireByKeyAsPointWithUnit", "requireByKeyAsString", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeJsonValue.class)
/* loaded from: classes12.dex */
public interface JsonValueProxy {
    @ProxyFunction(nativeName = "getWarnings")
    ArrayList<String> _getWarnings();

    @NativeImpl
    /* renamed from: _impl */
    NativeJsonValue getF126782a();

    @ProxyFunction(nativeName = "removeKeys")
    void _removeKeys(ArrayList<String> keys);

    @ProxyFunction
    JsonValue asArray();

    @ProxyFunction(nativeName = "asBool")
    boolean asBoolean();

    @ProxyFunction
    Brush asBrush();

    @ProxyFunction
    int asColor();

    @ProxyFunction
    float asFloat();

    @ProxyFunction
    FloatWithUnit asFloatWithUnit();

    @ProxyFunction
    int asInt();

    @ProxyFunction
    MarginsWithUnit asMarginsWithUnit();

    @ProxyFunction
    JsonValue asObject();

    @ProxyFunction
    PointWithUnit asPointWithUnit();

    @ProxyFunction
    String asString();

    @ProxyFunction
    boolean contains(String key);

    @ProxyFunction
    boolean containsNull(String key);

    @ProxyFunction(property = "absolutePath")
    String getAbsolutePath();

    @ProxyFunction(nativeName = "getArrayForKeyOrDefault")
    JsonValue getByKeyAsArray(String key, JsonValue defaultValue);

    @ProxyFunction(nativeName = "getBoolForKeyOrDefault")
    boolean getByKeyAsBoolean(String key, boolean defaultValue);

    @ProxyFunction(nativeName = "getBrushForKeyOrDefault")
    Brush getByKeyAsBrush(String key, Brush defaultValue);

    @ProxyFunction(nativeName = "getColorForKeyOrDefault")
    int getByKeyAsColor(String key, int defaultValue);

    @ProxyFunction(nativeName = "getFloatForKeyOrDefault")
    float getByKeyAsFloat(String key, float defaultValue);

    @ProxyFunction(nativeName = "getFloatWithUnitForKeyOrDefault")
    FloatWithUnit getByKeyAsFloatWithUnit(String key, FloatWithUnit defaultValue);

    @ProxyFunction(nativeName = "getIntForKeyOrDefault")
    int getByKeyAsInt(String key, int defaultValue);

    @ProxyFunction(nativeName = "getMarginsWithUnitForKeyOrDefault")
    MarginsWithUnit getByKeyAsMarginsWithUnit(String key, MarginsWithUnit defaultValue);

    @ProxyFunction(nativeName = "getOptionalColorForKeyOrDefault")
    Integer getByKeyAsNullableColor(String key, Integer defaultValue);

    @ProxyFunction(nativeName = "getObjectForKeyOrDefault")
    JsonValue getByKeyAsObject(String key, JsonValue defaultValue);

    @ProxyFunction(nativeName = "getPointWithUnitForKeyOrDefault")
    PointWithUnit getByKeyAsPointWithUnit(String key, PointWithUnit defaultValue);

    @ProxyFunction(nativeName = "getStringForKeyOrDefault")
    String getByKeyAsString(String key, String defaultValue);

    @ProxyFunction(nativeName = "size", property = "size")
    long getSize();

    @ProxyFunction(nativeName = "isUsed", property = "used")
    boolean getUsed();

    @ProxyFunction(nativeName = "toString")
    String jsonString();

    @ProxyFunction(nativeName = "getForIndex")
    JsonValue requireByIndex(int index);

    @ProxyFunction(nativeName = "getForKey")
    JsonValue requireByKey(String key);

    @ProxyFunction(nativeName = "getArrayForKey")
    JsonValue requireByKeyAsArray(String key);

    @ProxyFunction(nativeName = "getBoolForKey")
    boolean requireByKeyAsBoolean(String key);

    @ProxyFunction(nativeName = "getBrushForKey")
    Brush requireByKeyAsBrush(String key);

    @ProxyFunction(nativeName = "getColorForKey")
    int requireByKeyAsColor(String key);

    @ProxyFunction(nativeName = "getFloatForKey")
    float requireByKeyAsFloat(String key);

    @ProxyFunction(nativeName = "getFloatWithUnitForKey")
    FloatWithUnit requireByKeyAsFloatWithUnit(String key);

    @ProxyFunction(nativeName = "getIntForKey")
    int requireByKeyAsInt(String key);

    @ProxyFunction(nativeName = "getMarginsWithUnitForKey")
    MarginsWithUnit requireByKeyAsMarginsWithUnit(String key);

    @ProxyFunction(nativeName = "getObjectForKey")
    JsonValue requireByKeyAsObject(String key);

    @ProxyFunction(nativeName = "getPointWithUnitForKey")
    PointWithUnit requireByKeyAsPointWithUnit(String key);

    @ProxyFunction(nativeName = "getStringForKey")
    String requireByKeyAsString(String key);
}
