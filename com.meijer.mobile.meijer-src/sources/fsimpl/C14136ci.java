package fsimpl;

import android.content.res.Resources;
import android.util.LruCache;
import java.util.Map;
import java.util.Set;

/* renamed from: fsimpl.ci, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C14136ci extends AbstractC14135ch {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f133173a;

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC14130cc f133174b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f133175c;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    static {
        /*
            java.lang.Class<android.graphics.Typeface> r0 = android.graphics.Typeface.class
            java.lang.String r1 = "sDynamicTypefaceCache"
            r2 = 28
            r3 = 30
            java.lang.reflect.Field r0 = fsimpl.fT.a(r2, r3, r0, r1)
            r1 = 0
            java.lang.Object r0 = fsimpl.fT.a(r0, r1)
            fsimpl.cc r0 = a(r0)
            fsimpl.C14136ci.f133174b = r0
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 25
            r6 = 1
            r7 = 0
            if (r4 <= r5) goto L42
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 26
            if (r4 == r5) goto L2f
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 27
            if (r4 != r5) goto L2c
            goto L2f
        L2c:
            java.lang.String r4 = "sDynamicCacheLock"
            goto L31
        L2f:
            java.lang.String r4 = "sLock"
        L31:
            java.lang.Class<android.graphics.Typeface> r5 = android.graphics.Typeface.class
            java.lang.reflect.Field r2 = fsimpl.fT.a(r2, r3, r5, r4)
            java.lang.Object r1 = fsimpl.fT.a(r2, r1)
            fsimpl.C14136ci.f133175c = r1
            if (r0 == 0) goto L47
            if (r1 == 0) goto L47
            goto L48
        L42:
            fsimpl.C14136ci.f133175c = r1
            if (r0 == 0) goto L47
            goto L48
        L47:
            r6 = 0
        L48:
            fsimpl.C14136ci.f133173a = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fsimpl.C14136ci.<clinit>():void");
    }

    C14136ci() {
    }

    private static InterfaceC14130cc a(Object obj) {
        if (obj instanceof LruCache) {
            return new C14129cb((LruCache) obj);
        }
        return null;
    }

    @Override // fsimpl.AbstractC14135ch
    public void a(Map map, Set set, Resources resources) {
        if (a()) {
            Object obj = f133175c;
            if (obj == null) {
                a(map, set, resources, f133174b);
            } else {
                synchronized (obj) {
                    a(map, set, resources, f133174b);
                }
            }
        }
    }

    @Override // fsimpl.AbstractC14135ch
    protected boolean a() {
        if (f133173a) {
            return super.a();
        }
        return false;
    }

    @Override // fsimpl.AbstractC14135ch
    protected boolean b() {
        return true;
    }
}
