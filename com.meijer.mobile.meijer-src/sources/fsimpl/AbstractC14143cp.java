package fsimpl;

import android.content.SharedPreferences;
import com.fullstory.util.Log;

/* renamed from: fsimpl.cp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
abstract class AbstractC14143cp {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC14146cs f133241a;

    /* renamed from: b, reason: collision with root package name */
    private final Comparable f133242b;

    /* renamed from: c, reason: collision with root package name */
    private Comparable f133243c;

    AbstractC14143cp(EnumC14146cs enumC14146cs, Comparable comparable) {
        this.f133241a = enumC14146cs;
        this.f133242b = comparable;
        this.f133243c = comparable;
    }

    void a(SharedPreferences.Editor editor) {
        if (this.f133243c == null) {
            Log.i("Resetting " + this.f133241a.f133252b + " config to default value");
            editor.remove(this.f133241a.f133252b);
        } else {
            Log.i("Overriding " + this.f133241a.f133252b + " config to " + this.f133243c);
            a(editor, this.f133241a.f133252b, this.f133243c);
        }
    }

    abstract void a(SharedPreferences.Editor editor, String str, Comparable comparable);

    void a(Comparable comparable) {
        this.f133243c = comparable;
    }

    boolean a() {
        Comparable comparable = this.f133242b;
        if (comparable == null) {
            return this.f133243c != null;
        }
        Comparable comparable2 = this.f133243c;
        return comparable2 == null || comparable.compareTo(comparable2) != 0;
    }

    boolean b() {
        return this.f133243c == null;
    }
}
