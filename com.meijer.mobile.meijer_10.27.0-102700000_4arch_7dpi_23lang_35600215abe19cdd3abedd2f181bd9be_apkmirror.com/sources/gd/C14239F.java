package gd;

import java.util.concurrent.Callable;

/* renamed from: gd.F, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C14239F extends C14241H {

    /* renamed from: f, reason: collision with root package name */
    private final Callable f133297f;

    /* synthetic */ C14239F(Callable callable, C14240G c14240g) {
        super();
        this.f133297f = callable;
    }

    @Override // gd.C14241H
    final String a() {
        try {
            return (String) this.f133297f.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
