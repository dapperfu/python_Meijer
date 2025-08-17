package hd;

import Td.C5233k;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import gd.C14244c;
import hd.C14409j;

/* renamed from: hd.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14414o<A extends a.b, L> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC14413n<A, L> f134678a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC14419u f134679b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f134680c;

    /* renamed from: hd.o$a */
    public static class a<A extends a.b, L> {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC14415p f134681a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC14415p f134682b;

        /* renamed from: d, reason: collision with root package name */
        private C14409j f134684d;

        /* renamed from: e, reason: collision with root package name */
        private C14244c[] f134685e;

        /* renamed from: g, reason: collision with root package name */
        private int f134687g;

        /* renamed from: c, reason: collision with root package name */
        private Runnable f134683c = new Runnable() { // from class: hd.Y
            @Override // java.lang.Runnable
            public final void run() {
            }
        };

        /* renamed from: f, reason: collision with root package name */
        private boolean f134686f = true;

        public C14414o<A, L> a() {
            com.google.android.gms.common.internal.r.b(this.f134681a != null, "Must set register function");
            com.google.android.gms.common.internal.r.b(this.f134682b != null, "Must set unregister function");
            com.google.android.gms.common.internal.r.b(this.f134684d != null, "Must set holder");
            return new C14414o<>(new Z(this, this.f134684d, this.f134685e, this.f134686f, this.f134687g), new a0(this, (C14409j.a) com.google.android.gms.common.internal.r.m(this.f134684d.b(), "Key must not be null")), this.f134683c, null);
        }

        public a<A, L> b(InterfaceC14415p<A, C5233k<Void>> interfaceC14415p) {
            this.f134681a = interfaceC14415p;
            return this;
        }

        public a<A, L> c(boolean z10) {
            this.f134686f = z10;
            return this;
        }

        public a<A, L> d(C14244c... c14244cArr) {
            this.f134685e = c14244cArr;
            return this;
        }

        public a<A, L> e(int i10) {
            this.f134687g = i10;
            return this;
        }

        public a<A, L> f(InterfaceC14415p<A, C5233k<Boolean>> interfaceC14415p) {
            this.f134682b = interfaceC14415p;
            return this;
        }

        public a<A, L> g(C14409j<L> c14409j) {
            this.f134684d = c14409j;
            return this;
        }

        /* synthetic */ a(b0 b0Var) {
        }
    }

    public static <A extends a.b, L> a<A, L> a() {
        return new a<>(null);
    }

    /* synthetic */ C14414o(AbstractC14413n abstractC14413n, AbstractC14419u abstractC14419u, Runnable runnable, c0 c0Var) {
        this.f134678a = abstractC14413n;
        this.f134679b = abstractC14419u;
        this.f134680c = runnable;
    }
}
