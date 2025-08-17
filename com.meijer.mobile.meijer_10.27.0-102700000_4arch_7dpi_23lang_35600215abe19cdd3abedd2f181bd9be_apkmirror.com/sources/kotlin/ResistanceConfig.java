package kotlin;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Deprecated
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, d2 = {"Lx0/V0;", "", "", "basis", "factorAtMin", "factorAtMax", "<init>", "(FFF)V", "overflow", "a", "(F)F", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "F", "getBasis", "()F", "b", "getFactorAtMin", "c", "getFactorAtMax", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.V0, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final class ResistanceConfig {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float basis;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float factorAtMin;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float factorAtMax;

    public final float a(float overflow) {
        float f10 = overflow < 0.0f ? this.factorAtMin : this.factorAtMax;
        if (f10 == 0.0f) {
            return 0.0f;
        }
        float f11 = this.basis;
        float f12 = overflow / f11;
        if (f12 < -1.0f) {
            f12 = -1.0f;
        }
        if (f12 > 1.0f) {
            f12 = 1.0f;
        }
        return (f11 / f10) * ((float) Math.sin((f12 * 3.1415927f) / 2));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResistanceConfig)) {
            return false;
        }
        ResistanceConfig resistanceConfig = (ResistanceConfig) other;
        return this.basis == resistanceConfig.basis && this.factorAtMin == resistanceConfig.factorAtMin && this.factorAtMax == resistanceConfig.factorAtMax;
    }

    public int hashCode() {
        return (((Float.hashCode(this.basis) * 31) + Float.hashCode(this.factorAtMin)) * 31) + Float.hashCode(this.factorAtMax);
    }

    public String toString() {
        return "ResistanceConfig(basis=" + this.basis + ", factorAtMin=" + this.factorAtMin + ", factorAtMax=" + this.factorAtMax + ')';
    }

    public ResistanceConfig(float f10, float f11, float f12) {
        this.basis = f10;
        this.factorAtMin = f11;
        this.factorAtMax = f12;
    }
}
