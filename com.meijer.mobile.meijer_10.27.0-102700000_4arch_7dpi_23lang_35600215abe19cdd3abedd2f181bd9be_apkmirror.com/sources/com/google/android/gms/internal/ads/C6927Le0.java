package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

@SuppressLint({"RestrictedApi"})
/* renamed from: com.google.android.gms.internal.ads.Le0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6927Le0 {

    /* renamed from: c, reason: collision with root package name */
    private static final C7913ef0 f68412c = new C7913ef0("OverlayDisplayService");

    /* renamed from: d, reason: collision with root package name */
    private static final Intent f68413d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f68414e = 0;

    /* renamed from: a, reason: collision with root package name */
    final C7807df0 f68415a;

    /* renamed from: b, reason: collision with root package name */
    private final String f68416b;

    final void a() {
        if (this.f68415a == null) {
            return;
        }
        f68412c.c("unbind LMD display overlay service", new Object[0]);
        this.f68415a.n();
    }

    final void b(final AbstractC9406se0 abstractC9406se0, final InterfaceC7130Re0 interfaceC7130Re0) {
        if (this.f68415a == null) {
            f68412c.a("error: %s", "Play Store not found.");
        } else if (j(interfaceC7130Re0, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(abstractC9406se0.b(), abstractC9406se0.a()))) {
            this.f68415a.i(new Runnable() { // from class: com.google.android.gms.internal.ads.Be0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f65564a.c(abstractC9406se0, interfaceC7130Re0);
                }
            });
        }
    }

    final /* synthetic */ void c(AbstractC9406se0 abstractC9406se0, InterfaceC7130Re0 interfaceC7130Re0) {
        try {
            C7807df0 c7807df0 = this.f68415a;
            if (c7807df0 == null) {
                throw null;
            }
            InterfaceC7592be0 interfaceC7592be0 = (InterfaceC7592be0) c7807df0.c();
            if (interfaceC7592be0 == null) {
                return;
            }
            String str = this.f68416b;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            i(abstractC9406se0.b(), new Consumer() { // from class: com.google.android.gms.internal.ads.Ee0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i10 = C6927Le0.f68414e;
                    bundle.putString("sessionToken", (String) obj);
                }
            });
            i(abstractC9406se0.a(), new Consumer() { // from class: com.google.android.gms.internal.ads.Fe0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i10 = C6927Le0.f68414e;
                    bundle.putString("appId", (String) obj);
                }
            });
            interfaceC7592be0.N7(bundle, new BinderC6893Ke0(this, interfaceC7130Re0));
        } catch (RemoteException e10) {
            f68412c.b(e10, "dismiss overlay display from: %s", this.f68416b);
        }
    }

    final /* synthetic */ void d(AbstractC6994Ne0 abstractC6994Ne0, InterfaceC7130Re0 interfaceC7130Re0) {
        try {
            C7807df0 c7807df0 = this.f68415a;
            if (c7807df0 == null) {
                throw null;
            }
            InterfaceC7592be0 interfaceC7592be0 = (InterfaceC7592be0) c7807df0.c();
            if (interfaceC7592be0 == null) {
                return;
            }
            String str = this.f68416b;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putBinder("windowToken", abstractC6994Ne0.f());
            i(abstractC6994Ne0.g(), new Consumer() { // from class: com.google.android.gms.internal.ads.Je0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i10 = C6927Le0.f68414e;
                    bundle.putString("adFieldEnifd", (String) obj);
                }
            });
            bundle.putInt("layoutGravity", abstractC6994Ne0.c());
            bundle.putFloat("layoutVerticalMargin", abstractC6994Ne0.a());
            bundle.putInt("displayMode", 0);
            bundle.putInt("triggerMode", 0);
            bundle.putInt("windowWidthPx", abstractC6994Ne0.e());
            i(null, new Consumer() { // from class: com.google.android.gms.internal.ads.xe0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i10 = C6927Le0.f68414e;
                    bundle.putString("deeplinkUrl", (String) obj);
                }
            });
            i(null, new Consumer() { // from class: com.google.android.gms.internal.ads.ye0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i10 = C6927Le0.f68414e;
                    bundle.putString("sessionToken", (String) obj);
                }
            });
            i(abstractC6994Ne0.h(), new Consumer() { // from class: com.google.android.gms.internal.ads.ze0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i10 = C6927Le0.f68414e;
                    bundle.putString("appId", (String) obj);
                }
            });
            i(null, new Consumer() { // from class: com.google.android.gms.internal.ads.Ae0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i10 = C6927Le0.f68414e;
                    bundle.putString("thirdPartyAuthCallerId", (String) obj);
                }
            });
            bundle.putBoolean("stableSessionToken", true);
            interfaceC7592be0.I8(str, bundle, new BinderC6893Ke0(this, interfaceC7130Re0));
        } catch (RemoteException e10) {
            f68412c.b(e10, "show overlay display from: %s", this.f68416b);
        }
    }

    final /* synthetic */ void e(AbstractC7198Te0 abstractC7198Te0, int i10, InterfaceC7130Re0 interfaceC7130Re0) {
        try {
            C7807df0 c7807df0 = this.f68415a;
            if (c7807df0 == null) {
                throw null;
            }
            InterfaceC7592be0 interfaceC7592be0 = (InterfaceC7592be0) c7807df0.c();
            if (interfaceC7592be0 == null) {
                return;
            }
            String str = this.f68416b;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putInt("displayMode", i10);
            i(abstractC7198Te0.b(), new Consumer() { // from class: com.google.android.gms.internal.ads.we0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i11 = C6927Le0.f68414e;
                    bundle.putString("sessionToken", (String) obj);
                }
            });
            i(abstractC7198Te0.a(), new Consumer() { // from class: com.google.android.gms.internal.ads.Ce0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i11 = C6927Le0.f68414e;
                    bundle.putString("appId", (String) obj);
                }
            });
            interfaceC7592be0.D6(bundle, new BinderC6893Ke0(this, interfaceC7130Re0));
        } catch (RemoteException e10) {
            f68412c.b(e10, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i10), this.f68416b);
        }
    }

    final void f(final AbstractC6994Ne0 abstractC6994Ne0, final InterfaceC7130Re0 interfaceC7130Re0) {
        if (this.f68415a == null) {
            f68412c.a("error: %s", "Play Store not found.");
        } else if (j(interfaceC7130Re0, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, abstractC6994Ne0.h()))) {
            this.f68415a.i(new Runnable() { // from class: com.google.android.gms.internal.ads.Ge0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f67262a.d(abstractC6994Ne0, interfaceC7130Re0);
                }
            });
        }
    }

    final void g(final AbstractC7198Te0 abstractC7198Te0, final InterfaceC7130Re0 interfaceC7130Re0, final int i10) {
        if (this.f68415a == null) {
            f68412c.a("error: %s", "Play Store not found.");
        } else if (j(interfaceC7130Re0, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(abstractC7198Te0.b(), abstractC7198Te0.a()))) {
            this.f68415a.i(new Runnable() { // from class: com.google.android.gms.internal.ads.De0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f66270a.e(abstractC7198Te0, i10, interfaceC7130Re0);
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.internal.ads.He0] */
    C6927Le0(Context context) {
        if (C8127gf0.a(context)) {
            this.f68415a = new C7807df0(context.getApplicationContext(), f68412c, "OverlayDisplayService", f68413d, new Object() { // from class: com.google.android.gms.internal.ads.He0
            });
        } else {
            this.f68415a = null;
        }
        this.f68416b = context.getPackageName();
    }

    static /* synthetic */ boolean h(String str) {
        if (!k(str)) {
            return true;
        }
        return false;
    }

    private static void i(String str, Consumer consumer) {
        if (!k(str)) {
            str.getClass();
            consumer.accept(str.trim());
        }
    }

    private static boolean j(InterfaceC7130Re0 interfaceC7130Re0, String str, List list) {
        if (list.stream().anyMatch(new Predicate() { // from class: com.google.android.gms.internal.ads.Ie0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C6927Le0.h((String) obj);
            }
        })) {
            return true;
        }
        f68412c.a(str, new Object[0]);
        AbstractC7028Oe0 abstractC7028Oe0C = AbstractC7096Qe0.c();
        abstractC7028Oe0C.b(8160);
        interfaceC7130Re0.a(abstractC7028Oe0C.c());
        return false;
    }

    private static boolean k(String str) {
        return C7267Vf0.c(str).trim().isEmpty();
    }
}
