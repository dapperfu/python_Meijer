package Gu;

import Gu.i;

/* loaded from: classes8.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static final i f13252a = i.a(i.a.NO_PROPAGATION);

    /* renamed from: b, reason: collision with root package name */
    private static final i f13253b = i.a(i.a.UNLIMITED_PROPAGATION);

    public abstract f a();

    public abstract g b(h hVar, j jVar, i iVar);

    public final g c(h hVar, j jVar) {
        return b(hVar, jVar, f13252a);
    }
}
