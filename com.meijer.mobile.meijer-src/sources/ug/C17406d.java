package ug;

import java.util.concurrent.Executor;

/* renamed from: ug.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C17406d {

    /* renamed from: a, reason: collision with root package name */
    private final Kf.b f163939a;

    public Executor a(Executor executor) {
        return executor != null ? executor : (Executor) this.f163939a.get();
    }

    public C17406d(Kf.b bVar) {
        this.f163939a = bVar;
    }
}
