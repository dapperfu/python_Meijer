package Q5;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes4.dex */
class s implements InterfaceC5076h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f29829a = "s";

    @Override // Q5.InterfaceC5076h
    public v a(String str) {
        if (str == null || str.isEmpty()) {
            t.b("Services", f29829a, String.format("Failed to create an instance of NamedCollection with name - %s: the collection name is null or empty.", str), new Object[0]);
            return null;
        }
        Context applicationContext = K.f().a().getApplicationContext();
        if (applicationContext == null) {
            t.b("Services", f29829a, String.format("Failed to create an instance of NamedCollection with name - %s: the ApplicationContext is null", str), new Object[0]);
            return null;
        }
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(str, 0);
        SharedPreferences.Editor editorEdit = sharedPreferences != null ? sharedPreferences.edit() : null;
        if (sharedPreferences != null && editorEdit != null) {
            return new L(sharedPreferences, editorEdit);
        }
        t.b("Services", f29829a, "Failed to create a valid SharedPreferences object or SharedPreferences.Editor object", new Object[0]);
        return null;
    }

    s() {
    }
}
