package hd;

import Td.C5233k;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import gd.C14244c;
import hd.C14409j;

/* renamed from: hd.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC14413n<A extends a.b, L> {

    /* renamed from: a, reason: collision with root package name */
    private final C14409j f134673a;

    /* renamed from: b, reason: collision with root package name */
    private final C14244c[] f134674b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f134675c;

    /* renamed from: d, reason: collision with root package name */
    private final int f134676d;

    protected abstract void d(A a10, C5233k<Void> c5233k) throws RemoteException;

    public void a() {
        this.f134673a.a();
    }

    public C14409j.a<L> b() {
        return this.f134673a.b();
    }

    public C14244c[] c() {
        return this.f134674b;
    }

    public final int e() {
        return this.f134676d;
    }

    public final boolean f() {
        return this.f134675c;
    }

    protected AbstractC14413n(C14409j<L> c14409j, C14244c[] c14244cArr, boolean z10, int i10) {
        this.f134673a = c14409j;
        this.f134674b = c14244cArr;
        this.f134675c = z10;
        this.f134676d = i10;
    }
}
