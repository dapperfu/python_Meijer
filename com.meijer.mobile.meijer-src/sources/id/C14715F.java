package id;

import java.util.concurrent.Callable;

/* renamed from: id.F, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C14715F extends C14717H {

    /* renamed from: f, reason: collision with root package name */
    private final Callable f137513f;

    /* synthetic */ C14715F(Callable callable, C14716G c14716g) {
        super();
        this.f137513f = callable;
    }

    @Override // id.C14717H
    final String a() {
        try {
            return (String) this.f137513f.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
