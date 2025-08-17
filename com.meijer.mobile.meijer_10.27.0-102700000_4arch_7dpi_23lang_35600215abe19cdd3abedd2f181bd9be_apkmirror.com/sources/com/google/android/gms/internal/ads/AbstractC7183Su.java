package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.gms.internal.ads.Su, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7183Su implements InterfaceC9330ru {

    /* renamed from: b, reason: collision with root package name */
    protected C9328rt f70176b;

    /* renamed from: c, reason: collision with root package name */
    protected C9328rt f70177c;

    /* renamed from: d, reason: collision with root package name */
    private C9328rt f70178d;

    /* renamed from: e, reason: collision with root package name */
    private C9328rt f70179e;

    /* renamed from: f, reason: collision with root package name */
    private ByteBuffer f70180f;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f70181g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f70182h;

    protected abstract C9328rt c(C9328rt c9328rt) throws zzcg;

    protected void e() {
    }

    protected void f() {
    }

    protected void g() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9330ru
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.f70181g;
        this.f70181g = InterfaceC9330ru.f78084a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9330ru
    public final void zzd() {
        this.f70182h = true;
        f();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9330ru
    public boolean zzh() {
        return this.f70182h && this.f70181g == InterfaceC9330ru.f78084a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9330ru
    public final C9328rt b(C9328rt c9328rt) throws zzcg {
        this.f70178d = c9328rt;
        this.f70179e = c(c9328rt);
        return zzg() ? this.f70179e : C9328rt.f78079e;
    }

    protected final ByteBuffer d(int i10) {
        if (this.f70180f.capacity() < i10) {
            this.f70180f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f70180f.clear();
        }
        ByteBuffer byteBuffer = this.f70180f;
        this.f70181g = byteBuffer;
        return byteBuffer;
    }

    protected final boolean h() {
        return this.f70181g.hasRemaining();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9330ru
    public final void zzc() {
        this.f70181g = InterfaceC9330ru.f78084a;
        this.f70182h = false;
        this.f70176b = this.f70178d;
        this.f70177c = this.f70179e;
        e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9330ru
    public boolean zzg() {
        return this.f70179e != C9328rt.f78079e;
    }

    public AbstractC7183Su() {
        ByteBuffer byteBuffer = InterfaceC9330ru.f78084a;
        this.f70180f = byteBuffer;
        this.f70181g = byteBuffer;
        C9328rt c9328rt = C9328rt.f78079e;
        this.f70178d = c9328rt;
        this.f70179e = c9328rt;
        this.f70176b = c9328rt;
        this.f70177c = c9328rt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9330ru
    public final void zzf() {
        zzc();
        this.f70180f = InterfaceC9330ru.f78084a;
        C9328rt c9328rt = C9328rt.f78079e;
        this.f70178d = c9328rt;
        this.f70179e = c9328rt;
        this.f70176b = c9328rt;
        this.f70177c = c9328rt;
        g();
    }
}
