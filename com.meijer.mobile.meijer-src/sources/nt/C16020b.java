package nt;

import android.content.Context;
import gt.C14406a;
import gt.C14407b;
import ot.C16318b;
import pt.InterfaceC16543c;
import s5.C17020a;
import ut.C17470d;
import ut.InterfaceC17469c;

/* renamed from: nt.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C16020b {

    /* renamed from: m, reason: collision with root package name */
    public static C16020b f153240m;

    /* renamed from: n, reason: collision with root package name */
    public static Context f153241n;

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC17469c f153242a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC16543c f153243b;

    /* renamed from: c, reason: collision with root package name */
    public qt.d f153244c;

    /* renamed from: d, reason: collision with root package name */
    public C16318b f153245d;

    /* renamed from: e, reason: collision with root package name */
    public C17020a f153246e;

    /* renamed from: f, reason: collision with root package name */
    public C17470d f153247f;

    /* renamed from: g, reason: collision with root package name */
    public C14406a f153248g;

    /* renamed from: h, reason: collision with root package name */
    public final tt.d f153249h = new tt.d();

    /* renamed from: i, reason: collision with root package name */
    private final tt.c f153250i = new tt.c(f153241n);

    /* renamed from: j, reason: collision with root package name */
    public st.b f153251j = new st.c(f153241n);

    /* renamed from: k, reason: collision with root package name */
    public C14407b f153252k;

    /* renamed from: l, reason: collision with root package name */
    public Dt.a f153253l;

    public static C16020b a() {
        if (f153241n == null) {
            throw new IllegalStateException("Android context not initialized yet. Call setApiKey before calling any other method.");
        }
        C16020b c16020b = f153240m;
        if (c16020b != null) {
            return c16020b;
        }
        throw new IllegalStateException("Processor factory initializeApplicationContext not called.");
    }
}
