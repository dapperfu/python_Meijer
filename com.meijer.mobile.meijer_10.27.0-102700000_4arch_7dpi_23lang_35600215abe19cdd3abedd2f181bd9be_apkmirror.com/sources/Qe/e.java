package Qe;

import Ie.s;
import Ue.C;
import Ue.t;
import Ve.k;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;

/* loaded from: classes7.dex */
public final class e implements s {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences.Editor f30016a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30017b;

    @Override // Ie.s
    public void a(C c10) throws IOException {
        if (!this.f30016a.putString(this.f30017b, k.b(c10.o())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // Ie.s
    public void b(t tVar) throws IOException {
        if (!this.f30016a.putString(this.f30017b, k.b(tVar.o())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    public e(Context context, String str, String str2) {
        if (str != null) {
            this.f30017b = str;
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                this.f30016a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
                return;
            } else {
                this.f30016a = applicationContext.getSharedPreferences(str2, 0).edit();
                return;
            }
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }
}
