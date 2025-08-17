package x3;

import U3.r;
import android.net.Uri;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f169254a = new u() { // from class: x3.t
        @Override // x3.u
        public final InterfaceC18011p[] f() {
            return u.e();
        }
    };

    static /* synthetic */ InterfaceC18011p[] e() {
        return new InterfaceC18011p[0];
    }

    default u a(r.a aVar) {
        return this;
    }

    default u b(int i10) {
        return this;
    }

    @Deprecated
    default u c(boolean z10) {
        return this;
    }

    InterfaceC18011p[] f();

    default InterfaceC18011p[] d(Uri uri, Map<String, List<String>> map) {
        return f();
    }
}
