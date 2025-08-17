package kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00028\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r\"\u0004\b\u000e\u0010\u000f\u0082\u0001\u0001\u0010¨\u0006\u0011"}, d2 = {"Lc0/P;", "T", "", "value", "Lc0/C;", "easing", "<init>", "(Ljava/lang/Object;Lc0/C;)V", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "Lc0/C;", "()Lc0/C;", "c", "(Lc0/C;)V", "Lc0/Q$a;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: c0.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6303P<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T value;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private InterfaceC6290C easing;

    public /* synthetic */ AbstractC6303P(Object obj, InterfaceC6290C interfaceC6290C, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, interfaceC6290C);
    }

    private AbstractC6303P(T t10, InterfaceC6290C interfaceC6290C) {
        this.value = t10;
        this.easing = interfaceC6290C;
    }

    /* renamed from: a, reason: from getter */
    public final InterfaceC6290C getEasing() {
        return this.easing;
    }

    public final T b() {
        return this.value;
    }

    public final void c(InterfaceC6290C interfaceC6290C) {
        this.easing = interfaceC6290C;
    }
}
