package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class Q1 {

    /* renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f70319a;

    /* renamed from: b, reason: collision with root package name */
    private final DataOutputStream f70320b;

    public final byte[] a(P1 p12) throws IOException {
        this.f70319a.reset();
        try {
            b(this.f70320b, p12.f70071a);
            String str = p12.f70072b;
            if (str == null) {
                str = "";
            }
            b(this.f70320b, str);
            this.f70320b.writeLong(p12.f70073c);
            this.f70320b.writeLong(p12.f70074d);
            this.f70320b.write(p12.f70075e);
            this.f70320b.flush();
            return this.f70319a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Q1() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f70319a = byteArrayOutputStream;
        this.f70320b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }
}
