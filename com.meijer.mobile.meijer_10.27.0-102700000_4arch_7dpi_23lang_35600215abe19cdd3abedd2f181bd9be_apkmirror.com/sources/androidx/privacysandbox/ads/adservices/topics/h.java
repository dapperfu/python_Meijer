package androidx.privacysandbox.ads.adservices.topics;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/h;", "", "", "Landroidx/privacysandbox/ads/adservices/topics/t;", "topics", "Landroidx/privacysandbox/ads/adservices/topics/a;", "encryptedTopics", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "(Ljava/util/List;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "getEncryptedTopics", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<t> topics;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<C6102a> EncryptedTopics;

    public h(List<t> topics, List<C6102a> encryptedTopics) {
        Intrinsics.j(topics, "topics");
        Intrinsics.j(encryptedTopics, "encryptedTopics");
        this.topics = topics;
        this.EncryptedTopics = encryptedTopics;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof h)) {
            return false;
        }
        h hVar = (h) other;
        return this.topics.size() == hVar.topics.size() && this.EncryptedTopics.size() == hVar.EncryptedTopics.size() && Intrinsics.e(new HashSet(this.topics), new HashSet(hVar.topics)) && Intrinsics.e(new HashSet(this.EncryptedTopics), new HashSet(hVar.EncryptedTopics));
    }

    public final List<t> a() {
        return this.topics;
    }

    public int hashCode() {
        return Objects.hash(this.topics, this.EncryptedTopics);
    }

    public String toString() {
        return "GetTopicsResponse: Topics=" + this.topics + ", EncryptedTopics=" + this.EncryptedTopics;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(List<t> topics) {
        this(topics, CollectionsKt.m());
        Intrinsics.j(topics, "topics");
    }
}
