package R5;

/* loaded from: classes4.dex */
public abstract class n {
    public abstract void a();

    public abstract void b();

    public abstract void c();

    public abstract boolean e(C5117d c5117d);

    public abstract void f();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31927a;

        static {
            int[] iArr = new int[com.adobe.marketing.mobile.D.values().length];
            f31927a = iArr;
            try {
                iArr[com.adobe.marketing.mobile.D.OPT_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31927a[com.adobe.marketing.mobile.D.OPT_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public void d(com.adobe.marketing.mobile.D d10) {
        int i10 = a.f31927a[d10.ordinal()];
        if (i10 == 1) {
            a();
        } else if (i10 != 2) {
            f();
        } else {
            f();
            b();
        }
    }
}
