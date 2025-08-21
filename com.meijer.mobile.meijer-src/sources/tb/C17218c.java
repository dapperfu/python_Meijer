package tb;

import Db.e;
import Db.k;
import ab.d;
import android.content.SharedPreferences;
import bb.C6346c;
import eb.C13784a;
import eb.C13785b;
import java.util.ArrayList;
import java.util.Iterator;
import xb.C18150d;

/* renamed from: tb.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17218c implements k {

    /* renamed from: f, reason: collision with root package name */
    private static final C13784a f162391f = C13785b.a(C17218c.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public C17217b f162392a;

    /* renamed from: b, reason: collision with root package name */
    public e f162393b;

    /* renamed from: c, reason: collision with root package name */
    public d f162394c;

    /* renamed from: d, reason: collision with root package name */
    private C6346c f162395d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f162396e;

    @Override // Db.k
    public final void a(String str, Object obj) {
        if (!"Registration_Properties".equals(str)) {
            if ("Push_Properties".equals(str)) {
                this.f162392a.f162383f.u();
                return;
            } else {
                if (!"Communicate_Enabled".equals(str) || this.f162393b.J()) {
                    return;
                }
                this.f162392a.f162383f.u();
                return;
            }
        }
        if (obj instanceof Gb.e) {
            Gb.e eVar = (Gb.e) obj;
            C18150d.e(eVar, 4);
            if (eVar.k()) {
                b();
                return;
            }
            C6346c c6346c = this.f162395d;
            ArrayList arrayList = new ArrayList(c6346c.f60238a.getAll().keySet());
            SharedPreferences.Editor editorEdit = c6346c.f60238a.edit();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
            editorEdit.commit();
        }
    }

    public final void b() {
        if (this.f162396e) {
            return;
        }
        this.f162396e = true;
        this.f162394c.c(this.f162392a.f162382e);
        this.f162394c.c(this.f162392a.f162386i);
        this.f162394c.c(this.f162392a.f162383f);
        this.f162394c.c(this.f162392a.f162387j);
        this.f162394c.c(this.f162392a.f162388k);
    }

    public C17218c(C17217b c17217b, d dVar, e eVar, C6346c c6346c) {
        this.f162392a = c17217b;
        this.f162394c = dVar;
        this.f162393b = eVar;
        this.f162395d = c6346c;
        eVar.h(this, "Registration_Properties");
        this.f162393b.h(this, "Push_Properties");
        this.f162393b.h(this, "Communicate_Enabled");
    }
}
