package io.constructor.data.model.search;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lio/constructor/data/model/search/RedirectData;", "Ljava/io/Serializable;", "url", "", "rule_id", "", "match_id", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getMatch_id", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRule_id", "getUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lio/constructor/data/model/search/RedirectData;", "equals", "", "other", "", "hashCode", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class RedirectData implements Serializable {
    private final Integer match_id;
    private final Integer rule_id;
    private final String url;

    public static /* synthetic */ RedirectData copy$default(RedirectData redirectData, String str, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = redirectData.url;
        }
        if ((i10 & 2) != 0) {
            num = redirectData.rule_id;
        }
        if ((i10 & 4) != 0) {
            num2 = redirectData.match_id;
        }
        return redirectData.copy(str, num, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getRule_id() {
        return this.rule_id;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getMatch_id() {
        return this.match_id;
    }

    public final RedirectData copy(@g(name = "url") String url, @g(name = "rule_id") Integer rule_id, @g(name = "match_id") Integer match_id) {
        return new RedirectData(url, rule_id, match_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RedirectData)) {
            return false;
        }
        RedirectData redirectData = (RedirectData) other;
        return Intrinsics.e(this.url, redirectData.url) && Intrinsics.e(this.rule_id, redirectData.rule_id) && Intrinsics.e(this.match_id, redirectData.match_id);
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.rule_id;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.match_id;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "RedirectData(url=" + this.url + ", rule_id=" + this.rule_id + ", match_id=" + this.match_id + ")";
    }

    public final Integer getMatch_id() {
        return this.match_id;
    }

    public final Integer getRule_id() {
        return this.rule_id;
    }

    public final String getUrl() {
        return this.url;
    }

    public RedirectData(@g(name = "url") String str, @g(name = "rule_id") Integer num, @g(name = "match_id") Integer num2) {
        this.url = str;
        this.rule_id = num;
        this.match_id = num2;
    }
}
