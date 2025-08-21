package Se;

import Ke.s;
import We.C;
import We.t;
import Xe.k;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class e implements s {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences.Editor f34566a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34567b;

    @Override // Ke.s
    public void a(t tVar) throws IOException {
        if (!this.f34566a.putString(this.f34567b, k.b(tVar.o())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // Ke.s
    public void b(C c10) throws IOException {
        if (!this.f34566a.putString(this.f34567b, k.b(c10.o())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    public e(Context context, String str, String str2) {
        if (str != null) {
            this.f34567b = str;
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                this.f34566a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
                return;
            } else {
                this.f34566a = applicationContext.getSharedPreferences(str2, 0).edit();
                return;
            }
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }
}
