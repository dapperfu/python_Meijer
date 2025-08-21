package pc;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u001c\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\n\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lpc/e;", "", "", "mainAxisMin", "mainAxisMax", "crossAxisMin", "crossAxisMax", "<init>", "(IIII)V", "LH1/b;", "c", "Lpc/c;", "orientation", "(JLpc/c;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "d", "getCrossAxisMax", "flowlayout_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: pc.e, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class OrientationIndependentConstraints {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int mainAxisMin;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int mainAxisMax;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int crossAxisMin;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int crossAxisMax;

    public /* synthetic */ OrientationIndependentConstraints(long j10, c cVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, cVar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrientationIndependentConstraints)) {
            return false;
        }
        OrientationIndependentConstraints orientationIndependentConstraints = (OrientationIndependentConstraints) other;
        return this.mainAxisMin == orientationIndependentConstraints.mainAxisMin && this.mainAxisMax == orientationIndependentConstraints.mainAxisMax && this.crossAxisMin == orientationIndependentConstraints.crossAxisMin && this.crossAxisMax == orientationIndependentConstraints.crossAxisMax;
    }

    public OrientationIndependentConstraints(int i10, int i11, int i12, int i13) {
        this.mainAxisMin = i10;
        this.mainAxisMax = i11;
        this.crossAxisMin = i12;
        this.crossAxisMax = i13;
    }

    /* renamed from: a, reason: from getter */
    public final int getCrossAxisMin() {
        return this.crossAxisMin;
    }

    /* renamed from: b, reason: from getter */
    public final int getMainAxisMax() {
        return this.mainAxisMax;
    }

    /* renamed from: c, reason: from getter */
    public final int getMainAxisMin() {
        return this.mainAxisMin;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mainAxisMin) * 31) + Integer.hashCode(this.mainAxisMax)) * 31) + Integer.hashCode(this.crossAxisMin)) * 31) + Integer.hashCode(this.crossAxisMax);
    }

    public String toString() {
        return "OrientationIndependentConstraints(mainAxisMin=" + this.mainAxisMin + ", mainAxisMax=" + this.mainAxisMax + ", crossAxisMin=" + this.crossAxisMin + ", crossAxisMax=" + this.crossAxisMax + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private OrientationIndependentConstraints(long j10, c cVar) {
        c cVar2 = c.Horizontal;
        this(cVar == cVar2 ? H1.b.n(j10) : H1.b.m(j10), cVar == cVar2 ? H1.b.l(j10) : H1.b.k(j10), cVar == cVar2 ? H1.b.m(j10) : H1.b.n(j10), cVar == cVar2 ? H1.b.k(j10) : H1.b.l(j10));
    }
}
