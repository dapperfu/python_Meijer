package J0;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\u0005¨\u0006\r"}, d2 = {"LJ0/d;", "", "", "element", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "a", "I", "()I", "b", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: J0.d, reason: from toString */
/* loaded from: classes.dex */
public final class IntRef {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int element;

    public IntRef() {
        this(0, 1, null);
    }

    public IntRef(int i10) {
        this.element = i10;
    }

    /* renamed from: a, reason: from getter */
    public final int getElement() {
        return this.element;
    }

    public final void b(int i10) {
        this.element = i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("IntRef(element = ");
        sb2.append(this.element);
        sb2.append(")@");
        String string = Integer.toString(hashCode(), CharsKt.a(16));
        Intrinsics.i(string, "toString(...)");
        sb2.append(string);
        return sb2.toString();
    }

    public /* synthetic */ IntRef(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
