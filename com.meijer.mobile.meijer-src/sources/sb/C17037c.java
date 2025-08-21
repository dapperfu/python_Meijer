package sb;

import Nb.h;
import Nb.s;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.gimbal.internal.json.JsonWriteException;
import eb.C13784a;
import eb.C13785b;
import hb.C14495b;
import hb.C14499f;
import mb.C15700a;
import sb.C17035a;
import sb.C17035a.DialogInterfaceOnCancelListenerC2497a;
import xb.C18149c;
import xb.C18150d;

/* renamed from: sb.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17037c {

    /* renamed from: d, reason: collision with root package name */
    private static final C13784a f160105d = C13785b.a(C17037c.class.getName());

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f160106e = {"latitude", "longitude", "geofencingAllowed", "proximityAllowed", "communicateAllowed", "establishedLocationsAllowed", "collectIDFAAllowed", "geofencingOverride", "proximityOverride", "establishedLocationsOverride", "collectIDFAOverride", "breadcrumbsEnabled"};

    /* renamed from: f, reason: collision with root package name */
    private static C17037c f160107f;

    /* renamed from: a, reason: collision with root package name */
    private final C14495b f160108a;

    /* renamed from: b, reason: collision with root package name */
    private final C15700a f160109b;

    /* renamed from: c, reason: collision with root package name */
    String f160110c;

    /* renamed from: sb.c$a */
    final class a extends b {
        a() {
            super(C17037c.this, (byte) 0);
        }

        @Override // sb.C17037c.b, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            Application application = activity.getApplication();
            super.onActivityStarted(activity);
            application.unregisterActivityLifecycleCallbacks(this);
            if (C17037c.f(C17037c.this, application)) {
                C17037c c17037c = C17037c.this;
                try {
                    c17037c.f160110c = c17037c.b();
                    C17035a c17035a = new C17035a();
                    C2498c c2498c = new C2498c(c17037c, (byte) 0);
                    String str = c17037c.f160110c;
                    AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                    C17035a.DialogInterfaceOnCancelListenerC2497a dialogInterfaceOnCancelListenerC2497a = c17035a.new DialogInterfaceOnCancelListenerC2497a(activity, c2498c);
                    builder.setTitle("Gimbal Diagnostic");
                    builder.setMessage(str);
                    builder.setPositiveButton("Send in Email", dialogInterfaceOnCancelListenerC2497a);
                    builder.setNegativeButton("Copy to Clipboard", dialogInterfaceOnCancelListenerC2497a);
                    builder.setCancelable(true);
                    builder.setOnCancelListener(dialogInterfaceOnCancelListenerC2497a);
                    builder.create().show();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: sb.c$b */
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

        /* synthetic */ b(C17037c c17037c, byte b10) {
            this();
        }
    }

    /* renamed from: sb.c$c, reason: collision with other inner class name */
    private class C2498c implements InterfaceC17036b {
        private C2498c() {
        }

        /* synthetic */ C2498c(C17037c c17037c, byte b10) {
            this();
        }

        @Override // sb.InterfaceC17036b
        public final void a(Context context) {
            C17037c.g(C17037c.this, context);
            C17037c.e(context);
        }

        @Override // sb.InterfaceC17036b
        public final void b(Context context) {
            C17037c.h(C17037c.this, context);
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
        if (f160107f == null) {
            f160107f = new C17037c(application);
        }
    }

    static /* synthetic */ void e(Context context) {
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }

    static /* synthetic */ void g(C17037c c17037c, Context context) {
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.SUBJECT", "Gimbal Diagnostic");
        intent.putExtra("android.intent.extra.TEXT", c17037c.f160110c);
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
        }
    }

    static /* synthetic */ void h(C17037c c17037c, Context context) {
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Gimbal Diagnostic", c17037c.f160110c));
        }
    }

    final String b() throws JsonWriteException {
        Gb.b bVarA = a(this.f160109b.b());
        try {
            C18150d c18150d = new C18150d();
            c18150d.a(new C18149c(Gb.b.class, f160106e), Gb.b.class);
            return c18150d.g(bVarA).toString(4);
        } catch (Exception e10) {
            throw new JsonWriteException("Unable to build diagnostic text.", e10);
        }
    }

    private C17037c(Application application) {
        C14495b c14495bA = C14495b.a();
        this.f160108a = c14495bA;
        this.f160109b = C14499f.a().f135285u;
        s sVar = c14495bA.f135207D;
        if (sVar.c() && sVar.a()) {
            application.registerActivityLifecycleCallbacks(new a());
        }
    }

    public static Gb.b a(Gb.b bVar) {
        Gb.b bVarClone = bVar.clone();
        bVarClone.F(c(bVarClone.c(), 10));
        bVarClone.w0(c(bVarClone.q(), 6));
        bVarClone.v0(c(bVarClone.p(), 30));
        return bVarClone;
    }

    static /* synthetic */ boolean f(C17037c c17037c, Context context) {
        String strA;
        String strF = Db.b.f(C14495b.a().f135222e.e().y(), "DIAGNOSTICS_OFF");
        if (!"DIAGNOSTICS_OFF".equals(strF) && (strA = new h(c17037c.f160108a, context).a()) != null && strA.equals(strF)) {
            return true;
        }
        return false;
    }
}
