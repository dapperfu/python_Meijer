package qb;

import Lb.h;
import Lb.s;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import cb.C6380a;
import cb.C6381b;
import com.gimbal.internal.json.JsonWriteException;
import fb.C13865b;
import fb.C13869f;
import kb.C15129a;
import qb.C16487a;
import qb.C16487a.DialogInterfaceOnCancelListenerC2432a;
import vb.C17537c;
import vb.C17538d;

/* renamed from: qb.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16489c {

    /* renamed from: d, reason: collision with root package name */
    private static final C6380a f156990d = C6381b.a(C16489c.class.getName());

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f156991e = {"latitude", "longitude", "geofencingAllowed", "proximityAllowed", "communicateAllowed", "establishedLocationsAllowed", "collectIDFAAllowed", "geofencingOverride", "proximityOverride", "establishedLocationsOverride", "collectIDFAOverride", "breadcrumbsEnabled"};

    /* renamed from: f, reason: collision with root package name */
    private static C16489c f156992f;

    /* renamed from: a, reason: collision with root package name */
    private final C13865b f156993a;

    /* renamed from: b, reason: collision with root package name */
    private final C15129a f156994b;

    /* renamed from: c, reason: collision with root package name */
    String f156995c;

    /* renamed from: qb.c$a */
    final class a extends b {
        a() {
            super(C16489c.this, (byte) 0);
        }

        @Override // qb.C16489c.b, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            Application application = activity.getApplication();
            super.onActivityStarted(activity);
            application.unregisterActivityLifecycleCallbacks(this);
            if (C16489c.f(C16489c.this, application)) {
                C16489c c16489c = C16489c.this;
                try {
                    c16489c.f156995c = c16489c.b();
                    C16487a c16487a = new C16487a();
                    C2433c c2433c = new C2433c(c16489c, (byte) 0);
                    String str = c16489c.f156995c;
                    AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                    C16487a.DialogInterfaceOnCancelListenerC2432a dialogInterfaceOnCancelListenerC2432a = c16487a.new DialogInterfaceOnCancelListenerC2432a(activity, c2433c);
                    builder.setTitle("Gimbal Diagnostic");
                    builder.setMessage(str);
                    builder.setPositiveButton("Send in Email", dialogInterfaceOnCancelListenerC2432a);
                    builder.setNegativeButton("Copy to Clipboard", dialogInterfaceOnCancelListenerC2432a);
                    builder.setCancelable(true);
                    builder.setOnCancelListener(dialogInterfaceOnCancelListenerC2432a);
                    builder.create().show();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: qb.c$b */
    private class b implements Application.ActivityLifecycleCallbacks {
        private b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        /* synthetic */ b(C16489c c16489c, byte b10) {
            this();
        }
    }

    /* renamed from: qb.c$c, reason: collision with other inner class name */
    private class C2433c implements InterfaceC16488b {
        private C2433c() {
        }

        /* synthetic */ C2433c(C16489c c16489c, byte b10) {
            this();
        }

        @Override // qb.InterfaceC16488b
        public final void a(Context context) {
            C16489c.g(C16489c.this, context);
            C16489c.e(context);
        }

        @Override // qb.InterfaceC16488b
        public final void b(Context context) {
            C16489c.h(C16489c.this, context);
        }
    }

    private static String c(String str, int i10) {
        if (str == null) {
            return null;
        }
        if (str.length() <= i10) {
            return str;
        }
        return String.format("%1$s...", str.substring(0, i10), Integer.valueOf(str.length() - i10));
    }

    public static synchronized void d(Application application) {
        if (f156992f == null) {
            f156992f = new C16489c(application);
        }
    }

    static /* synthetic */ void e(Context context) {
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }

    static /* synthetic */ void g(C16489c c16489c, Context context) {
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.SUBJECT", "Gimbal Diagnostic");
        intent.putExtra("android.intent.extra.TEXT", c16489c.f156995c);
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
        }
    }

    static /* synthetic */ void h(C16489c c16489c, Context context) {
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Gimbal Diagnostic", c16489c.f156995c));
        }
    }

    final String b() throws JsonWriteException {
        Eb.b bVarA = a(this.f156994b.b());
        try {
            C17538d c17538d = new C17538d();
            c17538d.a(new C17537c(Eb.b.class, f156991e), Eb.b.class);
            return c17538d.g(bVarA).toString(4);
        } catch (Exception e10) {
            throw new JsonWriteException("Unable to build diagnostic text.", e10);
        }
    }

    private C16489c(Application application) {
        C13865b c13865bA = C13865b.a();
        this.f156993a = c13865bA;
        this.f156994b = C13869f.a().f130939u;
        s sVar = c13865bA.f130861D;
        if (sVar.c() && sVar.a()) {
            application.registerActivityLifecycleCallbacks(new a());
        }
    }

    public static Eb.b a(Eb.b bVar) {
        Eb.b bVarClone = bVar.clone();
        bVarClone.F(c(bVarClone.c(), 10));
        bVarClone.w0(c(bVarClone.q(), 6));
        bVarClone.v0(c(bVarClone.p(), 30));
        return bVarClone;
    }

    static /* synthetic */ boolean f(C16489c c16489c, Context context) {
        String strA;
        String strF = Bb.b.f(C13865b.a().f130876e.e().y(), "DIAGNOSTICS_OFF");
        if (!"DIAGNOSTICS_OFF".equals(strF) && (strA = new h(c16489c.f156993a, context).a()) != null && strA.equals(strF)) {
            return true;
        }
        return false;
    }
}
