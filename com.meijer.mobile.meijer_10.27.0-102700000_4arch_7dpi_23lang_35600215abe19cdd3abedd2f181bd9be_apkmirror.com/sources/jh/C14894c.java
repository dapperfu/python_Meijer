package jh;

import android.app.Application;
import java.util.ArrayList;
import mh.C15620a;

/* renamed from: jh.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C14894c {

    /* renamed from: a, reason: collision with root package name */
    private Application f139593a;

    /* renamed from: b, reason: collision with root package name */
    private C15620a f139594b;

    public InterfaceC14896e a() {
        ArrayList arrayList = new ArrayList();
        C15620a c15620a = this.f139594b;
        if (c15620a != null) {
            arrayList.add(new C14893b(c15620a));
        }
        Application application = this.f139593a;
        if (application != null) {
            arrayList.add(new C14892a(application));
        }
        arrayList.add(new C14897f());
        int i10 = 0;
        while (i10 < arrayList.size() - 1) {
            C14895d c14895d = (C14895d) arrayList.get(i10);
            i10++;
            c14895d.e((C14895d) arrayList.get(i10));
        }
        return (InterfaceC14896e) arrayList.get(0);
    }

    public void b(Application application) {
        this.f139593a = application;
    }

    public void c(C15620a c15620a) {
        this.f139594b = c15620a;
    }
}
