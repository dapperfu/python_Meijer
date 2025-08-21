package g1;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lg1/S;", "Lkotlin/Function1;", "", "", "<init>", "()V", "disallowIntercept", "a", "(Z)V", "Lg1/K;", "Lg1/K;", "getPointerInteropFilter$ui_release", "()Lg1/K;", "b", "(Lg1/K;)V", "pointerInteropFilter", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class S implements Function1<Boolean, Unit> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private K pointerInteropFilter;

    public void a(boolean disallowIntercept) {
        K k10 = this.pointerInteropFilter;
        if (k10 == null) {
            return;
        }
        k10.k(disallowIntercept);
    }

    public final void b(K k10) {
        this.pointerInteropFilter = k10;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        a(bool.booleanValue());
        return Unit.f143329a;
    }
}
