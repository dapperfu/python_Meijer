package io.constructor.data.model.browse;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0016\b\u0001\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004¢\u0006\u0002\u0010\bJ\u0017\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\u0016\b\u0003\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lio/constructor/data/model/browse/Collection;", "Ljava/io/Serializable;", "data", "", "", "", "displayName", PreferencesHelper.PREF_ID, "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "getData", "()Ljava/util/Map;", "getDisplayName", "()Ljava/lang/String;", "getId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Collection implements Serializable {
    private final Map<String, Object> data;
    private final String displayName;
    private final String id;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Collection copy$default(Collection collection, Map map, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = collection.data;
        }
        if ((i10 & 2) != 0) {
            str = collection.displayName;
        }
        if ((i10 & 4) != 0) {
            str2 = collection.id;
        }
        return collection.copy(map, str, str2);
    }

    public final Map<String, Object> component1() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final Collection copy(@g(name = "data") Map<String, ? extends Object> data, @g(name = "display_name") String displayName, @g(name = PreferencesHelper.PREF_ID) String id2) {
        Intrinsics.j(displayName, "displayName");
        Intrinsics.j(id2, "id");
        return new Collection(data, displayName, id2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Collection)) {
            return false;
        }
        Collection collection = (Collection) other;
        return Intrinsics.e(this.data, collection.data) && Intrinsics.e(this.displayName, collection.displayName) && Intrinsics.e(this.id, collection.id);
    }

    public int hashCode() {
        Map<String, Object> map = this.data;
        return ((((map == null ? 0 : map.hashCode()) * 31) + this.displayName.hashCode()) * 31) + this.id.hashCode();
    }

    public String toString() {
        return "Collection(data=" + this.data + ", displayName=" + this.displayName + ", id=" + this.id + ")";
    }

    public Collection(@g(name = "data") Map<String, ? extends Object> map, @g(name = "display_name") String displayName, @g(name = PreferencesHelper.PREF_ID) String id2) {
        Intrinsics.j(displayName, "displayName");
        Intrinsics.j(id2, "id");
        this.data = map;
        this.displayName = displayName;
        this.id = id2;
    }

    public final Map<String, Object> getData() {
        return this.data;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getId() {
        return this.id;
    }
}
