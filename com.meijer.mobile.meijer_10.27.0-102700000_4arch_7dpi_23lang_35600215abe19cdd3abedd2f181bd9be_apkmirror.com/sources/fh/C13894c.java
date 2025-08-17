package fh;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: fh.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C13894c {

    /* renamed from: a, reason: collision with root package name */
    protected com.google.zxing.m f131098a;

    /* renamed from: b, reason: collision with root package name */
    protected r f131099b;

    /* renamed from: c, reason: collision with root package name */
    private final int f131100c = 2;

    public static List<com.google.zxing.o> e(List<com.google.zxing.o> list, r rVar) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<com.google.zxing.o> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(rVar.f(it.next()));
        }
        return arrayList;
    }

    public com.google.zxing.a a() {
        return this.f131098a.b();
    }

    public Bitmap b() {
        return this.f131099b.b(null, 2);
    }

    public byte[] c() {
        return this.f131098a.c();
    }

    public Map<com.google.zxing.n, Object> d() {
        return this.f131098a.d();
    }

    public String toString() {
        return this.f131098a.f();
    }

    public C13894c(com.google.zxing.m mVar, r rVar) {
        this.f131098a = mVar;
        this.f131099b = rVar;
    }
}
