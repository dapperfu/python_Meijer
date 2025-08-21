package oi;

import Ki.T;
import V0.C5489q0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Loi/a;", "", "LV0/q0;", "backgroundColor", "contentColor", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "getContentColor-0d7_KjU", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: oi.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class AcresButtonColors {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long backgroundColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long contentColor;

    public /* synthetic */ AcresButtonColors(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcresButtonColors)) {
            return false;
        }
        AcresButtonColors acresButtonColors = (AcresButtonColors) other;
        return C5489q0.s(this.backgroundColor, acresButtonColors.backgroundColor) && C5489q0.s(this.contentColor, acresButtonColors.contentColor);
    }

    private AcresButtonColors(long j10, long j11) {
        this.backgroundColor = j10;
        this.contentColor = j11;
    }

    /* renamed from: a, reason: from getter */
    public final long getBackgroundColor() {
        return this.backgroundColor;
    }

    public int hashCode() {
        return (C5489q0.y(this.backgroundColor) * 31) + C5489q0.y(this.contentColor);
    }

    public String toString() {
        return "AcresButtonColors(backgroundColor=" + ((Object) C5489q0.z(this.backgroundColor)) + ", contentColor=" + ((Object) C5489q0.z(this.contentColor)) + ')';
    }

    public /* synthetic */ AcresButtonColors(long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? T.a.C3938f.f17380c.getColor() : j10, (i10 & 2) != 0 ? T.a.o0.f17399c.getColor() : j11, null);
    }
}
