package androidx.media3.common;

import a3.F;

/* loaded from: classes.dex */
public final class IllegalSeekPositionException extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    public final F f55547a;

    /* renamed from: b, reason: collision with root package name */
    public final int f55548b;

    /* renamed from: c, reason: collision with root package name */
    public final long f55549c;

    public IllegalSeekPositionException(F f10, int i10, long j10) {
        this.f55547a = f10;
        this.f55548b = i10;
        this.f55549c = j10;
    }
}
