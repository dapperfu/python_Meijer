package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.gms.internal.ads.Su, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7308Su implements InterfaceC9455ru {

    /* renamed from: b, reason: collision with root package name */
    protected C9453rt f71016b;

    /* renamed from: c, reason: collision with root package name */
    protected C9453rt f71017c;

    /* renamed from: d, reason: collision with root package name */
    private C9453rt f71018d;

    /* renamed from: e, reason: collision with root package name */
    private C9453rt f71019e;

    /* renamed from: f, reason: collision with root package name */
    private ByteBuffer f71020f;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f71021g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f71022h;

    protected abstract C9453rt c(C9453rt c9453rt) throws zzcg;

    protected void e() {
    }

    protected void f() {
    }

    protected void g() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9455ru
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.f71021g;
        this.f71021g = InterfaceC9455ru.f78924a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9455ru
    public final void zzd() {
        this.f71022h = true;
        f();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9455ru
    public boolean zzh() {
        return this.f71022h && this.f71021g == InterfaceC9455ru.f78924a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9455ru
    public final C9453rt b(C9453rt c9453rt) throws zzcg {
        this.f71018d = c9453rt;
        this.f71019e = c(c9453rt);
        return zzg() ? this.f71019e : C9453rt.f78919e;
    }

    protected final ByteBuffer d(int i10) {
        if (this.f71020f.capacity() < i10) {
            this.f71020f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f71020f.clear();
        }
        ByteBuffer byteBuffer = this.f71020f;
        this.f71021g = byteBuffer;
        return byteBuffer;
    }

    protected final boolean h() {
        return this.f71021g.hasRemaining();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9455ru
    public final void zzc() {
        this.f71021g = InterfaceC9455ru.f78924a;
        this.f71022h = false;
        this.f71016b = this.f71018d;
        this.f71017c = this.f71019e;
        e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9455ru
    public boolean zzg() {
        return this.f71019e != C9453rt.f78919e;
    }

    public AbstractC7308Su() {
        ByteBuffer byteBuffer = InterfaceC9455ru.f78924a;
        this.f71020f = byteBuffer;
        this.f71021g = byteBuffer;
        C9453rt c9453rt = C9453rt.f78919e;
        this.f71018d = c9453rt;
        this.f71019e = c9453rt;
        this.f71016b = c9453rt;
        this.f71017c = c9453rt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9455ru
    public final void zzf() {
        zzc();
        this.f71020f = InterfaceC9455ru.f78924a;
        C9453rt c9453rt = C9453rt.f78919e;
        this.f71018d = c9453rt;
        this.f71019e = c9453rt;
        this.f71016b = c9453rt;
        this.f71017c = c9453rt;
        g();
    }
}
