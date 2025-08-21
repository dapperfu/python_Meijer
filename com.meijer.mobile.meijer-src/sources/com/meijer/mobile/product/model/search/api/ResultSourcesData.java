package com.meijer.mobile.product.model.search.api;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/product/model/search/api/ResultSourcesData;", "", "", "count", "<init>", "(Ljava/lang/Integer;)V", "copy", "(Ljava/lang/Integer;)Lcom/meijer/mobile/product/model/search/api/ResultSourcesData;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ResultSourcesData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer count;

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
        return "ResultSourcesData(count=" + this.count + ')';
    }

    /* renamed from: a, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    public ResultSourcesData(@g(name = "count") Integer num) {
        this.count = num;
    }
}
