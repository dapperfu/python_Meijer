package so;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\b¨\u0006\u0016"}, d2 = {"Lso/b;", "Lso/a;", "", "message", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getMessage", "b", "getType", "errors_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: so.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class ServerError implements InterfaceC17110a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerError)) {
            return false;
        }
        ServerError serverError = (ServerError) other;
        return Intrinsics.e(this.message, serverError.message) && Intrinsics.e(this.type, serverError.type);
    }

    public ServerError(String message, String type) {
        Intrinsics.j(message, "message");
        Intrinsics.j(type, "type");
        this.message = message;
        this.type = type;
    }

    @Override // so.InterfaceC17110a
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (this.message.hashCode() * 31) + this.type.hashCode();
    }

    public String toString() {
        return "ServerError(message=" + this.message + ", type=" + this.type + ')';
    }
}
