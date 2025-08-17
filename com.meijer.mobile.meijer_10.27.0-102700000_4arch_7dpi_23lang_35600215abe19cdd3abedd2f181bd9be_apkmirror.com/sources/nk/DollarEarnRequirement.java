package nk;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lnk/a;", "", "", "progress", "target", "<init>", "(FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()Ljava/lang/Float;", "setProgress", "(F)V", "b", "setTarget", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: nk.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class DollarEarnRequirement {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private float progress;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private float target;

    /* JADX WARN: Illegal instructions before constructor call */
    public DollarEarnRequirement() {
        float f10 = 0.0f;
        this(f10, f10, 3, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DollarEarnRequirement)) {
            return false;
        }
        DollarEarnRequirement dollarEarnRequirement = (DollarEarnRequirement) other;
        return Float.compare(this.progress, dollarEarnRequirement.progress) == 0 && Float.compare(this.target, dollarEarnRequirement.target) == 0;
    }

    public DollarEarnRequirement(float f10, float f11) {
        this.progress = f10;
        this.target = f11;
    }

    public Float a() {
        return Float.valueOf(this.progress);
    }

    public Float b() {
        return Float.valueOf(this.target);
    }

    public int hashCode() {
        return (Float.hashCode(this.progress) * 31) + Float.hashCode(this.target);
    }

    public String toString() {
        return "DollarEarnRequirement(progress=" + this.progress + ", target=" + this.target + ')';
    }

    public /* synthetic */ DollarEarnRequirement(float f10, float f11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 0.0f : f11);
    }
}
