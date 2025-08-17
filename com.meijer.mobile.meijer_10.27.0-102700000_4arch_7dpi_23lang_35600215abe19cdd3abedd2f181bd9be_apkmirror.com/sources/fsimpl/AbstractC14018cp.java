package fsimpl;

import android.content.SharedPreferences;
import com.fullstory.util.Log;

/* renamed from: fsimpl.cp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
abstract class AbstractC14018cp {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC14021cs f131991a;

    /* renamed from: b, reason: collision with root package name */
    private final Comparable f131992b;

    /* renamed from: c, reason: collision with root package name */
    private Comparable f131993c;

    AbstractC14018cp(EnumC14021cs enumC14021cs, Comparable comparable) {
        this.f131991a = enumC14021cs;
        this.f131992b = comparable;
        this.f131993c = comparable;
    }

    void a(SharedPreferences.Editor editor) {
        if (this.f131993c == null) {
            Log.i("Resetting " + this.f131991a.f132002b + " config to default value");
            editor.remove(this.f131991a.f132002b);
        } else {
            Log.i("Overriding " + this.f131991a.f132002b + " config to " + this.f131993c);
            a(editor, this.f131991a.f132002b, this.f131993c);
        }
    }

    abstract void a(SharedPreferences.Editor editor, String str, Comparable comparable);

    void a(Comparable comparable) {
        this.f131993c = comparable;
    }

    boolean a() {
        Comparable comparable = this.f131992b;
        if (comparable == null) {
            return this.f131993c != null;
        }
        Comparable comparable2 = this.f131993c;
        return comparable2 == null || comparable.compareTo(comparable2) != 0;
    }

    boolean b() {
        return this.f131993c == null;
    }
}
