package hd;

import Td.C5233k;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import gd.C14244c;

/* renamed from: hd.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC14417s<A extends a.b, ResultT> {

    /* renamed from: a, reason: collision with root package name */
    private final C14244c[] f134698a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f134699b;

    /* renamed from: c, reason: collision with root package name */
    private final int f134700c;

    /* renamed from: hd.s$a */
    public static class a<A extends a.b, ResultT> {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC14415p f134701a;

        /* renamed from: c, reason: collision with root package name */
        private C14244c[] f134703c;

        /* renamed from: b, reason: collision with root package name */
        private boolean f134702b = true;

        /* renamed from: d, reason: collision with root package name */
        private int f134704d = 0;

        public AbstractC14417s<A, ResultT> a() {
            com.google.android.gms.common.internal.r.b(this.f134701a != null, "execute parameter required");
            return new h0(this, this.f134703c, this.f134702b, this.f134704d);
        }

        public a<A, ResultT> b(InterfaceC14415p<A, C5233k<ResultT>> interfaceC14415p) {
            this.f134701a = interfaceC14415p;
            return this;
        }

        public a<A, ResultT> c(boolean z10) {
            this.f134702b = z10;
            return this;
        }

        public a<A, ResultT> d(C14244c... c14244cArr) {
            this.f134703c = c14244cArr;
            return this;
        }

        public a<A, ResultT> e(int i10) {
            this.f134704d = i10;
            return this;
        }

        /* synthetic */ a(i0 i0Var) {
        }
    }

    protected abstract void b(A a10, C5233k<ResultT> c5233k) throws RemoteException;

    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        return new a<>(null);
    }

    public boolean c() {
        return this.f134699b;
    }

    public final int d() {
        return this.f134700c;
    }

    public final C14244c[] e() {
        return this.f134698a;
    }

    protected AbstractC14417s(C14244c[] c14244cArr, boolean z10, int i10) {
        this.f134698a = c14244cArr;
        boolean z11 = false;
        if (c14244cArr != null && z10) {
            z11 = true;
        }
        this.f134699b = z11;
        this.f134700c = i10;
    }
}
