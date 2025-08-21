package x8;

import android.os.SystemClock;
import i8.C14693B;
import i8.s;
import y7.InterfaceC18294a;

/* loaded from: classes4.dex */
public class h {

    private static class b implements InterfaceC18294a {

        /* renamed from: a, reason: collision with root package name */
        private final s f170642a;

        private b(s sVar) {
            this.f170642a = sVar;
        }

        @Override // y7.InterfaceC18294a
        public long a() {
            return this.f170642a.a() + SystemClock.elapsedRealtime();
        }
    }

    public InterfaceC18294a a() {
        return new b(C14693B.f137206b);
    }
}
