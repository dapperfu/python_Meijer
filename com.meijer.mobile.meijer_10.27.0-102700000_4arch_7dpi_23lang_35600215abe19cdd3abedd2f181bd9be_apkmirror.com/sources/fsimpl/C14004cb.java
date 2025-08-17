package fsimpl;

import android.util.LruCache;
import java.util.Map;

/* renamed from: fsimpl.cb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C14004cb implements InterfaceC14005cc {

    /* renamed from: a, reason: collision with root package name */
    private final LruCache f131906a;

    C14004cb(LruCache lruCache) {
        this.f131906a = lruCache;
    }

    @Override // fsimpl.InterfaceC14005cc
    public Map a() {
        return this.f131906a.snapshot();
    }

    @Override // fsimpl.InterfaceC14005cc
    public int b() {
        return this.f131906a.putCount();
    }
}
