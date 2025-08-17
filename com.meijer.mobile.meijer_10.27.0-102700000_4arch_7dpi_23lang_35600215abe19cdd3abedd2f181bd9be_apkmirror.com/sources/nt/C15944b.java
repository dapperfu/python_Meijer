package nt;

import android.content.Context;
import gt.C14310a;
import gt.C14311b;
import ot.C16176b;
import pt.InterfaceC16417c;
import r5.C16723a;
import ut.C17318d;
import ut.InterfaceC17317c;

/* renamed from: nt.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15944b {

    /* renamed from: m, reason: collision with root package name */
    public static C15944b f152788m;

    /* renamed from: n, reason: collision with root package name */
    public static Context f152789n;

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC17317c f152790a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC16417c f152791b;

    /* renamed from: c, reason: collision with root package name */
    public qt.d f152792c;

    /* renamed from: d, reason: collision with root package name */
    public C16176b f152793d;

    /* renamed from: e, reason: collision with root package name */
    public C16723a f152794e;

    /* renamed from: f, reason: collision with root package name */
    public C17318d f152795f;

    /* renamed from: g, reason: collision with root package name */
    public C14310a f152796g;

    /* renamed from: h, reason: collision with root package name */
    public final tt.d f152797h = new tt.d();

    /* renamed from: i, reason: collision with root package name */
    private final tt.c f152798i = new tt.c(f152789n);

    /* renamed from: j, reason: collision with root package name */
    public st.b f152799j = new st.c(f152789n);

    /* renamed from: k, reason: collision with root package name */
    public C14311b f152800k;

    /* renamed from: l, reason: collision with root package name */
    public Dt.a f152801l;

    public static C15944b a() {
        if (f152789n == null) {
            throw new IllegalStateException("Android context not initialized yet. Call setApiKey before calling any other method.");
        }
        C15944b c15944b = f152788m;
        if (c15944b != null) {
            return c15944b;
        }
        throw new IllegalStateException("Processor factory initializeApplicationContext not called.");
    }
}
