package Ek;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0005\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"LEk/b;", "S", "", "<init>", "()V", "oldState", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "LEk/b$a;", "c", "(Ljava/lang/Object;)LEk/b$a;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "uuid", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class b<S> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final UUID uuid;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"LEk/b$a;", "S", "", "Ljava/util/UUID;", "uuid", "result", "<init>", "(Ljava/util/UUID;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "b", "()Ljava/util/UUID;", "Ljava/lang/Object;", "()Ljava/lang/Object;", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ek.b$a, reason: from toString */
    public static final /* data */ class Reduction<S> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final UUID uuid;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final S result;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Reduction)) {
                return false;
            }
            Reduction reduction = (Reduction) other;
            return Intrinsics.e(this.uuid, reduction.uuid) && Intrinsics.e(this.result, reduction.result);
        }

        public Reduction(UUID uuid, S s10) {
            Intrinsics.j(uuid, "uuid");
            this.uuid = uuid;
            this.result = s10;
        }

        public final S a() {
            return this.result;
        }

        /* renamed from: b, reason: from getter */
        public final UUID getUuid() {
            return this.uuid;
        }

        public int hashCode() {
            int iHashCode = this.uuid.hashCode() * 31;
            S s10 = this.result;
            return iHashCode + (s10 == null ? 0 : s10.hashCode());
        }

        public String toString() {
            return "Reduction(uuid=" + this.uuid + ", result=" + this.result + ')';
        }
    }

    public abstract S b(S oldState);

    /* renamed from: a, reason: from getter */
    public final UUID getUuid() {
        return this.uuid;
    }

    public final Reduction<S> c(S oldState) {
        return new Reduction<>(this.uuid, b(oldState));
    }

    public b() {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.i(uuidRandomUUID, "randomUUID(...)");
        this.uuid = uuidRandomUUID;
    }
}
