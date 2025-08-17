package nd;

import Td.C5233k;
import com.google.android.gms.common.api.Status;
import hd.C14410k;
import hd.C14418t;
import java.util.concurrent.atomic.AtomicReference;
import md.C15601g;
import md.InterfaceC15595a;

/* loaded from: classes4.dex */
final class t extends b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f151205a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5233k f151206b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC15595a f151207c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ v f151208d;

    t(v vVar, AtomicReference atomicReference, C5233k c5233k, InterfaceC15595a interfaceC15595a) {
        this.f151208d = vVar;
        this.f151205a = atomicReference;
        this.f151206b = c5233k;
        this.f151207c = interfaceC15595a;
    }

    @Override // nd.b, nd.h
    public final void S3(Status status, C15601g c15601g) {
        if (c15601g != null) {
            this.f151205a.set(c15601g);
        }
        C14418t.c(status, null, this.f151206b);
        if (!status.d1() || (c15601g != null && c15601g.T())) {
            this.f151208d.doUnregisterEventListener(C14410k.c(this.f151207c, InterfaceC15595a.class.getSimpleName()), 27306);
        }
    }
}
