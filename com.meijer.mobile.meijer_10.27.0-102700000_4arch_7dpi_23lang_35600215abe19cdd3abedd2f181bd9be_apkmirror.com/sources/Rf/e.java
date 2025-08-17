package Rf;

import com.google.firebase.perf.application.a;

/* loaded from: classes7.dex */
public final class e implements a.InterfaceC1284a {

    /* renamed from: a, reason: collision with root package name */
    private static final Uf.a f32216a = Uf.a.e();

    @Override // com.google.firebase.perf.application.a.InterfaceC1284a
    public void a() {
        try {
            d.c();
        } catch (IllegalStateException e10) {
            f32216a.k("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e10);
        }
    }
}
