package io.constructor.data.model.search;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lio/constructor/data/model/search/Redirect;", "Ljava/io/Serializable;", "data", "Lio/constructor/data/model/search/RedirectData;", "matchedTerms", "", "", "matchedUserSegments", "(Lio/constructor/data/model/search/RedirectData;Ljava/util/List;Ljava/lang/String;)V", "getData", "()Lio/constructor/data/model/search/RedirectData;", "getMatchedTerms", "()Ljava/util/List;", "getMatchedUserSegments", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Redirect implements Serializable {
    private final RedirectData data;
    private final List<String> matchedTerms;
    private final String matchedUserSegments;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Redirect copy$default(Redirect redirect, RedirectData redirectData, List list, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            redirectData = redirect.data;
        }
        if ((i10 & 2) != 0) {
            list = redirect.matchedTerms;
        }
        if ((i10 & 4) != 0) {
            str = redirect.matchedUserSegments;
        }
        return redirect.copy(redirectData, list, str);
    }

    /* renamed from: component1, reason: from getter */
    public final RedirectData getData() {
        return this.data;
    }

    public final List<String> component2() {
        return this.matchedTerms;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMatchedUserSegments() {
        return this.matchedUserSegments;
    }

    public final Redirect copy(@g(name = "data") RedirectData data, @g(name = "matched_terms") List<String> matchedTerms, @g(name = "matched_user_segments") String matchedUserSegments) {
        Intrinsics.j(data, "data");
        return new Redirect(data, matchedTerms, matchedUserSegments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Redirect)) {
            return false;
        }
        Redirect redirect = (Redirect) other;
        return Intrinsics.e(this.data, redirect.data) && Intrinsics.e(this.matchedTerms, redirect.matchedTerms) && Intrinsics.e(this.matchedUserSegments, redirect.matchedUserSegments);
    }

    public int hashCode() {
        int iHashCode = this.data.hashCode() * 31;
        List<String> list = this.matchedTerms;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.matchedUserSegments;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "Redirect(data=" + this.data + ", matchedTerms=" + this.matchedTerms + ", matchedUserSegments=" + this.matchedUserSegments + ")";
    }

    public Redirect(@g(name = "data") RedirectData data, @g(name = "matched_terms") List<String> list, @g(name = "matched_user_segments") String str) {
        Intrinsics.j(data, "data");
        this.data = data;
        this.matchedTerms = list;
        this.matchedUserSegments = str;
    }

    public final RedirectData getData() {
        return this.data;
    }

    public final List<String> getMatchedTerms() {
        return this.matchedTerms;
    }

    public final String getMatchedUserSegments() {
        return this.matchedUserSegments;
    }
}
