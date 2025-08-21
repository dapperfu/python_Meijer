package com.google.android.gms.internal.ads;

import Kc.a;
import Vd.AbstractC5516j;
import Vd.C5519m;
import Vd.InterfaceC5512f;
import android.content.Context;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.wc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9955wc0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f80341a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f80342b;

    /* renamed from: c, reason: collision with root package name */
    private final C7819cc0 f80343c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC8032ec0 f80344d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC9848vc0 f80345e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC9848vc0 f80346f;

    /* renamed from: g, reason: collision with root package name */
    private AbstractC5516j f80347g;

    /* renamed from: h, reason: collision with root package name */
    private AbstractC5516j f80348h;

    C9955wc0(Context context, Executor executor, C7819cc0 c7819cc0, AbstractC8032ec0 abstractC8032ec0, C9527sc0 c9527sc0, C9634tc0 c9634tc0) {
        this.f80341a = context;
        this.f80342b = executor;
        this.f80343c = c7819cc0;
        this.f80344d = abstractC8032ec0;
        this.f80345e = c9527sc0;
        this.f80346f = c9634tc0;
    }

    public static C9955wc0 e(Context context, Executor executor, C7819cc0 c7819cc0, AbstractC8032ec0 abstractC8032ec0) {
        final C9955wc0 c9955wc0 = new C9955wc0(context, executor, c7819cc0, abstractC8032ec0, new C9527sc0(), new C9634tc0());
        if (c9955wc0.f80344d.h()) {
            c9955wc0.f80347g = c9955wc0.h(new Callable() { // from class: com.google.android.gms.internal.ads.pc0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f78459a.c();
                }
            });
        } else {
            c9955wc0.f80347g = C5519m.f(c9955wc0.f80345e.zza());
        }
        c9955wc0.f80348h = c9955wc0.h(new Callable() { // from class: com.google.android.gms.internal.ads.qc0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f78641a.d();
            }
        });
        return c9955wc0;
    }

    private final AbstractC5516j h(Callable callable) {
        return C5519m.c(this.f80342b, callable).f(this.f80342b, new InterfaceC5512f() { // from class: com.google.android.gms.internal.ads.rc0
            @Override // Vd.InterfaceC5512f
            public final void onFailure(Exception exc) {
                this.f78887a.f(exc);
            }
        });
    }

    public final H8 a() {
        return g(this.f80347g, this.f80345e.zza());
    }

    public final H8 b() {
        return g(this.f80348h, this.f80346f.zza());
    }

    final /* synthetic */ H8 d() throws Exception {
        Context context = this.f80341a;
        return C8672kc0.a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    final /* synthetic */ void f(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.f80343c.c(2025, -1L, exc);
    }

    private static H8 g(AbstractC5516j abstractC5516j, H8 h82) {
        if (!abstractC5516j.r()) {
            return h82;
        }
        return (H8) abstractC5516j.n();
    }

    final /* synthetic */ H8 c() throws Exception {
        C8736l8 c8736l8B0 = H8.B0();
        a.C0277a c0277aA = Kc.a.a(this.f80341a);
        String strA = c0277aA.a();
        if (strA != null && strA.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID uuidFromString = UUID.fromString(strA);
            byte[] bArr = new byte[16];
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
            byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
            strA = Base64.encodeToString(bArr, 11);
        }
        if (strA != null) {
            c8736l8B0.z0(strA);
            c8736l8B0.y0(c0277aA.b());
            c8736l8B0.a0(6);
        }
        return (H8) c8736l8B0.p();
    }
}
