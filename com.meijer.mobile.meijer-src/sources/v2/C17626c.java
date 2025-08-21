package v2;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003R$\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000bj\b\u0012\u0004\u0012\u00020\u0004`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u000f"}, d2 = {"Lv2/c;", "", "<init>", "()V", "Lv2/b;", "listener", "", "a", "(Lv2/b;)V", "c", "b", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "listeners", "customview-poolingcontainer_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* renamed from: v2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17626c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<InterfaceC17625b> listeners = new ArrayList<>();

    public final void a(InterfaceC17625b listener) {
        Intrinsics.j(listener, "listener");
        this.listeners.add(listener);
    }

    public final void b() {
        for (int iO = CollectionsKt.o(this.listeners); -1 < iO; iO--) {
            this.listeners.get(iO).b();
        }
    }

    public final void c(InterfaceC17625b listener) {
        Intrinsics.j(listener, "listener");
        this.listeners.remove(listener);
    }
}
