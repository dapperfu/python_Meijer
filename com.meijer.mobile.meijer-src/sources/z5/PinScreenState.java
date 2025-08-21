package z5;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import w5.AbstractC17844c;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lz5/c;", "", "", "pin", "Lw5/c;", "connectionState", "<init>", "(Ljava/lang/String;Lw5/c;)V", "a", "(Ljava/lang/String;Lw5/c;)Lz5/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "Lw5/c;", "c", "()Lw5/c;", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: z5.c, reason: case insensitive filesystem and from toString */
/* loaded from: classes4.dex */
public final /* data */ class PinScreenState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pin;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC17844c connectionState;

    /* JADX WARN: Multi-variable type inference failed */
    public PinScreenState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PinScreenState)) {
            return false;
        }
        PinScreenState pinScreenState = (PinScreenState) other;
        return Intrinsics.e(this.pin, pinScreenState.pin) && Intrinsics.e(this.connectionState, pinScreenState.connectionState);
    }

    public PinScreenState(String pin, AbstractC17844c connectionState) {
        Intrinsics.j(pin, "pin");
        Intrinsics.j(connectionState, "connectionState");
        this.pin = pin;
        this.connectionState = connectionState;
    }

    public static /* synthetic */ PinScreenState b(PinScreenState pinScreenState, String str, AbstractC17844c abstractC17844c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pinScreenState.pin;
        }
        if ((i10 & 2) != 0) {
            abstractC17844c = pinScreenState.connectionState;
        }
        return pinScreenState.a(str, abstractC17844c);
    }

    public final PinScreenState a(String pin, AbstractC17844c connectionState) {
        Intrinsics.j(pin, "pin");
        Intrinsics.j(connectionState, "connectionState");
        return new PinScreenState(pin, connectionState);
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC17844c getConnectionState() {
        return this.connectionState;
    }

    /* renamed from: d, reason: from getter */
    public final String getPin() {
        return this.pin;
    }

    public int hashCode() {
        return (this.pin.hashCode() * 31) + this.connectionState.hashCode();
    }

    public String toString() {
        return "PinScreenState(pin=" + this.pin + ", connectionState=" + this.connectionState + ')';
    }

    public /* synthetic */ PinScreenState(String str, AbstractC17844c abstractC17844c, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? new AbstractC17844c.Disconnected(null) : abstractC17844c);
    }
}
