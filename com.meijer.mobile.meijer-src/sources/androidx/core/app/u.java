package androidx.core.app;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import java.util.Objects;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    CharSequence f54055a;

    /* renamed from: b, reason: collision with root package name */
    IconCompat f54056b;

    /* renamed from: c, reason: collision with root package name */
    String f54057c;

    /* renamed from: d, reason: collision with root package name */
    String f54058d;

    /* renamed from: e, reason: collision with root package name */
    boolean f54059e;

    /* renamed from: f, reason: collision with root package name */
    boolean f54060f;

    static class a {
        static Person a(u uVar) {
            return new Person.Builder().setName(uVar.c()).setIcon(uVar.a() != null ? uVar.a().t() : null).setUri(uVar.d()).setKey(uVar.b()).setBot(uVar.e()).setImportant(uVar.f()).build();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        CharSequence f54061a;

        /* renamed from: b, reason: collision with root package name */
        IconCompat f54062b;

        /* renamed from: c, reason: collision with root package name */
        String f54063c;

        /* renamed from: d, reason: collision with root package name */
        String f54064d;

        /* renamed from: e, reason: collision with root package name */
        boolean f54065e;

        /* renamed from: f, reason: collision with root package name */
        boolean f54066f;

        public u a() {
            return new u(this);
        }

        public b b(IconCompat iconCompat) {
            this.f54062b = iconCompat;
            return this;
        }

        public b c(CharSequence charSequence) {
            this.f54061a = charSequence;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        String strB = b();
        String strB2 = uVar.b();
        return (strB == null && strB2 == null) ? Objects.equals(Objects.toString(c()), Objects.toString(uVar.c())) && Objects.equals(d(), uVar.d()) && Boolean.valueOf(e()).equals(Boolean.valueOf(uVar.e())) && Boolean.valueOf(f()).equals(Boolean.valueOf(uVar.f())) : Objects.equals(strB, strB2);
    }

    public IconCompat a() {
        return this.f54056b;
    }

    public String b() {
        return this.f54058d;
    }

    public CharSequence c() {
        return this.f54055a;
    }

    public String d() {
        return this.f54057c;
    }

    public boolean e() {
        return this.f54059e;
    }

    public boolean f() {
        return this.f54060f;
    }

    public String g() {
        String str = this.f54057c;
        if (str != null) {
            return str;
        }
        if (this.f54055a == null) {
            return "";
        }
        return "name:" + ((Object) this.f54055a);
    }

    public Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f54055a);
        IconCompat iconCompat = this.f54056b;
        bundle.putBundle(BarcodePickDeserializer.FIELD_ICON, iconCompat != null ? iconCompat.s() : null);
        bundle.putString("uri", this.f54057c);
        bundle.putString("key", this.f54058d);
        bundle.putBoolean("isBot", this.f54059e);
        bundle.putBoolean("isImportant", this.f54060f);
        return bundle;
    }

    u(b bVar) {
        this.f54055a = bVar.f54061a;
        this.f54056b = bVar.f54062b;
        this.f54057c = bVar.f54063c;
        this.f54058d = bVar.f54064d;
        this.f54059e = bVar.f54065e;
        this.f54060f = bVar.f54066f;
    }

    public Person h() {
        return a.a(this);
    }

    public int hashCode() {
        String strB = b();
        if (strB != null) {
            return strB.hashCode();
        }
        return Objects.hash(c(), d(), Boolean.valueOf(e()), Boolean.valueOf(f()));
    }
}
