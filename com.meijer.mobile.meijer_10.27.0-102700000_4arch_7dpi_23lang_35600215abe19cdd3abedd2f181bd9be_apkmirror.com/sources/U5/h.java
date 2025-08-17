package U5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR*\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0006@@X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010\u0011\u001a\u0004\b\b\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"LU5/h;", "LU5/n;", "LY5/d;", "settings", "LY5/b;", "eventListener", "<init>", "(LY5/d;LY5/b;)V", "c", "LY5/d;", "e", "()LY5/d;", "d", "LY5/b;", "()LY5/b;", "LY5/a;", "<set-?>", "LY5/a;", "()LY5/a;", "f", "(LY5/a;)V", "eventHandler", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends n<h> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Y5.d settings;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Y5.b eventListener;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public Y5.a eventHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Y5.d settings, Y5.b eventListener) {
        super(eventListener, null);
        Intrinsics.j(settings, "settings");
        Intrinsics.j(eventListener, "eventListener");
        this.settings = settings;
        this.eventListener = eventListener;
    }

    public final Y5.a c() {
        Y5.a aVar = this.eventHandler;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.y("eventHandler");
        return null;
    }

    /* renamed from: d, reason: from getter */
    public final Y5.b getEventListener() {
        return this.eventListener;
    }

    /* renamed from: e, reason: from getter */
    public final Y5.d getSettings() {
        return this.settings;
    }

    public final void f(Y5.a aVar) {
        Intrinsics.j(aVar, "<set-?>");
        this.eventHandler = aVar;
    }
}
