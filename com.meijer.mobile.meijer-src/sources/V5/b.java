package V5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"LV5/b;", "LV5/n;", "LW5/c;", "settings", "LW5/a;", "eventListener", "<init>", "(LW5/c;LW5/a;)V", "c", "LW5/c;", "d", "()LW5/c;", "LW5/a;", "()LW5/a;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends n<b> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final W5.c settings;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final W5.a eventListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(W5.c settings, W5.a eventListener) {
        super(eventListener, null);
        Intrinsics.j(settings, "settings");
        Intrinsics.j(eventListener, "eventListener");
        this.settings = settings;
        this.eventListener = eventListener;
    }

    /* renamed from: c, reason: from getter */
    public final W5.a getEventListener() {
        return this.eventListener;
    }

    /* renamed from: d, reason: from getter */
    public final W5.c getSettings() {
        return this.settings;
    }
}
