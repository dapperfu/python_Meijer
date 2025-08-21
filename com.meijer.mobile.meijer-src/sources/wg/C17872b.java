package wg;

import com.google.android.gms.common.internal.C6660q;
import java.util.concurrent.Executor;

/* renamed from: wg.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C17872b {

    /* renamed from: a, reason: collision with root package name */
    private final int f167131a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f167132b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f167133c;

    /* renamed from: wg.b$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f167134a = 0;

        /* renamed from: b, reason: collision with root package name */
        private boolean f167135b;

        /* renamed from: c, reason: collision with root package name */
        private Executor f167136c;

        public a b() {
            this.f167135b = true;
            return this;
        }

        public C17872b a() {
            return new C17872b(this.f167134a, this.f167135b, this.f167136c, null, null);
        }

        public a c(int i10, int... iArr) {
            this.f167134a = i10;
            if (iArr != null) {
                for (int i11 : iArr) {
                    this.f167134a = i11 | this.f167134a;
                }
            }
            return this;
        }
    }

    public final C17874d b() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17872b)) {
            return false;
        }
        C17872b c17872b = (C17872b) obj;
        return this.f167131a == c17872b.f167131a && this.f167132b == c17872b.f167132b && C6660q.a(this.f167133c, c17872b.f167133c) && C6660q.a(null, null);
    }

    public final int a() {
        return this.f167131a;
    }

    public final Executor c() {
        return this.f167133c;
    }

    public final boolean d() {
        return this.f167132b;
    }

    public int hashCode() {
        return C6660q.b(Integer.valueOf(this.f167131a), Boolean.valueOf(this.f167132b), this.f167133c, null);
    }

    /* synthetic */ C17872b(int i10, boolean z10, Executor executor, C17874d c17874d, C17875e c17875e) {
        this.f167131a = i10;
        this.f167132b = z10;
        this.f167133c = executor;
    }
}
