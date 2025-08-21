package F1;

import V0.AbstractC5467i0;
import V0.C5489q0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00028VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0014R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"LF1/d;", "LF1/n;", "LV0/q0;", "value", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "J", "getValue-0d7_KjU", "()J", "color", "LV0/i0;", "getBrush", "()LV0/i0;", "brush", "", "a", "()F", "alpha", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: F1.d, reason: from toString */
/* loaded from: classes.dex */
final /* data */ class ColorStyle implements n {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long value;

    public /* synthetic */ ColorStyle(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ColorStyle) && C5489q0.s(this.value, ((ColorStyle) other).value);
    }

    @Override // F1.n
    public AbstractC5467i0 getBrush() {
        return null;
    }

    private ColorStyle(long j10) {
        this.value = j10;
        if (j10 != 16) {
            return;
        }
        A1.a.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // F1.n
    /* renamed from: b, reason: from getter */
    public long getValue() {
        return this.value;
    }

    public int hashCode() {
        return C5489q0.y(this.value);
    }

    public String toString() {
        return "ColorStyle(value=" + ((Object) C5489q0.z(this.value)) + ')';
    }

    @Override // F1.n
    public float a() {
        return C5489q0.t(getValue());
    }
}
