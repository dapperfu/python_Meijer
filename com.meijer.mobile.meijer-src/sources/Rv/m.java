package Rv;

import Rv.v;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"LRv/m;", "LRv/v;", "LRv/r;", "delegate", "<init>", "(LRv/r;)V", "LRv/v$b;", "e", "()LRv/v$b;", "", "isCanceled", "()Z", "LRv/p;", "failedConnection", "c", "(LRv/p;)Z", "Lokhttp3/HttpUrl;", "url", "f", "(Lokhttp3/HttpUrl;)Z", "a", "LRv/r;", "Lokhttp3/a;", "b", "()Lokhttp3/a;", PlaceTypes.ADDRESS, "Lkotlin/collections/ArrayDeque;", "d", "()Lkotlin/collections/ArrayDeque;", "deferredPlans", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class m implements v {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r delegate;

    public m(r delegate) {
        Intrinsics.j(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // Rv.v
    /* renamed from: b */
    public okhttp3.a getAddress() {
        return this.delegate.getAddress();
    }

    @Override // Rv.v
    public boolean c(p failedConnection) {
        return this.delegate.c(failedConnection);
    }

    @Override // Rv.v
    public ArrayDeque<v.b> d() {
        return this.delegate.d();
    }

    @Override // Rv.v
    public v.b e() {
        return this.delegate.h();
    }

    @Override // Rv.v
    public boolean f(HttpUrl url) {
        Intrinsics.j(url, "url");
        return this.delegate.f(url);
    }

    @Override // Rv.v
    public boolean isCanceled() {
        return this.delegate.isCanceled();
    }
}
