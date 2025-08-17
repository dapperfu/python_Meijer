package zb;

import Bb.e;
import Bb.k;
import cb.C6380a;
import cb.C6381b;

/* renamed from: zb.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18414b implements k {

    /* renamed from: c, reason: collision with root package name */
    private static final C6380a f171709c = C6381b.a(C18414b.class.getName());

    /* renamed from: a, reason: collision with root package name */
    e f171710a;

    /* renamed from: b, reason: collision with root package name */
    Bb.b f171711b;

    @Override // Bb.k
    public final void a(String str, Object obj) {
        if (str == "Communicate_Enabled" || str == "Push_Properties" || str == "allowCommunicate" || str == "sendPlaceStateToServer") {
            this.f171710a.B(this.f171710a.J() && this.f171710a.M() && this.f171711b.s() && this.f171711b.u());
        }
    }

    public C18414b(e eVar, Bb.b bVar) {
        this.f171710a = eVar;
        this.f171711b = bVar;
        eVar.h(this, "Communicate_Enabled", "Push_Properties");
        this.f171711b.g(this, "allowCommunicate", "sendPlaceStateToServer");
    }
}
