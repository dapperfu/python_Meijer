package vd;

import Td.AbstractC5232j;
import Td.C5233k;
import android.content.Context;
import android.content.SharedPreferences;
import bd.C6224c;
import bd.InterfaceC6223b;
import com.fullstory.FS;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: vd.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C17556l implements InterfaceC6223b {

    /* renamed from: e, reason: collision with root package name */
    private static InterfaceC6223b f164650e;

    /* renamed from: a, reason: collision with root package name */
    private final Context f164651a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f164652b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f164653c;

    /* renamed from: d, reason: collision with root package name */
    private final ExecutorService f164654d;

    static synchronized InterfaceC6223b c(Context context) {
        try {
            com.google.android.gms.common.internal.r.m(context, "Context must not be null");
            if (f164650e == null) {
                f164650e = new C17556l(context.getApplicationContext());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f164650e;
    }

    private static final SharedPreferences f(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    protected final long a() {
        long j10 = f(this.f164651a).getLong("app_set_id_last_used_time", -1L);
        if (j10 != -1) {
            return j10 + 33696000000L;
        }
        return -1L;
    }

    final /* synthetic */ void d(C5233k c5233k) throws C17555k {
        String string = f(this.f164651a).getString("app_set_id", null);
        long jA = a();
        if (string == null || com.google.android.gms.common.util.i.d().a() > jA) {
            string = UUID.randomUUID().toString();
            try {
                Context context = this.f164651a;
                if (!f(context).edit().putString("app_set_id", string).commit()) {
                    String strValueOf = String.valueOf(context.getPackageName());
                    FS.log_e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(strValueOf) : new String("Failed to store app set ID generated for App "));
                    throw new C17555k("Failed to store the app set ID.");
                }
                h(context);
                Context context2 = this.f164651a;
                if (!f(context2).edit().putLong("app_set_id_creation_time", com.google.android.gms.common.util.i.d().a()).commit()) {
                    String strValueOf2 = String.valueOf(context2.getPackageName());
                    FS.log_e("AppSet", strValueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(strValueOf2) : new String("Failed to store app set ID creation time for App "));
                    throw new C17555k("Failed to store the app set ID creation time.");
                }
            } catch (C17555k e10) {
                c5233k.b(e10);
                return;
            }
        } else {
            try {
                h(this.f164651a);
            } catch (C17555k e11) {
                c5233k.b(e11);
                return;
            }
        }
        c5233k.c(new C6224c(string, 1));
    }

    @Override // bd.InterfaceC6223b
    public final AbstractC5232j<C6224c> g() {
        final C5233k c5233k = new C5233k();
        this.f164654d.execute(new Runnable() { // from class: vd.h
            @Override // java.lang.Runnable
            public final void run() throws C17555k {
                this.f164647a.d(c5233k);
            }
        });
        return c5233k.a();
    }

    C17556l(Context context) {
        this.f164652b = false;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f164653c = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.f164654d = Executors.newSingleThreadExecutor();
        this.f164651a = context;
        if (!this.f164652b) {
            scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new RunnableC17554j(this, null), 0L, 86400L, TimeUnit.SECONDS);
            this.f164652b = true;
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

    private static final void h(Context context) throws C17555k {
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
            throw new C17555k("Failed to store the app set ID last used time.");
        }
    }
}
