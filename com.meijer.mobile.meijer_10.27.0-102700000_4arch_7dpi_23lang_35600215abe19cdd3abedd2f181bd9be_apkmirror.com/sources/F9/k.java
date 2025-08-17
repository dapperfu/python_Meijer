package F9;

import android.content.Context;
import android.content.SharedPreferences;
import b9.C6214c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"LF9/k;", "", "Landroid/content/Context;", "context", "", "fileName", "Landroid/content/SharedPreferences;", "oldSharedPreferences", "Lb9/c;", "crypto", "LF9/g;", "migration", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/SharedPreferences;Lb9/c;LF9/g;)V", "a", "()Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "sharedPreferences", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private SharedPreferences sharedPreferences;

    public k(Context context, String fileName, SharedPreferences oldSharedPreferences, C6214c crypto, g migration) {
        Intrinsics.j(context, "context");
        Intrinsics.j(fileName, "fileName");
        Intrinsics.j(oldSharedPreferences, "oldSharedPreferences");
        Intrinsics.j(crypto, "crypto");
        Intrinsics.j(migration, "migration");
        e eVar = new e(context, fileName, crypto);
        this.sharedPreferences = eVar;
        migration.a(oldSharedPreferences, eVar);
    }

    /* renamed from: a, reason: from getter */
    public final SharedPreferences getSharedPreferences() {
        return this.sharedPreferences;
    }
}
