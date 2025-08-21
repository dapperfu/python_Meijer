package ug;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
import ug.C17403a;

/* renamed from: ug.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C17421s extends PhantomReference implements C17403a.InterfaceC2596a {

    /* renamed from: a, reason: collision with root package name */
    private final Set f163998a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f163999b;

    @Override // ug.C17403a.InterfaceC2596a
    public final void a() {
        if (this.f163998a.remove(this)) {
            clear();
            this.f163999b.run();
        }
    }

    /* synthetic */ C17421s(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, C17420r c17420r) {
        super(obj, referenceQueue);
        this.f163998a = set;
        this.f163999b = runnable;
    }
}
