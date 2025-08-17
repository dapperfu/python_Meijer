package F9;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import androidx.security.crypto.a;
import androidx.security.crypto.c;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, d2 = {"LF9/j;", "", "Landroid/content/Context;", "context", "", "fileName", "Landroid/content/SharedPreferences;", "oldSharedPreferences", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/SharedPreferences;)V", "Landroidx/security/crypto/c;", "a", "(Landroid/content/Context;)Landroidx/security/crypto/c;", "b", "()Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "sharedPreferences", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private SharedPreferences sharedPreferences;

    public j(Context context, String fileName, SharedPreferences oldSharedPreferences) throws GeneralSecurityException {
        SharedPreferences sharedPreferencesA;
        Intrinsics.j(context, "context");
        Intrinsics.j(fileName, "fileName");
        Intrinsics.j(oldSharedPreferences, "oldSharedPreferences");
        try {
            sharedPreferencesA = androidx.security.crypto.a.a(context, fileName, a(context), a.d.AES256_SIV, a.e.AES256_GCM);
            Intrinsics.g(sharedPreferencesA);
        } catch (Exception unused) {
            sharedPreferencesA = f.INSTANCE.a(fileName, context);
        }
        this.sharedPreferences = sharedPreferencesA;
        Map<String, ?> all = oldSharedPreferences.getAll();
        Intrinsics.i(all, "getAll(...)");
        if (all.isEmpty()) {
            return;
        }
        Map<String, ?> all2 = oldSharedPreferences.getAll();
        Intrinsics.i(all2, "getAll(...)");
        for (Map.Entry entry : MapsKt.E(all2)) {
            SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
            Object value = entry.getValue();
            if (value instanceof Integer) {
                String str = (String) entry.getKey();
                Object value2 = entry.getValue();
                Intrinsics.h(value2, "null cannot be cast to non-null type kotlin.Int");
                editorEdit.putInt(str, ((Integer) value2).intValue());
            } else if (value instanceof Boolean) {
                String str2 = (String) entry.getKey();
                Object value3 = entry.getValue();
                Intrinsics.h(value3, "null cannot be cast to non-null type kotlin.Boolean");
                editorEdit.putBoolean(str2, ((Boolean) value3).booleanValue());
            } else if (value instanceof Float) {
                String str3 = (String) entry.getKey();
                Object value4 = entry.getValue();
                Intrinsics.h(value4, "null cannot be cast to non-null type kotlin.Float");
                editorEdit.putFloat(str3, ((Float) value4).floatValue());
            } else if (value instanceof Long) {
                String str4 = (String) entry.getKey();
                Object value5 = entry.getValue();
                Intrinsics.h(value5, "null cannot be cast to non-null type kotlin.Long");
                editorEdit.putLong(str4, ((Long) value5).longValue());
            } else if (value instanceof String) {
                String str5 = (String) entry.getKey();
                Object value6 = entry.getValue();
                Intrinsics.h(value6, "null cannot be cast to non-null type kotlin.String");
                editorEdit.putString(str5, (String) value6);
            } else {
                I9.e.INSTANCE.c(new J9.k(editorEdit.getClass(), "sharedPreferencesProvider#migrationToSecure", MapsKt.g(TuplesKt.a(entry.getKey(), entry.getValue())), null, 8, null));
                Unit unit = Unit.f142422a;
            }
            editorEdit.commit();
        }
        oldSharedPreferences.edit().clear().commit();
    }

    private final androidx.security.crypto.c a(Context context) throws GeneralSecurityException, IOException {
        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
        Intrinsics.i(keyGenParameterSpecBuild, "build(...)");
        androidx.security.crypto.c cVarA = new c.a(context).b(keyGenParameterSpecBuild).a();
        Intrinsics.i(cVarA, "build(...)");
        return cVarA;
    }

    /* renamed from: b, reason: from getter */
    public final SharedPreferences getSharedPreferences() {
        return this.sharedPreferences;
    }
}
