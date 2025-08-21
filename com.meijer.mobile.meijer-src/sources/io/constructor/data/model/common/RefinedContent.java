package io.constructor.data.model.common;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\b\u0001\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0019\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003HÆ\u0003J#\u0010\n\u001a\u00020\u00002\u0018\b\u0003\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lio/constructor/data/model/common/RefinedContent;", "Ljava/io/Serializable;", "data", "", "", "", "(Ljava/util/Map;)V", "getData", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class RefinedContent implements Serializable {
    private final Map<String, Object> data;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RefinedContent copy$default(RefinedContent refinedContent, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = refinedContent.data;
        }
        return refinedContent.copy(map);
    }

    public final Map<String, Object> component1() {
        return this.data;
    }

    public final RefinedContent copy(@g(name = "data") Map<String, ? extends Object> data) {
        return new RefinedContent(data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RefinedContent) && Intrinsics.e(this.data, ((RefinedContent) other).data);
    }

    public int hashCode() {
        Map<String, Object> map = this.data;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public String toString() {
        return "RefinedContent(data=" + this.data + ")";
    }

    public final Map<String, Object> getData() {
        return this.data;
    }

    public RefinedContent(@g(name = "data") Map<String, ? extends Object> map) {
        this.data = map;
    }
}
