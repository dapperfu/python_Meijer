package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.f0;
import com.medallia.digital.mobilesdk.o6;
import java.io.InputStream;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class e7 extends f0<String> {

    class a extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f92753a;

        a(String str) {
            this.f92753a = str;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            a4.b("Status: " + e7.this.h());
            if (e7.this.g() != null) {
                try {
                    e7.this.g().a(new k6(e7.this.h(), this.f92753a));
                } catch (Exception e10) {
                    a4.c(e10.getMessage());
                }
            }
        }
    }

    protected e7(f0.d dVar, String str, HashMap<String, String> map, JSONObject jSONObject, int i10, o6.a aVar) {
        super(dVar, str, map, jSONObject, i10, aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.f0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String b(InputStream inputStream) {
        try {
            return x8.a(inputStream).toString("UTF-8");
        } catch (Exception unused) {
            a(-44);
            return null;
        }
    }

    protected e7(f0.d dVar, String str, HashMap<String, String> map, JSONObject jSONObject, String str2, int i10, o6.a aVar) {
        super(dVar, str, map, jSONObject, str2, i10, aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.f0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(String str) {
        w7.b().a().execute(new a(str));
    }
}
