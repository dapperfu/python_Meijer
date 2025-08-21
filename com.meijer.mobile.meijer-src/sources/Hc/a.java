package Hc;

import android.text.TextUtils;
import java.util.List;

/* loaded from: classes4.dex */
public final class a extends com.google.android.gms.ads.c {

    /* renamed from: Hc.a$a, reason: collision with other inner class name */
    public static final class C0201a extends com.google.android.gms.ads.a<C0201a> {
        @Override // com.google.android.gms.ads.a
        public final /* bridge */ /* synthetic */ com.google.android.gms.ads.a c() {
            return this;
        }

        public C0201a g(String str, String str2) {
            this.f65387a.p(str, str2);
            return this;
        }

        public C0201a h(String str, List<String> list) {
            if (list != null) {
                this.f65387a.p(str, TextUtils.join(",", list));
            }
            return this;
        }

        public a i() {
            return new a(this, null);
        }
    }

    /* synthetic */ a(C0201a c0201a, d dVar) {
        super(c0201a);
    }
}
