package at;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bR&\u0010\u0004\u001a\u0014\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00030\u00030\fj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0010"}, d2 = {"Lat/b;", "", "", "Lat/c;", "eventHandlers", "<init>", "(Ljava/util/List;)V", "Lat/a;", "event", "", "a", "(Lat/a;)V", "Ljava/util/ArrayList;", "kotlin.jvm.PlatformType", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: at.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C6295b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<c> eventHandlers;

    public C6295b(List<? extends c> eventHandlers) {
        Intrinsics.j(eventHandlers, "eventHandlers");
        this.eventHandlers = new ArrayList<>(eventHandlers);
    }

    public final void a(InterfaceC6294a event) {
        Intrinsics.j(event, "event");
        Iterator<c> it = this.eventHandlers.iterator();
        Intrinsics.i(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().a(event);
        }
    }
}
