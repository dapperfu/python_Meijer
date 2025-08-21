package fsimpl;

import android.content.Context;
import android.content.SharedPreferences;
import com.fullstory.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: fsimpl.cq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14144cq {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C14140cm f133244a;

    /* renamed from: b, reason: collision with root package name */
    private final C14142co f133245b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC14143cp[] f133246c;

    private C14144cq(C14140cm c14140cm) {
        this.f133244a = c14140cm;
        C14142co c14142co = new C14142co(c14140cm, EnumC14146cs.PREVIEW_MODE);
        this.f133245b = c14142co;
        this.f133246c = new AbstractC14143cp[]{c14142co};
    }

    private List b() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC14143cp abstractC14143cp : this.f133246c) {
            if (abstractC14143cp.a()) {
                arrayList.add(abstractC14143cp.f133241a);
            }
        }
        return arrayList;
    }

    private void b(Context context) {
        if (!dO.b(context, "FULLSTORY_CONFIGURATION_OVERRIDES")) {
            Log.w("Failed to delete Configuration preferences.");
            return;
        }
        this.f133244a.f133239a = dO.a(context, "FULLSTORY_CONFIGURATION_OVERRIDES");
        Log.i("All configs reset to default values.");
    }

    private boolean c() {
        for (AbstractC14143cp abstractC14143cp : this.f133246c) {
            if (!abstractC14143cp.b()) {
                return false;
            }
        }
        return true;
    }

    private boolean d() {
        SharedPreferences.Editor editorEdit = this.f133244a.f133239a.edit();
        for (AbstractC14143cp abstractC14143cp : this.f133246c) {
            abstractC14143cp.a(editorEdit);
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
        for (AbstractC14143cp abstractC14143cp : this.f133246c) {
            abstractC14143cp.a((Comparable) null);
        }
    }

    public void a(Boolean bool) {
        this.f133245b.a(bool);
    }
}
