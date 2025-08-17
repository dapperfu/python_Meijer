package fsimpl;

import android.content.Context;
import android.content.SharedPreferences;
import com.fullstory.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: fsimpl.cq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C14019cq {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C14015cm f131994a;

    /* renamed from: b, reason: collision with root package name */
    private final C14017co f131995b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC14018cp[] f131996c;

    private C14019cq(C14015cm c14015cm) {
        this.f131994a = c14015cm;
        C14017co c14017co = new C14017co(c14015cm, EnumC14021cs.PREVIEW_MODE);
        this.f131995b = c14017co;
        this.f131996c = new AbstractC14018cp[]{c14017co};
    }

    private List b() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC14018cp abstractC14018cp : this.f131996c) {
            if (abstractC14018cp.a()) {
                arrayList.add(abstractC14018cp.f131991a);
            }
        }
        return arrayList;
    }

    private void b(Context context) {
        if (!dO.b(context, "FULLSTORY_CONFIGURATION_OVERRIDES")) {
            Log.w("Failed to delete Configuration preferences.");
            return;
        }
        this.f131994a.f131989a = dO.a(context, "FULLSTORY_CONFIGURATION_OVERRIDES");
        Log.i("All configs reset to default values.");
    }

    private boolean c() {
        for (AbstractC14018cp abstractC14018cp : this.f131996c) {
            if (!abstractC14018cp.b()) {
                return false;
            }
        }
        return true;
    }

    private boolean d() {
        SharedPreferences.Editor editorEdit = this.f131994a.f131989a.edit();
        for (AbstractC14018cp abstractC14018cp : this.f131996c) {
            abstractC14018cp.a(editorEdit);
        }
        return editorEdit.commit();
    }

    public List a(Context context) {
        List listB = b();
        if (listB.isEmpty()) {
            return listB;
        }
        if (c()) {
            b(context);
            return listB;
        }
        if (d()) {
            return listB;
        }
        Log.w("Failed to commit FSConfig changes.");
        return Collections.emptyList();
    }

    public void a() {
        for (AbstractC14018cp abstractC14018cp : this.f131996c) {
            abstractC14018cp.a((Comparable) null);
        }
    }

    public void a(Boolean bool) {
        this.f131995b.a(bool);
    }
}
