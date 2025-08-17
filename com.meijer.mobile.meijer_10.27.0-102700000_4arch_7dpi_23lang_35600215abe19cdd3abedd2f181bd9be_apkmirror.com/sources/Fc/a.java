package Fc;

import android.text.TextUtils;
import java.util.List;

/* loaded from: classes4.dex */
public final class a extends com.google.android.gms.ads.c {

    /* renamed from: Fc.a$a, reason: collision with other inner class name */
    public static final class C0145a extends com.google.android.gms.ads.a<C0145a> {
        @Override // com.google.android.gms.ads.a
        public final /* bridge */ /* synthetic */ com.google.android.gms.ads.a c() {
            return this;
        }

        public C0145a g(String str, String str2) {
            this.f64547a.p(str, str2);
            return this;
        }

        public C0145a h(String str, List<String> list) {
            if (list != null) {
                this.f64547a.p(str, TextUtils.join(",", list));
            }
            return this;
        }

        public a i() {
            return new a(this, null);
        }
    }

    /* synthetic */ a(C0145a c0145a, d dVar) {
        super(c0145a);
    }
}
