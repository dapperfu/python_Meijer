package io.constructor.data.model.common;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lio/constructor/data/model/common/ResultSourcesData;", "Ljava/io/Serializable;", "count", "", "(Ljava/lang/Integer;)V", "getCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lio/constructor/data/model/common/ResultSourcesData;", "equals", "", "other", "", "hashCode", "toString", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ResultSourcesData implements Serializable {
    private final Integer count;

    public static /* synthetic */ ResultSourcesData copy$default(ResultSourcesData resultSourcesData, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = resultSourcesData.count;
        }
        return resultSourcesData.copy(num);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    public final ResultSourcesData copy(@g(name = "count") Integer count) {
        return new ResultSourcesData(count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ResultSourcesData) && Intrinsics.e(this.count, ((ResultSourcesData) other).count);
    }

    public int hashCode() {
        Integer num = this.count;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        return "ResultSourcesData(count=" + this.count + ")";
    }

    public final Integer getCount() {
        return this.count;
    }

    public ResultSourcesData(@g(name = "count") Integer num) {
        this.count = num;
    }
}
