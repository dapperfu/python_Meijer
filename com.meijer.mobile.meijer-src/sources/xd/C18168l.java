package xd;

import Vd.AbstractC5516j;
import Vd.C5517k;
import android.content.Context;
import android.content.SharedPreferences;
import com.fullstory.FS;
import dd.C13655c;
import dd.InterfaceC13654b;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: xd.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C18168l implements InterfaceC13654b {

    /* renamed from: e, reason: collision with root package name */
    private static InterfaceC13654b f170686e;

    /* renamed from: a, reason: collision with root package name */
    private final Context f170687a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f170688b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f170689c;

    /* renamed from: d, reason: collision with root package name */
    private final ExecutorService f170690d;

    static synchronized InterfaceC13654b c(Context context) {
        try {
            com.google.android.gms.common.internal.r.m(context, "Context must not be null");
            if (f170686e == null) {
                f170686e = new C18168l(context.getApplicationContext());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f170686e;
    }

    private static final SharedPreferences f(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    protected final long a() {
        long j10 = f(this.f170687a).getLong("app_set_id_last_used_time", -1L);
        if (j10 != -1) {
            return j10 + 33696000000L;
        }
        return -1L;
    }

    final /* synthetic */ void d(C5517k c5517k) throws C18167k {
        String string = f(this.f170687a).getString("app_set_id", null);
        long jA = a();
        if (string == null || com.google.android.gms.common.util.i.d().a() > jA) {
            string = UUID.randomUUID().toString();
            try {
                Context context = this.f170687a;
                if (!f(context).edit().putString("app_set_id", string).commit()) {
                    String strValueOf = String.valueOf(context.getPackageName());
                    FS.log_e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(strValueOf) : new String("Failed to store app set ID generated for App "));
                    throw new C18167k("Failed to store the app set ID.");
                }
                g(context);
                Context context2 = this.f170687a;
                if (!f(context2).edit().putLong("app_set_id_creation_time", com.google.android.gms.common.util.i.d().a()).commit()) {
                    String strValueOf2 = String.valueOf(context2.getPackageName());
                    FS.log_e("AppSet", strValueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(strValueOf2) : new String("Failed to store app set ID creation time for App "));
                    throw new C18167k("Failed to store the app set ID creation time.");
                }
            } catch (C18167k e10) {
                c5517k.b(e10);
                return;
            }
        } else {
            try {
                g(this.f170687a);
            } catch (C18167k e11) {
                c5517k.b(e11);
                return;
            }
        }
        c5517k.c(new C13655c(string, 1));
    }

    @Override // dd.InterfaceC13654b
    public final AbstractC5516j<C13655c> h() {
        final C5517k c5517k = new C5517k();
        this.f170690d.execute(new Runnable() { // from class: xd.h
            @Override // java.lang.Runnable
            public final void run() throws C18167k {
                this.f170683a.d(c5517k);
            }
        });
        return c5517k.a();
    }

    C18168l(Context context) {
        this.f170688b = false;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f170689c = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.f170690d = Executors.newSingleThreadExecutor();
        this.f170687a = context;
        if (!this.f170688b) {
            scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new RunnableC18166j(this, null), 0L, 86400L, TimeUnit.SECONDS);
            this.f170688b = true;
        }
    }

    protected static final void e(Context context) {
        String str;
        String str2;
        if (!f(context).edit().remove("app_set_id").commit()) {
            String strValueOf = String.valueOf(context.getPackageName());
            if (strValueOf.length() != 0) {
                str2 = "Failed to clear app set ID generated for App ".concat(strValueOf);
            } else {
                str2 = new String("Failed to clear app set ID generated for App ");
            }
            FS.log_e("AppSet", str2);
        }
        if (!f(context).edit().remove("app_set_id_last_used_time").commit()) {
            String strValueOf2 = String.valueOf(context.getPackageName());
            if (strValueOf2.length() != 0) {
                str = "Failed to clear app set ID last used time for App ".concat(strValueOf2);
            } else {
                str = new String("Failed to clear app set ID last used time for App ");
            }
            FS.log_e("AppSet", str);
        }
    }

    private static final void g(Context context) throws C18167k {
        String str;
        SharedPreferences sharedPreferencesF = f(context);
        if (!sharedPreferencesF.edit().putLong("app_set_id_last_used_time", com.google.android.gms.common.util.i.d().a()).commit()) {
            String strValueOf = String.valueOf(context.getPackageName());
            if (strValueOf.length() != 0) {
                str = "Failed to store app set ID last used time for App ".concat(strValueOf);
            } else {
                str = new String("Failed to store app set ID last used time for App ");
            }
            FS.log_e("AppSet", str);
            throw new C18167k("Failed to store the app set ID last used time.");
        }
    }
}
