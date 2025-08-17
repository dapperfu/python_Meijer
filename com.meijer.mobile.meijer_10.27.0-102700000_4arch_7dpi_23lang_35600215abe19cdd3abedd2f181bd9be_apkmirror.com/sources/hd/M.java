package hd;

import android.os.Looper;

/* loaded from: classes4.dex */
public final class M extends C14399A {

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.api.d f134583c;

    public M(com.google.android.gms.common.api.d dVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f134583c = dVar;
    }

    @Override // com.google.android.gms.common.api.e
    public final Looper a() {
        return this.f134583c.getLooper();
    }
}
