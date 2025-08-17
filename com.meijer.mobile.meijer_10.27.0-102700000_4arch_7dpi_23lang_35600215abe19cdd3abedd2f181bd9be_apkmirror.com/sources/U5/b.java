package U5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"LU5/b;", "LU5/n;", "LV5/c;", "settings", "LV5/a;", "eventListener", "<init>", "(LV5/c;LV5/a;)V", "c", "LV5/c;", "d", "()LV5/c;", "LV5/a;", "()LV5/a;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends n<b> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final V5.c settings;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final V5.a eventListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(V5.c settings, V5.a eventListener) {
        super(eventListener, null);
        Intrinsics.j(settings, "settings");
        Intrinsics.j(eventListener, "eventListener");
        this.settings = settings;
        this.eventListener = eventListener;
    }

    /* renamed from: c, reason: from getter */
    public final V5.a getEventListener() {
        return this.eventListener;
    }

    /* renamed from: d, reason: from getter */
    public final V5.c getSettings() {
        return this.settings;
    }
}
