package ug;

import com.google.android.gms.common.internal.C6535q;
import java.util.concurrent.Executor;

/* renamed from: ug.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C17255b {

    /* renamed from: a, reason: collision with root package name */
    private final int f162922a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f162923b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f162924c;

    /* renamed from: ug.b$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f162925a = 0;

        /* renamed from: b, reason: collision with root package name */
        private boolean f162926b;

        /* renamed from: c, reason: collision with root package name */
        private Executor f162927c;

        public a b() {
            this.f162926b = true;
            return this;
        }

        public C17255b a() {
            return new C17255b(this.f162925a, this.f162926b, this.f162927c, null, null);
        }

        public a c(int i10, int... iArr) {
            this.f162925a = i10;
            if (iArr != null) {
                for (int i11 : iArr) {
                    this.f162925a = i11 | this.f162925a;
                }
            }
            return this;
        }
    }

    public final C17257d b() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17255b)) {
            return false;
        }
        C17255b c17255b = (C17255b) obj;
        return this.f162922a == c17255b.f162922a && this.f162923b == c17255b.f162923b && C6535q.a(this.f162924c, c17255b.f162924c) && C6535q.a(null, null);
    }

    public final int a() {
        return this.f162922a;
    }

    public final Executor c() {
        return this.f162924c;
    }

    public final boolean d() {
        return this.f162923b;
    }

    public int hashCode() {
        return C6535q.b(Integer.valueOf(this.f162922a), Boolean.valueOf(this.f162923b), this.f162924c, null);
    }

    /* synthetic */ C17255b(int i10, boolean z10, Executor executor, C17257d c17257d, C17258e c17258e) {
        this.f162922a = i10;
        this.f162923b = z10;
        this.f162924c = executor;
    }
}
