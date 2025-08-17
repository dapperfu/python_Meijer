package sg;

import java.util.concurrent.Executor;

/* renamed from: sg.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C16959d {

    /* renamed from: a, reason: collision with root package name */
    private final If.b f160453a;

    public Executor a(Executor executor) {
        return executor != null ? executor : (Executor) this.f160453a.get();
    }

    public C16959d(If.b bVar) {
        this.f160453a = bVar;
    }
}
