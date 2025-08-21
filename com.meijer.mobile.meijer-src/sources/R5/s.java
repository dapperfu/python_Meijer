package R5;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes4.dex */
class s implements InterfaceC5121h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f31940a = "s";

    @Override // R5.InterfaceC5121h
    public v a(String str) {
        if (str == null || str.isEmpty()) {
            t.b("Services", f31940a, String.format("Failed to create an instance of NamedCollection with name - %s: the collection name is null or empty.", str), new Object[0]);
            return null;
        }
        Context applicationContext = K.f().a().getApplicationContext();
        if (applicationContext == null) {
            t.b("Services", f31940a, String.format("Failed to create an instance of NamedCollection with name - %s: the ApplicationContext is null", str), new Object[0]);
            return null;
        }
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(str, 0);
        SharedPreferences.Editor editorEdit = sharedPreferences != null ? sharedPreferences.edit() : null;
        if (sharedPreferences != null && editorEdit != null) {
            return new L(sharedPreferences, editorEdit);
        }
        t.b("Services", f31940a, "Failed to create a valid SharedPreferences object or SharedPreferences.Editor object", new Object[0]);
        return null;
    }

    s() {
    }
}
