package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.f0;
import com.medallia.digital.mobilesdk.o6;
import java.io.InputStream;
import java.util.HashMap;

/* loaded from: classes7.dex */
class i0 extends f0<byte[]> {

    class a extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f92227a;

        a(byte[] bArr) {
            this.f92227a = bArr;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            a4.b("Status: " + i0.this.h());
            if (i0.this.g() != null) {
                try {
                    i0.this.g().a(new k6(i0.this.h(), this.f92227a));
                } catch (Exception e10) {
                    a4.c(e10.getMessage());
                }
            }
        }
    }

    protected i0(f0.d dVar, String str, HashMap<String, String> map, int i10, o6.a aVar) {
        super(dVar, str, map, null, i10, aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.f0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public byte[] b(InputStream inputStream) {
        try {
            return x8.a(inputStream).toByteArray();
        } catch (Exception unused) {
            a(-44);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.f0
    public void a(byte[] bArr) {
        w7.b().a().execute(new a(bArr));
    }
}
