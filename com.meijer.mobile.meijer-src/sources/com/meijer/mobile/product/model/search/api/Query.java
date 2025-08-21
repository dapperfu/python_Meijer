package com.meijer.mobile.product.model.search.api;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u001b\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/product/model/search/api/Query;", "", "Lcom/meijer/mobile/product/model/search/api/Query$Value;", "query", "", "url", "<init>", "(Lcom/meijer/mobile/product/model/search/api/Query$Value;Ljava/lang/String;)V", "copy", "(Lcom/meijer/mobile/product/model/search/api/Query$Value;Ljava/lang/String;)Lcom/meijer/mobile/product/model/search/api/Query;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/product/model/search/api/Query$Value;", "()Lcom/meijer/mobile/product/model/search/api/Query$Value;", "b", "Ljava/lang/String;", "Value", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Query {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Value query;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/product/model/search/api/Query$Value;", "", "", "Lcom/meijer/mobile/product/model/search/api/QueryString;", "value", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lcom/meijer/mobile/product/model/search/api/Query$Value;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Value {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String value;

        /* JADX WARN: Multi-variable type inference failed */
        public Value() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final Value copy(@g(name = "value") String value) {
            Intrinsics.j(value, "value");
            return new Value(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Value) && Intrinsics.e(this.value, ((Value) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Value(value=" + this.value + ')';
        }

        public Value(@g(name = "value") String value) {
            Intrinsics.j(value, "value");
            this.value = value;
        }

        /* renamed from: a, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public /* synthetic */ Value(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Query() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Query copy(@g(name = "query") Value query, @g(name = "url") String url) {
        Intrinsics.j(query, "query");
        Intrinsics.j(url, "url");
        return new Query(query, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Query)) {
            return false;
        }
        Query query = (Query) other;
        return Intrinsics.e(this.query, query.query) && Intrinsics.e(this.url, query.url);
    }

    public int hashCode() {
        return (this.query.hashCode() * 31) + this.url.hashCode();
    }

    public String toString() {
        return "Query(query=" + this.query + ", url=" + this.url + ')';
    }

    public Query(@g(name = "query") Value query, @g(name = "url") String url) {
        Intrinsics.j(query, "query");
        Intrinsics.j(url, "url");
        this.query = query;
        this.url = url;
    }

    /* renamed from: a, reason: from getter */
    public final Value getQuery() {
        return this.query;
    }

    /* renamed from: b, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Query(Value value, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Value(null, 1, 0 == true ? 1 : 0) : value, (i10 & 2) != 0 ? "" : str);
    }
}
