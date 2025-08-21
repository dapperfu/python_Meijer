package jd;

import Vd.C5517k;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import id.C14720c;
import jd.C14987j;

/* renamed from: jd.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14992o<A extends a.b, L> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC14991n<A, L> f140367a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC14997u f140368b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f140369c;

    /* renamed from: jd.o$a */
    public static class a<A extends a.b, L> {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC14993p f140370a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC14993p f140371b;

        /* renamed from: d, reason: collision with root package name */
        private C14987j f140373d;

        /* renamed from: e, reason: collision with root package name */
        private C14720c[] f140374e;

        /* renamed from: g, reason: collision with root package name */
        private int f140376g;

        /* renamed from: c, reason: collision with root package name */
        private Runnable f140372c = new Runnable() { // from class: jd.Y
            @Override // java.lang.Runnable
            public final void run() {
            }
        };

        /* renamed from: f, reason: collision with root package name */
        private boolean f140375f = true;

        public C14992o<A, L> a() {
            com.google.android.gms.common.internal.r.b(this.f140370a != null, "Must set register function");
            com.google.android.gms.common.internal.r.b(this.f140371b != null, "Must set unregister function");
            com.google.android.gms.common.internal.r.b(this.f140373d != null, "Must set holder");
            return new C14992o<>(new Z(this, this.f140373d, this.f140374e, this.f140375f, this.f140376g), new a0(this, (C14987j.a) com.google.android.gms.common.internal.r.m(this.f140373d.b(), "Key must not be null")), this.f140372c, null);
        }

        public a<A, L> b(InterfaceC14993p<A, C5517k<Void>> interfaceC14993p) {
            this.f140370a = interfaceC14993p;
            return this;
        }

        public a<A, L> c(boolean z10) {
            this.f140375f = z10;
            return this;
        }

        public a<A, L> d(C14720c... c14720cArr) {
            this.f140374e = c14720cArr;
            return this;
        }

        public a<A, L> e(int i10) {
            this.f140376g = i10;
            return this;
        }

        public a<A, L> f(InterfaceC14993p<A, C5517k<Boolean>> interfaceC14993p) {
            this.f140371b = interfaceC14993p;
            return this;
        }

        public a<A, L> g(C14987j<L> c14987j) {
            this.f140373d = c14987j;
            return this;
        }

        /* synthetic */ a(b0 b0Var) {
        }
    }

    public static <A extends a.b, L> a<A, L> a() {
        return new a<>(null);
    }

    /* synthetic */ C14992o(AbstractC14991n abstractC14991n, AbstractC14997u abstractC14997u, Runnable runnable, c0 c0Var) {
        this.f140367a = abstractC14991n;
        this.f140368b = abstractC14997u;
        this.f140369c = runnable;
    }
}
