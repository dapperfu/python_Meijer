package V5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\rR*\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@@X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0010\u0010\u0014¨\u0006\u0016"}, d2 = {"LV5/j;", "LV5/n;", "Lb6/f;", "settings", "Lb6/d;", "eventListener", "<init>", "(Lb6/f;Lb6/d;)V", "c", "Lb6/f;", "d", "()Lb6/f;", "Lb6/d;", "()Lb6/d;", "Lb6/c;", "<set-?>", "e", "Lb6/c;", "getEventHandler", "()Lb6/c;", "(Lb6/c;)V", "eventHandler", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends n<j> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b6.f settings;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b6.d eventListener;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public b6.c eventHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b6.f settings, b6.d eventListener) {
        super(eventListener, null);
        Intrinsics.j(settings, "settings");
        Intrinsics.j(eventListener, "eventListener");
        this.settings = settings;
        this.eventListener = eventListener;
    }

    /* renamed from: c, reason: from getter */
    public final b6.d getEventListener() {
        return this.eventListener;
    }

    /* renamed from: d, reason: from getter */
    public final b6.f getSettings() {
        return this.settings;
    }

    public final void e(b6.c cVar) {
        Intrinsics.j(cVar, "<set-?>");
        this.eventHandler = cVar;
    }
}
