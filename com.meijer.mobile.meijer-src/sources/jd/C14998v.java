package jd;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: jd.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C14998v implements g.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BasePendingResult f140401a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C15000x f140402b;

    C14998v(C15000x c15000x, BasePendingResult basePendingResult) {
        this.f140402b = c15000x;
        this.f140401a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.g.a
    public final void a(Status status) {
        this.f140402b.f140405a.remove(this.f140401a);
    }
}
