package hd;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: hd.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C14420v implements g.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BasePendingResult f134712a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C14422x f134713b;

    C14420v(C14422x c14422x, BasePendingResult basePendingResult) {
        this.f134713b = c14422x;
        this.f134712a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.g.a
    public final void a(Status status) {
        this.f134713b.f134716a.remove(this.f134712a);
    }
}
