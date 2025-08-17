package Xd;

import android.accounts.Account;
import android.app.Activity;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.C6535q;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a<a> f39266a;

    /* renamed from: b, reason: collision with root package name */
    private static final a.g f39267b;

    /* renamed from: c, reason: collision with root package name */
    private static final a.AbstractC1257a f39268c;

    /* renamed from: d, reason: collision with root package name */
    public static final Zd.i f39269d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Id.s f39270e;

    /* renamed from: f, reason: collision with root package name */
    public static final Id.w f39271f;

    public static final class a implements a.d.InterfaceC1258a {

        /* renamed from: b, reason: collision with root package name */
        public final int f39272b;

        /* renamed from: c, reason: collision with root package name */
        public final int f39273c;

        /* renamed from: d, reason: collision with root package name */
        public final Account f39274d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f39275e;

        /* renamed from: Xd.l$a$a, reason: collision with other inner class name */
        public static final class C0844a {

            /* renamed from: a, reason: collision with root package name */
            private int f39276a = 3;

            /* renamed from: b, reason: collision with root package name */
            private int f39277b = 1;

            /* renamed from: c, reason: collision with root package name */
            private boolean f39278c = true;

            public a a() {
                return new a(this);
            }

            public C0844a b(int i10) {
                if (i10 != 0) {
                    if (i10 == 0) {
                        i10 = 0;
                    } else if (i10 != 2 && i10 != 1 && i10 != 23 && i10 != 3) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", Integer.valueOf(i10)));
                    }
                }
                this.f39276a = i10;
                return this;
            }

            public C0844a c(int i10) {
                if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Invalid theme value %d", Integer.valueOf(i10)));
                }
                this.f39277b = i10;
                return this;
            }
        }

        private a(C0844a c0844a) {
            this.f39272b = c0844a.f39276a;
            this.f39273c = c0844a.f39277b;
            this.f39275e = c0844a.f39278c;
            this.f39274d = null;
        }

        @Override // com.google.android.gms.common.api.a.d.InterfaceC1258a
        public Account b() {
            return null;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (C6535q.a(Integer.valueOf(this.f39272b), Integer.valueOf(aVar.f39272b)) && C6535q.a(Integer.valueOf(this.f39273c), Integer.valueOf(aVar.f39273c)) && C6535q.a(null, null) && C6535q.a(Boolean.valueOf(this.f39275e), Boolean.valueOf(aVar.f39275e))) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return C6535q.b(Integer.valueOf(this.f39272b), Integer.valueOf(this.f39273c), null, Boolean.valueOf(this.f39275e));
        }

        private a() {
            this(new C0844a());
        }
    }

    static {
        a.g gVar = new a.g();
        f39267b = gVar;
        s sVar = new s();
        f39268c = sVar;
        f39266a = new com.google.android.gms.common.api.a<>("Wallet.API", sVar, gVar);
        f39270e = new Id.s();
        f39269d = new Id.b();
        f39271f = new Id.w();
    }

    public static m a(Activity activity, a aVar) {
        return new m(activity, aVar);
    }
}
