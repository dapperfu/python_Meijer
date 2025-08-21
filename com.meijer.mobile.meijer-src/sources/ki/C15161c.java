package ki;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\n\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lki/c;", "", "LKi/T;", "checkedEnabledColor", "uncheckedEnabledColor", "checkmarkColor", "disabledColor", "<init>", "(LKi/T;LKi/T;LKi/T;LKi/T;)V", "a", "LKi/T;", "()LKi/T;", "b", "d", "c", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ki.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C15161c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ki.T checkedEnabledColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ki.T uncheckedEnabledColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Ki.T checkmarkColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Ki.T disabledColor;

    public C15161c(Ki.T checkedEnabledColor, Ki.T uncheckedEnabledColor, Ki.T checkmarkColor, Ki.T disabledColor) {
        Intrinsics.j(checkedEnabledColor, "checkedEnabledColor");
        Intrinsics.j(uncheckedEnabledColor, "uncheckedEnabledColor");
        Intrinsics.j(checkmarkColor, "checkmarkColor");
        Intrinsics.j(disabledColor, "disabledColor");
        this.checkedEnabledColor = checkedEnabledColor;
        this.uncheckedEnabledColor = uncheckedEnabledColor;
        this.checkmarkColor = checkmarkColor;
        this.disabledColor = disabledColor;
    }

    /* renamed from: a, reason: from getter */
    public final Ki.T getCheckedEnabledColor() {
        return this.checkedEnabledColor;
    }

    /* renamed from: b, reason: from getter */
    public final Ki.T getCheckmarkColor() {
        return this.checkmarkColor;
    }

    /* renamed from: c, reason: from getter */
    public final Ki.T getDisabledColor() {
        return this.disabledColor;
    }

    /* renamed from: d, reason: from getter */
    public final Ki.T getUncheckedEnabledColor() {
        return this.uncheckedEnabledColor;
    }
}
