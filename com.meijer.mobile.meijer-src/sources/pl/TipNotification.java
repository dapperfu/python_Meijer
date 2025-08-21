package pl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lpl/b;", "", "Lpl/a;", "tipData", "", "timeStamp", "<init>", "(Lpl/a;J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpl/a;", "()Lpl/a;", "b", "J", "getTimeStamp", "()J", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pl.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class TipNotification {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final TipData tipData;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long timeStamp;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TipNotification)) {
            return false;
        }
        TipNotification tipNotification = (TipNotification) other;
        return Intrinsics.e(this.tipData, tipNotification.tipData) && this.timeStamp == tipNotification.timeStamp;
    }

    public TipNotification(TipData tipData, long j10) {
        Intrinsics.j(tipData, "tipData");
        this.tipData = tipData;
        this.timeStamp = j10;
    }

    /* renamed from: a, reason: from getter */
    public final TipData getTipData() {
        return this.tipData;
    }

    public int hashCode() {
        return (this.tipData.hashCode() * 31) + Long.hashCode(this.timeStamp);
    }

    public String toString() {
        return "TipNotification(tipData=" + this.tipData + ", timeStamp=" + this.timeStamp + ')';
    }
}
