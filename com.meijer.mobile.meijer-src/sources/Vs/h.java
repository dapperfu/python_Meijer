package Vs;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0004J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LVs/h;", "", "", "LVs/h$a;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface h {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"LVs/h$a;", "", "", "identifier", "LVs/p;", "token", "", "tags", "<init>", "(Ljava/lang/String;LVs/p;Ljava/util/Map;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "LVs/p;", "c", "()LVs/p;", "Ljava/util/Map;", "()Ljava/util/Map;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String identifier;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final p token;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Map<String, String> tags;

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return Intrinsics.e(aVar.identifier, this.identifier) && Intrinsics.e(aVar.token, this.token) && Intrinsics.e(aVar.tags, this.tags);
        }

        public a(String identifier, p pVar, Map<String, String> tags) {
            Intrinsics.j(identifier, "identifier");
            Intrinsics.j(tags, "tags");
            this.identifier = identifier;
            this.token = pVar;
            this.tags = tags;
        }

        /* renamed from: a, reason: from getter */
        public final String getIdentifier() {
            return this.identifier;
        }

        public final Map<String, String> b() {
            return this.tags;
        }

        /* renamed from: c, reason: from getter */
        public final p getToken() {
            return this.token;
        }

        public int hashCode() {
            return Objects.hash(this.identifier, this.token, this.tags);
        }
    }

    Object a(Continuation<? super List<a>> continuation);
}
