package Tf;

import com.google.firebase.perf.application.a;

/* loaded from: classes8.dex */
public final class e implements a.InterfaceC1293a {

    /* renamed from: a, reason: collision with root package name */
    private static final Wf.a f36216a = Wf.a.e();

    @Override // com.google.firebase.perf.application.a.InterfaceC1293a
    public void a() {
        try {
            d.c();
        } catch (IllegalStateException e10) {
            f36216a.k("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e10);
        }
    }
}
