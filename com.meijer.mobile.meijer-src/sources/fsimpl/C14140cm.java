package fsimpl;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: fsimpl.cm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14140cm {

    /* renamed from: a, reason: collision with root package name */
    private SharedPreferences f133239a;

    public C14140cm(Context context) {
        this.f133239a = dO.a(context, "FULLSTORY_CONFIGURATION_OVERRIDES");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Boolean a(EnumC14146cs enumC14146cs) {
        if (this.f133239a.contains(enumC14146cs.f133252b)) {
            return Boolean.valueOf(this.f133239a.getBoolean(enumC14146cs.f133252b, false));
        }
        return null;
    }

    public Boolean a() {
        return a(EnumC14146cs.PREVIEW_MODE);
    }

    public C14144cq b() {
        return new C14144cq(this);
    }
}
