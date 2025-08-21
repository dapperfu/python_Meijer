package Rn;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.material.snackbar.Snackbar;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.models.CaptivePortalTester;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import yl.C18329a;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001aJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u0010J\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00108R\u0018\u0010<\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010;R\u0011\u0010?\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"LRn/i;", "Lcom/meijer/mobile/models/CaptivePortalTester$CaptivePortalTesterListener;", "LRn/j;", "manager", "LDk/b;", "eventBus", "Lcom/meijer/mobile/models/CaptivePortalTester;", "captivePortalTester", "<init>", "(LRn/j;LDk/b;Lcom/meijer/mobile/models/CaptivePortalTester;)V", "", "networkAvailable", "", "s", "(Z)V", "o", "()V", "m", "h", "", "messageResourceID", "r", "(I)Z", "Landroid/app/Activity;", "activity", "k", "(Landroid/app/Activity;)V", "q", "g", "Lcom/meijer/mobile/models/CaptivePortalTester$CaptivePortalState;", "state", "onCaptivePortalResults", "(Lcom/meijer/mobile/models/CaptivePortalTester$CaptivePortalState;)V", "a", "LRn/j;", "getManager", "()LRn/j;", "b", "LDk/b;", "getEventBus", "()LDk/b;", "c", "Lcom/meijer/mobile/models/CaptivePortalTester;", "getCaptivePortalTester", "()Lcom/meijer/mobile/models/CaptivePortalTester;", "LRn/k;", "d", "LRn/k;", "receiver", "e", "Landroid/app/Activity;", "Lcom/google/android/material/snackbar/Snackbar;", "f", "Lcom/google/android/material/snackbar/Snackbar;", "snackbar", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "contentContainer", "LJu/b;", "LJu/b;", "connectionDisposable", "i", "()Z", "isNetworkAvailable", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Rn.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5283i implements CaptivePortalTester.CaptivePortalTesterListener {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C5284j manager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Dk.b eventBus;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CaptivePortalTester captivePortalTester;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C5285k receiver;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Activity activity;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Snackbar snackbar;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private FrameLayout contentContainer;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Ju.b connectionDisposable;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Rn/i$a", "Lcom/google/android/material/snackbar/Snackbar$a;", "Lcom/google/android/material/snackbar/Snackbar;", "snackbar", "", "d", "(Lcom/google/android/material/snackbar/Snackbar;)V", "", "event", "c", "(Lcom/google/android/material/snackbar/Snackbar;I)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rn.i$a */
    public static final class a extends Snackbar.a {
        a() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.r
        /* renamed from: c */
        public void a(Snackbar snackbar, int event) {
            Intrinsics.j(snackbar, "snackbar");
            C5283i.this.h();
        }

        @Override // com.google.android.material.snackbar.Snackbar.a, com.google.android.material.snackbar.BaseTransientBottomBar.r
        /* renamed from: d */
        public void b(Snackbar snackbar) {
            Intrinsics.j(snackbar, "snackbar");
            FrameLayout frameLayout = C5283i.this.contentContainer;
            if (frameLayout != null) {
                frameLayout.setPadding(0, 0, 0, snackbar.K().getHeight());
                frameLayout.requestLayout();
            }
        }
    }

    public C5283i(C5284j manager, Dk.b eventBus, CaptivePortalTester captivePortalTester) {
        Intrinsics.j(manager, "manager");
        Intrinsics.j(eventBus, "eventBus");
        Intrinsics.j(captivePortalTester, "captivePortalTester");
        this.manager = manager;
        this.eventBus = eventBus;
        this.captivePortalTester = captivePortalTester;
        this.receiver = new C5285k(manager);
        manager.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        if (this.snackbar != null) {
            FrameLayout frameLayout = this.contentContainer;
            ViewParent parent = frameLayout != null ? frameLayout.getParent() : null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            FrameLayout frameLayout2 = this.contentContainer;
            View childAt = frameLayout2 != null ? frameLayout2.getChildAt(0) : null;
            if (childAt == null) {
                this.snackbar = null;
                return;
            }
            FrameLayout frameLayout3 = this.contentContainer;
            if (frameLayout3 != null) {
                frameLayout3.removeView(childAt);
            }
            if (viewGroup != null) {
                viewGroup.removeView(this.contentContainer);
            }
            if (viewGroup != null) {
                viewGroup.addView(childAt);
            }
            this.contentContainer = null;
            Snackbar snackbar = this.snackbar;
            if (snackbar != null) {
                snackbar.A();
            }
            this.snackbar = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(CaptivePortalTester.CaptivePortalState captivePortalState, C5283i c5283i) {
        if (captivePortalState == CaptivePortalTester.CaptivePortalState.IS_CAPTIVE_PORTAL) {
            c5283i.m();
        } else {
            c5283i.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(C5283i c5283i, C18329a c18329a) {
        c5283i.captivePortalTester.resetCaptivePortalFlag();
        c5283i.s(c18329a.getIsNetworkAvailable());
    }

    private final void m() {
        Snackbar snackbar;
        Snackbar snackbarT0;
        if (!r(Y.f101328zi) || (snackbar = this.snackbar) == null || (snackbarT0 = snackbar.t0(Y.f100462Hc, new View.OnClickListener() { // from class: Rn.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5283i.n(this.f33566a, view);
            }
        })) == null) {
            return;
        }
        snackbarT0.c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(C5283i c5283i, View view) {
        String URL_TO_TEST = c5283i.captivePortalTester.URL_TO_TEST;
        Intrinsics.i(URL_TO_TEST, "URL_TO_TEST");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(URL_TO_TEST));
        Activity activity = c5283i.activity;
        if (activity != null) {
            activity.startActivity(intent);
        }
    }

    private final void o() {
        if (r(Y.f100648R8)) {
            Snackbar snackbar = this.snackbar;
            if (snackbar != null) {
                snackbar.t0(Y.f100667S8, new View.OnClickListener() { // from class: Rn.e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C5283i.p(this.f33562a, view);
                    }
                });
            }
            Snackbar snackbar2 = this.snackbar;
            if (snackbar2 != null) {
                snackbar2.c0();
            }
        }
    }

    private final boolean r(int messageResourceID) {
        Activity activity = this.activity;
        if (activity == null || this.snackbar != null) {
            if (activity == null) {
                return false;
            }
            Snackbar snackbar = this.snackbar;
            if (snackbar != null) {
                snackbar.y0(messageResourceID);
            }
            return true;
        }
        Intrinsics.g(activity);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        Activity activity2 = this.activity;
        Intrinsics.g(activity2);
        FrameLayout frameLayout = new FrameLayout(activity2);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        View childAt = viewGroup.getChildAt(0);
        viewGroup.removeView(childAt);
        frameLayout.addView(childAt);
        Ds.p.c(childAt);
        viewGroup.addView(frameLayout);
        this.contentContainer = frameLayout;
        this.snackbar = Snackbar.q0(viewGroup, messageResourceID, -2).u(new a());
        return true;
    }

    private final void s(boolean networkAvailable) {
        if (!networkAvailable) {
            o();
        } else if (Ds.d.a(this.manager.getConnectivityManager()) || Ds.d.b(this.manager.getConnectivityManager(), this.manager.getWifiManager())) {
            this.captivePortalTester.testForCaptivePortal(this);
        } else {
            h();
        }
    }

    public final void g() {
        s(this.manager.a());
    }

    public final boolean i() {
        return this.manager.getIsNetworkAvailable();
    }

    public final void k(Activity activity) {
        Intrinsics.j(activity, "activity");
        if (Build.VERSION.SDK_INT >= 33) {
            C5285k c5285k = this.receiver;
            activity.registerReceiver(c5285k, c5285k.a(), 4);
        } else {
            C5285k c5285k2 = this.receiver;
            activity.registerReceiver(c5285k2, c5285k2.a());
        }
        this.connectionDisposable = this.eventBus.b(C18329a.class, new Lu.g() { // from class: Rn.g
            @Override // Lu.g
            public final void accept(Object obj) {
                C5283i.l(this.f33565a, (C18329a) obj);
            }
        });
        this.activity = activity;
    }

    @Override // com.meijer.mobile.models.CaptivePortalTester.CaptivePortalTesterListener
    public void onCaptivePortalResults(final CaptivePortalTester.CaptivePortalState state) {
        Intrinsics.j(state, "state");
        Activity activity = this.activity;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: Rn.f
                @Override // java.lang.Runnable
                public final void run() {
                    C5283i.j(state, this);
                }
            });
        }
    }

    public final void q(Activity activity) {
        Intrinsics.j(activity, "activity");
        this.captivePortalTester.unregister();
        try {
            activity.unregisterReceiver(this.receiver);
        } catch (IllegalArgumentException unused) {
        }
        Ju.b bVar = this.connectionDisposable;
        if (bVar != null) {
            if (bVar.isDisposed()) {
                bVar = null;
            }
            if (bVar != null) {
                bVar.dispose();
            }
        }
        this.connectionDisposable = null;
        this.activity = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(C5283i c5283i, View view) {
        c5283i.h();
    }
}
