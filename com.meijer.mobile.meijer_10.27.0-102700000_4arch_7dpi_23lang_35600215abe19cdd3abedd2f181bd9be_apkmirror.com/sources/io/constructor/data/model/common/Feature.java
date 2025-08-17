package io.constructor.data.model.common;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0001\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JH\u0010\u0017\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lio/constructor/data/model/common/Feature;", "Ljava/io/Serializable;", "featureName", "", "displayName", "min", "", "variant", "", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V", "getDisplayName", "()Ljava/lang/String;", "getFeatureName", "getMin", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getVariant", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)Lio/constructor/data/model/common/Feature;", "equals", "other", "hashCode", "", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Feature implements Serializable {
    private final String displayName;
    private final String featureName;
    private final Boolean min;
    private final Map<String, Object> variant;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Feature copy$default(Feature feature, String str, String str2, Boolean bool, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = feature.featureName;
        }
        if ((i10 & 2) != 0) {
            str2 = feature.displayName;
        }
        if ((i10 & 4) != 0) {
            bool = feature.min;
        }
        if ((i10 & 8) != 0) {
            map = feature.variant;
        }
        return feature.copy(str, str2, bool, map);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFeatureName() {
        return this.featureName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getMin() {
        return this.min;
    }

    public final Map<String, Object> component4() {
        return this.variant;
    }

    public final Feature copy(@g(name = "feature_name") String featureName, @g(name = "display_name") String displayName, @g(name = "enabled") Boolean min, @g(name = "variant") Map<String, ? extends Object> variant) {
        Intrinsics.j(displayName, "displayName");
        return new Feature(featureName, displayName, min, variant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Feature)) {
            return false;
        }
        Feature feature = (Feature) other;
        return Intrinsics.e(this.featureName, feature.featureName) && Intrinsics.e(this.displayName, feature.displayName) && Intrinsics.e(this.min, feature.min) && Intrinsics.e(this.variant, feature.variant);
    }

    public int hashCode() {
        String str = this.featureName;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.displayName.hashCode()) * 31;
        Boolean bool = this.min;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, Object> map = this.variant;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "Feature(featureName=" + this.featureName + ", displayName=" + this.displayName + ", min=" + this.min + ", variant=" + this.variant + ")";
    }

    public Feature(@g(name = "feature_name") String str, @g(name = "display_name") String displayName, @g(name = "enabled") Boolean bool, @g(name = "variant") Map<String, ? extends Object> map) {
        Intrinsics.j(displayName, "displayName");
        this.featureName = str;
        this.displayName = displayName;
        this.min = bool;
        this.variant = map;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getFeatureName() {
        return this.featureName;
    }

    public final Boolean getMin() {
        return this.min;
    }

    public final Map<String, Object> getVariant() {
        return this.variant;
    }
}
