package io.constructor.data.model.common;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J%\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lio/constructor/data/model/common/ResultFacet;", "Ljava/io/Serializable;", "name", "", "values", "", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getValues", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ResultFacet implements Serializable {
    private final String name;
    private final List<String> values;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResultFacet copy$default(ResultFacet resultFacet, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = resultFacet.name;
        }
        if ((i10 & 2) != 0) {
            list = resultFacet.values;
        }
        return resultFacet.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<String> component2() {
        return this.values;
    }

    public final ResultFacet copy(@g(name = "name") String name, @g(name = "values") List<String> values) {
        Intrinsics.j(name, "name");
        return new ResultFacet(name, values);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResultFacet)) {
            return false;
        }
        ResultFacet resultFacet = (ResultFacet) other;
        return Intrinsics.e(this.name, resultFacet.name) && Intrinsics.e(this.values, resultFacet.values);
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        List<String> list = this.values;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "ResultFacet(name=" + this.name + ", values=" + this.values + ")";
    }

    public ResultFacet(@g(name = "name") String name, @g(name = "values") List<String> list) {
        Intrinsics.j(name, "name");
        this.name = name;
        this.values = list;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getValues() {
        return this.values;
    }
}
