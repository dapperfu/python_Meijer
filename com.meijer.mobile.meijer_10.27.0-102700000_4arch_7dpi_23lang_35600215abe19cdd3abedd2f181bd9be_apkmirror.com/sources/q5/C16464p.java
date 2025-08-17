package q5;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Lq5/p;", "", "", "addLastModifiedToFileCacheKey", "networkObserverEnabled", "respectCacheHeaders", "", "bitmapFactoryMaxParallelism", "Lc5/m;", "bitmapFactoryExifOrientationPolicy", "<init>", "(ZZZILc5/m;)V", "a", "(ZZZILc5/m;)Lq5/p;", "Z", "c", "()Z", "b", "f", "g", "d", "I", "e", "()I", "Lc5/m;", "()Lc5/m;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: q5.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16464p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean addLastModifiedToFileCacheKey;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean networkObserverEnabled;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean respectCacheHeaders;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int bitmapFactoryMaxParallelism;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c5.m bitmapFactoryExifOrientationPolicy;

    public C16464p(boolean z10, boolean z11, boolean z12, int i10, c5.m mVar) {
        this.addLastModifiedToFileCacheKey = z10;
        this.networkObserverEnabled = z11;
        this.respectCacheHeaders = z12;
        this.bitmapFactoryMaxParallelism = i10;
        this.bitmapFactoryExifOrientationPolicy = mVar;
    }

    public static /* synthetic */ C16464p b(C16464p c16464p, boolean z10, boolean z11, boolean z12, int i10, c5.m mVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = c16464p.addLastModifiedToFileCacheKey;
        }
        if ((i11 & 2) != 0) {
            z11 = c16464p.networkObserverEnabled;
        }
        if ((i11 & 4) != 0) {
            z12 = c16464p.respectCacheHeaders;
        }
        if ((i11 & 8) != 0) {
            i10 = c16464p.bitmapFactoryMaxParallelism;
        }
        if ((i11 & 16) != 0) {
            mVar = c16464p.bitmapFactoryExifOrientationPolicy;
        }
        c5.m mVar2 = mVar;
        boolean z13 = z12;
        return c16464p.a(z10, z11, z13, i10, mVar2);
    }

    public final C16464p a(boolean addLastModifiedToFileCacheKey, boolean networkObserverEnabled, boolean respectCacheHeaders, int bitmapFactoryMaxParallelism, c5.m bitmapFactoryExifOrientationPolicy) {
        return new C16464p(addLastModifiedToFileCacheKey, networkObserverEnabled, respectCacheHeaders, bitmapFactoryMaxParallelism, bitmapFactoryExifOrientationPolicy);
    }

    /* renamed from: c, reason: from getter */
    public final boolean getAddLastModifiedToFileCacheKey() {
        return this.addLastModifiedToFileCacheKey;
    }

    /* renamed from: d, reason: from getter */
    public final c5.m getBitmapFactoryExifOrientationPolicy() {
        return this.bitmapFactoryExifOrientationPolicy;
    }

    /* renamed from: e, reason: from getter */
    public final int getBitmapFactoryMaxParallelism() {
        return this.bitmapFactoryMaxParallelism;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getNetworkObserverEnabled() {
        return this.networkObserverEnabled;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getRespectCacheHeaders() {
        return this.respectCacheHeaders;
    }

    public /* synthetic */ C16464p(boolean z10, boolean z11, boolean z12, int i10, c5.m mVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z10, (i11 & 2) != 0 ? true : z11, (i11 & 4) != 0 ? true : z12, (i11 & 8) != 0 ? 4 : i10, (i11 & 16) != 0 ? c5.m.f61494b : mVar);
    }
}
