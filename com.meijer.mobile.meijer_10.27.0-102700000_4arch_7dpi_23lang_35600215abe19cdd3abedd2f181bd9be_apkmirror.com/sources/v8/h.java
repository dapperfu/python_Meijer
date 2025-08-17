package v8;

import android.os.SystemClock;
import g8.C14217B;
import g8.s;
import w7.InterfaceC17801a;

/* loaded from: classes4.dex */
public class h {

    private static class b implements InterfaceC17801a {

        /* renamed from: a, reason: collision with root package name */
        private final s f164606a;

        private b(s sVar) {
            this.f164606a = sVar;
        }

        @Override // w7.InterfaceC17801a
        public long a() {
            return this.f164606a.a() + SystemClock.elapsedRealtime();
        }
    }

    public InterfaceC17801a a() {
        return new b(C14217B.f132990b);
    }
}
