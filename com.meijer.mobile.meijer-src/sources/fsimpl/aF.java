package fsimpl;

import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public class aF {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f132713a;

    /* renamed from: b, reason: collision with root package name */
    public final aK f132714b;

    /* renamed from: c, reason: collision with root package name */
    public final aF f132715c;

    /* renamed from: d, reason: collision with root package name */
    public aF f132716d;

    /* renamed from: e, reason: collision with root package name */
    public final int f132717e;

    private aF(Object obj, aK aKVar, aF aFVar, int i10) {
        this.f132713a = new WeakReference(obj);
        this.f132714b = aKVar;
        this.f132715c = aFVar;
        this.f132717e = i10;
        if (aFVar != null) {
            aFVar.f132716d = this;
        }
    }

    public static aF a(Object obj, aK aKVar, aF aFVar, int i10) {
        return new aF(obj, aKVar, aFVar, i10);
    }
}
