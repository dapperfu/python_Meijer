package kl;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lkl/a;", "", "", "percent", "", "value", "<init>", "(ZD)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "D", "()D", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kl.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class Tip {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean percent;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double value;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Tip)) {
            return false;
        }
        Tip tip = (Tip) other;
        return this.percent == tip.percent && Double.compare(this.value, tip.value) == 0;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getPercent() {
        return this.percent;
    }

    /* renamed from: b, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.percent) * 31) + Double.hashCode(this.value);
    }

    public String toString() {
        return "Tip(percent=" + this.percent + ", value=" + this.value + ')';
    }

    public Tip(boolean z10, double d10) {
        this.percent = z10;
        this.value = d10;
    }
}
