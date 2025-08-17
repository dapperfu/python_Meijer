package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class Q1 {

    /* renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f69479a;

    /* renamed from: b, reason: collision with root package name */
    private final DataOutputStream f69480b;

    public final byte[] a(P1 p12) throws IOException {
        this.f69479a.reset();
        try {
            b(this.f69480b, p12.f69231a);
            String str = p12.f69232b;
            if (str == null) {
                str = "";
            }
            b(this.f69480b, str);
            this.f69480b.writeLong(p12.f69233c);
            this.f69480b.writeLong(p12.f69234d);
            this.f69480b.write(p12.f69235e);
            this.f69480b.flush();
            return this.f69479a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Q1() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f69479a = byteArrayOutputStream;
        this.f69480b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }
}
