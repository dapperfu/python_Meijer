package jd;

import Vd.C5517k;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import id.C14720c;

/* renamed from: jd.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC14995s<A extends a.b, ResultT> {

    /* renamed from: a, reason: collision with root package name */
    private final C14720c[] f140387a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f140388b;

    /* renamed from: c, reason: collision with root package name */
    private final int f140389c;

    /* renamed from: jd.s$a */
    public static class a<A extends a.b, ResultT> {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC14993p f140390a;

        /* renamed from: c, reason: collision with root package name */
        private C14720c[] f140392c;

        /* renamed from: b, reason: collision with root package name */
        private boolean f140391b = true;

        /* renamed from: d, reason: collision with root package name */
        private int f140393d = 0;

        public AbstractC14995s<A, ResultT> a() {
            com.google.android.gms.common.internal.r.b(this.f140390a != null, "execute parameter required");
            return new h0(this, this.f140392c, this.f140391b, this.f140393d);
        }

        public a<A, ResultT> b(InterfaceC14993p<A, C5517k<ResultT>> interfaceC14993p) {
            this.f140390a = interfaceC14993p;
            return this;
        }

        public a<A, ResultT> c(boolean z10) {
            this.f140391b = z10;
            return this;
        }

        public a<A, ResultT> d(C14720c... c14720cArr) {
            this.f140392c = c14720cArr;
            return this;
        }

        public a<A, ResultT> e(int i10) {
            this.f140393d = i10;
            return this;
        }

        /* synthetic */ a(i0 i0Var) {
        }
    }

    protected abstract void b(A a10, C5517k<ResultT> c5517k) throws RemoteException;

    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        return new a<>(null);
    }

    public boolean c() {
        return this.f140388b;
    }

    public final int d() {
        return this.f140389c;
    }

    public final C14720c[] e() {
        return this.f140387a;
    }

    protected AbstractC14995s(C14720c[] c14720cArr, boolean z10, int i10) {
        this.f140387a = c14720cArr;
        boolean z11 = false;
        if (c14720cArr != null && z10) {
            z11 = true;
        }
        this.f140388b = z11;
        this.f140389c = i10;
    }
}
