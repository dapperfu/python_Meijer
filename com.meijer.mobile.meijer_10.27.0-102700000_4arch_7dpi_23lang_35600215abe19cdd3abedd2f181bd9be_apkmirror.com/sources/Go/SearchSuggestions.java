package Go;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LGo/a;", "", "", "LGo/c;", "suggestionsList", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "fulldetails_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Go.a, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class SearchSuggestions {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Suggestion> suggestionsList;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchSuggestions() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SearchSuggestions) && Intrinsics.e(this.suggestionsList, ((SearchSuggestions) other).suggestionsList);
    }

    public SearchSuggestions(List<Suggestion> suggestionsList) {
        Intrinsics.j(suggestionsList, "suggestionsList");
        this.suggestionsList = suggestionsList;
    }

    public final List<Suggestion> a() {
        return this.suggestionsList;
    }

    public int hashCode() {
        return this.suggestionsList.hashCode();
    }

    public String toString() {
        return "SearchSuggestions(suggestionsList=" + this.suggestionsList + ')';
    }

    public /* synthetic */ SearchSuggestions(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.m() : list);
    }
}
