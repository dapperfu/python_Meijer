package sg;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
import sg.C16956a;

/* renamed from: sg.s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C16974s extends PhantomReference implements C16956a.InterfaceC2503a {

    /* renamed from: a, reason: collision with root package name */
    private final Set f160512a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f160513b;

    @Override // sg.C16956a.InterfaceC2503a
    public final void a() {
        if (this.f160512a.remove(this)) {
            clear();
            this.f160513b.run();
        }
    }

    /* synthetic */ C16974s(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, C16973r c16973r) {
        super(obj, referenceQueue);
        this.f160512a = set;
        this.f160513b = runnable;
    }
}
