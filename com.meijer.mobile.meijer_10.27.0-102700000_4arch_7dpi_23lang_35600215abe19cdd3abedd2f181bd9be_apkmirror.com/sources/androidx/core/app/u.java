package androidx.core.app;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import java.util.Objects;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    CharSequence f53831a;

    /* renamed from: b, reason: collision with root package name */
    IconCompat f53832b;

    /* renamed from: c, reason: collision with root package name */
    String f53833c;

    /* renamed from: d, reason: collision with root package name */
    String f53834d;

    /* renamed from: e, reason: collision with root package name */
    boolean f53835e;

    /* renamed from: f, reason: collision with root package name */
    boolean f53836f;

    static class a {
        static Person a(u uVar) {
            return new Person.Builder().setName(uVar.c()).setIcon(uVar.a() != null ? uVar.a().t() : null).setUri(uVar.d()).setKey(uVar.b()).setBot(uVar.e()).setImportant(uVar.f()).build();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        CharSequence f53837a;

        /* renamed from: b, reason: collision with root package name */
        IconCompat f53838b;

        /* renamed from: c, reason: collision with root package name */
        String f53839c;

        /* renamed from: d, reason: collision with root package name */
        String f53840d;

        /* renamed from: e, reason: collision with root package name */
        boolean f53841e;

        /* renamed from: f, reason: collision with root package name */
        boolean f53842f;

        public u a() {
            return new u(this);
        }

        public b b(IconCompat iconCompat) {
            this.f53838b = iconCompat;
            return this;
        }

        public b c(CharSequence charSequence) {
            this.f53837a = charSequence;
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
        return this.f53832b;
    }

    public String b() {
        return this.f53834d;
    }

    public CharSequence c() {
        return this.f53831a;
    }

    public String d() {
        return this.f53833c;
    }

    public boolean e() {
        return this.f53835e;
    }

    public boolean f() {
        return this.f53836f;
    }

    public String g() {
        String str = this.f53833c;
        if (str != null) {
            return str;
        }
        if (this.f53831a == null) {
            return "";
        }
        return "name:" + ((Object) this.f53831a);
    }

    public Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f53831a);
        IconCompat iconCompat = this.f53832b;
        bundle.putBundle(BarcodePickDeserializer.FIELD_ICON, iconCompat != null ? iconCompat.s() : null);
        bundle.putString("uri", this.f53833c);
        bundle.putString("key", this.f53834d);
        bundle.putBoolean("isBot", this.f53835e);
        bundle.putBoolean("isImportant", this.f53836f);
        return bundle;
    }

    u(b bVar) {
        this.f53831a = bVar.f53837a;
        this.f53832b = bVar.f53838b;
        this.f53833c = bVar.f53839c;
        this.f53834d = bVar.f53840d;
        this.f53835e = bVar.f53841e;
        this.f53836f = bVar.f53842f;
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
