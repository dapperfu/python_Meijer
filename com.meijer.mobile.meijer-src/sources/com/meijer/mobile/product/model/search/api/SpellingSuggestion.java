package com.meijer.mobile.product.model.search.api;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\b\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/product/model/search/api/SpellingSuggestion;", "", "", "Lcom/meijer/mobile/product/model/search/api/QueryString;", "query", "suggestion", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/product/model/search/api/SpellingSuggestion;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SpellingSuggestion {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String query;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String suggestion;

    /* JADX WARN: Multi-variable type inference failed */
    public SpellingSuggestion() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final SpellingSuggestion copy(@g(name = "query") String query, @g(name = "suggestion") String suggestion) {
        Intrinsics.j(query, "query");
        Intrinsics.j(suggestion, "suggestion");
        return new SpellingSuggestion(query, suggestion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpellingSuggestion)) {
            return false;
        }
        SpellingSuggestion spellingSuggestion = (SpellingSuggestion) other;
        return Intrinsics.e(this.query, spellingSuggestion.query) && Intrinsics.e(this.suggestion, spellingSuggestion.suggestion);
    }

    public int hashCode() {
        return (this.query.hashCode() * 31) + this.suggestion.hashCode();
    }

    public String toString() {
        return "SpellingSuggestion(query=" + this.query + ", suggestion=" + this.suggestion + ')';
    }

    public SpellingSuggestion(@g(name = "query") String query, @g(name = "suggestion") String suggestion) {
        Intrinsics.j(query, "query");
        Intrinsics.j(suggestion, "suggestion");
        this.query = query;
        this.suggestion = suggestion;
    }

    /* renamed from: a, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* renamed from: b, reason: from getter */
    public final String getSuggestion() {
        return this.suggestion;
    }

    public /* synthetic */ SpellingSuggestion(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
    }
}
