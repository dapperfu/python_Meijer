package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.o6;

/* loaded from: classes8.dex */
class k8 {

    /* renamed from: a, reason: collision with root package name */
    private final o6 f93287a;

    /* renamed from: b, reason: collision with root package name */
    private final String f93288b;

    /* renamed from: c, reason: collision with root package name */
    private o6.a f93289c;

    class a implements o6.a {
        a() {
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(i6 i6Var) {
            if (k8.this.f93289c != null) {
                k8.this.f93289c.a(i6Var);
            }
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(k6 k6Var) {
            if (k8.this.f93289c != null) {
                k8.this.f93289c.a(k6Var);
            }
        }
    }

    k8(o6 o6Var, String str) {
        this.f93287a = o6Var;
        this.f93288b = str;
    }

    protected void a(o6.a aVar) {
        this.f93289c = aVar;
        if (!TextUtils.isEmpty(this.f93288b)) {
            this.f93287a.a(this.f93288b, null, null, s4.f().i().a().a().intValue(), new a());
            return;
        }
        o6.a aVar2 = this.f93289c;
        if (aVar2 != null) {
            aVar2.a((i6) null);
        }
    }
}
