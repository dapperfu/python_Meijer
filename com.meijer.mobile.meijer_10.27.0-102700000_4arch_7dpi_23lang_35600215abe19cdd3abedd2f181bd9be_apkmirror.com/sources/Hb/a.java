package Hb;

import Bb.e;
import Bb.k;
import cb.C6380a;
import cb.C6381b;

/* loaded from: classes4.dex */
public class a implements k {

    /* renamed from: a, reason: collision with root package name */
    private final C6380a f12372a = C6381b.a(a.class.getSimpleName());

    /* renamed from: b, reason: collision with root package name */
    public e f12373b;

    /* renamed from: c, reason: collision with root package name */
    public String f12374c;

    @Override // Bb.k
    public final void a(String str, Object obj) {
        if ("Registration_Properties".equals(str)) {
            if (obj == null) {
                this.f12374c = null;
            } else {
                this.f12374c = ((Eb.e) obj).e();
            }
        }
    }

    public final String b(String str) {
        return String.format("%s%s%s", this.f12373b.V(), "v10/", str);
    }

    public a(e eVar) {
        this.f12373b = eVar;
        if (eVar.x() != null) {
            this.f12374c = eVar.x().e();
        }
        this.f12373b.h(this, "Registration_Properties");
    }
}
