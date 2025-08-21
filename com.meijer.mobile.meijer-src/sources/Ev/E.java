package Ev;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\u0001\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"LEv/E;", "LEv/i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "a", "content", "Companion", "LEv/v;", "LEv/z;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class E extends i {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LEv/E$a;", "", "<init>", "()V", "Lzv/b;", "LEv/E;", "serializer", "()Lzv/b;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ev.E$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final zv.b<E> serializer() {
            return F.f8592a;
        }
    }

    public /* synthetic */ E(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    private E() {
        super(null);
    }

    public String toString() {
        return a();
    }
}
