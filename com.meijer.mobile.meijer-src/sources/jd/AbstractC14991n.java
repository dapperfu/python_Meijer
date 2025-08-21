package jd;

import Vd.C5517k;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import id.C14720c;
import jd.C14987j;

/* renamed from: jd.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC14991n<A extends a.b, L> {

    /* renamed from: a, reason: collision with root package name */
    private final C14987j f140362a;

    /* renamed from: b, reason: collision with root package name */
    private final C14720c[] f140363b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f140364c;

    /* renamed from: d, reason: collision with root package name */
    private final int f140365d;

    protected abstract void d(A a10, C5517k<Void> c5517k) throws RemoteException;

    public void a() {
        this.f140362a.a();
    }

    public C14987j.a<L> b() {
        return this.f140362a.b();
    }

    public C14720c[] c() {
        return this.f140363b;
    }

    public final int e() {
        return this.f140365d;
    }

    public final boolean f() {
        return this.f140364c;
    }

    protected AbstractC14991n(C14987j<L> c14987j, C14720c[] c14720cArr, boolean z10, int i10) {
        this.f140362a = c14987j;
        this.f140363b = c14720cArr;
        this.f140364c = z10;
        this.f140365d = i10;
    }
}
