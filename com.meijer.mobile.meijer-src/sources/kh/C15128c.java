package kh;

import android.app.Application;
import java.util.ArrayList;
import nh.C15943a;

/* renamed from: kh.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C15128c {

    /* renamed from: a, reason: collision with root package name */
    private Application f141848a;

    /* renamed from: b, reason: collision with root package name */
    private C15943a f141849b;

    public InterfaceC15130e a() {
        ArrayList arrayList = new ArrayList();
        C15943a c15943a = this.f141849b;
        if (c15943a != null) {
            arrayList.add(new C15127b(c15943a));
        }
        Application application = this.f141848a;
        if (application != null) {
            arrayList.add(new C15126a(application));
        }
        arrayList.add(new C15131f());
        int i10 = 0;
        while (i10 < arrayList.size() - 1) {
            C15129d c15129d = (C15129d) arrayList.get(i10);
            i10++;
            c15129d.e((C15129d) arrayList.get(i10));
        }
        return (InterfaceC15130e) arrayList.get(0);
    }

    public void b(Application application) {
        this.f141848a = application;
    }

    public void c(C15943a c15943a) {
        this.f141849b = c15943a;
    }
}
