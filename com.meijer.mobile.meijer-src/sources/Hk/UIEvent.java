package Hk;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00018\u00008G¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R.\u0010\u0017\u001a\u0004\u0018\u00018\u00002\b\u0010\u0017\u001a\u0004\u0018\u00018\u00008F@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013\"\u0004\b\u0019\u0010\u0005¨\u0006\u001a"}, d2 = {"LHk/a;", "T", "", "initialValue", "<init>", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getInitialValue", "()Ljava/lang/Object;", "b", "Z", "consumed", "value", "c", "setValue", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Hk.a, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class UIEvent<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final T initialValue;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean consumed;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private T value;

    /* JADX WARN: Illegal instructions before constructor call */
    public UIEvent() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        this(defaultConstructorMarker, 1, defaultConstructorMarker);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UIEvent) && Intrinsics.e(this.initialValue, ((UIEvent) other).initialValue);
    }

    public UIEvent(T t10) {
        this.initialValue = t10;
        this.value = t10;
    }

    public final T a() {
        if (this.consumed) {
            return null;
        }
        this.consumed = true;
        return this.value;
    }

    public int hashCode() {
        T t10 = this.initialValue;
        if (t10 == null) {
            return 0;
        }
        return t10.hashCode();
    }

    public String toString() {
        return "UIEvent(initialValue=" + this.initialValue + ')';
    }

    public /* synthetic */ UIEvent(Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : obj);
    }
}
