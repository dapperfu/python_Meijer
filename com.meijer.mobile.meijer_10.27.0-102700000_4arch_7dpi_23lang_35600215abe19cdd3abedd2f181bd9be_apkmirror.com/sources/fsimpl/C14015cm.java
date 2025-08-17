package fsimpl;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: fsimpl.cm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C14015cm {

    /* renamed from: a, reason: collision with root package name */
    private SharedPreferences f131989a;

    public C14015cm(Context context) {
        this.f131989a = dO.a(context, "FULLSTORY_CONFIGURATION_OVERRIDES");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Boolean a(EnumC14021cs enumC14021cs) {
        if (this.f131989a.contains(enumC14021cs.f132002b)) {
            return Boolean.valueOf(this.f131989a.getBoolean(enumC14021cs.f132002b, false));
        }
        return null;
    }

    public Boolean a() {
        return a(EnumC14021cs.PREVIEW_MODE);
    }

    public C14019cq b() {
        return new C14019cq(this);
    }
}
