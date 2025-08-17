package fsimpl;

import java.lang.ref.WeakReference;

/* loaded from: classes14.dex */
public class aF {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f131463a;

    /* renamed from: b, reason: collision with root package name */
    public final aK f131464b;

    /* renamed from: c, reason: collision with root package name */
    public final aF f131465c;

    /* renamed from: d, reason: collision with root package name */
    public aF f131466d;

    /* renamed from: e, reason: collision with root package name */
    public final int f131467e;

    private aF(Object obj, aK aKVar, aF aFVar, int i10) {
        this.f131463a = new WeakReference(obj);
        this.f131464b = aKVar;
        this.f131465c = aFVar;
        this.f131467e = i10;
        if (aFVar != null) {
            aFVar.f131466d = this;
        }
    }

    public static aF a(Object obj, aK aKVar, aF aFVar, int i10) {
        return new aF(obj, aKVar, aFVar, i10);
    }
}
