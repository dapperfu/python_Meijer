package fsimpl;

import android.util.LruCache;
import java.util.Map;

/* renamed from: fsimpl.cb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C14129cb implements InterfaceC14130cc {

    /* renamed from: a, reason: collision with root package name */
    private final LruCache f133156a;

    C14129cb(LruCache lruCache) {
        this.f133156a = lruCache;
    }

    @Override // fsimpl.InterfaceC14130cc
    public Map a() {
        return this.f133156a.snapshot();
    }

    @Override // fsimpl.InterfaceC14130cc
    public int b() {
        return this.f133156a.putCount();
    }
}
