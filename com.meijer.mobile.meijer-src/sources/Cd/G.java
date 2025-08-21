package Cd;

import Vd.C5517k;
import com.google.android.gms.common.api.Status;
import jd.C14996t;
import jd.InterfaceC14983f;

/* loaded from: classes6.dex */
final class G extends InterfaceC14983f.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f4194a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5517k f4195b;

    G(Object obj, C5517k c5517k) {
        this.f4194a = obj;
        this.f4195b = c5517k;
    }

    @Override // jd.InterfaceC14983f
    public final void v6(Status status) {
        C14996t.b(status, this.f4194a, this.f4195b);
    }
}
