package rb;

import Bb.e;
import Bb.k;
import Ya.d;
import android.content.SharedPreferences;
import cb.C6380a;
import cb.C6381b;
import java.util.ArrayList;
import java.util.Iterator;
import vb.C17538d;

/* renamed from: rb.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16744c implements k {

    /* renamed from: f, reason: collision with root package name */
    private static final C6380a f157901f = C6381b.a(C16744c.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public C16743b f157902a;

    /* renamed from: b, reason: collision with root package name */
    public e f157903b;

    /* renamed from: c, reason: collision with root package name */
    public d f157904c;

    /* renamed from: d, reason: collision with root package name */
    private Za.c f157905d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f157906e;

    @Override // Bb.k
    public final void a(String str, Object obj) {
        if (!"Registration_Properties".equals(str)) {
            if ("Push_Properties".equals(str)) {
                this.f157902a.f157893f.u();
                return;
            } else {
                if (!"Communicate_Enabled".equals(str) || this.f157903b.J()) {
                    return;
                }
                this.f157902a.f157893f.u();
                return;
            }
        }
        if (obj instanceof Eb.e) {
            Eb.e eVar = (Eb.e) obj;
            C17538d.e(eVar, 4);
            if (eVar.k()) {
                b();
                return;
            }
            Za.c cVar = this.f157905d;
            ArrayList arrayList = new ArrayList(cVar.f42571a.getAll().keySet());
            SharedPreferences.Editor editorEdit = cVar.f42571a.edit();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
            editorEdit.commit();
        }
    }

    public final void b() {
        if (this.f157906e) {
            return;
        }
        this.f157906e = true;
        this.f157904c.c(this.f157902a.f157892e);
        this.f157904c.c(this.f157902a.f157896i);
        this.f157904c.c(this.f157902a.f157893f);
        this.f157904c.c(this.f157902a.f157897j);
        this.f157904c.c(this.f157902a.f157898k);
    }

    public C16744c(C16743b c16743b, d dVar, e eVar, Za.c cVar) {
        this.f157902a = c16743b;
        this.f157904c = dVar;
        this.f157903b = eVar;
        this.f157905d = cVar;
        eVar.h(this, "Registration_Properties");
        this.f157903b.h(this, "Push_Properties");
        this.f157903b.h(this, "Communicate_Enabled");
    }
}
