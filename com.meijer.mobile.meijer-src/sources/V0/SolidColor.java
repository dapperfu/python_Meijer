package V0;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"LV0/E1;", "LV0/i0;", "LV0/q0;", "value", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "LU0/k;", "size", "LV0/o1;", "p", "", "alpha", "", "a", "(JLV0/o1;F)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "c", "J", "b", "()J", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: V0.E1, reason: from toString */
/* loaded from: classes.dex */
public final class SolidColor extends AbstractC5467i0 {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long value;

    public /* synthetic */ SolidColor(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SolidColor) && C5489q0.s(this.value, ((SolidColor) other).value);
    }

    private SolidColor(long j10) {
        super(null);
        this.value = j10;
    }

    @Override // V0.AbstractC5467i0
    public void a(long size, o1 p10, float alpha) {
        long jQ;
        p10.d(1.0f);
        if (alpha == 1.0f) {
            jQ = this.value;
        } else {
            long j10 = this.value;
            jQ = C5489q0.q(j10, C5489q0.t(j10) * alpha, 0.0f, 0.0f, 0.0f, 14, null);
        }
        p10.x(jQ);
        if (p10.E() != null) {
            p10.D(null);
        }
    }

    /* renamed from: b, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return C5489q0.y(this.value);
    }

    public String toString() {
        return "SolidColor(value=" + ((Object) C5489q0.z(this.value)) + ')';
    }
}
