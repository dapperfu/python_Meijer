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
final class C7052Le0 {

    /* renamed from: c, reason: collision with root package name */
    private static final C8038ef0 f69252c = new C8038ef0("OverlayDisplayService");

    /* renamed from: d, reason: collision with root package name */
    private static final Intent f69253d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f69254e = 0;

    /* renamed from: a, reason: collision with root package name */
    final C7932df0 f69255a;

    /* renamed from: b, reason: collision with root package name */
    private final String f69256b;

    final void a() {
        if (this.f69255a == null) {
            return;
        }
        f69252c.c("unbind LMD display overlay service", new Object[0]);
        this.f69255a.n();
    }

    final void b(final AbstractC9531se0 abstractC9531se0, final InterfaceC7255Re0 interfaceC7255Re0) {
        if (this.f69255a == null) {
            f69252c.a("error: %s", "Play Store not found.");
        } else if (j(interfaceC7255Re0, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(abstractC9531se0.b(), abstractC9531se0.a()))) {
            this.f69255a.i(new Runnable() { // from class: com.google.android.gms.internal.ads.Be0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f66404a.c(abstractC9531se0, interfaceC7255Re0);
                }
            });
        }
    }

    final /* synthetic */ void c(AbstractC9531se0 abstractC9531se0, InterfaceC7255Re0 interfaceC7255Re0) {
        try {
            C7932df0 c7932df0 = this.f69255a;
            if (c7932df0 == null) {
                throw null;
            }
            InterfaceC7717be0 interfaceC7717be0 = (InterfaceC7717be0) c7932df0.c();
            if (interfaceC7717be0 == null) {
                return;
            }
            String str = this.f69256b;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            i(abstractC9531se0.b(), new Consumer() { // from class: com.google.android.gms.internal.ads.Ee0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i10 = C7052Le0.f69254e;
                    bundle.putString("sessionToken", (String) obj);
                }
            });
            i(abstractC9531se0.a(), new Consumer() { // from class: com.google.android.gms.internal.ads.Fe0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i10 = C7052Le0.f69254e;
                    bundle.putString("appId", (String) obj);
                }
            });
            interfaceC7717be0.N7(bundle, new BinderC7018Ke0(this, interfaceC7255Re0));
        } catch (RemoteException e10) {
            f69252c.b(e10, "dismiss overlay display from: %s", this.f69256b);
        }
    }

    final /* synthetic */ void d(AbstractC7119Ne0 abstractC7119Ne0, InterfaceC7255Re0 interfaceC7255Re0) {
        try {
            C7932df0 c7932df0 = this.f69255a;
            if (c7932df0 == null) {
                throw null;
            }
            InterfaceC7717be0 interfaceC7717be0 = (InterfaceC7717be0) c7932df0.c();
            if (interfaceC7717be0 == null) {
                return;
            }
            String str = this.f69256b;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putBinder("windowToken", abstractC7119Ne0.f());
            i(abstractC7119Ne0.g(), new Consumer() { // from class: com.google.android.gms.internal.ads.Je0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i10 = C7052Le0.f69254e;
                    bundle.putString("adFieldEnifd", (String) obj);
                }
            });
            bundle.putInt("layoutGravity", abstractC7119Ne0.c());
            bundle.putFloat("layoutVerticalMargin", abstractC7119Ne0.a());
            bundle.putInt("displayMode", 0);
            bundle.putInt("triggerMode", 0);
            bundle.putInt("windowWidthPx", abstractC7119Ne0.e());
            i(null, new Consumer() { // from class: com.google.android.gms.internal.ads.xe0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i10 = C7052Le0.f69254e;
                    bundle.putString("deeplinkUrl", (String) obj);
                }
            });
            i(null, new Consumer() { // from class: com.google.android.gms.internal.ads.ye0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i10 = C7052Le0.f69254e;
                    bundle.putString("sessionToken", (String) obj);
                }
            });
            i(abstractC7119Ne0.h(), new Consumer() { // from class: com.google.android.gms.internal.ads.ze0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i10 = C7052Le0.f69254e;
                    bundle.putString("appId", (String) obj);
                }
            });
            i(null, new Consumer() { // from class: com.google.android.gms.internal.ads.Ae0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i10 = C7052Le0.f69254e;
                    bundle.putString("thirdPartyAuthCallerId", (String) obj);
                }
            });
            bundle.putBoolean("stableSessionToken", true);
            interfaceC7717be0.C8(str, bundle, new BinderC7018Ke0(this, interfaceC7255Re0));
        } catch (RemoteException e10) {
            f69252c.b(e10, "show overlay display from: %s", this.f69256b);
        }
    }

    final /* synthetic */ void e(AbstractC7323Te0 abstractC7323Te0, int i10, InterfaceC7255Re0 interfaceC7255Re0) {
        try {
            C7932df0 c7932df0 = this.f69255a;
            if (c7932df0 == null) {
                throw null;
            }
            InterfaceC7717be0 interfaceC7717be0 = (InterfaceC7717be0) c7932df0.c();
            if (interfaceC7717be0 == null) {
                return;
            }
            String str = this.f69256b;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putInt("displayMode", i10);
            i(abstractC7323Te0.b(), new Consumer() { // from class: com.google.android.gms.internal.ads.we0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i11 = C7052Le0.f69254e;
                    bundle.putString("sessionToken", (String) obj);
                }
            });
            i(abstractC7323Te0.a(), new Consumer() { // from class: com.google.android.gms.internal.ads.Ce0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i11 = C7052Le0.f69254e;
                    bundle.putString("appId", (String) obj);
                }
            });
            interfaceC7717be0.O6(bundle, new BinderC7018Ke0(this, interfaceC7255Re0));
        } catch (RemoteException e10) {
            f69252c.b(e10, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i10), this.f69256b);
        }
    }

    final void f(final AbstractC7119Ne0 abstractC7119Ne0, final InterfaceC7255Re0 interfaceC7255Re0) {
        if (this.f69255a == null) {
            f69252c.a("error: %s", "Play Store not found.");
        } else if (j(interfaceC7255Re0, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, abstractC7119Ne0.h()))) {
            this.f69255a.i(new Runnable() { // from class: com.google.android.gms.internal.ads.Ge0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f68102a.d(abstractC7119Ne0, interfaceC7255Re0);
                }
            });
        }
    }

    final void g(final AbstractC7323Te0 abstractC7323Te0, final InterfaceC7255Re0 interfaceC7255Re0, final int i10) {
        if (this.f69255a == null) {
            f69252c.a("error: %s", "Play Store not found.");
        } else if (j(interfaceC7255Re0, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(abstractC7323Te0.b(), abstractC7323Te0.a()))) {
            this.f69255a.i(new Runnable() { // from class: com.google.android.gms.internal.ads.De0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f67110a.e(abstractC7323Te0, i10, interfaceC7255Re0);
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.internal.ads.He0] */
    C7052Le0(Context context) {
        if (C8252gf0.a(context)) {
            this.f69255a = new C7932df0(context.getApplicationContext(), f69252c, "OverlayDisplayService", f69253d, new Object() { // from class: com.google.android.gms.internal.ads.He0
            });
        } else {
            this.f69255a = null;
        }
        this.f69256b = context.getPackageName();
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

    private static boolean j(InterfaceC7255Re0 interfaceC7255Re0, String str, List list) {
        if (list.stream().anyMatch(new Predicate() { // from class: com.google.android.gms.internal.ads.Ie0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C7052Le0.h((String) obj);
            }
        })) {
            return true;
        }
        f69252c.a(str, new Object[0]);
        AbstractC7153Oe0 abstractC7153Oe0C = AbstractC7221Qe0.c();
        abstractC7153Oe0C.b(8160);
        interfaceC7255Re0.a(abstractC7153Oe0C.c());
        return false;
    }

    private static boolean k(String str) {
        return C7392Vf0.c(str).trim().isEmpty();
    }
}
