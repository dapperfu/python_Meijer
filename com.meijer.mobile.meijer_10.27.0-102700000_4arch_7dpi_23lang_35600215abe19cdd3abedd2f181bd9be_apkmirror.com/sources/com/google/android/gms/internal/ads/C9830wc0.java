package com.google.android.gms.internal.ads;

import Ic.a;
import Td.AbstractC5232j;
import Td.C5235m;
import Td.InterfaceC5228f;
import android.content.Context;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.wc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9830wc0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f79501a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f79502b;

    /* renamed from: c, reason: collision with root package name */
    private final C7694cc0 f79503c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC7907ec0 f79504d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC9723vc0 f79505e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC9723vc0 f79506f;

    /* renamed from: g, reason: collision with root package name */
    private AbstractC5232j f79507g;

    /* renamed from: h, reason: collision with root package name */
    private AbstractC5232j f79508h;

    C9830wc0(Context context, Executor executor, C7694cc0 c7694cc0, AbstractC7907ec0 abstractC7907ec0, C9402sc0 c9402sc0, C9509tc0 c9509tc0) {
        this.f79501a = context;
        this.f79502b = executor;
        this.f79503c = c7694cc0;
        this.f79504d = abstractC7907ec0;
        this.f79505e = c9402sc0;
        this.f79506f = c9509tc0;
    }

    public static C9830wc0 e(Context context, Executor executor, C7694cc0 c7694cc0, AbstractC7907ec0 abstractC7907ec0) {
        final C9830wc0 c9830wc0 = new C9830wc0(context, executor, c7694cc0, abstractC7907ec0, new C9402sc0(), new C9509tc0());
        if (c9830wc0.f79504d.h()) {
            c9830wc0.f79507g = c9830wc0.h(new Callable() { // from class: com.google.android.gms.internal.ads.pc0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f77619a.c();
                }
            });
        } else {
            c9830wc0.f79507g = C5235m.f(c9830wc0.f79505e.zza());
        }
        c9830wc0.f79508h = c9830wc0.h(new Callable() { // from class: com.google.android.gms.internal.ads.qc0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f77801a.d();
            }
        });
        return c9830wc0;
    }

    private final AbstractC5232j h(Callable callable) {
        return C5235m.c(this.f79502b, callable).f(this.f79502b, new InterfaceC5228f() { // from class: com.google.android.gms.internal.ads.rc0
            @Override // Td.InterfaceC5228f
            public final void onFailure(Exception exc) {
                this.f78047a.f(exc);
            }
        });
    }

    public final H8 a() {
        return g(this.f79507g, this.f79505e.zza());
    }

    public final H8 b() {
        return g(this.f79508h, this.f79506f.zza());
    }

    final /* synthetic */ H8 d() throws Exception {
        Context context = this.f79501a;
        return C8547kc0.a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    final /* synthetic */ void f(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.f79503c.c(2025, -1L, exc);
    }

    private static H8 g(AbstractC5232j abstractC5232j, H8 h82) {
        if (!abstractC5232j.r()) {
            return h82;
        }
        return (H8) abstractC5232j.n();
    }

    final /* synthetic */ H8 c() throws Exception {
        C8611l8 c8611l8B0 = H8.B0();
        a.C0217a c0217aA = Ic.a.a(this.f79501a);
        String strA = c0217aA.a();
        if (strA != null && strA.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID uuidFromString = UUID.fromString(strA);
            byte[] bArr = new byte[16];
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
            byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
            strA = Base64.encodeToString(bArr, 11);
        }
        if (strA != null) {
            c8611l8B0.z0(strA);
            c8611l8B0.y0(c0217aA.b());
            c8611l8B0.a0(6);
        }
        return (H8) c8611l8B0.p();
    }
}
