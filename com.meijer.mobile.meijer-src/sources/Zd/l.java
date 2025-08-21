package Zd;

import android.accounts.Account;
import android.app.Activity;
import be.InterfaceC6366i;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.C6660q;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a<a> f43744a;

    /* renamed from: b, reason: collision with root package name */
    private static final a.g f43745b;

    /* renamed from: c, reason: collision with root package name */
    private static final a.AbstractC1266a f43746c;

    /* renamed from: d, reason: collision with root package name */
    public static final InterfaceC6366i f43747d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Kd.s f43748e;

    /* renamed from: f, reason: collision with root package name */
    public static final Kd.w f43749f;

    public static final class a implements a.d.InterfaceC1267a {

        /* renamed from: b, reason: collision with root package name */
        public final int f43750b;

        /* renamed from: c, reason: collision with root package name */
        public final int f43751c;

        /* renamed from: d, reason: collision with root package name */
        public final Account f43752d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f43753e;

        /* renamed from: Zd.l$a$a, reason: collision with other inner class name */
        public static final class C0929a {

            /* renamed from: a, reason: collision with root package name */
            private int f43754a = 3;

            /* renamed from: b, reason: collision with root package name */
            private int f43755b = 1;

            /* renamed from: c, reason: collision with root package name */
            private boolean f43756c = true;

            public a a() {
                return new a(this);
            }

            public C0929a b(int i10) {
                if (i10 != 0) {
                    if (i10 == 0) {
                        i10 = 0;
                    } else if (i10 != 2 && i10 != 1 && i10 != 23 && i10 != 3) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", Integer.valueOf(i10)));
                    }
                }
                this.f43754a = i10;
                return this;
            }

            public C0929a c(int i10) {
                if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Invalid theme value %d", Integer.valueOf(i10)));
                }
                this.f43755b = i10;
                return this;
            }
        }

        private a(C0929a c0929a) {
            this.f43750b = c0929a.f43754a;
            this.f43751c = c0929a.f43755b;
            this.f43753e = c0929a.f43756c;
            this.f43752d = null;
        }

        @Override // com.google.android.gms.common.api.a.d.InterfaceC1267a
        public Account b() {
            return null;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (C6660q.a(Integer.valueOf(this.f43750b), Integer.valueOf(aVar.f43750b)) && C6660q.a(Integer.valueOf(this.f43751c), Integer.valueOf(aVar.f43751c)) && C6660q.a(null, null) && C6660q.a(Boolean.valueOf(this.f43753e), Boolean.valueOf(aVar.f43753e))) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return C6660q.b(Integer.valueOf(this.f43750b), Integer.valueOf(this.f43751c), null, Boolean.valueOf(this.f43753e));
        }

        private a() {
            this(new C0929a());
        }
    }

    static {
        a.g gVar = new a.g();
        f43745b = gVar;
        s sVar = new s();
        f43746c = sVar;
        f43744a = new com.google.android.gms.common.api.a<>("Wallet.API", sVar, gVar);
        f43748e = new Kd.s();
        f43747d = new Kd.b();
        f43749f = new Kd.w();
    }

    public static m a(Activity activity, a aVar) {
        return new m(activity, aVar);
    }
}
