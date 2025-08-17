package kotlin;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e\"\b\b\u0001\u0010\u000b*\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lc0/n0;", "T", "Lc0/B;", "", "durationMillis", "delay", "Lc0/C;", "easing", "<init>", "(IILc0/C;)V", "Lc0/q;", "V", "Lc0/o0;", "converter", "Lc0/D0;", "f", "(Lc0/o0;)Lc0/D0;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "getDurationMillis", "b", "getDelay", "c", "Lc0/C;", "getEasing", "()Lc0/C;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n0<T> implements InterfaceC6289B<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int durationMillis;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int delay;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6290C easing;

    public n0() {
        this(0, 0, null, 7, null);
    }

    public n0(int i10, int i11, InterfaceC6290C interfaceC6290C) {
        this.durationMillis = i10;
        this.delay = i11;
        this.easing = interfaceC6290C;
    }

    public boolean equals(Object other) {
        if (other instanceof n0) {
            n0 n0Var = (n0) other;
            if (n0Var.durationMillis == this.durationMillis && n0Var.delay == this.delay && Intrinsics.e(n0Var.easing, this.easing)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.InterfaceC6289B, kotlin.InterfaceC6326i
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public <V extends AbstractC6334q> D0<V> a(o0<T, V> converter) {
        return new D0<>(this.durationMillis, this.delay, this.easing);
    }

    public int hashCode() {
        return (((this.durationMillis * 31) + this.easing.hashCode()) * 31) + this.delay;
    }

    public /* synthetic */ n0(int i10, int i11, InterfaceC6290C interfaceC6290C, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? C6292E.c() : interfaceC6290C);
    }
}
